import JavaScriptParser from './JavaScriptParser.js';
import JavaScriptParserListener from './JavaScriptParserListener.js';
import EnvironmentVariable from '../EnvironmentVariable.js';

function scalarArraysAreEqual(array1, array2) {
    return array1.length === array2.length && array1.every(function(value, index) { return value === array2[index]});
}

export default class JavaScriptAWSListener extends JavaScriptParserListener {

    constructor(variableDeclarations, functionDeclarations, functionCalls) {
        super();
        this.SDKDeclarations = [];
        this.ClientDeclarations = []; // TODO: deprecate for VariableDeclarations
        this.ResourceDeclarations = []; // TODO: deprecate for VariableDeclarations
        this.ClientCalls = [];
        this.ResourceObjects = [];
        this.ResourceCalls = [];
        this.VariableDeclarations = variableDeclarations;
        this.FunctionDeclarations = functionDeclarations;
        this.FunctionCalls = functionCalls;
        this.currentScope = [];
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
                                // TODO: Support more types (both listeners)
                            }
                        }
                    }
                }
            }
        }

        return propertyMap;
    }

    resolveArgsVariants(argsRaw) { // AWS call args (variants)
        let argVariants = [];

        for (let variablesVariant of this.getVariableDeclarationVariants()) {
            let args = {};

            for (let argument of argsRaw.children) {
                if (argument instanceof JavaScriptParser.ArgumentContext) {
                    if (argument.children.length == 1) { // blah(###abc###) 
                        if (argument.children[0] instanceof JavaScriptParser.IdentifierExpressionContext) {
                            let argumentsVariable = argument.children[0].getText();

                            for (let variable of Object.values(variablesVariant)) {
                                if (variable.variable == argumentsVariable) {
                                    if (variable.type == "object") {
                                        args = this.resolvePropertyMap(variable.value);
                                    }
                                }
                            }
                        }
                    }
                    // TODO: else blah(...###x###, )
                }
            }

            argVariants.push(args);
        }

        return argVariants;
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
                                arg = variable.value;
                                argType = variable.type;
                            }
                        }
                    } else if (argument.children[0] instanceof JavaScriptParser.ObjectLiteralExpressionContext) {
                        arg = this.generateObjectLiteralMap(argument.children[0]);
                        argType = 'object';
                    }
                } else {
                    ; // TODO: blah(, ###...x###)
                }

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

    enterAnonymousFunctionDecl(ctx) {
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
                        }
                        return;
                    }
                }
                break;
            }
        }

        this.currentScope.push("#ARROW-FUNCTION-UNSUPPORTED#");
    }

    exitArrowFunction(ctx) {
        this.currentScope.pop();
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

    getSDKDeclarations() {
        return this.SDKDeclarations;
    }

    getVariableDeclarationVariants() {
        /*
            Order of priority:
            1. Global vars
            2. Global vars that are redeclared / set after (implicitly by list order)
            3. Vars with increasingly matching scope (i.e. deepest to shallowest function depth), except current depth
            4. Arguments
            5. Vars with exactly matching scope (current depth)

            At priority #4 and beyond, variants (different paths based on many function calls with different args) are generated
        */

       let args = {};
       let argsVariants = [];

        // priority #1 to #3 (parent-defined)
        for (let i=0; i<this.currentScope.length; i++) {
            for (let variableDeclaration of this.VariableDeclarations) {
                if (scalarArraysAreEqual(variableDeclaration.scope, this.currentScope.slice(0, i))) {
                    args[variableDeclaration.variable] = variableDeclaration;
                }
            }
        }

        // priority #4 (args)
        for (let functionDeclaration of this.FunctionDeclarations) {
            if (scalarArraysAreEqual(functionDeclaration.scope.concat([functionDeclaration.name]), this.currentScope)) { // scope check
                for (let argName of functionDeclaration.argNames) {
                    for (let functionCall of this.FunctionCalls) {
                        if (functionCall.name == functionDeclaration.name) { // TODO: Scope check also
                            let argsVariant = Object.assign({}, args); // shallow copy

                            let resolvedCallArgs = this.resolveNamedArgs(functionCall.argsRaw);
                            
                            for (let arg of resolvedCallArgs) {
                                if (arg.index === argName.index) {
                                    argsVariant[argName.argName] = {
                                        scope: [...this.currentScope],
                                        variable: argName.argName,
                                        type: arg.type,
                                        value: arg.arg
                                    };
                                }
                            }

                            argsVariants.push(argsVariant);
                        }
                    }
                }
            }
        }

        if (argsVariants.length == 0) {
            argsVariants = [args];
        }

        // priority #5 (within function)
        for (let variableDeclaration of this.VariableDeclarations) {
            if (scalarArraysAreEqual(variableDeclaration.scope, this.currentScope)) {
                args[variableDeclaration.variable] = variableDeclaration;

                for (let i=0; i<argsVariants.length; i++) {
                    argsVariants[i][variableDeclaration.variable] = variableDeclaration;
                }
            }
        }

        // TODO: dedup variants

        return argsVariants;
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
                        this.VariableDeclarations.push({
                            'scope': [...this.currentScope],
                            'variable': assignable.getText(),
                            'type': 'sdkdeclaration',
                            'value': this.SDKDeclarations[this.SDKDeclarations.length - 1]
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

                            for (let sdkDeclaration of this.getSDKDeclarations()) {
                                if (namespace.getText() == sdkDeclaration['variable']) {
                                    this.ClientDeclarations.push({
                                        'type': method.getText(),
                                        'variable': (anonymousDeclaration ? null : assignable.getText()),
                                        'argsRaw': argsRaw,
                                        'sdk': sdkDeclaration
                                    });
                                    this.VariableDeclarations.push({
                                        'scope': [...this.currentScope],
                                        'variable': (anonymousDeclaration ? null : assignable.getText()),
                                        'type': 'clientdeclaration',
                                        'value': this.ClientDeclarations[this.ClientDeclarations.length - 1]
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
                                this.VariableDeclarations.push({
                                    'scope': [...this.currentScope],
                                    'variable': (anonymousDeclaration ? null : assignable.getText()),
                                    'type': 'clientdeclaration',
                                    'value': this.ClientDeclarations[this.ClientDeclarations.length - 1]
                                });
                            }
                            if (anonymousDeclaration && prevMethod.getText()) { // new AWS.Service().methodName(args)
                                let argsVariants = this.resolveArgsVariants(argsRawPrev);

                                for (let argsVariant of argsVariants) {
                                    this.ClientCalls.push({
                                        'client': this.ClientDeclarations[this.ClientDeclarations.length - 1],
                                        'method': prevMethod.getText(),
                                        'argsRaw': argsRawPrev,
                                        'args': argsVariant,
                                        'start': prevMethod.start.start,
                                        'stop': prevMethod.stop.stop
                                    });
                                }
                            }
                            break;
                        } else if (className.children[0] instanceof JavaScriptParser.MemberDotExpressionContext) { // blah.blah.blah
                            const namespace = className.children[0]; // ###.blah.blah
                            const method = className.children[className.children.length - 1]; // blah.###.blah ??
                            let foundDeclaration = false;

                            if (namespace.getText().match(/^[^\.]+\.[^\.]+$/)) {
                                let parentNamespace = namespace.getText().split(".")[0];
                                let childNamespace = namespace.getText().split(".")[1];

                                for (let sdkDeclaration of this.getSDKDeclarations()) {
                                    if (parentNamespace == sdkDeclaration['variable']) {
                                        this.ResourceDeclarations.push({
                                            'type': method.getText(),
                                            'parentType': childNamespace,
                                            'variable': (anonymousDeclaration ? null : assignable.getText()),
                                            'argsRaw': argsRaw,
                                            'sdk': sdkDeclaration
                                        });
                                        this.VariableDeclarations.push({
                                            'scope': [...this.currentScope],
                                            'variable': (anonymousDeclaration ? null : assignable.getText()),
                                            'type': 'resourcedeclaration',
                                            'value': this.ResourceDeclarations[this.ResourceDeclarations.length - 1]
                                        });
                                        foundDeclaration = true;
                                        break;
                                    }
                                }
                                if (anonymousDeclaration && prevMethod.getText()) { // new AWS.Service().methodName(args)
                                    let argsVariants = this.resolveArgsVariants(argsRawPrev);

                                    for (let argsVariant of argsVariants) {
                                        this.ResourceCalls.push({
                                            'resource': this.ResourceDeclarations[this.ResourceDeclarations.length - 1],
                                            'method': prevMethod.getText(),
                                            'argsRaw': argsRawPrev,
                                            'args': argsVariant,
                                            'start': prevMethod.start.start,
                                            'stop': prevMethod.stop.stop
                                        });
                                    }
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
            const namespaceText = namespace.getText();

            if ([
                'console',
                'JSON',
                'Array'
            ].includes(namespaceText)) {
                return;
            }

            if (namespace instanceof JavaScriptParser.IdentifierExpressionContext) {
                for (let variablesVariant of this.getVariableDeclarationVariants()) {
                    for (let variable of Object.values(variablesVariant)) {
                        if (variable.variable == namespaceText) {
                            if (variable.type == 'clientdeclaration') {
                                let argsVariants = this.resolveArgsVariants(argsRaw);

                                for (let argsVariant of argsVariants) {
                                    this.ClientCalls.push({
                                        'client': variable.value,
                                        'method': method.getText(),
                                        'argsRaw': argsRaw,
                                        'args': argsVariant,
                                        'start': method.start.start,
                                        'stop': method.stop.stop
                                    });
                                }
                                break;
                            } else if (variable.type == 'resourcedeclaration') {
                                let argsVariants = this.resolveArgsVariants(argsRaw);

                                for (let argsVariant of argsVariants) {
                                    this.ResourceCalls.push({
                                        'resource': variable.value,
                                        'method': method.getText(),
                                        'argsRaw': argsRaw,
                                        'args': argsVariant,
                                        'start': method.start.start,
                                        'stop': method.stop.stop
                                    });
                                }
                                break;
                            }
                        }
                    }
                }

                /*
                for (let clientDeclaration of this.ClientDeclarations) {
                    if (namespace.getText() == clientDeclaration['variable']) {
                        let argsVariants = this.resolveArgsVariants(argsRaw);

                        for (let argsVariant of argsVariants) {
                            this.ClientCalls.push({
                                'client': clientDeclaration,
                                'method': method.getText(),
                                'argsRaw': argsRaw,
                                'args': argsVariant,
                                'start': method.start.start,
                                'stop': method.stop.stop
                            });
                        }
                        break;
                    }
                }

                for (let resourceDeclaration of this.ResourceDeclarations) {
                    if (namespace.getText() == resourceDeclaration['variable']) {
                        let argsVariants = this.resolveArgsVariants(argsRaw);

                        for (let argsVariant of argsVariants) {
                            this.ResourceCalls.push({
                                'resource': resourceDeclaration,
                                'method': method.getText(),
                                'argsRaw': argsRaw,
                                'args': argsVariant,
                                'start': method.start.start,
                                'stop': method.stop.stop
                            });
                        }
                        break;
                    }
                }
                */
            }
        }
	}
}