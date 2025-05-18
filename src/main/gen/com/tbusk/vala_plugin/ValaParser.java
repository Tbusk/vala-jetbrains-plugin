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
  // PUBLIC | PROTECTED | PRIVATE
  public static boolean class_access_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_access_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_ACCESS_MODIFIERS, "<class access modifiers>");
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, PROTECTED);
    if (!r) r = consumeToken(b, PRIVATE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // class_access_modifiers? CLASS_DECLARATION IDENTIFIER type_parameters? (inheritance_list | interface_list)?
  //     LBRACE class_member* RBRACE
  public static boolean class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = class_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, CLASS_DECLARATION, IDENTIFIER);
    r = r && class_declaration_3(b, l + 1);
    r = r && class_declaration_4(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && class_declaration_6(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // class_access_modifiers?
  private static boolean class_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_0")) return false;
    class_access_modifiers(b, l + 1);
    return true;
  }

  // type_parameters?
  private static boolean class_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_3")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // (inheritance_list | interface_list)?
  private static boolean class_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_4")) return false;
    class_declaration_4_0(b, l + 1);
    return true;
  }

  // inheritance_list | interface_list
  private static boolean class_declaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_4_0")) return false;
    boolean r;
    r = inheritance_list(b, l + 1);
    if (!r) r = interface_list(b, l + 1);
    return r;
  }

  // class_member*
  private static boolean class_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!class_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_declaration_6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // field_declaration | method_declaration | constructor_declaration | property_declaration | class_declaration
  static boolean class_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_member")) return false;
    boolean r;
    r = consumeToken(b, FIELD_DECLARATION);
    if (!r) r = consumeToken(b, METHOD_DECLARATION);
    if (!r) r = consumeToken(b, CONSTRUCTOR_DECLARATION);
    if (!r) r = consumeToken(b, PROPERTY_DECLARATION);
    if (!r) r = class_declaration(b, l + 1);
    return r;
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
  // (class_declaration)
  public static boolean data_structures(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_structures")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_STRUCTURES, "<data structures>");
    r = class_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ()
  public static boolean expression(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, EXPRESSION, true);
    return true;
  }

  /* ********************************************************** */
  // COLON IDENTIFIER type_arguments*
  static boolean inheritance_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inheritance_list")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLON, IDENTIFIER);
    r = r && inheritance_list_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_arguments*
  private static boolean inheritance_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inheritance_list_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_arguments(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "inheritance_list_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER type_arguments (COMMA IDENTIFIER type_arguments)*
  static boolean interface_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && type_arguments(b, l + 1);
    r = r && interface_list_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA IDENTIFIER type_arguments)*
  private static boolean interface_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_list_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_list_2", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER type_arguments
  private static boolean interface_list_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    r = r && type_arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //     comments | statement | namespace_statement | using_statement | class_declaration | WHITESPACE
  // )*
  static boolean items(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "items")) return false;
    while (true) {
      int c = current_position_(b);
      if (!items_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "items", c)) break;
    }
    return true;
  }

  // comments | statement | namespace_statement | using_statement | class_declaration | WHITESPACE
  private static boolean items_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "items_0")) return false;
    boolean r;
    r = comments(b, l + 1);
    if (!r) r = statement(b, l + 1);
    if (!r) r = namespace_statement(b, l + 1);
    if (!r) r = using_statement(b, l + 1);
    if (!r) r = class_declaration(b, l + 1);
    if (!r) r = consumeToken(b, WHITESPACE);
    return r;
  }

  /* ********************************************************** */
  // NAMESPACE IDENTIFIER LBRACE expression* RBRACE
  public static boolean namespace_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_statement")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NAMESPACE, IDENTIFIER, LBRACE);
    r = r && namespace_statement_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, NAMESPACE_STATEMENT, r);
    return r;
  }

  // expression*
  private static boolean namespace_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_statement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_statement_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // items*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!items(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (IDENTIFIER | STRING_LITERAL | NUMBER | tokens) ";"?
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_0(b, l + 1);
    r = r && statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER | STRING_LITERAL | NUMBER | tokens
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, TOKENS);
    return r;
  }

  // ";"?
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // LESS_THAN (IDENTIFIER | value_types) (COMMA (IDENTIFER | value_types))* GREATER_THAN
  static boolean type_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments")) return false;
    if (!nextTokenIs(b, LESS_THAN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS_THAN);
    r = r && type_arguments_1(b, l + 1);
    r = r && type_arguments_2(b, l + 1);
    r = r && consumeToken(b, GREATER_THAN);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | value_types
  private static boolean type_arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, VALUE_TYPES);
    return r;
  }

  // (COMMA (IDENTIFER | value_types))*
  private static boolean type_arguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_arguments_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_arguments_2", c)) break;
    }
    return true;
  }

  // COMMA (IDENTIFER | value_types)
  private static boolean type_arguments_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type_arguments_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFER | value_types
  private static boolean type_arguments_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_2_0_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFER);
    if (!r) r = consumeToken(b, VALUE_TYPES);
    return r;
  }

  /* ********************************************************** */
  // LESS_THAN IDENTIFIER (COMMA IDENTIFIER)* GREATER_THAN
  static boolean type_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters")) return false;
    if (!nextTokenIs(b, LESS_THAN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LESS_THAN, IDENTIFIER);
    r = r && type_parameters_2(b, l + 1);
    r = r && consumeToken(b, GREATER_THAN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA IDENTIFIER)*
  private static boolean type_parameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_parameters_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_parameters_2", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean type_parameters_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // USING IDENTIFIER (AS IDENTIFIER)? SEMICOLON
  public static boolean using_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_statement")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, USING, IDENTIFIER);
    r = r && using_statement_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, USING_STATEMENT, r);
    return r;
  }

  // (AS IDENTIFIER)?
  private static boolean using_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_statement_2")) return false;
    using_statement_2_0(b, l + 1);
    return true;
  }

  // AS IDENTIFIER
  private static boolean using_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

}
