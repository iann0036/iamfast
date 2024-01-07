import GoParser from './GoParser.js';
import GoParserListener from './GoParserListener.js';

export default class GoAWSListener extends GoParserListener {

    constructor() {
        super();
        this.Imports = [];
        this.SDKDeclarations = [];
        this.ClientDeclarations = [];
        this.ClientCalls = [];
        this.VariableDeclarations = [];
        this.EnvironmentVariables = [];
    }

    resolveArgs(argsRaw) {
        let args = {};

        if (argsRaw.children.length == 3 && argsRaw.children[1] instanceof GoParser.ExpressionListContext) {
            if (argsRaw.children[1].children.length == 1) {
                if (argsRaw.children[1].children[0].children.length == 2 && argsRaw.children[1].children[0].children[0].getText() == "&") {
                    if (argsRaw.children[1].children[0].children[1].children.length == 1 && argsRaw.children[1].children[0].children[1].children[0] instanceof GoParser.PrimaryExprContext) {
                        if (argsRaw.children[1].children[0].children[1].children[0].children.length == 1 && argsRaw.children[1].children[0].children[1].children[0].children[0] instanceof GoParser.OperandContext) {
                            if (argsRaw.children[1].children[0].children[1].children[0].children[0].children.length == 1 && argsRaw.children[1].children[0].children[1].children[0].children[0].children[0] instanceof GoParser.LiteralContext) {
                                if (argsRaw.children[1].children[0].children[1].children[0].children[0].children[0].children.length == 1 && argsRaw.children[1].children[0].children[1].children[0].children[0].children[0].children[0] instanceof GoParser.CompositeLitContext) {
                                    let inputtype = argsRaw.children[1].children[0].children[1].children[0].children[0].children[0].children[0].children[0];
                                    let inputvalue = argsRaw.children[1].children[0].children[1].children[0].children[0].children[0].children[0].children[1];

                                    if (inputvalue.children.length > 2 && inputvalue.children[1] instanceof GoParser.ElementListContext) {
                                        for (let el of inputvalue.children[1].children) {
                                            if (el instanceof GoParser.KeyedElementContext) {
                                                if (el.children.length == 3) {
                                                    let key = el.children[0].getText();
                                                    let value = el.children[2].getText();

                                                    if (value.match(/aws\.[a-zA-Z0-9]+\((.+?)\)/)) { // aws.String(...)
                                                        value = value.replace(/aws\.[a-zA-Z0-9]+\((.+?)\)/, "$1");

                                                        if (value.match(/^(['"].*['"])|([0-9.-]+)$/)) { // aws.String("...")
                                                            args[key] = value.replace(/^['"]?(.*?)['"]?$/g, '$1');
                                                        } else {
                                                            for (let variable of this.VariableDeclarations) { // aws.String(knownvar)
                                                                if (variable.variable == value) {
                                                                    if (variable.type == "literal") {
                                                                        args[key] = variable.value;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return args;
    }

    exitImportSpec(ctx) {
        let matchString = ctx.getText().match(/^['"]github\.com[\\\/]aws[\\\/]aws-sdk-go[\\\/]service[\\\/]([a-zA-Z0-9]+)['"]$/);

        if (matchString) {
            this.SDKDeclarations.push({
                'variable': matchString[1],
                'service': matchString[1]
            });
        }
	}

    exitShortVarDecl(ctx) {
        const assignable = ctx.children[0]; // ### = blah

        if (ctx.children[2].children && ctx.children[2].children.length == 1 && ctx.children[2].children[0] instanceof GoParser.ExpressionContext) {
            if (ctx.children[2].children[0].children && ctx.children[2].children[0].children.length == 1 && ctx.children[2].children[0].children[0] instanceof GoParser.PrimaryExprContext) {
                if (ctx.children[2].children[0].children[0].children && ctx.children[2].children[0].children[0].children.length == 2 && ctx.children[2].children[0].children[0].children[0] instanceof GoParser.PrimaryExprContext && ctx.children[2].children[0].children[0].children[1] instanceof GoParser.ArgumentsContext) {
                    if (ctx.children[2].children[0].children[0].children[0].children && ctx.children[2].children[0].children[0].children[0].children.length == 3 && ctx.children[2].children[0].children[0].children[0].children[1].getText() == "." && ctx.children[2].children[0].children[0].children[0].children[2].getText() == "New") { // x = ###y###.New(...)
                        let namespace = ctx.children[2].children[0].children[0].children[0].children[0];
                        for (let sdkDeclaration of [...this.SDKDeclarations].reverse()) { // reverse to ensure last defined comes first
                            if (namespace.getText() == sdkDeclaration['variable']) {
                                this.ClientDeclarations.push({
                                    'type': sdkDeclaration['service'],
                                    'variable': assignable.getText(),
                                    'argsRaw': ctx.children[2].children[0].children[0].children[1],
                                    'sdk': sdkDeclaration
                                });
                                break;
                            }
                        }
                    }
                } else if (ctx.children[2].children[0].children[0].getText().match(/^(['"].*['"])|([0-9.-]+)$/)) {
                    this.VariableDeclarations.push({
                        'variable': assignable.getText(),
                        'type': 'literal',
                        'value': ctx.children[2].children[0].children[0].getText().replace(/^['"]?(.*?)['"]?$/g, '$1')
                    });
                }
            }
        }
	}

    exitExpression(ctx) {
        if (ctx.children && ctx.children.length == 1 && ctx.children[0] instanceof GoParser.PrimaryExprContext) {
            if (ctx.children[0].children && ctx.children[0].children.length == 2 && ctx.children[0].children[0] instanceof GoParser.PrimaryExprContext && ctx.children[0].children[1] instanceof GoParser.ArgumentsContext) {
                let argsRaw = ctx.children[0].children[1];
                if (ctx.children[0].children[0].children && ctx.children[0].children[0].children.length == 3 && ctx.children[0].children[0].children[1].getText() == ".") {
                    let namespace = ctx.children[0].children[0].children[0];
                    let method = ctx.children[0].children[0].children[2];
                    
                    for (let clientDeclaration of [...this.ClientDeclarations].reverse()) { // reverse to ensure last defined comes first
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
                }
            }
        }
	}

}