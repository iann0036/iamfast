#!/usr/bin/env node

import YAML, { YAMLMap } from 'yaml';
import AWSParser from './AWSParser.js';
import iam_def from './lib/iam_definition.js';
import mappings from './lib/map.js';
import { EnvironmentVariable } from './types.js';

export default class IAMFast {

    constructor(aws_partition, aws_region, aws_accountid) {
        this.aws_partition = aws_partition || 'aws';
        this.aws_region = aws_region || 'us-east-1';
        this.aws_accountid = aws_accountid || '123456789012';
        this.tracked_environment_variables = [];
        this.iam_def = iam_def;
        this.mappings = mappings;
        this.debug = false;
        this.privs = [];
        this.last_privs = [];
    }

    static getLanguageByPath(path) {
        let language = 'unknown';

        if (path.endsWith(".js") || path.endsWith(".cjs")) {
            language = 'js';
        } else if (path.endsWith(".py")) {
            language = 'python';
        } else if (path.endsWith(".java")) {
            language = 'java';
        } else if (path.endsWith(".go")) {
            language = 'go';
        } else if (path.endsWith(".cpp") || path.endsWith(".c")) {
            language = 'cplusplus';
        }

        return language;
    }

    resolveSpecials(arn, call, mandatory, mapped_priv) {
        let start_index = arn.indexOf("%%");
        let end_index = arn.lastIndexOf("%%");
        let arns = [];

        if (start_index > -1 && end_index != start_index) {
            let parts = arn.substr(start_index + 2, end_index - start_index - 2).split("%");

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

                    arns = [this.subSARARN(parts[1], call['params'], mapped_priv, '', false)];

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

                    arns = [this.subSARARN(parts[1], call['params'], mapped_priv, '', false)];

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

                    arns = [this.subSARARN(parts[1], call['params'], mapped_priv, '', false)];

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
                        arns = [this.subSARARN(part, call['params'], mapped_priv, '', false)];
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

                    arns = [this.subSARARN(parts[1], call['params'], mapped_priv, '', false)];

                    if (arns.length < 1 || arns[0] == "") {
                        if (mandatory) {
                            return [arn.substr(0, start_index) + "*" + arn.substr(end_index + 2)];
                        }
                        return [arn.substr(0, start_index) + arn.substr(end_index + 2)];
                    }

                    if (parts[2][0] == "/") {
                        parts[2] = parts[2].substr(1, parts[2].length - 3);
                    }

                    let groups = arns[0].match(new RegExp(parts[2]));

                    if (!groups || groups.length < 2 || groups[1] == "") {
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

    subSARARN(arn, params, mapped_priv, arntype, variable_replacement) {
        if (arntype != '' && mapped_priv && mapped_priv.resourcearn_mappings) {
            if (mapped_priv.resourcearn_mappings[arntype]) {
                arn = mapped_priv.resourcearn_mappings[arntype];
            }
        }

        if (mapped_priv && mapped_priv.resource_mappings) {
            for (let param of Object.keys(mapped_priv.resource_mappings)) {
                let r = new RegExp("\\$\\{" + param + "\\}", "gi");
                arn = arn.replace(r, mapped_priv.resource_mappings[param].template);
            }
        }

        for (let param of Object.keys(params)) {
            if (params[param] instanceof EnvironmentVariable && variable_replacement) {
                let envkey = params[param].Name[0].toUpperCase() + params[param].Name.substr(1) || params[param].Name;
                envkey = envkey.replaceAll(/[^a-zA-Z0-9]/g, '');

                console.log(envkey);
                console.log(arn);

                let r = new RegExp("\\$\\{" + param + "\\}", "gi");
                arn = arn.replace(r, "##@##" + envkey + "##@##");

                console.log(arn);
            } else {
                let r = new RegExp("\\$\\{" + param + "\\}", "gi");
                arn = arn.replace(r, params[param]);
            }
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
        if (this.mappings['sdk_service_mappings'][prefix]) {
            return this.mappings['sdk_service_mappings'][prefix];
        }

        return prefix;
    }

    mapCallToPrivilegeArray(service, call) {
        let lower_priv = `${call.service}.${call.method}`.toLowerCase();

        let privileges = [];

        // check if it's in the mapping
        for (let mappingkey of Object.keys(this.mappings.sdk_method_iam_mappings)) {
            if (lower_priv == mappingkey.toLowerCase()) {
                for (var mapped_priv of this.mappings.sdk_method_iam_mappings[mappingkey]) {
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

    GenerateSAMTemplate(code, language) {
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
        const LANG_MAP = {
            'js': 'nodejs14.x',
            'python': 'python3.9',
            'java': 'java11',
            'go': 'provided.al2',
            'cplusplus': 'provided.al2'
        };
        const HANDLER_MAP = {
            'js': 'index.handler',
            'python': 'lambda_function.lambda_handler',
            'java': 'app.Handler',
            'go': 'bootstrap',
            'cplusplus': 'bootstrap'
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
                        Handler: ${HANDLER_MAP[language]}
                        Runtime: ${LANG_MAP[language]}
                        CodeUri: .
                        MemorySize: 256
                        Timeout: 30
                        Environment:
                            Variables:
                                "%%$": ""
                        Policies:
                          - {}
        `);

        this.aws_region = `##@##AWS::Region##@##`;
        this.aws_accountid = `##@##AWS::AccountId##@##`;

        let iam_policy = JSON.parse(this.generateJSONIAMPolicy(code, language, true));

        sam_template.setIn(['Resources', 'LambdaFunction', 'Properties', 'Policies', 0], new YAML.Document(iam_policy));
        sam_template = YAML.parseDocument(YAML.stringify(sam_template), custom_tags); // flatten

        for (let i=0; i<iam_policy.Statement.length; i++) {
            for (let j=0; j<iam_policy.Statement[i].Resource.length; j++) {
                if (iam_policy.Statement[i].Resource[j].includes("##@##")) {
                    sam_template.setIn(
                        ['Resources', 'LambdaFunction', 'Properties', 'Policies', 0, 'Statement', i, 'Resource', j],
                        sam_template.createNode(iam_policy.Statement[i].Resource[j].replaceAll(/##@##(.+?)##@##/g, "$${$1}"), { tag: "!Sub", flow: true })
                    );
                }
            }
        }

        this.tracked_environment_variables.forEach(env => {
            let envkey = env[0].toUpperCase() + env.substr(1) || env;
            envkey = envkey.replaceAll(/[^a-zA-Z0-9]/g, '');

            if (!sam_template.hasIn(
                ['Resources', 'LambdaFunction', 'Properties', 'Environment', 'Variables', env]
            )) {
                sam_template.addIn(
                    ['Resources', 'LambdaFunction', 'Properties', 'Environment', 'Variables'],
                    sam_template.createPair(env, sam_template.createNode(envkey, null, { tag: "!Ref", flow: true }), {flow: true})
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
        if (sam_template.get('Parameters').items.length < 1) {
            sam_template.deleteIn(['Parameters']);
            sam_template.deleteIn(['Resources', 'LambdaFunction', 'Properties', 'Environment']);
        }

        return YAML.stringify(sam_template, custom_tags);
    }

    Clear() {
        this.privs = [];
    }

    GenerateYAMLPolicy(code, language) {
        return YAML.stringify(JSON.parse(this.generateJSONIAMPolicy(code, language, false)));
    }

    GenerateHCLTemplate(code, language) {
        let policy = JSON.parse(this.generateJSONIAMPolicy(code, language, false));
        let doc = `data "aws_iam_policy_document" "my_policy" {`;

        for (let stmt of policy['Statement']) {
            doc += `\n  statement {\n    effect = "Allow"\n    actions = [\n      "${stmt['Action']}",\n    ]\n    resources = [\n      "`;
            doc += stmt['Resource'].join(`",\n      "`);
            doc += `",\n    ]\n  }\n`;
        }

        doc += `}`;

        return doc;
    }

    GenerateIAMPolicy(code, language) {
        return generateJSONIAMPolicy(code, language, false)
    }

    generateJSONIAMPolicy(code, language, variable_replacement) {
        const GENERIC_SERVICE_METHODS = new Set([
            "endpoint",
            "defineservice",
            "makerequest",
            "makeunauthenticatedrequest",
            "setuprequestlisteners",
            "waitfor"]);

        let privs = [];

        if (code.trim()[0] == '#') {
            let lines = code.split("\n");
            lines.shift();
            code = lines.join("\n");
        }

        let parser = new AWSParser();
        parser.debug = this.debug;
        parser.ParseInput(code, language);

        let tracked_calls = parser.GetNormalizedServiceCalls(language);

        this.tracked_environment_variables = parser.environmental_variables;

        for (let tracked_call of tracked_calls) {
            let found_match = false;

            for (let service of this.iam_def) {
                if (this.mapServicePrefix(service.prefix).toLowerCase() == tracked_call.service) {
                    let privilege_array = this.mapCallToPrivilegeArray(service, tracked_call);
                    this.debug && console.log("Mapped Service Prefix: ", service.prefix);
                    this.debug && console.log("Tracked Call: ", tracked_call);
                    this.debug && console.log("Privilege Array: ", privilege_array);
                    this.debug && console.log("Env Vars: ", this.tracked_environment_variables);

                    for (let privilege of privilege_array) {
                        found_match = true;

                        let resource_arns = [];
                        //  initialize with resource_arns = ["*"];, so we don't need to have the check

                        for (let resource_type of privilege.sarpriv.resource_types) {
                            for (let resource of service.resources) {
                                if (resource.resource.toLowerCase()
                                    == resource_type.resource_type.replace(/\*/g, "").toLowerCase()
                                    && resource.resource != "") {
                                    let subbed_arn = this.subSARARN(resource.arn, tracked_call.params, privilege.mappedpriv, resource.resource.toLowerCase(), variable_replacement);
                                    if (resource_type.resource_type.endsWith("*") || !subbed_arn.endsWith("*")) {
                                        resource_arns = resource_arns.concat(this.resolveSpecials(subbed_arn, tracked_call, true, privilege.mappedpriv));
                                    }
                                }
                            }
                        }

                        if (resource_arns.length == 0) {
                            resource_arns = ["*"];
                        }

                        for (let i = 0; i < resource_arns.length; i++) {
                            if (resource_arns[i] == "") {
                                resource_arns[i] = "*";
                            }
                        }

                        privs.push({
                            'action': this.mapServicePrefix(service.prefix) + ":" + privilege.sarpriv.privilege,
                            'explanation': privilege.sarpriv.description,
                            'resource': resource_arns,
                            'position': tracked_call.position
                        });
                    }
                }
            }

            if (!found_match &&
                !GENERIC_SERVICE_METHODS.has(tracked_call.method)) {
                console.warn(`WARNING: Could not find privilege match for ${tracked_call.service}:${tracked_call.method}`);
            }
        }

        this.debug && console.log("Privs: ", privs);

        this.last_privs = privs;
        this.privs = this.privs.concat(privs);

        return this.toIAMPolicy(this.privs);
    }
}
