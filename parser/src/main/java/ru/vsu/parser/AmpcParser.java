// Generated from /home/vlad/IdeaProjects/ampt/parser/grammar/Ampc.g4 by ANTLR 4.7
package ru.vsu.parser; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AmpcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ASSIGN=20, PLUS=21, MINUS=22, PROD=23, DIV=24, WS=25, 
		ID=26, INTEGER=27, REAL=28;
	public static final int
		RULE_file = 0, RULE_script = 1, RULE_codeBlock = 2, RULE_commSep = 3, 
		RULE_comOptSep = 4, RULE_command = 5, RULE_assign = 6, RULE_condOperator = 7, 
		RULE_elseIfPart = 8, RULE_elsePart = 9, RULE_loopOperator = 10, RULE_number = 11, 
		RULE_nl = 12, RULE_commsep = 13, RULE_atom = 14, RULE_array = 15, RULE_arrayRow = 16, 
		RULE_arrayRowSeparator = 17, RULE_arrayColumnSeparator = 18, RULE_expressionList = 19, 
		RULE_expression = 20;
	public static final String[] ruleNames = {
		"file", "script", "codeBlock", "commSep", "comOptSep", "command", "assign", 
		"condOperator", "elseIfPart", "elsePart", "loopOperator", "number", "nl", 
		"commsep", "atom", "array", "arrayRow", "arrayRowSeparator", "arrayColumnSeparator", 
		"expressionList", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'end'", "'elseif'", "'else'", "'while'", "'\n'", "'\r'", 
		"';'", "','", "'['", "']'", "'('", "')'", "'>'", "'<'", "'>='", "'<='", 
		"'=='", "'!='", "'='", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ASSIGN", "PLUS", "MINUS", 
		"PROD", "DIV", "WS", "ID", "INTEGER", "REAL"
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
			setState(42);
			script();
			}
		}
		catch (RecognitionException re) {
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
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AmpcParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			codeBlock();
			setState(45);
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

	public static class CodeBlockContext extends ParserRuleContext {
		public List<CommSepContext> commSep() {
			return getRuleContexts(CommSepContext.class);
		}
		public CommSepContext commSep(int i) {
			return getRuleContext(CommSepContext.class,i);
		}
		public ComOptSepContext comOptSep() {
			return getRuleContext(ComOptSepContext.class,0);
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
		enterRule(_localctx, 4, RULE_codeBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					commSep();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__9) | (1L << T__11) | (1L << ID) | (1L << INTEGER) | (1L << REAL))) != 0)) {
				{
				setState(53);
				comOptSep();
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
		enterRule(_localctx, 6, RULE_commSep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			command();
			setState(57);
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
		enterRule(_localctx, 8, RULE_comOptSep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			command();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(60);
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
	public static class LoopOperatorCommandContext extends CommandContext {
		public LoopOperatorContext loopOperator() {
			return getRuleContext(LoopOperatorContext.class,0);
		}
		public LoopOperatorCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterLoopOperatorCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitLoopOperatorCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitLoopOperatorCommand(this);
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

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__11:
			case ID:
			case INTEGER:
			case REAL:
				_localctx = new AssingCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				assign();
				}
				break;
			case T__0:
				_localctx = new CondOperatorCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				condOperator();
				}
				break;
			case T__4:
				_localctx = new LoopOperatorCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				loopOperator();
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
		enterRule(_localctx, 12, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((AssignContext)_localctx).lvalue = expression(0);
			setState(69);
			match(ASSIGN);
			setState(70);
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
		enterRule(_localctx, 14, RULE_condOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__0);
			setState(73);
			((CondOperatorContext)_localctx).cond = expression(0);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(74);
				commsep();
				}
			}

			setState(77);
			((CondOperatorContext)_localctx).block = codeBlock();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(78);
				elseIfPart();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(84);
				elsePart();
				}
			}

			setState(87);
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
		enterRule(_localctx, 16, RULE_elseIfPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__2);
			setState(90);
			((ElseIfPartContext)_localctx).cond = expression(0);
			setState(91);
			commsep();
			setState(92);
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
		enterRule(_localctx, 18, RULE_elsePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__3);
			setState(95);
			commsep();
			setState(96);
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

	public static class LoopOperatorContext extends ParserRuleContext {
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
		public LoopOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).enterLoopOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmpcListener ) ((AmpcListener)listener).exitLoopOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmpcVisitor ) return ((AmpcVisitor<? extends T>)visitor).visitLoopOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopOperatorContext loopOperator() throws RecognitionException {
		LoopOperatorContext _localctx = new LoopOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loopOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__4);
			setState(99);
			((LoopOperatorContext)_localctx).cond = expression(0);
			setState(100);
			commsep();
			setState(101);
			((LoopOperatorContext)_localctx).block = codeBlock();
			setState(102);
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
		enterRule(_localctx, 22, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		enterRule(_localctx, 24, RULE_nl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__5);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(107);
				match(T__6);
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
		enterRule(_localctx, 26, RULE_commsep);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__7);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(111);
					match(T__5);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__8);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(118);
					match(T__5);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					match(T__5);
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
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
		enterRule(_localctx, 28, RULE_atom);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((ArrayExprContext)_localctx).arr = array();
				}
				break;
			case INTEGER:
			case REAL:
				_localctx = new NumberExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				((NumberExprContext)_localctx).value = number();
				}
				break;
			case ID:
				_localctx = new IdentExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
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
		enterRule(_localctx, 30, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__9);
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(137);
				arrayRow();
				}
				break;
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__7) {
				{
				{
				setState(140);
				arrayColumnSeparator();
				setState(141);
				arrayRow();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 32, RULE_arrayRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(150);
				expression(0);
				}
				break;
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << ID) | (1L << INTEGER) | (1L << REAL))) != 0)) {
				{
				{
				setState(153);
				arrayRowSeparator();
				setState(154);
				expression(0);
				}
				}
				setState(160);
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
		enterRule(_localctx, 34, RULE_arrayRowSeparator);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(T__8);
				}
				break;
			case T__9:
			case T__11:
			case ID:
			case INTEGER:
			case REAL:
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
		enterRule(_localctx, 36, RULE_arrayColumnSeparator);
		try {
			int _alt;
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__7);
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(166);
						nl();
						}
						} 
					}
					setState(171);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(173); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(172);
						nl();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(175); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 38, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			expression(0);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(180);
				match(T__8);
				setState(181);
				expression(0);
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(188);
				match(T__11);
				setState(189);
				expression(0);
				setState(190);
				match(T__12);
				}
				break;
			case T__9:
			case ID:
			case INTEGER:
			case REAL:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(196);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PROD || _la==DIV) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						((InfixExprContext)_localctx).right = expression(6);
						}
						break;
					case 2:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(199);
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
						setState(200);
						((InfixExprContext)_localctx).right = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(202);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						((InfixExprContext)_localctx).right = expression(4);
						}
						break;
					case 4:
						{
						_localctx = new InfixExprContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(205);
						((InfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((InfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						((InfixExprContext)_localctx).right = expression(3);
						}
						break;
					case 5:
						{
						_localctx = new IndexExprContext(new ExpressionContext(_parentctx, _parentState));
						((IndexExprContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(208);
						match(T__11);
						setState(209);
						((IndexExprContext)_localctx).index = expressionList();
						setState(210);
						match(T__12);
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
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
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00dc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\4\7\4\63"+
		"\n\4\f\4\16\4\66\13\4\3\4\5\49\n\4\3\5\3\5\3\5\3\6\3\6\5\6@\n\6\3\7\3"+
		"\7\3\7\5\7E\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\tN\n\t\3\t\3\t\7\tR\n\t"+
		"\f\t\16\tU\13\t\3\t\5\tX\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16o\n\16\3\17\3\17\7"+
		"\17s\n\17\f\17\16\17v\13\17\3\17\3\17\7\17z\n\17\f\17\16\17}\13\17\3\17"+
		"\6\17\u0080\n\17\r\17\16\17\u0081\5\17\u0084\n\17\3\20\3\20\3\20\5\20"+
		"\u0089\n\20\3\21\3\21\5\21\u008d\n\21\3\21\3\21\3\21\7\21\u0092\n\21\f"+
		"\21\16\21\u0095\13\21\3\21\3\21\3\22\5\22\u009a\n\22\3\22\3\22\3\22\7"+
		"\22\u009f\n\22\f\22\16\22\u00a2\13\22\3\23\3\23\5\23\u00a6\n\23\3\24\3"+
		"\24\7\24\u00aa\n\24\f\24\16\24\u00ad\13\24\3\24\6\24\u00b0\n\24\r\24\16"+
		"\24\u00b1\5\24\u00b4\n\24\3\25\3\25\3\25\7\25\u00b9\n\25\f\25\16\25\u00bc"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00c4\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7"+
		"\26\u00d7\n\26\f\26\16\26\u00da\13\26\3\26\2\3*\27\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*\2\7\3\2\35\36\3\2\31\32\3\2\27\30\3\2\20\23"+
		"\3\2\24\25\2\u00e5\2,\3\2\2\2\4.\3\2\2\2\6\64\3\2\2\2\b:\3\2\2\2\n=\3"+
		"\2\2\2\fD\3\2\2\2\16F\3\2\2\2\20J\3\2\2\2\22[\3\2\2\2\24`\3\2\2\2\26d"+
		"\3\2\2\2\30j\3\2\2\2\32l\3\2\2\2\34\u0083\3\2\2\2\36\u0088\3\2\2\2 \u008a"+
		"\3\2\2\2\"\u0099\3\2\2\2$\u00a5\3\2\2\2&\u00b3\3\2\2\2(\u00b5\3\2\2\2"+
		"*\u00c3\3\2\2\2,-\5\4\3\2-\3\3\2\2\2./\5\6\4\2/\60\7\2\2\3\60\5\3\2\2"+
		"\2\61\63\5\b\5\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2"+
		"\2\658\3\2\2\2\66\64\3\2\2\2\679\5\n\6\28\67\3\2\2\289\3\2\2\29\7\3\2"+
		"\2\2:;\5\f\7\2;<\5\34\17\2<\t\3\2\2\2=?\5\f\7\2>@\5\34\17\2?>\3\2\2\2"+
		"?@\3\2\2\2@\13\3\2\2\2AE\5\16\b\2BE\5\20\t\2CE\5\26\f\2DA\3\2\2\2DB\3"+
		"\2\2\2DC\3\2\2\2E\r\3\2\2\2FG\5*\26\2GH\7\26\2\2HI\5*\26\2I\17\3\2\2\2"+
		"JK\7\3\2\2KM\5*\26\2LN\5\34\17\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OS\5\6\4"+
		"\2PR\5\22\n\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2US\3\2"+
		"\2\2VX\5\24\13\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\4\2\2Z\21\3\2\2\2["+
		"\\\7\5\2\2\\]\5*\26\2]^\5\34\17\2^_\5\6\4\2_\23\3\2\2\2`a\7\6\2\2ab\5"+
		"\34\17\2bc\5\6\4\2c\25\3\2\2\2de\7\7\2\2ef\5*\26\2fg\5\34\17\2gh\5\6\4"+
		"\2hi\7\4\2\2i\27\3\2\2\2jk\t\2\2\2k\31\3\2\2\2ln\7\b\2\2mo\7\t\2\2nm\3"+
		"\2\2\2no\3\2\2\2o\33\3\2\2\2pt\7\n\2\2qs\7\b\2\2rq\3\2\2\2sv\3\2\2\2t"+
		"r\3\2\2\2tu\3\2\2\2u\u0084\3\2\2\2vt\3\2\2\2w{\7\13\2\2xz\7\b\2\2yx\3"+
		"\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0084\3\2\2\2}{\3\2\2\2~\u0080\7"+
		"\b\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083p\3\2\2\2\u0083w\3\2\2\2\u0083\177\3"+
		"\2\2\2\u0084\35\3\2\2\2\u0085\u0089\5 \21\2\u0086\u0089\5\30\r\2\u0087"+
		"\u0089\7\34\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3"+
		"\2\2\2\u0089\37\3\2\2\2\u008a\u008c\7\f\2\2\u008b\u008d\5\"\22\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0093\3\2\2\2\u008e\u008f\5&"+
		"\24\2\u008f\u0090\5\"\22\2\u0090\u0092\3\2\2\2\u0091\u008e\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\r\2\2\u0097!\3\2\2\2\u0098\u009a"+
		"\5*\26\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a0\3\2\2\2\u009b"+
		"\u009c\5$\23\2\u009c\u009d\5*\26\2\u009d\u009f\3\2\2\2\u009e\u009b\3\2"+
		"\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"#\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\7\13\2\2\u00a4\u00a6\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6%\3\2\2\2\u00a7\u00ab\7"+
		"\n\2\2\u00a8\u00aa\5\32\16\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b4\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00b0\5\32\16\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a7\3\2"+
		"\2\2\u00b3\u00af\3\2\2\2\u00b4\'\3\2\2\2\u00b5\u00ba\5*\26\2\u00b6\u00b7"+
		"\7\13\2\2\u00b7\u00b9\5*\26\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb)\3\2\2\2\u00bc\u00ba\3"+
		"\2\2\2\u00bd\u00be\b\26\1\2\u00be\u00bf\7\16\2\2\u00bf\u00c0\5*\26\2\u00c0"+
		"\u00c1\7\17\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c4\5\36\20\2\u00c3\u00bd"+
		"\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00d8\3\2\2\2\u00c5\u00c6\f\7\2\2\u00c6"+
		"\u00c7\t\3\2\2\u00c7\u00d7\5*\26\b\u00c8\u00c9\f\6\2\2\u00c9\u00ca\t\4"+
		"\2\2\u00ca\u00d7\5*\26\7\u00cb\u00cc\f\5\2\2\u00cc\u00cd\t\5\2\2\u00cd"+
		"\u00d7\5*\26\6\u00ce\u00cf\f\4\2\2\u00cf\u00d0\t\6\2\2\u00d0\u00d7\5*"+
		"\26\5\u00d1\u00d2\f\b\2\2\u00d2\u00d3\7\16\2\2\u00d3\u00d4\5(\25\2\u00d4"+
		"\u00d5\7\17\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00c5\3\2\2\2\u00d6\u00c8\3"+
		"\2\2\2\u00d6\u00cb\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9+\3\2\2\2"+
		"\u00da\u00d8\3\2\2\2\33\648?DMSWnt{\u0081\u0083\u0088\u008c\u0093\u0099"+
		"\u00a0\u00a5\u00ab\u00b1\u00b3\u00ba\u00c3\u00d6\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}