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
var JavaParserVisitor_exports = {};
__export(JavaParserVisitor_exports, {
  default: () => JavaParserVisitor
});
var import_antlr4 = __toESM(require("antlr4"));
class JavaParserVisitor extends import_antlr4.default.tree.ParseTreeVisitor {
  visitCompilationUnit(ctx) {
    return this.visitChildren(ctx);
  }
  visitPackageDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitImportDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitModifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassOrInterfaceModifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitVariableModifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeParameters(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeParameter(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeBound(ctx) {
    return this.visitChildren(ctx);
  }
  visitEnumDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitEnumConstants(ctx) {
    return this.visitChildren(ctx);
  }
  visitEnumConstant(ctx) {
    return this.visitChildren(ctx);
  }
  visitEnumBodyDeclarations(ctx) {
    return this.visitChildren(ctx);
  }
  visitInterfaceDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassBody(ctx) {
    return this.visitChildren(ctx);
  }
  visitInterfaceBody(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassBodyDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitMemberDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitMethodDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitMethodBody(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeTypeOrVoid(ctx) {
    return this.visitChildren(ctx);
  }
  visitGenericMethodDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitGenericConstructorDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitConstructorDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitFieldDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitInterfaceBodyDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitInterfaceMemberDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitConstDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitConstantDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitInterfaceMethodDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitInterfaceMethodModifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitGenericInterfaceMethodDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitInterfaceCommonBodyDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitVariableDeclarators(ctx) {
    return this.visitChildren(ctx);
  }
  visitVariableDeclarator(ctx) {
    return this.visitChildren(ctx);
  }
  visitVariableDeclaratorId(ctx) {
    return this.visitChildren(ctx);
  }
  visitVariableInitializer(ctx) {
    return this.visitChildren(ctx);
  }
  visitArrayInitializer(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassOrInterfaceType(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeArgument(ctx) {
    return this.visitChildren(ctx);
  }
  visitQualifiedNameList(ctx) {
    return this.visitChildren(ctx);
  }
  visitFormalParameters(ctx) {
    return this.visitChildren(ctx);
  }
  visitReceiverParameter(ctx) {
    return this.visitChildren(ctx);
  }
  visitFormalParameterList(ctx) {
    return this.visitChildren(ctx);
  }
  visitFormalParameter(ctx) {
    return this.visitChildren(ctx);
  }
  visitLastFormalParameter(ctx) {
    return this.visitChildren(ctx);
  }
  visitLambdaLVTIList(ctx) {
    return this.visitChildren(ctx);
  }
  visitLambdaLVTIParameter(ctx) {
    return this.visitChildren(ctx);
  }
  visitQualifiedName(ctx) {
    return this.visitChildren(ctx);
  }
  visitLiteral(ctx) {
    return this.visitChildren(ctx);
  }
  visitIntegerLiteral(ctx) {
    return this.visitChildren(ctx);
  }
  visitFloatLiteral(ctx) {
    return this.visitChildren(ctx);
  }
  visitAltAnnotationQualifiedName(ctx) {
    return this.visitChildren(ctx);
  }
  visitAnnotation(ctx) {
    return this.visitChildren(ctx);
  }
  visitElementValuePairs(ctx) {
    return this.visitChildren(ctx);
  }
  visitElementValuePair(ctx) {
    return this.visitChildren(ctx);
  }
  visitElementValue(ctx) {
    return this.visitChildren(ctx);
  }
  visitElementValueArrayInitializer(ctx) {
    return this.visitChildren(ctx);
  }
  visitAnnotationTypeDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitAnnotationTypeBody(ctx) {
    return this.visitChildren(ctx);
  }
  visitAnnotationTypeElementDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitAnnotationTypeElementRest(ctx) {
    return this.visitChildren(ctx);
  }
  visitAnnotationMethodOrConstantRest(ctx) {
    return this.visitChildren(ctx);
  }
  visitAnnotationMethodRest(ctx) {
    return this.visitChildren(ctx);
  }
  visitAnnotationConstantRest(ctx) {
    return this.visitChildren(ctx);
  }
  visitDefaultValue(ctx) {
    return this.visitChildren(ctx);
  }
  visitModuleDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitModuleBody(ctx) {
    return this.visitChildren(ctx);
  }
  visitModuleDirective(ctx) {
    return this.visitChildren(ctx);
  }
  visitRequiresModifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitRecordDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitRecordHeader(ctx) {
    return this.visitChildren(ctx);
  }
  visitRecordComponentList(ctx) {
    return this.visitChildren(ctx);
  }
  visitRecordComponent(ctx) {
    return this.visitChildren(ctx);
  }
  visitRecordBody(ctx) {
    return this.visitChildren(ctx);
  }
  visitBlock(ctx) {
    return this.visitChildren(ctx);
  }
  visitBlockStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitLocalVariableDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitIdentifier(ctx) {
    return this.visitChildren(ctx);
  }
  visitLocalTypeDeclaration(ctx) {
    return this.visitChildren(ctx);
  }
  visitStatement(ctx) {
    return this.visitChildren(ctx);
  }
  visitCatchClause(ctx) {
    return this.visitChildren(ctx);
  }
  visitCatchType(ctx) {
    return this.visitChildren(ctx);
  }
  visitFinallyBlock(ctx) {
    return this.visitChildren(ctx);
  }
  visitResourceSpecification(ctx) {
    return this.visitChildren(ctx);
  }
  visitResources(ctx) {
    return this.visitChildren(ctx);
  }
  visitResource(ctx) {
    return this.visitChildren(ctx);
  }
  visitSwitchBlockStatementGroup(ctx) {
    return this.visitChildren(ctx);
  }
  visitSwitchLabel(ctx) {
    return this.visitChildren(ctx);
  }
  visitForControl(ctx) {
    return this.visitChildren(ctx);
  }
  visitForInit(ctx) {
    return this.visitChildren(ctx);
  }
  visitEnhancedForControl(ctx) {
    return this.visitChildren(ctx);
  }
  visitParExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitExpressionList(ctx) {
    return this.visitChildren(ctx);
  }
  visitMethodCall(ctx) {
    return this.visitChildren(ctx);
  }
  visitExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitPattern(ctx) {
    return this.visitChildren(ctx);
  }
  visitLambdaExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitLambdaParameters(ctx) {
    return this.visitChildren(ctx);
  }
  visitLambdaBody(ctx) {
    return this.visitChildren(ctx);
  }
  visitPrimary(ctx) {
    return this.visitChildren(ctx);
  }
  visitSwitchExpression(ctx) {
    return this.visitChildren(ctx);
  }
  visitSwitchLabeledRule(ctx) {
    return this.visitChildren(ctx);
  }
  visitGuardedPattern(ctx) {
    return this.visitChildren(ctx);
  }
  visitSwitchRuleOutcome(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassType(ctx) {
    return this.visitChildren(ctx);
  }
  visitCreator(ctx) {
    return this.visitChildren(ctx);
  }
  visitCreatedName(ctx) {
    return this.visitChildren(ctx);
  }
  visitInnerCreator(ctx) {
    return this.visitChildren(ctx);
  }
  visitArrayCreatorRest(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassCreatorRest(ctx) {
    return this.visitChildren(ctx);
  }
  visitExplicitGenericInvocation(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeArgumentsOrDiamond(ctx) {
    return this.visitChildren(ctx);
  }
  visitNonWildcardTypeArgumentsOrDiamond(ctx) {
    return this.visitChildren(ctx);
  }
  visitNonWildcardTypeArguments(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeList(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeType(ctx) {
    return this.visitChildren(ctx);
  }
  visitPrimitiveType(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypeArguments(ctx) {
    return this.visitChildren(ctx);
  }
  visitSuperSuffix(ctx) {
    return this.visitChildren(ctx);
  }
  visitExplicitGenericInvocationSuffix(ctx) {
    return this.visitChildren(ctx);
  }
  visitArguments(ctx) {
    return this.visitChildren(ctx);
  }
}
module.exports = __toCommonJS(JavaParserVisitor_exports);
