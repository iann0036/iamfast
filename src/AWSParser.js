#!/usr/bin/env node

import antlr4 from 'antlr4';
import JavaScriptLexer from './lib/JavaScriptLexer.js';
import JavaScriptParser from './lib/JavaScriptParser.js';
import JavaScriptAWSListener from './lib/JavaScriptAWSListener.js';
import Python3Lexer from './lib/Python3Lexer.js'
import Python3Parser from './lib/Python3Parser.js';
import Python3AWSListener from './lib/Python3AWSListener.js';
import JavaLexer from './lib/JavaLexer.js'
import JavaParser from './lib/JavaParser.js';
import JavaAWSListener from './lib/JavaAWSListener.js';
import CPP14Lexer from './lib/CPP14Lexer.js'
import CPP14Parser from './lib/CPP14Parser.js';
import CPP14AWSListener from './lib/CPP14AWSListener.js';
import GoLexer from './lib/GoLexer.js'
import GoParser from './lib/GoParser.js';
import GoAWSListener from './lib/GoAWSListener.js';

export default class AWSParser {

    constructor() {
        this.client_calls = [];
        this.resource_calls = [];
        this.debug = false;
    }

    treeWalker(tree, depth) {
        console.log(" ".repeat(depth*2) + tree.constructor.name + " - " + tree.getText().substr(0, 50));
        if (tree.children) {
            for (let child of tree.children) {
                this.treeWalker(child, depth+1);
            }
        }
    }

    ParseInput(input, language) {
        let lexer, tokens, parser, tree, listener;

        input += "\n";

        let chars = new antlr4.InputStream(input);

        switch (language) {
            case 'js':
                lexer = new JavaScriptLexer(chars);
                lexer.strictMode = false;

                tokens = new antlr4.CommonTokenStream(lexer);
                parser = new JavaScriptParser(tokens);
                parser.buildParseTrees = true;

                tree = parser.program();
                this.debug && this.treeWalker(tree, 0);

                listener = new JavaScriptAWSListener();
                antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

                this.client_calls = listener.ClientCalls;
                this.resource_calls = listener.ResourceCalls;

                this.debug && console.log(listener);

                break;
            case 'python':
                lexer = new Python3Lexer(chars);
                lexer.strictMode = false;
    
                tokens = new antlr4.CommonTokenStream(lexer);
                parser = new Python3Parser(tokens);
                parser.buildParseTrees = true;
    
                tree = parser.file_input();
                this.debug && this.treeWalker(tree, 0);
    
                listener = new Python3AWSListener();
                antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

                this.client_calls = listener.ClientCalls;

                this.debug && console.log(listener);

                break;
            case 'java':
                lexer = new JavaLexer(chars);
                lexer.strictMode = false;
    
                tokens = new antlr4.CommonTokenStream(lexer);
                parser = new JavaParser(tokens);
                parser.buildParseTrees = true;
    
                tree = parser.compilationUnit();
                this.debug && this.treeWalker(tree, 0);
    
                listener = new JavaAWSListener();
                antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

                this.client_calls = listener.ClientCalls;

                this.debug && console.log(listener);

                break;
            case 'go':
                lexer = new GoLexer(chars);
                lexer.strictMode = false;
    
                tokens = new antlr4.CommonTokenStream(lexer);
                parser = new GoParser(tokens);
                parser.buildParseTrees = true;
    
                tree = parser.sourceFile();
                this.debug && this.treeWalker(tree, 0);
    
                listener = new GoAWSListener();
                antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

                this.client_calls = listener.ClientCalls;

                this.debug && console.log(listener);

                break;
            case 'cplusplus':
                lexer = new CPP14Lexer(chars);
                lexer.strictMode = false;
    
                tokens = new antlr4.CommonTokenStream(lexer);
                parser = new CPP14Parser(tokens);
                parser.buildParseTrees = true;
    
                tree = parser.translationUnit();
                this.debug && this.treeWalker(tree, 0);
    
                listener = new CPP14AWSListener();
                antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

                this.client_calls = listener.ClientCalls;

                this.debug && console.log(listener);

                break;
            default:
                throw "Unknown language";
        }
    }

