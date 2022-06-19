import Python3Parser from './Python3Parser.js';
import Python3ParserListener from './Python3ParserListener.js';
import EnvironmentVariable from '../EnvironmentVariable.js';

export default class Python3ScopeListener extends Python3ParserListener {

    constructor() {
        super();
        this.VariableDeclarations = [];
        this.EnvironmentVariables = [];
        this.FunctionDeclarations = [];
        this.FunctionCalls = [];
        this.currentScope = [];
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

    exitAtom_expr(ctx) {
        let funcName = '';
        let offset = 0;

        if (ctx.children[offset].getText() == "await") {
            offset += 1;
        }

        if (!ctx.children[offset] instanceof Python3Parser.AtomContext || ctx.children[offset].children.length != 1) { // skip if not terminal atom
            return;
        }
        funcName = ctx.children[offset].getText();
        offset += 1;

        if (ctx.children.length > offset && ctx.children[offset].children.length == 3) { // at least one trailer exists
            if (ctx.children[offset].children[1] instanceof Python3Parser.ArglistContext) {
                this.FunctionCalls.push({
                    'name': funcName,
                    'scope': [...this.currentScope],
                    'raw': ctx.children[offset],
                    'args': null, // TODO: deprecate
                    'argsRaw': ctx.children[offset].children[1]
                });
            }
        }
    }

    enterFuncdef(ctx) {
        this.currentScope.push(ctx.children[1].getText());
    }

    exitFuncdef(ctx) {
        let name = this.currentScope.pop();

        let argsNamesRaw = null;
        let argNames = [];

        let index = 0;

        let paramlist = ctx.children[2];
        if (paramlist.children.length == 3) { // else no params
            argsNamesRaw = paramlist.children[1];
            let argOffset = 0;
            while (argOffset < argsNamesRaw.children.length) {
                if (argsNamesRaw.children[argOffset] instanceof Python3Parser.TfpdefContext) {
                    let argNameName = argsNamesRaw.children[argOffset].children[0].getText();

                    argNames.push({
                        'index': index,
                        'argName': argNameName
                    });
                    index += 1;
                }
                argOffset += 1;
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

    exitExpr_stmt(ctx) {
        if (ctx.children.length == 3 && ctx.children[0] instanceof Python3Parser.Testlist_star_exprContext && ctx.children[1].getText() == "=" && ctx.children[2] instanceof Python3Parser.Testlist_star_exprContext) { // w = x
            let atomExprLhs = this.drillToAtomExprs(ctx.children[0]);
            let atomExprRhs = this.drillToAtomExprs(ctx.children[2]);

            for (let assignable of atomExprLhs) {
                if (assignable.children[0] instanceof Python3Parser.AtomContext && assignable.children[0].children.length == 1) {
                    for (let rhs of atomExprRhs) {
                        if (rhs.children.length == 1) {
                            let rhsText = rhs.getText();

                            if (rhsText == "None") {
                                this.VariableDeclarations.push({
                                    'scope': [...this.currentScope],
                                    'variable': assignable.getText(),
                                    'type': 'literal',
                                    'value': null
                                });
                            } else if (rhsText == "True") {
                                this.VariableDeclarations.push({
                                    'scope': [...this.currentScope],
                                    'variable': assignable.getText(),
                                    'type': 'literal',
                                    'value': true
                                });
                            } else if (rhsText == "False") {
                                this.VariableDeclarations.push({
                                    'scope': [...this.currentScope],
                                    'variable': assignable.getText(),
                                    'type': 'literal',
                                    'value': false
                                });
                            } else if (rhsText == "...") {
                                // unknown
                            } else if (rhsText.startsWith("{") && rhsText.endsWith("{")) {
                                // TODO: object
                            } else if (rhsText.startsWith("[") && rhsText.endsWith("]")) {
                                // TODO: array
                            } else if (rhsText.startsWith("(") && rhsText.endsWith(")")) {
                                // expr
                            } else if (!isNaN(rhsText)) {
                                this.VariableDeclarations.push({
                                    'scope': [...this.currentScope],
                                    'variable': assignable.getText(),
                                    'type': 'literal',
                                    'value': Number(rhsText)
                                });
                            } else if ((rhsText.startsWith("\"") || rhsText.startsWith("'")) && (rhsText.endsWith("\"") || rhsText.endsWith("'"))) {
                                this.VariableDeclarations.push({
                                    'scope': [...this.currentScope],
                                    'variable': assignable.getText(),
                                    'type': 'literal',
                                    'value': rhsText.replace(/^['"]?(.*?)['"]?$/g, '$1')
                                });
                            } else {
                                this.VariableDeclarations.push({
                                    'scope': [...this.currentScope],
                                    'variable': assignable.getText(),
                                    'type': 'variable',
                                    'value': rhsText
                                });
                            }
                        }
                    }
                }
            }
        }
	}
}
