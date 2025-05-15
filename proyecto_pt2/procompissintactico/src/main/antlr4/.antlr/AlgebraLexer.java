// Generated from c:/Users/Gabriel/Documents/GitHub/Proyecto-Compiladores-Pt.2/proyecto_pt2/procompissintactico/src/main/antlr4/Algebra.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AlgebraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000\u0010r\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001"+
		"\f\u00013\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u00039\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004=\b\u0004\u0001\u0005"+
		"\u0004\u0005@\b\u0005\u000b\u0005\f\u0005A\u0001\u0005\u0001\u0005\u0004"+
		"\u0005F\b\u0005\u000b\u0005\f\u0005G\u0003\u0005J\b\u0005\u0001\u0006"+
		"\u0004\u0006M\b\u0006\u000b\u0006\f\u0006N\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0004\u0014m\b\u0014"+
		"\u000b\u0014\f\u0014n\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001"+
		"\u0001\u0003\u0002\u0005\u0000\u0007\u0000\t\u0003\u000b\u0000\r\u0000"+
		"\u000f\u0000\u0011\u0004\u0013\u0005\u0015\u0006\u0017\u0007\u0019\b\u001b"+
		"\t\u001d\n\u001f\u000b!\f#\r%\u000e\'\u000f)\u0010\u0001\u0000\u0003\u0003"+
		"\u0000AZ__az\u0002\u0000++--\u0003\u0000\t\n\r\r  t\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001"+
		"\u0000\u0000\u0000\u00054\u0001\u0000\u0000\u0000\u00078\u0001\u0000\u0000"+
		"\u0000\t:\u0001\u0000\u0000\u0000\u000b?\u0001\u0000\u0000\u0000\rL\u0001"+
		"\u0000\u0000\u0000\u000fP\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000"+
		"\u0000\u0013T\u0001\u0000\u0000\u0000\u0015V\u0001\u0000\u0000\u0000\u0017"+
		"X\u0001\u0000\u0000\u0000\u0019Z\u0001\u0000\u0000\u0000\u001b\\\u0001"+
		"\u0000\u0000\u0000\u001d^\u0001\u0000\u0000\u0000\u001f`\u0001\u0000\u0000"+
		"\u0000!b\u0001\u0000\u0000\u0000#d\u0001\u0000\u0000\u0000%f\u0001\u0000"+
		"\u0000\u0000\'h\u0001\u0000\u0000\u0000)l\u0001\u0000\u0000\u0000+,\u0005"+
		";\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-1\u0003\u0005\u0002\u0000"+
		".0\u0003\u0007\u0003\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0004\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000045\u0007\u0000\u0000\u0000"+
		"5\u0006\u0001\u0000\u0000\u000069\u0003\u0005\u0002\u000079\u000209\u0000"+
		"86\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u00009\b\u0001\u0000\u0000"+
		"\u0000:<\u0003\u000b\u0005\u0000;=\u0003\r\u0006\u0000<;\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=\n\u0001\u0000\u0000\u0000>@\u000209"+
		"\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BI\u0001\u0000\u0000\u0000CE\u0005"+
		".\u0000\u0000DF\u000209\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001"+
		"\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"J\f\u0001\u0000\u0000\u0000KM\u000209\u0000LK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000O\u000e\u0001\u0000\u0000\u0000PQ\u0007\u0001\u0000\u0000Q\u0010"+
		"\u0001\u0000\u0000\u0000RS\u0005{\u0000\u0000S\u0012\u0001\u0000\u0000"+
		"\u0000TU\u0005}\u0000\u0000U\u0014\u0001\u0000\u0000\u0000VW\u0005+\u0000"+
		"\u0000W\u0016\u0001\u0000\u0000\u0000XY\u0005-\u0000\u0000Y\u0018\u0001"+
		"\u0000\u0000\u0000Z[\u0005*\u0000\u0000[\u001a\u0001\u0000\u0000\u0000"+
		"\\]\u0005/\u0000\u0000]\u001c\u0001\u0000\u0000\u0000^_\u0005>\u0000\u0000"+
		"_\u001e\u0001\u0000\u0000\u0000`a\u0005<\u0000\u0000a \u0001\u0000\u0000"+
		"\u0000bc\u0005=\u0000\u0000c\"\u0001\u0000\u0000\u0000de\u0005.\u0000"+
		"\u0000e$\u0001\u0000\u0000\u0000fg\u0005^\u0000\u0000g&\u0001\u0000\u0000"+
		"\u0000hi\u0005=\u0000\u0000ij\u0005>\u0000\u0000j(\u0001\u0000\u0000\u0000"+
		"km\u0007\u0002\u0000\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pq\u0006\u0014\u0000\u0000q*\u0001\u0000\u0000\u0000\t\u0000"+
		"18<AGINn\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}