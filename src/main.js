#!/usr/bin/env node

import { readFileSync, watchFile } from "fs";
import { program } from 'commander';
import IAMFast from "./IAMFast.js";
import path from "path";
import fs from "fs";

const EXTS = ['.js', '.jsx', '.py', '.py3', '.java', '.go', '.c', '.cpp'];

program
    .arguments('<filename>')
    .option('--output-sam', 'generate a SAM template instead of an IAM policy');
program.parse(process.argv);
const options = program.opts();
const filename = program.args[0];
const outputSam = options.outputSam;

if (!fs.existsSync(filename)) {
    console.log("error: path does not exist");
    process.exit(1);
}

let stat = fs.statSync(filename);
let files = [];

var walk = function(dir) {
    var results = [];
    var list = fs.readdirSync(dir);
    list.forEach(function(file) {
        file = dir + '/' + file;
        var stat = fs.statSync(file);
        if (stat && stat.isDirectory()) {
            results = results.concat(walk(file));
        } else {
            if (EXTS.includes(path.extname(file))) {
                results.push(file);
            }
        }
    });
    return results;
}

if (stat.isDirectory()) {
    files = walk(filename);

    if (files.length == 0) {
        console.log("error: no known files found");
        process.exit(1);
    }
} else if (stat.isFile()) {
    if (EXTS.includes(path.extname(filename))) {
        console.log("error: Unknown file type");
        process.exit(1);
    }

    files.push(filename);
} else {
    console.log("error: unknown path type");
    process.exit(1);
}

let iamfast = new IAMFast();
if (process.env.DEBUG == "true") {
    iamfast.debug = true;
}

let output = '';
for (let file of files) {
    const code = readFileSync(file, { encoding: 'utf8', flag: 'r' });

    let language = IAMFast.getLanguageByPath(file);

    if (outputSam) {
        output = iamfast.GenerateSAMTemplate(code, language);
    } else {
        output = iamfast.GenerateIAMPolicy(code, language);
    }
}

console.log(output);
