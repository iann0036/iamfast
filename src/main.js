#!/usr/bin/env node

import { readFileSync } from "fs";
import { program } from 'commander';
import IAMFast from "./IAMFast.js";

if (process.argv.length < 3) {
    console.log("Usage: iamfast filename");
    process.exit(1);
}

const code = readFileSync(process.argv[2], { encoding: 'utf8', flag: 'r' });

let language = IAMFast.getLanguageByPath(process.argv[2]);

let iamfast = new IAMFast();

if (process.env.DEBUG == "true") {
    iamfast.debug = true;
}

console.log(iamfast.GenerateIAMPolicy(code, language));
//console.log(iamfast.GenerateSAMTemplate(code, language));
