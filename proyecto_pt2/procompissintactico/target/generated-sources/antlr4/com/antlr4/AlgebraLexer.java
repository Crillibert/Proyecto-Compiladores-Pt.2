// Generated from com\antlr4\Algebra.g4 by ANTLR 4.9.3
package com.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgebraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUMERO_ENTERO=2, NUMERO_REAL=3, ID=4, TIPODDATO=5, OP_LOGICO=6, 
		OP_RACIONALES=7, OP_ARITMETICO=8, OP_DEC_INC=9, RES_CONTROL=10, RES_CICLOS=11, 
		RES_FUN=12, LCOR=13, RCOR=14, ASSIGN=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NUMERO_ENTERO", "NUMERO_REAL", "ID", "TIPODDATO", "OP_LOGICO", 
			"OP_RACIONALES", "OP_ARITMETICO", "OP_DEC_INC", "RES_CONTROL", "RES_CICLOS", 
			"RES_FUN", "LCOR", "RCOR", "ASSIGN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", null, null, null, null, null, null, null, null, null, null, 
			null, "'{'", "'}'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NUMERO_ENTERO", "NUMERO_REAL", "ID", "TIPODDATO", "OP_LOGICO", 
			"OP_RACIONALES", "OP_ARITMETICO", "OP_DEC_INC", "RES_CONTROL", "RES_CICLOS", 
			"RES_FUN", "LCOR", "RCOR", "ASSIGN", "WS"
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


	public AlgebraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Algebra.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00c6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\5\3\'\n\3\3\3\6\3*\n\3\r\3\16\3+\3\4\6\4/\n\4\r\4\16\4\60\3\4\3"+
		"\4\6\4\65\n\4\r\4\16\4\66\5\49\n\4\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\5\7i\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bt\n\b\3"+
		"\t\5\tw\n\t\3\n\3\n\3\n\3\n\5\n}\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0085\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0091\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00b7\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\6\21\u00c1\n\21"+
		"\r\21\16\21\u00c2\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\20\3\2//\3\2\62;\5\2"+
		"C\\aac|\6\2\62;C\\aac|\3\2~~\3\2((\3\2##\3\2>>\3\2??\3\2@@\4\2>>@@\7\2"+
		"%%,-//\61\61``\3\2--\5\2\13\f\17\17\"\"\2\u00dd\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5&\3\2\2\2\7.\3\2"+
		"\2\2\t:\3\2\2\2\13a\3\2\2\2\rh\3\2\2\2\17s\3\2\2\2\21v\3\2\2\2\23|\3\2"+
		"\2\2\25\u0084\3\2\2\2\27\u0090\3\2\2\2\31\u00b6\3\2\2\2\33\u00b8\3\2\2"+
		"\2\35\u00ba\3\2\2\2\37\u00bc\3\2\2\2!\u00c0\3\2\2\2#$\7=\2\2$\4\3\2\2"+
		"\2%\'\t\2\2\2&%\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(*\t\3\2\2)(\3\2\2\2*+\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,\6\3\2\2\2-/\t\3\2\2.-\3\2\2\2/\60\3\2\2\2"+
		"\60.\3\2\2\2\60\61\3\2\2\2\618\3\2\2\2\62\64\7\60\2\2\63\65\t\3\2\2\64"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\62"+
		"\3\2\2\289\3\2\2\29\b\3\2\2\2:>\t\4\2\2;=\t\5\2\2<;\3\2\2\2=@\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?\n\3\2\2\2@>\3\2\2\2AB\7T\2\2BC\7g\2\2CD\7c\2\2D"+
		"b\7n\2\2EF\7G\2\2FG\7p\2\2GH\7v\2\2HI\7g\2\2IJ\7t\2\2Jb\7q\2\2KL\7D\2"+
		"\2LM\7q\2\2MN\7q\2\2NO\7n\2\2OP\7g\2\2PQ\7c\2\2QR\7p\2\2Rb\7q\2\2ST\7"+
		"E\2\2TU\7c\2\2UV\7t\2\2VW\7c\2\2WX\7e\2\2XY\7v\2\2YZ\7g\2\2Zb\7t\2\2["+
		"\\\7E\2\2\\]\7c\2\2]^\7f\2\2^_\7g\2\2_`\7p\2\2`b\7c\2\2aA\3\2\2\2aE\3"+
		"\2\2\2aK\3\2\2\2aS\3\2\2\2a[\3\2\2\2b\f\3\2\2\2cd\t\6\2\2di\t\6\2\2ef"+
		"\t\7\2\2fi\t\7\2\2gi\t\b\2\2hc\3\2\2\2he\3\2\2\2hg\3\2\2\2i\16\3\2\2\2"+
		"jk\t\t\2\2kt\t\n\2\2lm\t\13\2\2mt\t\n\2\2no\t\n\2\2ot\t\n\2\2pq\t\b\2"+
		"\2qt\t\n\2\2rt\t\f\2\2sj\3\2\2\2sl\3\2\2\2sn\3\2\2\2sp\3\2\2\2sr\3\2\2"+
		"\2t\20\3\2\2\2uw\t\r\2\2vu\3\2\2\2w\22\3\2\2\2xy\t\16\2\2y}\t\16\2\2z"+
		"{\t\2\2\2{}\t\2\2\2|x\3\2\2\2|z\3\2\2\2}\24\3\2\2\2~\177\7k\2\2\177\u0085"+
		"\7h\2\2\u0080\u0081\7g\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2\u0083"+
		"\u0085\7g\2\2\u0084~\3\2\2\2\u0084\u0080\3\2\2\2\u0085\26\3\2\2\2\u0086"+
		"\u0087\7h\2\2\u0087\u0088\7q\2\2\u0088\u0091\7t\2\2\u0089\u008a\7f\2\2"+
		"\u008a\u0091\7q\2\2\u008b\u008c\7y\2\2\u008c\u008d\7j\2\2\u008d\u008e"+
		"\7k\2\2\u008e\u008f\7n\2\2\u008f\u0091\7g\2\2\u0090\u0086\3\2\2\2\u0090"+
		"\u0089\3\2\2\2\u0090\u008b\3\2\2\2\u0091\30\3\2\2\2\u0092\u0093\7G\2\2"+
		"\u0093\u0094\7u\2\2\u0094\u0095\7e\2\2\u0095\u0096\7t\2\2\u0096\u0097"+
		"\7k\2\2\u0097\u0098\7d\2\2\u0098\u0099\7k\2\2\u0099\u009a\7t\2\2\u009a"+
		"\u009b\7N\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7g\2\2"+
		"\u009e\u00b7\7c\2\2\u009f\u00a0\7G\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2"+
		"\7e\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7d\2\2\u00a5"+
		"\u00a6\7k\2\2\u00a6\u00b7\7t\2\2\u00a7\u00a8\7N\2\2\u00a8\u00a9\7q\2\2"+
		"\u00a9\u00aa\7p\2\2\u00aa\u00ab\7i\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad"+
		"\7v\2\2\u00ad\u00ae\7w\2\2\u00ae\u00b7\7f\2\2\u00af\u00b0\7c\2\2\u00b0"+
		"\u00b1\7E\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7g\2\2"+
		"\u00b4\u00b5\7p\2\2\u00b5\u00b7\7c\2\2\u00b6\u0092\3\2\2\2\u00b6\u009f"+
		"\3\2\2\2\u00b6\u00a7\3\2\2\2\u00b6\u00af\3\2\2\2\u00b7\32\3\2\2\2\u00b8"+
		"\u00b9\7}\2\2\u00b9\34\3\2\2\2\u00ba\u00bb\7\177\2\2\u00bb\36\3\2\2\2"+
		"\u00bc\u00bd\7?\2\2\u00bd\u00be\7@\2\2\u00be \3\2\2\2\u00bf\u00c1\t\17"+
		"\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\21\2\2\u00c5\"\3\2\2"+
		"\2\22\2&+\60\668>ahsv|\u0084\u0090\u00b6\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}