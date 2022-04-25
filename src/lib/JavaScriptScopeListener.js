import JavaScriptParser from './JavaScriptParser.js';
import JavaScriptParserListener from './JavaScriptParserListener.js';
import EnvironmentVariable from '../EnvironmentVariable.js';

export default class JavaScriptScopeListener extends JavaScriptParserListener {

    constructor() {
        super();
        this.VariableDeclarations = [];
        this.EnvironmentVariables = [];
        this.FunctionDeclarations = [];
        this.FunctionCalls = [];
        this.currentScope = [];
    }

    generateObjectLiteralMap(treeitem) {
        let propertyMap = {};

        if (treeitem && treeitem.children && treeitem.children[0] && treeitem.children[0].children) {
            for (let objectLiteralChild of treeitem.children[0].children) {
                if (objectLiteralChild instanceof JavaScriptParser.PropertyExpressionAssignmentContext) {
                    let propertyName = objectLiteralChild.children[0].getText().replace(/^['"](.*)['"]$/g, '$1'); // blah = {###'abc'###: 'def'}
                    if (objectLiteralChild.children[2] instanceof JavaScriptParser.LiteralExpressionContext) { // blah = {'abc': ###'def'###}
                        let propertyValue = objectLiteralChild.children[2].getText().replace(/^['"]?(.*?)['"]?$/g, '$1');
                        propertyMap[propertyName] = {
                            'type': 'literal',
                            'value': propertyValue
                        };
                    } else if (objectLiteralChild.children[2] instanceof JavaScriptParser.ObjectLiteralExpressionContext) { // blah = {'abc': ###{...}###}
                        propertyMap[propertyName] = {
                            'type': 'object',
                            'value': this.generateObjectLiteralMap(objectLiteralChild.children[2])
                        };
                    } else if (objectLiteralChild.children[2] instanceof JavaScriptParser.IdentifierExpressionContext) { // blah = {'abc': varxyz}
                        for (let variable of this.VariableDeclarations) {
                            if (variable.variable == objectLiteralChild.children[2].getText()) {
                                if (variable.type == "object") {
                                    propertyMap[propertyName] = {
                                        'type': 'object',
                                        'value': this.generateObjectLiteralMap(variable.value)
                                    };
                                } else if (variable.type == "envvar") {
                                    propertyMap[propertyName] = {
                                        'type': 'envvar',
                                        'value': variable.name
                                    };
                                }
                            }
                        }
                    }
                }
            }
        }

        return propertyMap;
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

    resolveNamedArgs(argsRaw) {
        let args = [];
        let index = 0;

        for (let argument of argsRaw.children) {
            if (argument instanceof JavaScriptParser.ArgumentContext) {
                let arg = {};
                let argType = null;
                
                if (argument.children.length == 1) { // blah(###abc###) 
                    if (argument.children[0] instanceof JavaScriptParser.IdentifierExpressionContext) {
                        let argumentsVariable = argument.children[0].getText();

                        for (let variable of this.VariableDeclarations) {
                            if (variable.variable == argumentsVariable) {
                                if (variable.type == "object") {
                                    arg = this.resolvePropertyMap(variable.value);
                                    argType = 'object';
                                }
                            }
                        }
                    } else if (argument.children[0] instanceof JavaScriptParser.ObjectLiteralExpressionContext) {
                        arg = this.generateObjectLiteralMap(argument.children[0]);
                        argType = 'object';
                    }
                }
                // TODO else blah(...###x###, )

                args.push({
                    index: index,
                    arg: arg,
                    type: argType
                });

                index += 1;
            }
        }

        return args;
    }

    enterAnonymousFunctionDecl(ctx) { // function ( ... ) { ... }
        this.currentScope.push("#ANONYMOUS-UNSUPPORTED#");
    }

    exitAnonymousFunctionDecl(ctx) {
        this.currentScope.pop();
    }

    enterArrowFunction(ctx) {
        for (let child of ctx.children) {
            if (child instanceof JavaScriptParser.ArrowFunctionParametersContext) {
                if (child.children[0] instanceof JavaScriptParser.IdentifierContext) { // abc => { ... }
                    this.currentScope.push(child.children[0].getText());
                    return;
                } else { // ( ... ) => { ... }
                    if (ctx.parentCtx && ctx.parentCtx.parentCtx && ctx.parentCtx.parentCtx instanceof JavaScriptParser.VariableDeclarationContext && ctx.parentCtx.parentCtx.children.length == 3) { // var x = ( ... ) => { ... }
                        if (ctx.parentCtx.parentCtx.children[0].children[0] instanceof JavaScriptParser.IdentifierContext) {
                            this.currentScope.push(ctx.parentCtx.parentCtx.children[0].children[0].getText());
                            return;
                        }
                    }
                }
                break;
            }
        }

        this.currentScope.push("#ARROW-FUNCTION-UNSUPPORTED#");
    }

    exitArrowFunction(ctx) {
        this.currentScope.pop();

        for (let child of ctx.children) {
            if (child instanceof JavaScriptParser.ArrowFunctionParametersContext) {
                if (child.children[0] instanceof JavaScriptParser.IdentifierContext) { // abc => { ... }
                    this.FunctionDeclarations.push({
                        'name': child.children[0].getText(),
                        'scope': [...this.currentScope],
                        'raw': ctx,
                        'argNames': [],
                        'argNamesRaw': null
                    });
                } else { // ( ... ) => { ... }
                    if (ctx.parentCtx && ctx.parentCtx.parentCtx && ctx.parentCtx.parentCtx instanceof JavaScriptParser.VariableDeclarationContext && ctx.parentCtx.parentCtx.children.length == 3) { // var x = ( ... ) => { ... }
                        if (ctx.parentCtx.parentCtx.children[0].children[0] instanceof JavaScriptParser.IdentifierContext) {
                            let argNames = [];
                            let argNamesRaw = null;

                            if (child.children.length == 3) { // (###...###) => { ... }
                                argNamesRaw = child.children[1];

                                let index = 0;

                                for (let argNameChild of child.children[1].children) {
                                    if (argNameChild instanceof JavaScriptParser.FormalParameterArgContext) {
                                        let argNameName = null;
                                        
                                        if (argNameChild.children[0].children[0] instanceof JavaScriptParser.IdentifierContext)  {
                                            argNameName = argNameChild.children[0].children[0].getText();
                                        }

                                        if (argNameChild.children.length == 3) { // x.y(y=###'default value'###)
                                            // TODO
                                        }

                                        argNames.push({
                                            'index': index,
                                            'argName': argNameName
                                        });

                                        index += 1;
                                    }
                                }
                            } else { // () => { ... }
                                ;
                            }

                            this.FunctionDeclarations.push({
                                'name': ctx.parentCtx.parentCtx.children[0].children[0].getText(),
                                'scope': [...this.currentScope],
                                'raw': ctx,
                                'argNames': argNames,
                                'argNamesRaw': argNamesRaw
                            });
                        }
                    }
                }
                break;
            }
        }
    }

    enterFunctionDeclaration(ctx) {
        for (let child of ctx.children) {
            if (child instanceof JavaScriptParser.IdentifierContext) {
                this.currentScope.push(child.getText());
                break;
            }
        }
    }

    exitFunctionDeclaration(ctx) {
        this.currentScope.pop();

        let name = null;
        let argsNamesRaw = null;
        let argNames = [];

        for (let child of ctx.children) {
            if (child instanceof JavaScriptParser.IdentifierContext) {
                name = child.getText();
            } else if (child instanceof JavaScriptParser.FormalParameterListContext) {
                argsNamesRaw = child;

                let index = 0;

                for (let argNameChild of child.children) {
                    if (argNameChild instanceof JavaScriptParser.FormalParameterArgContext) {
                        let argNameName = null;    
                        
                        if (argNameChild.children[0].children[0] instanceof JavaScriptParser.IdentifierContext)  {
                            argNameName = argNameChild.children[0].children[0].getText();
                        }

                        if (argNameChild.children.length == 3) { // x.y(y=###'default value'###)
                            // TODO
                        }

                        argNames.push({
                            'index': index,
                            'argName': argNameName
                        });

                        index += 1;
                    }
                }
            }
        }

        this.FunctionDeclarations.push({
            'name': name,
            'scope': [...this.currentScope],
            'raw': ctx,
            'argNames': argNames,
            'argNamesRaw': argsNamesRaw
        });
    }

    exitArgumentsExpression(ctx) {
        if (ctx.children[0] instanceof JavaScriptParser.IdentifierExpressionContext) {
            let name = ctx.children[0].getText();

            if (this.currentScope.length == 0 && [ // https://nodejs.org/api/globals.html
                'require',
                'atob',
                'btoa',
                'clearImmediate',
                'clearInterval',
                'clearTimeout',
                'setImmediate',
                'setInterval',
                'setTimeout',
                'structuredClone',
                'queueMicrotask'
            ].includes(name)) {
                return;
            }

            this.FunctionCalls.push({
                'name': name,
                'scope': [...this.currentScope],
                'raw': ctx,
                'args': this.resolveNamedArgs(ctx.children[1]),
                'argsRaw': ctx.children[1]
            });
        }
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

                if (expression instanceof JavaScriptParser.ObjectLiteralExpressionContext) { // blah = ###{...}###
                    this.VariableDeclarations.push({
                        'scope': [...this.currentScope],
                        'variable': assignable.getText(),
                        'type': 'object',
                        'value': this.generateObjectLiteralMap(expression)
                    });
                } else if (expression instanceof JavaScriptParser.MemberDotExpressionContext) { // blah = ###.###...
                    if (expression.children.length == 3) {
                        if (expression.children[0].getText() == "process.env" && expression.children[1].getText() == "." && expression.children[2] instanceof JavaScriptParser.IdentifierNameContext) {
                            this.VariableDeclarations.push({
                                'scope': [...this.currentScope],
                                'variable': assignable.getText(),
                                'type': 'envvar',
                                'name': expression.children[2].getText()
                            });
                            this.EnvironmentVariables.push(expression.children[2].getText());
                        }
                    }
                } else if (expression instanceof JavaScriptParser.LiteralExpressionContext) { // blah = ###'abc'### / ###123###
                    this.VariableDeclarations.push({
                        'scope': [...this.currentScope],
                        'variable': assignable.getText(),
                        'type': 'literal',
                        'value': expression.getText().replace(/^['"]?(.*?)['"]?$/g, '$1')
                    });
                } else if (expression instanceof JavaScriptParser.ArrayLiteralExpressionContext) { // blah = ###['abc']###
                    let values = [];

                    if (expression.children[0].children[1].children) {
                        for (var arrayitem of expression.children[0].children[1].children) {
                            if (arrayitem instanceof JavaScriptParser.ArrayElementContext) {
                                values.push({
                                    'rawValue': arrayitem
                                });
                            }
                        }
                    }

                    this.VariableDeclarations.push({
                        'scope': [...this.currentScope],
                        'variable': assignable.getText(),
                        'type': 'array',
                        'values': values
                    });
                }
            }
        }
    }
}