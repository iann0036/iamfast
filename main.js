#!/usr/bin/env node

const acorn = require("acorn");
const walk = require("acorn-walk");
const fs = require("fs");
const { program } = require('commander');
const YAML = require('yaml');


const iam_def = require("./lib/parliament/iam_definition.json");
const mappings = require("./map.json");

const GENERIC_SERVICE_METHODS = new Set([
    "endpoint",
    "defineservice",
    "makerequest",
    "makeunauthenticatedrequest",
    "setuprequestlisteners",
    "waitfor"]);

class IAMFast {

    constructor(aws_partition, aws_region, aws_accountid) {
        this.aws_partition = aws_partition || 'aws';
        this.aws_region = aws_region || 'us-east-1';
        this.aws_accountid = aws_accountid || '123456789012';
        this.tracked_environment_variables = [];
    }

    resolveSpecials(arn, call, mandatory, mapped_priv) {
        let start_index = arn.indexOf("%%");
        let end_index = arn.lastIndexOf("%%");
        let arns = [];

        if (start_index > -1 && end_index != start_index) {
            let parts = arn.substr(start_index + 2, end_index - start_index + 2).split("%");

            if (parts.length < 2) {
                return [arn.substr(0, startIndex) + "*" + arn.substr(end_index + 2)];
            }

            switch (parts[0]) {
                case "iftruthy":
                    if (parts.length == 3) { // weird bug for empty string false values
                        parts.push("");
                    }

                    if (parts.length != 4) {
                        return [arn.substr(0, start_index) + "*" + arn.substr(end_index + 2)];
                    }

                    arns = this.subSARARN(parts[1], call['params'], mapped_priv);

                    if (arns.length < 1 || arns[0] == "") {
                        if (parts[3] == "") {
                            if (mandatory) {
                                return [arn.substr(0, start_index) + "*" + arn.substr(end_index + 2)];
                            }
                            return [arn.substr(0, start_index) + arn.substr(end_index + 2)];
                        }
                        return [arn.substr(0, start_index) + parts[3] + arn.substr(end_index + 2)];
                    }

                    if (parts[2] == "" && mandatory) {
                        return [arn.substr(0, start_index) + "*" + arn.substr(end_index + 2)];
                    }

                    return [arn.substr(0, start_index) + parts[2] + arn.substr(end_index + 2)];
                case "urlencode":
                    if (parts.length != 2) {
                        return [arn.substr(0, start_index) + "*" + arn.substr(end_index + 2)];
                    }

                    arns = this.subSARARN(parts[1], call['params'], mapped_priv);

                    if (arns.length < 1 || arns[0] == "") {
                        if (mandatory) {
                            return [arn.substr(0, start_index) + "*" + arn.substr(end_index + 2)];
                        }
                        return [arn.substr(0, start_index) + arn.substr(end_index + 2)];
                    }

                    return [arn.substr(0, start_index) + encodeURIComponent(arns[0]) + arn.substr(end_index + 2)];
                case "iftemplatematch":
                    if (parts.length != 2) {
                        return [arn.substr(0, start_index) + "*" + arn.substr(end_index + 2)];
                    }

                    arns = this.subSARARN(parts[1], call['params'], mapped_priv);

                    if (arns.length < 1 || arns[0] == "") {
                        if (mandatory) {
                            return [arn.substr(0, start_index) + "*" + arn.substr(end_index + 2)];
                        }
                        return [arn.substr(0, start_index) + arn.substr(end_index + 2)];
                    }

                    /*
                    template := regexp.MustCompile(`\\\$\\\{.+?\\\}`).ReplaceAllString(regexp.QuoteMeta(*resourceArnTemplate), ".*?")
            
                        if regexp.MustCompile(template).MatchString(arns[0]) {
                            return []string{arn[0:startIndex] + arns[0] + arn[endIndex+2:]}
                        }
                    */

                    return [arn.substr(0, start_index) + arn.substr(end_index + 2)];
                case "many":
                    let many_parts = [];

                    for (let part of parts.slice(1)) {
                        arns = this.subSARARN(part, call['params'], mapped_priv);
                        if (arns.length < 1 || arns[0] == "") {
                            if (mandatory) {
                                return [arn.substr(0, start_index) + "*" + arn.substr(end_index + 2)];
                            }
                            return [arn.substr(0, start_index) + arn.substr(end_index + 2)];
                        }

                        many_parts.push(arns[0]);
                    }

                    return many_parts;
                case "regex":
                    if (parts.length != 3) {
                        return [arn.substr(0, start_index) + "*" + arn.substr(end_index + 2)];
                    }

                    arns = this.subSARARN(parts[1], call['params'], mapped_priv);

                    if (arns.length < 1 || arns[0] == "") {
                        if (mandatory) {
                            return [arn.substr(0, start_index) + "*" + arn.substr(end_index + 2)];
                        }
                        return [arn.substr(0, start_index) + arn.substr(end_index + 2)];
                    }

                    if (parts[2][0] == "/") {
                        parts[2] = parts[2].substr(1, -2);
                    }

                    let groups = parts[2].matchAll(arns[0].replace(/\$/g, "$$"));

                    if (groups.length < 2 || groups[1] == "") {
                        if (mandatory) {
                            return [arn.substr(0, start_index) + "*" + arn.substr(end_index + 2)];
                        }
                        return [arn.substr(0, start_index) + arn.substr(end_index + 2)];
                    }

                    return [arn.substr(0, start_index) + groups[1] + arn.substr(end_index + 2)];
                default:
                    throw "Unknown special function: " + parts[0];
            }
        }

        return [arn];
    }

