import Python3Parser from './Python3Parser.js';
import Python3ParserListener from './Python3ParserListener.js';

export default class Python3AWSListener extends Python3ParserListener {

    constructor() {
        super();
        this.SDKDeclarations = [];
        this.ClientDeclarations = [];
        this.ResourceDeclarations = [];
        this.ClientCalls = [];
        this.ResourceCalls = [];
        this.VariableDeclarations = [];
    }

    resolveArgs(argsRaw) {
        let args = {};

        if (argsRaw.children.length == 3 && argsRaw.children[0].getText() == "(" && argsRaw.children[1] instanceof Python3Parser.ArglistContext && argsRaw.children[2].getText() == ")") {
            for (let arg of argsRaw.children[1].children) {
                if (arg instanceof Python3Parser.ArgumentContext) {
                    if (arg.children.length == 3 && arg.children[1].getText() == "=") {
                        let variables = this.drillToAtomExprs(arg.children[0]);
                        let values = this.drillToAtomExprs(arg.children[2]);
                        for (let variable of variables) {
                            for (let value of values) {
                                args[variable.getText()] = value.getText().replace(/^['"](.*)['"]$/g, '$1');
                            }
                        }
                    }
                }
            }
        }

        return args;
    }

    drillToAtomExprs(treeitem) {
        let items = [];

        if (treeitem.children) {
            treeitem.children.forEach(child => {
                if (child instanceof Python3Parser.Atom_exprContext) {
                    items.push(child);
                } else {
                    items = items.concat(this.drillToAtomExprs(child));
                }
            });
        }

        return items;
    }

    exitImport_name(ctx) {
        if (ctx.children[1].getText() == "boto3") {
            if (ctx.children[1].children[0].children.length == 3) {
                this.SDKDeclarations.push({
                    'variable': ctx.children[1].children[0].children[2].getText()
                });
            } else {
                this.SDKDeclarations.push({
                    'variable': 'boto3'
                });
            }
        }
	}

    exitExpr_stmt(ctx) {
        if (ctx.children.length == 3 && ctx.children[0] instanceof Python3Parser.Testlist_star_exprContext && ctx.children[1].getText() == "=" && ctx.children[2] instanceof Python3Parser.Testlist_star_exprContext) { // w = x
            let atomExprLhs = this.drillToAtomExprs(ctx.children[0]);
            let atomExprRhs = this.drillToAtomExprs(ctx.children[2]);

            for (let assignable of atomExprLhs) {
                for (let rhs of atomExprRhs) {
                    if (rhs.children.length == 3 && rhs.children[0] instanceof Python3Parser.AtomContext && rhs.children[1] instanceof Python3Parser.TrailerContext && rhs.children[2] instanceof Python3Parser.TrailerContext && rhs.children[2].getText().startsWith("(") && rhs.children[2].getText().endsWith(")")) { // x.y(z)
                        let namespace = rhs.children[0];
                        if (rhs.children[1].children.length == 2 && rhs.children[1].children[0].getText() == ".") {
                            let method = rhs.children[1].children[1];
                            let argsRaw = rhs.children[2];

                            for (let sdkDeclaration of this.SDKDeclarations) {
                                if (namespace.getText() == sdkDeclaration['variable'] && method.getText() == 'client') { // boto3.client('servicename', ...)
                                    if (argsRaw.children.length == 3 && argsRaw.children[1] instanceof Python3Parser.ArglistContext && argsRaw.children[1].children && argsRaw.children[1].children[0].children) {
                                        let arg1 = this.drillToAtomExprs(argsRaw.children[1].children[0])[0];
                                        let arg1filtered = arg1.getText().replace(/^['"](.*)['"]$/g, '$1');

                                        this.ClientDeclarations.push({
                                            'type': arg1filtered,
                                            'variable': assignable.getText(),
                                            'argsRaw': argsRaw,
                                            'sdk': sdkDeclaration
                                        });
                                        break;
                                    }
                                } else if (namespace.getText() == sdkDeclaration['variable'] && method.getText() == 'resource') { // boto3.resource('servicename', ...)
                                    if (argsRaw.children.length == 3 && argsRaw.children[1] instanceof Python3Parser.ArglistContext && argsRaw.children[1].children && argsRaw.children[1].children[0].children) {
                                        let arg1 = this.drillToAtomExprs(argsRaw.children[1].children[0])[0];
                                        let arg1filtered = arg1.getText().replace(/^['"](.*)['"]$/g, '$1');

                                        this.ResourceDeclarations.push({
                                            'type': arg1filtered,
                                            'variable': assignable.getText(),
                                            'argsRaw': argsRaw,
                                            'sdk': sdkDeclaration
                                        });
                                        break;
                                    }
                                }
                            }

                            for (let clientDeclaration of this.ClientDeclarations) {
                                if (namespace.getText() == clientDeclaration['variable']) {
                                    this.ClientCalls.push({
                                        'client': clientDeclaration,
                                        'method': method.getText(),
                                        'argsRaw': argsRaw,
                                        'args': this.resolveArgs(argsRaw),
                                        'variable': assignable.getText(),
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
        } else if (ctx.children.length == 1 && ctx.children[0] instanceof Python3Parser.Testlist_star_exprContext) {
            let atomExpr = this.drillToAtomExprs(ctx.children[0]);

            for (let rhs of atomExpr) {
                if (rhs.children.length == 3 && rhs.children[0] instanceof Python3Parser.AtomContext && rhs.children[1] instanceof Python3Parser.TrailerContext && rhs.children[2] instanceof Python3Parser.TrailerContext && rhs.children[2].getText().startsWith("(") && rhs.children[2].getText().endsWith(")")) { // x.y(z)
                    let namespace = rhs.children[0];
                    if (rhs.children[1].children.length == 2 && rhs.children[1].children[0].getText() == ".") {
                        let method = rhs.children[1].children[1];
                        let argsRaw = rhs.children[2];

                        for (let sdkDeclaration of this.SDKDeclarations) {
                            if (namespace.getText() == sdkDeclaration['variable'] && method.getText() == 'client') { // boto3.client('servicename', ...)
                                if (argsRaw.children.length == 3 && argsRaw.children[1] instanceof Python3Parser.ArglistContext && argsRaw.children[1].children && argsRaw.children[1].children[0].children) {
                                    let arg1 = this.drillToAtomExprs(argsRaw.children[1].children[0])[0];
                                    let arg1filtered = arg1.getText().replace(/^['"](.*)['"]$/g, '$1');

                                    this.ClientDeclarations.push({
                                        'type': arg1filtered,
                                        'variable': assignable.getText(),
                                        'argsRaw': argsRaw,
                                        'sdk': sdkDeclaration
                                    });
                                    break;
                                }
                            }
                        }

                        for (let clientDeclaration of this.ClientDeclarations) {
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
}