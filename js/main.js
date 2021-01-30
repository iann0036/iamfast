const acorn = require("acorn");
const walk = require("acorn-walk");
const fs = require("fs");

const iam_def = require("./lib/parliament/iam_definition.json");
const mappings = require("./mappings.json");

function subSARARN(arn, params) {
    arn = arn.replace(/\$\{Partition\}/g, aws_partition);
    arn = arn.replace(/\$\{Region\}/g, aws_region);
    arn = arn.replace(/\$\{Account\}/g, aws_accountid);

    for (let param of Object.keys(params)) {
        let r = new RegExp("\\$\\{" + param + "\\}", "gi");
        arn = arn.replace(r, params[param]);
    }

    arn = arn.replace(/\$\{.*\}/g, "*");

    return arn;
}

function toIAMPolicy(privs) {
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

let aws_partition = 'aws';
let aws_region = 'us-east-1';
let aws_accountid = '123456789012';

function objectWalk(node) {
    let obj = {};

    for (let property of node.properties) {
        if (property.value.type == "Literal") {
            obj[property.key.name] = property.value.value;
        } else if (property.value.type == "ObjectExpression") {
            obj[property.key.name] = objectWalk(property.value);
        }
    }

    return obj;
}

function mapCallToPrivilegeArray(service, call) {
    let lower_priv = call.service.toLowerCase() + ":" + call.method.toLowerCase();

    if (Object.keys(mappings.iam_actions).includes(lower_priv)) {
        privileges = [];
        for (var mapped_priv of mappings.iam_actions[lower_priv]) {
            for (let privilege of service.privileges) {
                if (service.prefix.toLowerCase() + ":" + privilege.privilege.toLowerCase() == mapped_priv.action.toLowerCase()) {
                    privileges.push(privilege);
                    break;
                }
            }
        }
        
        return privileges;
    } else {
        for (let privilege of service.privileges) {
            if (call.method.toLowerCase() == privilege.privilege.toLowerCase()) {
                return [privilege];
            }
        }
    }

    return [];
}

function generateIAMPolicy(code) {
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
                let varresult = objectWalk(node.init);

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
            if (service.prefix == tracked_call.service.toLowerCase()) {
                let privilege_array = mapCallToPrivilegeArray(service, tracked_call);

                for (let privilege of privilege_array) {
                    found_match = true;

                    let resource_arns = [];

                    if (privilege.resource_types.length) {
                        for (let resource_type of privilege.resource_types) {
                            for (let resource of service.resources) {
                                if (resource.resource == resource_type.resource_type.replace(/\*/g, "") && resource.resource != "") {
                                    let subbed_arn = subSARARN(resource.arn, tracked_call.params);
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
                        'action': service.prefix + ":" + privilege.privilege,
                        'explanation': privilege.description,
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

    console.log(toIAMPolicy(privs));
}

const code = fs.readFileSync(process.argv[2], {encoding:'utf8', flag:'r'});

generateIAMPolicy(code);
