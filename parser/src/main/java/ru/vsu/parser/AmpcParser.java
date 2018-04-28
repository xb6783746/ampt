// Generated from /home/vlad/IdeaProjects/ampt1/ampt/parser/grammar/Ampc.g4 by ANTLR 4.7
package ru.vsu.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AmpcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, ASSIGN=36, PLUS=37, MINUS=38, 
		PROD=39, DIV=40, WS=41, ID=42, INTEGER=43, REAL=44, STRING=45, COMMENT=46;
	public static final int
		RULE_file = 0, RULE_script = 1, RULE_scriptEntry = 2, RULE_codeBlock = 3, 
		RULE_commSep = 4, RULE_comOptSep = 5, RULE_command = 6, RULE_assign = 7, 
		RULE_lValue = 8, RULE_rValue = 9, RULE_condOperator = 10, RULE_elseIfPart = 11, 
		RULE_elsePart = 12, RULE_whileLoop = 13, RULE_forLoop = 14, RULE_function = 15, 
		RULE_funcOut = 16, RULE_idList = 17, RULE_funcArgs = 18, RULE_number = 19, 
		RULE_nl = 20, RULE_commsep = 21, RULE_atom = 22, RULE_array = 23, RULE_arrayRow = 24, 
		RULE_arrayRowSeparator = 25, RULE_arrayColumnSeparator = 26, RULE_expressionList = 27, 
		RULE_expression = 28;
	public static final String[] ruleNames = {
		"file", "script", "scriptEntry", "codeBlock", "commSep", "comOptSep", 
		"command", "assign", "lValue", "rValue", "condOperator", "elseIfPart", 
		"elsePart", "whileLoop", "forLoop", "function", "funcOut", "idList", "funcArgs", 
		"number", "nl", "commsep", "atom", "array", "arrayRow", "arrayRowSeparator", 
		"arrayColumnSeparator", "expressionList", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'@'", "'('", "')'", "'if'", "'end'", "'elseif'", 
		"'else'", "'while'", "'for'", "'function'", "'endfunction'", "','", "'\n'", 
		"'\r'", "';'", "'.''", "'''", "'.^'", "'^'", "'~'", "'.*'", "'./'", "'>'", 
		"'<'", "'>='", "'<='", "'=='", "'!='", "'&'", "'&&'", "'|'", "'||'", "':'", 
		"'='", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ASSIGN", "PLUS", "MINUS", "PROD", "DIV", "WS", "ID", "INTEGER", "REAL", 
		"STRING", "COMMENT"
	};
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
	public String getGrammarFileName() { return "Ampc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AmpcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AmpcParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			script();
			setState(59);
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

	public static class ScriptContext extends ParserRuleContext {
		public List<ScriptEntryContext> scriptEntry() {
			return getRuleContexts(ScriptEntryContext.class);
		}
		public ScriptEntryContext scriptEntry(int i) {
			return getRuleContext(ScriptEntryContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				scriptEntry();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__21) | (1L << T__34) | (1L << PLUS) | (1L << MINUS) | (1L << ID) | (1L << INTEGER) | (1L << REAL) | (1L << STRING))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptEntryContext extends ParserRuleContext {
		public ScriptEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptEntry; }
	 
		public ScriptEntryContext() { }
		public void copyFrom(ScriptEntryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncNodeContext extends ScriptEntryContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FuncNodeContext(ScriptEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterFuncNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitFuncNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitFuncNode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodeNodeContext extends ScriptEntryContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public CodeNodeContext(ScriptEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterCodeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitCodeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitCodeNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptEntryContext scriptEntry() throws RecognitionException {
		ScriptEntryContext _localctx = new ScriptEntryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scriptEntry);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__5:
			case T__9:
			case T__10:
			case T__21:
			case T__34:
			case PLUS:
			case MINUS:
			case ID:
			case INTEGER:
			case REAL:
			case STRING:
				_localctx = new CodeNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				codeBlock();
				}
				break;
			case T__11:
				_localctx = new FuncNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				function();
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

	public static class CodeBlockContext extends ParserRuleContext {
		public ComOptSepContext comOptSep() {
			return getRuleContext(ComOptSepContext.class,0);
		}
		public List<CommSepContext> commSep() {
			return getRuleContexts(CommSepContext.class);
		}
		public CommSepContext commSep(int i) {
			return getRuleContext(CommSepContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_codeBlock);
		try {
			int _alt;
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				comOptSep();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(71);
						commSep();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(74); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(76);
					comOptSep();
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

	public static class CommSepContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommsepContext commsep() {
			return getRuleContext(CommsepContext.class,0);
		}
		public CommSepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commSep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterCommSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitCommSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitCommSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommSepContext commSep() throws RecognitionException {
		CommSepContext _localctx = new CommSepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_commSep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			command();
			setState(82);
			commsep();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComOptSepContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommsepContext commsep() {
			return getRuleContext(CommsepContext.class,0);
		}
		public ComOptSepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comOptSep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterComOptSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitComOptSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitComOptSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComOptSepContext comOptSep() throws RecognitionException {
		ComOptSepContext _localctx = new ComOptSepContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comOptSep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			command();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__16))) != 0)) {
				{
				setState(85);
				commsep();
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondOperatorCommandContext extends CommandContext {
		public CondOperatorContext condOperator() {
			return getRuleContext(CondOperatorContext.class,0);
		}
		public CondOperatorCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterCondOperatorCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitCondOperatorCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitCondOperatorCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssingCommandContext extends CommandContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssingCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterAssingCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitAssingCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitAssingCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopCommandContext extends CommandContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public WhileLoopCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterWhileLoopCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitWhileLoopCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitWhileLoopCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoopCommandContext extends CommandContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ForLoopCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterForLoopCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitForLoopCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitForLoopCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionCommandContext extends CommandContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterExpressionCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitExpressionCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitExpressionCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_command);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssingCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				assign();
				}
				break;
			case 2:
				_localctx = new CondOperatorCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				condOperator();
				}
				break;
			case 3:
				_localctx = new WhileLoopCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				whileLoop();
				}
				break;
			case 4:
				_localctx = new ForLoopCommandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				forLoop();
				}
				break;
			case 5:
				_localctx = new ExpressionCommandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				expression(0);
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

	public static class AssignContext extends ParserRuleContext {
		public LValueContext lvalue;
		public RValueContext rvalue;
		public TerminalNode ASSIGN() { return getToken(AmpcParser.ASSIGN, 0); }
		public LValueContext lValue() {
			return getRuleContext(LValueContext.class,0);
		}
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			((AssignContext)_localctx).lvalue = lValue();
			setState(96);
			match(ASSIGN);
			setState(97);
			((AssignContext)_localctx).rvalue = rValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LValueContext extends ParserRuleContext {
		public LValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lValue; }
	 
		public LValueContext() { }
		public void copyFrom(LValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnpackLValueContext extends LValueContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public UnpackLValueContext(LValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterUnpackLValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitUnpackLValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitUnpackLValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprLValueContext extends LValueContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExprLValueContext(LValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterExprLValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitExprLValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitExprLValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LValueContext lValue() throws RecognitionException {
		LValueContext _localctx = new LValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lValue);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new UnpackLValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__0);
				setState(100);
				expressionList();
				setState(101);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new ExprLValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
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

	public static class RValueContext extends ParserRuleContext {
		public RValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rValue; }
	 
		public RValueContext() { }
		public void copyFrom(RValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnonymousFuncRValueContext extends RValueContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnonymousFuncRValueContext(RValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterAnonymousFuncRValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitAnonymousFuncRValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitAnonymousFuncRValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionHandleRValueContext extends RValueContext {
		public TerminalNode ID() { return getToken(AmpcParser.ID, 0); }
		public FunctionHandleRValueContext(RValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterFunctionHandleRValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitFunctionHandleRValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitFunctionHandleRValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprRValueContext extends RValueContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprRValueContext(RValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterExprRValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitExprRValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitExprRValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RValueContext rValue() throws RecognitionException {
		RValueContext _localctx = new RValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rValue);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ExprRValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				expression(0);
				}
				break;
			case 2:
				_localctx = new FunctionHandleRValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__2);
				setState(108);
				match(ID);
				}
				break;
			case 3:
				_localctx = new AnonymousFuncRValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(T__2);
				setState(110);
				match(T__3);
				setState(111);
				idList();
				setState(112);
				match(T__4);
				setState(113);
				expression(0);
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

	public static class CondOperatorContext extends ParserRuleContext {
		public ExpressionContext cond;
		public CodeBlockContext block;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public CommsepContext commsep() {
			return getRuleContext(CommsepContext.class,0);
		}
		public List<ElseIfPartContext> elseIfPart() {
			return getRuleContexts(ElseIfPartContext.class);
		}
		public ElseIfPartContext elseIfPart(int i) {
			return getRuleContext(ElseIfPartContext.class,i);
		}
		public ElsePartContext elsePart() {
			return getRuleContext(ElsePartContext.class,0);
		}
		public CondOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterCondOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitCondOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitCondOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondOperatorContext condOperator() throws RecognitionException {
		CondOperatorContext _localctx = new CondOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__5);
			setState(118);
			((CondOperatorContext)_localctx).cond = expression(0);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__16))) != 0)) {
				{
				setState(119);
				commsep();
				}
			}

			setState(122);
			((CondOperatorContext)_localctx).block = codeBlock();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(123);
				elseIfPart();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(129);
				elsePart();
				}
			}

			setState(132);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfPartContext extends ParserRuleContext {
		public ExpressionContext cond;
		public CodeBlockContext block;
		public CommsepContext commsep() {
			return getRuleContext(CommsepContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ElseIfPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterElseIfPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitElseIfPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitElseIfPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfPartContext elseIfPart() throws RecognitionException {
		ElseIfPartContext _localctx = new ElseIfPartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseIfPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__7);
			setState(135);
			((ElseIfPartContext)_localctx).cond = expression(0);
			setState(136);
			commsep();
			setState(137);
			((ElseIfPartContext)_localctx).block = codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsePartContext extends ParserRuleContext {
		public CodeBlockContext block;
		public CommsepContext commsep() {
			return getRuleContext(CommsepContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterElsePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitElsePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitElsePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsePartContext elsePart() throws RecognitionException {
		ElsePartContext _localctx = new ElsePartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elsePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__8);
			setState(140);
			commsep();
			setState(141);
			((ElsePartContext)_localctx).block = codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public ExpressionContext cond;
		public CodeBlockContext block;
		public CommsepContext commsep() {
			return getRuleContext(CommsepContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__9);
			setState(144);
			((WhileLoopContext)_localctx).cond = expression(0);
			setState(145);
			commsep();
			setState(146);
			((WhileLoopContext)_localctx).block = codeBlock();
			setState(147);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public ExpressionContext expr;
		public CodeBlockContext block;
		public TerminalNode ID() { return getToken(AmpcParser.ID, 0); }
		public CommsepContext commsep() {
			return getRuleContext(CommsepContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__10);
			setState(150);
			match(ID);
			setState(151);
			match(ASSIGN);
			setState(152);
			((ForLoopContext)_localctx).expr = expression(0);
			setState(153);
			commsep();
			setState(154);
			((ForLoopContext)_localctx).block = codeBlock();
			setState(155);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FuncOutContext out;
		public Token name;
		public FuncArgsContext args;
		public CodeBlockContext block;
		public List<CommsepContext> commsep() {
			return getRuleContexts(CommsepContext.class);
		}
		public CommsepContext commsep(int i) {
			return getRuleContext(CommsepContext.class,i);
		}
		public FuncOutContext funcOut() {
			return getRuleContext(FuncOutContext.class,0);
		}
		public TerminalNode ID() { return getToken(AmpcParser.ID, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public FuncArgsContext funcArgs() {
			return getRuleContext(FuncArgsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__11);
			setState(158);
			((FunctionContext)_localctx).out = funcOut();
			setState(159);
			match(ASSIGN);
			setState(160);
			((FunctionContext)_localctx).name = match(ID);
			setState(161);
			match(T__3);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(162);
				((FunctionContext)_localctx).args = funcArgs();
				}
			}

			setState(165);
			match(T__4);
			setState(166);
			commsep();
			setState(167);
			((FunctionContext)_localctx).block = codeBlock();
			setState(168);
			match(T__12);
			setState(169);
			commsep();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncOutContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AmpcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AmpcParser.ID, i);
		}
		public FuncOutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcOut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterFuncOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitFuncOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitFuncOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncOutContext funcOut() throws RecognitionException {
		FuncOutContext _localctx = new FuncOutContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcOut);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(171);
					match(ID);
					}
				}

				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__0);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(175);
					match(ID);
					}
				}

				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(178);
					match(T__13);
					setState(179);
					match(ID);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(T__1);
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AmpcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AmpcParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ID);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(189);
				match(T__13);
				setState(190);
				match(ID);
				}
				}
				setState(195);
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

	public static class FuncArgsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AmpcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AmpcParser.ID, i);
		}
		public FuncArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterFuncArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitFuncArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitFuncArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgsContext funcArgs() throws RecognitionException {
		FuncArgsContext _localctx = new FuncArgsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(197);
				match(T__13);
				setState(198);
				match(ID);
				}
				}
				setState(203);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(AmpcParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(AmpcParser.REAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==REAL) ) {
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

	public static class NlContext extends ParserRuleContext {
		public NlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterNl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitNl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitNl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NlContext nl() throws RecognitionException {
		NlContext _localctx = new NlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__14);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(207);
				match(T__15);
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

	public static class CommsepContext extends ParserRuleContext {
		public CommsepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterCommsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitCommsep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitCommsep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommsepContext commsep() throws RecognitionException {
		CommsepContext _localctx = new CommsepContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_commsep);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(T__16);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(211);
					match(T__14);
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(T__13);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(218);
					match(T__14);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					match(T__14);
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__14 );
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringExprContext extends AtomContext {
		public Token str;
		public TerminalNode STRING() { return getToken(AmpcParser.STRING, 0); }
		public StringExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentExprContext extends AtomContext {
		public Token id;
		public TerminalNode ID() { return getToken(AmpcParser.ID, 0); }
		public IdentExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterIdentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitIdentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitIdentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends AtomContext {
		public ArrayContext arr;
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExprContext extends AtomContext {
		public NumberContext value;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atom);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				((ArrayExprContext)_localctx).arr = array();
				}
				break;
			case INTEGER:
			case REAL:
				_localctx = new NumberExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				((NumberExprContext)_localctx).value = number();
				}
				break;
			case STRING:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				((StringExprContext)_localctx).str = match(STRING);
				}
				break;
			case ID:
				_localctx = new IdentExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				((IdentExprContext)_localctx).id = match(ID);
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ArrayRowContext> arrayRow() {
			return getRuleContexts(ArrayRowContext.class);
		}
		public ArrayRowContext arrayRow(int i) {
			return getRuleContext(ArrayRowContext.class,i);
		}
		public List<ArrayColumnSeparatorContext> arrayColumnSeparator() {
			return getRuleContexts(ArrayColumnSeparatorContext.class);
		}
		public ArrayColumnSeparatorContext arrayColumnSeparator(int i) {
			return getRuleContext(ArrayColumnSeparatorContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__0);
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(238);
				arrayRow();
				}
				break;
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__16) {
				{
				{
				setState(241);
				arrayColumnSeparator();
				setState(242);
				arrayRow();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayRowContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ArrayRowSeparatorContext> arrayRowSeparator() {
			return getRuleContexts(ArrayRowSeparatorContext.class);
		}
		public ArrayRowSeparatorContext arrayRowSeparator(int i) {
			return getRuleContext(ArrayRowSeparatorContext.class,i);
		}
		public ArrayRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterArrayRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitArrayRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitArrayRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayRowContext arrayRow() throws RecognitionException {
		ArrayRowContext _localctx = new ArrayRowContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(251);
				expression(0);
				}
				break;
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__13) | (1L << T__21) | (1L << T__34) | (1L << PLUS) | (1L << MINUS) | (1L << ID) | (1L << INTEGER) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				{
				setState(254);
				arrayRowSeparator();
				setState(255);
				expression(0);
				}
				}
				setState(261);
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

	public static class ArrayRowSeparatorContext extends ParserRuleContext {
		public ArrayRowSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayRowSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterArrayRowSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitArrayRowSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitArrayRowSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayRowSeparatorContext arrayRowSeparator() throws RecognitionException {
		ArrayRowSeparatorContext _localctx = new ArrayRowSeparatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayRowSeparator);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(T__13);
				}
				break;
			case T__0:
			case T__3:
			case T__21:
			case T__34:
			case PLUS:
			case MINUS:
			case ID:
			case INTEGER:
			case REAL:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArrayColumnSeparatorContext extends ParserRuleContext {
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public ArrayColumnSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayColumnSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterArrayColumnSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitArrayColumnSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitArrayColumnSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayColumnSeparatorContext arrayColumnSeparator() throws RecognitionException {
		ArrayColumnSeparatorContext _localctx = new ArrayColumnSeparatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrayColumnSeparator);
		try {
			int _alt;
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(T__16);
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(267);
						nl();
						}
						} 
					}
					setState(272);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(273);
						nl();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(276); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			expression(0);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(281);
				match(T__13);
				setState(282);
				expression(0);
				}
				}
				setState(287);
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
	public static class IndexExprContext extends ExpressionContext {
		public ExpressionContext expr;
		public ExpressionListContext index;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IndexExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterIndexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitIndexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitIndexExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfixExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InfixExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitInfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitInfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExpressionContext {
		public ExpressionContext expr;
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParensExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitParensExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitParensExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RangeExprContext extends ExpressionContext {
		public ExpressionContext start;
		public ExpressionContext step;
		public ExpressionContext end;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RangeExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterRangeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitRangeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitRangeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(289);
				match(T__3);
				setState(290);
				expression(0);
				setState(291);
				match(T__4);
				}
				break;
			case T__21:
			case PLUS:
			case MINUS:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(294);
				((UnaryExprContext)_localctx).expr = expression(9);
				}
				break;
			case T__0:
			case ID:
			case INTEGER:
			case REAL:
			case STRING:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				atom();
				}
				break;
			case T__34:
				{
				_localctx = new RangeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296);
				match(T__34);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(333);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(300);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(301);
						((InfixExprContext)_localctx).right = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(302);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(303);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << PROD) | (1L << DIV))) != 0)) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(304);
						((InfixExprContext)_localctx).right = expression(9);
						}
						break;
					case 3:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(306);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(307);
						((InfixExprContext)_localctx).right = expression(8);
						}
						break;
					case 4:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(308);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(309);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(310);
						((InfixExprContext)_localctx).right = expression(7);
						}
						break;
					case 5:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(312);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(313);
						((InfixExprContext)_localctx).right = expression(6);
						}
						break;
					case 6:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(314);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(315);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(316);
						((InfixExprContext)_localctx).right = expression(5);
						}
						break;
					case 7:
						{
						_localctx = new RangeExprContext(new ExpressionContext(_parentctx, _parentState));
						((RangeExprContext)_localctx).start = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(318);
						match(T__34);
						setState(322);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							setState(319);
							((RangeExprContext)_localctx).step = expression(0);
							setState(320);
							match(T__34);
							}
							break;
						}
						setState(324);
						((RangeExprContext)_localctx).end = expression(3);
						}
						break;
					case 8:
						{
						_localctx = new IndexExprContext(new ExpressionContext(_parentctx, _parentState));
						((IndexExprContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(326);
						match(T__3);
						setState(328);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__21) | (1L << T__34) | (1L << PLUS) | (1L << MINUS) | (1L << ID) | (1L << INTEGER) | (1L << REAL) | (1L << STRING))) != 0)) {
							{
							setState(327);
							((IndexExprContext)_localctx).index = expressionList();
							}
						}

						setState(330);
						match(T__4);
						}
						break;
					case 9:
						{
						_localctx = new UnaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((UnaryExprContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(331);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(332);
						((UnaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0155\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\6\3"+
		"A\n\3\r\3\16\3B\3\4\3\4\5\4G\n\4\3\5\3\5\6\5K\n\5\r\5\16\5L\3\5\5\5P\n"+
		"\5\5\5R\n\5\3\6\3\6\3\6\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\5\b`\n\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nk\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13v\n\13\3\f\3\f\3\f\5\f{\n\f\3\f\3\f\7\f\177\n"+
		"\f\f\f\16\f\u0082\13\f\3\f\5\f\u0085\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a6\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\5\22\u00af\n\22\3\22\3\22\5\22\u00b3\n"+
		"\22\3\22\3\22\7\22\u00b7\n\22\f\22\16\22\u00ba\13\22\3\22\5\22\u00bd\n"+
		"\22\3\23\3\23\3\23\7\23\u00c2\n\23\f\23\16\23\u00c5\13\23\3\24\3\24\3"+
		"\24\7\24\u00ca\n\24\f\24\16\24\u00cd\13\24\3\25\3\25\3\26\3\26\5\26\u00d3"+
		"\n\26\3\27\3\27\7\27\u00d7\n\27\f\27\16\27\u00da\13\27\3\27\3\27\7\27"+
		"\u00de\n\27\f\27\16\27\u00e1\13\27\3\27\6\27\u00e4\n\27\r\27\16\27\u00e5"+
		"\5\27\u00e8\n\27\3\30\3\30\3\30\3\30\5\30\u00ee\n\30\3\31\3\31\5\31\u00f2"+
		"\n\31\3\31\3\31\3\31\7\31\u00f7\n\31\f\31\16\31\u00fa\13\31\3\31\3\31"+
		"\3\32\5\32\u00ff\n\32\3\32\3\32\3\32\7\32\u0104\n\32\f\32\16\32\u0107"+
		"\13\32\3\33\3\33\5\33\u010b\n\33\3\34\3\34\7\34\u010f\n\34\f\34\16\34"+
		"\u0112\13\34\3\34\6\34\u0115\n\34\r\34\16\34\u0116\5\34\u0119\n\34\3\35"+
		"\3\35\3\35\7\35\u011e\n\35\f\35\16\35\u0121\13\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u012c\n\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0145\n\36\3\36\3\36\3\36\3\36\5\36\u014b\n\36\3"+
		"\36\3\36\3\36\7\36\u0150\n\36\f\36\16\36\u0153\13\36\3\36\2\3:\37\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\13\3\2-."+
		"\4\2\30\30\'(\3\2\26\27\4\2\31\32)*\3\2\'(\3\2\33\36\3\2\37 \3\2!$\3\2"+
		"\24\25\2\u016e\2<\3\2\2\2\4@\3\2\2\2\6F\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2"+
		"\fV\3\2\2\2\16_\3\2\2\2\20a\3\2\2\2\22j\3\2\2\2\24u\3\2\2\2\26w\3\2\2"+
		"\2\30\u0088\3\2\2\2\32\u008d\3\2\2\2\34\u0091\3\2\2\2\36\u0097\3\2\2\2"+
		" \u009f\3\2\2\2\"\u00bc\3\2\2\2$\u00be\3\2\2\2&\u00c6\3\2\2\2(\u00ce\3"+
		"\2\2\2*\u00d0\3\2\2\2,\u00e7\3\2\2\2.\u00ed\3\2\2\2\60\u00ef\3\2\2\2\62"+
		"\u00fe\3\2\2\2\64\u010a\3\2\2\2\66\u0118\3\2\2\28\u011a\3\2\2\2:\u012b"+
		"\3\2\2\2<=\5\4\3\2=>\7\2\2\3>\3\3\2\2\2?A\5\6\4\2@?\3\2\2\2AB\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2C\5\3\2\2\2DG\5\b\5\2EG\5 \21\2FD\3\2\2\2FE\3\2\2"+
		"\2G\7\3\2\2\2HR\5\f\7\2IK\5\n\6\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2"+
		"\2\2MO\3\2\2\2NP\5\f\7\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QH\3\2\2\2QJ\3\2"+
		"\2\2R\t\3\2\2\2ST\5\16\b\2TU\5,\27\2U\13\3\2\2\2VX\5\16\b\2WY\5,\27\2"+
		"XW\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2Z`\5\20\t\2[`\5\26\f\2\\`\5\34\17\2]`\5"+
		"\36\20\2^`\5:\36\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2"+
		"`\17\3\2\2\2ab\5\22\n\2bc\7&\2\2cd\5\24\13\2d\21\3\2\2\2ef\7\3\2\2fg\5"+
		"8\35\2gh\7\4\2\2hk\3\2\2\2ik\58\35\2je\3\2\2\2ji\3\2\2\2k\23\3\2\2\2l"+
		"v\5:\36\2mn\7\5\2\2nv\7,\2\2op\7\5\2\2pq\7\6\2\2qr\5$\23\2rs\7\7\2\2s"+
		"t\5:\36\2tv\3\2\2\2ul\3\2\2\2um\3\2\2\2uo\3\2\2\2v\25\3\2\2\2wx\7\b\2"+
		"\2xz\5:\36\2y{\5,\27\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|\u0080\5\b\5\2}\177"+
		"\5\30\r\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\5\32\16\2\u0084"+
		"\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\t"+
		"\2\2\u0087\27\3\2\2\2\u0088\u0089\7\n\2\2\u0089\u008a\5:\36\2\u008a\u008b"+
		"\5,\27\2\u008b\u008c\5\b\5\2\u008c\31\3\2\2\2\u008d\u008e\7\13\2\2\u008e"+
		"\u008f\5,\27\2\u008f\u0090\5\b\5\2\u0090\33\3\2\2\2\u0091\u0092\7\f\2"+
		"\2\u0092\u0093\5:\36\2\u0093\u0094\5,\27\2\u0094\u0095\5\b\5\2\u0095\u0096"+
		"\7\t\2\2\u0096\35\3\2\2\2\u0097\u0098\7\r\2\2\u0098\u0099\7,\2\2\u0099"+
		"\u009a\7&\2\2\u009a\u009b\5:\36\2\u009b\u009c\5,\27\2\u009c\u009d\5\b"+
		"\5\2\u009d\u009e\7\t\2\2\u009e\37\3\2\2\2\u009f\u00a0\7\16\2\2\u00a0\u00a1"+
		"\5\"\22\2\u00a1\u00a2\7&\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a5\7\6\2\2\u00a4"+
		"\u00a6\5&\24\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\7\7\2\2\u00a8\u00a9\5,\27\2\u00a9\u00aa\5\b\5\2\u00aa"+
		"\u00ab\7\17\2\2\u00ab\u00ac\5,\27\2\u00ac!\3\2\2\2\u00ad\u00af\7,\2\2"+
		"\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00bd\3\2\2\2\u00b0\u00b2"+
		"\7\3\2\2\u00b1\u00b3\7,\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b8\3\2\2\2\u00b4\u00b5\7\20\2\2\u00b5\u00b7\7,\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\7\4\2\2\u00bc\u00ae\3\2"+
		"\2\2\u00bc\u00b0\3\2\2\2\u00bd#\3\2\2\2\u00be\u00c3\7,\2\2\u00bf\u00c0"+
		"\7\20\2\2\u00c0\u00c2\7,\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4%\3\2\2\2\u00c5\u00c3\3\2\2\2"+
		"\u00c6\u00cb\7,\2\2\u00c7\u00c8\7\20\2\2\u00c8\u00ca\7,\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\'\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\t\2\2\2\u00cf)\3\2\2\2\u00d0"+
		"\u00d2\7\21\2\2\u00d1\u00d3\7\22\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3"+
		"\2\2\2\u00d3+\3\2\2\2\u00d4\u00d8\7\23\2\2\u00d5\u00d7\7\21\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00e8\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00df\7\20\2\2\u00dc"+
		"\u00de\7\21\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e8\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e4\7\21\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00d4\3\2\2\2\u00e7"+
		"\u00db\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8-\3\2\2\2\u00e9\u00ee\5\60\31"+
		"\2\u00ea\u00ee\5(\25\2\u00eb\u00ee\7/\2\2\u00ec\u00ee\7,\2\2\u00ed\u00e9"+
		"\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"/\3\2\2\2\u00ef\u00f1\7\3\2\2\u00f0\u00f2\5\62\32\2\u00f1\u00f0\3\2\2"+
		"\2\u00f1\u00f2\3\2\2\2\u00f2\u00f8\3\2\2\2\u00f3\u00f4\5\66\34\2\u00f4"+
		"\u00f5\5\62\32\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\7\4\2\2\u00fc\61\3\2\2\2\u00fd\u00ff\5:\36"+
		"\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0105\3\2\2\2\u0100\u0101"+
		"\5\64\33\2\u0101\u0102\5:\36\2\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2\2"+
		"\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\63"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010b\7\20\2\2\u0109\u010b\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\65\3\2\2\2\u010c\u0110"+
		"\7\23\2\2\u010d\u010f\5*\26\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0119\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0113\u0115\5*\26\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u010c\3\2"+
		"\2\2\u0118\u0114\3\2\2\2\u0119\67\3\2\2\2\u011a\u011f\5:\36\2\u011b\u011c"+
		"\7\20\2\2\u011c\u011e\5:\36\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u01209\3\2\2\2\u0121\u011f\3"+
		"\2\2\2\u0122\u0123\b\36\1\2\u0123\u0124\7\6\2\2\u0124\u0125\5:\36\2\u0125"+
		"\u0126\7\7\2\2\u0126\u012c\3\2\2\2\u0127\u0128\t\3\2\2\u0128\u012c\5:"+
		"\36\13\u0129\u012c\5.\30\2\u012a\u012c\7%\2\2\u012b\u0122\3\2\2\2\u012b"+
		"\u0127\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c\u0151\3\2"+
		"\2\2\u012d\u012e\f\f\2\2\u012e\u012f\t\4\2\2\u012f\u0150\5:\36\r\u0130"+
		"\u0131\f\n\2\2\u0131\u0132\t\5\2\2\u0132\u0150\5:\36\13\u0133\u0134\f"+
		"\t\2\2\u0134\u0135\t\6\2\2\u0135\u0150\5:\36\n\u0136\u0137\f\b\2\2\u0137"+
		"\u0138\t\7\2\2\u0138\u0150\5:\36\t\u0139\u013a\f\7\2\2\u013a\u013b\t\b"+
		"\2\2\u013b\u0150\5:\36\b\u013c\u013d\f\6\2\2\u013d\u013e\t\t\2\2\u013e"+
		"\u0150\5:\36\7\u013f\u0140\f\4\2\2\u0140\u0144\7%\2\2\u0141\u0142\5:\36"+
		"\2\u0142\u0143\7%\2\2\u0143\u0145\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0150\5:\36\5\u0147\u0148\f\16\2\2"+
		"\u0148\u014a\7\6\2\2\u0149\u014b\58\35\2\u014a\u0149\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0150\7\7\2\2\u014d\u014e\f\r\2\2\u014e"+
		"\u0150\t\n\2\2\u014f\u012d\3\2\2\2\u014f\u0130\3\2\2\2\u014f\u0133\3\2"+
		"\2\2\u014f\u0136\3\2\2\2\u014f\u0139\3\2\2\2\u014f\u013c\3\2\2\2\u014f"+
		"\u013f\3\2\2\2\u014f\u0147\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152;\3\2\2\2\u0153\u0151"+
		"\3\2\2\2)BFLOQX_juz\u0080\u0084\u00a5\u00ae\u00b2\u00b8\u00bc\u00c3\u00cb"+
		"\u00d2\u00d8\u00df\u00e5\u00e7\u00ed\u00f1\u00f8\u00fe\u0105\u010a\u0110"+
		"\u0116\u0118\u011f\u012b\u0144\u014a\u014f\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}