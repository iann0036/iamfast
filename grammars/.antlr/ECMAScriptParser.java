// Generated from /Users/ian/iamfast-js/grammars/ECMAScript.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ECMAScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RegularExpressionLiteral=1, LineTerminator=2, OpenBracket=3, CloseBracket=4, 
		OpenParen=5, CloseParen=6, OpenBrace=7, CloseBrace=8, SemiColon=9, Comma=10, 
		Assign=11, QuestionMark=12, Colon=13, Dot=14, PlusPlus=15, MinusMinus=16, 
		Plus=17, Minus=18, BitNot=19, Not=20, Multiply=21, Divide=22, Modulus=23, 
		RightShiftArithmetic=24, LeftShiftArithmetic=25, RightShiftLogical=26, 
		LessThan=27, MoreThan=28, LessThanEquals=29, GreaterThanEquals=30, Equals=31, 
		NotEquals=32, IdentityEquals=33, IdentityNotEquals=34, BitAnd=35, BitXOr=36, 
		BitOr=37, And=38, Or=39, MultiplyAssign=40, DivideAssign=41, ModulusAssign=42, 
		PlusAssign=43, MinusAssign=44, LeftShiftArithmeticAssign=45, RightShiftArithmeticAssign=46, 
		RightShiftLogicalAssign=47, BitAndAssign=48, BitXorAssign=49, BitOrAssign=50, 
		NullLiteral=51, BooleanLiteral=52, DecimalLiteral=53, HexIntegerLiteral=54, 
		OctalIntegerLiteral=55, Break=56, Do=57, Instanceof=58, Typeof=59, Case=60, 
		Else=61, New=62, Var=63, Catch=64, Finally=65, Return=66, Void=67, Continue=68, 
		For=69, Switch=70, While=71, Debugger=72, Function=73, This=74, With=75, 
		Default=76, If=77, Throw=78, Delete=79, In=80, Try=81, Class=82, Enum=83, 
		Extends=84, Super=85, Const=86, Export=87, Import=88, Implements=89, Let=90, 
		Private=91, Public=92, Interface=93, Package=94, Protected=95, Static=96, 
		Yield=97, Identifier=98, StringLiteral=99, WhiteSpaces=100, MultiLineComment=101, 
		SingleLineComment=102, UnexpectedCharacter=103;
	public static final int
		RULE_program = 0, RULE_sourceElements = 1, RULE_sourceElement = 2, RULE_statement = 3, 
		RULE_block = 4, RULE_statementList = 5, RULE_variableStatement = 6, RULE_variableDeclarationList = 7, 
		RULE_variableDeclaration = 8, RULE_initialiser = 9, RULE_emptyStatement_ = 10, 
		RULE_expressionStatement = 11, RULE_ifStatement = 12, RULE_iterationStatement = 13, 
		RULE_continueStatement = 14, RULE_breakStatement = 15, RULE_returnStatement = 16, 
		RULE_withStatement = 17, RULE_switchStatement = 18, RULE_caseBlock = 19, 
		RULE_caseClauses = 20, RULE_caseClause = 21, RULE_defaultClause = 22, 
		RULE_labelledStatement = 23, RULE_throwStatement = 24, RULE_tryStatement = 25, 
		RULE_catchProduction = 26, RULE_finallyProduction = 27, RULE_debuggerStatement = 28, 
		RULE_functionDeclaration = 29, RULE_formalParameterList = 30, RULE_functionBody = 31, 
		RULE_arrayLiteral = 32, RULE_elementList = 33, RULE_elision = 34, RULE_objectLiteral = 35, 
		RULE_propertyNameAndValueList = 36, RULE_propertyAssignment = 37, RULE_propertyName = 38, 
		RULE_propertySetParameterList = 39, RULE_arguments = 40, RULE_argumentList = 41, 
		RULE_expressionSequence = 42, RULE_singleExpression = 43, RULE_assignmentOperator = 44, 
		RULE_literal = 45, RULE_numericLiteral = 46, RULE_identifierName = 47, 
		RULE_reservedWord = 48, RULE_keyword = 49, RULE_futureReservedWord = 50, 
		RULE_getter = 51, RULE_setter = 52, RULE_eos = 53, RULE_eof = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElements", "sourceElement", "statement", "block", "statementList", 
			"variableStatement", "variableDeclarationList", "variableDeclaration", 
			"initialiser", "emptyStatement_", "expressionStatement", "ifStatement", 
			"iterationStatement", "continueStatement", "breakStatement", "returnStatement", 
			"withStatement", "switchStatement", "caseBlock", "caseClauses", "caseClause", 
			"defaultClause", "labelledStatement", "throwStatement", "tryStatement", 
			"catchProduction", "finallyProduction", "debuggerStatement", "functionDeclaration", 
			"formalParameterList", "functionBody", "arrayLiteral", "elementList", 
			"elision", "objectLiteral", "propertyNameAndValueList", "propertyAssignment", 
			"propertyName", "propertySetParameterList", "arguments", "argumentList", 
			"expressionSequence", "singleExpression", "assignmentOperator", "literal", 
			"numericLiteral", "identifierName", "reservedWord", "keyword", "futureReservedWord", 
			"getter", "setter", "eos", "eof"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", 
			"'='", "'?'", "':'", "'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", 
			"'*'", "'/'", "'%'", "'>>'", "'<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", 
			"'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", 
			"'^='", "'|='", "'null'", null, null, null, null, "'break'", "'do'", 
			"'instanceof'", "'typeof'", "'case'", "'else'", "'new'", "'var'", "'catch'", 
			"'finally'", "'return'", "'void'", "'continue'", "'for'", "'switch'", 
			"'while'", "'debugger'", "'function'", "'this'", "'with'", "'default'", 
			"'if'", "'throw'", "'delete'", "'in'", "'try'", "'class'", "'enum'", 
			"'extends'", "'super'", "'const'", "'export'", "'import'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RegularExpressionLiteral", "LineTerminator", "OpenBracket", "CloseBracket", 
			"OpenParen", "CloseParen", "OpenBrace", "CloseBrace", "SemiColon", "Comma", 
			"Assign", "QuestionMark", "Colon", "Dot", "PlusPlus", "MinusMinus", "Plus", 
			"Minus", "BitNot", "Not", "Multiply", "Divide", "Modulus", "RightShiftArithmetic", 
			"LeftShiftArithmetic", "RightShiftLogical", "LessThan", "MoreThan", "LessThanEquals", 
			"GreaterThanEquals", "Equals", "NotEquals", "IdentityEquals", "IdentityNotEquals", 
			"BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", 
			"ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", 
			"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign", 
			"BitXorAssign", "BitOrAssign", "NullLiteral", "BooleanLiteral", "DecimalLiteral", 
			"HexIntegerLiteral", "OctalIntegerLiteral", "Break", "Do", "Instanceof", 
			"Typeof", "Case", "Else", "New", "Var", "Catch", "Finally", "Return", 
			"Void", "Continue", "For", "Switch", "While", "Debugger", "Function", 
			"This", "With", "Default", "If", "Throw", "Delete", "In", "Try", "Class", 
			"Enum", "Extends", "Super", "Const", "Export", "Import", "Implements", 
			"Let", "Private", "Public", "Interface", "Package", "Protected", "Static", 
			"Yield", "Identifier", "StringLiteral", "WhiteSpaces", "MultiLineComment", 
			"SingleLineComment", "UnexpectedCharacter"
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
	public String getGrammarFileName() { return "ECMAScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	/**
	 * Returns true if, on the current index of the parser's token stream,
	 * a token of the given type exists on the HIDDEN channel.
	 * @param type {Number} The type of the token on the HIDDEN channel to check.
	 * @returns {Boolean}
	 */
	ECMAScriptParser.prototype.here = function(type) {
	    var possibleIndexEosToken = antlr4.Parser.prototype.getCurrentToken.call(this).tokenIndex - 1;
	    var ahead = this._input.get(possibleIndexEosToken);
	    return (ahead.channel == antlr4.Lexer.HIDDEN) && (ahead.type == type);
	};

	/**
	 * Returns true if, on the current index of the parser's
	 * token stream, a token exists on the HIDDEN channel which
	 * either is a line terminator, or is a multi line comment that
	 * contains a line terminator.
	 * @returns {Boolean}
	 */
	ECMAScriptParser.prototype.lineTerminatorAhead = function() {
	    var possibleIndexEosToken = antlr4.Parser.prototype.getCurrentToken.call(this).tokenIndex - 1;
	    var ahead = this._input.get(possibleIndexEosToken);

	    if (ahead.channel != antlr4.Lexer.HIDDEN)
	        return false;

	    var text = ahead.text;
	    var type = ahead.type;

	    return (type == ECMAScriptParser.MultiLineComment && text.indexOf("\r") !== -1 || text.indexOf("\n") !== -1) ||
	            (type == ECMAScriptParser.LineTerminator);
	};

	public ECMAScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ECMAScriptParser.EOF, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(110);
				sourceElements();
				}
				break;
			}
			setState(113);
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

	public static class SourceElementsContext extends ParserRuleContext {
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(115);
					sourceElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class SourceElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sourceElement);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				if (!(this._input.LA(1).type != ECMAScriptParser.Function)) throw new FailedPredicateException(this, "this._input.LA(1).type != ECMAScriptParser.Function");
				setState(121);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				functionDeclaration();
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public LabelledStatementContext labelledStatement() {
			return getRuleContext(LabelledStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DebuggerStatementContext debuggerStatement() {
			return getRuleContext(DebuggerStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				emptyStatement_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				if (!(this._input.LA(1).type != ECMAScriptParser.OpenBrace)) throw new FailedPredicateException(this, "this._input.LA(1).type != ECMAScriptParser.OpenBrace");
				setState(129);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				iterationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(133);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(134);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(135);
				withStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(136);
				labelledStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(137);
				switchStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(138);
				throwStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(139);
				tryStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(140);
				debuggerStatement();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
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
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(OpenBrace);
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(144);
				statementList();
				}
				break;
			}
			setState(147);
			match(CloseBrace);
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
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(149);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(152); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class VariableStatementContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(Var);
			setState(155);
			variableDeclarationList();
			setState(156);
			eos();
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

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			variableDeclaration();
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(Comma);
					setState(160);
					variableDeclaration();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public InitialiserContext initialiser() {
			return getRuleContext(InitialiserContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(Identifier);
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(167);
				initialiser();
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

	public static class InitialiserContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(ECMAScriptParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public InitialiserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser; }
	}

	public final InitialiserContext initialiser() throws RecognitionException {
		InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_initialiser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(Assign);
			setState(171);
			singleExpression(0);
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

	public static class EmptyStatement_Context extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(SemiColon);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			expressionSequence();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ECMAScriptParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(ECMAScriptParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(If);
			setState(178);
			match(OpenParen);
			setState(179);
			expressionSequence();
			setState(180);
			match(CloseParen);
			setState(181);
			statement();
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(182);
				match(Else);
				setState(183);
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

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(ECMAScriptParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(ECMAScriptParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForVarStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(ECMAScriptParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ECMAScriptParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForVarStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForVarInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForVarInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(ECMAScriptParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(ECMAScriptParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ECMAScriptParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_iterationStatement);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(Do);
				setState(187);
				statement();
				setState(188);
				match(While);
				setState(189);
				match(OpenParen);
				setState(190);
				expressionSequence();
				setState(191);
				match(CloseParen);
				setState(192);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(While);
				setState(195);
				match(OpenParen);
				setState(196);
				expressionSequence();
				setState(197);
				match(CloseParen);
				setState(198);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(For);
				setState(201);
				match(OpenParen);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Void - 67)) | (1L << (Function - 67)) | (1L << (This - 67)) | (1L << (Delete - 67)) | (1L << (Identifier - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(202);
					expressionSequence();
					}
				}

				setState(205);
				match(SemiColon);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Void - 67)) | (1L << (Function - 67)) | (1L << (This - 67)) | (1L << (Delete - 67)) | (1L << (Identifier - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(206);
					expressionSequence();
					}
				}

				setState(209);
				match(SemiColon);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Void - 67)) | (1L << (Function - 67)) | (1L << (This - 67)) | (1L << (Delete - 67)) | (1L << (Identifier - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(210);
					expressionSequence();
					}
				}

				setState(213);
				match(CloseParen);
				setState(214);
				statement();
				}
				break;
			case 4:
				_localctx = new ForVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(For);
				setState(216);
				match(OpenParen);
				setState(217);
				match(Var);
				setState(218);
				variableDeclarationList();
				setState(219);
				match(SemiColon);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Void - 67)) | (1L << (Function - 67)) | (1L << (This - 67)) | (1L << (Delete - 67)) | (1L << (Identifier - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(220);
					expressionSequence();
					}
				}

				setState(223);
				match(SemiColon);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Void - 67)) | (1L << (Function - 67)) | (1L << (This - 67)) | (1L << (Delete - 67)) | (1L << (Identifier - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(224);
					expressionSequence();
					}
				}

				setState(227);
				match(CloseParen);
				setState(228);
				statement();
				}
				break;
			case 5:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(For);
				setState(231);
				match(OpenParen);
				setState(232);
				singleExpression(0);
				setState(233);
				match(In);
				setState(234);
				expressionSequence();
				setState(235);
				match(CloseParen);
				setState(236);
				statement();
				}
				break;
			case 6:
				_localctx = new ForVarInStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				match(For);
				setState(239);
				match(OpenParen);
				setState(240);
				match(Var);
				setState(241);
				variableDeclaration();
				setState(242);
				match(In);
				setState(243);
				expressionSequence();
				setState(244);
				match(CloseParen);
				setState(245);
				statement();
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(ECMAScriptParser.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(Continue);
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(250);
				if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
				setState(251);
				match(Identifier);
				}
				break;
			}
			setState(254);
			eos();
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ECMAScriptParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(Break);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(257);
				if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
				setState(258);
				match(Identifier);
				}
				break;
			}
			setState(261);
			eos();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ECMAScriptParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(Return);
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(264);
				if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
				setState(265);
				expressionSequence();
				}
				break;
			}
			setState(268);
			eos();
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

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(ECMAScriptParser.With, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(With);
			setState(271);
			match(OpenParen);
			setState(272);
			expressionSequence();
			setState(273);
			match(CloseParen);
			setState(274);
			statement();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(ECMAScriptParser.Switch, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(Switch);
			setState(277);
			match(OpenParen);
			setState(278);
			expressionSequence();
			setState(279);
			match(CloseParen);
			setState(280);
			caseBlock();
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

	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(OpenBrace);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(283);
				caseClauses();
				}
			}

			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(286);
				defaultClause();
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(287);
					caseClauses();
					}
				}

				}
			}

			setState(292);
			match(CloseBrace);
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

	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(294);
				caseClause();
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
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

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(ECMAScriptParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ECMAScriptParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(Case);
			setState(300);
			expressionSequence();
			setState(301);
			match(Colon);
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(302);
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

	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(ECMAScriptParser.Default, 0); }
		public TerminalNode Colon() { return getToken(ECMAScriptParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_defaultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(Default);
			setState(306);
			match(Colon);
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(307);
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

	public static class LabelledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(ECMAScriptParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledStatement; }
	}

	public final LabelledStatementContext labelledStatement() throws RecognitionException {
		LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(Identifier);
			setState(311);
			match(Colon);
			setState(312);
			statement();
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(ECMAScriptParser.Throw, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(Throw);
			setState(315);
			if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
			setState(316);
			expressionSequence();
			setState(317);
			eos();
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

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(ECMAScriptParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tryStatement);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(Try);
				setState(320);
				block();
				setState(321);
				catchProduction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(Try);
				setState(324);
				block();
				setState(325);
				finallyProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(Try);
				setState(328);
				block();
				setState(329);
				catchProduction();
				setState(330);
				finallyProduction();
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

	public static class CatchProductionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(ECMAScriptParser.Catch, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_catchProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(Catch);
			setState(335);
			match(OpenParen);
			setState(336);
			match(Identifier);
			setState(337);
			match(CloseParen);
			setState(338);
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

	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(ECMAScriptParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(Finally);
			setState(341);
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

	public static class DebuggerStatementContext extends ParserRuleContext {
		public TerminalNode Debugger() { return getToken(ECMAScriptParser.Debugger, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggerStatement; }
	}

	public final DebuggerStatementContext debuggerStatement() throws RecognitionException {
		DebuggerStatementContext _localctx = new DebuggerStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_debuggerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(Debugger);
			setState(344);
			eos();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(ECMAScriptParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(Function);
			setState(347);
			match(Identifier);
			setState(348);
			match(OpenParen);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(349);
				formalParameterList();
				}
			}

			setState(352);
			match(CloseParen);
			setState(353);
			match(OpenBrace);
			setState(354);
			functionBody();
			setState(355);
			match(CloseBrace);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ECMAScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ECMAScriptParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(Identifier);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(358);
				match(Comma);
				setState(359);
				match(Identifier);
				}
				}
				setState(364);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(365);
				sourceElements();
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(ECMAScriptParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(ECMAScriptParser.CloseBracket, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ECMAScriptParser.Comma, 0); }
		public ElisionContext elision() {
			return getRuleContext(ElisionContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(OpenBracket);
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(369);
				elementList();
				}
				break;
			}
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(372);
				match(Comma);
				}
				break;
			}
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(375);
				elision();
				}
			}

			setState(378);
			match(CloseBracket);
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
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<ElisionContext> elision() {
			return getRuleContexts(ElisionContext.class);
		}
		public ElisionContext elision(int i) {
			return getRuleContext(ElisionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(380);
				elision();
				}
			}

			setState(383);
			singleExpression(0);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(384);
					match(Comma);
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(385);
						elision();
						}
					}

					setState(388);
					singleExpression(0);
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class ElisionContext extends ParserRuleContext {
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public ElisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elision; }
	}

	public final ElisionContext elision() throws RecognitionException {
		ElisionContext _localctx = new ElisionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(394);
				match(Comma);
				}
				}
				setState(397); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public PropertyNameAndValueListContext propertyNameAndValueList() {
			return getRuleContext(PropertyNameAndValueListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ECMAScriptParser.Comma, 0); }
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_objectLiteral);
		int _la;
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(OpenBrace);
				setState(400);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(OpenBrace);
				setState(402);
				propertyNameAndValueList();
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(403);
					match(Comma);
					}
				}

				setState(406);
				match(CloseBrace);
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

	public static class PropertyNameAndValueListContext extends ParserRuleContext {
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public PropertyNameAndValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyNameAndValueList; }
	}

	public final PropertyNameAndValueListContext propertyNameAndValueList() throws RecognitionException {
		PropertyNameAndValueListContext _localctx = new PropertyNameAndValueListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_propertyNameAndValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			propertyAssignment();
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					match(Comma);
					setState(412);
					propertyAssignment();
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ECMAScriptParser.Colon, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class PropertySetterContext extends PropertyAssignmentContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public PropertySetParameterListContext propertySetParameterList() {
			return getRuleContext(PropertySetParameterListContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public PropertySetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class PropertyGetterContext extends PropertyAssignmentContext {
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public PropertyGetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_propertyAssignment);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				propertyName();
				setState(419);
				match(Colon);
				setState(420);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new PropertyGetterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				getter();
				setState(423);
				match(OpenParen);
				setState(424);
				match(CloseParen);
				setState(425);
				match(OpenBrace);
				setState(426);
				functionBody();
				setState(427);
				match(CloseBrace);
				}
				break;
			case 3:
				_localctx = new PropertySetterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				setter();
				setState(430);
				match(OpenParen);
				setState(431);
				propertySetParameterList();
				setState(432);
				match(CloseParen);
				setState(433);
				match(OpenBrace);
				setState(434);
				functionBody();
				setState(435);
				match(CloseBrace);
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

	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ECMAScriptParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_propertyName);
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				numericLiteral();
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

	public static class PropertySetParameterListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public PropertySetParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySetParameterList; }
	}

	public final PropertySetParameterListContext propertySetParameterList() throws RecognitionException {
		PropertySetParameterListContext _localctx = new PropertySetParameterListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_propertySetParameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(Identifier);
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
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(OpenParen);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Void - 67)) | (1L << (Function - 67)) | (1L << (This - 67)) | (1L << (Delete - 67)) | (1L << (Identifier - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
				{
				setState(447);
				argumentList();
				}
			}

			setState(450);
			match(CloseParen);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			singleExpression(0);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(453);
				match(Comma);
				setState(454);
				singleExpression(0);
				}
				}
				setState(459);
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

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ECMAScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ECMAScriptParser.Comma, i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			singleExpression(0);
			setState(465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(461);
					match(Comma);
					setState(462);
					singleExpression(0);
					}
					} 
				}
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(ECMAScriptParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(ECMAScriptParser.Colon, 0); }
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(ECMAScriptParser.And, 0); }
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PreIncrementExpressionContext extends SingleExpressionContext {
		public TerminalNode PlusPlus() { return getToken(ECMAScriptParser.PlusPlus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
		public InExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(ECMAScriptParser.Or, 0); }
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpressionContext extends SingleExpressionContext {
		public TerminalNode Not() { return getToken(ECMAScriptParser.Not, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public TerminalNode MinusMinus() { return getToken(ECMAScriptParser.MinusMinus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(ECMAScriptParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public TerminalNode Function() { return getToken(ECMAScriptParser.Function, 0); }
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ECMAScriptParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ECMAScriptParser.CloseBrace, 0); }
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public TerminalNode Minus() { return getToken(ECMAScriptParser.Minus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(ECMAScriptParser.MinusMinus, 0); }
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Assign() { return getToken(ECMAScriptParser.Assign, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypeofExpressionContext extends SingleExpressionContext {
		public TerminalNode Typeof() { return getToken(ECMAScriptParser.Typeof, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InstanceofExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Instanceof() { return getToken(ECMAScriptParser.Instanceof, 0); }
		public InstanceofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public TerminalNode Plus() { return getToken(ECMAScriptParser.Plus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class DeleteExpressionContext extends SingleExpressionContext {
		public TerminalNode Delete() { return getToken(ECMAScriptParser.Delete, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public DeleteExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Equals() { return getToken(ECMAScriptParser.Equals, 0); }
		public TerminalNode NotEquals() { return getToken(ECMAScriptParser.NotEquals, 0); }
		public TerminalNode IdentityEquals() { return getToken(ECMAScriptParser.IdentityEquals, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(ECMAScriptParser.IdentityNotEquals, 0); }
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitXOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitXOr() { return getToken(ECMAScriptParser.BitXOr, 0); }
		public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(ECMAScriptParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(ECMAScriptParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(ECMAScriptParser.Modulus, 0); }
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitShiftExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode LeftShiftArithmetic() { return getToken(ECMAScriptParser.LeftShiftArithmetic, 0); }
		public TerminalNode RightShiftArithmetic() { return getToken(ECMAScriptParser.RightShiftArithmetic, 0); }
		public TerminalNode RightShiftLogical() { return getToken(ECMAScriptParser.RightShiftLogical, 0); }
		public BitShiftExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public TerminalNode OpenParen() { return getToken(ECMAScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ECMAScriptParser.CloseParen, 0); }
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(ECMAScriptParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(ECMAScriptParser.Minus, 0); }
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(ECMAScriptParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(ECMAScriptParser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(ECMAScriptParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ECMAScriptParser.GreaterThanEquals, 0); }
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(ECMAScriptParser.PlusPlus, 0); }
		public PostIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitNotExpressionContext extends SingleExpressionContext {
		public TerminalNode BitNot() { return getToken(ECMAScriptParser.BitNot, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public BitNotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NewExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(ECMAScriptParser.New, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(ECMAScriptParser.Dot, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(ECMAScriptParser.OpenBracket, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ECMAScriptParser.CloseBracket, 0); }
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitAnd() { return getToken(ECMAScriptParser.BitAnd, 0); }
		public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitOr() { return getToken(ECMAScriptParser.BitOr, 0); }
		public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class VoidExpressionContext extends SingleExpressionContext {
		public TerminalNode Void() { return getToken(ECMAScriptParser.Void, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VoidExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(469);
				match(Function);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(470);
					match(Identifier);
					}
				}

				setState(473);
				match(OpenParen);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(474);
					formalParameterList();
					}
				}

				setState(477);
				match(CloseParen);
				setState(478);
				match(OpenBrace);
				setState(479);
				functionBody();
				setState(480);
				match(CloseBrace);
				}
				break;
			case New:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(482);
				match(New);
				setState(483);
				singleExpression(0);
				setState(485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(484);
					arguments();
					}
					break;
				}
				}
				break;
			case Delete:
				{
				_localctx = new DeleteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(487);
				match(Delete);
				setState(488);
				singleExpression(30);
				}
				break;
			case Void:
				{
				_localctx = new VoidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(489);
				match(Void);
				setState(490);
				singleExpression(29);
				}
				break;
			case Typeof:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(491);
				match(Typeof);
				setState(492);
				singleExpression(28);
				}
				break;
			case PlusPlus:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(493);
				match(PlusPlus);
				setState(494);
				singleExpression(27);
				}
				break;
			case MinusMinus:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(495);
				match(MinusMinus);
				setState(496);
				singleExpression(26);
				}
				break;
			case Plus:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(497);
				match(Plus);
				setState(498);
				singleExpression(25);
				}
				break;
			case Minus:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499);
				match(Minus);
				setState(500);
				singleExpression(24);
				}
				break;
			case BitNot:
				{
				_localctx = new BitNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(501);
				match(BitNot);
				setState(502);
				singleExpression(23);
				}
				break;
			case Not:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(503);
				match(Not);
				setState(504);
				singleExpression(22);
				}
				break;
			case This:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(505);
				match(This);
				}
				break;
			case Identifier:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(506);
				match(Identifier);
				}
				break;
			case RegularExpressionLiteral:
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case StringLiteral:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(507);
				literal();
				}
				break;
			case OpenBracket:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(508);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(509);
				objectLiteral();
				}
				break;
			case OpenParen:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(510);
				match(OpenParen);
				setState(511);
				expressionSequence();
				setState(512);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(581);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(516);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(517);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(518);
						singleExpression(22);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(519);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(520);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(521);
						singleExpression(21);
						}
						break;
					case 3:
						{
						_localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(522);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(523);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(524);
						singleExpression(20);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(525);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(526);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(527);
						singleExpression(19);
						}
						break;
					case 5:
						{
						_localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(528);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(529);
						match(Instanceof);
						setState(530);
						singleExpression(18);
						}
						break;
					case 6:
						{
						_localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(531);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(532);
						match(In);
						setState(533);
						singleExpression(17);
						}
						break;
					case 7:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(534);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(535);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(536);
						singleExpression(16);
						}
						break;
					case 8:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(537);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(538);
						match(BitAnd);
						setState(539);
						singleExpression(15);
						}
						break;
					case 9:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(540);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(541);
						match(BitXOr);
						setState(542);
						singleExpression(14);
						}
						break;
					case 10:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(543);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(544);
						match(BitOr);
						setState(545);
						singleExpression(13);
						}
						break;
					case 11:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(546);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(547);
						match(And);
						setState(548);
						singleExpression(12);
						}
						break;
					case 12:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(549);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(550);
						match(Or);
						setState(551);
						singleExpression(11);
						}
						break;
					case 13:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(552);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(553);
						match(QuestionMark);
						setState(554);
						singleExpression(0);
						setState(555);
						match(Colon);
						setState(556);
						singleExpression(10);
						}
						break;
					case 14:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(558);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(559);
						match(OpenBracket);
						setState(560);
						expressionSequence();
						setState(561);
						match(CloseBracket);
						}
						break;
					case 15:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(563);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(564);
						match(Dot);
						setState(565);
						identifierName();
						}
						break;
					case 16:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(566);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(567);
						arguments();
						}
						break;
					case 17:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(568);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(569);
						if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
						setState(570);
						match(PlusPlus);
						}
						break;
					case 18:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(571);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(572);
						if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
						setState(573);
						match(MinusMinus);
						}
						break;
					case 19:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(574);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(575);
						match(Assign);
						setState(576);
						expressionSequence();
						}
						break;
					case 20:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(577);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(578);
						assignmentOperator();
						setState(579);
						expressionSequence();
						}
						break;
					}
					} 
				}
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode MultiplyAssign() { return getToken(ECMAScriptParser.MultiplyAssign, 0); }
		public TerminalNode DivideAssign() { return getToken(ECMAScriptParser.DivideAssign, 0); }
		public TerminalNode ModulusAssign() { return getToken(ECMAScriptParser.ModulusAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(ECMAScriptParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(ECMAScriptParser.MinusAssign, 0); }
		public TerminalNode LeftShiftArithmeticAssign() { return getToken(ECMAScriptParser.LeftShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftArithmeticAssign() { return getToken(ECMAScriptParser.RightShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftLogicalAssign() { return getToken(ECMAScriptParser.RightShiftLogicalAssign, 0); }
		public TerminalNode BitAndAssign() { return getToken(ECMAScriptParser.BitAndAssign, 0); }
		public TerminalNode BitXorAssign() { return getToken(ECMAScriptParser.BitXorAssign, 0); }
		public TerminalNode BitOrAssign() { return getToken(ECMAScriptParser.BitOrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign))) != 0)) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(ECMAScriptParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ECMAScriptParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ECMAScriptParser.StringLiteral, 0); }
		public TerminalNode RegularExpressionLiteral() { return getToken(ECMAScriptParser.RegularExpressionLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_literal);
		int _la;
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RegularExpressionLiteral:
			case NullLiteral:
			case BooleanLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || _la==StringLiteral) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				numericLiteral();
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(ECMAScriptParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(ECMAScriptParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(ECMAScriptParser.OctalIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral))) != 0)) ) {
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

	public static class IdentifierNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_identifierName);
		try {
			setState(596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				match(Identifier);
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				reservedWord();
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

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public FutureReservedWordContext futureReservedWord() {
			return getRuleContext(FutureReservedWordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(ECMAScriptParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ECMAScriptParser.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_reservedWord);
		int _la;
		try {
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				keyword();
				}
				break;
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				futureReservedWord();
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
				_la = _input.LA(1);
				if ( !(_la==NullLiteral || _la==BooleanLiteral) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ECMAScriptParser.Break, 0); }
		public TerminalNode Do() { return getToken(ECMAScriptParser.Do, 0); }
		public TerminalNode Instanceof() { return getToken(ECMAScriptParser.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(ECMAScriptParser.Typeof, 0); }
		public TerminalNode Case() { return getToken(ECMAScriptParser.Case, 0); }
		public TerminalNode Else() { return getToken(ECMAScriptParser.Else, 0); }
		public TerminalNode New() { return getToken(ECMAScriptParser.New, 0); }
		public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
		public TerminalNode Catch() { return getToken(ECMAScriptParser.Catch, 0); }
		public TerminalNode Finally() { return getToken(ECMAScriptParser.Finally, 0); }
		public TerminalNode Return() { return getToken(ECMAScriptParser.Return, 0); }
		public TerminalNode Void() { return getToken(ECMAScriptParser.Void, 0); }
		public TerminalNode Continue() { return getToken(ECMAScriptParser.Continue, 0); }
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public TerminalNode Switch() { return getToken(ECMAScriptParser.Switch, 0); }
		public TerminalNode While() { return getToken(ECMAScriptParser.While, 0); }
		public TerminalNode Debugger() { return getToken(ECMAScriptParser.Debugger, 0); }
		public TerminalNode Function() { return getToken(ECMAScriptParser.Function, 0); }
		public TerminalNode This() { return getToken(ECMAScriptParser.This, 0); }
		public TerminalNode With() { return getToken(ECMAScriptParser.With, 0); }
		public TerminalNode Default() { return getToken(ECMAScriptParser.Default, 0); }
		public TerminalNode If() { return getToken(ECMAScriptParser.If, 0); }
		public TerminalNode Throw() { return getToken(ECMAScriptParser.Throw, 0); }
		public TerminalNode Delete() { return getToken(ECMAScriptParser.Delete, 0); }
		public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
		public TerminalNode Try() { return getToken(ECMAScriptParser.Try, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (Break - 56)) | (1L << (Do - 56)) | (1L << (Instanceof - 56)) | (1L << (Typeof - 56)) | (1L << (Case - 56)) | (1L << (Else - 56)) | (1L << (New - 56)) | (1L << (Var - 56)) | (1L << (Catch - 56)) | (1L << (Finally - 56)) | (1L << (Return - 56)) | (1L << (Void - 56)) | (1L << (Continue - 56)) | (1L << (For - 56)) | (1L << (Switch - 56)) | (1L << (While - 56)) | (1L << (Debugger - 56)) | (1L << (Function - 56)) | (1L << (This - 56)) | (1L << (With - 56)) | (1L << (Default - 56)) | (1L << (If - 56)) | (1L << (Throw - 56)) | (1L << (Delete - 56)) | (1L << (In - 56)) | (1L << (Try - 56)))) != 0)) ) {
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

	public static class FutureReservedWordContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(ECMAScriptParser.Class, 0); }
		public TerminalNode Enum() { return getToken(ECMAScriptParser.Enum, 0); }
		public TerminalNode Extends() { return getToken(ECMAScriptParser.Extends, 0); }
		public TerminalNode Super() { return getToken(ECMAScriptParser.Super, 0); }
		public TerminalNode Const() { return getToken(ECMAScriptParser.Const, 0); }
		public TerminalNode Export() { return getToken(ECMAScriptParser.Export, 0); }
		public TerminalNode Import() { return getToken(ECMAScriptParser.Import, 0); }
		public TerminalNode Implements() { return getToken(ECMAScriptParser.Implements, 0); }
		public TerminalNode Let() { return getToken(ECMAScriptParser.Let, 0); }
		public TerminalNode Private() { return getToken(ECMAScriptParser.Private, 0); }
		public TerminalNode Public() { return getToken(ECMAScriptParser.Public, 0); }
		public TerminalNode Interface() { return getToken(ECMAScriptParser.Interface, 0); }
		public TerminalNode Package() { return getToken(ECMAScriptParser.Package, 0); }
		public TerminalNode Protected() { return getToken(ECMAScriptParser.Protected, 0); }
		public TerminalNode Static() { return getToken(ECMAScriptParser.Static, 0); }
		public TerminalNode Yield() { return getToken(ECMAScriptParser.Yield, 0); }
		public FutureReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_futureReservedWord; }
	}

	public final FutureReservedWordContext futureReservedWord() throws RecognitionException {
		FutureReservedWordContext _localctx = new FutureReservedWordContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_futureReservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (Class - 82)) | (1L << (Enum - 82)) | (1L << (Extends - 82)) | (1L << (Super - 82)) | (1L << (Const - 82)) | (1L << (Export - 82)) | (1L << (Import - 82)) | (1L << (Implements - 82)) | (1L << (Let - 82)) | (1L << (Private - 82)) | (1L << (Public - 82)) | (1L << (Interface - 82)) | (1L << (Package - 82)) | (1L << (Protected - 82)) | (1L << (Static - 82)) | (1L << (Yield - 82)))) != 0)) ) {
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

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			if (!(this._input.LT(1).text.startsWith("get"))) throw new FailedPredicateException(this, "this._input.LT(1).text.startsWith(\"get\")");
			setState(608);
			match(Identifier);
			setState(609);
			propertyName();
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

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			if (!(this._input.LT(1).text.startsWith("set"))) throw new FailedPredicateException(this, "this._input.LT(1).text.startsWith(\"set\")");
			setState(612);
			match(Identifier);
			setState(613);
			propertyName();
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
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(ECMAScriptParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_eos);
		try {
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(617);
				if (!(this.lineTerminatorAhead())) throw new FailedPredicateException(this, "this.lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				if (!(this._input.LT(1).type == ECMAScriptParser.CloseBrace)) throw new FailedPredicateException(this, "this._input.LT(1).type == ECMAScriptParser.CloseBrace");
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

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ECMAScriptParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return sourceElement_sempred((SourceElementContext)_localctx, predIndex);
		case 3:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 14:
			return continueStatement_sempred((ContinueStatementContext)_localctx, predIndex);
		case 15:
			return breakStatement_sempred((BreakStatementContext)_localctx, predIndex);
		case 16:
			return returnStatement_sempred((ReturnStatementContext)_localctx, predIndex);
		case 24:
			return throwStatement_sempred((ThrowStatementContext)_localctx, predIndex);
		case 43:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 51:
			return getter_sempred((GetterContext)_localctx, predIndex);
		case 52:
			return setter_sempred((SetterContext)_localctx, predIndex);
		case 53:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sourceElement_sempred(SourceElementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return this._input.LA(1).type != ECMAScriptParser.Function;
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return this._input.LA(1).type != ECMAScriptParser.OpenBrace;
		}
		return true;
	}
	private boolean continueStatement_sempred(ContinueStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !this.here(ECMAScriptParser.LineTerminator);
		}
		return true;
	}
	private boolean breakStatement_sempred(BreakStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !this.here(ECMAScriptParser.LineTerminator);
		}
		return true;
	}
	private boolean returnStatement_sempred(ReturnStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return !this.here(ECMAScriptParser.LineTerminator);
		}
		return true;
	}
	private boolean throwStatement_sempred(ThrowStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return !this.here(ECMAScriptParser.LineTerminator);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 21);
		case 7:
			return precpred(_ctx, 20);
		case 8:
			return precpred(_ctx, 19);
		case 9:
			return precpred(_ctx, 18);
		case 10:
			return precpred(_ctx, 17);
		case 11:
			return precpred(_ctx, 16);
		case 12:
			return precpred(_ctx, 15);
		case 13:
			return precpred(_ctx, 14);
		case 14:
			return precpred(_ctx, 13);
		case 15:
			return precpred(_ctx, 12);
		case 16:
			return precpred(_ctx, 11);
		case 17:
			return precpred(_ctx, 10);
		case 18:
			return precpred(_ctx, 9);
		case 19:
			return precpred(_ctx, 36);
		case 20:
			return precpred(_ctx, 35);
		case 21:
			return precpred(_ctx, 34);
		case 22:
			return precpred(_ctx, 32);
		case 23:
			return !this.here(ECMAScriptParser.LineTerminator);
		case 24:
			return precpred(_ctx, 31);
		case 25:
			return !this.here(ECMAScriptParser.LineTerminator);
		case 26:
			return precpred(_ctx, 8);
		case 27:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean getter_sempred(GetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return this._input.LT(1).text.startsWith("get");
		}
		return true;
	}
	private boolean setter_sempred(SetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return this._input.LT(1).text.startsWith("set");
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return this.lineTerminatorAhead();
		case 31:
			return this._input.LT(1).type == ECMAScriptParser.CloseBrace;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3i\u0272\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\5\2r\n\2\3\2\3\2\3\3\6\3w"+
		"\n\3\r\3\16\3x\3\4\3\4\3\4\5\4~\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0090\n\5\3\6\3\6\5\6\u0094\n\6\3\6"+
		"\3\6\3\7\6\7\u0099\n\7\r\7\16\7\u009a\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t"+
		"\u00a4\n\t\f\t\16\t\u00a7\13\t\3\n\3\n\5\n\u00ab\n\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bb\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00ce\n\17\3\17\3\17\5\17\u00d2\n\17\3\17\3\17\5\17\u00d6"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e0\n\17\3\17\3\17"+
		"\5\17\u00e4\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fa\n\17\3\20\3\20"+
		"\3\20\5\20\u00ff\n\20\3\20\3\20\3\21\3\21\3\21\5\21\u0106\n\21\3\21\3"+
		"\21\3\22\3\22\3\22\5\22\u010d\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u011f\n\25\3\25\3\25"+
		"\5\25\u0123\n\25\5\25\u0125\n\25\3\25\3\25\3\26\6\26\u012a\n\26\r\26\16"+
		"\26\u012b\3\27\3\27\3\27\3\27\5\27\u0132\n\27\3\30\3\30\3\30\5\30\u0137"+
		"\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u014f\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\5\37\u0161\n\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u016b\n \f \16 "+
		"\u016e\13 \3!\5!\u0171\n!\3\"\3\"\5\"\u0175\n\"\3\"\5\"\u0178\n\"\3\""+
		"\5\"\u017b\n\"\3\"\3\"\3#\5#\u0180\n#\3#\3#\3#\5#\u0185\n#\3#\7#\u0188"+
		"\n#\f#\16#\u018b\13#\3$\6$\u018e\n$\r$\16$\u018f\3%\3%\3%\3%\3%\5%\u0197"+
		"\n%\3%\3%\5%\u019b\n%\3&\3&\3&\7&\u01a0\n&\f&\16&\u01a3\13&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u01b8\n\'\3(\3(\3(\5(\u01bd\n(\3)\3)\3*\3*\5*\u01c3\n*\3*\3*\3+\3+\3"+
		"+\7+\u01ca\n+\f+\16+\u01cd\13+\3,\3,\3,\7,\u01d2\n,\f,\16,\u01d5\13,\3"+
		"-\3-\3-\5-\u01da\n-\3-\3-\5-\u01de\n-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01e8"+
		"\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\5-\u0205\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\7-\u0248\n-\f-\16-\u024b\13-\3.\3.\3/\3/\5/\u0251\n/\3"+
		"\60\3\60\3\61\3\61\5\61\u0257\n\61\3\62\3\62\3\62\5\62\u025c\n\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\5\67\u026e\n\67\38\38\38\2\3X9\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\r\3\2\27\31"+
		"\3\2\23\24\3\2\32\34\3\2\35 \3\2!$\3\2*\64\5\2\3\3\65\66ee\3\2\679\3\2"+
		"\65\66\3\2:S\3\2Tc\2\u02a7\2q\3\2\2\2\4v\3\2\2\2\6}\3\2\2\2\b\u008f\3"+
		"\2\2\2\n\u0091\3\2\2\2\f\u0098\3\2\2\2\16\u009c\3\2\2\2\20\u00a0\3\2\2"+
		"\2\22\u00a8\3\2\2\2\24\u00ac\3\2\2\2\26\u00af\3\2\2\2\30\u00b1\3\2\2\2"+
		"\32\u00b3\3\2\2\2\34\u00f9\3\2\2\2\36\u00fb\3\2\2\2 \u0102\3\2\2\2\"\u0109"+
		"\3\2\2\2$\u0110\3\2\2\2&\u0116\3\2\2\2(\u011c\3\2\2\2*\u0129\3\2\2\2,"+
		"\u012d\3\2\2\2.\u0133\3\2\2\2\60\u0138\3\2\2\2\62\u013c\3\2\2\2\64\u014e"+
		"\3\2\2\2\66\u0150\3\2\2\28\u0156\3\2\2\2:\u0159\3\2\2\2<\u015c\3\2\2\2"+
		">\u0167\3\2\2\2@\u0170\3\2\2\2B\u0172\3\2\2\2D\u017f\3\2\2\2F\u018d\3"+
		"\2\2\2H\u019a\3\2\2\2J\u019c\3\2\2\2L\u01b7\3\2\2\2N\u01bc\3\2\2\2P\u01be"+
		"\3\2\2\2R\u01c0\3\2\2\2T\u01c6\3\2\2\2V\u01ce\3\2\2\2X\u0204\3\2\2\2Z"+
		"\u024c\3\2\2\2\\\u0250\3\2\2\2^\u0252\3\2\2\2`\u0256\3\2\2\2b\u025b\3"+
		"\2\2\2d\u025d\3\2\2\2f\u025f\3\2\2\2h\u0261\3\2\2\2j\u0265\3\2\2\2l\u026d"+
		"\3\2\2\2n\u026f\3\2\2\2pr\5\4\3\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\2"+
		"\2\3t\3\3\2\2\2uw\5\6\4\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\5\3"+
		"\2\2\2z{\6\4\2\2{~\5\b\5\2|~\5<\37\2}z\3\2\2\2}|\3\2\2\2~\7\3\2\2\2\177"+
		"\u0090\5\n\6\2\u0080\u0090\5\16\b\2\u0081\u0090\5\26\f\2\u0082\u0083\6"+
		"\5\3\2\u0083\u0090\5\30\r\2\u0084\u0090\5\32\16\2\u0085\u0090\5\34\17"+
		"\2\u0086\u0090\5\36\20\2\u0087\u0090\5 \21\2\u0088\u0090\5\"\22\2\u0089"+
		"\u0090\5$\23\2\u008a\u0090\5\60\31\2\u008b\u0090\5&\24\2\u008c\u0090\5"+
		"\62\32\2\u008d\u0090\5\64\33\2\u008e\u0090\5:\36\2\u008f\177\3\2\2\2\u008f"+
		"\u0080\3\2\2\2\u008f\u0081\3\2\2\2\u008f\u0082\3\2\2\2\u008f\u0084\3\2"+
		"\2\2\u008f\u0085\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0087\3\2\2\2\u008f"+
		"\u0088\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008b\3\2"+
		"\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090"+
		"\t\3\2\2\2\u0091\u0093\7\t\2\2\u0092\u0094\5\f\7\2\u0093\u0092\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\n\2\2\u0096\13"+
		"\3\2\2\2\u0097\u0099\5\b\5\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\r\3\2\2\2\u009c\u009d\7A\2\2"+
		"\u009d\u009e\5\20\t\2\u009e\u009f\5l\67\2\u009f\17\3\2\2\2\u00a0\u00a5"+
		"\5\22\n\2\u00a1\u00a2\7\f\2\2\u00a2\u00a4\5\22\n\2\u00a3\u00a1\3\2\2\2"+
		"\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\21"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\7d\2\2\u00a9\u00ab\5\24\13\2"+
		"\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\23\3\2\2\2\u00ac\u00ad"+
		"\7\r\2\2\u00ad\u00ae\5X-\2\u00ae\25\3\2\2\2\u00af\u00b0\7\13\2\2\u00b0"+
		"\27\3\2\2\2\u00b1\u00b2\5V,\2\u00b2\31\3\2\2\2\u00b3\u00b4\7O\2\2\u00b4"+
		"\u00b5\7\7\2\2\u00b5\u00b6\5V,\2\u00b6\u00b7\7\b\2\2\u00b7\u00ba\5\b\5"+
		"\2\u00b8\u00b9\7?\2\2\u00b9\u00bb\5\b\5\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\33\3\2\2\2\u00bc\u00bd\7;\2\2\u00bd\u00be\5\b\5\2\u00be"+
		"\u00bf\7I\2\2\u00bf\u00c0\7\7\2\2\u00c0\u00c1\5V,\2\u00c1\u00c2\7\b\2"+
		"\2\u00c2\u00c3\5l\67\2\u00c3\u00fa\3\2\2\2\u00c4\u00c5\7I\2\2\u00c5\u00c6"+
		"\7\7\2\2\u00c6\u00c7\5V,\2\u00c7\u00c8\7\b\2\2\u00c8\u00c9\5\b\5\2\u00c9"+
		"\u00fa\3\2\2\2\u00ca\u00cb\7G\2\2\u00cb\u00cd\7\7\2\2\u00cc\u00ce\5V,"+
		"\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1"+
		"\7\13\2\2\u00d0\u00d2\5V,\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\7\13\2\2\u00d4\u00d6\5V,\2\u00d5\u00d4\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\b\2\2\u00d8"+
		"\u00fa\5\b\5\2\u00d9\u00da\7G\2\2\u00da\u00db\7\7\2\2\u00db\u00dc\7A\2"+
		"\2\u00dc\u00dd\5\20\t\2\u00dd\u00df\7\13\2\2\u00de\u00e0\5V,\2\u00df\u00de"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\7\13\2\2"+
		"\u00e2\u00e4\5V,\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e6\7\b\2\2\u00e6\u00e7\5\b\5\2\u00e7\u00fa\3\2\2\2\u00e8"+
		"\u00e9\7G\2\2\u00e9\u00ea\7\7\2\2\u00ea\u00eb\5X-\2\u00eb\u00ec\7R\2\2"+
		"\u00ec\u00ed\5V,\2\u00ed\u00ee\7\b\2\2\u00ee\u00ef\5\b\5\2\u00ef\u00fa"+
		"\3\2\2\2\u00f0\u00f1\7G\2\2\u00f1\u00f2\7\7\2\2\u00f2\u00f3\7A\2\2\u00f3"+
		"\u00f4\5\22\n\2\u00f4\u00f5\7R\2\2\u00f5\u00f6\5V,\2\u00f6\u00f7\7\b\2"+
		"\2\u00f7\u00f8\5\b\5\2\u00f8\u00fa\3\2\2\2\u00f9\u00bc\3\2\2\2\u00f9\u00c4"+
		"\3\2\2\2\u00f9\u00ca\3\2\2\2\u00f9\u00d9\3\2\2\2\u00f9\u00e8\3\2\2\2\u00f9"+
		"\u00f0\3\2\2\2\u00fa\35\3\2\2\2\u00fb\u00fe\7F\2\2\u00fc\u00fd\6\20\4"+
		"\2\u00fd\u00ff\7d\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\5l\67\2\u0101\37\3\2\2\2\u0102\u0105\7:\2\2\u0103"+
		"\u0104\6\21\5\2\u0104\u0106\7d\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0108\5l\67\2\u0108!\3\2\2\2\u0109\u010c"+
		"\7D\2\2\u010a\u010b\6\22\6\2\u010b\u010d\5V,\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\5l\67\2\u010f#\3\2\2\2"+
		"\u0110\u0111\7M\2\2\u0111\u0112\7\7\2\2\u0112\u0113\5V,\2\u0113\u0114"+
		"\7\b\2\2\u0114\u0115\5\b\5\2\u0115%\3\2\2\2\u0116\u0117\7H\2\2\u0117\u0118"+
		"\7\7\2\2\u0118\u0119\5V,\2\u0119\u011a\7\b\2\2\u011a\u011b\5(\25\2\u011b"+
		"\'\3\2\2\2\u011c\u011e\7\t\2\2\u011d\u011f\5*\26\2\u011e\u011d\3\2\2\2"+
		"\u011e\u011f\3\2\2\2\u011f\u0124\3\2\2\2\u0120\u0122\5.\30\2\u0121\u0123"+
		"\5*\26\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u0120\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7\n"+
		"\2\2\u0127)\3\2\2\2\u0128\u012a\5,\27\2\u0129\u0128\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c+\3\2\2\2\u012d"+
		"\u012e\7>\2\2\u012e\u012f\5V,\2\u012f\u0131\7\17\2\2\u0130\u0132\5\f\7"+
		"\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132-\3\2\2\2\u0133\u0134"+
		"\7N\2\2\u0134\u0136\7\17\2\2\u0135\u0137\5\f\7\2\u0136\u0135\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137/\3\2\2\2\u0138\u0139\7d\2\2\u0139\u013a\7\17\2\2"+
		"\u013a\u013b\5\b\5\2\u013b\61\3\2\2\2\u013c\u013d\7P\2\2\u013d\u013e\6"+
		"\32\7\2\u013e\u013f\5V,\2\u013f\u0140\5l\67\2\u0140\63\3\2\2\2\u0141\u0142"+
		"\7S\2\2\u0142\u0143\5\n\6\2\u0143\u0144\5\66\34\2\u0144\u014f\3\2\2\2"+
		"\u0145\u0146\7S\2\2\u0146\u0147\5\n\6\2\u0147\u0148\58\35\2\u0148\u014f"+
		"\3\2\2\2\u0149\u014a\7S\2\2\u014a\u014b\5\n\6\2\u014b\u014c\5\66\34\2"+
		"\u014c\u014d\58\35\2\u014d\u014f\3\2\2\2\u014e\u0141\3\2\2\2\u014e\u0145"+
		"\3\2\2\2\u014e\u0149\3\2\2\2\u014f\65\3\2\2\2\u0150\u0151\7B\2\2\u0151"+
		"\u0152\7\7\2\2\u0152\u0153\7d\2\2\u0153\u0154\7\b\2\2\u0154\u0155\5\n"+
		"\6\2\u0155\67\3\2\2\2\u0156\u0157\7C\2\2\u0157\u0158\5\n\6\2\u01589\3"+
		"\2\2\2\u0159\u015a\7J\2\2\u015a\u015b\5l\67\2\u015b;\3\2\2\2\u015c\u015d"+
		"\7K\2\2\u015d\u015e\7d\2\2\u015e\u0160\7\7\2\2\u015f\u0161\5> \2\u0160"+
		"\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7\b"+
		"\2\2\u0163\u0164\7\t\2\2\u0164\u0165\5@!\2\u0165\u0166\7\n\2\2\u0166="+
		"\3\2\2\2\u0167\u016c\7d\2\2\u0168\u0169\7\f\2\2\u0169\u016b\7d\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d?\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\5\4\3\2\u0170\u016f"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171A\3\2\2\2\u0172\u0174\7\5\2\2\u0173"+
		"\u0175\5D#\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2"+
		"\2\u0176\u0178\7\f\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a"+
		"\3\2\2\2\u0179\u017b\5F$\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\7\6\2\2\u017dC\3\2\2\2\u017e\u0180\5F$\2\u017f"+
		"\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0189\5X"+
		"-\2\u0182\u0184\7\f\2\2\u0183\u0185\5F$\2\u0184\u0183\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\5X-\2\u0187\u0182\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018aE\3\2\2\2"+
		"\u018b\u0189\3\2\2\2\u018c\u018e\7\f\2\2\u018d\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190G\3\2\2\2\u0191"+
		"\u0192\7\t\2\2\u0192\u019b\7\n\2\2\u0193\u0194\7\t\2\2\u0194\u0196\5J"+
		"&\2\u0195\u0197\7\f\2\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u0199\7\n\2\2\u0199\u019b\3\2\2\2\u019a\u0191\3\2"+
		"\2\2\u019a\u0193\3\2\2\2\u019bI\3\2\2\2\u019c\u01a1\5L\'\2\u019d\u019e"+
		"\7\f\2\2\u019e\u01a0\5L\'\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2K\3\2\2\2\u01a3\u01a1\3\2\2\2"+
		"\u01a4\u01a5\5N(\2\u01a5\u01a6\7\17\2\2\u01a6\u01a7\5X-\2\u01a7\u01b8"+
		"\3\2\2\2\u01a8\u01a9\5h\65\2\u01a9\u01aa\7\7\2\2\u01aa\u01ab\7\b\2\2\u01ab"+
		"\u01ac\7\t\2\2\u01ac\u01ad\5@!\2\u01ad\u01ae\7\n\2\2\u01ae\u01b8\3\2\2"+
		"\2\u01af\u01b0\5j\66\2\u01b0\u01b1\7\7\2\2\u01b1\u01b2\5P)\2\u01b2\u01b3"+
		"\7\b\2\2\u01b3\u01b4\7\t\2\2\u01b4\u01b5\5@!\2\u01b5\u01b6\7\n\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01a4\3\2\2\2\u01b7\u01a8\3\2\2\2\u01b7\u01af\3\2"+
		"\2\2\u01b8M\3\2\2\2\u01b9\u01bd\5`\61\2\u01ba\u01bd\7e\2\2\u01bb\u01bd"+
		"\5^\60\2\u01bc\u01b9\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"O\3\2\2\2\u01be\u01bf\7d\2\2\u01bfQ\3\2\2\2\u01c0\u01c2\7\7\2\2\u01c1"+
		"\u01c3\5T+\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2"+
		"\2\u01c4\u01c5\7\b\2\2\u01c5S\3\2\2\2\u01c6\u01cb\5X-\2\u01c7\u01c8\7"+
		"\f\2\2\u01c8\u01ca\5X-\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01ccU\3\2\2\2\u01cd\u01cb\3\2\2\2"+
		"\u01ce\u01d3\5X-\2\u01cf\u01d0\7\f\2\2\u01d0\u01d2\5X-\2\u01d1\u01cf\3"+
		"\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"W\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\b-\1\2\u01d7\u01d9\7K\2\2\u01d8"+
		"\u01da\7d\2\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01db\u01dd\7\7\2\2\u01dc\u01de\5> \2\u01dd\u01dc\3\2\2\2\u01dd\u01de"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\7\b\2\2\u01e0\u01e1\7\t\2\2\u01e1"+
		"\u01e2\5@!\2\u01e2\u01e3\7\n\2\2\u01e3\u0205\3\2\2\2\u01e4\u01e5\7@\2"+
		"\2\u01e5\u01e7\5X-\2\u01e6\u01e8\5R*\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u0205\3\2\2\2\u01e9\u01ea\7Q\2\2\u01ea\u0205\5X- \u01eb"+
		"\u01ec\7E\2\2\u01ec\u0205\5X-\37\u01ed\u01ee\7=\2\2\u01ee\u0205\5X-\36"+
		"\u01ef\u01f0\7\21\2\2\u01f0\u0205\5X-\35\u01f1\u01f2\7\22\2\2\u01f2\u0205"+
		"\5X-\34\u01f3\u01f4\7\23\2\2\u01f4\u0205\5X-\33\u01f5\u01f6\7\24\2\2\u01f6"+
		"\u0205\5X-\32\u01f7\u01f8\7\25\2\2\u01f8\u0205\5X-\31\u01f9\u01fa\7\26"+
		"\2\2\u01fa\u0205\5X-\30\u01fb\u0205\7L\2\2\u01fc\u0205\7d\2\2\u01fd\u0205"+
		"\5\\/\2\u01fe\u0205\5B\"\2\u01ff\u0205\5H%\2\u0200\u0201\7\7\2\2\u0201"+
		"\u0202\5V,\2\u0202\u0203\7\b\2\2\u0203\u0205\3\2\2\2\u0204\u01d6\3\2\2"+
		"\2\u0204\u01e4\3\2\2\2\u0204\u01e9\3\2\2\2\u0204\u01eb\3\2\2\2\u0204\u01ed"+
		"\3\2\2\2\u0204\u01ef\3\2\2\2\u0204\u01f1\3\2\2\2\u0204\u01f3\3\2\2\2\u0204"+
		"\u01f5\3\2\2\2\u0204\u01f7\3\2\2\2\u0204\u01f9\3\2\2\2\u0204\u01fb\3\2"+
		"\2\2\u0204\u01fc\3\2\2\2\u0204\u01fd\3\2\2\2\u0204\u01fe\3\2\2\2\u0204"+
		"\u01ff\3\2\2\2\u0204\u0200\3\2\2\2\u0205\u0249\3\2\2\2\u0206\u0207\f\27"+
		"\2\2\u0207\u0208\t\2\2\2\u0208\u0248\5X-\30\u0209\u020a\f\26\2\2\u020a"+
		"\u020b\t\3\2\2\u020b\u0248\5X-\27\u020c\u020d\f\25\2\2\u020d\u020e\t\4"+
		"\2\2\u020e\u0248\5X-\26\u020f\u0210\f\24\2\2\u0210\u0211\t\5\2\2\u0211"+
		"\u0248\5X-\25\u0212\u0213\f\23\2\2\u0213\u0214\7<\2\2\u0214\u0248\5X-"+
		"\24\u0215\u0216\f\22\2\2\u0216\u0217\7R\2\2\u0217\u0248\5X-\23\u0218\u0219"+
		"\f\21\2\2\u0219\u021a\t\6\2\2\u021a\u0248\5X-\22\u021b\u021c\f\20\2\2"+
		"\u021c\u021d\7%\2\2\u021d\u0248\5X-\21\u021e\u021f\f\17\2\2\u021f\u0220"+
		"\7&\2\2\u0220\u0248\5X-\20\u0221\u0222\f\16\2\2\u0222\u0223\7\'\2\2\u0223"+
		"\u0248\5X-\17\u0224\u0225\f\r\2\2\u0225\u0226\7(\2\2\u0226\u0248\5X-\16"+
		"\u0227\u0228\f\f\2\2\u0228\u0229\7)\2\2\u0229\u0248\5X-\r\u022a\u022b"+
		"\f\13\2\2\u022b\u022c\7\16\2\2\u022c\u022d\5X-\2\u022d\u022e\7\17\2\2"+
		"\u022e\u022f\5X-\f\u022f\u0248\3\2\2\2\u0230\u0231\f&\2\2\u0231\u0232"+
		"\7\5\2\2\u0232\u0233\5V,\2\u0233\u0234\7\6\2\2\u0234\u0248\3\2\2\2\u0235"+
		"\u0236\f%\2\2\u0236\u0237\7\20\2\2\u0237\u0248\5`\61\2\u0238\u0239\f$"+
		"\2\2\u0239\u0248\5R*\2\u023a\u023b\f\"\2\2\u023b\u023c\6-\31\2\u023c\u0248"+
		"\7\21\2\2\u023d\u023e\f!\2\2\u023e\u023f\6-\33\2\u023f\u0248\7\22\2\2"+
		"\u0240\u0241\f\n\2\2\u0241\u0242\7\r\2\2\u0242\u0248\5V,\2\u0243\u0244"+
		"\f\t\2\2\u0244\u0245\5Z.\2\u0245\u0246\5V,\2\u0246\u0248\3\2\2\2\u0247"+
		"\u0206\3\2\2\2\u0247\u0209\3\2\2\2\u0247\u020c\3\2\2\2\u0247\u020f\3\2"+
		"\2\2\u0247\u0212\3\2\2\2\u0247\u0215\3\2\2\2\u0247\u0218\3\2\2\2\u0247"+
		"\u021b\3\2\2\2\u0247\u021e\3\2\2\2\u0247\u0221\3\2\2\2\u0247\u0224\3\2"+
		"\2\2\u0247\u0227\3\2\2\2\u0247\u022a\3\2\2\2\u0247\u0230\3\2\2\2\u0247"+
		"\u0235\3\2\2\2\u0247\u0238\3\2\2\2\u0247\u023a\3\2\2\2\u0247\u023d\3\2"+
		"\2\2\u0247\u0240\3\2\2\2\u0247\u0243\3\2\2\2\u0248\u024b\3\2\2\2\u0249"+
		"\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024aY\3\2\2\2\u024b\u0249\3\2\2\2"+
		"\u024c\u024d\t\7\2\2\u024d[\3\2\2\2\u024e\u0251\t\b\2\2\u024f\u0251\5"+
		"^\60\2\u0250\u024e\3\2\2\2\u0250\u024f\3\2\2\2\u0251]\3\2\2\2\u0252\u0253"+
		"\t\t\2\2\u0253_\3\2\2\2\u0254\u0257\7d\2\2\u0255\u0257\5b\62\2\u0256\u0254"+
		"\3\2\2\2\u0256\u0255\3\2\2\2\u0257a\3\2\2\2\u0258\u025c\5d\63\2\u0259"+
		"\u025c\5f\64\2\u025a\u025c\t\n\2\2\u025b\u0258\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025b\u025a\3\2\2\2\u025cc\3\2\2\2\u025d\u025e\t\13\2\2\u025ee\3"+
		"\2\2\2\u025f\u0260\t\f\2\2\u0260g\3\2\2\2\u0261\u0262\6\65\36\2\u0262"+
		"\u0263\7d\2\2\u0263\u0264\5N(\2\u0264i\3\2\2\2\u0265\u0266\6\66\37\2\u0266"+
		"\u0267\7d\2\2\u0267\u0268\5N(\2\u0268k\3\2\2\2\u0269\u026e\7\13\2\2\u026a"+
		"\u026e\7\2\2\3\u026b\u026e\6\67 \2\u026c\u026e\6\67!\2\u026d\u0269\3\2"+
		"\2\2\u026d\u026a\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026c\3\2\2\2\u026e"+
		"m\3\2\2\2\u026f\u0270\7\2\2\3\u0270o\3\2\2\2\67qx}\u008f\u0093\u009a\u00a5"+
		"\u00aa\u00ba\u00cd\u00d1\u00d5\u00df\u00e3\u00f9\u00fe\u0105\u010c\u011e"+
		"\u0122\u0124\u012b\u0131\u0136\u014e\u0160\u016c\u0170\u0174\u0177\u017a"+
		"\u017f\u0184\u0189\u018f\u0196\u019a\u01a1\u01b7\u01bc\u01c2\u01cb\u01d3"+
		"\u01d9\u01dd\u01e7\u0204\u0247\u0249\u0250\u0256\u025b\u026d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}