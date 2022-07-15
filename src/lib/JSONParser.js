// Generated from grammars/JSON.g4 by ANTLR 4.9.2
// jshint ignore: start
import antlr4 from 'antlr4';
import JSONListener from './JSONListener.js';
import JSONVisitor from './JSONVisitor.js';


const serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786",
    "\u5964\u0003\u000e:\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004",
    "\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0003\u0002\u0003\u0002",
    "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u0013\n",
    "\u0003\f\u0003\u000e\u0003\u0016\u000b\u0003\u0003\u0003\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0005\u0003\u001c\n\u0003\u0003\u0004\u0003",
    "\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003",
    "\u0005\u0007\u0005&\n\u0005\f\u0005\u000e\u0005)\u000b\u0005\u0003\u0005",
    "\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005/\n\u0005\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0005\u00068\n\u0006\u0003\u0006\u0002\u0002\u0007\u0002\u0004\u0006",
    "\b\n\u0002\u0002\u0002>\u0002\f\u0003\u0002\u0002\u0002\u0004\u001b",
    "\u0003\u0002\u0002\u0002\u0006\u001d\u0003\u0002\u0002\u0002\b.\u0003",
    "\u0002\u0002\u0002\n7\u0003\u0002\u0002\u0002\f\r\u0005\n\u0006\u0002",
    "\r\u0003\u0003\u0002\u0002\u0002\u000e\u000f\u0007\u0003\u0002\u0002",
    "\u000f\u0014\u0005\u0006\u0004\u0002\u0010\u0011\u0007\u0004\u0002\u0002",
    "\u0011\u0013\u0005\u0006\u0004\u0002\u0012\u0010\u0003\u0002\u0002\u0002",
    "\u0013\u0016\u0003\u0002\u0002\u0002\u0014\u0012\u0003\u0002\u0002\u0002",
    "\u0014\u0015\u0003\u0002\u0002\u0002\u0015\u0017\u0003\u0002\u0002\u0002",
    "\u0016\u0014\u0003\u0002\u0002\u0002\u0017\u0018\u0007\u0005\u0002\u0002",
    "\u0018\u001c\u0003\u0002\u0002\u0002\u0019\u001a\u0007\u0003\u0002\u0002",
    "\u001a\u001c\u0007\u0005\u0002\u0002\u001b\u000e\u0003\u0002\u0002\u0002",
    "\u001b\u0019\u0003\u0002\u0002\u0002\u001c\u0005\u0003\u0002\u0002\u0002",
    "\u001d\u001e\u0007\f\u0002\u0002\u001e\u001f\u0007\u0006\u0002\u0002",
    "\u001f \u0005\n\u0006\u0002 \u0007\u0003\u0002\u0002\u0002!\"\u0007",
    "\u0007\u0002\u0002\"\'\u0005\n\u0006\u0002#$\u0007\u0004\u0002\u0002",
    "$&\u0005\n\u0006\u0002%#\u0003\u0002\u0002\u0002&)\u0003\u0002\u0002",
    "\u0002\'%\u0003\u0002\u0002\u0002\'(\u0003\u0002\u0002\u0002(*\u0003",
    "\u0002\u0002\u0002)\'\u0003\u0002\u0002\u0002*+\u0007\b\u0002\u0002",
    "+/\u0003\u0002\u0002\u0002,-\u0007\u0007\u0002\u0002-/\u0007\b\u0002",
    "\u0002.!\u0003\u0002\u0002\u0002.,\u0003\u0002\u0002\u0002/\t\u0003",
    "\u0002\u0002\u000208\u0007\f\u0002\u000218\u0007\r\u0002\u000228\u0005",
    "\u0004\u0003\u000238\u0005\b\u0005\u000248\u0007\t\u0002\u000258\u0007",
    "\n\u0002\u000268\u0007\u000b\u0002\u000270\u0003\u0002\u0002\u00027",
    "1\u0003\u0002\u0002\u000272\u0003\u0002\u0002\u000273\u0003\u0002\u0002",
    "\u000274\u0003\u0002\u0002\u000275\u0003\u0002\u0002\u000276\u0003\u0002",
    "\u0002\u00028\u000b\u0003\u0002\u0002\u0002\u0007\u0014\u001b\'.7"].join("");


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class JSONParser extends antlr4.Parser {

    static grammarFileName = "JSON.g4";
    static literalNames = [ null, "'{'", "','", "'}'", "':'", "'['", "']'", 
                            "'true'", "'false'", "'null'" ];
    static symbolicNames = [ null, null, null, null, null, null, null, null, 
                             null, null, "STRING", "NUMBER", "WS" ];
    static ruleNames = [ "json", "obj", "pair", "arr", "value" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = JSONParser.ruleNames;
        this.literalNames = JSONParser.literalNames;
        this.symbolicNames = JSONParser.symbolicNames;
    }

    get atn() {
        return atn;
    }



	json() {
	    let localctx = new JsonContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, JSONParser.RULE_json);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 10;
	        this.value();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	obj() {
	    let localctx = new ObjContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, JSONParser.RULE_obj);
	    var _la = 0; // Token type
	    try {
	        this.state = 25;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,1,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 12;
	            this.match(JSONParser.T__0);
	            this.state = 13;
	            this.pair();
	            this.state = 18;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while(_la===JSONParser.T__1) {
	                this.state = 14;
	                this.match(JSONParser.T__1);
	                this.state = 15;
	                this.pair();
	                this.state = 20;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	            this.state = 21;
	            this.match(JSONParser.T__2);
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 23;
	            this.match(JSONParser.T__0);
	            this.state = 24;
	            this.match(JSONParser.T__2);
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	pair() {
	    let localctx = new PairContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, JSONParser.RULE_pair);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 27;
	        this.match(JSONParser.STRING);
	        this.state = 28;
	        this.match(JSONParser.T__3);
	        this.state = 29;
	        this.value();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	arr() {
	    let localctx = new ArrContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, JSONParser.RULE_arr);
	    var _la = 0; // Token type
	    try {
	        this.state = 44;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,3,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 31;
	            this.match(JSONParser.T__4);
	            this.state = 32;
	            this.value();
	            this.state = 37;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while(_la===JSONParser.T__1) {
	                this.state = 33;
	                this.match(JSONParser.T__1);
	                this.state = 34;
	                this.value();
	                this.state = 39;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	            this.state = 40;
	            this.match(JSONParser.T__5);
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 42;
	            this.match(JSONParser.T__4);
	            this.state = 43;
	            this.match(JSONParser.T__5);
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	value() {
	    let localctx = new ValueContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, JSONParser.RULE_value);
	    try {
	        this.state = 53;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case JSONParser.STRING:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 46;
	            this.match(JSONParser.STRING);
	            break;
	        case JSONParser.NUMBER:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 47;
	            this.match(JSONParser.NUMBER);
	            break;
	        case JSONParser.T__0:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 48;
	            this.obj();
	            break;
	        case JSONParser.T__4:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 49;
	            this.arr();
	            break;
	        case JSONParser.T__6:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 50;
	            this.match(JSONParser.T__6);
	            break;
	        case JSONParser.T__7:
	            this.enterOuterAlt(localctx, 6);
	            this.state = 51;
	            this.match(JSONParser.T__7);
	            break;
	        case JSONParser.T__8:
	            this.enterOuterAlt(localctx, 7);
	            this.state = 52;
	            this.match(JSONParser.T__8);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

JSONParser.EOF = antlr4.Token.EOF;
JSONParser.T__0 = 1;
JSONParser.T__1 = 2;
JSONParser.T__2 = 3;
JSONParser.T__3 = 4;
JSONParser.T__4 = 5;
JSONParser.T__5 = 6;
JSONParser.T__6 = 7;
JSONParser.T__7 = 8;
JSONParser.T__8 = 9;
JSONParser.STRING = 10;
JSONParser.NUMBER = 11;
JSONParser.WS = 12;

JSONParser.RULE_json = 0;
JSONParser.RULE_obj = 1;
JSONParser.RULE_pair = 2;
JSONParser.RULE_arr = 3;
JSONParser.RULE_value = 4;

class JsonContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JSONParser.RULE_json;
    }

	value() {
	    return this.getTypedRuleContext(ValueContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JSONListener ) {
	        listener.enterJson(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JSONListener ) {
	        listener.exitJson(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JSONVisitor ) {
	        return visitor.visitJson(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ObjContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JSONParser.RULE_obj;
    }

	pair = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(PairContext);
	    } else {
	        return this.getTypedRuleContext(PairContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof JSONListener ) {
	        listener.enterObj(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JSONListener ) {
	        listener.exitObj(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JSONVisitor ) {
	        return visitor.visitObj(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PairContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JSONParser.RULE_pair;
    }

	STRING() {
	    return this.getToken(JSONParser.STRING, 0);
	};

	value() {
	    return this.getTypedRuleContext(ValueContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JSONListener ) {
	        listener.enterPair(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JSONListener ) {
	        listener.exitPair(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JSONVisitor ) {
	        return visitor.visitPair(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ArrContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JSONParser.RULE_arr;
    }

	value = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ValueContext);
	    } else {
	        return this.getTypedRuleContext(ValueContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof JSONListener ) {
	        listener.enterArr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JSONListener ) {
	        listener.exitArr(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JSONVisitor ) {
	        return visitor.visitArr(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ValueContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = JSONParser.RULE_value;
    }

	STRING() {
	    return this.getToken(JSONParser.STRING, 0);
	};

	NUMBER() {
	    return this.getToken(JSONParser.NUMBER, 0);
	};

	obj() {
	    return this.getTypedRuleContext(ObjContext,0);
	};

	arr() {
	    return this.getTypedRuleContext(ArrContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof JSONListener ) {
	        listener.enterValue(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof JSONListener ) {
	        listener.exitValue(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof JSONVisitor ) {
	        return visitor.visitValue(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




JSONParser.JsonContext = JsonContext; 
JSONParser.ObjContext = ObjContext; 
JSONParser.PairContext = PairContext; 
JSONParser.ArrContext = ArrContext; 
JSONParser.ValueContext = ValueContext; 
