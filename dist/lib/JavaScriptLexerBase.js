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
var JavaScriptLexerBase_exports = {};
__export(JavaScriptLexerBase_exports, {
  default: () => JavaScriptLexerBase
});
var import_antlr4 = __toESM(require("antlr4"));
var import_JavaScriptLexer = __toESM(require("./JavaScriptLexer.js"));
class JavaScriptLexerBase extends import_antlr4.default.Lexer {
  constructor(input) {
    super(input);
    this.scopeStrictModes = new Array();
    this.lastToken = null;
    this.useStrictDefault = false;
    this.useStrictCurrent = false;
    this.templateDepth = 0;
  }
  getStrictDefault() {
    return this.useStrictDefault;
  }
  setUseStrictDefault(value) {
    this.useStrictDefault = value;
    this.useStrictCurrent = value;
  }
  IsStrictMode() {
    return this.useStrictCurrent;
  }
  IsInTemplateString() {
    return this.templateDepth > 0;
  }
  getCurrentToken() {
    return this.nextToken();
  }
  nextToken() {
    var next = super.nextToken();
    if (next.channel === import_antlr4.default.Token.DEFAULT_CHANNEL) {
      this.lastToken = next;
    }
    return next;
  }
  ProcessOpenBrace() {
    this.useStrictCurrent = this.scopeStrictModes.length > 0 && this.scopeStrictModes[this.scopeStrictModes.length - 1] ? true : this.useStrictDefault;
    this.scopeStrictModes.push(this.useStrictCurrent);
  }
  ProcessCloseBrace() {
    this.useStrictCurrent = this.scopeStrictModes.length > 0 ? this.scopeStrictModes.pop() : this.useStrictDefault;
  }
  ProcessStringLiteral() {
    if (this.lastToken === null || this.lastToken.type === import_JavaScriptLexer.default.OpenBrace) {
      if (super.text === '"use strict"' || super.text === "'use strict'") {
        if (this.scopeStrictModes.length > 0) {
          this.scopeStrictModes.pop();
        }
        this.useStrictCurrent = true;
        this.scopeStrictModes.push(this.useStrictCurrent);
      }
    }
  }
  IncreaseTemplateDepth() {
    this.templateDepth++;
  }
  DecreaseTemplateDepth() {
    this.templateDepth--;
  }
  IsRegexPossible() {
    if (this.lastToken === null) {
      return true;
    }
    switch (this.lastToken.type) {
      case import_JavaScriptLexer.default.Identifier:
      case import_JavaScriptLexer.default.NullLiteral:
      case import_JavaScriptLexer.default.BooleanLiteral:
      case import_JavaScriptLexer.default.This:
      case import_JavaScriptLexer.default.CloseBracket:
      case import_JavaScriptLexer.default.CloseParen:
      case import_JavaScriptLexer.default.OctalIntegerLiteral:
      case import_JavaScriptLexer.default.DecimalLiteral:
      case import_JavaScriptLexer.default.HexIntegerLiteral:
      case import_JavaScriptLexer.default.StringLiteral:
      case import_JavaScriptLexer.default.PlusPlus:
      case import_JavaScriptLexer.default.MinusMinus:
        return false;
      default:
        return true;
    }
  }
  IsStartOfFile() {
    return this.lastToken === null;
  }
}
module.exports = __toCommonJS(JavaScriptLexerBase_exports);
