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
var Python3AWSListener_exports = {};
__export(Python3AWSListener_exports, {
  default: () => Python3AWSListener
});
var import_Python3Parser = __toESM(require("./Python3Parser.js"));
var import_Python3ParserListener = __toESM(require("./Python3ParserListener.js"));
class Python3AWSListener extends import_Python3ParserListener.default {
  constructor() {
    super();
    this.SDKDeclarations = [];
    this.ClientDeclarations = [];
    this.ClientCalls = [];
    this.VariableDeclarations = [];
  }
  resolveArgs(argsRaw) {
    let args = {};
    return args;
  }
  drillToAtomExprs(treeitem) {
    let items = [];
    if (treeitem.children) {
      treeitem.children.forEach((child) => {
        if (child instanceof import_Python3Parser.default.Atom_exprContext) {
          items.push(child);
        } else {
          items = items.concat(this.drillToAtomExprs(child));
        }
      });
    }
    return items;
  }
  exitImport_name(ctx) {
    if (ctx.children[1].getText() == "boto3") {
      if (ctx.children[1].children[0].children.length == 3) {
        this.SDKDeclarations.push({
          "variable": ctx.children[1].children[0].children[2].getText()
        });
      } else {
        this.SDKDeclarations.push({
          "variable": "boto3"
        });
      }
    }
  }
  exitExpr_stmt(ctx) {
    if (ctx.children.length == 3 && ctx.children[0] instanceof import_Python3Parser.default.Testlist_star_exprContext && ctx.children[1].getText() == "=" && ctx.children[2] instanceof import_Python3Parser.default.Testlist_star_exprContext) {
      let atomExprLhs = this.drillToAtomExprs(ctx.children[0]);
      let atomExprRhs = this.drillToAtomExprs(ctx.children[2]);
      for (let assignable of atomExprLhs) {
        for (let rhs of atomExprRhs) {
          if (rhs.children.length == 3 && rhs.children[0] instanceof import_Python3Parser.default.AtomContext && rhs.children[1] instanceof import_Python3Parser.default.TrailerContext && rhs.children[2] instanceof import_Python3Parser.default.TrailerContext && rhs.children[2].getText().startsWith("(") && rhs.children[2].getText().endsWith(")")) {
            let namespace = rhs.children[0];
            if (rhs.children[1].children.length == 2 && rhs.children[1].children[0].getText() == ".") {
              let method = rhs.children[1].children[1];
              let argsRaw = rhs.children[2];
              for (let sdkDeclaration of this.SDKDeclarations) {
                if (namespace.getText() == sdkDeclaration["variable"] && method.getText() == "client") {
                  if (argsRaw.children.length == 3 && argsRaw.children[1] instanceof import_Python3Parser.default.ArglistContext && argsRaw.children[1].children && argsRaw.children[1].children[0].children) {
                    let arg1 = this.drillToAtomExprs(argsRaw.children[1].children[0])[0];
                    let arg1filtered = arg1.getText().replace(/^['"](.*)['"]$/g, "$1");
                    this.ClientDeclarations.push({
                      "type": arg1filtered,
                      "variable": assignable.getText(),
                      "argsRaw": argsRaw,
                      "sdk": sdkDeclaration
                    });
                    break;
                  }
                }
              }
              for (let clientDeclaration of this.ClientDeclarations) {
                if (namespace.getText() == clientDeclaration["variable"]) {
                  this.ClientCalls.push({
                    "client": clientDeclaration,
                    "method": method.getText(),
                    "argsRaw": argsRaw,
                    "args": this.resolveArgs(argsRaw),
                    "variable": assignable.getText()
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
module.exports = __toCommonJS(Python3AWSListener_exports);
