// Generated from grammars/JSON.g4 by ANTLR 4.13.1
// jshint ignore: start
import antlr4 from 'antlr4';
import JSONListener from './JSONListener.js';
import JSONVisitor from './JSONVisitor.js';

const serializedATN = [4,1,12,56,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
1,0,1,0,1,1,1,1,1,1,1,1,5,1,17,8,1,10,1,12,1,20,9,1,1,1,1,1,1,1,1,1,3,1,
26,8,1,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,5,3,36,8,3,10,3,12,3,39,9,3,1,3,1,
3,1,3,1,3,3,3,45,8,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,3,4,54,8,4,1,4,0,0,5,0,
2,4,6,8,0,0,60,0,10,1,0,0,0,2,25,1,0,0,0,4,27,1,0,0,0,6,44,1,0,0,0,8,53,
1,0,0,0,10,11,3,8,4,0,11,1,1,0,0,0,12,13,5,1,0,0,13,18,3,4,2,0,14,15,5,2,
0,0,15,17,3,4,2,0,16,14,1,0,0,0,17,20,1,0,0,0,18,16,1,0,0,0,18,19,1,0,0,
0,19,21,1,0,0,0,20,18,1,0,0,0,21,22,5,3,0,0,22,26,1,0,0,0,23,24,5,1,0,0,
24,26,5,3,0,0,25,12,1,0,0,0,25,23,1,0,0,0,26,3,1,0,0,0,27,28,5,10,0,0,28,
29,5,4,0,0,29,30,3,8,4,0,30,5,1,0,0,0,31,32,5,5,0,0,32,37,3,8,4,0,33,34,
5,2,0,0,34,36,3,8,4,0,35,33,1,0,0,0,36,39,1,0,0,0,37,35,1,0,0,0,37,38,1,
0,0,0,38,40,1,0,0,0,39,37,1,0,0,0,40,41,5,6,0,0,41,45,1,0,0,0,42,43,5,5,
0,0,43,45,5,6,0,0,44,31,1,0,0,0,44,42,1,0,0,0,45,7,1,0,0,0,46,54,5,10,0,
0,47,54,5,11,0,0,48,54,3,2,1,0,49,54,3,6,3,0,50,54,5,7,0,0,51,54,5,8,0,0,
52,54,5,9,0,0,53,46,1,0,0,0,53,47,1,0,0,0,53,48,1,0,0,0,53,49,1,0,0,0,53,
50,1,0,0,0,53,51,1,0,0,0,53,52,1,0,0,0,54,9,1,0,0,0,5,18,25,37,44,53];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

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
	    var _la = 0;
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
	            while(_la===2) {
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
	    var _la = 0;
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
	            while(_la===2) {
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
	        case 10:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 46;
	            this.match(JSONParser.STRING);
	            break;
	        case 11:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 47;
	            this.match(JSONParser.NUMBER);
	            break;
	        case 1:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 48;
	            this.obj();
	            break;
	        case 5:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 49;
	            this.arr();
	            break;
	        case 7:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 50;
	            this.match(JSONParser.T__6);
	            break;
	        case 8:
	            this.enterOuterAlt(localctx, 6);
	            this.state = 51;
	            this.match(JSONParser.T__7);
	            break;
	        case 9:
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
