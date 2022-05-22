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

    exitLocalVariableDeclaration(ctx) {
        if (ctx.children.length == 2 && ctx.children[0] instanceof JavaParser.TypeTypeContext && ctx.children[1] instanceof JavaParser.VariableDeclaratorsContext) {
            for (let declerator of ctx.children[1].children) {
                if (declerator instanceof JavaParser.VariableDeclaratorContext) {
                    if (declerator.children.length == 3) {
                        let assignable = declerator.children[0];
                        if (declerator.children[2].children && declerator.children[2].children.length == 1 && declerator.children[2].children[0] instanceof JavaParser.ExpressionContext) {
                            if (declerator.children[2].getText().match(/^(['"].*['"])|([0-9\.]+)$/)) {
                                this.VariableDeclarations.push({
                                    'type': 'literal',
                                    'variable': assignable.getText(),
                                    'value': declerator.children[2].getText().replace(/^['"]?(.*?)['"]?$/g, '$1')
                                });
                            }
                        }
                    }
                }
            }
        }
	}
}