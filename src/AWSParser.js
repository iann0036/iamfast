#!/usr/bin/env node

import antlr4 from 'antlr4';

import JavaScriptLexer from './lib/JavaScriptLexer.js';
import JavaScriptParser from './lib/JavaScriptParser.js';
import JavaScriptAWSListener from './lib/JavaScriptAWSListener.js';
import JavaScriptScopeListener from './lib/JavaScriptScopeListener.js';
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

import PyCloudFormationService from './lib/py-cloudformation-service.js';
import PyCloudWatchService from './lib/py-cloudwatch-service.js';
import PyDynamoDBService from './lib/py-dynamodb-service.js';
import PyEC2Service from './lib/py-ec2-service.js';
import PyGlacierService from './lib/py-glacier-service.js';
import PyIAMService from './lib/py-iam-service.js';
import PyOpsWorksService from './lib/py-opsworks-service.js';
import PyS3Service from './lib/py-s3-service.js';
import PySNSService from './lib/py-sns-service.js';
import PySQSService from './lib/py-sqs-service.js';

export default class AWSParser {

    constructor() {
        this.client_calls = [];
        this.resource_calls = [];
        this.environmental_variables = [];
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
        let lexer, tokens, parser, tree, listener, scopeListener;

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

                scopeListener = new JavaScriptScopeListener();
                antlr4.tree.ParseTreeWalker.DEFAULT.walk(scopeListener, tree);

                listener = new JavaScriptAWSListener(scopeListener.VariableDeclarations, scopeListener.FunctionDeclarations, scopeListener.FunctionCalls);
                antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

                this.client_calls = listener.ClientCalls;
                this.resource_calls = listener.ResourceCalls;
                this.environmental_variables = [...new Set(scopeListener.EnvironmentVariables)]; // no dupes

                this.debug && console.dir(listener, {depth: 3});

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
                this.resource_calls = listener.ResourceCalls;
                this.environmental_variables = [...new Set(listener.EnvironmentVariables)]; // no dupes

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
                this.environmental_variables = [...new Set(listener.EnvironmentVariables)]; // no dupes

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
                this.environmental_variables = [...new Set(listener.EnvironmentVariables)]; // no dupes

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
                this.environmental_variables = [...new Set(listener.EnvironmentVariables)]; // no dupes

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
            const pyServiceMap = {
                "cloudformation": PyCloudFormationService,
                "cloudwatch": PyCloudWatchService,
                "dynamodb": PyDynamoDBService,
                "ec2": PyEC2Service,
                "glacier": PyGlacierService,
                "iam": PyIAMService,
                "opsworks": PyOpsWorksService,
                "s3": PyS3Service,
                "sns": PySNSService,
                "sqs": PySQSService
            };

            for (let resource_call of this.resource_calls) {
                if (resource_call.resource && pyServiceMap[resource_call.resource.type]) {
                    let method = null;

                    if (pyServiceMap[resource_call.resource.type].service.actions && !resource_call.subnamespace) { // x = boto3.resource(''); x.y()
                        for (let actionname of Object.keys(pyServiceMap[resource_call.resource.type].service.actions)) {
                            if (resource_call.method.replace(/_/g, "").toLowerCase() == actionname.toLowerCase()) {
                                method = pyServiceMap[resource_call.resource.type].service.actions[actionname].request.operation;
                            }
                        }
                    } else if (pyServiceMap[resource_call.resource.type].service.hasMany && resource_call.subnamespace) { // x = boto3.resource(''); x.y.z()
                        for (let collectionname of Object.keys(pyServiceMap[resource_call.resource.type].service.hasMany)) {
                            if (resource_call.subnamespace.replace(/_/g, "").toLowerCase() == collectionname.toLowerCase()) {
                                method = pyServiceMap[resource_call.resource.type].service.hasMany[collectionname].request.operation
                            }
                        }
                    }

                    if (method) {
                        calls.push({
                            'service': resource_call.resource.type,
                            'method': method,
                            'params': resource_call.args,
                            'position': {
                                'start': resource_call.start,
                                'stop': resource_call.stop
                            }
                        });
                    }
                } else if (resource_call.resourceObject && pyServiceMap[resource_call.resourceObject.resource.type]) {
                    let method = null;

                    if (pyServiceMap[resource_call.resourceObject.resource.type].resources && pyServiceMap[resource_call.resourceObject.resource.type].resources[resource_call.resourceObject.object] && pyServiceMap[resource_call.resourceObject.resource.type].resources[resource_call.resourceObject.object].actions && !resource_call.subnamespace) { // x = boto3.resource('').Thing(); x.y()
                        for (let actionname of Object.keys(pyServiceMap[resource_call.resourceObject.resource.type].resources[resource_call.resourceObject.object].actions)) {
                            if (resource_call.method.replace(/_/g, "").toLowerCase() == actionname.toLowerCase()) {
                                method = pyServiceMap[resource_call.resourceObject.resource.type].resources[resource_call.resourceObject.object].actions[actionname].request.operation;
                            }
                        }
                    } else if (pyServiceMap[resource_call.resourceObject.resource.type].resources && pyServiceMap[resource_call.resourceObject.resource.type].resources[resource_call.resourceObject.object] && pyServiceMap[resource_call.resourceObject.resource.type].resources[resource_call.resourceObject.object].hasMany && resource_call.subnamespace) { // x = boto3.resource('').Thing(); x.y.z()
                        for (let collectionname of Object.keys(pyServiceMap[resource_call.resourceObject.resource.type].resources[resource_call.resourceObject.object].hasMany)) {
                            if (resource_call.subnamespace.replace(/_/g, "").toLowerCase() == collectionname.toLowerCase()) {
                                method = pyServiceMap[resource_call.resourceObject.resource.type].resources[resource_call.resourceObject.object].hasMany[collectionname].request.operation;
                            }
                        }
                    }

                    if (method) {
                        calls.push({
                            'service': resource_call.resourceObject.resource.type,
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
