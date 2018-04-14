// Generated from /home/vlad/IdeaProjects/ampt/parser/grammar/Ampc.g4 by ANTLR 4.7
package ru.vsu.parser; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AmpcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ASSIGN=18, PLUS=19, MINUS=20, PROD=21, DIV=22, WS=23, ID=24, INTEGER=25, 
		REAL=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"ASSIGN", "PLUS", "MINUS", "PROD", "DIV", "WS", "ID", "INTEGER", "REAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'end'", "'elseif'", "'else'", "'while'", "'('", "')'", 
		"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'\n'", "'\r'", "';'", "','", 
		"'='", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "ASSIGN", "PLUS", "MINUS", "PROD", 
		"DIV", "WS", "ID", "INTEGER", "REAL"
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


	public AmpcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ampc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\6\30x\n\30\r\30\16\30y\3\30\3\30\3\31\3\31"+
		"\7\31\u0080\n\31\f\31\16\31\u0083\13\31\3\32\6\32\u0086\n\32\r\32\16\32"+
		"\u0087\3\33\3\33\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\3\2\5\4\2\13\13\"\"\5\2C\\aac|\6\2\62;C\\aac|\2\u008f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5:\3\2\2\2\7>\3"+
		"\2\2\2\tE\3\2\2\2\13J\3\2\2\2\rP\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23V\3"+
		"\2\2\2\25X\3\2\2\2\27[\3\2\2\2\31^\3\2\2\2\33a\3\2\2\2\35d\3\2\2\2\37"+
		"f\3\2\2\2!h\3\2\2\2#j\3\2\2\2%l\3\2\2\2\'n\3\2\2\2)p\3\2\2\2+r\3\2\2\2"+
		"-t\3\2\2\2/w\3\2\2\2\61}\3\2\2\2\63\u0085\3\2\2\2\65\u0089\3\2\2\2\67"+
		"8\7k\2\289\7h\2\29\4\3\2\2\2:;\7g\2\2;<\7p\2\2<=\7f\2\2=\6\3\2\2\2>?\7"+
		"g\2\2?@\7n\2\2@A\7u\2\2AB\7g\2\2BC\7k\2\2CD\7h\2\2D\b\3\2\2\2EF\7g\2\2"+
		"FG\7n\2\2GH\7u\2\2HI\7g\2\2I\n\3\2\2\2JK\7y\2\2KL\7j\2\2LM\7k\2\2MN\7"+
		"n\2\2NO\7g\2\2O\f\3\2\2\2PQ\7*\2\2Q\16\3\2\2\2RS\7+\2\2S\20\3\2\2\2TU"+
		"\7@\2\2U\22\3\2\2\2VW\7>\2\2W\24\3\2\2\2XY\7@\2\2YZ\7?\2\2Z\26\3\2\2\2"+
		"[\\\7>\2\2\\]\7?\2\2]\30\3\2\2\2^_\7?\2\2_`\7?\2\2`\32\3\2\2\2ab\7#\2"+
		"\2bc\7?\2\2c\34\3\2\2\2de\7\f\2\2e\36\3\2\2\2fg\7\17\2\2g \3\2\2\2hi\7"+
		"=\2\2i\"\3\2\2\2jk\7.\2\2k$\3\2\2\2lm\7?\2\2m&\3\2\2\2no\7-\2\2o(\3\2"+
		"\2\2pq\7/\2\2q*\3\2\2\2rs\7,\2\2s,\3\2\2\2tu\7\61\2\2u.\3\2\2\2vx\t\2"+
		"\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\30\2\2|\60"+
		"\3\2\2\2}\u0081\t\3\2\2~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0083\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\62\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0086\4\62;\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\64\3\2\2\2\u0089\u008a\5\63\32"+
		"\2\u008a\u008b\7\60\2\2\u008b\u008c\5\63\32\2\u008c\66\3\2\2\2\6\2y\u0081"+
		"\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}