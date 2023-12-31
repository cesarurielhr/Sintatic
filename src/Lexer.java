// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/Lexer.flex

import compilerTools.Token;
import java.util.ArrayList;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\4\1\5\22\0\1\1"+
    "\6\0\1\6\1\7\1\10\1\11\1\0\1\12\1\13"+
    "\1\14\1\15\1\16\11\17\1\20\1\21\1\0\1\22"+
    "\3\0\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\24\1\32\2\24\1\33\1\24\1\34\1\35\1\36"+
    "\2\24\1\37\1\40\2\24\1\41\3\24\1\42\1\0"+
    "\1\43\1\0\1\24\1\0\1\44\1\45\1\46\1\26"+
    "\1\47\1\50\1\31\1\51\1\52\1\53\1\24\1\54"+
    "\1\55\1\56\1\57\1\60\1\24\1\61\1\62\1\63"+
    "\1\64\1\65\1\41\1\24\1\66\1\24\1\67\1\70"+
    "\1\71\7\0\1\3\73\0\1\24\7\0\1\24\3\0"+
    "\1\24\3\0\1\24\1\0\1\24\6\0\1\24\1\0"+
    "\1\24\4\0\1\24\7\0\1\24\3\0\1\24\3\0"+
    "\1\24\1\0\1\24\6\0\1\24\1\0\1\24\u012b\0"+
    "\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\1\1\3\1\4\1\5\1\6"+
    "\2\1\2\6\1\1\1\7\1\10\17\11\1\12\1\13"+
    "\3\11\1\14\1\15\1\16\1\17\5\0\1\20\2\0"+
    "\1\2\1\0\1\21\3\11\1\22\5\11\1\23\14\11"+
    "\1\24\1\17\2\0\1\6\1\25\2\0\16\11\1\6"+
    "\2\0\1\26\1\0\1\2\1\11\1\27\6\11\1\30"+
    "\1\11\1\0\1\31\1\11\1\32\2\11\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\72\0\72\0\164\0\256\0\350\0\72\0\72"+
    "\0\u0122\0\u015c\0\u0196\0\u01d0\0\u020a\0\u0244\0\72\0\u027e"+
    "\0\u02b8\0\u02f2\0\u032c\0\u0366\0\u03a0\0\u03da\0\u0414\0\u044e"+
    "\0\u0488\0\u04c2\0\u04fc\0\u0536\0\u0570\0\u05aa\0\u05e4\0\72"+
    "\0\72\0\u061e\0\u0658\0\u0692\0\72\0\72\0\72\0\u06cc"+
    "\0\u0706\0\u0740\0\u077a\0\u07b4\0\u07ee\0\u0828\0\u0862\0\u089c"+
    "\0\u08d6\0\u027e\0\72\0\u0910\0\u094a\0\u0984\0\u02f2\0\u09be"+
    "\0\u09f8\0\u0a32\0\u0a6c\0\u0aa6\0\u02f2\0\u0ae0\0\u0b1a\0\u0b54"+
    "\0\u0b8e\0\u0bc8\0\u0c02\0\u0c3c\0\u0c76\0\u0cb0\0\u0cea\0\u0d24"+
    "\0\u0d5e\0\72\0\u0d98\0\u0dd2\0\u0e0c\0\u0e46\0\72\0\u0e80"+
    "\0\u0eba\0\u0ef4\0\u0f2e\0\u0f68\0\u0fa2\0\u0fdc\0\u1016\0\u1050"+
    "\0\u108a\0\u10c4\0\u10fe\0\u1138\0\u1172\0\u11ac\0\u11e6\0\72"+
    "\0\u1220\0\u125a\0\u1294\0\u12ce\0\u0e80\0\u1308\0\u02f2\0\u1342"+
    "\0\u137c\0\u13b6\0\u13f0\0\u142a\0\u1464\0\u02f2\0\u149e\0\u14d8"+
    "\0\u02f2\0\u1512\0\u02f2\0\u154c\0\u1586\0\u15c0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\3\1\4\1\5\1\6\1\7"+
    "\1\2\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\21\1\22\1\42\1\25\1\26"+
    "\1\22\1\30\1\22\1\31\1\22\1\43\1\33\1\34"+
    "\1\22\1\35\1\44\3\22\1\45\1\46\1\47\74\0"+
    "\1\3\67\0\2\50\1\0\2\51\1\0\64\50\13\0"+
    "\1\52\72\0\1\53\1\0\1\54\1\55\3\0\17\56"+
    "\2\0\23\56\17\0\1\57\66\0\1\60\3\0\1\61"+
    "\70\0\1\53\6\0\17\56\2\0\23\56\17\0\1\53"+
    "\1\0\2\15\3\0\17\56\2\0\23\56\23\0\1\62"+
    "\73\0\1\63\65\0\2\22\3\0\17\22\2\0\15\22"+
    "\1\64\5\22\21\0\2\22\3\0\17\22\2\0\23\22"+
    "\21\0\2\22\3\0\17\22\2\0\10\22\1\65\2\22"+
    "\1\66\7\22\21\0\2\22\3\0\17\22\2\0\13\22"+
    "\1\67\7\22\21\0\2\22\3\0\17\22\2\0\10\22"+
    "\1\70\12\22\21\0\2\22\3\0\17\22\2\0\6\22"+
    "\1\71\4\22\1\72\7\22\21\0\2\22\3\0\17\22"+
    "\2\0\3\22\1\73\11\22\1\74\5\22\21\0\2\22"+
    "\3\0\17\22\2\0\4\22\1\75\16\22\21\0\2\22"+
    "\3\0\17\22\2\0\6\22\1\76\14\22\21\0\2\22"+
    "\3\0\15\22\1\77\1\22\2\0\23\22\21\0\2\22"+
    "\3\0\17\22\2\0\14\22\1\100\6\22\21\0\2\22"+
    "\3\0\17\22\2\0\6\22\1\101\6\22\1\102\2\22"+
    "\1\103\2\22\21\0\2\22\3\0\17\22\2\0\17\22"+
    "\1\104\3\22\21\0\2\22\3\0\17\22\2\0\3\22"+
    "\1\105\11\22\1\106\5\22\21\0\2\22\3\0\17\22"+
    "\2\0\5\22\1\107\15\22\21\0\2\22\3\0\17\22"+
    "\2\0\1\110\7\22\1\65\2\22\1\66\7\22\21\0"+
    "\2\22\3\0\17\22\2\0\17\22\1\77\3\22\21\0"+
    "\2\22\3\0\17\22\2\0\3\22\1\105\11\22\1\111"+
    "\5\22\4\0\2\51\1\0\2\51\1\112\14\0\17\113"+
    "\2\0\23\113\4\0\2\51\1\0\2\51\15\0\17\113"+
    "\2\0\23\113\16\0\1\114\2\0\2\114\70\0\2\115"+
    "\66\0\1\53\73\0\2\116\70\0\2\56\3\0\17\56"+
    "\2\0\23\56\17\0\1\117\55\0\11\120\1\121\60\120"+
    "\2\61\1\3\2\61\1\4\64\61\16\0\2\22\3\0"+
    "\17\22\2\0\15\22\1\122\5\22\21\0\2\22\3\0"+
    "\17\22\2\0\1\123\22\22\21\0\2\22\3\0\17\22"+
    "\2\0\12\22\1\124\10\22\21\0\2\22\3\0\17\22"+
    "\2\0\16\22\1\125\4\22\21\0\2\22\3\0\17\22"+
    "\2\0\12\22\1\67\10\22\21\0\2\22\3\0\17\22"+
    "\2\0\15\22\1\67\5\22\21\0\2\22\3\0\17\22"+
    "\2\0\17\22\1\67\3\22\21\0\2\22\3\0\17\22"+
    "\2\0\1\126\22\22\21\0\2\22\3\0\17\22\2\0"+
    "\16\22\1\73\4\22\21\0\2\22\3\0\17\22\2\0"+
    "\3\22\1\127\17\22\21\0\2\22\3\0\17\22\2\0"+
    "\17\22\1\130\3\22\21\0\2\22\3\0\17\22\2\0"+
    "\10\22\1\131\12\22\21\0\2\22\3\0\17\22\2\0"+
    "\6\22\1\132\14\22\21\0\2\22\3\0\17\22\2\0"+
    "\1\22\1\133\21\22\21\0\2\22\3\0\17\22\2\0"+
    "\1\134\22\22\21\0\2\22\3\0\17\22\2\0\15\22"+
    "\1\135\5\22\21\0\2\22\3\0\17\22\2\0\22\22"+
    "\1\67\21\0\2\22\3\0\17\22\2\0\6\22\1\136"+
    "\14\22\21\0\2\22\3\0\17\22\2\0\17\22\1\137"+
    "\3\22\21\0\2\22\3\0\17\22\2\0\3\22\1\125"+
    "\16\22\1\67\11\0\1\112\7\0\2\113\3\0\17\113"+
    "\2\0\23\113\13\0\1\140\2\0\1\114\2\0\2\114"+
    "\65\0\1\141\2\0\2\142\3\0\17\143\2\0\23\143"+
    "\17\0\1\53\2\0\1\55\3\0\17\56\2\0\23\56"+
    "\3\0\11\120\1\144\71\120\1\144\3\120\1\145\54\120"+
    "\16\0\2\22\3\0\17\22\2\0\1\106\22\22\21\0"+
    "\2\22\3\0\17\22\2\0\16\22\1\146\4\22\21\0"+
    "\2\22\3\0\17\22\2\0\7\22\1\147\13\22\21\0"+
    "\2\22\3\0\17\22\2\0\3\22\1\67\17\22\21\0"+
    "\2\22\3\0\17\22\2\0\11\22\1\150\11\22\21\0"+
    "\2\22\3\0\17\22\2\0\15\22\1\151\5\22\21\0"+
    "\2\22\3\0\17\22\2\0\6\22\1\152\14\22\21\0"+
    "\2\22\3\0\17\22\2\0\1\67\22\22\21\0\2\22"+
    "\3\0\17\22\2\0\12\22\1\153\6\22\1\154\1\22"+
    "\21\0\2\22\3\0\17\22\2\0\10\22\1\155\12\22"+
    "\21\0\2\22\3\0\17\22\2\0\17\22\1\155\3\22"+
    "\21\0\2\22\3\0\17\22\2\0\11\22\1\156\11\22"+
    "\21\0\2\22\3\0\17\22\2\0\10\22\1\125\12\22"+
    "\21\0\2\22\3\0\17\22\2\0\2\22\1\157\2\22"+
    "\1\67\15\22\17\0\1\53\1\0\1\54\1\160\65\0"+
    "\1\141\1\53\1\0\2\142\3\0\17\143\2\0\23\143"+
    "\21\0\2\143\3\0\17\143\2\0\23\143\3\0\11\120"+
    "\1\144\3\120\1\3\54\120\16\0\2\22\3\0\17\22"+
    "\2\0\16\22\1\67\4\22\21\0\2\22\3\0\17\22"+
    "\2\0\1\72\22\22\21\0\2\22\3\0\17\22\2\0"+
    "\11\22\1\161\11\22\21\0\2\22\3\0\17\22\2\0"+
    "\13\22\1\162\7\22\21\0\2\22\3\0\17\22\2\0"+
    "\17\22\1\163\3\22\21\0\2\22\3\0\17\22\2\0"+
    "\1\164\22\22\21\0\2\22\3\0\17\22\2\0\6\22"+
    "\1\165\14\22\21\0\2\22\3\0\17\22\2\0\5\22"+
    "\1\67\15\22\21\0\2\166\70\0\2\22\3\0\17\22"+
    "\2\0\12\22\1\146\10\22\21\0\2\22\3\0\17\22"+
    "\2\0\17\22\1\125\3\22\21\0\2\22\3\0\17\22"+
    "\2\0\2\22\1\67\20\22\17\0\1\53\2\0\1\160"+
    "\52\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5626];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\2\11\6\1\1\11\20\1\2\11"+
    "\3\1\3\11\1\1\5\0\1\1\2\0\1\1\1\0"+
    "\1\11\26\1\1\11\1\1\2\0\1\1\1\11\2\0"+
    "\16\1\1\11\2\0\1\1\1\0\13\1\1\0\5\1"+
    "\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }

    public ArrayList<ErrorTK> te = new ArrayList<>();
    
    public ArrayList<ErrorTK> getTablaError(){
        return te;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return token(yytext(), "ERROR", yyline, yycolumn);
            }
            // fall through
          case 27: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 28: break;
          case 3:
            { return token(yytext(), "Parentesis_Apertura", yyline, yycolumn);
            }
            // fall through
          case 29: break;
          case 4:
            { return token(yytext(), "Parentesis_Clausura", yyline, yycolumn);
            }
            // fall through
          case 30: break;
          case 5:
            { return token(yytext(), "COMA", yyline, yycolumn);
            }
            // fall through
          case 31: break;
          case 6:
            { return token(yytext(),"NÚMERO", yyline, yycolumn);
            }
            // fall through
          case 32: break;
          case 7:
            { return token(yytext(), "PUNTO_Y_COMA", yyline, yycolumn);
            }
            // fall through
          case 33: break;
          case 8:
            { return token(yytext(), "Igual", yyline, yycolumn);
            }
            // fall through
          case 34: break;
          case 9:
            { return token(yytext(),"INDENTIFICADOR", yyline, yycolumn);
            }
            // fall through
          case 35: break;
          case 10:
            { return token(yytext(), "Corchete_Apertura", yyline, yycolumn);
            }
            // fall through
          case 36: break;
          case 11:
            { return token(yytext(), "Corchete_Clausura", yyline, yycolumn);
            }
            // fall through
          case 37: break;
          case 12:
            { return token(yytext(), "Llave_Apertura", yyline, yycolumn);
            }
            // fall through
          case 38: break;
          case 13:
            { return token(yytext(), "OP_LOG_OR", yyline, yycolumn);
            }
            // fall through
          case 39: break;
          case 14:
            { return token(yytext(), "Llave_Clausura", yyline, yycolumn);
            }
            // fall through
          case 40: break;
          case 15:
            { te.add(new ErrorTK("Lexico", "Cadena Invalida", yyline+1, yycolumn+1)); return token(yytext(), "ERROR_CAD", yyline, yycolumn);
            }
            // fall through
          case 41: break;
          case 16:
            { te.add(new ErrorTK("Lexico", "Indentificador Invalido", yyline+1, yycolumn+1));return token(yytext(), "ERROR_ID", yyline, yycolumn);
            }
            // fall through
          case 42: break;
          case 17:
            { return token(yytext(), "Produccion", yyline, yycolumn);
            }
            // fall through
          case 43: break;
          case 18:
            { return token(yytext(), "PALABRA_RESERVADA", yyline, yycolumn);
            }
            // fall through
          case 44: break;
          case 19:
            { return token(yytext(),"PALABRA_RESERVADA",yyline,yycolumn);
            }
            // fall through
          case 45: break;
          case 20:
            { return token(yytext(), "CADENA_TEXTO", yyline, yycolumn);
            }
            // fall through
          case 46: break;
          case 21:
            { return token(yytext(), "Puntos_suspensivos", yyline, yycolumn);
            }
            // fall through
          case 47: break;
          case 22:
            { te.add(new ErrorTK("Lexico", "Numero Invalido", yyline+1, yycolumn+1)); return token(yytext(), "ERROR_NUM", yyline, yycolumn);
            }
            // fall through
          case 48: break;
          case 23:
            { return token(yytext(), "CONJUNTO", yyline, yycolumn);
            }
            // fall through
          case 49: break;
          case 24:
            { return token(yytext(), "TERMINAL", yyline, yycolumn);
            }
            // fall through
          case 50: break;
          case 25:
            { return token(yytext(), "NOTERMINAL", yyline, yycolumn);
            }
            // fall through
          case 51: break;
          case 26:
            { return token(yytext(), "PRINT", yyline, yycolumn);
            }
            // fall through
          case 52: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
