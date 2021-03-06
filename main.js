const acorn = require("acorn");
const walk = require("acorn-walk");
const fs = require("fs");

const iam_def = require("./lib/parliament/iam_definition.json");
const mappings = require("./map.json");

class IAMFast {

    constructor(aws_partition, aws_region, aws_accountid) {
        this.aws_partition = aws_partition || 'aws';
        this.aws_region = aws_region || 'us-east-1';
        this.aws_accountid = aws_accountid || '123456789012';
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
    
        arn = arn.replace(/\$\{Partition\}/g, this.aws_partition);
        arn = arn.replace(/\$\{Region\}/g, this.aws_region);
        arn = arn.replace(/\$\{Account\}/g, this.aws_accountid);
    
        arn = arn.replace(/\$\{.*\}/g, "*");
    
        return arn;
    }
    
    toIAMPolicy(privs) {
        let policy = {
            'Version': '2012-10-17',
            'Statement': []
        };
    
        for (let priv of privs) {
            policy.Statement.push({
                'Effect': 'Allow',
                'Action': priv.action,
                'Resource': priv.resource
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
        let lower_priv = call.service.toLowerCase() + "." + call.method.toLowerCase();
    
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
    
    generateIAMPolicy(code) {
        const parser = acorn.parse(code, {ecmaVersion: 2020});
    
        let sdk_names = [];
        let service_objects = [];
        let tracked_calls = [];
        let privs = [];
    
        let tracked_variable_declarations = [];
    
        walk.ancestor(parser, {
            VariableDeclarator(node, ancestors) {
                let varname = node.id.name;
    
                if (node.init.type == "ObjectExpression") {
                    let varresult = IAMFast.objectWalk(node.init);
    
                    tracked_variable_declarations.push({
                        'name': varname,
                        'value': varresult
                    });
                }
            },
            Literal(node, ancestors) {
                if (node.value == "aws-sdk") {
                    if (ancestors[ancestors.length - 2].type == "CallExpression" && ancestors[ancestors.length - 2].callee.name == "require") {
                        if (ancestors[ancestors.length - 3].type == "VariableDeclarator") {
                            sdk_names.push(ancestors[ancestors.length - 3].id.name);
                        }
                    }
                }
            },
            Identifier(node, ancestors) {
                for (let sdk_name of sdk_names) {
                    if (node.name == sdk_name) {
                        if (ancestors[ancestors.length - 2].type == "MemberExpression" && ancestors[ancestors.length - 3].type == "NewExpression" && ancestors[ancestors.length - 4].type == "AssignmentExpression") {
                            service_objects.push({
                                'service': ancestors[ancestors.length - 2].property.name,
                                'variable': ancestors[ancestors.length - 4].left.name,
                                'sdk': sdk_name
                            });
                        } else if (ancestors[ancestors.length - 2].type == "MemberExpression" && ancestors[ancestors.length - 3].type == "NewExpression" && ancestors[ancestors.length - 4].type == "VariableDeclarator") {
                            service_objects.push({
                                'service': ancestors[ancestors.length - 2].property.name,
                                'variable': ancestors[ancestors.length - 4].id.name,
                                'sdk': sdk_name
                            });
                        } else if (ancestors[ancestors.length - 2].type == "MemberExpression" && ancestors[ancestors.length - 3].type == "NewExpression" && ancestors[ancestors.length - 4].type == "MemberExpression" && ancestors[ancestors.length - 5].type == "CallExpression") {
                            let params = {};
    
                            if (ancestors[ancestors.length - 5].arguments.length && ancestors[ancestors.length - 5].arguments[0].type == "Identifier") {
                                for (let tracked_variable_declaration of tracked_variable_declarations) {
                                    if (tracked_variable_declaration.name == ancestors[ancestors.length - 5].arguments[0].name) {
                                        params = tracked_variable_declaration.value;
                                    }
                                }
                            }
                            
                            tracked_calls.push({
                                'service': ancestors[ancestors.length - 2].property.name,
                                'method': ancestors[ancestors.length - 4].property.name,
                                'params': params
                            });
                        }
                    }
                }
                for (let service_object of service_objects) {
                    if (node.name == service_object.variable) {
                        if (ancestors[ancestors.length - 2].type == "MemberExpression") {
                            let params = {};
    
                            if (ancestors[ancestors.length - 3].type == "CallExpression") {
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
    
                            tracked_calls.push({
                                'service': service_object.service,
                                'method': ancestors[ancestors.length - 2].property.name,
                                'params': params
                            });
                        }
                    }
                }
            }
        });
    
        //
    
        for (let tracked_call of tracked_calls) {
            let found_match = false;
    
            for (let service of iam_def) {
                if (this.mapServicePrefix(service.prefix).toLowerCase() == tracked_call.service.toLowerCase()) {
                    let privilege_array = this.mapCallToPrivilegeArray(service, tracked_call);
    
                    for (let privilege of privilege_array) {
                        found_match = true;
    
                        let resource_arns = [];
    
                        if (privilege.sarpriv.resource_types.length) {
                            for (let resource_type of privilege.sarpriv.resource_types) {
                                for (let resource of service.resources) {
                                    if (resource.resource.toLowerCase() == resource_type.resource_type.replace(/\*/g, "").toLowerCase() && resource.resource != "") {
                                        let subbed_arn = this.subSARARN(resource.arn, tracked_call.params, privilege.mappedpriv);
                                        if (resource_type.resource_type.endsWith("*") || !subbed_arn.endsWith("*")) {
                                            resource_arns.push(subbed_arn);
                                        }
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
    
            if (
                !found_match && ![
                    "endpoint",
                    "defineservice",
                    "makerequest",
                    "makeunauthenticatedrequest",
                    "setuprequestlisteners",
                    "waitfor"
                ].includes(tracked_call.method.toLowerCase()) // generic service methods
            ) {
                console.warn("WARNING: Could not find privilege match for " + tracked_call.service.toLowerCase() + ":" + tracked_call.method);
            }
        }
    
        return this.toIAMPolicy(privs);
    }
}

if (require.main === module) {
    const code = fs.readFileSync(process.argv[2], {encoding:'utf8', flag:'r'});

    let iamfast = new IAMFast();

    console.log(iamfast.generateIAMPolicy(code));
}

module.exports = IAMFast;
