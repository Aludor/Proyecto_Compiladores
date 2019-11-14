/* The following code was generated by JFlex 1.7.0 */

package proyecto.compiladores;

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>src/Archivos/Codigo.jflex</tt>
 */
class CodigoFlex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
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
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\16\1\23\1\47\1\47\1\24\24\0\1\13\2\0\1\6"+
    "\2\0\1\3\1\4\1\2\1\7\1\14\1\10\1\15\1\1\1\20"+
    "\11\25\1\12\1\11\1\0\1\5\3\0\17\17\1\46\12\17\4\0"+
    "\1\21\1\0\1\30\1\41\1\26\1\37\1\32\3\22\1\36\2\22"+
    "\1\27\1\43\1\42\1\35\1\33\1\22\1\34\1\31\1\44\1\40"+
    "\1\45\4\22\12\0\1\47\u1fa2\0\1\47\1\47\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\2\23\1\21\11\22\1\20\1\24"+
    "\1\25\1\26\1\27\4\22\1\30\10\22\1\20\16\22"+
    "\1\20\3\22\1\30\11\22\1\20\12\22\1\20\10\22"+
    "\1\20\3\22\1\20\3\22\1\20\1\22\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[109];
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
    "\0\0\0\50\0\120\0\170\0\50\0\50\0\50\0\50"+
    "\0\50\0\50\0\50\0\50\0\50\0\50\0\50\0\50"+
    "\0\240\0\50\0\310\0\50\0\360\0\u0118\0\u0140\0\u0168"+
    "\0\u0190\0\u01b8\0\u01e0\0\u0208\0\u0230\0\u0258\0\u0280\0\u02a8"+
    "\0\50\0\50\0\50\0\50\0\u02d0\0\u02f8\0\u0320\0\u0348"+
    "\0\u0370\0\u0398\0\u03c0\0\u03e8\0\u0410\0\u0438\0\u0460\0\u0488"+
    "\0\u04b0\0\u04d8\0\u0500\0\u0528\0\u0550\0\u0578\0\u05a0\0\u05c8"+
    "\0\u05f0\0\u0618\0\u0640\0\u0668\0\u0690\0\u06b8\0\u06e0\0\u0708"+
    "\0\u0730\0\u0758\0\u0780\0\u07a8\0\310\0\u07d0\0\u07f8\0\u0820"+
    "\0\u0848\0\u0870\0\u0898\0\u08c0\0\u08e8\0\u0910\0\u0938\0\u0960"+
    "\0\u0988\0\u09b0\0\u09d8\0\u0a00\0\u0a28\0\u0a50\0\u0a78\0\u0aa0"+
    "\0\u0ac8\0\u0af0\0\u0b18\0\u0b40\0\u0b68\0\u0b90\0\u0bb8\0\u0be0"+
    "\0\u0c08\0\u0c30\0\u0c58\0\u0c80\0\u0ca8\0\u0cd0\0\u0cf8\0\u0d20"+
    "\0\u0d48\0\u0d70\0\u0d98\0\u0dc0\0\240";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[109];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\2\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\23\1\31\1\32\1\33\2\23\1\34\1\35\2\23"+
    "\1\36\1\37\2\23\1\40\1\41\51\0\1\42\1\43"+
    "\46\0\1\44\65\0\4\21\2\0\22\21\20\0\2\23"+
    "\1\0\1\23\2\0\22\23\24\0\1\24\44\0\1\26"+
    "\4\0\1\26\41\0\2\23\1\0\1\23\2\0\2\23"+
    "\1\45\1\46\4\23\1\47\11\23\20\0\2\23\1\0"+
    "\1\23\2\0\5\23\1\50\14\23\20\0\2\23\1\0"+
    "\1\23\2\0\11\23\1\51\10\23\20\0\2\23\1\0"+
    "\1\23\2\0\4\23\1\52\10\23\1\53\4\23\20\0"+
    "\2\23\1\0\1\23\2\0\7\23\1\54\3\23\1\55"+
    "\6\23\20\0\2\23\1\0\1\23\2\0\15\23\1\56"+
    "\4\23\20\0\2\23\1\0\1\23\2\0\5\23\1\57"+
    "\14\23\20\0\2\23\1\0\1\23\2\0\13\23\1\60"+
    "\6\23\20\0\2\23\1\0\1\23\2\0\5\23\1\61"+
    "\14\23\20\0\4\21\2\0\7\21\1\62\12\21\20\0"+
    "\2\23\1\0\1\23\2\0\3\23\1\63\16\23\20\0"+
    "\2\23\1\0\1\23\2\0\12\23\1\64\7\23\20\0"+
    "\2\23\1\0\1\23\2\0\15\23\1\65\4\23\20\0"+
    "\2\23\1\0\1\23\2\0\5\23\1\66\14\23\20\0"+
    "\2\23\1\0\1\23\2\0\15\23\1\67\4\23\20\0"+
    "\2\23\1\0\1\23\2\0\1\23\1\70\20\23\20\0"+
    "\2\23\1\0\1\23\2\0\17\23\1\71\2\23\20\0"+
    "\2\23\1\0\1\23\2\0\10\23\1\72\1\73\10\23"+
    "\20\0\2\23\1\0\1\23\2\0\14\23\1\74\5\23"+
    "\20\0\2\23\1\0\1\23\2\0\4\23\1\75\15\23"+
    "\20\0\2\23\1\0\1\23\2\0\20\23\1\76\1\23"+
    "\20\0\2\23\1\0\1\23\2\0\5\23\1\77\14\23"+
    "\20\0\2\23\1\0\1\23\2\0\17\23\1\100\2\23"+
    "\20\0\4\21\2\0\11\21\1\101\10\21\20\0\2\23"+
    "\1\0\1\23\2\0\4\23\1\102\15\23\20\0\2\23"+
    "\1\0\1\23\2\0\5\23\1\103\14\23\20\0\2\23"+
    "\1\0\1\23\2\0\4\23\1\104\15\23\20\0\2\23"+
    "\1\0\1\23\2\0\7\23\1\105\12\23\20\0\2\23"+
    "\1\0\1\23\2\0\10\23\1\105\11\23\20\0\2\23"+
    "\1\0\1\23\2\0\7\23\1\106\12\23\20\0\2\23"+
    "\1\0\1\23\2\0\5\23\1\107\2\23\1\110\11\23"+
    "\20\0\2\23\1\0\1\23\2\0\6\23\1\111\13\23"+
    "\20\0\2\23\1\0\1\23\2\0\20\23\1\112\1\23"+
    "\20\0\2\23\1\0\1\23\2\0\2\23\1\113\17\23"+
    "\20\0\2\23\1\0\1\23\2\0\17\23\1\114\2\23"+
    "\20\0\2\23\1\0\1\23\2\0\10\23\1\115\11\23"+
    "\20\0\2\23\1\0\1\23\2\0\20\23\1\67\1\23"+
    "\20\0\2\23\1\0\1\23\2\0\10\23\1\116\11\23"+
    "\20\0\4\21\2\0\15\21\1\117\4\21\20\0\2\23"+
    "\1\0\1\23\2\0\5\23\1\105\14\23\20\0\2\23"+
    "\1\0\1\23\2\0\15\23\1\120\4\23\20\0\2\23"+
    "\1\0\1\23\2\0\17\23\1\121\2\23\20\0\2\23"+
    "\1\0\1\23\2\0\11\23\1\122\10\23\20\0\2\23"+
    "\1\0\1\23\2\0\7\23\1\67\12\23\20\0\2\23"+
    "\1\0\1\23\2\0\15\23\1\123\4\23\20\0\2\23"+
    "\1\0\1\23\2\0\11\23\1\124\10\23\20\0\2\23"+
    "\1\0\1\23\2\0\3\23\1\125\16\23\20\0\2\23"+
    "\1\0\1\23\2\0\11\23\1\126\10\23\20\0\2\23"+
    "\1\0\1\23\2\0\3\23\1\127\16\23\20\0\2\23"+
    "\1\0\1\23\2\0\2\23\1\130\17\23\20\0\2\23"+
    "\1\0\1\23\2\0\12\23\1\131\7\23\20\0\4\21"+
    "\2\0\1\21\1\132\20\21\20\0\2\23\1\0\1\23"+
    "\2\0\3\23\1\105\16\23\20\0\2\23\1\0\1\23"+
    "\2\0\7\23\1\133\12\23\20\0\2\23\1\0\1\23"+
    "\2\0\14\23\1\134\5\23\20\0\2\23\1\0\1\23"+
    "\2\0\1\23\1\135\20\23\20\0\2\23\1\0\1\23"+
    "\2\0\5\23\1\136\14\23\20\0\2\23\1\0\1\23"+
    "\2\0\12\23\1\137\7\23\20\0\2\23\1\0\1\23"+
    "\2\0\1\23\1\140\20\23\20\0\2\23\1\0\1\23"+
    "\2\0\15\23\1\141\4\23\20\0\2\23\1\0\1\23"+
    "\2\0\20\23\1\50\1\23\20\0\2\23\1\0\1\23"+
    "\2\0\10\23\1\142\11\23\20\0\4\21\2\0\11\21"+
    "\1\143\10\21\20\0\2\23\1\0\1\23\2\0\13\23"+
    "\1\144\6\23\20\0\2\23\1\0\1\23\2\0\11\23"+
    "\1\66\10\23\20\0\2\23\1\0\1\23\2\0\5\23"+
    "\1\142\14\23\20\0\2\23\1\0\1\23\2\0\12\23"+
    "\1\145\7\23\20\0\2\23\1\0\1\23\2\0\3\23"+
    "\1\142\16\23\20\0\2\23\1\0\1\23\2\0\3\23"+
    "\1\142\4\23\1\142\11\23\20\0\2\23\1\0\1\23"+
    "\2\0\1\23\1\146\20\23\20\0\2\23\1\0\1\23"+
    "\2\0\4\23\1\105\15\23\20\0\4\21\2\0\6\21"+
    "\1\147\13\21\20\0\2\23\1\0\1\23\2\0\1\23"+
    "\1\150\20\23\20\0\2\23\1\0\1\23\2\0\3\23"+
    "\1\151\16\23\20\0\2\23\1\0\1\23\2\0\11\23"+
    "\1\152\10\23\20\0\4\21\2\0\3\21\1\153\16\21"+
    "\20\0\2\23\1\0\1\23\2\0\17\23\1\154\2\23"+
    "\20\0\2\23\1\0\1\23\2\0\12\23\1\135\7\23"+
    "\20\0\2\23\1\0\1\23\2\0\3\23\1\66\16\23"+
    "\20\0\4\21\2\0\2\21\1\155\17\21\20\0\2\23"+
    "\1\0\1\23\2\0\10\23\1\66\11\23\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3560];
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\14\11\1\1\1\11\1\1\1\11"+
    "\14\1\4\11\111\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[109];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CodigoFlex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 148) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
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
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

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
        // peek one character ahead if it is \n (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            } 
            // fall through
          case 25: break;
          case 2: 
            { System.out.println("Encontre un signo division " + yytext());
            } 
            // fall through
          case 26: break;
          case 3: 
            { System.out.println("Encontre un signo multiplicacion " + yytext());
            } 
            // fall through
          case 27: break;
          case 4: 
            { System.out.println("Encontre un parentesis izquierdo " + yytext());
            } 
            // fall through
          case 28: break;
          case 5: 
            { System.out.println("Encontre un parentesis derecho " + yytext());
            } 
            // fall through
          case 29: break;
          case 6: 
            { System.out.println("Encontre un signo igual " + yytext());
            } 
            // fall through
          case 30: break;
          case 7: 
            { System.out.println("Encontre un signo mod " + yytext());
            } 
            // fall through
          case 31: break;
          case 8: 
            { System.out.println("Encontre un signo mas " + yytext());
            } 
            // fall through
          case 32: break;
          case 9: 
            { System.out.println("Encontre un signo menos " + yytext());
            } 
            // fall through
          case 33: break;
          case 10: 
            { System.out.println("Encontre un signo punto y coma " + yytext());
            } 
            // fall through
          case 34: break;
          case 11: 
            { System.out.println("Encontre un signo dos puntos " + yytext());
            } 
            // fall through
          case 35: break;
          case 12: 
            { System.out.println("Encontre un signo comillas " + yytext());
            } 
            // fall through
          case 36: break;
          case 13: 
            { System.out.println("Encontre un signo coma " + yytext());
            } 
            // fall through
          case 37: break;
          case 14: 
            { System.out.println("Encontre un signo punto " + yytext());
            } 
            // fall through
          case 38: break;
          case 15: 
            { System.out.println("Encontre un signo tabulador" + yytext());
            } 
            // fall through
          case 39: break;
          case 16: 
            { System.out.println("Encontre un identificador de clase " + yytext());
            } 
            // fall through
          case 40: break;
          case 17: 
            { System.out.println("Encontre un numero " + yytext());
            } 
            // fall through
          case 41: break;
          case 18: 
            { System.out.println("Encontre una variable " + yytext());
            } 
            // fall through
          case 42: break;
          case 19: 
            { System.out.println("Encontre un fin de linea " + yytext());
            } 
            // fall through
          case 43: break;
          case 20: 
            { System.out.print(yytext());
            } 
            // fall through
          case 44: break;
          case 21: 
            { System.out.println("Encontre un comentario " + yytext());
            } 
            // fall through
          case 45: break;
          case 22: 
            { System.out.println("Encontre un inicio de comentario " + yytext());
            } 
            // fall through
          case 46: break;
          case 23: 
            { System.out.println("Encontre un fin de comentario " + yytext());
            } 
            // fall through
          case 47: break;
          case 24: 
            { System.out.println("Encontre una palabra reservada " + yytext());
            } 
            // fall through
          case 48: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java CodigoFlex [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        CodigoFlex scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new CodigoFlex(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
