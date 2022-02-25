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
var JavaAWSListener_exports = {};
__export(JavaAWSListener_exports, {
  default: () => JavaAWSListener
});
var import_JavaParser = __toESM(require("./JavaParser.js"));
var import_JavaParserListener = __toESM(require("./JavaParserListener.js"));
class JavaAWSListener extends import_JavaParserListener.default {
  constructor() {
    super();
    this.SDKDeclarations = [];
    this.ClientDeclarations = [];
    this.ClientCalls = [];
    this.VariableDeclarations = [];
  }
  exitImportDeclaration(ctx) {
    let importString = ctx.children[1].getText();
    let matchString = importString.match(/^software\.amazon\.awssdk\.services\.([a-zA-Z0-9]+)\.(([a-zA-Z0-9]+)Client)$/);
    if (matchString) {
      if (matchString[1].toLowerCase() == matchString[3].toLowerCase()) {
        this.SDKDeclarations.push({
          "variable": matchString[2],
          "service": matchString[1].toLowerCase()
        });
      }
    }
  }
  exitLocalVariableDeclaration(ctx) {
    if (ctx.children.length == 2 && ctx.children[0] instanceof import_JavaParser.default.TypeTypeContext && ctx.children[1] instanceof import_JavaParser.default.VariableDeclaratorsContext) {
      for (let declerator of ctx.children[1].children) {
        if (declerator instanceof import_JavaParser.default.VariableDeclaratorContext) {
          if (declerator.children.length == 3) {
            let assignable = declerator.children[0];
            if (declerator.children[2].children && declerator.children[2].children.length == 1 && declerator.children[2].children[0] instanceof import_JavaParser.default.ExpressionContext) {
              if (declerator.children[2].children[0].children && declerator.children[2].children[0].children.length == 3 && declerator.children[2].children[0].children[0] instanceof import_JavaParser.default.ExpressionContext && declerator.children[2].children[0].children[1].getText() == "." && declerator.children[2].children[0].children[2].getText() == "build()") {
                let buildexpression = declerator.children[2].children[0].children[0];
                for (let sdkDeclaration of this.SDKDeclarations) {
                  if (buildexpression.getText().startsWith(sdkDeclaration["variable"] + ".builder()")) {
                    this.ClientDeclarations.push({
                      "type": sdkDeclaration["service"],
                      "variable": assignable.getText(),
                      "argsRaw": buildexpression,
                      "sdk": sdkDeclaration
                    });
                    break;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  exitExpression(ctx) {
    if (ctx.children && ctx.children.length == 3 && ctx.children[0] instanceof import_JavaParser.default.ExpressionContext && ctx.children[1].getText() == "." && ctx.children[2] instanceof import_JavaParser.default.MethodCallContext) {
      let namespace = ctx.children[0];
      if (ctx.children[2].children.length == 4 && ctx.children[2].children[1].getText() == "(") {
        let method = ctx.children[2].children[0];
        let argsRaw = ctx.children[2].children[2];
        for (let clientDeclaration of this.ClientDeclarations) {
          if (namespace.getText() == clientDeclaration["variable"]) {
            this.ClientCalls.push({
              "client": clientDeclaration,
              "method": method.getText(),
              "argsRaw": argsRaw,
              "args": null
            });
            break;
          }
        }
      }
    }
  }
}
module.exports = __toCommonJS(JavaAWSListener_exports);
