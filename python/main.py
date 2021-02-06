import ast
import pprint
import sys
import os
import json
import re


aws_partition = "aws"
aws_region = "us-east-1"
aws_accountid = "123456789012"

mappings = None
with open(os.path.dirname(os.path.realpath(sys.argv[0])) + "/mappings.json", "r") as f:
    mappings = json.loads(f.read())


class MyVisitor(ast.NodeVisitor):

    def __init__(self):
        self.boto_declarations = []
        self.service_declarations = []
        self.calls = []

    def generic_visit(self, node):
        #print(ast.dump(node))
        #print("---")
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Assign(self, node):
        if type(node.value) == ast.Call:
            if type(node.value.func) == ast.Attribute:
                if type(node.value.func.value) == ast.Name and node.value.func.attr == "client":
                    if node.value.func.value.id in self.boto_declarations:
                        if len(node.value.args) == 1 and type(node.value.args[0]) == ast.Constant:
                            for target in node.targets:
                                if type(target) == ast.Name:
                                    self.service_declarations.append({
                                        'name': target.id,
                                        'service': node.value.args[0].value
                                    })
        
        self.generic_visit(node)

    def visit_Call(self, node):
        if type(node.func) == ast.Attribute:
            if type(node.func.value) == ast.Name:
                for sd in self.service_declarations:
                    if sd['name'] == node.func.value.id:
                        params = {}
                        
                        # TODO: node.args
                        for keyword in node.keywords:
                            if type(keyword.value) == ast.Constant:
                                params[keyword.arg] = keyword.value.value

                        self.calls.append({
                            'service': sd['service'],
                            'method': node.func.attr.replace("_", ""),
                            'params': params
                        })

        self.generic_visit(node)

    def visit_Import(self, node):
        for name in node.names:
            if type(name) == ast.alias:
                if name.asname:
                    self.boto_declarations.append(name.asname)
                else:
                    self.boto_declarations.append(name.name)

        self.generic_visit(node)


def sub_sar_arn(arn, params):
    arn = re.sub(r"\$\{Partition\}", aws_partition, arn)
    arn = re.sub(r"\$\{Region\}", aws_region, arn)
    arn = re.sub(r"\$\{Account\}", aws_accountid, arn)
    
    for param in params.keys():
        regex = re.compile("\\$\\{" + param + "\\}")
        arn = regex.sub(params[param], arn)

    arn = re.sub(r"\$\{.*\}", "*", arn)

    return arn


def map_call_to_privilege_array(service, call):
    lower_priv = call['service'].lower() + ":" + call['method'].lower()

    if lower_priv in mappings['sdk_method_iam_mappings'].keys():
        privileges = []
        for mapped_priv in mappings['sdk_method_iam_mappings'][lower_priv]:
            for privilege in service['privileges']:
                if service['prefix'].lower() + ":" + privilege['privilege'].lower() == mapped_priv.action.lower():
                    privileges.push(privilege)
                    break
        
        return privileges
    else:
        for privilege in service['privileges']:
            if call['method'].lower() == privilege['privilege'].lower():
                return [privilege]

    return []


def match_found_calls(calls):
    privs = []

    iam_def = None
    with open(os.path.dirname(os.path.realpath(sys.argv[0])) + "/lib/parliament/iam_definition.json", "r") as f:
        iam_def = json.loads(f.read())

    for call in calls:
        found_match = False

        for service in iam_def:
            if service['prefix'] == call['service'].lower():
                privilege_array = map_call_to_privilege_array(service, call)

                for privilege in privilege_array:
                    found_match = True

                    resource_arns = []

                    if len(privilege['resource_types']) > 0:
                        for resource_type in privilege['resource_types']:
                            for resource in service['resources']:
                                if resource['resource'] == resource_type['resource_type'].strip("*") and resource['resource'] != "":
                                    subbed_arn = sub_sar_arn(resource['arn'], call['params'])
                                    if resource_type['resource_type'][-1] == "*" or subbed_arn[-1] != "*":
                                        resource_arns.append(subbed_arn)

                    if len(resource_arns) == 0:
                        resource_arns = ["*"]

                    privs.append({
                        'action': service['prefix'] + ":" + privilege['privilege'],
                        'explanation': privilege['description'],
                        'resource': resource_arns
                    })

        if not found_match:
            print("WARNING: Could not find privilege match for " + call['service'].lower() + ":" + call['method'])

    return privs


def to_iam_policy(privs):
    policy = {
        "Version": "2012-10-17",
        "Statement": []
    }

    for priv in privs:
        policy["Statement"].append({
            "Effect": "Allow",
            "Action": priv["action"],
            "Resource": priv["resource"]
        })

    return json.dumps(policy, sort_keys=False, indent=4)


def main():
    tree = None

    with open(sys.argv[1], "r") as f:
        tree = ast.parse(f.read())

    v = MyVisitor()
    v.visit(tree)
    print(to_iam_policy(match_found_calls(v.calls)))


if __name__ == "__main__":
    main()
