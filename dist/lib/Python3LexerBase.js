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
var Python3LexerBase_exports = {};
__export(Python3LexerBase_exports, {
  default: () => Python3LexerBase
});
var import_antlr4 = __toESM(require("antlr4"));
var import_Python3Parser = __toESM(require("./Python3Parser.js"));
class Python3LexerBase extends import_antlr4.default.Lexer {
  constructor(input) {
    super(input);
    this.tokens = [];
    this.indents = [];
    this.opened = 0;
  }
  reset() {
    this.tokens = [];
    this.indents = [];
    this.opened = 0;
    super.reset();
  }
  emitToken(token) {
    this._token = token;
    this.tokens.push(token);
  }
  nextToken() {
    if (this._input.LA(1) === import_Python3Parser.default.EOF && this.indents.length) {
      this.tokens = this.tokens.filter(function(val) {
        return val.type !== import_Python3Parser.default.EOF;
      });
      this.emitToken(this.commonToken(import_Python3Parser.default.NEWLINE, "\n"));
      while (this.indents.length) {
        this.emitToken(this.createDedent());
        this.indents.pop();
      }
      this.emitToken(this.commonToken(import_Python3Parser.default.EOF, "<EOF>"));
    }
    let next = super.nextToken();
    return this.tokens.length ? this.tokens.shift() : next;
  }
  createDedent() {
    return this.commonToken(import_Python3Parser.default.DEDENT, "");
  }
  commonToken(type, text) {
    let stop = this.getCharIndex() - 1;
    let start = text.length ? stop - text.length + 1 : stop;
    return new import_antlr4.default.CommonToken(this._tokenFactorySourcePair, type, import_antlr4.default.Lexer.DEFAULT_TOKEN_CHANNEL, start, stop);
  }
  getIndentationCount(whitespace) {
    let count = 0;
    for (let i = 0; i < whitespace.length; i++) {
      if (whitespace[i] === "	") {
        count += 8 - count % 8;
      } else {
        count++;
      }
    }
    return count;
  }
  getIndentationCount(whitespace) {
    let count = 0;
    for (let i = 0; i < whitespace.length; i++) {
      if (whitespace[i] === "	") {
        count += 8 - count % 8;
      } else {
        count++;
      }
    }
    return count;
  }
  atStartOfInput() {
    return this.getCharIndex() === 0;
  }
  openBrace() {
    this.opened++;
  }
  closeBrace() {
    this.opened--;
  }
  onNewLine() {
    let newLine = this.text.replace(/[^\r\n]+/g, "");
    let spaces = this.text.replace(/[\r\n]+/g, "");
    let next = this._input.LA(1);
    let nextnext = this._input.LA(2);
    if (this.opened > 0 || nextnext != -1 && (next === 13 || next === 10 || next === 35)) {
      this.skip();
    } else {
      this.emitToken(this.commonToken(import_Python3Parser.default.NEWLINE, newLine));
      let indent = this.getIndentationCount(spaces);
      let previous = this.indents.length ? this.indents[this.indents.length - 1] : 0;
      if (indent === previous) {
        this.skip();
      } else if (indent > previous) {
        this.indents.push(indent);
        this.emitToken(this.commonToken(import_Python3Parser.default.INDENT, spaces));
      } else {
        while (this.indents.length && this.indents[this.indents.length - 1] > indent) {
          this.emitToken(this.createDedent());
          this.indents.pop();
        }
      }
    }
  }
}
module.exports = __toCommonJS(Python3LexerBase_exports);