    subSARARN(arn, params, mapped_priv) {
        if (mapped_priv && mapped_priv.resource_mappings) {
            for (let param of Object.keys(mapped_priv.resource_mappings)) {
                let r = new RegExp("\\$\\{" + param + "\\}", "gi");
                arn = arn.replace(r, mapped_priv.resource_mappings[param].template);
            }
        }

        for (let param of Object.keys(params)) {
            let r = new RegExp("\\$\\{" + param + "\\}", "gi");
            arn = arn.replace(r, params[param]);
        }

        return arn.replace(/\$\{Partition\}/g, this.aws_partition)
            .replace(/\$\{Region\}/g, this.aws_region)
            .replace(/\$\{Account\}/g, this.aws_accountid)
            .replace(/\$\{.*\}/g, "*");
    }

    toIAMPolicy(privs) {
        let policy = {
            'Version': '2012-10-17',
            'Statement': []
        };

        // dedup
        let byAction = {};
        for (let priv of privs) {
            if (!byAction[priv.action]) {
                byAction[priv.action] = [];
            }

            byAction[priv.action] = byAction[priv.action].concat(priv.resource);
        }

        for (let k of Object.keys(byAction)) {
            policy.Statement.push({
                'Effect': 'Allow',
                'Action': k,
                'Resource': [...new Set(byAction[k])]
            })
        }

        return JSON.stringify(policy, null, 4);
    }

    mapServicePrefix(prefix) {
        if (mappings['sdk_service_mappings'][prefix]) {
            return mappings['sdk_service_mappings'][prefix];
        }

        return prefix;
    }

    static objectWalk(node) {
        let obj = {};

        for (let property of node.properties) {
            if (property.value.type == "Literal") {
                obj[property.key.name] = property.value.value;
            } else if (property.value.type == "ObjectExpression") {
                obj[property.key.name] = IAMFast.objectWalk(property.value);
            }
        }

        return obj;
    }