    GetNormalizedServiceCalls(language) {
        let calls = [];

        for (let client_call of this.client_calls) {
            let method = client_call.method.substr(0, 1).toUpperCase() + client_call.method.substr(1).replace(/_([a-z0-9])/g, (match, p1) => p1.toUpperCase());

            calls.push({
                'service': client_call.client.type.toLowerCase(),
                'method': method,
                'params': client_call.args,
                'position': {
                    'start': client_call.start,
                    'stop': client_call.stop
                }
            });
        }

        if (language == "js") {
            for (let resource_call of this.resource_calls) {
                if (resource_call.resource.type == "DocumentClient" && resource_call.resource.parentType == "DynamoDB") {
                    let method = null;

                    if (resource_call.method == "batchGet") { method = "BatchGetItem" }
                    if (resource_call.method == "batchWrite") { method = "BatchWriteItem" }
                    if (resource_call.method == "delete") { method = "DeleteItem" }
                    if (resource_call.method == "get") { method = "GetItem" }
                    if (resource_call.method == "put") { method = "PutItem" }
                    if (resource_call.method == "query") { method = "Query" }
                    if (resource_call.method == "scan") { method = "Scan" }
                    if (resource_call.method == "transactGet") { method = "TransactGetItems" }
                    if (resource_call.method == "transactWrite") { method = "TransactWriteItems" }
                    if (resource_call.method == "update") { method = "UpdateItem" }

                    if (method) {
                        calls.push({
                            'service': 'dynamodb',
                            'method': method,
                            'params': resource_call.args,
                            'position': {
                                'start': resource_call.start,
                                'stop': resource_call.stop
                            }
                        });
                    }
                } else if (resource_call.resource.type == "ManagedUpload" && resource_call.resource.parentType == "S3") {
                    for (let method of ['PutObject', 'CreateMultipartUpload', 'UploadPart', 'AbortMultipartUpload', 'CompleteMultipartUpload', 'PutObjectTagging']) {
                        calls.push({
                            'service': 's3',
                            'method': method,
                            'params': resource_call.args,
                            'position': {
                                'start': resource_call.start,
                                'stop': resource_call.stop
                            }
                        });
                    }
                }
            }
        } else if (language == "python") {
            for (let resource_call of this.resource_calls) {
                if (resource_call.resource && resource_call.resource.type == "cloudformation" && !resource_call.resourceObject) {
                    let method = null;

                    if (resource_call.method == "create_stack") { method = "CreateStack" }

                    if (method) {
                        calls.push({
                            'service': 'cloudformation',
                            'method': method,
                            'params': resource_call.args,
                            'position': {
                                'start': resource_call.start,
                                'stop': resource_call.stop
                            }
                        });
                    }
                } else if (resource_call.resource && resource_call.resource.type == "cloudwatch" && !resource_call.resourceObject) {
                    // N/A
                } else if (resource_call.resource && resource_call.resource.type == "dynamodb" && !resource_call.resourceObject) {
                    let method = null;

                    if (resource_call.method == "batch_get_item") { method = "BatchGetItem" }
                    if (resource_call.method == "batch_write_item") { method = "BatchWriteItem" }
                    if (resource_call.method == "create_table") { method = "CreateTable" }

                    if (method) {
                        calls.push({
                            'service': 'dynamodb',
                            'method': method,
                            'params': resource_call.args,
                            'position': {
                                'start': resource_call.start,
                                'stop': resource_call.stop
                            }
                        });
                    }
                } else if (resource_call.resource && resource_call.resource.type == "ec2" && !resource_call.resourceObject) {
                    let method = null;

                    if (resource_call.method == "create_dhcp_options") { method = "CreateDhcpOptions" }
                    if (resource_call.method == "create_instances") { method = "RunInstances" }
                    if (resource_call.method == "create_internet_gateway") { method = "CreateInternetGateway" }
                    if (resource_call.method == "create_key_pair") { method = "CreateKeyPair" }
                    if (resource_call.method == "create_network_acl") { method = "CreateNetworkAcl" }
                    if (resource_call.method == "create_network_interface") { method = "CreateNetworkInterface" }
                    if (resource_call.method == "create_placement_group") { method = "CreatePlacementGroup" }
                    if (resource_call.method == "create_route_table") { method = "CreateRouteTable" }
                    if (resource_call.method == "create_security_group") { method = "CreateSecurityGroup" }
                    if (resource_call.method == "create_snapshot") { method = "CreateSnapshot" }
                    if (resource_call.method == "create_subnet") { method = "CreateSubnet" }
                    if (resource_call.method == "create_tags") { method = "CreateTags" }
                    if (resource_call.method == "create_volume") { method = "CreateVolume" }
                    if (resource_call.method == "create_vpc") { method = "CreateVpc" }
                    if (resource_call.method == "create_vpc_peering_connection") { method = "CreateVpcPeeringConnection" }
                    if (resource_call.method == "disassociate_route_table") { method = "DisassociateRouteTable" }
                    if (resource_call.method == "import_key_pair") { method = "ImportKeyPair" }
                    if (resource_call.method == "register_image") { method = "RegisterImage" }

                    if (method) {
                        calls.push({
                            'service': 'ec2',
                            'method': method,
                            'params': resource_call.args,
                            'position': {
                                'start': resource_call.start,
                                'stop': resource_call.stop
                            }
                        });
                    }
                } else if (resource_call.resource && resource_call.resource.type == "glacier" && !resource_call.resourceObject) {
                    let method = null;

                    if (resource_call.method == "create_vault") { method = "CreateVault" }

                    if (method) {
                        calls.push({
                            'service': 'glacier',
                            'method': method,
                            'params': resource_call.args,
                            'position': {
                                'start': resource_call.start,
                                'stop': resource_call.stop
                            }
                        });
                    }
                } else if (resource_call.resource && resource_call.resource.type == "iam" && !resource_call.resourceObject) {
                    let method = null;

                    if (resource_call.method == "change_password") { method = "ChangePassword" }
                    if (resource_call.method == "create_account_alias") { method = "CreateAccountAlias" }
                    if (resource_call.method == "create_account_password_policy") { method = "UpdateAccountPasswordPolicy" }
                    if (resource_call.method == "create_group") { method = "CreateGroup" }
                    if (resource_call.method == "create_instance_profile") { method = "CreateInstanceProfile" }
                    if (resource_call.method == "create_policy") { method = "CreatePolicy" }
                    if (resource_call.method == "create_role") { method = "CreateRole" }
                    if (resource_call.method == "create_saml_provider") { method = "CreateSAMLProvider" }
                    if (resource_call.method == "create_server_certificate") { method = "UploadServerCertificate" }
                    if (resource_call.method == "create_signing_certificate") { method = "UploadSigningCertificate" }
                    if (resource_call.method == "create_user") { method = "CreateUser" }
                    if (resource_call.method == "create_virtual_mfa_device") { method = "CreateVirtualMFADevice" }

                    if (method) {
                        calls.push({
                            'service': 'iam',
                            'method': method,
                            'params': resource_call.args,
                            'position': {
                                'start': resource_call.start,
                                'stop': resource_call.stop
                            }
                        });
                    }
                } else if (resource_call.resource && resource_call.resource.type == "opsworks" && !resource_call.resourceObject) {
                    let method = null;

                    if (resource_call.method == "create_stack") { method = "CreateStack" }

                    if (method) {
                        calls.push({
                            'service': 'opsworks',
                            'method': method,
                            'params': resource_call.args,
                            'position': {
                                'start': resource_call.start,
                                'stop': resource_call.stop
                            }
                        });
                    }
                } else if (resource_call.resource && resource_call.resource.type == "s3" && !resource_call.resourceObject) {
                    let method = null;

                    if (resource_call.method == "create_bucket") { method = "CreateBucket" }

                    if (method) {
                        calls.push({
                            'service': 's3',
                            'method': method,
                            'params': resource_call.args,
                            'position': {
                                'start': resource_call.start,
                                'stop': resource_call.stop
                            }
                        });
                    }
                } else if (resource_call.resource && resource_call.resource.type == "sns" && !resource_call.resourceObject) {
                    let method = null;

                    if (resource_call.method == "create_platform_application") { method = "CreatePlatformApplication" }
                    if (resource_call.method == "create_topic") { method = "CreateTopic" }

                    if (method) {
                        calls.push({
                            'service': 'sns',
                            'method': method,
                            'params': resource_call.args,
                            'position': {
                                'start': resource_call.start,
                                'stop': resource_call.stop
                            }
                        });
                    }
                } else if (resource_call.resource && resource_call.resource.type == "sqs" && !resource_call.resourceObject) {
                    let method = null;

                    if (resource_call.method == "create_queue") { method = "CreateQueue" }

                    if (method) {
                        calls.push({
                            'service': 'sqs',
                            'method': method,
                            'params': resource_call.args,
                            'position': {
                                'start': resource_call.start,
                                'stop': resource_call.stop
                            }
                        });
                    }
                }
            }
        }

        return calls;
    }
}
