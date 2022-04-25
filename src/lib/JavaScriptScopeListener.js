import JavaScriptParser from './JavaScriptParser.js';
import JavaScriptParserListener from './JavaScriptParserListener.js';
import EnvironmentVariable from '../EnvironmentVariable.js';

export default class JavaScriptScopeListener extends JavaScriptParserListener {

    constructor() {
        super();
        this.VariableDeclarations = [];
        this.EnvironmentVariables = [];
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
                                        'value': this.generateObjectLiteralMap(variable.propertyMap)
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
                        'propertyMap': this.generateObjectLiteralMap(expression)
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