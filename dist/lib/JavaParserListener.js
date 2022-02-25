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
var JavaParserListener_exports = {};
__export(JavaParserListener_exports, {
  default: () => JavaParserListener
});
var import_antlr4 = __toESM(require("antlr4"), 1);
class JavaParserListener extends import_antlr4.default.tree.ParseTreeListener {
  enterCompilationUnit(ctx) {
  }
  exitCompilationUnit(ctx) {
  }
  enterPackageDeclaration(ctx) {
  }
  exitPackageDeclaration(ctx) {
  }
  enterImportDeclaration(ctx) {
  }
  exitImportDeclaration(ctx) {
  }
  enterTypeDeclaration(ctx) {
  }
  exitTypeDeclaration(ctx) {
  }
  enterModifier(ctx) {
  }
  exitModifier(ctx) {
  }
  enterClassOrInterfaceModifier(ctx) {
  }
  exitClassOrInterfaceModifier(ctx) {
  }
  enterVariableModifier(ctx) {
  }
  exitVariableModifier(ctx) {
  }
  enterClassDeclaration(ctx) {
  }
  exitClassDeclaration(ctx) {
  }
  enterTypeParameters(ctx) {
  }
  exitTypeParameters(ctx) {
  }
  enterTypeParameter(ctx) {
  }
  exitTypeParameter(ctx) {
  }
  enterTypeBound(ctx) {
  }
  exitTypeBound(ctx) {
  }
  enterEnumDeclaration(ctx) {
  }
  exitEnumDeclaration(ctx) {
  }
  enterEnumConstants(ctx) {
  }
  exitEnumConstants(ctx) {
  }
  enterEnumConstant(ctx) {
  }
  exitEnumConstant(ctx) {
  }
  enterEnumBodyDeclarations(ctx) {
  }
  exitEnumBodyDeclarations(ctx) {
  }
  enterInterfaceDeclaration(ctx) {
  }
  exitInterfaceDeclaration(ctx) {
  }
  enterClassBody(ctx) {
  }
  exitClassBody(ctx) {
  }
  enterInterfaceBody(ctx) {
  }
  exitInterfaceBody(ctx) {
  }
  enterClassBodyDeclaration(ctx) {
  }
  exitClassBodyDeclaration(ctx) {
  }
  enterMemberDeclaration(ctx) {
  }
  exitMemberDeclaration(ctx) {
  }
  enterMethodDeclaration(ctx) {
  }
  exitMethodDeclaration(ctx) {
  }
  enterMethodBody(ctx) {
  }
  exitMethodBody(ctx) {
  }
  enterTypeTypeOrVoid(ctx) {
  }
  exitTypeTypeOrVoid(ctx) {
  }
  enterGenericMethodDeclaration(ctx) {
  }
  exitGenericMethodDeclaration(ctx) {
  }
  enterGenericConstructorDeclaration(ctx) {
  }
  exitGenericConstructorDeclaration(ctx) {
  }
  enterConstructorDeclaration(ctx) {
  }
  exitConstructorDeclaration(ctx) {
  }
  enterFieldDeclaration(ctx) {
  }
  exitFieldDeclaration(ctx) {
  }
  enterInterfaceBodyDeclaration(ctx) {
  }
  exitInterfaceBodyDeclaration(ctx) {
  }
  enterInterfaceMemberDeclaration(ctx) {
  }
  exitInterfaceMemberDeclaration(ctx) {
  }
  enterConstDeclaration(ctx) {
  }
  exitConstDeclaration(ctx) {
  }
  enterConstantDeclarator(ctx) {
  }
  exitConstantDeclarator(ctx) {
  }
  enterInterfaceMethodDeclaration(ctx) {
  }
  exitInterfaceMethodDeclaration(ctx) {
  }
  enterInterfaceMethodModifier(ctx) {
  }
  exitInterfaceMethodModifier(ctx) {
  }
  enterGenericInterfaceMethodDeclaration(ctx) {
  }
  exitGenericInterfaceMethodDeclaration(ctx) {
  }
  enterInterfaceCommonBodyDeclaration(ctx) {
  }
  exitInterfaceCommonBodyDeclaration(ctx) {
  }
  enterVariableDeclarators(ctx) {
  }
  exitVariableDeclarators(ctx) {
  }
  enterVariableDeclarator(ctx) {
  }
  exitVariableDeclarator(ctx) {
  }
  enterVariableDeclaratorId(ctx) {
  }
  exitVariableDeclaratorId(ctx) {
  }
  enterVariableInitializer(ctx) {
  }
  exitVariableInitializer(ctx) {
  }
  enterArrayInitializer(ctx) {
  }
  exitArrayInitializer(ctx) {
  }
  enterClassOrInterfaceType(ctx) {
  }
  exitClassOrInterfaceType(ctx) {
  }
  enterTypeArgument(ctx) {
  }
  exitTypeArgument(ctx) {
  }
  enterQualifiedNameList(ctx) {
  }
  exitQualifiedNameList(ctx) {
  }
  enterFormalParameters(ctx) {
  }
  exitFormalParameters(ctx) {
  }
  enterReceiverParameter(ctx) {
  }
  exitReceiverParameter(ctx) {
  }
  enterFormalParameterList(ctx) {
  }
  exitFormalParameterList(ctx) {
  }
  enterFormalParameter(ctx) {
  }
  exitFormalParameter(ctx) {
  }
  enterLastFormalParameter(ctx) {
  }
  exitLastFormalParameter(ctx) {
  }
  enterLambdaLVTIList(ctx) {
  }
  exitLambdaLVTIList(ctx) {
  }
  enterLambdaLVTIParameter(ctx) {
  }
  exitLambdaLVTIParameter(ctx) {
  }
  enterQualifiedName(ctx) {
  }
  exitQualifiedName(ctx) {
  }
  enterLiteral(ctx) {
  }
  exitLiteral(ctx) {
  }
  enterIntegerLiteral(ctx) {
  }
  exitIntegerLiteral(ctx) {
  }
  enterFloatLiteral(ctx) {
  }
  exitFloatLiteral(ctx) {
  }
  enterAltAnnotationQualifiedName(ctx) {
  }
  exitAltAnnotationQualifiedName(ctx) {
  }
  enterAnnotation(ctx) {
  }
  exitAnnotation(ctx) {
  }
  enterElementValuePairs(ctx) {
  }
  exitElementValuePairs(ctx) {
  }
  enterElementValuePair(ctx) {
  }
  exitElementValuePair(ctx) {
  }
  enterElementValue(ctx) {
  }
  exitElementValue(ctx) {
  }
  enterElementValueArrayInitializer(ctx) {
  }
  exitElementValueArrayInitializer(ctx) {
  }
  enterAnnotationTypeDeclaration(ctx) {
  }
  exitAnnotationTypeDeclaration(ctx) {
  }
  enterAnnotationTypeBody(ctx) {
  }
  exitAnnotationTypeBody(ctx) {
  }
  enterAnnotationTypeElementDeclaration(ctx) {
  }
  exitAnnotationTypeElementDeclaration(ctx) {
  }
  enterAnnotationTypeElementRest(ctx) {
  }
  exitAnnotationTypeElementRest(ctx) {
  }
  enterAnnotationMethodOrConstantRest(ctx) {
  }
  exitAnnotationMethodOrConstantRest(ctx) {
  }
  enterAnnotationMethodRest(ctx) {
  }
  exitAnnotationMethodRest(ctx) {
  }
  enterAnnotationConstantRest(ctx) {
  }
  exitAnnotationConstantRest(ctx) {
  }
  enterDefaultValue(ctx) {
  }
  exitDefaultValue(ctx) {
  }
  enterModuleDeclaration(ctx) {
  }
  exitModuleDeclaration(ctx) {
  }
  enterModuleBody(ctx) {
  }
  exitModuleBody(ctx) {
  }
  enterModuleDirective(ctx) {
  }
  exitModuleDirective(ctx) {
  }
  enterRequiresModifier(ctx) {
  }
  exitRequiresModifier(ctx) {
  }
  enterRecordDeclaration(ctx) {
  }
  exitRecordDeclaration(ctx) {
  }
  enterRecordHeader(ctx) {
  }
  exitRecordHeader(ctx) {
  }
  enterRecordComponentList(ctx) {
  }
  exitRecordComponentList(ctx) {
  }
  enterRecordComponent(ctx) {
  }
  exitRecordComponent(ctx) {
  }
  enterRecordBody(ctx) {
  }
  exitRecordBody(ctx) {
  }
  enterBlock(ctx) {
  }
  exitBlock(ctx) {
  }
  enterBlockStatement(ctx) {
  }
  exitBlockStatement(ctx) {
  }
  enterLocalVariableDeclaration(ctx) {
  }
  exitLocalVariableDeclaration(ctx) {
  }
  enterIdentifier(ctx) {
  }
  exitIdentifier(ctx) {
  }
  enterLocalTypeDeclaration(ctx) {
  }
  exitLocalTypeDeclaration(ctx) {
  }
  enterStatement(ctx) {
  }
  exitStatement(ctx) {
  }
  enterCatchClause(ctx) {
  }
  exitCatchClause(ctx) {
  }
  enterCatchType(ctx) {
  }
  exitCatchType(ctx) {
  }
  enterFinallyBlock(ctx) {
  }
  exitFinallyBlock(ctx) {
  }
  enterResourceSpecification(ctx) {
  }
  exitResourceSpecification(ctx) {
  }
  enterResources(ctx) {
  }
  exitResources(ctx) {
  }
  enterResource(ctx) {
  }
  exitResource(ctx) {
  }
  enterSwitchBlockStatementGroup(ctx) {
  }
  exitSwitchBlockStatementGroup(ctx) {
  }
  enterSwitchLabel(ctx) {
  }
  exitSwitchLabel(ctx) {
  }
  enterForControl(ctx) {
  }
  exitForControl(ctx) {
  }
  enterForInit(ctx) {
  }
  exitForInit(ctx) {
  }
  enterEnhancedForControl(ctx) {
  }
  exitEnhancedForControl(ctx) {
  }
  enterParExpression(ctx) {
  }
  exitParExpression(ctx) {
  }
  enterExpressionList(ctx) {
  }
  exitExpressionList(ctx) {
  }
  enterMethodCall(ctx) {
  }
  exitMethodCall(ctx) {
  }
  enterExpression(ctx) {
  }
  exitExpression(ctx) {
  }
  enterPattern(ctx) {
  }
  exitPattern(ctx) {
  }
  enterLambdaExpression(ctx) {
  }
  exitLambdaExpression(ctx) {
  }
  enterLambdaParameters(ctx) {
  }
  exitLambdaParameters(ctx) {
  }
  enterLambdaBody(ctx) {
  }
  exitLambdaBody(ctx) {
  }
  enterPrimary(ctx) {
  }
  exitPrimary(ctx) {
  }
  enterSwitchExpression(ctx) {
  }
  exitSwitchExpression(ctx) {
  }
  enterSwitchLabeledRule(ctx) {
  }
  exitSwitchLabeledRule(ctx) {
  }
  enterGuardedPattern(ctx) {
  }
  exitGuardedPattern(ctx) {
  }
  enterSwitchRuleOutcome(ctx) {
  }
  exitSwitchRuleOutcome(ctx) {
  }
  enterClassType(ctx) {
  }
  exitClassType(ctx) {
  }
  enterCreator(ctx) {
  }
  exitCreator(ctx) {
  }
  enterCreatedName(ctx) {
  }
  exitCreatedName(ctx) {
  }
  enterInnerCreator(ctx) {
  }
  exitInnerCreator(ctx) {
  }
  enterArrayCreatorRest(ctx) {
  }
  exitArrayCreatorRest(ctx) {
  }
  enterClassCreatorRest(ctx) {
  }
  exitClassCreatorRest(ctx) {
  }
  enterExplicitGenericInvocation(ctx) {
  }
  exitExplicitGenericInvocation(ctx) {
  }
  enterTypeArgumentsOrDiamond(ctx) {
  }
  exitTypeArgumentsOrDiamond(ctx) {
  }
  enterNonWildcardTypeArgumentsOrDiamond(ctx) {
  }
  exitNonWildcardTypeArgumentsOrDiamond(ctx) {
  }
  enterNonWildcardTypeArguments(ctx) {
  }
  exitNonWildcardTypeArguments(ctx) {
  }
  enterTypeList(ctx) {
  }
  exitTypeList(ctx) {
  }
  enterTypeType(ctx) {
  }
  exitTypeType(ctx) {
  }
  enterPrimitiveType(ctx) {
  }
  exitPrimitiveType(ctx) {
  }
  enterTypeArguments(ctx) {
  }
  exitTypeArguments(ctx) {
  }
  enterSuperSuffix(ctx) {
  }
  exitSuperSuffix(ctx) {
  }
  enterExplicitGenericInvocationSuffix(ctx) {
  }
  exitExplicitGenericInvocationSuffix(ctx) {
  }
  enterArguments(ctx) {
  }
  exitArguments(ctx) {
  }
}
module.exports = __toCommonJS(JavaParserListener_exports);
