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
  // PLUS_EQUALS | MINUS_EQUALS | MULTIPLY_EQUALS | DIVIDE_EQUALS | MODULO_EQUALS
  public static boolean assignments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENTS, "<assignments>");
    r = consumeToken(b, PLUS_EQUALS);
    if (!r) r = consumeToken(b, MINUS_EQUALS);
    if (!r) r = consumeToken(b, MULTIPLY_EQUALS);
    if (!r) r = consumeToken(b, DIVIDE_EQUALS);
    if (!r) r = consumeToken(b, MODULO_EQUALS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BITWISE_AND | BITWISE_OR | BITWISE_XOR | BITWISE_NOT | BITWISE_SHIFT_LEFT | BITWISE_SHIFT_RIGHT |
  //     BITWISE_SHIFT_LEFT_EQUALS | BITWISE_SHIFT_RIGHT_EQUALS | BITWISE_OR_EQUALS | BITWISE_AND_EQUALS |
  //     BITWISE_XOR_EQUALS
  public static boolean bitwise(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BITWISE, "<bitwise>");
    r = consumeToken(b, BITWISE_AND);
    if (!r) r = consumeToken(b, BITWISE_OR);
    if (!r) r = consumeToken(b, BITWISE_XOR);
    if (!r) r = consumeToken(b, BITWISE_NOT);
    if (!r) r = consumeToken(b, BITWISE_SHIFT_LEFT);
    if (!r) r = consumeToken(b, BITWISE_SHIFT_RIGHT);
    if (!r) r = consumeToken(b, BITWISE_SHIFT_LEFT_EQUALS);
    if (!r) r = consumeToken(b, BITWISE_SHIFT_RIGHT_EQUALS);
    if (!r) r = consumeToken(b, BITWISE_OR_EQUALS);
    if (!r) r = consumeToken(b, BITWISE_AND_EQUALS);
    if (!r) r = consumeToken(b, BITWISE_XOR_EQUALS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACE statement* RBRACE
  static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && block_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement*
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // block | statement
  static boolean block_or_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_or_statement")) return false;
    boolean r;
    r = block(b, l + 1);
    if (!r) r = statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // AND | OR | NOT | EQUALS | GREATER_THAN | LESS_THAN | GREATER_THAN_EQUALS | LESS_THAN_EQUALS |
  //     DOUBLE_EQUALS | NOT_EQUALS
  public static boolean checks(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "checks")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHECKS, "<checks>");
    r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, GREATER_THAN);
    if (!r) r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, GREATER_THAN_EQUALS);
    if (!r) r = consumeToken(b, LESS_THAN_EQUALS);
    if (!r) r = consumeToken(b, DOUBLE_EQUALS);
    if (!r) r = consumeToken(b, NOT_EQUALS);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // class_access_modifiers? modifiers CLASS IDENTIFIER [type_parameters] [inheritance_list]
  //     [COMMA interface_list] LBRACE class_member* RBRACE
  public static boolean class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = class_declaration_0(b, l + 1);
    r = r && modifiers(b, l + 1);
    r = r && consumeTokens(b, 0, CLASS, IDENTIFIER);
    r = r && class_declaration_4(b, l + 1);
    r = r && class_declaration_5(b, l + 1);
    r = r && class_declaration_6(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && class_declaration_8(b, l + 1);
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

  // [type_parameters]
  private static boolean class_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_4")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // [inheritance_list]
  private static boolean class_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_5")) return false;
    inheritance_list(b, l + 1);
    return true;
  }

  // [COMMA interface_list]
  private static boolean class_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_6")) return false;
    class_declaration_6_0(b, l + 1);
    return true;
  }

  // COMMA interface_list
  private static boolean class_declaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && interface_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // class_member*
  private static boolean class_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!class_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_declaration_8", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // field_declaration | method_declaration | constructor_declaration | property_declaration | class_declaration
  static boolean class_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_member")) return false;
    boolean r;
    r = consumeToken(b, FIELD_DECLARATION);
    if (!r) r = method_declaration(b, l + 1);
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
  // expression
  static boolean condition(PsiBuilder b, int l) {
    return expression(b, l + 1);
  }

  /* ********************************************************** */
  // class_declaration | interface_declaration | struct_declaration | enum_declaration
  public static boolean data_structures(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_structures")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_STRUCTURES, "<data structures>");
    r = class_declaration(b, l + 1);
    if (!r) r = consumeToken(b, INTERFACE_DECLARATION);
    if (!r) r = consumeToken(b, STRUCT_DECLARATION);
    if (!r) r = consumeToken(b, ENUM_DECLARATION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // else (if_statement|block_or_statement)
  static boolean else_branch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_branch")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && else_branch_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // if_statement|block_or_statement
  private static boolean else_branch_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_branch_1")) return false;
    boolean r;
    r = if_statement(b, l + 1);
    if (!r) r = block_or_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // if_statement | while_statement | for_statement | try_statement | switch_statement | break_statement |
  //     default_statement | case_statement | assert_statement | return_statement | continue_statement
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = if_statement(b, l + 1);
    if (!r) r = consumeToken(b, WHILE_STATEMENT);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = consumeToken(b, TRY_STATEMENT);
    if (!r) r = consumeToken(b, SWITCH_STATEMENT);
    if (!r) r = consumeToken(b, BREAK_STATEMENT);
    if (!r) r = consumeToken(b, DEFAULT_STATEMENT);
    if (!r) r = consumeToken(b, CASE_STATEMENT);
    if (!r) r = consumeToken(b, ASSERT_STATEMENT);
    if (!r) r = consumeToken(b, RETURN_STATEMENT);
    if (!r) r = consumeToken(b, CONTINUE_STATEMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [init_statement] ";" [condition] ";" [iteration]
  static boolean for_c_style(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_c_style")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = for_c_style_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && for_c_style_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && for_c_style_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [init_statement]
  private static boolean for_c_style_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_c_style_0")) return false;
    init_statement(b, l + 1);
    return true;
  }

  // [condition]
  private static boolean for_c_style_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_c_style_2")) return false;
    condition(b, l + 1);
    return true;
  }

  // [iteration]
  private static boolean for_c_style_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_c_style_4")) return false;
    iteration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (IDENTIFIER | declaration) (IN | OF) expression
  static boolean for_each_style(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_each_style")) return false;
    if (!nextTokenIs(b, "", DECLARATION, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = for_each_style_0(b, l + 1);
    r = r && for_each_style_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | declaration
  private static boolean for_each_style_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_each_style_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, DECLARATION);
    return r;
  }

  // IN | OF
  private static boolean for_each_style_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_each_style_1")) return false;
    boolean r;
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OF);
    return r;
  }

  /* ********************************************************** */
  // FOR_STATEMENT [WHITE_SPACE] LPAREN (for_c_style | for_each_style) RPAREN block_or_statement
  static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, FOR_STATEMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR_STATEMENT);
    r = r && for_statement_1(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && for_statement_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && block_or_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [WHITE_SPACE]
  private static boolean for_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_1")) return false;
    consumeToken(b, WHITE_SPACE);
    return true;
  }

  // for_c_style | for_each_style
  private static boolean for_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_3")) return false;
    boolean r;
    r = for_c_style(b, l + 1);
    if (!r) r = for_each_style(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IF_STATEMENT [WHITE_SPACE] LPAREN condition RPAREN then_branch [else_branch]
  static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, IF_STATEMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF_STATEMENT);
    r = r && if_statement_1(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && then_branch(b, l + 1);
    r = r && if_statement_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [WHITE_SPACE]
  private static boolean if_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_1")) return false;
    consumeToken(b, WHITE_SPACE);
    return true;
  }

  // [else_branch]
  private static boolean if_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_6")) return false;
    else_branch(b, l + 1);
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
  // declaration | statement_expression
  static boolean init_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_statement")) return false;
    boolean r;
    r = consumeToken(b, DECLARATION);
    if (!r) r = statement_expression(b, l + 1);
    return r;
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
  //     comments | statement | method_declaration | namespace_statement | using_statement | class_declaration
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

  // comments | statement | method_declaration | namespace_statement | using_statement | class_declaration
  private static boolean items_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "items_0")) return false;
    boolean r;
    r = comments(b, l + 1);
    if (!r) r = statement(b, l + 1);
    if (!r) r = method_declaration(b, l + 1);
    if (!r) r = namespace_statement(b, l + 1);
    if (!r) r = using_statement(b, l + 1);
    if (!r) r = class_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // statement_expression
  static boolean iteration(PsiBuilder b, int l) {
    return statement_expression(b, l + 1);
  }

  /* ********************************************************** */
  // PUBLIC | PROTECTED | PRIVATE
  public static boolean method_access_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_access_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_ACCESS_MODIFIERS, "<method access modifiers>");
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, PROTECTED);
    if (!r) r = consumeToken(b, PRIVATE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [access_modifiers] [modifiers] return_types IDENTIFIER LPAREN parameter_list RPAREN [block_or_statement]
  public static boolean method_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_DECLARATION, "<method declaration>");
    r = method_declaration_0(b, l + 1);
    r = r && method_declaration_1(b, l + 1);
    r = r && return_types(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, LPAREN);
    r = r && parameter_list(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && method_declaration_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [access_modifiers]
  private static boolean method_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_0")) return false;
    consumeToken(b, ACCESS_MODIFIERS);
    return true;
  }

  // [modifiers]
  private static boolean method_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_1")) return false;
    modifiers(b, l + 1);
    return true;
  }

  // [block_or_statement]
  private static boolean method_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_7")) return false;
    block_or_statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (
  //     CRITICAL
  // )
  public static boolean misc_keywords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "misc_keywords")) return false;
    if (!nextTokenIs(b, CRITICAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CRITICAL);
    exit_section_(b, m, MISC_KEYWORDS, r);
    return r;
  }

  /* ********************************************************** */
  // INTERNAL | STATIC | ABSTRACT | OVERRIDE | VIRTUAL | UNOWNED
  public static boolean modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODIFIERS, "<modifiers>");
    r = consumeToken(b, INTERNAL);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, OVERRIDE);
    if (!r) r = consumeToken(b, VIRTUAL);
    if (!r) r = consumeToken(b, UNOWNED);
    exit_section_(b, l, m, r, false, null);
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
  // PLUS | MULTIPLY | DIVIDE | MINUS | INCREMENT | DECREMENT | MODULO
  public static boolean operators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operators")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATORS, "<operators>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MULTIPLY);
    if (!r) r = consumeToken(b, DIVIDE);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    if (!r) r = consumeToken(b, MODULO);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // variable_types IDENTIFIER
  static boolean parameter_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_types(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (parameter_declaration (COMMA parameter_declaration)*)?
  static boolean parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list")) return false;
    parameter_list_0(b, l + 1);
    return true;
  }

  // parameter_declaration (COMMA parameter_declaration)*
  private static boolean parameter_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_declaration(b, l + 1);
    r = r && parameter_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA parameter_declaration)*
  private static boolean parameter_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameter_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameter_list_0_1", c)) break;
    }
    return true;
  }

  // COMMA parameter_declaration
  private static boolean parameter_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VOID | [value_types]
  public static boolean return_types(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_types")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_TYPES, "<return types>");
    r = consumeToken(b, VOID);
    if (!r) r = return_types_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [value_types]
  private static boolean return_types_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_types_1")) return false;
    value_types(b, l + 1);
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
    if (!r) r = tokens(b, l + 1);
    return r;
  }

  // ";"?
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // expression semicolon ';'*
  public static boolean statement_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_EXPRESSION, "<statement expression>");
    r = expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && statement_expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ';'*
  private static boolean statement_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, SEMICOLON)) break;
      if (!empty_element_parsed_guard_(b, "statement_expression_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // block_or_statement
  static boolean then_branch(PsiBuilder b, int l) {
    return block_or_statement(b, l + 1);
  }

  /* ********************************************************** */
  // WHITE_SPACE | SEMICOLON | COMMA | DOT | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET |
  //     AT | QUESTION_MARK | COLON
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
    if (!r) r = consumeToken(b, LBRACKET);
    if (!r) r = consumeToken(b, RBRACKET);
    if (!r) r = consumeToken(b, AT);
    if (!r) r = consumeToken(b, QUESTION_MARK);
    if (!r) r = consumeToken(b, COLON);
    return r;
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
    if (!r) r = value_types(b, l + 1);
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
    if (!r) r = value_types(b, l + 1);
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

  /* ********************************************************** */
  // CHAR | UCHAR | UNICHAR | INT | UINT | LONG | ULONG | SHORT | USHORT | INT8 | INT16 | INT32 | INT64 |
  //     UINT8 | UINT16 | UINT32 | UINT64 | FLOAT | DOUBLE | BOOL | TRUE | FALSE | VAR | NULL | REFERENCE | POINTER |
  //     STRING
  public static boolean value_types(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_types")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_TYPES, "<value types>");
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
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, REFERENCE);
    if (!r) r = consumeToken(b, POINTER);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PUBLIC | PROTECTED | PRIVATE
  public static boolean variable_access_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_access_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_ACCESS_MODIFIERS, "<variable access modifiers>");
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, PROTECTED);
    if (!r) r = consumeToken(b, PRIVATE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CHAR | UCHAR | UNICHAR | INT | UINT | LONG | ULONG | SHORT | USHORT | INT8 | INT16 | INT32 | INT64 |
  //         UINT8 | UINT16 | UINT32 | UINT64 | FLOAT | DOUBLE | BOOL | STRING
  public static boolean variable_types(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_types")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_TYPES, "<variable types>");
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
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
