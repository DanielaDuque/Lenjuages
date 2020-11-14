// Generated from C:/Users/torr111838/Documents/estudio/languages/Programing_lenguages/Analizador_semantico/grammar\Bcc_grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Bcc_grammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		End=1, Print=2, Input=3, When=4, If=5, Unless=6, While=7, Return=8, Until=9, 
		Loop=10, Do=11, Else=12, Repeat=13, For=14, Next=15, Break=16, Not=17, 
		And=18, Or=19, Var=20, Function=21, Tk_type=22, Tk_bool=23, Tk_num=24, 
		ID=25, FID=26, Tk_diferente=27, Tk_mod=28, Tk_mod_asig=29, Tk_par_izq=30, 
		Tk_par_der=31, Tk_mul=32, Tk_mul_asig=33, Tk_mas=34, Tk_incremento=35, 
		Tk_sum_asig=36, Tk_coma=37, Tk_menos=38, Tk_decremento=39, Tk_res_asig=40, 
		Tk_div=41, Tk_div_asig=42, Tk_dospuntos=43, Tk_asignacion=44, Tk_puntoycoma=45, 
		Tk_menor=46, Tk_menor_igual=47, Tk_igualdad=48, Tk_mayor=49, Tk_mayor_igual=50, 
		Tk_llave_izq=51, Tk_llave_der=52, ESP=53, Directive=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"End", "Print", "Input", "When", "If", "Unless", "While", "Return", "Until", 
			"Loop", "Do", "Else", "Repeat", "For", "Next", "Break", "Not", "And", 
			"Or", "Var", "Function", "Tk_type", "Tk_bool", "Tk_num", "ID", "FID", 
			"Tk_diferente", "Tk_mod", "Tk_mod_asig", "Tk_par_izq", "Tk_par_der", 
			"Tk_mul", "Tk_mul_asig", "Tk_mas", "Tk_incremento", "Tk_sum_asig", "Tk_coma", 
			"Tk_menos", "Tk_decremento", "Tk_res_asig", "Tk_div", "Tk_div_asig", 
			"Tk_dospuntos", "Tk_asignacion", "Tk_puntoycoma", "Tk_menor", "Tk_menor_igual", 
			"Tk_igualdad", "Tk_mayor", "Tk_mayor_igual", "Tk_llave_izq", "Tk_llave_der", 
			"ESP", "Directive"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'end'", "'print'", "'input'", "'when'", "'if'", "'unless'", "'while'", 
			"'return'", "'until'", "'loop'", "'do'", "'else'", "'repeat'", "'for'", 
			"'next'", "'break'", "'not'", "'and'", "'or'", "'var'", "'function'", 
			null, null, null, null, null, "'!='", "'%'", "'%='", "'('", "')'", "'*'", 
			"'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'/'", "'/='", 
			"':'", "':='", "';'", "'<'", "'<='", "'=='", "'>'", "'>='", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "End", "Print", "Input", "When", "If", "Unless", "While", "Return", 
			"Until", "Loop", "Do", "Else", "Repeat", "For", "Next", "Break", "Not", 
			"And", "Or", "Var", "Function", "Tk_type", "Tk_bool", "Tk_num", "ID", 
			"FID", "Tk_diferente", "Tk_mod", "Tk_mod_asig", "Tk_par_izq", "Tk_par_der", 
			"Tk_mul", "Tk_mul_asig", "Tk_mas", "Tk_incremento", "Tk_sum_asig", "Tk_coma", 
			"Tk_menos", "Tk_decremento", "Tk_res_asig", "Tk_div", "Tk_div_asig", 
			"Tk_dospuntos", "Tk_asignacion", "Tk_puntoycoma", "Tk_menor", "Tk_menor_igual", 
			"Tk_igualdad", "Tk_mayor", "Tk_mayor_igual", "Tk_llave_izq", "Tk_llave_der", 
			"ESP", "Directive"
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


	public Bcc_grammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bcc_grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u015d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u00e4\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00ef"+
		"\n\30\3\31\6\31\u00f2\n\31\r\31\16\31\u00f3\3\31\3\31\3\31\6\31\u00f9"+
		"\n\31\r\31\16\31\u00fa\5\31\u00fd\n\31\3\32\3\32\7\32\u0101\n\32\f\32"+
		"\16\32\u0104\13\32\3\33\3\33\3\33\7\33\u0109\n\33\f\33\16\33\u010c\13"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3"+
		"*\3+\3+\3+\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\6\66\u014f\n\66\r\66"+
		"\16\66\u0150\3\66\3\66\3\67\3\67\7\67\u0157\n\67\f\67\16\67\u015a\13\67"+
		"\3\67\3\67\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8\3\2\t\3\2\62;\3\2\60\60\4\2C\\c|\6\2\62;C\\aac|\3\2BB\5"+
		"\2\13\f\17\17\"\"\3\2\f\f\2\u0165\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5s\3\2\2\2\7y\3\2\2\2\t"+
		"\177\3\2\2\2\13\u0084\3\2\2\2\r\u0087\3\2\2\2\17\u008e\3\2\2\2\21\u0094"+
		"\3\2\2\2\23\u009b\3\2\2\2\25\u00a1\3\2\2\2\27\u00a6\3\2\2\2\31\u00a9\3"+
		"\2\2\2\33\u00ae\3\2\2\2\35\u00b5\3\2\2\2\37\u00b9\3\2\2\2!\u00be\3\2\2"+
		"\2#\u00c4\3\2\2\2%\u00c8\3\2\2\2\'\u00cc\3\2\2\2)\u00cf\3\2\2\2+\u00d3"+
		"\3\2\2\2-\u00e3\3\2\2\2/\u00ee\3\2\2\2\61\u00f1\3\2\2\2\63\u00fe\3\2\2"+
		"\2\65\u0105\3\2\2\2\67\u010d\3\2\2\29\u0110\3\2\2\2;\u0112\3\2\2\2=\u0115"+
		"\3\2\2\2?\u0117\3\2\2\2A\u0119\3\2\2\2C\u011b\3\2\2\2E\u011e\3\2\2\2G"+
		"\u0120\3\2\2\2I\u0123\3\2\2\2K\u0126\3\2\2\2M\u0128\3\2\2\2O\u012a\3\2"+
		"\2\2Q\u012d\3\2\2\2S\u0130\3\2\2\2U\u0132\3\2\2\2W\u0135\3\2\2\2Y\u0137"+
		"\3\2\2\2[\u013a\3\2\2\2]\u013c\3\2\2\2_\u013e\3\2\2\2a\u0141\3\2\2\2c"+
		"\u0144\3\2\2\2e\u0146\3\2\2\2g\u0149\3\2\2\2i\u014b\3\2\2\2k\u014e\3\2"+
		"\2\2m\u0154\3\2\2\2op\7g\2\2pq\7p\2\2qr\7f\2\2r\4\3\2\2\2st\7r\2\2tu\7"+
		"t\2\2uv\7k\2\2vw\7p\2\2wx\7v\2\2x\6\3\2\2\2yz\7k\2\2z{\7p\2\2{|\7r\2\2"+
		"|}\7w\2\2}~\7v\2\2~\b\3\2\2\2\177\u0080\7y\2\2\u0080\u0081\7j\2\2\u0081"+
		"\u0082\7g\2\2\u0082\u0083\7p\2\2\u0083\n\3\2\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7h\2\2\u0086\f\3\2\2\2\u0087\u0088\7w\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7n\2\2\u008a\u008b\7g\2\2\u008b\u008c\7u\2\2\u008c\u008d\7u\2\2"+
		"\u008d\16\3\2\2\2\u008e\u008f\7y\2\2\u008f\u0090\7j\2\2\u0090\u0091\7"+
		"k\2\2\u0091\u0092\7n\2\2\u0092\u0093\7g\2\2\u0093\20\3\2\2\2\u0094\u0095"+
		"\7t\2\2\u0095\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097\u0098\7w\2\2\u0098"+
		"\u0099\7t\2\2\u0099\u009a\7p\2\2\u009a\22\3\2\2\2\u009b\u009c\7w\2\2\u009c"+
		"\u009d\7p\2\2\u009d\u009e\7v\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7n\2\2"+
		"\u00a0\24\3\2\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7"+
		"q\2\2\u00a4\u00a5\7r\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8"+
		"\7q\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac"+
		"\7u\2\2\u00ac\u00ad\7g\2\2\u00ad\32\3\2\2\2\u00ae\u00af\7t\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7c\2\2\u00b3"+
		"\u00b4\7v\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\u00b8\7t\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7z\2\2\u00bc\u00bd\7v\2\2\u00bd \3\2\2\2\u00be\u00bf\7d\2\2\u00bf"+
		"\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7m\2\2"+
		"\u00c3\"\3\2\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7v"+
		"\2\2\u00c7$\3\2\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb"+
		"\7f\2\2\u00cb&\3\2\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7t\2\2\u00ce(\3"+
		"\2\2\2\u00cf\u00d0\7x\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"*\3\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7p\2\2\u00d6"+
		"\u00d7\7e\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7q\2\2"+
		"\u00da\u00db\7p\2\2\u00db,\3\2\2\2\u00dc\u00dd\7d\2\2\u00dd\u00de\7q\2"+
		"\2\u00de\u00df\7q\2\2\u00df\u00e4\7n\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2"+
		"\7w\2\2\u00e2\u00e4\7o\2\2\u00e3\u00dc\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4"+
		".\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7w\2\2\u00e8"+
		"\u00ef\7g\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7n\2\2"+
		"\u00ec\u00ed\7u\2\2\u00ed\u00ef\7g\2\2\u00ee\u00e5\3\2\2\2\u00ee\u00e9"+
		"\3\2\2\2\u00ef\60\3\2\2\2\u00f0\u00f2\t\2\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00fc\3\2"+
		"\2\2\u00f5\u00fd\3\2\2\2\u00f6\u00f8\t\3\2\2\u00f7\u00f9\t\2\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fd"+
		"\62\3\2\2\2\u00fe\u0102\t\4\2\2\u00ff\u0101\t\5\2\2\u0100\u00ff\3\2\2"+
		"\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\64"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\t\6\2\2\u0106\u010a\t\4\2\2\u0107"+
		"\u0109\t\5\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\66\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e"+
		"\7#\2\2\u010e\u010f\7?\2\2\u010f8\3\2\2\2\u0110\u0111\7\'\2\2\u0111:\3"+
		"\2\2\2\u0112\u0113\7\'\2\2\u0113\u0114\7?\2\2\u0114<\3\2\2\2\u0115\u0116"+
		"\7*\2\2\u0116>\3\2\2\2\u0117\u0118\7+\2\2\u0118@\3\2\2\2\u0119\u011a\7"+
		",\2\2\u011aB\3\2\2\2\u011b\u011c\7,\2\2\u011c\u011d\7?\2\2\u011dD\3\2"+
		"\2\2\u011e\u011f\7-\2\2\u011fF\3\2\2\2\u0120\u0121\7-\2\2\u0121\u0122"+
		"\7-\2\2\u0122H\3\2\2\2\u0123\u0124\7-\2\2\u0124\u0125\7?\2\2\u0125J\3"+
		"\2\2\2\u0126\u0127\7.\2\2\u0127L\3\2\2\2\u0128\u0129\7/\2\2\u0129N\3\2"+
		"\2\2\u012a\u012b\7/\2\2\u012b\u012c\7/\2\2\u012cP\3\2\2\2\u012d\u012e"+
		"\7/\2\2\u012e\u012f\7?\2\2\u012fR\3\2\2\2\u0130\u0131\7\61\2\2\u0131T"+
		"\3\2\2\2\u0132\u0133\7\61\2\2\u0133\u0134\7?\2\2\u0134V\3\2\2\2\u0135"+
		"\u0136\7<\2\2\u0136X\3\2\2\2\u0137\u0138\7<\2\2\u0138\u0139\7?\2\2\u0139"+
		"Z\3\2\2\2\u013a\u013b\7=\2\2\u013b\\\3\2\2\2\u013c\u013d\7>\2\2\u013d"+
		"^\3\2\2\2\u013e\u013f\7>\2\2\u013f\u0140\7?\2\2\u0140`\3\2\2\2\u0141\u0142"+
		"\7?\2\2\u0142\u0143\7?\2\2\u0143b\3\2\2\2\u0144\u0145\7@\2\2\u0145d\3"+
		"\2\2\2\u0146\u0147\7@\2\2\u0147\u0148\7?\2\2\u0148f\3\2\2\2\u0149\u014a"+
		"\7}\2\2\u014ah\3\2\2\2\u014b\u014c\7\177\2\2\u014cj\3\2\2\2\u014d\u014f"+
		"\t\7\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\b\66\2\2\u0153l\3\2\2\2"+
		"\u0154\u0158\7%\2\2\u0155\u0157\n\b\2\2\u0156\u0155\3\2\2\2\u0157\u015a"+
		"\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015b\u015c\b\67\3\2\u015cn\3\2\2\2\f\2\u00e3\u00ee\u00f3"+
		"\u00fa\u00fc\u0102\u010a\u0150\u0158\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}