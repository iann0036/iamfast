#!/usr/bin/env node
var __create = Object.create;
var __defProp = Object.defineProperty;
var __getOwnPropDesc = Object.getOwnPropertyDescriptor;
var __getOwnPropNames = Object.getOwnPropertyNames;
var __getProtoOf = Object.getPrototypeOf;
var __hasOwnProp = Object.prototype.hasOwnProperty;
var __markAsModule = (target) => __defProp(target, "__esModule", { value: true });
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
var import_fs = require("fs");
var import_commander = require("commander");
var import_IAMFast = __toESM(require("./IAMFast.js"));
if (process.argv.length < 3) {
  console.log("Usage: iamfast filename");
  process.exit(1);
}
const code = (0, import_fs.readFileSync)(process.argv[2], { encoding: "utf8", flag: "r" });
let language = import_IAMFast.default.getLanguageByPath(process.argv[2]);
let iamfast = new import_IAMFast.default();
if (process.env.DEBUG == "true") {
  iamfast.debug = true;
}
console.log(iamfast.GenerateIAMPolicy(code, language));
module.exports = import_IAMFast.default;
