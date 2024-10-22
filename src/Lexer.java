// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/Lexer.flex

import compilerTools.Token;


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
    "\1\6\1\7\1\10\1\11\1\0\1\12\1\0\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\11\24\1\0\1\25\1\26\1\27\1\30\2\0\32\31"+
    "\1\0\1\32\2\0\1\31\1\0\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\31\1\41\1\42\1\31\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\31\1\51\1\52"+
    "\1\53\1\54\1\31\1\55\3\31\1\56\1\57\1\60"+
    "\7\0\1\3\73\0\1\31\7\0\1\31\3\0\1\31"+
    "\3\0\1\31\1\0\1\31\6\0\1\31\1\0\1\31"+
    "\4\0\1\31\7\0\1\31\3\0\1\31\3\0\1\31"+
    "\1\0\1\31\6\0\1\31\1\0\1\31\u012b\0\2\3"+
    "\326\0\u0100\3";

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
    "\1\0\1\1\2\2\1\3\4\1\1\4\1\5\2\6"+
    "\1\7\1\6\2\10\1\11\1\12\1\13\1\12\14\14"+
    "\1\15\1\1\1\16\1\0\1\17\1\0\1\20\1\21"+
    "\1\3\1\22\1\0\1\2\1\0\2\23\1\10\14\14"+
    "\1\24\4\14\1\0\1\25\1\0\1\23\4\14\1\0"+
    "\6\14\1\26\5\14\1\0\4\14\1\0\1\24\1\0"+
    "\5\14\1\27\1\30\2\14\1\31\2\14\3\0\1\14"+
    "\1\32\1\14\1\33\2\14\1\34\1\14\2\0\1\35"+
    "\4\14\1\0\1\24\2\14\1\36\1\26\5\14\1\33";

  private static int [] zzUnpackAction() {
    int [] result = new int[137];
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
    "\0\0\0\61\0\61\0\142\0\223\0\304\0\365\0\u0126"+
    "\0\u0157\0\61\0\61\0\61\0\u0188\0\61\0\u01b9\0\u01ea"+
    "\0\u021b\0\61\0\223\0\u024c\0\61\0\u027d\0\u02ae\0\u02df"+
    "\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405\0\u0436\0\u0467"+
    "\0\u0498\0\61\0\u04c9\0\61\0\304\0\61\0\u04fa\0\u052b"+
    "\0\u055c\0\61\0\u058d\0\u05be\0\u05ef\0\u0620\0\u0651\0\u0682"+
    "\0\u06b3\0\u06e4\0\u0715\0\u0746\0\u0777\0\u07a8\0\u07d9\0\u080a"+
    "\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u027d\0\u0930\0\u0961"+
    "\0\u0992\0\u09c3\0\u09f4\0\u0620\0\u0a25\0\u0a25\0\u0a56\0\u0a87"+
    "\0\u0ab8\0\u0ae9\0\u0b1a\0\u0b4b\0\u0b7c\0\u0bad\0\u0bde\0\u0c0f"+
    "\0\u0c40\0\u027d\0\u0c71\0\u0ca2\0\u0cd3\0\u0d04\0\u0d35\0\u0d66"+
    "\0\u0d97\0\u0dc8\0\u0df9\0\u0e2a\0\u0e5b\0\u0e8c\0\u0ebd\0\u0eee"+
    "\0\u0f1f\0\u0f50\0\u0f81\0\u0fb2\0\u027d\0\u027d\0\u0fe3\0\u1014"+
    "\0\u027d\0\u1045\0\u1076\0\u10a7\0\u10d8\0\u1109\0\u113a\0\u027d"+
    "\0\u116b\0\u119c\0\u11cd\0\u11fe\0\u027d\0\u122f\0\u1260\0\u1291"+
    "\0\61\0\u12c2\0\u12f3\0\u1324\0\u1355\0\u1386\0\61\0\u13b7"+
    "\0\u13e8\0\u027d\0\61\0\u1419\0\u144a\0\u147b\0\u14ac\0\u14dd"+
    "\0\u027d";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[137];
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
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\14"+
    "\1\2\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\2\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\2\26\1\36\2\26\1\37\2\26\1\40"+
    "\1\26\1\41\1\42\1\43\1\44\63\0\1\3\105\0"+
    "\1\25\31\0\7\45\1\46\22\45\1\47\26\45\31\0"+
    "\1\50\1\0\23\50\34\0\1\51\1\0\23\51\15\0"+
    "\1\52\77\0\1\53\1\0\23\53\20\0\1\54\4\0"+
    "\1\55\57\0\1\56\1\0\1\57\1\60\55\0\1\56"+
    "\1\0\2\61\63\0\2\25\53\0\2\26\4\0\1\26"+
    "\1\0\23\26\26\0\2\26\4\0\1\26\1\0\14\26"+
    "\1\62\1\26\1\63\4\26\26\0\2\26\4\0\1\26"+
    "\1\0\1\64\13\26\1\65\6\26\26\0\2\26\4\0"+
    "\1\26\1\0\14\26\1\66\6\26\26\0\2\26\4\0"+
    "\1\26\1\0\11\26\1\67\1\26\1\70\7\26\26\0"+
    "\2\26\4\0\1\26\1\0\1\71\6\26\1\72\1\26"+
    "\1\73\2\26\1\74\6\26\26\0\2\26\4\0\1\26"+
    "\1\0\1\75\22\26\26\0\2\26\4\0\1\26\1\0"+
    "\5\26\1\76\15\26\26\0\2\26\4\0\1\26\1\0"+
    "\14\26\1\77\6\26\26\0\2\26\4\0\1\26\1\0"+
    "\1\100\22\26\26\0\2\26\4\0\1\26\1\0\16\26"+
    "\1\101\4\26\26\0\2\26\4\0\1\26\1\0\6\26"+
    "\1\102\14\26\62\0\1\52\1\0\2\45\4\0\53\45"+
    "\23\0\2\50\4\0\1\50\1\0\23\50\26\0\2\51"+
    "\4\0\1\51\1\0\23\51\26\0\2\53\4\0\1\53"+
    "\1\0\23\53\3\0\15\54\1\103\43\54\2\55\1\3"+
    "\2\55\1\4\53\55\23\0\2\104\55\0\1\105\60\0"+
    "\1\105\1\0\2\106\57\0\2\61\57\0\2\26\4\0"+
    "\1\26\1\0\14\26\1\107\6\26\26\0\2\26\4\0"+
    "\1\26\1\0\4\26\1\110\16\26\26\0\2\26\4\0"+
    "\1\26\1\0\3\26\1\111\17\26\26\0\2\26\4\0"+
    "\1\26\1\0\13\26\1\112\7\26\23\0\1\113\2\0"+
    "\2\26\4\0\1\26\1\0\23\26\26\0\2\26\4\0"+
    "\1\26\1\0\17\26\1\114\3\26\26\0\2\26\4\0"+
    "\1\26\1\0\3\26\1\115\14\26\1\116\2\26\26\0"+
    "\2\26\4\0\1\26\1\0\11\26\1\117\11\26\26\0"+
    "\2\26\4\0\1\26\1\0\13\26\1\120\7\26\26\0"+
    "\2\26\4\0\1\26\1\0\14\26\1\121\6\26\26\0"+
    "\2\26\4\0\1\26\1\0\16\26\1\122\4\26\26\0"+
    "\2\26\4\0\1\26\1\0\2\26\1\123\20\26\26\0"+
    "\2\26\4\0\1\26\1\0\17\26\1\124\3\26\26\0"+
    "\2\26\4\0\1\26\1\0\16\26\1\125\4\26\26\0"+
    "\2\26\4\0\1\26\1\0\21\26\1\126\1\26\26\0"+
    "\2\26\4\0\1\26\1\0\7\26\1\127\13\26\3\0"+
    "\15\54\1\130\4\54\1\3\36\54\23\0\2\106\57\0"+
    "\2\26\4\0\1\26\1\0\11\26\1\131\11\26\26\0"+
    "\2\26\4\0\1\26\1\0\1\132\22\26\26\0\2\26"+
    "\4\0\1\26\1\0\4\26\1\133\16\26\26\0\2\26"+
    "\4\0\1\26\1\0\20\26\1\134\2\26\60\0\1\135"+
    "\26\0\2\26\4\0\1\26\1\0\4\26\1\136\16\26"+
    "\23\0\1\137\2\0\2\26\4\0\1\26\1\0\23\26"+
    "\26\0\2\26\4\0\1\26\1\0\4\26\1\140\16\26"+
    "\26\0\2\26\4\0\1\26\1\0\17\26\1\126\3\26"+
    "\26\0\2\26\4\0\1\26\1\0\1\141\22\26\26\0"+
    "\2\26\4\0\1\26\1\0\20\26\1\142\2\26\26\0"+
    "\2\26\4\0\1\26\1\0\4\26\1\143\16\26\26\0"+
    "\2\26\4\0\1\26\1\0\20\26\1\144\2\26\26\0"+
    "\2\26\4\0\1\26\1\0\1\145\22\26\26\0\2\26"+
    "\4\0\1\26\1\0\4\26\1\146\16\26\26\0\2\26"+
    "\4\0\1\26\1\0\11\26\1\147\11\26\3\0\15\54"+
    "\1\130\4\54\1\0\36\54\23\0\2\26\4\0\1\26"+
    "\1\0\4\26\1\150\16\26\26\0\2\26\4\0\1\26"+
    "\1\0\10\26\1\151\12\26\26\0\2\26\4\0\1\26"+
    "\1\0\13\26\1\152\7\26\26\0\2\26\4\0\1\26"+
    "\1\0\7\26\1\153\13\26\44\0\1\154\37\0\1\155"+
    "\2\0\2\26\4\0\1\26\1\0\23\26\45\0\1\156"+
    "\41\0\2\26\4\0\1\26\1\0\16\26\1\157\4\26"+
    "\26\0\2\26\4\0\1\26\1\0\11\26\1\160\11\26"+
    "\26\0\2\26\4\0\1\26\1\0\1\161\22\26\26\0"+
    "\2\26\4\0\1\26\1\0\16\26\1\162\4\26\26\0"+
    "\2\26\4\0\1\26\1\0\16\26\1\163\4\26\26\0"+
    "\2\26\4\0\1\26\1\0\4\26\1\122\16\26\26\0"+
    "\2\26\4\0\1\26\1\0\1\164\22\26\26\0\2\26"+
    "\4\0\1\26\1\0\1\165\22\26\26\0\2\26\4\0"+
    "\1\26\1\0\13\26\1\166\7\26\45\0\1\167\60\0"+
    "\1\170\56\0\1\171\43\0\2\26\4\0\1\26\1\0"+
    "\14\26\1\165\6\26\26\0\2\26\4\0\1\26\1\0"+
    "\13\26\1\172\7\26\26\0\2\26\4\0\1\26\1\0"+
    "\12\26\1\173\10\26\26\0\2\26\4\0\1\26\1\0"+
    "\1\174\22\26\26\0\2\26\4\0\1\26\1\0\13\26"+
    "\1\157\7\26\26\0\2\26\4\0\1\26\1\0\21\26"+
    "\1\175\1\26\47\0\1\176\54\0\1\177\43\0\2\26"+
    "\4\0\1\26\1\0\20\26\1\200\2\26\26\0\2\26"+
    "\4\0\1\26\1\0\7\26\1\201\13\26\26\0\2\26"+
    "\4\0\1\26\1\0\16\26\1\202\4\26\26\0\2\26"+
    "\4\0\1\26\1\0\4\26\1\151\16\26\42\0\1\203"+
    "\44\0\2\26\4\0\1\26\1\0\4\26\1\165\16\26"+
    "\26\0\2\26\4\0\1\26\1\0\4\26\1\204\16\26"+
    "\26\0\2\26\4\0\1\26\1\0\13\26\1\205\7\26"+
    "\26\0\2\26\4\0\1\26\1\0\20\26\1\206\2\26"+
    "\26\0\2\26\4\0\1\26\1\0\16\26\1\207\4\26"+
    "\26\0\2\26\4\0\1\26\1\0\1\210\22\26\26\0"+
    "\2\26\4\0\1\26\1\0\17\26\1\211\3\26\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5390];
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
    "\1\0\2\11\6\1\3\11\1\1\1\11\3\1\1\11"+
    "\2\1\1\11\14\1\1\11\1\1\1\11\1\0\1\11"+
    "\1\0\2\1\1\11\1\1\1\0\1\1\1\0\24\1"+
    "\1\0\1\1\1\0\5\1\1\0\14\1\1\0\4\1"+
    "\1\0\1\1\1\0\14\1\3\0\10\1\2\0\1\11"+
    "\4\1\1\0\1\11\3\1\1\11\6\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[137];
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
            { return token(yytext(), "ERROR_???", yyline, yycolumn);
            }
            // fall through
          case 31: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 32: break;
          case 3:
            { return token(yytext(), "OPERADOR_LOGICO", yyline, yycolumn);
            }
            // fall through
          case 33: break;
          case 4:
            { return token(yytext(), "PARENTESIS_APERTURA", yyline, yycolumn);
            }
            // fall through
          case 34: break;
          case 5:
            { return token(yytext(), "PARENTESIS_CIERRE", yyline, yycolumn);
            }
            // fall through
          case 35: break;
          case 6:
            { return token(yytext(), "OPERADOR_ARITMETICO", yyline, yycolumn);
            }
            // fall through
          case 36: break;
          case 7:
            { return token(yytext(), "COMA", yyline, yycolumn);
            }
            // fall through
          case 37: break;
          case 8:
            { return token(yytext(), "ENTERO", yyline, yycolumn);
            }
            // fall through
          case 38: break;
          case 9:
            { return token(yytext(), "PUNTO_Y_COMA", yyline, yycolumn);
            }
            // fall through
          case 39: break;
          case 10:
            { return token(yytext(), "COMPARADOR", yyline, yycolumn);
            }
            // fall through
          case 40: break;
          case 11:
            { return token(yytext(), "ASIGNACION", yyline, yycolumn);
            }
            // fall through
          case 41: break;
          case 12:
            { return token(yytext(), "ERROR_2", yyline, yycolumn);
            }
            // fall through
          case 42: break;
          case 13:
            { return token(yytext(), "LLAVE_APERTURA", yyline, yycolumn);
            }
            // fall through
          case 43: break;
          case 14:
            { return token(yytext(), "LLAVE_CIERRE", yyline, yycolumn);
            }
            // fall through
          case 44: break;
          case 15:
            { return token(yytext(), "CADENA", yyline, yycolumn);
            }
            // fall through
          case 45: break;
          case 16:
            { return token(yytext(), "VARIABLE", yyline, yycolumn);
            }
            // fall through
          case 46: break;
          case 17:
            { return token(yytext(), "FUNCION", yyline, yycolumn);
            }
            // fall through
          case 47: break;
          case 18:
            { return token(yytext(), "OBJETO", yyline, yycolumn);
            }
            // fall through
          case 48: break;
          case 19:
            { return token(yytext(), "ERROR_1", yyline, yycolumn);
            }
            // fall through
          case 49: break;
          case 20:
            { return token(yytext(), "CONDICIONAL", yyline, yycolumn);
            }
            // fall through
          case 50: break;
          case 21:
            { return token(yytext(), "FLOTANTE", yyline, yycolumn);
            }
            // fall through
          case 51: break;
          case 22:
            { return token(yytext(), "CICLO", yyline, yycolumn);
            }
            // fall through
          case 52: break;
          case 23:
            { return token(yytext(), "PARA", yyline, yycolumn);
            }
            // fall through
          case 53: break;
          case 24:
            { return token(yytext(), "BOOLEANO", yyline, yycolumn);
            }
            // fall through
          case 54: break;
          case 25:
            { return token(yytext(), "INSTRUCCION_CICLO", yyline, yycolumn);
            }
            // fall through
          case 55: break;
          case 26:
            { return token(yytext(), "FINAL", yyline, yycolumn);
            }
            // fall through
          case 56: break;
          case 27:
            { return token(yytext(), "HACER", yyline, yycolumn);
            }
            // fall through
          case 57: break;
          case 28:
            { return token(yytext(), "TIPO_DATO", yyline, yycolumn);
            }
            // fall through
          case 58: break;
          case 29:
            { return token(yytext(), "FIN_CONDICIONAL", yyline, yycolumn);
            }
            // fall through
          case 59: break;
          case 30:
            { return token(yytext(), "MOSTRAR", yyline, yycolumn);
            }
            // fall through
          case 60: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
