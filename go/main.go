package main

import (
	_ "embed"
	"encoding/json"
	"fmt"
	"go/ast"
	"go/parser"
	"go/token"
	"io/ioutil"
	"log"
	"os"
	"strings"
)

const AWSPartition = "aws"
const AWSRegion = "us-east-1"
const AWSAccountID = "123456789012"

//go:embed lib/parliament/iam_definition.json
var iamfile []byte

//go:embed mappings.json
var mappingsfile []byte

type resource struct {
	Resource string `json:"resource"`
	Arn      string `json:"arn"`
}

type iamDefinition struct {
	Prefix     string      `json:"prefix"`
	Resources  []resource  `json:"resources"`
	Privileges []privilege `json:"privileges"`
}

type priv struct {
	action      string
	explanation string
	resource    []string
}

type resourceType struct {
	ResourceType string `json:"resourceType"`
}

type privilege struct {
	Privilege     string         `json:"privilege"`
	ResourceTypes []resourceType `json:"resourceTypes"`
	Description   string         `json:"description"`
}

type awsService struct {
	variable string
	service  string
}

type keyValue struct {
	key   string
	value string
}

type awsCall struct {
	service    string
	serviceVar string
	method     string
	params     []keyValue
}

type statement struct {
	Effect   string   `json:"Effect"`
	Action   string   `json:"Action"`
	Resource []string `json:"Resource"`
}

type iamPolicy struct {
	Version   string      `json:"Version"`
	Statement []statement `json:"Statement"`
}

func toIAMPolicy(privs []priv) string {
	var policy iamPolicy

	policy.Version = "2012-10-17"
	for _, privstmt := range privs {
		policy.Statement = append(policy.Statement, statement{
			Effect:   "Allow",
			Action:   privstmt.action,
			Resource: privstmt.resource,
		})
	}

	b, err := json.MarshalIndent(policy, "", "    ")
	if err != nil {
		panic(err)
	}

	return string(b)
}

type mappingsFile struct {
	SDKMethodIAMMappings map[string]interface{} `json:"sdk_method_iam_mappings"`
	SDKServiceMappings   map[string]string      `json:"sdk_service_mappings"`
}

func mapServicePrefix(prefix string, mappings mappingsFile) string {
	for sdkprefix, mappedprefix := range mappings.SDKServiceMappings {
		if sdkprefix == prefix {
			return mappedprefix
		}
	}

	return prefix
}

type callMapping struct {
	Action string `json:"action"`
}

func mapCallToPrivilegeArray(service iamDefinition, call awsCall) []privilege {
	lowerPriv := fmt.Sprintf("%s:%s", strings.ToLower(call.service), strings.ToLower(call.method))

	var privileges []privilege

	var mappings mappingsFile
	err := json.Unmarshal(mappingsfile, &mappings)
	if err != nil {
		log.Fatal(err)
	}

	for callName, call := range mappings.SDKMethodIAMMappings { // double use of call
		if callName == lowerPriv { // TODO: SDKMethodIAMMappings not lower, check this works?
			for _, mappedPriv := range call.([]callMapping) {
				for _, privilege := range service.Privileges {
					if fmt.Sprintf("%s:%s", strings.ToLower(mapServicePrefix(service.Prefix, mappings)), strings.ToLower(privilege.Privilege)) == strings.ToLower(mappedPriv.Action) {
						privileges = append(privileges, privilege)
						break
					}
				}
			}
		}
	}

	if len(privileges) == 0 {
		for _, servicePrivilege := range service.Privileges {
			if strings.ToLower(call.method) == strings.ToLower(servicePrivilege.Privilege) {
				return []privilege{servicePrivilege}
			}
		}
	}

	return []privilege{}
}

func subSARARN(arn string, params []keyValue) string {
	// TODO

	return arn
}

func parseAST(filecontents string) {
	var imports []string
	var services []awsService
	var calls []awsCall
	var privs []priv

	// Create the AST
	fset := token.NewFileSet()
	f, err := parser.ParseFile(fset, "", filecontents, 0)
	if err != nil {
		panic(err)
	}

	// Print the AST
	//ast.Print(fset, f)

	// Get imports
	for _, importobj := range f.Imports {
		imports = append(imports, strings.Replace(importobj.Path.Value, "\"", "", -1))
	}

	// Go for a walk
	ast.Inspect(f, func(n ast.Node) bool {
		// AssignStmt
		nx, found := n.(*ast.AssignStmt)
		if found {
			if len(nx.Lhs) == 1 && len(nx.Rhs) == 1 {
				lhsx, found := nx.Lhs[0].(*ast.Ident)
				if found {
					rhsx, found := nx.Rhs[0].(*ast.CallExpr)
					if found {
						funx, found := rhsx.Fun.(*ast.SelectorExpr)
						if found {
							xx, found := funx.X.(*ast.Ident)
							if found {
								if funx.Sel.Name == "New" {
									for _, importobj := range imports {
										if strings.HasSuffix(importobj, fmt.Sprintf("aws-sdk-go/service/%s", xx.Name)) {
											services = append(services, awsService{
												variable: lhsx.Name,
												service:  xx.Name,
											})
										}
									}
								}
							}
						}
					}
				}
			}
		}

		// CallExpr
		ny, found := n.(*ast.CallExpr)
		if found {
			funy, found := ny.Fun.(*ast.SelectorExpr)
			if found {
				xy, found := funy.X.(*ast.Ident)
				if found {
					for _, service := range services {
						if service.variable == xy.Name {
							calls = append(calls, awsCall{
								service:    service.service,
								serviceVar: service.variable,
								method:     funy.Sel.Name,
							})
							break
						}
					}
				}
			}
		}

		return true
	})

	//

	var iamdef []iamDefinition
	err = json.Unmarshal(iamfile, &iamdef)
	if err != nil {
		log.Fatal(err)
	}

	for _, call := range calls {
		foundmatch := false

		for _, service := range iamdef {
			if service.Prefix == strings.ToLower(call.service) {
				privilegearray := mapCallToPrivilegeArray(service, call)

				for _, privilege := range privilegearray {
					foundmatch = true

					resourcearns := []string{}

					for _, resourceType := range privilege.ResourceTypes {
						for _, resource := range service.Resources {
							if resource.Resource == strings.Replace(resourceType.ResourceType, "*", "", -1) && resource.Resource != "" {
								subbedArn := subSARARN(resource.Arn, call.params)
								if resourceType.ResourceType[len(resourceType.ResourceType)-1:] == "*" || subbedArn[len(subbedArn)-1:] != "*" {
									resourcearns = append(resourcearns, subbedArn)
								}
							}
						}
					}

					if len(resourcearns) == 0 {
						resourcearns = []string{"*"}
					}

					privs = append(privs, priv{
						action:      fmt.Sprintf("%s:%s", service.Prefix, privilege.Privilege),
						explanation: privilege.Description,
						resource:    resourcearns,
					})
				}
			}
		}

		if !foundmatch {
			fmt.Println(fmt.Sprintf("WARNING: Could not find privilege match for %s:%s", strings.ToLower(call.service), call.method))
		}
	}

	fmt.Println(toIAMPolicy(privs))
}

func main() {
	if len(os.Args) < 2 {
		log.Fatal("Not enough arguments")
	}

	filecontents, err := ioutil.ReadFile(os.Args[len(os.Args)-1])
	if err != nil {
		log.Fatal(err)
	}

	parseAST(string(filecontents))
}
