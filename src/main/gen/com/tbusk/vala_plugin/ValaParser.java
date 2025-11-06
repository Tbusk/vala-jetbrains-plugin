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
    return input(b, l + 1);
  }

  /* ********************************************************** */
  // private | protected | internal | public
  public static boolean access_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACCESS_MODIFIER, "<access modifier>");
    r = consumeToken(b, PRIVATE);
    if (!r) r = consumeToken(b, PROTECTED);
    if (!r) r = consumeToken(b, INTERNAL);
    if (!r) r = consumeToken(b, PUBLIC);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // multiplicative_expression [ (( PLUS | MINUS ) multiplicative_expression)* ]
  public static boolean additive_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDITIVE_EXPRESSION, "<additive expression>");
    r = multiplicative_expression(b, l + 1);
    r = r && additive_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (( PLUS | MINUS ) multiplicative_expression)* ]
  private static boolean additive_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_expression_1")) return false;
    additive_expression_1_0(b, l + 1);
    return true;
  }

  // (( PLUS | MINUS ) multiplicative_expression)*
  private static boolean additive_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!additive_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "additive_expression_1_0", c)) break;
    }
    return true;
  }

  // ( PLUS | MINUS ) multiplicative_expression
  private static boolean additive_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additive_expression_1_0_0_0(b, l + 1);
    r = r && multiplicative_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS | MINUS
  private static boolean additive_expression_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_expression_1_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // equality_expression [ ( AND equality_expression )* ]
  public static boolean and_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_EXPRESSION, "<and expression>");
    r = equality_expression(b, l + 1);
    r = r && and_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ( AND equality_expression )* ]
  private static boolean and_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expression_1")) return false;
    and_expression_1_0(b, l + 1);
    return true;
  }

  // ( AND equality_expression )*
  private static boolean and_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!and_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "and_expression_1_0", c)) break;
    }
    return true;
  }

  // AND equality_expression
  private static boolean and_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && equality_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ref | out] (expression | identifier COLON expression | identifier)
  public static boolean argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT, "<argument>");
    r = argument_0(b, l + 1);
    r = r && argument_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ref | out]
  private static boolean argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_0")) return false;
    argument_0_0(b, l + 1);
    return true;
  }

  // ref | out
  private static boolean argument_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_0_0")) return false;
    boolean r;
    r = consumeToken(b, REF);
    if (!r) r = consumeToken(b, OUT);
    return r;
  }

  // expression | identifier COLON expression | identifier
  private static boolean argument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    if (!r) r = argument_1_1(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier COLON expression
  private static boolean argument_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( named_argument | argument) [ (COMMA (named_argument | argument))* ]
  public static boolean arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENTS, "<arguments>");
    r = arguments_0(b, l + 1);
    r = r && arguments_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // named_argument | argument
  private static boolean arguments_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_0")) return false;
    boolean r;
    r = named_argument(b, l + 1);
    if (!r) r = argument(b, l + 1);
    return r;
  }

  // [ (COMMA (named_argument | argument))* ]
  private static boolean arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1")) return false;
    arguments_1_0(b, l + 1);
    return true;
  }

  // (COMMA (named_argument | argument))*
  private static boolean arguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arguments_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arguments_1_0", c)) break;
    }
    return true;
  }

  // COMMA (named_argument | argument)
  private static boolean arguments_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && arguments_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // named_argument | argument
  private static boolean arguments_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1_0_0_1")) return false;
    boolean r;
    r = named_argument(b, l + 1);
    if (!r) r = argument(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // [ (LBRACKET RBRACKET)* ] [ LBRACKET [ array_size ] RBRACKET ] [ initializer ]
  public static boolean array_creation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_CREATION_EXPRESSION, "<array creation expression>");
    r = array_creation_expression_0(b, l + 1);
    r = r && array_creation_expression_1(b, l + 1);
    r = r && array_creation_expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (LBRACKET RBRACKET)* ]
  private static boolean array_creation_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_0")) return false;
    array_creation_expression_0_0(b, l + 1);
    return true;
  }

  // (LBRACKET RBRACKET)*
  private static boolean array_creation_expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_creation_expression_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_creation_expression_0_0", c)) break;
    }
    return true;
  }

  // LBRACKET RBRACKET
  private static boolean array_creation_expression_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ LBRACKET [ array_size ] RBRACKET ]
  private static boolean array_creation_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_1")) return false;
    array_creation_expression_1_0(b, l + 1);
    return true;
  }

  // LBRACKET [ array_size ] RBRACKET
  private static boolean array_creation_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && array_creation_expression_1_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ array_size ]
  private static boolean array_creation_expression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_1_0_1")) return false;
    array_size(b, l + 1);
    return true;
  }

  // [ initializer ]
  private static boolean array_creation_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_2")) return false;
    initializer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (expression | COMMA) [ (COMMA | COMMA expression)* ]
  public static boolean array_size(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_size")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_SIZE, "<array size>");
    r = array_size_0(b, l + 1);
    r = r && array_size_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expression | COMMA
  private static boolean array_size_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_size_0")) return false;
    boolean r;
    r = expression(b, l + 1);
    if (!r) r = consumeToken(b, COMMA);
    return r;
  }

  // [ (COMMA | COMMA expression)* ]
  private static boolean array_size_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_size_1")) return false;
    array_size_1_0(b, l + 1);
    return true;
  }

  // (COMMA | COMMA expression)*
  private static boolean array_size_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_size_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_size_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_size_1_0", c)) break;
    }
    return true;
  }

  // COMMA | COMMA expression
  private static boolean array_size_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_size_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = array_size_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA expression
  private static boolean array_size_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_size_1_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET [[(array_size | member | expression)] [(COLON) | (COMMA)*] [(array_size | member | expression)] ] RBRACKET [ QUESTION_MARK ]
  public static boolean array_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && array_type_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    r = r && array_type_3(b, l + 1);
    exit_section_(b, m, ARRAY_TYPE, r);
    return r;
  }

  // [[(array_size | member | expression)] [(COLON) | (COMMA)*] [(array_size | member | expression)] ]
  private static boolean array_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_1")) return false;
    array_type_1_0(b, l + 1);
    return true;
  }

  // [(array_size | member | expression)] [(COLON) | (COMMA)*] [(array_size | member | expression)]
  private static boolean array_type_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_type_1_0_0(b, l + 1);
    r = r && array_type_1_0_1(b, l + 1);
    r = r && array_type_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [(array_size | member | expression)]
  private static boolean array_type_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_1_0_0")) return false;
    array_type_1_0_0_0(b, l + 1);
    return true;
  }

  // array_size | member | expression
  private static boolean array_type_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_1_0_0_0")) return false;
    boolean r;
    r = array_size(b, l + 1);
    if (!r) r = member(b, l + 1);
    if (!r) r = expression(b, l + 1);
    return r;
  }

  // [(COLON) | (COMMA)*]
  private static boolean array_type_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_1_0_1")) return false;
    array_type_1_0_1_0(b, l + 1);
    return true;
  }

  // (COLON) | (COMMA)*
  private static boolean array_type_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    if (!r) r = array_type_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA)*
  private static boolean array_type_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_1_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "array_type_1_0_1_0_1", c)) break;
    }
    return true;
  }

  // [(array_size | member | expression)]
  private static boolean array_type_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_1_0_2")) return false;
    array_type_1_0_2_0(b, l + 1);
    return true;
  }

  // array_size | member | expression
  private static boolean array_type_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_1_0_2_0")) return false;
    boolean r;
    r = array_size(b, l + 1);
    if (!r) r = member(b, l + 1);
    if (!r) r = expression(b, l + 1);
    return r;
  }

  // [ QUESTION_MARK ]
  private static boolean array_type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_3")) return false;
    consumeToken(b, QUESTION_MARK);
    return true;
  }

  /* ********************************************************** */
  // EQUALS | PIPE_EQUALS | PLUS_EQUALS | MINUS_EQUALS | AND_EQUALS | XOR_EQUALS | DIVIDE_EQUALS | MULTIPLY_EQUALS | MODULO_EQUALS | SHIFT_LEFT_EQUALS | SHIFT_RIGHT_EQUALS
  public static boolean assignment_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_OPERATOR, "<assignment operator>");
    r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, PIPE_EQUALS);
    if (!r) r = consumeToken(b, PLUS_EQUALS);
    if (!r) r = consumeToken(b, MINUS_EQUALS);
    if (!r) r = consumeToken(b, AND_EQUALS);
    if (!r) r = consumeToken(b, XOR_EQUALS);
    if (!r) r = consumeToken(b, DIVIDE_EQUALS);
    if (!r) r = consumeToken(b, MULTIPLY_EQUALS);
    if (!r) r = consumeToken(b, MODULO_EQUALS);
    if (!r) r = consumeToken(b, SHIFT_LEFT_EQUALS);
    if (!r) r = consumeToken(b, SHIFT_RIGHT_EQUALS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET identifier [ attribute_arguments ] [ (COMMA identifier [ attribute_arguments ])* ] RBRACKET
  public static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && identifier(b, l + 1);
    r = r && attribute_2(b, l + 1);
    r = r && attribute_3(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, ATTRIBUTE, r);
    return r;
  }

  // [ attribute_arguments ]
  private static boolean attribute_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_2")) return false;
    attribute_arguments(b, l + 1);
    return true;
  }

  // [ (COMMA identifier [ attribute_arguments ])* ]
  private static boolean attribute_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_3")) return false;
    attribute_3_0(b, l + 1);
    return true;
  }

  // (COMMA identifier [ attribute_arguments ])*
  private static boolean attribute_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_3_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!attribute_3_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attribute_3_0", c)) break;
    }
    return true;
  }

  // COMMA identifier [ attribute_arguments ]
  private static boolean attribute_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    r = r && attribute_3_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ attribute_arguments ]
  private static boolean attribute_3_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_3_0_0_2")) return false;
    attribute_arguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier EQUALS expression
  public static boolean attribute_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_ARGUMENT, "<attribute argument>");
    r = identifier(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LPAREN [attribute_argument [ (COMMA attribute_argument)* ] ] RPAREN
  public static boolean attribute_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arguments")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && attribute_arguments_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, ATTRIBUTE_ARGUMENTS, r);
    return r;
  }

  // [attribute_argument [ (COMMA attribute_argument)* ] ]
  private static boolean attribute_arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arguments_1")) return false;
    attribute_arguments_1_0(b, l + 1);
    return true;
  }

  // attribute_argument [ (COMMA attribute_argument)* ]
  private static boolean attribute_arguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute_argument(b, l + 1);
    r = r && attribute_arguments_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ (COMMA attribute_argument)* ]
  private static boolean attribute_arguments_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arguments_1_0_1")) return false;
    attribute_arguments_1_0_1_0(b, l + 1);
    return true;
  }

  // (COMMA attribute_argument)*
  private static boolean attribute_arguments_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arguments_1_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!attribute_arguments_1_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attribute_arguments_1_0_1_0", c)) break;
    }
    return true;
  }

  // COMMA attribute_argument
  private static boolean attribute_arguments_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arguments_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && attribute_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attribute*
  public static boolean attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes")) return false;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTES, "<attributes>");
    while (true) {
      int c = current_position_(b);
      if (!attribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attributes", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // base
  public static boolean base_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_access")) return false;
    if (!nextTokenIs(b, BASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BASE);
    exit_section_(b, m, BASE_ACCESS, r);
    return r;
  }

  /* ********************************************************** */
  // (type | type_with_parenthesis) [type_arguments] [ (COMMA (type | type_with_parenthesis) [type_arguments])* ]
  public static boolean base_types(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_types")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASE_TYPES, "<base types>");
    r = base_types_0(b, l + 1);
    r = r && base_types_1(b, l + 1);
    r = r && base_types_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type | type_with_parenthesis
  private static boolean base_types_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_types_0")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    return r;
  }

  // [type_arguments]
  private static boolean base_types_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_types_1")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  // [ (COMMA (type | type_with_parenthesis) [type_arguments])* ]
  private static boolean base_types_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_types_2")) return false;
    base_types_2_0(b, l + 1);
    return true;
  }

  // (COMMA (type | type_with_parenthesis) [type_arguments])*
  private static boolean base_types_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_types_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!base_types_2_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "base_types_2_0", c)) break;
    }
    return true;
  }

  // COMMA (type | type_with_parenthesis) [type_arguments]
  private static boolean base_types_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_types_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && base_types_2_0_0_1(b, l + 1);
    r = r && base_types_2_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type | type_with_parenthesis
  private static boolean base_types_2_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_types_2_0_0_1")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    return r;
  }

  // [type_arguments]
  private static boolean base_types_2_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_types_2_0_0_2")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACE statement* RBRACE
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && block_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, BLOCK, r);
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
  // break SEMICOLON
  public static boolean break_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_statement")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BREAK, SEMICOLON);
    exit_section_(b, m, BREAK_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // catch [ LPAREN (type_weak | type_weak_with_parenthesis) identifier RPAREN ] block
  public static boolean catch_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clause")) return false;
    if (!nextTokenIs(b, CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CATCH);
    r = r && catch_clause_1(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, m, CATCH_CLAUSE, r);
    return r;
  }

  // [ LPAREN (type_weak | type_weak_with_parenthesis) identifier RPAREN ]
  private static boolean catch_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clause_1")) return false;
    catch_clause_1_0(b, l + 1);
    return true;
  }

  // LPAREN (type_weak | type_weak_with_parenthesis) identifier RPAREN
  private static boolean catch_clause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && catch_clause_1_0_1(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_weak | type_weak_with_parenthesis
  private static boolean catch_clause_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clause_1_0_1")) return false;
    boolean r;
    r = type_weak(b, l + 1);
    if (!r) r = type_weak_with_parenthesis(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // catch_clause (catch_clause)* [finally_clause]
  public static boolean catch_clauses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clauses")) return false;
    if (!nextTokenIs(b, CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catch_clause(b, l + 1);
    r = r && catch_clauses_1(b, l + 1);
    r = r && catch_clauses_2(b, l + 1);
    exit_section_(b, m, CATCH_CLAUSES, r);
    return r;
  }

  // (catch_clause)*
  private static boolean catch_clauses_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clauses_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!catch_clauses_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "catch_clauses_1", c)) break;
    }
    return true;
  }

  // (catch_clause)
  private static boolean catch_clauses_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clauses_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catch_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [finally_clause]
  private static boolean catch_clauses_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clauses_2")) return false;
    finally_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ type_declaration_modifiers ] class symbol [ type_arguments ]
  //                       [ COLON base_types ] LBRACE class_member* RBRACE
  public static boolean class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = class_declaration_0(b, l + 1);
    r = r && class_declaration_1(b, l + 1);
    r = r && consumeToken(b, CLASS);
    r = r && symbol(b, l + 1);
    r = r && class_declaration_4(b, l + 1);
    r = r && class_declaration_5(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && class_declaration_7(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ access_modifier ]
  private static boolean class_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_0")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // [ type_declaration_modifiers ]
  private static boolean class_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_1")) return false;
    type_declaration_modifiers(b, l + 1);
    return true;
  }

  // [ type_arguments ]
  private static boolean class_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_4")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  // [ COLON base_types ]
  private static boolean class_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_5")) return false;
    class_declaration_5_0(b, l + 1);
    return true;
  }

  // COLON base_types
  private static boolean class_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && base_types(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // class_member*
  private static boolean class_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!class_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_declaration_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ attributes ]
  //                  ( class_declaration |
  //                    interface_declaration |
  //                    struct_declaration |
  //                    enum_declaration |
  //                    creation_method_declaration |
  //                    method_declaration |
  //                    delegate_declaration |
  //                    property_declaration |
  //                    signal_declaration |
  //                    field_declaration |
  //                    constant_declaration |
  //                    constructor_declaration |
  //                    destructor_declaration)
  public static boolean class_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_MEMBER, "<class member>");
    r = class_member_0(b, l + 1);
    r = r && class_member_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ attributes ]
  private static boolean class_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_member_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // class_declaration |
  //                    interface_declaration |
  //                    struct_declaration |
  //                    enum_declaration |
  //                    creation_method_declaration |
  //                    method_declaration |
  //                    delegate_declaration |
  //                    property_declaration |
  //                    signal_declaration |
  //                    field_declaration |
  //                    constant_declaration |
  //                    constructor_declaration |
  //                    destructor_declaration
  private static boolean class_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_member_1")) return false;
    boolean r;
    r = class_declaration(b, l + 1);
    if (!r) r = interface_declaration(b, l + 1);
    if (!r) r = struct_declaration(b, l + 1);
    if (!r) r = enum_declaration(b, l + 1);
    if (!r) r = creation_method_declaration(b, l + 1);
    if (!r) r = method_declaration(b, l + 1);
    if (!r) r = delegate_declaration(b, l + 1);
    if (!r) r = property_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = field_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = constructor_declaration(b, l + 1);
    if (!r) r = destructor_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // conditional_or_expression [ (COALESCING coalescing_expression)* ]
  public static boolean coalescing_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coalescing_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COALESCING_EXPRESSION, "<coalescing expression>");
    r = conditional_or_expression(b, l + 1);
    r = r && coalescing_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (COALESCING coalescing_expression)* ]
  private static boolean coalescing_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coalescing_expression_1")) return false;
    coalescing_expression_1_0(b, l + 1);
    return true;
  }

  // (COALESCING coalescing_expression)*
  private static boolean coalescing_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coalescing_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!coalescing_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "coalescing_expression_1_0", c)) break;
    }
    return true;
  }

  // COALESCING coalescing_expression
  private static boolean coalescing_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "coalescing_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COALESCING);
    r = r && coalescing_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // in_expression [ (AND_AND in_expression)* ]
  public static boolean conditional_and_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_and_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_AND_EXPRESSION, "<conditional and expression>");
    r = in_expression(b, l + 1);
    r = r && conditional_and_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (AND_AND in_expression)* ]
  private static boolean conditional_and_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_and_expression_1")) return false;
    conditional_and_expression_1_0(b, l + 1);
    return true;
  }

  // (AND_AND in_expression)*
  private static boolean conditional_and_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_and_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conditional_and_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditional_and_expression_1_0", c)) break;
    }
    return true;
  }

  // AND_AND in_expression
  private static boolean conditional_and_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_and_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND_AND);
    r = r && in_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // coalescing_expression [ (QUESTION_MARK expression COLON expression)* ]
  public static boolean conditional_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_EXPRESSION, "<conditional expression>");
    r = coalescing_expression(b, l + 1);
    r = r && conditional_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (QUESTION_MARK expression COLON expression)* ]
  private static boolean conditional_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression_1")) return false;
    conditional_expression_1_0(b, l + 1);
    return true;
  }

  // (QUESTION_MARK expression COLON expression)*
  private static boolean conditional_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conditional_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditional_expression_1_0", c)) break;
    }
    return true;
  }

  // QUESTION_MARK expression COLON expression
  private static boolean conditional_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUESTION_MARK);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // conditional_and_expression [ (OR_OR conditional_and_expression)* ]
  public static boolean conditional_or_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_or_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_OR_EXPRESSION, "<conditional or expression>");
    r = conditional_and_expression(b, l + 1);
    r = r && conditional_or_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (OR_OR conditional_and_expression)* ]
  private static boolean conditional_or_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_or_expression_1")) return false;
    conditional_or_expression_1_0(b, l + 1);
    return true;
  }

  // (OR_OR conditional_and_expression)*
  private static boolean conditional_or_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_or_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conditional_or_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditional_or_expression_1_0", c)) break;
    }
    return true;
  }

  // OR_OR conditional_and_expression
  private static boolean conditional_or_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_or_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR_OR);
    r = r && conditional_and_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ member_declaration_modifiers ] const (type [ inline_array_type ]) (identifier [ inline_array_type ])
  //                          [ EQUALS expression ] [COMMA identifier [ inline_array_type ][ EQUALS expression ]] SEMICOLON
  public static boolean constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_DECLARATION, "<constant declaration>");
    r = constant_declaration_0(b, l + 1);
    r = r && constant_declaration_1(b, l + 1);
    r = r && consumeToken(b, CONST);
    r = r && constant_declaration_3(b, l + 1);
    r = r && constant_declaration_4(b, l + 1);
    r = r && constant_declaration_5(b, l + 1);
    r = r && constant_declaration_6(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ access_modifier ]
  private static boolean constant_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_0")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // [ member_declaration_modifiers ]
  private static boolean constant_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_1")) return false;
    member_declaration_modifiers(b, l + 1);
    return true;
  }

  // type [ inline_array_type ]
  private static boolean constant_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && constant_declaration_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ inline_array_type ]
  private static boolean constant_declaration_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_3_1")) return false;
    inline_array_type(b, l + 1);
    return true;
  }

  // identifier [ inline_array_type ]
  private static boolean constant_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && constant_declaration_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ inline_array_type ]
  private static boolean constant_declaration_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_4_1")) return false;
    inline_array_type(b, l + 1);
    return true;
  }

  // [ EQUALS expression ]
  private static boolean constant_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_5")) return false;
    constant_declaration_5_0(b, l + 1);
    return true;
  }

  // EQUALS expression
  private static boolean constant_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA identifier [ inline_array_type ][ EQUALS expression ]]
  private static boolean constant_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_6")) return false;
    constant_declaration_6_0(b, l + 1);
    return true;
  }

  // COMMA identifier [ inline_array_type ][ EQUALS expression ]
  private static boolean constant_declaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    r = r && constant_declaration_6_0_2(b, l + 1);
    r = r && constant_declaration_6_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ inline_array_type ]
  private static boolean constant_declaration_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_6_0_2")) return false;
    inline_array_type(b, l + 1);
    return true;
  }

  // [ EQUALS expression ]
  private static boolean constant_declaration_6_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_6_0_3")) return false;
    constant_declaration_6_0_3_0(b, l + 1);
    return true;
  }

  // EQUALS expression
  private static boolean constant_declaration_6_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_6_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ constructor_declaration_modifiers ] construct block
  public static boolean constructor_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR_DECLARATION, "<constructor declaration>");
    r = constructor_declaration_0(b, l + 1);
    r = r && consumeToken(b, CONSTRUCT);
    r = r && block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ constructor_declaration_modifiers ]
  private static boolean constructor_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declaration_0")) return false;
    constructor_declaration_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // async | class | extern | inline | static | abstract | virtual | override
  public static boolean constructor_declaration_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declaration_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR_DECLARATION_MODIFIER, "<constructor declaration modifier>");
    r = consumeToken(b, ASYNC);
    if (!r) r = consumeToken(b, CLASS);
    if (!r) r = consumeToken(b, EXTERN);
    if (!r) r = consumeToken(b, INLINE);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, VIRTUAL);
    if (!r) r = consumeToken(b, OVERRIDE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // constructor_declaration_modifier [ ( constructor_declaration_modifier )* ]
  public static boolean constructor_declaration_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declaration_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR_DECLARATION_MODIFIERS, "<constructor declaration modifiers>");
    r = constructor_declaration_modifier(b, l + 1);
    r = r && constructor_declaration_modifiers_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ( constructor_declaration_modifier )* ]
  private static boolean constructor_declaration_modifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declaration_modifiers_1")) return false;
    constructor_declaration_modifiers_1_0(b, l + 1);
    return true;
  }

  // ( constructor_declaration_modifier )*
  private static boolean constructor_declaration_modifiers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declaration_modifiers_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!constructor_declaration_modifiers_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constructor_declaration_modifiers_1_0", c)) break;
    }
    return true;
  }

  // ( constructor_declaration_modifier )
  private static boolean constructor_declaration_modifiers_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declaration_modifiers_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constructor_declaration_modifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // continue SEMICOLON
  public static boolean continue_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_statement")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONTINUE, SEMICOLON);
    exit_section_(b, m, CONTINUE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ constructor_declaration_modifiers ] member
  //                                 LPAREN [ parameters ] RPAREN [ throws_statement ] [ requires_statement ] [ ensures_statement ] ( SEMICOLON | block )
  public static boolean creation_method_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_method_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CREATION_METHOD_DECLARATION, "<creation method declaration>");
    r = creation_method_declaration_0(b, l + 1);
    r = r && creation_method_declaration_1(b, l + 1);
    r = r && member(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && creation_method_declaration_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && creation_method_declaration_6(b, l + 1);
    r = r && creation_method_declaration_7(b, l + 1);
    r = r && creation_method_declaration_8(b, l + 1);
    r = r && creation_method_declaration_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ access_modifier ]
  private static boolean creation_method_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_method_declaration_0")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // [ constructor_declaration_modifiers ]
  private static boolean creation_method_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_method_declaration_1")) return false;
    constructor_declaration_modifiers(b, l + 1);
    return true;
  }

  // [ parameters ]
  private static boolean creation_method_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_method_declaration_4")) return false;
    parameters(b, l + 1);
    return true;
  }

  // [ throws_statement ]
  private static boolean creation_method_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_method_declaration_6")) return false;
    throws_statement(b, l + 1);
    return true;
  }

  // [ requires_statement ]
  private static boolean creation_method_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_method_declaration_7")) return false;
    requires_statement(b, l + 1);
    return true;
  }

  // [ ensures_statement ]
  private static boolean creation_method_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_method_declaration_8")) return false;
    ensures_statement(b, l + 1);
    return true;
  }

  // SEMICOLON | block
  private static boolean creation_method_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_method_declaration_9")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = block(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // private | protected | internal | public
  static boolean delegate_access_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_access_modifiers")) return false;
    boolean r;
    r = consumeToken(b, PRIVATE);
    if (!r) r = consumeToken(b, PROTECTED);
    if (!r) r = consumeToken(b, INTERNAL);
    if (!r) r = consumeToken(b, PUBLIC);
    return r;
  }

  /* ********************************************************** */
  // [ delegate_access_modifiers ] [ delegate_declaration_modifiers ] [delegate] (type | type_with_parenthesis) symbol [ type_parameters ]
  //                          LPAREN [ parameters ] RPAREN [ throws_statement ] (SEMICOLON | block)
  public static boolean delegate_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELEGATE_DECLARATION, "<delegate declaration>");
    r = delegate_declaration_0(b, l + 1);
    r = r && delegate_declaration_1(b, l + 1);
    r = r && delegate_declaration_2(b, l + 1);
    r = r && delegate_declaration_3(b, l + 1);
    r = r && symbol(b, l + 1);
    r = r && delegate_declaration_5(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && delegate_declaration_7(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && delegate_declaration_9(b, l + 1);
    r = r && delegate_declaration_10(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ delegate_access_modifiers ]
  private static boolean delegate_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_0")) return false;
    delegate_access_modifiers(b, l + 1);
    return true;
  }

  // [ delegate_declaration_modifiers ]
  private static boolean delegate_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_1")) return false;
    delegate_declaration_modifiers(b, l + 1);
    return true;
  }

  // [delegate]
  private static boolean delegate_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_2")) return false;
    consumeToken(b, DELEGATE);
    return true;
  }

  // type | type_with_parenthesis
  private static boolean delegate_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_3")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    return r;
  }

  // [ type_parameters ]
  private static boolean delegate_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_5")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // [ parameters ]
  private static boolean delegate_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_7")) return false;
    parameters(b, l + 1);
    return true;
  }

  // [ throws_statement ]
  private static boolean delegate_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_9")) return false;
    throws_statement(b, l + 1);
    return true;
  }

  // SEMICOLON | block
  private static boolean delegate_declaration_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_10")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = block(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // abstract | async | class | extern | inline | override | sealed | static | virtual
  static boolean delegate_declaration_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_modifier")) return false;
    boolean r;
    r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, ASYNC);
    if (!r) r = consumeToken(b, CLASS);
    if (!r) r = consumeToken(b, EXTERN);
    if (!r) r = consumeToken(b, INLINE);
    if (!r) r = consumeToken(b, OVERRIDE);
    if (!r) r = consumeToken(b, SEALED);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, VIRTUAL);
    return r;
  }

  /* ********************************************************** */
  // delegate_declaration_modifier [ (delegate_declaration_modifier)* ]
  static boolean delegate_declaration_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = delegate_declaration_modifier(b, l + 1);
    r = r && delegate_declaration_modifiers_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ (delegate_declaration_modifier)* ]
  private static boolean delegate_declaration_modifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_modifiers_1")) return false;
    delegate_declaration_modifiers_1_0(b, l + 1);
    return true;
  }

  // (delegate_declaration_modifier)*
  private static boolean delegate_declaration_modifiers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_modifiers_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!delegate_declaration_modifiers_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "delegate_declaration_modifiers_1_0", c)) break;
    }
    return true;
  }

  // (delegate_declaration_modifier)
  private static boolean delegate_declaration_modifiers_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_modifiers_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = delegate_declaration_modifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // delete expression SEMICOLON
  public static boolean delete_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_statement")) return false;
    if (!nextTokenIs(b, DELETE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DELETE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, DELETE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // [ constructor_declaration_modifiers ] TILDE identifier LPAREN RPAREN block
  public static boolean destructor_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "destructor_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DESTRUCTOR_DECLARATION, "<destructor declaration>");
    r = destructor_declaration_0(b, l + 1);
    r = r && consumeToken(b, TILDE);
    r = r && identifier(b, l + 1);
    r = r && consumeTokens(b, 0, LPAREN, RPAREN);
    r = r && block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ constructor_declaration_modifiers ]
  private static boolean destructor_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "destructor_declaration_0")) return false;
    constructor_declaration_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // do embedded_statement while LPAREN expression RPAREN SEMICOLON
  public static boolean do_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_statement")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO);
    r = r && embedded_statement(b, l + 1);
    r = r && consumeTokens(b, 0, WHILE, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, SEMICOLON);
    exit_section_(b, m, DO_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET [[expression] ( (COLON [expression]) | (COMMA expression)*)] RBRACKET
  public static boolean element_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_access")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && element_access_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, ELEMENT_ACCESS, r);
    return r;
  }

  // [[expression] ( (COLON [expression]) | (COMMA expression)*)]
  private static boolean element_access_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_access_1")) return false;
    element_access_1_0(b, l + 1);
    return true;
  }

  // [expression] ( (COLON [expression]) | (COMMA expression)*)
  private static boolean element_access_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_access_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = element_access_1_0_0(b, l + 1);
    r = r && element_access_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [expression]
  private static boolean element_access_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_access_1_0_0")) return false;
    expression(b, l + 1);
    return true;
  }

  // (COLON [expression]) | (COMMA expression)*
  private static boolean element_access_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_access_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = element_access_1_0_1_0(b, l + 1);
    if (!r) r = element_access_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON [expression]
  private static boolean element_access_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_access_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && element_access_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [expression]
  private static boolean element_access_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_access_1_0_1_0_1")) return false;
    expression(b, l + 1);
    return true;
  }

  // (COMMA expression)*
  private static boolean element_access_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_access_1_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!element_access_1_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "element_access_1_0_1_1", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean element_access_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_access_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // block | embedded_statement_without_block
  public static boolean embedded_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "embedded_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EMBEDDED_STATEMENT, "<embedded statement>");
    r = block(b, l + 1);
    if (!r) r = embedded_statement_without_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SEMICOLON | object_or_array_creation_expression | yield_statement | throw_statement | with_statement | if_statement | switch_statement | while_statement | for_statement |
  //                                      foreach_statement | break_statement | continue_statement | return_statement | method_declaration | local_variable_declarations |
  //                                      try_statement | delete_statement | expression_statement | lock_statement | unlock_statement | constant_declaration
  public static boolean embedded_statement_without_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "embedded_statement_without_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EMBEDDED_STATEMENT_WITHOUT_BLOCK, "<embedded statement without block>");
    r = consumeToken(b, SEMICOLON);
    if (!r) r = object_or_array_creation_expression(b, l + 1);
    if (!r) r = yield_statement(b, l + 1);
    if (!r) r = throw_statement(b, l + 1);
    if (!r) r = with_statement(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = switch_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = foreach_statement(b, l + 1);
    if (!r) r = break_statement(b, l + 1);
    if (!r) r = continue_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = method_declaration(b, l + 1);
    if (!r) r = local_variable_declarations(b, l + 1);
    if (!r) r = try_statement(b, l + 1);
    if (!r) r = delete_statement(b, l + 1);
    if (!r) r = expression_statement(b, l + 1);
    if (!r) r = lock_statement(b, l + 1);
    if (!r) r = unlock_statement(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ensures LPAREN expression RPAREN [ ensures_statement ]
  public static boolean ensures_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ensures_statement")) return false;
    if (!nextTokenIs(b, ENSURES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENSURES, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && ensures_statement_4(b, l + 1);
    exit_section_(b, m, ENSURES_STATEMENT, r);
    return r;
  }

  // [ ensures_statement ]
  private static boolean ensures_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ensures_statement_4")) return false;
    ensures_statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ enum_type_declaration_modifiers ] enum symbol
  //                      LBRACE enumvalues [ SEMICOLON [ enum_member* ] ] RBRACE
  public static boolean enum_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DECLARATION, "<enum declaration>");
    r = enum_declaration_0(b, l + 1);
    r = r && enum_declaration_1(b, l + 1);
    r = r && consumeToken(b, ENUM);
    r = r && symbol(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && enumvalues(b, l + 1);
    r = r && enum_declaration_6(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ access_modifier ]
  private static boolean enum_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_0")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // [ enum_type_declaration_modifiers ]
  private static boolean enum_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_1")) return false;
    enum_type_declaration_modifiers(b, l + 1);
    return true;
  }

  // [ SEMICOLON [ enum_member* ] ]
  private static boolean enum_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_6")) return false;
    enum_declaration_6_0(b, l + 1);
    return true;
  }

  // SEMICOLON [ enum_member* ]
  private static boolean enum_declaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    r = r && enum_declaration_6_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ enum_member* ]
  private static boolean enum_declaration_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_6_0_1")) return false;
    enum_declaration_6_0_1_0(b, l + 1);
    return true;
  }

  // enum_member*
  private static boolean enum_declaration_6_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_6_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_declaration_6_0_1_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [attributes] (constant_declaration | method_declaration)
  public static boolean enum_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_MEMBER, "<enum member>");
    r = enum_member_0(b, l + 1);
    r = r && enum_member_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean enum_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // constant_declaration | method_declaration
  private static boolean enum_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_1")) return false;
    boolean r;
    r = constant_declaration(b, l + 1);
    if (!r) r = method_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // abstract | extern | sealed
  static boolean enum_type_declaration_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_type_declaration_modifier")) return false;
    boolean r;
    r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, EXTERN);
    if (!r) r = consumeToken(b, SEALED);
    return r;
  }

  /* ********************************************************** */
  // enum_type_declaration_modifier [ enum_type_declaration_modifier* ]
  static boolean enum_type_declaration_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_type_declaration_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_type_declaration_modifier(b, l + 1);
    r = r && enum_type_declaration_modifiers_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ enum_type_declaration_modifier* ]
  private static boolean enum_type_declaration_modifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_type_declaration_modifiers_1")) return false;
    enum_type_declaration_modifiers_1_0(b, l + 1);
    return true;
  }

  // enum_type_declaration_modifier*
  private static boolean enum_type_declaration_modifiers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_type_declaration_modifiers_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_type_declaration_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_type_declaration_modifiers_1_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ attributes ] identifier [ EQUALS expression ]
  public static boolean enumvalue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumvalue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUMVALUE, "<enumvalue>");
    r = enumvalue_0(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && enumvalue_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ attributes ]
  private static boolean enumvalue_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumvalue_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [ EQUALS expression ]
  private static boolean enumvalue_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumvalue_2")) return false;
    enumvalue_2_0(b, l + 1);
    return true;
  }

  // EQUALS expression
  private static boolean enumvalue_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumvalue_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // enumvalue [ (COMMA enumvalue)* ] [ COMMA ]
  public static boolean enumvalues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumvalues")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUMVALUES, "<enumvalues>");
    r = enumvalue(b, l + 1);
    r = r && enumvalues_1(b, l + 1);
    r = r && enumvalues_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (COMMA enumvalue)* ]
  private static boolean enumvalues_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumvalues_1")) return false;
    enumvalues_1_0(b, l + 1);
    return true;
  }

  // (COMMA enumvalue)*
  private static boolean enumvalues_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumvalues_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enumvalues_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enumvalues_1_0", c)) break;
    }
    return true;
  }

  // COMMA enumvalue
  private static boolean enumvalues_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumvalues_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && enumvalue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ COMMA ]
  private static boolean enumvalues_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumvalues_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // relational_expression [( ( EQUALS_EQUALS | NOT_EQUALS ) relational_expression)* ]
  public static boolean equality_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUALITY_EXPRESSION, "<equality expression>");
    r = relational_expression(b, l + 1);
    r = r && equality_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [( ( EQUALS_EQUALS | NOT_EQUALS ) relational_expression)* ]
  private static boolean equality_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expression_1")) return false;
    equality_expression_1_0(b, l + 1);
    return true;
  }

  // ( ( EQUALS_EQUALS | NOT_EQUALS ) relational_expression)*
  private static boolean equality_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!equality_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "equality_expression_1_0", c)) break;
    }
    return true;
  }

  // ( EQUALS_EQUALS | NOT_EQUALS ) relational_expression
  private static boolean equality_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = equality_expression_1_0_0_0(b, l + 1);
    r = r && relational_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUALS_EQUALS | NOT_EQUALS
  private static boolean equality_expression_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expression_1_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, EQUALS_EQUALS);
    if (!r) r = consumeToken(b, NOT_EQUALS);
    return r;
  }

  /* ********************************************************** */
  // [ attributes ] identifier [ EQUALS expression ]
  public static boolean errorcode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errorcode")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ERRORCODE, "<errorcode>");
    r = errorcode_0(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && errorcode_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ attributes ]
  private static boolean errorcode_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errorcode_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [ EQUALS expression ]
  private static boolean errorcode_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errorcode_2")) return false;
    errorcode_2_0(b, l + 1);
    return true;
  }

  // EQUALS expression
  private static boolean errorcode_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errorcode_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // errorcode [ (COMMA errorcode)* [ COMMA ] ]
  public static boolean errorcodes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errorcodes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ERRORCODES, "<errorcodes>");
    r = errorcode(b, l + 1);
    r = r && errorcodes_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (COMMA errorcode)* [ COMMA ] ]
  private static boolean errorcodes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errorcodes_1")) return false;
    errorcodes_1_0(b, l + 1);
    return true;
  }

  // (COMMA errorcode)* [ COMMA ]
  private static boolean errorcodes_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errorcodes_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = errorcodes_1_0_0(b, l + 1);
    r = r && errorcodes_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA errorcode)*
  private static boolean errorcodes_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errorcodes_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!errorcodes_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "errorcodes_1_0_0", c)) break;
    }
    return true;
  }

  // COMMA errorcode
  private static boolean errorcodes_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errorcodes_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && errorcode(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ COMMA ]
  private static boolean errorcodes_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errorcodes_1_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // private | public | protected | internal
  static boolean errordomain_access_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errordomain_access_modifier")) return false;
    boolean r;
    r = consumeToken(b, PRIVATE);
    if (!r) r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, PROTECTED);
    if (!r) r = consumeToken(b, INTERNAL);
    return r;
  }

  /* ********************************************************** */
  // [ errordomain_access_modifier ] [ errordomain_type_declaration_modifiers ] errordomain symbol
  //                             LBRACE [errorcodes [SEMICOLON]] [ ( [attributes] method_declaration)* ] RBRACE
  public static boolean errordomain_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errordomain_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ERRORDOMAIN_DECLARATION, "<errordomain declaration>");
    r = errordomain_declaration_0(b, l + 1);
    r = r && errordomain_declaration_1(b, l + 1);
    r = r && consumeToken(b, ERRORDOMAIN);
    r = r && symbol(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && errordomain_declaration_5(b, l + 1);
    r = r && errordomain_declaration_6(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ errordomain_access_modifier ]
  private static boolean errordomain_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errordomain_declaration_0")) return false;
    errordomain_access_modifier(b, l + 1);
    return true;
  }

  // [ errordomain_type_declaration_modifiers ]
  private static boolean errordomain_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errordomain_declaration_1")) return false;
    errordomain_type_declaration_modifiers(b, l + 1);
    return true;
  }

  // [errorcodes [SEMICOLON]]
  private static boolean errordomain_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errordomain_declaration_5")) return false;
    errordomain_declaration_5_0(b, l + 1);
    return true;
  }

  // errorcodes [SEMICOLON]
  private static boolean errordomain_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errordomain_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = errorcodes(b, l + 1);
    r = r && errordomain_declaration_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SEMICOLON]
  private static boolean errordomain_declaration_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errordomain_declaration_5_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  // [ ( [attributes] method_declaration)* ]
  private static boolean errordomain_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errordomain_declaration_6")) return false;
    errordomain_declaration_6_0(b, l + 1);
    return true;
  }

  // ( [attributes] method_declaration)*
  private static boolean errordomain_declaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errordomain_declaration_6_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!errordomain_declaration_6_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "errordomain_declaration_6_0", c)) break;
    }
    return true;
  }

  // [attributes] method_declaration
  private static boolean errordomain_declaration_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errordomain_declaration_6_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = errordomain_declaration_6_0_0_0(b, l + 1);
    r = r && method_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [attributes]
  private static boolean errordomain_declaration_6_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errordomain_declaration_6_0_0_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // extern | abstract | partial | sealed
  static boolean errordomain_type_declaration_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "errordomain_type_declaration_modifiers")) return false;
    boolean r;
    r = consumeToken(b, EXTERN);
    if (!r) r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, PARTIAL);
    if (!r) r = consumeToken(b, SEALED);
    return r;
  }

  /* ********************************************************** */
  // and_expression [ ( CARET and_expression )* ]
  public static boolean exclusive_or_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclusive_or_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXCLUSIVE_OR_EXPRESSION, "<exclusive or expression>");
    r = and_expression(b, l + 1);
    r = r && exclusive_or_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ( CARET and_expression )* ]
  private static boolean exclusive_or_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclusive_or_expression_1")) return false;
    exclusive_or_expression_1_0(b, l + 1);
    return true;
  }

  // ( CARET and_expression )*
  private static boolean exclusive_or_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclusive_or_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exclusive_or_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exclusive_or_expression_1_0", c)) break;
    }
    return true;
  }

  // CARET and_expression
  private static boolean exclusive_or_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclusive_or_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CARET);
    r = r && and_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lambda_expression | ( conditional_expression [ assignment_operator expression ] )
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = lambda_expression(b, l + 1);
    if (!r) r = expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // conditional_expression [ assignment_operator expression ]
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conditional_expression(b, l + 1);
    r = r && expression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ assignment_operator expression ]
  private static boolean expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_1")) return false;
    expression_1_1_0(b, l + 1);
    return true;
  }

  // assignment_operator expression
  private static boolean expression_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment_operator(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statement_expression [SEMICOLON]
  public static boolean expression_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    r = statement_expression(b, l + 1);
    r = r && expression_statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [SEMICOLON]
  private static boolean expression_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_statement_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ member_declaration_modifiers ] [(type_weak | [unowned] type_weak_with_parenthesis)] field_declaration_section (COMMA field_declaration_section)* SEMICOLON
  public static boolean field_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_DECLARATION, "<field declaration>");
    r = field_declaration_0(b, l + 1);
    r = r && field_declaration_1(b, l + 1);
    r = r && field_declaration_2(b, l + 1);
    r = r && field_declaration_section(b, l + 1);
    r = r && field_declaration_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ access_modifier ]
  private static boolean field_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_0")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // [ member_declaration_modifiers ]
  private static boolean field_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_1")) return false;
    member_declaration_modifiers(b, l + 1);
    return true;
  }

  // [(type_weak | [unowned] type_weak_with_parenthesis)]
  private static boolean field_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_2")) return false;
    field_declaration_2_0(b, l + 1);
    return true;
  }

  // type_weak | [unowned] type_weak_with_parenthesis
  private static boolean field_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_weak(b, l + 1);
    if (!r) r = field_declaration_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [unowned] type_weak_with_parenthesis
  private static boolean field_declaration_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_declaration_2_0_1_0(b, l + 1);
    r = r && type_weak_with_parenthesis(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [unowned]
  private static boolean field_declaration_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_2_0_1_0")) return false;
    consumeToken(b, UNOWNED);
    return true;
  }

  // (COMMA field_declaration_section)*
  private static boolean field_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!field_declaration_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "field_declaration_4", c)) break;
    }
    return true;
  }

  // COMMA field_declaration_section
  private static boolean field_declaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && field_declaration_section(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier [inline_array_type] [ EQUALS expression [inline_array_type] ]
  public static boolean field_declaration_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_section")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_DECLARATION_SECTION, "<field declaration section>");
    r = identifier(b, l + 1);
    r = r && field_declaration_section_1(b, l + 1);
    r = r && field_declaration_section_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [inline_array_type]
  private static boolean field_declaration_section_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_section_1")) return false;
    inline_array_type(b, l + 1);
    return true;
  }

  // [ EQUALS expression [inline_array_type] ]
  private static boolean field_declaration_section_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_section_2")) return false;
    field_declaration_section_2_0(b, l + 1);
    return true;
  }

  // EQUALS expression [inline_array_type]
  private static boolean field_declaration_section_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_section_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && expression(b, l + 1);
    r = r && field_declaration_section_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [inline_array_type]
  private static boolean field_declaration_section_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_section_2_0_2")) return false;
    inline_array_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // finally block
  public static boolean finally_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finally_clause")) return false;
    if (!nextTokenIs(b, FINALLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FINALLY);
    r = r && block(b, l + 1);
    exit_section_(b, m, FINALLY_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // local_variable_declarations | ( statement_expression [ (COMMA statement_expression)* ] )
  public static boolean for_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_INITIALIZER, "<for initializer>");
    r = local_variable_declarations(b, l + 1);
    if (!r) r = for_initializer_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // statement_expression [ (COMMA statement_expression)* ]
  private static boolean for_initializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_initializer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_expression(b, l + 1);
    r = r && for_initializer_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ (COMMA statement_expression)* ]
  private static boolean for_initializer_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_initializer_1_1")) return false;
    for_initializer_1_1_0(b, l + 1);
    return true;
  }

  // (COMMA statement_expression)*
  private static boolean for_initializer_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_initializer_1_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!for_initializer_1_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "for_initializer_1_1_0", c)) break;
    }
    return true;
  }

  // COMMA statement_expression
  private static boolean for_initializer_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_initializer_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && statement_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statement_expression [ (COMMA statement_expression)* ]
  public static boolean for_iterator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_iterator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_ITERATOR, "<for iterator>");
    r = statement_expression(b, l + 1);
    r = r && for_iterator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (COMMA statement_expression)* ]
  private static boolean for_iterator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_iterator_1")) return false;
    for_iterator_1_0(b, l + 1);
    return true;
  }

  // (COMMA statement_expression)*
  private static boolean for_iterator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_iterator_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!for_iterator_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "for_iterator_1_0", c)) break;
    }
    return true;
  }

  // COMMA statement_expression
  private static boolean for_iterator_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_iterator_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && statement_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // for LPAREN [ for_initializer ] SEMICOLON [ expression ] SEMICOLON [ for_iterator ] RPAREN embedded_statement
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LPAREN);
    r = r && for_statement_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && for_statement_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && for_statement_6(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && embedded_statement(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // [ for_initializer ]
  private static boolean for_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_2")) return false;
    for_initializer(b, l + 1);
    return true;
  }

  // [ expression ]
  private static boolean for_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_4")) return false;
    expression(b, l + 1);
    return true;
  }

  // [ for_iterator ]
  private static boolean for_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_6")) return false;
    for_iterator(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // foreach LPAREN [ (dynamic unowned) | (unowned dynamic) | unowned | dynamic ] ( var [QUESTION_MARK] | (type_weak | type_weak_with_parenthesis) ) identifier in expression RPAREN embedded_statement
  public static boolean foreach_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement")) return false;
    if (!nextTokenIs(b, FOREACH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOREACH, LPAREN);
    r = r && foreach_statement_2(b, l + 1);
    r = r && foreach_statement_3(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, IN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && embedded_statement(b, l + 1);
    exit_section_(b, m, FOREACH_STATEMENT, r);
    return r;
  }

  // [ (dynamic unowned) | (unowned dynamic) | unowned | dynamic ]
  private static boolean foreach_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_2")) return false;
    foreach_statement_2_0(b, l + 1);
    return true;
  }

  // (dynamic unowned) | (unowned dynamic) | unowned | dynamic
  private static boolean foreach_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = foreach_statement_2_0_0(b, l + 1);
    if (!r) r = foreach_statement_2_0_1(b, l + 1);
    if (!r) r = consumeToken(b, UNOWNED);
    if (!r) r = consumeToken(b, DYNAMIC);
    exit_section_(b, m, null, r);
    return r;
  }

  // dynamic unowned
  private static boolean foreach_statement_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DYNAMIC, UNOWNED);
    exit_section_(b, m, null, r);
    return r;
  }

  // unowned dynamic
  private static boolean foreach_statement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, UNOWNED, DYNAMIC);
    exit_section_(b, m, null, r);
    return r;
  }

  // var [QUESTION_MARK] | (type_weak | type_weak_with_parenthesis)
  private static boolean foreach_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = foreach_statement_3_0(b, l + 1);
    if (!r) r = foreach_statement_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // var [QUESTION_MARK]
  private static boolean foreach_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR);
    r = r && foreach_statement_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [QUESTION_MARK]
  private static boolean foreach_statement_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_3_0_1")) return false;
    consumeToken(b, QUESTION_MARK);
    return true;
  }

  // type_weak | type_weak_with_parenthesis
  private static boolean foreach_statement_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement_3_1")) return false;
    boolean r;
    r = type_weak(b, l + 1);
    if (!r) r = type_weak_with_parenthesis(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER_TOKEN | valid_identifier_keywords
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = consumeToken(b, IDENTIFIER_TOKEN);
    if (!r) r = valid_identifier_keywords(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // if LPAREN expression RPAREN embedded_statement* [ else embedded_statement ]
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && if_statement_4(b, l + 1);
    r = r && if_statement_5(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // embedded_statement*
  private static boolean if_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!embedded_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_4", c)) break;
    }
    return true;
  }

  // [ else embedded_statement ]
  private static boolean if_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5")) return false;
    if_statement_5_0(b, l + 1);
    return true;
  }

  // else embedded_statement
  private static boolean if_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && embedded_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // inclusive_or_expression [ ( in inclusive_or_expression )* ]
  public static boolean in_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "in_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IN_EXPRESSION, "<in expression>");
    r = inclusive_or_expression(b, l + 1);
    r = r && in_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ( in inclusive_or_expression )* ]
  private static boolean in_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "in_expression_1")) return false;
    in_expression_1_0(b, l + 1);
    return true;
  }

  // ( in inclusive_or_expression )*
  private static boolean in_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "in_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!in_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "in_expression_1_0", c)) break;
    }
    return true;
  }

  // in inclusive_or_expression
  private static boolean in_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "in_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IN);
    r = r && inclusive_or_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // exclusive_or_expression [ ( PIPE exclusive_or_expression )* ]
  public static boolean inclusive_or_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inclusive_or_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCLUSIVE_OR_EXPRESSION, "<inclusive or expression>");
    r = exclusive_or_expression(b, l + 1);
    r = r && inclusive_or_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ( PIPE exclusive_or_expression )* ]
  private static boolean inclusive_or_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inclusive_or_expression_1")) return false;
    inclusive_or_expression_1_0(b, l + 1);
    return true;
  }

  // ( PIPE exclusive_or_expression )*
  private static boolean inclusive_or_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inclusive_or_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!inclusive_or_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "inclusive_or_expression_1_0", c)) break;
    }
    return true;
  }

  // PIPE exclusive_or_expression
  private static boolean inclusive_or_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inclusive_or_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIPE);
    r = r && exclusive_or_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE [argument [ (COMMA  argument)* ] [COMMA] ] RBRACE
  public static boolean initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && initializer_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, INITIALIZER, r);
    return r;
  }

  // [argument [ (COMMA  argument)* ] [COMMA] ]
  private static boolean initializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_1")) return false;
    initializer_1_0(b, l + 1);
    return true;
  }

  // argument [ (COMMA  argument)* ] [COMMA]
  private static boolean initializer_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = argument(b, l + 1);
    r = r && initializer_1_0_1(b, l + 1);
    r = r && initializer_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ (COMMA  argument)* ]
  private static boolean initializer_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_1_0_1")) return false;
    initializer_1_0_1_0(b, l + 1);
    return true;
  }

  // (COMMA  argument)*
  private static boolean initializer_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_1_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!initializer_1_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "initializer_1_0_1_0", c)) break;
    }
    return true;
  }

  // COMMA  argument
  private static boolean initializer_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean initializer_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // LBRACKET [ (expression | INTEGER_LITERAL | member | COMMA*) [COLON (expression | INTEGER_LITERAL | member)]] RBRACKET
  public static boolean inline_array_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_array_type")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && inline_array_type_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, INLINE_ARRAY_TYPE, r);
    return r;
  }

  // [ (expression | INTEGER_LITERAL | member | COMMA*) [COLON (expression | INTEGER_LITERAL | member)]]
  private static boolean inline_array_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_array_type_1")) return false;
    inline_array_type_1_0(b, l + 1);
    return true;
  }

  // (expression | INTEGER_LITERAL | member | COMMA*) [COLON (expression | INTEGER_LITERAL | member)]
  private static boolean inline_array_type_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_array_type_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inline_array_type_1_0_0(b, l + 1);
    r = r && inline_array_type_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression | INTEGER_LITERAL | member | COMMA*
  private static boolean inline_array_type_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_array_type_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = member(b, l + 1);
    if (!r) r = inline_array_type_1_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA*
  private static boolean inline_array_type_1_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_array_type_1_0_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, COMMA)) break;
      if (!empty_element_parsed_guard_(b, "inline_array_type_1_0_0_3", c)) break;
    }
    return true;
  }

  // [COLON (expression | INTEGER_LITERAL | member)]
  private static boolean inline_array_type_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_array_type_1_0_1")) return false;
    inline_array_type_1_0_1_0(b, l + 1);
    return true;
  }

  // COLON (expression | INTEGER_LITERAL | member)
  private static boolean inline_array_type_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_array_type_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && inline_array_type_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression | INTEGER_LITERAL | member
  private static boolean inline_array_type_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_array_type_1_0_1_0_1")) return false;
    boolean r;
    r = expression(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = member(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // using_directive* main_block_member
  static boolean input(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = input_0(b, l + 1);
    r = r && main_block_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // using_directive*
  private static boolean input_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!using_directive(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "input_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ interface_type_declaration_modifiers ] interface symbol [ type_parameters ]
  //                           [ COLON base_types ] LBRACE interface_member* RBRACE
  public static boolean interface_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_DECLARATION, "<interface declaration>");
    r = interface_declaration_0(b, l + 1);
    r = r && interface_declaration_1(b, l + 1);
    r = r && consumeToken(b, INTERFACE);
    r = r && symbol(b, l + 1);
    r = r && interface_declaration_4(b, l + 1);
    r = r && interface_declaration_5(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && interface_declaration_7(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ access_modifier ]
  private static boolean interface_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_0")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // [ interface_type_declaration_modifiers ]
  private static boolean interface_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_1")) return false;
    interface_type_declaration_modifiers(b, l + 1);
    return true;
  }

  // [ type_parameters ]
  private static boolean interface_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_4")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // [ COLON base_types ]
  private static boolean interface_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_5")) return false;
    interface_declaration_5_0(b, l + 1);
    return true;
  }

  // COLON base_types
  private static boolean interface_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && base_types(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // interface_member*
  private static boolean interface_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_declaration_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ attributes ]
  //                      ( class_declaration |
  //                        struct_declaration |
  //                        enum_declaration |
  //                        delegate_declaration |
  //                        method_declaration |
  //                        signal_declaration |
  //                        field_declaration |
  //                        constant_declaration |
  //                        property_declaration |
  //                        interface_declaration )
  public static boolean interface_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_MEMBER, "<interface member>");
    r = interface_member_0(b, l + 1);
    r = r && interface_member_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ attributes ]
  private static boolean interface_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_member_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // class_declaration |
  //                        struct_declaration |
  //                        enum_declaration |
  //                        delegate_declaration |
  //                        method_declaration |
  //                        signal_declaration |
  //                        field_declaration |
  //                        constant_declaration |
  //                        property_declaration |
  //                        interface_declaration
  private static boolean interface_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_member_1")) return false;
    boolean r;
    r = class_declaration(b, l + 1);
    if (!r) r = struct_declaration(b, l + 1);
    if (!r) r = enum_declaration(b, l + 1);
    if (!r) r = delegate_declaration(b, l + 1);
    if (!r) r = method_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = field_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = property_declaration(b, l + 1);
    if (!r) r = interface_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // abstract | extern | sealed
  static boolean interface_type_declaration_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_declaration_modifier")) return false;
    boolean r;
    r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, EXTERN);
    if (!r) r = consumeToken(b, SEALED);
    return r;
  }

  /* ********************************************************** */
  // interface_type_declaration_modifier [ interface_type_declaration_modifier* ]
  static boolean interface_type_declaration_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_declaration_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_type_declaration_modifier(b, l + 1);
    r = r && interface_type_declaration_modifiers_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ interface_type_declaration_modifier* ]
  private static boolean interface_type_declaration_modifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_declaration_modifiers_1")) return false;
    interface_type_declaration_modifiers_1_0(b, l + 1);
    return true;
  }

  // interface_type_declaration_modifier*
  private static boolean interface_type_declaration_modifiers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_declaration_modifiers_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_type_declaration_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_type_declaration_modifiers_1_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (lambda_expression_param | lambda_expression_params) [ type_arguments ] '=' '>' lambda_expression_body
  public static boolean lambda_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_EXPRESSION, "<lambda expression>");
    r = lambda_expression_0(b, l + 1);
    r = r && lambda_expression_1(b, l + 1);
    r = r && consumeTokens(b, 0, EQUALS, GREATER_THAN);
    r = r && lambda_expression_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // lambda_expression_param | lambda_expression_params
  private static boolean lambda_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_0")) return false;
    boolean r;
    r = lambda_expression_param(b, l + 1);
    if (!r) r = lambda_expression_params(b, l + 1);
    return r;
  }

  // [ type_arguments ]
  private static boolean lambda_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_1")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expression | block
  public static boolean lambda_expression_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_EXPRESSION_BODY, "<lambda expression body>");
    r = expression(b, l + 1);
    if (!r) r = block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ ref | out ] identifier
  public static boolean lambda_expression_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_EXPRESSION_PARAM, "<lambda expression param>");
    r = lambda_expression_param_0(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ref | out ]
  private static boolean lambda_expression_param_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_param_0")) return false;
    lambda_expression_param_0_0(b, l + 1);
    return true;
  }

  // ref | out
  private static boolean lambda_expression_param_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_param_0_0")) return false;
    boolean r;
    r = consumeToken(b, REF);
    if (!r) r = consumeToken(b, OUT);
    return r;
  }

  /* ********************************************************** */
  // LPAREN [ lambda_expression_param [(COMMA lambda_expression_param)*]] RPAREN
  public static boolean lambda_expression_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_params")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && lambda_expression_params_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, LAMBDA_EXPRESSION_PARAMS, r);
    return r;
  }

  // [ lambda_expression_param [(COMMA lambda_expression_param)*]]
  private static boolean lambda_expression_params_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_params_1")) return false;
    lambda_expression_params_1_0(b, l + 1);
    return true;
  }

  // lambda_expression_param [(COMMA lambda_expression_param)*]
  private static boolean lambda_expression_params_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_params_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lambda_expression_param(b, l + 1);
    r = r && lambda_expression_params_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [(COMMA lambda_expression_param)*]
  private static boolean lambda_expression_params_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_params_1_0_1")) return false;
    lambda_expression_params_1_0_1_0(b, l + 1);
    return true;
  }

  // (COMMA lambda_expression_param)*
  private static boolean lambda_expression_params_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_params_1_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!lambda_expression_params_1_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lambda_expression_params_1_0_1_0", c)) break;
    }
    return true;
  }

  // COMMA lambda_expression_param
  private static boolean lambda_expression_params_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression_params_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && lambda_expression_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // true | false | null | INTEGER_LITERAL [ numerical_suffix ] | DECIMAL_LITERAL [ numerical_suffix ] | CHAR_LITERAL |
  //             STRING_LITERAL | TRIPLE_QUOTE_STRING | HEXADECIMAL_LITERAL [ numerical_suffix ] | regex_literal
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = literal_3(b, l + 1);
    if (!r) r = literal_4(b, l + 1);
    if (!r) r = consumeToken(b, CHAR_LITERAL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, TRIPLE_QUOTE_STRING);
    if (!r) r = literal_8(b, l + 1);
    if (!r) r = regex_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INTEGER_LITERAL [ numerical_suffix ]
  private static boolean literal_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER_LITERAL);
    r = r && literal_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ numerical_suffix ]
  private static boolean literal_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_3_1")) return false;
    numerical_suffix(b, l + 1);
    return true;
  }

  // DECIMAL_LITERAL [ numerical_suffix ]
  private static boolean literal_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECIMAL_LITERAL);
    r = r && literal_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ numerical_suffix ]
  private static boolean literal_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_4_1")) return false;
    numerical_suffix(b, l + 1);
    return true;
  }

  // HEXADECIMAL_LITERAL [ numerical_suffix ]
  private static boolean literal_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HEXADECIMAL_LITERAL);
    r = r && literal_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ numerical_suffix ]
  private static boolean literal_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_8_1")) return false;
    numerical_suffix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAREN member RPAREN EQUALS expression
  public static boolean local_tuple_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_tuple_declaration")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && member(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, EQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, LOCAL_TUPLE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // identifier [ inline_array_type ] [ EQUALS expression ]
  public static boolean local_variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE, "<local variable>");
    r = identifier(b, l + 1);
    r = r && local_variable_1(b, l + 1);
    r = r && local_variable_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ inline_array_type ]
  private static boolean local_variable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_1")) return false;
    inline_array_type(b, l + 1);
    return true;
  }

  // [ EQUALS expression ]
  private static boolean local_variable_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_2")) return false;
    local_variable_2_0(b, l + 1);
    return true;
  }

  // EQUALS expression
  private static boolean local_variable_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // local_tuple_declaration | local_variable
  public static boolean local_variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE_DECLARATION, "<local variable declaration>");
    r = local_tuple_declaration(b, l + 1);
    if (!r) r = local_variable(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [dynamic] [ weak | unowned | owned ] ( var [QUESTION_MARK] | (type | type_with_parenthesis) ) [QUESTION_MARK] local_variable_declaration [ (COMMA local_variable_declaration)* ]
  public static boolean local_variable_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarations")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL_VARIABLE_DECLARATIONS, "<local variable declarations>");
    r = local_variable_declarations_0(b, l + 1);
    r = r && local_variable_declarations_1(b, l + 1);
    r = r && local_variable_declarations_2(b, l + 1);
    r = r && local_variable_declarations_3(b, l + 1);
    r = r && local_variable_declaration(b, l + 1);
    r = r && local_variable_declarations_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [dynamic]
  private static boolean local_variable_declarations_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarations_0")) return false;
    consumeToken(b, DYNAMIC);
    return true;
  }

  // [ weak | unowned | owned ]
  private static boolean local_variable_declarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarations_1")) return false;
    local_variable_declarations_1_0(b, l + 1);
    return true;
  }

  // weak | unowned | owned
  private static boolean local_variable_declarations_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarations_1_0")) return false;
    boolean r;
    r = consumeToken(b, WEAK);
    if (!r) r = consumeToken(b, UNOWNED);
    if (!r) r = consumeToken(b, OWNED);
    return r;
  }

  // var [QUESTION_MARK] | (type | type_with_parenthesis)
  private static boolean local_variable_declarations_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarations_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = local_variable_declarations_2_0(b, l + 1);
    if (!r) r = local_variable_declarations_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // var [QUESTION_MARK]
  private static boolean local_variable_declarations_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarations_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR);
    r = r && local_variable_declarations_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [QUESTION_MARK]
  private static boolean local_variable_declarations_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarations_2_0_1")) return false;
    consumeToken(b, QUESTION_MARK);
    return true;
  }

  // type | type_with_parenthesis
  private static boolean local_variable_declarations_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarations_2_1")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    return r;
  }

  // [QUESTION_MARK]
  private static boolean local_variable_declarations_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarations_3")) return false;
    consumeToken(b, QUESTION_MARK);
    return true;
  }

  // [ (COMMA local_variable_declaration)* ]
  private static boolean local_variable_declarations_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarations_5")) return false;
    local_variable_declarations_5_0(b, l + 1);
    return true;
  }

  // (COMMA local_variable_declaration)*
  private static boolean local_variable_declarations_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarations_5_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!local_variable_declarations_5_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "local_variable_declarations_5_0", c)) break;
    }
    return true;
  }

  // COMMA local_variable_declaration
  private static boolean local_variable_declarations_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarations_5_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && local_variable_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lock LPAREN expression RPAREN embedded_statement
  public static boolean lock_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lock_statement")) return false;
    if (!nextTokenIs(b, LOCK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LOCK, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && embedded_statement(b, l + 1);
    exit_section_(b, m, LOCK_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // ( [ attributes ] ( namespace_declaration |
  //                         class_declaration |
  //                         interface_declaration |
  //                         struct_declaration |
  //                         enum_declaration |
  //                         errordomain_declaration |
  //                         delegate_declaration |
  //                         method_declaration |
  //                         field_declaration |
  //                         constant_declaration))* [ ( [ attributes ] ( method_declaration | statement ))* ]
  public static boolean main_block_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_block_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAIN_BLOCK_MEMBER, "<main block member>");
    r = main_block_member_0(b, l + 1);
    r = r && main_block_member_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( [ attributes ] ( namespace_declaration |
  //                         class_declaration |
  //                         interface_declaration |
  //                         struct_declaration |
  //                         enum_declaration |
  //                         errordomain_declaration |
  //                         delegate_declaration |
  //                         method_declaration |
  //                         field_declaration |
  //                         constant_declaration))*
  private static boolean main_block_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_block_member_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!main_block_member_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "main_block_member_0", c)) break;
    }
    return true;
  }

  // [ attributes ] ( namespace_declaration |
  //                         class_declaration |
  //                         interface_declaration |
  //                         struct_declaration |
  //                         enum_declaration |
  //                         errordomain_declaration |
  //                         delegate_declaration |
  //                         method_declaration |
  //                         field_declaration |
  //                         constant_declaration)
  private static boolean main_block_member_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_block_member_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = main_block_member_0_0_0(b, l + 1);
    r = r && main_block_member_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ attributes ]
  private static boolean main_block_member_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_block_member_0_0_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // namespace_declaration |
  //                         class_declaration |
  //                         interface_declaration |
  //                         struct_declaration |
  //                         enum_declaration |
  //                         errordomain_declaration |
  //                         delegate_declaration |
  //                         method_declaration |
  //                         field_declaration |
  //                         constant_declaration
  private static boolean main_block_member_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_block_member_0_0_1")) return false;
    boolean r;
    r = namespace_declaration(b, l + 1);
    if (!r) r = class_declaration(b, l + 1);
    if (!r) r = interface_declaration(b, l + 1);
    if (!r) r = struct_declaration(b, l + 1);
    if (!r) r = enum_declaration(b, l + 1);
    if (!r) r = errordomain_declaration(b, l + 1);
    if (!r) r = delegate_declaration(b, l + 1);
    if (!r) r = method_declaration(b, l + 1);
    if (!r) r = field_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    return r;
  }

  // [ ( [ attributes ] ( method_declaration | statement ))* ]
  private static boolean main_block_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_block_member_1")) return false;
    main_block_member_1_0(b, l + 1);
    return true;
  }

  // ( [ attributes ] ( method_declaration | statement ))*
  private static boolean main_block_member_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_block_member_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!main_block_member_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "main_block_member_1_0", c)) break;
    }
    return true;
  }

  // [ attributes ] ( method_declaration | statement )
  private static boolean main_block_member_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_block_member_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = main_block_member_1_0_0_0(b, l + 1);
    r = r && main_block_member_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ attributes ]
  private static boolean main_block_member_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_block_member_1_0_0_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // method_declaration | statement
  private static boolean main_block_member_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_block_member_1_0_0_1")) return false;
    boolean r;
    r = method_declaration(b, l + 1);
    if (!r) r = statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // member_part [ (DOT member_part)* ]
  public static boolean member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER, "<member>");
    r = member_part(b, l + 1);
    r = r && member_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (DOT member_part)* ]
  private static boolean member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_1")) return false;
    member_1_0(b, l + 1);
    return true;
  }

  // (DOT member_part)*
  private static boolean member_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!member_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "member_1_0", c)) break;
    }
    return true;
  }

  // DOT member_part
  private static boolean member_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && member_part(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOT (simple_name | 'default')
  public static boolean member_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_access")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && member_access_1(b, l + 1);
    exit_section_(b, m, MEMBER_ACCESS, r);
    return r;
  }

  // simple_name | 'default'
  private static boolean member_access_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_access_1")) return false;
    boolean r;
    r = simple_name(b, l + 1);
    if (!r) r = consumeToken(b, "default");
    return r;
  }

  /* ********************************************************** */
  // async | class | extern | inline | static | abstract | virtual | override | new
  public static boolean member_declaration_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_declaration_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_DECLARATION_MODIFIER, "<member declaration modifier>");
    r = consumeToken(b, ASYNC);
    if (!r) r = consumeToken(b, CLASS);
    if (!r) r = consumeToken(b, EXTERN);
    if (!r) r = consumeToken(b, INLINE);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, VIRTUAL);
    if (!r) r = consumeToken(b, OVERRIDE);
    if (!r) r = consumeToken(b, NEW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // member_declaration_modifier [ (member_declaration_modifier)* ]
  public static boolean member_declaration_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_declaration_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_DECLARATION_MODIFIERS, "<member declaration modifiers>");
    r = member_declaration_modifier(b, l + 1);
    r = r && member_declaration_modifiers_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (member_declaration_modifier)* ]
  private static boolean member_declaration_modifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_declaration_modifiers_1")) return false;
    member_declaration_modifiers_1_0(b, l + 1);
    return true;
  }

  // (member_declaration_modifier)*
  private static boolean member_declaration_modifiers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_declaration_modifiers_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!member_declaration_modifiers_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "member_declaration_modifiers_1_0", c)) break;
    }
    return true;
  }

  // (member_declaration_modifier)
  private static boolean member_declaration_modifiers_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_declaration_modifiers_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member_declaration_modifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier EQUALS expression
  public static boolean member_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_INITIALIZER, "<member initializer>");
    r = identifier(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( ["global::"] identifier) [ type_arguments ]
  public static boolean member_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_PART, "<member part>");
    r = member_part_0(b, l + 1);
    r = r && member_part_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ["global::"] identifier
  private static boolean member_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member_part_0_0(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ["global::"]
  private static boolean member_part_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_part_0_0")) return false;
    consumeToken(b, "global::");
    return true;
  }

  // [ type_arguments ]
  private static boolean member_part_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_part_1")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAREN [ arguments ] RPAREN [ object_initializer ]
  public static boolean method_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && method_call_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && method_call_3(b, l + 1);
    exit_section_(b, m, METHOD_CALL, r);
    return r;
  }

  // [ arguments ]
  private static boolean method_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call_1")) return false;
    arguments(b, l + 1);
    return true;
  }

  // [ object_initializer ]
  private static boolean method_call_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call_3")) return false;
    object_initializer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ member_declaration_modifiers ] (type | type_with_parenthesis) member [ type_parameters ]
  //                        LPAREN [ parameters ] RPAREN [ throws_statement ] [ requires_statement ] [ ensures_statement ] ( SEMICOLON | block )
  public static boolean method_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_DECLARATION, "<method declaration>");
    r = method_declaration_0(b, l + 1);
    r = r && method_declaration_1(b, l + 1);
    r = r && method_declaration_2(b, l + 1);
    r = r && member(b, l + 1);
    r = r && method_declaration_4(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && method_declaration_6(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && method_declaration_8(b, l + 1);
    r = r && method_declaration_9(b, l + 1);
    r = r && method_declaration_10(b, l + 1);
    r = r && method_declaration_11(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ access_modifier ]
  private static boolean method_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_0")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // [ member_declaration_modifiers ]
  private static boolean method_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_1")) return false;
    member_declaration_modifiers(b, l + 1);
    return true;
  }

  // type | type_with_parenthesis
  private static boolean method_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_2")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    return r;
  }

  // [ type_parameters ]
  private static boolean method_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_4")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // [ parameters ]
  private static boolean method_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_6")) return false;
    parameters(b, l + 1);
    return true;
  }

  // [ throws_statement ]
  private static boolean method_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_8")) return false;
    throws_statement(b, l + 1);
    return true;
  }

  // [ requires_statement ]
  private static boolean method_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_9")) return false;
    requires_statement(b, l + 1);
    return true;
  }

  // [ ensures_statement ]
  private static boolean method_declaration_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_10")) return false;
    ensures_statement(b, l + 1);
    return true;
  }

  // SEMICOLON | block
  private static boolean method_declaration_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration_11")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = block(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // unary_expression [ (( STAR | FORWARD_SLASH | MODULO ) unary_expression)* ]
  public static boolean multiplicative_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLICATIVE_EXPRESSION, "<multiplicative expression>");
    r = unary_expression(b, l + 1);
    r = r && multiplicative_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (( STAR | FORWARD_SLASH | MODULO ) unary_expression)* ]
  private static boolean multiplicative_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression_1")) return false;
    multiplicative_expression_1_0(b, l + 1);
    return true;
  }

  // (( STAR | FORWARD_SLASH | MODULO ) unary_expression)*
  private static boolean multiplicative_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multiplicative_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiplicative_expression_1_0", c)) break;
    }
    return true;
  }

  // ( STAR | FORWARD_SLASH | MODULO ) unary_expression
  private static boolean multiplicative_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplicative_expression_1_0_0_0(b, l + 1);
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STAR | FORWARD_SLASH | MODULO
  private static boolean multiplicative_expression_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression_1_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, FORWARD_SLASH);
    if (!r) r = consumeToken(b, MODULO);
    return r;
  }

  /* ********************************************************** */
  // [parameter_direction] [parameter_ownage] identifier COLON (expression | type_weak | type_with_parenthesis | type_weak_with_parenthesis | ['_'] LPAREN expression RPAREN ) [EQUALS expression]
  public static boolean named_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_ARGUMENT, "<named argument>");
    r = named_argument_0(b, l + 1);
    r = r && named_argument_1(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && named_argument_4(b, l + 1);
    r = r && named_argument_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [parameter_direction]
  private static boolean named_argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_argument_0")) return false;
    parameter_direction(b, l + 1);
    return true;
  }

  // [parameter_ownage]
  private static boolean named_argument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_argument_1")) return false;
    parameter_ownage(b, l + 1);
    return true;
  }

  // expression | type_weak | type_with_parenthesis | type_weak_with_parenthesis | ['_'] LPAREN expression RPAREN
  private static boolean named_argument_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_argument_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    if (!r) r = type_weak(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    if (!r) r = type_weak_with_parenthesis(b, l + 1);
    if (!r) r = named_argument_4_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['_'] LPAREN expression RPAREN
  private static boolean named_argument_4_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_argument_4_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = named_argument_4_4_0(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['_']
  private static boolean named_argument_4_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_argument_4_4_0")) return false;
    consumeToken(b, "_");
    return true;
  }

  // [EQUALS expression]
  private static boolean named_argument_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_argument_5")) return false;
    named_argument_5_0(b, l + 1);
    return true;
  }

  // EQUALS expression
  private static boolean named_argument_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_argument_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // namespace symbol LBRACE using_directive* namespace_member* RBRACE
  public static boolean namespace_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAMESPACE);
    r = r && symbol(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && namespace_declaration_3(b, l + 1);
    r = r && namespace_declaration_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, NAMESPACE_DECLARATION, r);
    return r;
  }

  // using_directive*
  private static boolean namespace_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!using_directive(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_declaration_3", c)) break;
    }
    return true;
  }

  // namespace_member*
  private static boolean namespace_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!namespace_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_declaration_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ attributes ]
  //                      ( namespace_declaration |
  //                        class_declaration |
  //                        interface_declaration |
  //                        struct_declaration |
  //                        enum_declaration |
  //                        errordomain_declaration |
  //                        delegate_declaration |
  //                        method_declaration |
  //                        field_declaration |
  //                        constant_declaration)
  public static boolean namespace_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMESPACE_MEMBER, "<namespace member>");
    r = namespace_member_0(b, l + 1);
    r = r && namespace_member_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ attributes ]
  private static boolean namespace_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_member_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // namespace_declaration |
  //                        class_declaration |
  //                        interface_declaration |
  //                        struct_declaration |
  //                        enum_declaration |
  //                        errordomain_declaration |
  //                        delegate_declaration |
  //                        method_declaration |
  //                        field_declaration |
  //                        constant_declaration
  private static boolean namespace_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_member_1")) return false;
    boolean r;
    r = namespace_declaration(b, l + 1);
    if (!r) r = class_declaration(b, l + 1);
    if (!r) r = interface_declaration(b, l + 1);
    if (!r) r = struct_declaration(b, l + 1);
    if (!r) r = enum_declaration(b, l + 1);
    if (!r) r = errordomain_declaration(b, l + 1);
    if (!r) r = delegate_declaration(b, l + 1);
    if (!r) r = method_declaration(b, l + 1);
    if (!r) r = field_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'U' | 'UL' | 'LL' | 'ULL' | 'L' | 'u' | 'ul' | 'll' | 'ull' | 'l' | 'f' | 'F' | 'd' | 'D'
  static boolean numerical_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numerical_suffix")) return false;
    boolean r;
    r = consumeToken(b, "U");
    if (!r) r = consumeToken(b, "UL");
    if (!r) r = consumeToken(b, "LL");
    if (!r) r = consumeToken(b, "ULL");
    if (!r) r = consumeToken(b, "L");
    if (!r) r = consumeToken(b, "u");
    if (!r) r = consumeToken(b, "ul");
    if (!r) r = consumeToken(b, "ll");
    if (!r) r = consumeToken(b, "ull");
    if (!r) r = consumeToken(b, "l");
    if (!r) r = consumeToken(b, "f");
    if (!r) r = consumeToken(b, "F");
    if (!r) r = consumeToken(b, "d");
    if (!r) r = consumeToken(b, "D");
    return r;
  }

  /* ********************************************************** */
  // LPAREN [ arguments ] RPAREN [ object_initializer (member_access [method_call])* | object_initializer | (member_access [method_call])* ]
  public static boolean object_creation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && object_creation_expression_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && object_creation_expression_3(b, l + 1);
    exit_section_(b, m, OBJECT_CREATION_EXPRESSION, r);
    return r;
  }

  // [ arguments ]
  private static boolean object_creation_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_1")) return false;
    arguments(b, l + 1);
    return true;
  }

  // [ object_initializer (member_access [method_call])* | object_initializer | (member_access [method_call])* ]
  private static boolean object_creation_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_3")) return false;
    object_creation_expression_3_0(b, l + 1);
    return true;
  }

  // object_initializer (member_access [method_call])* | object_initializer | (member_access [method_call])*
  private static boolean object_creation_expression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_creation_expression_3_0_0(b, l + 1);
    if (!r) r = object_initializer(b, l + 1);
    if (!r) r = object_creation_expression_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // object_initializer (member_access [method_call])*
  private static boolean object_creation_expression_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_initializer(b, l + 1);
    r = r && object_creation_expression_3_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (member_access [method_call])*
  private static boolean object_creation_expression_3_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_3_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object_creation_expression_3_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_creation_expression_3_0_0_1", c)) break;
    }
    return true;
  }

  // member_access [method_call]
  private static boolean object_creation_expression_3_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_3_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member_access(b, l + 1);
    r = r && object_creation_expression_3_0_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [method_call]
  private static boolean object_creation_expression_3_0_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_3_0_0_1_0_1")) return false;
    method_call(b, l + 1);
    return true;
  }

  // (member_access [method_call])*
  private static boolean object_creation_expression_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object_creation_expression_3_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_creation_expression_3_0_2", c)) break;
    }
    return true;
  }

  // member_access [method_call]
  private static boolean object_creation_expression_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member_access(b, l + 1);
    r = r && object_creation_expression_3_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [method_call]
  private static boolean object_creation_expression_3_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_3_0_2_0_1")) return false;
    method_call(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACE member_initializer [ (COMMA member_initializer)* ] [COMMA] RBRACE
  public static boolean object_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_initializer")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && member_initializer(b, l + 1);
    r = r && object_initializer_2(b, l + 1);
    r = r && object_initializer_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, OBJECT_INITIALIZER, r);
    return r;
  }

  // [ (COMMA member_initializer)* ]
  private static boolean object_initializer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_initializer_2")) return false;
    object_initializer_2_0(b, l + 1);
    return true;
  }

  // (COMMA member_initializer)*
  private static boolean object_initializer_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_initializer_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!object_initializer_2_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_initializer_2_0", c)) break;
    }
    return true;
  }

  // COMMA member_initializer
  private static boolean object_initializer_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_initializer_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && member_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean object_initializer_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_initializer_3")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // new (member | type | type_with_parenthesis | type_weak | type_weak_with_parenthesis ) [STAR*] [QUESTION_MARK] ( object_creation_expression | array_creation_expression )
  public static boolean object_or_array_creation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_or_array_creation_expression")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && object_or_array_creation_expression_1(b, l + 1);
    r = r && object_or_array_creation_expression_2(b, l + 1);
    r = r && object_or_array_creation_expression_3(b, l + 1);
    r = r && object_or_array_creation_expression_4(b, l + 1);
    exit_section_(b, m, OBJECT_OR_ARRAY_CREATION_EXPRESSION, r);
    return r;
  }

  // member | type | type_with_parenthesis | type_weak | type_weak_with_parenthesis
  private static boolean object_or_array_creation_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_or_array_creation_expression_1")) return false;
    boolean r;
    r = member(b, l + 1);
    if (!r) r = type(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    if (!r) r = type_weak(b, l + 1);
    if (!r) r = type_weak_with_parenthesis(b, l + 1);
    return r;
  }

  // [STAR*]
  private static boolean object_or_array_creation_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_or_array_creation_expression_2")) return false;
    object_or_array_creation_expression_2_0(b, l + 1);
    return true;
  }

  // STAR*
  private static boolean object_or_array_creation_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_or_array_creation_expression_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, STAR)) break;
      if (!empty_element_parsed_guard_(b, "object_or_array_creation_expression_2_0", c)) break;
    }
    return true;
  }

  // [QUESTION_MARK]
  private static boolean object_or_array_creation_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_or_array_creation_expression_3")) return false;
    consumeToken(b, QUESTION_MARK);
    return true;
  }

  // object_creation_expression | array_creation_expression
  private static boolean object_or_array_creation_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_or_array_creation_expression_4")) return false;
    boolean r;
    r = object_creation_expression(b, l + 1);
    if (!r) r = array_creation_expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // [ attributes ] ( ELLIPSIS | ( [parameter_direction] [parameter_ownage] ) [params] ( (type | type_weak | type_with_parenthesis | type_weak_with_parenthesis) identifier [inline_array_type] [ EQUALS expression ] ) )
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = parameter_0(b, l + 1);
    r = r && parameter_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ attributes ]
  private static boolean parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // ELLIPSIS | ( [parameter_direction] [parameter_ownage] ) [params] ( (type | type_weak | type_with_parenthesis | type_weak_with_parenthesis) identifier [inline_array_type] [ EQUALS expression ] )
  private static boolean parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELLIPSIS);
    if (!r) r = parameter_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( [parameter_direction] [parameter_ownage] ) [params] ( (type | type_weak | type_with_parenthesis | type_weak_with_parenthesis) identifier [inline_array_type] [ EQUALS expression ] )
  private static boolean parameter_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_1_1_0(b, l + 1);
    r = r && parameter_1_1_1(b, l + 1);
    r = r && parameter_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [parameter_direction] [parameter_ownage]
  private static boolean parameter_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_1_1_0_0(b, l + 1);
    r = r && parameter_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [parameter_direction]
  private static boolean parameter_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1_1_0_0")) return false;
    parameter_direction(b, l + 1);
    return true;
  }

  // [parameter_ownage]
  private static boolean parameter_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1_1_0_1")) return false;
    parameter_ownage(b, l + 1);
    return true;
  }

  // [params]
  private static boolean parameter_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1_1_1")) return false;
    consumeToken(b, PARAMS);
    return true;
  }

  // (type | type_weak | type_with_parenthesis | type_weak_with_parenthesis) identifier [inline_array_type] [ EQUALS expression ]
  private static boolean parameter_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_1_1_2_0(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && parameter_1_1_2_2(b, l + 1);
    r = r && parameter_1_1_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type | type_weak | type_with_parenthesis | type_weak_with_parenthesis
  private static boolean parameter_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1_1_2_0")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = type_weak(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    if (!r) r = type_weak_with_parenthesis(b, l + 1);
    return r;
  }

  // [inline_array_type]
  private static boolean parameter_1_1_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1_1_2_2")) return false;
    inline_array_type(b, l + 1);
    return true;
  }

  // [ EQUALS expression ]
  private static boolean parameter_1_1_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1_1_2_3")) return false;
    parameter_1_1_2_3_0(b, l + 1);
    return true;
  }

  // EQUALS expression
  private static boolean parameter_1_1_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1_1_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // in | out | ref
  static boolean parameter_direction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_direction")) return false;
    boolean r;
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OUT);
    if (!r) r = consumeToken(b, REF);
    return r;
  }

  /* ********************************************************** */
  // own | unowned
  static boolean parameter_ownage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_ownage")) return false;
    if (!nextTokenIs(b, "", OWN, UNOWNED)) return false;
    boolean r;
    r = consumeToken(b, OWN);
    if (!r) r = consumeToken(b, UNOWNED);
    return r;
  }

  /* ********************************************************** */
  // parameter [ (COMMA parameter)* [ COMMA ] ]
  public static boolean parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETERS, "<parameters>");
    r = parameter(b, l + 1);
    r = r && parameters_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (COMMA parameter)* [ COMMA ] ]
  private static boolean parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1")) return false;
    parameters_1_0(b, l + 1);
    return true;
  }

  // (COMMA parameter)* [ COMMA ]
  private static boolean parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameters_1_0_0(b, l + 1);
    r = r && parameters_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA parameter)*
  private static boolean parameters_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameters_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameters_1_0_0", c)) break;
    }
    return true;
  }

  // COMMA parameter
  private static boolean parameters_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ COMMA ]
  private static boolean parameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // ARROW member
  public static boolean pointer_member_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pointer_member_access")) return false;
    if (!nextTokenIs(b, ARROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARROW);
    r = r && member(b, l + 1);
    exit_section_(b, m, POINTER_MEMBER_ACCESS, r);
    return r;
  }

  /* ********************************************************** */
  // DECREMENT
  public static boolean post_decrement_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "post_decrement_expression")) return false;
    if (!nextTokenIs(b, DECREMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECREMENT);
    exit_section_(b, m, POST_DECREMENT_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // INCREMENT
  public static boolean post_increment_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "post_increment_expression")) return false;
    if (!nextTokenIs(b, INCREMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCREMENT);
    exit_section_(b, m, POST_INCREMENT_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // ( literal | object_or_array_creation_expression | initializer | tuple | template | this_access | base_access |
  //                         yield_expression | sizeof_expression | typeof_expression |
  //                        simple_name )
  //                        [ ( [QUESTION_MARK] member_access | pointer_member_access | element_access |
  //                          post_increment_expression | method_call | post_decrement_expression)* ]
  public static boolean primary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPRESSION, "<primary expression>");
    r = primary_expression_0(b, l + 1);
    r = r && primary_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // literal | object_or_array_creation_expression | initializer | tuple | template | this_access | base_access |
  //                         yield_expression | sizeof_expression | typeof_expression |
  //                        simple_name
  private static boolean primary_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_0")) return false;
    boolean r;
    r = literal(b, l + 1);
    if (!r) r = object_or_array_creation_expression(b, l + 1);
    if (!r) r = initializer(b, l + 1);
    if (!r) r = tuple(b, l + 1);
    if (!r) r = template(b, l + 1);
    if (!r) r = this_access(b, l + 1);
    if (!r) r = base_access(b, l + 1);
    if (!r) r = yield_expression(b, l + 1);
    if (!r) r = sizeof_expression(b, l + 1);
    if (!r) r = typeof_expression(b, l + 1);
    if (!r) r = simple_name(b, l + 1);
    return r;
  }

  // [ ( [QUESTION_MARK] member_access | pointer_member_access | element_access |
  //                          post_increment_expression | method_call | post_decrement_expression)* ]
  private static boolean primary_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_1")) return false;
    primary_expression_1_0(b, l + 1);
    return true;
  }

  // ( [QUESTION_MARK] member_access | pointer_member_access | element_access |
  //                          post_increment_expression | method_call | post_decrement_expression)*
  private static boolean primary_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!primary_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "primary_expression_1_0", c)) break;
    }
    return true;
  }

  // [QUESTION_MARK] member_access | pointer_member_access | element_access |
  //                          post_increment_expression | method_call | post_decrement_expression
  private static boolean primary_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_expression_1_0_0_0(b, l + 1);
    if (!r) r = pointer_member_access(b, l + 1);
    if (!r) r = element_access(b, l + 1);
    if (!r) r = post_increment_expression(b, l + 1);
    if (!r) r = method_call(b, l + 1);
    if (!r) r = post_decrement_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [QUESTION_MARK] member_access
  private static boolean primary_expression_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_expression_1_0_0_0_0(b, l + 1);
    r = r && member_access(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [QUESTION_MARK]
  private static boolean primary_expression_1_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_1_0_0_0_0")) return false;
    consumeToken(b, QUESTION_MARK);
    return true;
  }

  /* ********************************************************** */
  // [ attributes ] [ access_modifier ] [owned | unowned] ( property_get_accessor | property_set_accessor | property_construct_accessor )
  public static boolean property_accessor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_accessor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_ACCESSOR, "<property accessor>");
    r = property_accessor_0(b, l + 1);
    r = r && property_accessor_1(b, l + 1);
    r = r && property_accessor_2(b, l + 1);
    r = r && property_accessor_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ attributes ]
  private static boolean property_accessor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_accessor_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [ access_modifier ]
  private static boolean property_accessor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_accessor_1")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // [owned | unowned]
  private static boolean property_accessor_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_accessor_2")) return false;
    property_accessor_2_0(b, l + 1);
    return true;
  }

  // owned | unowned
  private static boolean property_accessor_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_accessor_2_0")) return false;
    boolean r;
    r = consumeToken(b, OWNED);
    if (!r) r = consumeToken(b, UNOWNED);
    return r;
  }

  // property_get_accessor | property_set_accessor | property_construct_accessor
  private static boolean property_accessor_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_accessor_3")) return false;
    boolean r;
    r = property_get_accessor(b, l + 1);
    if (!r) r = property_set_accessor(b, l + 1);
    if (!r) r = property_construct_accessor(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // construct [set] ( SEMICOLON | block )
  public static boolean property_construct_accessor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_construct_accessor")) return false;
    if (!nextTokenIs(b, CONSTRUCT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONSTRUCT);
    r = r && property_construct_accessor_1(b, l + 1);
    r = r && property_construct_accessor_2(b, l + 1);
    exit_section_(b, m, PROPERTY_CONSTRUCT_ACCESSOR, r);
    return r;
  }

  // [set]
  private static boolean property_construct_accessor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_construct_accessor_1")) return false;
    consumeToken(b, SET);
    return true;
  }

  // SEMICOLON | block
  private static boolean property_construct_accessor_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_construct_accessor_2")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = block(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ property_declaration_modifiers ] (type_weak | type_weak_with_parenthesis) identifier
  //                          LBRACE property_declaration_part* RBRACE
  public static boolean property_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_DECLARATION, "<property declaration>");
    r = property_declaration_0(b, l + 1);
    r = r && property_declaration_1(b, l + 1);
    r = r && property_declaration_2(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && property_declaration_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ access_modifier ]
  private static boolean property_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_0")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // [ property_declaration_modifiers ]
  private static boolean property_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_1")) return false;
    property_declaration_modifiers(b, l + 1);
    return true;
  }

  // type_weak | type_weak_with_parenthesis
  private static boolean property_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_2")) return false;
    boolean r;
    r = type_weak(b, l + 1);
    if (!r) r = type_weak_with_parenthesis(b, l + 1);
    return r;
  }

  // property_declaration_part*
  private static boolean property_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!property_declaration_part(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "property_declaration_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // class | static | extern | inline | abstract | virtual | override | new
  public static boolean property_declaration_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_DECLARATION_MODIFIER, "<property declaration modifier>");
    r = consumeToken(b, CLASS);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, EXTERN);
    if (!r) r = consumeToken(b, INLINE);
    if (!r) r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, VIRTUAL);
    if (!r) r = consumeToken(b, OVERRIDE);
    if (!r) r = consumeToken(b, NEW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // property_declaration_modifier [ (property_declaration_modifier)* ]
  public static boolean property_declaration_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_DECLARATION_MODIFIERS, "<property declaration modifiers>");
    r = property_declaration_modifier(b, l + 1);
    r = r && property_declaration_modifiers_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (property_declaration_modifier)* ]
  private static boolean property_declaration_modifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_modifiers_1")) return false;
    property_declaration_modifiers_1_0(b, l + 1);
    return true;
  }

  // (property_declaration_modifier)*
  private static boolean property_declaration_modifiers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_modifiers_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!property_declaration_modifiers_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "property_declaration_modifiers_1_0", c)) break;
    }
    return true;
  }

  // (property_declaration_modifier)
  private static boolean property_declaration_modifiers_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_modifiers_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_declaration_modifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( default EQUALS expression SEMICOLON ) | property_accessor
  public static boolean property_declaration_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_DECLARATION_PART, "<property declaration part>");
    r = property_declaration_part_0(b, l + 1);
    if (!r) r = property_accessor(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // default EQUALS expression SEMICOLON
  private static boolean property_declaration_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFAULT, EQUALS);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // get ( SEMICOLON | block )
  public static boolean property_get_accessor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_get_accessor")) return false;
    if (!nextTokenIs(b, GET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GET);
    r = r && property_get_accessor_1(b, l + 1);
    exit_section_(b, m, PROPERTY_GET_ACCESSOR, r);
    return r;
  }

  // SEMICOLON | block
  private static boolean property_get_accessor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_get_accessor_1")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = block(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // set [construct] ( SEMICOLON | block )
  public static boolean property_set_accessor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_set_accessor")) return false;
    if (!nextTokenIs(b, SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SET);
    r = r && property_set_accessor_1(b, l + 1);
    r = r && property_set_accessor_2(b, l + 1);
    exit_section_(b, m, PROPERTY_SET_ACCESSOR, r);
    return r;
  }

  // [construct]
  private static boolean property_set_accessor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_set_accessor_1")) return false;
    consumeToken(b, CONSTRUCT);
    return true;
  }

  // SEMICOLON | block
  private static boolean property_set_accessor_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_set_accessor_2")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = block(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // REGULAR_EXPRESSION [('m'|'i'|'x'|'o'|'s')*]
  public static boolean regex_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_literal")) return false;
    if (!nextTokenIs(b, REGULAR_EXPRESSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REGULAR_EXPRESSION);
    r = r && regex_literal_1(b, l + 1);
    exit_section_(b, m, REGEX_LITERAL, r);
    return r;
  }

  // [('m'|'i'|'x'|'o'|'s')*]
  private static boolean regex_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_literal_1")) return false;
    regex_literal_1_0(b, l + 1);
    return true;
  }

  // ('m'|'i'|'x'|'o'|'s')*
  private static boolean regex_literal_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_literal_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!regex_literal_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "regex_literal_1_0", c)) break;
    }
    return true;
  }

  // 'm'|'i'|'x'|'o'|'s'
  private static boolean regex_literal_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_literal_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "m");
    if (!r) r = consumeToken(b, "i");
    if (!r) r = consumeToken(b, "x");
    if (!r) r = consumeToken(b, "o");
    if (!r) r = consumeToken(b, "s");
    return r;
  }

  /* ********************************************************** */
  // shift_expression [ ((( LESS_THAN | LESS_THAN_EQUALS | GREATER_THAN | GREATER_THAN_EQUALS ) shift_expression ) | ( is type ) | ( as type ) )*]
  public static boolean relational_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_EXPRESSION, "<relational expression>");
    r = shift_expression(b, l + 1);
    r = r && relational_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ((( LESS_THAN | LESS_THAN_EQUALS | GREATER_THAN | GREATER_THAN_EQUALS ) shift_expression ) | ( is type ) | ( as type ) )*]
  private static boolean relational_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1")) return false;
    relational_expression_1_0(b, l + 1);
    return true;
  }

  // ((( LESS_THAN | LESS_THAN_EQUALS | GREATER_THAN | GREATER_THAN_EQUALS ) shift_expression ) | ( is type ) | ( as type ) )*
  private static boolean relational_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!relational_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "relational_expression_1_0", c)) break;
    }
    return true;
  }

  // (( LESS_THAN | LESS_THAN_EQUALS | GREATER_THAN | GREATER_THAN_EQUALS ) shift_expression ) | ( is type ) | ( as type )
  private static boolean relational_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_expression_1_0_0_0(b, l + 1);
    if (!r) r = relational_expression_1_0_0_1(b, l + 1);
    if (!r) r = relational_expression_1_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( LESS_THAN | LESS_THAN_EQUALS | GREATER_THAN | GREATER_THAN_EQUALS ) shift_expression
  private static boolean relational_expression_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_expression_1_0_0_0_0(b, l + 1);
    r = r && shift_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LESS_THAN | LESS_THAN_EQUALS | GREATER_THAN | GREATER_THAN_EQUALS
  private static boolean relational_expression_1_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1_0_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, LESS_THAN_EQUALS);
    if (!r) r = consumeToken(b, GREATER_THAN);
    if (!r) r = consumeToken(b, GREATER_THAN_EQUALS);
    return r;
  }

  // is type
  private static boolean relational_expression_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IS);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // as type
  private static boolean relational_expression_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1_0_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // requires LPAREN expression RPAREN [ requires_statement ]
  public static boolean requires_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requires_statement")) return false;
    if (!nextTokenIs(b, REQUIRES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, REQUIRES, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && requires_statement_4(b, l + 1);
    exit_section_(b, m, REQUIRES_STATEMENT, r);
    return r;
  }

  // [ requires_statement ]
  private static boolean requires_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requires_statement_4")) return false;
    requires_statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // return [ expression ] SEMICOLON
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && return_statement_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // [ expression ]
  private static boolean return_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // additive_expression [ ( ( '<<' | '>>' ) additive_expression)* ]
  public static boolean shift_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_EXPRESSION, "<shift expression>");
    r = additive_expression(b, l + 1);
    r = r && shift_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ( ( '<<' | '>>' ) additive_expression)* ]
  private static boolean shift_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1")) return false;
    shift_expression_1_0(b, l + 1);
    return true;
  }

  // ( ( '<<' | '>>' ) additive_expression)*
  private static boolean shift_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!shift_expression_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "shift_expression_1_0", c)) break;
    }
    return true;
  }

  // ( '<<' | '>>' ) additive_expression
  private static boolean shift_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shift_expression_1_0_0_0(b, l + 1);
    r = r && additive_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<<' | '>>'
  private static boolean shift_expression_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, "<<");
    if (!r) r = consumeToken(b, ">>");
    return r;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ signal_declaration_modifiers ] signal (type | type_with_parenthesis) identifier
  //                        LPAREN [ parameters ] RPAREN ( SEMICOLON | block )
  public static boolean signal_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNAL_DECLARATION, "<signal declaration>");
    r = signal_declaration_0(b, l + 1);
    r = r && signal_declaration_1(b, l + 1);
    r = r && consumeToken(b, SIGNAL);
    r = r && signal_declaration_3(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && signal_declaration_6(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && signal_declaration_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ access_modifier ]
  private static boolean signal_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_0")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // [ signal_declaration_modifiers ]
  private static boolean signal_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_1")) return false;
    signal_declaration_modifiers(b, l + 1);
    return true;
  }

  // type | type_with_parenthesis
  private static boolean signal_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_3")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    return r;
  }

  // [ parameters ]
  private static boolean signal_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_6")) return false;
    parameters(b, l + 1);
    return true;
  }

  // SEMICOLON | block
  private static boolean signal_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_8")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = block(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // async | extern | inline | abstract | virtual | override | new
  public static boolean signal_declaration_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNAL_DECLARATION_MODIFIER, "<signal declaration modifier>");
    r = consumeToken(b, ASYNC);
    if (!r) r = consumeToken(b, EXTERN);
    if (!r) r = consumeToken(b, INLINE);
    if (!r) r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, VIRTUAL);
    if (!r) r = consumeToken(b, OVERRIDE);
    if (!r) r = consumeToken(b, NEW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // signal_declaration_modifier [ (signal_declaration_modifier)* ]
  public static boolean signal_declaration_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNAL_DECLARATION_MODIFIERS, "<signal declaration modifiers>");
    r = signal_declaration_modifier(b, l + 1);
    r = r && signal_declaration_modifiers_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (signal_declaration_modifier)* ]
  private static boolean signal_declaration_modifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_modifiers_1")) return false;
    signal_declaration_modifiers_1_0(b, l + 1);
    return true;
  }

  // (signal_declaration_modifier)*
  private static boolean signal_declaration_modifiers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_modifiers_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!signal_declaration_modifiers_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "signal_declaration_modifiers_1_0", c)) break;
    }
    return true;
  }

  // (signal_declaration_modifier)
  private static boolean signal_declaration_modifiers_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_modifiers_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = signal_declaration_modifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( ['global::'] identifier) [ type_arguments ]
  public static boolean simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_NAME, "<simple name>");
    r = simple_name_0(b, l + 1);
    r = r && simple_name_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['global::'] identifier
  private static boolean simple_name_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_name_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_name_0_0(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['global::']
  private static boolean simple_name_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_name_0_0")) return false;
    consumeToken(b, "global::");
    return true;
  }

  // [ type_arguments ]
  private static boolean simple_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_name_1")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // sizeof LPAREN (type | type_with_parenthesis) RPAREN
  public static boolean sizeof_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sizeof_expression")) return false;
    if (!nextTokenIs(b, SIZEOF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SIZEOF, LPAREN);
    r = r && sizeof_expression_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, SIZEOF_EXPRESSION, r);
    return r;
  }

  // type | type_with_parenthesis
  private static boolean sizeof_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sizeof_expression_2")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // block | SEMICOLON | object_or_array_creation_expression | with_statement | if_statement | switch_statement | while_statement | do_statement | for_statement | foreach_statement |
  //               break_statement | continue_statement | return_statement | yield_statement | throw_statement | method_declaration | local_variable_declarations | delegate_declaration |
  //               try_statement | delete_statement | expression_statement | lock_statement | unlock_statement | constant_declaration
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = block(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = object_or_array_creation_expression(b, l + 1);
    if (!r) r = with_statement(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = switch_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = do_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = foreach_statement(b, l + 1);
    if (!r) r = break_statement(b, l + 1);
    if (!r) r = continue_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = yield_statement(b, l + 1);
    if (!r) r = throw_statement(b, l + 1);
    if (!r) r = method_declaration(b, l + 1);
    if (!r) r = local_variable_declarations(b, l + 1);
    if (!r) r = delegate_declaration(b, l + 1);
    if (!r) r = try_statement(b, l + 1);
    if (!r) r = delete_statement(b, l + 1);
    if (!r) r = expression_statement(b, l + 1);
    if (!r) r = lock_statement(b, l + 1);
    if (!r) r = unlock_statement(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean statement_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_EXPRESSION, "<statement expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ type_declaration_modifiers ] struct symbol [type_arguments]
  //                        [ COLON base_types ] LBRACE struct_member* RBRACE
  public static boolean struct_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECLARATION, "<struct declaration>");
    r = struct_declaration_0(b, l + 1);
    r = r && struct_declaration_1(b, l + 1);
    r = r && consumeToken(b, STRUCT);
    r = r && symbol(b, l + 1);
    r = r && struct_declaration_4(b, l + 1);
    r = r && struct_declaration_5(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && struct_declaration_7(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ access_modifier ]
  private static boolean struct_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_0")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // [ type_declaration_modifiers ]
  private static boolean struct_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_1")) return false;
    type_declaration_modifiers(b, l + 1);
    return true;
  }

  // [type_arguments]
  private static boolean struct_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_4")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  // [ COLON base_types ]
  private static boolean struct_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_5")) return false;
    struct_declaration_5_0(b, l + 1);
    return true;
  }

  // COLON base_types
  private static boolean struct_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && base_types(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // struct_member*
  private static boolean struct_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!struct_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_declaration_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ attributes ] ( field_declaration | method_declaration | constant_declaration | property_declaration | creation_method_declaration )
  public static boolean struct_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_MEMBER, "<struct member>");
    r = struct_member_0(b, l + 1);
    r = r && struct_member_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ attributes ]
  private static boolean struct_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // field_declaration | method_declaration | constant_declaration | property_declaration | creation_method_declaration
  private static boolean struct_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member_1")) return false;
    boolean r;
    r = field_declaration(b, l + 1);
    if (!r) r = method_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = property_declaration(b, l + 1);
    if (!r) r = creation_method_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // case (expression (COMMA expression)*) COLON embedded_statement_without_block* [switch_default_statement]
  static boolean switch_case_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case_statement")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && switch_case_statement_1(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && switch_case_statement_3(b, l + 1);
    r = r && switch_case_statement_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression (COMMA expression)*
  private static boolean switch_case_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && switch_case_statement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA expression)*
  private static boolean switch_case_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case_statement_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!switch_case_statement_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_case_statement_1_1", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean switch_case_statement_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case_statement_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // embedded_statement_without_block*
  private static boolean switch_case_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case_statement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!embedded_statement_without_block(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_case_statement_3", c)) break;
    }
    return true;
  }

  // [switch_default_statement]
  private static boolean switch_case_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case_statement_4")) return false;
    switch_default_statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // switch_case_statement (switch_case_statement*)
  static boolean switch_case_statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case_statements")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = switch_case_statement(b, l + 1);
    r = r && switch_case_statements_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // switch_case_statement*
  private static boolean switch_case_statements_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case_statements_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!switch_case_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_case_statements_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // default COLON embedded_statement_without_block* [ (case expression COLON embedded_statement_without_block*)*]
  static boolean switch_default_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_default_statement")) return false;
    if (!nextTokenIs(b, DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFAULT, COLON);
    r = r && switch_default_statement_2(b, l + 1);
    r = r && switch_default_statement_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // embedded_statement_without_block*
  private static boolean switch_default_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_default_statement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!embedded_statement_without_block(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_default_statement_2", c)) break;
    }
    return true;
  }

  // [ (case expression COLON embedded_statement_without_block*)*]
  private static boolean switch_default_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_default_statement_3")) return false;
    switch_default_statement_3_0(b, l + 1);
    return true;
  }

  // (case expression COLON embedded_statement_without_block*)*
  private static boolean switch_default_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_default_statement_3_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!switch_default_statement_3_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_default_statement_3_0", c)) break;
    }
    return true;
  }

  // case expression COLON embedded_statement_without_block*
  private static boolean switch_default_statement_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_default_statement_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && switch_default_statement_3_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // embedded_statement_without_block*
  private static boolean switch_default_statement_3_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_default_statement_3_0_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!embedded_statement_without_block(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_default_statement_3_0_0_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // switch_case_statements | switch_default_statement
  public static boolean switch_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_section")) return false;
    if (!nextTokenIs(b, "<switch section>", CASE, DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_SECTION, "<switch section>");
    r = switch_case_statements(b, l + 1);
    if (!r) r = switch_default_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // switch LPAREN expression RPAREN LBRACE switch_section RBRACE
  public static boolean switch_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement")) return false;
    if (!nextTokenIs(b, SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SWITCH, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LBRACE);
    r = r && switch_section(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, SWITCH_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // symbol_part [QUESTION_MARK] [ (DOT symbol_part [QUESTION_MARK])* ]
  public static boolean symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL, "<symbol>");
    r = symbol_part(b, l + 1);
    r = r && symbol_1(b, l + 1);
    r = r && symbol_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [QUESTION_MARK]
  private static boolean symbol_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_1")) return false;
    consumeToken(b, QUESTION_MARK);
    return true;
  }

  // [ (DOT symbol_part [QUESTION_MARK])* ]
  private static boolean symbol_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_2")) return false;
    symbol_2_0(b, l + 1);
    return true;
  }

  // (DOT symbol_part [QUESTION_MARK])*
  private static boolean symbol_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!symbol_2_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbol_2_0", c)) break;
    }
    return true;
  }

  // DOT symbol_part [QUESTION_MARK]
  private static boolean symbol_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && symbol_part(b, l + 1);
    r = r && symbol_2_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [QUESTION_MARK]
  private static boolean symbol_2_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_2_0_0_2")) return false;
    consumeToken(b, QUESTION_MARK);
    return true;
  }

  /* ********************************************************** */
  // ( global "::" identifier ) | identifier
  public static boolean symbol_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL_PART, "<symbol part>");
    r = symbol_part_0(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // global "::" identifier
  private static boolean symbol_part_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_part_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GLOBAL);
    r = r && consumeToken(b, "::");
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '@"' [ (expression COMMA)* ] '"'
  public static boolean template(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE, "<template>");
    r = consumeToken(b, "@\"");
    r = r && template_1(b, l + 1);
    r = r && consumeToken(b, "\"");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ (expression COMMA)* ]
  private static boolean template_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_1")) return false;
    template_1_0(b, l + 1);
    return true;
  }

  // (expression COMMA)*
  private static boolean template_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!template_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "template_1_0", c)) break;
    }
    return true;
  }

  // expression COMMA
  private static boolean template_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // this
  public static boolean this_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "this_access")) return false;
    if (!nextTokenIs(b, THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THIS);
    exit_section_(b, m, THIS_ACCESS, r);
    return r;
  }

  /* ********************************************************** */
  // throw expression SEMICOLON
  public static boolean throw_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throw_statement")) return false;
    if (!nextTokenIs(b, THROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THROW);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, THROW_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // throws (type | type_with_parenthesis) [ (COMMA (type | type_with_parenthesis))* ]
  public static boolean throws_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throws_statement")) return false;
    if (!nextTokenIs(b, THROWS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THROWS);
    r = r && throws_statement_1(b, l + 1);
    r = r && throws_statement_2(b, l + 1);
    exit_section_(b, m, THROWS_STATEMENT, r);
    return r;
  }

  // type | type_with_parenthesis
  private static boolean throws_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throws_statement_1")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    return r;
  }

  // [ (COMMA (type | type_with_parenthesis))* ]
  private static boolean throws_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throws_statement_2")) return false;
    throws_statement_2_0(b, l + 1);
    return true;
  }

  // (COMMA (type | type_with_parenthesis))*
  private static boolean throws_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throws_statement_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!throws_statement_2_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "throws_statement_2_0", c)) break;
    }
    return true;
  }

  // COMMA (type | type_with_parenthesis)
  private static boolean throws_statement_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throws_statement_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && throws_statement_2_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type | type_with_parenthesis
  private static boolean throws_statement_2_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throws_statement_2_0_0_1")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // try block (catch_clauses | finally_clause)
  public static boolean try_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement")) return false;
    if (!nextTokenIs(b, TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRY);
    r = r && block(b, l + 1);
    r = r && try_statement_2(b, l + 1);
    exit_section_(b, m, TRY_STATEMENT, r);
    return r;
  }

  // catch_clauses | finally_clause
  private static boolean try_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_2")) return false;
    boolean r;
    r = catch_clauses(b, l + 1);
    if (!r) r = finally_clause(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LPAREN expression [ (COMMA expression)* ] RPAREN
  public static boolean tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && tuple_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, TUPLE, r);
    return r;
  }

  // [ (COMMA expression)* ]
  private static boolean tuple_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_2")) return false;
    tuple_2_0(b, l + 1);
    return true;
  }

  // (COMMA expression)*
  private static boolean tuple_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tuple_2_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_2_0", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean tuple_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( void [ (STAR)* ] [array_type*] ) | ( [ dynamic ] [ unowned | owned ] ['global::'] (symbol) [ type_arguments ] [ (STAR)* ] [ QUESTION_MARK ] array_type* )
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = type_0(b, l + 1);
    if (!r) r = type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // void [ (STAR)* ] [array_type*]
  private static boolean type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VOID);
    r = r && type_0_1(b, l + 1);
    r = r && type_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ (STAR)* ]
  private static boolean type_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0_1")) return false;
    type_0_1_0(b, l + 1);
    return true;
  }

  // (STAR)*
  private static boolean type_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, STAR)) break;
      if (!empty_element_parsed_guard_(b, "type_0_1_0", c)) break;
    }
    return true;
  }

  // [array_type*]
  private static boolean type_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0_2")) return false;
    type_0_2_0(b, l + 1);
    return true;
  }

  // array_type*
  private static boolean type_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_0_2_0", c)) break;
    }
    return true;
  }

  // [ dynamic ] [ unowned | owned ] ['global::'] (symbol) [ type_arguments ] [ (STAR)* ] [ QUESTION_MARK ] array_type*
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_1_0(b, l + 1);
    r = r && type_1_1(b, l + 1);
    r = r && type_1_2(b, l + 1);
    r = r && type_1_3(b, l + 1);
    r = r && type_1_4(b, l + 1);
    r = r && type_1_5(b, l + 1);
    r = r && type_1_6(b, l + 1);
    r = r && type_1_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ dynamic ]
  private static boolean type_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_0")) return false;
    consumeToken(b, DYNAMIC);
    return true;
  }

  // [ unowned | owned ]
  private static boolean type_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_1")) return false;
    type_1_1_0(b, l + 1);
    return true;
  }

  // unowned | owned
  private static boolean type_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, UNOWNED);
    if (!r) r = consumeToken(b, OWNED);
    return r;
  }

  // ['global::']
  private static boolean type_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_2")) return false;
    consumeToken(b, "global::");
    return true;
  }

  // (symbol)
  private static boolean type_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ type_arguments ]
  private static boolean type_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_4")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  // [ (STAR)* ]
  private static boolean type_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_5")) return false;
    type_1_5_0(b, l + 1);
    return true;
  }

  // (STAR)*
  private static boolean type_1_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_5_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, STAR)) break;
      if (!empty_element_parsed_guard_(b, "type_1_5_0", c)) break;
    }
    return true;
  }

  // [ QUESTION_MARK ]
  private static boolean type_1_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_6")) return false;
    consumeToken(b, QUESTION_MARK);
    return true;
  }

  // array_type*
  private static boolean type_1_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_1_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LESS_THAN [ weak ] (type_weak | type_weak_with_parenthesis) [ (COMMA (type_weak | type_weak_with_parenthesis))* ] GREATER_THAN
  public static boolean type_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments")) return false;
    if (!nextTokenIs(b, LESS_THAN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS_THAN);
    r = r && type_arguments_1(b, l + 1);
    r = r && type_arguments_2(b, l + 1);
    r = r && type_arguments_3(b, l + 1);
    r = r && consumeToken(b, GREATER_THAN);
    exit_section_(b, m, TYPE_ARGUMENTS, r);
    return r;
  }

  // [ weak ]
  private static boolean type_arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_1")) return false;
    consumeToken(b, WEAK);
    return true;
  }

  // type_weak | type_weak_with_parenthesis
  private static boolean type_arguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_2")) return false;
    boolean r;
    r = type_weak(b, l + 1);
    if (!r) r = type_weak_with_parenthesis(b, l + 1);
    return r;
  }

  // [ (COMMA (type_weak | type_weak_with_parenthesis))* ]
  private static boolean type_arguments_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_3")) return false;
    type_arguments_3_0(b, l + 1);
    return true;
  }

  // (COMMA (type_weak | type_weak_with_parenthesis))*
  private static boolean type_arguments_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_3_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_arguments_3_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_arguments_3_0", c)) break;
    }
    return true;
  }

  // COMMA (type_weak | type_weak_with_parenthesis)
  private static boolean type_arguments_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type_arguments_3_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_weak | type_weak_with_parenthesis
  private static boolean type_arguments_3_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_3_0_0_1")) return false;
    boolean r;
    r = type_weak(b, l + 1);
    if (!r) r = type_weak_with_parenthesis(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // abstract | extern | partial | sealed | static
  public static boolean type_declaration_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECLARATION_MODIFIER, "<type declaration modifier>");
    r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, EXTERN);
    if (!r) r = consumeToken(b, PARTIAL);
    if (!r) r = consumeToken(b, SEALED);
    if (!r) r = consumeToken(b, STATIC);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type_declaration_modifier [ ( type_declaration_modifier)* ]
  public static boolean type_declaration_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECLARATION_MODIFIERS, "<type declaration modifiers>");
    r = type_declaration_modifier(b, l + 1);
    r = r && type_declaration_modifiers_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ( type_declaration_modifier)* ]
  private static boolean type_declaration_modifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration_modifiers_1")) return false;
    type_declaration_modifiers_1_0(b, l + 1);
    return true;
  }

  // ( type_declaration_modifier)*
  private static boolean type_declaration_modifiers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration_modifiers_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_declaration_modifiers_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_declaration_modifiers_1_0", c)) break;
    }
    return true;
  }

  // ( type_declaration_modifier)
  private static boolean type_declaration_modifiers_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration_modifiers_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_declaration_modifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LESS_THAN identifier [ (COMMA identifier)* ] GREATER_THAN
  public static boolean type_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters")) return false;
    if (!nextTokenIs(b, LESS_THAN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS_THAN);
    r = r && identifier(b, l + 1);
    r = r && type_parameters_2(b, l + 1);
    r = r && consumeToken(b, GREATER_THAN);
    exit_section_(b, m, TYPE_PARAMETERS, r);
    return r;
  }

  // [ (COMMA identifier)* ]
  private static boolean type_parameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_2")) return false;
    type_parameters_2_0(b, l + 1);
    return true;
  }

  // (COMMA identifier)*
  private static boolean type_parameters_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_parameters_2_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_parameters_2_0", c)) break;
    }
    return true;
  }

  // COMMA identifier
  private static boolean type_parameters_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( void [ STAR* ] [array_type*]) | ( [ dynamic ] [ unowned | weak | owned ] ['global::'] (symbol) [ type_arguments ] [ STAR ] [ STAR ] [ QUESTION_MARK ] array_type* )
  public static boolean type_weak(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_WEAK, "<type weak>");
    r = type_weak_0(b, l + 1);
    if (!r) r = type_weak_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // void [ STAR* ] [array_type*]
  private static boolean type_weak_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VOID);
    r = r && type_weak_0_1(b, l + 1);
    r = r && type_weak_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ STAR* ]
  private static boolean type_weak_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_0_1")) return false;
    type_weak_0_1_0(b, l + 1);
    return true;
  }

  // STAR*
  private static boolean type_weak_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, STAR)) break;
      if (!empty_element_parsed_guard_(b, "type_weak_0_1_0", c)) break;
    }
    return true;
  }

  // [array_type*]
  private static boolean type_weak_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_0_2")) return false;
    type_weak_0_2_0(b, l + 1);
    return true;
  }

  // array_type*
  private static boolean type_weak_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_0_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_weak_0_2_0", c)) break;
    }
    return true;
  }

  // [ dynamic ] [ unowned | weak | owned ] ['global::'] (symbol) [ type_arguments ] [ STAR ] [ STAR ] [ QUESTION_MARK ] array_type*
  private static boolean type_weak_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_weak_1_0(b, l + 1);
    r = r && type_weak_1_1(b, l + 1);
    r = r && type_weak_1_2(b, l + 1);
    r = r && type_weak_1_3(b, l + 1);
    r = r && type_weak_1_4(b, l + 1);
    r = r && type_weak_1_5(b, l + 1);
    r = r && type_weak_1_6(b, l + 1);
    r = r && type_weak_1_7(b, l + 1);
    r = r && type_weak_1_8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ dynamic ]
  private static boolean type_weak_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_1_0")) return false;
    consumeToken(b, DYNAMIC);
    return true;
  }

  // [ unowned | weak | owned ]
  private static boolean type_weak_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_1_1")) return false;
    type_weak_1_1_0(b, l + 1);
    return true;
  }

  // unowned | weak | owned
  private static boolean type_weak_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, UNOWNED);
    if (!r) r = consumeToken(b, WEAK);
    if (!r) r = consumeToken(b, OWNED);
    return r;
  }

  // ['global::']
  private static boolean type_weak_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_1_2")) return false;
    consumeToken(b, "global::");
    return true;
  }

  // (symbol)
  private static boolean type_weak_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ type_arguments ]
  private static boolean type_weak_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_1_4")) return false;
    type_arguments(b, l + 1);
    return true;
  }

  // [ STAR ]
  private static boolean type_weak_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_1_5")) return false;
    consumeToken(b, STAR);
    return true;
  }

  // [ STAR ]
  private static boolean type_weak_1_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_1_6")) return false;
    consumeToken(b, STAR);
    return true;
  }

  // [ QUESTION_MARK ]
  private static boolean type_weak_1_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_1_7")) return false;
    consumeToken(b, QUESTION_MARK);
    return true;
  }

  // array_type*
  private static boolean type_weak_1_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_1_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_weak_1_8", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN type_weak RPAREN array_type*
  public static boolean type_weak_with_parenthesis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_with_parenthesis")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && type_weak(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && type_weak_with_parenthesis_3(b, l + 1);
    exit_section_(b, m, TYPE_WEAK_WITH_PARENTHESIS, r);
    return r;
  }

  // array_type*
  private static boolean type_weak_with_parenthesis_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_weak_with_parenthesis_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_weak_with_parenthesis_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN type RPAREN array_type*
  public static boolean type_with_parenthesis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_with_parenthesis")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && type_with_parenthesis_3(b, l + 1);
    exit_section_(b, m, TYPE_WITH_PARENTHESIS, r);
    return r;
  }

  // array_type*
  private static boolean type_with_parenthesis_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_with_parenthesis_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_type(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_with_parenthesis_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // typeof LPAREN (type | type_with_parenthesis) RPAREN
  public static boolean typeof_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeof_expression")) return false;
    if (!nextTokenIs(b, TYPEOF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPEOF, LPAREN);
    r = r && typeof_expression_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, TYPEOF_EXPRESSION, r);
    return r;
  }

  // type | type_with_parenthesis
  private static boolean typeof_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeof_expression_2")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ( unary_operator unary_expression ) |
  //                      ( LPAREN ( owned | void | dynamic | EXCLAMATION | (type | type_with_parenthesis) ) [STAR] RPAREN unary_expression ) |
  //                      primary_expression
  public static boolean unary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_EXPRESSION, "<unary expression>");
    r = unary_expression_0(b, l + 1);
    if (!r) r = unary_expression_1(b, l + 1);
    if (!r) r = primary_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // unary_operator unary_expression
  private static boolean unary_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_operator(b, l + 1);
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN ( owned | void | dynamic | EXCLAMATION | (type | type_with_parenthesis) ) [STAR] RPAREN unary_expression
  private static boolean unary_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && unary_expression_1_1(b, l + 1);
    r = r && unary_expression_1_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // owned | void | dynamic | EXCLAMATION | (type | type_with_parenthesis)
  private static boolean unary_expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OWNED);
    if (!r) r = consumeToken(b, VOID);
    if (!r) r = consumeToken(b, DYNAMIC);
    if (!r) r = consumeToken(b, EXCLAMATION);
    if (!r) r = unary_expression_1_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type | type_with_parenthesis
  private static boolean unary_expression_1_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_1_1_4")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = type_with_parenthesis(b, l + 1);
    return r;
  }

  // [STAR]
  private static boolean unary_expression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_1_2")) return false;
    consumeToken(b, STAR);
    return true;
  }

  /* ********************************************************** */
  // PLUS | MINUS | EXCLAMATION | TILDE | INCREMENT | DECREMENT | STAR | AND | "(owned)" | "(void)" | "(dynamic)" | "(!)"
  public static boolean unary_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OPERATOR, "<unary operator>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, EXCLAMATION);
    if (!r) r = consumeToken(b, TILDE);
    if (!r) r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    if (!r) r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, "(owned)");
    if (!r) r = consumeToken(b, "(void)");
    if (!r) r = consumeToken(b, "(dynamic)");
    if (!r) r = consumeToken(b, "(!)");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // unlock LPAREN expression RPAREN SEMICOLON
  public static boolean unlock_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unlock_statement")) return false;
    if (!nextTokenIs(b, UNLOCK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, UNLOCK, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, SEMICOLON);
    exit_section_(b, m, UNLOCK_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // using symbol [ (COMMA symbol)* ] SEMICOLON
  public static boolean using_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_directive")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USING);
    r = r && symbol(b, l + 1);
    r = r && using_directive_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, USING_DIRECTIVE, r);
    return r;
  }

  // [ (COMMA symbol)* ]
  private static boolean using_directive_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_directive_2")) return false;
    using_directive_2_0(b, l + 1);
    return true;
  }

  // (COMMA symbol)*
  private static boolean using_directive_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_directive_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!using_directive_2_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "using_directive_2_0", c)) break;
    }
    return true;
  }

  // COMMA symbol
  private static boolean using_directive_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_directive_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( abstract
  //                             | async
  //                             | base
  //                             | break
  //                             | catch
  //                             | class
  //                             | construct
  //                             | continue
  //                             | delegate
  //                             | delete
  //                             | dynamic
  //                             | enum
  //                             | ensures
  //                             | errordomain
  //                             | extern
  //                             | false
  //                             | finally
  //                             | for
  //                             | foreach
  //                             | get
  //                             | in
  //                             | inline
  //                             | interface
  //                             | is
  //                             | lock
  //                             | out
  //                             | override
  //                             | owned
  //                             | partial
  //                             | ref
  //                             | requires
  //                             | return
  //                             | sealed
  //                             | set
  //                             | signal
  //                             | sizeof
  //                             | static
  //                             | struct
  //                             | switch
  //                             | typeof
  //                             | unlock
  //                             | virtual
  //                             | volatile
  //                             | new
  //                             | void
  //                             | params
  //                             | if
  //                             | while
  //                             | do
  //                             | throw
  //                             | try
  //                             | with
  //                             | string
  //                             | internal
  //                             | using
  //                             | yield
  //                             | double
  //                             | int
  //                             | var
  //                             | namespace
  //                             | global ) [QUESTION_MARK]
  public static boolean valid_identifier_keywords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valid_identifier_keywords")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALID_IDENTIFIER_KEYWORDS, "<valid identifier keywords>");
    r = valid_identifier_keywords_0(b, l + 1);
    r = r && valid_identifier_keywords_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // abstract
  //                             | async
  //                             | base
  //                             | break
  //                             | catch
  //                             | class
  //                             | construct
  //                             | continue
  //                             | delegate
  //                             | delete
  //                             | dynamic
  //                             | enum
  //                             | ensures
  //                             | errordomain
  //                             | extern
  //                             | false
  //                             | finally
  //                             | for
  //                             | foreach
  //                             | get
  //                             | in
  //                             | inline
  //                             | interface
  //                             | is
  //                             | lock
  //                             | out
  //                             | override
  //                             | owned
  //                             | partial
  //                             | ref
  //                             | requires
  //                             | return
  //                             | sealed
  //                             | set
  //                             | signal
  //                             | sizeof
  //                             | static
  //                             | struct
  //                             | switch
  //                             | typeof
  //                             | unlock
  //                             | virtual
  //                             | volatile
  //                             | new
  //                             | void
  //                             | params
  //                             | if
  //                             | while
  //                             | do
  //                             | throw
  //                             | try
  //                             | with
  //                             | string
  //                             | internal
  //                             | using
  //                             | yield
  //                             | double
  //                             | int
  //                             | var
  //                             | namespace
  //                             | global
  private static boolean valid_identifier_keywords_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valid_identifier_keywords_0")) return false;
    boolean r;
    r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, ASYNC);
    if (!r) r = consumeToken(b, BASE);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = consumeToken(b, CATCH);
    if (!r) r = consumeToken(b, CLASS);
    if (!r) r = consumeToken(b, CONSTRUCT);
    if (!r) r = consumeToken(b, CONTINUE);
    if (!r) r = consumeToken(b, DELEGATE);
    if (!r) r = consumeToken(b, DELETE);
    if (!r) r = consumeToken(b, DYNAMIC);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, ENSURES);
    if (!r) r = consumeToken(b, ERRORDOMAIN);
    if (!r) r = consumeToken(b, EXTERN);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, FINALLY);
    if (!r) r = consumeToken(b, FOR);
    if (!r) r = consumeToken(b, FOREACH);
    if (!r) r = consumeToken(b, GET);
    if (!r) r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, INLINE);
    if (!r) r = consumeToken(b, INTERFACE);
    if (!r) r = consumeToken(b, IS);
    if (!r) r = consumeToken(b, LOCK);
    if (!r) r = consumeToken(b, OUT);
    if (!r) r = consumeToken(b, OVERRIDE);
    if (!r) r = consumeToken(b, OWNED);
    if (!r) r = consumeToken(b, PARTIAL);
    if (!r) r = consumeToken(b, REF);
    if (!r) r = consumeToken(b, REQUIRES);
    if (!r) r = consumeToken(b, RETURN);
    if (!r) r = consumeToken(b, SEALED);
    if (!r) r = consumeToken(b, SET);
    if (!r) r = consumeToken(b, SIGNAL);
    if (!r) r = consumeToken(b, SIZEOF);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, STRUCT);
    if (!r) r = consumeToken(b, SWITCH);
    if (!r) r = consumeToken(b, TYPEOF);
    if (!r) r = consumeToken(b, UNLOCK);
    if (!r) r = consumeToken(b, VIRTUAL);
    if (!r) r = consumeToken(b, VOLATILE);
    if (!r) r = consumeToken(b, NEW);
    if (!r) r = consumeToken(b, VOID);
    if (!r) r = consumeToken(b, PARAMS);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, WHILE);
    if (!r) r = consumeToken(b, DO);
    if (!r) r = consumeToken(b, THROW);
    if (!r) r = consumeToken(b, TRY);
    if (!r) r = consumeToken(b, WITH);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, INTERNAL);
    if (!r) r = consumeToken(b, USING);
    if (!r) r = consumeToken(b, YIELD);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, NAMESPACE);
    if (!r) r = consumeToken(b, GLOBAL);
    return r;
  }

  // [QUESTION_MARK]
  private static boolean valid_identifier_keywords_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valid_identifier_keywords_1")) return false;
    consumeToken(b, QUESTION_MARK);
    return true;
  }

  /* ********************************************************** */
  // while LPAREN expression RPAREN embedded_statement
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && embedded_statement(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // with LPAREN (local_variable_declarations | expression) RPAREN
  public static boolean with_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "with_statement")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WITH, LPAREN);
    r = r && with_statement_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, WITH_STATEMENT, r);
    return r;
  }

  // local_variable_declarations | expression
  private static boolean with_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "with_statement_2")) return false;
    boolean r;
    r = local_variable_declarations(b, l + 1);
    if (!r) r = expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // yield [new] [ base_access DOT ] member [ (member_access | method_call)* ]
  public static boolean yield_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expression")) return false;
    if (!nextTokenIs(b, YIELD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, YIELD);
    r = r && yield_expression_1(b, l + 1);
    r = r && yield_expression_2(b, l + 1);
    r = r && member(b, l + 1);
    r = r && yield_expression_4(b, l + 1);
    exit_section_(b, m, YIELD_EXPRESSION, r);
    return r;
  }

  // [new]
  private static boolean yield_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expression_1")) return false;
    consumeToken(b, NEW);
    return true;
  }

  // [ base_access DOT ]
  private static boolean yield_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expression_2")) return false;
    yield_expression_2_0(b, l + 1);
    return true;
  }

  // base_access DOT
  private static boolean yield_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = base_access(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ (member_access | method_call)* ]
  private static boolean yield_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expression_4")) return false;
    yield_expression_4_0(b, l + 1);
    return true;
  }

  // (member_access | method_call)*
  private static boolean yield_expression_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expression_4_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!yield_expression_4_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "yield_expression_4_0", c)) break;
    }
    return true;
  }

  // member_access | method_call
  private static boolean yield_expression_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_expression_4_0_0")) return false;
    boolean r;
    r = member_access(b, l + 1);
    if (!r) r = method_call(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // yield SEMICOLON | yield_expression [SEMICOLON]
  public static boolean yield_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_statement")) return false;
    if (!nextTokenIs(b, YIELD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, YIELD, SEMICOLON);
    if (!r) r = yield_statement_1(b, l + 1);
    exit_section_(b, m, YIELD_STATEMENT, r);
    return r;
  }

  // yield_expression [SEMICOLON]
  private static boolean yield_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = yield_expression(b, l + 1);
    r = r && yield_statement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SEMICOLON]
  private static boolean yield_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_statement_1_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

}
