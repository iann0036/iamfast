#!/usr/bin/env node

import { readFileSync } from "fs";
import { program } from 'commander';
import IAMFast from "./IAMFast.js";

if (process.argv.length < 3) {
    console.log("Usage: iamfast filename");
    process.exit(1);
}

const code = readFileSync(process.argv[2], { encoding: 'utf8', flag: 'r' });

let language = 'unknown';
if (process.argv[2].endsWith(".js") || process.argv[2].endsWith(".cjs")) {
    language = 'js';
} else if (process.argv[2].endsWith(".py")) {
    language = 'python';
} else if (process.argv[2].endsWith(".java")) {
    language = 'java';
} else if (process.argv[2].endsWith(".go")) {
    language = 'go';
} else if (process.argv[2].endsWith(".cpp") || process.argv[2].endsWith(".c")) {
    language = 'cplusplus';
}

let iamfast = new IAMFast();

if (process.env.DEBUG == "true") {
    iamfast.debug = true;
}

console.log(iamfast.GenerateIAMPolicy(code, language));
//console.log(iamfast.GenerateSAMTemplate(code, language));
