import CPP14Parser from './CPP14Parser.js';
import CPP14ParserListener from './CPP14ParserListener.js';

export default class CPP14AWSListener extends CPP14ParserListener {

    constructor() {
        super();
        this.SDKDeclarations = [];
        this.ClientDeclarations = [];
        this.ClientCalls = [];
        this.VariableDeclarations = [];

        this.SDKDeclarations.push({
            'variable': 'Aws'
        });
    }

    exitSimpleDeclaration(ctx) {
        if (ctx.children.length == 3 && ctx.children[0] instanceof CPP14Parser.DeclSpecifierSeqContext && ctx.children[1] instanceof CPP14Parser.InitDeclaratorListContext && ctx.children[2].getText() == ";") {
            let matchString = ctx.children[0].getText().match(/^Aws::([a-zA-Z0-9]+)::(([a-zA-Z0-9]+)Client)$/);
            if (matchString) {
                for (let declerator of ctx.children[1].children) {
                    if (declerator instanceof CPP14Parser.InitDeclaratorContext && declerator.getText().match(/^[a-zA-Z0-9-_]+$/)) {
                        if (matchString[1].toLowerCase() == matchString[3].toLowerCase()) {
                            this.ClientDeclarations.push({
                                'type': matchString[1].toLowerCase(),
                                'variable': declerator.getText(),
                                'argsRaw': null,
                                'sdk': this.SDKDeclarations[0]
                            });
                        }
                    }
                }
            }
        }
    }

    exitPostfixExpression(ctx) {
        if (ctx.children.length == 4 && ctx.children[0] instanceof CPP14Parser.PostfixExpressionContext && ctx.children[1].getText() == "(" && ctx.children[3].getText() == ")") {
            let argsRaw = ctx.children[2];
            if (ctx.children[0].children.length == 3 && ctx.children[0].children[0] instanceof CPP14Parser.PostfixExpressionContext && ctx.children[0].children[0].children.length == 1 && ctx.children[0].children[0].children[0] instanceof CPP14Parser.PrimaryExpressionContext && ctx.children[0].children[0].children[0].children.length == 1 && ctx.children[0].children[0].children[0].children[0] instanceof CPP14Parser.IdExpressionContext && ctx.children[0].children[1].getText() == "." && ctx.children[0].children[2] instanceof CPP14Parser.IdExpressionContext) {
                let namespace = ctx.children[0].children[0];
                let method = ctx.children[0].children[2];
                for (let clientDeclaration of this.ClientDeclarations) {
                    if (namespace.getText() == clientDeclaration['variable']) {
                        this.ClientCalls.push({
                            'client': clientDeclaration,
                            'method': method.getText(),
                            'argsRaw': argsRaw,
                            'args': {},
                            'start': method.start.start,
                            'stop': method.stop.stop
                        });
                        break;
                    }
                }
            }
        }
    }

}