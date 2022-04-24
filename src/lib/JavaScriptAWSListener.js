import JavaScriptParser from './JavaScriptParser.js';
import JavaScriptParserListener from './JavaScriptParserListener.js';
import EnvironmentVariable from '../EnvironmentVariable.js';

export default class JavaScriptAWSListener extends JavaScriptParserListener {

    constructor(variableDeclarations) {
        super();
        this.SDKDeclarations = [];
        this.ClientDeclarations = [];
        this.ResourceDeclarations = [];
        this.ClientCalls = [];
        this.ResourceObjects = [];
        this.ResourceCalls = [];
        this.VariableDeclarations = variableDeclarations;
    }

    resolvePropertyMap(obj) {
        let ret = {};

        for (let k of Object.keys(obj)) {
            if (obj[k].type == "object") {
                ret[k] = this.resolvePropertyMap(obj[k].value);
            } else if (obj[k].type == "literal") {
                ret[k] = obj[k].value;
            } else if (obj[k].type == "envvar") {
                ret[k] = new EnvironmentVariable(obj[k].value)
            }
        }

        return ret;
    }

    resolveArgs(argsRaw) {
        let args = {};

        for (let argument of argsRaw.children) {
            if (argument instanceof JavaScriptParser.ArgumentContext) {
                if (argument.children.length == 1) { // blah(###abc###) 
                    if (argument.children[0] instanceof JavaScriptParser.IdentifierExpressionContext) {
                        let argumentsVariable = argument.children[0].getText();

                        for (let variable of this.VariableDeclarations) {
                            if (variable.variable == argumentsVariable) {
                                if (variable.type == "object") {
                                    args = this.resolvePropertyMap(variable.propertyMap);
                                }
                            }
                        }
                    }
                }
                // else blah(...###x###, )
            }
        }

        return args;
    }

    exitAssignmentExpression(ctx) {
        this.aggregateVariableOrAssignmentDeclaration(ctx);
    }

    exitVariableDeclaration(ctx) {
        this.aggregateVariableOrAssignmentDeclaration(ctx);
    }

