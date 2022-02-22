#!/usr/bin/env node

import antlr4 from 'antlr4';
import JavaScriptLexer from './lib/JavaScriptLexer.js';
import JavaScriptParser from './lib/JavaScriptParser.js';
import JavaScriptAWSListener from './lib/JavaScriptAWSListener.js';
import Python3Lexer from './lib/Python3Lexer.js'
import Python3Parser from './lib/Python3Parser.js';
import Python3AWSListener from './lib/Python3AWSListener.js';
import JavaLexer from './lib/JavaLexer.js'
import JavaParser from './lib/JavaParser.js';
import JavaAWSListener from './lib/JavaAWSListener.js';
import CPP14Lexer from './lib/CPP14Lexer.js'
import CPP14Parser from './lib/CPP14Parser.js';
import CPP14AWSListener from './lib/CPP14AWSListener.js';
import GoLexer from './lib/GoLexer.js'
import GoParser from './lib/GoParser.js';
import GoAWSListener from './lib/GoAWSListener.js';

export default class AWSParser {

    constructor() {
        this.client_calls = [];
        this.debug = false;
    }

    treeWalker(tree, depth) {
        console.log(" ".repeat(depth*2) + tree.constructor.name + " - " + tree.getText().substr(0, 50));
        if (tree.children) {
            for (let child of tree.children) {
                this.treeWalker(child, depth+1);
            }
        }
    }

    ParseInput(input, language) {
        let lexer, tokens, parser, tree, listener;

        input += "\n";

        let chars = new antlr4.InputStream(input);

        switch (language) {
            case 'js':
                lexer = new JavaScriptLexer(chars);
                lexer.strictMode = false;

                tokens = new antlr4.CommonTokenStream(lexer);
                parser = new JavaScriptParser(tokens);
                parser.buildParseTrees = true;

                tree = parser.program();
                this.debug && this.treeWalker(tree, 0);

                listener = new JavaScriptAWSListener();
                antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

                this.client_calls = listener.ClientCalls;

                this.debug && console.log(listener);

                break;
            case 'python':
                lexer = new Python3Lexer(chars);
                lexer.strictMode = false;
    
                tokens = new antlr4.CommonTokenStream(lexer);
                parser = new Python3Parser(tokens);
                parser.buildParseTrees = true;
    
                tree = parser.file_input();
    
                listener = new Python3AWSListener();
                antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

                this.client_calls = listener.ClientCalls;

                break;
            case 'java':
                lexer = new JavaLexer(chars);
                lexer.strictMode = false;
    
                tokens = new antlr4.CommonTokenStream(lexer);
                parser = new JavaParser(tokens);
                parser.buildParseTrees = true;
    
                tree = parser.compilationUnit();
    
                listener = new JavaAWSListener();
                antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

                this.client_calls = listener.ClientCalls;

                break;
            case 'go':
                lexer = new GoLexer(chars);
                lexer.strictMode = false;
    
                tokens = new antlr4.CommonTokenStream(lexer);
                parser = new GoParser(tokens);
                parser.buildParseTrees = true;
    
                tree = parser.sourceFile();
    
                listener = new GoAWSListener();
                antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

                this.client_calls = listener.ClientCalls;

                break;
            case 'cplusplus':
                lexer = new CPP14Lexer(chars);
                lexer.strictMode = false;
    
                tokens = new antlr4.CommonTokenStream(lexer);
                parser = new CPP14Parser(tokens);
                parser.buildParseTrees = true;
    
                tree = parser.translationUnit();
    
                listener = new CPP14AWSListener();
                antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

                this.client_calls = listener.ClientCalls;

                break;
            default:
                throw "Unknown language";
        }
    }

    GetNormalizedServiceCalls() {
        let calls = [];

        for (let client_call of this.client_calls) {
            let method = client_call.method.substr(0, 1).toUpperCase() + client_call.method.substr(1).replace(/_([a-z0-9])/g, (match, p1) => p1.toUpperCase());

            calls.push({
                'service': client_call.client.type.toLowerCase(),
                'method': method,
                'params': client_call.args
            })
        }

        return calls;
    }
}
