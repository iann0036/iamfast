// Generated from /Users/ian/iamfast-js/grammars/PhpParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PhpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SeaWhitespace=1, HtmlText=2, XmlStart=3, PHPStart=4, HtmlScriptOpen=5, 
		HtmlStyleOpen=6, HtmlComment=7, HtmlDtd=8, HtmlOpen=9, Shebang=10, Error=11, 
		XmlText=12, XmlClose=13, PHPStartInside=14, HtmlClose=15, HtmlSlashClose=16, 
		HtmlSlash=17, HtmlEquals=18, HtmlStartQuoteString=19, HtmlStartDoubleQuoteString=20, 
		HtmlHex=21, HtmlDecimal=22, HtmlSpace=23, HtmlName=24, ErrorInside=25, 
		PHPStartInsideQuoteString=26, HtmlEndQuoteString=27, HtmlQuoteString=28, 
		ErrorHtmlQuote=29, PHPStartDoubleQuoteString=30, HtmlEndDoubleQuoteString=31, 
		HtmlDoubleQuoteString=32, ErrorHtmlDoubleQuote=33, ScriptText=34, HtmlScriptClose=35, 
		PHPStartInsideScript=36, StyleBody=37, PHPEnd=38, Whitespace=39, MultiLineComment=40, 
		SingleLineComment=41, ShellStyleComment=42, AttributeStart=43, Abstract=44, 
		Array=45, As=46, BinaryCast=47, BoolType=48, BooleanConstant=49, Break=50, 
		Callable=51, Case=52, Catch=53, Class=54, Clone=55, Const=56, Continue=57, 
		Declare=58, Default=59, Do=60, DoubleCast=61, DoubleType=62, Echo=63, 
		Else=64, ElseIf=65, Empty=66, EndDeclare=67, EndFor=68, EndForeach=69, 
		EndIf=70, EndSwitch=71, EndWhile=72, Eval=73, Exit=74, Extends=75, Final=76, 
		Finally=77, FloatCast=78, For=79, Foreach=80, Function_=81, Global=82, 
		Goto=83, If=84, Implements=85, Import=86, Include=87, IncludeOnce=88, 
		InstanceOf=89, InsteadOf=90, Int8Cast=91, Int16Cast=92, Int64Type=93, 
		IntType=94, Interface=95, IsSet=96, List=97, LogicalAnd=98, LogicalOr=99, 
		LogicalXor=100, Match=101, Namespace=102, New=103, Null=104, ObjectType=105, 
		Parent_=106, Partial=107, Print=108, Private=109, Protected=110, Public=111, 
		Require=112, RequireOnce=113, Resource=114, Return=115, Static=116, StringType=117, 
		Switch=118, Throw=119, Trait=120, Try=121, Typeof=122, UintCast=123, UnicodeCast=124, 
		Unset=125, Use=126, Var=127, While=128, Yield=129, From=130, LambdaFn=131, 
		Get=132, Set=133, Call=134, CallStatic=135, Constructor=136, Destruct=137, 
		Wakeup=138, Sleep=139, Autoload=140, IsSet__=141, Unset__=142, ToString__=143, 
		Invoke=144, SetState=145, Clone__=146, DebugInfo=147, Namespace__=148, 
		Class__=149, Traic__=150, Function__=151, Method__=152, Line__=153, File__=154, 
		Dir__=155, Spaceship=156, Lgeneric=157, Rgeneric=158, DoubleArrow=159, 
		Inc=160, Dec=161, IsIdentical=162, IsNoidentical=163, IsEqual=164, IsNotEq=165, 
		IsSmallerOrEqual=166, IsGreaterOrEqual=167, PlusEqual=168, MinusEqual=169, 
		MulEqual=170, Pow=171, PowEqual=172, DivEqual=173, Concaequal=174, ModEqual=175, 
		ShiftLeftEqual=176, ShiftRightEqual=177, AndEqual=178, OrEqual=179, XorEqual=180, 
		BooleanOr=181, BooleanAnd=182, NullCoalescing=183, NullCoalescingEqual=184, 
		ShiftLeft=185, ShiftRight=186, DoubleColon=187, ObjectOperator=188, NamespaceSeparator=189, 
		Ellipsis=190, Less=191, Greater=192, Ampersand=193, Pipe=194, Bang=195, 
		Caret=196, Plus=197, Minus=198, Asterisk=199, Percent=200, Divide=201, 
		Tilde=202, SuppressWarnings=203, Dollar=204, Dot=205, QuestionMark=206, 
		OpenRoundBracket=207, CloseRoundBracket=208, OpenSquareBracket=209, CloseSquareBracket=210, 
		OpenCurlyBracket=211, CloseCurlyBracket=212, Comma=213, Colon=214, SemiColon=215, 
		Eq=216, Quote=217, BackQuote=218, VarName=219, Label=220, Octal=221, Decimal=222, 
		Real=223, Hex=224, Binary=225, BackQuoteString=226, SingleQuoteString=227, 
		DoubleQuote=228, StartNowDoc=229, StartHereDoc=230, ErrorPhp=231, CurlyDollar=232, 
		UnicodeEscape=233, StringPart=234, Comment=235, PHPEndSingleLineComment=236, 
		CommentEnd=237, HereDocText=238, XmlText2=239;
	public static final int
		RULE_htmlDocument = 0, RULE_inlineHtml = 1, RULE_htmlElement = 2, RULE_scriptText = 3, 
		RULE_phpBlock = 4, RULE_importStatement = 5, RULE_topStatement = 6, RULE_useDeclaration = 7, 
		RULE_useDeclarationContentList = 8, RULE_useDeclarationContent = 9, RULE_namespaceDeclaration = 10, 
		RULE_namespaceStatement = 11, RULE_functionDeclaration = 12, RULE_classDeclaration = 13, 
		RULE_classEntryType = 14, RULE_interfaceList = 15, RULE_typeParameterListInBrackets = 16, 
		RULE_typeParameterList = 17, RULE_typeParameterWithDefaultsList = 18, 
		RULE_typeParameterDecl = 19, RULE_typeParameterWithDefaultDecl = 20, RULE_genericDynamicArgs = 21, 
		RULE_attributes = 22, RULE_attributeGroup = 23, RULE_attribute = 24, RULE_innerStatementList = 25, 
		RULE_innerStatement = 26, RULE_statement = 27, RULE_emptyStatement_ = 28, 
		RULE_blockStatement = 29, RULE_ifStatement = 30, RULE_elseIfStatement = 31, 
		RULE_elseIfColonStatement = 32, RULE_elseStatement = 33, RULE_elseColonStatement = 34, 
		RULE_whileStatement = 35, RULE_doWhileStatement = 36, RULE_forStatement = 37, 
		RULE_forInit = 38, RULE_forUpdate = 39, RULE_switchStatement = 40, RULE_switchBlock = 41, 
		RULE_breakStatement = 42, RULE_continueStatement = 43, RULE_returnStatement = 44, 
		RULE_expressionStatement = 45, RULE_unsetStatement = 46, RULE_foreachStatement = 47, 
		RULE_tryCatchFinally = 48, RULE_catchClause = 49, RULE_finallyStatement = 50, 
		RULE_throwStatement = 51, RULE_gotoStatement = 52, RULE_declareStatement = 53, 
		RULE_inlineHtmlStatement = 54, RULE_declareList = 55, RULE_formalParameterList = 56, 
		RULE_formalParameter = 57, RULE_typeHint = 58, RULE_globalStatement = 59, 
		RULE_globalVar = 60, RULE_echoStatement = 61, RULE_staticVariableStatement = 62, 
		RULE_classStatement = 63, RULE_traitAdaptations = 64, RULE_traitAdaptationStatement = 65, 
		RULE_traitPrecedence = 66, RULE_traitAlias = 67, RULE_traitMethodReference = 68, 
		RULE_baseCtorCall = 69, RULE_methodBody = 70, RULE_propertyModifiers = 71, 
		RULE_memberModifiers = 72, RULE_variableInitializer = 73, RULE_identifierInitializer = 74, 
		RULE_globalConstantDeclaration = 75, RULE_expressionList = 76, RULE_parentheses = 77, 
		RULE_expression = 78, RULE_assignable = 79, RULE_arrayCreation = 80, RULE_lambdaFunctionExpr = 81, 
		RULE_matchExpr = 82, RULE_matchItem = 83, RULE_newExpr = 84, RULE_assignmentOperator = 85, 
		RULE_yieldExpression = 86, RULE_arrayItemList = 87, RULE_arrayItem = 88, 
		RULE_lambdaFunctionUseVars = 89, RULE_lambdaFunctionUseVar = 90, RULE_qualifiedStaticTypeRef = 91, 
		RULE_typeRef = 92, RULE_anonymousClass = 93, RULE_indirectTypeRef = 94, 
		RULE_qualifiedNamespaceName = 95, RULE_namespaceNameList = 96, RULE_namespaceNameTail = 97, 
		RULE_qualifiedNamespaceNameList = 98, RULE_arguments = 99, RULE_actualArgument = 100, 
		RULE_argumentName = 101, RULE_constantInitializer = 102, RULE_constant = 103, 
		RULE_literalConstant = 104, RULE_numericConstant = 105, RULE_classConstant = 106, 
		RULE_stringConstant = 107, RULE_string = 108, RULE_interpolatedStringPart = 109, 
		RULE_chainList = 110, RULE_chain = 111, RULE_chainOrigin = 112, RULE_memberAccess = 113, 
		RULE_functionCall = 114, RULE_functionCallName = 115, RULE_actualArguments = 116, 
		RULE_chainBase = 117, RULE_keyedFieldName = 118, RULE_keyedSimpleFieldName = 119, 
		RULE_keyedVariable = 120, RULE_squareCurlyExpression = 121, RULE_assignmentList = 122, 
		RULE_assignmentListElement = 123, RULE_modifier = 124, RULE_identifier = 125, 
		RULE_memberModifier = 126, RULE_magicConstant = 127, RULE_magicMethod = 128, 
		RULE_primitiveType = 129, RULE_castOperation = 130;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "inlineHtml", "htmlElement", "scriptText", "phpBlock", 
			"importStatement", "topStatement", "useDeclaration", "useDeclarationContentList", 
			"useDeclarationContent", "namespaceDeclaration", "namespaceStatement", 
			"functionDeclaration", "classDeclaration", "classEntryType", "interfaceList", 
			"typeParameterListInBrackets", "typeParameterList", "typeParameterWithDefaultsList", 
			"typeParameterDecl", "typeParameterWithDefaultDecl", "genericDynamicArgs", 
			"attributes", "attributeGroup", "attribute", "innerStatementList", "innerStatement", 
			"statement", "emptyStatement_", "blockStatement", "ifStatement", "elseIfStatement", 
			"elseIfColonStatement", "elseStatement", "elseColonStatement", "whileStatement", 
			"doWhileStatement", "forStatement", "forInit", "forUpdate", "switchStatement", 
			"switchBlock", "breakStatement", "continueStatement", "returnStatement", 
			"expressionStatement", "unsetStatement", "foreachStatement", "tryCatchFinally", 
			"catchClause", "finallyStatement", "throwStatement", "gotoStatement", 
			"declareStatement", "inlineHtmlStatement", "declareList", "formalParameterList", 
			"formalParameter", "typeHint", "globalStatement", "globalVar", "echoStatement", 
			"staticVariableStatement", "classStatement", "traitAdaptations", "traitAdaptationStatement", 
			"traitPrecedence", "traitAlias", "traitMethodReference", "baseCtorCall", 
			"methodBody", "propertyModifiers", "memberModifiers", "variableInitializer", 
			"identifierInitializer", "globalConstantDeclaration", "expressionList", 
			"parentheses", "expression", "assignable", "arrayCreation", "lambdaFunctionExpr", 
			"matchExpr", "matchItem", "newExpr", "assignmentOperator", "yieldExpression", 
			"arrayItemList", "arrayItem", "lambdaFunctionUseVars", "lambdaFunctionUseVar", 
			"qualifiedStaticTypeRef", "typeRef", "anonymousClass", "indirectTypeRef", 
			"qualifiedNamespaceName", "namespaceNameList", "namespaceNameTail", "qualifiedNamespaceNameList", 
			"arguments", "actualArgument", "argumentName", "constantInitializer", 
			"constant", "literalConstant", "numericConstant", "classConstant", "stringConstant", 
			"string", "interpolatedStringPart", "chainList", "chain", "chainOrigin", 
			"memberAccess", "functionCall", "functionCallName", "actualArguments", 
			"chainBase", "keyedFieldName", "keyedSimpleFieldName", "keyedVariable", 
			"squareCurlyExpression", "assignmentList", "assignmentListElement", "modifier", 
			"identifier", "memberModifier", "magicConstant", "magicMethod", "primitiveType", 
			"castOperation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'<?xml'", null, null, null, null, null, null, null, 
			null, null, "'?>'", null, null, "'/>'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'#['", "'abstract'", 
			"'array'", "'as'", "'binary'", null, null, "'break'", "'callable'", "'case'", 
			"'catch'", "'class'", "'clone'", "'const'", "'continue'", "'declare'", 
			"'default'", "'do'", "'real'", "'double'", "'echo'", "'else'", "'elseif'", 
			"'empty'", "'enddeclare'", "'endfor'", "'endforeach'", "'endif'", "'endswitch'", 
			"'endwhile'", "'eval'", "'die'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'foreach'", "'function'", "'global'", "'goto'", 
			"'if'", "'implements'", "'import'", "'include'", "'include_once'", "'instanceof'", 
			"'insteadof'", "'int8'", "'int16'", "'int64'", null, "'interface'", "'isset'", 
			"'list'", "'and'", "'or'", "'xor'", "'match'", "'namespace'", "'new'", 
			"'null'", "'object'", "'parent'", "'partial'", "'print'", "'private'", 
			"'protected'", "'public'", "'require'", "'require_once'", "'resource'", 
			"'return'", "'static'", "'string'", "'switch'", "'throw'", "'trait'", 
			"'try'", "'clrtypeof'", null, "'unicode'", "'unset'", "'use'", "'var'", 
			"'while'", "'yield'", "'from'", "'fn'", "'__get'", "'__set'", "'__call'", 
			"'__callstatic'", "'__construct'", "'__destruct'", "'__wakeup'", "'__sleep'", 
			"'__autoload'", "'__isset'", "'__unset'", "'__tostring'", "'__invoke'", 
			"'__set_state'", "'__clone'", "'__debuginfo'", "'__namespace__'", "'__class__'", 
			"'__trait__'", "'__function__'", "'__method__'", "'__line__'", "'__file__'", 
			"'__dir__'", "'<=>'", "'<:'", "':>'", "'=>'", "'++'", "'--'", "'==='", 
			"'!=='", "'=='", null, "'<='", "'>='", "'+='", "'-='", "'*='", "'**'", 
			"'**='", "'/='", "'.='", "'%='", "'<<='", "'>>='", "'&='", "'|='", "'^='", 
			"'||'", "'&&'", "'??'", "'??='", "'<<'", "'>>'", "'::'", "'->'", "'\\'", 
			"'...'", null, null, "'&'", "'|'", "'!'", "'^'", "'+'", "'-'", "'*'", 
			"'%'", null, "'~'", "'@'", null, "'.'", null, "'('", "')'", "'['", "']'", 
			null, "'}'", "','", "':'", "';'", null, "'''", "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SeaWhitespace", "HtmlText", "XmlStart", "PHPStart", "HtmlScriptOpen", 
			"HtmlStyleOpen", "HtmlComment", "HtmlDtd", "HtmlOpen", "Shebang", "Error", 
			"XmlText", "XmlClose", "PHPStartInside", "HtmlClose", "HtmlSlashClose", 
			"HtmlSlash", "HtmlEquals", "HtmlStartQuoteString", "HtmlStartDoubleQuoteString", 
			"HtmlHex", "HtmlDecimal", "HtmlSpace", "HtmlName", "ErrorInside", "PHPStartInsideQuoteString", 
			"HtmlEndQuoteString", "HtmlQuoteString", "ErrorHtmlQuote", "PHPStartDoubleQuoteString", 
			"HtmlEndDoubleQuoteString", "HtmlDoubleQuoteString", "ErrorHtmlDoubleQuote", 
			"ScriptText", "HtmlScriptClose", "PHPStartInsideScript", "StyleBody", 
			"PHPEnd", "Whitespace", "MultiLineComment", "SingleLineComment", "ShellStyleComment", 
			"AttributeStart", "Abstract", "Array", "As", "BinaryCast", "BoolType", 
			"BooleanConstant", "Break", "Callable", "Case", "Catch", "Class", "Clone", 
			"Const", "Continue", "Declare", "Default", "Do", "DoubleCast", "DoubleType", 
			"Echo", "Else", "ElseIf", "Empty", "EndDeclare", "EndFor", "EndForeach", 
			"EndIf", "EndSwitch", "EndWhile", "Eval", "Exit", "Extends", "Final", 
			"Finally", "FloatCast", "For", "Foreach", "Function_", "Global", "Goto", 
			"If", "Implements", "Import", "Include", "IncludeOnce", "InstanceOf", 
			"InsteadOf", "Int8Cast", "Int16Cast", "Int64Type", "IntType", "Interface", 
			"IsSet", "List", "LogicalAnd", "LogicalOr", "LogicalXor", "Match", "Namespace", 
			"New", "Null", "ObjectType", "Parent_", "Partial", "Print", "Private", 
			"Protected", "Public", "Require", "RequireOnce", "Resource", "Return", 
			"Static", "StringType", "Switch", "Throw", "Trait", "Try", "Typeof", 
			"UintCast", "UnicodeCast", "Unset", "Use", "Var", "While", "Yield", "From", 
			"LambdaFn", "Get", "Set", "Call", "CallStatic", "Constructor", "Destruct", 
			"Wakeup", "Sleep", "Autoload", "IsSet__", "Unset__", "ToString__", "Invoke", 
			"SetState", "Clone__", "DebugInfo", "Namespace__", "Class__", "Traic__", 
			"Function__", "Method__", "Line__", "File__", "Dir__", "Spaceship", "Lgeneric", 
			"Rgeneric", "DoubleArrow", "Inc", "Dec", "IsIdentical", "IsNoidentical", 
			"IsEqual", "IsNotEq", "IsSmallerOrEqual", "IsGreaterOrEqual", "PlusEqual", 
			"MinusEqual", "MulEqual", "Pow", "PowEqual", "DivEqual", "Concaequal", 
			"ModEqual", "ShiftLeftEqual", "ShiftRightEqual", "AndEqual", "OrEqual", 
			"XorEqual", "BooleanOr", "BooleanAnd", "NullCoalescing", "NullCoalescingEqual", 
			"ShiftLeft", "ShiftRight", "DoubleColon", "ObjectOperator", "NamespaceSeparator", 
			"Ellipsis", "Less", "Greater", "Ampersand", "Pipe", "Bang", "Caret", 
			"Plus", "Minus", "Asterisk", "Percent", "Divide", "Tilde", "SuppressWarnings", 
			"Dollar", "Dot", "QuestionMark", "OpenRoundBracket", "CloseRoundBracket", 
			"OpenSquareBracket", "CloseSquareBracket", "OpenCurlyBracket", "CloseCurlyBracket", 
			"Comma", "Colon", "SemiColon", "Eq", "Quote", "BackQuote", "VarName", 
			"Label", "Octal", "Decimal", "Real", "Hex", "Binary", "BackQuoteString", 
			"SingleQuoteString", "DoubleQuote", "StartNowDoc", "StartHereDoc", "ErrorPhp", 
			"CurlyDollar", "UnicodeEscape", "StringPart", "Comment", "PHPEndSingleLineComment", 
			"CommentEnd", "HereDocText", "XmlText2"
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
	public String getGrammarFileName() { return "PhpParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PhpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PhpParser.EOF, 0); }
		public TerminalNode Shebang() { return getToken(PhpParser.Shebang, 0); }
		public List<InlineHtmlContext> inlineHtml() {
			return getRuleContexts(InlineHtmlContext.class);
		}
		public InlineHtmlContext inlineHtml(int i) {
			return getRuleContext(InlineHtmlContext.class,i);
		}
		public List<PhpBlockContext> phpBlock() {
			return getRuleContexts(PhpBlockContext.class);
		}
		public PhpBlockContext phpBlock(int i) {
			return getRuleContext(PhpBlockContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Shebang) {
				{
				setState(262);
				match(Shebang);
				}
			}

			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << XmlStart) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptText) | (1L << HtmlScriptClose) | (1L << StyleBody) | (1L << AttributeStart) | (1L << Abstract) | (1L << Array) | (1L << As) | (1L << BinaryCast) | (1L << BoolType) | (1L << BooleanConstant) | (1L << Break) | (1L << Callable) | (1L << Case) | (1L << Catch) | (1L << Class) | (1L << Clone) | (1L << Const) | (1L << Continue) | (1L << Declare) | (1L << Default) | (1L << Do) | (1L << DoubleCast) | (1L << DoubleType) | (1L << Echo))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Else - 64)) | (1L << (ElseIf - 64)) | (1L << (Empty - 64)) | (1L << (EndDeclare - 64)) | (1L << (EndFor - 64)) | (1L << (EndForeach - 64)) | (1L << (EndIf - 64)) | (1L << (EndSwitch - 64)) | (1L << (EndWhile - 64)) | (1L << (Eval - 64)) | (1L << (Exit - 64)) | (1L << (Extends - 64)) | (1L << (Final - 64)) | (1L << (Finally - 64)) | (1L << (FloatCast - 64)) | (1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (Function_ - 64)) | (1L << (Global - 64)) | (1L << (Goto - 64)) | (1L << (If - 64)) | (1L << (Implements - 64)) | (1L << (Import - 64)) | (1L << (Include - 64)) | (1L << (IncludeOnce - 64)) | (1L << (InstanceOf - 64)) | (1L << (InsteadOf - 64)) | (1L << (Int8Cast - 64)) | (1L << (Int16Cast - 64)) | (1L << (Int64Type - 64)) | (1L << (IntType - 64)) | (1L << (Interface - 64)) | (1L << (IsSet - 64)) | (1L << (List - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalXor - 64)) | (1L << (Match - 64)) | (1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Null - 64)) | (1L << (ObjectType - 64)) | (1L << (Parent_ - 64)) | (1L << (Partial - 64)) | (1L << (Print - 64)) | (1L << (Private - 64)) | (1L << (Protected - 64)) | (1L << (Public - 64)) | (1L << (Require - 64)) | (1L << (RequireOnce - 64)) | (1L << (Resource - 64)) | (1L << (Return - 64)) | (1L << (Static - 64)) | (1L << (StringType - 64)) | (1L << (Switch - 64)) | (1L << (Throw - 64)) | (1L << (Trait - 64)) | (1L << (Try - 64)) | (1L << (Typeof - 64)) | (1L << (UintCast - 64)) | (1L << (UnicodeCast - 64)) | (1L << (Unset - 64)) | (1L << (Use - 64)) | (1L << (Var - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (While - 128)) | (1L << (Yield - 128)) | (1L << (From - 128)) | (1L << (LambdaFn - 128)) | (1L << (Get - 128)) | (1L << (Set - 128)) | (1L << (Call - 128)) | (1L << (CallStatic - 128)) | (1L << (Constructor - 128)) | (1L << (Destruct - 128)) | (1L << (Wakeup - 128)) | (1L << (Sleep - 128)) | (1L << (Autoload - 128)) | (1L << (IsSet__ - 128)) | (1L << (Unset__ - 128)) | (1L << (ToString__ - 128)) | (1L << (Invoke - 128)) | (1L << (SetState - 128)) | (1L << (Clone__ - 128)) | (1L << (DebugInfo - 128)) | (1L << (Namespace__ - 128)) | (1L << (Class__ - 128)) | (1L << (Traic__ - 128)) | (1L << (Function__ - 128)) | (1L << (Method__ - 128)) | (1L << (Line__ - 128)) | (1L << (File__ - 128)) | (1L << (Dir__ - 128)) | (1L << (Inc - 128)) | (1L << (Dec - 128)) | (1L << (NamespaceSeparator - 128)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (Bang - 195)) | (1L << (Plus - 195)) | (1L << (Minus - 195)) | (1L << (Tilde - 195)) | (1L << (SuppressWarnings - 195)) | (1L << (Dollar - 195)) | (1L << (OpenRoundBracket - 195)) | (1L << (OpenSquareBracket - 195)) | (1L << (OpenCurlyBracket - 195)) | (1L << (SemiColon - 195)) | (1L << (VarName - 195)) | (1L << (Label - 195)) | (1L << (Octal - 195)) | (1L << (Decimal - 195)) | (1L << (Real - 195)) | (1L << (Hex - 195)) | (1L << (Binary - 195)) | (1L << (BackQuoteString - 195)) | (1L << (SingleQuoteString - 195)) | (1L << (DoubleQuote - 195)) | (1L << (StartNowDoc - 195)) | (1L << (StartHereDoc - 195)))) != 0)) {
				{
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(265);
					inlineHtml();
					}
					break;
				case 2:
					{
					setState(266);
					phpBlock();
					}
					break;
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
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

	public static class InlineHtmlContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public ScriptTextContext scriptText() {
			return getRuleContext(ScriptTextContext.class,0);
		}
		public InlineHtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineHtml; }
	}

	public final InlineHtmlContext inlineHtml() throws RecognitionException {
		InlineHtmlContext _localctx = new InlineHtmlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inlineHtml);
		try {
			int _alt;
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case HtmlScriptClose:
			case StyleBody:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(274);
						htmlElement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(277); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ScriptText:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				scriptText();
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

	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode HtmlDtd() { return getToken(PhpParser.HtmlDtd, 0); }
		public TerminalNode HtmlClose() { return getToken(PhpParser.HtmlClose, 0); }
		public TerminalNode HtmlStyleOpen() { return getToken(PhpParser.HtmlStyleOpen, 0); }
		public TerminalNode HtmlOpen() { return getToken(PhpParser.HtmlOpen, 0); }
		public TerminalNode HtmlName() { return getToken(PhpParser.HtmlName, 0); }
		public TerminalNode HtmlSlashClose() { return getToken(PhpParser.HtmlSlashClose, 0); }
		public TerminalNode HtmlSlash() { return getToken(PhpParser.HtmlSlash, 0); }
		public TerminalNode HtmlText() { return getToken(PhpParser.HtmlText, 0); }
		public TerminalNode HtmlEquals() { return getToken(PhpParser.HtmlEquals, 0); }
		public TerminalNode HtmlStartQuoteString() { return getToken(PhpParser.HtmlStartQuoteString, 0); }
		public TerminalNode HtmlEndQuoteString() { return getToken(PhpParser.HtmlEndQuoteString, 0); }
		public TerminalNode HtmlStartDoubleQuoteString() { return getToken(PhpParser.HtmlStartDoubleQuoteString, 0); }
		public TerminalNode HtmlEndDoubleQuoteString() { return getToken(PhpParser.HtmlEndDoubleQuoteString, 0); }
		public TerminalNode HtmlHex() { return getToken(PhpParser.HtmlHex, 0); }
		public TerminalNode HtmlDecimal() { return getToken(PhpParser.HtmlDecimal, 0); }
		public TerminalNode HtmlQuoteString() { return getToken(PhpParser.HtmlQuoteString, 0); }
		public TerminalNode HtmlDoubleQuoteString() { return getToken(PhpParser.HtmlDoubleQuoteString, 0); }
		public TerminalNode StyleBody() { return getToken(PhpParser.StyleBody, 0); }
		public TerminalNode HtmlScriptOpen() { return getToken(PhpParser.HtmlScriptOpen, 0); }
		public TerminalNode HtmlScriptClose() { return getToken(PhpParser.HtmlScriptClose, 0); }
		public TerminalNode XmlStart() { return getToken(PhpParser.XmlStart, 0); }
		public TerminalNode XmlClose() { return getToken(PhpParser.XmlClose, 0); }
		public List<TerminalNode> XmlText() { return getTokens(PhpParser.XmlText); }
		public TerminalNode XmlText(int i) {
			return getToken(PhpParser.XmlText, i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlDtd:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(HtmlDtd);
				}
				break;
			case HtmlClose:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(HtmlClose);
				}
				break;
			case HtmlStyleOpen:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(HtmlStyleOpen);
				}
				break;
			case HtmlOpen:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(HtmlOpen);
				}
				break;
			case HtmlName:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(HtmlName);
				}
				break;
			case HtmlSlashClose:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				match(HtmlSlashClose);
				}
				break;
			case HtmlSlash:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				match(HtmlSlash);
				}
				break;
			case HtmlText:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				match(HtmlText);
				}
				break;
			case HtmlEquals:
				enterOuterAlt(_localctx, 9);
				{
				setState(290);
				match(HtmlEquals);
				}
				break;
			case HtmlStartQuoteString:
				enterOuterAlt(_localctx, 10);
				{
				setState(291);
				match(HtmlStartQuoteString);
				}
				break;
			case HtmlEndQuoteString:
				enterOuterAlt(_localctx, 11);
				{
				setState(292);
				match(HtmlEndQuoteString);
				}
				break;
			case HtmlStartDoubleQuoteString:
				enterOuterAlt(_localctx, 12);
				{
				setState(293);
				match(HtmlStartDoubleQuoteString);
				}
				break;
			case HtmlEndDoubleQuoteString:
				enterOuterAlt(_localctx, 13);
				{
				setState(294);
				match(HtmlEndDoubleQuoteString);
				}
				break;
			case HtmlHex:
				enterOuterAlt(_localctx, 14);
				{
				setState(295);
				match(HtmlHex);
				}
				break;
			case HtmlDecimal:
				enterOuterAlt(_localctx, 15);
				{
				setState(296);
				match(HtmlDecimal);
				}
				break;
			case HtmlQuoteString:
				enterOuterAlt(_localctx, 16);
				{
				setState(297);
				match(HtmlQuoteString);
				}
				break;
			case HtmlDoubleQuoteString:
				enterOuterAlt(_localctx, 17);
				{
				setState(298);
				match(HtmlDoubleQuoteString);
				}
				break;
			case StyleBody:
				enterOuterAlt(_localctx, 18);
				{
				setState(299);
				match(StyleBody);
				}
				break;
			case HtmlScriptOpen:
				enterOuterAlt(_localctx, 19);
				{
				setState(300);
				match(HtmlScriptOpen);
				}
				break;
			case HtmlScriptClose:
				enterOuterAlt(_localctx, 20);
				{
				setState(301);
				match(HtmlScriptClose);
				}
				break;
			case XmlStart:
				enterOuterAlt(_localctx, 21);
				{
				setState(302);
				match(XmlStart);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==XmlText) {
					{
					{
					setState(303);
					match(XmlText);
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(309);
				match(XmlClose);
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

	public static class ScriptTextContext extends ParserRuleContext {
		public List<TerminalNode> ScriptText() { return getTokens(PhpParser.ScriptText); }
		public TerminalNode ScriptText(int i) {
			return getToken(PhpParser.ScriptText, i);
		}
		public ScriptTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptText; }
	}

	public final ScriptTextContext scriptText() throws RecognitionException {
		ScriptTextContext _localctx = new ScriptTextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scriptText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(312);
					match(ScriptText);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(315); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class PhpBlockContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<TopStatementContext> topStatement() {
			return getRuleContexts(TopStatementContext.class);
		}
		public TopStatementContext topStatement(int i) {
			return getRuleContext(TopStatementContext.class,i);
		}
		public PhpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phpBlock; }
	}

	public final PhpBlockContext phpBlock() throws RecognitionException {
		PhpBlockContext _localctx = new PhpBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_phpBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(317);
					importStatement();
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(324); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(323);
					topStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(PhpParser.Import, 0); }
		public TerminalNode Namespace() { return getToken(PhpParser.Namespace, 0); }
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(Import);
			setState(329);
			match(Namespace);
			setState(330);
			namespaceNameList();
			setState(331);
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

	public static class TopStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GlobalConstantDeclarationContext globalConstantDeclaration() {
			return getRuleContext(GlobalConstantDeclarationContext.class,0);
		}
		public TopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStatement; }
	}

	public final TopStatementContext topStatement() throws RecognitionException {
		TopStatementContext _localctx = new TopStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_topStatement);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				namespaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				globalConstantDeclaration();
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

	public static class UseDeclarationContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(PhpParser.Use, 0); }
		public UseDeclarationContentListContext useDeclarationContentList() {
			return getRuleContext(UseDeclarationContentListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public TerminalNode Function_() { return getToken(PhpParser.Function_, 0); }
		public TerminalNode Const() { return getToken(PhpParser.Const, 0); }
		public UseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclaration; }
	}

	public final UseDeclarationContext useDeclaration() throws RecognitionException {
		UseDeclarationContext _localctx = new UseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_useDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(Use);
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(342);
				_la = _input.LA(1);
				if ( !(_la==Const || _la==Function_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(345);
			useDeclarationContentList();
			setState(346);
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

	public static class UseDeclarationContentListContext extends ParserRuleContext {
		public List<UseDeclarationContentContext> useDeclarationContent() {
			return getRuleContexts(UseDeclarationContentContext.class);
		}
		public UseDeclarationContentContext useDeclarationContent(int i) {
			return getRuleContext(UseDeclarationContentContext.class,i);
		}
		public List<TerminalNode> NamespaceSeparator() { return getTokens(PhpParser.NamespaceSeparator); }
		public TerminalNode NamespaceSeparator(int i) {
			return getToken(PhpParser.NamespaceSeparator, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public UseDeclarationContentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclarationContentList; }
	}

	public final UseDeclarationContentListContext useDeclarationContentList() throws RecognitionException {
		UseDeclarationContentListContext _localctx = new UseDeclarationContentListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_useDeclarationContentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(348);
				match(NamespaceSeparator);
				}
			}

			setState(351);
			useDeclarationContent();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(352);
				match(Comma);
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NamespaceSeparator) {
					{
					setState(353);
					match(NamespaceSeparator);
					}
				}

				setState(356);
				useDeclarationContent();
				}
				}
				setState(361);
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

	public static class UseDeclarationContentContext extends ParserRuleContext {
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public UseDeclarationContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclarationContent; }
	}

	public final UseDeclarationContentContext useDeclarationContent() throws RecognitionException {
		UseDeclarationContentContext _localctx = new UseDeclarationContentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_useDeclarationContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			namespaceNameList();
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

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(PhpParser.Namespace, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<NamespaceStatementContext> namespaceStatement() {
			return getRuleContexts(NamespaceStatementContext.class);
		}
		public NamespaceStatementContext namespaceStatement(int i) {
			return getRuleContext(NamespaceStatementContext.class,i);
		}
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_namespaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(Namespace);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==Label) {
					{
					setState(365);
					namespaceNameList();
					}
				}

				setState(368);
				match(OpenCurlyBracket);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << XmlStart) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptText) | (1L << HtmlScriptClose) | (1L << StyleBody) | (1L << AttributeStart) | (1L << Abstract) | (1L << Array) | (1L << As) | (1L << BinaryCast) | (1L << BoolType) | (1L << BooleanConstant) | (1L << Break) | (1L << Callable) | (1L << Case) | (1L << Catch) | (1L << Class) | (1L << Clone) | (1L << Const) | (1L << Continue) | (1L << Declare) | (1L << Default) | (1L << Do) | (1L << DoubleCast) | (1L << DoubleType) | (1L << Echo))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Else - 64)) | (1L << (ElseIf - 64)) | (1L << (Empty - 64)) | (1L << (EndDeclare - 64)) | (1L << (EndFor - 64)) | (1L << (EndForeach - 64)) | (1L << (EndIf - 64)) | (1L << (EndSwitch - 64)) | (1L << (EndWhile - 64)) | (1L << (Eval - 64)) | (1L << (Exit - 64)) | (1L << (Extends - 64)) | (1L << (Final - 64)) | (1L << (Finally - 64)) | (1L << (FloatCast - 64)) | (1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (Function_ - 64)) | (1L << (Global - 64)) | (1L << (Goto - 64)) | (1L << (If - 64)) | (1L << (Implements - 64)) | (1L << (Import - 64)) | (1L << (Include - 64)) | (1L << (IncludeOnce - 64)) | (1L << (InstanceOf - 64)) | (1L << (InsteadOf - 64)) | (1L << (Int8Cast - 64)) | (1L << (Int16Cast - 64)) | (1L << (Int64Type - 64)) | (1L << (IntType - 64)) | (1L << (Interface - 64)) | (1L << (IsSet - 64)) | (1L << (List - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalXor - 64)) | (1L << (Match - 64)) | (1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Null - 64)) | (1L << (ObjectType - 64)) | (1L << (Parent_ - 64)) | (1L << (Partial - 64)) | (1L << (Print - 64)) | (1L << (Private - 64)) | (1L << (Protected - 64)) | (1L << (Public - 64)) | (1L << (Require - 64)) | (1L << (RequireOnce - 64)) | (1L << (Resource - 64)) | (1L << (Return - 64)) | (1L << (Static - 64)) | (1L << (StringType - 64)) | (1L << (Switch - 64)) | (1L << (Throw - 64)) | (1L << (Trait - 64)) | (1L << (Try - 64)) | (1L << (Typeof - 64)) | (1L << (UintCast - 64)) | (1L << (UnicodeCast - 64)) | (1L << (Unset - 64)) | (1L << (Use - 64)) | (1L << (Var - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (While - 128)) | (1L << (Yield - 128)) | (1L << (From - 128)) | (1L << (LambdaFn - 128)) | (1L << (Get - 128)) | (1L << (Set - 128)) | (1L << (Call - 128)) | (1L << (CallStatic - 128)) | (1L << (Constructor - 128)) | (1L << (Destruct - 128)) | (1L << (Wakeup - 128)) | (1L << (Sleep - 128)) | (1L << (Autoload - 128)) | (1L << (IsSet__ - 128)) | (1L << (Unset__ - 128)) | (1L << (ToString__ - 128)) | (1L << (Invoke - 128)) | (1L << (SetState - 128)) | (1L << (Clone__ - 128)) | (1L << (DebugInfo - 128)) | (1L << (Namespace__ - 128)) | (1L << (Class__ - 128)) | (1L << (Traic__ - 128)) | (1L << (Function__ - 128)) | (1L << (Method__ - 128)) | (1L << (Line__ - 128)) | (1L << (File__ - 128)) | (1L << (Dir__ - 128)) | (1L << (Inc - 128)) | (1L << (Dec - 128)) | (1L << (NamespaceSeparator - 128)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (Bang - 195)) | (1L << (Plus - 195)) | (1L << (Minus - 195)) | (1L << (Tilde - 195)) | (1L << (SuppressWarnings - 195)) | (1L << (Dollar - 195)) | (1L << (OpenRoundBracket - 195)) | (1L << (OpenSquareBracket - 195)) | (1L << (OpenCurlyBracket - 195)) | (1L << (SemiColon - 195)) | (1L << (VarName - 195)) | (1L << (Label - 195)) | (1L << (Octal - 195)) | (1L << (Decimal - 195)) | (1L << (Real - 195)) | (1L << (Hex - 195)) | (1L << (Binary - 195)) | (1L << (BackQuoteString - 195)) | (1L << (SingleQuoteString - 195)) | (1L << (DoubleQuote - 195)) | (1L << (StartNowDoc - 195)) | (1L << (StartHereDoc - 195)))) != 0)) {
					{
					{
					setState(369);
					namespaceStatement();
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(375);
				match(CloseCurlyBracket);
				}
				break;
			case 2:
				{
				setState(376);
				namespaceNameList();
				setState(377);
				match(SemiColon);
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

	public static class NamespaceStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GlobalConstantDeclarationContext globalConstantDeclaration() {
			return getRuleContext(GlobalConstantDeclarationContext.class,0);
		}
		public NamespaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceStatement; }
	}

	public final NamespaceStatementContext namespaceStatement() throws RecognitionException {
		NamespaceStatementContext _localctx = new NamespaceStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_namespaceStatement);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				globalConstantDeclaration();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(PhpParser.Function_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(PhpParser.QuestionMark, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(388);
				attributes();
				}
			}

			setState(391);
			match(Function_);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(392);
				match(Ampersand);
				}
			}

			setState(395);
			identifier();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(396);
				typeParameterListInBrackets();
				}
			}

			setState(399);
			match(OpenRoundBracket);
			setState(400);
			formalParameterList();
			setState(401);
			match(CloseRoundBracket);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(402);
				match(Colon);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(403);
					match(QuestionMark);
					}
				}

				setState(406);
				typeHint(0);
				}
			}

			setState(409);
			blockStatement();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public ClassEntryTypeContext classEntryType() {
			return getRuleContext(ClassEntryTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Interface() { return getToken(PhpParser.Interface, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Private() { return getToken(PhpParser.Private, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode Partial() { return getToken(PhpParser.Partial, 0); }
		public List<ClassStatementContext> classStatement() {
			return getRuleContexts(ClassStatementContext.class);
		}
		public ClassStatementContext classStatement(int i) {
			return getRuleContext(ClassStatementContext.class,i);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Extends() { return getToken(PhpParser.Extends, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Implements() { return getToken(PhpParser.Implements, 0); }
		public InterfaceListContext interfaceList() {
			return getRuleContext(InterfaceListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(411);
				attributes();
				}
			}

			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(414);
				match(Private);
				}
			}

			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(417);
				modifier();
				}
			}

			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(420);
				match(Partial);
				}
			}

			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(423);
				classEntryType();
				setState(424);
				identifier();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(425);
					typeParameterListInBrackets();
					}
				}

				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(428);
					match(Extends);
					setState(429);
					qualifiedStaticTypeRef();
					}
				}

				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(432);
					match(Implements);
					setState(433);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(436);
				match(Interface);
				setState(437);
				identifier();
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(438);
					typeParameterListInBrackets();
					}
				}

				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(441);
					match(Extends);
					setState(442);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(447);
			match(OpenCurlyBracket);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AttributeStart) | (1L << Abstract) | (1L << Const))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Function_ - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)) | (1L << (Use - 76)) | (1L << (Var - 76)))) != 0)) {
				{
				{
				setState(448);
				classStatement();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(CloseCurlyBracket);
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

	public static class ClassEntryTypeContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(PhpParser.Class, 0); }
		public TerminalNode Trait() { return getToken(PhpParser.Trait, 0); }
		public ClassEntryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classEntryType; }
	}

	public final ClassEntryTypeContext classEntryType() throws RecognitionException {
		ClassEntryTypeContext _localctx = new ClassEntryTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classEntryType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !(_la==Class || _la==Trait) ) {
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

	public static class InterfaceListContext extends ParserRuleContext {
		public List<QualifiedStaticTypeRefContext> qualifiedStaticTypeRef() {
			return getRuleContexts(QualifiedStaticTypeRefContext.class);
		}
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef(int i) {
			return getRuleContext(QualifiedStaticTypeRefContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public InterfaceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceList; }
	}

	public final InterfaceListContext interfaceList() throws RecognitionException {
		InterfaceListContext _localctx = new InterfaceListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			qualifiedStaticTypeRef();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(459);
				match(Comma);
				setState(460);
				qualifiedStaticTypeRef();
				}
				}
				setState(465);
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

	public static class TypeParameterListInBracketsContext extends ParserRuleContext {
		public TerminalNode Lgeneric() { return getToken(PhpParser.Lgeneric, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode Rgeneric() { return getToken(PhpParser.Rgeneric, 0); }
		public TypeParameterWithDefaultsListContext typeParameterWithDefaultsList() {
			return getRuleContext(TypeParameterWithDefaultsListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PhpParser.Comma, 0); }
		public TypeParameterListInBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterListInBrackets; }
	}

	public final TypeParameterListInBracketsContext typeParameterListInBrackets() throws RecognitionException {
		TypeParameterListInBracketsContext _localctx = new TypeParameterListInBracketsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeParameterListInBrackets);
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(Lgeneric);
				setState(467);
				typeParameterList();
				setState(468);
				match(Rgeneric);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(Lgeneric);
				setState(471);
				typeParameterWithDefaultsList();
				setState(472);
				match(Rgeneric);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(Lgeneric);
				setState(475);
				typeParameterList();
				setState(476);
				match(Comma);
				setState(477);
				typeParameterWithDefaultsList();
				setState(478);
				match(Rgeneric);
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

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterDeclContext> typeParameterDecl() {
			return getRuleContexts(TypeParameterDeclContext.class);
		}
		public TypeParameterDeclContext typeParameterDecl(int i) {
			return getRuleContext(TypeParameterDeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			typeParameterDecl();
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					match(Comma);
					setState(484);
					typeParameterDecl();
					}
					} 
				}
				setState(489);
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

	public static class TypeParameterWithDefaultsListContext extends ParserRuleContext {
		public List<TypeParameterWithDefaultDeclContext> typeParameterWithDefaultDecl() {
			return getRuleContexts(TypeParameterWithDefaultDeclContext.class);
		}
		public TypeParameterWithDefaultDeclContext typeParameterWithDefaultDecl(int i) {
			return getRuleContext(TypeParameterWithDefaultDeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public TypeParameterWithDefaultsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterWithDefaultsList; }
	}

	public final TypeParameterWithDefaultsListContext typeParameterWithDefaultsList() throws RecognitionException {
		TypeParameterWithDefaultsListContext _localctx = new TypeParameterWithDefaultsListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterWithDefaultsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			typeParameterWithDefaultDecl();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(491);
				match(Comma);
				setState(492);
				typeParameterWithDefaultDecl();
				}
				}
				setState(497);
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

	public static class TypeParameterDeclContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterDecl; }
	}

	public final TypeParameterDeclContext typeParameterDecl() throws RecognitionException {
		TypeParameterDeclContext _localctx = new TypeParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeParameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(498);
				attributes();
				}
			}

			setState(501);
			identifier();
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

	public static class TypeParameterWithDefaultDeclContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeParameterWithDefaultDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterWithDefaultDecl; }
	}

	public final TypeParameterWithDefaultDeclContext typeParameterWithDefaultDecl() throws RecognitionException {
		TypeParameterWithDefaultDeclContext _localctx = new TypeParameterWithDefaultDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeParameterWithDefaultDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(503);
				attributes();
				}
			}

			setState(506);
			identifier();
			setState(507);
			match(Eq);
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(508);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(509);
				primitiveType();
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

	public static class GenericDynamicArgsContext extends ParserRuleContext {
		public TerminalNode Lgeneric() { return getToken(PhpParser.Lgeneric, 0); }
		public List<TypeRefContext> typeRef() {
			return getRuleContexts(TypeRefContext.class);
		}
		public TypeRefContext typeRef(int i) {
			return getRuleContext(TypeRefContext.class,i);
		}
		public TerminalNode Rgeneric() { return getToken(PhpParser.Rgeneric, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public GenericDynamicArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDynamicArgs; }
	}

	public final GenericDynamicArgsContext genericDynamicArgs() throws RecognitionException {
		GenericDynamicArgsContext _localctx = new GenericDynamicArgsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_genericDynamicArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(Lgeneric);
			setState(513);
			typeRef();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(514);
				match(Comma);
				setState(515);
				typeRef();
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			match(Rgeneric);
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

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeGroupContext> attributeGroup() {
			return getRuleContexts(AttributeGroupContext.class);
		}
		public AttributeGroupContext attributeGroup(int i) {
			return getRuleContext(AttributeGroupContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(523);
				attributeGroup();
				}
				}
				setState(526); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AttributeStart );
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

	public static class AttributeGroupContext extends ParserRuleContext {
		public TerminalNode AttributeStart() { return getToken(PhpParser.AttributeStart, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode CloseSquareBracket() { return getToken(PhpParser.CloseSquareBracket, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public AttributeGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeGroup; }
	}

	public final AttributeGroupContext attributeGroup() throws RecognitionException {
		AttributeGroupContext _localctx = new AttributeGroupContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attributeGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(AttributeStart);
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(529);
				identifier();
				setState(530);
				match(Colon);
				}
				break;
			}
			setState(534);
			attribute();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(535);
				match(Comma);
				setState(536);
				attribute();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(542);
			match(CloseSquareBracket);
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

	public static class AttributeContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			qualifiedNamespaceName();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(545);
				arguments();
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

	public static class InnerStatementListContext extends ParserRuleContext {
		public List<InnerStatementContext> innerStatement() {
			return getRuleContexts(InnerStatementContext.class);
		}
		public InnerStatementContext innerStatement(int i) {
			return getRuleContext(InnerStatementContext.class,i);
		}
		public InnerStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatementList; }
	}

	public final InnerStatementListContext innerStatementList() throws RecognitionException {
		InnerStatementListContext _localctx = new InnerStatementListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_innerStatementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(548);
					innerStatement();
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class InnerStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InnerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatement; }
	}

	public final InnerStatementContext innerStatement() throws RecognitionException {
		InnerStatementContext _localctx = new InnerStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_innerStatement);
		try {
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				classDeclaration();
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public StaticVariableStatementContext staticVariableStatement() {
			return getRuleContext(StaticVariableStatementContext.class,0);
		}
		public EchoStatementContext echoStatement() {
			return getRuleContext(EchoStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public UnsetStatementContext unsetStatement() {
			return getRuleContext(UnsetStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public TryCatchFinallyContext tryCatchFinally() {
			return getRuleContext(TryCatchFinallyContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public DeclareStatementContext declareStatement() {
			return getRuleContext(DeclareStatementContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public InlineHtmlStatementContext inlineHtmlStatement() {
			return getRuleContext(InlineHtmlStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				identifier();
				setState(560);
				match(Colon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(564);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(565);
				doWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(566);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(567);
				switchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(568);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(569);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(570);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(571);
				yieldExpression();
				setState(572);
				match(SemiColon);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(574);
				globalStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(575);
				staticVariableStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(576);
				echoStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(577);
				expressionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(578);
				unsetStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(579);
				foreachStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(580);
				tryCatchFinally();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(581);
				throwStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(582);
				gotoStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(583);
				declareStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(584);
				emptyStatement_();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(585);
				inlineHtmlStatement();
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

	public static class EmptyStatement_Context extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(OpenCurlyBracket);
			setState(591);
			innerStatementList();
			setState(592);
			match(CloseCurlyBracket);
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
		public TerminalNode If() { return getToken(PhpParser.If, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndIf() { return getToken(PhpParser.EndIf, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<ElseIfColonStatementContext> elseIfColonStatement() {
			return getRuleContexts(ElseIfColonStatementContext.class);
		}
		public ElseIfColonStatementContext elseIfColonStatement(int i) {
			return getRuleContext(ElseIfColonStatementContext.class,i);
		}
		public ElseColonStatementContext elseColonStatement() {
			return getRuleContext(ElseColonStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				match(If);
				setState(595);
				parentheses();
				setState(596);
				statement();
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(597);
						elseIfStatement();
						}
						} 
					}
					setState(602);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(604);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(603);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				match(If);
				setState(607);
				parentheses();
				setState(608);
				match(Colon);
				setState(609);
				innerStatementList();
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIf) {
					{
					{
					setState(610);
					elseIfColonStatement();
					}
					}
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(616);
					elseColonStatement();
					}
				}

				setState(619);
				match(EndIf);
				setState(620);
				match(SemiColon);
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

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(PhpParser.ElseIf, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(ElseIf);
			setState(625);
			parentheses();
			setState(626);
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

	public static class ElseIfColonStatementContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(PhpParser.ElseIf, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public ElseIfColonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfColonStatement; }
	}

	public final ElseIfColonStatementContext elseIfColonStatement() throws RecognitionException {
		ElseIfColonStatementContext _localctx = new ElseIfColonStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_elseIfColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(ElseIf);
			setState(629);
			parentheses();
			setState(630);
			match(Colon);
			setState(631);
			innerStatementList();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(PhpParser.Else, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(Else);
			setState(634);
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

	public static class ElseColonStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(PhpParser.Else, 0); }
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public ElseColonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseColonStatement; }
	}

	public final ElseColonStatementContext elseColonStatement() throws RecognitionException {
		ElseColonStatementContext _localctx = new ElseColonStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elseColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(Else);
			setState(637);
			match(Colon);
			setState(638);
			innerStatementList();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(PhpParser.While, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndWhile() { return getToken(PhpParser.EndWhile, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(While);
			setState(641);
			parentheses();
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case HtmlScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(642);
				statement();
				}
				break;
			case Colon:
				{
				setState(643);
				match(Colon);
				setState(644);
				innerStatementList();
				setState(645);
				match(EndWhile);
				setState(646);
				match(SemiColon);
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(PhpParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(PhpParser.While, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(Do);
			setState(651);
			statement();
			setState(652);
			match(While);
			setState(653);
			parentheses();
			setState(654);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(PhpParser.For, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(PhpParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(PhpParser.SemiColon, i);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndFor() { return getToken(PhpParser.EndFor, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(For);
			setState(657);
			match(OpenRoundBracket);
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(658);
				forInit();
				}
			}

			setState(661);
			match(SemiColon);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(662);
				expressionList();
				}
			}

			setState(665);
			match(SemiColon);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(666);
				forUpdate();
				}
			}

			setState(669);
			match(CloseRoundBracket);
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case HtmlScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(670);
				statement();
				}
				break;
			case Colon:
				{
				setState(671);
				match(Colon);
				setState(672);
				innerStatementList();
				setState(673);
				match(EndFor);
				setState(674);
				match(SemiColon);
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

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(PhpParser.Switch, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public TerminalNode EndSwitch() { return getToken(PhpParser.EndSwitch, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(PhpParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(PhpParser.SemiColon, i);
		}
		public List<SwitchBlockContext> switchBlock() {
			return getRuleContexts(SwitchBlockContext.class);
		}
		public SwitchBlockContext switchBlock(int i) {
			return getRuleContext(SwitchBlockContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(Switch);
			setState(683);
			parentheses();
			setState(707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenCurlyBracket:
				{
				setState(684);
				match(OpenCurlyBracket);
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(685);
					match(SemiColon);
					}
				}

				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(688);
					switchBlock();
					}
					}
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(694);
				match(CloseCurlyBracket);
				}
				break;
			case Colon:
				{
				setState(695);
				match(Colon);
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(696);
					match(SemiColon);
					}
				}

				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(699);
					switchBlock();
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(705);
				match(EndSwitch);
				setState(706);
				match(SemiColon);
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public List<TerminalNode> Colon() { return getTokens(PhpParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(PhpParser.Colon, i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(PhpParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(PhpParser.SemiColon, i);
		}
		public List<TerminalNode> Case() { return getTokens(PhpParser.Case); }
		public TerminalNode Case(int i) {
			return getToken(PhpParser.Case, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Default() { return getTokens(PhpParser.Default); }
		public TerminalNode Default(int i) {
			return getToken(PhpParser.Default, i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(715); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(712);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Case:
						{
						setState(709);
						match(Case);
						setState(710);
						expression(0);
						}
						break;
					case Default:
						{
						setState(711);
						match(Default);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(714);
					_la = _input.LA(1);
					if ( !(_la==Colon || _la==SemiColon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(717); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(719);
			innerStatementList();
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
		public TerminalNode Break() { return getToken(PhpParser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(Break);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(722);
				expression(0);
				}
			}

			setState(725);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(PhpParser.Continue, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(Continue);
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(728);
				expression(0);
				}
			}

			setState(731);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(PhpParser.Return, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(Return);
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(734);
				expression(0);
				}
			}

			setState(737);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			expression(0);
			setState(740);
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

	public static class UnsetStatementContext extends ParserRuleContext {
		public TerminalNode Unset() { return getToken(PhpParser.Unset, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public ChainListContext chainList() {
			return getRuleContext(ChainListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public UnsetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsetStatement; }
	}

	public final UnsetStatementContext unsetStatement() throws RecognitionException {
		UnsetStatementContext _localctx = new UnsetStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unsetStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(Unset);
			setState(743);
			match(OpenRoundBracket);
			setState(744);
			chainList();
			setState(745);
			match(CloseRoundBracket);
			setState(746);
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

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode Foreach() { return getToken(PhpParser.Foreach, 0); }
		public List<TerminalNode> OpenRoundBracket() { return getTokens(PhpParser.OpenRoundBracket); }
		public TerminalNode OpenRoundBracket(int i) {
			return getToken(PhpParser.OpenRoundBracket, i);
		}
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public TerminalNode As() { return getToken(PhpParser.As, 0); }
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public List<TerminalNode> CloseRoundBracket() { return getTokens(PhpParser.CloseRoundBracket); }
		public TerminalNode CloseRoundBracket(int i) {
			return getToken(PhpParser.CloseRoundBracket, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode List() { return getToken(PhpParser.List, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndForeach() { return getToken(PhpParser.EndForeach, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<TerminalNode> Ampersand() { return getTokens(PhpParser.Ampersand); }
		public TerminalNode Ampersand(int i) {
			return getToken(PhpParser.Ampersand, i);
		}
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(Foreach);
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(749);
				match(OpenRoundBracket);
				setState(750);
				chain();
				setState(751);
				match(As);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(752);
					match(Ampersand);
					}
				}

				setState(755);
				assignable();
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(756);
					match(DoubleArrow);
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(757);
						match(Ampersand);
						}
					}

					setState(760);
					chain();
					}
				}

				setState(763);
				match(CloseRoundBracket);
				}
				break;
			case 2:
				{
				setState(765);
				match(OpenRoundBracket);
				setState(766);
				expression(0);
				setState(767);
				match(As);
				setState(768);
				assignable();
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(769);
					match(DoubleArrow);
					setState(771);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(770);
						match(Ampersand);
						}
					}

					setState(773);
					chain();
					}
				}

				setState(776);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				{
				setState(778);
				match(OpenRoundBracket);
				setState(779);
				chain();
				setState(780);
				match(As);
				setState(781);
				match(List);
				setState(782);
				match(OpenRoundBracket);
				setState(783);
				assignmentList();
				setState(784);
				match(CloseRoundBracket);
				setState(785);
				match(CloseRoundBracket);
				}
				break;
			}
			setState(795);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case HtmlScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(789);
				statement();
				}
				break;
			case Colon:
				{
				setState(790);
				match(Colon);
				setState(791);
				innerStatementList();
				setState(792);
				match(EndForeach);
				setState(793);
				match(SemiColon);
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

	public static class TryCatchFinallyContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(PhpParser.Try, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FinallyStatementContext finallyStatement() {
			return getRuleContext(FinallyStatementContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryCatchFinallyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchFinally; }
	}

	public final TryCatchFinallyContext tryCatchFinally() throws RecognitionException {
		TryCatchFinallyContext _localctx = new TryCatchFinallyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(Try);
			setState(798);
			blockStatement();
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(800); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(799);
						catchClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(802); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(805);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(804);
					finallyStatement();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Catch) {
					{
					{
					setState(807);
					catchClause();
					}
					}
					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(813);
				finallyStatement();
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

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(PhpParser.Catch, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public List<QualifiedStaticTypeRefContext> qualifiedStaticTypeRef() {
			return getRuleContexts(QualifiedStaticTypeRefContext.class);
		}
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef(int i) {
			return getRuleContext(QualifiedStaticTypeRefContext.class,i);
		}
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public List<TerminalNode> Pipe() { return getTokens(PhpParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(PhpParser.Pipe, i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(Catch);
			setState(817);
			match(OpenRoundBracket);
			setState(818);
			qualifiedStaticTypeRef();
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(819);
				match(Pipe);
				setState(820);
				qualifiedStaticTypeRef();
				}
				}
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(826);
			match(VarName);
			setState(827);
			match(CloseRoundBracket);
			setState(828);
			blockStatement();
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

	public static class FinallyStatementContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(PhpParser.Finally, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FinallyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyStatement; }
	}

	public final FinallyStatementContext finallyStatement() throws RecognitionException {
		FinallyStatementContext _localctx = new FinallyStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(Finally);
			setState(831);
			blockStatement();
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
		public TerminalNode Throw() { return getToken(PhpParser.Throw, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(Throw);
			setState(834);
			expression(0);
			setState(835);
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

	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode Goto() { return getToken(PhpParser.Goto, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(Goto);
			setState(838);
			identifier();
			setState(839);
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

	public static class DeclareStatementContext extends ParserRuleContext {
		public TerminalNode Declare() { return getToken(PhpParser.Declare, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public DeclareListContext declareList() {
			return getRuleContext(DeclareListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndDeclare() { return getToken(PhpParser.EndDeclare, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public DeclareStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStatement; }
	}

	public final DeclareStatementContext declareStatement() throws RecognitionException {
		DeclareStatementContext _localctx = new DeclareStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_declareStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(Declare);
			setState(842);
			match(OpenRoundBracket);
			setState(843);
			declareList();
			setState(844);
			match(CloseRoundBracket);
			setState(851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case HtmlScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(845);
				statement();
				}
				break;
			case Colon:
				{
				setState(846);
				match(Colon);
				setState(847);
				innerStatementList();
				setState(848);
				match(EndDeclare);
				setState(849);
				match(SemiColon);
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

	public static class InlineHtmlStatementContext extends ParserRuleContext {
		public List<InlineHtmlContext> inlineHtml() {
			return getRuleContexts(InlineHtmlContext.class);
		}
		public InlineHtmlContext inlineHtml(int i) {
			return getRuleContext(InlineHtmlContext.class,i);
		}
		public InlineHtmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineHtmlStatement; }
	}

	public final InlineHtmlStatementContext inlineHtmlStatement() throws RecognitionException {
		InlineHtmlStatementContext _localctx = new InlineHtmlStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_inlineHtmlStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(854); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(853);
					inlineHtml();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(856); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	public static class DeclareListContext extends ParserRuleContext {
		public List<IdentifierInitializerContext> identifierInitializer() {
			return getRuleContexts(IdentifierInitializerContext.class);
		}
		public IdentifierInitializerContext identifierInitializer(int i) {
			return getRuleContext(IdentifierInitializerContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public DeclareListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareList; }
	}

	public final DeclareListContext declareList() throws RecognitionException {
		DeclareListContext _localctx = new DeclareListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_declareList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			identifierInitializer();
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(859);
				match(Comma);
				setState(860);
				identifierInitializer();
				}
				}
				setState(865);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (AttributeStart - 43)) | (1L << (Abstract - 43)) | (1L << (Array - 43)) | (1L << (As - 43)) | (1L << (BinaryCast - 43)) | (1L << (BoolType - 43)) | (1L << (BooleanConstant - 43)) | (1L << (Break - 43)) | (1L << (Callable - 43)) | (1L << (Case - 43)) | (1L << (Catch - 43)) | (1L << (Class - 43)) | (1L << (Clone - 43)) | (1L << (Const - 43)) | (1L << (Continue - 43)) | (1L << (Declare - 43)) | (1L << (Default - 43)) | (1L << (Do - 43)) | (1L << (DoubleCast - 43)) | (1L << (DoubleType - 43)) | (1L << (Echo - 43)) | (1L << (Else - 43)) | (1L << (ElseIf - 43)) | (1L << (Empty - 43)) | (1L << (EndDeclare - 43)) | (1L << (EndFor - 43)) | (1L << (EndForeach - 43)) | (1L << (EndIf - 43)) | (1L << (EndSwitch - 43)) | (1L << (EndWhile - 43)) | (1L << (Eval - 43)) | (1L << (Exit - 43)) | (1L << (Extends - 43)) | (1L << (Final - 43)) | (1L << (Finally - 43)) | (1L << (FloatCast - 43)) | (1L << (For - 43)) | (1L << (Foreach - 43)) | (1L << (Function_ - 43)) | (1L << (Global - 43)) | (1L << (Goto - 43)) | (1L << (If - 43)) | (1L << (Implements - 43)) | (1L << (Import - 43)) | (1L << (Include - 43)) | (1L << (IncludeOnce - 43)) | (1L << (InstanceOf - 43)) | (1L << (InsteadOf - 43)) | (1L << (Int8Cast - 43)) | (1L << (Int16Cast - 43)) | (1L << (Int64Type - 43)) | (1L << (IntType - 43)) | (1L << (Interface - 43)) | (1L << (IsSet - 43)) | (1L << (List - 43)) | (1L << (LogicalAnd - 43)) | (1L << (LogicalOr - 43)) | (1L << (LogicalXor - 43)) | (1L << (Namespace - 43)) | (1L << (New - 43)) | (1L << (Null - 43)) | (1L << (ObjectType - 43)) | (1L << (Parent_ - 43)))) != 0) || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (Partial - 107)) | (1L << (Print - 107)) | (1L << (Private - 107)) | (1L << (Protected - 107)) | (1L << (Public - 107)) | (1L << (Require - 107)) | (1L << (RequireOnce - 107)) | (1L << (Resource - 107)) | (1L << (Return - 107)) | (1L << (Static - 107)) | (1L << (StringType - 107)) | (1L << (Switch - 107)) | (1L << (Throw - 107)) | (1L << (Trait - 107)) | (1L << (Try - 107)) | (1L << (Typeof - 107)) | (1L << (UintCast - 107)) | (1L << (UnicodeCast - 107)) | (1L << (Unset - 107)) | (1L << (Use - 107)) | (1L << (Var - 107)) | (1L << (While - 107)) | (1L << (Yield - 107)) | (1L << (From - 107)) | (1L << (Get - 107)) | (1L << (Set - 107)) | (1L << (Call - 107)) | (1L << (CallStatic - 107)) | (1L << (Constructor - 107)) | (1L << (Destruct - 107)) | (1L << (Wakeup - 107)) | (1L << (Sleep - 107)) | (1L << (Autoload - 107)) | (1L << (IsSet__ - 107)) | (1L << (Unset__ - 107)) | (1L << (ToString__ - 107)) | (1L << (Invoke - 107)) | (1L << (SetState - 107)) | (1L << (Clone__ - 107)) | (1L << (DebugInfo - 107)) | (1L << (Namespace__ - 107)) | (1L << (Class__ - 107)) | (1L << (Traic__ - 107)) | (1L << (Function__ - 107)) | (1L << (Method__ - 107)) | (1L << (Line__ - 107)) | (1L << (File__ - 107)) | (1L << (Dir__ - 107)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ellipsis - 189)) | (1L << (Ampersand - 189)) | (1L << (QuestionMark - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)))) != 0)) {
				{
				setState(866);
				formalParameter();
				}
			}

			setState(873);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(869);
					match(Comma);
					setState(870);
					formalParameter();
					}
					} 
				}
				setState(875);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(876);
				match(Comma);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public MemberModifierContext memberModifier() {
			return getRuleContext(MemberModifierContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(PhpParser.QuestionMark, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public TerminalNode Ellipsis() { return getToken(PhpParser.Ellipsis, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(879);
				attributes();
				}
			}

			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(882);
				memberModifier();
				}
				break;
			}
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(885);
				match(QuestionMark);
				}
			}

			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==NamespaceSeparator || _la==Label) {
				{
				setState(888);
				typeHint(0);
				}
			}

			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(891);
				match(Ampersand);
				}
			}

			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(894);
				match(Ellipsis);
				}
			}

			setState(897);
			variableInitializer();
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

	public static class TypeHintContext extends ParserRuleContext {
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Callable() { return getToken(PhpParser.Callable, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TypeHintContext> typeHint() {
			return getRuleContexts(TypeHintContext.class);
		}
		public TypeHintContext typeHint(int i) {
			return getRuleContext(TypeHintContext.class,i);
		}
		public TerminalNode Pipe() { return getToken(PhpParser.Pipe, 0); }
		public TypeHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeHint; }
	}

	public final TypeHintContext typeHint() throws RecognitionException {
		return typeHint(0);
	}

	private TypeHintContext typeHint(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeHintContext _localctx = new TypeHintContext(_ctx, _parentState);
		TypeHintContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_typeHint, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(900);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(901);
				match(Callable);
				}
				break;
			case 3:
				{
				setState(902);
				primitiveType();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(910);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeHintContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeHint);
					setState(905);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(906);
					match(Pipe);
					setState(907);
					typeHint(2);
					}
					} 
				}
				setState(912);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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

	public static class GlobalStatementContext extends ParserRuleContext {
		public TerminalNode Global() { return getToken(PhpParser.Global, 0); }
		public List<GlobalVarContext> globalVar() {
			return getRuleContexts(GlobalVarContext.class);
		}
		public GlobalVarContext globalVar(int i) {
			return getRuleContext(GlobalVarContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_globalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(Global);
			setState(914);
			globalVar();
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(915);
				match(Comma);
				setState(916);
				globalVar();
				}
				}
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(922);
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

	public static class GlobalVarContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public TerminalNode Dollar() { return getToken(PhpParser.Dollar, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public GlobalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVar; }
	}

	public final GlobalVarContext globalVar() throws RecognitionException {
		GlobalVarContext _localctx = new GlobalVarContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_globalVar);
		try {
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				match(VarName);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				match(Dollar);
				setState(926);
				chain();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(927);
				match(Dollar);
				setState(928);
				match(OpenCurlyBracket);
				setState(929);
				expression(0);
				setState(930);
				match(CloseCurlyBracket);
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

	public static class EchoStatementContext extends ParserRuleContext {
		public TerminalNode Echo() { return getToken(PhpParser.Echo, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public EchoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echoStatement; }
	}

	public final EchoStatementContext echoStatement() throws RecognitionException {
		EchoStatementContext _localctx = new EchoStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_echoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(Echo);
			setState(935);
			expressionList();
			setState(936);
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

	public static class StaticVariableStatementContext extends ParserRuleContext {
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public StaticVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticVariableStatement; }
	}

	public final StaticVariableStatementContext staticVariableStatement() throws RecognitionException {
		StaticVariableStatementContext _localctx = new StaticVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_staticVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			match(Static);
			setState(939);
			variableInitializer();
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(940);
				match(Comma);
				setState(941);
				variableInitializer();
				}
				}
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(947);
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

	public static class ClassStatementContext extends ParserRuleContext {
		public PropertyModifiersContext propertyModifiers() {
			return getRuleContext(PropertyModifiersContext.class,0);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Const() { return getToken(PhpParser.Const, 0); }
		public List<IdentifierInitializerContext> identifierInitializer() {
			return getRuleContexts(IdentifierInitializerContext.class);
		}
		public IdentifierInitializerContext identifierInitializer(int i) {
			return getRuleContext(IdentifierInitializerContext.class,i);
		}
		public TerminalNode Function_() { return getToken(PhpParser.Function_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public BaseCtorCallContext baseCtorCall() {
			return getRuleContext(BaseCtorCallContext.class,0);
		}
		public TerminalNode Use() { return getToken(PhpParser.Use, 0); }
		public QualifiedNamespaceNameListContext qualifiedNamespaceNameList() {
			return getRuleContext(QualifiedNamespaceNameListContext.class,0);
		}
		public TraitAdaptationsContext traitAdaptations() {
			return getRuleContext(TraitAdaptationsContext.class,0);
		}
		public ClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatement; }
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_classStatement);
		int _la;
		try {
			setState(1007);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AttributeStart:
			case Abstract:
			case Const:
			case Final:
			case Function_:
			case Private:
			case Protected:
			case Public:
			case Static:
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(949);
					attributes();
					}
				}

				setState(1001);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(952);
					propertyModifiers();
					setState(954);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==NamespaceSeparator || _la==Label) {
						{
						setState(953);
						typeHint(0);
						}
					}

					setState(956);
					variableInitializer();
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(957);
						match(Comma);
						setState(958);
						variableInitializer();
						}
						}
						setState(963);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(964);
					match(SemiColon);
					}
					break;
				case 2:
					{
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Abstract || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)))) != 0)) {
						{
						setState(966);
						memberModifiers();
						}
					}

					setState(999);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Const:
						{
						setState(969);
						match(Const);
						setState(971);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
						case 1:
							{
							setState(970);
							typeHint(0);
							}
							break;
						}
						setState(973);
						identifierInitializer();
						setState(978);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(974);
							match(Comma);
							setState(975);
							identifierInitializer();
							}
							}
							setState(980);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(981);
						match(SemiColon);
						}
						break;
					case Function_:
						{
						setState(983);
						match(Function_);
						setState(985);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Ampersand) {
							{
							setState(984);
							match(Ampersand);
							}
						}

						setState(987);
						identifier();
						setState(989);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Lgeneric) {
							{
							setState(988);
							typeParameterListInBrackets();
							}
						}

						setState(991);
						match(OpenRoundBracket);
						setState(992);
						formalParameterList();
						setState(993);
						match(CloseRoundBracket);
						setState(995);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Colon) {
							{
							setState(994);
							baseCtorCall();
							}
						}

						setState(997);
						methodBody();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				match(Use);
				setState(1004);
				qualifiedNamespaceNameList();
				setState(1005);
				traitAdaptations();
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

	public static class TraitAdaptationsContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<TraitAdaptationStatementContext> traitAdaptationStatement() {
			return getRuleContexts(TraitAdaptationStatementContext.class);
		}
		public TraitAdaptationStatementContext traitAdaptationStatement(int i) {
			return getRuleContext(TraitAdaptationStatementContext.class,i);
		}
		public TraitAdaptationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAdaptations; }
	}

	public final TraitAdaptationsContext traitAdaptations() throws RecognitionException {
		TraitAdaptationsContext _localctx = new TraitAdaptationsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_traitAdaptations);
		int _la;
		try {
			setState(1018);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1010);
				match(OpenCurlyBracket);
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==NamespaceSeparator || _la==Label) {
					{
					{
					setState(1011);
					traitAdaptationStatement();
					}
					}
					setState(1016);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1017);
				match(CloseCurlyBracket);
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

	public static class TraitAdaptationStatementContext extends ParserRuleContext {
		public TraitPrecedenceContext traitPrecedence() {
			return getRuleContext(TraitPrecedenceContext.class,0);
		}
		public TraitAliasContext traitAlias() {
			return getRuleContext(TraitAliasContext.class,0);
		}
		public TraitAdaptationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAdaptationStatement; }
	}

	public final TraitAdaptationStatementContext traitAdaptationStatement() throws RecognitionException {
		TraitAdaptationStatementContext _localctx = new TraitAdaptationStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_traitAdaptationStatement);
		try {
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				traitPrecedence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				traitAlias();
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

	public static class TraitPrecedenceContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(PhpParser.DoubleColon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode InsteadOf() { return getToken(PhpParser.InsteadOf, 0); }
		public QualifiedNamespaceNameListContext qualifiedNamespaceNameList() {
			return getRuleContext(QualifiedNamespaceNameListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public TraitPrecedenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitPrecedence; }
	}

	public final TraitPrecedenceContext traitPrecedence() throws RecognitionException {
		TraitPrecedenceContext _localctx = new TraitPrecedenceContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_traitPrecedence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			qualifiedNamespaceName();
			setState(1025);
			match(DoubleColon);
			setState(1026);
			identifier();
			setState(1027);
			match(InsteadOf);
			setState(1028);
			qualifiedNamespaceNameList();
			setState(1029);
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

	public static class TraitAliasContext extends ParserRuleContext {
		public TraitMethodReferenceContext traitMethodReference() {
			return getRuleContext(TraitMethodReferenceContext.class,0);
		}
		public TerminalNode As() { return getToken(PhpParser.As, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public MemberModifierContext memberModifier() {
			return getRuleContext(MemberModifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TraitAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAlias; }
	}

	public final TraitAliasContext traitAlias() throws RecognitionException {
		TraitAliasContext _localctx = new TraitAliasContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_traitAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			traitMethodReference();
			setState(1032);
			match(As);
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1033);
				memberModifier();
				}
				break;
			case 2:
				{
				setState(1035);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1034);
					memberModifier();
					}
					break;
				}
				setState(1037);
				identifier();
				}
				break;
			}
			setState(1040);
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

	public static class TraitMethodReferenceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(PhpParser.DoubleColon, 0); }
		public TraitMethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitMethodReference; }
	}

	public final TraitMethodReferenceContext traitMethodReference() throws RecognitionException {
		TraitMethodReferenceContext _localctx = new TraitMethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_traitMethodReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1042);
				qualifiedNamespaceName();
				setState(1043);
				match(DoubleColon);
				}
				break;
			}
			setState(1047);
			identifier();
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

	public static class BaseCtorCallContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BaseCtorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseCtorCall; }
	}

	public final BaseCtorCallContext baseCtorCall() throws RecognitionException {
		BaseCtorCallContext _localctx = new BaseCtorCallContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_baseCtorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			match(Colon);
			setState(1050);
			identifier();
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(1051);
				arguments();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_methodBody);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				blockStatement();
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

	public static class PropertyModifiersContext extends ParserRuleContext {
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TerminalNode Var() { return getToken(PhpParser.Var, 0); }
		public PropertyModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifiers; }
	}

	public final PropertyModifiersContext propertyModifiers() throws RecognitionException {
		PropertyModifiersContext _localctx = new PropertyModifiersContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_propertyModifiers);
		try {
			setState(1060);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Final:
			case Private:
			case Protected:
			case Public:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				memberModifiers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(1059);
				match(Var);
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

	public static class MemberModifiersContext extends ParserRuleContext {
		public List<MemberModifierContext> memberModifier() {
			return getRuleContexts(MemberModifierContext.class);
		}
		public MemberModifierContext memberModifier(int i) {
			return getRuleContext(MemberModifierContext.class,i);
		}
		public MemberModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifiers; }
	}

	public final MemberModifiersContext memberModifiers() throws RecognitionException {
		MemberModifiersContext _localctx = new MemberModifiersContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_memberModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1063); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1062);
					memberModifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1065); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public ConstantInitializerContext constantInitializer() {
			return getRuleContext(ConstantInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_variableInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(VarName);
			setState(1070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eq) {
				{
				setState(1068);
				match(Eq);
				setState(1069);
				constantInitializer();
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

	public static class IdentifierInitializerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public ConstantInitializerContext constantInitializer() {
			return getRuleContext(ConstantInitializerContext.class,0);
		}
		public IdentifierInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierInitializer; }
	}

	public final IdentifierInitializerContext identifierInitializer() throws RecognitionException {
		IdentifierInitializerContext _localctx = new IdentifierInitializerContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_identifierInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			identifier();
			setState(1073);
			match(Eq);
			setState(1074);
			constantInitializer();
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

	public static class GlobalConstantDeclarationContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(PhpParser.Const, 0); }
		public List<IdentifierInitializerContext> identifierInitializer() {
			return getRuleContexts(IdentifierInitializerContext.class);
		}
		public IdentifierInitializerContext identifierInitializer(int i) {
			return getRuleContext(IdentifierInitializerContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public GlobalConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalConstantDeclaration; }
	}

	public final GlobalConstantDeclarationContext globalConstantDeclaration() throws RecognitionException {
		GlobalConstantDeclarationContext _localctx = new GlobalConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_globalConstantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(1076);
				attributes();
				}
			}

			setState(1079);
			match(Const);
			setState(1080);
			identifierInitializer();
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1081);
				match(Comma);
				setState(1082);
				identifierInitializer();
				}
				}
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1088);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			expression(0);
			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1091);
				match(Comma);
				setState(1092);
				expression(0);
				}
				}
				setState(1097);
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

	public static class ParenthesesContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public ParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentheses; }
	}

	public final ParenthesesContext parentheses() throws RecognitionException {
		ParenthesesContext _localctx = new ParenthesesContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_parentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(OpenRoundBracket);
			setState(1101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1099);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1100);
				yieldExpression();
				}
				break;
			}
			setState(1103);
			match(CloseRoundBracket);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChainExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ChainExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SpecialWordExpressionContext extends ExpressionContext {
		public TerminalNode Yield() { return getToken(PhpParser.Yield, 0); }
		public TerminalNode List() { return getToken(PhpParser.List, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IsSet() { return getToken(PhpParser.IsSet, 0); }
		public ChainListContext chainList() {
			return getRuleContext(ChainListContext.class,0);
		}
		public TerminalNode Empty() { return getToken(PhpParser.Empty, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Eval() { return getToken(PhpParser.Eval, 0); }
		public TerminalNode Exit() { return getToken(PhpParser.Exit, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode Include() { return getToken(PhpParser.Include, 0); }
		public TerminalNode IncludeOnce() { return getToken(PhpParser.IncludeOnce, 0); }
		public TerminalNode Require() { return getToken(PhpParser.Require, 0); }
		public TerminalNode RequireOnce() { return getToken(PhpParser.RequireOnce, 0); }
		public TerminalNode Throw() { return getToken(PhpParser.Throw, 0); }
		public SpecialWordExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayCreationExpressionContext extends ExpressionContext {
		public ArrayCreationContext arrayCreation() {
			return getRuleContext(ArrayCreationContext.class,0);
		}
		public ArrayCreationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BackQuoteStringExpressionContext extends ExpressionContext {
		public TerminalNode BackQuoteString() { return getToken(PhpParser.BackQuoteString, 0); }
		public BackQuoteStringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MatchExpressionContext extends ExpressionContext {
		public MatchExprContext matchExpr() {
			return getRuleContext(MatchExprContext.class,0);
		}
		public MatchExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LogicalAnd() { return getToken(PhpParser.LogicalAnd, 0); }
		public TerminalNode LogicalXor() { return getToken(PhpParser.LogicalXor, 0); }
		public TerminalNode LogicalOr() { return getToken(PhpParser.LogicalOr, 0); }
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PrintExpressionContext extends ExpressionContext {
		public TerminalNode Print() { return getToken(PhpParser.Print, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentExpressionContext extends ExpressionContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixIncDecExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Inc() { return getToken(PhpParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(PhpParser.Dec, 0); }
		public PostfixIncDecExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CloneExpressionContext extends ExpressionContext {
		public TerminalNode Clone() { return getToken(PhpParser.Clone, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CloneExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryOperatorExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(PhpParser.Tilde, 0); }
		public TerminalNode SuppressWarnings() { return getToken(PhpParser.SuppressWarnings, 0); }
		public TerminalNode Bang() { return getToken(PhpParser.Bang, 0); }
		public TerminalNode Plus() { return getToken(PhpParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PhpParser.Minus, 0); }
		public UnaryOperatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NewExpressionContext extends ExpressionContext {
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SpaceshipExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Spaceship() { return getToken(PhpParser.Spaceship, 0); }
		public SpaceshipExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public TerminalNode QuestionMark() { return getToken(PhpParser.QuestionMark, 0); }
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NullCoalescingExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NullCoalescing() { return getToken(PhpParser.NullCoalescing, 0); }
		public NullCoalescingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArithmeticExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Pow() { return getToken(PhpParser.Pow, 0); }
		public TerminalNode Asterisk() { return getToken(PhpParser.Asterisk, 0); }
		public TerminalNode Divide() { return getToken(PhpParser.Divide, 0); }
		public TerminalNode Percent() { return getToken(PhpParser.Percent, 0); }
		public TerminalNode Plus() { return getToken(PhpParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PhpParser.Minus, 0); }
		public TerminalNode Dot() { return getToken(PhpParser.Dot, 0); }
		public ArithmeticExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IndexerExpressionContext extends ExpressionContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public TerminalNode OpenSquareBracket() { return getToken(PhpParser.OpenSquareBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseSquareBracket() { return getToken(PhpParser.CloseSquareBracket, 0); }
		public IndexerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ScalarExpressionContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Label() { return getToken(PhpParser.Label, 0); }
		public ScalarExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PrefixIncDecExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Inc() { return getToken(PhpParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(PhpParser.Dec, 0); }
		public PrefixIncDecExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ShiftLeft() { return getToken(PhpParser.ShiftLeft, 0); }
		public TerminalNode ShiftRight() { return getToken(PhpParser.ShiftRight, 0); }
		public TerminalNode Less() { return getToken(PhpParser.Less, 0); }
		public TerminalNode IsSmallerOrEqual() { return getToken(PhpParser.IsSmallerOrEqual, 0); }
		public TerminalNode Greater() { return getToken(PhpParser.Greater, 0); }
		public TerminalNode IsGreaterOrEqual() { return getToken(PhpParser.IsGreaterOrEqual, 0); }
		public TerminalNode IsIdentical() { return getToken(PhpParser.IsIdentical, 0); }
		public TerminalNode IsNoidentical() { return getToken(PhpParser.IsNoidentical, 0); }
		public TerminalNode IsEqual() { return getToken(PhpParser.IsEqual, 0); }
		public TerminalNode IsNotEq() { return getToken(PhpParser.IsNotEq, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CastExpressionContext extends ExpressionContext {
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public CastOperationContext castOperation() {
			return getRuleContext(CastOperationContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InstanceOfExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode InstanceOf() { return getToken(PhpParser.InstanceOf, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public InstanceOfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LambdaFunctionExpressionContext extends ExpressionContext {
		public LambdaFunctionExprContext lambdaFunctionExpr() {
			return getRuleContext(LambdaFunctionExprContext.class,0);
		}
		public LambdaFunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitwiseExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public TerminalNode Caret() { return getToken(PhpParser.Caret, 0); }
		public TerminalNode Pipe() { return getToken(PhpParser.Pipe, 0); }
		public TerminalNode BooleanAnd() { return getToken(PhpParser.BooleanAnd, 0); }
		public TerminalNode BooleanOr() { return getToken(PhpParser.BooleanOr, 0); }
		public BitwiseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 156;
		enterRecursionRule(_localctx, 156, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				_localctx = new CloneExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1106);
				match(Clone);
				setState(1107);
				expression(47);
				}
				break;
			case 2:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1108);
				newExpr();
				}
				break;
			case 3:
				{
				_localctx = new IndexerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1109);
				stringConstant();
				setState(1110);
				match(OpenSquareBracket);
				setState(1111);
				expression(0);
				setState(1112);
				match(CloseSquareBracket);
				}
				break;
			case 4:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1114);
				match(OpenRoundBracket);
				setState(1115);
				castOperation();
				setState(1116);
				match(CloseRoundBracket);
				setState(1117);
				expression(44);
				}
				break;
			case 5:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1119);
				_la = _input.LA(1);
				if ( !(_la==Tilde || _la==SuppressWarnings) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1120);
				expression(43);
				}
				break;
			case 6:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1121);
				_la = _input.LA(1);
				if ( !(((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (Bang - 195)) | (1L << (Plus - 195)) | (1L << (Minus - 195)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1122);
				expression(42);
				}
				break;
			case 7:
				{
				_localctx = new PrefixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1123);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1124);
				chain();
				}
				break;
			case 8:
				{
				_localctx = new PostfixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1125);
				chain();
				setState(1126);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				{
				_localctx = new PrintExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1128);
				match(Print);
				setState(1129);
				expression(39);
				}
				break;
			case 10:
				{
				_localctx = new ChainExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1130);
				chain();
				}
				break;
			case 11:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1131);
				constant();
				}
				break;
			case 12:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1132);
				string();
				}
				break;
			case 13:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1133);
				match(Label);
				}
				break;
			case 14:
				{
				_localctx = new BackQuoteStringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1134);
				match(BackQuoteString);
				}
				break;
			case 15:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1135);
				parentheses();
				}
				break;
			case 16:
				{
				_localctx = new ArrayCreationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1136);
				arrayCreation();
				}
				break;
			case 17:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1137);
				match(Yield);
				}
				break;
			case 18:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1138);
				match(List);
				setState(1139);
				match(OpenRoundBracket);
				setState(1140);
				assignmentList();
				setState(1141);
				match(CloseRoundBracket);
				setState(1142);
				match(Eq);
				setState(1143);
				expression(30);
				}
				break;
			case 19:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1145);
				match(IsSet);
				setState(1146);
				match(OpenRoundBracket);
				setState(1147);
				chainList();
				setState(1148);
				match(CloseRoundBracket);
				}
				break;
			case 20:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1150);
				match(Empty);
				setState(1151);
				match(OpenRoundBracket);
				setState(1152);
				chain();
				setState(1153);
				match(CloseRoundBracket);
				}
				break;
			case 21:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1155);
				match(Eval);
				setState(1156);
				match(OpenRoundBracket);
				setState(1157);
				expression(0);
				setState(1158);
				match(CloseRoundBracket);
				}
				break;
			case 22:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1160);
				match(Exit);
				setState(1164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1161);
					match(OpenRoundBracket);
					setState(1162);
					match(CloseRoundBracket);
					}
					break;
				case 2:
					{
					setState(1163);
					parentheses();
					}
					break;
				}
				}
				break;
			case 23:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1166);
				_la = _input.LA(1);
				if ( !(_la==Include || _la==IncludeOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1167);
				expression(25);
				}
				break;
			case 24:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1168);
				_la = _input.LA(1);
				if ( !(_la==Require || _la==RequireOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1169);
				expression(24);
				}
				break;
			case 25:
				{
				_localctx = new LambdaFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1170);
				lambdaFunctionExpr();
				}
				break;
			case 26:
				{
				_localctx = new MatchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1171);
				matchExpr();
				}
				break;
			case 27:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1172);
				match(Throw);
				setState(1173);
				expression(6);
				}
				break;
			case 28:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1174);
				assignable();
				setState(1175);
				assignmentOperator();
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(1176);
					attributes();
					}
				}

				setState(1179);
				expression(5);
				}
				break;
			case 29:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1181);
				assignable();
				setState(1182);
				match(Eq);
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(1183);
					attributes();
					}
				}

				setState(1186);
				match(Ampersand);
				setState(1189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1187);
					chain();
					}
					break;
				case 2:
					{
					setState(1188);
					newExpr();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1193);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1194);
						((ArithmeticExpressionContext)_localctx).op = match(Pow);
						setState(1195);
						expression(21);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1196);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1197);
						((ArithmeticExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (Asterisk - 199)) | (1L << (Percent - 199)) | (1L << (Divide - 199)))) != 0)) ) {
							((ArithmeticExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1198);
						expression(20);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1199);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1200);
						((ArithmeticExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (Plus - 197)) | (1L << (Minus - 197)) | (1L << (Dot - 197)))) != 0)) ) {
							((ArithmeticExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1201);
						expression(19);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1202);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1203);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ShiftLeft || _la==ShiftRight) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1204);
						expression(18);
						}
						break;
					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1205);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1206);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (IsSmallerOrEqual - 166)) | (1L << (IsGreaterOrEqual - 166)) | (1L << (Less - 166)) | (1L << (Greater - 166)))) != 0)) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1207);
						expression(17);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1208);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1209);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (IsIdentical - 162)) | (1L << (IsNoidentical - 162)) | (1L << (IsEqual - 162)) | (1L << (IsNotEq - 162)))) != 0)) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1210);
						expression(16);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1211);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1212);
						((BitwiseExpressionContext)_localctx).op = match(Ampersand);
						setState(1213);
						expression(15);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1214);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1215);
						((BitwiseExpressionContext)_localctx).op = match(Caret);
						setState(1216);
						expression(14);
						}
						break;
					case 9:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1217);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1218);
						((BitwiseExpressionContext)_localctx).op = match(Pipe);
						setState(1219);
						expression(13);
						}
						break;
					case 10:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1220);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1221);
						((BitwiseExpressionContext)_localctx).op = match(BooleanAnd);
						setState(1222);
						expression(12);
						}
						break;
					case 11:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1223);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1224);
						((BitwiseExpressionContext)_localctx).op = match(BooleanOr);
						setState(1225);
						expression(11);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1226);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1227);
						((ConditionalExpressionContext)_localctx).op = match(QuestionMark);
						setState(1229);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
							{
							setState(1228);
							expression(0);
							}
						}

						setState(1231);
						match(Colon);
						setState(1232);
						expression(10);
						}
						break;
					case 13:
						{
						_localctx = new NullCoalescingExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1233);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1234);
						((NullCoalescingExpressionContext)_localctx).op = match(NullCoalescing);
						setState(1235);
						expression(9);
						}
						break;
					case 14:
						{
						_localctx = new SpaceshipExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1236);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1237);
						((SpaceshipExpressionContext)_localctx).op = match(Spaceship);
						setState(1238);
						expression(8);
						}
						break;
					case 15:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1239);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1240);
						((LogicalExpressionContext)_localctx).op = match(LogicalAnd);
						setState(1241);
						expression(4);
						}
						break;
					case 16:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1242);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1243);
						((LogicalExpressionContext)_localctx).op = match(LogicalXor);
						setState(1244);
						expression(3);
						}
						break;
					case 17:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1245);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1246);
						((LogicalExpressionContext)_localctx).op = match(LogicalOr);
						setState(1247);
						expression(2);
						}
						break;
					case 18:
						{
						_localctx = new InstanceOfExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1248);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1249);
						match(InstanceOf);
						setState(1250);
						typeRef();
						}
						break;
					}
					} 
				}
				setState(1255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
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

	public static class AssignableContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ArrayCreationContext arrayCreation() {
			return getRuleContext(ArrayCreationContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assignable);
		try {
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				arrayCreation();
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

	public static class ArrayCreationContext extends ParserRuleContext {
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public List<TerminalNode> OpenSquareBracket() { return getTokens(PhpParser.OpenSquareBracket); }
		public TerminalNode OpenSquareBracket(int i) {
			return getToken(PhpParser.OpenSquareBracket, i);
		}
		public List<TerminalNode> CloseSquareBracket() { return getTokens(PhpParser.CloseSquareBracket); }
		public TerminalNode CloseSquareBracket(int i) {
			return getToken(PhpParser.CloseSquareBracket, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayItemListContext arrayItemList() {
			return getRuleContext(ArrayItemListContext.class,0);
		}
		public ArrayCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreation; }
	}

	public final ArrayCreationContext arrayCreation() throws RecognitionException {
		ArrayCreationContext _localctx = new ArrayCreationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_arrayCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				{
				setState(1260);
				match(Array);
				setState(1261);
				match(OpenRoundBracket);
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ampersand - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1262);
					arrayItemList();
					}
				}

				setState(1265);
				match(CloseRoundBracket);
				}
				break;
			case OpenSquareBracket:
				{
				setState(1266);
				match(OpenSquareBracket);
				setState(1268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ampersand - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1267);
					arrayItemList();
					}
				}

				setState(1270);
				match(CloseSquareBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1273);
				match(OpenSquareBracket);
				setState(1274);
				expression(0);
				setState(1275);
				match(CloseSquareBracket);
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

	public static class LambdaFunctionExprContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(PhpParser.Function_, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public LambdaFunctionUseVarsContext lambdaFunctionUseVars() {
			return getRuleContext(LambdaFunctionUseVarsContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode LambdaFn() { return getToken(PhpParser.LambdaFn, 0); }
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaFunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionExpr; }
	}

	public final LambdaFunctionExprContext lambdaFunctionExpr() throws RecognitionException {
		LambdaFunctionExprContext _localctx = new LambdaFunctionExprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_lambdaFunctionExpr);
		int _la;
		try {
			setState(1305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function_:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Static) {
					{
					setState(1279);
					match(Static);
					}
				}

				setState(1282);
				match(Function_);
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(1283);
					match(Ampersand);
					}
				}

				setState(1286);
				match(OpenRoundBracket);
				setState(1287);
				formalParameterList();
				setState(1288);
				match(CloseRoundBracket);
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Use) {
					{
					setState(1289);
					lambdaFunctionUseVars();
					}
				}

				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1292);
					match(Colon);
					setState(1293);
					typeHint(0);
					}
				}

				setState(1296);
				blockStatement();
				}
				break;
			case LambdaFn:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
				match(LambdaFn);
				setState(1299);
				match(OpenRoundBracket);
				setState(1300);
				formalParameterList();
				setState(1301);
				match(CloseRoundBracket);
				setState(1302);
				match(DoubleArrow);
				setState(1303);
				expression(0);
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

	public static class MatchExprContext extends ParserRuleContext {
		public TerminalNode Match() { return getToken(PhpParser.Match, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public List<MatchItemContext> matchItem() {
			return getRuleContexts(MatchItemContext.class);
		}
		public MatchItemContext matchItem(int i) {
			return getRuleContext(MatchItemContext.class,i);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public MatchExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpr; }
	}

	public final MatchExprContext matchExpr() throws RecognitionException {
		MatchExprContext _localctx = new MatchExprContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_matchExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			match(Match);
			setState(1308);
			match(OpenRoundBracket);
			setState(1309);
			expression(0);
			setState(1310);
			match(CloseRoundBracket);
			setState(1311);
			match(OpenCurlyBracket);
			setState(1312);
			matchItem();
			setState(1317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1313);
					match(Comma);
					setState(1314);
					matchItem();
					}
					} 
				}
				setState(1319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1320);
				match(Comma);
				}
			}

			setState(1323);
			match(CloseCurlyBracket);
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

	public static class MatchItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public MatchItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchItem; }
	}

	public final MatchItemContext matchItem() throws RecognitionException {
		MatchItemContext _localctx = new MatchItemContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_matchItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			expression(0);
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1326);
				match(Comma);
				setState(1327);
				expression(0);
				}
				}
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1333);
			match(DoubleArrow);
			setState(1334);
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

	public static class NewExprContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(PhpParser.New, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpr; }
	}

	public final NewExprContext newExpr() throws RecognitionException {
		NewExprContext _localctx = new NewExprContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_newExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(New);
			setState(1337);
			typeRef();
			setState(1339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1338);
				arguments();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public TerminalNode PlusEqual() { return getToken(PhpParser.PlusEqual, 0); }
		public TerminalNode MinusEqual() { return getToken(PhpParser.MinusEqual, 0); }
		public TerminalNode MulEqual() { return getToken(PhpParser.MulEqual, 0); }
		public TerminalNode PowEqual() { return getToken(PhpParser.PowEqual, 0); }
		public TerminalNode DivEqual() { return getToken(PhpParser.DivEqual, 0); }
		public TerminalNode Concaequal() { return getToken(PhpParser.Concaequal, 0); }
		public TerminalNode ModEqual() { return getToken(PhpParser.ModEqual, 0); }
		public TerminalNode AndEqual() { return getToken(PhpParser.AndEqual, 0); }
		public TerminalNode OrEqual() { return getToken(PhpParser.OrEqual, 0); }
		public TerminalNode XorEqual() { return getToken(PhpParser.XorEqual, 0); }
		public TerminalNode ShiftLeftEqual() { return getToken(PhpParser.ShiftLeftEqual, 0); }
		public TerminalNode ShiftRightEqual() { return getToken(PhpParser.ShiftRightEqual, 0); }
		public TerminalNode NullCoalescingEqual() { return getToken(PhpParser.NullCoalescingEqual, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			_la = _input.LA(1);
			if ( !(((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & ((1L << (PlusEqual - 168)) | (1L << (MinusEqual - 168)) | (1L << (MulEqual - 168)) | (1L << (PowEqual - 168)) | (1L << (DivEqual - 168)) | (1L << (Concaequal - 168)) | (1L << (ModEqual - 168)) | (1L << (ShiftLeftEqual - 168)) | (1L << (ShiftRightEqual - 168)) | (1L << (AndEqual - 168)) | (1L << (OrEqual - 168)) | (1L << (XorEqual - 168)) | (1L << (NullCoalescingEqual - 168)) | (1L << (Eq - 168)))) != 0)) ) {
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

	public static class YieldExpressionContext extends ParserRuleContext {
		public TerminalNode Yield() { return getToken(PhpParser.Yield, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode From() { return getToken(PhpParser.From, 0); }
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public YieldExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldExpression; }
	}

	public final YieldExpressionContext yieldExpression() throws RecognitionException {
		YieldExpressionContext _localctx = new YieldExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_yieldExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			match(Yield);
			setState(1351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1344);
				expression(0);
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1345);
					match(DoubleArrow);
					setState(1346);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(1349);
				match(From);
				setState(1350);
				expression(0);
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

	public static class ArrayItemListContext extends ParserRuleContext {
		public List<ArrayItemContext> arrayItem() {
			return getRuleContexts(ArrayItemContext.class);
		}
		public ArrayItemContext arrayItem(int i) {
			return getRuleContext(ArrayItemContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public ArrayItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItemList; }
	}

	public final ArrayItemListContext arrayItemList() throws RecognitionException {
		ArrayItemListContext _localctx = new ArrayItemListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_arrayItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			arrayItem();
			setState(1358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1354);
					match(Comma);
					setState(1355);
					arrayItem();
					}
					} 
				}
				setState(1360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1361);
				match(Comma);
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

	public static class ArrayItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItem; }
	}

	public final ArrayItemContext arrayItem() throws RecognitionException {
		ArrayItemContext _localctx = new ArrayItemContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_arrayItem);
		int _la;
		try {
			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1364);
				expression(0);
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1365);
					match(DoubleArrow);
					setState(1366);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1369);
					expression(0);
					setState(1370);
					match(DoubleArrow);
					}
				}

				setState(1374);
				match(Ampersand);
				setState(1375);
				chain();
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

	public static class LambdaFunctionUseVarsContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(PhpParser.Use, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public List<LambdaFunctionUseVarContext> lambdaFunctionUseVar() {
			return getRuleContexts(LambdaFunctionUseVarContext.class);
		}
		public LambdaFunctionUseVarContext lambdaFunctionUseVar(int i) {
			return getRuleContext(LambdaFunctionUseVarContext.class,i);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public LambdaFunctionUseVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionUseVars; }
	}

	public final LambdaFunctionUseVarsContext lambdaFunctionUseVars() throws RecognitionException {
		LambdaFunctionUseVarsContext _localctx = new LambdaFunctionUseVarsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_lambdaFunctionUseVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			match(Use);
			setState(1379);
			match(OpenRoundBracket);
			setState(1380);
			lambdaFunctionUseVar();
			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1381);
				match(Comma);
				setState(1382);
				lambdaFunctionUseVar();
				}
				}
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1388);
			match(CloseRoundBracket);
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

	public static class LambdaFunctionUseVarContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public LambdaFunctionUseVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionUseVar; }
	}

	public final LambdaFunctionUseVarContext lambdaFunctionUseVar() throws RecognitionException {
		LambdaFunctionUseVarContext _localctx = new LambdaFunctionUseVarContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_lambdaFunctionUseVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(1390);
				match(Ampersand);
				}
			}

			setState(1393);
			match(VarName);
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

	public static class QualifiedStaticTypeRefContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public QualifiedStaticTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedStaticTypeRef; }
	}

	public final QualifiedStaticTypeRefContext qualifiedStaticTypeRef() throws RecognitionException {
		QualifiedStaticTypeRefContext _localctx = new QualifiedStaticTypeRefContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_qualifiedStaticTypeRef);
		try {
			setState(1400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1395);
				qualifiedNamespaceName();
				setState(1397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1396);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1399);
				match(Static);
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

	public static class TypeRefContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public IndirectTypeRefContext indirectTypeRef() {
			return getRuleContext(IndirectTypeRefContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public AnonymousClassContext anonymousClass() {
			return getRuleContext(AnonymousClassContext.class,0);
		}
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		TypeRefContext _localctx = new TypeRefContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_typeRef);
		try {
			setState(1412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1402);
					qualifiedNamespaceName();
					}
					break;
				case 2:
					{
					setState(1403);
					indirectTypeRef();
					}
					break;
				}
				setState(1407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1406);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1409);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1410);
				match(Static);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1411);
				anonymousClass();
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

	public static class AnonymousClassContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public ClassEntryTypeContext classEntryType() {
			return getRuleContext(ClassEntryTypeContext.class,0);
		}
		public TerminalNode Interface() { return getToken(PhpParser.Interface, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Private() { return getToken(PhpParser.Private, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode Partial() { return getToken(PhpParser.Partial, 0); }
		public List<ClassStatementContext> classStatement() {
			return getRuleContexts(ClassStatementContext.class);
		}
		public ClassStatementContext classStatement(int i) {
			return getRuleContext(ClassStatementContext.class,i);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Extends() { return getToken(PhpParser.Extends, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Implements() { return getToken(PhpParser.Implements, 0); }
		public InterfaceListContext interfaceList() {
			return getRuleContext(InterfaceListContext.class,0);
		}
		public AnonymousClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousClass; }
	}

	public final AnonymousClassContext anonymousClass() throws RecognitionException {
		AnonymousClassContext _localctx = new AnonymousClassContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_anonymousClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(1414);
				attributes();
				}
			}

			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(1417);
				match(Private);
				}
			}

			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(1420);
				modifier();
				}
			}

			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(1423);
				match(Partial);
				}
			}

			setState(1447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(1426);
				classEntryType();
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1427);
					typeParameterListInBrackets();
					}
				}

				setState(1432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1430);
					match(Extends);
					setState(1431);
					qualifiedStaticTypeRef();
					}
				}

				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(1434);
					match(Implements);
					setState(1435);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(1438);
				match(Interface);
				setState(1439);
				identifier();
				setState(1441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1440);
					typeParameterListInBrackets();
					}
				}

				setState(1445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1443);
					match(Extends);
					setState(1444);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1449);
			match(OpenCurlyBracket);
			setState(1453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AttributeStart) | (1L << Abstract) | (1L << Const))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Function_ - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)) | (1L << (Use - 76)) | (1L << (Var - 76)))) != 0)) {
				{
				{
				setState(1450);
				classStatement();
				}
				}
				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1456);
			match(CloseCurlyBracket);
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

	public static class IndirectTypeRefContext extends ParserRuleContext {
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public List<TerminalNode> ObjectOperator() { return getTokens(PhpParser.ObjectOperator); }
		public TerminalNode ObjectOperator(int i) {
			return getToken(PhpParser.ObjectOperator, i);
		}
		public List<KeyedFieldNameContext> keyedFieldName() {
			return getRuleContexts(KeyedFieldNameContext.class);
		}
		public KeyedFieldNameContext keyedFieldName(int i) {
			return getRuleContext(KeyedFieldNameContext.class,i);
		}
		public IndirectTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indirectTypeRef; }
	}

	public final IndirectTypeRefContext indirectTypeRef() throws RecognitionException {
		IndirectTypeRefContext _localctx = new IndirectTypeRefContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_indirectTypeRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			chainBase();
			setState(1463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1459);
					match(ObjectOperator);
					setState(1460);
					keyedFieldName();
					}
					} 
				}
				setState(1465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
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

	public static class QualifiedNamespaceNameContext extends ParserRuleContext {
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode Namespace() { return getToken(PhpParser.Namespace, 0); }
		public TerminalNode NamespaceSeparator() { return getToken(PhpParser.NamespaceSeparator, 0); }
		public QualifiedNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNamespaceName; }
	}

	public final QualifiedNamespaceNameContext qualifiedNamespaceName() throws RecognitionException {
		QualifiedNamespaceNameContext _localctx = new QualifiedNamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_qualifiedNamespaceName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1466);
				match(Namespace);
				}
				break;
			}
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(1469);
				match(NamespaceSeparator);
				}
			}

			setState(1472);
			namespaceNameList();
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

	public static class NamespaceNameListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> NamespaceSeparator() { return getTokens(PhpParser.NamespaceSeparator); }
		public TerminalNode NamespaceSeparator(int i) {
			return getToken(PhpParser.NamespaceSeparator, i);
		}
		public NamespaceNameTailContext namespaceNameTail() {
			return getRuleContext(NamespaceNameTailContext.class,0);
		}
		public NamespaceNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceNameList; }
	}

	public final NamespaceNameListContext namespaceNameList() throws RecognitionException {
		NamespaceNameListContext _localctx = new NamespaceNameListContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_namespaceNameList);
		try {
			int _alt;
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1474);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1475);
				identifier();
				setState(1480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1476);
						match(NamespaceSeparator);
						setState(1477);
						identifier();
						}
						} 
					}
					setState(1482);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				}
				setState(1485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1483);
					match(NamespaceSeparator);
					setState(1484);
					namespaceNameTail();
					}
					break;
				}
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

	public static class NamespaceNameTailContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode As() { return getToken(PhpParser.As, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public List<NamespaceNameTailContext> namespaceNameTail() {
			return getRuleContexts(NamespaceNameTailContext.class);
		}
		public NamespaceNameTailContext namespaceNameTail(int i) {
			return getRuleContext(NamespaceNameTailContext.class,i);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public NamespaceNameTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceNameTail; }
	}

	public final NamespaceNameTailContext namespaceNameTail() throws RecognitionException {
		NamespaceNameTailContext _localctx = new NamespaceNameTailContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_namespaceNameTail);
		int _la;
		try {
			int _alt;
			setState(1508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Label:
				enterOuterAlt(_localctx, 1);
				{
				setState(1489);
				identifier();
				setState(1492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1490);
					match(As);
					setState(1491);
					identifier();
					}
					break;
				}
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1494);
				match(OpenCurlyBracket);
				setState(1495);
				namespaceNameTail();
				setState(1500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1496);
						match(Comma);
						setState(1497);
						namespaceNameTail();
						}
						} 
					}
					setState(1502);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				setState(1504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1503);
					match(Comma);
					}
				}

				setState(1506);
				match(CloseCurlyBracket);
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

	public static class QualifiedNamespaceNameListContext extends ParserRuleContext {
		public List<QualifiedNamespaceNameContext> qualifiedNamespaceName() {
			return getRuleContexts(QualifiedNamespaceNameContext.class);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName(int i) {
			return getRuleContext(QualifiedNamespaceNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public QualifiedNamespaceNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNamespaceNameList; }
	}

	public final QualifiedNamespaceNameListContext qualifiedNamespaceNameList() throws RecognitionException {
		QualifiedNamespaceNameListContext _localctx = new QualifiedNamespaceNameListContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_qualifiedNamespaceNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			qualifiedNamespaceName();
			setState(1515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1511);
				match(Comma);
				setState(1512);
				qualifiedNamespaceName();
				}
				}
				setState(1517);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public List<ActualArgumentContext> actualArgument() {
			return getRuleContexts(ActualArgumentContext.class);
		}
		public ActualArgumentContext actualArgument(int i) {
			return getRuleContext(ActualArgumentContext.class,i);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			match(OpenRoundBracket);
			setState(1528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1519);
				actualArgument();
				setState(1524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1520);
						match(Comma);
						setState(1521);
						actualArgument();
						}
						} 
					}
					setState(1526);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1527);
				yieldExpression();
				}
				break;
			}
			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1530);
				match(Comma);
				}
			}

			setState(1533);
			match(CloseRoundBracket);
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

	public static class ActualArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentNameContext argumentName() {
			return getRuleContext(ArgumentNameContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(PhpParser.Ellipsis, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ActualArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualArgument; }
	}

	public final ActualArgumentContext actualArgument() throws RecognitionException {
		ActualArgumentContext _localctx = new ActualArgumentContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_actualArgument);
		int _la;
		try {
			setState(1544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Ellipsis:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1535);
					argumentName();
					}
					break;
				}
				setState(1539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1538);
					match(Ellipsis);
					}
				}

				setState(1541);
				expression(0);
				}
				break;
			case Ampersand:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
				match(Ampersand);
				setState(1543);
				chain();
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

	public static class ArgumentNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public ArgumentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentName; }
	}

	public final ArgumentNameContext argumentName() throws RecognitionException {
		ArgumentNameContext _localctx = new ArgumentNameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_argumentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			identifier();
			setState(1547);
			match(Colon);
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

	public static class ConstantInitializerContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ArrayItemListContext arrayItemList() {
			return getRuleContext(ArrayItemListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PhpParser.Comma, 0); }
		public TerminalNode OpenSquareBracket() { return getToken(PhpParser.OpenSquareBracket, 0); }
		public TerminalNode CloseSquareBracket() { return getToken(PhpParser.CloseSquareBracket, 0); }
		public ConstantInitializerContext constantInitializer() {
			return getRuleContext(ConstantInitializerContext.class,0);
		}
		public TerminalNode Plus() { return getToken(PhpParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PhpParser.Minus, 0); }
		public ConstantInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantInitializer; }
	}

	public final ConstantInitializerContext constantInitializer() throws RecognitionException {
		ConstantInitializerContext _localctx = new ConstantInitializerContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_constantInitializer);
		int _la;
		try {
			setState(1570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1549);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1550);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1551);
				match(Array);
				setState(1552);
				match(OpenRoundBracket);
				setState(1557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ampersand - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1553);
					arrayItemList();
					setState(1555);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1554);
						match(Comma);
						}
					}

					}
				}

				setState(1559);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1560);
				match(OpenSquareBracket);
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ampersand - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1561);
					arrayItemList();
					setState(1563);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1562);
						match(Comma);
						}
					}

					}
				}

				setState(1567);
				match(CloseSquareBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1568);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1569);
				constantInitializer();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Null() { return getToken(PhpParser.Null, 0); }
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
		public MagicConstantContext magicConstant() {
			return getRuleContext(MagicConstantContext.class,0);
		}
		public ClassConstantContext classConstant() {
			return getRuleContext(ClassConstantContext.class,0);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_constant);
		try {
			setState(1577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1572);
				match(Null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1573);
				literalConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1574);
				magicConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1575);
				classConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1576);
				qualifiedNamespaceName();
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

	public static class LiteralConstantContext extends ParserRuleContext {
		public TerminalNode Real() { return getToken(PhpParser.Real, 0); }
		public TerminalNode BooleanConstant() { return getToken(PhpParser.BooleanConstant, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public LiteralConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalConstant; }
	}

	public final LiteralConstantContext literalConstant() throws RecognitionException {
		LiteralConstantContext _localctx = new LiteralConstantContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_literalConstant);
		try {
			setState(1583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
				enterOuterAlt(_localctx, 1);
				{
				setState(1579);
				match(Real);
				}
				break;
			case BooleanConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(1580);
				match(BooleanConstant);
				}
				break;
			case Octal:
			case Decimal:
			case Hex:
			case Binary:
				enterOuterAlt(_localctx, 3);
				{
				setState(1581);
				numericConstant();
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 4);
				{
				setState(1582);
				stringConstant();
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

	public static class NumericConstantContext extends ParserRuleContext {
		public TerminalNode Octal() { return getToken(PhpParser.Octal, 0); }
		public TerminalNode Decimal() { return getToken(PhpParser.Decimal, 0); }
		public TerminalNode Hex() { return getToken(PhpParser.Hex, 0); }
		public TerminalNode Binary() { return getToken(PhpParser.Binary, 0); }
		public NumericConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericConstant; }
	}

	public final NumericConstantContext numericConstant() throws RecognitionException {
		NumericConstantContext _localctx = new NumericConstantContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_numericConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			_la = _input.LA(1);
			if ( !(((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (Octal - 221)) | (1L << (Decimal - 221)) | (1L << (Hex - 221)) | (1L << (Binary - 221)))) != 0)) ) {
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

	public static class ClassConstantContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(PhpParser.DoubleColon, 0); }
		public TerminalNode Class() { return getToken(PhpParser.Class, 0); }
		public TerminalNode Parent_() { return getToken(PhpParser.Parent_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Constructor() { return getToken(PhpParser.Constructor, 0); }
		public TerminalNode Get() { return getToken(PhpParser.Get, 0); }
		public TerminalNode Set() { return getToken(PhpParser.Set, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public List<KeyedVariableContext> keyedVariable() {
			return getRuleContexts(KeyedVariableContext.class);
		}
		public KeyedVariableContext keyedVariable(int i) {
			return getRuleContext(KeyedVariableContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ClassConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstant; }
	}

	public final ClassConstantContext classConstant() throws RecognitionException {
		ClassConstantContext _localctx = new ClassConstantContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_classConstant);
		int _la;
		try {
			setState(1605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1587);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Parent_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1588);
				match(DoubleColon);
				setState(1593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1589);
					identifier();
					}
					break;
				case 2:
					{
					setState(1590);
					match(Constructor);
					}
					break;
				case 3:
					{
					setState(1591);
					match(Get);
					}
					break;
				case 4:
					{
					setState(1592);
					match(Set);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1598);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Abstract:
				case Array:
				case As:
				case BinaryCast:
				case BoolType:
				case BooleanConstant:
				case Break:
				case Callable:
				case Case:
				case Catch:
				case Class:
				case Clone:
				case Const:
				case Continue:
				case Declare:
				case Default:
				case Do:
				case DoubleCast:
				case DoubleType:
				case Echo:
				case Else:
				case ElseIf:
				case Empty:
				case EndDeclare:
				case EndFor:
				case EndForeach:
				case EndIf:
				case EndSwitch:
				case EndWhile:
				case Eval:
				case Exit:
				case Extends:
				case Final:
				case Finally:
				case FloatCast:
				case For:
				case Foreach:
				case Function_:
				case Global:
				case Goto:
				case If:
				case Implements:
				case Import:
				case Include:
				case IncludeOnce:
				case InstanceOf:
				case InsteadOf:
				case Int8Cast:
				case Int16Cast:
				case Int64Type:
				case IntType:
				case Interface:
				case IsSet:
				case List:
				case LogicalAnd:
				case LogicalOr:
				case LogicalXor:
				case Namespace:
				case New:
				case Null:
				case ObjectType:
				case Parent_:
				case Partial:
				case Print:
				case Private:
				case Protected:
				case Public:
				case Require:
				case RequireOnce:
				case Resource:
				case Return:
				case Static:
				case StringType:
				case Switch:
				case Throw:
				case Trait:
				case Try:
				case Typeof:
				case UintCast:
				case UnicodeCast:
				case Unset:
				case Use:
				case Var:
				case While:
				case Yield:
				case From:
				case Get:
				case Set:
				case Call:
				case CallStatic:
				case Constructor:
				case Destruct:
				case Wakeup:
				case Sleep:
				case Autoload:
				case IsSet__:
				case Unset__:
				case ToString__:
				case Invoke:
				case SetState:
				case Clone__:
				case DebugInfo:
				case Namespace__:
				case Class__:
				case Traic__:
				case Function__:
				case Method__:
				case Line__:
				case File__:
				case Dir__:
				case NamespaceSeparator:
				case Label:
					{
					setState(1595);
					qualifiedStaticTypeRef();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1596);
					keyedVariable();
					}
					break;
				case SingleQuoteString:
				case DoubleQuote:
				case StartNowDoc:
				case StartHereDoc:
					{
					setState(1597);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1600);
				match(DoubleColon);
				setState(1603);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Abstract:
				case Array:
				case As:
				case BinaryCast:
				case BoolType:
				case BooleanConstant:
				case Break:
				case Callable:
				case Case:
				case Catch:
				case Class:
				case Clone:
				case Const:
				case Continue:
				case Declare:
				case Default:
				case Do:
				case DoubleCast:
				case DoubleType:
				case Echo:
				case Else:
				case ElseIf:
				case Empty:
				case EndDeclare:
				case EndFor:
				case EndForeach:
				case EndIf:
				case EndSwitch:
				case EndWhile:
				case Eval:
				case Exit:
				case Extends:
				case Final:
				case Finally:
				case FloatCast:
				case For:
				case Foreach:
				case Function_:
				case Global:
				case Goto:
				case If:
				case Implements:
				case Import:
				case Include:
				case IncludeOnce:
				case InstanceOf:
				case InsteadOf:
				case Int8Cast:
				case Int16Cast:
				case Int64Type:
				case IntType:
				case Interface:
				case IsSet:
				case List:
				case LogicalAnd:
				case LogicalOr:
				case LogicalXor:
				case Namespace:
				case New:
				case Null:
				case ObjectType:
				case Parent_:
				case Partial:
				case Print:
				case Private:
				case Protected:
				case Public:
				case Require:
				case RequireOnce:
				case Resource:
				case Return:
				case Static:
				case StringType:
				case Switch:
				case Throw:
				case Trait:
				case Try:
				case Typeof:
				case UintCast:
				case UnicodeCast:
				case Unset:
				case Use:
				case Var:
				case While:
				case Yield:
				case From:
				case Get:
				case Set:
				case Call:
				case CallStatic:
				case Constructor:
				case Destruct:
				case Wakeup:
				case Sleep:
				case Autoload:
				case IsSet__:
				case Unset__:
				case ToString__:
				case Invoke:
				case SetState:
				case Clone__:
				case DebugInfo:
				case Namespace__:
				case Class__:
				case Traic__:
				case Function__:
				case Method__:
				case Line__:
				case File__:
				case Dir__:
				case Label:
					{
					setState(1601);
					identifier();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1602);
					keyedVariable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode Label() { return getToken(PhpParser.Label, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			match(Label);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode StartHereDoc() { return getToken(PhpParser.StartHereDoc, 0); }
		public List<TerminalNode> HereDocText() { return getTokens(PhpParser.HereDocText); }
		public TerminalNode HereDocText(int i) {
			return getToken(PhpParser.HereDocText, i);
		}
		public TerminalNode StartNowDoc() { return getToken(PhpParser.StartNowDoc, 0); }
		public TerminalNode SingleQuoteString() { return getToken(PhpParser.SingleQuoteString, 0); }
		public List<TerminalNode> DoubleQuote() { return getTokens(PhpParser.DoubleQuote); }
		public TerminalNode DoubleQuote(int i) {
			return getToken(PhpParser.DoubleQuote, i);
		}
		public List<InterpolatedStringPartContext> interpolatedStringPart() {
			return getRuleContexts(InterpolatedStringPartContext.class);
		}
		public InterpolatedStringPartContext interpolatedStringPart(int i) {
			return getRuleContext(InterpolatedStringPartContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_string);
		try {
			int _alt;
			setState(1630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				match(StartHereDoc);
				setState(1611); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1610);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1613); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case StartNowDoc:
				enterOuterAlt(_localctx, 2);
				{
				setState(1615);
				match(StartNowDoc);
				setState(1617); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1616);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1619); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SingleQuoteString:
				enterOuterAlt(_localctx, 3);
				{
				setState(1621);
				match(SingleQuoteString);
				}
				break;
			case DoubleQuote:
				enterOuterAlt(_localctx, 4);
				{
				setState(1622);
				match(DoubleQuote);
				setState(1626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1623);
						interpolatedStringPart();
						}
						} 
					}
					setState(1628);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				}
				setState(1629);
				match(DoubleQuote);
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

	public static class InterpolatedStringPartContext extends ParserRuleContext {
		public TerminalNode StringPart() { return getToken(PhpParser.StringPart, 0); }
		public TerminalNode UnicodeEscape() { return getToken(PhpParser.UnicodeEscape, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public InterpolatedStringPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolatedStringPart; }
	}

	public final InterpolatedStringPartContext interpolatedStringPart() throws RecognitionException {
		InterpolatedStringPartContext _localctx = new InterpolatedStringPartContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_interpolatedStringPart);
		try {
			setState(1635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringPart:
				enterOuterAlt(_localctx, 1);
				{
				setState(1632);
				match(StringPart);
				}
				break;
			case UnicodeEscape:
				enterOuterAlt(_localctx, 2);
				{
				setState(1633);
				match(UnicodeEscape);
				}
				break;
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case NamespaceSeparator:
			case Dollar:
			case OpenRoundBracket:
			case VarName:
			case Label:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				enterOuterAlt(_localctx, 3);
				{
				setState(1634);
				chain();
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

	public static class ChainListContext extends ParserRuleContext {
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public ChainListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainList; }
	}

	public final ChainListContext chainList() throws RecognitionException {
		ChainListContext _localctx = new ChainListContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_chainList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			chain();
			setState(1642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1638);
				match(Comma);
				setState(1639);
				chain();
				}
				}
				setState(1644);
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

	public static class ChainContext extends ParserRuleContext {
		public ChainOriginContext chainOrigin() {
			return getRuleContext(ChainOriginContext.class,0);
		}
		public List<MemberAccessContext> memberAccess() {
			return getRuleContexts(MemberAccessContext.class);
		}
		public MemberAccessContext memberAccess(int i) {
			return getRuleContext(MemberAccessContext.class,i);
		}
		public ChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chain; }
	}

	public final ChainContext chain() throws RecognitionException {
		ChainContext _localctx = new ChainContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_chain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			chainOrigin();
			setState(1649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1646);
					memberAccess();
					}
					} 
				}
				setState(1651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
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

	public static class ChainOriginContext extends ParserRuleContext {
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ChainOriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainOrigin; }
	}

	public final ChainOriginContext chainOrigin() throws RecognitionException {
		ChainOriginContext _localctx = new ChainOriginContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_chainOrigin);
		try {
			setState(1658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1652);
				chainBase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1653);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1654);
				match(OpenRoundBracket);
				setState(1655);
				newExpr();
				setState(1656);
				match(CloseRoundBracket);
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

	public static class MemberAccessContext extends ParserRuleContext {
		public TerminalNode ObjectOperator() { return getToken(PhpParser.ObjectOperator, 0); }
		public KeyedFieldNameContext keyedFieldName() {
			return getRuleContext(KeyedFieldNameContext.class,0);
		}
		public ActualArgumentsContext actualArguments() {
			return getRuleContext(ActualArgumentsContext.class,0);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			match(ObjectOperator);
			setState(1661);
			keyedFieldName();
			setState(1663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1662);
				actualArguments();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallNameContext functionCallName() {
			return getRuleContext(FunctionCallNameContext.class,0);
		}
		public ActualArgumentsContext actualArguments() {
			return getRuleContext(ActualArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			functionCallName();
			setState(1666);
			actualArguments();
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

	public static class FunctionCallNameContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ClassConstantContext classConstant() {
			return getRuleContext(ClassConstantContext.class,0);
		}
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public FunctionCallNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallName; }
	}

	public final FunctionCallNameContext functionCallName() throws RecognitionException {
		FunctionCallNameContext _localctx = new FunctionCallNameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_functionCallName);
		try {
			setState(1672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1668);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1669);
				classConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1670);
				chainBase();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1671);
				parentheses();
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

	public static class ActualArgumentsContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public ActualArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualArguments; }
	}

	public final ActualArgumentsContext actualArguments() throws RecognitionException {
		ActualArgumentsContext _localctx = new ActualArgumentsContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_actualArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(1674);
				genericDynamicArgs();
				}
			}

			setState(1677);
			arguments();
			setState(1681);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1678);
					squareCurlyExpression();
					}
					} 
				}
				setState(1683);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
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

	public static class ChainBaseContext extends ParserRuleContext {
		public List<KeyedVariableContext> keyedVariable() {
			return getRuleContexts(KeyedVariableContext.class);
		}
		public KeyedVariableContext keyedVariable(int i) {
			return getRuleContext(KeyedVariableContext.class,i);
		}
		public TerminalNode DoubleColon() { return getToken(PhpParser.DoubleColon, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public ChainBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainBase; }
	}

	public final ChainBaseContext chainBase() throws RecognitionException {
		ChainBaseContext _localctx = new ChainBaseContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_chainBase);
		try {
			setState(1693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1684);
				keyedVariable();
				setState(1687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1685);
					match(DoubleColon);
					setState(1686);
					keyedVariable();
					}
					break;
				}
				}
				break;
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case NamespaceSeparator:
			case Label:
				enterOuterAlt(_localctx, 2);
				{
				setState(1689);
				qualifiedStaticTypeRef();
				setState(1690);
				match(DoubleColon);
				setState(1691);
				keyedVariable();
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

	public static class KeyedFieldNameContext extends ParserRuleContext {
		public KeyedSimpleFieldNameContext keyedSimpleFieldName() {
			return getRuleContext(KeyedSimpleFieldNameContext.class,0);
		}
		public KeyedVariableContext keyedVariable() {
			return getRuleContext(KeyedVariableContext.class,0);
		}
		public KeyedFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedFieldName; }
	}

	public final KeyedFieldNameContext keyedFieldName() throws RecognitionException {
		KeyedFieldNameContext _localctx = new KeyedFieldNameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_keyedFieldName);
		try {
			setState(1697);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case OpenCurlyBracket:
			case Label:
				enterOuterAlt(_localctx, 1);
				{
				setState(1695);
				keyedSimpleFieldName();
				}
				break;
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1696);
				keyedVariable();
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

	public static class KeyedSimpleFieldNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public KeyedSimpleFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedSimpleFieldName; }
	}

	public final KeyedSimpleFieldNameContext keyedSimpleFieldName() throws RecognitionException {
		KeyedSimpleFieldNameContext _localctx = new KeyedSimpleFieldNameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_keyedSimpleFieldName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Label:
				{
				setState(1699);
				identifier();
				}
				break;
			case OpenCurlyBracket:
				{
				setState(1700);
				match(OpenCurlyBracket);
				setState(1701);
				expression(0);
				setState(1702);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1706);
					squareCurlyExpression();
					}
					} 
				}
				setState(1711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
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

	public static class KeyedVariableContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PhpParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PhpParser.Dollar, i);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public KeyedVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedVariable; }
	}

	public final KeyedVariableContext keyedVariable() throws RecognitionException {
		KeyedVariableContext _localctx = new KeyedVariableContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_keyedVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1712);
					match(Dollar);
					}
					} 
				}
				setState(1717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			}
			setState(1724);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VarName:
				{
				setState(1718);
				match(VarName);
				}
				break;
			case Dollar:
				{
				setState(1719);
				match(Dollar);
				setState(1720);
				match(OpenCurlyBracket);
				setState(1721);
				expression(0);
				setState(1722);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1726);
					squareCurlyExpression();
					}
					} 
				}
				setState(1731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
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

	public static class SquareCurlyExpressionContext extends ParserRuleContext {
		public TerminalNode OpenSquareBracket() { return getToken(PhpParser.OpenSquareBracket, 0); }
		public TerminalNode CloseSquareBracket() { return getToken(PhpParser.CloseSquareBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public SquareCurlyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareCurlyExpression; }
	}

	public final SquareCurlyExpressionContext squareCurlyExpression() throws RecognitionException {
		SquareCurlyExpressionContext _localctx = new SquareCurlyExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_squareCurlyExpression);
		int _la;
		try {
			setState(1741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1732);
				match(OpenSquareBracket);
				setState(1734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1733);
					expression(0);
					}
				}

				setState(1736);
				match(CloseSquareBracket);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1737);
				match(OpenCurlyBracket);
				setState(1738);
				expression(0);
				setState(1739);
				match(CloseCurlyBracket);
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentListElementContext> assignmentListElement() {
			return getRuleContexts(AssignmentListElementContext.class);
		}
		public AssignmentListElementContext assignmentListElement(int i) {
			return getRuleContext(AssignmentListElementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ampersand - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(1743);
				assignmentListElement();
				}
			}

			setState(1752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1746);
				match(Comma);
				setState(1748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ampersand - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1747);
					assignmentListElement();
					}
				}

				}
				}
				setState(1754);
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

	public static class AssignmentListElementContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode List() { return getToken(PhpParser.List, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ArrayItemContext arrayItem() {
			return getRuleContext(ArrayItemContext.class,0);
		}
		public AssignmentListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentListElement; }
	}

	public final AssignmentListElementContext assignmentListElement() throws RecognitionException {
		AssignmentListElementContext _localctx = new AssignmentListElementContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_assignmentListElement);
		try {
			setState(1762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1755);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1756);
				match(List);
				setState(1757);
				match(OpenRoundBracket);
				setState(1758);
				assignmentList();
				setState(1759);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1761);
				arrayItem();
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(PhpParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(PhpParser.Final, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			_la = _input.LA(1);
			if ( !(_la==Abstract || _la==Final) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Label() { return getToken(PhpParser.Label, 0); }
		public TerminalNode Abstract() { return getToken(PhpParser.Abstract, 0); }
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public TerminalNode As() { return getToken(PhpParser.As, 0); }
		public TerminalNode BinaryCast() { return getToken(PhpParser.BinaryCast, 0); }
		public TerminalNode BoolType() { return getToken(PhpParser.BoolType, 0); }
		public TerminalNode BooleanConstant() { return getToken(PhpParser.BooleanConstant, 0); }
		public TerminalNode Break() { return getToken(PhpParser.Break, 0); }
		public TerminalNode Callable() { return getToken(PhpParser.Callable, 0); }
		public TerminalNode Case() { return getToken(PhpParser.Case, 0); }
		public TerminalNode Catch() { return getToken(PhpParser.Catch, 0); }
		public TerminalNode Class() { return getToken(PhpParser.Class, 0); }
		public TerminalNode Clone() { return getToken(PhpParser.Clone, 0); }
		public TerminalNode Const() { return getToken(PhpParser.Const, 0); }
		public TerminalNode Continue() { return getToken(PhpParser.Continue, 0); }
		public TerminalNode Declare() { return getToken(PhpParser.Declare, 0); }
		public TerminalNode Default() { return getToken(PhpParser.Default, 0); }
		public TerminalNode Do() { return getToken(PhpParser.Do, 0); }
		public TerminalNode DoubleCast() { return getToken(PhpParser.DoubleCast, 0); }
		public TerminalNode DoubleType() { return getToken(PhpParser.DoubleType, 0); }
		public TerminalNode Echo() { return getToken(PhpParser.Echo, 0); }
		public TerminalNode Else() { return getToken(PhpParser.Else, 0); }
		public TerminalNode ElseIf() { return getToken(PhpParser.ElseIf, 0); }
		public TerminalNode Empty() { return getToken(PhpParser.Empty, 0); }
		public TerminalNode EndDeclare() { return getToken(PhpParser.EndDeclare, 0); }
		public TerminalNode EndFor() { return getToken(PhpParser.EndFor, 0); }
		public TerminalNode EndForeach() { return getToken(PhpParser.EndForeach, 0); }
		public TerminalNode EndIf() { return getToken(PhpParser.EndIf, 0); }
		public TerminalNode EndSwitch() { return getToken(PhpParser.EndSwitch, 0); }
		public TerminalNode EndWhile() { return getToken(PhpParser.EndWhile, 0); }
		public TerminalNode Eval() { return getToken(PhpParser.Eval, 0); }
		public TerminalNode Exit() { return getToken(PhpParser.Exit, 0); }
		public TerminalNode Extends() { return getToken(PhpParser.Extends, 0); }
		public TerminalNode Final() { return getToken(PhpParser.Final, 0); }
		public TerminalNode Finally() { return getToken(PhpParser.Finally, 0); }
		public TerminalNode FloatCast() { return getToken(PhpParser.FloatCast, 0); }
		public TerminalNode For() { return getToken(PhpParser.For, 0); }
		public TerminalNode Foreach() { return getToken(PhpParser.Foreach, 0); }
		public TerminalNode Function_() { return getToken(PhpParser.Function_, 0); }
		public TerminalNode Global() { return getToken(PhpParser.Global, 0); }
		public TerminalNode Goto() { return getToken(PhpParser.Goto, 0); }
		public TerminalNode If() { return getToken(PhpParser.If, 0); }
		public TerminalNode Implements() { return getToken(PhpParser.Implements, 0); }
		public TerminalNode Import() { return getToken(PhpParser.Import, 0); }
		public TerminalNode Include() { return getToken(PhpParser.Include, 0); }
		public TerminalNode IncludeOnce() { return getToken(PhpParser.IncludeOnce, 0); }
		public TerminalNode InstanceOf() { return getToken(PhpParser.InstanceOf, 0); }
		public TerminalNode InsteadOf() { return getToken(PhpParser.InsteadOf, 0); }
		public TerminalNode Int16Cast() { return getToken(PhpParser.Int16Cast, 0); }
		public TerminalNode Int64Type() { return getToken(PhpParser.Int64Type, 0); }
		public TerminalNode Int8Cast() { return getToken(PhpParser.Int8Cast, 0); }
		public TerminalNode Interface() { return getToken(PhpParser.Interface, 0); }
		public TerminalNode IntType() { return getToken(PhpParser.IntType, 0); }
		public TerminalNode IsSet() { return getToken(PhpParser.IsSet, 0); }
		public TerminalNode List() { return getToken(PhpParser.List, 0); }
		public TerminalNode LogicalAnd() { return getToken(PhpParser.LogicalAnd, 0); }
		public TerminalNode LogicalOr() { return getToken(PhpParser.LogicalOr, 0); }
		public TerminalNode LogicalXor() { return getToken(PhpParser.LogicalXor, 0); }
		public TerminalNode Namespace() { return getToken(PhpParser.Namespace, 0); }
		public TerminalNode New() { return getToken(PhpParser.New, 0); }
		public TerminalNode Null() { return getToken(PhpParser.Null, 0); }
		public TerminalNode ObjectType() { return getToken(PhpParser.ObjectType, 0); }
		public TerminalNode Parent_() { return getToken(PhpParser.Parent_, 0); }
		public TerminalNode Partial() { return getToken(PhpParser.Partial, 0); }
		public TerminalNode Print() { return getToken(PhpParser.Print, 0); }
		public TerminalNode Private() { return getToken(PhpParser.Private, 0); }
		public TerminalNode Protected() { return getToken(PhpParser.Protected, 0); }
		public TerminalNode Public() { return getToken(PhpParser.Public, 0); }
		public TerminalNode Require() { return getToken(PhpParser.Require, 0); }
		public TerminalNode RequireOnce() { return getToken(PhpParser.RequireOnce, 0); }
		public TerminalNode Resource() { return getToken(PhpParser.Resource, 0); }
		public TerminalNode Return() { return getToken(PhpParser.Return, 0); }
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public TerminalNode StringType() { return getToken(PhpParser.StringType, 0); }
		public TerminalNode Switch() { return getToken(PhpParser.Switch, 0); }
		public TerminalNode Throw() { return getToken(PhpParser.Throw, 0); }
		public TerminalNode Trait() { return getToken(PhpParser.Trait, 0); }
		public TerminalNode Try() { return getToken(PhpParser.Try, 0); }
		public TerminalNode Typeof() { return getToken(PhpParser.Typeof, 0); }
		public TerminalNode UintCast() { return getToken(PhpParser.UintCast, 0); }
		public TerminalNode UnicodeCast() { return getToken(PhpParser.UnicodeCast, 0); }
		public TerminalNode Unset() { return getToken(PhpParser.Unset, 0); }
		public TerminalNode Use() { return getToken(PhpParser.Use, 0); }
		public TerminalNode Var() { return getToken(PhpParser.Var, 0); }
		public TerminalNode While() { return getToken(PhpParser.While, 0); }
		public TerminalNode Yield() { return getToken(PhpParser.Yield, 0); }
		public TerminalNode From() { return getToken(PhpParser.From, 0); }
		public TerminalNode Get() { return getToken(PhpParser.Get, 0); }
		public TerminalNode Set() { return getToken(PhpParser.Set, 0); }
		public TerminalNode Call() { return getToken(PhpParser.Call, 0); }
		public TerminalNode CallStatic() { return getToken(PhpParser.CallStatic, 0); }
		public TerminalNode Constructor() { return getToken(PhpParser.Constructor, 0); }
		public TerminalNode Destruct() { return getToken(PhpParser.Destruct, 0); }
		public TerminalNode Wakeup() { return getToken(PhpParser.Wakeup, 0); }
		public TerminalNode Sleep() { return getToken(PhpParser.Sleep, 0); }
		public TerminalNode Autoload() { return getToken(PhpParser.Autoload, 0); }
		public TerminalNode IsSet__() { return getToken(PhpParser.IsSet__, 0); }
		public TerminalNode Unset__() { return getToken(PhpParser.Unset__, 0); }
		public TerminalNode ToString__() { return getToken(PhpParser.ToString__, 0); }
		public TerminalNode Invoke() { return getToken(PhpParser.Invoke, 0); }
		public TerminalNode SetState() { return getToken(PhpParser.SetState, 0); }
		public TerminalNode Clone__() { return getToken(PhpParser.Clone__, 0); }
		public TerminalNode DebugInfo() { return getToken(PhpParser.DebugInfo, 0); }
		public TerminalNode Namespace__() { return getToken(PhpParser.Namespace__, 0); }
		public TerminalNode Class__() { return getToken(PhpParser.Class__, 0); }
		public TerminalNode Traic__() { return getToken(PhpParser.Traic__, 0); }
		public TerminalNode Function__() { return getToken(PhpParser.Function__, 0); }
		public TerminalNode Method__() { return getToken(PhpParser.Method__, 0); }
		public TerminalNode Line__() { return getToken(PhpParser.Line__, 0); }
		public TerminalNode File__() { return getToken(PhpParser.File__, 0); }
		public TerminalNode Dir__() { return getToken(PhpParser.Dir__, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==Label) ) {
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

	public static class MemberModifierContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(PhpParser.Public, 0); }
		public TerminalNode Protected() { return getToken(PhpParser.Protected, 0); }
		public TerminalNode Private() { return getToken(PhpParser.Private, 0); }
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public TerminalNode Abstract() { return getToken(PhpParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(PhpParser.Final, 0); }
		public MemberModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifier; }
	}

	public final MemberModifierContext memberModifier() throws RecognitionException {
		MemberModifierContext _localctx = new MemberModifierContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			_la = _input.LA(1);
			if ( !(_la==Abstract || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)))) != 0)) ) {
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

	public static class MagicConstantContext extends ParserRuleContext {
		public TerminalNode Namespace__() { return getToken(PhpParser.Namespace__, 0); }
		public TerminalNode Class__() { return getToken(PhpParser.Class__, 0); }
		public TerminalNode Traic__() { return getToken(PhpParser.Traic__, 0); }
		public TerminalNode Function__() { return getToken(PhpParser.Function__, 0); }
		public TerminalNode Method__() { return getToken(PhpParser.Method__, 0); }
		public TerminalNode Line__() { return getToken(PhpParser.Line__, 0); }
		public TerminalNode File__() { return getToken(PhpParser.File__, 0); }
		public TerminalNode Dir__() { return getToken(PhpParser.Dir__, 0); }
		public MagicConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magicConstant; }
	}

	public final MagicConstantContext magicConstant() throws RecognitionException {
		MagicConstantContext _localctx = new MagicConstantContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_magicConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			_la = _input.LA(1);
			if ( !(((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (Namespace__ - 148)) | (1L << (Class__ - 148)) | (1L << (Traic__ - 148)) | (1L << (Function__ - 148)) | (1L << (Method__ - 148)) | (1L << (Line__ - 148)) | (1L << (File__ - 148)) | (1L << (Dir__ - 148)))) != 0)) ) {
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

	public static class MagicMethodContext extends ParserRuleContext {
		public TerminalNode Get() { return getToken(PhpParser.Get, 0); }
		public TerminalNode Set() { return getToken(PhpParser.Set, 0); }
		public TerminalNode Call() { return getToken(PhpParser.Call, 0); }
		public TerminalNode CallStatic() { return getToken(PhpParser.CallStatic, 0); }
		public TerminalNode Constructor() { return getToken(PhpParser.Constructor, 0); }
		public TerminalNode Destruct() { return getToken(PhpParser.Destruct, 0); }
		public TerminalNode Wakeup() { return getToken(PhpParser.Wakeup, 0); }
		public TerminalNode Sleep() { return getToken(PhpParser.Sleep, 0); }
		public TerminalNode Autoload() { return getToken(PhpParser.Autoload, 0); }
		public TerminalNode IsSet__() { return getToken(PhpParser.IsSet__, 0); }
		public TerminalNode Unset__() { return getToken(PhpParser.Unset__, 0); }
		public TerminalNode ToString__() { return getToken(PhpParser.ToString__, 0); }
		public TerminalNode Invoke() { return getToken(PhpParser.Invoke, 0); }
		public TerminalNode SetState() { return getToken(PhpParser.SetState, 0); }
		public TerminalNode Clone__() { return getToken(PhpParser.Clone__, 0); }
		public TerminalNode DebugInfo() { return getToken(PhpParser.DebugInfo, 0); }
		public MagicMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magicMethod; }
	}

	public final MagicMethodContext magicMethod() throws RecognitionException {
		MagicMethodContext _localctx = new MagicMethodContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_magicMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			_la = _input.LA(1);
			if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Get - 132)) | (1L << (Set - 132)) | (1L << (Call - 132)) | (1L << (CallStatic - 132)) | (1L << (Constructor - 132)) | (1L << (Destruct - 132)) | (1L << (Wakeup - 132)) | (1L << (Sleep - 132)) | (1L << (Autoload - 132)) | (1L << (IsSet__ - 132)) | (1L << (Unset__ - 132)) | (1L << (ToString__ - 132)) | (1L << (Invoke - 132)) | (1L << (SetState - 132)) | (1L << (Clone__ - 132)) | (1L << (DebugInfo - 132)))) != 0)) ) {
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(PhpParser.BoolType, 0); }
		public TerminalNode IntType() { return getToken(PhpParser.IntType, 0); }
		public TerminalNode Int64Type() { return getToken(PhpParser.Int64Type, 0); }
		public TerminalNode DoubleType() { return getToken(PhpParser.DoubleType, 0); }
		public TerminalNode StringType() { return getToken(PhpParser.StringType, 0); }
		public TerminalNode Resource() { return getToken(PhpParser.Resource, 0); }
		public TerminalNode ObjectType() { return getToken(PhpParser.ObjectType, 0); }
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Array) | (1L << BoolType) | (1L << DoubleType))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Int64Type - 93)) | (1L << (IntType - 93)) | (1L << (ObjectType - 93)) | (1L << (Resource - 93)) | (1L << (StringType - 93)))) != 0)) ) {
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

	public static class CastOperationContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(PhpParser.BoolType, 0); }
		public TerminalNode Int8Cast() { return getToken(PhpParser.Int8Cast, 0); }
		public TerminalNode Int16Cast() { return getToken(PhpParser.Int16Cast, 0); }
		public TerminalNode IntType() { return getToken(PhpParser.IntType, 0); }
		public TerminalNode Int64Type() { return getToken(PhpParser.Int64Type, 0); }
		public TerminalNode UintCast() { return getToken(PhpParser.UintCast, 0); }
		public TerminalNode DoubleCast() { return getToken(PhpParser.DoubleCast, 0); }
		public TerminalNode DoubleType() { return getToken(PhpParser.DoubleType, 0); }
		public TerminalNode FloatCast() { return getToken(PhpParser.FloatCast, 0); }
		public TerminalNode StringType() { return getToken(PhpParser.StringType, 0); }
		public TerminalNode BinaryCast() { return getToken(PhpParser.BinaryCast, 0); }
		public TerminalNode UnicodeCast() { return getToken(PhpParser.UnicodeCast, 0); }
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public TerminalNode ObjectType() { return getToken(PhpParser.ObjectType, 0); }
		public TerminalNode Resource() { return getToken(PhpParser.Resource, 0); }
		public TerminalNode Unset() { return getToken(PhpParser.Unset, 0); }
		public CastOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castOperation; }
	}

	public final CastOperationContext castOperation() throws RecognitionException {
		CastOperationContext _localctx = new CastOperationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_castOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Array) | (1L << BinaryCast) | (1L << BoolType) | (1L << DoubleCast) | (1L << DoubleType))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (FloatCast - 78)) | (1L << (Int8Cast - 78)) | (1L << (Int16Cast - 78)) | (1L << (Int64Type - 78)) | (1L << (IntType - 78)) | (1L << (ObjectType - 78)) | (1L << (Resource - 78)) | (1L << (StringType - 78)) | (1L << (UintCast - 78)) | (1L << (UnicodeCast - 78)) | (1L << (Unset - 78)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 58:
			return typeHint_sempred((TypeHintContext)_localctx, predIndex);
		case 78:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeHint_sempred(TypeHintContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		case 18:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00f1\u06f5\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\3\2\5"+
		"\2\u010a\n\2\3\2\3\2\7\2\u010e\n\2\f\2\16\2\u0111\13\2\3\2\3\2\3\3\6\3"+
		"\u0116\n\3\r\3\16\3\u0117\3\3\5\3\u011b\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0133"+
		"\n\4\f\4\16\4\u0136\13\4\3\4\5\4\u0139\n\4\3\5\6\5\u013c\n\5\r\5\16\5"+
		"\u013d\3\6\7\6\u0141\n\6\f\6\16\6\u0144\13\6\3\6\6\6\u0147\n\6\r\6\16"+
		"\6\u0148\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0156\n\b\3\t"+
		"\3\t\5\t\u015a\n\t\3\t\3\t\3\t\3\n\5\n\u0160\n\n\3\n\3\n\3\n\5\n\u0165"+
		"\n\n\3\n\7\n\u0168\n\n\f\n\16\n\u016b\13\n\3\13\3\13\3\f\3\f\5\f\u0171"+
		"\n\f\3\f\3\f\7\f\u0175\n\f\f\f\16\f\u0178\13\f\3\f\3\f\3\f\3\f\5\f\u017e"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0185\n\r\3\16\5\16\u0188\n\16\3\16\3\16"+
		"\5\16\u018c\n\16\3\16\3\16\5\16\u0190\n\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0197\n\16\3\16\5\16\u019a\n\16\3\16\3\16\3\17\5\17\u019f\n\17\3\17"+
		"\5\17\u01a2\n\17\3\17\5\17\u01a5\n\17\3\17\5\17\u01a8\n\17\3\17\3\17\3"+
		"\17\5\17\u01ad\n\17\3\17\3\17\5\17\u01b1\n\17\3\17\3\17\5\17\u01b5\n\17"+
		"\3\17\3\17\3\17\5\17\u01ba\n\17\3\17\3\17\5\17\u01be\n\17\5\17\u01c0\n"+
		"\17\3\17\3\17\7\17\u01c4\n\17\f\17\16\17\u01c7\13\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\7\21\u01d0\n\21\f\21\16\21\u01d3\13\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01e3"+
		"\n\22\3\23\3\23\3\23\7\23\u01e8\n\23\f\23\16\23\u01eb\13\23\3\24\3\24"+
		"\3\24\7\24\u01f0\n\24\f\24\16\24\u01f3\13\24\3\25\5\25\u01f6\n\25\3\25"+
		"\3\25\3\26\5\26\u01fb\n\26\3\26\3\26\3\26\3\26\5\26\u0201\n\26\3\27\3"+
		"\27\3\27\3\27\7\27\u0207\n\27\f\27\16\27\u020a\13\27\3\27\3\27\3\30\6"+
		"\30\u020f\n\30\r\30\16\30\u0210\3\31\3\31\3\31\3\31\5\31\u0217\n\31\3"+
		"\31\3\31\3\31\7\31\u021c\n\31\f\31\16\31\u021f\13\31\3\31\3\31\3\32\3"+
		"\32\5\32\u0225\n\32\3\33\7\33\u0228\n\33\f\33\16\33\u022b\13\33\3\34\3"+
		"\34\3\34\5\34\u0230\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u024d\n\35\3\36\3\36\3\37\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \7 \u0259\n \f \16 \u025c\13 \3 \5 \u025f\n \3 \3 \3 \3 \3 \7"+
		" \u0266\n \f \16 \u0269\13 \3 \5 \u026c\n \3 \3 \3 \5 \u0271\n \3!\3!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\5%\u028b\n%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\5\'\u0296\n\'\3\'\3\'\5\'"+
		"\u029a\n\'\3\'\3\'\5\'\u029e\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02a7"+
		"\n\'\3(\3(\3)\3)\3*\3*\3*\3*\5*\u02b1\n*\3*\7*\u02b4\n*\f*\16*\u02b7\13"+
		"*\3*\3*\3*\5*\u02bc\n*\3*\7*\u02bf\n*\f*\16*\u02c2\13*\3*\3*\5*\u02c6"+
		"\n*\3+\3+\3+\5+\u02cb\n+\3+\6+\u02ce\n+\r+\16+\u02cf\3+\3+\3,\3,\5,\u02d6"+
		"\n,\3,\3,\3-\3-\5-\u02dc\n-\3-\3-\3.\3.\5.\u02e2\n.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\5\61\u02f4\n\61\3\61"+
		"\3\61\3\61\5\61\u02f9\n\61\3\61\5\61\u02fc\n\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u0306\n\61\3\61\5\61\u0309\n\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0316\n\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u031e\n\61\3\62\3\62\3\62\6\62\u0323\n\62\r\62\16"+
		"\62\u0324\3\62\5\62\u0328\n\62\3\62\7\62\u032b\n\62\f\62\16\62\u032e\13"+
		"\62\3\62\5\62\u0331\n\62\3\63\3\63\3\63\3\63\3\63\7\63\u0338\n\63\f\63"+
		"\16\63\u033b\13\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\5\67\u0356\n\67\38\68\u0359\n8\r8\168\u035a\39\39\39\79\u0360\n9\f"+
		"9\169\u0363\139\3:\5:\u0366\n:\3:\3:\7:\u036a\n:\f:\16:\u036d\13:\3:\5"+
		":\u0370\n:\3;\5;\u0373\n;\3;\5;\u0376\n;\3;\5;\u0379\n;\3;\5;\u037c\n"+
		";\3;\5;\u037f\n;\3;\5;\u0382\n;\3;\3;\3<\3<\3<\3<\5<\u038a\n<\3<\3<\3"+
		"<\7<\u038f\n<\f<\16<\u0392\13<\3=\3=\3=\3=\7=\u0398\n=\f=\16=\u039b\13"+
		"=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\5>\u03a7\n>\3?\3?\3?\3?\3@\3@\3@\3@\7"+
		"@\u03b1\n@\f@\16@\u03b4\13@\3@\3@\3A\5A\u03b9\nA\3A\3A\5A\u03bd\nA\3A"+
		"\3A\3A\7A\u03c2\nA\fA\16A\u03c5\13A\3A\3A\3A\5A\u03ca\nA\3A\3A\5A\u03ce"+
		"\nA\3A\3A\3A\7A\u03d3\nA\fA\16A\u03d6\13A\3A\3A\3A\3A\5A\u03dc\nA\3A\3"+
		"A\5A\u03e0\nA\3A\3A\3A\3A\5A\u03e6\nA\3A\3A\5A\u03ea\nA\5A\u03ec\nA\3"+
		"A\3A\3A\3A\5A\u03f2\nA\3B\3B\3B\7B\u03f7\nB\fB\16B\u03fa\13B\3B\5B\u03fd"+
		"\nB\3C\3C\5C\u0401\nC\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\5E\u040e\nE\3E"+
		"\5E\u0411\nE\3E\3E\3F\3F\3F\5F\u0418\nF\3F\3F\3G\3G\3G\5G\u041f\nG\3H"+
		"\3H\5H\u0423\nH\3I\3I\5I\u0427\nI\3J\6J\u042a\nJ\rJ\16J\u042b\3K\3K\3"+
		"K\5K\u0431\nK\3L\3L\3L\3L\3M\5M\u0438\nM\3M\3M\3M\3M\7M\u043e\nM\fM\16"+
		"M\u0441\13M\3M\3M\3N\3N\3N\7N\u0448\nN\fN\16N\u044b\13N\3O\3O\3O\5O\u0450"+
		"\nO\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u048f\nP\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\5P\u049c\nP\3P\3P\3P\3P\3P\5P\u04a3\nP\3P\3P"+
		"\3P\5P\u04a8\nP\5P\u04aa\nP\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P"+
		"\u04d0\nP\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\7P\u04e6\nP\fP\16P\u04e9\13P\3Q\3Q\5Q\u04ed\nQ\3R\3R\3R\5R\u04f2\nR\3"+
		"R\3R\3R\5R\u04f7\nR\3R\5R\u04fa\nR\3R\3R\3R\3R\5R\u0500\nR\3S\5S\u0503"+
		"\nS\3S\3S\5S\u0507\nS\3S\3S\3S\3S\5S\u050d\nS\3S\3S\5S\u0511\nS\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\5S\u051c\nS\3T\3T\3T\3T\3T\3T\3T\3T\7T\u0526\nT"+
		"\fT\16T\u0529\13T\3T\5T\u052c\nT\3T\3T\3U\3U\3U\7U\u0533\nU\fU\16U\u0536"+
		"\13U\3U\3U\3U\3V\3V\3V\5V\u053e\nV\3W\3W\3X\3X\3X\3X\5X\u0546\nX\3X\3"+
		"X\5X\u054a\nX\3Y\3Y\3Y\7Y\u054f\nY\fY\16Y\u0552\13Y\3Y\5Y\u0555\nY\3Z"+
		"\3Z\3Z\5Z\u055a\nZ\3Z\3Z\3Z\5Z\u055f\nZ\3Z\3Z\5Z\u0563\nZ\3[\3[\3[\3["+
		"\3[\7[\u056a\n[\f[\16[\u056d\13[\3[\3[\3\\\5\\\u0572\n\\\3\\\3\\\3]\3"+
		"]\5]\u0578\n]\3]\5]\u057b\n]\3^\3^\5^\u057f\n^\3^\5^\u0582\n^\3^\3^\3"+
		"^\5^\u0587\n^\3_\5_\u058a\n_\3_\5_\u058d\n_\3_\5_\u0590\n_\3_\5_\u0593"+
		"\n_\3_\3_\5_\u0597\n_\3_\3_\5_\u059b\n_\3_\3_\5_\u059f\n_\3_\3_\3_\5_"+
		"\u05a4\n_\3_\3_\5_\u05a8\n_\5_\u05aa\n_\3_\3_\7_\u05ae\n_\f_\16_\u05b1"+
		"\13_\3_\3_\3`\3`\3`\7`\u05b8\n`\f`\16`\u05bb\13`\3a\5a\u05be\na\3a\5a"+
		"\u05c1\na\3a\3a\3b\3b\3b\3b\7b\u05c9\nb\fb\16b\u05cc\13b\3b\3b\5b\u05d0"+
		"\nb\5b\u05d2\nb\3c\3c\3c\5c\u05d7\nc\3c\3c\3c\3c\7c\u05dd\nc\fc\16c\u05e0"+
		"\13c\3c\5c\u05e3\nc\3c\3c\5c\u05e7\nc\3d\3d\3d\7d\u05ec\nd\fd\16d\u05ef"+
		"\13d\3e\3e\3e\3e\7e\u05f5\ne\fe\16e\u05f8\13e\3e\5e\u05fb\ne\3e\5e\u05fe"+
		"\ne\3e\3e\3f\5f\u0603\nf\3f\5f\u0606\nf\3f\3f\3f\5f\u060b\nf\3g\3g\3g"+
		"\3h\3h\3h\3h\3h\3h\5h\u0616\nh\5h\u0618\nh\3h\3h\3h\3h\5h\u061e\nh\5h"+
		"\u0620\nh\3h\3h\3h\5h\u0625\nh\3i\3i\3i\3i\3i\5i\u062c\ni\3j\3j\3j\3j"+
		"\5j\u0632\nj\3k\3k\3l\3l\3l\3l\3l\3l\5l\u063c\nl\3l\3l\3l\5l\u0641\nl"+
		"\3l\3l\3l\5l\u0646\nl\5l\u0648\nl\3m\3m\3n\3n\6n\u064e\nn\rn\16n\u064f"+
		"\3n\3n\6n\u0654\nn\rn\16n\u0655\3n\3n\3n\7n\u065b\nn\fn\16n\u065e\13n"+
		"\3n\5n\u0661\nn\3o\3o\3o\5o\u0666\no\3p\3p\3p\7p\u066b\np\fp\16p\u066e"+
		"\13p\3q\3q\7q\u0672\nq\fq\16q\u0675\13q\3r\3r\3r\3r\3r\3r\5r\u067d\nr"+
		"\3s\3s\3s\5s\u0682\ns\3t\3t\3t\3u\3u\3u\3u\5u\u068b\nu\3v\5v\u068e\nv"+
		"\3v\3v\7v\u0692\nv\fv\16v\u0695\13v\3w\3w\3w\5w\u069a\nw\3w\3w\3w\3w\5"+
		"w\u06a0\nw\3x\3x\5x\u06a4\nx\3y\3y\3y\3y\3y\5y\u06ab\ny\3y\7y\u06ae\n"+
		"y\fy\16y\u06b1\13y\3z\7z\u06b4\nz\fz\16z\u06b7\13z\3z\3z\3z\3z\3z\3z\5"+
		"z\u06bf\nz\3z\7z\u06c2\nz\fz\16z\u06c5\13z\3{\3{\5{\u06c9\n{\3{\3{\3{"+
		"\3{\3{\5{\u06d0\n{\3|\5|\u06d3\n|\3|\3|\5|\u06d7\n|\7|\u06d9\n|\f|\16"+
		"|\u06dc\13|\3}\3}\3}\3}\3}\3}\3}\5}\u06e5\n}\3~\3~\3\177\3\177\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084"+
		"\3\u0084\2\4v\u009e\u0085\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\2\32\4\2::SS\4\288zz\3\2\u00d8\u00d9\3"+
		"\2\u00cc\u00cd\4\2\u00c5\u00c5\u00c7\u00c8\3\2\u00a2\u00a3\3\2YZ\3\2r"+
		"s\3\2\u00c9\u00cb\4\2\u00c7\u00c8\u00cf\u00cf\3\2\u00bb\u00bc\4\2\u00a8"+
		"\u00a9\u00c1\u00c2\3\2\u00a4\u00a7\6\2\u00aa\u00ac\u00ae\u00b6\u00ba\u00ba"+
		"\u00da\u00da\3\2\u00c7\u00c8\4\2\u00df\u00e0\u00e2\u00e3\4\288ll\4\2."+
		".NN\6\2.fh\u0084\u0086\u009d\u00de\u00de\6\2..NNoqvv\3\2\u0096\u009d\3"+
		"\2\u0086\u0095\t\2//\62\62@@_`kkttww\13\2//\61\62?@PP]`kkttww}\177\2\u07c9"+
		"\2\u0109\3\2\2\2\4\u011a\3\2\2\2\6\u0138\3\2\2\2\b\u013b\3\2\2\2\n\u0142"+
		"\3\2\2\2\f\u014a\3\2\2\2\16\u0155\3\2\2\2\20\u0157\3\2\2\2\22\u015f\3"+
		"\2\2\2\24\u016c\3\2\2\2\26\u016e\3\2\2\2\30\u0184\3\2\2\2\32\u0187\3\2"+
		"\2\2\34\u019e\3\2\2\2\36\u01ca\3\2\2\2 \u01cc\3\2\2\2\"\u01e2\3\2\2\2"+
		"$\u01e4\3\2\2\2&\u01ec\3\2\2\2(\u01f5\3\2\2\2*\u01fa\3\2\2\2,\u0202\3"+
		"\2\2\2.\u020e\3\2\2\2\60\u0212\3\2\2\2\62\u0222\3\2\2\2\64\u0229\3\2\2"+
		"\2\66\u022f\3\2\2\28\u024c\3\2\2\2:\u024e\3\2\2\2<\u0250\3\2\2\2>\u0270"+
		"\3\2\2\2@\u0272\3\2\2\2B\u0276\3\2\2\2D\u027b\3\2\2\2F\u027e\3\2\2\2H"+
		"\u0282\3\2\2\2J\u028c\3\2\2\2L\u0292\3\2\2\2N\u02a8\3\2\2\2P\u02aa\3\2"+
		"\2\2R\u02ac\3\2\2\2T\u02cd\3\2\2\2V\u02d3\3\2\2\2X\u02d9\3\2\2\2Z\u02df"+
		"\3\2\2\2\\\u02e5\3\2\2\2^\u02e8\3\2\2\2`\u02ee\3\2\2\2b\u031f\3\2\2\2"+
		"d\u0332\3\2\2\2f\u0340\3\2\2\2h\u0343\3\2\2\2j\u0347\3\2\2\2l\u034b\3"+
		"\2\2\2n\u0358\3\2\2\2p\u035c\3\2\2\2r\u0365\3\2\2\2t\u0372\3\2\2\2v\u0389"+
		"\3\2\2\2x\u0393\3\2\2\2z\u03a6\3\2\2\2|\u03a8\3\2\2\2~\u03ac\3\2\2\2\u0080"+
		"\u03f1\3\2\2\2\u0082\u03fc\3\2\2\2\u0084\u0400\3\2\2\2\u0086\u0402\3\2"+
		"\2\2\u0088\u0409\3\2\2\2\u008a\u0417\3\2\2\2\u008c\u041b\3\2\2\2\u008e"+
		"\u0422\3\2\2\2\u0090\u0426\3\2\2\2\u0092\u0429\3\2\2\2\u0094\u042d\3\2"+
		"\2\2\u0096\u0432\3\2\2\2\u0098\u0437\3\2\2\2\u009a\u0444\3\2\2\2\u009c"+
		"\u044c\3\2\2\2\u009e\u04a9\3\2\2\2\u00a0\u04ec\3\2\2\2\u00a2\u04f9\3\2"+
		"\2\2\u00a4\u051b\3\2\2\2\u00a6\u051d\3\2\2\2\u00a8\u052f\3\2\2\2\u00aa"+
		"\u053a\3\2\2\2\u00ac\u053f\3\2\2\2\u00ae\u0541\3\2\2\2\u00b0\u054b\3\2"+
		"\2\2\u00b2\u0562\3\2\2\2\u00b4\u0564\3\2\2\2\u00b6\u0571\3\2\2\2\u00b8"+
		"\u057a\3\2\2\2\u00ba\u0586\3\2\2\2\u00bc\u0589\3\2\2\2\u00be\u05b4\3\2"+
		"\2\2\u00c0\u05bd\3\2\2\2\u00c2\u05d1\3\2\2\2\u00c4\u05e6\3\2\2\2\u00c6"+
		"\u05e8\3\2\2\2\u00c8\u05f0\3\2\2\2\u00ca\u060a\3\2\2\2\u00cc\u060c\3\2"+
		"\2\2\u00ce\u0624\3\2\2\2\u00d0\u062b\3\2\2\2\u00d2\u0631\3\2\2\2\u00d4"+
		"\u0633\3\2\2\2\u00d6\u0647\3\2\2\2\u00d8\u0649\3\2\2\2\u00da\u0660\3\2"+
		"\2\2\u00dc\u0665\3\2\2\2\u00de\u0667\3\2\2\2\u00e0\u066f\3\2\2\2\u00e2"+
		"\u067c\3\2\2\2\u00e4\u067e\3\2\2\2\u00e6\u0683\3\2\2\2\u00e8\u068a\3\2"+
		"\2\2\u00ea\u068d\3\2\2\2\u00ec\u069f\3\2\2\2\u00ee\u06a3\3\2\2\2\u00f0"+
		"\u06aa\3\2\2\2\u00f2\u06b5\3\2\2\2\u00f4\u06cf\3\2\2\2\u00f6\u06d2\3\2"+
		"\2\2\u00f8\u06e4\3\2\2\2\u00fa\u06e6\3\2\2\2\u00fc\u06e8\3\2\2\2\u00fe"+
		"\u06ea\3\2\2\2\u0100\u06ec\3\2\2\2\u0102\u06ee\3\2\2\2\u0104\u06f0\3\2"+
		"\2\2\u0106\u06f2\3\2\2\2\u0108\u010a\7\f\2\2\u0109\u0108\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010f\3\2\2\2\u010b\u010e\5\4\3\2\u010c\u010e\5\n"+
		"\6\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u0113\7\2\2\3\u0113\3\3\2\2\2\u0114\u0116\5\6\4\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u011b\5\b\5\2\u011a\u0115\3\2\2\2\u011a\u0119\3\2"+
		"\2\2\u011b\5\3\2\2\2\u011c\u0139\7\n\2\2\u011d\u0139\7\21\2\2\u011e\u0139"+
		"\7\b\2\2\u011f\u0139\7\13\2\2\u0120\u0139\7\32\2\2\u0121\u0139\7\22\2"+
		"\2\u0122\u0139\7\23\2\2\u0123\u0139\7\4\2\2\u0124\u0139\7\24\2\2\u0125"+
		"\u0139\7\25\2\2\u0126\u0139\7\35\2\2\u0127\u0139\7\26\2\2\u0128\u0139"+
		"\7!\2\2\u0129\u0139\7\27\2\2\u012a\u0139\7\30\2\2\u012b\u0139\7\36\2\2"+
		"\u012c\u0139\7\"\2\2\u012d\u0139\7\'\2\2\u012e\u0139\7\7\2\2\u012f\u0139"+
		"\7%\2\2\u0130\u0134\7\5\2\2\u0131\u0133\7\16\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u0139\7\17\2\2\u0138\u011c\3\2\2\2\u0138"+
		"\u011d\3\2\2\2\u0138\u011e\3\2\2\2\u0138\u011f\3\2\2\2\u0138\u0120\3\2"+
		"\2\2\u0138\u0121\3\2\2\2\u0138\u0122\3\2\2\2\u0138\u0123\3\2\2\2\u0138"+
		"\u0124\3\2\2\2\u0138\u0125\3\2\2\2\u0138\u0126\3\2\2\2\u0138\u0127\3\2"+
		"\2\2\u0138\u0128\3\2\2\2\u0138\u0129\3\2\2\2\u0138\u012a\3\2\2\2\u0138"+
		"\u012b\3\2\2\2\u0138\u012c\3\2\2\2\u0138\u012d\3\2\2\2\u0138\u012e\3\2"+
		"\2\2\u0138\u012f\3\2\2\2\u0138\u0130\3\2\2\2\u0139\7\3\2\2\2\u013a\u013c"+
		"\7$\2\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\t\3\2\2\2\u013f\u0141\5\f\7\2\u0140\u013f\3\2\2\2"+
		"\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0146"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\5\16\b\2\u0146\u0145\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\13"+
		"\3\2\2\2\u014a\u014b\7X\2\2\u014b\u014c\7h\2\2\u014c\u014d\5\u00c2b\2"+
		"\u014d\u014e\7\u00d9\2\2\u014e\r\3\2\2\2\u014f\u0156\58\35\2\u0150\u0156"+
		"\5\20\t\2\u0151\u0156\5\26\f\2\u0152\u0156\5\32\16\2\u0153\u0156\5\34"+
		"\17\2\u0154\u0156\5\u0098M\2\u0155\u014f\3\2\2\2\u0155\u0150\3\2\2\2\u0155"+
		"\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2"+
		"\2\2\u0156\17\3\2\2\2\u0157\u0159\7\u0080\2\2\u0158\u015a\t\2\2\2\u0159"+
		"\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\5\22"+
		"\n\2\u015c\u015d\7\u00d9\2\2\u015d\21\3\2\2\2\u015e\u0160\7\u00bf\2\2"+
		"\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0169"+
		"\5\24\13\2\u0162\u0164\7\u00d7\2\2\u0163\u0165\7\u00bf\2\2\u0164\u0163"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\5\24\13\2"+
		"\u0167\u0162\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\23\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\5\u00c2b\2\u016d"+
		"\25\3\2\2\2\u016e\u017d\7h\2\2\u016f\u0171\5\u00c2b\2\u0170\u016f\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0176\7\u00d5\2\2\u0173"+
		"\u0175\5\30\r\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3"+
		"\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u017e\7\u00d6\2\2\u017a\u017b\5\u00c2b\2\u017b\u017c\7\u00d9\2\2\u017c"+
		"\u017e\3\2\2\2\u017d\u0170\3\2\2\2\u017d\u017a\3\2\2\2\u017e\27\3\2\2"+
		"\2\u017f\u0185\58\35\2\u0180\u0185\5\20\t\2\u0181\u0185\5\32\16\2\u0182"+
		"\u0185\5\34\17\2\u0183\u0185\5\u0098M\2\u0184\u017f\3\2\2\2\u0184\u0180"+
		"\3\2\2\2\u0184\u0181\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185"+
		"\31\3\2\2\2\u0186\u0188\5.\30\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2"+
		"\2\u0188\u0189\3\2\2\2\u0189\u018b\7S\2\2\u018a\u018c\7\u00c3\2\2\u018b"+
		"\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\5\u00fc"+
		"\177\2\u018e\u0190\5\"\22\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0192\7\u00d1\2\2\u0192\u0193\5r:\2\u0193\u0199\7"+
		"\u00d2\2\2\u0194\u0196\7\u00d8\2\2\u0195\u0197\7\u00d0\2\2\u0196\u0195"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\5v<\2\u0199"+
		"\u0194\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\5<"+
		"\37\2\u019c\33\3\2\2\2\u019d\u019f\5.\30\2\u019e\u019d\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u01a2\7o\2\2\u01a1\u01a0\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a5\5\u00fa~\2\u01a4\u01a3"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a8\7m\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01bf\3\2\2\2\u01a9\u01aa\5\36"+
		"\20\2\u01aa\u01ac\5\u00fc\177\2\u01ab\u01ad\5\"\22\2\u01ac\u01ab\3\2\2"+
		"\2\u01ac\u01ad\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01af\7M\2\2\u01af\u01b1"+
		"\5\u00b8]\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b4\3\2\2"+
		"\2\u01b2\u01b3\7W\2\2\u01b3\u01b5\5 \21\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5"+
		"\3\2\2\2\u01b5\u01c0\3\2\2\2\u01b6\u01b7\7a\2\2\u01b7\u01b9\5\u00fc\177"+
		"\2\u01b8\u01ba\5\"\22\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bd\3\2\2\2\u01bb\u01bc\7M\2\2\u01bc\u01be\5 \21\2\u01bd\u01bb\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01a9\3\2\2\2\u01bf"+
		"\u01b6\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c5\7\u00d5\2\2\u01c2\u01c4"+
		"\5\u0080A\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2"+
		"\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9"+
		"\7\u00d6\2\2\u01c9\35\3\2\2\2\u01ca\u01cb\t\3\2\2\u01cb\37\3\2\2\2\u01cc"+
		"\u01d1\5\u00b8]\2\u01cd\u01ce\7\u00d7\2\2\u01ce\u01d0\5\u00b8]\2\u01cf"+
		"\u01cd\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2!\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\7\u009f\2\2\u01d5"+
		"\u01d6\5$\23\2\u01d6\u01d7\7\u00a0\2\2\u01d7\u01e3\3\2\2\2\u01d8\u01d9"+
		"\7\u009f\2\2\u01d9\u01da\5&\24\2\u01da\u01db\7\u00a0\2\2\u01db\u01e3\3"+
		"\2\2\2\u01dc\u01dd\7\u009f\2\2\u01dd\u01de\5$\23\2\u01de\u01df\7\u00d7"+
		"\2\2\u01df\u01e0\5&\24\2\u01e0\u01e1\7\u00a0\2\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01d4\3\2\2\2\u01e2\u01d8\3\2\2\2\u01e2\u01dc\3\2\2\2\u01e3#\3\2\2\2"+
		"\u01e4\u01e9\5(\25\2\u01e5\u01e6\7\u00d7\2\2\u01e6\u01e8\5(\25\2\u01e7"+
		"\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea%\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01f1\5*\26\2\u01ed\u01ee"+
		"\7\u00d7\2\2\u01ee\u01f0\5*\26\2\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2\2"+
		"\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\'\3\2\2\2\u01f3\u01f1"+
		"\3\2\2\2\u01f4\u01f6\5.\30\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01f8\5\u00fc\177\2\u01f8)\3\2\2\2\u01f9\u01fb\5"+
		".\30\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fd\5\u00fc\177\2\u01fd\u0200\7\u00da\2\2\u01fe\u0201\5\u00b8]\2\u01ff"+
		"\u0201\5\u0104\u0083\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201+"+
		"\3\2\2\2\u0202\u0203\7\u009f\2\2\u0203\u0208\5\u00ba^\2\u0204\u0205\7"+
		"\u00d7\2\2\u0205\u0207\5\u00ba^\2\u0206\u0204\3\2\2\2\u0207\u020a\3\2"+
		"\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020b\u020c\7\u00a0\2\2\u020c-\3\2\2\2\u020d\u020f\5\60"+
		"\31\2\u020e\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211/\3\2\2\2\u0212\u0216\7-\2\2\u0213\u0214\5\u00fc\177"+
		"\2\u0214\u0215\7\u00d8\2\2\u0215\u0217\3\2\2\2\u0216\u0213\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021d\5\62\32\2\u0219\u021a\7"+
		"\u00d7\2\2\u021a\u021c\5\62\32\2\u021b\u0219\3\2\2\2\u021c\u021f\3\2\2"+
		"\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u021d"+
		"\3\2\2\2\u0220\u0221\7\u00d4\2\2\u0221\61\3\2\2\2\u0222\u0224\5\u00c0"+
		"a\2\u0223\u0225\5\u00c8e\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\63\3\2\2\2\u0226\u0228\5\66\34\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2"+
		"\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\65\3\2\2\2\u022b\u0229"+
		"\3\2\2\2\u022c\u0230\58\35\2\u022d\u0230\5\32\16\2\u022e\u0230\5\34\17"+
		"\2\u022f\u022c\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u022e\3\2\2\2\u0230\67"+
		"\3\2\2\2\u0231\u0232\5\u00fc\177\2\u0232\u0233\7\u00d8\2\2\u0233\u024d"+
		"\3\2\2\2\u0234\u024d\5<\37\2\u0235\u024d\5> \2\u0236\u024d\5H%\2\u0237"+
		"\u024d\5J&\2\u0238\u024d\5L\'\2\u0239\u024d\5R*\2\u023a\u024d\5V,\2\u023b"+
		"\u024d\5X-\2\u023c\u024d\5Z.\2\u023d\u023e\5\u00aeX\2\u023e\u023f\7\u00d9"+
		"\2\2\u023f\u024d\3\2\2\2\u0240\u024d\5x=\2\u0241\u024d\5~@\2\u0242\u024d"+
		"\5|?\2\u0243\u024d\5\\/\2\u0244\u024d\5^\60\2\u0245\u024d\5`\61\2\u0246"+
		"\u024d\5b\62\2\u0247\u024d\5h\65\2\u0248\u024d\5j\66\2\u0249\u024d\5l"+
		"\67\2\u024a\u024d\5:\36\2\u024b\u024d\5n8\2\u024c\u0231\3\2\2\2\u024c"+
		"\u0234\3\2\2\2\u024c\u0235\3\2\2\2\u024c\u0236\3\2\2\2\u024c\u0237\3\2"+
		"\2\2\u024c\u0238\3\2\2\2\u024c\u0239\3\2\2\2\u024c\u023a\3\2\2\2\u024c"+
		"\u023b\3\2\2\2\u024c\u023c\3\2\2\2\u024c\u023d\3\2\2\2\u024c\u0240\3\2"+
		"\2\2\u024c\u0241\3\2\2\2\u024c\u0242\3\2\2\2\u024c\u0243\3\2\2\2\u024c"+
		"\u0244\3\2\2\2\u024c\u0245\3\2\2\2\u024c\u0246\3\2\2\2\u024c\u0247\3\2"+
		"\2\2\u024c\u0248\3\2\2\2\u024c\u0249\3\2\2\2\u024c\u024a\3\2\2\2\u024c"+
		"\u024b\3\2\2\2\u024d9\3\2\2\2\u024e\u024f\7\u00d9\2\2\u024f;\3\2\2\2\u0250"+
		"\u0251\7\u00d5\2\2\u0251\u0252\5\64\33\2\u0252\u0253\7\u00d6\2\2\u0253"+
		"=\3\2\2\2\u0254\u0255\7V\2\2\u0255\u0256\5\u009cO\2\u0256\u025a\58\35"+
		"\2\u0257\u0259\5@!\2\u0258\u0257\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025d"+
		"\u025f\5D#\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0271\3\2\2"+
		"\2\u0260\u0261\7V\2\2\u0261\u0262\5\u009cO\2\u0262\u0263\7\u00d8\2\2\u0263"+
		"\u0267\5\64\33\2\u0264\u0266\5B\"\2\u0265\u0264\3\2\2\2\u0266\u0269\3"+
		"\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026b\3\2\2\2\u0269"+
		"\u0267\3\2\2\2\u026a\u026c\5F$\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2"+
		"\2\u026c\u026d\3\2\2\2\u026d\u026e\7H\2\2\u026e\u026f\7\u00d9\2\2\u026f"+
		"\u0271\3\2\2\2\u0270\u0254\3\2\2\2\u0270\u0260\3\2\2\2\u0271?\3\2\2\2"+
		"\u0272\u0273\7C\2\2\u0273\u0274\5\u009cO\2\u0274\u0275\58\35\2\u0275A"+
		"\3\2\2\2\u0276\u0277\7C\2\2\u0277\u0278\5\u009cO\2\u0278\u0279\7\u00d8"+
		"\2\2\u0279\u027a\5\64\33\2\u027aC\3\2\2\2\u027b\u027c\7B\2\2\u027c\u027d"+
		"\58\35\2\u027dE\3\2\2\2\u027e\u027f\7B\2\2\u027f\u0280\7\u00d8\2\2\u0280"+
		"\u0281\5\64\33\2\u0281G\3\2\2\2\u0282\u0283\7\u0082\2\2\u0283\u028a\5"+
		"\u009cO\2\u0284\u028b\58\35\2\u0285\u0286\7\u00d8\2\2\u0286\u0287\5\64"+
		"\33\2\u0287\u0288\7J\2\2\u0288\u0289\7\u00d9\2\2\u0289\u028b\3\2\2\2\u028a"+
		"\u0284\3\2\2\2\u028a\u0285\3\2\2\2\u028bI\3\2\2\2\u028c\u028d\7>\2\2\u028d"+
		"\u028e\58\35\2\u028e\u028f\7\u0082\2\2\u028f\u0290\5\u009cO\2\u0290\u0291"+
		"\7\u00d9\2\2\u0291K\3\2\2\2\u0292\u0293\7Q\2\2\u0293\u0295\7\u00d1\2\2"+
		"\u0294\u0296\5N(\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297\u0299\7\u00d9\2\2\u0298\u029a\5\u009aN\2\u0299\u0298\3"+
		"\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\7\u00d9\2\2"+
		"\u029c\u029e\5P)\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a6\7\u00d2\2\2\u02a0\u02a7\58\35\2\u02a1\u02a2\7\u00d8"+
		"\2\2\u02a2\u02a3\5\64\33\2\u02a3\u02a4\7F\2\2\u02a4\u02a5\7\u00d9\2\2"+
		"\u02a5\u02a7\3\2\2\2\u02a6\u02a0\3\2\2\2\u02a6\u02a1\3\2\2\2\u02a7M\3"+
		"\2\2\2\u02a8\u02a9\5\u009aN\2\u02a9O\3\2\2\2\u02aa\u02ab\5\u009aN\2\u02ab"+
		"Q\3\2\2\2\u02ac\u02ad\7x\2\2\u02ad\u02c5\5\u009cO\2\u02ae\u02b0\7\u00d5"+
		"\2\2\u02af\u02b1\7\u00d9\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02b5\3\2\2\2\u02b2\u02b4\5T+\2\u02b3\u02b2\3\2\2\2\u02b4\u02b7\3\2\2"+
		"\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b5"+
		"\3\2\2\2\u02b8\u02c6\7\u00d6\2\2\u02b9\u02bb\7\u00d8\2\2\u02ba\u02bc\7"+
		"\u00d9\2\2\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02c0\3\2\2\2"+
		"\u02bd\u02bf\5T+\2\u02be\u02bd\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be"+
		"\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3"+
		"\u02c4\7I\2\2\u02c4\u02c6\7\u00d9\2\2\u02c5\u02ae\3\2\2\2\u02c5\u02b9"+
		"\3\2\2\2\u02c6S\3\2\2\2\u02c7\u02c8\7\66\2\2\u02c8\u02cb\5\u009eP\2\u02c9"+
		"\u02cb\7=\2\2\u02ca\u02c7\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cb\u02cc\3\2"+
		"\2\2\u02cc\u02ce\t\4\2\2\u02cd\u02ca\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\5\64"+
		"\33\2\u02d2U\3\2\2\2\u02d3\u02d5\7\64\2\2\u02d4\u02d6\5\u009eP\2\u02d5"+
		"\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\7\u00d9"+
		"\2\2\u02d8W\3\2\2\2\u02d9\u02db\7;\2\2\u02da\u02dc\5\u009eP\2\u02db\u02da"+
		"\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\7\u00d9\2"+
		"\2\u02deY\3\2\2\2\u02df\u02e1\7u\2\2\u02e0\u02e2\5\u009eP\2\u02e1\u02e0"+
		"\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\7\u00d9\2"+
		"\2\u02e4[\3\2\2\2\u02e5\u02e6\5\u009eP\2\u02e6\u02e7\7\u00d9\2\2\u02e7"+
		"]\3\2\2\2\u02e8\u02e9\7\177\2\2\u02e9\u02ea\7\u00d1\2\2\u02ea\u02eb\5"+
		"\u00dep\2\u02eb\u02ec\7\u00d2\2\2\u02ec\u02ed\7\u00d9\2\2\u02ed_\3\2\2"+
		"\2\u02ee\u0315\7R\2\2\u02ef\u02f0\7\u00d1\2\2\u02f0\u02f1\5\u00e0q\2\u02f1"+
		"\u02f3\7\60\2\2\u02f2\u02f4\7\u00c3\2\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02fb\5\u00a0Q\2\u02f6\u02f8\7\u00a1"+
		"\2\2\u02f7\u02f9\7\u00c3\2\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\u02fa\3\2\2\2\u02fa\u02fc\5\u00e0q\2\u02fb\u02f6\3\2\2\2\u02fb\u02fc"+
		"\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\7\u00d2\2\2\u02fe\u0316\3\2\2"+
		"\2\u02ff\u0300\7\u00d1\2\2\u0300\u0301\5\u009eP\2\u0301\u0302\7\60\2\2"+
		"\u0302\u0308\5\u00a0Q\2\u0303\u0305\7\u00a1\2\2\u0304\u0306\7\u00c3\2"+
		"\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309"+
		"\5\u00e0q\2\u0308\u0303\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2"+
		"\2\u030a\u030b\7\u00d2\2\2\u030b\u0316\3\2\2\2\u030c\u030d\7\u00d1\2\2"+
		"\u030d\u030e\5\u00e0q\2\u030e\u030f\7\60\2\2\u030f\u0310\7c\2\2\u0310"+
		"\u0311\7\u00d1\2\2\u0311\u0312\5\u00f6|\2\u0312\u0313\7\u00d2\2\2\u0313"+
		"\u0314\7\u00d2\2\2\u0314\u0316\3\2\2\2\u0315\u02ef\3\2\2\2\u0315\u02ff"+
		"\3\2\2\2\u0315\u030c\3\2\2\2\u0316\u031d\3\2\2\2\u0317\u031e\58\35\2\u0318"+
		"\u0319\7\u00d8\2\2\u0319\u031a\5\64\33\2\u031a\u031b\7G\2\2\u031b\u031c"+
		"\7\u00d9\2\2\u031c\u031e\3\2\2\2\u031d\u0317\3\2\2\2\u031d\u0318\3\2\2"+
		"\2\u031ea\3\2\2\2\u031f\u0320\7{\2\2\u0320\u0330\5<\37\2\u0321\u0323\5"+
		"d\63\2\u0322\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0322\3\2\2\2\u0324"+
		"\u0325\3\2\2\2\u0325\u0327\3\2\2\2\u0326\u0328\5f\64\2\u0327\u0326\3\2"+
		"\2\2\u0327\u0328\3\2\2\2\u0328\u0331\3\2\2\2\u0329\u032b\5d\63\2\u032a"+
		"\u0329\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2"+
		"\2\2\u032d\u032f\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0331\5f\64\2\u0330"+
		"\u0322\3\2\2\2\u0330\u032c\3\2\2\2\u0331c\3\2\2\2\u0332\u0333\7\67\2\2"+
		"\u0333\u0334\7\u00d1\2\2\u0334\u0339\5\u00b8]\2\u0335\u0336\7\u00c4\2"+
		"\2\u0336\u0338\5\u00b8]\2\u0337\u0335\3\2\2\2\u0338\u033b\3\2\2\2\u0339"+
		"\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\3\2\2\2\u033b\u0339\3\2"+
		"\2\2\u033c\u033d\7\u00dd\2\2\u033d\u033e\7\u00d2\2\2\u033e\u033f\5<\37"+
		"\2\u033fe\3\2\2\2\u0340\u0341\7O\2\2\u0341\u0342\5<\37\2\u0342g\3\2\2"+
		"\2\u0343\u0344\7y\2\2\u0344\u0345\5\u009eP\2\u0345\u0346\7\u00d9\2\2\u0346"+
		"i\3\2\2\2\u0347\u0348\7U\2\2\u0348\u0349\5\u00fc\177\2\u0349\u034a\7\u00d9"+
		"\2\2\u034ak\3\2\2\2\u034b\u034c\7<\2\2\u034c\u034d\7\u00d1\2\2\u034d\u034e"+
		"\5p9\2\u034e\u0355\7\u00d2\2\2\u034f\u0356\58\35\2\u0350\u0351\7\u00d8"+
		"\2\2\u0351\u0352\5\64\33\2\u0352\u0353\7E\2\2\u0353\u0354\7\u00d9\2\2"+
		"\u0354\u0356\3\2\2\2\u0355\u034f\3\2\2\2\u0355\u0350\3\2\2\2\u0356m\3"+
		"\2\2\2\u0357\u0359\5\4\3\2\u0358\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a"+
		"\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035bo\3\2\2\2\u035c\u0361\5\u0096"+
		"L\2\u035d\u035e\7\u00d7\2\2\u035e\u0360\5\u0096L\2\u035f\u035d\3\2\2\2"+
		"\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362q\3"+
		"\2\2\2\u0363\u0361\3\2\2\2\u0364\u0366\5t;\2\u0365\u0364\3\2\2\2\u0365"+
		"\u0366\3\2\2\2\u0366\u036b\3\2\2\2\u0367\u0368\7\u00d7\2\2\u0368\u036a"+
		"\5t;\2\u0369\u0367\3\2\2\2\u036a\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036b"+
		"\u036c\3\2\2\2\u036c\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u0370\7\u00d7"+
		"\2\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370s\3\2\2\2\u0371\u0373"+
		"\5.\30\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375\3\2\2\2\u0374"+
		"\u0376\5\u00fe\u0080\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378"+
		"\3\2\2\2\u0377\u0379\7\u00d0\2\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2"+
		"\2\u0379\u037b\3\2\2\2\u037a\u037c\5v<\2\u037b\u037a\3\2\2\2\u037b\u037c"+
		"\3\2\2\2\u037c\u037e\3\2\2\2\u037d\u037f\7\u00c3\2\2\u037e\u037d\3\2\2"+
		"\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380\u0382\7\u00c0\2\2\u0381"+
		"\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\5\u0094"+
		"K\2\u0384u\3\2\2\2\u0385\u0386\b<\1\2\u0386\u038a\5\u00b8]\2\u0387\u038a"+
		"\7\65\2\2\u0388\u038a\5\u0104\u0083\2\u0389\u0385\3\2\2\2\u0389\u0387"+
		"\3\2\2\2\u0389\u0388\3\2\2\2\u038a\u0390\3\2\2\2\u038b\u038c\f\3\2\2\u038c"+
		"\u038d\7\u00c4\2\2\u038d\u038f\5v<\4\u038e\u038b\3\2\2\2\u038f\u0392\3"+
		"\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391w\3\2\2\2\u0392\u0390"+
		"\3\2\2\2\u0393\u0394\7T\2\2\u0394\u0399\5z>\2\u0395\u0396\7\u00d7\2\2"+
		"\u0396\u0398\5z>\2\u0397\u0395\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397"+
		"\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039c\3\2\2\2\u039b\u0399\3\2\2\2\u039c"+
		"\u039d\7\u00d9\2\2\u039dy\3\2\2\2\u039e\u03a7\7\u00dd\2\2\u039f\u03a0"+
		"\7\u00ce\2\2\u03a0\u03a7\5\u00e0q\2\u03a1\u03a2\7\u00ce\2\2\u03a2\u03a3"+
		"\7\u00d5\2\2\u03a3\u03a4\5\u009eP\2\u03a4\u03a5\7\u00d6\2\2\u03a5\u03a7"+
		"\3\2\2\2\u03a6\u039e\3\2\2\2\u03a6\u039f\3\2\2\2\u03a6\u03a1\3\2\2\2\u03a7"+
		"{\3\2\2\2\u03a8\u03a9\7A\2\2\u03a9\u03aa\5\u009aN\2\u03aa\u03ab\7\u00d9"+
		"\2\2\u03ab}\3\2\2\2\u03ac\u03ad\7v\2\2\u03ad\u03b2\5\u0094K\2\u03ae\u03af"+
		"\7\u00d7\2\2\u03af\u03b1\5\u0094K\2\u03b0\u03ae\3\2\2\2\u03b1\u03b4\3"+
		"\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4"+
		"\u03b2\3\2\2\2\u03b5\u03b6\7\u00d9\2\2\u03b6\177\3\2\2\2\u03b7\u03b9\5"+
		".\30\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03eb\3\2\2\2\u03ba"+
		"\u03bc\5\u0090I\2\u03bb\u03bd\5v<\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3"+
		"\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c3\5\u0094K\2\u03bf\u03c0\7\u00d7"+
		"\2\2\u03c0\u03c2\5\u0094K\2\u03c1\u03bf\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3"+
		"\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c6\3\2\2\2\u03c5\u03c3\3\2"+
		"\2\2\u03c6\u03c7\7\u00d9\2\2\u03c7\u03ec\3\2\2\2\u03c8\u03ca\5\u0092J"+
		"\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03e9\3\2\2\2\u03cb\u03cd"+
		"\7:\2\2\u03cc\u03ce\5v<\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce"+
		"\u03cf\3\2\2\2\u03cf\u03d4\5\u0096L\2\u03d0\u03d1\7\u00d7\2\2\u03d1\u03d3"+
		"\5\u0096L\2\u03d2\u03d0\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4\u03d2\3\2\2"+
		"\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03d8"+
		"\7\u00d9\2\2\u03d8\u03ea\3\2\2\2\u03d9\u03db\7S\2\2\u03da\u03dc\7\u00c3"+
		"\2\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd"+
		"\u03df\5\u00fc\177\2\u03de\u03e0\5\"\22\2\u03df\u03de\3\2\2\2\u03df\u03e0"+
		"\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\7\u00d1\2\2\u03e2\u03e3\5r:\2"+
		"\u03e3\u03e5\7\u00d2\2\2\u03e4\u03e6\5\u008cG\2\u03e5\u03e4\3\2\2\2\u03e5"+
		"\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\5\u008eH\2\u03e8\u03ea"+
		"\3\2\2\2\u03e9\u03cb\3\2\2\2\u03e9\u03d9\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb"+
		"\u03ba\3\2\2\2\u03eb\u03c9\3\2\2\2\u03ec\u03f2\3\2\2\2\u03ed\u03ee\7\u0080"+
		"\2\2\u03ee\u03ef\5\u00c6d\2\u03ef\u03f0\5\u0082B\2\u03f0\u03f2\3\2\2\2"+
		"\u03f1\u03b8\3\2\2\2\u03f1\u03ed\3\2\2\2\u03f2\u0081\3\2\2\2\u03f3\u03fd"+
		"\7\u00d9\2\2\u03f4\u03f8\7\u00d5\2\2\u03f5\u03f7\5\u0084C\2\u03f6\u03f5"+
		"\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"\u03fb\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u03fd\7\u00d6\2\2\u03fc\u03f3"+
		"\3\2\2\2\u03fc\u03f4\3\2\2\2\u03fd\u0083\3\2\2\2\u03fe\u0401\5\u0086D"+
		"\2\u03ff\u0401\5\u0088E\2\u0400\u03fe\3\2\2\2\u0400\u03ff\3\2\2\2\u0401"+
		"\u0085\3\2\2\2\u0402\u0403\5\u00c0a\2\u0403\u0404\7\u00bd\2\2\u0404\u0405"+
		"\5\u00fc\177\2\u0405\u0406\7\\\2\2\u0406\u0407\5\u00c6d\2\u0407\u0408"+
		"\7\u00d9\2\2\u0408\u0087\3\2\2\2\u0409\u040a\5\u008aF\2\u040a\u0410\7"+
		"\60\2\2\u040b\u0411\5\u00fe\u0080\2\u040c\u040e\5\u00fe\u0080\2\u040d"+
		"\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0411\5\u00fc"+
		"\177\2\u0410\u040b\3\2\2\2\u0410\u040d\3\2\2\2\u0411\u0412\3\2\2\2\u0412"+
		"\u0413\7\u00d9\2\2\u0413\u0089\3\2\2\2\u0414\u0415\5\u00c0a\2\u0415\u0416"+
		"\7\u00bd\2\2\u0416\u0418\3\2\2\2\u0417\u0414\3\2\2\2\u0417\u0418\3\2\2"+
		"\2\u0418\u0419\3\2\2\2\u0419\u041a\5\u00fc\177\2\u041a\u008b\3\2\2\2\u041b"+
		"\u041c\7\u00d8\2\2\u041c\u041e\5\u00fc\177\2\u041d\u041f\5\u00c8e\2\u041e"+
		"\u041d\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u008d\3\2\2\2\u0420\u0423\7\u00d9"+
		"\2\2\u0421\u0423\5<\37\2\u0422\u0420\3\2\2\2\u0422\u0421\3\2\2\2\u0423"+
		"\u008f\3\2\2\2\u0424\u0427\5\u0092J\2\u0425\u0427\7\u0081\2\2\u0426\u0424"+
		"\3\2\2\2\u0426\u0425\3\2\2\2\u0427\u0091\3\2\2\2\u0428\u042a\5\u00fe\u0080"+
		"\2\u0429\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u0429\3\2\2\2\u042b\u042c"+
		"\3\2\2\2\u042c\u0093\3\2\2\2\u042d\u0430\7\u00dd\2\2\u042e\u042f\7\u00da"+
		"\2\2\u042f\u0431\5\u00ceh\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431"+
		"\u0095\3\2\2\2\u0432\u0433\5\u00fc\177\2\u0433\u0434\7\u00da\2\2\u0434"+
		"\u0435\5\u00ceh\2\u0435\u0097\3\2\2\2\u0436\u0438\5.\30\2\u0437\u0436"+
		"\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\7:\2\2\u043a"+
		"\u043f\5\u0096L\2\u043b\u043c\7\u00d7\2\2\u043c\u043e\5\u0096L\2\u043d"+
		"\u043b\3\2\2\2\u043e\u0441\3\2\2\2\u043f\u043d\3\2\2\2\u043f\u0440\3\2"+
		"\2\2\u0440\u0442\3\2\2\2\u0441\u043f\3\2\2\2\u0442\u0443\7\u00d9\2\2\u0443"+
		"\u0099\3\2\2\2\u0444\u0449\5\u009eP\2\u0445\u0446\7\u00d7\2\2\u0446\u0448"+
		"\5\u009eP\2\u0447\u0445\3\2\2\2\u0448\u044b\3\2\2\2\u0449\u0447\3\2\2"+
		"\2\u0449\u044a\3\2\2\2\u044a\u009b\3\2\2\2\u044b\u0449\3\2\2\2\u044c\u044f"+
		"\7\u00d1\2\2\u044d\u0450\5\u009eP\2\u044e\u0450\5\u00aeX\2\u044f\u044d"+
		"\3\2\2\2\u044f\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\7\u00d2\2"+
		"\2\u0452\u009d\3\2\2\2\u0453\u0454\bP\1\2\u0454\u0455\79\2\2\u0455\u04aa"+
		"\5\u009eP\61\u0456\u04aa\5\u00aaV\2\u0457\u0458\5\u00d8m\2\u0458\u0459"+
		"\7\u00d3\2\2\u0459\u045a\5\u009eP\2\u045a\u045b\7\u00d4\2\2\u045b\u04aa"+
		"\3\2\2\2\u045c\u045d\7\u00d1\2\2\u045d\u045e\5\u0106\u0084\2\u045e\u045f"+
		"\7\u00d2\2\2\u045f\u0460\5\u009eP.\u0460\u04aa\3\2\2\2\u0461\u0462\t\5"+
		"\2\2\u0462\u04aa\5\u009eP-\u0463\u0464\t\6\2\2\u0464\u04aa\5\u009eP,\u0465"+
		"\u0466\t\7\2\2\u0466\u04aa\5\u00e0q\2\u0467\u0468\5\u00e0q\2\u0468\u0469"+
		"\t\7\2\2\u0469\u04aa\3\2\2\2\u046a\u046b\7n\2\2\u046b\u04aa\5\u009eP)"+
		"\u046c\u04aa\5\u00e0q\2\u046d\u04aa\5\u00d0i\2\u046e\u04aa\5\u00dan\2"+
		"\u046f\u04aa\7\u00de\2\2\u0470\u04aa\7\u00e4\2\2\u0471\u04aa\5\u009cO"+
		"\2\u0472\u04aa\5\u00a2R\2\u0473\u04aa\7\u0083\2\2\u0474\u0475\7c\2\2\u0475"+
		"\u0476\7\u00d1\2\2\u0476\u0477\5\u00f6|\2\u0477\u0478\7\u00d2\2\2\u0478"+
		"\u0479\7\u00da\2\2\u0479\u047a\5\u009eP \u047a\u04aa\3\2\2\2\u047b\u047c"+
		"\7b\2\2\u047c\u047d\7\u00d1\2\2\u047d\u047e\5\u00dep\2\u047e\u047f\7\u00d2"+
		"\2\2\u047f\u04aa\3\2\2\2\u0480\u0481\7D\2\2\u0481\u0482\7\u00d1\2\2\u0482"+
		"\u0483\5\u00e0q\2\u0483\u0484\7\u00d2\2\2\u0484\u04aa\3\2\2\2\u0485\u0486"+
		"\7K\2\2\u0486\u0487\7\u00d1\2\2\u0487\u0488\5\u009eP\2\u0488\u0489\7\u00d2"+
		"\2\2\u0489\u04aa\3\2\2\2\u048a\u048e\7L\2\2\u048b\u048c\7\u00d1\2\2\u048c"+
		"\u048f\7\u00d2\2\2\u048d\u048f\5\u009cO\2\u048e\u048b\3\2\2\2\u048e\u048d"+
		"\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u04aa\3\2\2\2\u0490\u0491\t\b\2\2\u0491"+
		"\u04aa\5\u009eP\33\u0492\u0493\t\t\2\2\u0493\u04aa\5\u009eP\32\u0494\u04aa"+
		"\5\u00a4S\2\u0495\u04aa\5\u00a6T\2\u0496\u0497\7y\2\2\u0497\u04aa\5\u009e"+
		"P\b\u0498\u0499\5\u00a0Q\2\u0499\u049b\5\u00acW\2\u049a\u049c\5.\30\2"+
		"\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e"+
		"\5\u009eP\7\u049e\u04aa\3\2\2\2\u049f\u04a0\5\u00a0Q\2\u04a0\u04a2\7\u00da"+
		"\2\2\u04a1\u04a3\5.\30\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3"+
		"\u04a4\3\2\2\2\u04a4\u04a7\7\u00c3\2\2\u04a5\u04a8\5\u00e0q\2\u04a6\u04a8"+
		"\5\u00aaV\2\u04a7\u04a5\3\2\2\2\u04a7\u04a6\3\2\2\2\u04a8\u04aa\3\2\2"+
		"\2\u04a9\u0453\3\2\2\2\u04a9\u0456\3\2\2\2\u04a9\u0457\3\2\2\2\u04a9\u045c"+
		"\3\2\2\2\u04a9\u0461\3\2\2\2\u04a9\u0463\3\2\2\2\u04a9\u0465\3\2\2\2\u04a9"+
		"\u0467\3\2\2\2\u04a9\u046a\3\2\2\2\u04a9\u046c\3\2\2\2\u04a9\u046d\3\2"+
		"\2\2\u04a9\u046e\3\2\2\2\u04a9\u046f\3\2\2\2\u04a9\u0470\3\2\2\2\u04a9"+
		"\u0471\3\2\2\2\u04a9\u0472\3\2\2\2\u04a9\u0473\3\2\2\2\u04a9\u0474\3\2"+
		"\2\2\u04a9\u047b\3\2\2\2\u04a9\u0480\3\2\2\2\u04a9\u0485\3\2\2\2\u04a9"+
		"\u048a\3\2\2\2\u04a9\u0490\3\2\2\2\u04a9\u0492\3\2\2\2\u04a9\u0494\3\2"+
		"\2\2\u04a9\u0495\3\2\2\2\u04a9\u0496\3\2\2\2\u04a9\u0498\3\2\2\2\u04a9"+
		"\u049f\3\2\2\2\u04aa\u04e7\3\2\2\2\u04ab\u04ac\f\27\2\2\u04ac\u04ad\7"+
		"\u00ad\2\2\u04ad\u04e6\5\u009eP\27\u04ae\u04af\f\25\2\2\u04af\u04b0\t"+
		"\n\2\2\u04b0\u04e6\5\u009eP\26\u04b1\u04b2\f\24\2\2\u04b2\u04b3\t\13\2"+
		"\2\u04b3\u04e6\5\u009eP\25\u04b4\u04b5\f\23\2\2\u04b5\u04b6\t\f\2\2\u04b6"+
		"\u04e6\5\u009eP\24\u04b7\u04b8\f\22\2\2\u04b8\u04b9\t\r\2\2\u04b9\u04e6"+
		"\5\u009eP\23\u04ba\u04bb\f\21\2\2\u04bb\u04bc\t\16\2\2\u04bc\u04e6\5\u009e"+
		"P\22\u04bd\u04be\f\20\2\2\u04be\u04bf\7\u00c3\2\2\u04bf\u04e6\5\u009e"+
		"P\21\u04c0\u04c1\f\17\2\2\u04c1\u04c2\7\u00c6\2\2\u04c2\u04e6\5\u009e"+
		"P\20\u04c3\u04c4\f\16\2\2\u04c4\u04c5\7\u00c4\2\2\u04c5\u04e6\5\u009e"+
		"P\17\u04c6\u04c7\f\r\2\2\u04c7\u04c8\7\u00b8\2\2\u04c8\u04e6\5\u009eP"+
		"\16\u04c9\u04ca\f\f\2\2\u04ca\u04cb\7\u00b7\2\2\u04cb\u04e6\5\u009eP\r"+
		"\u04cc\u04cd\f\13\2\2\u04cd\u04cf\7\u00d0\2\2\u04ce\u04d0\5\u009eP\2\u04cf"+
		"\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\7\u00d8"+
		"\2\2\u04d2\u04e6\5\u009eP\f\u04d3\u04d4\f\n\2\2\u04d4\u04d5\7\u00b9\2"+
		"\2\u04d5\u04e6\5\u009eP\13\u04d6\u04d7\f\t\2\2\u04d7\u04d8\7\u009e\2\2"+
		"\u04d8\u04e6\5\u009eP\n\u04d9\u04da\f\5\2\2\u04da\u04db\7d\2\2\u04db\u04e6"+
		"\5\u009eP\6\u04dc\u04dd\f\4\2\2\u04dd\u04de\7f\2\2\u04de\u04e6\5\u009e"+
		"P\5\u04df\u04e0\f\3\2\2\u04e0\u04e1\7e\2\2\u04e1\u04e6\5\u009eP\4\u04e2"+
		"\u04e3\f\26\2\2\u04e3\u04e4\7[\2\2\u04e4\u04e6\5\u00ba^\2\u04e5\u04ab"+
		"\3\2\2\2\u04e5\u04ae\3\2\2\2\u04e5\u04b1\3\2\2\2\u04e5\u04b4\3\2\2\2\u04e5"+
		"\u04b7\3\2\2\2\u04e5\u04ba\3\2\2\2\u04e5\u04bd\3\2\2\2\u04e5\u04c0\3\2"+
		"\2\2\u04e5\u04c3\3\2\2\2\u04e5\u04c6\3\2\2\2\u04e5\u04c9\3\2\2\2\u04e5"+
		"\u04cc\3\2\2\2\u04e5\u04d3\3\2\2\2\u04e5\u04d6\3\2\2\2\u04e5\u04d9\3\2"+
		"\2\2\u04e5\u04dc\3\2\2\2\u04e5\u04df\3\2\2\2\u04e5\u04e2\3\2\2\2\u04e6"+
		"\u04e9\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u009f\3\2"+
		"\2\2\u04e9\u04e7\3\2\2\2\u04ea\u04ed\5\u00e0q\2\u04eb\u04ed\5\u00a2R\2"+
		"\u04ec\u04ea\3\2\2\2\u04ec\u04eb\3\2\2\2\u04ed\u00a1\3\2\2\2\u04ee\u04ef"+
		"\7/\2\2\u04ef\u04f1\7\u00d1\2\2\u04f0\u04f2\5\u00b0Y\2\u04f1\u04f0\3\2"+
		"\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04fa\7\u00d2\2\2\u04f4"+
		"\u04f6\7\u00d3\2\2\u04f5\u04f7\5\u00b0Y\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7"+
		"\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa\7\u00d4\2\2\u04f9\u04ee\3\2\2"+
		"\2\u04f9\u04f4\3\2\2\2\u04fa\u04ff\3\2\2\2\u04fb\u04fc\7\u00d3\2\2\u04fc"+
		"\u04fd\5\u009eP\2\u04fd\u04fe\7\u00d4\2\2\u04fe\u0500\3\2\2\2\u04ff\u04fb"+
		"\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u00a3\3\2\2\2\u0501\u0503\7v\2\2\u0502"+
		"\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0506\7S"+
		"\2\2\u0505\u0507\7\u00c3\2\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2\2\2\u0507"+
		"\u0508\3\2\2\2\u0508\u0509\7\u00d1\2\2\u0509\u050a\5r:\2\u050a\u050c\7"+
		"\u00d2\2\2\u050b\u050d\5\u00b4[\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2"+
		"\2\2\u050d\u0510\3\2\2\2\u050e\u050f\7\u00d8\2\2\u050f\u0511\5v<\2\u0510"+
		"\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\5<"+
		"\37\2\u0513\u051c\3\2\2\2\u0514\u0515\7\u0085\2\2\u0515\u0516\7\u00d1"+
		"\2\2\u0516\u0517\5r:\2\u0517\u0518\7\u00d2\2\2\u0518\u0519\7\u00a1\2\2"+
		"\u0519\u051a\5\u009eP\2\u051a\u051c\3\2\2\2\u051b\u0502\3\2\2\2\u051b"+
		"\u0514\3\2\2\2\u051c\u00a5\3\2\2\2\u051d\u051e\7g\2\2\u051e\u051f\7\u00d1"+
		"\2\2\u051f\u0520\5\u009eP\2\u0520\u0521\7\u00d2\2\2\u0521\u0522\7\u00d5"+
		"\2\2\u0522\u0527\5\u00a8U\2\u0523\u0524\7\u00d7\2\2\u0524\u0526\5\u00a8"+
		"U\2\u0525\u0523\3\2\2\2\u0526\u0529\3\2\2\2\u0527\u0525\3\2\2\2\u0527"+
		"\u0528\3\2\2\2\u0528\u052b\3\2\2\2\u0529\u0527\3\2\2\2\u052a\u052c\7\u00d7"+
		"\2\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\3\2\2\2\u052d"+
		"\u052e\7\u00d6\2\2\u052e\u00a7\3\2\2\2\u052f\u0534\5\u009eP\2\u0530\u0531"+
		"\7\u00d7\2\2\u0531\u0533\5\u009eP\2\u0532\u0530\3\2\2\2\u0533\u0536\3"+
		"\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\3\2\2\2\u0536"+
		"\u0534\3\2\2\2\u0537\u0538\7\u00a1\2\2\u0538\u0539\5\u009eP\2\u0539\u00a9"+
		"\3\2\2\2\u053a\u053b\7i\2\2\u053b\u053d\5\u00ba^\2\u053c\u053e\5\u00c8"+
		"e\2\u053d\u053c\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u00ab\3\2\2\2\u053f"+
		"\u0540\t\17\2\2\u0540\u00ad\3\2\2\2\u0541\u0549\7\u0083\2\2\u0542\u0545"+
		"\5\u009eP\2\u0543\u0544\7\u00a1\2\2\u0544\u0546\5\u009eP\2\u0545\u0543"+
		"\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u054a\3\2\2\2\u0547\u0548\7\u0084\2"+
		"\2\u0548\u054a\5\u009eP\2\u0549\u0542\3\2\2\2\u0549\u0547\3\2\2\2\u054a"+
		"\u00af\3\2\2\2\u054b\u0550\5\u00b2Z\2\u054c\u054d\7\u00d7\2\2\u054d\u054f"+
		"\5\u00b2Z\2\u054e\u054c\3\2\2\2\u054f\u0552\3\2\2\2\u0550\u054e\3\2\2"+
		"\2\u0550\u0551\3\2\2\2\u0551\u0554\3\2\2\2\u0552\u0550\3\2\2\2\u0553\u0555"+
		"\7\u00d7\2\2\u0554\u0553\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u00b1\3\2\2"+
		"\2\u0556\u0559\5\u009eP\2\u0557\u0558\7\u00a1\2\2\u0558\u055a\5\u009e"+
		"P\2\u0559\u0557\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u0563\3\2\2\2\u055b"+
		"\u055c\5\u009eP\2\u055c\u055d\7\u00a1\2\2\u055d\u055f\3\2\2\2\u055e\u055b"+
		"\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\7\u00c3\2"+
		"\2\u0561\u0563\5\u00e0q\2\u0562\u0556\3\2\2\2\u0562\u055e\3\2\2\2\u0563"+
		"\u00b3\3\2\2\2\u0564\u0565\7\u0080\2\2\u0565\u0566\7\u00d1\2\2\u0566\u056b"+
		"\5\u00b6\\\2\u0567\u0568\7\u00d7\2\2\u0568\u056a\5\u00b6\\\2\u0569\u0567"+
		"\3\2\2\2\u056a\u056d\3\2\2\2\u056b\u0569\3\2\2\2\u056b\u056c\3\2\2\2\u056c"+
		"\u056e\3\2\2\2\u056d\u056b\3\2\2\2\u056e\u056f\7\u00d2\2\2\u056f\u00b5"+
		"\3\2\2\2\u0570\u0572\7\u00c3\2\2\u0571\u0570\3\2\2\2\u0571\u0572\3\2\2"+
		"\2\u0572\u0573\3\2\2\2\u0573\u0574\7\u00dd\2\2\u0574\u00b7\3\2\2\2\u0575"+
		"\u0577\5\u00c0a\2\u0576\u0578\5,\27\2\u0577\u0576\3\2\2\2\u0577\u0578"+
		"\3\2\2\2\u0578\u057b\3\2\2\2\u0579\u057b\7v\2\2\u057a\u0575\3\2\2\2\u057a"+
		"\u0579\3\2\2\2\u057b\u00b9\3\2\2\2\u057c\u057f\5\u00c0a\2\u057d\u057f"+
		"\5\u00be`\2\u057e\u057c\3\2\2\2\u057e\u057d\3\2\2\2\u057f\u0581\3\2\2"+
		"\2\u0580\u0582\5,\27\2\u0581\u0580\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0587"+
		"\3\2\2\2\u0583\u0587\5\u0104\u0083\2\u0584\u0587\7v\2\2\u0585\u0587\5"+
		"\u00bc_\2\u0586\u057e\3\2\2\2\u0586\u0583\3\2\2\2\u0586\u0584\3\2\2\2"+
		"\u0586\u0585\3\2\2\2\u0587\u00bb\3\2\2\2\u0588\u058a\5.\30\2\u0589\u0588"+
		"\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058c\3\2\2\2\u058b\u058d\7o\2\2\u058c"+
		"\u058b\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058f\3\2\2\2\u058e\u0590\5\u00fa"+
		"~\2\u058f\u058e\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0592\3\2\2\2\u0591"+
		"\u0593\7m\2\2\u0592\u0591\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u05a9\3\2"+
		"\2\2\u0594\u0596\5\36\20\2\u0595\u0597\5\"\22\2\u0596\u0595\3\2\2\2\u0596"+
		"\u0597\3\2\2\2\u0597\u059a\3\2\2\2\u0598\u0599\7M\2\2\u0599\u059b\5\u00b8"+
		"]\2\u059a\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059e\3\2\2\2\u059c"+
		"\u059d\7W\2\2\u059d\u059f\5 \21\2\u059e\u059c\3\2\2\2\u059e\u059f\3\2"+
		"\2\2\u059f\u05aa\3\2\2\2\u05a0\u05a1\7a\2\2\u05a1\u05a3\5\u00fc\177\2"+
		"\u05a2\u05a4\5\"\22\2\u05a3\u05a2\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a7"+
		"\3\2\2\2\u05a5\u05a6\7M\2\2\u05a6\u05a8\5 \21\2\u05a7\u05a5\3\2\2\2\u05a7"+
		"\u05a8\3\2\2\2\u05a8\u05aa\3\2\2\2\u05a9\u0594\3\2\2\2\u05a9\u05a0\3\2"+
		"\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05af\7\u00d5\2\2\u05ac\u05ae\5\u0080A"+
		"\2\u05ad\u05ac\3\2\2\2\u05ae\u05b1\3\2\2\2\u05af\u05ad\3\2\2\2\u05af\u05b0"+
		"\3\2\2\2\u05b0\u05b2\3\2\2\2\u05b1\u05af\3\2\2\2\u05b2\u05b3\7\u00d6\2"+
		"\2\u05b3\u00bd\3\2\2\2\u05b4\u05b9\5\u00ecw\2\u05b5\u05b6\7\u00be\2\2"+
		"\u05b6\u05b8\5\u00eex\2\u05b7\u05b5\3\2\2\2\u05b8\u05bb\3\2\2\2\u05b9"+
		"\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u00bf\3\2\2\2\u05bb\u05b9\3\2"+
		"\2\2\u05bc\u05be\7h\2\2\u05bd\u05bc\3\2\2\2\u05bd\u05be\3\2\2\2\u05be"+
		"\u05c0\3\2\2\2\u05bf\u05c1\7\u00bf\2\2\u05c0\u05bf\3\2\2\2\u05c0\u05c1"+
		"\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\5\u00c2b\2\u05c3\u00c1\3\2\2"+
		"\2\u05c4\u05d2\5\u00fc\177\2\u05c5\u05ca\5\u00fc\177\2\u05c6\u05c7\7\u00bf"+
		"\2\2\u05c7\u05c9\5\u00fc\177\2\u05c8\u05c6\3\2\2\2\u05c9\u05cc\3\2\2\2"+
		"\u05ca\u05c8\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cf\3\2\2\2\u05cc\u05ca"+
		"\3\2\2\2\u05cd\u05ce\7\u00bf\2\2\u05ce\u05d0\5\u00c4c\2\u05cf\u05cd\3"+
		"\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d2\3\2\2\2\u05d1\u05c4\3\2\2\2\u05d1"+
		"\u05c5\3\2\2\2\u05d2\u00c3\3\2\2\2\u05d3\u05d6\5\u00fc\177\2\u05d4\u05d5"+
		"\7\60\2\2\u05d5\u05d7\5\u00fc\177\2\u05d6\u05d4\3\2\2\2\u05d6\u05d7\3"+
		"\2\2\2\u05d7\u05e7\3\2\2\2\u05d8\u05d9\7\u00d5\2\2\u05d9\u05de\5\u00c4"+
		"c\2\u05da\u05db\7\u00d7\2\2\u05db\u05dd\5\u00c4c\2\u05dc\u05da\3\2\2\2"+
		"\u05dd\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e2"+
		"\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1\u05e3\7\u00d7\2\2\u05e2\u05e1\3\2\2"+
		"\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\7\u00d6\2\2\u05e5"+
		"\u05e7\3\2\2\2\u05e6\u05d3\3\2\2\2\u05e6\u05d8\3\2\2\2\u05e7\u00c5\3\2"+
		"\2\2\u05e8\u05ed\5\u00c0a\2\u05e9\u05ea\7\u00d7\2\2\u05ea\u05ec\5\u00c0"+
		"a\2\u05eb\u05e9\3\2\2\2\u05ec\u05ef\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed"+
		"\u05ee\3\2\2\2\u05ee\u00c7\3\2\2\2\u05ef\u05ed\3\2\2\2\u05f0\u05fa\7\u00d1"+
		"\2\2\u05f1\u05f6\5\u00caf\2\u05f2\u05f3\7\u00d7\2\2\u05f3\u05f5\5\u00ca"+
		"f\2\u05f4\u05f2\3\2\2\2\u05f5\u05f8\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f6"+
		"\u05f7\3\2\2\2\u05f7\u05fb\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f9\u05fb\5\u00ae"+
		"X\2\u05fa\u05f1\3\2\2\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u05fd\3\2\2\2\u05fc\u05fe\7\u00d7\2\2\u05fd\u05fc\3\2\2\2\u05fd\u05fe"+
		"\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0600\7\u00d2\2\2\u0600\u00c9\3\2\2"+
		"\2\u0601\u0603\5\u00ccg\2\u0602\u0601\3\2\2\2\u0602\u0603\3\2\2\2\u0603"+
		"\u0605\3\2\2\2\u0604\u0606\7\u00c0\2\2\u0605\u0604\3\2\2\2\u0605\u0606"+
		"\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u060b\5\u009eP\2\u0608\u0609\7\u00c3"+
		"\2\2\u0609\u060b\5\u00e0q\2\u060a\u0602\3\2\2\2\u060a\u0608\3\2\2\2\u060b"+
		"\u00cb\3\2\2\2\u060c\u060d\5\u00fc\177\2\u060d\u060e\7\u00d8\2\2\u060e"+
		"\u00cd\3\2\2\2\u060f\u0625\5\u00d0i\2\u0610\u0625\5\u00dan\2\u0611\u0612"+
		"\7/\2\2\u0612\u0617\7\u00d1\2\2\u0613\u0615\5\u00b0Y\2\u0614\u0616\7\u00d7"+
		"\2\2\u0615\u0614\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0618\3\2\2\2\u0617"+
		"\u0613\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u0625\7\u00d2"+
		"\2\2\u061a\u061f\7\u00d3\2\2\u061b\u061d\5\u00b0Y\2\u061c\u061e\7\u00d7"+
		"\2\2\u061d\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0620\3\2\2\2\u061f"+
		"\u061b\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0625\7\u00d4"+
		"\2\2\u0622\u0623\t\20\2\2\u0623\u0625\5\u00ceh\2\u0624\u060f\3\2\2\2\u0624"+
		"\u0610\3\2\2\2\u0624\u0611\3\2\2\2\u0624\u061a\3\2\2\2\u0624\u0622\3\2"+
		"\2\2\u0625\u00cf\3\2\2\2\u0626\u062c\7j\2\2\u0627\u062c\5\u00d2j\2\u0628"+
		"\u062c\5\u0100\u0081\2\u0629\u062c\5\u00d6l\2\u062a\u062c\5\u00c0a\2\u062b"+
		"\u0626\3\2\2\2\u062b\u0627\3\2\2\2\u062b\u0628\3\2\2\2\u062b\u0629\3\2"+
		"\2\2\u062b\u062a\3\2\2\2\u062c\u00d1\3\2\2\2\u062d\u0632\7\u00e1\2\2\u062e"+
		"\u0632\7\63\2\2\u062f\u0632\5\u00d4k\2\u0630\u0632\5\u00d8m\2\u0631\u062d"+
		"\3\2\2\2\u0631\u062e\3\2\2\2\u0631\u062f\3\2\2\2\u0631\u0630\3\2\2\2\u0632"+
		"\u00d3\3\2\2\2\u0633\u0634\t\21\2\2\u0634\u00d5\3\2\2\2\u0635\u0636\t"+
		"\22\2\2\u0636\u063b\7\u00bd\2\2\u0637\u063c\5\u00fc\177\2\u0638\u063c"+
		"\7\u008a\2\2\u0639\u063c\7\u0086\2\2\u063a\u063c\7\u0087\2\2\u063b\u0637"+
		"\3\2\2\2\u063b\u0638\3\2\2\2\u063b\u0639\3\2\2\2\u063b\u063a\3\2\2\2\u063c"+
		"\u0648\3\2\2\2\u063d\u0641\5\u00b8]\2\u063e\u0641\5\u00f2z\2\u063f\u0641"+
		"\5\u00dan\2\u0640\u063d\3\2\2\2\u0640\u063e\3\2\2\2\u0640\u063f\3\2\2"+
		"\2\u0641\u0642\3\2\2\2\u0642\u0645\7\u00bd\2\2\u0643\u0646\5\u00fc\177"+
		"\2\u0644\u0646\5\u00f2z\2\u0645\u0643\3\2\2\2\u0645\u0644\3\2\2\2\u0646"+
		"\u0648\3\2\2\2\u0647\u0635\3\2\2\2\u0647\u0640\3\2\2\2\u0648\u00d7\3\2"+
		"\2\2\u0649\u064a\7\u00de\2\2\u064a\u00d9\3\2\2\2\u064b\u064d\7\u00e8\2"+
		"\2\u064c\u064e\7\u00f0\2\2\u064d\u064c\3\2\2\2\u064e\u064f\3\2\2\2\u064f"+
		"\u064d\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0661\3\2\2\2\u0651\u0653\7\u00e7"+
		"\2\2\u0652\u0654\7\u00f0\2\2\u0653\u0652\3\2\2\2\u0654\u0655\3\2\2\2\u0655"+
		"\u0653\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0661\3\2\2\2\u0657\u0661\7\u00e5"+
		"\2\2\u0658\u065c\7\u00e6\2\2\u0659\u065b\5\u00dco\2\u065a\u0659\3\2\2"+
		"\2\u065b\u065e\3\2\2\2\u065c\u065a\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065f"+
		"\3\2\2\2\u065e\u065c\3\2\2\2\u065f\u0661\7\u00e6\2\2\u0660\u064b\3\2\2"+
		"\2\u0660\u0651\3\2\2\2\u0660\u0657\3\2\2\2\u0660\u0658\3\2\2\2\u0661\u00db"+
		"\3\2\2\2\u0662\u0666\7\u00ec\2\2\u0663\u0666\7\u00eb\2\2\u0664\u0666\5"+
		"\u00e0q\2\u0665\u0662\3\2\2\2\u0665\u0663\3\2\2\2\u0665\u0664\3\2\2\2"+
		"\u0666\u00dd\3\2\2\2\u0667\u066c\5\u00e0q\2\u0668\u0669\7\u00d7\2\2\u0669"+
		"\u066b\5\u00e0q\2\u066a\u0668\3\2\2\2\u066b\u066e\3\2\2\2\u066c\u066a"+
		"\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u00df\3\2\2\2\u066e\u066c\3\2\2\2\u066f"+
		"\u0673\5\u00e2r\2\u0670\u0672\5\u00e4s\2\u0671\u0670\3\2\2\2\u0672\u0675"+
		"\3\2\2\2\u0673\u0671\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u00e1\3\2\2\2\u0675"+
		"\u0673\3\2\2\2\u0676\u067d\5\u00ecw\2\u0677\u067d\5\u00e6t\2\u0678\u0679"+
		"\7\u00d1\2\2\u0679\u067a\5\u00aaV\2\u067a\u067b\7\u00d2\2\2\u067b\u067d"+
		"\3\2\2\2\u067c\u0676\3\2\2\2\u067c\u0677\3\2\2\2\u067c\u0678\3\2\2\2\u067d"+
		"\u00e3\3\2\2\2\u067e\u067f\7\u00be\2\2\u067f\u0681\5\u00eex\2\u0680\u0682"+
		"\5\u00eav\2\u0681\u0680\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u00e5\3\2\2"+
		"\2\u0683\u0684\5\u00e8u\2\u0684\u0685\5\u00eav\2\u0685\u00e7\3\2\2\2\u0686"+
		"\u068b\5\u00c0a\2\u0687\u068b\5\u00d6l\2\u0688\u068b\5\u00ecw\2\u0689"+
		"\u068b\5\u009cO\2\u068a\u0686\3\2\2\2\u068a\u0687\3\2\2\2\u068a\u0688"+
		"\3\2\2\2\u068a\u0689\3\2\2\2\u068b\u00e9\3\2\2\2\u068c\u068e\5,\27\2\u068d"+
		"\u068c\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0693\5\u00c8"+
		"e\2\u0690\u0692\5\u00f4{\2\u0691\u0690\3\2\2\2\u0692\u0695\3\2\2\2\u0693"+
		"\u0691\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u00eb\3\2\2\2\u0695\u0693\3\2"+
		"\2\2\u0696\u0699\5\u00f2z\2\u0697\u0698\7\u00bd\2\2\u0698\u069a\5\u00f2"+
		"z\2\u0699\u0697\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u06a0\3\2\2\2\u069b"+
		"\u069c\5\u00b8]\2\u069c\u069d\7\u00bd\2\2\u069d\u069e\5\u00f2z\2\u069e"+
		"\u06a0\3\2\2\2\u069f\u0696\3\2\2\2\u069f\u069b\3\2\2\2\u06a0\u00ed\3\2"+
		"\2\2\u06a1\u06a4\5\u00f0y\2\u06a2\u06a4\5\u00f2z\2\u06a3\u06a1\3\2\2\2"+
		"\u06a3\u06a2\3\2\2\2\u06a4\u00ef\3\2\2\2\u06a5\u06ab\5\u00fc\177\2\u06a6"+
		"\u06a7\7\u00d5\2\2\u06a7\u06a8\5\u009eP\2\u06a8\u06a9\7\u00d6\2\2\u06a9"+
		"\u06ab\3\2\2\2\u06aa\u06a5\3\2\2\2\u06aa\u06a6\3\2\2\2\u06ab\u06af\3\2"+
		"\2\2\u06ac\u06ae\5\u00f4{\2\u06ad\u06ac\3\2\2\2\u06ae\u06b1\3\2\2\2\u06af"+
		"\u06ad\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u00f1\3\2\2\2\u06b1\u06af\3\2"+
		"\2\2\u06b2\u06b4\7\u00ce\2\2\u06b3\u06b2\3\2\2\2\u06b4\u06b7\3\2\2\2\u06b5"+
		"\u06b3\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06be\3\2\2\2\u06b7\u06b5\3\2"+
		"\2\2\u06b8\u06bf\7\u00dd\2\2\u06b9\u06ba\7\u00ce\2\2\u06ba\u06bb\7\u00d5"+
		"\2\2\u06bb\u06bc\5\u009eP\2\u06bc\u06bd\7\u00d6\2\2\u06bd\u06bf\3\2\2"+
		"\2\u06be\u06b8\3\2\2\2\u06be\u06b9\3\2\2\2\u06bf\u06c3\3\2\2\2\u06c0\u06c2"+
		"\5\u00f4{\2\u06c1\u06c0\3\2\2\2\u06c2\u06c5\3\2\2\2\u06c3\u06c1\3\2\2"+
		"\2\u06c3\u06c4\3\2\2\2\u06c4\u00f3\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c6\u06c8"+
		"\7\u00d3\2\2\u06c7\u06c9\5\u009eP\2\u06c8\u06c7\3\2\2\2\u06c8\u06c9\3"+
		"\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06d0\7\u00d4\2\2\u06cb\u06cc\7\u00d5"+
		"\2\2\u06cc\u06cd\5\u009eP\2\u06cd\u06ce\7\u00d6\2\2\u06ce\u06d0\3\2\2"+
		"\2\u06cf\u06c6\3\2\2\2\u06cf\u06cb\3\2\2\2\u06d0\u00f5\3\2\2\2\u06d1\u06d3"+
		"\5\u00f8}\2\u06d2\u06d1\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06da\3\2\2"+
		"\2\u06d4\u06d6\7\u00d7\2\2\u06d5\u06d7\5\u00f8}\2\u06d6\u06d5\3\2\2\2"+
		"\u06d6\u06d7\3\2\2\2\u06d7\u06d9\3\2\2\2\u06d8\u06d4\3\2\2\2\u06d9\u06dc"+
		"\3\2\2\2\u06da\u06d8\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u00f7\3\2\2\2\u06dc"+
		"\u06da\3\2\2\2\u06dd\u06e5\5\u00e0q\2\u06de\u06df\7c\2\2\u06df\u06e0\7"+
		"\u00d1\2\2\u06e0\u06e1\5\u00f6|\2\u06e1\u06e2\7\u00d2\2\2\u06e2\u06e5"+
		"\3\2\2\2\u06e3\u06e5\5\u00b2Z\2\u06e4\u06dd\3\2\2\2\u06e4\u06de\3\2\2"+
		"\2\u06e4\u06e3\3\2\2\2\u06e5\u00f9\3\2\2\2\u06e6\u06e7\t\23\2\2\u06e7"+
		"\u00fb\3\2\2\2\u06e8\u06e9\t\24\2\2\u06e9\u00fd\3\2\2\2\u06ea\u06eb\t"+
		"\25\2\2\u06eb\u00ff\3\2\2\2\u06ec\u06ed\t\26\2\2\u06ed\u0101\3\2\2\2\u06ee"+
		"\u06ef\t\27\2\2\u06ef\u0103\3\2\2\2\u06f0\u06f1\t\30\2\2\u06f1\u0105\3"+
		"\2\2\2\u06f2\u06f3\t\31\2\2\u06f3\u0107\3\2\2\2\u00e5\u0109\u010d\u010f"+
		"\u0117\u011a\u0134\u0138\u013d\u0142\u0148\u0155\u0159\u015f\u0164\u0169"+
		"\u0170\u0176\u017d\u0184\u0187\u018b\u018f\u0196\u0199\u019e\u01a1\u01a4"+
		"\u01a7\u01ac\u01b0\u01b4\u01b9\u01bd\u01bf\u01c5\u01d1\u01e2\u01e9\u01f1"+
		"\u01f5\u01fa\u0200\u0208\u0210\u0216\u021d\u0224\u0229\u022f\u024c\u025a"+
		"\u025e\u0267\u026b\u0270\u028a\u0295\u0299\u029d\u02a6\u02b0\u02b5\u02bb"+
		"\u02c0\u02c5\u02ca\u02cf\u02d5\u02db\u02e1\u02f3\u02f8\u02fb\u0305\u0308"+
		"\u0315\u031d\u0324\u0327\u032c\u0330\u0339\u0355\u035a\u0361\u0365\u036b"+
		"\u036f\u0372\u0375\u0378\u037b\u037e\u0381\u0389\u0390\u0399\u03a6\u03b2"+
		"\u03b8\u03bc\u03c3\u03c9\u03cd\u03d4\u03db\u03df\u03e5\u03e9\u03eb\u03f1"+
		"\u03f8\u03fc\u0400\u040d\u0410\u0417\u041e\u0422\u0426\u042b\u0430\u0437"+
		"\u043f\u0449\u044f\u048e\u049b\u04a2\u04a7\u04a9\u04cf\u04e5\u04e7\u04ec"+
		"\u04f1\u04f6\u04f9\u04ff\u0502\u0506\u050c\u0510\u051b\u0527\u052b\u0534"+
		"\u053d\u0545\u0549\u0550\u0554\u0559\u055e\u0562\u056b\u0571\u0577\u057a"+
		"\u057e\u0581\u0586\u0589\u058c\u058f\u0592\u0596\u059a\u059e\u05a3\u05a7"+
		"\u05a9\u05af\u05b9\u05bd\u05c0\u05ca\u05cf\u05d1\u05d6\u05de\u05e2\u05e6"+
		"\u05ed\u05f6\u05fa\u05fd\u0602\u0605\u060a\u0615\u0617\u061d\u061f\u0624"+
		"\u062b\u0631\u063b\u0640\u0645\u0647\u064f\u0655\u065c\u0660\u0665\u066c"+
		"\u0673\u067c\u0681\u068a\u068d\u0693\u0699\u069f\u06a3\u06aa\u06af\u06b5"+
		"\u06be\u06c3\u06c8\u06cf\u06d2\u06d6\u06da\u06e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}