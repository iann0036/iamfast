// Generated from /Users/ian/iamfast-js/grammars/JavaParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, MODULE=51, OPEN=52, REQUIRES=53, EXPORTS=54, OPENS=55, TO=56, 
		USES=57, PROVIDES=58, WITH=59, TRANSITIVE=60, VAR=61, YIELD=62, RECORD=63, 
		SEALED=64, PERMITS=65, NON_SEALED=66, DECIMAL_LITERAL=67, HEX_LITERAL=68, 
		OCT_LITERAL=69, BINARY_LITERAL=70, FLOAT_LITERAL=71, HEX_FLOAT_LITERAL=72, 
		BOOL_LITERAL=73, CHAR_LITERAL=74, STRING_LITERAL=75, TEXT_BLOCK=76, NULL_LITERAL=77, 
		LPAREN=78, RPAREN=79, LBRACE=80, RBRACE=81, LBRACK=82, RBRACK=83, SEMI=84, 
		COMMA=85, DOT=86, ASSIGN=87, GT=88, LT=89, BANG=90, TILDE=91, QUESTION=92, 
		COLON=93, EQUAL=94, LE=95, GE=96, NOTEQUAL=97, AND=98, OR=99, INC=100, 
		DEC=101, ADD=102, SUB=103, MUL=104, DIV=105, BITAND=106, BITOR=107, CARET=108, 
		MOD=109, ADD_ASSIGN=110, SUB_ASSIGN=111, MUL_ASSIGN=112, DIV_ASSIGN=113, 
		AND_ASSIGN=114, OR_ASSIGN=115, XOR_ASSIGN=116, MOD_ASSIGN=117, LSHIFT_ASSIGN=118, 
		RSHIFT_ASSIGN=119, URSHIFT_ASSIGN=120, ARROW=121, COLONCOLON=122, AT=123, 
		ELLIPSIS=124, WS=125, COMMENT=126, LINE_COMMENT=127, IDENTIFIER=128;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_classBody = 16, RULE_interfaceBody = 17, 
		RULE_classBodyDeclaration = 18, RULE_memberDeclaration = 19, RULE_methodDeclaration = 20, 
		RULE_methodBody = 21, RULE_typeTypeOrVoid = 22, RULE_genericMethodDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_constructorDeclaration = 25, 
		RULE_fieldDeclaration = 26, RULE_interfaceBodyDeclaration = 27, RULE_interfaceMemberDeclaration = 28, 
		RULE_constDeclaration = 29, RULE_constantDeclarator = 30, RULE_interfaceMethodDeclaration = 31, 
		RULE_interfaceMethodModifier = 32, RULE_genericInterfaceMethodDeclaration = 33, 
		RULE_interfaceCommonBodyDeclaration = 34, RULE_variableDeclarators = 35, 
		RULE_variableDeclarator = 36, RULE_variableDeclaratorId = 37, RULE_variableInitializer = 38, 
		RULE_arrayInitializer = 39, RULE_classOrInterfaceType = 40, RULE_typeArgument = 41, 
		RULE_qualifiedNameList = 42, RULE_formalParameters = 43, RULE_receiverParameter = 44, 
		RULE_formalParameterList = 45, RULE_formalParameter = 46, RULE_lastFormalParameter = 47, 
		RULE_lambdaLVTIList = 48, RULE_lambdaLVTIParameter = 49, RULE_qualifiedName = 50, 
		RULE_literal = 51, RULE_integerLiteral = 52, RULE_floatLiteral = 53, RULE_altAnnotationQualifiedName = 54, 
		RULE_annotation = 55, RULE_elementValuePairs = 56, RULE_elementValuePair = 57, 
		RULE_elementValue = 58, RULE_elementValueArrayInitializer = 59, RULE_annotationTypeDeclaration = 60, 
		RULE_annotationTypeBody = 61, RULE_annotationTypeElementDeclaration = 62, 
		RULE_annotationTypeElementRest = 63, RULE_annotationMethodOrConstantRest = 64, 
		RULE_annotationMethodRest = 65, RULE_annotationConstantRest = 66, RULE_defaultValue = 67, 
		RULE_moduleDeclaration = 68, RULE_moduleBody = 69, RULE_moduleDirective = 70, 
		RULE_requiresModifier = 71, RULE_recordDeclaration = 72, RULE_recordHeader = 73, 
		RULE_recordComponentList = 74, RULE_recordComponent = 75, RULE_recordBody = 76, 
		RULE_block = 77, RULE_blockStatement = 78, RULE_localVariableDeclaration = 79, 
		RULE_identifier = 80, RULE_localTypeDeclaration = 81, RULE_statement = 82, 
		RULE_catchClause = 83, RULE_catchType = 84, RULE_finallyBlock = 85, RULE_resourceSpecification = 86, 
		RULE_resources = 87, RULE_resource = 88, RULE_switchBlockStatementGroup = 89, 
		RULE_switchLabel = 90, RULE_forControl = 91, RULE_forInit = 92, RULE_enhancedForControl = 93, 
		RULE_parExpression = 94, RULE_expressionList = 95, RULE_methodCall = 96, 
		RULE_expression = 97, RULE_pattern = 98, RULE_lambdaExpression = 99, RULE_lambdaParameters = 100, 
		RULE_lambdaBody = 101, RULE_primary = 102, RULE_switchExpression = 103, 
		RULE_switchLabeledRule = 104, RULE_guardedPattern = 105, RULE_switchRuleOutcome = 106, 
		RULE_classType = 107, RULE_creator = 108, RULE_createdName = 109, RULE_innerCreator = 110, 
		RULE_arrayCreatorRest = 111, RULE_classCreatorRest = 112, RULE_explicitGenericInvocation = 113, 
		RULE_typeArgumentsOrDiamond = 114, RULE_nonWildcardTypeArgumentsOrDiamond = 115, 
		RULE_nonWildcardTypeArguments = 116, RULE_typeList = 117, RULE_typeType = 118, 
		RULE_primitiveType = 119, RULE_typeArguments = 120, RULE_superSuffix = 121, 
		RULE_explicitGenericInvocationSuffix = 122, RULE_arguments = 123;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
			"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
			"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "classBody", 
			"interfaceBody", "classBodyDeclaration", "memberDeclaration", "methodDeclaration", 
			"methodBody", "typeTypeOrVoid", "genericMethodDeclaration", "genericConstructorDeclaration", 
			"constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
			"interfaceMethodDeclaration", "interfaceMethodModifier", "genericInterfaceMethodDeclaration", 
			"interfaceCommonBodyDeclaration", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "classOrInterfaceType", 
			"typeArgument", "qualifiedNameList", "formalParameters", "receiverParameter", 
			"formalParameterList", "formalParameter", "lastFormalParameter", "lambdaLVTIList", 
			"lambdaLVTIParameter", "qualifiedName", "literal", "integerLiteral", 
			"floatLiteral", "altAnnotationQualifiedName", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "moduleDeclaration", "moduleBody", "moduleDirective", 
			"requiresModifier", "recordDeclaration", "recordHeader", "recordComponentList", 
			"recordComponent", "recordBody", "block", "blockStatement", "localVariableDeclaration", 
			"identifier", "localTypeDeclaration", "statement", "catchClause", "catchType", 
			"finallyBlock", "resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "methodCall", "expression", "pattern", "lambdaExpression", 
			"lambdaParameters", "lambdaBody", "primary", "switchExpression", "switchLabeledRule", 
			"guardedPattern", "switchRuleOutcome", "classType", "creator", "createdName", 
			"innerCreator", "arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "primitiveType", "typeArguments", "superSuffix", 
			"explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'module'", 
			"'open'", "'requires'", "'exports'", "'opens'", "'to'", "'uses'", "'provides'", 
			"'with'", "'transitive'", "'var'", "'yield'", "'record'", "'sealed'", 
			"'permits'", "'non-sealed'", null, null, null, null, null, null, null, 
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'->'", 
			"'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "MODULE", 
			"OPEN", "REQUIRES", "EXPORTS", "OPENS", "TO", "USES", "PROVIDES", "WITH", 
			"TRANSITIVE", "VAR", "YIELD", "RECORD", "SEALED", "PERMITS", "NON_SEALED", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", 
			"HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"TEXT_BLOCK", "NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
			"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", 
			"LINE_COMMENT", "IDENTIFIER"
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
	public String getGrammarFileName() { return "JavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ModuleDeclarationContext moduleDeclaration() {
			return getRuleContext(ModuleDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(248);
					packageDeclaration();
					}
					break;
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORT) {
					{
					{
					setState(251);
					importDeclaration();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (CLASS - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (INTERFACE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(257);
					typeDeclaration();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				moduleDeclaration();
				setState(264);
				match(EOF);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(268);
				annotation();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(PACKAGE);
			setState(275);
			qualifiedName();
			setState(276);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(IMPORT);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(279);
				match(STATIC);
				}
			}

			setState(282);
			qualifiedName();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(283);
				match(DOT);
				setState(284);
				match(MUL);
				}
			}

			setState(287);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			int _alt;
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(289);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(300);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(295);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(296);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(297);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(298);
					annotationTypeDeclaration();
					}
					break;
				case RECORD:
					{
					setState(299);
					recordDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(SEMI);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(JavaParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				match(VOLATILE);
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public TerminalNode SEALED() { return getToken(JavaParser.SEALED, 0); }
		public TerminalNode NON_SEALED() { return getToken(JavaParser.NON_SEALED, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				annotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(PUBLIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(PROTECTED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				match(PRIVATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				match(STATIC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(317);
				match(ABSTRACT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(318);
				match(FINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(319);
				match(STRICTFP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(320);
				match(SEALED);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(321);
				match(NON_SEALED);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(FINAL);
				}
				break;
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				annotation();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(CLASS);
			setState(329);
			identifier();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(330);
				typeParameters();
				}
			}

			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(333);
				match(EXTENDS);
				setState(334);
				typeType();
				}
			}

			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(337);
				match(IMPLEMENTS);
				setState(338);
				typeList();
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(341);
				match(PERMITS);
				setState(342);
				typeList();
				}
			}

			setState(345);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(LT);
			setState(348);
			typeParameter();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(349);
				match(COMMA);
				setState(350);
				typeParameter();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					annotation();
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(364);
			identifier();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(365);
				match(EXTENDS);
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(366);
						annotation();
						}
						} 
					}
					setState(371);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(372);
				typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			typeType();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(376);
				match(BITAND);
				setState(377);
				typeType();
				}
				}
				setState(382);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(ENUM);
			setState(384);
			identifier();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(385);
				match(IMPLEMENTS);
				setState(386);
				typeList();
				}
			}

			setState(389);
			match(LBRACE);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(390);
				enumConstants();
				}
			}

			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(393);
				match(COMMA);
				}
			}

			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(396);
				enumBodyDeclarations();
				}
			}

			setState(399);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			enumConstant();
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(402);
					match(COMMA);
					setState(403);
					enumConstant();
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(409);
					annotation();
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(415);
			identifier();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(416);
				arguments();
				}
			}

			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(419);
				classBody();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(SEMI);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(423);
				classBodyDeclaration();
				}
				}
				setState(428);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(INTERFACE);
			setState(430);
			identifier();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(431);
				typeParameters();
				}
			}

			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(434);
				match(EXTENDS);
				setState(435);
				typeList();
				}
			}

			setState(438);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(LBRACE);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(441);
				classBodyDeclaration();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(LBRACE);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DEFAULT - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(450);
				interfaceBodyDeclaration();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(459);
					match(STATIC);
					}
				}

				setState(462);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(463);
						modifier();
						}
						} 
					}
					setState(468);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(469);
				memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_memberDeclaration);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(477);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(478);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(479);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(480);
				enumDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(481);
				recordDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			typeTypeOrVoid();
			setState(485);
			identifier();
			setState(486);
			formalParameters();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(487);
				match(LBRACK);
				setState(488);
				match(RBRACK);
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(494);
				match(THROWS);
				setState(495);
				qualifiedNameList();
				}
			}

			setState(498);
			methodBody();
			}
		}
		catch (RecognitionException re) {
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodBody);
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(SEMI);
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

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeTypeOrVoid);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(VOID);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			typeParameters();
			setState(509);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			typeParameters();
			setState(512);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			identifier();
			setState(515);
			formalParameters();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(516);
				match(THROWS);
				setState(517);
				qualifiedNameList();
				}
			}

			setState(520);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			typeType();
			setState(523);
			variableDeclarators();
			setState(524);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(526);
						modifier();
						}
						} 
					}
					setState(531);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(532);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(SEMI);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(540);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(541);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(542);
				enumDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(543);
				recordDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			typeType();
			setState(547);
			constantDeclarator();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(548);
				match(COMMA);
				setState(549);
				constantDeclarator();
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			identifier();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(558);
				match(LBRACK);
				setState(559);
				match(RBRACK);
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(565);
			match(ASSIGN);
			setState(566);
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() {
			return getRuleContext(InterfaceCommonBodyDeclarationContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(568);
					interfaceMethodModifier();
					}
					} 
				}
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(574);
			interfaceCommonBodyDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodModifier);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(579);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(580);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(581);
				match(STRICTFP);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() {
			return getRuleContext(InterfaceCommonBodyDeclarationContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_genericInterfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (DEFAULT - 1)) | (1L << (PUBLIC - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(584);
				interfaceMethodModifier();
				}
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(590);
			typeParameters();
			setState(591);
			interfaceCommonBodyDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceCommonBodyDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceCommonBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceCommonBodyDeclaration; }
	}

	public final InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() throws RecognitionException {
		InterfaceCommonBodyDeclarationContext _localctx = new InterfaceCommonBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_interfaceCommonBodyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(593);
					annotation();
					}
					} 
				}
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(599);
			typeTypeOrVoid();
			setState(600);
			identifier();
			setState(601);
			formalParameters();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(602);
				match(LBRACK);
				setState(603);
				match(RBRACK);
				}
				}
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(609);
				match(THROWS);
				setState(610);
				qualifiedNameList();
				}
			}

			setState(613);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			variableDeclarator();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(616);
				match(COMMA);
				setState(617);
				variableDeclarator();
				}
				}
				setState(622);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			variableDeclaratorId();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(624);
				match(ASSIGN);
				setState(625);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			identifier();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(629);
				match(LBRACK);
				setState(630);
				match(RBRACK);
				}
				}
				setState(635);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableInitializer);
		try {
			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(LBRACE);
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(641);
				variableInitializer();
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(642);
						match(COMMA);
						setState(643);
						variableInitializer();
						}
						} 
					}
					setState(648);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(649);
					match(COMMA);
					}
				}

				}
			}

			setState(654);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			identifier();
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(657);
				typeArguments();
				}
				break;
			}
			setState(667);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(660);
					match(DOT);
					setState(661);
					identifier();
					setState(663);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(662);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(669);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeArgument);
		int _la;
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(671);
					annotation();
					}
					}
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(677);
				match(QUESTION);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(678);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(679);
					typeType();
					}
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			qualifiedName();
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(685);
				match(COMMA);
				setState(686);
				qualifiedName();
				}
				}
				setState(691);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(LPAREN);
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(693);
					receiverParameter();
					}
				}

				}
				break;
			case 2:
				{
				setState(696);
				receiverParameter();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(697);
					match(COMMA);
					setState(698);
					formalParameterList();
					}
				}

				}
				break;
			case 3:
				{
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(701);
					formalParameterList();
					}
				}

				}
				break;
			}
			setState(706);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			typeType();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(709);
				identifier();
				setState(710);
				match(DOT);
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				formalParameter();
				setState(724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(720);
						match(COMMA);
						setState(721);
						formalParameter();
						}
						} 
					}
					setState(726);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(727);
					match(COMMA);
					setState(728);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(734);
					variableModifier();
					}
					} 
				}
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(740);
			typeType();
			setState(741);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JavaParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lastFormalParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(743);
					variableModifier();
					}
					} 
				}
				setState(748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(749);
			typeType();
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(750);
				annotation();
				}
				}
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(756);
			match(ELLIPSIS);
			setState(757);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaLVTIListContext extends ParserRuleContext {
		public List<LambdaLVTIParameterContext> lambdaLVTIParameter() {
			return getRuleContexts(LambdaLVTIParameterContext.class);
		}
		public LambdaLVTIParameterContext lambdaLVTIParameter(int i) {
			return getRuleContext(LambdaLVTIParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LambdaLVTIListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLVTIList; }
	}

	public final LambdaLVTIListContext lambdaLVTIList() throws RecognitionException {
		LambdaLVTIListContext _localctx = new LambdaLVTIListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lambdaLVTIList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			lambdaLVTIParameter();
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(760);
				match(COMMA);
				setState(761);
				lambdaLVTIParameter();
				}
				}
				setState(766);
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

	public static class LambdaLVTIParameterContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LambdaLVTIParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLVTIParameter; }
	}

	public final LambdaLVTIParameterContext lambdaLVTIParameter() throws RecognitionException {
		LambdaLVTIParameterContext _localctx = new LambdaLVTIParameterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lambdaLVTIParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(767);
					variableModifier();
					}
					} 
				}
				setState(772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(773);
			match(VAR);
			setState(774);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			identifier();
			setState(781);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(777);
					match(DOT);
					setState(778);
					identifier();
					}
					} 
				}
				setState(783);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(JavaParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JavaParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(JavaParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(JavaParser.NULL_LITERAL, 0); }
		public TerminalNode TEXT_BLOCK() { return getToken(JavaParser.TEXT_BLOCK, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literal);
		try {
			setState(791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(786);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(787);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(788);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(789);
				match(NULL_LITERAL);
				}
				break;
			case TEXT_BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(790);
				match(TEXT_BLOCK);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(JavaParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(JavaParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(JavaParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(JavaParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)))) != 0)) ) {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(JavaParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(JavaParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
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

	public static class AltAnnotationQualifiedNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public AltAnnotationQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altAnnotationQualifiedName; }
	}

	public final AltAnnotationQualifiedNameContext altAnnotationQualifiedName() throws RecognitionException {
		AltAnnotationQualifiedNameContext _localctx = new AltAnnotationQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_altAnnotationQualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(797);
				identifier();
				setState(798);
				match(DOT);
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(805);
			match(AT);
			setState(806);
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AltAnnotationQualifiedNameContext altAnnotationQualifiedName() {
			return getRuleContext(AltAnnotationQualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(808);
				match(AT);
				setState(809);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(810);
				altAnnotationQualifiedName();
				}
				break;
			}
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(813);
				match(LPAREN);
				setState(816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(814);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(815);
					elementValue();
					}
					break;
				}
				setState(818);
				match(RPAREN);
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			elementValuePair();
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(822);
				match(COMMA);
				setState(823);
				elementValuePair();
				}
				}
				setState(828);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			identifier();
			setState(830);
			match(ASSIGN);
			setState(831);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementValue);
		try {
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(833);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(835);
				elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(LBRACE);
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(839);
				elementValue();
				setState(844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(840);
						match(COMMA);
						setState(841);
						elementValue();
						}
						} 
					}
					setState(846);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
			}

			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(849);
				match(COMMA);
				}
			}

			setState(852);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(AT);
			setState(855);
			match(INTERFACE);
			setState(856);
			identifier();
			setState(857);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(LBRACE);
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(860);
				annotationTypeElementDeclaration();
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(866);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(876);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(868);
						modifier();
						}
						} 
					}
					setState(873);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				setState(874);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				match(SEMI);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationTypeElementRest);
		try {
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				typeType();
				setState(879);
				annotationMethodOrConstantRest();
				setState(880);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				classDeclaration();
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(883);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(886);
				interfaceDeclaration();
				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(887);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(890);
				enumDeclaration();
				setState(892);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(891);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(894);
				annotationTypeDeclaration();
				setState(896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(895);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(898);
				recordDeclaration();
				setState(900);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(899);
					match(SEMI);
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationMethodOrConstantRest);
		try {
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			identifier();
			setState(909);
			match(LPAREN);
			setState(910);
			match(RPAREN);
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(911);
				defaultValue();
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(DEFAULT);
			setState(917);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDeclarationContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(JavaParser.MODULE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(JavaParser.OPEN, 0); }
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_moduleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(919);
				match(OPEN);
				}
			}

			setState(922);
			match(MODULE);
			setState(923);
			qualifiedName();
			setState(924);
			moduleBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ModuleDirectiveContext> moduleDirective() {
			return getRuleContexts(ModuleDirectiveContext.class);
		}
		public ModuleDirectiveContext moduleDirective(int i) {
			return getRuleContext(ModuleDirectiveContext.class,i);
		}
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_moduleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(LBRACE);
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << USES) | (1L << PROVIDES))) != 0)) {
				{
				{
				setState(927);
				moduleDirective();
				}
				}
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(933);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDirectiveContext extends ParserRuleContext {
		public TerminalNode REQUIRES() { return getToken(JavaParser.REQUIRES, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<RequiresModifierContext> requiresModifier() {
			return getRuleContexts(RequiresModifierContext.class);
		}
		public RequiresModifierContext requiresModifier(int i) {
			return getRuleContext(RequiresModifierContext.class,i);
		}
		public TerminalNode EXPORTS() { return getToken(JavaParser.EXPORTS, 0); }
		public TerminalNode TO() { return getToken(JavaParser.TO, 0); }
		public TerminalNode OPENS() { return getToken(JavaParser.OPENS, 0); }
		public TerminalNode USES() { return getToken(JavaParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaParser.WITH, 0); }
		public ModuleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDirective; }
	}

	public final ModuleDirectiveContext moduleDirective() throws RecognitionException {
		ModuleDirectiveContext _localctx = new ModuleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_moduleDirective);
		int _la;
		try {
			int _alt;
			setState(971);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUIRES:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				match(REQUIRES);
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(936);
						requiresModifier();
						}
						} 
					}
					setState(941);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				setState(942);
				qualifiedName();
				setState(943);
				match(SEMI);
				}
				break;
			case EXPORTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				match(EXPORTS);
				setState(946);
				qualifiedName();
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(947);
					match(TO);
					setState(948);
					qualifiedName();
					}
				}

				setState(951);
				match(SEMI);
				}
				break;
			case OPENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(953);
				match(OPENS);
				setState(954);
				qualifiedName();
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(955);
					match(TO);
					setState(956);
					qualifiedName();
					}
				}

				setState(959);
				match(SEMI);
				}
				break;
			case USES:
				enterOuterAlt(_localctx, 4);
				{
				setState(961);
				match(USES);
				setState(962);
				qualifiedName();
				setState(963);
				match(SEMI);
				}
				break;
			case PROVIDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(965);
				match(PROVIDES);
				setState(966);
				qualifiedName();
				setState(967);
				match(WITH);
				setState(968);
				qualifiedName();
				setState(969);
				match(SEMI);
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

	public static class RequiresModifierContext extends ParserRuleContext {
		public TerminalNode TRANSITIVE() { return getToken(JavaParser.TRANSITIVE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public RequiresModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiresModifier; }
	}

	public final RequiresModifierContext requiresModifier() throws RecognitionException {
		RequiresModifierContext _localctx = new RequiresModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_requiresModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			_la = _input.LA(1);
			if ( !(_la==STATIC || _la==TRANSITIVE) ) {
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

	public static class RecordDeclarationContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(JavaParser.RECORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordHeaderContext recordHeader() {
			return getRuleContext(RecordHeaderContext.class,0);
		}
		public RecordBodyContext recordBody() {
			return getRuleContext(RecordBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_recordDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(RECORD);
			setState(976);
			identifier();
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(977);
				typeParameters();
				}
			}

			setState(980);
			recordHeader();
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(981);
				match(IMPLEMENTS);
				setState(982);
				typeList();
				}
			}

			setState(985);
			recordBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordHeaderContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public RecordComponentListContext recordComponentList() {
			return getRuleContext(RecordComponentListContext.class,0);
		}
		public RecordHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordHeader; }
	}

	public final RecordHeaderContext recordHeader() throws RecognitionException {
		RecordHeaderContext _localctx = new RecordHeaderContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_recordHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(LPAREN);
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(988);
				recordComponentList();
				}
			}

			setState(991);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordComponentListContext extends ParserRuleContext {
		public List<RecordComponentContext> recordComponent() {
			return getRuleContexts(RecordComponentContext.class);
		}
		public RecordComponentContext recordComponent(int i) {
			return getRuleContext(RecordComponentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public RecordComponentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponentList; }
	}

	public final RecordComponentListContext recordComponentList() throws RecognitionException {
		RecordComponentListContext _localctx = new RecordComponentListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_recordComponentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			recordComponent();
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(994);
				match(COMMA);
				setState(995);
				recordComponent();
				}
				}
				setState(1000);
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

	public static class RecordComponentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponent; }
	}

	public final RecordComponentContext recordComponent() throws RecognitionException {
		RecordComponentContext _localctx = new RecordComponentContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_recordComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			typeType();
			setState(1002);
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

	public static class RecordBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public RecordBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordBody; }
	}

	public final RecordBodyContext recordBody() throws RecognitionException {
		RecordBodyContext _localctx = new RecordBodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_recordBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(LBRACE);
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(1005);
				classBodyDeclaration();
				}
				}
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1011);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			match(LBRACE);
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (ASSERT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BREAK - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (CONTINUE - 1)) | (1L << (DO - 1)) | (1L << (DOUBLE - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (FOR - 1)) | (1L << (IF - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NEW - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (RETURN - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SUPER - 1)) | (1L << (SWITCH - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (THIS - 1)) | (1L << (THROW - 1)) | (1L << (TRY - 1)) | (1L << (VOID - 1)) | (1L << (WHILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCT_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_FLOAT_LITERAL - 65)) | (1L << (BOOL_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (TEXT_BLOCK - 65)) | (1L << (NULL_LITERAL - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(1014);
				blockStatement();
				}
				}
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1020);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_blockStatement);
		try {
			setState(1027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1022);
				localVariableDeclaration();
				setState(1023);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1025);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1026);
				localTypeDeclaration();
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1029);
					variableModifier();
					}
					} 
				}
				setState(1034);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			setState(1043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1035);
				typeType();
				setState(1036);
				variableDeclarators();
				}
				break;
			case 2:
				{
				setState(1038);
				match(VAR);
				setState(1039);
				identifier();
				setState(1040);
				match(ASSIGN);
				setState(1041);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode MODULE() { return getToken(JavaParser.MODULE, 0); }
		public TerminalNode OPEN() { return getToken(JavaParser.OPEN, 0); }
		public TerminalNode REQUIRES() { return getToken(JavaParser.REQUIRES, 0); }
		public TerminalNode EXPORTS() { return getToken(JavaParser.EXPORTS, 0); }
		public TerminalNode OPENS() { return getToken(JavaParser.OPENS, 0); }
		public TerminalNode TO() { return getToken(JavaParser.TO, 0); }
		public TerminalNode USES() { return getToken(JavaParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaParser.WITH, 0); }
		public TerminalNode TRANSITIVE() { return getToken(JavaParser.TRANSITIVE, 0); }
		public TerminalNode YIELD() { return getToken(JavaParser.YIELD, 0); }
		public TerminalNode SEALED() { return getToken(JavaParser.SEALED, 0); }
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public TerminalNode RECORD() { return getToken(JavaParser.RECORD, 0); }
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) ) {
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

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_localTypeDeclaration);
		try {
			int _alt;
			setState(1059);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1047);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(1052);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				setState(1056);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(1053);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(1054);
					interfaceDeclaration();
					}
					break;
				case RECORD:
					{
					setState(1055);
					recordDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				match(SEMI);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public IdentifierContext identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
		public TerminalNode YIELD() { return getToken(JavaParser.YIELD, 0); }
		public SwitchExpressionContext switchExpression() {
			return getRuleContext(SwitchExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
				match(ASSERT);
				setState(1063);
				expression(0);
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1064);
					match(COLON);
					setState(1065);
					expression(0);
					}
				}

				setState(1068);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1070);
				match(IF);
				setState(1071);
				parExpression();
				setState(1072);
				statement();
				setState(1075);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1073);
					match(ELSE);
					setState(1074);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1077);
				match(FOR);
				setState(1078);
				match(LPAREN);
				setState(1079);
				forControl();
				setState(1080);
				match(RPAREN);
				setState(1081);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1083);
				match(WHILE);
				setState(1084);
				parExpression();
				setState(1085);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1087);
				match(DO);
				setState(1088);
				statement();
				setState(1089);
				match(WHILE);
				setState(1090);
				parExpression();
				setState(1091);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1093);
				match(TRY);
				setState(1094);
				block();
				setState(1104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1096); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1095);
						catchClause();
						}
						}
						setState(1098); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1100);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1103);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1106);
				match(TRY);
				setState(1107);
				resourceSpecification();
				setState(1108);
				block();
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1109);
					catchClause();
					}
					}
					setState(1114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1115);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1118);
				match(SWITCH);
				setState(1119);
				parExpression();
				setState(1120);
				match(LBRACE);
				setState(1124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1121);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(1126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				}
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1127);
					switchLabel();
					}
					}
					setState(1132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1133);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1135);
				match(SYNCHRONIZED);
				setState(1136);
				parExpression();
				setState(1137);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1139);
				match(RETURN);
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1140);
					expression(0);
					}
				}

				setState(1143);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1144);
				match(THROW);
				setState(1145);
				expression(0);
				setState(1146);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1148);
				match(BREAK);
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1149);
					identifier();
					}
				}

				setState(1152);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1153);
				match(CONTINUE);
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1154);
					identifier();
					}
				}

				setState(1157);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1158);
				match(YIELD);
				setState(1159);
				expression(0);
				setState(1160);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1162);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1163);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(1164);
				match(SEMI);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1166);
				switchExpression();
				setState(1168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1167);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1170);
				((StatementContext)_localctx).identifierLabel = identifier();
				setState(1171);
				match(COLON);
				setState(1172);
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

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(JavaParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_catchClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			match(CATCH);
			setState(1177);
			match(LPAREN);
			setState(1181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1178);
					variableModifier();
					}
					} 
				}
				setState(1183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1184);
			catchType();
			setState(1185);
			identifier();
			setState(1186);
			match(RPAREN);
			setState(1187);
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(JavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JavaParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			qualifiedName();
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1190);
				match(BITOR);
				setState(1191);
				qualifiedName();
				}
				}
				setState(1196);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JavaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(FINALLY);
			setState(1198);
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(LPAREN);
			setState(1201);
			resources();
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1202);
				match(SEMI);
				}
			}

			setState(1205);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			resource();
			setState(1212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1208);
					match(SEMI);
					setState(1209);
					resource();
					}
					} 
				}
				setState(1214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_resource);
		try {
			int _alt;
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1215);
						variableModifier();
						}
						} 
					}
					setState(1220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				}
				setState(1226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1221);
					classOrInterfaceType();
					setState(1222);
					variableDeclaratorId();
					}
					break;
				case 2:
					{
					setState(1224);
					match(VAR);
					setState(1225);
					identifier();
					}
					break;
				}
				setState(1228);
				match(ASSIGN);
				setState(1229);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
				identifier();
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1234);
				switchLabel();
				}
				}
				setState(1237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1239);
				blockStatement();
				}
				}
				setState(1242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (ASSERT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BREAK - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (CONTINUE - 1)) | (1L << (DO - 1)) | (1L << (DOUBLE - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (FOR - 1)) | (1L << (IF - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NEW - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (RETURN - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SUPER - 1)) | (1L << (SWITCH - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (THIS - 1)) | (1L << (THROW - 1)) | (1L << (TRY - 1)) | (1L << (VOID - 1)) | (1L << (WHILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCT_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_FLOAT_LITERAL - 65)) | (1L << (BOOL_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (TEXT_BLOCK - 65)) | (1L << (NULL_LITERAL - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public IdentifierContext varName;
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_switchLabel);
		try {
			setState(1255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1244);
				match(CASE);
				setState(1250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1245);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1246);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(1247);
					typeType();
					setState(1248);
					((SwitchLabelContext)_localctx).varName = identifier();
					}
					break;
				}
				setState(1252);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
				match(DEFAULT);
				setState(1254);
				match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_forControl);
		int _la;
		try {
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1258);
					forInit();
					}
				}

				setState(1261);
				match(SEMI);
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1262);
					expression(0);
					}
				}

				setState(1265);
				match(SEMI);
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1266);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
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
		enterRule(_localctx, 184, RULE_forInit);
		try {
			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1271);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1272);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1275);
					variableModifier();
					}
					} 
				}
				setState(1280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1281);
				typeType();
				}
				break;
			case 2:
				{
				setState(1282);
				match(VAR);
				}
				break;
			}
			setState(1285);
			variableDeclaratorId();
			setState(1286);
			match(COLON);
			setState(1287);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			match(LPAREN);
			setState(1290);
			expression(0);
			setState(1291);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			expression(0);
			setState(1298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1294);
				match(COMMA);
				setState(1295);
				expression(0);
				}
				}
				setState(1300);
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

	public static class MethodCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_methodCall);
		int _la;
		try {
			setState(1320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1301);
				identifier();
				setState(1302);
				match(LPAREN);
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1303);
					expressionList();
					}
				}

				setState(1306);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				match(THIS);
				setState(1309);
				match(LPAREN);
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1310);
					expressionList();
					}
				}

				setState(1313);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1314);
				match(SUPER);
				setState(1315);
				match(LPAREN);
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1316);
					expressionList();
					}
				}

				setState(1319);
				match(RPAREN);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(JavaParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(JavaParser.BANG, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public SwitchExpressionContext switchExpression() {
			return getRuleContext(SwitchExpressionContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(JavaParser.COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JavaParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(JavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JavaParser.GT, i);
		}
		public TerminalNode LE() { return getToken(JavaParser.LE, 0); }
		public TerminalNode GE() { return getToken(JavaParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(JavaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JavaParser.NOTEQUAL, 0); }
		public TerminalNode CARET() { return getToken(JavaParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(JavaParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(JavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(JavaParser.OR, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(JavaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JavaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(JavaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(JavaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(JavaParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(JavaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(JavaParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(JavaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JavaParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public TerminalNode INSTANCEOF() { return getToken(JavaParser.INSTANCEOF, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
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
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1323);
				primary();
				}
				break;
			case 2:
				{
				setState(1324);
				methodCall();
				}
				break;
			case 3:
				{
				setState(1325);
				match(NEW);
				setState(1326);
				creator();
				}
				break;
			case 4:
				{
				setState(1327);
				match(LPAREN);
				setState(1331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1328);
						annotation();
						}
						} 
					}
					setState(1333);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				}
				setState(1334);
				typeType();
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1335);
					match(BITAND);
					setState(1336);
					typeType();
					}
					}
					setState(1341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1342);
				match(RPAREN);
				setState(1343);
				expression(22);
				}
				break;
			case 5:
				{
				setState(1345);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (INC - 100)) | (1L << (DEC - 100)) | (1L << (ADD - 100)) | (1L << (SUB - 100)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1346);
				expression(20);
				}
				break;
			case 6:
				{
				setState(1347);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1348);
				expression(19);
				}
				break;
			case 7:
				{
				setState(1349);
				lambdaExpression();
				}
				break;
			case 8:
				{
				setState(1350);
				switchExpression();
				}
				break;
			case 9:
				{
				setState(1351);
				typeType();
				setState(1352);
				match(COLONCOLON);
				setState(1358);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULE:
				case OPEN:
				case REQUIRES:
				case EXPORTS:
				case OPENS:
				case TO:
				case USES:
				case PROVIDES:
				case WITH:
				case TRANSITIVE:
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case LT:
				case IDENTIFIER:
					{
					setState(1354);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1353);
						typeArguments();
						}
					}

					setState(1356);
					identifier();
					}
					break;
				case NEW:
					{
					setState(1357);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				{
				setState(1360);
				classType();
				setState(1361);
				match(COLONCOLON);
				setState(1363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1362);
					typeArguments();
					}
				}

				setState(1365);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1450);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1369);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1370);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (MUL - 104)) | (1L << (DIV - 104)) | (1L << (MOD - 104)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1371);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1372);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1373);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1374);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1375);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1383);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
						case 1:
							{
							setState(1376);
							match(LT);
							setState(1377);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1378);
							match(GT);
							setState(1379);
							match(GT);
							setState(1380);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1381);
							match(GT);
							setState(1382);
							match(GT);
							}
							break;
						}
						setState(1385);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1386);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1387);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (GT - 88)) | (1L << (LT - 88)) | (1L << (LE - 88)) | (1L << (GE - 88)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1388);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1389);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1390);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1391);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1392);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1393);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1394);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1395);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1396);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1397);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1398);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1399);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1400);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1401);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1402);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(1403);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1404);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1405);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(1406);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1407);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1408);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1409);
						expression(0);
						setState(1410);
						match(COLON);
						setState(1411);
						expression(7);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1413);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1414);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (ASSIGN - 87)) | (1L << (ADD_ASSIGN - 87)) | (1L << (SUB_ASSIGN - 87)) | (1L << (MUL_ASSIGN - 87)) | (1L << (DIV_ASSIGN - 87)) | (1L << (AND_ASSIGN - 87)) | (1L << (OR_ASSIGN - 87)) | (1L << (XOR_ASSIGN - 87)) | (1L << (MOD_ASSIGN - 87)) | (1L << (LSHIFT_ASSIGN - 87)) | (1L << (RSHIFT_ASSIGN - 87)) | (1L << (URSHIFT_ASSIGN - 87)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1415);
						expression(6);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1416);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1417);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1429);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
						case 1:
							{
							setState(1418);
							identifier();
							}
							break;
						case 2:
							{
							setState(1419);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1420);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1421);
							match(NEW);
							setState(1423);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1422);
								nonWildcardTypeArguments();
								}
							}

							setState(1425);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1426);
							match(SUPER);
							setState(1427);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1428);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1431);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1432);
						match(LBRACK);
						setState(1433);
						expression(0);
						setState(1434);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1436);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1437);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1438);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1439);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1442);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
						case 1:
							{
							setState(1440);
							typeType();
							}
							break;
						case 2:
							{
							setState(1441);
							pattern();
							}
							break;
						}
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1444);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1445);
						match(COLONCOLON);
						setState(1447);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1446);
							typeArguments();
							}
						}

						setState(1449);
						identifier();
						}
						break;
					}
					} 
				}
				setState(1454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
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

	public static class PatternContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1455);
					variableModifier();
					}
					} 
				}
				setState(1460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			setState(1461);
			typeType();
			setState(1465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1462);
					annotation();
					}
					} 
				}
				setState(1467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			setState(1468);
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			lambdaParameters();
			setState(1471);
			match(ARROW);
			setState(1472);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LambdaLVTIListContext lambdaLVTIList() {
			return getRuleContext(LambdaLVTIListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_lambdaParameters);
		int _la;
		try {
			setState(1496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
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
				match(LPAREN);
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1476);
					formalParameterList();
					}
				}

				setState(1479);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1480);
				match(LPAREN);
				setState(1481);
				identifier();
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1482);
					match(COMMA);
					setState(1483);
					identifier();
					}
					}
					setState(1488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1489);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1491);
				match(LPAREN);
				setState(1493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (FINAL - 18)) | (1L << (MODULE - 18)) | (1L << (OPEN - 18)) | (1L << (REQUIRES - 18)) | (1L << (EXPORTS - 18)) | (1L << (OPENS - 18)) | (1L << (TO - 18)) | (1L << (USES - 18)) | (1L << (PROVIDES - 18)) | (1L << (WITH - 18)) | (1L << (TRANSITIVE - 18)) | (1L << (VAR - 18)) | (1L << (YIELD - 18)) | (1L << (RECORD - 18)) | (1L << (SEALED - 18)) | (1L << (PERMITS - 18)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1492);
					lambdaLVTIList();
					}
				}

				setState(1495);
				match(RPAREN);
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

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_lambdaBody);
		try {
			setState(1500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				block();
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_primary);
		try {
			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1502);
				match(LPAREN);
				setState(1503);
				expression(0);
				setState(1504);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1506);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1507);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1508);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1509);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1510);
				typeTypeOrVoid();
				setState(1511);
				match(DOT);
				setState(1512);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1514);
				nonWildcardTypeArguments();
				setState(1518);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case MODULE:
				case OPEN:
				case REQUIRES:
				case EXPORTS:
				case OPENS:
				case TO:
				case USES:
				case PROVIDES:
				case WITH:
				case TRANSITIVE:
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case IDENTIFIER:
					{
					setState(1515);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1516);
					match(THIS);
					setState(1517);
					arguments();
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

	public static class SwitchExpressionContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<SwitchLabeledRuleContext> switchLabeledRule() {
			return getRuleContexts(SwitchLabeledRuleContext.class);
		}
		public SwitchLabeledRuleContext switchLabeledRule(int i) {
			return getRuleContext(SwitchLabeledRuleContext.class,i);
		}
		public SwitchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpression; }
	}

	public final SwitchExpressionContext switchExpression() throws RecognitionException {
		SwitchExpressionContext _localctx = new SwitchExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_switchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			match(SWITCH);
			setState(1523);
			parExpression();
			setState(1524);
			match(LBRACE);
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1525);
				switchLabeledRule();
				}
				}
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1531);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabeledRuleContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public SwitchRuleOutcomeContext switchRuleOutcome() {
			return getRuleContext(SwitchRuleOutcomeContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaParser.ARROW, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NULL_LITERAL() { return getToken(JavaParser.NULL_LITERAL, 0); }
		public GuardedPatternContext guardedPattern() {
			return getRuleContext(GuardedPatternContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabeledRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabeledRule; }
	}

	public final SwitchLabeledRuleContext switchLabeledRule() throws RecognitionException {
		SwitchLabeledRuleContext _localctx = new SwitchLabeledRuleContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_switchLabeledRule);
		int _la;
		try {
			setState(1544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1533);
				match(CASE);
				setState(1537);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1534);
					expressionList();
					}
					break;
				case 2:
					{
					setState(1535);
					match(NULL_LITERAL);
					}
					break;
				case 3:
					{
					setState(1536);
					guardedPattern(0);
					}
					break;
				}
				setState(1539);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1540);
				switchRuleOutcome();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1541);
				match(DEFAULT);
				setState(1542);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1543);
				switchRuleOutcome();
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

	public static class GuardedPatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public GuardedPatternContext guardedPattern() {
			return getRuleContext(GuardedPatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JavaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JavaParser.AND, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GuardedPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedPattern; }
	}

	public final GuardedPatternContext guardedPattern() throws RecognitionException {
		return guardedPattern(0);
	}

	private GuardedPatternContext guardedPattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GuardedPatternContext _localctx = new GuardedPatternContext(_ctx, _parentState);
		GuardedPatternContext _prevctx = _localctx;
		int _startState = 210;
		enterRecursionRule(_localctx, 210, RULE_guardedPattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1547);
				match(LPAREN);
				setState(1548);
				guardedPattern(0);
				setState(1549);
				match(RPAREN);
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FINAL:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				{
				setState(1554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1551);
						variableModifier();
						}
						} 
					}
					setState(1556);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				}
				setState(1557);
				typeType();
				setState(1561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1558);
						annotation();
						}
						} 
					}
					setState(1563);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				}
				setState(1564);
				identifier();
				setState(1569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1565);
						match(AND);
						setState(1566);
						expression(0);
						}
						} 
					}
					setState(1571);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GuardedPatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guardedPattern);
					setState(1574);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1575);
					match(AND);
					setState(1576);
					expression(0);
					}
					} 
				}
				setState(1581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
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

	public static class SwitchRuleOutcomeContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchRuleOutcomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchRuleOutcome; }
	}

	public final SwitchRuleOutcomeContext switchRuleOutcome() throws RecognitionException {
		SwitchRuleOutcomeContext _localctx = new SwitchRuleOutcomeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_switchRuleOutcome);
		int _la;
		try {
			setState(1589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1582);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (ASSERT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BREAK - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (CONTINUE - 1)) | (1L << (DO - 1)) | (1L << (DOUBLE - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (FOR - 1)) | (1L << (IF - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NEW - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (RETURN - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SUPER - 1)) | (1L << (SWITCH - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (THIS - 1)) | (1L << (THROW - 1)) | (1L << (TRY - 1)) | (1L << (VOID - 1)) | (1L << (WHILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCT_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_FLOAT_LITERAL - 65)) | (1L << (BOOL_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (TEXT_BLOCK - 65)) | (1L << (NULL_LITERAL - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(1583);
					blockStatement();
					}
					}
					setState(1588);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_classType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1591);
				classOrInterfaceType();
				setState(1592);
				match(DOT);
				}
				break;
			}
			setState(1599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1596);
					annotation();
					}
					} 
				}
				setState(1601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			setState(1602);
			identifier();
			setState(1604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1603);
				typeArguments();
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_creator);
		try {
			setState(1615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1606);
				nonWildcardTypeArguments();
				setState(1607);
				createdName();
				setState(1608);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1610);
				createdName();
				setState(1613);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1611);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1612);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_createdName);
		int _la;
		try {
			setState(1632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1617);
				identifier();
				setState(1619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1618);
					typeArgumentsOrDiamond();
					}
				}

				setState(1628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1621);
					match(DOT);
					setState(1622);
					identifier();
					setState(1624);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1623);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1631);
				primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			identifier();
			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1635);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1638);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(LBRACK);
			setState(1668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1641);
				match(RBRACK);
				setState(1646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1642);
					match(LBRACK);
					setState(1643);
					match(RBRACK);
					}
					}
					setState(1648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1649);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				{
				setState(1650);
				expression(0);
				setState(1651);
				match(RBRACK);
				setState(1658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1652);
						match(LBRACK);
						setState(1653);
						expression(0);
						setState(1654);
						match(RBRACK);
						}
						} 
					}
					setState(1660);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
				}
				setState(1665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1661);
						match(LBRACK);
						setState(1662);
						match(RBRACK);
						}
						} 
					}
					setState(1667);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				}
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			arguments();
			setState(1672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1671);
				classBody();
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			nonWildcardTypeArguments();
			setState(1675);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_typeArgumentsOrDiamond);
		try {
			setState(1680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1677);
				match(LT);
				setState(1678);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1679);
				typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1682);
				match(LT);
				setState(1683);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1684);
				nonWildcardTypeArguments();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			match(LT);
			setState(1688);
			typeList();
			setState(1689);
			match(GT);
			}
		}
		catch (RecognitionException re) {
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
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			typeType();
			setState(1696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1692);
				match(COMMA);
				setState(1693);
				typeType();
				}
				}
				setState(1698);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1699);
					annotation();
					}
					} 
				}
				setState(1704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			setState(1707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				{
				setState(1705);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(1706);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1719);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1712);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
						{
						{
						setState(1709);
						annotation();
						}
						}
						setState(1714);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1715);
					match(LBRACK);
					setState(1716);
					match(RBRACK);
					}
					} 
				}
				setState(1721);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(JavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			match(LT);
			setState(1725);
			typeArgument();
			setState(1730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1726);
				match(COMMA);
				setState(1727);
				typeArgument();
				}
				}
				setState(1732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1733);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_superSuffix);
		int _la;
		try {
			setState(1744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1735);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1736);
				match(DOT);
				setState(1738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1737);
					typeArguments();
					}
				}

				setState(1740);
				identifier();
				setState(1742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1741);
					arguments();
					}
					break;
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1751);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1746);
				match(SUPER);
				setState(1747);
				superSuffix();
				}
				break;
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1748);
				identifier();
				setState(1749);
				arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
			match(LPAREN);
			setState(1755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(1754);
				expressionList();
				}
			}

			setState(1757);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		case 97:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 105:
			return guardedPattern_sempred((GuardedPatternContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 26);
		case 13:
			return precpred(_ctx, 25);
		case 14:
			return precpred(_ctx, 21);
		case 15:
			return precpred(_ctx, 14);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean guardedPattern_sempred(GuardedPatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0082\u06e2\4\2\t"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\3\2\5\2\u00fc\n\2\3\2\7\2\u00ff"+
		"\n\2\f\2\16\2\u0102\13\2\3\2\7\2\u0105\n\2\f\2\16\2\u0108\13\2\3\2\3\2"+
		"\3\2\5\2\u010d\n\2\3\3\7\3\u0110\n\3\f\3\16\3\u0113\13\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\5\4\u011b\n\4\3\4\3\4\3\4\5\4\u0120\n\4\3\4\3\4\3\5\7\5\u0125"+
		"\n\5\f\5\16\5\u0128\13\5\3\5\3\5\3\5\3\5\3\5\5\5\u012f\n\5\3\5\5\5\u0132"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0139\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u0145\n\7\3\b\3\b\5\b\u0149\n\b\3\t\3\t\3\t\5\t\u014e\n\t"+
		"\3\t\3\t\5\t\u0152\n\t\3\t\3\t\5\t\u0156\n\t\3\t\3\t\5\t\u015a\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\7\n\u0162\n\n\f\n\16\n\u0165\13\n\3\n\3\n\3\13\7"+
		"\13\u016a\n\13\f\13\16\13\u016d\13\13\3\13\3\13\3\13\7\13\u0172\n\13\f"+
		"\13\16\13\u0175\13\13\3\13\5\13\u0178\n\13\3\f\3\f\3\f\7\f\u017d\n\f\f"+
		"\f\16\f\u0180\13\f\3\r\3\r\3\r\3\r\5\r\u0186\n\r\3\r\3\r\5\r\u018a\n\r"+
		"\3\r\5\r\u018d\n\r\3\r\5\r\u0190\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u0197"+
		"\n\16\f\16\16\16\u019a\13\16\3\17\7\17\u019d\n\17\f\17\16\17\u01a0\13"+
		"\17\3\17\3\17\5\17\u01a4\n\17\3\17\5\17\u01a7\n\17\3\20\3\20\7\20\u01ab"+
		"\n\20\f\20\16\20\u01ae\13\20\3\21\3\21\3\21\5\21\u01b3\n\21\3\21\3\21"+
		"\5\21\u01b7\n\21\3\21\3\21\3\22\3\22\7\22\u01bd\n\22\f\22\16\22\u01c0"+
		"\13\22\3\22\3\22\3\23\3\23\7\23\u01c6\n\23\f\23\16\23\u01c9\13\23\3\23"+
		"\3\23\3\24\3\24\5\24\u01cf\n\24\3\24\3\24\7\24\u01d3\n\24\f\24\16\24\u01d6"+
		"\13\24\3\24\5\24\u01d9\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u01e5\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u01ec\n\26\f\26"+
		"\16\26\u01ef\13\26\3\26\3\26\5\26\u01f3\n\26\3\26\3\26\3\27\3\27\5\27"+
		"\u01f9\n\27\3\30\3\30\5\30\u01fd\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\5\33\u0209\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\7\35\u0212\n\35\f\35\16\35\u0215\13\35\3\35\3\35\5\35\u0219\n\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0223\n\36\3\37\3\37\3\37\3\37"+
		"\7\37\u0229\n\37\f\37\16\37\u022c\13\37\3\37\3\37\3 \3 \3 \7 \u0233\n"+
		" \f \16 \u0236\13 \3 \3 \3 \3!\7!\u023c\n!\f!\16!\u023f\13!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u0249\n\"\3#\7#\u024c\n#\f#\16#\u024f\13#\3#"+
		"\3#\3#\3$\7$\u0255\n$\f$\16$\u0258\13$\3$\3$\3$\3$\3$\7$\u025f\n$\f$\16"+
		"$\u0262\13$\3$\3$\5$\u0266\n$\3$\3$\3%\3%\3%\7%\u026d\n%\f%\16%\u0270"+
		"\13%\3&\3&\3&\5&\u0275\n&\3\'\3\'\3\'\7\'\u027a\n\'\f\'\16\'\u027d\13"+
		"\'\3(\3(\5(\u0281\n(\3)\3)\3)\3)\7)\u0287\n)\f)\16)\u028a\13)\3)\5)\u028d"+
		"\n)\5)\u028f\n)\3)\3)\3*\3*\5*\u0295\n*\3*\3*\3*\5*\u029a\n*\7*\u029c"+
		"\n*\f*\16*\u029f\13*\3+\3+\7+\u02a3\n+\f+\16+\u02a6\13+\3+\3+\3+\5+\u02ab"+
		"\n+\5+\u02ad\n+\3,\3,\3,\7,\u02b2\n,\f,\16,\u02b5\13,\3-\3-\5-\u02b9\n"+
		"-\3-\3-\3-\5-\u02be\n-\3-\5-\u02c1\n-\5-\u02c3\n-\3-\3-\3.\3.\3.\3.\7"+
		".\u02cb\n.\f.\16.\u02ce\13.\3.\3.\3/\3/\3/\7/\u02d5\n/\f/\16/\u02d8\13"+
		"/\3/\3/\5/\u02dc\n/\3/\5/\u02df\n/\3\60\7\60\u02e2\n\60\f\60\16\60\u02e5"+
		"\13\60\3\60\3\60\3\60\3\61\7\61\u02eb\n\61\f\61\16\61\u02ee\13\61\3\61"+
		"\3\61\7\61\u02f2\n\61\f\61\16\61\u02f5\13\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\7\62\u02fd\n\62\f\62\16\62\u0300\13\62\3\63\7\63\u0303\n\63\f\63"+
		"\16\63\u0306\13\63\3\63\3\63\3\63\3\64\3\64\3\64\7\64\u030e\n\64\f\64"+
		"\16\64\u0311\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u031a\n\65"+
		"\3\66\3\66\3\67\3\67\38\38\38\78\u0323\n8\f8\168\u0326\138\38\38\38\3"+
		"9\39\39\59\u032e\n9\39\39\39\59\u0333\n9\39\59\u0336\n9\3:\3:\3:\7:\u033b"+
		"\n:\f:\16:\u033e\13:\3;\3;\3;\3;\3<\3<\3<\5<\u0347\n<\3=\3=\3=\3=\7=\u034d"+
		"\n=\f=\16=\u0350\13=\5=\u0352\n=\3=\5=\u0355\n=\3=\3=\3>\3>\3>\3>\3>\3"+
		"?\3?\7?\u0360\n?\f?\16?\u0363\13?\3?\3?\3@\7@\u0368\n@\f@\16@\u036b\13"+
		"@\3@\3@\5@\u036f\n@\3A\3A\3A\3A\3A\3A\5A\u0377\nA\3A\3A\5A\u037b\nA\3"+
		"A\3A\5A\u037f\nA\3A\3A\5A\u0383\nA\3A\3A\5A\u0387\nA\5A\u0389\nA\3B\3"+
		"B\5B\u038d\nB\3C\3C\3C\3C\5C\u0393\nC\3D\3D\3E\3E\3E\3F\5F\u039b\nF\3"+
		"F\3F\3F\3F\3G\3G\7G\u03a3\nG\fG\16G\u03a6\13G\3G\3G\3H\3H\7H\u03ac\nH"+
		"\fH\16H\u03af\13H\3H\3H\3H\3H\3H\3H\3H\5H\u03b8\nH\3H\3H\3H\3H\3H\3H\5"+
		"H\u03c0\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u03ce\nH\3I\3I\3J\3"+
		"J\3J\5J\u03d5\nJ\3J\3J\3J\5J\u03da\nJ\3J\3J\3K\3K\5K\u03e0\nK\3K\3K\3"+
		"L\3L\3L\7L\u03e7\nL\fL\16L\u03ea\13L\3M\3M\3M\3N\3N\7N\u03f1\nN\fN\16"+
		"N\u03f4\13N\3N\3N\3O\3O\7O\u03fa\nO\fO\16O\u03fd\13O\3O\3O\3P\3P\3P\3"+
		"P\3P\5P\u0406\nP\3Q\7Q\u0409\nQ\fQ\16Q\u040c\13Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\5Q\u0416\nQ\3R\3R\3S\7S\u041b\nS\fS\16S\u041e\13S\3S\3S\3S\5S\u0423"+
		"\nS\3S\5S\u0426\nS\3T\3T\3T\3T\3T\5T\u042d\nT\3T\3T\3T\3T\3T\3T\3T\5T"+
		"\u0436\nT\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\6T"+
		"\u044b\nT\rT\16T\u044c\3T\5T\u0450\nT\3T\5T\u0453\nT\3T\3T\3T\3T\7T\u0459"+
		"\nT\fT\16T\u045c\13T\3T\5T\u045f\nT\3T\3T\3T\3T\7T\u0465\nT\fT\16T\u0468"+
		"\13T\3T\7T\u046b\nT\fT\16T\u046e\13T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0478"+
		"\nT\3T\3T\3T\3T\3T\3T\3T\5T\u0481\nT\3T\3T\3T\5T\u0486\nT\3T\3T\3T\3T"+
		"\3T\3T\3T\3T\3T\3T\3T\5T\u0493\nT\3T\3T\3T\3T\5T\u0499\nT\3U\3U\3U\7U"+
		"\u049e\nU\fU\16U\u04a1\13U\3U\3U\3U\3U\3U\3V\3V\3V\7V\u04ab\nV\fV\16V"+
		"\u04ae\13V\3W\3W\3W\3X\3X\3X\5X\u04b6\nX\3X\3X\3Y\3Y\3Y\7Y\u04bd\nY\f"+
		"Y\16Y\u04c0\13Y\3Z\7Z\u04c3\nZ\fZ\16Z\u04c6\13Z\3Z\3Z\3Z\3Z\3Z\5Z\u04cd"+
		"\nZ\3Z\3Z\3Z\3Z\5Z\u04d3\nZ\3[\6[\u04d6\n[\r[\16[\u04d7\3[\6[\u04db\n"+
		"[\r[\16[\u04dc\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u04e5\n\\\3\\\3\\\3\\\5\\\u04ea"+
		"\n\\\3]\3]\5]\u04ee\n]\3]\3]\5]\u04f2\n]\3]\3]\5]\u04f6\n]\5]\u04f8\n"+
		"]\3^\3^\5^\u04fc\n^\3_\7_\u04ff\n_\f_\16_\u0502\13_\3_\3_\5_\u0506\n_"+
		"\3_\3_\3_\3_\3`\3`\3`\3`\3a\3a\3a\7a\u0513\na\fa\16a\u0516\13a\3b\3b\3"+
		"b\5b\u051b\nb\3b\3b\3b\3b\3b\5b\u0522\nb\3b\3b\3b\3b\5b\u0528\nb\3b\5"+
		"b\u052b\nb\3c\3c\3c\3c\3c\3c\3c\7c\u0534\nc\fc\16c\u0537\13c\3c\3c\3c"+
		"\7c\u053c\nc\fc\16c\u053f\13c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u054d"+
		"\nc\3c\3c\5c\u0551\nc\3c\3c\3c\5c\u0556\nc\3c\3c\5c\u055a\nc\3c\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u056a\nc\3c\3c\3c\3c\3c\3c\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\3c\5c\u0592\nc\3c\3c\3c\3c\5c\u0598\nc\3c\3c\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\3c\5c\u05a5\nc\3c\3c\3c\5c\u05aa\nc\3c\7c\u05ad\nc"+
		"\fc\16c\u05b0\13c\3d\7d\u05b3\nd\fd\16d\u05b6\13d\3d\3d\7d\u05ba\nd\f"+
		"d\16d\u05bd\13d\3d\3d\3e\3e\3e\3e\3f\3f\3f\5f\u05c8\nf\3f\3f\3f\3f\3f"+
		"\7f\u05cf\nf\ff\16f\u05d2\13f\3f\3f\3f\3f\5f\u05d8\nf\3f\5f\u05db\nf\3"+
		"g\3g\5g\u05df\ng\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u05f1"+
		"\nh\5h\u05f3\nh\3i\3i\3i\3i\7i\u05f9\ni\fi\16i\u05fc\13i\3i\3i\3j\3j\3"+
		"j\3j\5j\u0604\nj\3j\3j\3j\3j\3j\5j\u060b\nj\3k\3k\3k\3k\3k\3k\7k\u0613"+
		"\nk\fk\16k\u0616\13k\3k\3k\7k\u061a\nk\fk\16k\u061d\13k\3k\3k\3k\7k\u0622"+
		"\nk\fk\16k\u0625\13k\5k\u0627\nk\3k\3k\3k\7k\u062c\nk\fk\16k\u062f\13"+
		"k\3l\3l\7l\u0633\nl\fl\16l\u0636\13l\5l\u0638\nl\3m\3m\3m\5m\u063d\nm"+
		"\3m\7m\u0640\nm\fm\16m\u0643\13m\3m\3m\5m\u0647\nm\3n\3n\3n\3n\3n\3n\3"+
		"n\5n\u0650\nn\5n\u0652\nn\3o\3o\5o\u0656\no\3o\3o\3o\5o\u065b\no\7o\u065d"+
		"\no\fo\16o\u0660\13o\3o\5o\u0663\no\3p\3p\5p\u0667\np\3p\3p\3q\3q\3q\3"+
		"q\7q\u066f\nq\fq\16q\u0672\13q\3q\3q\3q\3q\3q\3q\3q\7q\u067b\nq\fq\16"+
		"q\u067e\13q\3q\3q\7q\u0682\nq\fq\16q\u0685\13q\5q\u0687\nq\3r\3r\5r\u068b"+
		"\nr\3s\3s\3s\3t\3t\3t\5t\u0693\nt\3u\3u\3u\5u\u0698\nu\3v\3v\3v\3v\3w"+
		"\3w\3w\7w\u06a1\nw\fw\16w\u06a4\13w\3x\7x\u06a7\nx\fx\16x\u06aa\13x\3"+
		"x\3x\5x\u06ae\nx\3x\7x\u06b1\nx\fx\16x\u06b4\13x\3x\3x\7x\u06b8\nx\fx"+
		"\16x\u06bb\13x\3y\3y\3z\3z\3z\3z\7z\u06c3\nz\fz\16z\u06c6\13z\3z\3z\3"+
		"{\3{\3{\5{\u06cd\n{\3{\3{\5{\u06d1\n{\5{\u06d3\n{\3|\3|\3|\3|\3|\5|\u06da"+
		"\n|\3}\3}\5}\u06de\n}\3}\3}\3}\2\4\u00c4\u00d4~\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\2\21\4\2\23\23**\3\2EH\3\2IJ\4\2((>>\4\2\65C\u0082\u0082"+
		"\3\2fi\3\2\\]\4\2jkoo\3\2hi\4\2Z[ab\4\2``cc\4\2YYpz\3\2fg\4\2__{{\n\2"+
		"\5\5\7\7\n\n\20\20\26\26\35\35\37\37\'\'\2\u07a9\2\u010c\3\2\2\2\4\u0111"+
		"\3\2\2\2\6\u0118\3\2\2\2\b\u0131\3\2\2\2\n\u0138\3\2\2\2\f\u0144\3\2\2"+
		"\2\16\u0148\3\2\2\2\20\u014a\3\2\2\2\22\u015d\3\2\2\2\24\u016b\3\2\2\2"+
		"\26\u0179\3\2\2\2\30\u0181\3\2\2\2\32\u0193\3\2\2\2\34\u019e\3\2\2\2\36"+
		"\u01a8\3\2\2\2 \u01af\3\2\2\2\"\u01ba\3\2\2\2$\u01c3\3\2\2\2&\u01d8\3"+
		"\2\2\2(\u01e4\3\2\2\2*\u01e6\3\2\2\2,\u01f8\3\2\2\2.\u01fc\3\2\2\2\60"+
		"\u01fe\3\2\2\2\62\u0201\3\2\2\2\64\u0204\3\2\2\2\66\u020c\3\2\2\28\u0218"+
		"\3\2\2\2:\u0222\3\2\2\2<\u0224\3\2\2\2>\u022f\3\2\2\2@\u023d\3\2\2\2B"+
		"\u0248\3\2\2\2D\u024d\3\2\2\2F\u0256\3\2\2\2H\u0269\3\2\2\2J\u0271\3\2"+
		"\2\2L\u0276\3\2\2\2N\u0280\3\2\2\2P\u0282\3\2\2\2R\u0292\3\2\2\2T\u02ac"+
		"\3\2\2\2V\u02ae\3\2\2\2X\u02b6\3\2\2\2Z\u02c6\3\2\2\2\\\u02de\3\2\2\2"+
		"^\u02e3\3\2\2\2`\u02ec\3\2\2\2b\u02f9\3\2\2\2d\u0304\3\2\2\2f\u030a\3"+
		"\2\2\2h\u0319\3\2\2\2j\u031b\3\2\2\2l\u031d\3\2\2\2n\u0324\3\2\2\2p\u032d"+
		"\3\2\2\2r\u0337\3\2\2\2t\u033f\3\2\2\2v\u0346\3\2\2\2x\u0348\3\2\2\2z"+
		"\u0358\3\2\2\2|\u035d\3\2\2\2~\u036e\3\2\2\2\u0080\u0388\3\2\2\2\u0082"+
		"\u038c\3\2\2\2\u0084\u038e\3\2\2\2\u0086\u0394\3\2\2\2\u0088\u0396\3\2"+
		"\2\2\u008a\u039a\3\2\2\2\u008c\u03a0\3\2\2\2\u008e\u03cd\3\2\2\2\u0090"+
		"\u03cf\3\2\2\2\u0092\u03d1\3\2\2\2\u0094\u03dd\3\2\2\2\u0096\u03e3\3\2"+
		"\2\2\u0098\u03eb\3\2\2\2\u009a\u03ee\3\2\2\2\u009c\u03f7\3\2\2\2\u009e"+
		"\u0405\3\2\2\2\u00a0\u040a\3\2\2\2\u00a2\u0417\3\2\2\2\u00a4\u0425\3\2"+
		"\2\2\u00a6\u0498\3\2\2\2\u00a8\u049a\3\2\2\2\u00aa\u04a7\3\2\2\2\u00ac"+
		"\u04af\3\2\2\2\u00ae\u04b2\3\2\2\2\u00b0\u04b9\3\2\2\2\u00b2\u04d2\3\2"+
		"\2\2\u00b4\u04d5\3\2\2\2\u00b6\u04e9\3\2\2\2\u00b8\u04f7\3\2\2\2\u00ba"+
		"\u04fb\3\2\2\2\u00bc\u0500\3\2\2\2\u00be\u050b\3\2\2\2\u00c0\u050f\3\2"+
		"\2\2\u00c2\u052a\3\2\2\2\u00c4\u0559\3\2\2\2\u00c6\u05b4\3\2\2\2\u00c8"+
		"\u05c0\3\2\2\2\u00ca\u05da\3\2\2\2\u00cc\u05de\3\2\2\2\u00ce\u05f2\3\2"+
		"\2\2\u00d0\u05f4\3\2\2\2\u00d2\u060a\3\2\2\2\u00d4\u0626\3\2\2\2\u00d6"+
		"\u0637\3\2\2\2\u00d8\u063c\3\2\2\2\u00da\u0651\3\2\2\2\u00dc\u0662\3\2"+
		"\2\2\u00de\u0664\3\2\2\2\u00e0\u066a\3\2\2\2\u00e2\u0688\3\2\2\2\u00e4"+
		"\u068c\3\2\2\2\u00e6\u0692\3\2\2\2\u00e8\u0697\3\2\2\2\u00ea\u0699\3\2"+
		"\2\2\u00ec\u069d\3\2\2\2\u00ee\u06a8\3\2\2\2\u00f0\u06bc\3\2\2\2\u00f2"+
		"\u06be\3\2\2\2\u00f4\u06d2\3\2\2\2\u00f6\u06d9\3\2\2\2\u00f8\u06db\3\2"+
		"\2\2\u00fa\u00fc\5\4\3\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u0100\3\2\2\2\u00fd\u00ff\5\6\4\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0106\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0105\5\b\5\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010d\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\5\u008aF\2\u010a\u010b\7\2\2\3\u010b\u010d"+
		"\3\2\2\2\u010c\u00fb\3\2\2\2\u010c\u0109\3\2\2\2\u010d\3\3\2\2\2\u010e"+
		"\u0110\5p9\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2"+
		"\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115"+
		"\7\"\2\2\u0115\u0116\5f\64\2\u0116\u0117\7V\2\2\u0117\5\3\2\2\2\u0118"+
		"\u011a\7\33\2\2\u0119\u011b\7(\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u011f\5f\64\2\u011d\u011e\7X\2\2\u011e"+
		"\u0120\7j\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\7V\2\2\u0122\7\3\2\2\2\u0123\u0125\5\f\7\2\u0124\u0123"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u012e\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012f\5\20\t\2\u012a\u012f\5"+
		"\30\r\2\u012b\u012f\5 \21\2\u012c\u012f\5z>\2\u012d\u012f\5\u0092J\2\u012e"+
		"\u0129\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0132\7V\2\2\u0131"+
		"\u0126\3\2\2\2\u0131\u0130\3\2\2\2\u0132\t\3\2\2\2\u0133\u0139\5\f\7\2"+
		"\u0134\u0139\7 \2\2\u0135\u0139\7,\2\2\u0136\u0139\7\60\2\2\u0137\u0139"+
		"\7\63\2\2\u0138\u0133\3\2\2\2\u0138\u0134\3\2\2\2\u0138\u0135\3\2\2\2"+
		"\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\13\3\2\2\2\u013a\u0145"+
		"\5p9\2\u013b\u0145\7%\2\2\u013c\u0145\7$\2\2\u013d\u0145\7#\2\2\u013e"+
		"\u0145\7(\2\2\u013f\u0145\7\3\2\2\u0140\u0145\7\24\2\2\u0141\u0145\7)"+
		"\2\2\u0142\u0145\7B\2\2\u0143\u0145\7D\2\2\u0144\u013a\3\2\2\2\u0144\u013b"+
		"\3\2\2\2\u0144\u013c\3\2\2\2\u0144\u013d\3\2\2\2\u0144\u013e\3\2\2\2\u0144"+
		"\u013f\3\2\2\2\u0144\u0140\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0143\3\2\2\2\u0145\r\3\2\2\2\u0146\u0149\7\24\2\2\u0147\u0149"+
		"\5p9\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\17\3\2\2\2\u014a"+
		"\u014b\7\13\2\2\u014b\u014d\5\u00a2R\2\u014c\u014e\5\22\n\2\u014d\u014c"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\7\23\2\2"+
		"\u0150\u0152\5\u00eex\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0154\7\32\2\2\u0154\u0156\5\u00ecw\2\u0155\u0153"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0158\7C\2\2\u0158"+
		"\u015a\5\u00ecw\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\5\"\22\2\u015c\21\3\2\2\2\u015d\u015e\7[\2\2\u015e"+
		"\u0163\5\24\13\2\u015f\u0160\7W\2\2\u0160\u0162\5\24\13\2\u0161\u015f"+
		"\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7Z\2\2\u0167\23\3\2\2\2"+
		"\u0168\u016a\5p9\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0177\5\u00a2R\2\u016f\u0173\7\23\2\2\u0170\u0172\5p9\2\u0171\u0170\3"+
		"\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\5\26\f\2\u0177\u016f\3"+
		"\2\2\2\u0177\u0178\3\2\2\2\u0178\25\3\2\2\2\u0179\u017e\5\u00eex\2\u017a"+
		"\u017b\7l\2\2\u017b\u017d\5\u00eex\2\u017c\u017a\3\2\2\2\u017d\u0180\3"+
		"\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\27\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0182\7\22\2\2\u0182\u0185\5\u00a2R\2\u0183\u0184"+
		"\7\32\2\2\u0184\u0186\5\u00ecw\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2"+
		"\2\u0186\u0187\3\2\2\2\u0187\u0189\7R\2\2\u0188\u018a\5\32\16\2\u0189"+
		"\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u018d\7W"+
		"\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u0190\5\36\20\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3"+
		"\2\2\2\u0191\u0192\7S\2\2\u0192\31\3\2\2\2\u0193\u0198\5\34\17\2\u0194"+
		"\u0195\7W\2\2\u0195\u0197\5\34\17\2\u0196\u0194\3\2\2\2\u0197\u019a\3"+
		"\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\33\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019d\5p9\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2"+
		"\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a1\u01a3\5\u00a2R\2\u01a2\u01a4\5\u00f8}\2\u01a3\u01a2\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7\5\"\22\2\u01a6"+
		"\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\35\3\2\2\2\u01a8\u01ac\7V\2\2"+
		"\u01a9\u01ab\5&\24\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\37\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af"+
		"\u01b0\7\36\2\2\u01b0\u01b2\5\u00a2R\2\u01b1\u01b3\5\22\n\2\u01b2\u01b1"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b5\7\23\2\2"+
		"\u01b5\u01b7\5\u00ecw\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b9\5$\23\2\u01b9!\3\2\2\2\u01ba\u01be\7R\2\2\u01bb"+
		"\u01bd\5&\24\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1"+
		"\u01c2\7S\2\2\u01c2#\3\2\2\2\u01c3\u01c7\7R\2\2\u01c4\u01c6\58\35\2\u01c5"+
		"\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\7S\2\2\u01cb"+
		"%\3\2\2\2\u01cc\u01d9\7V\2\2\u01cd\u01cf\7(\2\2\u01ce\u01cd\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d9\5\u009cO\2\u01d1\u01d3"+
		"\5\n\6\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d9\5("+
		"\25\2\u01d8\u01cc\3\2\2\2\u01d8\u01ce\3\2\2\2\u01d8\u01d4\3\2\2\2\u01d9"+
		"\'\3\2\2\2\u01da\u01e5\5*\26\2\u01db\u01e5\5\60\31\2\u01dc\u01e5\5\66"+
		"\34\2\u01dd\u01e5\5\64\33\2\u01de\u01e5\5\62\32\2\u01df\u01e5\5 \21\2"+
		"\u01e0\u01e5\5z>\2\u01e1\u01e5\5\20\t\2\u01e2\u01e5\5\30\r\2\u01e3\u01e5"+
		"\5\u0092J\2\u01e4\u01da\3\2\2\2\u01e4\u01db\3\2\2\2\u01e4\u01dc\3\2\2"+
		"\2\u01e4\u01dd\3\2\2\2\u01e4\u01de\3\2\2\2\u01e4\u01df\3\2\2\2\u01e4\u01e0"+
		"\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5"+
		")\3\2\2\2\u01e6\u01e7\5.\30\2\u01e7\u01e8\5\u00a2R\2\u01e8\u01ed\5X-\2"+
		"\u01e9\u01ea\7T\2\2\u01ea\u01ec\7U\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ef"+
		"\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f2\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f1\7/\2\2\u01f1\u01f3\5V,\2\u01f2\u01f0\3\2\2"+
		"\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\5,\27\2\u01f5+"+
		"\3\2\2\2\u01f6\u01f9\5\u009cO\2\u01f7\u01f9\7V\2\2\u01f8\u01f6\3\2\2\2"+
		"\u01f8\u01f7\3\2\2\2\u01f9-\3\2\2\2\u01fa\u01fd\5\u00eex\2\u01fb\u01fd"+
		"\7\62\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd/\3\2\2\2\u01fe"+
		"\u01ff\5\22\n\2\u01ff\u0200\5*\26\2\u0200\61\3\2\2\2\u0201\u0202\5\22"+
		"\n\2\u0202\u0203\5\64\33\2\u0203\63\3\2\2\2\u0204\u0205\5\u00a2R\2\u0205"+
		"\u0208\5X-\2\u0206\u0207\7/\2\2\u0207\u0209\5V,\2\u0208\u0206\3\2\2\2"+
		"\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\5\u009cO\2\u020b"+
		"\65\3\2\2\2\u020c\u020d\5\u00eex\2\u020d\u020e\5H%\2\u020e\u020f\7V\2"+
		"\2\u020f\67\3\2\2\2\u0210\u0212\5\n\6\2\u0211\u0210\3\2\2\2\u0212\u0215"+
		"\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215"+
		"\u0213\3\2\2\2\u0216\u0219\5:\36\2\u0217\u0219\7V\2\2\u0218\u0213\3\2"+
		"\2\2\u0218\u0217\3\2\2\2\u02199\3\2\2\2\u021a\u0223\5<\37\2\u021b\u0223"+
		"\5@!\2\u021c\u0223\5D#\2\u021d\u0223\5 \21\2\u021e\u0223\5z>\2\u021f\u0223"+
		"\5\20\t\2\u0220\u0223\5\30\r\2\u0221\u0223\5\u0092J\2\u0222\u021a\3\2"+
		"\2\2\u0222\u021b\3\2\2\2\u0222\u021c\3\2\2\2\u0222\u021d\3\2\2\2\u0222"+
		"\u021e\3\2\2\2\u0222\u021f\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2"+
		"\2\2\u0223;\3\2\2\2\u0224\u0225\5\u00eex\2\u0225\u022a\5> \2\u0226\u0227"+
		"\7W\2\2\u0227\u0229\5> \2\u0228\u0226\3\2\2\2\u0229\u022c\3\2\2\2\u022a"+
		"\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022a\3\2"+
		"\2\2\u022d\u022e\7V\2\2\u022e=\3\2\2\2\u022f\u0234\5\u00a2R\2\u0230\u0231"+
		"\7T\2\2\u0231\u0233\7U\2\2\u0232\u0230\3\2\2\2\u0233\u0236\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0234\3\2"+
		"\2\2\u0237\u0238\7Y\2\2\u0238\u0239\5N(\2\u0239?\3\2\2\2\u023a\u023c\5"+
		"B\"\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241\5F"+
		"$\2\u0241A\3\2\2\2\u0242\u0249\5p9\2\u0243\u0249\7%\2\2\u0244\u0249\7"+
		"\3\2\2\u0245\u0249\7\16\2\2\u0246\u0249\7(\2\2\u0247\u0249\7)\2\2\u0248"+
		"\u0242\3\2\2\2\u0248\u0243\3\2\2\2\u0248\u0244\3\2\2\2\u0248\u0245\3\2"+
		"\2\2\u0248\u0246\3\2\2\2\u0248\u0247\3\2\2\2\u0249C\3\2\2\2\u024a\u024c"+
		"\5B\"\2\u024b\u024a\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0251\5\22"+
		"\n\2\u0251\u0252\5F$\2\u0252E\3\2\2\2\u0253\u0255\5p9\2\u0254\u0253\3"+
		"\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u0259\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025a\5.\30\2\u025a\u025b\5\u00a2"+
		"R\2\u025b\u0260\5X-\2\u025c\u025d\7T\2\2\u025d\u025f\7U\2\2\u025e\u025c"+
		"\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"\u0265\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264\7/\2\2\u0264\u0266\5V,"+
		"\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268"+
		"\5,\27\2\u0268G\3\2\2\2\u0269\u026e\5J&\2\u026a\u026b\7W\2\2\u026b\u026d"+
		"\5J&\2\u026c\u026a\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e"+
		"\u026f\3\2\2\2\u026fI\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0274\5L\'\2\u0272"+
		"\u0273\7Y\2\2\u0273\u0275\5N(\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2"+
		"\2\u0275K\3\2\2\2\u0276\u027b\5\u00a2R\2\u0277\u0278\7T\2\2\u0278\u027a"+
		"\7U\2\2\u0279\u0277\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027cM\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0281\5P)\2\u027f"+
		"\u0281\5\u00c4c\2\u0280\u027e\3\2\2\2\u0280\u027f\3\2\2\2\u0281O\3\2\2"+
		"\2\u0282\u028e\7R\2\2\u0283\u0288\5N(\2\u0284\u0285\7W\2\2\u0285\u0287"+
		"\5N(\2\u0286\u0284\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288"+
		"\u0289\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028d\7W"+
		"\2\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e"+
		"\u0283\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\7S"+
		"\2\2\u0291Q\3\2\2\2\u0292\u0294\5\u00a2R\2\u0293\u0295\5\u00f2z\2\u0294"+
		"\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u029d\3\2\2\2\u0296\u0297\7X"+
		"\2\2\u0297\u0299\5\u00a2R\2\u0298\u029a\5\u00f2z\2\u0299\u0298\3\2\2\2"+
		"\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0296\3\2\2\2\u029c\u029f"+
		"\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029eS\3\2\2\2\u029f"+
		"\u029d\3\2\2\2\u02a0\u02ad\5\u00eex\2\u02a1\u02a3\5p9\2\u02a2\u02a1\3"+
		"\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a7\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02aa\7^\2\2\u02a8\u02a9\t\2"+
		"\2\2\u02a9\u02ab\5\u00eex\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02ad\3\2\2\2\u02ac\u02a0\3\2\2\2\u02ac\u02a4\3\2\2\2\u02adU\3\2\2\2"+
		"\u02ae\u02b3\5f\64\2\u02af\u02b0\7W\2\2\u02b0\u02b2\5f\64\2\u02b1\u02af"+
		"\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"W\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02c2\7P\2\2\u02b7\u02b9\5Z.\2\u02b8"+
		"\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02c3\3\2\2\2\u02ba\u02bd\5Z"+
		".\2\u02bb\u02bc\7W\2\2\u02bc\u02be\5\\/\2\u02bd\u02bb\3\2\2\2\u02bd\u02be"+
		"\3\2\2\2\u02be\u02c3\3\2\2\2\u02bf\u02c1\5\\/\2\u02c0\u02bf\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02b8\3\2\2\2\u02c2\u02ba\3\2"+
		"\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\7Q\2\2\u02c5"+
		"Y\3\2\2\2\u02c6\u02cc\5\u00eex\2\u02c7\u02c8\5\u00a2R\2\u02c8\u02c9\7"+
		"X\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c7\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc"+
		"\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02cc\3\2"+
		"\2\2\u02cf\u02d0\7-\2\2\u02d0[\3\2\2\2\u02d1\u02d6\5^\60\2\u02d2\u02d3"+
		"\7W\2\2\u02d3\u02d5\5^\60\2\u02d4\u02d2\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6"+
		"\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02db\3\2\2\2\u02d8\u02d6\3\2"+
		"\2\2\u02d9\u02da\7W\2\2\u02da\u02dc\5`\61\2\u02db\u02d9\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02df\5`\61\2\u02de\u02d1\3\2"+
		"\2\2\u02de\u02dd\3\2\2\2\u02df]\3\2\2\2\u02e0\u02e2\5\16\b\2\u02e1\u02e0"+
		"\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e6\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e7\5\u00eex\2\u02e7\u02e8"+
		"\5L\'\2\u02e8_\3\2\2\2\u02e9\u02eb\5\16\b\2\u02ea\u02e9\3\2\2\2\u02eb"+
		"\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2"+
		"\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f3\5\u00eex\2\u02f0\u02f2\5p9\2\u02f1"+
		"\u02f0\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2"+
		"\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f7\7~\2\2\u02f7"+
		"\u02f8\5L\'\2\u02f8a\3\2\2\2\u02f9\u02fe\5d\63\2\u02fa\u02fb\7W\2\2\u02fb"+
		"\u02fd\5d\63\2\u02fc\u02fa\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2"+
		"\2\2\u02fe\u02ff\3\2\2\2\u02ffc\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0303"+
		"\5\16\b\2\u0302\u0301\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2"+
		"\u0304\u0305\3\2\2\2\u0305\u0307\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u0308"+
		"\7?\2\2\u0308\u0309\5\u00a2R\2\u0309e\3\2\2\2\u030a\u030f\5\u00a2R\2\u030b"+
		"\u030c\7X\2\2\u030c\u030e\5\u00a2R\2\u030d\u030b\3\2\2\2\u030e\u0311\3"+
		"\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310g\3\2\2\2\u0311\u030f"+
		"\3\2\2\2\u0312\u031a\5j\66\2\u0313\u031a\5l\67\2\u0314\u031a\7L\2\2\u0315"+
		"\u031a\7M\2\2\u0316\u031a\7K\2\2\u0317\u031a\7O\2\2\u0318\u031a\7N\2\2"+
		"\u0319\u0312\3\2\2\2\u0319\u0313\3\2\2\2\u0319\u0314\3\2\2\2\u0319\u0315"+
		"\3\2\2\2\u0319\u0316\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u0318\3\2\2\2\u031a"+
		"i\3\2\2\2\u031b\u031c\t\3\2\2\u031ck\3\2\2\2\u031d\u031e\t\4\2\2\u031e"+
		"m\3\2\2\2\u031f\u0320\5\u00a2R\2\u0320\u0321\7X\2\2\u0321\u0323\3\2\2"+
		"\2\u0322\u031f\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325"+
		"\3\2\2\2\u0325\u0327\3\2\2\2\u0326\u0324\3\2\2\2\u0327\u0328\7}\2\2\u0328"+
		"\u0329\5\u00a2R\2\u0329o\3\2\2\2\u032a\u032b\7}\2\2\u032b\u032e\5f\64"+
		"\2\u032c\u032e\5n8\2\u032d\u032a\3\2\2\2\u032d\u032c\3\2\2\2\u032e\u0335"+
		"\3\2\2\2\u032f\u0332\7P\2\2\u0330\u0333\5r:\2\u0331\u0333\5v<\2\u0332"+
		"\u0330\3\2\2\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2"+
		"\2\2\u0334\u0336\7Q\2\2\u0335\u032f\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"q\3\2\2\2\u0337\u033c\5t;\2\u0338\u0339\7W\2\2\u0339\u033b\5t;\2\u033a"+
		"\u0338\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2"+
		"\2\2\u033ds\3\2\2\2\u033e\u033c\3\2\2\2\u033f\u0340\5\u00a2R\2\u0340\u0341"+
		"\7Y\2\2\u0341\u0342\5v<\2\u0342u\3\2\2\2\u0343\u0347\5\u00c4c\2\u0344"+
		"\u0347\5p9\2\u0345\u0347\5x=\2\u0346\u0343\3\2\2\2\u0346\u0344\3\2\2\2"+
		"\u0346\u0345\3\2\2\2\u0347w\3\2\2\2\u0348\u0351\7R\2\2\u0349\u034e\5v"+
		"<\2\u034a\u034b\7W\2\2\u034b\u034d\5v<\2\u034c\u034a\3\2\2\2\u034d\u0350"+
		"\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0352\3\2\2\2\u0350"+
		"\u034e\3\2\2\2\u0351\u0349\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2"+
		"\2\2\u0353\u0355\7W\2\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0357\7S\2\2\u0357y\3\2\2\2\u0358\u0359\7}\2\2\u0359"+
		"\u035a\7\36\2\2\u035a\u035b\5\u00a2R\2\u035b\u035c\5|?\2\u035c{\3\2\2"+
		"\2\u035d\u0361\7R\2\2\u035e\u0360\5~@\2\u035f\u035e\3\2\2\2\u0360\u0363"+
		"\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363"+
		"\u0361\3\2\2\2\u0364\u0365\7S\2\2\u0365}\3\2\2\2\u0366\u0368\5\n\6\2\u0367"+
		"\u0366\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2"+
		"\2\2\u036a\u036c\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u036f\5\u0080A\2\u036d"+
		"\u036f\7V\2\2\u036e\u0369\3\2\2\2\u036e\u036d\3\2\2\2\u036f\177\3\2\2"+
		"\2\u0370\u0371\5\u00eex\2\u0371\u0372\5\u0082B\2\u0372\u0373\7V\2\2\u0373"+
		"\u0389\3\2\2\2\u0374\u0376\5\20\t\2\u0375\u0377\7V\2\2\u0376\u0375\3\2"+
		"\2\2\u0376\u0377\3\2\2\2\u0377\u0389\3\2\2\2\u0378\u037a\5 \21\2\u0379"+
		"\u037b\7V\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0389\3\2"+
		"\2\2\u037c\u037e\5\30\r\2\u037d\u037f\7V\2\2\u037e\u037d\3\2\2\2\u037e"+
		"\u037f\3\2\2\2\u037f\u0389\3\2\2\2\u0380\u0382\5z>\2\u0381\u0383\7V\2"+
		"\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0389\3\2\2\2\u0384\u0386"+
		"\5\u0092J\2\u0385\u0387\7V\2\2\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2\2"+
		"\u0387\u0389\3\2\2\2\u0388\u0370\3\2\2\2\u0388\u0374\3\2\2\2\u0388\u0378"+
		"\3\2\2\2\u0388\u037c\3\2\2\2\u0388\u0380\3\2\2\2\u0388\u0384\3\2\2\2\u0389"+
		"\u0081\3\2\2\2\u038a\u038d\5\u0084C\2\u038b\u038d\5\u0086D\2\u038c\u038a"+
		"\3\2\2\2\u038c\u038b\3\2\2\2\u038d\u0083\3\2\2\2\u038e\u038f\5\u00a2R"+
		"\2\u038f\u0390\7P\2\2\u0390\u0392\7Q\2\2\u0391\u0393\5\u0088E\2\u0392"+
		"\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0085\3\2\2\2\u0394\u0395\5H"+
		"%\2\u0395\u0087\3\2\2\2\u0396\u0397\7\16\2\2\u0397\u0398\5v<\2\u0398\u0089"+
		"\3\2\2\2\u0399\u039b\7\66\2\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2"+
		"\u039b\u039c\3\2\2\2\u039c\u039d\7\65\2\2\u039d\u039e\5f\64\2\u039e\u039f"+
		"\5\u008cG\2\u039f\u008b\3\2\2\2\u03a0\u03a4\7R\2\2\u03a1\u03a3\5\u008e"+
		"H\2\u03a2\u03a1\3\2\2\2\u03a3\u03a6\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4"+
		"\u03a5\3\2\2\2\u03a5\u03a7\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7\u03a8\7S"+
		"\2\2\u03a8\u008d\3\2\2\2\u03a9\u03ad\7\67\2\2\u03aa\u03ac\5\u0090I\2\u03ab"+
		"\u03aa\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2"+
		"\2\2\u03ae\u03b0\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03b1\5f\64\2\u03b1"+
		"\u03b2\7V\2\2\u03b2\u03ce\3\2\2\2\u03b3\u03b4\78\2\2\u03b4\u03b7\5f\64"+
		"\2\u03b5\u03b6\7:\2\2\u03b6\u03b8\5f\64\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8"+
		"\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\7V\2\2\u03ba\u03ce\3\2\2\2\u03bb"+
		"\u03bc\79\2\2\u03bc\u03bf\5f\64\2\u03bd\u03be\7:\2\2\u03be\u03c0\5f\64"+
		"\2\u03bf\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2"+
		"\7V\2\2\u03c2\u03ce\3\2\2\2\u03c3\u03c4\7;\2\2\u03c4\u03c5\5f\64\2\u03c5"+
		"\u03c6\7V\2\2\u03c6\u03ce\3\2\2\2\u03c7\u03c8\7<\2\2\u03c8\u03c9\5f\64"+
		"\2\u03c9\u03ca\7=\2\2\u03ca\u03cb\5f\64\2\u03cb\u03cc\7V\2\2\u03cc\u03ce"+
		"\3\2\2\2\u03cd\u03a9\3\2\2\2\u03cd\u03b3\3\2\2\2\u03cd\u03bb\3\2\2\2\u03cd"+
		"\u03c3\3\2\2\2\u03cd\u03c7\3\2\2\2\u03ce\u008f\3\2\2\2\u03cf\u03d0\t\5"+
		"\2\2\u03d0\u0091\3\2\2\2\u03d1\u03d2\7A\2\2\u03d2\u03d4\5\u00a2R\2\u03d3"+
		"\u03d5\5\22\n\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3"+
		"\2\2\2\u03d6\u03d9\5\u0094K\2\u03d7\u03d8\7\32\2\2\u03d8\u03da\5\u00ec"+
		"w\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03dc\5\u009aN\2\u03dc\u0093\3\2\2\2\u03dd\u03df\7P\2\2\u03de\u03e0\5"+
		"\u0096L\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2\2\2"+
		"\u03e1\u03e2\7Q\2\2\u03e2\u0095\3\2\2\2\u03e3\u03e8\5\u0098M\2\u03e4\u03e5"+
		"\7W\2\2\u03e5\u03e7\5\u0098M\2\u03e6\u03e4\3\2\2\2\u03e7\u03ea\3\2\2\2"+
		"\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u0097\3\2\2\2\u03ea\u03e8"+
		"\3\2\2\2\u03eb\u03ec\5\u00eex\2\u03ec\u03ed\5\u00a2R\2\u03ed\u0099\3\2"+
		"\2\2\u03ee\u03f2\7R\2\2\u03ef\u03f1\5&\24\2\u03f0\u03ef\3\2\2\2\u03f1"+
		"\u03f4\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f5\3\2"+
		"\2\2\u03f4\u03f2\3\2\2\2\u03f5\u03f6\7S\2\2\u03f6\u009b\3\2\2\2\u03f7"+
		"\u03fb\7R\2\2\u03f8\u03fa\5\u009eP\2\u03f9\u03f8\3\2\2\2\u03fa\u03fd\3"+
		"\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe\3\2\2\2\u03fd"+
		"\u03fb\3\2\2\2\u03fe\u03ff\7S\2\2\u03ff\u009d\3\2\2\2\u0400\u0401\5\u00a0"+
		"Q\2\u0401\u0402\7V\2\2\u0402\u0406\3\2\2\2\u0403\u0406\5\u00a6T\2\u0404"+
		"\u0406\5\u00a4S\2\u0405\u0400\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0404"+
		"\3\2\2\2\u0406\u009f\3\2\2\2\u0407\u0409\5\16\b\2\u0408\u0407\3\2\2\2"+
		"\u0409\u040c\3\2\2\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u0415"+
		"\3\2\2\2\u040c\u040a\3\2\2\2\u040d\u040e\5\u00eex\2\u040e\u040f\5H%\2"+
		"\u040f\u0416\3\2\2\2\u0410\u0411\7?\2\2\u0411\u0412\5\u00a2R\2\u0412\u0413"+
		"\7Y\2\2\u0413\u0414\5\u00c4c\2\u0414\u0416\3\2\2\2\u0415\u040d\3\2\2\2"+
		"\u0415\u0410\3\2\2\2\u0416\u00a1\3\2\2\2\u0417\u0418\t\6\2\2\u0418\u00a3"+
		"\3\2\2\2\u0419\u041b\5\f\7\2\u041a\u0419\3\2\2\2\u041b\u041e\3\2\2\2\u041c"+
		"\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u0422\3\2\2\2\u041e\u041c\3\2"+
		"\2\2\u041f\u0423\5\20\t\2\u0420\u0423\5 \21\2\u0421\u0423\5\u0092J\2\u0422"+
		"\u041f\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0421\3\2\2\2\u0423\u0426\3\2"+
		"\2\2\u0424\u0426\7V\2\2\u0425\u041c\3\2\2\2\u0425\u0424\3\2\2\2\u0426"+
		"\u00a5\3\2\2\2\u0427\u0499\5\u009cO\2\u0428\u0429\7\4\2\2\u0429\u042c"+
		"\5\u00c4c\2\u042a\u042b\7_\2\2\u042b\u042d\5\u00c4c\2\u042c\u042a\3\2"+
		"\2\2\u042c\u042d\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\7V\2\2\u042f"+
		"\u0499\3\2\2\2\u0430\u0431\7\30\2\2\u0431\u0432\5\u00be`\2\u0432\u0435"+
		"\5\u00a6T\2\u0433\u0434\7\21\2\2\u0434\u0436\5\u00a6T\2\u0435\u0433\3"+
		"\2\2\2\u0435\u0436\3\2\2\2\u0436\u0499\3\2\2\2\u0437\u0438\7\27\2\2\u0438"+
		"\u0439\7P\2\2\u0439\u043a\5\u00b8]\2\u043a\u043b\7Q\2\2\u043b\u043c\5"+
		"\u00a6T\2\u043c\u0499\3\2\2\2\u043d\u043e\7\64\2\2\u043e\u043f\5\u00be"+
		"`\2\u043f\u0440\5\u00a6T\2\u0440\u0499\3\2\2\2\u0441\u0442\7\17\2\2\u0442"+
		"\u0443\5\u00a6T\2\u0443\u0444\7\64\2\2\u0444\u0445\5\u00be`\2\u0445\u0446"+
		"\7V\2\2\u0446\u0499\3\2\2\2\u0447\u0448\7\61\2\2\u0448\u0452\5\u009cO"+
		"\2\u0449\u044b\5\u00a8U\2\u044a\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c"+
		"\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044f\3\2\2\2\u044e\u0450\5\u00ac"+
		"W\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0453\3\2\2\2\u0451"+
		"\u0453\5\u00acW\2\u0452\u044a\3\2\2\2\u0452\u0451\3\2\2\2\u0453\u0499"+
		"\3\2\2\2\u0454\u0455\7\61\2\2\u0455\u0456\5\u00aeX\2\u0456\u045a\5\u009c"+
		"O\2\u0457\u0459\5\u00a8U\2\u0458\u0457\3\2\2\2\u0459\u045c\3\2\2\2\u045a"+
		"\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045e\3\2\2\2\u045c\u045a\3\2"+
		"\2\2\u045d\u045f\5\u00acW\2\u045e\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f"+
		"\u0499\3\2\2\2\u0460\u0461\7+\2\2\u0461\u0462\5\u00be`\2\u0462\u0466\7"+
		"R\2\2\u0463\u0465\5\u00b4[\2\u0464\u0463\3\2\2\2\u0465\u0468\3\2\2\2\u0466"+
		"\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u046c\3\2\2\2\u0468\u0466\3\2"+
		"\2\2\u0469\u046b\5\u00b6\\\2\u046a\u0469\3\2\2\2\u046b\u046e\3\2\2\2\u046c"+
		"\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046f\3\2\2\2\u046e\u046c\3\2"+
		"\2\2\u046f\u0470\7S\2\2\u0470\u0499\3\2\2\2\u0471\u0472\7,\2\2\u0472\u0473"+
		"\5\u00be`\2\u0473\u0474\5\u009cO\2\u0474\u0499\3\2\2\2\u0475\u0477\7&"+
		"\2\2\u0476\u0478\5\u00c4c\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478"+
		"\u0479\3\2\2\2\u0479\u0499\7V\2\2\u047a\u047b\7.\2\2\u047b\u047c\5\u00c4"+
		"c\2\u047c\u047d\7V\2\2\u047d\u0499\3\2\2\2\u047e\u0480\7\6\2\2\u047f\u0481"+
		"\5\u00a2R\2\u0480\u047f\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2"+
		"\2\u0482\u0499\7V\2\2\u0483\u0485\7\r\2\2\u0484\u0486\5\u00a2R\2\u0485"+
		"\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0499\7V"+
		"\2\2\u0488\u0489\7@\2\2\u0489\u048a\5\u00c4c\2\u048a\u048b\7V\2\2\u048b"+
		"\u0499\3\2\2\2\u048c\u0499\7V\2\2\u048d\u048e\5\u00c4c\2\u048e\u048f\7"+
		"V\2\2\u048f\u0499\3\2\2\2\u0490\u0492\5\u00d0i\2\u0491\u0493\7V\2\2\u0492"+
		"\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0499\3\2\2\2\u0494\u0495\5\u00a2"+
		"R\2\u0495\u0496\7_\2\2\u0496\u0497\5\u00a6T\2\u0497\u0499\3\2\2\2\u0498"+
		"\u0427\3\2\2\2\u0498\u0428\3\2\2\2\u0498\u0430\3\2\2\2\u0498\u0437\3\2"+
		"\2\2\u0498\u043d\3\2\2\2\u0498\u0441\3\2\2\2\u0498\u0447\3\2\2\2\u0498"+
		"\u0454\3\2\2\2\u0498\u0460\3\2\2\2\u0498\u0471\3\2\2\2\u0498\u0475\3\2"+
		"\2\2\u0498\u047a\3\2\2\2\u0498\u047e\3\2\2\2\u0498\u0483\3\2\2\2\u0498"+
		"\u0488\3\2\2\2\u0498\u048c\3\2\2\2\u0498\u048d\3\2\2\2\u0498\u0490\3\2"+
		"\2\2\u0498\u0494\3\2\2\2\u0499\u00a7\3\2\2\2\u049a\u049b\7\t\2\2\u049b"+
		"\u049f\7P\2\2\u049c\u049e\5\16\b\2\u049d\u049c\3\2\2\2\u049e\u04a1\3\2"+
		"\2\2\u049f\u049d\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\3\2\2\2\u04a1"+
		"\u049f\3\2\2\2\u04a2\u04a3\5\u00aaV\2\u04a3\u04a4\5\u00a2R\2\u04a4\u04a5"+
		"\7Q\2\2\u04a5\u04a6\5\u009cO\2\u04a6\u00a9\3\2\2\2\u04a7\u04ac\5f\64\2"+
		"\u04a8\u04a9\7m\2\2\u04a9\u04ab\5f\64\2\u04aa\u04a8\3\2\2\2\u04ab\u04ae"+
		"\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u00ab\3\2\2\2\u04ae"+
		"\u04ac\3\2\2\2\u04af\u04b0\7\25\2\2\u04b0\u04b1\5\u009cO\2\u04b1\u00ad"+
		"\3\2\2\2\u04b2\u04b3\7P\2\2\u04b3\u04b5\5\u00b0Y\2\u04b4\u04b6\7V\2\2"+
		"\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8"+
		"\7Q\2\2\u04b8\u00af\3\2\2\2\u04b9\u04be\5\u00b2Z\2\u04ba\u04bb\7V\2\2"+
		"\u04bb\u04bd\5\u00b2Z\2\u04bc\u04ba\3\2\2\2\u04bd\u04c0\3\2\2\2\u04be"+
		"\u04bc\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u00b1\3\2\2\2\u04c0\u04be\3\2"+
		"\2\2\u04c1\u04c3\5\16\b\2\u04c2\u04c1\3\2\2\2\u04c3\u04c6\3\2\2\2\u04c4"+
		"\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04cc\3\2\2\2\u04c6\u04c4\3\2"+
		"\2\2\u04c7\u04c8\5R*\2\u04c8\u04c9\5L\'\2\u04c9\u04cd\3\2\2\2\u04ca\u04cb"+
		"\7?\2\2\u04cb\u04cd\5\u00a2R\2\u04cc\u04c7\3\2\2\2\u04cc\u04ca\3\2\2\2"+
		"\u04cd\u04ce\3\2\2\2\u04ce\u04cf\7Y\2\2\u04cf\u04d0\5\u00c4c\2\u04d0\u04d3"+
		"\3\2\2\2\u04d1\u04d3\5\u00a2R\2\u04d2\u04c4\3\2\2\2\u04d2\u04d1\3\2\2"+
		"\2\u04d3\u00b3\3\2\2\2\u04d4\u04d6\5\u00b6\\\2\u04d5\u04d4\3\2\2\2\u04d6"+
		"\u04d7\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04da\3\2"+
		"\2\2\u04d9\u04db\5\u009eP\2\u04da\u04d9\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc"+
		"\u04da\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u00b5\3\2\2\2\u04de\u04e4\7\b"+
		"\2\2\u04df\u04e5\5\u00c4c\2\u04e0\u04e5\7\u0082\2\2\u04e1\u04e2\5\u00ee"+
		"x\2\u04e2\u04e3\5\u00a2R\2\u04e3\u04e5\3\2\2\2\u04e4\u04df\3\2\2\2\u04e4"+
		"\u04e0\3\2\2\2\u04e4\u04e1\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04ea\7_"+
		"\2\2\u04e7\u04e8\7\16\2\2\u04e8\u04ea\7_\2\2\u04e9\u04de\3\2\2\2\u04e9"+
		"\u04e7\3\2\2\2\u04ea\u00b7\3\2\2\2\u04eb\u04f8\5\u00bc_\2\u04ec\u04ee"+
		"\5\u00ba^\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2"+
		"\2\u04ef\u04f1\7V\2\2\u04f0\u04f2\5\u00c4c\2\u04f1\u04f0\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f5\7V\2\2\u04f4\u04f6\5\u00c0"+
		"a\2\u04f5\u04f4\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f8\3\2\2\2\u04f7"+
		"\u04eb\3\2\2\2\u04f7\u04ed\3\2\2\2\u04f8\u00b9\3\2\2\2\u04f9\u04fc\5\u00a0"+
		"Q\2\u04fa\u04fc\5\u00c0a\2\u04fb\u04f9\3\2\2\2\u04fb\u04fa\3\2\2\2\u04fc"+
		"\u00bb\3\2\2\2\u04fd\u04ff\5\16\b\2\u04fe\u04fd\3\2\2\2\u04ff\u0502\3"+
		"\2\2\2\u0500\u04fe\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0505\3\2\2\2\u0502"+
		"\u0500\3\2\2\2\u0503\u0506\5\u00eex\2\u0504\u0506\7?\2\2\u0505\u0503\3"+
		"\2\2\2\u0505\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\5L\'\2\u0508"+
		"\u0509\7_\2\2\u0509\u050a\5\u00c4c\2\u050a\u00bd\3\2\2\2\u050b\u050c\7"+
		"P\2\2\u050c\u050d\5\u00c4c\2\u050d\u050e\7Q\2\2\u050e\u00bf\3\2\2\2\u050f"+
		"\u0514\5\u00c4c\2\u0510\u0511\7W\2\2\u0511\u0513\5\u00c4c\2\u0512\u0510"+
		"\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0512\3\2\2\2\u0514\u0515\3\2\2\2\u0515"+
		"\u00c1\3\2\2\2\u0516\u0514\3\2\2\2\u0517\u0518\5\u00a2R\2\u0518\u051a"+
		"\7P\2\2\u0519\u051b\5\u00c0a\2\u051a\u0519\3\2\2\2\u051a\u051b\3\2\2\2"+
		"\u051b\u051c\3\2\2\2\u051c\u051d\7Q\2\2\u051d\u052b\3\2\2\2\u051e\u051f"+
		"\7-\2\2\u051f\u0521\7P\2\2\u0520\u0522\5\u00c0a\2\u0521\u0520\3\2\2\2"+
		"\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u052b\7Q\2\2\u0524\u0525"+
		"\7*\2\2\u0525\u0527\7P\2\2\u0526\u0528\5\u00c0a\2\u0527\u0526\3\2\2\2"+
		"\u0527\u0528\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052b\7Q\2\2\u052a\u0517"+
		"\3\2\2\2\u052a\u051e\3\2\2\2\u052a\u0524\3\2\2\2\u052b\u00c3\3\2\2\2\u052c"+
		"\u052d\bc\1\2\u052d\u055a\5\u00ceh\2\u052e\u055a\5\u00c2b\2\u052f\u0530"+
		"\7!\2\2\u0530\u055a\5\u00dan\2\u0531\u0535\7P\2\2\u0532\u0534\5p9\2\u0533"+
		"\u0532\3\2\2\2\u0534\u0537\3\2\2\2\u0535\u0533\3\2\2\2\u0535\u0536\3\2"+
		"\2\2\u0536\u0538\3\2\2\2\u0537\u0535\3\2\2\2\u0538\u053d\5\u00eex\2\u0539"+
		"\u053a\7l\2\2\u053a\u053c\5\u00eex\2\u053b\u0539\3\2\2\2\u053c\u053f\3"+
		"\2\2\2\u053d\u053b\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u0540\3\2\2\2\u053f"+
		"\u053d\3\2\2\2\u0540\u0541\7Q\2\2\u0541\u0542\5\u00c4c\30\u0542\u055a"+
		"\3\2\2\2\u0543\u0544\t\7\2\2\u0544\u055a\5\u00c4c\26\u0545\u0546\t\b\2"+
		"\2\u0546\u055a\5\u00c4c\25\u0547\u055a\5\u00c8e\2\u0548\u055a\5\u00d0"+
		"i\2\u0549\u054a\5\u00eex\2\u054a\u0550\7|\2\2\u054b\u054d\5\u00f2z\2\u054c"+
		"\u054b\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0551\5\u00a2"+
		"R\2\u054f\u0551\7!\2\2\u0550\u054c\3\2\2\2\u0550\u054f\3\2\2\2\u0551\u055a"+
		"\3\2\2\2\u0552\u0553\5\u00d8m\2\u0553\u0555\7|\2\2\u0554\u0556\5\u00f2"+
		"z\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557\3\2\2\2\u0557"+
		"\u0558\7!\2\2\u0558\u055a\3\2\2\2\u0559\u052c\3\2\2\2\u0559\u052e\3\2"+
		"\2\2\u0559\u052f\3\2\2\2\u0559\u0531\3\2\2\2\u0559\u0543\3\2\2\2\u0559"+
		"\u0545\3\2\2\2\u0559\u0547\3\2\2\2\u0559\u0548\3\2\2\2\u0559\u0549\3\2"+
		"\2\2\u0559\u0552\3\2\2\2\u055a\u05ae\3\2\2\2\u055b\u055c\f\24\2\2\u055c"+
		"\u055d\t\t\2\2\u055d\u05ad\5\u00c4c\25\u055e\u055f\f\23\2\2\u055f\u0560"+
		"\t\n\2\2\u0560\u05ad\5\u00c4c\24\u0561\u0569\f\22\2\2\u0562\u0563\7[\2"+
		"\2\u0563\u056a\7[\2\2\u0564\u0565\7Z\2\2\u0565\u0566\7Z\2\2\u0566\u056a"+
		"\7Z\2\2\u0567\u0568\7Z\2\2\u0568\u056a\7Z\2\2\u0569\u0562\3\2\2\2\u0569"+
		"\u0564\3\2\2\2\u0569\u0567\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u05ad\5\u00c4"+
		"c\23\u056c\u056d\f\21\2\2\u056d\u056e\t\13\2\2\u056e\u05ad\5\u00c4c\22"+
		"\u056f\u0570\f\17\2\2\u0570\u0571\t\f\2\2\u0571\u05ad\5\u00c4c\20\u0572"+
		"\u0573\f\16\2\2\u0573\u0574\7l\2\2\u0574\u05ad\5\u00c4c\17\u0575\u0576"+
		"\f\r\2\2\u0576\u0577\7n\2\2\u0577\u05ad\5\u00c4c\16\u0578\u0579\f\f\2"+
		"\2\u0579\u057a\7m\2\2\u057a\u05ad\5\u00c4c\r\u057b\u057c\f\13\2\2\u057c"+
		"\u057d\7d\2\2\u057d\u05ad\5\u00c4c\f\u057e\u057f\f\n\2\2\u057f\u0580\7"+
		"e\2\2\u0580\u05ad\5\u00c4c\13\u0581\u0582\f\t\2\2\u0582\u0583\7^\2\2\u0583"+
		"\u0584\5\u00c4c\2\u0584\u0585\7_\2\2\u0585\u0586\5\u00c4c\t\u0586\u05ad"+
		"\3\2\2\2\u0587\u0588\f\b\2\2\u0588\u0589\t\r\2\2\u0589\u05ad\5\u00c4c"+
		"\b\u058a\u058b\f\34\2\2\u058b\u0597\7X\2\2\u058c\u0598\5\u00a2R\2\u058d"+
		"\u0598\5\u00c2b\2\u058e\u0598\7-\2\2\u058f\u0591\7!\2\2\u0590\u0592\5"+
		"\u00eav\2\u0591\u0590\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0593\3\2\2\2"+
		"\u0593\u0598\5\u00dep\2\u0594\u0595\7*\2\2\u0595\u0598\5\u00f4{\2\u0596"+
		"\u0598\5\u00e4s\2\u0597\u058c\3\2\2\2\u0597\u058d\3\2\2\2\u0597\u058e"+
		"\3\2\2\2\u0597\u058f\3\2\2\2\u0597\u0594\3\2\2\2\u0597\u0596\3\2\2\2\u0598"+
		"\u05ad\3\2\2\2\u0599\u059a\f\33\2\2\u059a\u059b\7T\2\2\u059b\u059c\5\u00c4"+
		"c\2\u059c\u059d\7U\2\2\u059d\u05ad\3\2\2\2\u059e\u059f\f\27\2\2\u059f"+
		"\u05ad\t\16\2\2\u05a0\u05a1\f\20\2\2\u05a1\u05a4\7\34\2\2\u05a2\u05a5"+
		"\5\u00eex\2\u05a3\u05a5\5\u00c6d\2\u05a4\u05a2\3\2\2\2\u05a4\u05a3\3\2"+
		"\2\2\u05a5\u05ad\3\2\2\2\u05a6\u05a7\f\5\2\2\u05a7\u05a9\7|\2\2\u05a8"+
		"\u05aa\5\u00f2z\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab"+
		"\3\2\2\2\u05ab\u05ad\5\u00a2R\2\u05ac\u055b\3\2\2\2\u05ac\u055e\3\2\2"+
		"\2\u05ac\u0561\3\2\2\2\u05ac\u056c\3\2\2\2\u05ac\u056f\3\2\2\2\u05ac\u0572"+
		"\3\2\2\2\u05ac\u0575\3\2\2\2\u05ac\u0578\3\2\2\2\u05ac\u057b\3\2\2\2\u05ac"+
		"\u057e\3\2\2\2\u05ac\u0581\3\2\2\2\u05ac\u0587\3\2\2\2\u05ac\u058a\3\2"+
		"\2\2\u05ac\u0599\3\2\2\2\u05ac\u059e\3\2\2\2\u05ac\u05a0\3\2\2\2\u05ac"+
		"\u05a6\3\2\2\2\u05ad\u05b0\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2"+
		"\2\2\u05af\u00c5\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05b3\5\16\b\2\u05b2"+
		"\u05b1\3\2\2\2\u05b3\u05b6\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2"+
		"\2\2\u05b5\u05b7\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b7\u05bb\5\u00eex\2\u05b8"+
		"\u05ba\5p9\2\u05b9\u05b8\3\2\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9\3\2\2"+
		"\2\u05bb\u05bc\3\2\2\2\u05bc\u05be\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be\u05bf"+
		"\5\u00a2R\2\u05bf\u00c7\3\2\2\2\u05c0\u05c1\5\u00caf\2\u05c1\u05c2\7{"+
		"\2\2\u05c2\u05c3\5\u00ccg\2\u05c3\u00c9\3\2\2\2\u05c4\u05db\5\u00a2R\2"+
		"\u05c5\u05c7\7P\2\2\u05c6\u05c8\5\\/\2\u05c7\u05c6\3\2\2\2\u05c7\u05c8"+
		"\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05db\7Q\2\2\u05ca\u05cb\7P\2\2\u05cb"+
		"\u05d0\5\u00a2R\2\u05cc\u05cd\7W\2\2\u05cd\u05cf\5\u00a2R\2\u05ce\u05cc"+
		"\3\2\2\2\u05cf\u05d2\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1"+
		"\u05d3\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d3\u05d4\7Q\2\2\u05d4\u05db\3\2"+
		"\2\2\u05d5\u05d7\7P\2\2\u05d6\u05d8\5b\62\2\u05d7\u05d6\3\2\2\2\u05d7"+
		"\u05d8\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05db\7Q\2\2\u05da\u05c4\3\2"+
		"\2\2\u05da\u05c5\3\2\2\2\u05da\u05ca\3\2\2\2\u05da\u05d5\3\2\2\2\u05db"+
		"\u00cb\3\2\2\2\u05dc\u05df\5\u00c4c\2\u05dd\u05df\5\u009cO\2\u05de\u05dc"+
		"\3\2\2\2\u05de\u05dd\3\2\2\2\u05df\u00cd\3\2\2\2\u05e0\u05e1\7P\2\2\u05e1"+
		"\u05e2\5\u00c4c\2\u05e2\u05e3\7Q\2\2\u05e3\u05f3\3\2\2\2\u05e4\u05f3\7"+
		"-\2\2\u05e5\u05f3\7*\2\2\u05e6\u05f3\5h\65\2\u05e7\u05f3\5\u00a2R\2\u05e8"+
		"\u05e9\5.\30\2\u05e9\u05ea\7X\2\2\u05ea\u05eb\7\13\2\2\u05eb\u05f3\3\2"+
		"\2\2\u05ec\u05f0\5\u00eav\2\u05ed\u05f1\5\u00f6|\2\u05ee\u05ef\7-\2\2"+
		"\u05ef\u05f1\5\u00f8}\2\u05f0\u05ed\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f1"+
		"\u05f3\3\2\2\2\u05f2\u05e0\3\2\2\2\u05f2\u05e4\3\2\2\2\u05f2\u05e5\3\2"+
		"\2\2\u05f2\u05e6\3\2\2\2\u05f2\u05e7\3\2\2\2\u05f2\u05e8\3\2\2\2\u05f2"+
		"\u05ec\3\2\2\2\u05f3\u00cf\3\2\2\2\u05f4\u05f5\7+\2\2\u05f5\u05f6\5\u00be"+
		"`\2\u05f6\u05fa\7R\2\2\u05f7\u05f9\5\u00d2j\2\u05f8\u05f7\3\2\2\2\u05f9"+
		"\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fd\3\2"+
		"\2\2\u05fc\u05fa\3\2\2\2\u05fd\u05fe\7S\2\2\u05fe\u00d1\3\2\2\2\u05ff"+
		"\u0603\7\b\2\2\u0600\u0604\5\u00c0a\2\u0601\u0604\7O\2\2\u0602\u0604\5"+
		"\u00d4k\2\u0603\u0600\3\2\2\2\u0603\u0601\3\2\2\2\u0603\u0602\3\2\2\2"+
		"\u0604\u0605\3\2\2\2\u0605\u0606\t\17\2\2\u0606\u060b\5\u00d6l\2\u0607"+
		"\u0608\7\16\2\2\u0608\u0609\t\17\2\2\u0609\u060b\5\u00d6l\2\u060a\u05ff"+
		"\3\2\2\2\u060a\u0607\3\2\2\2\u060b\u00d3\3\2\2\2\u060c\u060d\bk\1\2\u060d"+
		"\u060e\7P\2\2\u060e\u060f\5\u00d4k\2\u060f\u0610\7Q\2\2\u0610\u0627\3"+
		"\2\2\2\u0611\u0613\5\16\b\2\u0612\u0611\3\2\2\2\u0613\u0616\3\2\2\2\u0614"+
		"\u0612\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0617\3\2\2\2\u0616\u0614\3\2"+
		"\2\2\u0617\u061b\5\u00eex\2\u0618\u061a\5p9\2\u0619\u0618\3\2\2\2\u061a"+
		"\u061d\3\2\2\2\u061b\u0619\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061e\3\2"+
		"\2\2\u061d\u061b\3\2\2\2\u061e\u0623\5\u00a2R\2\u061f\u0620\7d\2\2\u0620"+
		"\u0622\5\u00c4c\2\u0621\u061f\3\2\2\2\u0622\u0625\3\2\2\2\u0623\u0621"+
		"\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0627\3\2\2\2\u0625\u0623\3\2\2\2\u0626"+
		"\u060c\3\2\2\2\u0626\u0614\3\2\2\2\u0627\u062d\3\2\2\2\u0628\u0629\f\3"+
		"\2\2\u0629\u062a\7d\2\2\u062a\u062c\5\u00c4c\2\u062b\u0628\3\2\2\2\u062c"+
		"\u062f\3\2\2\2\u062d\u062b\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u00d5\3\2"+
		"\2\2\u062f\u062d\3\2\2\2\u0630\u0638\5\u009cO\2\u0631\u0633\5\u009eP\2"+
		"\u0632\u0631\3\2\2\2\u0633\u0636\3\2\2\2\u0634\u0632\3\2\2\2\u0634\u0635"+
		"\3\2\2\2\u0635\u0638\3\2\2\2\u0636\u0634\3\2\2\2\u0637\u0630\3\2\2\2\u0637"+
		"\u0634\3\2\2\2\u0638\u00d7\3\2\2\2\u0639\u063a\5R*\2\u063a\u063b\7X\2"+
		"\2\u063b\u063d\3\2\2\2\u063c\u0639\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u0641"+
		"\3\2\2\2\u063e\u0640\5p9\2\u063f\u063e\3\2\2\2\u0640\u0643\3\2\2\2\u0641"+
		"\u063f\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0644\3\2\2\2\u0643\u0641\3\2"+
		"\2\2\u0644\u0646\5\u00a2R\2\u0645\u0647\5\u00f2z\2\u0646\u0645\3\2\2\2"+
		"\u0646\u0647\3\2\2\2\u0647\u00d9\3\2\2\2\u0648\u0649\5\u00eav\2\u0649"+
		"\u064a\5\u00dco\2\u064a\u064b\5\u00e2r\2\u064b\u0652\3\2\2\2\u064c\u064f"+
		"\5\u00dco\2\u064d\u0650\5\u00e0q\2\u064e\u0650\5\u00e2r\2\u064f\u064d"+
		"\3\2\2\2\u064f\u064e\3\2\2\2\u0650\u0652\3\2\2\2\u0651\u0648\3\2\2\2\u0651"+
		"\u064c\3\2\2\2\u0652\u00db\3\2\2\2\u0653\u0655\5\u00a2R\2\u0654\u0656"+
		"\5\u00e6t\2\u0655\u0654\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u065e\3\2\2"+
		"\2\u0657\u0658\7X\2\2\u0658\u065a\5\u00a2R\2\u0659\u065b\5\u00e6t\2\u065a"+
		"\u0659\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065d\3\2\2\2\u065c\u0657\3\2"+
		"\2\2\u065d\u0660\3\2\2\2\u065e\u065c\3\2\2\2\u065e\u065f\3\2\2\2\u065f"+
		"\u0663\3\2\2\2\u0660\u065e\3\2\2\2\u0661\u0663\5\u00f0y\2\u0662\u0653"+
		"\3\2\2\2\u0662\u0661\3\2\2\2\u0663\u00dd\3\2\2\2\u0664\u0666\5\u00a2R"+
		"\2\u0665\u0667\5\u00e8u\2\u0666\u0665\3\2\2\2\u0666\u0667\3\2\2\2\u0667"+
		"\u0668\3\2\2\2\u0668\u0669\5\u00e2r\2\u0669\u00df\3\2\2\2\u066a\u0686"+
		"\7T\2\2\u066b\u0670\7U\2\2\u066c\u066d\7T\2\2\u066d\u066f\7U\2\2\u066e"+
		"\u066c\3\2\2\2\u066f\u0672\3\2\2\2\u0670\u066e\3\2\2\2\u0670\u0671\3\2"+
		"\2\2\u0671\u0673\3\2\2\2\u0672\u0670\3\2\2\2\u0673\u0687\5P)\2\u0674\u0675"+
		"\5\u00c4c\2\u0675\u067c\7U\2\2\u0676\u0677\7T\2\2\u0677\u0678\5\u00c4"+
		"c\2\u0678\u0679\7U\2\2\u0679\u067b\3\2\2\2\u067a\u0676\3\2\2\2\u067b\u067e"+
		"\3\2\2\2\u067c\u067a\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u0683\3\2\2\2\u067e"+
		"\u067c\3\2\2\2\u067f\u0680\7T\2\2\u0680\u0682\7U\2\2\u0681\u067f\3\2\2"+
		"\2\u0682\u0685\3\2\2\2\u0683\u0681\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0687"+
		"\3\2\2\2\u0685\u0683\3\2\2\2\u0686\u066b\3\2\2\2\u0686\u0674\3\2\2\2\u0687"+
		"\u00e1\3\2\2\2\u0688\u068a\5\u00f8}\2\u0689\u068b\5\"\22\2\u068a\u0689"+
		"\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u00e3\3\2\2\2\u068c\u068d\5\u00eav"+
		"\2\u068d\u068e\5\u00f6|\2\u068e\u00e5\3\2\2\2\u068f\u0690\7[\2\2\u0690"+
		"\u0693\7Z\2\2\u0691\u0693\5\u00f2z\2\u0692\u068f\3\2\2\2\u0692\u0691\3"+
		"\2\2\2\u0693\u00e7\3\2\2\2\u0694\u0695\7[\2\2\u0695\u0698\7Z\2\2\u0696"+
		"\u0698\5\u00eav\2\u0697\u0694\3\2\2\2\u0697\u0696\3\2\2\2\u0698\u00e9"+
		"\3\2\2\2\u0699\u069a\7[\2\2\u069a\u069b\5\u00ecw\2\u069b\u069c\7Z\2\2"+
		"\u069c\u00eb\3\2\2\2\u069d\u06a2\5\u00eex\2\u069e\u069f\7W\2\2\u069f\u06a1"+
		"\5\u00eex\2\u06a0\u069e\3\2\2\2\u06a1\u06a4\3\2\2\2\u06a2\u06a0\3\2\2"+
		"\2\u06a2\u06a3\3\2\2\2\u06a3\u00ed\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a5\u06a7"+
		"\5p9\2\u06a6\u06a5\3\2\2\2\u06a7\u06aa\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a8"+
		"\u06a9\3\2\2\2\u06a9\u06ad\3\2\2\2\u06aa\u06a8\3\2\2\2\u06ab\u06ae\5R"+
		"*\2\u06ac\u06ae\5\u00f0y\2\u06ad\u06ab\3\2\2\2\u06ad\u06ac\3\2\2\2\u06ae"+
		"\u06b9\3\2\2\2\u06af\u06b1\5p9\2\u06b0\u06af\3\2\2\2\u06b1\u06b4\3\2\2"+
		"\2\u06b2\u06b0\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b5\3\2\2\2\u06b4\u06b2"+
		"\3\2\2\2\u06b5\u06b6\7T\2\2\u06b6\u06b8\7U\2\2\u06b7\u06b2\3\2\2\2\u06b8"+
		"\u06bb\3\2\2\2\u06b9\u06b7\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u00ef\3\2"+
		"\2\2\u06bb\u06b9\3\2\2\2\u06bc\u06bd\t\20\2\2\u06bd\u00f1\3\2\2\2\u06be"+
		"\u06bf\7[\2\2\u06bf\u06c4\5T+\2\u06c0\u06c1\7W\2\2\u06c1\u06c3\5T+\2\u06c2"+
		"\u06c0\3\2\2\2\u06c3\u06c6\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c4\u06c5\3\2"+
		"\2\2\u06c5\u06c7\3\2\2\2\u06c6\u06c4\3\2\2\2\u06c7\u06c8\7Z\2\2\u06c8"+
		"\u00f3\3\2\2\2\u06c9\u06d3\5\u00f8}\2\u06ca\u06cc\7X\2\2\u06cb\u06cd\5"+
		"\u00f2z\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06ce\3\2\2\2"+
		"\u06ce\u06d0\5\u00a2R\2\u06cf\u06d1\5\u00f8}\2\u06d0\u06cf\3\2\2\2\u06d0"+
		"\u06d1\3\2\2\2\u06d1\u06d3\3\2\2\2\u06d2\u06c9\3\2\2\2\u06d2\u06ca\3\2"+
		"\2\2\u06d3\u00f5\3\2\2\2\u06d4\u06d5\7*\2\2\u06d5\u06da\5\u00f4{\2\u06d6"+
		"\u06d7\5\u00a2R\2\u06d7\u06d8\5\u00f8}\2\u06d8\u06da\3\2\2\2\u06d9\u06d4"+
		"\3\2\2\2\u06d9\u06d6\3\2\2\2\u06da\u00f7\3\2\2\2\u06db\u06dd\7P\2\2\u06dc"+
		"\u06de\5\u00c0a\2\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06df"+
		"\3\2\2\2\u06df\u06e0\7Q\2\2\u06e0\u00f9\3\2\2\2\u00dd\u00fb\u0100\u0106"+
		"\u010c\u0111\u011a\u011f\u0126\u012e\u0131\u0138\u0144\u0148\u014d\u0151"+
		"\u0155\u0159\u0163\u016b\u0173\u0177\u017e\u0185\u0189\u018c\u018f\u0198"+
		"\u019e\u01a3\u01a6\u01ac\u01b2\u01b6\u01be\u01c7\u01ce\u01d4\u01d8\u01e4"+
		"\u01ed\u01f2\u01f8\u01fc\u0208\u0213\u0218\u0222\u022a\u0234\u023d\u0248"+
		"\u024d\u0256\u0260\u0265\u026e\u0274\u027b\u0280\u0288\u028c\u028e\u0294"+
		"\u0299\u029d\u02a4\u02aa\u02ac\u02b3\u02b8\u02bd\u02c0\u02c2\u02cc\u02d6"+
		"\u02db\u02de\u02e3\u02ec\u02f3\u02fe\u0304\u030f\u0319\u0324\u032d\u0332"+
		"\u0335\u033c\u0346\u034e\u0351\u0354\u0361\u0369\u036e\u0376\u037a\u037e"+
		"\u0382\u0386\u0388\u038c\u0392\u039a\u03a4\u03ad\u03b7\u03bf\u03cd\u03d4"+
		"\u03d9\u03df\u03e8\u03f2\u03fb\u0405\u040a\u0415\u041c\u0422\u0425\u042c"+
		"\u0435\u044c\u044f\u0452\u045a\u045e\u0466\u046c\u0477\u0480\u0485\u0492"+
		"\u0498\u049f\u04ac\u04b5\u04be\u04c4\u04cc\u04d2\u04d7\u04dc\u04e4\u04e9"+
		"\u04ed\u04f1\u04f5\u04f7\u04fb\u0500\u0505\u0514\u051a\u0521\u0527\u052a"+
		"\u0535\u053d\u054c\u0550\u0555\u0559\u0569\u0591\u0597\u05a4\u05a9\u05ac"+
		"\u05ae\u05b4\u05bb\u05c7\u05d0\u05d7\u05da\u05de\u05f0\u05f2\u05fa\u0603"+
		"\u060a\u0614\u061b\u0623\u0626\u062d\u0634\u0637\u063c\u0641\u0646\u064f"+
		"\u0651\u0655\u065a\u065e\u0662\u0666\u0670\u067c\u0683\u0686\u068a\u0692"+
		"\u0697\u06a2\u06a8\u06ad\u06b2\u06b9\u06c4\u06cc\u06d0\u06d2\u06d9\u06dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}