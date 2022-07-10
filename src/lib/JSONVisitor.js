// Generated from grammars/JSON.g4 by ANTLR 4.9.2
// jshint ignore: start
import antlr4 from 'antlr4';

// This class defines a complete generic visitor for a parse tree produced by JSONParser.

export default class JSONVisitor extends antlr4.tree.ParseTreeVisitor {

	// Visit a parse tree produced by JSONParser#json.
	visitJson(ctx) {
	  return this.visitChildren(ctx);
	}


	// Visit a parse tree produced by JSONParser#obj.
	visitObj(ctx) {
	  return this.visitChildren(ctx);
	}


	// Visit a parse tree produced by JSONParser#pair.
	visitPair(ctx) {
	  return this.visitChildren(ctx);
	}


	// Visit a parse tree produced by JSONParser#arr.
	visitArr(ctx) {
	  return this.visitChildren(ctx);
	}


	// Visit a parse tree produced by JSONParser#value.
	visitValue(ctx) {
	  return this.visitChildren(ctx);
	}



}