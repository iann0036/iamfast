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
var GoParserListener_exports = {};
__export(GoParserListener_exports, {
  default: () => GoParserListener
});
var import_antlr4 = __toESM(require("antlr4"), 1);
class GoParserListener extends import_antlr4.default.tree.ParseTreeListener {
  enterSourceFile(ctx) {
  }
  exitSourceFile(ctx) {
  }
  enterPackageClause(ctx) {
  }
  exitPackageClause(ctx) {
  }
  enterImportDecl(ctx) {
  }
  exitImportDecl(ctx) {
  }
  enterImportSpec(ctx) {
  }
  exitImportSpec(ctx) {
  }
  enterImportPath(ctx) {
  }
  exitImportPath(ctx) {
  }
  enterDeclaration(ctx) {
  }
  exitDeclaration(ctx) {
  }
  enterConstDecl(ctx) {
  }
  exitConstDecl(ctx) {
  }
  enterConstSpec(ctx) {
  }
  exitConstSpec(ctx) {
  }
  enterIdentifierList(ctx) {
  }
  exitIdentifierList(ctx) {
  }
  enterExpressionList(ctx) {
  }
  exitExpressionList(ctx) {
  }
  enterTypeDecl(ctx) {
  }
  exitTypeDecl(ctx) {
  }
  enterTypeSpec(ctx) {
  }
  exitTypeSpec(ctx) {
  }
  enterFunctionDecl(ctx) {
  }
  exitFunctionDecl(ctx) {
  }
  enterMethodDecl(ctx) {
  }
  exitMethodDecl(ctx) {
  }
  enterReceiver(ctx) {
  }
  exitReceiver(ctx) {
  }
  enterVarDecl(ctx) {
  }
  exitVarDecl(ctx) {
  }
  enterVarSpec(ctx) {
  }
  exitVarSpec(ctx) {
  }
  enterBlock(ctx) {
  }
  exitBlock(ctx) {
  }
  enterStatementList(ctx) {
  }
  exitStatementList(ctx) {
  }
  enterStatement(ctx) {
  }
  exitStatement(ctx) {
  }
  enterSimpleStmt(ctx) {
  }
  exitSimpleStmt(ctx) {
  }
  enterExpressionStmt(ctx) {
  }
  exitExpressionStmt(ctx) {
  }
  enterSendStmt(ctx) {
  }
  exitSendStmt(ctx) {
  }
  enterIncDecStmt(ctx) {
  }
  exitIncDecStmt(ctx) {
  }
  enterAssignment(ctx) {
  }
  exitAssignment(ctx) {
  }
  enterAssign_op(ctx) {
  }
  exitAssign_op(ctx) {
  }
  enterShortVarDecl(ctx) {
  }
  exitShortVarDecl(ctx) {
  }
  enterEmptyStmt(ctx) {
  }
  exitEmptyStmt(ctx) {
  }
  enterLabeledStmt(ctx) {
  }
  exitLabeledStmt(ctx) {
  }
  enterReturnStmt(ctx) {
  }
  exitReturnStmt(ctx) {
  }
  enterBreakStmt(ctx) {
  }
  exitBreakStmt(ctx) {
  }
  enterContinueStmt(ctx) {
  }
  exitContinueStmt(ctx) {
  }
  enterGotoStmt(ctx) {
  }
  exitGotoStmt(ctx) {
  }
  enterFallthroughStmt(ctx) {
  }
  exitFallthroughStmt(ctx) {
  }
  enterDeferStmt(ctx) {
  }
  exitDeferStmt(ctx) {
  }
  enterIfStmt(ctx) {
  }
  exitIfStmt(ctx) {
  }
  enterSwitchStmt(ctx) {
  }
  exitSwitchStmt(ctx) {
  }
  enterExprSwitchStmt(ctx) {
  }
  exitExprSwitchStmt(ctx) {
  }
  enterExprCaseClause(ctx) {
  }
  exitExprCaseClause(ctx) {
  }
  enterExprSwitchCase(ctx) {
  }
  exitExprSwitchCase(ctx) {
  }
  enterTypeSwitchStmt(ctx) {
  }
  exitTypeSwitchStmt(ctx) {
  }
  enterTypeSwitchGuard(ctx) {
  }
  exitTypeSwitchGuard(ctx) {
  }
  enterTypeCaseClause(ctx) {
  }
  exitTypeCaseClause(ctx) {
  }
  enterTypeSwitchCase(ctx) {
  }
  exitTypeSwitchCase(ctx) {
  }
  enterTypeList(ctx) {
  }
  exitTypeList(ctx) {
  }
  enterSelectStmt(ctx) {
  }
  exitSelectStmt(ctx) {
  }
  enterCommClause(ctx) {
  }
  exitCommClause(ctx) {
  }
  enterCommCase(ctx) {
  }
  exitCommCase(ctx) {
  }
  enterRecvStmt(ctx) {
  }
  exitRecvStmt(ctx) {
  }
  enterForStmt(ctx) {
  }
  exitForStmt(ctx) {
  }
  enterForClause(ctx) {
  }
  exitForClause(ctx) {
  }
  enterRangeClause(ctx) {
  }
  exitRangeClause(ctx) {
  }
  enterGoStmt(ctx) {
  }
  exitGoStmt(ctx) {
  }
  enterType_(ctx) {
  }
  exitType_(ctx) {
  }
  enterTypeName(ctx) {
  }
  exitTypeName(ctx) {
  }
  enterTypeLit(ctx) {
  }
  exitTypeLit(ctx) {
  }
  enterArrayType(ctx) {
  }
  exitArrayType(ctx) {
  }
  enterArrayLength(ctx) {
  }
  exitArrayLength(ctx) {
  }
  enterElementType(ctx) {
  }
  exitElementType(ctx) {
  }
  enterPointerType(ctx) {
  }
  exitPointerType(ctx) {
  }
  enterInterfaceType(ctx) {
  }
  exitInterfaceType(ctx) {
  }
  enterSliceType(ctx) {
  }
  exitSliceType(ctx) {
  }
  enterMapType(ctx) {
  }
  exitMapType(ctx) {
  }
  enterChannelType(ctx) {
  }
  exitChannelType(ctx) {
  }
  enterMethodSpec(ctx) {
  }
  exitMethodSpec(ctx) {
  }
  enterFunctionType(ctx) {
  }
  exitFunctionType(ctx) {
  }
  enterSignature(ctx) {
  }
  exitSignature(ctx) {
  }
  enterResult(ctx) {
  }
  exitResult(ctx) {
  }
  enterParameters(ctx) {
  }
  exitParameters(ctx) {
  }
  enterParameterDecl(ctx) {
  }
  exitParameterDecl(ctx) {
  }
  enterExpression(ctx) {
  }
  exitExpression(ctx) {
  }
  enterPrimaryExpr(ctx) {
  }
  exitPrimaryExpr(ctx) {
  }
  enterConversion(ctx) {
  }
  exitConversion(ctx) {
  }
  enterNonNamedType(ctx) {
  }
  exitNonNamedType(ctx) {
  }
  enterOperand(ctx) {
  }
  exitOperand(ctx) {
  }
  enterLiteral(ctx) {
  }
  exitLiteral(ctx) {
  }
  enterBasicLit(ctx) {
  }
  exitBasicLit(ctx) {
  }
  enterInteger(ctx) {
  }
  exitInteger(ctx) {
  }
  enterOperandName(ctx) {
  }
  exitOperandName(ctx) {
  }
  enterQualifiedIdent(ctx) {
  }
  exitQualifiedIdent(ctx) {
  }
  enterCompositeLit(ctx) {
  }
  exitCompositeLit(ctx) {
  }
  enterLiteralType(ctx) {
  }
  exitLiteralType(ctx) {
  }
  enterLiteralValue(ctx) {
  }
  exitLiteralValue(ctx) {
  }
  enterElementList(ctx) {
  }
  exitElementList(ctx) {
  }
  enterKeyedElement(ctx) {
  }
  exitKeyedElement(ctx) {
  }
  enterKey(ctx) {
  }
  exitKey(ctx) {
  }
  enterElement(ctx) {
  }
  exitElement(ctx) {
  }
  enterStructType(ctx) {
  }
  exitStructType(ctx) {
  }
  enterFieldDecl(ctx) {
  }
  exitFieldDecl(ctx) {
  }
  enterString_(ctx) {
  }
  exitString_(ctx) {
  }
  enterEmbeddedField(ctx) {
  }
  exitEmbeddedField(ctx) {
  }
  enterFunctionLit(ctx) {
  }
  exitFunctionLit(ctx) {
  }
  enterIndex(ctx) {
  }
  exitIndex(ctx) {
  }
  enterSlice_(ctx) {
  }
  exitSlice_(ctx) {
  }
  enterTypeAssertion(ctx) {
  }
  exitTypeAssertion(ctx) {
  }
  enterArguments(ctx) {
  }
  exitArguments(ctx) {
  }
  enterMethodExpr(ctx) {
  }
  exitMethodExpr(ctx) {
  }
  enterReceiverType(ctx) {
  }
  exitReceiverType(ctx) {
  }
  enterEos(ctx) {
  }
  exitEos(ctx) {
  }
}
module.exports = __toCommonJS(GoParserListener_exports);