    mapCallToPrivilegeArray(service, call) {
        let lower_priv = `${call.service}.${call.method}`;

        let privileges = [];

        // check if it's in the mapping
        for (let mappingkey of Object.keys(mappings.sdk_method_iam_mappings)) {
            if (lower_priv == mappingkey.toLowerCase()) {
                for (var mapped_priv of mappings.sdk_method_iam_mappings[mappingkey]) {
                    for (let privilege of service.privileges) {
                        if (this.mapServicePrefix(service.prefix).toLowerCase() + ":" + privilege.privilege.toLowerCase() == mapped_priv.action.toLowerCase()) {
                            privileges.push({
                                'sarpriv': privilege,
                                'mappedpriv': mapped_priv
                            });
                            break;
                        }
                    }
                }

                return privileges;
            }
        }

        // last resort check the SAR directly
        if (!privileges.length) {
            for (let privilege of service.privileges) {
                if (call.method.toLowerCase() == privilege.privilege.toLowerCase()) {
                    return [{
                        'sarpriv': privilege,
                        'mappedpriv': null
                    }];
                }
            }
        }

        return [];
    }

    walkCode(code) {
        const parser = acorn.parse(code, { ecmaVersion: 2020 });

        let tracked_calls = []; // eg. ^lambda.list_functions()^
        let sdk_names = []; // usually ^AWS^
        let service_objects = []; // eg. ^lambda^ = new AWS.Lambda()
        let tracked_variable_declarations = [];
        let tracked_environment_variables = [];

        //console.log(JSON.stringify(parser, null, 2)); // REMOVE ME

        // find envs
        walk.ancestor(parser, {
            MemberExpression(node, ancestors) {
                if (node.property.type == "Identifier") {
                    let varname = node.property.name;

                    if (node.object && node.object.type == "MemberExpression" &&
                        node.object.object && node.object.object.type == "Identifier" &&
                        node.object.property && node.object.property.type == "Identifier" &&
                        node.object.object.name == "process" && node.object.property.name == "env") { // process.env.varname
                        tracked_environment_variables.push({
                            'name': varname,
                            'start': node.start,
                            'end': node.end
                        });
                    }
                }
            }
        });

        this.tracked_environment_variables = tracked_environment_variables;

        // find variable and SDK declarations
        walk.ancestor(parser, {
            VariableDeclarator(node, ancestors) { // variable tracker
                let varname = node.id.name;

                if (node.init && node.init.type == "ObjectExpression") { // varname = varresult
                    let varresult = IAMFast.objectWalk(node.init);

                    tracked_variable_declarations.push({
                        'name': varname,
                        'value': varresult,
                        'start': node.start,
                        'end': node.end
                    });
                }
            },
            Literal(node, ancestors) { // sdk require tracker
                if (node.value == "aws-sdk") {
                    if (ancestors[ancestors.length - 2].type == "CallExpression" && ancestors[ancestors.length - 2].callee.name == "require") {
                        if (ancestors[ancestors.length - 3].type == "VariableDeclarator") { // sdk_name = require('aws-sdk')
                            sdk_names.push(ancestors[ancestors.length - 3].id.name);
                        }
                    }
                }
            }
        });

        // find service objects
        walk.ancestor(parser, {
            Identifier(node, ancestors) {
                for (let sdk_name of sdk_names) {
                    if (node.name == sdk_name) {
                        if (ancestors[ancestors.length - 2].type == "MemberExpression" && ancestors[ancestors.length - 3].type == "NewExpression" && ancestors[ancestors.length - 4].type == "AssignmentExpression") { // service client declaration
                            // variable = new sdk.service(...);
                            service_objects.push({
                                'service': ancestors[ancestors.length - 2].property.name,
                                'variable': ancestors[ancestors.length - 4].left.name,
                                'sdk': sdk_name,
                                'start': node.start,
                                'end': node.end
                            });
                        } else if (ancestors[ancestors.length - 2].type == "MemberExpression" && ancestors[ancestors.length - 3].type == "NewExpression" && ancestors[ancestors.length - 4].type == "VariableDeclarator") { // service client declaration
                            // var/const variable = new sdk.service(...);
                            service_objects.push({
                                'service': ancestors[ancestors.length - 2].property.name,
                                'variable': ancestors[ancestors.length - 4].id.name,
                                'sdk': sdk_name,
                                'start': node.start,
                                'end': node.end
                            });
                        }
                    }
                }
            }
        });

        // find calls
        walk.ancestor(parser, {
            Identifier(node, ancestors) {
                for (let sdk_name of sdk_names) {
                    if (node.name == sdk_name) {
                        if (ancestors[ancestors.length - 2].type == "MemberExpression" && ancestors[ancestors.length - 3].type == "NewExpression" && ancestors[ancestors.length - 4].type == "MemberExpression" && ancestors[ancestors.length - 5].type == "CallExpression") {
                            let params = {};

                            if (ancestors[ancestors.length - 5].arguments.length && ancestors[ancestors.length - 5].arguments[0].type == "Identifier") {
                                for (let tracked_variable_declaration of tracked_variable_declarations) {
                                    if (tracked_variable_declaration.name == ancestors[ancestors.length - 5].arguments[0].name) {
                                        params = tracked_variable_declaration.value;
                                    }
                                }
                            }
                            
                            // var x = new AWS.service(...).method(...).promise();
                            tracked_calls.push({
                                'service': ancestors[ancestors.length - 2].property.name.toLowerCase(),
                                'method': ancestors[ancestors.length - 4].property.name.toLowerCase(),
                                'params': params,
                                'start': node.start,
                                'end': node.end
                            });
                        }
                    }
                }
                for (let service_object of service_objects) {
                    if (node.name == service_object.variable) {
                        if (ancestors[ancestors.length - 2].type == "MemberExpression") {
                            let params = {};

                            if (ancestors[ancestors.length - 3].type == "CallExpression" && ancestors[ancestors.length - 3].arguments.length) {
                                if (ancestors[ancestors.length - 3].arguments[0].type == "Identifier") {
                                    for (let tracked_variable_declaration of tracked_variable_declarations) {
                                        if (tracked_variable_declaration.name == ancestors[ancestors.length - 3].arguments[0].name) {
                                            params = tracked_variable_declaration.value;
                                        }
                                    }
                                } else if (ancestors[ancestors.length - 3].arguments[0].type == "ObjectExpression") {
                                    for (let property of ancestors[ancestors.length - 3].arguments[0].properties) {
                                        if (property.key.type == "Identifier" && property.value.type == "Literal") {
                                            params[property.key.name] = property.value.value;
                                        }
                                    }
                                }
                            }

                            // service.method(...)
                            tracked_calls.push({
                                'service': service_object.service.toLowerCase(),
                                'method': ancestors[ancestors.length - 2].property.name.toLowerCase(),
                                'params': params,
                                'start': node.start,
                                'end': node.end
                            });
                        }
                    }
                }
            }
        });

        return tracked_calls;
    }

