var __create = Object.create;
var __defProp = Object.defineProperty;
var __getOwnPropDesc = Object.getOwnPropertyDescriptor;
var __getOwnPropNames = Object.getOwnPropertyNames;
var __getProtoOf = Object.getPrototypeOf;
var __hasOwnProp = Object.prototype.hasOwnProperty;
var __markAsModule = (target) => __defProp(target, "__esModule", { value: true });
var __export = (target, all) => {
  for (var name in all)
    __defProp(target, name, { get: all[name], enumerable: true });
};
var __reExport = (target, module2, copyDefault, desc) => {
  if (module2 && typeof module2 === "object" || typeof module2 === "function") {
    for (let key of __getOwnPropNames(module2))
      if (!__hasOwnProp.call(target, key) && (copyDefault || key !== "default"))
        __defProp(target, key, { get: () => module2[key], enumerable: !(desc = __getOwnPropDesc(module2, key)) || desc.enumerable });
  }
  return target;
};
var __toESM = (module2, isNodeMode) => {
  return __reExport(__markAsModule(__defProp(module2 != null ? __create(__getProtoOf(module2)) : {}, "default", !isNodeMode && module2 && module2.__esModule ? { get: () => module2.default, enumerable: true } : { value: module2, enumerable: true })), module2);
};
var __toCommonJS = /* @__PURE__ */ ((cache) => {
  return (module2, temp) => {
    return cache && cache.get(module2) || (temp = __reExport(__markAsModule({}), module2, 1), cache && cache.set(module2, temp), temp);
  };
})(typeof WeakMap !== "undefined" ? /* @__PURE__ */ new WeakMap() : 0);
var JavaScriptParserVisitor_exports = {};
__export(JavaScriptParserVisitor_exports, {
  default: () => JavaScriptParserVisitor
});
var import_antlr4 = __toESM(require("antlr4"), 1);
class JavaScriptParserVisitor extends import_antlr4.default.tree.ParseTreeVisitor {
  visitProgram(ctx) {
    return this.visitChildren(ctx);
  }
  visitSourceElement(ctx) {
    return this.visitChildren(ctx);
  }
  visitStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitBlock(ctx) {
    return this.visitChildren(ctx);
  }
  visitStatementList(ctx) {
    return this.visitChildren(ctx);
  }
  visitImportStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitImportFromBlock(ctx) {
    return this.visitChildren(ctx);
  }
  visitModuleItems(ctx) {
    return this.visitChildren(ctx);
  }
  visitImportDefault(ctx) {
    return this.visitChildren(ctx);
  }
  visitImportNamespace(ctx) {
    return this.visitChildren(ctx);
  }
  visitImportFrom(ctx) {
    return this.visitChildren(ctx);
  }
  visitAliasName(ctx) {
    return this.visitChildren(ctx);
  }
  visitExportDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitExportDefaultDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitExportFromBlock(ctx) {
    return this.visitChildren(ctx);
  }
  visitDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitVariableStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitVariableDeclarationList(ctx) {
    return this.visitChildren(ctx);
  }
  visitVariableDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitEmptyStatement_(ctx) {
    return this.visitChildren(ctx);
  }
  visitExpressionStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitIfStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitDoStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitWhileStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitForStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitForInStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitForOfStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitVarModifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitContinueStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitBreakStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitReturnStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitYieldStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitWithStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitSwitchStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitCaseBlock(ctx) {
    return this.visitChildren(ctx);
  }
  visitCaseClauses(ctx) {
    return this.visitChildren(ctx);
  }
  visitCaseClause(ctx) {
    return this.visitChildren(ctx);
  }
  visitDefaultClause(ctx) {
    return this.visitChildren(ctx);
  }
  visitLabelledStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitThrowStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitTryStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitCatchProduction(ctx) {
    return this.visitChildren(ctx);
  }
  visitFinallyProduction(ctx) {
    return this.visitChildren(ctx);
  }
  visitDebuggerStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitFunctionDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassTail(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassElement(ctx) {
    return this.visitChildren(ctx);
  }
  visitMethodDefinition(ctx) {
    return this.visitChildren(ctx);
  }
  visitFormalParameterList(ctx) {
    return this.visitChildren(ctx);
  }
  visitFormalParameterArg(ctx) {
    return this.visitChildren(ctx);
  }
  visitLastFormalParameterArg(ctx) {
    return this.visitChildren(ctx);
  }
  visitFunctionBody(ctx) {
    return this.visitChildren(ctx);
  }
  visitSourceElements(ctx) {
    return this.visitChildren(ctx);
  }
  visitArrayLiteral(ctx) {
    return this.visitChildren(ctx);
  }
  visitElementList(ctx) {
    return this.visitChildren(ctx);
  }
  visitArrayElement(ctx) {
    return this.visitChildren(ctx);
  }
  visitPropertyExpressionAssignment(ctx) {
    return this.visitChildren(ctx);
  }
  visitComputedPropertyExpressionAssignment(ctx) {
    return this.visitChildren(ctx);
  }
  visitFunctionProperty(ctx) {
    return this.visitChildren(ctx);
  }
  visitPropertyGetter(ctx) {
    return this.visitChildren(ctx);
  }
  visitPropertySetter(ctx) {
    return this.visitChildren(ctx);
  }
  visitPropertyShorthand(ctx) {
    return this.visitChildren(ctx);
  }
  visitPropertyName(ctx) {
    return this.visitChildren(ctx);
  }
  visitArguments(ctx) {
    return this.visitChildren(ctx);
  }
  visitArgument(ctx) {
    return this.visitChildren(ctx);
  }
  visitExpressionSequence(ctx) {
    return this.visitChildren(ctx);
  }
  visitTemplateStringExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitTernaryExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitLogicalAndExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitPowerExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitPreIncrementExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitObjectLiteralExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitMetaExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitInExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitLogicalOrExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitNotExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitPreDecreaseExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitArgumentsExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitAwaitExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitThisExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitFunctionExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitUnaryMinusExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitAssignmentExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitPostDecreaseExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeofExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitInstanceofExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitUnaryPlusExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitDeleteExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitImportExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitEqualityExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitBitXOrExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitSuperExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitMultiplicativeExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitBitShiftExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitParenthesizedExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitAdditiveExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitRelationalExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitPostIncrementExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitYieldExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitBitNotExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitNewExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitLiteralExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitArrayLiteralExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitMemberDotExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitMemberIndexExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitIdentifierExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitBitAndExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitBitOrExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitAssignmentOperatorExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitVoidExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitCoalesceExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitAssignable(ctx) {
    return this.visitChildren(ctx);
  }
  visitObjectLiteral(ctx) {
    return this.visitChildren(ctx);
  }
  visitFunctionDecl(ctx) {
    return this.visitChildren(ctx);
  }
  visitAnonymousFunctionDecl(ctx) {
    return this.visitChildren(ctx);
  }
  visitArrowFunction(ctx) {
    return this.visitChildren(ctx);
  }
  visitArrowFunctionParameters(ctx) {
    return this.visitChildren(ctx);
  }
  visitArrowFunctionBody(ctx) {
    return this.visitChildren(ctx);
  }
  visitAssignmentOperator(ctx) {
    return this.visitChildren(ctx);
  }
  visitLiteral(ctx) {
    return this.visitChildren(ctx);
  }
  visitTemplateStringLiteral(ctx) {
    return this.visitChildren(ctx);
  }
  visitTemplateStringAtom(ctx) {
    return this.visitChildren(ctx);
  }
  visitNumericLiteral(ctx) {
    return this.visitChildren(ctx);
  }
  visitBigintLiteral(ctx) {
    return this.visitChildren(ctx);
  }
  visitGetter(ctx) {
    return this.visitChildren(ctx);
  }
  visitSetter(ctx) {
    return this.visitChildren(ctx);
  }
  visitIdentifierName(ctx) {
    return this.visitChildren(ctx);
  }
  visitIdentifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitReservedWord(ctx) {
    return this.visitChildren(ctx);
  }
  visitKeyword(ctx) {
    return this.visitChildren(ctx);
  }
  visitLet_(ctx) {
    return this.visitChildren(ctx);
  }
  visitEos(ctx) {
    return this.visitChildren(ctx);
  }
}
module.exports = __toCommonJS(JavaScriptParserVisitor_exports);
