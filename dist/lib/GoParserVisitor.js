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
var GoParserVisitor_exports = {};
__export(GoParserVisitor_exports, {
  default: () => GoParserVisitor
});
var import_antlr4 = __toESM(require("antlr4"), 1);
class GoParserVisitor extends import_antlr4.default.tree.ParseTreeVisitor {
  visitSourceFile(ctx) {
    return this.visitChildren(ctx);
  }
  visitPackageClause(ctx) {
    return this.visitChildren(ctx);
  }
  visitImportDecl(ctx) {
    return this.visitChildren(ctx);
  }
  visitImportSpec(ctx) {
    return this.visitChildren(ctx);
  }
  visitImportPath(ctx) {
    return this.visitChildren(ctx);
  }
  visitDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitConstDecl(ctx) {
    return this.visitChildren(ctx);
  }
  visitConstSpec(ctx) {
    return this.visitChildren(ctx);
  }
  visitIdentifierList(ctx) {
    return this.visitChildren(ctx);
  }
  visitExpressionList(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeDecl(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeSpec(ctx) {
    return this.visitChildren(ctx);
  }
  visitFunctionDecl(ctx) {
    return this.visitChildren(ctx);
  }
  visitMethodDecl(ctx) {
    return this.visitChildren(ctx);
  }
  visitReceiver(ctx) {
    return this.visitChildren(ctx);
  }
  visitVarDecl(ctx) {
    return this.visitChildren(ctx);
  }
  visitVarSpec(ctx) {
    return this.visitChildren(ctx);
  }
  visitBlock(ctx) {
    return this.visitChildren(ctx);
  }
  visitStatementList(ctx) {
    return this.visitChildren(ctx);
  }
  visitStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitSimpleStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitExpressionStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitSendStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitIncDecStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitAssignment(ctx) {
    return this.visitChildren(ctx);
  }
  visitAssign_op(ctx) {
    return this.visitChildren(ctx);
  }
  visitShortVarDecl(ctx) {
    return this.visitChildren(ctx);
  }
  visitEmptyStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitLabeledStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitReturnStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitBreakStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitContinueStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitGotoStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitFallthroughStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitDeferStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitIfStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitSwitchStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitExprSwitchStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitExprCaseClause(ctx) {
    return this.visitChildren(ctx);
  }
  visitExprSwitchCase(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeSwitchStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeSwitchGuard(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeCaseClause(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeSwitchCase(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeList(ctx) {
    return this.visitChildren(ctx);
  }
  visitSelectStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitCommClause(ctx) {
    return this.visitChildren(ctx);
  }
  visitCommCase(ctx) {
    return this.visitChildren(ctx);
  }
  visitRecvStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitForStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitForClause(ctx) {
    return this.visitChildren(ctx);
  }
  visitRangeClause(ctx) {
    return this.visitChildren(ctx);
  }
  visitGoStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitType_(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeName(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeLit(ctx) {
    return this.visitChildren(ctx);
  }
  visitArrayType(ctx) {
    return this.visitChildren(ctx);
  }
  visitArrayLength(ctx) {
    return this.visitChildren(ctx);
  }
  visitElementType(ctx) {
    return this.visitChildren(ctx);
  }
  visitPointerType(ctx) {
    return this.visitChildren(ctx);
  }
  visitInterfaceType(ctx) {
    return this.visitChildren(ctx);
  }
  visitSliceType(ctx) {
    return this.visitChildren(ctx);
  }
  visitMapType(ctx) {
    return this.visitChildren(ctx);
  }
  visitChannelType(ctx) {
    return this.visitChildren(ctx);
  }
  visitMethodSpec(ctx) {
    return this.visitChildren(ctx);
  }
  visitFunctionType(ctx) {
    return this.visitChildren(ctx);
  }
  visitSignature(ctx) {
    return this.visitChildren(ctx);
  }
  visitResult(ctx) {
    return this.visitChildren(ctx);
  }
  visitParameters(ctx) {
    return this.visitChildren(ctx);
  }
  visitParameterDecl(ctx) {
    return this.visitChildren(ctx);
  }
  visitExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitPrimaryExpr(ctx) {
    return this.visitChildren(ctx);
  }
  visitConversion(ctx) {
    return this.visitChildren(ctx);
  }
  visitNonNamedType(ctx) {
    return this.visitChildren(ctx);
  }
  visitOperand(ctx) {
    return this.visitChildren(ctx);
  }
  visitLiteral(ctx) {
    return this.visitChildren(ctx);
  }
  visitBasicLit(ctx) {
    return this.visitChildren(ctx);
  }
  visitInteger(ctx) {
    return this.visitChildren(ctx);
  }
  visitOperandName(ctx) {
    return this.visitChildren(ctx);
  }
  visitQualifiedIdent(ctx) {
    return this.visitChildren(ctx);
  }
  visitCompositeLit(ctx) {
    return this.visitChildren(ctx);
  }
  visitLiteralType(ctx) {
    return this.visitChildren(ctx);
  }
  visitLiteralValue(ctx) {
    return this.visitChildren(ctx);
  }
  visitElementList(ctx) {
    return this.visitChildren(ctx);
  }
  visitKeyedElement(ctx) {
    return this.visitChildren(ctx);
  }
  visitKey(ctx) {
    return this.visitChildren(ctx);
  }
  visitElement(ctx) {
    return this.visitChildren(ctx);
  }
  visitStructType(ctx) {
    return this.visitChildren(ctx);
  }
  visitFieldDecl(ctx) {
    return this.visitChildren(ctx);
  }
  visitString_(ctx) {
    return this.visitChildren(ctx);
  }
  visitEmbeddedField(ctx) {
    return this.visitChildren(ctx);
  }
  visitFunctionLit(ctx) {
    return this.visitChildren(ctx);
  }
  visitIndex(ctx) {
    return this.visitChildren(ctx);
  }
  visitSlice_(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeAssertion(ctx) {
    return this.visitChildren(ctx);
  }
  visitArguments(ctx) {
    return this.visitChildren(ctx);
  }
  visitMethodExpr(ctx) {
    return this.visitChildren(ctx);
  }
  visitReceiverType(ctx) {
    return this.visitChildren(ctx);
  }
  visitEos(ctx) {
    return this.visitChildren(ctx);
  }
}
module.exports = __toCommonJS(GoParserVisitor_exports);
