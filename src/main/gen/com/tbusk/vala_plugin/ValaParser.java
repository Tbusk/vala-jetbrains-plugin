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
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // COMMENT | DOC_COMMENT | BLOCK_COMMENT
  public static boolean comments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENTS, "<comments>");
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, DOC_COMMENT);
    if (!r) r = consumeToken(b, BLOCK_COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CHAR | UCHAR | UNICHAR | INT | UINT | LONG | ULONG | SHORT | USHORT | INT8 | INT16 | INT32 | INT64 |
  //     UINT8 | UINT16 | UINT32 | UINT64 | FLOAT | DOUBLE | BOOL | TRUE | FALSE | STRUCT | ENUM | VAR
  public static boolean data_types(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_types")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_TYPES, "<data types>");
    r = consumeToken(b, CHAR);
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
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, STRUCT);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, VAR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // valid_expressions*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!valid_expressions(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (IDENTIFIER | STRING | NUMBER | tokens) ";"?
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_0(b, l + 1);
    r = r && statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER | STRING | NUMBER | tokens
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = tokens(b, l + 1);
    return r;
  }

  // ";"?
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // WHITE_SPACE | SEMICOLON | COMMA | DOT | LPAREN | RPAREN | LBRACE | RBRACE | PLUS | LBRACKET | RBRACKET | EQUALS | GREATER_THAN | LESS_THAN | MULTIPLY | DIVIDE | MINUS
  static boolean tokens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tokens")) return false;
    boolean r;
    r = consumeToken(b, WHITE_SPACE);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, RPAREN);
    if (!r) r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, LBRACKET);
    if (!r) r = consumeToken(b, RBRACKET);
    if (!r) r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, GREATER_THAN);
    if (!r) r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, MULTIPLY);
    if (!r) r = consumeToken(b, DIVIDE);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // comments | statement | if_statement | while_statement | for_statement |
  //     function_declaration | class_declaration | namespace_statement | using_statement  | return_statement |
  //     try_statement
  static boolean valid_expressions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valid_expressions")) return false;
    boolean r;
    r = comments(b, l + 1);
    if (!r) r = statement(b, l + 1);
    if (!r) r = consumeToken(b, IF_STATEMENT);
    if (!r) r = consumeToken(b, WHILE_STATEMENT);
    if (!r) r = consumeToken(b, FOR_STATEMENT);
    if (!r) r = consumeToken(b, FUNCTION_DECLARATION);
    if (!r) r = consumeToken(b, CLASS_DECLARATION);
    if (!r) r = consumeToken(b, NAMESPACE_STATEMENT);
    if (!r) r = consumeToken(b, USING_STATEMENT);
    if (!r) r = consumeToken(b, RETURN_STATEMENT);
    if (!r) r = consumeToken(b, TRY_STATEMENT);
    return r;
  }

}
