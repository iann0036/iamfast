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
var CPP14ParserListener_exports = {};
__export(CPP14ParserListener_exports, {
  default: () => CPP14ParserListener
});
var import_antlr4 = __toESM(require("antlr4"));
class CPP14ParserListener extends import_antlr4.default.tree.ParseTreeListener {
  enterTranslationUnit(ctx) {
  }
  exitTranslationUnit(ctx) {
  }
  enterPrimaryExpression(ctx) {
  }
  exitPrimaryExpression(ctx) {
  }
  enterIdExpression(ctx) {
  }
  exitIdExpression(ctx) {
  }
  enterUnqualifiedId(ctx) {
  }
  exitUnqualifiedId(ctx) {
  }
  enterQualifiedId(ctx) {
  }
  exitQualifiedId(ctx) {
  }
  enterNestedNameSpecifier(ctx) {
  }
  exitNestedNameSpecifier(ctx) {
  }
  enterLambdaExpression(ctx) {
  }
  exitLambdaExpression(ctx) {
  }
  enterLambdaIntroducer(ctx) {
  }
  exitLambdaIntroducer(ctx) {
  }
  enterLambdaCapture(ctx) {
  }
  exitLambdaCapture(ctx) {
  }
  enterCaptureDefault(ctx) {
  }
  exitCaptureDefault(ctx) {
  }
  enterCaptureList(ctx) {
  }
  exitCaptureList(ctx) {
  }
  enterCapture(ctx) {
  }
  exitCapture(ctx) {
  }
  enterSimpleCapture(ctx) {
  }
  exitSimpleCapture(ctx) {
  }
  enterInitcapture(ctx) {
  }
  exitInitcapture(ctx) {
  }
  enterLambdaDeclarator(ctx) {
  }
  exitLambdaDeclarator(ctx) {
  }
  enterPostfixExpression(ctx) {
  }
  exitPostfixExpression(ctx) {
  }
  enterTypeIdOfTheTypeId(ctx) {
  }
  exitTypeIdOfTheTypeId(ctx) {
  }
  enterExpressionList(ctx) {
  }
  exitExpressionList(ctx) {
  }
  enterPseudoDestructorName(ctx) {
  }
  exitPseudoDestructorName(ctx) {
  }
  enterUnaryExpression(ctx) {
  }
  exitUnaryExpression(ctx) {
  }
  enterUnaryOperator(ctx) {
  }
  exitUnaryOperator(ctx) {
  }
  enterNewExpression(ctx) {
  }
  exitNewExpression(ctx) {
  }
  enterNewPlacement(ctx) {
  }
  exitNewPlacement(ctx) {
  }
  enterNewTypeId(ctx) {
  }
  exitNewTypeId(ctx) {
  }
  enterNewDeclarator(ctx) {
  }
  exitNewDeclarator(ctx) {
  }
  enterNoPointerNewDeclarator(ctx) {
  }
  exitNoPointerNewDeclarator(ctx) {
  }
  enterNewInitializer(ctx) {
  }
  exitNewInitializer(ctx) {
  }
  enterDeleteExpression(ctx) {
  }
  exitDeleteExpression(ctx) {
  }
  enterNoExceptExpression(ctx) {
  }
  exitNoExceptExpression(ctx) {
  }
  enterCastExpression(ctx) {
  }
  exitCastExpression(ctx) {
  }
  enterPointerMemberExpression(ctx) {
  }
  exitPointerMemberExpression(ctx) {
  }
  enterMultiplicativeExpression(ctx) {
  }
  exitMultiplicativeExpression(ctx) {
  }
  enterAdditiveExpression(ctx) {
  }
  exitAdditiveExpression(ctx) {
  }
  enterShiftExpression(ctx) {
  }
  exitShiftExpression(ctx) {
  }
  enterShiftOperator(ctx) {
  }
  exitShiftOperator(ctx) {
  }
  enterRelationalExpression(ctx) {
  }
  exitRelationalExpression(ctx) {
  }
  enterEqualityExpression(ctx) {
  }
  exitEqualityExpression(ctx) {
  }
  enterAndExpression(ctx) {
  }
  exitAndExpression(ctx) {
  }
  enterExclusiveOrExpression(ctx) {
  }
  exitExclusiveOrExpression(ctx) {
  }
  enterInclusiveOrExpression(ctx) {
  }
  exitInclusiveOrExpression(ctx) {
  }
  enterLogicalAndExpression(ctx) {
  }
  exitLogicalAndExpression(ctx) {
  }
  enterLogicalOrExpression(ctx) {
  }
  exitLogicalOrExpression(ctx) {
  }
  enterConditionalExpression(ctx) {
  }
  exitConditionalExpression(ctx) {
  }
  enterAssignmentExpression(ctx) {
  }
  exitAssignmentExpression(ctx) {
  }
  enterAssignmentOperator(ctx) {
  }
  exitAssignmentOperator(ctx) {
  }
  enterExpression(ctx) {
  }
  exitExpression(ctx) {
  }
  enterConstantExpression(ctx) {
  }
  exitConstantExpression(ctx) {
  }
  enterStatement(ctx) {
  }
  exitStatement(ctx) {
  }
  enterLabeledStatement(ctx) {
  }
  exitLabeledStatement(ctx) {
  }
  enterExpressionStatement(ctx) {
  }
  exitExpressionStatement(ctx) {
  }
  enterCompoundStatement(ctx) {
  }
  exitCompoundStatement(ctx) {
  }
  enterStatementSeq(ctx) {
  }
  exitStatementSeq(ctx) {
  }
  enterSelectionStatement(ctx) {
  }
  exitSelectionStatement(ctx) {
  }
  enterCondition(ctx) {
  }
  exitCondition(ctx) {
  }
  enterIterationStatement(ctx) {
  }
  exitIterationStatement(ctx) {
  }
  enterForInitStatement(ctx) {
  }
  exitForInitStatement(ctx) {
  }
  enterForRangeDeclaration(ctx) {
  }
  exitForRangeDeclaration(ctx) {
  }
  enterForRangeInitializer(ctx) {
  }
  exitForRangeInitializer(ctx) {
  }
  enterJumpStatement(ctx) {
  }
  exitJumpStatement(ctx) {
  }
  enterDeclarationStatement(ctx) {
  }
  exitDeclarationStatement(ctx) {
  }
  enterDeclarationseq(ctx) {
  }
  exitDeclarationseq(ctx) {
  }
  enterDeclaration(ctx) {
  }
  exitDeclaration(ctx) {
  }
  enterBlockDeclaration(ctx) {
  }
  exitBlockDeclaration(ctx) {
  }
  enterAliasDeclaration(ctx) {
  }
  exitAliasDeclaration(ctx) {
  }
  enterSimpleDeclaration(ctx) {
  }
  exitSimpleDeclaration(ctx) {
  }
  enterStaticAssertDeclaration(ctx) {
  }
  exitStaticAssertDeclaration(ctx) {
  }
  enterEmptyDeclaration(ctx) {
  }
  exitEmptyDeclaration(ctx) {
  }
  enterAttributeDeclaration(ctx) {
  }
  exitAttributeDeclaration(ctx) {
  }
  enterDeclSpecifier(ctx) {
  }
  exitDeclSpecifier(ctx) {
  }
  enterDeclSpecifierSeq(ctx) {
  }
  exitDeclSpecifierSeq(ctx) {
  }
  enterStorageClassSpecifier(ctx) {
  }
  exitStorageClassSpecifier(ctx) {
  }
  enterFunctionSpecifier(ctx) {
  }
  exitFunctionSpecifier(ctx) {
  }
  enterTypedefName(ctx) {
  }
  exitTypedefName(ctx) {
  }
  enterTypeSpecifier(ctx) {
  }
  exitTypeSpecifier(ctx) {
  }
  enterTrailingTypeSpecifier(ctx) {
  }
  exitTrailingTypeSpecifier(ctx) {
  }
  enterTypeSpecifierSeq(ctx) {
  }
  exitTypeSpecifierSeq(ctx) {
  }
  enterTrailingTypeSpecifierSeq(ctx) {
  }
  exitTrailingTypeSpecifierSeq(ctx) {
  }
  enterSimpleTypeLengthModifier(ctx) {
  }
  exitSimpleTypeLengthModifier(ctx) {
  }
  enterSimpleTypeSignednessModifier(ctx) {
  }
  exitSimpleTypeSignednessModifier(ctx) {
  }
  enterSimpleTypeSpecifier(ctx) {
  }
  exitSimpleTypeSpecifier(ctx) {
  }
  enterTheTypeName(ctx) {
  }
  exitTheTypeName(ctx) {
  }
  enterDecltypeSpecifier(ctx) {
  }
  exitDecltypeSpecifier(ctx) {
  }
  enterElaboratedTypeSpecifier(ctx) {
  }
  exitElaboratedTypeSpecifier(ctx) {
  }
  enterEnumName(ctx) {
  }
  exitEnumName(ctx) {
  }
  enterEnumSpecifier(ctx) {
  }
  exitEnumSpecifier(ctx) {
  }
  enterEnumHead(ctx) {
  }
  exitEnumHead(ctx) {
  }
  enterOpaqueEnumDeclaration(ctx) {
  }
  exitOpaqueEnumDeclaration(ctx) {
  }
  enterEnumkey(ctx) {
  }
  exitEnumkey(ctx) {
  }
  enterEnumbase(ctx) {
  }
  exitEnumbase(ctx) {
  }
  enterEnumeratorList(ctx) {
  }
  exitEnumeratorList(ctx) {
  }
  enterEnumeratorDefinition(ctx) {
  }
  exitEnumeratorDefinition(ctx) {
  }
  enterEnumerator(ctx) {
  }
  exitEnumerator(ctx) {
  }
  enterNamespaceName(ctx) {
  }
  exitNamespaceName(ctx) {
  }
  enterOriginalNamespaceName(ctx) {
  }
  exitOriginalNamespaceName(ctx) {
  }
  enterNamespaceDefinition(ctx) {
  }
  exitNamespaceDefinition(ctx) {
  }
  enterNamespaceAlias(ctx) {
  }
  exitNamespaceAlias(ctx) {
  }
  enterNamespaceAliasDefinition(ctx) {
  }
  exitNamespaceAliasDefinition(ctx) {
  }
  enterQualifiednamespacespecifier(ctx) {
  }
  exitQualifiednamespacespecifier(ctx) {
  }
  enterUsingDeclaration(ctx) {
  }
  exitUsingDeclaration(ctx) {
  }
  enterUsingDirective(ctx) {
  }
  exitUsingDirective(ctx) {
  }
  enterAsmDefinition(ctx) {
  }
  exitAsmDefinition(ctx) {
  }
  enterLinkageSpecification(ctx) {
  }
  exitLinkageSpecification(ctx) {
  }
  enterAttributeSpecifierSeq(ctx) {
  }
  exitAttributeSpecifierSeq(ctx) {
  }
  enterAttributeSpecifier(ctx) {
  }
  exitAttributeSpecifier(ctx) {
  }
  enterAlignmentspecifier(ctx) {
  }
  exitAlignmentspecifier(ctx) {
  }
  enterAttributeList(ctx) {
  }
  exitAttributeList(ctx) {
  }
  enterAttribute(ctx) {
  }
  exitAttribute(ctx) {
  }
  enterAttributeNamespace(ctx) {
  }
  exitAttributeNamespace(ctx) {
  }
  enterAttributeArgumentClause(ctx) {
  }
  exitAttributeArgumentClause(ctx) {
  }
  enterBalancedTokenSeq(ctx) {
  }
  exitBalancedTokenSeq(ctx) {
  }
  enterBalancedtoken(ctx) {
  }
  exitBalancedtoken(ctx) {
  }
  enterInitDeclaratorList(ctx) {
  }
  exitInitDeclaratorList(ctx) {
  }
  enterInitDeclarator(ctx) {
  }
  exitInitDeclarator(ctx) {
  }
  enterDeclarator(ctx) {
  }
  exitDeclarator(ctx) {
  }
  enterPointerDeclarator(ctx) {
  }
  exitPointerDeclarator(ctx) {
  }
  enterNoPointerDeclarator(ctx) {
  }
  exitNoPointerDeclarator(ctx) {
  }
  enterParametersAndQualifiers(ctx) {
  }
  exitParametersAndQualifiers(ctx) {
  }
  enterTrailingReturnType(ctx) {
  }
  exitTrailingReturnType(ctx) {
  }
  enterPointerOperator(ctx) {
  }
  exitPointerOperator(ctx) {
  }
  enterCvqualifierseq(ctx) {
  }
  exitCvqualifierseq(ctx) {
  }
  enterCvQualifier(ctx) {
  }
  exitCvQualifier(ctx) {
  }
  enterRefqualifier(ctx) {
  }
  exitRefqualifier(ctx) {
  }
  enterDeclaratorid(ctx) {
  }
  exitDeclaratorid(ctx) {
  }
  enterTheTypeId(ctx) {
  }
  exitTheTypeId(ctx) {
  }
  enterAbstractDeclarator(ctx) {
  }
  exitAbstractDeclarator(ctx) {
  }
  enterPointerAbstractDeclarator(ctx) {
  }
  exitPointerAbstractDeclarator(ctx) {
  }
  enterNoPointerAbstractDeclarator(ctx) {
  }
  exitNoPointerAbstractDeclarator(ctx) {
  }
  enterAbstractPackDeclarator(ctx) {
  }
  exitAbstractPackDeclarator(ctx) {
  }
  enterNoPointerAbstractPackDeclarator(ctx) {
  }
  exitNoPointerAbstractPackDeclarator(ctx) {
  }
  enterParameterDeclarationClause(ctx) {
  }
  exitParameterDeclarationClause(ctx) {
  }
  enterParameterDeclarationList(ctx) {
  }
  exitParameterDeclarationList(ctx) {
  }
  enterParameterDeclaration(ctx) {
  }
  exitParameterDeclaration(ctx) {
  }
  enterFunctionDefinition(ctx) {
  }
  exitFunctionDefinition(ctx) {
  }
  enterFunctionBody(ctx) {
  }
  exitFunctionBody(ctx) {
  }
  enterInitializer(ctx) {
  }
  exitInitializer(ctx) {
  }
  enterBraceOrEqualInitializer(ctx) {
  }
  exitBraceOrEqualInitializer(ctx) {
  }
  enterInitializerClause(ctx) {
  }
  exitInitializerClause(ctx) {
  }
  enterInitializerList(ctx) {
  }
  exitInitializerList(ctx) {
  }
  enterBracedInitList(ctx) {
  }
  exitBracedInitList(ctx) {
  }
  enterClassName(ctx) {
  }
  exitClassName(ctx) {
  }
  enterClassSpecifier(ctx) {
  }
  exitClassSpecifier(ctx) {
  }
  enterClassHead(ctx) {
  }
  exitClassHead(ctx) {
  }
  enterClassHeadName(ctx) {
  }
  exitClassHeadName(ctx) {
  }
  enterClassVirtSpecifier(ctx) {
  }
  exitClassVirtSpecifier(ctx) {
  }
  enterClassKey(ctx) {
  }
  exitClassKey(ctx) {
  }
  enterMemberSpecification(ctx) {
  }
  exitMemberSpecification(ctx) {
  }
  enterMemberdeclaration(ctx) {
  }
  exitMemberdeclaration(ctx) {
  }
  enterMemberDeclaratorList(ctx) {
  }
  exitMemberDeclaratorList(ctx) {
  }
  enterMemberDeclarator(ctx) {
  }
  exitMemberDeclarator(ctx) {
  }
  enterVirtualSpecifierSeq(ctx) {
  }
  exitVirtualSpecifierSeq(ctx) {
  }
  enterVirtualSpecifier(ctx) {
  }
  exitVirtualSpecifier(ctx) {
  }
  enterPureSpecifier(ctx) {
  }
  exitPureSpecifier(ctx) {
  }
  enterBaseClause(ctx) {
  }
  exitBaseClause(ctx) {
  }
  enterBaseSpecifierList(ctx) {
  }
  exitBaseSpecifierList(ctx) {
  }
  enterBaseSpecifier(ctx) {
  }
  exitBaseSpecifier(ctx) {
  }
  enterClassOrDeclType(ctx) {
  }
  exitClassOrDeclType(ctx) {
  }
  enterBaseTypeSpecifier(ctx) {
  }
  exitBaseTypeSpecifier(ctx) {
  }
  enterAccessSpecifier(ctx) {
  }
  exitAccessSpecifier(ctx) {
  }
  enterConversionFunctionId(ctx) {
  }
  exitConversionFunctionId(ctx) {
  }
  enterConversionTypeId(ctx) {
  }
  exitConversionTypeId(ctx) {
  }
  enterConversionDeclarator(ctx) {
  }
  exitConversionDeclarator(ctx) {
  }
  enterConstructorInitializer(ctx) {
  }
  exitConstructorInitializer(ctx) {
  }
  enterMemInitializerList(ctx) {
  }
  exitMemInitializerList(ctx) {
  }
  enterMemInitializer(ctx) {
  }
  exitMemInitializer(ctx) {
  }
  enterMeminitializerid(ctx) {
  }
  exitMeminitializerid(ctx) {
  }
  enterOperatorFunctionId(ctx) {
  }
  exitOperatorFunctionId(ctx) {
  }
  enterLiteralOperatorId(ctx) {
  }
  exitLiteralOperatorId(ctx) {
  }
  enterTemplateDeclaration(ctx) {
  }
  exitTemplateDeclaration(ctx) {
  }
  enterTemplateparameterList(ctx) {
  }
  exitTemplateparameterList(ctx) {
  }
  enterTemplateParameter(ctx) {
  }
  exitTemplateParameter(ctx) {
  }
  enterTypeParameter(ctx) {
  }
  exitTypeParameter(ctx) {
  }
  enterSimpleTemplateId(ctx) {
  }
  exitSimpleTemplateId(ctx) {
  }
  enterTemplateId(ctx) {
  }
  exitTemplateId(ctx) {
  }
  enterTemplateName(ctx) {
  }
  exitTemplateName(ctx) {
  }
  enterTemplateArgumentList(ctx) {
  }
  exitTemplateArgumentList(ctx) {
  }
  enterTemplateArgument(ctx) {
  }
  exitTemplateArgument(ctx) {
  }
  enterTypeNameSpecifier(ctx) {
  }
  exitTypeNameSpecifier(ctx) {
  }
  enterExplicitInstantiation(ctx) {
  }
  exitExplicitInstantiation(ctx) {
  }
  enterExplicitSpecialization(ctx) {
  }
  exitExplicitSpecialization(ctx) {
  }
  enterTryBlock(ctx) {
  }
  exitTryBlock(ctx) {
  }
  enterFunctionTryBlock(ctx) {
  }
  exitFunctionTryBlock(ctx) {
  }
  enterHandlerSeq(ctx) {
  }
  exitHandlerSeq(ctx) {
  }
  enterHandler(ctx) {
  }
  exitHandler(ctx) {
  }
  enterExceptionDeclaration(ctx) {
  }
  exitExceptionDeclaration(ctx) {
  }
  enterThrowExpression(ctx) {
  }
  exitThrowExpression(ctx) {
  }
  enterExceptionSpecification(ctx) {
  }
  exitExceptionSpecification(ctx) {
  }
  enterDynamicExceptionSpecification(ctx) {
  }
  exitDynamicExceptionSpecification(ctx) {
  }
  enterTypeIdList(ctx) {
  }
  exitTypeIdList(ctx) {
  }
  enterNoeExceptSpecification(ctx) {
  }
  exitNoeExceptSpecification(ctx) {
  }
  enterTheOperator(ctx) {
  }
  exitTheOperator(ctx) {
  }
  enterLiteral(ctx) {
  }
  exitLiteral(ctx) {
  }
}
module.exports = __toCommonJS(CPP14ParserListener_exports);
