// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.tbusk.vala_plugin.psi.ValaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ValaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Root(b, l + 1);
  }

  /* ********************************************************** */
  // public
  //                          | private
  //                          | protected
  //                          | internal
  static boolean AccessModifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AccessModifiers")) return false;
    boolean r;
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, PRIVATE);
    if (!r) r = consumeToken(b, PROTECTED);
    if (!r) r = consumeToken(b, INTERNAL);
    return r;
  }

  /* ********************************************************** */
  // CCode
  //                         | Version
  //                         | DBus
  static boolean CInstructions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CInstructions")) return false;
    boolean r;
    r = consumeToken(b, CCODE);
    if (!r) r = consumeToken(b, VERSION);
    if (!r) r = consumeToken(b, DBUS);
    return r;
  }

  /* ********************************************************** */
  // COMMENT
  //                   | BLOCK_COMMENT
  //                   | DOC_COMMENT
  static boolean Comments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Comments")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, BLOCK_COMMENT);
    if (!r) r = consumeToken(b, DOC_COMMENT);
    return r;
  }

  /* ********************************************************** */
  // HashMap
  //                   | Object
  static boolean GObjects(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GObjects")) return false;
    if (!nextTokenIs(b, "", HASHMAP, OBJECT)) return false;
    boolean r;
    r = consumeToken(b, HASHMAP);
    if (!r) r = consumeToken(b, OBJECT);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  //                      | STRING_LITERAL
  //                      | CHAR_LITERAL
  //                      | NUMBER
  //                      | WHITESPACE
  //                      | EMPTY
  //                      | CONSTANT
  //                      | METHOD_CALL
  static boolean Identifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifiers")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, CHAR_LITERAL);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, WHITESPACE);
    if (!r) r = consumeToken(b, EMPTY);
    if (!r) r = consumeToken(b, CONSTANT);
    if (!r) r = consumeToken(b, METHOD_CALL);
    return r;
  }

  /* ********************************************************** */
  // if
  //                      | endif
  //                      | elif
  //                      | else
  static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    boolean r;
    r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, ENDIF);
    if (!r) r = consumeToken(b, ELIF);
    if (!r) r = consumeToken(b, ELSE);
    return r;
  }

  /* ********************************************************** */
  // Keywords | Comments | Identifiers | Symbols
  public static boolean Items(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Items")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITEMS, "<items>");
    r = Keywords(b, l + 1);
    if (!r) r = Comments(b, l + 1);
    if (!r) r = Identifiers(b, l + 1);
    if (!r) r = Symbols(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Types
  //                   | IfStatement
  //                   | CInstructions
  //                   | GObjects
  //                   | AccessModifiers
  //                   | while
  //                   | for
  //                   | do
  //                   | switch
  //                   | case
  //                   | default
  //                   | break
  //                   | continue
  //                   | return
  //                   | goto
  //                   | sizeof
  //                   | typedef
  //                   | struct
  //                   | union
  //                   | enum
  //                   | class
  //                   | interface
  //                   | static
  //                   | abstract
  //                   | virtual
  //                   | override
  //                   | namespace
  //                   | foreach
  //                   | in
  //                   | try
  //                   | catch
  //                   | finally
  //                   | throw
  //                   | throws
  //                   | new
  //                   | delete
  //                   | this
  //                   | null
  //                   | true
  //                   | false
  //                   | const
  //                   | volatile
  //                   | assert
  //                   | var
  //                   | void
  //                   | owned
  //                   | unowned
  //                   | using
  //                   | construct
  //                   | yield
  //                   | async
  //                   | base
  //                   | is
  //                   | as
  //                   | typeof
  //                   | delegate
  //                   | signal
  //                   | errordomain
  //                   | requires
  //                   | ensures
  //                   | lock
  //                   | weak
  //                   | extern
  static boolean Keywords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Keywords")) return false;
    boolean r;
    r = Types(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = CInstructions(b, l + 1);
    if (!r) r = GObjects(b, l + 1);
    if (!r) r = AccessModifiers(b, l + 1);
    if (!r) r = consumeToken(b, WHILE);
    if (!r) r = consumeToken(b, FOR);
    if (!r) r = consumeToken(b, DO);
    if (!r) r = consumeToken(b, SWITCH);
    if (!r) r = consumeToken(b, CASE);
    if (!r) r = consumeToken(b, DEFAULT);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = consumeToken(b, CONTINUE);
    if (!r) r = consumeToken(b, RETURN);
    if (!r) r = consumeToken(b, GOTO);
    if (!r) r = consumeToken(b, SIZEOF);
    if (!r) r = consumeToken(b, TYPEDEF);
    if (!r) r = consumeToken(b, STRUCT);
    if (!r) r = consumeToken(b, UNION);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, CLASS);
    if (!r) r = consumeToken(b, INTERFACE);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, VIRTUAL);
    if (!r) r = consumeToken(b, OVERRIDE);
    if (!r) r = consumeToken(b, NAMESPACE);
    if (!r) r = consumeToken(b, FOREACH);
    if (!r) r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, TRY);
    if (!r) r = consumeToken(b, CATCH);
    if (!r) r = consumeToken(b, FINALLY);
    if (!r) r = consumeToken(b, THROW);
    if (!r) r = consumeToken(b, THROWS);
    if (!r) r = consumeToken(b, NEW);
    if (!r) r = consumeToken(b, DELETE);
    if (!r) r = consumeToken(b, THIS);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, VOLATILE);
    if (!r) r = consumeToken(b, ASSERT);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, VOID);
    if (!r) r = consumeToken(b, OWNED);
    if (!r) r = consumeToken(b, UNOWNED);
    if (!r) r = consumeToken(b, USING);
    if (!r) r = consumeToken(b, CONSTRUCT);
    if (!r) r = consumeToken(b, YIELD);
    if (!r) r = consumeToken(b, ASYNC);
    if (!r) r = consumeToken(b, BASE);
    if (!r) r = consumeToken(b, IS);
    if (!r) r = consumeToken(b, AS);
    if (!r) r = consumeToken(b, TYPEOF);
    if (!r) r = consumeToken(b, DELEGATE);
    if (!r) r = consumeToken(b, SIGNAL);
    if (!r) r = consumeToken(b, ERRORDOMAIN);
    if (!r) r = consumeToken(b, REQUIRES);
    if (!r) r = consumeToken(b, ENSURES);
    if (!r) r = consumeToken(b, LOCK);
    if (!r) r = consumeToken(b, WEAK);
    if (!r) r = consumeToken(b, EXTERN);
    return r;
  }

  /* ********************************************************** */
  // Items*
  static boolean Root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Items(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Root", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DOT
  //                  | COMMA
  //                  | SEMICOLON
  //                  | EQUALS
  //                  | LBRACE
  //                  | RBRACE
  //                  | COLON
  //                  | LPAREN
  //                  | RPAREN
  //                  | LBRACKET
  //                  | RBRACKET
  //                  | QUESTION_MARK
  //                  | AT
  //                  | UNDERSCORE
  //                  | GREATER_THAN
  //                  | LESS_THAN
  //                  | PLUS
  //                  | MINUS
  //                  | STAR
  //                  | FORWARD_SLASH
  //                  | PERCENT
  //                  | AND
  //                  | PIPE
  //                  | EXCLAMATION
  //                  | TILDE
  //                  | CARET
  //                  | BACKTICK
  //                  | DOLLAR
  //                  | POUND
  //                  | BACKSLASH
  static boolean Symbols(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Symbols")) return false;
    boolean r;
    r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, RPAREN);
    if (!r) r = consumeToken(b, LBRACKET);
    if (!r) r = consumeToken(b, RBRACKET);
    if (!r) r = consumeToken(b, QUESTION_MARK);
    if (!r) r = consumeToken(b, AT);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = consumeToken(b, GREATER_THAN);
    if (!r) r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, FORWARD_SLASH);
    if (!r) r = consumeToken(b, PERCENT);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, PIPE);
    if (!r) r = consumeToken(b, EXCLAMATION);
    if (!r) r = consumeToken(b, TILDE);
    if (!r) r = consumeToken(b, CARET);
    if (!r) r = consumeToken(b, BACKTICK);
    if (!r) r = consumeToken(b, DOLLAR);
    if (!r) r = consumeToken(b, POUND);
    if (!r) r = consumeToken(b, BACKSLASH);
    return r;
  }

  /* ********************************************************** */
  // string
  //                | char
  //                | uchar
  //                | unichar
  //                | int
  //                | uint
  //                | long
  //                | ulong
  //                | short
  //                | ushort
  //                | int8
  //                | int16
  //                | int32
  //                | int64
  //                | uint8
  //                | uint16
  //                | uint32
  //                | uint64
  //                | float
  //                | double
  //                | bool
  //                | size_t
  //                | ssize_t
  static boolean Types(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Types")) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, UCHAR);
    if (!r) r = consumeToken(b, UNICHAR);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, UINT);
    if (!r) r = consumeToken(b, LONG);
    if (!r) r = consumeToken(b, ULONG);
    if (!r) r = consumeToken(b, SHORT);
    if (!r) r = consumeToken(b, USHORT);
    if (!r) r = consumeToken(b, INT8);
    if (!r) r = consumeToken(b, INT16);
    if (!r) r = consumeToken(b, INT32);
    if (!r) r = consumeToken(b, INT64);
    if (!r) r = consumeToken(b, UINT8);
    if (!r) r = consumeToken(b, UINT16);
    if (!r) r = consumeToken(b, UINT32);
    if (!r) r = consumeToken(b, UINT64);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, BOOL);
    if (!r) r = consumeToken(b, SIZE_T);
    if (!r) r = consumeToken(b, SSIZE_T);
    return r;
  }

}
