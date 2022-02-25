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
var JavaScriptParserListener_exports = {};
__export(JavaScriptParserListener_exports, {
  default: () => JavaScriptParserListener
});
var import_antlr4 = __toESM(require("antlr4"));
class JavaScriptParserListener extends import_antlr4.default.tree.ParseTreeListener {
  enterProgram(ctx) {
  }
  exitProgram(ctx) {
  }
  enterSourceElement(ctx) {
  }
  exitSourceElement(ctx) {
  }
  enterStatement(ctx) {
  }
  exitStatement(ctx) {
  }
  enterBlock(ctx) {
  }
  exitBlock(ctx) {
  }
  enterStatementList(ctx) {
  }
  exitStatementList(ctx) {
  }
  enterImportStatement(ctx) {
  }
  exitImportStatement(ctx) {
  }
  enterImportFromBlock(ctx) {
  }
  exitImportFromBlock(ctx) {
  }
  enterModuleItems(ctx) {
  }
  exitModuleItems(ctx) {
  }
  enterImportDefault(ctx) {
  }
  exitImportDefault(ctx) {
  }
  enterImportNamespace(ctx) {
  }
  exitImportNamespace(ctx) {
  }
  enterImportFrom(ctx) {
  }
  exitImportFrom(ctx) {
  }
  enterAliasName(ctx) {
  }
  exitAliasName(ctx) {
  }
  enterExportDeclaration(ctx) {
  }
  exitExportDeclaration(ctx) {
  }
  enterExportDefaultDeclaration(ctx) {
  }
  exitExportDefaultDeclaration(ctx) {
  }
  enterExportFromBlock(ctx) {
  }
  exitExportFromBlock(ctx) {
  }
  enterDeclaration(ctx) {
  }
  exitDeclaration(ctx) {
  }
  enterVariableStatement(ctx) {
  }
  exitVariableStatement(ctx) {
  }
  enterVariableDeclarationList(ctx) {
  }
  exitVariableDeclarationList(ctx) {
  }
  enterVariableDeclaration(ctx) {
  }
  exitVariableDeclaration(ctx) {
  }
  enterEmptyStatement_(ctx) {
  }
  exitEmptyStatement_(ctx) {
  }
  enterExpressionStatement(ctx) {
  }
  exitExpressionStatement(ctx) {
  }
  enterIfStatement(ctx) {
  }
  exitIfStatement(ctx) {
  }
  enterDoStatement(ctx) {
  }
  exitDoStatement(ctx) {
  }
  enterWhileStatement(ctx) {
  }
  exitWhileStatement(ctx) {
  }
  enterForStatement(ctx) {
  }
  exitForStatement(ctx) {
  }
  enterForInStatement(ctx) {
  }
  exitForInStatement(ctx) {
  }
  enterForOfStatement(ctx) {
  }
  exitForOfStatement(ctx) {
  }
  enterVarModifier(ctx) {
  }
  exitVarModifier(ctx) {
  }
  enterContinueStatement(ctx) {
  }
  exitContinueStatement(ctx) {
  }
  enterBreakStatement(ctx) {
  }
  exitBreakStatement(ctx) {
  }
  enterReturnStatement(ctx) {
  }
  exitReturnStatement(ctx) {
  }
  enterYieldStatement(ctx) {
  }
  exitYieldStatement(ctx) {
  }
  enterWithStatement(ctx) {
  }
  exitWithStatement(ctx) {
  }
  enterSwitchStatement(ctx) {
  }
  exitSwitchStatement(ctx) {
  }
  enterCaseBlock(ctx) {
  }
  exitCaseBlock(ctx) {
  }
  enterCaseClauses(ctx) {
  }
  exitCaseClauses(ctx) {
  }
  enterCaseClause(ctx) {
  }
  exitCaseClause(ctx) {
  }
  enterDefaultClause(ctx) {
  }
  exitDefaultClause(ctx) {
  }
  enterLabelledStatement(ctx) {
  }
  exitLabelledStatement(ctx) {
  }
  enterThrowStatement(ctx) {
  }
  exitThrowStatement(ctx) {
  }
  enterTryStatement(ctx) {
  }
  exitTryStatement(ctx) {
  }
  enterCatchProduction(ctx) {
  }
  exitCatchProduction(ctx) {
  }
  enterFinallyProduction(ctx) {
  }
  exitFinallyProduction(ctx) {
  }
  enterDebuggerStatement(ctx) {
  }
  exitDebuggerStatement(ctx) {
  }
  enterFunctionDeclaration(ctx) {
  }
  exitFunctionDeclaration(ctx) {
  }
  enterClassDeclaration(ctx) {
  }
  exitClassDeclaration(ctx) {
  }
  enterClassTail(ctx) {
  }
  exitClassTail(ctx) {
  }
  enterClassElement(ctx) {
  }
  exitClassElement(ctx) {
  }
  enterMethodDefinition(ctx) {
  }
  exitMethodDefinition(ctx) {
  }
  enterFormalParameterList(ctx) {
  }
  exitFormalParameterList(ctx) {
  }
  enterFormalParameterArg(ctx) {
  }
  exitFormalParameterArg(ctx) {
  }
  enterLastFormalParameterArg(ctx) {
  }
  exitLastFormalParameterArg(ctx) {
  }
  enterFunctionBody(ctx) {
  }
  exitFunctionBody(ctx) {
  }
  enterSourceElements(ctx) {
  }
  exitSourceElements(ctx) {
  }
  enterArrayLiteral(ctx) {
  }
  exitArrayLiteral(ctx) {
  }
  enterElementList(ctx) {
  }
  exitElementList(ctx) {
  }
  enterArrayElement(ctx) {
  }
  exitArrayElement(ctx) {
  }
  enterPropertyExpressionAssignment(ctx) {
  }
  exitPropertyExpressionAssignment(ctx) {
  }
  enterComputedPropertyExpressionAssignment(ctx) {
  }
  exitComputedPropertyExpressionAssignment(ctx) {
  }
  enterFunctionProperty(ctx) {
  }
  exitFunctionProperty(ctx) {
  }
  enterPropertyGetter(ctx) {
  }
  exitPropertyGetter(ctx) {
  }
  enterPropertySetter(ctx) {
  }
  exitPropertySetter(ctx) {
  }
  enterPropertyShorthand(ctx) {
  }
  exitPropertyShorthand(ctx) {
  }
  enterPropertyName(ctx) {
  }
  exitPropertyName(ctx) {
  }
  enterArguments(ctx) {
  }
  exitArguments(ctx) {
  }
  enterArgument(ctx) {
  }
  exitArgument(ctx) {
  }
  enterExpressionSequence(ctx) {
  }
  exitExpressionSequence(ctx) {
  }
  enterTemplateStringExpression(ctx) {
  }
  exitTemplateStringExpression(ctx) {
  }
  enterTernaryExpression(ctx) {
  }
  exitTernaryExpression(ctx) {
  }
  enterLogicalAndExpression(ctx) {
  }
  exitLogicalAndExpression(ctx) {
  }
  enterPowerExpression(ctx) {
  }
  exitPowerExpression(ctx) {
  }
  enterPreIncrementExpression(ctx) {
  }
  exitPreIncrementExpression(ctx) {
  }
  enterObjectLiteralExpression(ctx) {
  }
  exitObjectLiteralExpression(ctx) {
  }
  enterMetaExpression(ctx) {
  }
  exitMetaExpression(ctx) {
  }
  enterInExpression(ctx) {
  }
  exitInExpression(ctx) {
  }
  enterLogicalOrExpression(ctx) {
  }
  exitLogicalOrExpression(ctx) {
  }
  enterNotExpression(ctx) {
  }
  exitNotExpression(ctx) {
  }
  enterPreDecreaseExpression(ctx) {
  }
  exitPreDecreaseExpression(ctx) {
  }
  enterArgumentsExpression(ctx) {
  }
  exitArgumentsExpression(ctx) {
  }
  enterAwaitExpression(ctx) {
  }
  exitAwaitExpression(ctx) {
  }
  enterThisExpression(ctx) {
  }
  exitThisExpression(ctx) {
  }
  enterFunctionExpression(ctx) {
  }
  exitFunctionExpression(ctx) {
  }
  enterUnaryMinusExpression(ctx) {
  }
  exitUnaryMinusExpression(ctx) {
  }
  enterAssignmentExpression(ctx) {
  }
  exitAssignmentExpression(ctx) {
  }
  enterPostDecreaseExpression(ctx) {
  }
  exitPostDecreaseExpression(ctx) {
  }
  enterTypeofExpression(ctx) {
  }
  exitTypeofExpression(ctx) {
  }
  enterInstanceofExpression(ctx) {
  }
  exitInstanceofExpression(ctx) {
  }
  enterUnaryPlusExpression(ctx) {
  }
  exitUnaryPlusExpression(ctx) {
  }
  enterDeleteExpression(ctx) {
  }
  exitDeleteExpression(ctx) {
  }
  enterImportExpression(ctx) {
  }
  exitImportExpression(ctx) {
  }
  enterEqualityExpression(ctx) {
  }
  exitEqualityExpression(ctx) {
  }
  enterBitXOrExpression(ctx) {
  }
  exitBitXOrExpression(ctx) {
  }
  enterSuperExpression(ctx) {
  }
  exitSuperExpression(ctx) {
  }
  enterMultiplicativeExpression(ctx) {
  }
  exitMultiplicativeExpression(ctx) {
  }
  enterBitShiftExpression(ctx) {
  }
  exitBitShiftExpression(ctx) {
  }
  enterParenthesizedExpression(ctx) {
  }
  exitParenthesizedExpression(ctx) {
  }
  enterAdditiveExpression(ctx) {
  }
  exitAdditiveExpression(ctx) {
  }
  enterRelationalExpression(ctx) {
  }
  exitRelationalExpression(ctx) {
  }
  enterPostIncrementExpression(ctx) {
  }
  exitPostIncrementExpression(ctx) {
  }
  enterYieldExpression(ctx) {
  }
  exitYieldExpression(ctx) {
  }
  enterBitNotExpression(ctx) {
  }
  exitBitNotExpression(ctx) {
  }
  enterNewExpression(ctx) {
  }
  exitNewExpression(ctx) {
  }
  enterLiteralExpression(ctx) {
  }
  exitLiteralExpression(ctx) {
  }
  enterArrayLiteralExpression(ctx) {
  }
  exitArrayLiteralExpression(ctx) {
  }
  enterMemberDotExpression(ctx) {
  }
  exitMemberDotExpression(ctx) {
  }
  enterClassExpression(ctx) {
  }
  exitClassExpression(ctx) {
  }
  enterMemberIndexExpression(ctx) {
  }
  exitMemberIndexExpression(ctx) {
  }
  enterIdentifierExpression(ctx) {
  }
  exitIdentifierExpression(ctx) {
  }
  enterBitAndExpression(ctx) {
  }
  exitBitAndExpression(ctx) {
  }
  enterBitOrExpression(ctx) {
  }
  exitBitOrExpression(ctx) {
  }
  enterAssignmentOperatorExpression(ctx) {
  }
  exitAssignmentOperatorExpression(ctx) {
  }
  enterVoidExpression(ctx) {
  }
  exitVoidExpression(ctx) {
  }
  enterCoalesceExpression(ctx) {
  }
  exitCoalesceExpression(ctx) {
  }
  enterAssignable(ctx) {
  }
  exitAssignable(ctx) {
  }
  enterObjectLiteral(ctx) {
  }
  exitObjectLiteral(ctx) {
  }
  enterFunctionDecl(ctx) {
  }
  exitFunctionDecl(ctx) {
  }
  enterAnonymousFunctionDecl(ctx) {
  }
  exitAnonymousFunctionDecl(ctx) {
  }
  enterArrowFunction(ctx) {
  }
  exitArrowFunction(ctx) {
  }
  enterArrowFunctionParameters(ctx) {
  }
  exitArrowFunctionParameters(ctx) {
  }
  enterArrowFunctionBody(ctx) {
  }
  exitArrowFunctionBody(ctx) {
  }
  enterAssignmentOperator(ctx) {
  }
  exitAssignmentOperator(ctx) {
  }
  enterLiteral(ctx) {
  }
  exitLiteral(ctx) {
  }
  enterTemplateStringLiteral(ctx) {
  }
  exitTemplateStringLiteral(ctx) {
  }
  enterTemplateStringAtom(ctx) {
  }
  exitTemplateStringAtom(ctx) {
  }
  enterNumericLiteral(ctx) {
  }
  exitNumericLiteral(ctx) {
  }
  enterBigintLiteral(ctx) {
  }
  exitBigintLiteral(ctx) {
  }
  enterGetter(ctx) {
  }
  exitGetter(ctx) {
  }
  enterSetter(ctx) {
  }
  exitSetter(ctx) {
  }
  enterIdentifierName(ctx) {
  }
  exitIdentifierName(ctx) {
  }
  enterIdentifier(ctx) {
  }
  exitIdentifier(ctx) {
  }
  enterReservedWord(ctx) {
  }
  exitReservedWord(ctx) {
  }
  enterKeyword(ctx) {
  }
  exitKeyword(ctx) {
  }
  enterLet_(ctx) {
  }
  exitLet_(ctx) {
  }
  enterEos(ctx) {
  }
  exitEos(ctx) {
  }
}
module.exports = __toCommonJS(JavaScriptParserListener_exports);
