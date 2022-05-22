import Python3Parser from './Python3Parser.js';
import Python3ParserListener from './Python3ParserListener.js';

import PyCloudFormationService from './py-cloudformation-service.js';
import PyCloudWatchService from './py-cloudwatch-service.js';
import PyDynamoDBService from './py-dynamodb-service.js';
import PyEC2Service from './py-ec2-service.js';
import PyGlacierService from './py-glacier-service.js';
import PyIAMService from './py-iam-service.js';
import PyOpsWorksService from './py-opsworks-service.js';
import PyS3Service from './py-s3-service.js';
import PySNSService from './py-sns-service.js';
import PySQSService from './py-sqs-service.js';

export default class Python3AWSListener extends Python3ParserListener {

    constructor(variableDeclarations, functionDeclarations, functionCalls) {
        super();
        this.SDKDeclarations = [];
        this.ClientDeclarations = [];
        this.ResourceDeclarations = [];
        this.ClientCalls = [];
        this.ResourceObjects = [];
        this.ResourceCalls = [];
        this.VariableDeclarations = variableDeclarations;
        this.FunctionDeclarations = functionDeclarations;
        this.FunctionCalls = functionCalls;
        this.currentScope = [];
    }

    enterFuncdef(ctx) {
        this.currentScope.push(ctx.children[1].getText());
    }

    exitFuncdef(ctx) {
        let name = this.currentScope.pop();
    }