    generateSAMTemplate(code) {
        const custom_tags = {
            customTags: [{
                identify: value => value,
                tag: '!Ref',
                resolve: str => str
            },
            {
                identify: value => value,
                tag: '!Sub',
                resolve: str => str
            }]
        };

        let sam_template = YAML.parseDocument(`
            AWSTemplateFormatVersion: '2010-09-09'
            Transform: AWS::Serverless-2016-10-31

            Parameters:
                "%%$": ""
            
            Resources:
                LambdaFunction:
                    Type: AWS::Serverless::Function
                    Properties:
                        Handler: index.handler
                        Runtime: nodejs10.x
                        CodeUri: .
                        MemorySize: 128
                        Timeout: 10
                        Environment:
                            Variables:
                                "%%$": ""
                        Policies:
                          - {}
        `, custom_tags);

        this.aws_region = `\${AWS::Region}`;
        this.aws_partition = `aws`;
        this.aws_accountid = `\${AWS::AccountId}`;

        let iam_policy = JSON.parse(this.generateIAMPolicy(code));

        sam_template.addIn(['Resources', 'LambdaFunction', 'Properties', 'Policies'], new YAML.Document(iam_policy));

        this.tracked_environment_variables.forEach(env => {
            let envkey = env.name[0].toUpperCase() + env.name.substr(1) || env;
            envkey = envkey.replaceAll(/[^a-zA-Z0-9]/g, '');

            if (!sam_template.hasIn(
                ['Resources', 'LambdaFunction', 'Properties', 'Environment', 'Variables', env.name]
            )) {
                sam_template.addIn(
                    ['Resources', 'LambdaFunction', 'Properties', 'Environment', 'Variables'],
                    sam_template.createPair(env.name, sam_template.createNode(envkey, null, { tag: "!Ref", flow: true }), {flow: true})
                );
            }
            if (!sam_template.hasIn(
                ['Parameters', envkey]
            )) {
                sam_template.addIn(
                    ['Parameters'],
                    sam_template.createPair(envkey, new YAML.Document({"Type": "String"}))
                );
            }
        });
        
        sam_template.deleteIn(['Parameters', '%%$']);
        sam_template.deleteIn(['Resources', 'LambdaFunction', 'Properties', 'Environment', 'Variables', '%%$']);
        sam_template.deleteIn(['Resources', 'LambdaFunction', 'Properties', 'Policies', 0]);
        if (sam_template.get('Parameters').items.length < 1) {
            sam_template.deleteIn(['Parameters']);
            sam_template.deleteIn(['Resources', 'LambdaFunction', 'Properties', 'Environment']);
        }

        return YAML.stringify(sam_template, custom_tags);
    }

