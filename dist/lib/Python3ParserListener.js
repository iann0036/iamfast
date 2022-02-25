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
var Python3ParserListener_exports = {};
__export(Python3ParserListener_exports, {
  default: () => Python3ParserListener
});
var import_antlr4 = __toESM(require("antlr4"));
class Python3ParserListener extends import_antlr4.default.tree.ParseTreeListener {
  enterSingle_input(ctx) {
  }
  exitSingle_input(ctx) {
  }
  enterFile_input(ctx) {
  }
  exitFile_input(ctx) {
  }
  enterEval_input(ctx) {
  }
  exitEval_input(ctx) {
  }
  enterDecorator(ctx) {
  }
  exitDecorator(ctx) {
  }
  enterDecorators(ctx) {
  }
  exitDecorators(ctx) {
  }
  enterDecorated(ctx) {
  }
  exitDecorated(ctx) {
  }
  enterAsync_funcdef(ctx) {
  }
  exitAsync_funcdef(ctx) {
  }
  enterFuncdef(ctx) {
  }
  exitFuncdef(ctx) {
  }
  enterParameters(ctx) {
  }
  exitParameters(ctx) {
  }
  enterTypedargslist(ctx) {
  }
  exitTypedargslist(ctx) {
  }
  enterTfpdef(ctx) {
  }
  exitTfpdef(ctx) {
  }
  enterVarargslist(ctx) {
  }
  exitVarargslist(ctx) {
  }
  enterVfpdef(ctx) {
  }
  exitVfpdef(ctx) {
  }
  enterStmt(ctx) {
  }
  exitStmt(ctx) {
  }
  enterSimple_stmt(ctx) {
  }
  exitSimple_stmt(ctx) {
  }
  enterSmall_stmt(ctx) {
  }
  exitSmall_stmt(ctx) {
  }
  enterExpr_stmt(ctx) {
  }
  exitExpr_stmt(ctx) {
  }
  enterAnnassign(ctx) {
  }
  exitAnnassign(ctx) {
  }
  enterTestlist_star_expr(ctx) {
  }
  exitTestlist_star_expr(ctx) {
  }
  enterAugassign(ctx) {
  }
  exitAugassign(ctx) {
  }
  enterDel_stmt(ctx) {
  }
  exitDel_stmt(ctx) {
  }
  enterPass_stmt(ctx) {
  }
  exitPass_stmt(ctx) {
  }
  enterFlow_stmt(ctx) {
  }
  exitFlow_stmt(ctx) {
  }
  enterBreak_stmt(ctx) {
  }
  exitBreak_stmt(ctx) {
  }
  enterContinue_stmt(ctx) {
  }
  exitContinue_stmt(ctx) {
  }
  enterReturn_stmt(ctx) {
  }
  exitReturn_stmt(ctx) {
  }
  enterYield_stmt(ctx) {
  }
  exitYield_stmt(ctx) {
  }
  enterRaise_stmt(ctx) {
  }
  exitRaise_stmt(ctx) {
  }
  enterImport_stmt(ctx) {
  }
  exitImport_stmt(ctx) {
  }
  enterImport_name(ctx) {
  }
  exitImport_name(ctx) {
  }
  enterImport_from(ctx) {
  }
  exitImport_from(ctx) {
  }
  enterImport_as_name(ctx) {
  }
  exitImport_as_name(ctx) {
  }
  enterDotted_as_name(ctx) {
  }
  exitDotted_as_name(ctx) {
  }
  enterImport_as_names(ctx) {
  }
  exitImport_as_names(ctx) {
  }
  enterDotted_as_names(ctx) {
  }
  exitDotted_as_names(ctx) {
  }
  enterDotted_name(ctx) {
  }
  exitDotted_name(ctx) {
  }
  enterGlobal_stmt(ctx) {
  }
  exitGlobal_stmt(ctx) {
  }
  enterNonlocal_stmt(ctx) {
  }
  exitNonlocal_stmt(ctx) {
  }
  enterAssert_stmt(ctx) {
  }
  exitAssert_stmt(ctx) {
  }
  enterCompound_stmt(ctx) {
  }
  exitCompound_stmt(ctx) {
  }
  enterAsync_stmt(ctx) {
  }
  exitAsync_stmt(ctx) {
  }
  enterIf_stmt(ctx) {
  }
  exitIf_stmt(ctx) {
  }
  enterWhile_stmt(ctx) {
  }
  exitWhile_stmt(ctx) {
  }
  enterFor_stmt(ctx) {
  }
  exitFor_stmt(ctx) {
  }
  enterTry_stmt(ctx) {
  }
  exitTry_stmt(ctx) {
  }
  enterWith_stmt(ctx) {
  }
  exitWith_stmt(ctx) {
  }
  enterWith_item(ctx) {
  }
  exitWith_item(ctx) {
  }
  enterExcept_clause(ctx) {
  }
  exitExcept_clause(ctx) {
  }
  enterSuite(ctx) {
  }
  exitSuite(ctx) {
  }
  enterTest(ctx) {
  }
  exitTest(ctx) {
  }
  enterTest_nocond(ctx) {
  }
  exitTest_nocond(ctx) {
  }
  enterLambdef(ctx) {
  }
  exitLambdef(ctx) {
  }
  enterLambdef_nocond(ctx) {
  }
  exitLambdef_nocond(ctx) {
  }
  enterOr_test(ctx) {
  }
  exitOr_test(ctx) {
  }
  enterAnd_test(ctx) {
  }
  exitAnd_test(ctx) {
  }
  enterNot_test(ctx) {
  }
  exitNot_test(ctx) {
  }
  enterComparison(ctx) {
  }
  exitComparison(ctx) {
  }
  enterComp_op(ctx) {
  }
  exitComp_op(ctx) {
  }
  enterStar_expr(ctx) {
  }
  exitStar_expr(ctx) {
  }
  enterExpr(ctx) {
  }
  exitExpr(ctx) {
  }
  enterXor_expr(ctx) {
  }
  exitXor_expr(ctx) {
  }
  enterAnd_expr(ctx) {
  }
  exitAnd_expr(ctx) {
  }
  enterShift_expr(ctx) {
  }
  exitShift_expr(ctx) {
  }
  enterArith_expr(ctx) {
  }
  exitArith_expr(ctx) {
  }
  enterTerm(ctx) {
  }
  exitTerm(ctx) {
  }
  enterFactor(ctx) {
  }
  exitFactor(ctx) {
  }
  enterPower(ctx) {
  }
  exitPower(ctx) {
  }
  enterAtom_expr(ctx) {
  }
  exitAtom_expr(ctx) {
  }
  enterAtom(ctx) {
  }
  exitAtom(ctx) {
  }
  enterTestlist_comp(ctx) {
  }
  exitTestlist_comp(ctx) {
  }
  enterTrailer(ctx) {
  }
  exitTrailer(ctx) {
  }
  enterSubscriptlist(ctx) {
  }
  exitSubscriptlist(ctx) {
  }
  enterSubscript_(ctx) {
  }
  exitSubscript_(ctx) {
  }
  enterSliceop(ctx) {
  }
  exitSliceop(ctx) {
  }
  enterExprlist(ctx) {
  }
  exitExprlist(ctx) {
  }
  enterTestlist(ctx) {
  }
  exitTestlist(ctx) {
  }
  enterDictorsetmaker(ctx) {
  }
  exitDictorsetmaker(ctx) {
  }
  enterClassdef(ctx) {
  }
  exitClassdef(ctx) {
  }
  enterArglist(ctx) {
  }
  exitArglist(ctx) {
  }
  enterArgument(ctx) {
  }
  exitArgument(ctx) {
  }
  enterComp_iter(ctx) {
  }
  exitComp_iter(ctx) {
  }
  enterComp_for(ctx) {
  }
  exitComp_for(ctx) {
  }
  enterComp_if(ctx) {
  }
  exitComp_if(ctx) {
  }
  enterEncoding_decl(ctx) {
  }
  exitEncoding_decl(ctx) {
  }
  enterYield_expr(ctx) {
  }
  exitYield_expr(ctx) {
  }
  enterYield_arg(ctx) {
  }
  exitYield_arg(ctx) {
  }
}
module.exports = __toCommonJS(Python3ParserListener_exports);