    aggregateVariableOrAssignmentDeclaration(ctx) {
        const assignable = ctx.children[0]; // ### = blah
        if (assignable.children.length && assignable.children[0] instanceof JavaScriptParser.IdentifierContext) {
            if (ctx.children.length == 3) {
                const expression = ctx.children[2]; // blah = ###

                if (expression instanceof JavaScriptParser.ArgumentsExpressionContext) { // find SDK requires
                    if (expression.children[0].getText() == "require" && ["('aws-sdk')", "(\"aws-sdk\")"].includes(expression.children[1].getText())) {
                        this.SDKDeclarations.push({
                            'variable': assignable.getText()
                        });
                    }
                } else if (expression instanceof JavaScriptParser.NewExpressionContext) { // find client instantiations
                    let className = expression.children[1]; // new ### (...)
                    let argsRaw = null;
                    let argsRawPrev = null;
                    let anonymousDeclaration = false;
                    let prevMethod = null;
                    if (expression.children.length == 3) {
                        argsRaw = expression.children[2]; // new blah###(...)###  TODO: compensate for new blah###(...)###.someMethod()
                    }
                    while (className instanceof JavaScriptParser.MemberDotExpressionContext) { // blah.blah
                        if (className.children[0] instanceof JavaScriptParser.IdentifierExpressionContext) {
                            const namespace = className.children[0]; // ###.blah
                            const method = className.children[className.children.length - 1]; // blah.###
                            let foundDeclaration = false;

                            for (let sdkDeclaration of this.SDKDeclarations) {
                                if (namespace.getText() == sdkDeclaration['variable']) {
                                    this.ClientDeclarations.push({
                                        'type': method.getText(),
                                        'variable': (anonymousDeclaration ? null : assignable.getText()),
                                        'argsRaw': argsRaw,
                                        'sdk': sdkDeclaration
                                    });
                                    foundDeclaration = true;
                                    break;
                                }
                            }
                            if (!foundDeclaration && namespace.getText() == "AWS") { // 2nd chance default
                                this.ClientDeclarations.push({
                                    'type': method.getText(),
                                    'variable': (anonymousDeclaration ? null : assignable.getText()),
                                    'argsRaw': argsRaw,
                                    'sdk': null
                                });
                            }
                            if (anonymousDeclaration && prevMethod.getText()) { // new AWS.Service().methodName(args)
                                this.ClientCalls.push({
                                    'client': this.ClientDeclarations[this.ClientDeclarations.length - 1],
                                    'method': prevMethod.getText(),
                                    'argsRaw': argsRawPrev,
                                    'args': this.resolveArgs(argsRawPrev),
                                    'start': prevMethod.start.start,
                                    'stop': prevMethod.stop.stop
                                });
                            }
                            break;
                        } else if (className.children[0] instanceof JavaScriptParser.MemberDotExpressionContext) { // blah.blah.blah
                            const namespace = className.children[0]; // ###.blah.blah
                            const method = className.children[className.children.length - 1]; // blah.###.blah ??
                            let foundDeclaration = false;

                            if (namespace.getText().match(/^[^\.]+\.[^\.]+$/)) {
                                let parentNamespace = namespace.getText().split(".")[0];
                                let childNamespace = namespace.getText().split(".")[1];

                                for (let sdkDeclaration of this.SDKDeclarations) {
                                    if (parentNamespace == sdkDeclaration['variable']) {
                                        this.ResourceDeclarations.push({
                                            'type': method.getText(),
                                            'parentType': childNamespace,
                                            'variable': (anonymousDeclaration ? null : assignable.getText()),
                                            'argsRaw': argsRaw,
                                            'sdk': sdkDeclaration
                                        });
                                        foundDeclaration = true;
                                        break;
                                    }
                                }
                                if (anonymousDeclaration && prevMethod.getText()) { // new AWS.Service().methodName(args)
                                    this.ResourceCalls.push({
                                        'resource': this.ResourceDeclarations[this.ResourceDeclarations.length - 1],
                                        'method': prevMethod.getText(),
                                        'argsRaw': argsRawPrev,
                                        'args': this.resolveArgs(argsRawPrev),
                                        'start': prevMethod.start.start,
                                        'stop': prevMethod.stop.stop
                                    });
                                }
                            }

                            break;
                        } else if (className.children[0] instanceof JavaScriptParser.ArgumentsExpressionContext) {
                            anonymousDeclaration = true;
                            prevMethod = null;
                            if (className.children.length == 3 && className.children[1].getText() == "." && className.children[2] instanceof JavaScriptParser.IdentifierNameContext) {
                                prevMethod = className.children[2];
                            }
                            if (className.children[0].children[0] instanceof JavaScriptParser.MemberDotExpressionContext) {
                                argsRawPrev = argsRaw;
                                argsRaw = className.children[0].children[1];
                                className = className.children[0].children[0];
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }

    exitArgumentsExpression(ctx) {
        const callMethod = ctx.children[0] // ###()
        const argsRaw = ctx.children[1] // blah###
        if (callMethod instanceof JavaScriptParser.MemberDotExpressionContext) {
            const namespace = callMethod.children[0] // ###.blah
            const method = callMethod.children[callMethod.children.length - 1] // blah.###

            for (let clientDeclaration of this.ClientDeclarations) {
                if (namespace.getText() == clientDeclaration['variable']) {
                    this.ClientCalls.push({
                        'client': clientDeclaration,
                        'method': method.getText(),
                        'argsRaw': argsRaw,
                        'args': this.resolveArgs(argsRaw),
                        'start': method.start.start,
                        'stop': method.stop.stop
                    });
                    break;
                }
            }

            for (let resourceDeclaration of this.ResourceDeclarations) {
                if (namespace.getText() == resourceDeclaration['variable']) {
                    this.ResourceCalls.push({
                        'resource': resourceDeclaration,
                        'method': method.getText(),
                        'argsRaw': argsRaw,
                        'args': this.resolveArgs(argsRaw),
                        'start': method.start.start,
                        'stop': method.stop.stop
                    });
                    break;
                }
            }
        }
	}
}