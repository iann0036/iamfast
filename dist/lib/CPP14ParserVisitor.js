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
var CPP14ParserVisitor_exports = {};
__export(CPP14ParserVisitor_exports, {
  default: () => CPP14ParserVisitor
});
var import_antlr4 = __toESM(require("antlr4"), 1);
class CPP14ParserVisitor extends import_antlr4.default.tree.ParseTreeVisitor {
  visitTranslationUnit(ctx) {
    return this.visitChildren(ctx);
  }
  visitPrimaryExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitIdExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitUnqualifiedId(ctx) {
    return this.visitChildren(ctx);
  }
  visitQualifiedId(ctx) {
    return this.visitChildren(ctx);
  }
  visitNestedNameSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitLambdaExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitLambdaIntroducer(ctx) {
    return this.visitChildren(ctx);
  }
  visitLambdaCapture(ctx) {
    return this.visitChildren(ctx);
  }
  visitCaptureDefault(ctx) {
    return this.visitChildren(ctx);
  }
  visitCaptureList(ctx) {
    return this.visitChildren(ctx);
  }
  visitCapture(ctx) {
    return this.visitChildren(ctx);
  }
  visitSimpleCapture(ctx) {
    return this.visitChildren(ctx);
  }
  visitInitcapture(ctx) {
    return this.visitChildren(ctx);
  }
  visitLambdaDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitPostfixExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeIdOfTheTypeId(ctx) {
    return this.visitChildren(ctx);
  }
  visitExpressionList(ctx) {
    return this.visitChildren(ctx);
  }
  visitPseudoDestructorName(ctx) {
    return this.visitChildren(ctx);
  }
  visitUnaryExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitUnaryOperator(ctx) {
    return this.visitChildren(ctx);
  }
  visitNewExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitNewPlacement(ctx) {
    return this.visitChildren(ctx);
  }
  visitNewTypeId(ctx) {
    return this.visitChildren(ctx);
  }
  visitNewDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitNoPointerNewDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitNewInitializer(ctx) {
    return this.visitChildren(ctx);
  }
  visitDeleteExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitNoExceptExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitCastExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitPointerMemberExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitMultiplicativeExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitAdditiveExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitShiftExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitShiftOperator(ctx) {
    return this.visitChildren(ctx);
  }
  visitRelationalExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitEqualityExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitAndExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitExclusiveOrExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitInclusiveOrExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitLogicalAndExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitLogicalOrExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitConditionalExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitAssignmentExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitAssignmentOperator(ctx) {
    return this.visitChildren(ctx);
  }
  visitExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitConstantExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitLabeledStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitExpressionStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitCompoundStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitStatementSeq(ctx) {
    return this.visitChildren(ctx);
  }
  visitSelectionStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitCondition(ctx) {
    return this.visitChildren(ctx);
  }
  visitIterationStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitForInitStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitForRangeDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitForRangeInitializer(ctx) {
    return this.visitChildren(ctx);
  }
  visitJumpStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitDeclarationStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitDeclarationseq(ctx) {
    return this.visitChildren(ctx);
  }
  visitDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitBlockDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitAliasDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitSimpleDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitStaticAssertDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitEmptyDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitAttributeDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitDeclSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitDeclSpecifierSeq(ctx) {
    return this.visitChildren(ctx);
  }
  visitStorageClassSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitFunctionSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypedefName(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitTrailingTypeSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeSpecifierSeq(ctx) {
    return this.visitChildren(ctx);
  }
  visitTrailingTypeSpecifierSeq(ctx) {
    return this.visitChildren(ctx);
  }
  visitSimpleTypeLengthModifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitSimpleTypeSignednessModifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitSimpleTypeSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitTheTypeName(ctx) {
    return this.visitChildren(ctx);
  }
  visitDecltypeSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitElaboratedTypeSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitEnumName(ctx) {
    return this.visitChildren(ctx);
  }
  visitEnumSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitEnumHead(ctx) {
    return this.visitChildren(ctx);
  }
  visitOpaqueEnumDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitEnumkey(ctx) {
    return this.visitChildren(ctx);
  }
  visitEnumbase(ctx) {
    return this.visitChildren(ctx);
  }
  visitEnumeratorList(ctx) {
    return this.visitChildren(ctx);
  }
  visitEnumeratorDefinition(ctx) {
    return this.visitChildren(ctx);
  }
  visitEnumerator(ctx) {
    return this.visitChildren(ctx);
  }
  visitNamespaceName(ctx) {
    return this.visitChildren(ctx);
  }
  visitOriginalNamespaceName(ctx) {
    return this.visitChildren(ctx);
  }
  visitNamespaceDefinition(ctx) {
    return this.visitChildren(ctx);
  }
  visitNamespaceAlias(ctx) {
    return this.visitChildren(ctx);
  }
  visitNamespaceAliasDefinition(ctx) {
    return this.visitChildren(ctx);
  }
  visitQualifiednamespacespecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitUsingDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitUsingDirective(ctx) {
    return this.visitChildren(ctx);
  }
  visitAsmDefinition(ctx) {
    return this.visitChildren(ctx);
  }
  visitLinkageSpecification(ctx) {
    return this.visitChildren(ctx);
  }
  visitAttributeSpecifierSeq(ctx) {
    return this.visitChildren(ctx);
  }
  visitAttributeSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitAlignmentspecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitAttributeList(ctx) {
    return this.visitChildren(ctx);
  }
  visitAttribute(ctx) {
    return this.visitChildren(ctx);
  }
  visitAttributeNamespace(ctx) {
    return this.visitChildren(ctx);
  }
  visitAttributeArgumentClause(ctx) {
    return this.visitChildren(ctx);
  }
  visitBalancedTokenSeq(ctx) {
    return this.visitChildren(ctx);
  }
  visitBalancedtoken(ctx) {
    return this.visitChildren(ctx);
  }
  visitInitDeclaratorList(ctx) {
    return this.visitChildren(ctx);
  }
  visitInitDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitPointerDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitNoPointerDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitParametersAndQualifiers(ctx) {
    return this.visitChildren(ctx);
  }
  visitTrailingReturnType(ctx) {
    return this.visitChildren(ctx);
  }
  visitPointerOperator(ctx) {
    return this.visitChildren(ctx);
  }
  visitCvqualifierseq(ctx) {
    return this.visitChildren(ctx);
  }
  visitCvQualifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitRefqualifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitDeclaratorid(ctx) {
    return this.visitChildren(ctx);
  }
  visitTheTypeId(ctx) {
    return this.visitChildren(ctx);
  }
  visitAbstractDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitPointerAbstractDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitNoPointerAbstractDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitAbstractPackDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitNoPointerAbstractPackDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitParameterDeclarationClause(ctx) {
    return this.visitChildren(ctx);
  }
  visitParameterDeclarationList(ctx) {
    return this.visitChildren(ctx);
  }
  visitParameterDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitFunctionDefinition(ctx) {
    return this.visitChildren(ctx);
  }
  visitFunctionBody(ctx) {
    return this.visitChildren(ctx);
  }
  visitInitializer(ctx) {
    return this.visitChildren(ctx);
  }
  visitBraceOrEqualInitializer(ctx) {
    return this.visitChildren(ctx);
  }
  visitInitializerClause(ctx) {
    return this.visitChildren(ctx);
  }
  visitInitializerList(ctx) {
    return this.visitChildren(ctx);
  }
  visitBracedInitList(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassName(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassHead(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassHeadName(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassVirtSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassKey(ctx) {
    return this.visitChildren(ctx);
  }
  visitMemberSpecification(ctx) {
    return this.visitChildren(ctx);
  }
  visitMemberdeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitMemberDeclaratorList(ctx) {
    return this.visitChildren(ctx);
  }
  visitMemberDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitVirtualSpecifierSeq(ctx) {
    return this.visitChildren(ctx);
  }
  visitVirtualSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitPureSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitBaseClause(ctx) {
    return this.visitChildren(ctx);
  }
  visitBaseSpecifierList(ctx) {
    return this.visitChildren(ctx);
  }
  visitBaseSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassOrDeclType(ctx) {
    return this.visitChildren(ctx);
  }
  visitBaseTypeSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitAccessSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitConversionFunctionId(ctx) {
    return this.visitChildren(ctx);
  }
  visitConversionTypeId(ctx) {
    return this.visitChildren(ctx);
  }
  visitConversionDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitConstructorInitializer(ctx) {
    return this.visitChildren(ctx);
  }
  visitMemInitializerList(ctx) {
    return this.visitChildren(ctx);
  }
  visitMemInitializer(ctx) {
    return this.visitChildren(ctx);
  }
  visitMeminitializerid(ctx) {
    return this.visitChildren(ctx);
  }
  visitOperatorFunctionId(ctx) {
    return this.visitChildren(ctx);
  }
  visitLiteralOperatorId(ctx) {
    return this.visitChildren(ctx);
  }
  visitTemplateDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitTemplateparameterList(ctx) {
    return this.visitChildren(ctx);
  }
  visitTemplateParameter(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeParameter(ctx) {
    return this.visitChildren(ctx);
  }
  visitSimpleTemplateId(ctx) {
    return this.visitChildren(ctx);
  }
  visitTemplateId(ctx) {
    return this.visitChildren(ctx);
  }
  visitTemplateName(ctx) {
    return this.visitChildren(ctx);
  }
  visitTemplateArgumentList(ctx) {
    return this.visitChildren(ctx);
  }
  visitTemplateArgument(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeNameSpecifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitExplicitInstantiation(ctx) {
    return this.visitChildren(ctx);
  }
  visitExplicitSpecialization(ctx) {
    return this.visitChildren(ctx);
  }
  visitTryBlock(ctx) {
    return this.visitChildren(ctx);
  }
  visitFunctionTryBlock(ctx) {
    return this.visitChildren(ctx);
  }
  visitHandlerSeq(ctx) {
    return this.visitChildren(ctx);
  }
  visitHandler(ctx) {
    return this.visitChildren(ctx);
  }
  visitExceptionDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitThrowExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitExceptionSpecification(ctx) {
    return this.visitChildren(ctx);
  }
  visitDynamicExceptionSpecification(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeIdList(ctx) {
    return this.visitChildren(ctx);
  }
  visitNoeExceptSpecification(ctx) {
    return this.visitChildren(ctx);
  }
  visitTheOperator(ctx) {
    return this.visitChildren(ctx);
  }
  visitLiteral(ctx) {
    return this.visitChildren(ctx);
  }
}
module.exports = __toCommonJS(CPP14ParserVisitor_exports);