    generateIAMPolicy(code) {
        let privs = [];

        if (code.trim()[0] == '#') {
            let lines = code.split("\n");
            lines.shift();
            code = lines.join("\n");
        }

        let tracked_calls = this.walkCode(code);

        for (let tracked_call of tracked_calls) {
            let found_match = false;

            for (let service of iam_def) {
                if (this.mapServicePrefix(service.prefix).toLowerCase() == tracked_call.service) {
                    let privilege_array = this.mapCallToPrivilegeArray(service, tracked_call);

                    for (let privilege of privilege_array) {
                        found_match = true;

                        let resource_arns = [];
                        //  initialize with resource_arns = ["*"];, so we don't need to have the check

                        for (let resource_type of privilege.sarpriv.resource_types) {
                            for (let resource of service.resources) {
                                if (resource.resource.toLowerCase()
                                    == resource_type.resource_type.replace(/\*/g, "").toLowerCase()
                                    && resource.resource != "") {
                                    let subbed_arn = this.subSARARN(resource.arn, tracked_call.params, privilege.mappedpriv);
                                    if (resource_type.resource_type.endsWith("*") || !subbed_arn.endsWith("*")) {
                                        resource_arns = resource_arns.concat(this.resolveSpecials(subbed_arn, tracked_call, false, privilege.mappedpriv));
                                    }
                                }
                            }
                        }

                        if (resource_arns.length == 0) {
                            resource_arns = ["*"];
                        }

                        privs.push({
                            'action': this.mapServicePrefix(service.prefix) + ":" + privilege.sarpriv.privilege,
                            'explanation': privilege.sarpriv.description,
                            'resource': resource_arns
                        });
                    }
                }
            }

            if (!found_match &&
                !GENERIC_SERVICE_METHODS.has(tracked_call.method)) {
                console.warn(`WARNING: Could not find privilege match for ${tracked_call.service}:${tracked_call.method}`);
            }
        }

        return this.toIAMPolicy(privs);
    }
}

if (require.main === module) {
    if (process.argv.length < 3) {
        console.log("Usage: iamfast-js filename");
        process.exit(1);
    }

    const code = fs.readFileSync(process.argv[2], { encoding: 'utf8', flag: 'r' });

    let iamfast = new IAMFast();

    console.log(iamfast.generateIAMPolicy(code));
    //console.log(iamfast.generateSAMTemplate(code));
}

module.exports = IAMFast;
