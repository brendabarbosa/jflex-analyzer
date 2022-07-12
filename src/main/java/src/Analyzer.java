// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/main/java/src/scanner.lex

package src;

import java.util.*;
import Command.java;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Analyzer {

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
    "\1\0\5\u0100\1\u0200\1\u0300\1\u0100\5\u0400\1\u0500\1\u0600"+
    "\1\u0700\6\u0100\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00"+
    "\3\u0100\1\u0e00\205\u0100\1\u0600\1\u0100\1\u0f00\1\u1000\1\u1100"+
    "\1\u1200\54\u0100\10\u1300\37\u0100\1\u0900\4\u0100\1\u1400\10\u0100"+
    "\1\u1500\2\u0100\1\u1600\1\u1700\1\u1200\1\u0100\1\u0500\1\u0100"+
    "\1\u1800\1\u1500\1\u0800\3\u0100\1\u1100\1\u1900\114\u0100\1\u1a00"+
    "\1\u1100\153\u0100\1\u1b00\11\u0100\1\u1c00\1\u1200\6\u0100\1\u1100"+
    "\u0f16\u0100";

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
    "\11\0\1\1\1\2\1\3\2\2\22\0\1\1\1\4"+
    "\1\5\5\0\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\0\1\14\12\15\1\16\1\17\1\20\1\21\1\20"+
    "\2\0\32\22\1\23\1\0\1\24\1\0\1\25\1\0"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\22\1\34"+
    "\1\35\1\22\1\36\1\37\1\22\1\40\1\41\2\22"+
    "\1\42\1\43\1\44\1\45\1\22\1\46\3\22\1\47"+
    "\1\0\1\50\7\0\1\3\u01da\0\12\51\206\0\12\51"+
    "\306\0\12\51\234\0\12\51\166\0\12\51\140\0\12\51"+
    "\166\0\12\51\106\0\12\51\u0116\0\12\51\106\0\12\51"+
    "\u0146\0\12\51\46\0\12\51\u012c\0\12\51\200\0\12\51"+
    "\246\0\12\51\6\0\12\51\266\0\12\51\126\0\12\51"+
    "\206\0\12\51\6\0\12\51\316\0\2\3\u01a6\0\12\51"+
    "\46\0\12\51\306\0\12\51\26\0\12\51\126\0\12\51"+
    "\u0196\0\12\51\6\0\u0100\3\240\0\12\51\206\0\12\51"+
    "\u012c\0\12\51\200\0\12\51\74\0\12\51\220\0\12\51"+
    "\166\0\12\51\146\0\12\51\206\0\12\51\106\0\12\51"+
    "\266\0\12\51\u0164\0\62\51\100\0\12\51\266\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[7424];
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
    "\1\0\1\1\1\2\5\1\47\0\1\3\110\0\1\4"+
    "\40\0\1\5\64\0\1\4\7\0\1\6\22\0\1\7"+
    "\33\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[261];
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
    "\0\0\0\52\0\52\0\124\0\176\0\250\0\322\0\374"+
    "\0\u0126\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\u024c"+
    "\0\u0276\0\u02a0\0\u02ca\0\u02f4\0\u031e\0\u0348\0\u0372\0\u039c"+
    "\0\u03c6\0\u03f0\0\u041a\0\u0444\0\u046e\0\u0498\0\u04c2\0\u04ec"+
    "\0\u0516\0\u0540\0\u056a\0\u0594\0\u05be\0\u05e8\0\u0612\0\u063c"+
    "\0\u0666\0\u0690\0\u06ba\0\u06e4\0\u070e\0\u0738\0\u0762\0\52"+
    "\0\u078c\0\u07b6\0\u07e0\0\u080a\0\u0834\0\u085e\0\u0888\0\u08b2"+
    "\0\u08dc\0\u0906\0\u0930\0\u095a\0\u0984\0\u09ae\0\u09d8\0\u0a02"+
    "\0\u0a2c\0\u0a56\0\u0a80\0\u0aaa\0\u0ad4\0\u0afe\0\u0b28\0\u0b52"+
    "\0\u0b7c\0\u0ba6\0\u0bd0\0\u0bfa\0\u0c24\0\u0c4e\0\u0c78\0\u0ca2"+
    "\0\u0ccc\0\u0cf6\0\u0d20\0\u0d4a\0\u0d74\0\u0d9e\0\u0dc8\0\u0df2"+
    "\0\u0e1c\0\u0e46\0\u0e70\0\u0e9a\0\u0ec4\0\u0eee\0\u0f18\0\u0f42"+
    "\0\u0f6c\0\u0f96\0\u0fc0\0\u0fea\0\u1014\0\u103e\0\u1068\0\u1092"+
    "\0\u10bc\0\u10e6\0\u1110\0\u113a\0\u1164\0\u118e\0\u11b8\0\u11e2"+
    "\0\u120c\0\u1236\0\u1260\0\u128a\0\u12b4\0\u12de\0\u1308\0\u1332"+
    "\0\u135c\0\u1386\0\u13b0\0\u13da\0\u1404\0\u142e\0\u1458\0\u1482"+
    "\0\u14ac\0\u14d6\0\u1500\0\u152a\0\u1554\0\u157e\0\u15a8\0\u15d2"+
    "\0\u15fc\0\u1626\0\u1650\0\u167a\0\u16a4\0\u16ce\0\u16f8\0\u1722"+
    "\0\u174c\0\u1776\0\u17a0\0\u17ca\0\u17f4\0\u181e\0\u1848\0\u1872"+
    "\0\u189c\0\u18c6\0\u18f0\0\u191a\0\u1944\0\u196e\0\u1998\0\u19c2"+
    "\0\u19ec\0\u1a16\0\u1a40\0\u1a6a\0\u1a94\0\u1abe\0\u1ae8\0\u1b12"+
    "\0\u1b3c\0\u1b66\0\u1b90\0\u1bba\0\u1be4\0\u1c0e\0\u1c38\0\u1c62"+
    "\0\u1c8c\0\u1cb6\0\u1ce0\0\u1d0a\0\u1d34\0\u1d5e\0\u1d88\0\u1db2"+
    "\0\u1ddc\0\u1e06\0\u1e30\0\u1e5a\0\u1e84\0\u1eae\0\u1ed8\0\u1f02"+
    "\0\u1f2c\0\u1f56\0\u1f80\0\u1faa\0\u1fd4\0\u1ffe\0\u2028\0\u2052"+
    "\0\u207c\0\u20a6\0\u20d0\0\u20fa\0\u2124\0\u214e\0\u2178\0\u21a2"+
    "\0\u21cc\0\u21f6\0\u2220\0\u224a\0\u2274\0\u229e\0\u22c8\0\u22f2"+
    "\0\u231c\0\u2346\0\u2370\0\u239a\0\u23c4\0\u23ee\0\u2418\0\u2442"+
    "\0\u246c\0\u2496\0\u24c0\0\u24ea\0\u2514\0\u253e\0\u2568\0\u2592"+
    "\0\u25bc\0\52\0\u25e6\0\u2610\0\u263a\0\u2664\0\u268e\0\u26b8"+
    "\0\u26e2\0\u270c\0\u2736\0\u2760\0\u278a\0\u27b4\0\u27de\0\u2808"+
    "\0\u2832\0\u285c\0\u2886\0\u28b0\0\u28da\0\u2904\0\u292e\0\u2958"+
    "\0\u2982\0\u29ac\0\u29d6\0\u2a00\0\u2a2a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[261];
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
    "\2\2\2\3\24\2\1\4\2\2\1\5\1\2\1\6"+
    "\5\2\1\7\2\2\1\10\3\2\106\0\1\11\54\0"+
    "\1\12\1\0\1\13\43\0\1\14\4\0\1\15\57\0"+
    "\1\16\37\0\1\17\43\0\1\20\64\0\1\21\52\0"+
    "\1\22\15\0\1\23\107\0\1\24\42\0\1\25\51\0"+
    "\1\26\56\0\1\24\35\0\1\15\24\0\2\22\3\0"+
    "\1\27\44\0\2\23\2\0\1\30\7\0\1\31\4\0"+
    "\1\32\3\0\21\32\4\0\2\33\113\0\1\34\44\0"+
    "\1\35\42\0\1\36\2\0\1\37\1\0\1\40\21\0"+
    "\1\41\7\0\1\30\4\0\1\30\2\0\22\30\4\0"+
    "\2\41\1\0\1\42\10\0\1\31\2\0\1\43\1\42"+
    "\31\0\2\41\1\0\1\42\10\0\1\32\2\0\1\43"+
    "\1\42\1\32\1\44\1\0\22\32\4\0\2\33\17\0"+
    "\1\45\3\0\21\45\33\0\1\46\53\0\1\47\53\0"+
    "\1\50\54\0\1\51\52\0\1\52\12\0\2\41\1\0"+
    "\1\42\13\0\1\43\1\42\51\0\1\53\31\0\2\53"+
    "\2\0\1\54\7\0\1\55\3\0\1\53\1\56\3\0"+
    "\21\56\20\0\1\57\33\0\1\57\12\0\1\33\2\0"+
    "\1\45\1\0\1\60\2\0\1\45\1\61\1\0\22\45"+
    "\37\0\1\62\16\0\2\47\3\0\1\63\71\0\1\64"+
    "\64\0\1\65\54\0\1\66\6\0\2\53\2\0\1\54"+
    "\7\0\1\55\4\0\1\56\3\0\21\56\10\0\1\67"+
    "\7\0\1\54\4\0\1\54\2\0\22\54\4\0\2\67"+
    "\4\0\1\70\5\0\1\55\35\0\2\67\4\0\1\70"+
    "\5\0\1\56\4\0\1\56\1\71\1\0\22\56\20\0"+
    "\1\57\6\0\1\41\24\0\1\57\15\0\1\72\33\0"+
    "\1\72\1\0\2\62\3\0\1\73\44\0\2\63\2\0"+
    "\1\74\7\0\1\75\4\0\1\76\3\0\21\76\45\0"+
    "\1\66\35\0\1\52\24\0\2\77\50\0\2\67\4\0"+
    "\1\70\43\0\2\70\44\0\1\100\17\0\1\101\33\0"+
    "\1\101\15\0\1\72\6\0\1\102\24\0\1\72\1\0"+
    "\2\73\17\0\1\103\3\0\21\103\10\0\1\104\7\0"+
    "\1\74\4\0\1\74\2\0\22\74\4\0\2\104\1\0"+
    "\1\105\10\0\1\75\2\0\1\106\1\105\31\0\2\104"+
    "\1\0\1\105\10\0\1\76\2\0\1\106\1\105\1\76"+
    "\1\107\1\0\22\76\4\0\2\77\17\0\1\110\3\0"+
    "\21\110\4\0\2\100\17\0\1\111\3\0\21\111\20\0"+
    "\1\101\6\0\1\67\24\0\1\101\12\0\1\33\4\0"+
    "\1\60\33\0\2\112\4\0\1\113\5\0\1\103\4\0"+
    "\1\103\1\114\1\0\22\103\4\0\2\104\1\0\1\105"+
    "\13\0\1\106\1\105\51\0\1\115\31\0\2\115\2\0"+
    "\1\116\7\0\1\117\3\0\1\115\1\120\3\0\21\120"+
    "\20\0\1\121\33\0\1\121\15\0\1\110\1\0\1\122"+
    "\2\0\1\110\1\123\1\0\22\110\4\0\2\124\5\0"+
    "\2\125\1\0\1\125\1\0\1\111\3\0\1\126\1\111"+
    "\1\127\1\0\22\111\4\0\2\112\4\0\1\113\43\0"+
    "\2\113\44\0\1\130\17\0\1\131\33\0\1\131\1\0"+
    "\2\115\2\0\1\116\7\0\1\117\4\0\1\120\3\0"+
    "\21\120\10\0\1\132\7\0\1\116\4\0\1\116\2\0"+
    "\22\116\4\0\2\132\4\0\1\133\5\0\1\117\35\0"+
    "\2\132\4\0\1\133\5\0\1\120\4\0\1\120\1\134"+
    "\1\0\22\120\20\0\1\121\6\0\1\104\24\0\1\121"+
    "\1\0\2\122\2\0\1\135\7\0\1\136\4\0\1\137"+
    "\3\0\21\137\20\0\1\140\33\0\1\140\1\0\2\124"+
    "\5\0\2\125\1\0\1\125\5\0\1\126\51\0\1\126"+
    "\31\0\2\126\12\0\1\141\4\0\1\142\3\0\21\142"+
    "\20\0\1\143\33\0\1\143\1\0\2\130\25\0\1\144"+
    "\36\0\1\131\6\0\1\112\24\0\1\131\1\0\2\132"+
    "\4\0\1\133\43\0\2\133\44\0\1\145\17\0\1\146"+
    "\33\0\1\146\5\0\1\147\7\0\1\135\4\0\1\135"+
    "\2\0\22\135\4\0\2\147\1\0\1\150\10\0\1\136"+
    "\2\0\1\151\1\150\31\0\2\147\1\0\1\150\10\0"+
    "\1\137\2\0\1\151\1\150\1\137\1\152\1\0\22\137"+
    "\20\0\1\140\6\0\1\153\24\0\1\140\1\0\2\154"+
    "\5\0\2\155\1\0\2\155\1\141\1\0\1\156\33\0"+
    "\2\154\5\0\2\155\1\0\2\155\1\142\1\0\1\156"+
    "\2\0\1\142\1\157\1\0\22\142\20\0\1\143\6\0"+
    "\1\124\24\0\1\143\26\0\1\160\24\0\2\145\17\0"+
    "\1\161\3\0\21\161\20\0\1\146\6\0\1\132\24\0"+
    "\1\146\1\0\2\147\1\0\1\150\13\0\1\151\1\150"+
    "\51\0\1\162\31\0\2\162\2\0\1\163\7\0\1\164"+
    "\3\0\1\162\1\165\3\0\21\165\20\0\1\166\33\0"+
    "\1\166\17\0\1\122\33\0\2\154\5\0\2\155\1\0"+
    "\2\155\2\0\1\156\33\0\2\155\12\0\1\167\4\0"+
    "\1\170\3\0\21\170\4\0\2\156\17\0\1\111\3\0"+
    "\21\111\1\0\1\171\16\0\1\172\33\0\1\172\43\0"+
    "\1\173\7\0\2\174\5\0\2\175\1\0\1\175\1\0"+
    "\1\161\3\0\1\176\1\161\1\177\1\0\22\161\4\0"+
    "\2\162\2\0\1\163\7\0\1\164\4\0\1\165\3\0"+
    "\21\165\10\0\1\200\7\0\1\163\4\0\1\163\2\0"+
    "\22\163\4\0\2\200\12\0\1\164\1\0\1\201\33\0"+
    "\2\200\12\0\1\165\1\0\1\201\2\0\1\165\1\202"+
    "\1\0\22\165\20\0\1\166\6\0\1\147\24\0\1\166"+
    "\1\0\2\203\12\0\1\167\1\0\1\156\33\0\2\203"+
    "\12\0\1\170\1\0\1\156\2\0\1\170\1\204\1\0"+
    "\22\170\4\0\2\171\27\0\1\205\34\0\1\172\6\0"+
    "\1\154\24\0\1\172\32\0\1\206\20\0\2\174\5\0"+
    "\2\175\1\0\1\175\5\0\1\176\51\0\1\176\31\0"+
    "\2\176\12\0\1\207\4\0\1\210\3\0\21\210\20\0"+
    "\1\211\33\0\1\211\1\0\2\200\14\0\1\201\33\0"+
    "\2\201\17\0\1\212\3\0\21\212\20\0\1\213\33\0"+
    "\1\213\1\0\2\203\14\0\1\156\47\0\1\214\33\0"+
    "\1\214\37\0\1\215\13\0\2\216\50\0\2\217\5\0"+
    "\2\220\1\0\2\220\1\207\1\0\1\221\33\0\2\217"+
    "\5\0\2\220\1\0\2\220\1\210\1\0\1\221\2\0"+
    "\1\210\1\222\1\0\22\210\20\0\1\211\6\0\1\174"+
    "\24\0\1\211\11\0\1\223\1\0\1\224\1\0\1\212"+
    "\4\0\1\212\1\225\1\0\22\212\20\0\1\213\6\0"+
    "\1\200\24\0\1\213\15\0\1\214\6\0\1\203\24\0"+
    "\1\214\43\0\1\226\7\0\2\216\12\0\1\227\35\0"+
    "\2\217\5\0\2\220\1\0\2\220\2\0\1\221\33\0"+
    "\2\220\12\0\1\230\4\0\1\231\3\0\21\231\4\0"+
    "\2\221\17\0\1\161\3\0\21\161\1\0\1\232\16\0"+
    "\1\233\33\0\1\233\11\0\1\234\53\0\1\234\53\0"+
    "\1\235\33\0\1\235\32\0\1\236\20\0\2\237\12\0"+
    "\1\227\1\240\34\0\2\241\12\0\1\230\1\0\1\221"+
    "\33\0\2\241\12\0\1\231\1\0\1\221\2\0\1\231"+
    "\1\242\1\0\22\231\4\0\2\232\64\0\1\233\6\0"+
    "\1\217\24\0\1\233\7\0\1\243\57\0\1\235\6\0"+
    "\1\244\24\0\1\235\1\0\2\236\44\0\1\245\3\0"+
    "\2\237\13\0\1\240\34\0\2\240\44\0\1\246\3\0"+
    "\2\241\14\0\1\221\47\0\1\247\33\0\1\247\1\0"+
    "\2\243\44\0\1\250\13\0\1\223\1\0\1\224\37\0"+
    "\2\245\17\0\1\251\3\0\21\251\4\0\2\246\17\0"+
    "\1\252\3\0\21\252\20\0\1\247\6\0\1\241\24\0"+
    "\1\247\1\0\2\250\17\0\1\253\3\0\21\253\4\0"+
    "\2\254\5\0\2\255\1\0\1\255\1\0\1\251\3\0"+
    "\1\256\1\251\1\257\1\0\22\251\4\0\2\260\5\0"+
    "\2\261\1\0\1\261\1\0\1\252\3\0\1\262\1\252"+
    "\1\263\1\0\22\252\4\0\2\264\5\0\2\265\1\0"+
    "\1\265\1\0\1\253\3\0\1\266\1\253\1\267\1\0"+
    "\22\253\4\0\2\254\5\0\2\255\1\0\1\255\5\0"+
    "\1\256\51\0\1\256\31\0\2\256\12\0\1\270\4\0"+
    "\1\271\3\0\21\271\20\0\1\272\33\0\1\272\1\0"+
    "\2\260\5\0\2\261\1\0\1\261\5\0\1\262\51\0"+
    "\1\262\31\0\2\262\12\0\1\273\4\0\1\274\3\0"+
    "\21\274\20\0\1\275\33\0\1\275\1\0\2\264\5\0"+
    "\2\265\1\0\1\265\5\0\1\266\51\0\1\266\31\0"+
    "\2\266\12\0\1\276\4\0\1\277\3\0\21\277\20\0"+
    "\1\300\33\0\1\300\1\0\2\301\5\0\2\302\1\0"+
    "\2\302\1\270\1\0\1\303\33\0\2\301\5\0\2\302"+
    "\1\0\2\302\1\271\1\0\1\303\2\0\1\271\1\304"+
    "\1\0\22\271\20\0\1\272\6\0\1\254\24\0\1\272"+
    "\1\0\2\305\5\0\2\306\1\0\2\306\1\273\1\0"+
    "\1\307\33\0\2\305\5\0\2\306\1\0\2\306\1\274"+
    "\1\0\1\307\2\0\1\274\1\310\1\0\22\274\20\0"+
    "\1\275\6\0\1\260\24\0\1\275\1\0\2\311\5\0"+
    "\2\312\1\0\2\312\1\276\1\0\1\313\33\0\2\311"+
    "\5\0\2\312\1\0\2\312\1\277\1\0\1\313\2\0"+
    "\1\277\1\314\1\0\22\277\20\0\1\300\6\0\1\264"+
    "\24\0\1\300\1\0\2\301\5\0\2\302\1\0\2\302"+
    "\2\0\1\303\33\0\2\302\12\0\1\315\4\0\1\316"+
    "\3\0\21\316\4\0\2\303\17\0\1\251\3\0\21\251"+
    "\1\0\1\317\16\0\1\320\33\0\1\320\1\0\2\305"+
    "\5\0\2\306\1\0\2\306\2\0\1\307\33\0\2\306"+
    "\12\0\1\321\4\0\1\322\3\0\21\322\4\0\2\307"+
    "\17\0\1\252\3\0\1\252\1\323\17\252\20\0\1\324"+
    "\33\0\1\324\1\0\2\311\5\0\2\312\1\0\2\312"+
    "\2\0\1\313\33\0\2\312\12\0\1\325\4\0\1\326"+
    "\3\0\21\326\4\0\2\313\17\0\1\253\3\0\21\253"+
    "\1\0\1\327\16\0\1\330\33\0\1\330\1\0\2\331"+
    "\12\0\1\315\1\0\1\303\33\0\2\331\12\0\1\316"+
    "\1\0\1\303\2\0\1\316\1\332\1\0\22\316\4\0"+
    "\2\317\64\0\1\320\6\0\1\301\24\0\1\320\1\0"+
    "\2\333\12\0\1\321\1\0\1\307\33\0\2\333\12\0"+
    "\1\322\1\0\1\307\2\0\1\322\1\334\1\0\22\322"+
    "\4\0\2\260\5\0\2\261\1\0\1\261\1\0\1\252"+
    "\3\0\1\262\1\252\1\263\1\0\15\252\1\335\4\252"+
    "\20\0\1\324\6\0\1\305\24\0\1\324\1\0\2\336"+
    "\12\0\1\325\1\0\1\313\33\0\2\336\12\0\1\326"+
    "\1\0\1\313\2\0\1\326\1\337\1\0\22\326\4\0"+
    "\2\327\64\0\1\330\6\0\1\311\24\0\1\330\1\0"+
    "\2\331\14\0\1\303\47\0\1\340\33\0\1\340\1\0"+
    "\2\333\14\0\1\307\47\0\1\341\33\0\1\341\1\0"+
    "\2\260\5\0\2\261\1\0\1\261\1\0\1\252\3\0"+
    "\1\262\1\252\1\263\1\0\5\252\1\342\14\252\4\0"+
    "\2\336\14\0\1\313\47\0\1\343\33\0\1\343\15\0"+
    "\1\340\6\0\1\331\24\0\1\340\15\0\1\341\6\0"+
    "\1\333\24\0\1\341\1\0\2\260\5\0\2\261\1\0"+
    "\1\261\1\0\1\252\3\0\1\262\1\252\1\263\1\0"+
    "\1\252\1\344\20\252\20\0\1\343\6\0\1\336\24\0"+
    "\1\343\1\0\2\260\5\0\2\261\1\0\1\261\1\0"+
    "\1\252\3\0\1\262\1\252\1\263\1\0\11\252\1\345"+
    "\10\252\4\0\2\346\5\0\2\261\1\0\1\261\1\0"+
    "\1\252\1\0\1\347\1\0\1\262\1\252\1\263\1\0"+
    "\22\252\4\0\2\346\5\0\2\261\1\0\1\261\3\0"+
    "\1\347\1\0\1\262\31\0\2\347\45\0\1\350\2\0"+
    "\2\350\25\0\1\144\1\351\16\0\1\352\33\0\1\353"+
    "\52\0\1\354\44\0\1\355\70\0\1\356\43\0\1\357"+
    "\56\0\1\360\23\0\1\361\34\0\2\361\44\0\1\362"+
    "\3\0\2\362\17\0\1\363\3\0\21\363\4\0\2\364"+
    "\5\0\2\365\1\0\1\365\1\0\1\363\3\0\1\366"+
    "\1\363\1\367\1\0\22\363\4\0\2\364\5\0\2\365"+
    "\1\0\1\365\5\0\1\366\51\0\1\366\31\0\2\366"+
    "\12\0\1\370\4\0\1\371\3\0\21\371\20\0\1\372"+
    "\33\0\1\372\1\0\2\373\5\0\2\374\1\0\2\374"+
    "\1\370\1\0\1\375\33\0\2\373\5\0\2\374\1\0"+
    "\2\374\1\371\1\0\1\375\2\0\1\371\1\376\1\0"+
    "\22\371\20\0\1\372\6\0\1\364\24\0\1\372\1\0"+
    "\2\373\5\0\2\374\1\0\2\374\2\0\1\375\33\0"+
    "\2\374\12\0\1\377\4\0\1\u0100\3\0\21\u0100\4\0"+
    "\2\375\17\0\1\363\3\0\21\363\1\0\1\u0101\16\0"+
    "\1\u0102\33\0\1\u0102\1\0\2\u0103\12\0\1\377\1\0"+
    "\1\375\33\0\2\u0103\12\0\1\u0100\1\0\1\375\2\0"+
    "\1\u0100\1\u0104\1\0\22\u0100\4\0\2\u0101\25\0\1\144"+
    "\17\0\1\352\16\0\1\u0102\6\0\1\373\24\0\1\u0102"+
    "\1\0\2\u0103\14\0\1\375\47\0\1\u0105\33\0\1\u0105"+
    "\15\0\1\u0105\6\0\1\u0103\24\0\1\u0105";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10836];
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
    "\1\0\2\11\5\1\47\0\1\11\110\0\1\1\40\0"+
    "\1\1\64\0\1\1\7\0\1\1\22\0\1\11\33\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[261];
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
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
	ArrayList<Command> commands = new ArrayList<>();


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Analyzer(java.io.Reader in) {
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    

	commands.forEach(command -> System.out.println(" LINHA: "+command.getLine()+" - "+command.getType()));
	System.out.println("");
	commands.forEach(command -> System.out.println("\nLINHA: "+command.getLine()+" - "+command.getType()+"\n"+command.getText()));

    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
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
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
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
            zzDoEOF();
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { /* */
            }
            // fall through
          case 8: break;
          case 2:
            { System.out.print(yytext());
            }
            // fall through
          case 9: break;
          case 3:
            { commands.add(new Command(yyline,yytext(), "DECLARACAO"));
            }
            // fall through
          case 10: break;
          case 4:
            { commands.add(new Command(yyline,yytext(), "IF"));
            }
            // fall through
          case 11: break;
          case 5:
            { commands.add(new Command(yyline,yytext(), "WHILE"));
            }
            // fall through
          case 12: break;
          case 6:
            { commands.add(new Command(yyline,yytext(), "FOR"));
            }
            // fall through
          case 13: break;
          case 7:
            { commands.add(new Command(yyline,yytext(), "SWITCH"));
            }
            // fall through
          case 14: break;
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
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java Analyzer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Analyzer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Analyzer(reader);
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
