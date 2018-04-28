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
		RULE_rValue = 8, RULE_condOperator = 9, RULE_elseIfPart = 10, RULE_elsePart = 11, 
		RULE_whileLoop = 12, RULE_forLoop = 13, RULE_function = 14, RULE_funcOut = 15, 
		RULE_idList = 16, RULE_funcArgs = 17, RULE_number = 18, RULE_nl = 19, 
		RULE_commsep = 20, RULE_atom = 21, RULE_array = 22, RULE_arrayRow = 23, 
		RULE_arrayRowSeparator = 24, RULE_arrayColumnSeparator = 25, RULE_expressionList = 26, 
		RULE_expression = 27;
	public static final String[] ruleNames = {
		"file", "script", "scriptEntry", "codeBlock", "commSep", "comOptSep", 
		"command", "assign", "rValue", "condOperator", "elseIfPart", "elsePart", 
		"whileLoop", "forLoop", "function", "funcOut", "idList", "funcArgs", "number", 
		"nl", "commsep", "atom", "array", "arrayRow", "arrayRowSeparator", "arrayColumnSeparator", 
		"expressionList", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'('", "')'", "'if'", "'end'", "'elseif'", "'else'", "'while'", 
		"'for'", "'function'", "'endfunction'", "'['", "','", "']'", "'\n'", "'\r'", 
		"';'", "'.''", "'''", "'.^'", "'^'", "'~'", "'.*'", "'./'", "'>'", "'<'", 
		"'>='", "'<='", "'=='", "'!='", "'&'", "'&&'", "'|'", "'||'", "':'", "'='", 
		"'+'", "'-'", "'*'", "'/'"
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
			setState(56);
			script();
			setState(57);
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
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				scriptEntry();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__21) | (1L << T__34) | (1L << PLUS) | (1L << MINUS) | (1L << ID) | (1L << INTEGER) | (1L << REAL) | (1L << STRING))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__7:
			case T__8:
			case T__11:
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
				setState(64);
				codeBlock();
				}
				break;
			case T__9:
				_localctx = new FuncNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				comOptSep();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(69);
						commSep();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(72); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(74);
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
			setState(79);
			command();
			setState(80);
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
			setState(82);
			command();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16))) != 0)) {
				{
				setState(83);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssingCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				assign();
				}
				break;
			case 2:
				_localctx = new CondOperatorCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				condOperator();
				}
				break;
			case 3:
				_localctx = new WhileLoopCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				whileLoop();
				}
				break;
			case 4:
				_localctx = new ForLoopCommandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				forLoop();
				}
				break;
			case 5:
				_localctx = new ExpressionCommandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
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
		public RValueContext rvalue;
		public TerminalNode ASSIGN() { return getToken(AmpcParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(93);
			((AssignContext)_localctx).lvalue = expression(0);
			setState(94);
			match(ASSIGN);
			setState(95);
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
		enterRule(_localctx, 16, RULE_rValue);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ExprRValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				expression(0);
				}
				break;
			case 2:
				_localctx = new FunctionHandleRValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(T__0);
				setState(99);
				match(ID);
				}
				break;
			case 3:
				_localctx = new AnonymousFuncRValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(T__0);
				setState(101);
				match(T__1);
				setState(102);
				idList();
				setState(103);
				match(T__2);
				setState(104);
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
		enterRule(_localctx, 18, RULE_condOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__3);
			setState(109);
			((CondOperatorContext)_localctx).cond = expression(0);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16))) != 0)) {
				{
				setState(110);
				commsep();
				}
			}

			setState(113);
			((CondOperatorContext)_localctx).block = codeBlock();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(114);
				elseIfPart();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(120);
				elsePart();
				}
			}

			setState(123);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 20, RULE_elseIfPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__5);
			setState(126);
			((ElseIfPartContext)_localctx).cond = expression(0);
			setState(127);
			commsep();
			setState(128);
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
		enterRule(_localctx, 22, RULE_elsePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__6);
			setState(131);
			commsep();
			setState(132);
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
		enterRule(_localctx, 24, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__7);
			setState(135);
			((WhileLoopContext)_localctx).cond = expression(0);
			setState(136);
			commsep();
			setState(137);
			((WhileLoopContext)_localctx).block = codeBlock();
			setState(138);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 26, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__8);
			setState(141);
			match(ID);
			setState(142);
			match(ASSIGN);
			setState(143);
			((ForLoopContext)_localctx).expr = expression(0);
			setState(144);
			commsep();
			setState(145);
			((ForLoopContext)_localctx).block = codeBlock();
			setState(146);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__9);
			setState(149);
			((FunctionContext)_localctx).out = funcOut();
			setState(150);
			match(ASSIGN);
			setState(151);
			((FunctionContext)_localctx).name = match(ID);
			setState(152);
			match(T__1);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(153);
				((FunctionContext)_localctx).args = funcArgs();
				}
			}

			setState(156);
			match(T__2);
			setState(157);
			commsep();
			setState(158);
			((FunctionContext)_localctx).block = codeBlock();
			setState(159);
			match(T__10);
			setState(160);
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
		enterRule(_localctx, 30, RULE_funcOut);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(162);
					match(ID);
					}
				}

				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(T__11);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(166);
					match(ID);
					}
				}

				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(169);
					match(T__12);
					setState(170);
					match(ID);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(T__13);
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
		enterRule(_localctx, 32, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ID);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(180);
				match(T__12);
				setState(181);
				match(ID);
				}
				}
				setState(186);
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
		enterRule(_localctx, 34, RULE_funcArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ID);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(188);
				match(T__12);
				setState(189);
				match(ID);
				}
				}
				setState(194);
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
		enterRule(_localctx, 36, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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
		enterRule(_localctx, 38, RULE_nl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__14);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(198);
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
		enterRule(_localctx, 40, RULE_commsep);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(T__16);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(202);
					match(T__14);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__12);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(209);
					match(T__14);
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(215);
					match(T__14);
					}
					}
					setState(218); 
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
		enterRule(_localctx, 42, RULE_atom);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				((ArrayExprContext)_localctx).arr = array();
				}
				break;
			case INTEGER:
			case REAL:
				_localctx = new NumberExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				((NumberExprContext)_localctx).value = number();
				}
				break;
			case STRING:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				((StringExprContext)_localctx).str = match(STRING);
				}
				break;
			case ID:
				_localctx = new IdentExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
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
		enterRule(_localctx, 44, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__11);
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(229);
				arrayRow();
				}
				break;
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__16) {
				{
				{
				setState(232);
				arrayColumnSeparator();
				setState(233);
				arrayRow();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_arrayRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(242);
				expression(0);
				}
				break;
			}
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__12) | (1L << T__21) | (1L << T__34) | (1L << PLUS) | (1L << MINUS) | (1L << ID) | (1L << INTEGER) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				{
				setState(245);
				arrayRowSeparator();
				setState(246);
				expression(0);
				}
				}
				setState(252);
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
		enterRule(_localctx, 48, RULE_arrayRowSeparator);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(T__12);
				}
				break;
			case T__1:
			case T__11:
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
		enterRule(_localctx, 50, RULE_arrayColumnSeparator);
		try {
			int _alt;
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(T__16);
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(258);
						nl();
						}
						} 
					}
					setState(263);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(265); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(264);
						nl();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(267); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 52, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			expression(0);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(272);
				match(T__12);
				setState(273);
				expression(0);
				}
				}
				setState(278);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(280);
				match(T__1);
				setState(281);
				expression(0);
				setState(282);
				match(T__2);
				}
				break;
			case T__21:
			case PLUS:
			case MINUS:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
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
				setState(285);
				((UnaryExprContext)_localctx).expr = expression(9);
				}
				break;
			case T__11:
			case ID:
			case INTEGER:
			case REAL:
			case STRING:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				atom();
				}
				break;
			case T__34:
				{
				_localctx = new RangeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(T__34);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(324);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(291);
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
						setState(292);
						((InfixExprContext)_localctx).right = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(294);
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
						setState(295);
						((InfixExprContext)_localctx).right = expression(9);
						}
						break;
					case 3:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(296);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(297);
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
						setState(298);
						((InfixExprContext)_localctx).right = expression(8);
						}
						break;
					case 4:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(300);
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
						setState(301);
						((InfixExprContext)_localctx).right = expression(7);
						}
						break;
					case 5:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(302);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(303);
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
						setState(304);
						((InfixExprContext)_localctx).right = expression(6);
						}
						break;
					case 6:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(306);
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
						setState(307);
						((InfixExprContext)_localctx).right = expression(5);
						}
						break;
					case 7:
						{
						_localctx = new RangeExprContext(new ExpressionContext(_parentctx, _parentState));
						((RangeExprContext)_localctx).start = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(308);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(309);
						match(T__34);
						setState(313);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(310);
							((RangeExprContext)_localctx).step = expression(0);
							setState(311);
							match(T__34);
							}
							break;
						}
						setState(315);
						((RangeExprContext)_localctx).end = expression(3);
						}
						break;
					case 8:
						{
						_localctx = new IndexExprContext(new ExpressionContext(_parentctx, _parentState));
						((IndexExprContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(317);
						match(T__1);
						setState(319);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__21) | (1L << T__34) | (1L << PLUS) | (1L << MINUS) | (1L << ID) | (1L << INTEGER) | (1L << REAL) | (1L << STRING))) != 0)) {
							{
							setState(318);
							((IndexExprContext)_localctx).index = expressionList();
							}
						}

						setState(321);
						match(T__2);
						}
						break;
					case 9:
						{
						_localctx = new UnaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((UnaryExprContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(323);
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
				setState(328);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u014c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\6\3?\n\3\r\3"+
		"\16\3@\3\4\3\4\5\4E\n\4\3\5\3\5\6\5I\n\5\r\5\16\5J\3\5\5\5N\n\5\5\5P\n"+
		"\5\3\6\3\6\3\6\3\7\3\7\5\7W\n\7\3\b\3\b\3\b\3\b\3\b\5\b^\n\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nm\n\n\3\13\3\13\3\13\5\13"+
		"r\n\13\3\13\3\13\7\13v\n\13\f\13\16\13y\13\13\3\13\5\13|\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u009d\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\5\21\u00a6\n\21\3\21\3"+
		"\21\5\21\u00aa\n\21\3\21\3\21\7\21\u00ae\n\21\f\21\16\21\u00b1\13\21\3"+
		"\21\5\21\u00b4\n\21\3\22\3\22\3\22\7\22\u00b9\n\22\f\22\16\22\u00bc\13"+
		"\22\3\23\3\23\3\23\7\23\u00c1\n\23\f\23\16\23\u00c4\13\23\3\24\3\24\3"+
		"\25\3\25\5\25\u00ca\n\25\3\26\3\26\7\26\u00ce\n\26\f\26\16\26\u00d1\13"+
		"\26\3\26\3\26\7\26\u00d5\n\26\f\26\16\26\u00d8\13\26\3\26\6\26\u00db\n"+
		"\26\r\26\16\26\u00dc\5\26\u00df\n\26\3\27\3\27\3\27\3\27\5\27\u00e5\n"+
		"\27\3\30\3\30\5\30\u00e9\n\30\3\30\3\30\3\30\7\30\u00ee\n\30\f\30\16\30"+
		"\u00f1\13\30\3\30\3\30\3\31\5\31\u00f6\n\31\3\31\3\31\3\31\7\31\u00fb"+
		"\n\31\f\31\16\31\u00fe\13\31\3\32\3\32\5\32\u0102\n\32\3\33\3\33\7\33"+
		"\u0106\n\33\f\33\16\33\u0109\13\33\3\33\6\33\u010c\n\33\r\33\16\33\u010d"+
		"\5\33\u0110\n\33\3\34\3\34\3\34\7\34\u0115\n\34\f\34\16\34\u0118\13\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0123\n\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u013c\n\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0142\n\35\3\35\3\35\3\35\7\35\u0147\n\35\f\35\16\35\u014a\13\35"+
		"\3\35\2\38\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668\2\13\3\2-.\4\2\30\30\'(\3\2\26\27\4\2\31\32)*\3\2\'(\3\2\33\36\3"+
		"\2\37 \3\2!$\3\2\24\25\2\u0165\2:\3\2\2\2\4>\3\2\2\2\6D\3\2\2\2\bO\3\2"+
		"\2\2\nQ\3\2\2\2\fT\3\2\2\2\16]\3\2\2\2\20_\3\2\2\2\22l\3\2\2\2\24n\3\2"+
		"\2\2\26\177\3\2\2\2\30\u0084\3\2\2\2\32\u0088\3\2\2\2\34\u008e\3\2\2\2"+
		"\36\u0096\3\2\2\2 \u00b3\3\2\2\2\"\u00b5\3\2\2\2$\u00bd\3\2\2\2&\u00c5"+
		"\3\2\2\2(\u00c7\3\2\2\2*\u00de\3\2\2\2,\u00e4\3\2\2\2.\u00e6\3\2\2\2\60"+
		"\u00f5\3\2\2\2\62\u0101\3\2\2\2\64\u010f\3\2\2\2\66\u0111\3\2\2\28\u0122"+
		"\3\2\2\2:;\5\4\3\2;<\7\2\2\3<\3\3\2\2\2=?\5\6\4\2>=\3\2\2\2?@\3\2\2\2"+
		"@>\3\2\2\2@A\3\2\2\2A\5\3\2\2\2BE\5\b\5\2CE\5\36\20\2DB\3\2\2\2DC\3\2"+
		"\2\2E\7\3\2\2\2FP\5\f\7\2GI\5\n\6\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3"+
		"\2\2\2KM\3\2\2\2LN\5\f\7\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OF\3\2\2\2OH\3"+
		"\2\2\2P\t\3\2\2\2QR\5\16\b\2RS\5*\26\2S\13\3\2\2\2TV\5\16\b\2UW\5*\26"+
		"\2VU\3\2\2\2VW\3\2\2\2W\r\3\2\2\2X^\5\20\t\2Y^\5\24\13\2Z^\5\32\16\2["+
		"^\5\34\17\2\\^\58\35\2]X\3\2\2\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2"+
		"\2\2^\17\3\2\2\2_`\58\35\2`a\7&\2\2ab\5\22\n\2b\21\3\2\2\2cm\58\35\2d"+
		"e\7\3\2\2em\7,\2\2fg\7\3\2\2gh\7\4\2\2hi\5\"\22\2ij\7\5\2\2jk\58\35\2"+
		"km\3\2\2\2lc\3\2\2\2ld\3\2\2\2lf\3\2\2\2m\23\3\2\2\2no\7\6\2\2oq\58\35"+
		"\2pr\5*\26\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2sw\5\b\5\2tv\5\26\f\2ut\3\2"+
		"\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2z|\5\30\r\2{z\3"+
		"\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\7\2\2~\25\3\2\2\2\177\u0080\7\b\2\2\u0080"+
		"\u0081\58\35\2\u0081\u0082\5*\26\2\u0082\u0083\5\b\5\2\u0083\27\3\2\2"+
		"\2\u0084\u0085\7\t\2\2\u0085\u0086\5*\26\2\u0086\u0087\5\b\5\2\u0087\31"+
		"\3\2\2\2\u0088\u0089\7\n\2\2\u0089\u008a\58\35\2\u008a\u008b\5*\26\2\u008b"+
		"\u008c\5\b\5\2\u008c\u008d\7\7\2\2\u008d\33\3\2\2\2\u008e\u008f\7\13\2"+
		"\2\u008f\u0090\7,\2\2\u0090\u0091\7&\2\2\u0091\u0092\58\35\2\u0092\u0093"+
		"\5*\26\2\u0093\u0094\5\b\5\2\u0094\u0095\7\7\2\2\u0095\35\3\2\2\2\u0096"+
		"\u0097\7\f\2\2\u0097\u0098\5 \21\2\u0098\u0099\7&\2\2\u0099\u009a\7,\2"+
		"\2\u009a\u009c\7\4\2\2\u009b\u009d\5$\23\2\u009c\u009b\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\5\2\2\u009f\u00a0\5*\26\2\u00a0"+
		"\u00a1\5\b\5\2\u00a1\u00a2\7\r\2\2\u00a2\u00a3\5*\26\2\u00a3\37\3\2\2"+
		"\2\u00a4\u00a6\7,\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00b4"+
		"\3\2\2\2\u00a7\u00a9\7\16\2\2\u00a8\u00aa\7,\2\2\u00a9\u00a8\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00af\3\2\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00ae\7"+
		",\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\7\20"+
		"\2\2\u00b3\u00a5\3\2\2\2\u00b3\u00a7\3\2\2\2\u00b4!\3\2\2\2\u00b5\u00ba"+
		"\7,\2\2\u00b6\u00b7\7\17\2\2\u00b7\u00b9\7,\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb#\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bd\u00c2\7,\2\2\u00be\u00bf\7\17\2\2\u00bf\u00c1"+
		"\7,\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3%\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\t\2\2\2"+
		"\u00c6\'\3\2\2\2\u00c7\u00c9\7\21\2\2\u00c8\u00ca\7\22\2\2\u00c9\u00c8"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca)\3\2\2\2\u00cb\u00cf\7\23\2\2\u00cc"+
		"\u00ce\7\21\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00df\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d6\7\17\2\2\u00d3\u00d5\7\21\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3"+
		"\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00df\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00db\7\21\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00cb\3\2\2\2\u00de\u00d2\3\2\2\2\u00de\u00da\3\2\2\2\u00df+\3\2\2\2"+
		"\u00e0\u00e5\5.\30\2\u00e1\u00e5\5&\24\2\u00e2\u00e5\7/\2\2\u00e3\u00e5"+
		"\7,\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5-\3\2\2\2\u00e6\u00e8\7\16\2\2\u00e7\u00e9\5\60\31"+
		"\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ef\3\2\2\2\u00ea\u00eb"+
		"\5\64\33\2\u00eb\u00ec\5\60\31\2\u00ec\u00ee\3\2\2\2\u00ed\u00ea\3\2\2"+
		"\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\20\2\2\u00f3/\3\2\2\2\u00f4"+
		"\u00f6\58\35\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fc\3\2"+
		"\2\2\u00f7\u00f8\5\62\32\2\u00f8\u00f9\58\35\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\61\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\7\17\2\2\u0100\u0102"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\63\3\2\2\2\u0103"+
		"\u0107\7\23\2\2\u0104\u0106\5(\25\2\u0105\u0104\3\2\2\2\u0106\u0109\3"+
		"\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0110\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010c\5(\25\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u0103\3\2\2\2\u010f\u010b\3\2\2\2\u0110\65\3\2\2\2\u0111\u0116\58\35"+
		"\2\u0112\u0113\7\17\2\2\u0113\u0115\58\35\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\67\3\2\2"+
		"\2\u0118\u0116\3\2\2\2\u0119\u011a\b\35\1\2\u011a\u011b\7\4\2\2\u011b"+
		"\u011c\58\35\2\u011c\u011d\7\5\2\2\u011d\u0123\3\2\2\2\u011e\u011f\t\3"+
		"\2\2\u011f\u0123\58\35\13\u0120\u0123\5,\27\2\u0121\u0123\7%\2\2\u0122"+
		"\u0119\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2"+
		"\2\2\u0123\u0148\3\2\2\2\u0124\u0125\f\f\2\2\u0125\u0126\t\4\2\2\u0126"+
		"\u0147\58\35\r\u0127\u0128\f\n\2\2\u0128\u0129\t\5\2\2\u0129\u0147\58"+
		"\35\13\u012a\u012b\f\t\2\2\u012b\u012c\t\6\2\2\u012c\u0147\58\35\n\u012d"+
		"\u012e\f\b\2\2\u012e\u012f\t\7\2\2\u012f\u0147\58\35\t\u0130\u0131\f\7"+
		"\2\2\u0131\u0132\t\b\2\2\u0132\u0147\58\35\b\u0133\u0134\f\6\2\2\u0134"+
		"\u0135\t\t\2\2\u0135\u0147\58\35\7\u0136\u0137\f\4\2\2\u0137\u013b\7%"+
		"\2\2\u0138\u0139\58\35\2\u0139\u013a\7%\2\2\u013a\u013c\3\2\2\2\u013b"+
		"\u0138\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0147\58"+
		"\35\5\u013e\u013f\f\16\2\2\u013f\u0141\7\4\2\2\u0140\u0142\5\66\34\2\u0141"+
		"\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0147\7\5"+
		"\2\2\u0144\u0145\f\r\2\2\u0145\u0147\t\n\2\2\u0146\u0124\3\2\2\2\u0146"+
		"\u0127\3\2\2\2\u0146\u012a\3\2\2\2\u0146\u012d\3\2\2\2\u0146\u0130\3\2"+
		"\2\2\u0146\u0133\3\2\2\2\u0146\u0136\3\2\2\2\u0146\u013e\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u01499\3\2\2\2\u014a\u0148\3\2\2\2(@DJMOV]lqw{\u009c\u00a5\u00a9"+
		"\u00af\u00b3\u00ba\u00c2\u00c9\u00cf\u00d6\u00dc\u00de\u00e4\u00e8\u00ef"+
		"\u00f5\u00fc\u0101\u0107\u010d\u010f\u0116\u0122\u013b\u0141\u0146\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}