    resolveArgs(argsRaw, extra) {
        let args = {};

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
        let unnamedArgCount = 0;

        if (argsRaw.children.length == 3 && argsRaw.children[0].getText() == "(" && argsRaw.children[1] instanceof Python3Parser.ArglistContext && argsRaw.children[2].getText() == ")") {
            for (let arg of argsRaw.children[1].children) {
                if (arg instanceof Python3Parser.ArgumentContext) {
                    if (arg.children.length == 3 && arg.children[1].getText() == "=") {
                        let variables = this.drillToAtomExprs(arg.children[0]);
                        let values = this.drillToAtomExprs(arg.children[2]);
                        for (let variable of variables) {
                            for (let value of values) {
                                args[variable.getText()] = value.getText().replace(/^['"]?(.*?)['"]?$/g, '$1');
                            }
                        }

                        unnamedArgCount = -1; // no more unnamed arguments after a named argument
                    } else if (arg.children.length == 1 && unnamedArgCount != -1) {
                        if (extra && extra.resource && extra.object) {
                            args[pyServiceMap[extra.resource.type].resources[extra.object].identifiers[unnamedArgCount].name] = arg.getText().replace(/^['"]?(.*?)['"]?$/g, '$1');
                        }

                        unnamedArgCount += 1;
                    }
                }
            }
        }
        
        if (extra && extra.resourceObject && extra.method) {
            if (extra.subnamespace) {
                for (let collectionname of Object.keys(pyServiceMap[extra.resourceObject.resource.type].resources[extra.resourceObject.object].hasMany)) {
                    if (extra.subnamespace.replace(/_/g, "").toLowerCase() == collectionname.toLowerCase()) {
                        for (let requestParam of pyServiceMap[extra.resourceObject.resource.type].resources[extra.resourceObject.object].hasMany[collectionname].request.params) {
                            if (requestParam.source == "identifier" && extra.resourceObject.args[requestParam.name]) {
                                args[requestParam.target] = extra.resourceObject.args[requestParam.name];
                            }
                        }
                    }
                }
            } else {
                for (let actionname of Object.keys(pyServiceMap[extra.resourceObject.resource.type].resources[extra.resourceObject.object].actions)) {
                    if (extra.method.replace(/_/g, "").toLowerCase() == actionname.toLowerCase()) {
                        for (let requestParam of pyServiceMap[extra.resourceObject.resource.type].resources[extra.resourceObject.object].actions[actionname].request.params) {
                            if (requestParam.source == "identifier" && extra.resourceObject.args[requestParam.name]) {
                                args[requestParam.target] = extra.resourceObject.args[requestParam.name];
                            }
                        }
                    }
                }
            }
        }

        return args;
    }

    drillToAtomExprs(treeitem) {
        let items = [];

        if (treeitem.children) {
            treeitem.children.forEach(child => {
                if (child instanceof Python3Parser.Atom_exprContext) {
                    items.push(child);
                } else {
                    items = items.concat(this.drillToAtomExprs(child));
                }
            });
        }

        return items;
    }

    exitImport_name(ctx) {
        if (ctx.children[0].getText() == "import" && ctx.children[1] instanceof Python3Parser.Dotted_as_namesContext) {
            if (ctx.children[1].children[0].children.length == 3) {
                this.SDKDeclarations.push({
                    'type': 'standard',
                    'variable': ctx.children[1].children[0].children[2].getText()
                });
            } else {
                this.SDKDeclarations.push({
                    'type': 'standard',
                    'variable': 'boto3'
                });
            }
        }
	}

    exitImport_from(ctx) {
        if (ctx.children.length == 4 && ctx.children[0].getText() == "from" && ctx.children[2].getText() == "import") {
            if (ctx.children[3] instanceof Python3Parser.Import_as_namesContext && ctx.children[3].children.length == 1) {
                if (ctx.children[1].getText() == "boto3" && ctx.children[3].children[0].children[0].getText() == "session") {
                    if (ctx.children[3].children[0].children.length == 3 && ctx.children[3].children[0].children[1].getText() == "as") {
                        this.SDKDeclarations.push({
                            'type': 'sessionclass',
                            'variable': ctx.children[3].children[0].children[2].getText()
                        });
                    } else if (ctx.children[3].children[0].children.length == 1) {
                        this.SDKDeclarations.push({
                            'type': 'sessionclass',
                            'variable': 'session'
                        });
                    }
                } else if (ctx.children[1].getText() == "boto3.session" && ctx.children[3].children[0].children[0].getText() == "Session") {
                    if (ctx.children[3].children[0].children.length == 3 && ctx.children[3].children[0].children[1].getText() == "as") {
                        this.SDKDeclarations.push({
                            'type': 'session',
                            'variable': ctx.children[3].children[0].children[2].getText()
                        });
                    } else if (ctx.children[3].children[0].children.length == 1) {
                        this.SDKDeclarations.push({
                            'type': 'session',
                            'variable': 'Session'
                        });
                    }
                }
            }
        }
	}

    exitExpr_stmt(ctx) {
        if (ctx.children.length == 3 && ctx.children[0] instanceof Python3Parser.Testlist_star_exprContext && ctx.children[1].getText() == "=" && ctx.children[2] instanceof Python3Parser.Testlist_star_exprContext) { // w = x
            let atomExprLhs = this.drillToAtomExprs(ctx.children[0]);
            let atomExprRhs = this.drillToAtomExprs(ctx.children[2]);

            for (let assignable of atomExprLhs) {
                for (let rhs of atomExprRhs) {
                    if (rhs.children.length == 3 && rhs.children[0] instanceof Python3Parser.AtomContext && rhs.children[1] instanceof Python3Parser.TrailerContext && rhs.children[2] instanceof Python3Parser.TrailerContext && rhs.children[2].getText().startsWith("(") && rhs.children[2].getText().endsWith(")")) { // x.y(z)
                        let namespace = rhs.children[0];
                        if (rhs.children[1].children.length == 2 && rhs.children[1].children[0].getText() == ".") {
                            let method = rhs.children[1].children[1];
                            let argsRaw = rhs.children[2];

                            for (let sdkDeclaration of this.SDKDeclarations) {
                                if (namespace.getText() == sdkDeclaration['variable'] && method.getText() == 'client') { // boto3.client('servicename', ...), session.client('servicename', ...)
                                    if (argsRaw.children.length == 3 && argsRaw.children[1] instanceof Python3Parser.ArglistContext && argsRaw.children[1].children && argsRaw.children[1].children[0].children) {
                                        let arg1 = this.drillToAtomExprs(argsRaw.children[1].children[0])[0];
                                        let arg1filtered = arg1.getText().replace(/^['"](.*)['"]$/g, '$1');

                                        this.ClientDeclarations.push({
                                            'type': arg1filtered,
                                            'variable': assignable.getText(),
                                            'argsRaw': argsRaw,
                                            'sdk': sdkDeclaration
                                        });
                                        break;
                                    }
                                } else if (namespace.getText() == sdkDeclaration['variable'] && method.getText() == 'resource') { // boto3.resource('servicename', ...), session.resource('servicename', ...)
                                    if (argsRaw.children.length == 3 && argsRaw.children[1] instanceof Python3Parser.ArglistContext && argsRaw.children[1].children && argsRaw.children[1].children[0].children) {
                                        let arg1 = this.drillToAtomExprs(argsRaw.children[1].children[0])[0];
                                        let arg1filtered = arg1.getText().replace(/^['"](.*)['"]$/g, '$1');

                                        this.ResourceDeclarations.push({
                                            'type': arg1filtered,
                                            'variable': assignable.getText(),
                                            'argsRaw': argsRaw,
                                            'sdk': sdkDeclaration
                                        });
                                        break;
                                    }
                                } else if (namespace.getText() == sdkDeclaration['variable'] && method.getText() == 'Session') { // boto3.Session(...)
                                    this.SDKDeclarations.push({
                                        'type': 'sessioninst',
                                        'variable': assignable.getText()
                                    });
                                }
                            }

                            for (let clientDeclaration of this.ClientDeclarations) {
                                if (namespace.getText() == clientDeclaration['variable']) {
                                    this.ClientCalls.push({
                                        'client': clientDeclaration,
                                        'method': method.getText(),
                                        'argsRaw': argsRaw,
                                        'args': this.resolveArgs(argsRaw),
                                        'variable': assignable.getText(),
                                        'start': method.symbol.start,
                                        'stop': method.symbol.stop
                                    });
                                    break;
                                }
                            }

                            for (let resourceDeclaration of this.ResourceDeclarations) {
                                if (namespace.getText() == resourceDeclaration['variable']) {
                                    if (method.getText()[0] == method.getText()[0].toLowerCase()) {
                                        this.ResourceCalls.push({
                                            'resource': resourceDeclaration,
                                            'method': method.getText(),
                                            'argsRaw': argsRaw,
                                            'args': this.resolveArgs(argsRaw, { resource: resourceDeclaration, method: method.getText() }),
                                            'variable': assignable.getText(),
                                            'start': method.symbol.start,
                                            'stop': method.symbol.stop
                                        });
                                    } else {
                                        this.ResourceObjects.push({
                                            'resource': resourceDeclaration,
                                            'object': method.getText(),
                                            'argsRaw': argsRaw,
                                            'args': this.resolveArgs(argsRaw, { resource: resourceDeclaration, object: method.getText() }),
                                            'variable': assignable.getText(),
                                            'start': method.symbol.start,
                                            'stop': method.symbol.stop
                                        });
                                    }
                                    break;
                                }
                            }
                        }
                    } else if (rhs.children.length == 2 && rhs.children[0] instanceof Python3Parser.AtomContext && rhs.children[1] instanceof Python3Parser.TrailerContext && rhs.children[1].getText().startsWith("(") && rhs.children[1].getText().endsWith(")")) { // Session(z)
                        let method = rhs.children[0];

                        for (let sdkDeclaration of this.SDKDeclarations) {
                            if (method.getText() == sdkDeclaration['variable'] && sdkDeclaration['type'] == 'session') {
                                this.SDKDeclarations.push({
                                    'type': 'sessioninst',
                                    'variable': assignable.getText()
                                });
                            }
                        }
                    }
                }
            }
        } else if (ctx.children.length == 1 && ctx.children[0] instanceof Python3Parser.Testlist_star_exprContext) {
            let atomExpr = this.drillToAtomExprs(ctx.children[0]);

            for (let rhs of atomExpr) {
                if (rhs.children.length >= 4 && rhs.children[0] instanceof Python3Parser.AtomContext && rhs.children[1] instanceof Python3Parser.TrailerContext && rhs.children[2] instanceof Python3Parser.TrailerContext && !rhs.children[2].getText().startsWith("(") && !rhs.children[2].getText().endsWith(")") && rhs.children[3] instanceof Python3Parser.TrailerContext && rhs.children[3].getText().startsWith("(") && rhs.children[3].getText().endsWith(")")) { // w.x.y(z)...  [resource collections]
                    let namespace = rhs.children[0];
                    if (rhs.children[1].children.length == 2 && rhs.children[1].children[0].getText() == ".") {
                        let subnamespace = rhs.children[1].children[1];
                        if (rhs.children[2].children.length == 2 && rhs.children[2].children[0].getText() == ".") {
                            let method = rhs.children[2].children[1];
                            let argsRaw = rhs.children[3];

                            for (let resourceObject of this.ResourceObjects) {
                                if (namespace.getText() == resourceObject['variable']) {
                                    this.ResourceCalls.push({
                                        'resourceObject': resourceObject,
                                        'subnamespace': subnamespace.getText(),
                                        'method': method.getText(),
                                        'argsRaw': argsRaw,
                                        'args': this.resolveArgs(argsRaw, { resourceObject: resourceObject, method: method.getText(), subnamespace: subnamespace.getText() }),
                                        'start': method.symbol.start,
                                        'stop': method.symbol.stop
                                    });
                                    break;
                                }
                            }
    
                            for (let resourceDeclaration of this.ResourceDeclarations) {
                                if (namespace.getText() == resourceDeclaration['variable']) {
                                    if (method.getText()[0] == method.getText()[0].toLowerCase()) {
                                        this.ResourceCalls.push({
                                            'resource': resourceDeclaration,
                                            'subnamespace': subnamespace.getText(),
                                            'method': method.getText(),
                                            'argsRaw': argsRaw,
                                            'args': this.resolveArgs(argsRaw, { resource: resourceDeclaration, method: method.getText(), subnamespace: subnamespace.getText() }),
                                            'start': method.symbol.start,
                                            'stop': method.symbol.stop
                                        });
                                    }
                                    break;
                                }
                            }
                        }
                    }
                } else if (rhs.children.length >= 3 && rhs.children[0] instanceof Python3Parser.AtomContext && rhs.children[1] instanceof Python3Parser.TrailerContext && rhs.children[2] instanceof Python3Parser.TrailerContext && rhs.children[2].getText().startsWith("(") && rhs.children[2].getText().endsWith(")")) { // x.y(z)...
                    let namespace = rhs.children[0];
                    if (rhs.children[1].children.length == 2 && rhs.children[1].children[0].getText() == ".") {
                        let method = rhs.children[1].children[1];
                        let argsRaw = rhs.children[2];

                        for (let sdkDeclaration of this.SDKDeclarations) {
                            if (namespace.getText() == sdkDeclaration['variable'] && method.getText() == 'client') { // boto3.client('servicename', ...)
                                if (argsRaw.children.length == 3 && argsRaw.children[1] instanceof Python3Parser.ArglistContext && argsRaw.children[1].children && argsRaw.children[1].children[0].children) {
                                    let arg1 = this.drillToAtomExprs(argsRaw.children[1].children[0])[0];
                                    let arg1filtered = arg1.getText().replace(/^['"](.*)['"]$/g, '$1');

                                    this.ClientDeclarations.push({
                                        'type': arg1filtered,
                                        'variable': assignable.getText(),
                                        'argsRaw': argsRaw,
                                        'sdk': sdkDeclaration
                                    });
                                    break;
                                }
                            }
                        }

                        for (let clientDeclaration of this.ClientDeclarations) {
                            if (namespace.getText() == clientDeclaration['variable']) {
                                this.ClientCalls.push({
                                    'client': clientDeclaration,
                                    'method': method.getText(),
                                    'argsRaw': argsRaw,
                                    'args': this.resolveArgs(argsRaw),
                                    'start': method.symbol.start,
                                    'stop': method.symbol.stop
                                });
                                break;
                            }
                        }

                        for (let resourceObject of this.ResourceObjects) {
                            if (namespace.getText() == resourceObject['variable']) {
                                this.ResourceCalls.push({
                                    'resourceObject': resourceObject,
                                    'method': method.getText(),
                                    'argsRaw': argsRaw,
                                    'args': this.resolveArgs(argsRaw, { resourceObject: resourceObject, method: method.getText() }),
                                    'start': method.symbol.start,
                                    'stop': method.symbol.stop
                                });
                                break;
                            }
                        }

                        for (let resourceDeclaration of this.ResourceDeclarations) {
                            if (namespace.getText() == resourceDeclaration['variable']) {
                                if (method.getText()[0] == method.getText()[0].toLowerCase()) {
                                    this.ResourceCalls.push({
                                        'resource': resourceDeclaration,
                                        'method': method.getText(),
                                        'argsRaw': argsRaw,
                                        'args': this.resolveArgs(argsRaw, { resource: resourceDeclaration, method: method.getText() }),
                                        'start': method.symbol.start,
                                        'stop': method.symbol.stop
                                    });
                                } else {
                                    this.ResourceObjects.push({
                                        'resource': resourceDeclaration,
                                        'object': method.getText(),
                                        'argsRaw': argsRaw,
                                        'args': this.resolveArgs(argsRaw, { resource: resourceDeclaration, object: method.getText() }),
                                        'start': method.symbol.start,
                                        'stop': method.symbol.stop
                                    });
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
	}
}
