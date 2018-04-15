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
		T__17=18, T__18=19, T__19=20, ASSIGN=21, PLUS=22, MINUS=23, PROD=24, DIV=25, 
		WS=26, ID=27, INTEGER=28, REAL=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "ASSIGN", "PLUS", "MINUS", "PROD", "DIV", "WS", 
		"ID", "INTEGER", "REAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'end'", "'elseif'", "'else'", "'while'", "'\n'", "'\r'", 
		"';'", "','", "'['", "']'", "'('", "')'", "'>'", "'<'", "'>='", "'<='", 
		"'=='", "'!='", "':'", "'='", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "ASSIGN", "PLUS", 
		"MINUS", "PROD", "DIV", "WS", "ID", "INTEGER", "REAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\6\33\u0084\n\33\r\33\16\33\u0085\3\33\3\33\3\34\3"+
		"\34\7\34\u008c\n\34\f\34\16\34\u008f\13\34\3\35\6\35\u0092\n\35\r\35\16"+
		"\35\u0093\3\36\3\36\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37\3\2\5\4\2\13\13\"\"\5\2C\\aac|\6"+
		"\2\62;C\\aac|\2\u009b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5@\3\2\2\2\7D\3\2\2\2\tK\3\2\2"+
		"\2\13P\3\2\2\2\rV\3\2\2\2\17X\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2\2\25^\3\2"+
		"\2\2\27`\3\2\2\2\31b\3\2\2\2\33d\3\2\2\2\35f\3\2\2\2\37h\3\2\2\2!j\3\2"+
		"\2\2#m\3\2\2\2%p\3\2\2\2\'s\3\2\2\2)v\3\2\2\2+x\3\2\2\2-z\3\2\2\2/|\3"+
		"\2\2\2\61~\3\2\2\2\63\u0080\3\2\2\2\65\u0083\3\2\2\2\67\u0089\3\2\2\2"+
		"9\u0091\3\2\2\2;\u0095\3\2\2\2=>\7k\2\2>?\7h\2\2?\4\3\2\2\2@A\7g\2\2A"+
		"B\7p\2\2BC\7f\2\2C\6\3\2\2\2DE\7g\2\2EF\7n\2\2FG\7u\2\2GH\7g\2\2HI\7k"+
		"\2\2IJ\7h\2\2J\b\3\2\2\2KL\7g\2\2LM\7n\2\2MN\7u\2\2NO\7g\2\2O\n\3\2\2"+
		"\2PQ\7y\2\2QR\7j\2\2RS\7k\2\2ST\7n\2\2TU\7g\2\2U\f\3\2\2\2VW\7\f\2\2W"+
		"\16\3\2\2\2XY\7\17\2\2Y\20\3\2\2\2Z[\7=\2\2[\22\3\2\2\2\\]\7.\2\2]\24"+
		"\3\2\2\2^_\7]\2\2_\26\3\2\2\2`a\7_\2\2a\30\3\2\2\2bc\7*\2\2c\32\3\2\2"+
		"\2de\7+\2\2e\34\3\2\2\2fg\7@\2\2g\36\3\2\2\2hi\7>\2\2i \3\2\2\2jk\7@\2"+
		"\2kl\7?\2\2l\"\3\2\2\2mn\7>\2\2no\7?\2\2o$\3\2\2\2pq\7?\2\2qr\7?\2\2r"+
		"&\3\2\2\2st\7#\2\2tu\7?\2\2u(\3\2\2\2vw\7<\2\2w*\3\2\2\2xy\7?\2\2y,\3"+
		"\2\2\2z{\7-\2\2{.\3\2\2\2|}\7/\2\2}\60\3\2\2\2~\177\7,\2\2\177\62\3\2"+
		"\2\2\u0080\u0081\7\61\2\2\u0081\64\3\2\2\2\u0082\u0084\t\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\b\33\2\2\u0088\66\3\2\2\2\u0089\u008d\t\3\2"+
		"\2\u008a\u008c\t\4\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e8\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0092\4\62;\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094:\3\2\2\2\u0095\u0096\59\35\2\u0096\u0097"+
		"\7\60\2\2\u0097\u0098\59\35\2\u0098<\3\2\2\2\6\2\u0085\u008d\u0093\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}