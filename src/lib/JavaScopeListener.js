import JavaParser from './JavaParser.js';
import JavaParserListener from './JavaParserListener.js';

export default class JavaScopeListener extends JavaParserListener {

    constructor() {
        super();
        this.VariableDeclarations = [];
        this.EnvironmentVariables = [];
        this.FunctionDeclarations = [];
        this.FunctionCalls = [];
        this.currentScope = [];
    }

    enterClassDeclaration(ctx) {
        this.currentScope.push(ctx.children[1].getText());
    }

    exitClassDeclaration(ctx) {
        this.currentScope.pop();
    }

    enterMethodDeclaration(ctx) {
        this.currentScope.push(ctx.children[1].getText());
    }

    exitMethodDeclaration(ctx) {
        let name = this.currentScope.pop();

        let argsNamesRaw = null;
        let argNames = [];

        let paramlist = ctx.children[2];
        argsNamesRaw = paramlist.children[1];

        this.FunctionDeclarations.push({
            'name': name,
            'scope': [...this.currentScope],
            'raw': ctx,
            'argNames': argNames,
            'argNamesRaw': argsNamesRaw
        });
    }

    exitLocalVariableDeclaration(ctx) {
        if (ctx.children.length == 2 && ctx.children[0] instanceof JavaParser.TypeTypeContext && ctx.children[1] instanceof JavaParser.VariableDeclaratorsContext) {
            let typeTypeText = ctx.children[0].getText();
            if (!['String', 'boolean', 'char', 'byte', 'short', 'int', 'long', 'float', 'double'].includes(typeTypeText)) {
                typeTypeText = null;
            }
            for (let declerator of ctx.children[1].children) {
                if (declerator instanceof JavaParser.VariableDeclaratorContext) {
                    if (declerator.children.length == 3) {
                        let assignable = declerator.children[0];
                        if (declerator.children[2].children && declerator.children[2].children.length == 1 && declerator.children[2].children[0] instanceof JavaParser.ExpressionContext) {
                            if (declerator.children[2].getText().match(/^(['"].*['"])|([0-9\.]+)$/)) {
                                this.VariableDeclarations.push({
                                    'scope': [...this.currentScope],
                                    'type': 'literal',
                                    'variable': assignable.getText(),
                                    'value': declerator.children[2].getText().replace(/^['"]?(.*?)['"]?$/g, '$1'),
                                    'primitiveType': typeTypeText
                                });
                            }
                        }
                    }
                }
            }
        }
	}
}