#!/usr/bin/env node
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
var AWSParser_exports = {};
__export(AWSParser_exports, {
  default: () => AWSParser
});
var import_antlr4 = __toESM(require("antlr4"), 1);
var import_JavaScriptLexer = __toESM(require("./lib/JavaScriptLexer.js"), 1);
var import_JavaScriptParser = __toESM(require("./lib/JavaScriptParser.js"), 1);
var import_JavaScriptAWSListener = __toESM(require("./lib/JavaScriptAWSListener.js"), 1);
var import_Python3Lexer = __toESM(require("./lib/Python3Lexer.js"), 1);
var import_Python3Parser = __toESM(require("./lib/Python3Parser.js"), 1);
var import_Python3AWSListener = __toESM(require("./lib/Python3AWSListener.js"), 1);
var import_JavaLexer = __toESM(require("./lib/JavaLexer.js"), 1);
var import_JavaParser = __toESM(require("./lib/JavaParser.js"), 1);
var import_JavaAWSListener = __toESM(require("./lib/JavaAWSListener.js"), 1);
var import_CPP14Lexer = __toESM(require("./lib/CPP14Lexer.js"), 1);
var import_CPP14Parser = __toESM(require("./lib/CPP14Parser.js"), 1);
var import_CPP14AWSListener = __toESM(require("./lib/CPP14AWSListener.js"), 1);
var import_GoLexer = __toESM(require("./lib/GoLexer.js"), 1);
var import_GoParser = __toESM(require("./lib/GoParser.js"), 1);
var import_GoAWSListener = __toESM(require("./lib/GoAWSListener.js"), 1);
class AWSParser {
  constructor() {
    this.client_calls = [];
    this.debug = false;
  }
  treeWalker(tree, depth) {
    console.log(" ".repeat(depth * 2) + tree.constructor.name + " - " + tree.getText().substr(0, 50));
    if (tree.children) {
      for (let child of tree.children) {
        this.treeWalker(child, depth + 1);
      }
    }
  }
  ParseInput(input, language) {
    let lexer, tokens, parser, tree, listener;
    input += "\n";
    let chars = new import_antlr4.default.InputStream(input);
    switch (language) {
      case "js":
        lexer = new import_JavaScriptLexer.default(chars);
        lexer.strictMode = false;
        tokens = new import_antlr4.default.CommonTokenStream(lexer);
        parser = new import_JavaScriptParser.default(tokens);
        parser.buildParseTrees = true;
        tree = parser.program();
        this.debug && this.treeWalker(tree, 0);
        listener = new import_JavaScriptAWSListener.default();
        import_antlr4.default.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);
        this.client_calls = listener.ClientCalls;
        this.debug && console.log(listener);
        break;
      case "python":
        lexer = new import_Python3Lexer.default(chars);
        lexer.strictMode = false;
        tokens = new import_antlr4.default.CommonTokenStream(lexer);
        parser = new import_Python3Parser.default(tokens);
        parser.buildParseTrees = true;
        tree = parser.file_input();
        this.debug && this.treeWalker(tree, 0);
        listener = new import_Python3AWSListener.default();
        import_antlr4.default.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);
        this.client_calls = listener.ClientCalls;
        this.debug && console.log(listener);
        break;
      case "java":
        lexer = new import_JavaLexer.default(chars);
        lexer.strictMode = false;
        tokens = new import_antlr4.default.CommonTokenStream(lexer);
        parser = new import_JavaParser.default(tokens);
        parser.buildParseTrees = true;
        tree = parser.compilationUnit();
        this.debug && this.treeWalker(tree, 0);
        listener = new import_JavaAWSListener.default();
        import_antlr4.default.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);
        this.client_calls = listener.ClientCalls;
        this.debug && console.log(listener);
        break;
      case "go":
        lexer = new import_GoLexer.default(chars);
        lexer.strictMode = false;
        tokens = new import_antlr4.default.CommonTokenStream(lexer);
        parser = new import_GoParser.default(tokens);
        parser.buildParseTrees = true;
        tree = parser.sourceFile();
        this.debug && this.treeWalker(tree, 0);
        listener = new import_GoAWSListener.default();
        import_antlr4.default.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);
        this.client_calls = listener.ClientCalls;
        this.debug && console.log(listener);
        break;
      case "cplusplus":
        lexer = new import_CPP14Lexer.default(chars);
        lexer.strictMode = false;
        tokens = new import_antlr4.default.CommonTokenStream(lexer);
        parser = new import_CPP14Parser.default(tokens);
        parser.buildParseTrees = true;
        tree = parser.translationUnit();
        this.debug && this.treeWalker(tree, 0);
        listener = new import_CPP14AWSListener.default();
        import_antlr4.default.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);
        this.client_calls = listener.ClientCalls;
        this.debug && console.log(listener);
        break;
      default:
        throw "Unknown language";
    }
  }
  GetNormalizedServiceCalls() {
    let calls = [];
    for (let client_call of this.client_calls) {
      let method = client_call.method.substr(0, 1).toUpperCase() + client_call.method.substr(1).replace(/_([a-z0-9])/g, (match, p1) => p1.toUpperCase());
      calls.push({
        "service": client_call.client.type.toLowerCase(),
        "method": method,
        "params": client_call.args
      });
    }
    return calls;
  }
}
module.exports = __toCommonJS(AWSParser_exports);
