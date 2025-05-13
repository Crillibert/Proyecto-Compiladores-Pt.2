// Generated from com\antlr4\Algebra.g4 by ANTLR 4.9.3
package com.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgebraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUMERO_ENTERO=2, NUMERO_REAL=3, ID=4, TIPODDATO=5, OP_LOGICO=6, 
		OP_RACIONALES=7, OP_ARITMETICO=8, OP_DEC_INC=9, RES_CONTROL=10, RES_CICLOS=11, 
		RES_FUN=12, LCOR=13, RCOR=14, ASSIGN=15, WS=16;
	public static final int
		RULE_programa = 0, RULE_declaracion = 1, RULE_asignacion = 2, RULE_expresion = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracion", "asignacion", "expresion"
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

	@Override
	public String getGrammarFileName() { return "Algebra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgebraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AlgebraParser.EOF, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO_ENTERO) | (1L << NUMERO_REAL) | (1L << ID) | (1L << TIPODDATO) | (1L << LCOR))) != 0)) {
				{
				setState(11);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(8);
					asignacion();
					}
					break;
				case 2:
					{
					setState(9);
					expresion(0);
					}
					break;
				case 3:
					{
					setState(10);
					declaracion();
					}
					break;
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode TIPODDATO() { return getToken(AlgebraParser.TIPODDATO, 0); }
		public TerminalNode ID() { return getToken(AlgebraParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AlgebraParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(TIPODDATO);
			setState(19);
			match(ID);
			setState(20);
			match(ASSIGN);
			setState(21);
			expresion(0);
			setState(22);
			match(T__0);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AlgebraParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AlgebraParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(ID);
			setState(25);
			match(ASSIGN);
			setState(26);
			expresion(0);
			setState(27);
			match(T__0);
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

	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode LCOR() { return getToken(AlgebraParser.LCOR, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode RCOR() { return getToken(AlgebraParser.RCOR, 0); }
		public TerminalNode NUMERO_ENTERO() { return getToken(AlgebraParser.NUMERO_ENTERO, 0); }
		public TerminalNode NUMERO_REAL() { return getToken(AlgebraParser.NUMERO_REAL, 0); }
		public TerminalNode ID() { return getToken(AlgebraParser.ID, 0); }
		public TerminalNode OP_ARITMETICO() { return getToken(AlgebraParser.OP_ARITMETICO, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraListener ) ((AlgebraListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCOR:
				{
				setState(30);
				match(LCOR);
				setState(31);
				expresion(0);
				setState(32);
				match(RCOR);
				}
				break;
			case NUMERO_ENTERO:
				{
				setState(34);
				match(NUMERO_ENTERO);
				}
				break;
			case NUMERO_REAL:
				{
				setState(35);
				match(NUMERO_REAL);
				}
				break;
			case ID:
				{
				setState(36);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion);
					setState(39);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(40);
					match(OP_ARITMETICO);
					setState(41);
					expresion(5);
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		case 3:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5(\n\5\3\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\3\5\2\3\b\6\2\4\6"+
		"\b\2\2\2\64\2\17\3\2\2\2\4\24\3\2\2\2\6\32\3\2\2\2\b\'\3\2\2\2\n\16\5"+
		"\6\4\2\13\16\5\b\5\2\f\16\5\4\3\2\r\n\3\2\2\2\r\13\3\2\2\2\r\f\3\2\2\2"+
		"\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2"+
		"\22\23\7\2\2\3\23\3\3\2\2\2\24\25\7\7\2\2\25\26\7\6\2\2\26\27\7\21\2\2"+
		"\27\30\5\b\5\2\30\31\7\3\2\2\31\5\3\2\2\2\32\33\7\6\2\2\33\34\7\21\2\2"+
		"\34\35\5\b\5\2\35\36\7\3\2\2\36\7\3\2\2\2\37 \b\5\1\2 !\7\17\2\2!\"\5"+
		"\b\5\2\"#\7\20\2\2#(\3\2\2\2$(\7\4\2\2%(\7\5\2\2&(\7\6\2\2\'\37\3\2\2"+
		"\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(.\3\2\2\2)*\f\6\2\2*+\7\n\2\2+-\5"+
		"\b\5\7,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\t\3\2\2\2\60.\3\2\2"+
		"\2\6\r\17\'.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}