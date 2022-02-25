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
var CPP14AWSListener_exports = {};
__export(CPP14AWSListener_exports, {
  default: () => CPP14AWSListener
});
var import_CPP14Parser = __toESM(require("./CPP14Parser.js"), 1);
var import_CPP14ParserListener = __toESM(require("./CPP14ParserListener.js"), 1);
class CPP14AWSListener extends import_CPP14ParserListener.default {
  constructor() {
    super();
    this.SDKDeclarations = [];
    this.ClientDeclarations = [];
    this.ClientCalls = [];
    this.VariableDeclarations = [];
    this.SDKDeclarations.push({
      "variable": "Aws"
    });
  }
  exitSimpleDeclaration(ctx) {
    if (ctx.children.length == 3 && ctx.children[0] instanceof import_CPP14Parser.default.DeclSpecifierSeqContext && ctx.children[1] instanceof import_CPP14Parser.default.InitDeclaratorListContext && ctx.children[2].getText() == ";") {
      let matchString = ctx.children[0].getText().match(/^Aws::([a-zA-Z0-9]+)::(([a-zA-Z0-9]+)Client)$/);
      if (matchString) {
        for (let declerator of ctx.children[1].children) {
          if (declerator instanceof import_CPP14Parser.default.InitDeclaratorContext && declerator.getText().match(/^[a-zA-Z0-9-_]+$/)) {
            if (matchString[1].toLowerCase() == matchString[3].toLowerCase()) {
              this.ClientDeclarations.push({
                "type": matchString[1].toLowerCase(),
                "variable": declerator.getText(),
                "argsRaw": null,
                "sdk": this.SDKDeclarations[0]
              });
            }
          }
        }
      }
    }
  }
  exitPostfixExpression(ctx) {
    if (ctx.children.length == 4 && ctx.children[0] instanceof import_CPP14Parser.default.PostfixExpressionContext && ctx.children[1].getText() == "(" && ctx.children[3].getText() == ")") {
      let argsRaw = ctx.children[2];
      if (ctx.children[0].children.length == 3 && ctx.children[0].children[0] instanceof import_CPP14Parser.default.PostfixExpressionContext && ctx.children[0].children[0].children.length == 1 && ctx.children[0].children[0].children[0] instanceof import_CPP14Parser.default.PrimaryExpressionContext && ctx.children[0].children[0].children[0].children.length == 1 && ctx.children[0].children[0].children[0].children[0] instanceof import_CPP14Parser.default.IdExpressionContext && ctx.children[0].children[1].getText() == "." && ctx.children[0].children[2] instanceof import_CPP14Parser.default.IdExpressionContext) {
        let namespace = ctx.children[0].children[0];
        let method = ctx.children[0].children[2];
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
module.exports = __toCommonJS(CPP14AWSListener_exports);
