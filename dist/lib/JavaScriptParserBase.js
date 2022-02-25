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
var JavaScriptParserBase_exports = {};
__export(JavaScriptParserBase_exports, {
  default: () => JavaScriptParserBase
});
var import_antlr4 = __toESM(require("antlr4"));
var import_JavaScriptParser = __toESM(require("./JavaScriptParser.js"));
class JavaScriptParserBase extends import_antlr4.default.Parser {
  constructor(input) {
    super(input);
  }
  p(str) {
    return this.prev(str);
  }
  prev(str) {
    return this._input.LT(-1).text === str;
  }
  n(str) {
    return this.next(str);
  }
  next(str) {
    return this._input.LT(1).text === str;
  }
  notLineTerminator() {
    return !this.here(import_JavaScriptParser.default.LineTerminator);
  }
  notOpenBraceAndNotFunction() {
    const nextTokenType = this._input.LT(1).type;
    return nextTokenType !== import_JavaScriptParser.default.OpenBrace && nextTokenType !== import_JavaScriptParser.default.Function_;
  }
  closeBrace() {
    return this._input.LT(1).type === import_JavaScriptParser.default.CloseBrace;
  }
  here(type) {
    const possibleIndexEosToken = this.getCurrentToken().tokenIndex - 1;
    const ahead = this._input.get(possibleIndexEosToken);
    return ahead.channel === import_antlr4.default.Lexer.HIDDEN && ahead.type === type;
  }
  lineTerminatorAhead() {
    let possibleIndexEosToken = this.getCurrentToken().tokenIndex - 1;
    let ahead = this._input.get(possibleIndexEosToken);
    if (ahead.channel !== import_antlr4.default.Lexer.HIDDEN) {
      return false;
    }
    if (ahead.type === import_JavaScriptParser.default.LineTerminator) {
      return true;
    }
    if (ahead.type === import_JavaScriptParser.default.WhiteSpaces) {
      possibleIndexEosToken = this.getCurrentToken().tokenIndex - 2;
      ahead = this._input.get(possibleIndexEosToken);
    }
    const text = ahead.text;
    const type = ahead.type;
    return type === import_JavaScriptParser.default.MultiLineComment && (text.includes("\r") || text.includes("\n")) || type === import_JavaScriptParser.default.LineTerminator;
  }
}
module.exports = __toCommonJS(JavaScriptParserBase_exports);
