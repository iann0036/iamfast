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
var Python3ParserVisitor_exports = {};
__export(Python3ParserVisitor_exports, {
  default: () => Python3ParserVisitor
});
var import_antlr4 = __toESM(require("antlr4"), 1);
class Python3ParserVisitor extends import_antlr4.default.tree.ParseTreeVisitor {
  visitSingle_input(ctx) {
    return this.visitChildren(ctx);
  }
  visitFile_input(ctx) {
    return this.visitChildren(ctx);
  }
  visitEval_input(ctx) {
    return this.visitChildren(ctx);
  }
  visitDecorator(ctx) {
    return this.visitChildren(ctx);
  }
  visitDecorators(ctx) {
    return this.visitChildren(ctx);
  }
  visitDecorated(ctx) {
    return this.visitChildren(ctx);
  }
  visitAsync_funcdef(ctx) {
    return this.visitChildren(ctx);
  }
  visitFuncdef(ctx) {
    return this.visitChildren(ctx);
  }
  visitParameters(ctx) {
    return this.visitChildren(ctx);
  }
  visitTypedargslist(ctx) {
    return this.visitChildren(ctx);
  }
  visitTfpdef(ctx) {
    return this.visitChildren(ctx);
  }
  visitVarargslist(ctx) {
    return this.visitChildren(ctx);
  }
  visitVfpdef(ctx) {
    return this.visitChildren(ctx);
  }
  visitStmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitSimple_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitSmall_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitExpr_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitAnnassign(ctx) {
    return this.visitChildren(ctx);
  }
  visitTestlist_star_expr(ctx) {
    return this.visitChildren(ctx);
  }
  visitAugassign(ctx) {
    return this.visitChildren(ctx);
  }
  visitDel_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitPass_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitFlow_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitBreak_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitContinue_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitReturn_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitYield_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitRaise_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitImport_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitImport_name(ctx) {
    return this.visitChildren(ctx);
  }
  visitImport_from(ctx) {
    return this.visitChildren(ctx);
  }
  visitImport_as_name(ctx) {
    return this.visitChildren(ctx);
  }
  visitDotted_as_name(ctx) {
    return this.visitChildren(ctx);
  }
  visitImport_as_names(ctx) {
    return this.visitChildren(ctx);
  }
  visitDotted_as_names(ctx) {
    return this.visitChildren(ctx);
  }
  visitDotted_name(ctx) {
    return this.visitChildren(ctx);
  }
  visitGlobal_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitNonlocal_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitAssert_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitCompound_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitAsync_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitIf_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitWhile_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitFor_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitTry_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitWith_stmt(ctx) {
    return this.visitChildren(ctx);
  }
  visitWith_item(ctx) {
    return this.visitChildren(ctx);
  }
  visitExcept_clause(ctx) {
    return this.visitChildren(ctx);
  }
  visitSuite(ctx) {
    return this.visitChildren(ctx);
  }
  visitTest(ctx) {
    return this.visitChildren(ctx);
  }
  visitTest_nocond(ctx) {
    return this.visitChildren(ctx);
  }
  visitLambdef(ctx) {
    return this.visitChildren(ctx);
  }
  visitLambdef_nocond(ctx) {
    return this.visitChildren(ctx);
  }
  visitOr_test(ctx) {
    return this.visitChildren(ctx);
  }
  visitAnd_test(ctx) {
    return this.visitChildren(ctx);
  }
  visitNot_test(ctx) {
    return this.visitChildren(ctx);
  }
  visitComparison(ctx) {
    return this.visitChildren(ctx);
  }
  visitComp_op(ctx) {
    return this.visitChildren(ctx);
  }
  visitStar_expr(ctx) {
    return this.visitChildren(ctx);
  }
  visitExpr(ctx) {
    return this.visitChildren(ctx);
  }
  visitXor_expr(ctx) {
    return this.visitChildren(ctx);
  }
  visitAnd_expr(ctx) {
    return this.visitChildren(ctx);
  }
  visitShift_expr(ctx) {
    return this.visitChildren(ctx);
  }
  visitArith_expr(ctx) {
    return this.visitChildren(ctx);
  }
  visitTerm(ctx) {
    return this.visitChildren(ctx);
  }
  visitFactor(ctx) {
    return this.visitChildren(ctx);
  }
  visitPower(ctx) {
    return this.visitChildren(ctx);
  }
  visitAtom_expr(ctx) {
    return this.visitChildren(ctx);
  }
  visitAtom(ctx) {
    return this.visitChildren(ctx);
  }
  visitTestlist_comp(ctx) {
    return this.visitChildren(ctx);
  }
  visitTrailer(ctx) {
    return this.visitChildren(ctx);
  }
  visitSubscriptlist(ctx) {
    return this.visitChildren(ctx);
  }
  visitSubscript_(ctx) {
    return this.visitChildren(ctx);
  }
  visitSliceop(ctx) {
    return this.visitChildren(ctx);
  }
  visitExprlist(ctx) {
    return this.visitChildren(ctx);
  }
  visitTestlist(ctx) {
    return this.visitChildren(ctx);
  }
  visitDictorsetmaker(ctx) {
    return this.visitChildren(ctx);
  }
  visitClassdef(ctx) {
    return this.visitChildren(ctx);
  }
  visitArglist(ctx) {
    return this.visitChildren(ctx);
  }
  visitArgument(ctx) {
    return this.visitChildren(ctx);
  }
  visitComp_iter(ctx) {
    return this.visitChildren(ctx);
  }
  visitComp_for(ctx) {
    return this.visitChildren(ctx);
  }
  visitComp_if(ctx) {
    return this.visitChildren(ctx);
  }
  visitEncoding_decl(ctx) {
    return this.visitChildren(ctx);
  }
  visitYield_expr(ctx) {
    return this.visitChildren(ctx);
  }
  visitYield_arg(ctx) {
    return this.visitChildren(ctx);
  }
}
module.exports = __toCommonJS(Python3ParserVisitor_exports);
