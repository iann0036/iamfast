import JavaParser from './JavaParser.js';
import JavaParserListener from './JavaParserListener.js';

export default class JavaAWSListener extends JavaParserListener {

    constructor(variableDeclarations, functionDeclarations, functionCalls) {
        super();
        this.SDKDeclarations = [];
        this.ClientDeclarations = [];
        this.ClientCalls = [];
        this.VariableDeclarations = variableDeclarations;
        this.FunctionDeclarations = functionDeclarations;
        this.FunctionCalls = functionCalls;
        this.currentScope = [];
    }

    exitImportDeclaration(ctx) {
        let importString = ctx.children[1].getText();
        let matchString = importString.match(/^software\.amazon\.awssdk\.services\.([a-zA-Z0-9]+)\.(([a-zA-Z0-9]+)Client)$/);

        if (matchString) {
            if (matchString[1].toLowerCase() == matchString[3].toLowerCase()) {
                this.SDKDeclarations.push({
                    'variable': matchString[2],
                    'service': matchString[1].toLowerCase()
                });
            }
        }

        matchString = importString.match(/^software\.amazon\.awssdk\.services\.([a-zA-Z0-9]+)\.model\.((?:[a-zA-Z0-9]+)Request)$/);

        if (matchString) {
            this.VariableDeclarations.push({
                'variable': matchString[2],
                'service': matchString[1],
                'type': 'requestmodel'
            });
        }
	}

    exitLocalVariableDeclaration(ctx) {
        if (ctx.children.length == 2 && ctx.children[0] instanceof JavaParser.TypeTypeContext && ctx.children[1] instanceof JavaParser.VariableDeclaratorsContext) {
            for (let declerator of ctx.children[1].children) {
                if (declerator instanceof JavaParser.VariableDeclaratorContext) {
                    if (declerator.children.length == 3) {
                        let assignable = declerator.children[0];
                        if (declerator.children[2].children && declerator.children[2].children.length == 1 && declerator.children[2].children[0] instanceof JavaParser.ExpressionContext) {
                            if (declerator.children[2].children[0].children && declerator.children[2].children[0].children.length == 3 && declerator.children[2].children[0].children[0] instanceof JavaParser.ExpressionContext && declerator.children[2].children[0].children[1].getText() == "." && declerator.children[2].children[0].children[2].getText() == "build()") { // x = ###y###.build()
                                let buildexpression = declerator.children[2].children[0].children[0];
                                for (let sdkDeclaration of this.SDKDeclarations) {
                                    if (buildexpression.getText().startsWith(sdkDeclaration['variable'] + ".builder()")) {
                                        this.ClientDeclarations.push({
                                            'type': sdkDeclaration['service'],
                                            'variable': assignable.getText(),
                                            'argsRaw': buildexpression,
                                            'sdk': sdkDeclaration
                                        });
                                        break;
                                    }
                                }
                                // request builder here
                            }
                        }
                    }
                }
            }
        }
	}

    exitExpression(ctx) {
        if (ctx.children && ctx.children.length == 3 && ctx.children[0] instanceof JavaParser.ExpressionContext && ctx.children[1].getText() == "." && ctx.children[2] instanceof JavaParser.MethodCallContext) {
            let namespace = ctx.children[0];
            if (ctx.children[2].children.length == 4 && ctx.children[2].children[1].getText() == "(") {
                let method = ctx.children[2].children[0];
                let argsRaw = ctx.children[2].children[2];
                
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