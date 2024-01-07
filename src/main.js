#!/usr/bin/env node

import { readFileSync, watchFile } from "fs";
import { program } from 'commander';
import IAMFast from "./IAMFast.js";
import path from "path";
import fs from "fs";

const EXTS = ['.js', '.jsx', '.py', '.py3', '.java', '.go', '.c', '.cpp', '.json'];
const FORMATS = ['json', 'yaml', 'hcl', 'sam'];

program
    .arguments('<filename>')
    .option('--format <format>', 'specify the output format for the policy', 'json');
program.parse(process.argv);
const options = program.opts();
const filename = program.args[0];
const format = options.format;

if (!FORMATS.includes(format)) {
    console.log("error: unknown format; available formats are: " + FORMATS.join(", "));
    process.exit(1);
}

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
    if (format == "sam") {
        console.log("error: directory support for SAM output not yet supported");
        process.exit(1);
    }

    try { // try as a package, otherwise deep walk
        let packagejson_path = path.join(filename, 'package.json');
        let packagejson = JSON.parse(fs.readFileSync(packagejson_path, { encoding: 'utf8', flag: 'r' }));
        let resolved_import_path = path.join(filename, packagejson.main);
        files.push(resolved_import_path);
    } catch(e) {
        files = walk(filename);
    }

    if (files.length == 0) {
        console.log("error: no known files found");
        process.exit(1);
    }
} else if (stat.isFile()) {
    if (!EXTS.includes(path.extname(filename))) {
        console.log("error: unknown file type " + path.extname(filename));
        process.exit(1);
    }

    files.push(filename);
} else {
    console.log("error: unknown path type");
    process.exit(1);
}

let iamfast = new IAMFast();
if (process.env.DEBUG == "true" || process.env.DEBUG == "1") {
    iamfast.debug = true;
}

let output = '';
for (let file of files) {
    const code = readFileSync(file, { encoding: 'utf8', flag: 'r' });

    let language = IAMFast.getLanguageByPath(file);

    if (format == "sam") {
        output = iamfast.GenerateSAMTemplate(code, language, file);
    } else if (format == "yaml") {
        output = iamfast.GenerateYAMLPolicy(code, language, file);
    } else if (format == "json") {
        output = iamfast.GenerateIAMPolicy(code, language, file);
    } else if (format == "hcl") {
        output = iamfast.GenerateHCLTemplate(code, language, file);
    }
}

console.log(output);
