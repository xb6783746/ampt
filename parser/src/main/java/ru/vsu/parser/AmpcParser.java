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
		T__31=32, T__32=33, T__33=34, ASSIGN=35, PLUS=36, MINUS=37, PROD=38, DIV=39, 
		WS=40, ID=41, INTEGER=42, REAL=43, STRING=44, COMMENT=45;
	public static final int
		RULE_file = 0, RULE_script = 1, RULE_scriptEntry = 2, RULE_codeBlock = 3, 
		RULE_commSep = 4, RULE_comOptSep = 5, RULE_command = 6, RULE_assign = 7, 
		RULE_condOperator = 8, RULE_elseIfPart = 9, RULE_elsePart = 10, RULE_whileLoop = 11, 
		RULE_forLoop = 12, RULE_function = 13, RULE_funcOut = 14, RULE_funcArgs = 15, 
		RULE_number = 16, RULE_nl = 17, RULE_commsep = 18, RULE_atom = 19, RULE_array = 20, 
		RULE_arrayRow = 21, RULE_arrayRowSeparator = 22, RULE_arrayColumnSeparator = 23, 
		RULE_expressionList = 24, RULE_expression = 25;
	public static final String[] ruleNames = {
		"file", "script", "scriptEntry", "codeBlock", "commSep", "comOptSep", 
		"command", "assign", "condOperator", "elseIfPart", "elsePart", "whileLoop", 
		"forLoop", "function", "funcOut", "funcArgs", "number", "nl", "commsep", 
		"atom", "array", "arrayRow", "arrayRowSeparator", "arrayColumnSeparator", 
		"expressionList", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'end'", "'elseif'", "'else'", "'while'", "'for'", "'function'", 
		"'('", "')'", "'endfunction'", "'['", "','", "']'", "'\n'", "'\r'", "';'", 
		"'.''", "'''", "'.^'", "'^'", "'~'", "'.*'", "'./'", "'>'", "'<'", "'>='", 
		"'<='", "'=='", "'!='", "'&'", "'&&'", "'|'", "'||'", "':'", "'='", "'+'", 
		"'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "ASSIGN", 
		"PLUS", "MINUS", "PROD", "DIV", "WS", "ID", "INTEGER", "REAL", "STRING", 
		"COMMENT"
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
			setState(52);
			script();
			setState(53);
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
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				scriptEntry();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__20) | (1L << T__33) | (1L << PLUS) | (1L << MINUS) | (1L << ID) | (1L << INTEGER) | (1L << REAL) | (1L << STRING))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__4:
			case T__5:
			case T__7:
			case T__10:
			case T__20:
			case T__33:
			case PLUS:
			case MINUS:
			case ID:
			case INTEGER:
			case REAL:
			case STRING:
				_localctx = new CodeNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				codeBlock();
				}
				break;
			case T__6:
				_localctx = new FuncNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				comOptSep();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(65);
						commSep();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(68); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(70);
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
			setState(75);
			command();
			setState(76);
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
			setState(78);
			command();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__15))) != 0)) {
				{
				setState(79);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssingCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				assign();
				}
				break;
			case 2:
				_localctx = new CondOperatorCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				condOperator();
				}
				break;
			case 3:
				_localctx = new WhileLoopCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				whileLoop();
				}
				break;
			case 4:
				_localctx = new ForLoopCommandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				forLoop();
				}
				break;
			case 5:
				_localctx = new ExpressionCommandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
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
		public ExpressionContext lvalue;
		public ExpressionContext rvalue;
		public TerminalNode ASSIGN() { return getToken(AmpcParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(89);
			((AssignContext)_localctx).lvalue = expression(0);
			setState(90);
			match(ASSIGN);
			setState(91);
			((AssignContext)_localctx).rvalue = expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 16, RULE_condOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__0);
			setState(94);
			((CondOperatorContext)_localctx).cond = expression(0);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__15))) != 0)) {
				{
				setState(95);
				commsep();
				}
			}

			setState(98);
			((CondOperatorContext)_localctx).block = codeBlock();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(99);
				elseIfPart();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(105);
				elsePart();
				}
			}

			setState(108);
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
		enterRule(_localctx, 18, RULE_elseIfPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__2);
			setState(111);
			((ElseIfPartContext)_localctx).cond = expression(0);
			setState(112);
			commsep();
			setState(113);
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
		enterRule(_localctx, 20, RULE_elsePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__3);
			setState(116);
			commsep();
			setState(117);
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
		enterRule(_localctx, 22, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__4);
			setState(120);
			((WhileLoopContext)_localctx).cond = expression(0);
			setState(121);
			commsep();
			setState(122);
			((WhileLoopContext)_localctx).block = codeBlock();
			setState(123);
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
		enterRule(_localctx, 24, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__5);
			setState(126);
			match(ID);
			setState(127);
			match(ASSIGN);
			setState(128);
			((ForLoopContext)_localctx).expr = expression(0);
			setState(129);
			commsep();
			setState(130);
			((ForLoopContext)_localctx).block = codeBlock();
			setState(131);
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
		enterRule(_localctx, 26, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__6);
			setState(134);
			((FunctionContext)_localctx).out = funcOut();
			setState(135);
			match(ASSIGN);
			setState(136);
			((FunctionContext)_localctx).name = match(ID);
			setState(137);
			match(T__7);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(138);
				((FunctionContext)_localctx).args = funcArgs();
				}
			}

			setState(141);
			match(T__8);
			setState(142);
			commsep();
			setState(143);
			((FunctionContext)_localctx).block = codeBlock();
			setState(144);
			match(T__9);
			setState(145);
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
		enterRule(_localctx, 28, RULE_funcOut);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(147);
					match(ID);
					}
				}

				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__10);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(151);
					match(ID);
					}
				}

				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(154);
					match(T__11);
					setState(155);
					match(ID);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(T__12);
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
		enterRule(_localctx, 30, RULE_funcArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ID);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(165);
				match(T__11);
				setState(166);
				match(ID);
				}
				}
				setState(171);
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
		enterRule(_localctx, 32, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
		enterRule(_localctx, 34, RULE_nl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__13);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(175);
				match(T__14);
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
		enterRule(_localctx, 36, RULE_commsep);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(T__15);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(179);
					match(T__13);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(T__11);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(186);
					match(T__13);
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(192);
					match(T__13);
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__13 );
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
		enterRule(_localctx, 38, RULE_atom);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				((ArrayExprContext)_localctx).arr = array();
				}
				break;
			case INTEGER:
			case REAL:
				_localctx = new NumberExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				((NumberExprContext)_localctx).value = number();
				}
				break;
			case STRING:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				((StringExprContext)_localctx).str = match(STRING);
				}
				break;
			case ID:
				_localctx = new IdentExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
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
		enterRule(_localctx, 40, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__10);
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(206);
				arrayRow();
				}
				break;
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__15) {
				{
				{
				setState(209);
				arrayColumnSeparator();
				setState(210);
				arrayRow();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 42, RULE_arrayRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(219);
				expression(0);
				}
				break;
			}
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__20) | (1L << T__33) | (1L << PLUS) | (1L << MINUS) | (1L << ID) | (1L << INTEGER) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				{
				setState(222);
				arrayRowSeparator();
				setState(223);
				expression(0);
				}
				}
				setState(229);
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
		enterRule(_localctx, 44, RULE_arrayRowSeparator);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(T__11);
				}
				break;
			case T__7:
			case T__10:
			case T__20:
			case T__33:
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
		enterRule(_localctx, 46, RULE_arrayColumnSeparator);
		try {
			int _alt;
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(T__15);
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(235);
						nl();
						}
						} 
					}
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(241);
						nl();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(244); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 48, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			expression(0);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(249);
				match(T__11);
				setState(250);
				expression(0);
				}
				}
				setState(255);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(257);
				match(T__7);
				setState(258);
				expression(0);
				setState(259);
				match(T__8);
				}
				break;
			case T__20:
			case PLUS:
			case MINUS:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				((UnaryExprContext)_localctx).expr = expression(9);
				}
				break;
			case T__10:
			case ID:
			case INTEGER:
			case REAL:
			case STRING:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				atom();
				}
				break;
			case T__33:
				{
				_localctx = new RangeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(T__33);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(301);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(268);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(269);
						((InfixExprContext)_localctx).right = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(271);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << PROD) | (1L << DIV))) != 0)) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(272);
						((InfixExprContext)_localctx).right = expression(9);
						}
						break;
					case 3:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(274);
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
						setState(275);
						((InfixExprContext)_localctx).right = expression(8);
						}
						break;
					case 4:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(277);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(278);
						((InfixExprContext)_localctx).right = expression(7);
						}
						break;
					case 5:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(280);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(281);
						((InfixExprContext)_localctx).right = expression(6);
						}
						break;
					case 6:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(282);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(283);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(284);
						((InfixExprContext)_localctx).right = expression(5);
						}
						break;
					case 7:
						{
						_localctx = new RangeExprContext(new ExpressionContext(_parentctx, _parentState));
						((RangeExprContext)_localctx).start = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(286);
						match(T__33);
						setState(290);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(287);
							((RangeExprContext)_localctx).step = expression(0);
							setState(288);
							match(T__33);
							}
							break;
						}
						setState(292);
						((RangeExprContext)_localctx).end = expression(3);
						}
						break;
					case 8:
						{
						_localctx = new IndexExprContext(new ExpressionContext(_parentctx, _parentState));
						((IndexExprContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(294);
						match(T__7);
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__20) | (1L << T__33) | (1L << PLUS) | (1L << MINUS) | (1L << ID) | (1L << INTEGER) | (1L << REAL) | (1L << STRING))) != 0)) {
							{
							setState(295);
							((IndexExprContext)_localctx).index = expressionList();
							}
						}

						setState(298);
						match(T__8);
						}
						break;
					case 9:
						{
						_localctx = new UnaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((UnaryExprContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(300);
						((UnaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
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
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		case 25:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0135\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\6\3;\n\3\r\3\16\3<\3\4\3\4\5\4A\n"+
		"\4\3\5\3\5\6\5E\n\5\r\5\16\5F\3\5\5\5J\n\5\5\5L\n\5\3\6\3\6\3\6\3\7\3"+
		"\7\5\7S\n\7\3\b\3\b\3\b\3\b\3\b\5\bZ\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5"+
		"\nc\n\n\3\n\3\n\7\ng\n\n\f\n\16\nj\13\n\3\n\5\nm\n\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008e\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\5\20\u0097\n\20\3\20\3\20\5\20\u009b"+
		"\n\20\3\20\3\20\7\20\u009f\n\20\f\20\16\20\u00a2\13\20\3\20\5\20\u00a5"+
		"\n\20\3\21\3\21\3\21\7\21\u00aa\n\21\f\21\16\21\u00ad\13\21\3\22\3\22"+
		"\3\23\3\23\5\23\u00b3\n\23\3\24\3\24\7\24\u00b7\n\24\f\24\16\24\u00ba"+
		"\13\24\3\24\3\24\7\24\u00be\n\24\f\24\16\24\u00c1\13\24\3\24\6\24\u00c4"+
		"\n\24\r\24\16\24\u00c5\5\24\u00c8\n\24\3\25\3\25\3\25\3\25\5\25\u00ce"+
		"\n\25\3\26\3\26\5\26\u00d2\n\26\3\26\3\26\3\26\7\26\u00d7\n\26\f\26\16"+
		"\26\u00da\13\26\3\26\3\26\3\27\5\27\u00df\n\27\3\27\3\27\3\27\7\27\u00e4"+
		"\n\27\f\27\16\27\u00e7\13\27\3\30\3\30\5\30\u00eb\n\30\3\31\3\31\7\31"+
		"\u00ef\n\31\f\31\16\31\u00f2\13\31\3\31\6\31\u00f5\n\31\r\31\16\31\u00f6"+
		"\5\31\u00f9\n\31\3\32\3\32\3\32\7\32\u00fe\n\32\f\32\16\32\u0101\13\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u010c\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0125\n\33\3\33\3\33\3\33\3\33"+
		"\5\33\u012b\n\33\3\33\3\33\3\33\7\33\u0130\n\33\f\33\16\33\u0133\13\33"+
		"\3\33\2\3\64\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\2\13\3\2,-\4\2\27\27&\'\3\2\25\26\4\2\30\31()\3\2&\'\3\2\32\35\3\2"+
		"\36\37\3\2 #\3\2\23\24\2\u014d\2\66\3\2\2\2\4:\3\2\2\2\6@\3\2\2\2\bK\3"+
		"\2\2\2\nM\3\2\2\2\fP\3\2\2\2\16Y\3\2\2\2\20[\3\2\2\2\22_\3\2\2\2\24p\3"+
		"\2\2\2\26u\3\2\2\2\30y\3\2\2\2\32\177\3\2\2\2\34\u0087\3\2\2\2\36\u00a4"+
		"\3\2\2\2 \u00a6\3\2\2\2\"\u00ae\3\2\2\2$\u00b0\3\2\2\2&\u00c7\3\2\2\2"+
		"(\u00cd\3\2\2\2*\u00cf\3\2\2\2,\u00de\3\2\2\2.\u00ea\3\2\2\2\60\u00f8"+
		"\3\2\2\2\62\u00fa\3\2\2\2\64\u010b\3\2\2\2\66\67\5\4\3\2\678\7\2\2\38"+
		"\3\3\2\2\29;\5\6\4\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\5\3\2\2"+
		"\2>A\5\b\5\2?A\5\34\17\2@>\3\2\2\2@?\3\2\2\2A\7\3\2\2\2BL\5\f\7\2CE\5"+
		"\n\6\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HJ\5\f\7\2IH\3"+
		"\2\2\2IJ\3\2\2\2JL\3\2\2\2KB\3\2\2\2KD\3\2\2\2L\t\3\2\2\2MN\5\16\b\2N"+
		"O\5&\24\2O\13\3\2\2\2PR\5\16\b\2QS\5&\24\2RQ\3\2\2\2RS\3\2\2\2S\r\3\2"+
		"\2\2TZ\5\20\t\2UZ\5\22\n\2VZ\5\30\r\2WZ\5\32\16\2XZ\5\64\33\2YT\3\2\2"+
		"\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\17\3\2\2\2[\\\5\64\33\2\\"+
		"]\7%\2\2]^\5\64\33\2^\21\3\2\2\2_`\7\3\2\2`b\5\64\33\2ac\5&\24\2ba\3\2"+
		"\2\2bc\3\2\2\2cd\3\2\2\2dh\5\b\5\2eg\5\24\13\2fe\3\2\2\2gj\3\2\2\2hf\3"+
		"\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2km\5\26\f\2lk\3\2\2\2lm\3\2\2\2mn"+
		"\3\2\2\2no\7\4\2\2o\23\3\2\2\2pq\7\5\2\2qr\5\64\33\2rs\5&\24\2st\5\b\5"+
		"\2t\25\3\2\2\2uv\7\6\2\2vw\5&\24\2wx\5\b\5\2x\27\3\2\2\2yz\7\7\2\2z{\5"+
		"\64\33\2{|\5&\24\2|}\5\b\5\2}~\7\4\2\2~\31\3\2\2\2\177\u0080\7\b\2\2\u0080"+
		"\u0081\7+\2\2\u0081\u0082\7%\2\2\u0082\u0083\5\64\33\2\u0083\u0084\5&"+
		"\24\2\u0084\u0085\5\b\5\2\u0085\u0086\7\4\2\2\u0086\33\3\2\2\2\u0087\u0088"+
		"\7\t\2\2\u0088\u0089\5\36\20\2\u0089\u008a\7%\2\2\u008a\u008b\7+\2\2\u008b"+
		"\u008d\7\n\2\2\u008c\u008e\5 \21\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\13\2\2\u0090\u0091\5&\24\2\u0091"+
		"\u0092\5\b\5\2\u0092\u0093\7\f\2\2\u0093\u0094\5&\24\2\u0094\35\3\2\2"+
		"\2\u0095\u0097\7+\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00a5"+
		"\3\2\2\2\u0098\u009a\7\r\2\2\u0099\u009b\7+\2\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u00a0\3\2\2\2\u009c\u009d\7\16\2\2\u009d\u009f\7"+
		"+\2\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\17"+
		"\2\2\u00a4\u0096\3\2\2\2\u00a4\u0098\3\2\2\2\u00a5\37\3\2\2\2\u00a6\u00ab"+
		"\7+\2\2\u00a7\u00a8\7\16\2\2\u00a8\u00aa\7+\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac!\3\2\2\2"+
		"\u00ad\u00ab\3\2\2\2\u00ae\u00af\t\2\2\2\u00af#\3\2\2\2\u00b0\u00b2\7"+
		"\20\2\2\u00b1\u00b3\7\21\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"%\3\2\2\2\u00b4\u00b8\7\22\2\2\u00b5\u00b7\7\20\2\2\u00b6\u00b5\3\2\2"+
		"\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c8"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bf\7\16\2\2\u00bc\u00be\7\20\2\2"+
		"\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c8\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\7\20\2\2"+
		"\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00b4\3\2\2\2\u00c7\u00bb\3\2\2\2\u00c7"+
		"\u00c3\3\2\2\2\u00c8\'\3\2\2\2\u00c9\u00ce\5*\26\2\u00ca\u00ce\5\"\22"+
		"\2\u00cb\u00ce\7.\2\2\u00cc\u00ce\7+\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce)\3\2\2\2\u00cf"+
		"\u00d1\7\r\2\2\u00d0\u00d2\5,\27\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\5\60\31\2\u00d4\u00d5\5,\27\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dc\7\17\2\2\u00dc+\3\2\2\2\u00dd\u00df\5\64\33\2\u00de\u00dd\3\2\2"+
		"\2\u00de\u00df\3\2\2\2\u00df\u00e5\3\2\2\2\u00e0\u00e1\5.\30\2\u00e1\u00e2"+
		"\5\64\33\2\u00e2\u00e4\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4\u00e7\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6-\3\2\2\2\u00e7\u00e5\3"+
		"\2\2\2\u00e8\u00eb\7\16\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb/\3\2\2\2\u00ec\u00f0\7\22\2\2\u00ed\u00ef\5$\23\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f9\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\5$\23\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00ec\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9"+
		"\61\3\2\2\2\u00fa\u00ff\5\64\33\2\u00fb\u00fc\7\16\2\2\u00fc\u00fe\5\64"+
		"\33\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\63\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\b\33\1"+
		"\2\u0103\u0104\7\n\2\2\u0104\u0105\5\64\33\2\u0105\u0106\7\13\2\2\u0106"+
		"\u010c\3\2\2\2\u0107\u0108\t\3\2\2\u0108\u010c\5\64\33\13\u0109\u010c"+
		"\5(\25\2\u010a\u010c\7$\2\2\u010b\u0102\3\2\2\2\u010b\u0107\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u0131\3\2\2\2\u010d\u010e\f\f"+
		"\2\2\u010e\u010f\t\4\2\2\u010f\u0130\5\64\33\r\u0110\u0111\f\n\2\2\u0111"+
		"\u0112\t\5\2\2\u0112\u0130\5\64\33\13\u0113\u0114\f\t\2\2\u0114\u0115"+
		"\t\6\2\2\u0115\u0130\5\64\33\n\u0116\u0117\f\b\2\2\u0117\u0118\t\7\2\2"+
		"\u0118\u0130\5\64\33\t\u0119\u011a\f\7\2\2\u011a\u011b\t\b\2\2\u011b\u0130"+
		"\5\64\33\b\u011c\u011d\f\6\2\2\u011d\u011e\t\t\2\2\u011e\u0130\5\64\33"+
		"\7\u011f\u0120\f\4\2\2\u0120\u0124\7$\2\2\u0121\u0122\5\64\33\2\u0122"+
		"\u0123\7$\2\2\u0123\u0125\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0130\5\64\33\5\u0127\u0128\f\16\2\2\u0128"+
		"\u012a\7\n\2\2\u0129\u012b\5\62\32\2\u012a\u0129\3\2\2\2\u012a\u012b\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012c\u0130\7\13\2\2\u012d\u012e\f\r\2\2\u012e"+
		"\u0130\t\n\2\2\u012f\u010d\3\2\2\2\u012f\u0110\3\2\2\2\u012f\u0113\3\2"+
		"\2\2\u012f\u0116\3\2\2\2\u012f\u0119\3\2\2\2\u012f\u011c\3\2\2\2\u012f"+
		"\u011f\3\2\2\2\u012f\u0127\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0133\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\65\3\2\2\2\u0133\u0131"+
		"\3\2\2\2&<@FIKRYbhl\u008d\u0096\u009a\u00a0\u00a4\u00ab\u00b2\u00b8\u00bf"+
		"\u00c5\u00c7\u00cd\u00d1\u00d8\u00de\u00e5\u00ea\u00f0\u00f6\u00f8\u00ff"+
		"\u010b\u0124\u012a\u012f\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}