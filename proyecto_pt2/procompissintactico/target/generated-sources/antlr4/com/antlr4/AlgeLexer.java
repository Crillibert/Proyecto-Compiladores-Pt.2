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
public class AlgeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, VARIABLE=2, NUMERO_REAL=3, LPAREN=4, RPAREN=5, MAS=6, MENOS=7, 
		POR=8, DIV=9, GT=10, LT=11, EQ=12, PUNTO=13, POW=14, ASIGN=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "VARIABLE", "VALID_ID_START", "VALID_ID_CHAR", "NUMERO_REAL", 
			"NUMERO", "UNSIGNED_INTEGER", "SIGN", "LPAREN", "RPAREN", "MAS", "MENOS", 
			"POR", "DIV", "GT", "LT", "EQ", "PUNTO", "POW", "ASIGN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", null, null, "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'>'", 
			"'<'", "'='", "'.'", "'^'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "VARIABLE", "NUMERO_REAL", "LPAREN", "RPAREN", "MAS", "MENOS", 
			"POR", "DIV", "GT", "LT", "EQ", "PUNTO", "POW", "ASIGN", "WS"
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


	public AlgeLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\7\3\62\n\3\f"+
		"\3\16\3\65\13\3\3\4\3\4\3\5\3\5\5\5;\n\5\3\6\3\6\5\6?\n\6\3\7\6\7B\n\7"+
		"\r\7\16\7C\3\7\3\7\6\7H\n\7\r\7\16\7I\5\7L\n\7\3\b\6\bO\n\b\r\b\16\bP"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\6\26o"+
		"\n\26\r\26\16\26p\3\26\3\26\2\2\27\3\3\5\4\7\2\t\2\13\5\r\2\17\2\21\2"+
		"\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22\3\2\5\5\2"+
		"C\\aac|\4\2--//\5\2\13\f\17\17\"\"\2v\2\3\3\2\2\2\2\5\3\2\2\2\2\13\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\66\3\2\2\2\t:\3\2\2\2"+
		"\13<\3\2\2\2\rA\3\2\2\2\17N\3\2\2\2\21R\3\2\2\2\23T\3\2\2\2\25V\3\2\2"+
		"\2\27X\3\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2\35^\3\2\2\2\37`\3\2\2\2!b\3\2"+
		"\2\2#d\3\2\2\2%f\3\2\2\2\'h\3\2\2\2)j\3\2\2\2+n\3\2\2\2-.\7=\2\2.\4\3"+
		"\2\2\2/\63\5\7\4\2\60\62\5\t\5\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2"+
		"\2\2\63\64\3\2\2\2\64\6\3\2\2\2\65\63\3\2\2\2\66\67\t\2\2\2\67\b\3\2\2"+
		"\28;\5\7\4\29;\4\62;\2:8\3\2\2\2:9\3\2\2\2;\n\3\2\2\2<>\5\r\7\2=?\5\17"+
		"\b\2>=\3\2\2\2>?\3\2\2\2?\f\3\2\2\2@B\4\62;\2A@\3\2\2\2BC\3\2\2\2CA\3"+
		"\2\2\2CD\3\2\2\2DK\3\2\2\2EG\7\60\2\2FH\4\62;\2GF\3\2\2\2HI\3\2\2\2IG"+
		"\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KE\3\2\2\2KL\3\2\2\2L\16\3\2\2\2MO\4\62;\2"+
		"NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\20\3\2\2\2RS\t\3\2\2S\22\3\2"+
		"\2\2TU\7}\2\2U\24\3\2\2\2VW\7\177\2\2W\26\3\2\2\2XY\7-\2\2Y\30\3\2\2\2"+
		"Z[\7/\2\2[\32\3\2\2\2\\]\7,\2\2]\34\3\2\2\2^_\7\61\2\2_\36\3\2\2\2`a\7"+
		"@\2\2a \3\2\2\2bc\7>\2\2c\"\3\2\2\2de\7?\2\2e$\3\2\2\2fg\7\60\2\2g&\3"+
		"\2\2\2hi\7`\2\2i(\3\2\2\2jk\7?\2\2kl\7@\2\2l*\3\2\2\2mo\t\4\2\2nm\3\2"+
		"\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\b\26\2\2s,\3\2\2\2\13\2"+
		"\63:>CIKPp\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}