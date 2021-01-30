package main

import (
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

type awsService struct {
	variable string
	service  string
}

type awsCall struct {
	service    string
	serviceVar string
	method     string
}

type statement struct {
	Effect   string `json:"Effect"`
	Action   string `json:"Action"`
	Resource string `json:"Resource"`
}

type iamPolicy struct {
	Version   string      `json:"Version"`
	Statement []statement `json:"Statement"`
}

func toIAMPolicy(calls []awsCall) string {
	var policy iamPolicy

	policy.Version = "2012-10-17"
	for _, call := range calls {
		policy.Statement = append(policy.Statement, statement{
			Effect:   "Allow",
			Action:   fmt.Sprintf("%s:%s", call.service, call.method),
			Resource: "*",
		})
	}

	b, err := json.MarshalIndent(policy, "", "    ")
	if err != nil {
		panic(err)
	}

	return string(b)
}

func parseAST(filecontents string) {
	var imports []string
	var services []awsService
	var calls []awsCall

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

	fmt.Println(toIAMPolicy(calls))
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
