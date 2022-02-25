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
var JavaScriptAWSListener_exports = {};
__export(JavaScriptAWSListener_exports, {
  default: () => JavaScriptAWSListener
});
var import_JavaScriptParser = __toESM(require("./JavaScriptParser.js"), 1);
var import_JavaScriptParserListener = __toESM(require("./JavaScriptParserListener.js"), 1);
class JavaScriptAWSListener extends import_JavaScriptParserListener.default {
  constructor() {
    super();
    this.SDKDeclarations = [];
    this.ClientDeclarations = [];
    this.ClientCalls = [];
    this.VariableDeclarations = [];
  }
  generateObjectLiteralMap(treeitem) {
    let propertyMap = {};
    for (let objectLiteralChild of treeitem.children[0].children) {
      if (objectLiteralChild instanceof import_JavaScriptParser.default.PropertyExpressionAssignmentContext) {
        let propertyName = objectLiteralChild.children[0].getText().replace(/^['"](.*)['"]$/g, "$1");
        if (objectLiteralChild.children[2] instanceof import_JavaScriptParser.default.LiteralExpressionContext) {
          let propertyValue = objectLiteralChild.children[2].getText().replace(/^['"](.*)['"]$/g, "$1");
          propertyMap[propertyName] = {
            "type": "literal",
            "value": propertyValue
          };
        }
        if (objectLiteralChild.children[2] instanceof import_JavaScriptParser.default.ObjectLiteralExpressionContext) {
          propertyMap[propertyName] = {
            "type": "object",
            "value": this.generateObjectLiteralMap(objectLiteralChild.children[2])
          };
        }
      }
    }
    return propertyMap;
  }
  resolvePropertyMap(obj) {
    let ret = {};
    for (let k of Object.keys(obj)) {
      if (obj[k].type == "object") {
        ret[k] = this.resolvePropertyMap(obj[k].value);
      } else {
        ret[k] = obj[k].value;
      }
    }
    return ret;
  }
  resolveArgs(argsRaw) {
    let args = {};
    for (let argument of argsRaw.children) {
      if (argument instanceof import_JavaScriptParser.default.ArgumentContext) {
        if (argument.children.length == 1) {
          if (argument.children[0] instanceof import_JavaScriptParser.default.IdentifierExpressionContext) {
            let argumentsVariable = argument.children[0].getText();
            for (let variable of this.VariableDeclarations) {
              if (variable.variable == argumentsVariable) {
                if (variable.type == "object") {
                  args = this.resolvePropertyMap(variable.propertyMap);
                }
              }
            }
          }
        }
      }
    }
    return args;
  }
  exitAssignmentExpression(ctx) {
    this.aggregateVariableOrAssignmentDeclaration(ctx);
  }
  exitVariableDeclaration(ctx) {
    this.aggregateVariableOrAssignmentDeclaration(ctx);
  }
  aggregateVariableOrAssignmentDeclaration(ctx) {
    const assignable = ctx.children[0];
    if (assignable.children.length && assignable.children[0] instanceof import_JavaScriptParser.default.IdentifierContext) {
      if (ctx.children.length == 3) {
        const expression = ctx.children[2];
        if (expression instanceof import_JavaScriptParser.default.ArgumentsExpressionContext) {
          if (expression.children[0].getText() == "require" && ["('aws-sdk')", '("aws-sdk")'].includes(expression.children[1].getText())) {
            this.SDKDeclarations.push({
              "variable": assignable.getText()
            });
          }
        }
        if (expression instanceof import_JavaScriptParser.default.NewExpressionContext) {
          let className = expression.children[1];
          let argsRaw = null;
          let argsRawPrev = null;
          let anonymousDeclaration = false;
          let prevMethodName = null;
          if (expression.children.length == 3) {
            argsRaw = expression.children[2];
          }
          while (className instanceof import_JavaScriptParser.default.MemberDotExpressionContext) {
            if (className.children[0] instanceof import_JavaScriptParser.default.IdentifierExpressionContext) {
              const namespace = className.children[0];
              const method = className.children[className.children.length - 1];
              let foundDeclaration = false;
              for (let sdkDeclaration of this.SDKDeclarations) {
                if (namespace.getText() == sdkDeclaration["variable"]) {
                  this.ClientDeclarations.push({
                    "type": method.getText(),
                    "variable": anonymousDeclaration ? null : assignable.getText(),
                    "argsRaw": argsRaw,
                    "sdk": sdkDeclaration
                  });
                  foundDeclaration = true;
                  break;
                }
              }
              if (!foundDeclaration && namespace.getText() == "AWS") {
                this.ClientDeclarations.push({
                  "type": method.getText(),
                  "variable": anonymousDeclaration ? null : assignable.getText(),
                  "argsRaw": argsRaw,
                  "sdk": null
                });
              }
              if (anonymousDeclaration && prevMethodName) {
                this.ClientCalls.push({
                  "client": this.ClientDeclarations[this.ClientDeclarations.length - 1],
                  "method": prevMethodName,
                  "argsRaw": argsRawPrev,
                  "args": this.resolveArgs(argsRawPrev)
                });
              }
              break;
            } else if (className.children[0] instanceof import_JavaScriptParser.default.ArgumentsExpressionContext) {
              anonymousDeclaration = true;
              prevMethodName = null;
              if (className.children.length == 3 && className.children[1].getText() == "." && className.children[2] instanceof import_JavaScriptParser.default.IdentifierNameContext) {
                prevMethodName = className.children[2].getText();
              }
              if (className.children[0].children[0] instanceof import_JavaScriptParser.default.MemberDotExpressionContext) {
                argsRawPrev = argsRaw;
                argsRaw = className.children[0].children[1];
                className = className.children[0].children[0];
              }
            } else {
              break;
            }
          }
        }
        if (expression instanceof import_JavaScriptParser.default.ObjectLiteralExpressionContext) {
          this.VariableDeclarations.push({
            "variable": assignable.getText(),
            "type": "object",
            "propertyMap": this.generateObjectLiteralMap(expression)
          });
        }
      }
    }
  }
  exitArgumentsExpression(ctx) {
    const callMethod = ctx.children[0];
    const argsRaw = ctx.children[1];
    if (callMethod instanceof import_JavaScriptParser.default.MemberDotExpressionContext) {
      const namespace = callMethod.children[0];
      const method = callMethod.children[callMethod.children.length - 1];
      for (let clientDeclaration of this.ClientDeclarations) {
        if (namespace.getText() == clientDeclaration["variable"]) {
          this.ClientCalls.push({
            "client": clientDeclaration,
            "method": method.getText(),
            "argsRaw": argsRaw,
            "args": this.resolveArgs(argsRaw)
          });
          break;
        }
      }
    }
  }
}
module.exports = __toCommonJS(JavaScriptAWSListener_exports);
