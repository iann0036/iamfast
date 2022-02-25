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
var GoAWSListener_exports = {};
__export(GoAWSListener_exports, {
  default: () => GoAWSListener
});
var import_GoParser = __toESM(require("./GoParser.js"), 1);
var import_GoParserListener = __toESM(require("./GoParserListener.js"), 1);
class GoAWSListener extends import_GoParserListener.default {
  constructor() {
    super();
    this.SDKDeclarations = [];
    this.ClientDeclarations = [];
    this.ClientCalls = [];
    this.VariableDeclarations = [];
  }
  exitImportSpec(ctx) {
    let matchString = ctx.getText().match(/^['"]github\.com[\\\/]aws[\\\/]aws-sdk-go[\\\/]service[\\\/]([a-zA-Z0-9]+)['"]$/);
    if (matchString) {
      this.SDKDeclarations.push({
        "variable": matchString[1],
        "service": matchString[1]
      });
    }
  }
  exitShortVarDecl(ctx) {
    const assignable = ctx.children[0];
    if (ctx.children[2].children && ctx.children[2].children.length == 1 && ctx.children[2].children[0] instanceof import_GoParser.default.ExpressionContext) {
      if (ctx.children[2].children[0].children && ctx.children[2].children[0].children.length == 1 && ctx.children[2].children[0].children[0] instanceof import_GoParser.default.PrimaryExprContext) {
        if (ctx.children[2].children[0].children[0].children && ctx.children[2].children[0].children[0].children.length == 2 && ctx.children[2].children[0].children[0].children[0] instanceof import_GoParser.default.PrimaryExprContext && ctx.children[2].children[0].children[0].children[1] instanceof import_GoParser.default.ArgumentsContext) {
          if (ctx.children[2].children[0].children[0].children[0].children && ctx.children[2].children[0].children[0].children[0].children.length == 3 && ctx.children[2].children[0].children[0].children[0].children[1].getText() == "." && ctx.children[2].children[0].children[0].children[0].children[2].getText() == "New") {
            let namespace = ctx.children[2].children[0].children[0].children[0].children[0];
            for (let sdkDeclaration of this.SDKDeclarations) {
              if (namespace.getText() == sdkDeclaration["variable"]) {
                this.ClientDeclarations.push({
                  "type": sdkDeclaration["service"],
                  "variable": assignable.getText(),
                  "argsRaw": ctx.children[2].children[0].children[0].children[1],
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
  exitExpression(ctx) {
    if (ctx.children && ctx.children.length == 1 && ctx.children[0] instanceof import_GoParser.default.PrimaryExprContext) {
      if (ctx.children[0].children && ctx.children[0].children.length == 2 && ctx.children[0].children[0] instanceof import_GoParser.default.PrimaryExprContext && ctx.children[0].children[1] instanceof import_GoParser.default.ArgumentsContext) {
        let argsRaw = ctx.children[0].children[1];
        if (ctx.children[0].children[0].children && ctx.children[0].children[0].children.length == 3 && ctx.children[0].children[0].children[1].getText() == ".") {
          let namespace = ctx.children[0].children[0].children[0];
          let method = ctx.children[0].children[0].children[2];
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
}
module.exports = __toCommonJS(GoAWSListener_exports);
