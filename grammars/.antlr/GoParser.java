// Generated from /Users/ian/iamfast-js/grammars/GoParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoParser extends GoParserBase {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BREAK=1, DEFAULT=2, FUNC=3, INTERFACE=4, SELECT=5, CASE=6, DEFER=7, GO=8, 
		MAP=9, STRUCT=10, CHAN=11, ELSE=12, GOTO=13, PACKAGE=14, SWITCH=15, CONST=16, 
		FALLTHROUGH=17, IF=18, RANGE=19, TYPE=20, CONTINUE=21, FOR=22, IMPORT=23, 
		RETURN=24, VAR=25, NIL_LIT=26, IDENTIFIER=27, L_PAREN=28, R_PAREN=29, 
		L_CURLY=30, R_CURLY=31, L_BRACKET=32, R_BRACKET=33, ASSIGN=34, COMMA=35, 
		SEMI=36, COLON=37, DOT=38, PLUS_PLUS=39, MINUS_MINUS=40, DECLARE_ASSIGN=41, 
		ELLIPSIS=42, LOGICAL_OR=43, LOGICAL_AND=44, EQUALS=45, NOT_EQUALS=46, 
		LESS=47, LESS_OR_EQUALS=48, GREATER=49, GREATER_OR_EQUALS=50, OR=51, DIV=52, 
		MOD=53, LSHIFT=54, RSHIFT=55, BIT_CLEAR=56, EXCLAMATION=57, PLUS=58, MINUS=59, 
		CARET=60, STAR=61, AMPERSAND=62, RECEIVE=63, DECIMAL_LIT=64, BINARY_LIT=65, 
		OCTAL_LIT=66, HEX_LIT=67, FLOAT_LIT=68, DECIMAL_FLOAT_LIT=69, HEX_FLOAT_LIT=70, 
		IMAGINARY_LIT=71, RUNE_LIT=72, BYTE_VALUE=73, OCTAL_BYTE_VALUE=74, HEX_BYTE_VALUE=75, 
		LITTLE_U_VALUE=76, BIG_U_VALUE=77, RAW_STRING_LIT=78, INTERPRETED_STRING_LIT=79, 
		WS=80, COMMENT=81, TERMINATOR=82, LINE_COMMENT=83, WS_NLSEMI=84, COMMENT_NLSEMI=85, 
		LINE_COMMENT_NLSEMI=86, EOS=87, OTHER=88;
	public static final int
		RULE_sourceFile = 0, RULE_packageClause = 1, RULE_importDecl = 2, RULE_importSpec = 3, 
		RULE_importPath = 4, RULE_declaration = 5, RULE_constDecl = 6, RULE_constSpec = 7, 
		RULE_identifierList = 8, RULE_expressionList = 9, RULE_typeDecl = 10, 
		RULE_typeSpec = 11, RULE_functionDecl = 12, RULE_methodDecl = 13, RULE_receiver = 14, 
		RULE_varDecl = 15, RULE_varSpec = 16, RULE_block = 17, RULE_statementList = 18, 
		RULE_statement = 19, RULE_simpleStmt = 20, RULE_expressionStmt = 21, RULE_sendStmt = 22, 
		RULE_incDecStmt = 23, RULE_assignment = 24, RULE_assign_op = 25, RULE_shortVarDecl = 26, 
		RULE_emptyStmt = 27, RULE_labeledStmt = 28, RULE_returnStmt = 29, RULE_breakStmt = 30, 
		RULE_continueStmt = 31, RULE_gotoStmt = 32, RULE_fallthroughStmt = 33, 
		RULE_deferStmt = 34, RULE_ifStmt = 35, RULE_switchStmt = 36, RULE_exprSwitchStmt = 37, 
		RULE_exprCaseClause = 38, RULE_exprSwitchCase = 39, RULE_typeSwitchStmt = 40, 
		RULE_typeSwitchGuard = 41, RULE_typeCaseClause = 42, RULE_typeSwitchCase = 43, 
		RULE_typeList = 44, RULE_selectStmt = 45, RULE_commClause = 46, RULE_commCase = 47, 
		RULE_recvStmt = 48, RULE_forStmt = 49, RULE_forClause = 50, RULE_rangeClause = 51, 
		RULE_goStmt = 52, RULE_type_ = 53, RULE_typeName = 54, RULE_typeLit = 55, 
		RULE_arrayType = 56, RULE_arrayLength = 57, RULE_elementType = 58, RULE_pointerType = 59, 
		RULE_interfaceType = 60, RULE_sliceType = 61, RULE_mapType = 62, RULE_channelType = 63, 
		RULE_methodSpec = 64, RULE_functionType = 65, RULE_signature = 66, RULE_result = 67, 
		RULE_parameters = 68, RULE_parameterDecl = 69, RULE_expression = 70, RULE_primaryExpr = 71, 
		RULE_conversion = 72, RULE_nonNamedType = 73, RULE_operand = 74, RULE_literal = 75, 
		RULE_basicLit = 76, RULE_integer = 77, RULE_operandName = 78, RULE_qualifiedIdent = 79, 
		RULE_compositeLit = 80, RULE_literalType = 81, RULE_literalValue = 82, 
		RULE_elementList = 83, RULE_keyedElement = 84, RULE_key = 85, RULE_element = 86, 
		RULE_structType = 87, RULE_fieldDecl = 88, RULE_string_ = 89, RULE_embeddedField = 90, 
		RULE_functionLit = 91, RULE_index = 92, RULE_slice_ = 93, RULE_typeAssertion = 94, 
		RULE_arguments = 95, RULE_methodExpr = 96, RULE_receiverType = 97, RULE_eos = 98;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "packageClause", "importDecl", "importSpec", "importPath", 
			"declaration", "constDecl", "constSpec", "identifierList", "expressionList", 
			"typeDecl", "typeSpec", "functionDecl", "methodDecl", "receiver", "varDecl", 
			"varSpec", "block", "statementList", "statement", "simpleStmt", "expressionStmt", 
			"sendStmt", "incDecStmt", "assignment", "assign_op", "shortVarDecl", 
			"emptyStmt", "labeledStmt", "returnStmt", "breakStmt", "continueStmt", 
			"gotoStmt", "fallthroughStmt", "deferStmt", "ifStmt", "switchStmt", "exprSwitchStmt", 
			"exprCaseClause", "exprSwitchCase", "typeSwitchStmt", "typeSwitchGuard", 
			"typeCaseClause", "typeSwitchCase", "typeList", "selectStmt", "commClause", 
			"commCase", "recvStmt", "forStmt", "forClause", "rangeClause", "goStmt", 
			"type_", "typeName", "typeLit", "arrayType", "arrayLength", "elementType", 
			"pointerType", "interfaceType", "sliceType", "mapType", "channelType", 
			"methodSpec", "functionType", "signature", "result", "parameters", "parameterDecl", 
			"expression", "primaryExpr", "conversion", "nonNamedType", "operand", 
			"literal", "basicLit", "integer", "operandName", "qualifiedIdent", "compositeLit", 
			"literalType", "literalValue", "elementList", "keyedElement", "key", 
			"element", "structType", "fieldDecl", "string_", "embeddedField", "functionLit", 
			"index", "slice_", "typeAssertion", "arguments", "methodExpr", "receiverType", 
			"eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'default'", "'func'", "'interface'", "'select'", "'case'", 
			"'defer'", "'go'", "'map'", "'struct'", "'chan'", "'else'", "'goto'", 
			"'package'", "'switch'", "'const'", "'fallthrough'", "'if'", "'range'", 
			"'type'", "'continue'", "'for'", "'import'", "'return'", "'var'", "'nil'", 
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "','", "';'", 
			"':'", "'.'", "'++'", "'--'", "':='", "'...'", "'||'", "'&&'", "'=='", 
			"'!='", "'<'", "'<='", "'>'", "'>='", "'|'", "'/'", "'%'", "'<<'", "'>>'", 
			"'&^'", "'!'", "'+'", "'-'", "'^'", "'*'", "'&'", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BREAK", "DEFAULT", "FUNC", "INTERFACE", "SELECT", "CASE", "DEFER", 
			"GO", "MAP", "STRUCT", "CHAN", "ELSE", "GOTO", "PACKAGE", "SWITCH", "CONST", 
			"FALLTHROUGH", "IF", "RANGE", "TYPE", "CONTINUE", "FOR", "IMPORT", "RETURN", 
			"VAR", "NIL_LIT", "IDENTIFIER", "L_PAREN", "R_PAREN", "L_CURLY", "R_CURLY", 
			"L_BRACKET", "R_BRACKET", "ASSIGN", "COMMA", "SEMI", "COLON", "DOT", 
			"PLUS_PLUS", "MINUS_MINUS", "DECLARE_ASSIGN", "ELLIPSIS", "LOGICAL_OR", 
			"LOGICAL_AND", "EQUALS", "NOT_EQUALS", "LESS", "LESS_OR_EQUALS", "GREATER", 
			"GREATER_OR_EQUALS", "OR", "DIV", "MOD", "LSHIFT", "RSHIFT", "BIT_CLEAR", 
			"EXCLAMATION", "PLUS", "MINUS", "CARET", "STAR", "AMPERSAND", "RECEIVE", 
			"DECIMAL_LIT", "BINARY_LIT", "OCTAL_LIT", "HEX_LIT", "FLOAT_LIT", "DECIMAL_FLOAT_LIT", 
			"HEX_FLOAT_LIT", "IMAGINARY_LIT", "RUNE_LIT", "BYTE_VALUE", "OCTAL_BYTE_VALUE", 
			"HEX_BYTE_VALUE", "LITTLE_U_VALUE", "BIG_U_VALUE", "RAW_STRING_LIT", 
			"INTERPRETED_STRING_LIT", "WS", "COMMENT", "TERMINATOR", "LINE_COMMENT", 
			"WS_NLSEMI", "COMMENT_NLSEMI", "LINE_COMMENT_NLSEMI", "EOS", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceFileContext extends ParserRuleContext {
		public PackageClauseContext packageClause() {
			return getRuleContext(PackageClauseContext.class,0);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public TerminalNode EOF() { return getToken(GoParser.EOF, 0); }
		public List<ImportDeclContext> importDecl() {
			return getRuleContexts(ImportDeclContext.class);
		}
		public ImportDeclContext importDecl(int i) {
			return getRuleContext(ImportDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			packageClause();
			setState(199);
			eos();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(200);
				importDecl();
				setState(201);
				eos();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << CONST) | (1L << TYPE) | (1L << VAR))) != 0)) {
				{
				{
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(208);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(209);
					methodDecl();
					}
					break;
				case 3:
					{
					setState(210);
					declaration();
					}
					break;
				}
				setState(213);
				eos();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageClauseContext extends ParserRuleContext {
		public Token packageName;
		public TerminalNode PACKAGE() { return getToken(GoParser.PACKAGE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public PackageClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageClause; }
	}

	public final PackageClauseContext packageClause() throws RecognitionException {
		PackageClauseContext _localctx = new PackageClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(PACKAGE);
			setState(223);
			((PackageClauseContext)_localctx).packageName = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(GoParser.IMPORT, 0); }
		public List<ImportSpecContext> importSpec() {
			return getRuleContexts(ImportSpecContext.class);
		}
		public ImportSpecContext importSpec(int i) {
			return getRuleContext(ImportSpecContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(IMPORT);
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case DOT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				{
				setState(226);
				importSpec();
				}
				break;
			case L_PAREN:
				{
				setState(227);
				match(L_PAREN);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (IDENTIFIER - 27)) | (1L << (DOT - 27)) | (1L << (RAW_STRING_LIT - 27)) | (1L << (INTERPRETED_STRING_LIT - 27)))) != 0)) {
					{
					{
					setState(228);
					importSpec();
					setState(229);
					eos();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportSpecContext extends ParserRuleContext {
		public Token alias;
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GoParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public ImportSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpec; }
	}

	public final ImportSpecContext importSpec() throws RecognitionException {
		ImportSpecContext _localctx = new ImportSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==DOT) {
				{
				setState(239);
				((ImportSpecContext)_localctx).alias = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==DOT) ) {
					((ImportSpecContext)_localctx).alias = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(242);
			importPath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportPathContext extends ParserRuleContext {
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			string_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				constDecl();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				typeDecl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				varDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GoParser.CONST, 0); }
		public List<ConstSpecContext> constSpec() {
			return getRuleContexts(ConstSpecContext.class);
		}
		public ConstSpecContext constSpec(int i) {
			return getRuleContext(ConstSpecContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(CONST);
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(252);
				constSpec();
				}
				break;
			case L_PAREN:
				{
				setState(253);
				match(L_PAREN);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(254);
					constSpec();
					setState(255);
					eos();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GoParser.ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ConstSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpec; }
	}

	public final ConstSpecContext constSpec() throws RecognitionException {
		ConstSpecContext _localctx = new ConstSpecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			identifierList();
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << STAR) | (1L << RECEIVE))) != 0)) {
					{
					setState(266);
					type_();
					}
				}

				setState(269);
				match(ASSIGN);
				setState(270);
				expressionList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GoParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(IDENTIFIER);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(274);
					match(COMMA);
					setState(275);
					match(IDENTIFIER);
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			expression(0);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					match(COMMA);
					setState(283);
					expression(0);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GoParser.TYPE, 0); }
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(TYPE);
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(290);
				typeSpec();
				}
				break;
			case L_PAREN:
				{
				setState(291);
				match(L_PAREN);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(292);
					typeSpec();
					setState(293);
					eos();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GoParser.ASSIGN, 0); }
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IDENTIFIER);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(304);
				match(ASSIGN);
				}
			}

			setState(307);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GoParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(FUNC);
			setState(310);
			match(IDENTIFIER);
			{
			setState(311);
			signature();
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(312);
				block();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GoParser.FUNC, 0); }
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(FUNC);
			setState(316);
			receiver();
			setState(317);
			match(IDENTIFIER);
			{
			setState(318);
			signature();
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(319);
				block();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GoParser.VAR, 0); }
		public List<VarSpecContext> varSpec() {
			return getRuleContexts(VarSpecContext.class);
		}
		public VarSpecContext varSpec(int i) {
			return getRuleContext(VarSpecContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(VAR);
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(325);
				varSpec();
				}
				break;
			case L_PAREN:
				{
				setState(326);
				match(L_PAREN);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(327);
					varSpec();
					setState(328);
					eos();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(335);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GoParser.ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			identifierList();
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case IDENTIFIER:
			case L_PAREN:
			case L_BRACKET:
			case STAR:
			case RECEIVE:
				{
				setState(339);
				type_();
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(340);
					match(ASSIGN);
					setState(341);
					expressionList();
					}
					break;
				}
				}
				break;
			case ASSIGN:
				{
				setState(344);
				match(ASSIGN);
				setState(345);
				expressionList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(L_CURLY);
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(349);
				statementList();
				}
				break;
			}
			setState(352);
			match(R_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(355);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(354);
						eos();
						}
						break;
					}
					setState(357);
					statement();
					setState(358);
					eos();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(362); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LabeledStmtContext labeledStmt() {
			return getRuleContext(LabeledStmtContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public GoStmtContext goStmt() {
			return getRuleContext(GoStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public GotoStmtContext gotoStmt() {
			return getRuleContext(GotoStmtContext.class,0);
		}
		public FallthroughStmtContext fallthroughStmt() {
			return getRuleContext(FallthroughStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public SwitchStmtContext switchStmt() {
			return getRuleContext(SwitchStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public DeferStmtContext deferStmt() {
			return getRuleContext(DeferStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				goStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				returnStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(369);
				breakStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(370);
				continueStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(371);
				gotoStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(372);
				fallthroughStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(373);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(374);
				ifStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(375);
				switchStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(376);
				selectStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(377);
				forStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(378);
				deferStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStmtContext extends ParserRuleContext {
		public SendStmtContext sendStmt() {
			return getRuleContext(SendStmtContext.class,0);
		}
		public IncDecStmtContext incDecStmt() {
			return getRuleContext(IncDecStmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public ShortVarDeclContext shortVarDecl() {
			return getRuleContext(ShortVarDeclContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_simpleStmt);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				sendStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				incDecStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				expressionStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				shortVarDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SendStmtContext extends ParserRuleContext {
		public ExpressionContext channel;
		public TerminalNode RECEIVE() { return getToken(GoParser.RECEIVE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SendStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendStmt; }
	}

	public final SendStmtContext sendStmt() throws RecognitionException {
		SendStmtContext _localctx = new SendStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sendStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			((SendStmtContext)_localctx).channel = expression(0);
			setState(391);
			match(RECEIVE);
			setState(392);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncDecStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(GoParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(GoParser.MINUS_MINUS, 0); }
		public IncDecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStmt; }
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			expression(0);
			setState(395);
			_la = _input.LA(1);
			if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			expressionList();
			setState(398);
			assign_op();
			setState(399);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(GoParser.ASSIGN, 0); }
		public TerminalNode PLUS() { return getToken(GoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GoParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(GoParser.OR, 0); }
		public TerminalNode CARET() { return getToken(GoParser.CARET, 0); }
		public TerminalNode STAR() { return getToken(GoParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(GoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GoParser.MOD, 0); }
		public TerminalNode LSHIFT() { return getToken(GoParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(GoParser.RSHIFT, 0); }
		public TerminalNode AMPERSAND() { return getToken(GoParser.AMPERSAND, 0); }
		public TerminalNode BIT_CLEAR() { return getToken(GoParser.BIT_CLEAR, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << DIV) | (1L << MOD) | (1L << LSHIFT) | (1L << RSHIFT) | (1L << BIT_CLEAR) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND))) != 0)) {
				{
				setState(401);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << DIV) | (1L << MOD) | (1L << LSHIFT) | (1L << RSHIFT) | (1L << BIT_CLEAR) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(404);
			match(ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortVarDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(GoParser.DECLARE_ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ShortVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortVarDecl; }
	}

	public final ShortVarDeclContext shortVarDecl() throws RecognitionException {
		ShortVarDeclContext _localctx = new ShortVarDeclContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_shortVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			identifierList();
			setState(407);
			match(DECLARE_ASSIGN);
			setState(408);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStmtContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(GoParser.EOS, 0); }
		public TerminalNode SEMI() { return getToken(GoParser.SEMI, 0); }
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_emptyStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==SEMI || _la==EOS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(GoParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStmt; }
	}

	public final LabeledStmtContext labeledStmt() throws RecognitionException {
		LabeledStmtContext _localctx = new LabeledStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(IDENTIFIER);
			setState(413);
			match(COLON);
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(414);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GoParser.RETURN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(RETURN);
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(418);
				expressionList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(GoParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(BREAK);
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(422);
				match(IDENTIFIER);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(GoParser.CONTINUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(CONTINUE);
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(426);
				match(IDENTIFIER);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoStmtContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(GoParser.GOTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public GotoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStmt; }
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(GOTO);
			setState(430);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FallthroughStmtContext extends ParserRuleContext {
		public TerminalNode FALLTHROUGH() { return getToken(GoParser.FALLTHROUGH, 0); }
		public FallthroughStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthroughStmt; }
	}

	public final FallthroughStmtContext fallthroughStmt() throws RecognitionException {
		FallthroughStmtContext _localctx = new FallthroughStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fallthroughStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(FALLTHROUGH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeferStmtContext extends ParserRuleContext {
		public TerminalNode DEFER() { return getToken(GoParser.DEFER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeferStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStmt; }
	}

	public final DeferStmtContext deferStmt() throws RecognitionException {
		DeferStmtContext _localctx = new DeferStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_deferStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(DEFER);
			setState(435);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GoParser.IF, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(GoParser.ELSE, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(IF);
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(438);
				expression(0);
				}
				break;
			case 2:
				{
				setState(439);
				eos();
				setState(440);
				expression(0);
				}
				break;
			case 3:
				{
				setState(442);
				simpleStmt();
				setState(443);
				eos();
				setState(444);
				expression(0);
				}
				break;
			}
			setState(448);
			block();
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(449);
				match(ELSE);
				setState(452);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(450);
					ifStmt();
					}
					break;
				case L_CURLY:
					{
					setState(451);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStmtContext extends ParserRuleContext {
		public ExprSwitchStmtContext exprSwitchStmt() {
			return getRuleContext(ExprSwitchStmtContext.class,0);
		}
		public TypeSwitchStmtContext typeSwitchStmt() {
			return getRuleContext(TypeSwitchStmtContext.class,0);
		}
		public SwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStmt; }
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_switchStmt);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				exprSwitchStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				typeSwitchStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprSwitchStmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(GoParser.SWITCH, 0); }
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<ExprCaseClauseContext> exprCaseClause() {
			return getRuleContexts(ExprCaseClauseContext.class);
		}
		public ExprCaseClauseContext exprCaseClause(int i) {
			return getRuleContext(ExprCaseClauseContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public ExprSwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSwitchStmt; }
	}

	public final ExprSwitchStmtContext exprSwitchStmt() throws RecognitionException {
		ExprSwitchStmtContext _localctx = new ExprSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_exprSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(SWITCH);
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
					{
					setState(461);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(464);
					simpleStmt();
					}
					break;
				}
				setState(467);
				eos();
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
					{
					setState(468);
					expression(0);
					}
				}

				}
				break;
			}
			setState(473);
			match(L_CURLY);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(474);
				exprCaseClause();
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
			match(R_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprCaseClauseContext extends ParserRuleContext {
		public ExprSwitchCaseContext exprSwitchCase() {
			return getRuleContext(ExprSwitchCaseContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GoParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExprCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCaseClause; }
	}

	public final ExprCaseClauseContext exprCaseClause() throws RecognitionException {
		ExprCaseClauseContext _localctx = new ExprCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exprCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			exprSwitchCase();
			setState(483);
			match(COLON);
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(484);
				statementList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprSwitchCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GoParser.CASE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(GoParser.DEFAULT, 0); }
		public ExprSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSwitchCase; }
	}

	public final ExprSwitchCaseContext exprSwitchCase() throws RecognitionException {
		ExprSwitchCaseContext _localctx = new ExprSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_exprSwitchCase);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(CASE);
				setState(488);
				expressionList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSwitchStmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(GoParser.SWITCH, 0); }
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public TypeSwitchGuardContext typeSwitchGuard() {
			return getRuleContext(TypeSwitchGuardContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public List<TypeCaseClauseContext> typeCaseClause() {
			return getRuleContexts(TypeCaseClauseContext.class);
		}
		public TypeCaseClauseContext typeCaseClause(int i) {
			return getRuleContext(TypeCaseClauseContext.class,i);
		}
		public TypeSwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchStmt; }
	}

	public final TypeSwitchStmtContext typeSwitchStmt() throws RecognitionException {
		TypeSwitchStmtContext _localctx = new TypeSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(SWITCH);
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(493);
				typeSwitchGuard();
				}
				break;
			case 2:
				{
				setState(494);
				eos();
				setState(495);
				typeSwitchGuard();
				}
				break;
			case 3:
				{
				setState(497);
				simpleStmt();
				setState(498);
				eos();
				setState(499);
				typeSwitchGuard();
				}
				break;
			}
			setState(503);
			match(L_CURLY);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(504);
				typeCaseClause();
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510);
			match(R_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSwitchGuardContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GoParser.DOT, 0); }
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode TYPE() { return getToken(GoParser.TYPE, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public TerminalNode DECLARE_ASSIGN() { return getToken(GoParser.DECLARE_ASSIGN, 0); }
		public TypeSwitchGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchGuard; }
	}

	public final TypeSwitchGuardContext typeSwitchGuard() throws RecognitionException {
		TypeSwitchGuardContext _localctx = new TypeSwitchGuardContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeSwitchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(512);
				match(IDENTIFIER);
				setState(513);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(516);
			primaryExpr(0);
			setState(517);
			match(DOT);
			setState(518);
			match(L_PAREN);
			setState(519);
			match(TYPE);
			setState(520);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeCaseClauseContext extends ParserRuleContext {
		public TypeSwitchCaseContext typeSwitchCase() {
			return getRuleContext(TypeSwitchCaseContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GoParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TypeCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCaseClause; }
	}

	public final TypeCaseClauseContext typeCaseClause() throws RecognitionException {
		TypeCaseClauseContext _localctx = new TypeCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			typeSwitchCase();
			setState(523);
			match(COLON);
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(524);
				statementList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSwitchCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GoParser.CASE, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(GoParser.DEFAULT, 0); }
		public TypeSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchCase; }
	}

	public final TypeSwitchCaseContext typeSwitchCase() throws RecognitionException {
		TypeSwitchCaseContext _localctx = new TypeSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeSwitchCase);
		try {
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				match(CASE);
				setState(528);
				typeList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> NIL_LIT() { return getTokens(GoParser.NIL_LIT); }
		public TerminalNode NIL_LIT(int i) {
			return getToken(GoParser.NIL_LIT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case IDENTIFIER:
			case L_PAREN:
			case L_BRACKET:
			case STAR:
			case RECEIVE:
				{
				setState(532);
				type_();
				}
				break;
			case NIL_LIT:
				{
				setState(533);
				match(NIL_LIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(536);
				match(COMMA);
				setState(539);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
				case INTERFACE:
				case MAP:
				case STRUCT:
				case CHAN:
				case IDENTIFIER:
				case L_PAREN:
				case L_BRACKET:
				case STAR:
				case RECEIVE:
					{
					setState(537);
					type_();
					}
					break;
				case NIL_LIT:
					{
					setState(538);
					match(NIL_LIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(GoParser.SELECT, 0); }
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public List<CommClauseContext> commClause() {
			return getRuleContexts(CommClauseContext.class);
		}
		public CommClauseContext commClause(int i) {
			return getRuleContext(CommClauseContext.class,i);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(SELECT);
			setState(547);
			match(L_CURLY);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(548);
				commClause();
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554);
			match(R_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommClauseContext extends ParserRuleContext {
		public CommCaseContext commCase() {
			return getRuleContext(CommCaseContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GoParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CommClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commClause; }
	}

	public final CommClauseContext commClause() throws RecognitionException {
		CommClauseContext _localctx = new CommClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_commClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			commCase();
			setState(557);
			match(COLON);
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(558);
				statementList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GoParser.CASE, 0); }
		public SendStmtContext sendStmt() {
			return getRuleContext(SendStmtContext.class,0);
		}
		public RecvStmtContext recvStmt() {
			return getRuleContext(RecvStmtContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(GoParser.DEFAULT, 0); }
		public CommCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commCase; }
	}

	public final CommCaseContext commCase() throws RecognitionException {
		CommCaseContext _localctx = new CommCaseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_commCase);
		try {
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				match(CASE);
				setState(564);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(562);
					sendStmt();
					}
					break;
				case 2:
					{
					setState(563);
					recvStmt();
					}
					break;
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecvStmtContext extends ParserRuleContext {
		public ExpressionContext recvExpr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GoParser.ASSIGN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(GoParser.DECLARE_ASSIGN, 0); }
		public RecvStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recvStmt; }
	}

	public final RecvStmtContext recvStmt() throws RecognitionException {
		RecvStmtContext _localctx = new RecvStmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_recvStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(569);
				expressionList();
				setState(570);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(572);
				identifierList();
				setState(573);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(577);
			((RecvStmtContext)_localctx).recvExpr = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GoParser.FOR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(FOR);
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(580);
				expression(0);
				}
				break;
			case 2:
				{
				setState(581);
				forClause();
				}
				break;
			case 3:
				{
				setState(582);
				rangeClause();
				}
				break;
			}
			setState(585);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public SimpleStmtContext initStmt;
		public SimpleStmtContext postStmt;
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SimpleStmtContext> simpleStmt() {
			return getRuleContexts(SimpleStmtContext.class);
		}
		public SimpleStmtContext simpleStmt(int i) {
			return getRuleContext(SimpleStmtContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(587);
				((ForClauseContext)_localctx).initStmt = simpleStmt();
				}
				break;
			}
			setState(590);
			eos();
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(591);
				expression(0);
				}
				break;
			}
			setState(594);
			eos();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
				{
				setState(595);
				((ForClauseContext)_localctx).postStmt = simpleStmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeClauseContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(GoParser.RANGE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GoParser.ASSIGN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(GoParser.DECLARE_ASSIGN, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(598);
				expressionList();
				setState(599);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(601);
				identifierList();
				setState(602);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(606);
			match(RANGE);
			setState(607);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoStmtContext extends ParserRuleContext {
		public TerminalNode GO() { return getToken(GoParser.GO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goStmt; }
	}

	public final GoStmtContext goStmt() throws RecognitionException {
		GoStmtContext _localctx = new GoStmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_goStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(GO);
			setState(610);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_Context extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_type_);
		try {
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				typeName();
				}
				break;
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case L_BRACKET:
			case STAR:
			case RECEIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				typeLit();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				match(L_PAREN);
				setState(615);
				type_();
				setState(616);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_typeName);
		try {
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				qualifiedIdent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeLitContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public ChannelTypeContext channelType() {
			return getRuleContext(ChannelTypeContext.class,0);
		}
		public TypeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLit; }
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeLit);
		try {
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				structType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(626);
				pointerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(627);
				functionType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(628);
				interfaceType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(629);
				sliceType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(630);
				mapType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(631);
				channelType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(GoParser.L_BRACKET, 0); }
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(GoParser.R_BRACKET, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(L_BRACKET);
			setState(635);
			arrayLength();
			setState(636);
			match(R_BRACKET);
			setState(637);
			elementType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementTypeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementType; }
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerTypeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(GoParser.STAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(STAR);
			setState(644);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(GoParser.INTERFACE, 0); }
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<MethodSpecContext> methodSpec() {
			return getRuleContexts(MethodSpecContext.class);
		}
		public MethodSpecContext methodSpec(int i) {
			return getRuleContext(MethodSpecContext.class,i);
		}
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_interfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(INTERFACE);
			setState(647);
			match(L_CURLY);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(648);
					methodSpec();
					}
					break;
				case 2:
					{
					setState(649);
					typeName();
					}
					break;
				}
				setState(652);
				eos();
				}
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(659);
			match(R_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SliceTypeContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(GoParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(GoParser.R_BRACKET, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(L_BRACKET);
			setState(662);
			match(R_BRACKET);
			setState(663);
			elementType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapTypeContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(GoParser.MAP, 0); }
		public TerminalNode L_BRACKET() { return getToken(GoParser.L_BRACKET, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(GoParser.R_BRACKET, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(MAP);
			setState(666);
			match(L_BRACKET);
			setState(667);
			type_();
			setState(668);
			match(R_BRACKET);
			setState(669);
			elementType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChannelTypeContext extends ParserRuleContext {
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public TerminalNode CHAN() { return getToken(GoParser.CHAN, 0); }
		public TerminalNode RECEIVE() { return getToken(GoParser.RECEIVE, 0); }
		public ChannelTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelType; }
	}

	public final ChannelTypeContext channelType() throws RecognitionException {
		ChannelTypeContext _localctx = new ChannelTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_channelType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(671);
				match(CHAN);
				}
				break;
			case 2:
				{
				setState(672);
				match(CHAN);
				setState(673);
				match(RECEIVE);
				}
				break;
			case 3:
				{
				setState(674);
				match(RECEIVE);
				setState(675);
				match(CHAN);
				}
				break;
			}
			setState(678);
			elementType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodSpecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSpec; }
	}

	public final MethodSpecContext methodSpec() throws RecognitionException {
		MethodSpecContext _localctx = new MethodSpecContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_methodSpec);
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				match(IDENTIFIER);
				setState(681);
				parameters();
				setState(682);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(IDENTIFIER);
				setState(685);
				parameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GoParser.FUNC, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(FUNC);
			setState(689);
			signature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignatureContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_signature);
		try {
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				parameters();
				setState(692);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				parameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_result);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
				type_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public List<ParameterDeclContext> parameterDecl() {
			return getRuleContexts(ParameterDeclContext.class);
		}
		public ParameterDeclContext parameterDecl(int i) {
			return getRuleContext(ParameterDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(L_PAREN);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << ELLIPSIS) | (1L << STAR) | (1L << RECEIVE))) != 0)) {
				{
				setState(702);
				parameterDecl();
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(703);
						match(COMMA);
						setState(704);
						parameterDecl();
						}
						} 
					}
					setState(709);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(710);
					match(COMMA);
					}
				}

				}
			}

			setState(715);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(GoParser.ELLIPSIS, 0); }
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_parameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(717);
				identifierList();
				}
				break;
			}
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELLIPSIS) {
				{
				setState(720);
				match(ELLIPSIS);
				}
			}

			setState(723);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token unary_op;
		public Token mul_op;
		public Token add_op;
		public Token rel_op;
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GoParser.MINUS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(GoParser.EXCLAMATION, 0); }
		public TerminalNode CARET() { return getToken(GoParser.CARET, 0); }
		public TerminalNode STAR() { return getToken(GoParser.STAR, 0); }
		public TerminalNode AMPERSAND() { return getToken(GoParser.AMPERSAND, 0); }
		public TerminalNode RECEIVE() { return getToken(GoParser.RECEIVE, 0); }
		public TerminalNode DIV() { return getToken(GoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GoParser.MOD, 0); }
		public TerminalNode LSHIFT() { return getToken(GoParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(GoParser.RSHIFT, 0); }
		public TerminalNode BIT_CLEAR() { return getToken(GoParser.BIT_CLEAR, 0); }
		public TerminalNode OR() { return getToken(GoParser.OR, 0); }
		public TerminalNode EQUALS() { return getToken(GoParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(GoParser.NOT_EQUALS, 0); }
		public TerminalNode LESS() { return getToken(GoParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(GoParser.LESS_OR_EQUALS, 0); }
		public TerminalNode GREATER() { return getToken(GoParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(GoParser.GREATER_OR_EQUALS, 0); }
		public TerminalNode LOGICAL_AND() { return getToken(GoParser.LOGICAL_AND, 0); }
		public TerminalNode LOGICAL_OR() { return getToken(GoParser.LOGICAL_OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(726);
				primaryExpr(0);
				}
				break;
			case 2:
				{
				setState(727);
				((ExpressionContext)_localctx).unary_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0)) ) {
					((ExpressionContext)_localctx).unary_op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(728);
				expression(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(746);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(731);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(732);
						((ExpressionContext)_localctx).mul_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << LSHIFT) | (1L << RSHIFT) | (1L << BIT_CLEAR) | (1L << STAR) | (1L << AMPERSAND))) != 0)) ) {
							((ExpressionContext)_localctx).mul_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(733);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(734);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(735);
						((ExpressionContext)_localctx).add_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << CARET))) != 0)) ) {
							((ExpressionContext)_localctx).add_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(736);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(737);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(738);
						((ExpressionContext)_localctx).rel_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS) | (1L << LESS_OR_EQUALS) | (1L << GREATER) | (1L << GREATER_OR_EQUALS))) != 0)) ) {
							((ExpressionContext)_localctx).rel_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(739);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(740);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(741);
						match(LOGICAL_AND);
						setState(742);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(743);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(744);
						match(LOGICAL_OR);
						setState(745);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public MethodExprContext methodExpr() {
			return getRuleContext(MethodExprContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Slice_Context slice_() {
			return getRuleContext(Slice_Context.class,0);
		}
		public TypeAssertionContext typeAssertion() {
			return getRuleContext(TypeAssertionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GoParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(752);
				operand();
				}
				break;
			case 2:
				{
				setState(753);
				conversion();
				}
				break;
			case 3:
				{
				setState(754);
				methodExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
					setState(757);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(764);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						{
						setState(758);
						match(DOT);
						setState(759);
						match(IDENTIFIER);
						}
						}
						break;
					case 2:
						{
						setState(760);
						index();
						}
						break;
					case 3:
						{
						setState(761);
						slice_();
						}
						break;
					case 4:
						{
						setState(762);
						typeAssertion();
						}
						break;
					case 5:
						{
						setState(763);
						arguments();
						}
						break;
					}
					}
					} 
				}
				setState(770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConversionContext extends ParserRuleContext {
		public NonNamedTypeContext nonNamedType() {
			return getRuleContext(NonNamedTypeContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(GoParser.COMMA, 0); }
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			nonNamedType();
			setState(772);
			match(L_PAREN);
			setState(773);
			expression(0);
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(774);
				match(COMMA);
				}
			}

			setState(777);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonNamedTypeContext extends ParserRuleContext {
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public NonNamedTypeContext nonNamedType() {
			return getRuleContext(NonNamedTypeContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public NonNamedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonNamedType; }
	}

	public final NonNamedTypeContext nonNamedType() throws RecognitionException {
		NonNamedTypeContext _localctx = new NonNamedTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_nonNamedType);
		try {
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case L_BRACKET:
			case STAR:
			case RECEIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				typeLit();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(L_PAREN);
				setState(781);
				nonNamedType();
				setState(782);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandNameContext operandName() {
			return getRuleContext(OperandNameContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_operand);
		try {
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				operandName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(788);
				match(L_PAREN);
				setState(789);
				expression(0);
				setState(790);
				match(R_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public CompositeLitContext compositeLit() {
			return getRuleContext(CompositeLitContext.class,0);
		}
		public FunctionLitContext functionLit() {
			return getRuleContext(FunctionLitContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_literal);
		try {
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL_LIT:
			case DECIMAL_LIT:
			case BINARY_LIT:
			case OCTAL_LIT:
			case HEX_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				basicLit();
				}
				break;
			case MAP:
			case STRUCT:
			case IDENTIFIER:
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				compositeLit();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(796);
				functionLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicLitContext extends ParserRuleContext {
		public TerminalNode NIL_LIT() { return getToken(GoParser.NIL_LIT, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public TerminalNode FLOAT_LIT() { return getToken(GoParser.FLOAT_LIT, 0); }
		public BasicLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLit; }
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_basicLit);
		try {
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				match(NIL_LIT);
				}
				break;
			case DECIMAL_LIT:
			case BINARY_LIT:
			case OCTAL_LIT:
			case HEX_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				integer();
				}
				break;
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(801);
				string_();
				}
				break;
			case FLOAT_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(802);
				match(FLOAT_LIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LIT() { return getToken(GoParser.DECIMAL_LIT, 0); }
		public TerminalNode BINARY_LIT() { return getToken(GoParser.BINARY_LIT, 0); }
		public TerminalNode OCTAL_LIT() { return getToken(GoParser.OCTAL_LIT, 0); }
		public TerminalNode HEX_LIT() { return getToken(GoParser.HEX_LIT, 0); }
		public TerminalNode IMAGINARY_LIT() { return getToken(GoParser.IMAGINARY_LIT, 0); }
		public TerminalNode RUNE_LIT() { return getToken(GoParser.RUNE_LIT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public OperandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandName; }
	}

	public final OperandNameContext operandName() throws RecognitionException {
		OperandNameContext _localctx = new OperandNameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_operandName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GoParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(GoParser.DOT, 0); }
		public QualifiedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdent; }
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(IDENTIFIER);
			setState(810);
			match(DOT);
			setState(811);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompositeLitContext extends ParserRuleContext {
		public LiteralTypeContext literalType() {
			return getRuleContext(LiteralTypeContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public CompositeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeLit; }
	}

	public final CompositeLitContext compositeLit() throws RecognitionException {
		CompositeLitContext _localctx = new CompositeLitContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_compositeLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			literalType();
			setState(814);
			literalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralTypeContext extends ParserRuleContext {
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(GoParser.L_BRACKET, 0); }
		public TerminalNode ELLIPSIS() { return getToken(GoParser.ELLIPSIS, 0); }
		public TerminalNode R_BRACKET() { return getToken(GoParser.R_BRACKET, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalType; }
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_literalType);
		try {
			setState(825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				structType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				match(L_BRACKET);
				setState(819);
				match(ELLIPSIS);
				setState(820);
				match(R_BRACKET);
				setState(821);
				elementType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(822);
				sliceType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(823);
				mapType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(824);
				typeName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralValueContext extends ParserRuleContext {
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GoParser.COMMA, 0); }
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_literalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(L_CURLY);
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_CURLY) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
				{
				setState(828);
				elementList();
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(829);
					match(COMMA);
					}
				}

				}
			}

			setState(834);
			match(R_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<KeyedElementContext> keyedElement() {
			return getRuleContexts(KeyedElementContext.class);
		}
		public KeyedElementContext keyedElement(int i) {
			return getRuleContext(KeyedElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_elementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			keyedElement();
			setState(841);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(837);
					match(COMMA);
					setState(838);
					keyedElement();
					}
					} 
				}
				setState(843);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyedElementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GoParser.COLON, 0); }
		public KeyedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedElement; }
	}

	public final KeyedElementContext keyedElement() throws RecognitionException {
		KeyedElementContext _localctx = new KeyedElementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_keyedElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(844);
				key();
				setState(845);
				match(COLON);
				}
				break;
			}
			setState(849);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_key);
		try {
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case NIL_LIT:
			case IDENTIFIER:
			case L_PAREN:
			case L_BRACKET:
			case EXCLAMATION:
			case PLUS:
			case MINUS:
			case CARET:
			case STAR:
			case AMPERSAND:
			case RECEIVE:
			case DECIMAL_LIT:
			case BINARY_LIT:
			case OCTAL_LIT:
			case HEX_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				expression(0);
				}
				break;
			case L_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				literalValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_element);
		try {
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case NIL_LIT:
			case IDENTIFIER:
			case L_PAREN:
			case L_BRACKET:
			case EXCLAMATION:
			case PLUS:
			case MINUS:
			case CARET:
			case STAR:
			case AMPERSAND:
			case RECEIVE:
			case DECIMAL_LIT:
			case BINARY_LIT:
			case OCTAL_LIT:
			case HEX_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				expression(0);
				}
				break;
			case L_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				literalValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructTypeContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(GoParser.STRUCT, 0); }
		public TerminalNode L_CURLY() { return getToken(GoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(GoParser.R_CURLY, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_structType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(STRUCT);
			setState(860);
			match(L_CURLY);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER || _la==STAR) {
				{
				{
				setState(861);
				fieldDecl();
				setState(862);
				eos();
				}
				}
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(869);
			match(R_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclContext extends ParserRuleContext {
		public String_Context tag;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public EmbeddedFieldContext embeddedField() {
			return getRuleContext(EmbeddedFieldContext.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(871);
				identifierList();
				setState(872);
				type_();
				}
				break;
			case 2:
				{
				setState(874);
				embeddedField();
				}
				break;
			}
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(877);
				((FieldDeclContext)_localctx).tag = string_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_Context extends ParserRuleContext {
		public TerminalNode RAW_STRING_LIT() { return getToken(GoParser.RAW_STRING_LIT, 0); }
		public TerminalNode INTERPRETED_STRING_LIT() { return getToken(GoParser.INTERPRETED_STRING_LIT, 0); }
		public String_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_; }
	}

	public final String_Context string_() throws RecognitionException {
		String_Context _localctx = new String_Context(_ctx, getState());
		enterRule(_localctx, 178, RULE_string_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_la = _input.LA(1);
			if ( !(_la==RAW_STRING_LIT || _la==INTERPRETED_STRING_LIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmbeddedFieldContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(GoParser.STAR, 0); }
		public EmbeddedFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embeddedField; }
	}

	public final EmbeddedFieldContext embeddedField() throws RecognitionException {
		EmbeddedFieldContext _localctx = new EmbeddedFieldContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_embeddedField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(882);
				match(STAR);
				}
			}

			setState(885);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionLitContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GoParser.FUNC, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLit; }
	}

	public final FunctionLitContext functionLit() throws RecognitionException {
		FunctionLitContext _localctx = new FunctionLitContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_functionLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(FUNC);
			setState(888);
			signature();
			setState(889);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(GoParser.L_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(GoParser.R_BRACKET, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(L_BRACKET);
			setState(892);
			expression(0);
			setState(893);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Slice_Context extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(GoParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(GoParser.R_BRACKET, 0); }
		public List<TerminalNode> COLON() { return getTokens(GoParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GoParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Slice_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice_; }
	}

	public final Slice_Context slice_() throws RecognitionException {
		Slice_Context _localctx = new Slice_Context(_ctx, getState());
		enterRule(_localctx, 186, RULE_slice_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(L_BRACKET);
			setState(911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
					{
					setState(896);
					expression(0);
					}
				}

				setState(899);
				match(COLON);
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
					{
					setState(900);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
					{
					setState(903);
					expression(0);
					}
				}

				setState(906);
				match(COLON);
				setState(907);
				expression(0);
				setState(908);
				match(COLON);
				setState(909);
				expression(0);
				}
				break;
			}
			setState(913);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAssertionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(GoParser.DOT, 0); }
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public TypeAssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssertion; }
	}

	public final TypeAssertionContext typeAssertion() throws RecognitionException {
		TypeAssertionContext _localctx = new TypeAssertionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_typeAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(DOT);
			setState(916);
			match(L_PAREN);
			setState(917);
			type_();
			setState(918);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(GoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(GoParser.R_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public NonNamedTypeContext nonNamedType() {
			return getRuleContext(NonNamedTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(GoParser.ELLIPSIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(L_PAREN);
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << INTERFACE) | (1L << MAP) | (1L << STRUCT) | (1L << CHAN) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << RECEIVE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DECIMAL_LIT - 64)) | (1L << (BINARY_LIT - 64)) | (1L << (OCTAL_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (IMAGINARY_LIT - 64)) | (1L << (RUNE_LIT - 64)) | (1L << (RAW_STRING_LIT - 64)) | (1L << (INTERPRETED_STRING_LIT - 64)))) != 0)) {
				{
				setState(927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(921);
					expressionList();
					}
					break;
				case 2:
					{
					setState(922);
					nonNamedType();
					setState(925);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						setState(923);
						match(COMMA);
						setState(924);
						expressionList();
						}
						break;
					}
					}
					break;
				}
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELLIPSIS) {
					{
					setState(929);
					match(ELLIPSIS);
					}
				}

				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(932);
					match(COMMA);
					}
				}

				}
			}

			setState(937);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodExprContext extends ParserRuleContext {
		public NonNamedTypeContext nonNamedType() {
			return getRuleContext(NonNamedTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GoParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GoParser.IDENTIFIER, 0); }
		public MethodExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpr; }
	}

	public final MethodExprContext methodExpr() throws RecognitionException {
		MethodExprContext _localctx = new MethodExprContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_methodExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			nonNamedType();
			setState(940);
			match(DOT);
			setState(941);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverTypeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ReceiverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverType; }
	}

	public final ReceiverTypeContext receiverType() throws RecognitionException {
		ReceiverTypeContext _localctx = new ReceiverTypeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_receiverType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(GoParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(GoParser.EOF, 0); }
		public TerminalNode EOS() { return getToken(GoParser.EOS, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_eos);
		try {
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(945);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(946);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(947);
				match(EOS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(948);
				if (!(closingBracket())) throw new FailedPredicateException(this, "closingBracket()");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 70:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 71:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		case 98:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return closingBracket();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Z\u03ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\2\3\2\3\2\7\2\u00ce\n\2\f\2\16"+
		"\2\u00d1\13\2\3\2\3\2\3\2\5\2\u00d6\n\2\3\2\3\2\7\2\u00da\n\2\f\2\16\2"+
		"\u00dd\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00ea\n\4"+
		"\f\4\16\4\u00ed\13\4\3\4\5\4\u00f0\n\4\3\5\5\5\u00f3\n\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\5\7\u00fc\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0104\n\b\f\b"+
		"\16\b\u0107\13\b\3\b\5\b\u010a\n\b\3\t\3\t\5\t\u010e\n\t\3\t\3\t\5\t\u0112"+
		"\n\t\3\n\3\n\3\n\7\n\u0117\n\n\f\n\16\n\u011a\13\n\3\13\3\13\3\13\7\13"+
		"\u011f\n\13\f\13\16\13\u0122\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u012a\n"+
		"\f\f\f\16\f\u012d\13\f\3\f\5\f\u0130\n\f\3\r\3\r\5\r\u0134\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\5\16\u013c\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0143"+
		"\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u014d\n\21\f\21\16"+
		"\21\u0150\13\21\3\21\5\21\u0153\n\21\3\22\3\22\3\22\3\22\5\22\u0159\n"+
		"\22\3\22\3\22\5\22\u015d\n\22\3\23\3\23\5\23\u0161\n\23\3\23\3\23\3\24"+
		"\5\24\u0166\n\24\3\24\3\24\3\24\6\24\u016b\n\24\r\24\16\24\u016c\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u017e\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u0185\n\26\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\5\33\u0195"+
		"\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\5\36\u01a2"+
		"\n\36\3\37\3\37\5\37\u01a6\n\37\3 \3 \5 \u01aa\n \3!\3!\5!\u01ae\n!\3"+
		"\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01c1\n%\3%\3"+
		"%\3%\3%\5%\u01c7\n%\5%\u01c9\n%\3&\3&\5&\u01cd\n&\3\'\3\'\5\'\u01d1\n"+
		"\'\3\'\5\'\u01d4\n\'\3\'\3\'\5\'\u01d8\n\'\5\'\u01da\n\'\3\'\3\'\7\'\u01de"+
		"\n\'\f\'\16\'\u01e1\13\'\3\'\3\'\3(\3(\3(\5(\u01e8\n(\3)\3)\3)\5)\u01ed"+
		"\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01f8\n*\3*\3*\7*\u01fc\n*\f*\16*\u01ff"+
		"\13*\3*\3*\3+\3+\5+\u0205\n+\3+\3+\3+\3+\3+\3+\3,\3,\3,\5,\u0210\n,\3"+
		"-\3-\3-\5-\u0215\n-\3.\3.\5.\u0219\n.\3.\3.\3.\5.\u021e\n.\7.\u0220\n"+
		".\f.\16.\u0223\13.\3/\3/\3/\7/\u0228\n/\f/\16/\u022b\13/\3/\3/\3\60\3"+
		"\60\3\60\5\60\u0232\n\60\3\61\3\61\3\61\5\61\u0237\n\61\3\61\5\61\u023a"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0242\n\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\5\63\u024a\n\63\3\63\3\63\3\64\5\64\u024f\n\64\3\64\3\64\5"+
		"\64\u0253\n\64\3\64\3\64\5\64\u0257\n\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u025f\n\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\5\67\u026d\n\67\38\38\58\u0271\n8\39\39\39\39\39\39\39\39\59\u027b"+
		"\n9\3:\3:\3:\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3>\5>\u028d\n>\3>\3>"+
		"\7>\u0291\n>\f>\16>\u0294\13>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3"+
		"A\3A\3A\3A\5A\u02a7\nA\3A\3A\3B\3B\3B\3B\3B\3B\5B\u02b1\nB\3C\3C\3C\3"+
		"D\3D\3D\3D\5D\u02ba\nD\3E\3E\5E\u02be\nE\3F\3F\3F\3F\7F\u02c4\nF\fF\16"+
		"F\u02c7\13F\3F\5F\u02ca\nF\5F\u02cc\nF\3F\3F\3G\5G\u02d1\nG\3G\5G\u02d4"+
		"\nG\3G\3G\3H\3H\3H\3H\5H\u02dc\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\7H\u02ed\nH\fH\16H\u02f0\13H\3I\3I\3I\3I\5I\u02f6\nI\3I\3I\3"+
		"I\3I\3I\3I\3I\5I\u02ff\nI\7I\u0301\nI\fI\16I\u0304\13I\3J\3J\3J\3J\5J"+
		"\u030a\nJ\3J\3J\3K\3K\3K\3K\3K\5K\u0313\nK\3L\3L\3L\3L\3L\3L\5L\u031b"+
		"\nL\3M\3M\3M\5M\u0320\nM\3N\3N\3N\3N\5N\u0326\nN\3O\3O\3P\3P\3Q\3Q\3Q"+
		"\3Q\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u033c\nS\3T\3T\3T\5T\u0341"+
		"\nT\5T\u0343\nT\3T\3T\3U\3U\3U\7U\u034a\nU\fU\16U\u034d\13U\3V\3V\3V\5"+
		"V\u0352\nV\3V\3V\3W\3W\5W\u0358\nW\3X\3X\5X\u035c\nX\3Y\3Y\3Y\3Y\3Y\7"+
		"Y\u0363\nY\fY\16Y\u0366\13Y\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u036e\nZ\3Z\5Z\u0371"+
		"\nZ\3[\3[\3\\\5\\\u0376\n\\\3\\\3\\\3]\3]\3]\3]\3^\3^\3^\3^\3_\3_\5_\u0384"+
		"\n_\3_\3_\5_\u0388\n_\3_\5_\u038b\n_\3_\3_\3_\3_\3_\5_\u0392\n_\3_\3_"+
		"\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\5a\u03a0\na\5a\u03a2\na\3a\5a\u03a5\na"+
		"\3a\5a\u03a8\na\5a\u03aa\na\3a\3a\3b\3b\3b\3b\3c\3c\3d\3d\3d\3d\5d\u03b8"+
		"\nd\3d\2\4\u008e\u0090e\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\2\f\4\2\35\35("+
		"(\3\2)*\4\2\65:<@\4\2&&YY\3\2;A\4\2\66:?@\4\2\65\65<>\3\2/\64\4\2BEIJ"+
		"\3\2PQ\2\u03f2\2\u00c8\3\2\2\2\4\u00e0\3\2\2\2\6\u00e3\3\2\2\2\b\u00f2"+
		"\3\2\2\2\n\u00f6\3\2\2\2\f\u00fb\3\2\2\2\16\u00fd\3\2\2\2\20\u010b\3\2"+
		"\2\2\22\u0113\3\2\2\2\24\u011b\3\2\2\2\26\u0123\3\2\2\2\30\u0131\3\2\2"+
		"\2\32\u0137\3\2\2\2\34\u013d\3\2\2\2\36\u0144\3\2\2\2 \u0146\3\2\2\2\""+
		"\u0154\3\2\2\2$\u015e\3\2\2\2&\u016a\3\2\2\2(\u017d\3\2\2\2*\u0184\3\2"+
		"\2\2,\u0186\3\2\2\2.\u0188\3\2\2\2\60\u018c\3\2\2\2\62\u018f\3\2\2\2\64"+
		"\u0194\3\2\2\2\66\u0198\3\2\2\28\u019c\3\2\2\2:\u019e\3\2\2\2<\u01a3\3"+
		"\2\2\2>\u01a7\3\2\2\2@\u01ab\3\2\2\2B\u01af\3\2\2\2D\u01b2\3\2\2\2F\u01b4"+
		"\3\2\2\2H\u01b7\3\2\2\2J\u01cc\3\2\2\2L\u01ce\3\2\2\2N\u01e4\3\2\2\2P"+
		"\u01ec\3\2\2\2R\u01ee\3\2\2\2T\u0204\3\2\2\2V\u020c\3\2\2\2X\u0214\3\2"+
		"\2\2Z\u0218\3\2\2\2\\\u0224\3\2\2\2^\u022e\3\2\2\2`\u0239\3\2\2\2b\u0241"+
		"\3\2\2\2d\u0245\3\2\2\2f\u024e\3\2\2\2h\u025e\3\2\2\2j\u0263\3\2\2\2l"+
		"\u026c\3\2\2\2n\u0270\3\2\2\2p\u027a\3\2\2\2r\u027c\3\2\2\2t\u0281\3\2"+
		"\2\2v\u0283\3\2\2\2x\u0285\3\2\2\2z\u0288\3\2\2\2|\u0297\3\2\2\2~\u029b"+
		"\3\2\2\2\u0080\u02a6\3\2\2\2\u0082\u02b0\3\2\2\2\u0084\u02b2\3\2\2\2\u0086"+
		"\u02b9\3\2\2\2\u0088\u02bd\3\2\2\2\u008a\u02bf\3\2\2\2\u008c\u02d0\3\2"+
		"\2\2\u008e\u02db\3\2\2\2\u0090\u02f5\3\2\2\2\u0092\u0305\3\2\2\2\u0094"+
		"\u0312\3\2\2\2\u0096\u031a\3\2\2\2\u0098\u031f\3\2\2\2\u009a\u0325\3\2"+
		"\2\2\u009c\u0327\3\2\2\2\u009e\u0329\3\2\2\2\u00a0\u032b\3\2\2\2\u00a2"+
		"\u032f\3\2\2\2\u00a4\u033b\3\2\2\2\u00a6\u033d\3\2\2\2\u00a8\u0346\3\2"+
		"\2\2\u00aa\u0351\3\2\2\2\u00ac\u0357\3\2\2\2\u00ae\u035b\3\2\2\2\u00b0"+
		"\u035d\3\2\2\2\u00b2\u036d\3\2\2\2\u00b4\u0372\3\2\2\2\u00b6\u0375\3\2"+
		"\2\2\u00b8\u0379\3\2\2\2\u00ba\u037d\3\2\2\2\u00bc\u0381\3\2\2\2\u00be"+
		"\u0395\3\2\2\2\u00c0\u039a\3\2\2\2\u00c2\u03ad\3\2\2\2\u00c4\u03b1\3\2"+
		"\2\2\u00c6\u03b7\3\2\2\2\u00c8\u00c9\5\4\3\2\u00c9\u00cf\5\u00c6d\2\u00ca"+
		"\u00cb\5\6\4\2\u00cb\u00cc\5\u00c6d\2\u00cc\u00ce\3\2\2\2\u00cd\u00ca"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00db\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d6\5\32\16\2\u00d3\u00d6\5"+
		"\34\17\2\u00d4\u00d6\5\f\7\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\5\u00c6d\2\u00d8\u00da"+
		"\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\2"+
		"\2\3\u00df\3\3\2\2\2\u00e0\u00e1\7\20\2\2\u00e1\u00e2\7\35\2\2\u00e2\5"+
		"\3\2\2\2\u00e3\u00ef\7\31\2\2\u00e4\u00f0\5\b\5\2\u00e5\u00eb\7\36\2\2"+
		"\u00e6\u00e7\5\b\5\2\u00e7\u00e8\5\u00c6d\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\7\37\2\2\u00ef"+
		"\u00e4\3\2\2\2\u00ef\u00e5\3\2\2\2\u00f0\7\3\2\2\2\u00f1\u00f3\t\2\2\2"+
		"\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5"+
		"\5\n\6\2\u00f5\t\3\2\2\2\u00f6\u00f7\5\u00b4[\2\u00f7\13\3\2\2\2\u00f8"+
		"\u00fc\5\16\b\2\u00f9\u00fc\5\26\f\2\u00fa\u00fc\5 \21\2\u00fb\u00f8\3"+
		"\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\r\3\2\2\2\u00fd\u0109"+
		"\7\22\2\2\u00fe\u010a\5\20\t\2\u00ff\u0105\7\36\2\2\u0100\u0101\5\20\t"+
		"\2\u0101\u0102\5\u00c6d\2\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u010a\7\37\2\2\u0109\u00fe\3\2\2\2\u0109"+
		"\u00ff\3\2\2\2\u010a\17\3\2\2\2\u010b\u0111\5\22\n\2\u010c\u010e\5l\67"+
		"\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110"+
		"\7$\2\2\u0110\u0112\5\24\13\2\u0111\u010d\3\2\2\2\u0111\u0112\3\2\2\2"+
		"\u0112\21\3\2\2\2\u0113\u0118\7\35\2\2\u0114\u0115\7%\2\2\u0115\u0117"+
		"\7\35\2\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2"+
		"\u0118\u0119\3\2\2\2\u0119\23\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0120"+
		"\5\u008eH\2\u011c\u011d\7%\2\2\u011d\u011f\5\u008eH\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\25\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u012f\7\26\2\2\u0124\u0130\5\30"+
		"\r\2\u0125\u012b\7\36\2\2\u0126\u0127\5\30\r\2\u0127\u0128\5\u00c6d\2"+
		"\u0128\u012a\3\2\2\2\u0129\u0126\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0130\7\37\2\2\u012f\u0124\3\2\2\2\u012f\u0125\3\2\2\2\u0130\27\3\2\2"+
		"\2\u0131\u0133\7\35\2\2\u0132\u0134\7$\2\2\u0133\u0132\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\5l\67\2\u0136\31\3\2\2\2\u0137"+
		"\u0138\7\5\2\2\u0138\u0139\7\35\2\2\u0139\u013b\5\u0086D\2\u013a\u013c"+
		"\5$\23\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\33\3\2\2\2\u013d"+
		"\u013e\7\5\2\2\u013e\u013f\5\36\20\2\u013f\u0140\7\35\2\2\u0140\u0142"+
		"\5\u0086D\2\u0141\u0143\5$\23\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2"+
		"\2\u0143\35\3\2\2\2\u0144\u0145\5\u008aF\2\u0145\37\3\2\2\2\u0146\u0152"+
		"\7\33\2\2\u0147\u0153\5\"\22\2\u0148\u014e\7\36\2\2\u0149\u014a\5\"\22"+
		"\2\u014a\u014b\5\u00c6d\2\u014b\u014d\3\2\2\2\u014c\u0149\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0151\u0153\7\37\2\2\u0152\u0147\3\2\2\2\u0152"+
		"\u0148\3\2\2\2\u0153!\3\2\2\2\u0154\u015c\5\22\n\2\u0155\u0158\5l\67\2"+
		"\u0156\u0157\7$\2\2\u0157\u0159\5\24\13\2\u0158\u0156\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015d\3\2\2\2\u015a\u015b\7$\2\2\u015b\u015d\5\24\13\2"+
		"\u015c\u0155\3\2\2\2\u015c\u015a\3\2\2\2\u015d#\3\2\2\2\u015e\u0160\7"+
		" \2\2\u015f\u0161\5&\24\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\7!\2\2\u0163%\3\2\2\2\u0164\u0166\5\u00c6d"+
		"\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168"+
		"\5(\25\2\u0168\u0169\5\u00c6d\2\u0169\u016b\3\2\2\2\u016a\u0165\3\2\2"+
		"\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\'"+
		"\3\2\2\2\u016e\u017e\5\f\7\2\u016f\u017e\5:\36\2\u0170\u017e\5*\26\2\u0171"+
		"\u017e\5j\66\2\u0172\u017e\5<\37\2\u0173\u017e\5> \2\u0174\u017e\5@!\2"+
		"\u0175\u017e\5B\"\2\u0176\u017e\5D#\2\u0177\u017e\5$\23\2\u0178\u017e"+
		"\5H%\2\u0179\u017e\5J&\2\u017a\u017e\5\\/\2\u017b\u017e\5d\63\2\u017c"+
		"\u017e\5F$\2\u017d\u016e\3\2\2\2\u017d\u016f\3\2\2\2\u017d\u0170\3\2\2"+
		"\2\u017d\u0171\3\2\2\2\u017d\u0172\3\2\2\2\u017d\u0173\3\2\2\2\u017d\u0174"+
		"\3\2\2\2\u017d\u0175\3\2\2\2\u017d\u0176\3\2\2\2\u017d\u0177\3\2\2\2\u017d"+
		"\u0178\3\2\2\2\u017d\u0179\3\2\2\2\u017d\u017a\3\2\2\2\u017d\u017b\3\2"+
		"\2\2\u017d\u017c\3\2\2\2\u017e)\3\2\2\2\u017f\u0185\5.\30\2\u0180\u0185"+
		"\5\60\31\2\u0181\u0185\5\62\32\2\u0182\u0185\5,\27\2\u0183\u0185\5\66"+
		"\34\2\u0184\u017f\3\2\2\2\u0184\u0180\3\2\2\2\u0184\u0181\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185+\3\2\2\2\u0186\u0187\5\u008e"+
		"H\2\u0187-\3\2\2\2\u0188\u0189\5\u008eH\2\u0189\u018a\7A\2\2\u018a\u018b"+
		"\5\u008eH\2\u018b/\3\2\2\2\u018c\u018d\5\u008eH\2\u018d\u018e\t\3\2\2"+
		"\u018e\61\3\2\2\2\u018f\u0190\5\24\13\2\u0190\u0191\5\64\33\2\u0191\u0192"+
		"\5\24\13\2\u0192\63\3\2\2\2\u0193\u0195\t\4\2\2\u0194\u0193\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\7$\2\2\u0197\65\3\2\2\2"+
		"\u0198\u0199\5\22\n\2\u0199\u019a\7+\2\2\u019a\u019b\5\24\13\2\u019b\67"+
		"\3\2\2\2\u019c\u019d\t\5\2\2\u019d9\3\2\2\2\u019e\u019f\7\35\2\2\u019f"+
		"\u01a1\7\'\2\2\u01a0\u01a2\5(\25\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2;\3\2\2\2\u01a3\u01a5\7\32\2\2\u01a4\u01a6\5\24\13\2\u01a5\u01a4"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6=\3\2\2\2\u01a7\u01a9\7\3\2\2\u01a8"+
		"\u01aa\7\35\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa?\3\2\2\2"+
		"\u01ab\u01ad\7\27\2\2\u01ac\u01ae\7\35\2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01aeA\3\2\2\2\u01af\u01b0\7\17\2\2\u01b0\u01b1\7\35\2\2\u01b1"+
		"C\3\2\2\2\u01b2\u01b3\7\23\2\2\u01b3E\3\2\2\2\u01b4\u01b5\7\t\2\2\u01b5"+
		"\u01b6\5\u008eH\2\u01b6G\3\2\2\2\u01b7\u01c0\7\24\2\2\u01b8\u01c1\5\u008e"+
		"H\2\u01b9\u01ba\5\u00c6d\2\u01ba\u01bb\5\u008eH\2\u01bb\u01c1\3\2\2\2"+
		"\u01bc\u01bd\5*\26\2\u01bd\u01be\5\u00c6d\2\u01be\u01bf\5\u008eH\2\u01bf"+
		"\u01c1\3\2\2\2\u01c0\u01b8\3\2\2\2\u01c0\u01b9\3\2\2\2\u01c0\u01bc\3\2"+
		"\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c8\5$\23\2\u01c3\u01c6\7\16\2\2\u01c4"+
		"\u01c7\5H%\2\u01c5\u01c7\5$\23\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2"+
		"\2\u01c7\u01c9\3\2\2\2\u01c8\u01c3\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9I"+
		"\3\2\2\2\u01ca\u01cd\5L\'\2\u01cb\u01cd\5R*\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cb\3\2\2\2\u01cdK\3\2\2\2\u01ce\u01d9\7\21\2\2\u01cf\u01d1\5\u008e"+
		"H\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01da\3\2\2\2\u01d2"+
		"\u01d4\5*\26\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\u01d7\5\u00c6d\2\u01d6\u01d8\5\u008eH\2\u01d7\u01d6\3\2\2\2"+
		"\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d0\3\2\2\2\u01d9\u01d3"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01df\7 \2\2\u01dc\u01de\5N(\2\u01dd"+
		"\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7!\2\2\u01e3"+
		"M\3\2\2\2\u01e4\u01e5\5P)\2\u01e5\u01e7\7\'\2\2\u01e6\u01e8\5&\24\2\u01e7"+
		"\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8O\3\2\2\2\u01e9\u01ea\7\b\2\2"+
		"\u01ea\u01ed\5\24\13\2\u01eb\u01ed\7\4\2\2\u01ec\u01e9\3\2\2\2\u01ec\u01eb"+
		"\3\2\2\2\u01edQ\3\2\2\2\u01ee\u01f7\7\21\2\2\u01ef\u01f8\5T+\2\u01f0\u01f1"+
		"\5\u00c6d\2\u01f1\u01f2\5T+\2\u01f2\u01f8\3\2\2\2\u01f3\u01f4\5*\26\2"+
		"\u01f4\u01f5\5\u00c6d\2\u01f5\u01f6\5T+\2\u01f6\u01f8\3\2\2\2\u01f7\u01ef"+
		"\3\2\2\2\u01f7\u01f0\3\2\2\2\u01f7\u01f3\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fd\7 \2\2\u01fa\u01fc\5V,\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2\2"+
		"\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd"+
		"\3\2\2\2\u0200\u0201\7!\2\2\u0201S\3\2\2\2\u0202\u0203\7\35\2\2\u0203"+
		"\u0205\7+\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u0207\5\u0090I\2\u0207\u0208\7(\2\2\u0208\u0209\7\36\2\2\u0209"+
		"\u020a\7\26\2\2\u020a\u020b\7\37\2\2\u020bU\3\2\2\2\u020c\u020d\5X-\2"+
		"\u020d\u020f\7\'\2\2\u020e\u0210\5&\24\2\u020f\u020e\3\2\2\2\u020f\u0210"+
		"\3\2\2\2\u0210W\3\2\2\2\u0211\u0212\7\b\2\2\u0212\u0215\5Z.\2\u0213\u0215"+
		"\7\4\2\2\u0214\u0211\3\2\2\2\u0214\u0213\3\2\2\2\u0215Y\3\2\2\2\u0216"+
		"\u0219\5l\67\2\u0217\u0219\7\34\2\2\u0218\u0216\3\2\2\2\u0218\u0217\3"+
		"\2\2\2\u0219\u0221\3\2\2\2\u021a\u021d\7%\2\2\u021b\u021e\5l\67\2\u021c"+
		"\u021e\7\34\2\2\u021d\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021e\u0220\3"+
		"\2\2\2\u021f\u021a\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222[\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0225\7\7\2\2"+
		"\u0225\u0229\7 \2\2\u0226\u0228\5^\60\2\u0227\u0226\3\2\2\2\u0228\u022b"+
		"\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022c\u022d\7!\2\2\u022d]\3\2\2\2\u022e\u022f\5`\61\2\u022f"+
		"\u0231\7\'\2\2\u0230\u0232\5&\24\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2"+
		"\2\2\u0232_\3\2\2\2\u0233\u0236\7\b\2\2\u0234\u0237\5.\30\2\u0235\u0237"+
		"\5b\62\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238"+
		"\u023a\7\4\2\2\u0239\u0233\3\2\2\2\u0239\u0238\3\2\2\2\u023aa\3\2\2\2"+
		"\u023b\u023c\5\24\13\2\u023c\u023d\7$\2\2\u023d\u0242\3\2\2\2\u023e\u023f"+
		"\5\22\n\2\u023f\u0240\7+\2\2\u0240\u0242\3\2\2\2\u0241\u023b\3\2\2\2\u0241"+
		"\u023e\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\5\u008e"+
		"H\2\u0244c\3\2\2\2\u0245\u0249\7\30\2\2\u0246\u024a\5\u008eH\2\u0247\u024a"+
		"\5f\64\2\u0248\u024a\5h\65\2\u0249\u0246\3\2\2\2\u0249\u0247\3\2\2\2\u0249"+
		"\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\5$"+
		"\23\2\u024ce\3\2\2\2\u024d\u024f\5*\26\2\u024e\u024d\3\2\2\2\u024e\u024f"+
		"\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\5\u00c6d\2\u0251\u0253\5\u008e"+
		"H\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"\u0256\5\u00c6d\2\u0255\u0257\5*\26\2\u0256\u0255\3\2\2\2\u0256\u0257"+
		"\3\2\2\2\u0257g\3\2\2\2\u0258\u0259\5\24\13\2\u0259\u025a\7$\2\2\u025a"+
		"\u025f\3\2\2\2\u025b\u025c\5\22\n\2\u025c\u025d\7+\2\2\u025d\u025f\3\2"+
		"\2\2\u025e\u0258\3\2\2\2\u025e\u025b\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260\u0261\7\25\2\2\u0261\u0262\5\u008eH\2\u0262i\3\2"+
		"\2\2\u0263\u0264\7\n\2\2\u0264\u0265\5\u008eH\2\u0265k\3\2\2\2\u0266\u026d"+
		"\5n8\2\u0267\u026d\5p9\2\u0268\u0269\7\36\2\2\u0269\u026a\5l\67\2\u026a"+
		"\u026b\7\37\2\2\u026b\u026d\3\2\2\2\u026c\u0266\3\2\2\2\u026c\u0267\3"+
		"\2\2\2\u026c\u0268\3\2\2\2\u026dm\3\2\2\2\u026e\u0271\5\u00a0Q\2\u026f"+
		"\u0271\7\35\2\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2\2\u0271o\3\2\2\2"+
		"\u0272\u027b\5r:\2\u0273\u027b\5\u00b0Y\2\u0274\u027b\5x=\2\u0275\u027b"+
		"\5\u0084C\2\u0276\u027b\5z>\2\u0277\u027b\5|?\2\u0278\u027b\5~@\2\u0279"+
		"\u027b\5\u0080A\2\u027a\u0272\3\2\2\2\u027a\u0273\3\2\2\2\u027a\u0274"+
		"\3\2\2\2\u027a\u0275\3\2\2\2\u027a\u0276\3\2\2\2\u027a\u0277\3\2\2\2\u027a"+
		"\u0278\3\2\2\2\u027a\u0279\3\2\2\2\u027bq\3\2\2\2\u027c\u027d\7\"\2\2"+
		"\u027d\u027e\5t;\2\u027e\u027f\7#\2\2\u027f\u0280\5v<\2\u0280s\3\2\2\2"+
		"\u0281\u0282\5\u008eH\2\u0282u\3\2\2\2\u0283\u0284\5l\67\2\u0284w\3\2"+
		"\2\2\u0285\u0286\7?\2\2\u0286\u0287\5l\67\2\u0287y\3\2\2\2\u0288\u0289"+
		"\7\6\2\2\u0289\u0292\7 \2\2\u028a\u028d\5\u0082B\2\u028b\u028d\5n8\2\u028c"+
		"\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\5\u00c6"+
		"d\2\u028f\u0291\3\2\2\2\u0290\u028c\3\2\2\2\u0291\u0294\3\2\2\2\u0292"+
		"\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u0292\3\2"+
		"\2\2\u0295\u0296\7!\2\2\u0296{\3\2\2\2\u0297\u0298\7\"\2\2\u0298\u0299"+
		"\7#\2\2\u0299\u029a\5v<\2\u029a}\3\2\2\2\u029b\u029c\7\13\2\2\u029c\u029d"+
		"\7\"\2\2\u029d\u029e\5l\67\2\u029e\u029f\7#\2\2\u029f\u02a0\5v<\2\u02a0"+
		"\177\3\2\2\2\u02a1\u02a7\7\r\2\2\u02a2\u02a3\7\r\2\2\u02a3\u02a7\7A\2"+
		"\2\u02a4\u02a5\7A\2\2\u02a5\u02a7\7\r\2\2\u02a6\u02a1\3\2\2\2\u02a6\u02a2"+
		"\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\5v<\2\u02a9"+
		"\u0081\3\2\2\2\u02aa\u02ab\7\35\2\2\u02ab\u02ac\5\u008aF\2\u02ac\u02ad"+
		"\5\u0088E\2\u02ad\u02b1\3\2\2\2\u02ae\u02af\7\35\2\2\u02af\u02b1\5\u008a"+
		"F\2\u02b0\u02aa\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u0083\3\2\2\2\u02b2"+
		"\u02b3\7\5\2\2\u02b3\u02b4\5\u0086D\2\u02b4\u0085\3\2\2\2\u02b5\u02b6"+
		"\5\u008aF\2\u02b6\u02b7\5\u0088E\2\u02b7\u02ba\3\2\2\2\u02b8\u02ba\5\u008a"+
		"F\2\u02b9\u02b5\3\2\2\2\u02b9\u02b8\3\2\2\2\u02ba\u0087\3\2\2\2\u02bb"+
		"\u02be\5\u008aF\2\u02bc\u02be\5l\67\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc"+
		"\3\2\2\2\u02be\u0089\3\2\2\2\u02bf\u02cb\7\36\2\2\u02c0\u02c5\5\u008c"+
		"G\2\u02c1\u02c2\7%\2\2\u02c2\u02c4\5\u008cG\2\u02c3\u02c1\3\2\2\2\u02c4"+
		"\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c9\3\2"+
		"\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02ca\7%\2\2\u02c9\u02c8\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c0\3\2\2\2\u02cb\u02cc\3\2"+
		"\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\7\37\2\2\u02ce\u008b\3\2\2\2\u02cf"+
		"\u02d1\5\22\n\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3"+
		"\2\2\2\u02d2\u02d4\7,\2\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02d5\3\2\2\2\u02d5\u02d6\5l\67\2\u02d6\u008d\3\2\2\2\u02d7\u02d8\bH"+
		"\1\2\u02d8\u02dc\5\u0090I\2\u02d9\u02da\t\6\2\2\u02da\u02dc\5\u008eH\b"+
		"\u02db\u02d7\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02ee\3\2\2\2\u02dd\u02de"+
		"\f\7\2\2\u02de\u02df\t\7\2\2\u02df\u02ed\5\u008eH\b\u02e0\u02e1\f\6\2"+
		"\2\u02e1\u02e2\t\b\2\2\u02e2\u02ed\5\u008eH\7\u02e3\u02e4\f\5\2\2\u02e4"+
		"\u02e5\t\t\2\2\u02e5\u02ed\5\u008eH\6\u02e6\u02e7\f\4\2\2\u02e7\u02e8"+
		"\7.\2\2\u02e8\u02ed\5\u008eH\5\u02e9\u02ea\f\3\2\2\u02ea\u02eb\7-\2\2"+
		"\u02eb\u02ed\5\u008eH\4\u02ec\u02dd\3\2\2\2\u02ec\u02e0\3\2\2\2\u02ec"+
		"\u02e3\3\2\2\2\u02ec\u02e6\3\2\2\2\u02ec\u02e9\3\2\2\2\u02ed\u02f0\3\2"+
		"\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u008f\3\2\2\2\u02f0"+
		"\u02ee\3\2\2\2\u02f1\u02f2\bI\1\2\u02f2\u02f6\5\u0096L\2\u02f3\u02f6\5"+
		"\u0092J\2\u02f4\u02f6\5\u00c2b\2\u02f5\u02f1\3\2\2\2\u02f5\u02f3\3\2\2"+
		"\2\u02f5\u02f4\3\2\2\2\u02f6\u0302\3\2\2\2\u02f7\u02fe\f\3\2\2\u02f8\u02f9"+
		"\7(\2\2\u02f9\u02ff\7\35\2\2\u02fa\u02ff\5\u00ba^\2\u02fb\u02ff\5\u00bc"+
		"_\2\u02fc\u02ff\5\u00be`\2\u02fd\u02ff\5\u00c0a\2\u02fe\u02f8\3\2\2\2"+
		"\u02fe\u02fa\3\2\2\2\u02fe\u02fb\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02fd"+
		"\3\2\2\2\u02ff\u0301\3\2\2\2\u0300\u02f7\3\2\2\2\u0301\u0304\3\2\2\2\u0302"+
		"\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0091\3\2\2\2\u0304\u0302\3\2"+
		"\2\2\u0305\u0306\5\u0094K\2\u0306\u0307\7\36\2\2\u0307\u0309\5\u008eH"+
		"\2\u0308\u030a\7%\2\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b"+
		"\3\2\2\2\u030b\u030c\7\37\2\2\u030c\u0093\3\2\2\2\u030d\u0313\5p9\2\u030e"+
		"\u030f\7\36\2\2\u030f\u0310\5\u0094K\2\u0310\u0311\7\37\2\2\u0311\u0313"+
		"\3\2\2\2\u0312\u030d\3\2\2\2\u0312\u030e\3\2\2\2\u0313\u0095\3\2\2\2\u0314"+
		"\u031b\5\u0098M\2\u0315\u031b\5\u009eP\2\u0316\u0317\7\36\2\2\u0317\u0318"+
		"\5\u008eH\2\u0318\u0319\7\37\2\2\u0319\u031b\3\2\2\2\u031a\u0314\3\2\2"+
		"\2\u031a\u0315\3\2\2\2\u031a\u0316\3\2\2\2\u031b\u0097\3\2\2\2\u031c\u0320"+
		"\5\u009aN\2\u031d\u0320\5\u00a2R\2\u031e\u0320\5\u00b8]\2\u031f\u031c"+
		"\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u031e\3\2\2\2\u0320\u0099\3\2\2\2\u0321"+
		"\u0326\7\34\2\2\u0322\u0326\5\u009cO\2\u0323\u0326\5\u00b4[\2\u0324\u0326"+
		"\7F\2\2\u0325\u0321\3\2\2\2\u0325\u0322\3\2\2\2\u0325\u0323\3\2\2\2\u0325"+
		"\u0324\3\2\2\2\u0326\u009b\3\2\2\2\u0327\u0328\t\n\2\2\u0328\u009d\3\2"+
		"\2\2\u0329\u032a\7\35\2\2\u032a\u009f\3\2\2\2\u032b\u032c\7\35\2\2\u032c"+
		"\u032d\7(\2\2\u032d\u032e\7\35\2\2\u032e\u00a1\3\2\2\2\u032f\u0330\5\u00a4"+
		"S\2\u0330\u0331\5\u00a6T\2\u0331\u00a3\3\2\2\2\u0332\u033c\5\u00b0Y\2"+
		"\u0333\u033c\5r:\2\u0334\u0335\7\"\2\2\u0335\u0336\7,\2\2\u0336\u0337"+
		"\7#\2\2\u0337\u033c\5v<\2\u0338\u033c\5|?\2\u0339\u033c\5~@\2\u033a\u033c"+
		"\5n8\2\u033b\u0332\3\2\2\2\u033b\u0333\3\2\2\2\u033b\u0334\3\2\2\2\u033b"+
		"\u0338\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033a\3\2\2\2\u033c\u00a5\3\2"+
		"\2\2\u033d\u0342\7 \2\2\u033e\u0340\5\u00a8U\2\u033f\u0341\7%\2\2\u0340"+
		"\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0343\3\2\2\2\u0342\u033e\3\2"+
		"\2\2\u0342\u0343\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345\7!\2\2\u0345"+
		"\u00a7\3\2\2\2\u0346\u034b\5\u00aaV\2\u0347\u0348\7%\2\2\u0348\u034a\5"+
		"\u00aaV\2\u0349\u0347\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2"+
		"\u034b\u034c\3\2\2\2\u034c\u00a9\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u034f"+
		"\5\u00acW\2\u034f\u0350\7\'\2\2\u0350\u0352\3\2\2\2\u0351\u034e\3\2\2"+
		"\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\5\u00aeX\2\u0354"+
		"\u00ab\3\2\2\2\u0355\u0358\5\u008eH\2\u0356\u0358\5\u00a6T\2\u0357\u0355"+
		"\3\2\2\2\u0357\u0356\3\2\2\2\u0358\u00ad\3\2\2\2\u0359\u035c\5\u008eH"+
		"\2\u035a\u035c\5\u00a6T\2\u035b\u0359\3\2\2\2\u035b\u035a\3\2\2\2\u035c"+
		"\u00af\3\2\2\2\u035d\u035e\7\f\2\2\u035e\u0364\7 \2\2\u035f\u0360\5\u00b2"+
		"Z\2\u0360\u0361\5\u00c6d\2\u0361\u0363\3\2\2\2\u0362\u035f\3\2\2\2\u0363"+
		"\u0366\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367\3\2"+
		"\2\2\u0366\u0364\3\2\2\2\u0367\u0368\7!\2\2\u0368\u00b1\3\2\2\2\u0369"+
		"\u036a\5\22\n\2\u036a\u036b\5l\67\2\u036b\u036e\3\2\2\2\u036c\u036e\5"+
		"\u00b6\\\2\u036d\u0369\3\2\2\2\u036d\u036c\3\2\2\2\u036e\u0370\3\2\2\2"+
		"\u036f\u0371\5\u00b4[\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"\u00b3\3\2\2\2\u0372\u0373\t\13\2\2\u0373\u00b5\3\2\2\2\u0374\u0376\7"+
		"?\2\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2\2\2\u0377"+
		"\u0378\5n8\2\u0378\u00b7\3\2\2\2\u0379\u037a\7\5\2\2\u037a\u037b\5\u0086"+
		"D\2\u037b\u037c\5$\23\2\u037c\u00b9\3\2\2\2\u037d\u037e\7\"\2\2\u037e"+
		"\u037f\5\u008eH\2\u037f\u0380\7#\2\2\u0380\u00bb\3\2\2\2\u0381\u0391\7"+
		"\"\2\2\u0382\u0384\5\u008eH\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2"+
		"\u0384\u0385\3\2\2\2\u0385\u0387\7\'\2\2\u0386\u0388\5\u008eH\2\u0387"+
		"\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0392\3\2\2\2\u0389\u038b\5\u008e"+
		"H\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u038d\7\'\2\2\u038d\u038e\5\u008eH\2\u038e\u038f\7\'\2\2\u038f\u0390"+
		"\5\u008eH\2\u0390\u0392\3\2\2\2\u0391\u0383\3\2\2\2\u0391\u038a\3\2\2"+
		"\2\u0392\u0393\3\2\2\2\u0393\u0394\7#\2\2\u0394\u00bd\3\2\2\2\u0395\u0396"+
		"\7(\2\2\u0396\u0397\7\36\2\2\u0397\u0398\5l\67\2\u0398\u0399\7\37\2\2"+
		"\u0399\u00bf\3\2\2\2\u039a\u03a9\7\36\2\2\u039b\u03a2\5\24\13\2\u039c"+
		"\u039f\5\u0094K\2\u039d\u039e\7%\2\2\u039e\u03a0\5\24\13\2\u039f\u039d"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1\u039b\3\2\2\2\u03a1"+
		"\u039c\3\2\2\2\u03a2\u03a4\3\2\2\2\u03a3\u03a5\7,\2\2\u03a4\u03a3\3\2"+
		"\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\3\2\2\2\u03a6\u03a8\7%\2\2\u03a7"+
		"\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9\u03a1\3\2"+
		"\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\7\37\2\2\u03ac"+
		"\u00c1\3\2\2\2\u03ad\u03ae\5\u0094K\2\u03ae\u03af\7(\2\2\u03af\u03b0\7"+
		"\35\2\2\u03b0\u00c3\3\2\2\2\u03b1\u03b2\5l\67\2\u03b2\u00c5\3\2\2\2\u03b3"+
		"\u03b8\7&\2\2\u03b4\u03b8\7\2\2\3\u03b5\u03b8\7Y\2\2\u03b6\u03b8\6d\b"+
		"\2\u03b7\u03b3\3\2\2\2\u03b7\u03b4\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b6"+
		"\3\2\2\2\u03b8\u00c7\3\2\2\2m\u00cf\u00d5\u00db\u00eb\u00ef\u00f2\u00fb"+
		"\u0105\u0109\u010d\u0111\u0118\u0120\u012b\u012f\u0133\u013b\u0142\u014e"+
		"\u0152\u0158\u015c\u0160\u0165\u016c\u017d\u0184\u0194\u01a1\u01a5\u01a9"+
		"\u01ad\u01c0\u01c6\u01c8\u01cc\u01d0\u01d3\u01d7\u01d9\u01df\u01e7\u01ec"+
		"\u01f7\u01fd\u0204\u020f\u0214\u0218\u021d\u0221\u0229\u0231\u0236\u0239"+
		"\u0241\u0249\u024e\u0252\u0256\u025e\u026c\u0270\u027a\u028c\u0292\u02a6"+
		"\u02b0\u02b9\u02bd\u02c5\u02c9\u02cb\u02d0\u02d3\u02db\u02ec\u02ee\u02f5"+
		"\u02fe\u0302\u0309\u0312\u031a\u031f\u0325\u033b\u0340\u0342\u034b\u0351"+
		"\u0357\u035b\u0364\u036d\u0370\u0375\u0383\u0387\u038a\u0391\u039f\u03a1"+
		"\u03a4\u03a7\u03a9\u03b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}