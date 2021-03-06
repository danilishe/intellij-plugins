/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

/* Generated code. Do not modify it. */
package com.intellij.lang.ognl.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import java.util.*;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

import com.intellij.psi.TokenType;
import com.intellij.lang.ognl.OgnlTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_OgnlLexer.flex</tt>
 */
public class _OgnlLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int NESTED_BRACE = 2;
  public static final int EXPR = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [13, 6, 2]
   * Total runtime size is 22752 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>8]<<6)|((ch>>2)&0x3f)]<<2)|(ch&0x3)];
  }

  /* The ZZ_CMAP_Z table has 4352 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\1\1\1\21\1\22\1\23\1\1\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\1\1\34"+
    "\1\35\1\36\12\37\1\40\1\41\1\42\1\37\1\43\1\44\2\37\31\1\1\45\121\1\1\46\4"+
    "\1\1\47\1\1\1\50\1\51\1\52\1\53\1\54\1\55\53\1\1\56\41\37\1\1\1\57\1\60\1"+
    "\1\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1"+
    "\77\1\100\3\37\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\37"+
    "\1\112\1\37\1\113\3\37\3\1\1\114\1\115\1\116\12\37\4\1\1\117\17\37\2\72\1"+
    "\120\41\37\2\1\1\121\1\122\3\37\1\123\27\72\1\124\2\72\1\125\45\37\1\126\13"+
    "\37\1\127\24\37\1\130\1\131\1\37\1\132\1\133\1\134\1\135\20\37\1\136\1\116"+
    "\4\37\1\137\21\37\246\1\1\140\20\1\1\141\1\142\25\72\1\143\51\37\2\1\1\144"+
    "\u0b05\37\1\145\1\146\u02fe\37");

  /* The ZZ_CMAP_Y table has 6592 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\2\0\1\1\1\2\3\0\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\3"+
    "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\10\0\1\32\1\33\1\34"+
    "\1\35\1\3\1\36\1\34\1\3\5\17\1\37\7\17\1\37\162\17\1\40\1\41\2\17\1\40\3\3"+
    "\1\17\1\42\1\3\1\43\4\3\34\0\1\17\1\44\1\41\1\45\1\3\1\34\1\37\1\44\4\17\1"+
    "\46\24\17\1\46\42\17\1\47\1\0\1\41\47\17\2\50\1\51\10\17\1\37\1\36\1\3\1\51"+
    "\11\17\1\3\1\52\1\53\12\0\1\54\1\55\1\54\2\3\6\17\1\37\1\3\1\37\3\3\1\0\1"+
    "\56\1\52\1\3\2\0\1\57\1\3\12\17\1\60\7\0\1\33\1\41\1\61\30\17\1\62\1\0\1\54"+
    "\1\0\1\63\1\64\1\65\2\0\1\65\1\66\3\3\1\52\1\67\7\17\6\0\1\57\1\51\25\17\1"+
    "\70\2\0\1\71\3\3\2\0\1\65\7\17\1\60\2\0\1\40\1\34\1\3\5\17\1\70\1\72\2\0\2"+
    "\73\1\33\4\3\6\17\1\73\21\3\1\74\2\17\1\75\1\50\1\76\1\50\1\77\11\3\6\0\1"+
    "\57\1\0\15\17\1\70\1\100\4\0\1\73\1\0\2\17\1\70\1\32\2\0\1\51\1\17\1\101\1"+
    "\17\1\102\1\51\1\17\2\66\5\17\1\44\1\17\1\43\1\41\1\40\1\100\1\0\2\103\1\104"+
    "\1\3\1\52\1\3\1\46\1\70\1\32\2\0\1\70\1\3\1\52\1\3\1\53\1\51\1\37\1\105\1"+
    "\66\5\17\1\44\1\17\1\44\1\106\1\40\1\64\1\57\1\52\1\103\1\33\1\35\1\3\1\51"+
    "\1\43\1\3\1\32\2\0\1\65\1\107\2\3\1\53\1\51\1\17\2\46\5\17\1\44\1\17\1\44"+
    "\1\51\1\40\1\100\1\0\2\54\1\33\1\42\3\3\1\70\1\32\2\0\1\35\1\3\1\110\1\3\1"+
    "\53\1\51\1\17\2\66\5\17\1\44\1\17\1\44\1\51\1\40\1\100\1\0\2\103\1\33\1\3"+
    "\1\32\1\3\1\46\1\70\1\32\2\0\1\36\3\3\1\111\1\51\1\37\1\41\1\44\1\40\1\106"+
    "\1\44\1\105\1\42\1\37\1\41\2\17\1\40\1\32\1\57\1\32\1\64\1\33\1\42\1\52\3"+
    "\3\1\32\2\0\2\3\1\35\1\3\1\53\1\51\1\17\2\44\5\17\1\44\2\17\1\101\1\40\1\62"+
    "\1\0\2\64\1\33\1\3\1\55\1\112\1\3\1\70\1\32\2\0\4\3\1\113\1\51\1\17\2\44\5"+
    "\17\1\44\2\17\1\51\1\40\1\100\1\0\2\64\1\33\1\3\1\55\1\3\1\34\1\70\1\32\2"+
    "\0\1\106\3\3\1\32\1\51\1\17\2\44\11\17\1\37\1\62\1\0\2\64\1\104\1\3\1\114"+
    "\1\3\1\115\1\70\1\32\2\0\2\3\1\41\1\17\1\32\1\51\3\17\1\37\1\41\5\17\1\46"+
    "\2\17\1\36\1\17\1\37\1\116\1\52\1\0\1\117\2\0\4\3\1\32\3\3\1\51\13\17\1\67"+
    "\1\0\1\57\1\52\1\17\1\60\1\0\1\57\2\0\1\33\11\3\1\106\1\66\1\43\1\36\1\3\1"+
    "\17\1\51\1\17\1\51\1\120\1\41\1\51\1\67\1\0\1\54\1\71\1\17\1\43\1\0\1\33\2"+
    "\0\1\33\1\17\10\3\1\42\5\3\1\33\1\3\2\0\1\33\2\3\1\121\1\35\1\32\2\17\1\51"+
    "\10\17\1\42\1\53\4\0\1\64\1\17\1\73\2\0\1\53\10\0\1\56\1\3\1\116\16\3\12\17"+
    "\1\60\4\0\1\122\2\0\1\33\1\3\1\17\1\70\1\65\1\70\1\100\1\63\1\0\1\65\1\73"+
    "\1\61\2\17\1\70\2\0\1\72\3\0\1\33\11\17\1\46\1\3\1\36\12\17\1\37\23\17\1\44"+
    "\1\40\1\17\1\37\1\44\1\40\12\17\1\44\1\40\10\17\1\44\1\40\1\17\1\37\1\44\1"+
    "\40\3\17\1\37\16\17\1\44\1\40\20\17\1\37\1\53\10\3\4\17\4\3\25\17\1\123\1"+
    "\50\1\77\1\51\132\17\1\66\4\17\1\51\5\17\1\37\1\3\22\17\1\37\1\32\1\124\1"+
    "\50\1\125\1\3\3\17\1\44\1\70\1\56\2\3\4\17\1\70\1\56\2\3\4\17\1\70\3\3\3\17"+
    "\1\44\1\126\3\3\15\17\10\0\1\105\1\52\1\107\2\0\1\33\7\3\1\52\1\33\2\0\1\33"+
    "\1\3\26\17\2\3\1\17\1\127\10\17\1\130\1\3\21\17\1\40\2\3\7\17\1\131\3\0\1"+
    "\3\3\0\2\3\1\32\2\0\7\17\1\40\1\17\1\42\2\3\13\17\1\3\6\17\1\40\1\3\2\0\1"+
    "\33\11\3\5\17\1\60\1\0\1\3\15\17\1\73\1\0\1\57\7\0\1\103\2\0\1\33\1\3\2\0"+
    "\1\33\2\3\1\105\26\3\1\0\1\61\13\17\4\0\1\61\1\17\1\3\2\0\1\33\3\3\1\52\2"+
    "\0\3\3\1\122\7\17\1\73\2\0\1\65\2\0\1\65\12\17\1\70\3\0\3\3\11\17\5\0\2\3"+
    "\2\0\1\33\1\51\2\0\1\65\10\17\1\40\2\50\1\125\21\3\1\57\5\0\1\61\1\67\1\70"+
    "\1\132\2\3\60\17\11\0\1\57\5\3\1\0\5\17\1\40\1\17\1\40\11\17\1\40\1\17\1\40"+
    "\2\17\2\120\7\17\1\40\15\17\1\44\1\17\1\43\1\41\1\44\1\17\1\42\1\17\1\41\1"+
    "\17\1\3\3\17\1\42\1\41\1\44\1\17\1\42\2\3\1\52\1\0\6\3\1\32\1\57\3\3\1\52"+
    "\1\56\4\3\1\56\2\3\1\0\1\56\1\32\1\0\1\36\2\3\1\105\4\3\3\17\1\42\6\0\1\57"+
    "\5\3\3\0\1\56\1\35\1\53\2\0\1\56\3\3\1\34\1\105\1\41\2\17\1\36\1\51\1\40\1"+
    "\3\1\43\1\44\1\46\2\17\1\40\1\17\1\3\1\51\1\40\1\34\4\3\10\0\1\122\1\73\1"+
    "\56\135\3\13\17\1\37\13\17\1\37\41\17\1\42\1\105\1\60\1\65\3\3\11\17\1\46"+
    "\1\3\1\36\16\17\1\3\1\105\3\3\1\52\5\17\1\37\2\3\1\17\1\37\1\17\1\37\1\17"+
    "\1\37\1\17\1\37\1\17\1\37\1\17\1\37\1\17\1\37\1\17\1\37\10\0\13\3\1\105\65"+
    "\3\1\133\6\3\1\53\3\0\1\51\1\40\1\122\1\42\1\51\24\17\1\37\1\55\2\51\25\17"+
    "\1\37\1\17\1\3\1\51\11\17\1\40\1\51\26\17\1\37\4\3\6\17\1\37\15\3\61\17\1"+
    "\40\22\3\63\17\1\75\1\50\1\77\12\3\43\17\1\42\20\3\13\17\1\40\3\17\1\42\4"+
    "\17\2\0\1\65\5\3\13\17\1\60\1\3\2\0\1\134\6\17\1\50\1\135\21\17\1\70\2\0\1"+
    "\33\10\3\1\105\2\17\1\41\31\17\1\66\1\136\1\17\3\50\2\17\1\136\1\137\2\50"+
    "\17\3\1\115\2\17\2\140\1\60\5\17\1\60\1\0\4\3\1\56\1\3\15\17\3\3\1\65\14\17"+
    "\4\0\1\56\2\3\2\0\1\33\1\3\4\0\1\65\1\17\1\105\1\110\2\0\1\65\6\17\1\70\1"+
    "\0\1\33\5\17\1\60\3\0\3\3\7\17\1\42\1\0\13\17\1\60\3\0\1\56\2\3\1\105\2\0"+
    "\1\33\1\3\1\50\1\76\2\50\2\3\1\141\1\137\12\17\1\73\2\0\1\57\2\3\1\60\2\17"+
    "\1\33\2\0\1\33\1\3\5\17\1\37\1\142\1\141\14\17\1\100\1\63\1\61\1\70\1\130"+
    "\5\3\1\105\1\40\2\17\1\60\1\0\1\41\1\143\2\3\1\51\1\37\1\51\1\37\1\51\1\37"+
    "\2\3\1\17\1\37\1\17\1\37\12\50\1\137\2\50\1\77\2\3\24\50\10\17\1\60\1\0\1"+
    "\57\1\33\2\0\1\33\1\3\51\17\3\3\5\17\1\37\1\105\14\17\1\3\33\17\1\40\32\17"+
    "\1\40\11\3\1\17\1\37\2\3\1\105\1\17\1\3\1\144\2\17\1\44\2\17\1\37\1\17\1\43"+
    "\1\46\1\44\32\17\1\40\7\3\1\105\32\17\1\40\4\3\20\17\1\41\15\17\12\3\3\17"+
    "\1\56\4\0\4\3\1\0\1\57\2\3\1\52\1\56\5\3\1\53\6\3\1\35\1\3\1\17\1\44\41\17"+
    "\1\145\1\3\1\56\2\3\2\0\1\33\1\3\1\51\5\17\1\37\1\52\1\51\5\17\1\37\2\3\1"+
    "\41\25\17\1\37\1\41\1\17\1\41\1\17\1\41\1\17\1\41\1\42\1\33\1\55\4\3\1\53"+
    "\1\3\3\17\1\51\5\17\1\37\4\17\1\37\1\46\3\17\1\40\3\17\1\40\10\3\36\17\1\37"+
    "\21\3\15\0\1\56\41\3\1\35\40\3\7\17\1\42\14\17\1\42\13\3\7\17\1\136\4\3\4"+
    "\17\1\67\1\17\1\146\1\3\11\50\1\77\2\3\7\17\1\40\11\17\1\3\2\17\1\53\1\33"+
    "\12\3\47\17\1\40\2\0\1\33\1\3\11\50\1\3\11\50\1\3\12\50\2\3\15\50\47\3\115"+
    "\50\1\137\2\3\5\50\1\77\2\3\2\50\46\3\1\17\1\40\1\44\12\17\1\46\1\42\1\66"+
    "\5\17\1\40\2\3\5\50\1\137\2\3\7\50\1\137\20\3\4\50\1\137\1\77\2\3\5\17\1\40"+
    "\2\3\6\17\1\40\21\3\16\17\1\3\1\41\20\3\1\73\1\55\1\3\1\0\1\17\2\51\6\17\1"+
    "\3\1\57\1\52\10\3\7\17\1\42\7\50\1\125\10\3\2\50\1\147\6\50\1\125\6\3\15\17"+
    "\1\40\2\3\5\17\1\40\2\3\4\17\1\37\3\3\4\50\1\77\33\3\22\17\1\42\15\3\14\50"+
    "\1\137\3\3\14\50\1\137\3\3\1\122\15\17\3\0\1\57\7\3\1\32\2\0\4\3\1\122\13"+
    "\17\2\0\1\57\1\35\4\3\6\17\1\42\1\3\2\0\1\33\1\3\1\122\10\17\1\60\3\0\1\64"+
    "\2\0\4\3\10\50\1\137\1\150\2\3\1\122\13\17\1\60\3\0\1\61\1\42\2\3\2\0\1\151"+
    "\1\125\10\3\4\50\1\152\6\50\25\3\1\50\1\137\1\76\1\152\3\50\1\152\2\50\1\125"+
    "\1\3\13\50\1\137\11\3\1\147\1\50\2\153\5\50\1\76\1\50\1\76\1\147\1\77\1\110"+
    "\4\3\1\125\2\3\1\147\1\77\47\3\15\50\1\125\3\3\1\115\1\137\15\3\14\50\5\3"+
    "\1\152\56\3\13\50\1\137\12\3\1\50\11\3\14\50\5\3\1\125\16\3\12\17\1\60\3\0"+
    "\2\3\2\0\1\33\15\3\6\50\1\77\141\3\20\50\7\3\1\115\60\3\16\50\1\125\1\3\2"+
    "\50\1\76\10\50\1\137\4\3\1\125\13\3\1\141\7\50\34\3\33\17\1\136\12\50\1\77"+
    "\31\3\30\0\1\57\7\3\61\50\57\3\13\17\1\37\64\3\21\50\1\137\56\3\16\17\1\42"+
    "\1\3\7\50\1\137\34\3\7\50\1\77\4\3\14\50\4\3\1\50\7\3\1\115\5\50\1\3\1\147"+
    "\4\50\34\3\21\17\1\42\2\3\1\73\12\0\1\57\3\3\1\52\1\122\3\17\20\3\1\125\7"+
    "\3\73\50\1\125\4\3\74\50\1\137\3\3\1\40\77\3\32\50\1\137\1\3\3\50\1\125\2"+
    "\50\1\125\1\3\2\50\1\77\62\3\1\53\1\33\1\53\4\0\1\57\1\53\1\0\7\3\1\32\1\33"+
    "\44\3\1\32\1\56\56\3\25\17\1\44\21\17\1\44\1\34\1\106\1\51\1\44\2\17\1\46"+
    "\1\51\1\17\1\51\17\17\1\46\1\37\1\51\1\17\1\44\1\17\1\44\6\17\1\46\1\37\1"+
    "\17\1\43\1\41\1\17\1\44\124\17\1\40\6\17\1\44\5\17\1\37\7\17\1\37\6\17\1\44"+
    "\7\17\1\44\5\17\1\37\7\17\1\37\6\17\1\44\7\17\1\44\5\17\1\37\2\17\1\32\14"+
    "\0\61\50\1\125\16\3\1\17\1\51\6\17\1\106\1\66\1\51\1\17\1\37\1\17\1\120\1"+
    "\3\1\34\1\105\1\120\1\51\1\106\1\66\2\120\1\106\1\66\1\37\1\17\1\37\1\17\1"+
    "\51\1\43\2\17\1\46\4\17\1\3\2\51\1\46\4\17\21\3\65\17\1\37\12\3\15\17\1\42"+
    "\2\3\67\17\1\40\140\50\1\77\27\3\7\17\1\40\70\3\1\35\7\3\30\0\40\3\74\0\4"+
    "\3");

  /* The ZZ_CMAP_A table has 432 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\5\4\1\3\1\16\1\0\1\3\1\16\2\4\4\0\1\42\1\53\1\17\1\62\1\64\1\20\1\70\1\14"+
    "\1\47\1\50\1\66\1\13\1\57\1\67\1\11\1\65\1\6\11\2\1\61\1\0\1\55\1\54\1\56"+
    "\1\60\1\63\1\5\1\10\2\5\1\12\2\5\1\7\12\5\1\51\1\15\1\52\1\72\1\4\1\0\1\30"+
    "\1\33\1\46\1\32\1\36\1\45\1\41\1\24\1\43\2\5\1\25\1\5\1\31\1\34\1\5\1\37\1"+
    "\26\1\23\1\40\1\27\1\5\1\44\1\35\2\5\1\21\1\71\1\22\1\73\1\4\2\0\4\4\4\0\1"+
    "\5\2\0\1\4\3\0\1\5\2\0\3\5\1\0\2\5\4\0\3\5\3\0\1\5\1\0\1\5\1\0\1\5\1\0\4\5"+
    "\1\0\1\1\2\5\1\0\3\5\1\0\1\4\4\1\1\0\3\5\3\0\1\4\1\0\5\4\1\0\1\4\1\0\2\4\1"+
    "\0\1\4\3\0\3\4\1\0\3\5\2\4\3\5\1\0\1\5\3\4\2\5\2\4\1\0\4\4\3\5\2\0\2\5\1\4"+
    "\4\5\3\4\1\5\2\0\2\4\1\5\1\4\1\5\3\4\1\5\1\1\3\5\4\1\1\0\4\1\2\0\1\4\1\5\2"+
    "\4\1\1\3\5\1\1\4\4\2\0\3\4\1\5\4\0\1\5\1\0\2\5\1\0\1\5\1\4\3\0\1\1\4\0\1\4"+
    "\3\5\1\1\1\0\1\1\1\0\2\4\3\1\1\4\3\0\1\1\2\0\1\4\1\0\1\4\1\0\1\4\2\0\1\5\1"+
    "\0\1\5\1\0\1\4\1\0\4\4\2\5\1\1\2\0\1\4\4\1\3\0\1\5\1\0\2\4\1\5\2\4\2\5\1\4"+
    "\1\5\1\0\1\5\2\1\1\0\1\4\2\5\2\0\2\5\3\4\1\0\1\5\2\1\1\0\1\4\3\5\4\1\1\0\2"+
    "\5\1\4\1\5\2\0\2\1\2\0\1\5\1\4\1\5\2\4\2\0\1\5\1\4\2\5\2\0\1\4\2\5\1\4\2\0"+
    "\3\1\2\0\1\1\1\0\2\4\1\1\1\0\2\1\1\0\2\1\2\0\1\1");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\3\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\15\2\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\11\1\40\1\41\2\42\1\0\2\7"+
    "\2\10\1\43\1\2\1\44\7\2\1\45\1\2\1\46"+
    "\1\2\1\47\1\50\1\2\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\1\61\1\42\1\62\1\63"+
    "\1\64\1\2\1\65\1\2\1\66\1\67\1\70\1\2"+
    "\1\71\1\72\1\2\1\73\2\2\1\74\1\75\1\76"+
    "\1\0\1\77\1\100\2\2\1\0\1\2\1\101\1\102"+
    "\4\2\1\103";

  private static int [] zzUnpackAction() {
    int [] result = new int[117];
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
    "\0\0\0\74\0\170\0\264\0\360\0\u012c\0\u0168\0\u01a4"+
    "\0\170\0\u01e0\0\u021c\0\u0258\0\170\0\u0294\0\u02d0\0\u030c"+
    "\0\u0348\0\u0384\0\u03c0\0\u03fc\0\u0438\0\u0474\0\u04b0\0\u04ec"+
    "\0\u0528\0\u0564\0\170\0\170\0\170\0\170\0\u05a0\0\u05dc"+
    "\0\u0618\0\u0654\0\170\0\170\0\170\0\170\0\170\0\170"+
    "\0\170\0\170\0\170\0\u0690\0\u06cc\0\170\0\170\0\170"+
    "\0\170\0\170\0\u0708\0\u0744\0\u0780\0\170\0\u07bc\0\u07f8"+
    "\0\170\0\170\0\u0834\0\u0870\0\u08ac\0\u08e8\0\u0924\0\u0960"+
    "\0\u099c\0\u09d8\0\u0a14\0\264\0\u0a50\0\264\0\u0a8c\0\u0ac8"+
    "\0\u0b04\0\u0b40\0\170\0\170\0\170\0\170\0\170\0\u0b7c"+
    "\0\170\0\170\0\170\0\u0bb8\0\264\0\264\0\264\0\u0bf4"+
    "\0\264\0\u0c30\0\u0c6c\0\264\0\264\0\u0ca8\0\264\0\264"+
    "\0\u0ce4\0\264\0\u0d20\0\u0d5c\0\170\0\264\0\264\0\u0d98"+
    "\0\264\0\264\0\u0dd4\0\u0e10\0\u0e4c\0\u0e88\0\264\0\170"+
    "\0\u0ec4\0\u0f00\0\u0f3c\0\u0f78\0\264";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[117];
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
    "\1\3\1\4\1\5\1\6\1\3\1\4\1\7\2\4"+
    "\1\10\1\4\1\11\1\12\1\3\1\6\1\13\1\14"+
    "\1\15\1\3\1\16\1\4\1\17\1\4\1\20\1\21"+
    "\1\22\1\4\1\23\1\24\1\25\1\26\1\4\1\27"+
    "\1\30\1\6\1\31\1\4\1\32\1\4\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\3\1\4\1\5\1\6\1\3"+
    "\1\4\1\7\2\4\1\10\1\4\1\11\1\12\1\3"+
    "\1\6\1\13\1\60\1\15\1\61\1\16\1\4\1\17"+
    "\1\4\1\20\1\21\1\22\1\4\1\23\1\24\1\25"+
    "\1\26\1\4\1\27\1\30\1\6\1\31\1\4\1\32"+
    "\1\4\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\56\1\57\76\0\1\4"+
    "\1\0\5\4\1\0\1\4\10\0\17\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\5\3\0\1\5\1\62\1\0"+
    "\1\63\1\64\11\0\1\62\11\0\1\64\40\0\1\6"+
    "\12\0\1\6\23\0\1\6\33\0\1\65\3\0\1\65"+
    "\1\62\1\0\1\63\1\64\11\0\1\62\11\0\1\64"+
    "\37\0\1\63\3\0\1\63\65\0\14\12\1\66\1\67"+
    "\1\0\55\12\15\13\1\70\1\0\1\71\54\13\21\0"+
    "\1\72\54\0\1\4\1\0\5\4\1\0\1\4\10\0"+
    "\1\4\1\73\15\4\1\0\4\4\15\0\1\4\11\0"+
    "\1\4\1\0\5\4\1\0\1\4\10\0\15\4\1\74"+
    "\1\4\1\0\4\4\15\0\1\4\11\0\1\4\1\0"+
    "\5\4\1\0\1\4\10\0\1\75\16\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\6\4\1\76\10\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\4\4"+
    "\1\77\4\4\1\100\1\4\1\101\3\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\5\4\1\102\3\4\1\103\5\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\3\4\1\104\13\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\11\4"+
    "\1\105\5\4\1\0\4\4\15\0\1\4\11\0\1\4"+
    "\1\0\5\4\1\0\1\4\10\0\14\4\1\106\2\4"+
    "\1\0\4\4\15\0\1\4\11\0\1\4\1\0\5\4"+
    "\1\0\1\4\10\0\3\4\1\107\13\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\15\4\1\110\1\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\6\4"+
    "\1\111\10\4\1\0\4\4\15\0\1\4\11\0\1\4"+
    "\1\0\5\4\1\0\1\4\10\0\5\4\1\112\11\4"+
    "\1\0\4\4\15\0\1\4\63\0\1\113\73\0\1\114"+
    "\73\0\1\115\1\116\72\0\1\117\1\0\1\120\105\0"+
    "\1\121\74\0\1\122\4\0\1\63\3\0\1\63\1\0"+
    "\1\123\1\0\1\64\20\0\1\123\2\0\1\64\37\0"+
    "\1\124\3\0\1\124\1\0\1\123\2\0\1\124\17\0"+
    "\1\123\33\0\1\124\6\0\1\65\3\0\1\65\2\0"+
    "\1\63\1\64\23\0\1\64\35\0\16\12\1\0\55\12"+
    "\16\13\1\0\55\13\2\0\1\4\1\0\5\4\1\0"+
    "\1\4\10\0\2\4\1\125\1\126\13\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\13\4\1\127\3\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\1\4"+
    "\1\130\15\4\1\0\4\4\15\0\1\4\11\0\1\4"+
    "\1\0\5\4\1\0\1\4\10\0\7\4\1\131\7\4"+
    "\1\0\4\4\15\0\1\4\11\0\1\4\1\0\5\4"+
    "\1\0\1\4\10\0\2\4\1\132\14\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\15\4\1\133\1\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\14\4"+
    "\1\134\2\4\1\0\1\4\1\135\2\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\6\4"+
    "\1\136\10\4\1\0\4\4\15\0\1\4\11\0\1\4"+
    "\1\0\5\4\1\0\1\4\10\0\3\4\1\137\13\4"+
    "\1\0\4\4\15\0\1\4\11\0\1\4\1\0\5\4"+
    "\1\0\1\4\10\0\3\4\1\140\13\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\4\4\1\141\12\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\13\4"+
    "\1\142\3\4\1\0\4\4\15\0\1\4\11\0\1\4"+
    "\1\0\5\4\1\0\1\4\10\0\1\143\16\4\1\0"+
    "\4\4\15\0\1\4\11\0\1\4\1\0\5\4\1\0"+
    "\1\4\10\0\2\4\1\144\14\4\1\0\4\4\15\0"+
    "\1\4\65\0\1\145\17\0\1\124\3\0\1\124\1\0"+
    "\1\123\22\0\1\123\42\0\1\4\1\0\5\4\1\0"+
    "\1\4\10\0\3\4\1\146\13\4\1\0\4\4\15\0"+
    "\1\4\11\0\1\4\1\0\5\4\1\0\1\4\10\0"+
    "\2\4\1\147\14\4\1\0\4\4\15\0\1\4\11\0"+
    "\1\4\1\0\5\4\1\0\1\4\10\0\17\4\1\150"+
    "\4\4\15\0\1\4\11\0\1\4\1\0\5\4\1\0"+
    "\1\4\10\0\7\4\1\151\7\4\1\0\4\4\15\0"+
    "\1\4\11\0\1\4\1\0\5\4\1\0\1\4\10\0"+
    "\13\4\1\152\3\4\1\0\4\4\15\0\1\4\11\0"+
    "\1\4\1\0\5\4\1\0\1\4\10\0\15\4\1\153"+
    "\1\4\1\0\4\4\15\0\1\4\11\0\1\4\1\0"+
    "\5\4\1\0\1\4\10\0\1\154\16\4\1\0\4\4"+
    "\15\0\1\4\52\0\1\155\32\0\1\4\1\0\5\4"+
    "\1\0\1\4\10\0\5\4\1\156\11\4\1\0\4\4"+
    "\15\0\1\4\11\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\13\4\1\157\3\4\1\0\4\4\15\0\1\4"+
    "\40\0\1\160\44\0\1\4\1\0\5\4\1\0\1\4"+
    "\10\0\6\4\1\161\10\4\1\0\4\4\15\0\1\4"+
    "\11\0\1\4\1\0\5\4\1\0\1\4\10\0\17\4"+
    "\1\0\3\4\1\162\15\0\1\4\11\0\1\4\1\0"+
    "\5\4\1\0\1\4\10\0\13\4\1\163\3\4\1\0"+
    "\4\4\15\0\1\4\11\0\1\4\1\0\5\4\1\0"+
    "\1\4\10\0\11\4\1\164\5\4\1\0\4\4\15\0"+
    "\1\4\11\0\1\4\1\0\5\4\1\0\1\4\10\0"+
    "\17\4\1\0\2\4\1\165\1\4\15\0\1\4\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4020];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\5\1\1\11\3\1\1\11\15\1\4\11"+
    "\4\1\11\11\2\1\5\11\2\1\1\0\1\11\2\1"+
    "\2\11\20\1\5\11\1\1\3\11\21\1\1\11\2\1"+
    "\1\0\4\1\1\0\2\1\1\11\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[117];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _OgnlLexer(){
    this((java.io.Reader)null);
  }

  private static final class State {
    final int lBraceCount;
    final int state;

    private State(int state, int lBraceCount) {
        this.state = state;
        this.lBraceCount = lBraceCount;
    }

    @Override
    public String toString() {
        return "yystate = " + state + (lBraceCount == 0 ? "" : "lBraceCount = " + lBraceCount);
    }
  }

  private final Stack<State> myStateStack = new Stack<>();
  private int myLeftBraceCount;

  protected void resetInternal() {
    myLeftBraceCount = 0;
    myStateStack.clear();
  }

  private void pushState(int newState) {
    myStateStack.push(new State(yystate(), myLeftBraceCount));
    myLeftBraceCount = 0;
    yybegin(newState);
  }

  private void popState() {
    if (myStateStack.empty()) return;

    State state = myStateStack.pop();
    myLeftBraceCount = state.lBraceCount;
    yybegin(state.state);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _OgnlLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
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
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
      resetInternal();

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 68: break;
          case 2: 
            { return OgnlTypes.IDENTIFIER;
            } 
            // fall through
          case 69: break;
          case 3: 
            { return OgnlTypes.INTEGER_LITERAL;
            } 
            // fall through
          case 70: break;
          case 4: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 71: break;
          case 5: 
            { return OgnlTypes.DOT;
            } 
            // fall through
          case 72: break;
          case 6: 
            { return OgnlTypes.PLUS;
            } 
            // fall through
          case 73: break;
          case 7: 
            { return OgnlTypes.CHARACTER_LITERAL;
            } 
            // fall through
          case 74: break;
          case 8: 
            { return OgnlTypes.STRING_LITERAL;
            } 
            // fall through
          case 75: break;
          case 9: 
            { return OgnlTypes.MODULO;
            } 
            // fall through
          case 76: break;
          case 10: 
            { myLeftBraceCount++;
  pushState(NESTED_BRACE);
  return OgnlTypes.LBRACE;
            } 
            // fall through
          case 77: break;
          case 11: 
            { return OgnlTypes.LPARENTH;
            } 
            // fall through
          case 78: break;
          case 12: 
            { return OgnlTypes.RPARENTH;
            } 
            // fall through
          case 79: break;
          case 13: 
            { return OgnlTypes.LBRACKET;
            } 
            // fall through
          case 80: break;
          case 14: 
            { return OgnlTypes.RBRACKET;
            } 
            // fall through
          case 81: break;
          case 15: 
            { return OgnlTypes.NEGATE;
            } 
            // fall through
          case 82: break;
          case 16: 
            { return OgnlTypes.EQ;
            } 
            // fall through
          case 83: break;
          case 17: 
            { return OgnlTypes.LESS;
            } 
            // fall through
          case 84: break;
          case 18: 
            { return OgnlTypes.GREATER;
            } 
            // fall through
          case 85: break;
          case 19: 
            { return OgnlTypes.COMMA;
            } 
            // fall through
          case 86: break;
          case 20: 
            { return OgnlTypes.QUESTION;
            } 
            // fall through
          case 87: break;
          case 21: 
            { return OgnlTypes.COLON;
            } 
            // fall through
          case 88: break;
          case 22: 
            { return OgnlTypes.HASH;
            } 
            // fall through
          case 89: break;
          case 23: 
            { return OgnlTypes.AT;
            } 
            // fall through
          case 90: break;
          case 24: 
            { return OgnlTypes.DOLLAR;
            } 
            // fall through
          case 91: break;
          case 25: 
            { return OgnlTypes.DIVISION;
            } 
            // fall through
          case 92: break;
          case 26: 
            { return OgnlTypes.MULTIPLY;
            } 
            // fall through
          case 93: break;
          case 27: 
            { return OgnlTypes.MINUS;
            } 
            // fall through
          case 94: break;
          case 28: 
            { return OgnlTypes.AND;
            } 
            // fall through
          case 95: break;
          case 29: 
            { return OgnlTypes.OR;
            } 
            // fall through
          case 96: break;
          case 30: 
            { return OgnlTypes.XOR;
            } 
            // fall through
          case 97: break;
          case 31: 
            { return OgnlTypes.NOT;
            } 
            // fall through
          case 98: break;
          case 32: 
            { popState();
  if (myLeftBraceCount == 0)  {
    return OgnlTypes.EXPRESSION_END;
  }

  myLeftBraceCount--;
  return OgnlTypes.RBRACE;
            } 
            // fall through
          case 99: break;
          case 33: 
            { return OgnlTypes.BIG_INTEGER_LITERAL;
            } 
            // fall through
          case 100: break;
          case 34: 
            { return OgnlTypes.DOUBLE_LITERAL;
            } 
            // fall through
          case 101: break;
          case 35: 
            { pushState(EXPR);
  return OgnlTypes.EXPRESSION_START;
            } 
            // fall through
          case 102: break;
          case 36: 
            { return OgnlTypes.LT_KEYWORD;
            } 
            // fall through
          case 103: break;
          case 37: 
            { return OgnlTypes.OR_KEYWORD;
            } 
            // fall through
          case 104: break;
          case 38: 
            { return OgnlTypes.EQ_KEYWORD;
            } 
            // fall through
          case 105: break;
          case 39: 
            { return OgnlTypes.GT_KEYWORD;
            } 
            // fall through
          case 106: break;
          case 40: 
            { return OgnlTypes.IN_KEYWORD;
            } 
            // fall through
          case 107: break;
          case 41: 
            { return OgnlTypes.NOT_EQUAL;
            } 
            // fall through
          case 108: break;
          case 42: 
            { return OgnlTypes.EQUAL;
            } 
            // fall through
          case 109: break;
          case 43: 
            { return OgnlTypes.LESS_EQUAL;
            } 
            // fall through
          case 110: break;
          case 44: 
            { return OgnlTypes.SHIFT_LEFT;
            } 
            // fall through
          case 111: break;
          case 45: 
            { return OgnlTypes.GREATER_EQUAL;
            } 
            // fall through
          case 112: break;
          case 46: 
            { return OgnlTypes.SHIFT_RIGHT;
            } 
            // fall through
          case 113: break;
          case 47: 
            { return OgnlTypes.AND_AND;
            } 
            // fall through
          case 114: break;
          case 48: 
            { return OgnlTypes.OR_OR;
            } 
            // fall through
          case 115: break;
          case 49: 
            { return OgnlTypes.BIG_DECIMAL_LITERAL;
            } 
            // fall through
          case 116: break;
          case 50: 
            { return OgnlTypes.SHIFT_LEFT_KEYWORD;
            } 
            // fall through
          case 117: break;
          case 51: 
            { return OgnlTypes.SHIFT_RIGHT_KEYWORD;
            } 
            // fall through
          case 118: break;
          case 52: 
            { return OgnlTypes.LT_EQ_KEYWORD;
            } 
            // fall through
          case 119: break;
          case 53: 
            { return OgnlTypes.AND_KEYWORD;
            } 
            // fall through
          case 120: break;
          case 54: 
            { return OgnlTypes.NOT_KEYWORD;
            } 
            // fall through
          case 121: break;
          case 55: 
            { return OgnlTypes.NEQ_KEYWORD;
            } 
            // fall through
          case 122: break;
          case 56: 
            { return OgnlTypes.NEW_KEYWORD;
            } 
            // fall through
          case 123: break;
          case 57: 
            { return OgnlTypes.BOR_KEYWORD;
            } 
            // fall through
          case 124: break;
          case 58: 
            { return OgnlTypes.XOR_KEYWORD;
            } 
            // fall through
          case 125: break;
          case 59: 
            { return OgnlTypes.GT_EQ_KEYWORD;
            } 
            // fall through
          case 126: break;
          case 60: 
            { return OgnlTypes.SHIFT_RIGHT_LOGICAL;
            } 
            // fall through
          case 127: break;
          case 61: 
            { return OgnlTypes.SHIFT_RIGHT_LOGICAL_KEYWORD;
            } 
            // fall through
          case 128: break;
          case 62: 
            { return OgnlTypes.NULL_KEYWORD;
            } 
            // fall through
          case 129: break;
          case 63: 
            { return OgnlTypes.BAND_KEYWORD;
            } 
            // fall through
          case 130: break;
          case 64: 
            { return OgnlTypes.TRUE_KEYWORD;
            } 
            // fall through
          case 131: break;
          case 65: 
            { return OgnlTypes.FALSE_KEYWORD;
            } 
            // fall through
          case 132: break;
          case 66: 
            { return OgnlTypes.NOT_IN_KEYWORD;
            } 
            // fall through
          case 133: break;
          case 67: 
            { return OgnlTypes.INSTANCEOF_KEYWORD;
            } 
            // fall through
          case 134: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
