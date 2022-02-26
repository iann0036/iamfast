import GoParser from './GoParser.js';
import GoParserListener from './GoParserListener.js';

export default class GoAWSListener extends GoParserListener {

    constructor() {
        super();
        this.SDKDeclarations = [];
        this.ClientDeclarations = [];
        this.ClientCalls = [];
        this.VariableDeclarations = [];
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
                        for (let sdkDeclaration of this.SDKDeclarations) {
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
                    
                    for (let clientDeclaration of this.ClientDeclarations) {
                        if (namespace.getText() == clientDeclaration['variable']) {
                            this.ClientCalls.push({
                                'client': clientDeclaration,
                                'method': method.getText(),
                                'argsRaw': argsRaw,
                                'args': null,
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