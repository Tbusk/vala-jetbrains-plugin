// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static dev.vala.jetbrains.parser.psi.ValaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ValaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return input(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // private | protected | internal | public
  public static boolean access_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "access_modifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ACCESS_MODIFIER, "<access modifier>");
    result_ = consumeToken(builder_, PRIVATE);
    if (!result_) result_ = consumeToken(builder_, PROTECTED);
    if (!result_) result_ = consumeToken(builder_, INTERNAL);
    if (!result_) result_ = consumeToken(builder_, PUBLIC);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // multiplicative_expression [ (( PLUS | MINUS ) multiplicative_expression)* ]
  public static boolean additive_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ADDITIVE_EXPRESSION, "<additive expression>");
    result_ = multiplicative_expression(builder_, level_ + 1);
    result_ = result_ && additive_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (( PLUS | MINUS ) multiplicative_expression)* ]
  private static boolean additive_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_expression_1")) return false;
    additive_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // (( PLUS | MINUS ) multiplicative_expression)*
  private static boolean additive_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!additive_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "additive_expression_1_0", pos_)) break;
    }
    return true;
  }

  // ( PLUS | MINUS ) multiplicative_expression
  private static boolean additive_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = additive_expression_1_0_0_0(builder_, level_ + 1);
    result_ = result_ && multiplicative_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PLUS | MINUS
  private static boolean additive_expression_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_expression_1_0_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    return result_;
  }

  /* ********************************************************** */
  // equality_expression [ ( AND equality_expression )* ]
  public static boolean and_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "and_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, AND_EXPRESSION, "<and expression>");
    result_ = equality_expression(builder_, level_ + 1);
    result_ = result_ && and_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ ( AND equality_expression )* ]
  private static boolean and_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "and_expression_1")) return false;
    and_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // ( AND equality_expression )*
  private static boolean and_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "and_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!and_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "and_expression_1_0", pos_)) break;
    }
    return true;
  }

  // AND equality_expression
  private static boolean and_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "and_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AND);
    result_ = result_ && equality_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ref | out] (expression | identifier COLON expression | identifier)
  public static boolean argument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARGUMENT, "<argument>");
    result_ = argument_0(builder_, level_ + 1);
    result_ = result_ && argument_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ref | out]
  private static boolean argument_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_0")) return false;
    argument_0_0(builder_, level_ + 1);
    return true;
  }

  // ref | out
  private static boolean argument_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, REF);
    if (!result_) result_ = consumeToken(builder_, OUT);
    return result_;
  }

  // expression | identifier COLON expression | identifier
  private static boolean argument_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = argument_1_1(builder_, level_ + 1);
    if (!result_) result_ = identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier COLON expression
  private static boolean argument_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( named_argument | argument) [ (COMMA (named_argument | argument))* ]
  public static boolean arguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARGUMENTS, "<arguments>");
    result_ = arguments_0(builder_, level_ + 1);
    result_ = result_ && arguments_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // named_argument | argument
  private static boolean arguments_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments_0")) return false;
    boolean result_;
    result_ = named_argument(builder_, level_ + 1);
    if (!result_) result_ = argument(builder_, level_ + 1);
    return result_;
  }

  // [ (COMMA (named_argument | argument))* ]
  private static boolean arguments_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments_1")) return false;
    arguments_1_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA (named_argument | argument))*
  private static boolean arguments_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!arguments_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "arguments_1_0", pos_)) break;
    }
    return true;
  }

  // COMMA (named_argument | argument)
  private static boolean arguments_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && arguments_1_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // named_argument | argument
  private static boolean arguments_1_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments_1_0_0_1")) return false;
    boolean result_;
    result_ = named_argument(builder_, level_ + 1);
    if (!result_) result_ = argument(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // [ (LBRACKET RBRACKET)* ] [ LBRACKET [ array_size ] RBRACKET ] [ initializer ]
  public static boolean array_creation_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_creation_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARRAY_CREATION_EXPRESSION, "<array creation expression>");
    result_ = array_creation_expression_0(builder_, level_ + 1);
    result_ = result_ && array_creation_expression_1(builder_, level_ + 1);
    result_ = result_ && array_creation_expression_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (LBRACKET RBRACKET)* ]
  private static boolean array_creation_expression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_creation_expression_0")) return false;
    array_creation_expression_0_0(builder_, level_ + 1);
    return true;
  }

  // (LBRACKET RBRACKET)*
  private static boolean array_creation_expression_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_creation_expression_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!array_creation_expression_0_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "array_creation_expression_0_0", pos_)) break;
    }
    return true;
  }

  // LBRACKET RBRACKET
  private static boolean array_creation_expression_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_creation_expression_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LBRACKET, RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ LBRACKET [ array_size ] RBRACKET ]
  private static boolean array_creation_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_creation_expression_1")) return false;
    array_creation_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // LBRACKET [ array_size ] RBRACKET
  private static boolean array_creation_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_creation_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && array_creation_expression_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ array_size ]
  private static boolean array_creation_expression_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_creation_expression_1_0_1")) return false;
    array_size(builder_, level_ + 1);
    return true;
  }

  // [ initializer ]
  private static boolean array_creation_expression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_creation_expression_2")) return false;
    initializer(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (expression | COMMA) [ (COMMA | COMMA expression)* ]
  public static boolean array_size(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_size")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARRAY_SIZE, "<array size>");
    result_ = array_size_0(builder_, level_ + 1);
    result_ = result_ && array_size_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // expression | COMMA
  private static boolean array_size_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_size_0")) return false;
    boolean result_;
    result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, COMMA);
    return result_;
  }

  // [ (COMMA | COMMA expression)* ]
  private static boolean array_size_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_size_1")) return false;
    array_size_1_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA | COMMA expression)*
  private static boolean array_size_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_size_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!array_size_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "array_size_1_0", pos_)) break;
    }
    return true;
  }

  // COMMA | COMMA expression
  private static boolean array_size_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_size_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = array_size_1_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMA expression
  private static boolean array_size_1_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_size_1_0_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACKET [[(array_size | member | expression)] [(COLON) | (COMMA)*] [(array_size | member | expression)] ] RBRACKET [ QUESTION_MARK ]
  public static boolean array_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && array_type_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    result_ = result_ && array_type_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, ARRAY_TYPE, result_);
    return result_;
  }

  // [[(array_size | member | expression)] [(COLON) | (COMMA)*] [(array_size | member | expression)] ]
  private static boolean array_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type_1")) return false;
    array_type_1_0(builder_, level_ + 1);
    return true;
  }

  // [(array_size | member | expression)] [(COLON) | (COMMA)*] [(array_size | member | expression)]
  private static boolean array_type_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = array_type_1_0_0(builder_, level_ + 1);
    result_ = result_ && array_type_1_0_1(builder_, level_ + 1);
    result_ = result_ && array_type_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [(array_size | member | expression)]
  private static boolean array_type_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type_1_0_0")) return false;
    array_type_1_0_0_0(builder_, level_ + 1);
    return true;
  }

  // array_size | member | expression
  private static boolean array_type_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type_1_0_0_0")) return false;
    boolean result_;
    result_ = array_size(builder_, level_ + 1);
    if (!result_) result_ = member(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    return result_;
  }

  // [(COLON) | (COMMA)*]
  private static boolean array_type_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type_1_0_1")) return false;
    array_type_1_0_1_0(builder_, level_ + 1);
    return true;
  }

  // (COLON) | (COMMA)*
  private static boolean array_type_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    if (!result_) result_ = array_type_1_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA)*
  private static boolean array_type_1_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type_1_0_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, COMMA)) break;
      if (!empty_element_parsed_guard_(builder_, "array_type_1_0_1_0_1", pos_)) break;
    }
    return true;
  }

  // [(array_size | member | expression)]
  private static boolean array_type_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type_1_0_2")) return false;
    array_type_1_0_2_0(builder_, level_ + 1);
    return true;
  }

  // array_size | member | expression
  private static boolean array_type_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type_1_0_2_0")) return false;
    boolean result_;
    result_ = array_size(builder_, level_ + 1);
    if (!result_) result_ = member(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    return result_;
  }

  // [ QUESTION_MARK ]
  private static boolean array_type_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_type_3")) return false;
    consumeToken(builder_, QUESTION_MARK);
    return true;
  }

  /* ********************************************************** */
  // EQUALS | PIPE_EQUALS | PLUS_EQUALS | MINUS_EQUALS | AND_EQUALS | XOR_EQUALS | DIVIDE_EQUALS | MULTIPLY_EQUALS | MODULO_EQUALS | SHIFT_LEFT_EQUALS | SHIFT_RIGHT_EQUALS
  public static boolean assignment_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASSIGNMENT_OPERATOR, "<assignment operator>");
    result_ = consumeToken(builder_, EQUALS);
    if (!result_) result_ = consumeToken(builder_, PIPE_EQUALS);
    if (!result_) result_ = consumeToken(builder_, PLUS_EQUALS);
    if (!result_) result_ = consumeToken(builder_, MINUS_EQUALS);
    if (!result_) result_ = consumeToken(builder_, AND_EQUALS);
    if (!result_) result_ = consumeToken(builder_, XOR_EQUALS);
    if (!result_) result_ = consumeToken(builder_, DIVIDE_EQUALS);
    if (!result_) result_ = consumeToken(builder_, MULTIPLY_EQUALS);
    if (!result_) result_ = consumeToken(builder_, MODULO_EQUALS);
    if (!result_) result_ = consumeToken(builder_, SHIFT_LEFT_EQUALS);
    if (!result_) result_ = consumeToken(builder_, SHIFT_RIGHT_EQUALS);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // identifier [ attribute_arguments ]
  public static boolean attribute(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTRIBUTE, "<attribute>");
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && attribute_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ attribute_arguments ]
  private static boolean attribute_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_1")) return false;
    attribute_arguments(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier EQUALS expression
  public static boolean attribute_argument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_argument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTRIBUTE_ARGUMENT, "<attribute argument>");
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUALS);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LPAREN [attribute_argument [ (COMMA attribute_argument)* ] ] RPAREN
  public static boolean attribute_arguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_arguments")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && attribute_arguments_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, ATTRIBUTE_ARGUMENTS, result_);
    return result_;
  }

  // [attribute_argument [ (COMMA attribute_argument)* ] ]
  private static boolean attribute_arguments_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_arguments_1")) return false;
    attribute_arguments_1_0(builder_, level_ + 1);
    return true;
  }

  // attribute_argument [ (COMMA attribute_argument)* ]
  private static boolean attribute_arguments_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_arguments_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attribute_argument(builder_, level_ + 1);
    result_ = result_ && attribute_arguments_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ (COMMA attribute_argument)* ]
  private static boolean attribute_arguments_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_arguments_1_0_1")) return false;
    attribute_arguments_1_0_1_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA attribute_argument)*
  private static boolean attribute_arguments_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_arguments_1_0_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attribute_arguments_1_0_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "attribute_arguments_1_0_1_0", pos_)) break;
    }
    return true;
  }

  // COMMA attribute_argument
  private static boolean attribute_arguments_1_0_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_arguments_1_0_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && attribute_argument(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACKET attribute [ (COMMA attribute)* ] RBRACKET
  public static boolean attributes(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributes")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && attribute(builder_, level_ + 1);
    result_ = result_ && attributes_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, ATTRIBUTES, result_);
    return result_;
  }

  // [ (COMMA attribute)* ]
  private static boolean attributes_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributes_2")) return false;
    attributes_2_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA attribute)*
  private static boolean attributes_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributes_2_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributes_2_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "attributes_2_0", pos_)) break;
    }
    return true;
  }

  // COMMA attribute
  private static boolean attributes_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributes_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // base
  public static boolean base_access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "base_access")) return false;
    if (!nextTokenIs(builder_, BASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BASE);
    exit_section_(builder_, marker_, BASE_ACCESS, result_);
    return result_;
  }

  /* ********************************************************** */
  // (type | type_with_parenthesis) [type_arguments] [ (COMMA (type | type_with_parenthesis) [type_arguments])* ]
  public static boolean base_types(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "base_types")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BASE_TYPES, "<base types>");
    result_ = base_types_0(builder_, level_ + 1);
    result_ = result_ && base_types_1(builder_, level_ + 1);
    result_ = result_ && base_types_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // type | type_with_parenthesis
  private static boolean base_types_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "base_types_0")) return false;
    boolean result_;
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  // [type_arguments]
  private static boolean base_types_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "base_types_1")) return false;
    type_arguments(builder_, level_ + 1);
    return true;
  }

  // [ (COMMA (type | type_with_parenthesis) [type_arguments])* ]
  private static boolean base_types_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "base_types_2")) return false;
    base_types_2_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA (type | type_with_parenthesis) [type_arguments])*
  private static boolean base_types_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "base_types_2_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!base_types_2_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "base_types_2_0", pos_)) break;
    }
    return true;
  }

  // COMMA (type | type_with_parenthesis) [type_arguments]
  private static boolean base_types_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "base_types_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && base_types_2_0_0_1(builder_, level_ + 1);
    result_ = result_ && base_types_2_0_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // type | type_with_parenthesis
  private static boolean base_types_2_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "base_types_2_0_0_1")) return false;
    boolean result_;
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  // [type_arguments]
  private static boolean base_types_2_0_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "base_types_2_0_0_2")) return false;
    type_arguments(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACE statement* RBRACE
  public static boolean block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && block_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, BLOCK, result_);
    return result_;
  }

  // statement*
  private static boolean block_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "block_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // break SEMICOLON
  public static boolean break_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "break_statement")) return false;
    if (!nextTokenIs(builder_, BREAK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, BREAK, SEMICOLON);
    exit_section_(builder_, marker_, BREAK_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // catch [ LPAREN (type_weak | type_weak_with_parenthesis) identifier RPAREN ] block
  public static boolean catch_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "catch_clause")) return false;
    if (!nextTokenIs(builder_, CATCH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CATCH);
    result_ = result_ && catch_clause_1(builder_, level_ + 1);
    result_ = result_ && block(builder_, level_ + 1);
    exit_section_(builder_, marker_, CATCH_CLAUSE, result_);
    return result_;
  }

  // [ LPAREN (type_weak | type_weak_with_parenthesis) identifier RPAREN ]
  private static boolean catch_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "catch_clause_1")) return false;
    catch_clause_1_0(builder_, level_ + 1);
    return true;
  }

  // LPAREN (type_weak | type_weak_with_parenthesis) identifier RPAREN
  private static boolean catch_clause_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "catch_clause_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && catch_clause_1_0_1(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // type_weak | type_weak_with_parenthesis
  private static boolean catch_clause_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "catch_clause_1_0_1")) return false;
    boolean result_;
    result_ = type_weak(builder_, level_ + 1);
    if (!result_) result_ = type_weak_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // catch_clause (catch_clause)* [finally_clause]
  public static boolean catch_clauses(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "catch_clauses")) return false;
    if (!nextTokenIs(builder_, CATCH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = catch_clause(builder_, level_ + 1);
    result_ = result_ && catch_clauses_1(builder_, level_ + 1);
    result_ = result_ && catch_clauses_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, CATCH_CLAUSES, result_);
    return result_;
  }

  // (catch_clause)*
  private static boolean catch_clauses_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "catch_clauses_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!catch_clauses_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "catch_clauses_1", pos_)) break;
    }
    return true;
  }

  // (catch_clause)
  private static boolean catch_clauses_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "catch_clauses_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = catch_clause(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [finally_clause]
  private static boolean catch_clauses_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "catch_clauses_2")) return false;
    finally_clause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ type_declaration_modifiers ] class symbol [ type_arguments ]
  //                       [ COLON base_types ] LBRACE class_member* RBRACE
  public static boolean class_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_DECLARATION, "<class declaration>");
    result_ = class_declaration_0(builder_, level_ + 1);
    result_ = result_ && class_declaration_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLASS);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && class_declaration_4(builder_, level_ + 1);
    result_ = result_ && class_declaration_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACE);
    result_ = result_ && class_declaration_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ access_modifier ]
  private static boolean class_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_0")) return false;
    access_modifier(builder_, level_ + 1);
    return true;
  }

  // [ type_declaration_modifiers ]
  private static boolean class_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_1")) return false;
    type_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  // [ type_arguments ]
  private static boolean class_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_4")) return false;
    type_arguments(builder_, level_ + 1);
    return true;
  }

  // [ COLON base_types ]
  private static boolean class_declaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_5")) return false;
    class_declaration_5_0(builder_, level_ + 1);
    return true;
  }

  // COLON base_types
  private static boolean class_declaration_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && base_types(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // class_member*
  private static boolean class_declaration_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_7")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!class_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "class_declaration_7", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ attributes* ]
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
  //                    constant_declarations |
  //                    constructor_declaration |
  //                    destructor_declaration)
  public static boolean class_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_MEMBER, "<class member>");
    result_ = class_member_0(builder_, level_ + 1);
    result_ = result_ && class_member_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ attributes* ]
  private static boolean class_member_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_member_0")) return false;
    class_member_0_0(builder_, level_ + 1);
    return true;
  }

  // attributes*
  private static boolean class_member_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_member_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "class_member_0_0", pos_)) break;
    }
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
  //                    constant_declarations |
  //                    constructor_declaration |
  //                    destructor_declaration
  private static boolean class_member_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_member_1")) return false;
    boolean result_;
    result_ = class_declaration(builder_, level_ + 1);
    if (!result_) result_ = interface_declaration(builder_, level_ + 1);
    if (!result_) result_ = struct_declaration(builder_, level_ + 1);
    if (!result_) result_ = enum_declaration(builder_, level_ + 1);
    if (!result_) result_ = creation_method_declaration(builder_, level_ + 1);
    if (!result_) result_ = method_declaration(builder_, level_ + 1);
    if (!result_) result_ = delegate_declaration(builder_, level_ + 1);
    if (!result_) result_ = property_declaration(builder_, level_ + 1);
    if (!result_) result_ = signal_declaration(builder_, level_ + 1);
    if (!result_) result_ = field_declaration(builder_, level_ + 1);
    if (!result_) result_ = constant_declarations(builder_, level_ + 1);
    if (!result_) result_ = constructor_declaration(builder_, level_ + 1);
    if (!result_) result_ = destructor_declaration(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // conditional_or_expression [ (COALESCING coalescing_expression)* ]
  public static boolean coalescing_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "coalescing_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COALESCING_EXPRESSION, "<coalescing expression>");
    result_ = conditional_or_expression(builder_, level_ + 1);
    result_ = result_ && coalescing_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (COALESCING coalescing_expression)* ]
  private static boolean coalescing_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "coalescing_expression_1")) return false;
    coalescing_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // (COALESCING coalescing_expression)*
  private static boolean coalescing_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "coalescing_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!coalescing_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "coalescing_expression_1_0", pos_)) break;
    }
    return true;
  }

  // COALESCING coalescing_expression
  private static boolean coalescing_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "coalescing_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COALESCING);
    result_ = result_ && coalescing_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // in_expression [ (AND_AND in_expression)* ]
  public static boolean conditional_and_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_and_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONDITIONAL_AND_EXPRESSION, "<conditional and expression>");
    result_ = in_expression(builder_, level_ + 1);
    result_ = result_ && conditional_and_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (AND_AND in_expression)* ]
  private static boolean conditional_and_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_and_expression_1")) return false;
    conditional_and_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // (AND_AND in_expression)*
  private static boolean conditional_and_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_and_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!conditional_and_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "conditional_and_expression_1_0", pos_)) break;
    }
    return true;
  }

  // AND_AND in_expression
  private static boolean conditional_and_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_and_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AND_AND);
    result_ = result_ && in_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // coalescing_expression [ (QUESTION_MARK expression COLON expression)* ]
  public static boolean conditional_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONDITIONAL_EXPRESSION, "<conditional expression>");
    result_ = coalescing_expression(builder_, level_ + 1);
    result_ = result_ && conditional_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (QUESTION_MARK expression COLON expression)* ]
  private static boolean conditional_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_expression_1")) return false;
    conditional_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // (QUESTION_MARK expression COLON expression)*
  private static boolean conditional_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!conditional_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "conditional_expression_1_0", pos_)) break;
    }
    return true;
  }

  // QUESTION_MARK expression COLON expression
  private static boolean conditional_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, QUESTION_MARK);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // conditional_and_expression [ (OR_OR conditional_and_expression)* ]
  public static boolean conditional_or_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_or_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONDITIONAL_OR_EXPRESSION, "<conditional or expression>");
    result_ = conditional_and_expression(builder_, level_ + 1);
    result_ = result_ && conditional_or_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (OR_OR conditional_and_expression)* ]
  private static boolean conditional_or_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_or_expression_1")) return false;
    conditional_or_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // (OR_OR conditional_and_expression)*
  private static boolean conditional_or_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_or_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!conditional_or_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "conditional_or_expression_1_0", pos_)) break;
    }
    return true;
  }

  // OR_OR conditional_and_expression
  private static boolean conditional_or_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_or_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OR_OR);
    result_ = result_ && conditional_and_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier [ inline_array_type ][ EQUALS expression ]
  public static boolean constant_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONSTANT_DECLARATION, "<constant declaration>");
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && constant_declaration_1(builder_, level_ + 1);
    result_ = result_ && constant_declaration_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ inline_array_type ]
  private static boolean constant_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declaration_1")) return false;
    inline_array_type(builder_, level_ + 1);
    return true;
  }

  // [ EQUALS expression ]
  private static boolean constant_declaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declaration_2")) return false;
    constant_declaration_2_0(builder_, level_ + 1);
    return true;
  }

  // EQUALS expression
  private static boolean constant_declaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQUALS);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ member_declaration_modifiers ] const (type [ inline_array_type ])
  //                           (constant_declaration (COMMA constant_declaration)*) SEMICOLON
  public static boolean constant_declarations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declarations")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONSTANT_DECLARATIONS, "<constant declarations>");
    result_ = constant_declarations_0(builder_, level_ + 1);
    result_ = result_ && constant_declarations_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CONST);
    result_ = result_ && constant_declarations_3(builder_, level_ + 1);
    result_ = result_ && constant_declarations_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ access_modifier ]
  private static boolean constant_declarations_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declarations_0")) return false;
    access_modifier(builder_, level_ + 1);
    return true;
  }

  // [ member_declaration_modifiers ]
  private static boolean constant_declarations_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declarations_1")) return false;
    member_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  // type [ inline_array_type ]
  private static boolean constant_declarations_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declarations_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type(builder_, level_ + 1);
    result_ = result_ && constant_declarations_3_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ inline_array_type ]
  private static boolean constant_declarations_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declarations_3_1")) return false;
    inline_array_type(builder_, level_ + 1);
    return true;
  }

  // constant_declaration (COMMA constant_declaration)*
  private static boolean constant_declarations_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declarations_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constant_declaration(builder_, level_ + 1);
    result_ = result_ && constant_declarations_4_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA constant_declaration)*
  private static boolean constant_declarations_4_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declarations_4_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!constant_declarations_4_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "constant_declarations_4_1", pos_)) break;
    }
    return true;
  }

  // COMMA constant_declaration
  private static boolean constant_declarations_4_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_declarations_4_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && constant_declaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ constructor_declaration_modifiers ] construct block
  public static boolean constructor_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constructor_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONSTRUCTOR_DECLARATION, "<constructor declaration>");
    result_ = constructor_declaration_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CONSTRUCT);
    result_ = result_ && block(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ constructor_declaration_modifiers ]
  private static boolean constructor_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constructor_declaration_0")) return false;
    constructor_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // async | class | extern | inline | static | abstract | virtual | override
  public static boolean constructor_declaration_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constructor_declaration_modifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONSTRUCTOR_DECLARATION_MODIFIER, "<constructor declaration modifier>");
    result_ = consumeToken(builder_, ASYNC);
    if (!result_) result_ = consumeToken(builder_, CLASS);
    if (!result_) result_ = consumeToken(builder_, EXTERN);
    if (!result_) result_ = consumeToken(builder_, INLINE);
    if (!result_) result_ = consumeToken(builder_, STATIC);
    if (!result_) result_ = consumeToken(builder_, ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, VIRTUAL);
    if (!result_) result_ = consumeToken(builder_, OVERRIDE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // constructor_declaration_modifier [ ( constructor_declaration_modifier )* ]
  public static boolean constructor_declaration_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constructor_declaration_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONSTRUCTOR_DECLARATION_MODIFIERS, "<constructor declaration modifiers>");
    result_ = constructor_declaration_modifier(builder_, level_ + 1);
    result_ = result_ && constructor_declaration_modifiers_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ ( constructor_declaration_modifier )* ]
  private static boolean constructor_declaration_modifiers_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constructor_declaration_modifiers_1")) return false;
    constructor_declaration_modifiers_1_0(builder_, level_ + 1);
    return true;
  }

  // ( constructor_declaration_modifier )*
  private static boolean constructor_declaration_modifiers_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constructor_declaration_modifiers_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!constructor_declaration_modifiers_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "constructor_declaration_modifiers_1_0", pos_)) break;
    }
    return true;
  }

  // ( constructor_declaration_modifier )
  private static boolean constructor_declaration_modifiers_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constructor_declaration_modifiers_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constructor_declaration_modifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // continue SEMICOLON
  public static boolean continue_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "continue_statement")) return false;
    if (!nextTokenIs(builder_, CONTINUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, CONTINUE, SEMICOLON);
    exit_section_(builder_, marker_, CONTINUE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ constructor_declaration_modifiers ] member
  //                                 LPAREN [ parameters ] RPAREN [ throws_statement ] [ requires_statement ] [ ensures_statement ] ( SEMICOLON | block )
  public static boolean creation_method_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "creation_method_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CREATION_METHOD_DECLARATION, "<creation method declaration>");
    result_ = creation_method_declaration_0(builder_, level_ + 1);
    result_ = result_ && creation_method_declaration_1(builder_, level_ + 1);
    result_ = result_ && member(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && creation_method_declaration_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && creation_method_declaration_6(builder_, level_ + 1);
    result_ = result_ && creation_method_declaration_7(builder_, level_ + 1);
    result_ = result_ && creation_method_declaration_8(builder_, level_ + 1);
    result_ = result_ && creation_method_declaration_9(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ access_modifier ]
  private static boolean creation_method_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "creation_method_declaration_0")) return false;
    access_modifier(builder_, level_ + 1);
    return true;
  }

  // [ constructor_declaration_modifiers ]
  private static boolean creation_method_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "creation_method_declaration_1")) return false;
    constructor_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  // [ parameters ]
  private static boolean creation_method_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "creation_method_declaration_4")) return false;
    parameters(builder_, level_ + 1);
    return true;
  }

  // [ throws_statement ]
  private static boolean creation_method_declaration_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "creation_method_declaration_6")) return false;
    throws_statement(builder_, level_ + 1);
    return true;
  }

  // [ requires_statement ]
  private static boolean creation_method_declaration_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "creation_method_declaration_7")) return false;
    requires_statement(builder_, level_ + 1);
    return true;
  }

  // [ ensures_statement ]
  private static boolean creation_method_declaration_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "creation_method_declaration_8")) return false;
    ensures_statement(builder_, level_ + 1);
    return true;
  }

  // SEMICOLON | block
  private static boolean creation_method_declaration_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "creation_method_declaration_9")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = block(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // private | protected | internal | public
  static boolean delegate_access_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_access_modifiers")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PRIVATE);
    if (!result_) result_ = consumeToken(builder_, PROTECTED);
    if (!result_) result_ = consumeToken(builder_, INTERNAL);
    if (!result_) result_ = consumeToken(builder_, PUBLIC);
    return result_;
  }

  /* ********************************************************** */
  // [ delegate_access_modifiers ] [ delegate_declaration_modifiers ] [delegate] (type | type_with_parenthesis) symbol [ type_parameters ]
  //                          LPAREN [ parameters ] RPAREN [ throws_statement ] (SEMICOLON)
  public static boolean delegate_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DELEGATE_DECLARATION, "<delegate declaration>");
    result_ = delegate_declaration_0(builder_, level_ + 1);
    result_ = result_ && delegate_declaration_1(builder_, level_ + 1);
    result_ = result_ && delegate_declaration_2(builder_, level_ + 1);
    result_ = result_ && delegate_declaration_3(builder_, level_ + 1);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && delegate_declaration_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && delegate_declaration_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && delegate_declaration_9(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ delegate_access_modifiers ]
  private static boolean delegate_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_declaration_0")) return false;
    delegate_access_modifiers(builder_, level_ + 1);
    return true;
  }

  // [ delegate_declaration_modifiers ]
  private static boolean delegate_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_declaration_1")) return false;
    delegate_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  // [delegate]
  private static boolean delegate_declaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_declaration_2")) return false;
    consumeToken(builder_, DELEGATE);
    return true;
  }

  // type | type_with_parenthesis
  private static boolean delegate_declaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_declaration_3")) return false;
    boolean result_;
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  // [ type_parameters ]
  private static boolean delegate_declaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_declaration_5")) return false;
    type_parameters(builder_, level_ + 1);
    return true;
  }

  // [ parameters ]
  private static boolean delegate_declaration_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_declaration_7")) return false;
    parameters(builder_, level_ + 1);
    return true;
  }

  // [ throws_statement ]
  private static boolean delegate_declaration_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_declaration_9")) return false;
    throws_statement(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // abstract | async | class | extern | inline | override | sealed | static | virtual
  static boolean delegate_declaration_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_declaration_modifier")) return false;
    boolean result_;
    result_ = consumeToken(builder_, ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, ASYNC);
    if (!result_) result_ = consumeToken(builder_, CLASS);
    if (!result_) result_ = consumeToken(builder_, EXTERN);
    if (!result_) result_ = consumeToken(builder_, INLINE);
    if (!result_) result_ = consumeToken(builder_, OVERRIDE);
    if (!result_) result_ = consumeToken(builder_, SEALED);
    if (!result_) result_ = consumeToken(builder_, STATIC);
    if (!result_) result_ = consumeToken(builder_, VIRTUAL);
    return result_;
  }

  /* ********************************************************** */
  // delegate_declaration_modifier [ (delegate_declaration_modifier)* ]
  static boolean delegate_declaration_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_declaration_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = delegate_declaration_modifier(builder_, level_ + 1);
    result_ = result_ && delegate_declaration_modifiers_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ (delegate_declaration_modifier)* ]
  private static boolean delegate_declaration_modifiers_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_declaration_modifiers_1")) return false;
    delegate_declaration_modifiers_1_0(builder_, level_ + 1);
    return true;
  }

  // (delegate_declaration_modifier)*
  private static boolean delegate_declaration_modifiers_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_declaration_modifiers_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!delegate_declaration_modifiers_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "delegate_declaration_modifiers_1_0", pos_)) break;
    }
    return true;
  }

  // (delegate_declaration_modifier)
  private static boolean delegate_declaration_modifiers_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delegate_declaration_modifiers_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = delegate_declaration_modifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // delete expression SEMICOLON
  public static boolean delete_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "delete_statement")) return false;
    if (!nextTokenIs(builder_, DELETE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DELETE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, DELETE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ constructor_declaration_modifiers ] TILDE identifier LPAREN RPAREN block
  public static boolean destructor_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "destructor_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DESTRUCTOR_DECLARATION, "<destructor declaration>");
    result_ = destructor_declaration_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TILDE);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, LPAREN, RPAREN);
    result_ = result_ && block(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ constructor_declaration_modifiers ]
  private static boolean destructor_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "destructor_declaration_0")) return false;
    constructor_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // do embedded_statement while LPAREN expression RPAREN SEMICOLON
  public static boolean do_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "do_statement")) return false;
    if (!nextTokenIs(builder_, DO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DO);
    result_ = result_ && embedded_statement(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, WHILE, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, SEMICOLON);
    exit_section_(builder_, marker_, DO_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACKET [[expression] ( (COLON [expression]) | (COMMA expression)*)] RBRACKET
  public static boolean element_access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element_access")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && element_access_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, ELEMENT_ACCESS, result_);
    return result_;
  }

  // [[expression] ( (COLON [expression]) | (COMMA expression)*)]
  private static boolean element_access_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element_access_1")) return false;
    element_access_1_0(builder_, level_ + 1);
    return true;
  }

  // [expression] ( (COLON [expression]) | (COMMA expression)*)
  private static boolean element_access_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element_access_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = element_access_1_0_0(builder_, level_ + 1);
    result_ = result_ && element_access_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [expression]
  private static boolean element_access_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element_access_1_0_0")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  // (COLON [expression]) | (COMMA expression)*
  private static boolean element_access_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element_access_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = element_access_1_0_1_0(builder_, level_ + 1);
    if (!result_) result_ = element_access_1_0_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COLON [expression]
  private static boolean element_access_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element_access_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && element_access_1_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [expression]
  private static boolean element_access_1_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element_access_1_0_1_0_1")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  // (COMMA expression)*
  private static boolean element_access_1_0_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element_access_1_0_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!element_access_1_0_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "element_access_1_0_1_1", pos_)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean element_access_1_0_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element_access_1_0_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // else if LPAREN expression RPAREN embedded_statement*
  public static boolean else_if_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "else_if_statement")) return false;
    if (!nextTokenIs(builder_, ELSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ELSE, IF, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && else_if_statement_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, ELSE_IF_STATEMENT, result_);
    return result_;
  }

  // embedded_statement*
  private static boolean else_if_statement_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "else_if_statement_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!embedded_statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "else_if_statement_5", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // block | embedded_statement_without_block
  public static boolean embedded_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "embedded_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EMBEDDED_STATEMENT, "<embedded statement>");
    result_ = block(builder_, level_ + 1);
    if (!result_) result_ = embedded_statement_without_block(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // SEMICOLON | object_or_array_creation_expression | yield_statement | throw_statement | with_statement | if_statement | switch_statement | while_statement | for_statement |
  //                                      foreach_statement | break_statement | continue_statement | return_statement | method_declaration | local_variable_declarations |
  //                                      try_statement | delete_statement | expression_statement | lock_statement | unlock_statement | constant_declarations
  public static boolean embedded_statement_without_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "embedded_statement_without_block")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EMBEDDED_STATEMENT_WITHOUT_BLOCK, "<embedded statement without block>");
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = object_or_array_creation_expression(builder_, level_ + 1);
    if (!result_) result_ = yield_statement(builder_, level_ + 1);
    if (!result_) result_ = throw_statement(builder_, level_ + 1);
    if (!result_) result_ = with_statement(builder_, level_ + 1);
    if (!result_) result_ = if_statement(builder_, level_ + 1);
    if (!result_) result_ = switch_statement(builder_, level_ + 1);
    if (!result_) result_ = while_statement(builder_, level_ + 1);
    if (!result_) result_ = for_statement(builder_, level_ + 1);
    if (!result_) result_ = foreach_statement(builder_, level_ + 1);
    if (!result_) result_ = break_statement(builder_, level_ + 1);
    if (!result_) result_ = continue_statement(builder_, level_ + 1);
    if (!result_) result_ = return_statement(builder_, level_ + 1);
    if (!result_) result_ = method_declaration(builder_, level_ + 1);
    if (!result_) result_ = local_variable_declarations(builder_, level_ + 1);
    if (!result_) result_ = try_statement(builder_, level_ + 1);
    if (!result_) result_ = delete_statement(builder_, level_ + 1);
    if (!result_) result_ = expression_statement(builder_, level_ + 1);
    if (!result_) result_ = lock_statement(builder_, level_ + 1);
    if (!result_) result_ = unlock_statement(builder_, level_ + 1);
    if (!result_) result_ = constant_declarations(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ensures LPAREN expression RPAREN [ ensures_statement ]
  public static boolean ensures_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ensures_statement")) return false;
    if (!nextTokenIs(builder_, ENSURES)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ENSURES, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && ensures_statement_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, ENSURES_STATEMENT, result_);
    return result_;
  }

  // [ ensures_statement ]
  private static boolean ensures_statement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ensures_statement_4")) return false;
    ensures_statement(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ enum_type_declaration_modifiers ] enum symbol
  //                      LBRACE enumvalues [ SEMICOLON [ enum_member* ] ] RBRACE
  public static boolean enum_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ENUM_DECLARATION, "<enum declaration>");
    result_ = enum_declaration_0(builder_, level_ + 1);
    result_ = result_ && enum_declaration_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ENUM);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACE);
    result_ = result_ && enumvalues(builder_, level_ + 1);
    result_ = result_ && enum_declaration_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ access_modifier ]
  private static boolean enum_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_declaration_0")) return false;
    access_modifier(builder_, level_ + 1);
    return true;
  }

  // [ enum_type_declaration_modifiers ]
  private static boolean enum_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_declaration_1")) return false;
    enum_type_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  // [ SEMICOLON [ enum_member* ] ]
  private static boolean enum_declaration_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_declaration_6")) return false;
    enum_declaration_6_0(builder_, level_ + 1);
    return true;
  }

  // SEMICOLON [ enum_member* ]
  private static boolean enum_declaration_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_declaration_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMICOLON);
    result_ = result_ && enum_declaration_6_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ enum_member* ]
  private static boolean enum_declaration_6_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_declaration_6_0_1")) return false;
    enum_declaration_6_0_1_0(builder_, level_ + 1);
    return true;
  }

  // enum_member*
  private static boolean enum_declaration_6_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_declaration_6_0_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!enum_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_declaration_6_0_1_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ attributes* ] (constant_declarations | method_declaration)
  public static boolean enum_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ENUM_MEMBER, "<enum member>");
    result_ = enum_member_0(builder_, level_ + 1);
    result_ = result_ && enum_member_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ attributes* ]
  private static boolean enum_member_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_member_0")) return false;
    enum_member_0_0(builder_, level_ + 1);
    return true;
  }

  // attributes*
  private static boolean enum_member_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_member_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_member_0_0", pos_)) break;
    }
    return true;
  }

  // constant_declarations | method_declaration
  private static boolean enum_member_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_member_1")) return false;
    boolean result_;
    result_ = constant_declarations(builder_, level_ + 1);
    if (!result_) result_ = method_declaration(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // abstract | extern | sealed
  static boolean enum_type_declaration_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_type_declaration_modifier")) return false;
    boolean result_;
    result_ = consumeToken(builder_, ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, EXTERN);
    if (!result_) result_ = consumeToken(builder_, SEALED);
    return result_;
  }

  /* ********************************************************** */
  // enum_type_declaration_modifier [ enum_type_declaration_modifier* ]
  static boolean enum_type_declaration_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_type_declaration_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = enum_type_declaration_modifier(builder_, level_ + 1);
    result_ = result_ && enum_type_declaration_modifiers_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ enum_type_declaration_modifier* ]
  private static boolean enum_type_declaration_modifiers_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_type_declaration_modifiers_1")) return false;
    enum_type_declaration_modifiers_1_0(builder_, level_ + 1);
    return true;
  }

  // enum_type_declaration_modifier*
  private static boolean enum_type_declaration_modifiers_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_type_declaration_modifiers_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!enum_type_declaration_modifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_type_declaration_modifiers_1_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ attributes* ] identifier [ EQUALS expression ]
  public static boolean enumvalue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumvalue")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ENUMVALUE, "<enumvalue>");
    result_ = enumvalue_0(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && enumvalue_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ attributes* ]
  private static boolean enumvalue_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumvalue_0")) return false;
    enumvalue_0_0(builder_, level_ + 1);
    return true;
  }

  // attributes*
  private static boolean enumvalue_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumvalue_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enumvalue_0_0", pos_)) break;
    }
    return true;
  }

  // [ EQUALS expression ]
  private static boolean enumvalue_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumvalue_2")) return false;
    enumvalue_2_0(builder_, level_ + 1);
    return true;
  }

  // EQUALS expression
  private static boolean enumvalue_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumvalue_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQUALS);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // enumvalue [ (COMMA enumvalue)* ] [ COMMA ]
  public static boolean enumvalues(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumvalues")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ENUMVALUES, "<enumvalues>");
    result_ = enumvalue(builder_, level_ + 1);
    result_ = result_ && enumvalues_1(builder_, level_ + 1);
    result_ = result_ && enumvalues_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (COMMA enumvalue)* ]
  private static boolean enumvalues_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumvalues_1")) return false;
    enumvalues_1_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA enumvalue)*
  private static boolean enumvalues_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumvalues_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!enumvalues_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enumvalues_1_0", pos_)) break;
    }
    return true;
  }

  // COMMA enumvalue
  private static boolean enumvalues_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumvalues_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && enumvalue(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ COMMA ]
  private static boolean enumvalues_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumvalues_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // relational_expression [( ( EQUALS_EQUALS | NOT_EQUALS ) relational_expression)* ]
  public static boolean equality_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equality_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EQUALITY_EXPRESSION, "<equality expression>");
    result_ = relational_expression(builder_, level_ + 1);
    result_ = result_ && equality_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [( ( EQUALS_EQUALS | NOT_EQUALS ) relational_expression)* ]
  private static boolean equality_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equality_expression_1")) return false;
    equality_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // ( ( EQUALS_EQUALS | NOT_EQUALS ) relational_expression)*
  private static boolean equality_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equality_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!equality_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "equality_expression_1_0", pos_)) break;
    }
    return true;
  }

  // ( EQUALS_EQUALS | NOT_EQUALS ) relational_expression
  private static boolean equality_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equality_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = equality_expression_1_0_0_0(builder_, level_ + 1);
    result_ = result_ && relational_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EQUALS_EQUALS | NOT_EQUALS
  private static boolean equality_expression_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equality_expression_1_0_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, EQUALS_EQUALS);
    if (!result_) result_ = consumeToken(builder_, NOT_EQUALS);
    return result_;
  }

  /* ********************************************************** */
  // [ attributes* ] identifier [ EQUALS expression ]
  public static boolean errorcode(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errorcode")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ERRORCODE, "<errorcode>");
    result_ = errorcode_0(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && errorcode_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ attributes* ]
  private static boolean errorcode_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errorcode_0")) return false;
    errorcode_0_0(builder_, level_ + 1);
    return true;
  }

  // attributes*
  private static boolean errorcode_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errorcode_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "errorcode_0_0", pos_)) break;
    }
    return true;
  }

  // [ EQUALS expression ]
  private static boolean errorcode_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errorcode_2")) return false;
    errorcode_2_0(builder_, level_ + 1);
    return true;
  }

  // EQUALS expression
  private static boolean errorcode_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errorcode_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQUALS);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // errorcode [ (COMMA errorcode)* [ COMMA ] ]
  public static boolean errorcodes(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errorcodes")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ERRORCODES, "<errorcodes>");
    result_ = errorcode(builder_, level_ + 1);
    result_ = result_ && errorcodes_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (COMMA errorcode)* [ COMMA ] ]
  private static boolean errorcodes_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errorcodes_1")) return false;
    errorcodes_1_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA errorcode)* [ COMMA ]
  private static boolean errorcodes_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errorcodes_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = errorcodes_1_0_0(builder_, level_ + 1);
    result_ = result_ && errorcodes_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA errorcode)*
  private static boolean errorcodes_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errorcodes_1_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!errorcodes_1_0_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "errorcodes_1_0_0", pos_)) break;
    }
    return true;
  }

  // COMMA errorcode
  private static boolean errorcodes_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errorcodes_1_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && errorcode(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ COMMA ]
  private static boolean errorcodes_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errorcodes_1_0_1")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // private | public | protected | internal
  static boolean errordomain_access_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errordomain_access_modifier")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PRIVATE);
    if (!result_) result_ = consumeToken(builder_, PUBLIC);
    if (!result_) result_ = consumeToken(builder_, PROTECTED);
    if (!result_) result_ = consumeToken(builder_, INTERNAL);
    return result_;
  }

  /* ********************************************************** */
  // [ errordomain_access_modifier ] [ errordomain_type_declaration_modifiers ] errordomain symbol
  //                             LBRACE [errorcodes [SEMICOLON]] [ ( [ attributes* ] method_declaration)* ] RBRACE
  public static boolean errordomain_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errordomain_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ERRORDOMAIN_DECLARATION, "<errordomain declaration>");
    result_ = errordomain_declaration_0(builder_, level_ + 1);
    result_ = result_ && errordomain_declaration_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ERRORDOMAIN);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACE);
    result_ = result_ && errordomain_declaration_5(builder_, level_ + 1);
    result_ = result_ && errordomain_declaration_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ errordomain_access_modifier ]
  private static boolean errordomain_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errordomain_declaration_0")) return false;
    errordomain_access_modifier(builder_, level_ + 1);
    return true;
  }

  // [ errordomain_type_declaration_modifiers ]
  private static boolean errordomain_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errordomain_declaration_1")) return false;
    errordomain_type_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  // [errorcodes [SEMICOLON]]
  private static boolean errordomain_declaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errordomain_declaration_5")) return false;
    errordomain_declaration_5_0(builder_, level_ + 1);
    return true;
  }

  // errorcodes [SEMICOLON]
  private static boolean errordomain_declaration_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errordomain_declaration_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = errorcodes(builder_, level_ + 1);
    result_ = result_ && errordomain_declaration_5_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [SEMICOLON]
  private static boolean errordomain_declaration_5_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errordomain_declaration_5_0_1")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  // [ ( [ attributes* ] method_declaration)* ]
  private static boolean errordomain_declaration_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errordomain_declaration_6")) return false;
    errordomain_declaration_6_0(builder_, level_ + 1);
    return true;
  }

  // ( [ attributes* ] method_declaration)*
  private static boolean errordomain_declaration_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errordomain_declaration_6_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!errordomain_declaration_6_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "errordomain_declaration_6_0", pos_)) break;
    }
    return true;
  }

  // [ attributes* ] method_declaration
  private static boolean errordomain_declaration_6_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errordomain_declaration_6_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = errordomain_declaration_6_0_0_0(builder_, level_ + 1);
    result_ = result_ && method_declaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ attributes* ]
  private static boolean errordomain_declaration_6_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errordomain_declaration_6_0_0_0")) return false;
    errordomain_declaration_6_0_0_0_0(builder_, level_ + 1);
    return true;
  }

  // attributes*
  private static boolean errordomain_declaration_6_0_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errordomain_declaration_6_0_0_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "errordomain_declaration_6_0_0_0_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // extern | abstract | partial | sealed
  static boolean errordomain_type_declaration_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "errordomain_type_declaration_modifiers")) return false;
    boolean result_;
    result_ = consumeToken(builder_, EXTERN);
    if (!result_) result_ = consumeToken(builder_, ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, PARTIAL);
    if (!result_) result_ = consumeToken(builder_, SEALED);
    return result_;
  }

  /* ********************************************************** */
  // and_expression [ ( CARET and_expression )* ]
  public static boolean exclusive_or_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exclusive_or_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXCLUSIVE_OR_EXPRESSION, "<exclusive or expression>");
    result_ = and_expression(builder_, level_ + 1);
    result_ = result_ && exclusive_or_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ ( CARET and_expression )* ]
  private static boolean exclusive_or_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exclusive_or_expression_1")) return false;
    exclusive_or_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // ( CARET and_expression )*
  private static boolean exclusive_or_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exclusive_or_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!exclusive_or_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "exclusive_or_expression_1_0", pos_)) break;
    }
    return true;
  }

  // CARET and_expression
  private static boolean exclusive_or_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exclusive_or_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CARET);
    result_ = result_ && and_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lambda_expression | ( conditional_expression [ assignment_operator expression ] )
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = lambda_expression(builder_, level_ + 1);
    if (!result_) result_ = expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // conditional_expression [ assignment_operator expression ]
  private static boolean expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = conditional_expression(builder_, level_ + 1);
    result_ = result_ && expression_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ assignment_operator expression ]
  private static boolean expression_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_1_1")) return false;
    expression_1_1_0(builder_, level_ + 1);
    return true;
  }

  // assignment_operator expression
  private static boolean expression_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assignment_operator(builder_, level_ + 1);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // statement_expression [SEMICOLON]
  public static boolean expression_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    result_ = statement_expression(builder_, level_ + 1);
    result_ = result_ && expression_statement_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [SEMICOLON]
  private static boolean expression_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_statement_1")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ member_declaration_modifiers ] [(type_weak | [unowned] type_weak_with_parenthesis)] field_declaration_section (COMMA field_declaration_section)* SEMICOLON
  public static boolean field_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FIELD_DECLARATION, "<field declaration>");
    result_ = field_declaration_0(builder_, level_ + 1);
    result_ = result_ && field_declaration_1(builder_, level_ + 1);
    result_ = result_ && field_declaration_2(builder_, level_ + 1);
    result_ = result_ && field_declaration_section(builder_, level_ + 1);
    result_ = result_ && field_declaration_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ access_modifier ]
  private static boolean field_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_0")) return false;
    access_modifier(builder_, level_ + 1);
    return true;
  }

  // [ member_declaration_modifiers ]
  private static boolean field_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_1")) return false;
    member_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  // [(type_weak | [unowned] type_weak_with_parenthesis)]
  private static boolean field_declaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_2")) return false;
    field_declaration_2_0(builder_, level_ + 1);
    return true;
  }

  // type_weak | [unowned] type_weak_with_parenthesis
  private static boolean field_declaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_weak(builder_, level_ + 1);
    if (!result_) result_ = field_declaration_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [unowned] type_weak_with_parenthesis
  private static boolean field_declaration_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_2_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = field_declaration_2_0_1_0(builder_, level_ + 1);
    result_ = result_ && type_weak_with_parenthesis(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [unowned]
  private static boolean field_declaration_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_2_0_1_0")) return false;
    consumeToken(builder_, UNOWNED);
    return true;
  }

  // (COMMA field_declaration_section)*
  private static boolean field_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_4")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!field_declaration_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "field_declaration_4", pos_)) break;
    }
    return true;
  }

  // COMMA field_declaration_section
  private static boolean field_declaration_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && field_declaration_section(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier [inline_array_type] [ EQUALS expression [inline_array_type] ]
  public static boolean field_declaration_section(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_section")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FIELD_DECLARATION_SECTION, "<field declaration section>");
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && field_declaration_section_1(builder_, level_ + 1);
    result_ = result_ && field_declaration_section_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [inline_array_type]
  private static boolean field_declaration_section_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_section_1")) return false;
    inline_array_type(builder_, level_ + 1);
    return true;
  }

  // [ EQUALS expression [inline_array_type] ]
  private static boolean field_declaration_section_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_section_2")) return false;
    field_declaration_section_2_0(builder_, level_ + 1);
    return true;
  }

  // EQUALS expression [inline_array_type]
  private static boolean field_declaration_section_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_section_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQUALS);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && field_declaration_section_2_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [inline_array_type]
  private static boolean field_declaration_section_2_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_section_2_0_2")) return false;
    inline_array_type(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // finally block
  public static boolean finally_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "finally_clause")) return false;
    if (!nextTokenIs(builder_, FINALLY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FINALLY);
    result_ = result_ && block(builder_, level_ + 1);
    exit_section_(builder_, marker_, FINALLY_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // local_variable_declarations | ( statement_expression [ (COMMA statement_expression)* ] )
  public static boolean for_initializer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_initializer")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FOR_INITIALIZER, "<for initializer>");
    result_ = local_variable_declarations(builder_, level_ + 1);
    if (!result_) result_ = for_initializer_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // statement_expression [ (COMMA statement_expression)* ]
  private static boolean for_initializer_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_initializer_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement_expression(builder_, level_ + 1);
    result_ = result_ && for_initializer_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ (COMMA statement_expression)* ]
  private static boolean for_initializer_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_initializer_1_1")) return false;
    for_initializer_1_1_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA statement_expression)*
  private static boolean for_initializer_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_initializer_1_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!for_initializer_1_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "for_initializer_1_1_0", pos_)) break;
    }
    return true;
  }

  // COMMA statement_expression
  private static boolean for_initializer_1_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_initializer_1_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && statement_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // statement_expression [ (COMMA statement_expression)* ]
  public static boolean for_iterator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_iterator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FOR_ITERATOR, "<for iterator>");
    result_ = statement_expression(builder_, level_ + 1);
    result_ = result_ && for_iterator_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (COMMA statement_expression)* ]
  private static boolean for_iterator_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_iterator_1")) return false;
    for_iterator_1_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA statement_expression)*
  private static boolean for_iterator_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_iterator_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!for_iterator_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "for_iterator_1_0", pos_)) break;
    }
    return true;
  }

  // COMMA statement_expression
  private static boolean for_iterator_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_iterator_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && statement_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // for LPAREN [ for_initializer ] SEMICOLON [ expression ] SEMICOLON [ for_iterator ] RPAREN embedded_statement
  public static boolean for_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement")) return false;
    if (!nextTokenIs(builder_, FOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FOR, LPAREN);
    result_ = result_ && for_statement_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    result_ = result_ && for_statement_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    result_ = result_ && for_statement_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && embedded_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOR_STATEMENT, result_);
    return result_;
  }

  // [ for_initializer ]
  private static boolean for_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement_2")) return false;
    for_initializer(builder_, level_ + 1);
    return true;
  }

  // [ expression ]
  private static boolean for_statement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement_4")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  // [ for_iterator ]
  private static boolean for_statement_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement_6")) return false;
    for_iterator(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // foreach LPAREN [ (dynamic unowned) | (unowned dynamic) | unowned | dynamic ] ( var [QUESTION_MARK] | (type_weak | type_weak_with_parenthesis) ) identifier in expression RPAREN embedded_statement
  public static boolean foreach_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement")) return false;
    if (!nextTokenIs(builder_, FOREACH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FOREACH, LPAREN);
    result_ = result_ && foreach_statement_2(builder_, level_ + 1);
    result_ = result_ && foreach_statement_3(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && embedded_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOREACH_STATEMENT, result_);
    return result_;
  }

  // [ (dynamic unowned) | (unowned dynamic) | unowned | dynamic ]
  private static boolean foreach_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_2")) return false;
    foreach_statement_2_0(builder_, level_ + 1);
    return true;
  }

  // (dynamic unowned) | (unowned dynamic) | unowned | dynamic
  private static boolean foreach_statement_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = foreach_statement_2_0_0(builder_, level_ + 1);
    if (!result_) result_ = foreach_statement_2_0_1(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, UNOWNED);
    if (!result_) result_ = consumeToken(builder_, DYNAMIC);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // dynamic unowned
  private static boolean foreach_statement_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DYNAMIC, UNOWNED);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // unowned dynamic
  private static boolean foreach_statement_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_2_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, UNOWNED, DYNAMIC);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // var [QUESTION_MARK] | (type_weak | type_weak_with_parenthesis)
  private static boolean foreach_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = foreach_statement_3_0(builder_, level_ + 1);
    if (!result_) result_ = foreach_statement_3_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // var [QUESTION_MARK]
  private static boolean foreach_statement_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VAR);
    result_ = result_ && foreach_statement_3_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [QUESTION_MARK]
  private static boolean foreach_statement_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_3_0_1")) return false;
    consumeToken(builder_, QUESTION_MARK);
    return true;
  }

  // type_weak | type_weak_with_parenthesis
  private static boolean foreach_statement_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_3_1")) return false;
    boolean result_;
    result_ = type_weak(builder_, level_ + 1);
    if (!result_) result_ = type_weak_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER_TOKEN | valid_identifier_keywords
  public static boolean identifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IDENTIFIER, "<identifier>");
    result_ = consumeToken(builder_, IDENTIFIER_TOKEN);
    if (!result_) result_ = valid_identifier_keywords(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // if LPAREN expression RPAREN embedded_statement* else_if_statement* [ else embedded_statement* ]
  public static boolean if_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement")) return false;
    if (!nextTokenIs(builder_, IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IF, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && if_statement_4(builder_, level_ + 1);
    result_ = result_ && if_statement_5(builder_, level_ + 1);
    result_ = result_ && if_statement_6(builder_, level_ + 1);
    exit_section_(builder_, marker_, IF_STATEMENT, result_);
    return result_;
  }

  // embedded_statement*
  private static boolean if_statement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_4")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!embedded_statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "if_statement_4", pos_)) break;
    }
    return true;
  }

  // else_if_statement*
  private static boolean if_statement_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!else_if_statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "if_statement_5", pos_)) break;
    }
    return true;
  }

  // [ else embedded_statement* ]
  private static boolean if_statement_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_6")) return false;
    if_statement_6_0(builder_, level_ + 1);
    return true;
  }

  // else embedded_statement*
  private static boolean if_statement_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && if_statement_6_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // embedded_statement*
  private static boolean if_statement_6_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_6_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!embedded_statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "if_statement_6_0_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // inclusive_or_expression [ ( in inclusive_or_expression )* ]
  public static boolean in_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "in_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IN_EXPRESSION, "<in expression>");
    result_ = inclusive_or_expression(builder_, level_ + 1);
    result_ = result_ && in_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ ( in inclusive_or_expression )* ]
  private static boolean in_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "in_expression_1")) return false;
    in_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // ( in inclusive_or_expression )*
  private static boolean in_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "in_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!in_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "in_expression_1_0", pos_)) break;
    }
    return true;
  }

  // in inclusive_or_expression
  private static boolean in_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "in_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IN);
    result_ = result_ && inclusive_or_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // exclusive_or_expression [ ( PIPE exclusive_or_expression )* ]
  public static boolean inclusive_or_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inclusive_or_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INCLUSIVE_OR_EXPRESSION, "<inclusive or expression>");
    result_ = exclusive_or_expression(builder_, level_ + 1);
    result_ = result_ && inclusive_or_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ ( PIPE exclusive_or_expression )* ]
  private static boolean inclusive_or_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inclusive_or_expression_1")) return false;
    inclusive_or_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // ( PIPE exclusive_or_expression )*
  private static boolean inclusive_or_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inclusive_or_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!inclusive_or_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "inclusive_or_expression_1_0", pos_)) break;
    }
    return true;
  }

  // PIPE exclusive_or_expression
  private static boolean inclusive_or_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inclusive_or_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PIPE);
    result_ = result_ && exclusive_or_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE [argument [ (COMMA  argument)* ] [COMMA] ] RBRACE
  public static boolean initializer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "initializer")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && initializer_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, INITIALIZER, result_);
    return result_;
  }

  // [argument [ (COMMA  argument)* ] [COMMA] ]
  private static boolean initializer_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "initializer_1")) return false;
    initializer_1_0(builder_, level_ + 1);
    return true;
  }

  // argument [ (COMMA  argument)* ] [COMMA]
  private static boolean initializer_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "initializer_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = argument(builder_, level_ + 1);
    result_ = result_ && initializer_1_0_1(builder_, level_ + 1);
    result_ = result_ && initializer_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ (COMMA  argument)* ]
  private static boolean initializer_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "initializer_1_0_1")) return false;
    initializer_1_0_1_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA  argument)*
  private static boolean initializer_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "initializer_1_0_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!initializer_1_0_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "initializer_1_0_1_0", pos_)) break;
    }
    return true;
  }

  // COMMA  argument
  private static boolean initializer_1_0_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "initializer_1_0_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && argument(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [COMMA]
  private static boolean initializer_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "initializer_1_0_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // LBRACKET [ (expression | INTEGER_LITERAL | member | COMMA*) [COLON (expression | INTEGER_LITERAL | member)]] RBRACKET
  public static boolean inline_array_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_array_type")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && inline_array_type_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, INLINE_ARRAY_TYPE, result_);
    return result_;
  }

  // [ (expression | INTEGER_LITERAL | member | COMMA*) [COLON (expression | INTEGER_LITERAL | member)]]
  private static boolean inline_array_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_array_type_1")) return false;
    inline_array_type_1_0(builder_, level_ + 1);
    return true;
  }

  // (expression | INTEGER_LITERAL | member | COMMA*) [COLON (expression | INTEGER_LITERAL | member)]
  private static boolean inline_array_type_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_array_type_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = inline_array_type_1_0_0(builder_, level_ + 1);
    result_ = result_ && inline_array_type_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression | INTEGER_LITERAL | member | COMMA*
  private static boolean inline_array_type_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_array_type_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, INTEGER_LITERAL);
    if (!result_) result_ = member(builder_, level_ + 1);
    if (!result_) result_ = inline_array_type_1_0_0_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMA*
  private static boolean inline_array_type_1_0_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_array_type_1_0_0_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, COMMA)) break;
      if (!empty_element_parsed_guard_(builder_, "inline_array_type_1_0_0_3", pos_)) break;
    }
    return true;
  }

  // [COLON (expression | INTEGER_LITERAL | member)]
  private static boolean inline_array_type_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_array_type_1_0_1")) return false;
    inline_array_type_1_0_1_0(builder_, level_ + 1);
    return true;
  }

  // COLON (expression | INTEGER_LITERAL | member)
  private static boolean inline_array_type_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_array_type_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && inline_array_type_1_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression | INTEGER_LITERAL | member
  private static boolean inline_array_type_1_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_array_type_1_0_1_0_1")) return false;
    boolean result_;
    result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, INTEGER_LITERAL);
    if (!result_) result_ = member(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // using_directives* main_block_member
  static boolean input(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = input_0(builder_, level_ + 1);
    result_ = result_ && main_block_member(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // using_directives*
  private static boolean input_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!using_directives(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "input_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ interface_type_declaration_modifiers ] interface symbol [ type_parameters ]
  //                           [ COLON base_types ] LBRACE interface_member* RBRACE
  public static boolean interface_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INTERFACE_DECLARATION, "<interface declaration>");
    result_ = interface_declaration_0(builder_, level_ + 1);
    result_ = result_ && interface_declaration_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, INTERFACE);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && interface_declaration_4(builder_, level_ + 1);
    result_ = result_ && interface_declaration_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACE);
    result_ = result_ && interface_declaration_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ access_modifier ]
  private static boolean interface_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_declaration_0")) return false;
    access_modifier(builder_, level_ + 1);
    return true;
  }

  // [ interface_type_declaration_modifiers ]
  private static boolean interface_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_declaration_1")) return false;
    interface_type_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  // [ type_parameters ]
  private static boolean interface_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_declaration_4")) return false;
    type_parameters(builder_, level_ + 1);
    return true;
  }

  // [ COLON base_types ]
  private static boolean interface_declaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_declaration_5")) return false;
    interface_declaration_5_0(builder_, level_ + 1);
    return true;
  }

  // COLON base_types
  private static boolean interface_declaration_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_declaration_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && base_types(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // interface_member*
  private static boolean interface_declaration_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_declaration_7")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!interface_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "interface_declaration_7", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ attributes* ]
  //                      ( class_declaration |
  //                        struct_declaration |
  //                        enum_declaration |
  //                        delegate_declaration |
  //                        method_declaration |
  //                        signal_declaration |
  //                        field_declaration |
  //                        constant_declarations |
  //                        property_declaration |
  //                        interface_declaration )
  public static boolean interface_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INTERFACE_MEMBER, "<interface member>");
    result_ = interface_member_0(builder_, level_ + 1);
    result_ = result_ && interface_member_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ attributes* ]
  private static boolean interface_member_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_member_0")) return false;
    interface_member_0_0(builder_, level_ + 1);
    return true;
  }

  // attributes*
  private static boolean interface_member_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_member_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "interface_member_0_0", pos_)) break;
    }
    return true;
  }

  // class_declaration |
  //                        struct_declaration |
  //                        enum_declaration |
  //                        delegate_declaration |
  //                        method_declaration |
  //                        signal_declaration |
  //                        field_declaration |
  //                        constant_declarations |
  //                        property_declaration |
  //                        interface_declaration
  private static boolean interface_member_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_member_1")) return false;
    boolean result_;
    result_ = class_declaration(builder_, level_ + 1);
    if (!result_) result_ = struct_declaration(builder_, level_ + 1);
    if (!result_) result_ = enum_declaration(builder_, level_ + 1);
    if (!result_) result_ = delegate_declaration(builder_, level_ + 1);
    if (!result_) result_ = method_declaration(builder_, level_ + 1);
    if (!result_) result_ = signal_declaration(builder_, level_ + 1);
    if (!result_) result_ = field_declaration(builder_, level_ + 1);
    if (!result_) result_ = constant_declarations(builder_, level_ + 1);
    if (!result_) result_ = property_declaration(builder_, level_ + 1);
    if (!result_) result_ = interface_declaration(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // abstract | extern | sealed
  static boolean interface_type_declaration_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_type_declaration_modifier")) return false;
    boolean result_;
    result_ = consumeToken(builder_, ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, EXTERN);
    if (!result_) result_ = consumeToken(builder_, SEALED);
    return result_;
  }

  /* ********************************************************** */
  // interface_type_declaration_modifier [ interface_type_declaration_modifier* ]
  static boolean interface_type_declaration_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_type_declaration_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = interface_type_declaration_modifier(builder_, level_ + 1);
    result_ = result_ && interface_type_declaration_modifiers_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ interface_type_declaration_modifier* ]
  private static boolean interface_type_declaration_modifiers_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_type_declaration_modifiers_1")) return false;
    interface_type_declaration_modifiers_1_0(builder_, level_ + 1);
    return true;
  }

  // interface_type_declaration_modifier*
  private static boolean interface_type_declaration_modifiers_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_type_declaration_modifiers_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!interface_type_declaration_modifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "interface_type_declaration_modifiers_1_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (lambda_expression_param | lambda_expression_params) [ type_arguments ] LAMBDA lambda_expression_body
  public static boolean lambda_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LAMBDA_EXPRESSION, "<lambda expression>");
    result_ = lambda_expression_0(builder_, level_ + 1);
    result_ = result_ && lambda_expression_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LAMBDA);
    result_ = result_ && lambda_expression_body(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // lambda_expression_param | lambda_expression_params
  private static boolean lambda_expression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression_0")) return false;
    boolean result_;
    result_ = lambda_expression_param(builder_, level_ + 1);
    if (!result_) result_ = lambda_expression_params(builder_, level_ + 1);
    return result_;
  }

  // [ type_arguments ]
  private static boolean lambda_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression_1")) return false;
    type_arguments(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // expression | block
  public static boolean lambda_expression_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LAMBDA_EXPRESSION_BODY, "<lambda expression body>");
    result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = block(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [ ref | out ] identifier
  public static boolean lambda_expression_param(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression_param")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LAMBDA_EXPRESSION_PARAM, "<lambda expression param>");
    result_ = lambda_expression_param_0(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ ref | out ]
  private static boolean lambda_expression_param_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression_param_0")) return false;
    lambda_expression_param_0_0(builder_, level_ + 1);
    return true;
  }

  // ref | out
  private static boolean lambda_expression_param_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression_param_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, REF);
    if (!result_) result_ = consumeToken(builder_, OUT);
    return result_;
  }

  /* ********************************************************** */
  // LPAREN [ lambda_expression_param [(COMMA lambda_expression_param)*]] RPAREN
  public static boolean lambda_expression_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression_params")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && lambda_expression_params_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, LAMBDA_EXPRESSION_PARAMS, result_);
    return result_;
  }

  // [ lambda_expression_param [(COMMA lambda_expression_param)*]]
  private static boolean lambda_expression_params_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression_params_1")) return false;
    lambda_expression_params_1_0(builder_, level_ + 1);
    return true;
  }

  // lambda_expression_param [(COMMA lambda_expression_param)*]
  private static boolean lambda_expression_params_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression_params_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lambda_expression_param(builder_, level_ + 1);
    result_ = result_ && lambda_expression_params_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [(COMMA lambda_expression_param)*]
  private static boolean lambda_expression_params_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression_params_1_0_1")) return false;
    lambda_expression_params_1_0_1_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA lambda_expression_param)*
  private static boolean lambda_expression_params_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression_params_1_0_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!lambda_expression_params_1_0_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "lambda_expression_params_1_0_1_0", pos_)) break;
    }
    return true;
  }

  // COMMA lambda_expression_param
  private static boolean lambda_expression_params_1_0_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_expression_params_1_0_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && lambda_expression_param(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // INTEGER_LITERAL | DECIMAL_LITERAL | true | false | null | CHAR_LITERAL |
  //             STRING_LITERAL | TRIPLE_QUOTE_STRING | HEXADECIMAL_LITERAL | regex_literal
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LITERAL, "<literal>");
    result_ = consumeToken(builder_, INTEGER_LITERAL);
    if (!result_) result_ = consumeToken(builder_, DECIMAL_LITERAL);
    if (!result_) result_ = consumeToken(builder_, TRUE);
    if (!result_) result_ = consumeToken(builder_, FALSE);
    if (!result_) result_ = consumeToken(builder_, NULL);
    if (!result_) result_ = consumeToken(builder_, CHAR_LITERAL);
    if (!result_) result_ = consumeToken(builder_, STRING_LITERAL);
    if (!result_) result_ = consumeToken(builder_, TRIPLE_QUOTE_STRING);
    if (!result_) result_ = consumeToken(builder_, HEXADECIMAL_LITERAL);
    if (!result_) result_ = regex_literal(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LPAREN member RPAREN EQUALS expression
  public static boolean local_tuple_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_tuple_declaration")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && member(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, EQUALS);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, LOCAL_TUPLE_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier [ inline_array_type ] [ EQUALS expression ]
  public static boolean local_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LOCAL_VARIABLE, "<local variable>");
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && local_variable_1(builder_, level_ + 1);
    result_ = result_ && local_variable_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ inline_array_type ]
  private static boolean local_variable_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_1")) return false;
    inline_array_type(builder_, level_ + 1);
    return true;
  }

  // [ EQUALS expression ]
  private static boolean local_variable_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_2")) return false;
    local_variable_2_0(builder_, level_ + 1);
    return true;
  }

  // EQUALS expression
  private static boolean local_variable_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQUALS);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // local_tuple_declaration | local_variable
  public static boolean local_variable_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LOCAL_VARIABLE_DECLARATION, "<local variable declaration>");
    result_ = local_tuple_declaration(builder_, level_ + 1);
    if (!result_) result_ = local_variable(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [dynamic] [ weak | unowned | owned ] ( var [QUESTION_MARK] | (type | type_with_parenthesis) ) [QUESTION_MARK] local_variable_declaration [ (COMMA local_variable_declaration)* ]
  public static boolean local_variable_declarations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_declarations")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LOCAL_VARIABLE_DECLARATIONS, "<local variable declarations>");
    result_ = local_variable_declarations_0(builder_, level_ + 1);
    result_ = result_ && local_variable_declarations_1(builder_, level_ + 1);
    result_ = result_ && local_variable_declarations_2(builder_, level_ + 1);
    result_ = result_ && local_variable_declarations_3(builder_, level_ + 1);
    result_ = result_ && local_variable_declaration(builder_, level_ + 1);
    result_ = result_ && local_variable_declarations_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [dynamic]
  private static boolean local_variable_declarations_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_declarations_0")) return false;
    consumeToken(builder_, DYNAMIC);
    return true;
  }

  // [ weak | unowned | owned ]
  private static boolean local_variable_declarations_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_declarations_1")) return false;
    local_variable_declarations_1_0(builder_, level_ + 1);
    return true;
  }

  // weak | unowned | owned
  private static boolean local_variable_declarations_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_declarations_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, WEAK);
    if (!result_) result_ = consumeToken(builder_, UNOWNED);
    if (!result_) result_ = consumeToken(builder_, OWNED);
    return result_;
  }

  // var [QUESTION_MARK] | (type | type_with_parenthesis)
  private static boolean local_variable_declarations_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_declarations_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = local_variable_declarations_2_0(builder_, level_ + 1);
    if (!result_) result_ = local_variable_declarations_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // var [QUESTION_MARK]
  private static boolean local_variable_declarations_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_declarations_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VAR);
    result_ = result_ && local_variable_declarations_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [QUESTION_MARK]
  private static boolean local_variable_declarations_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_declarations_2_0_1")) return false;
    consumeToken(builder_, QUESTION_MARK);
    return true;
  }

  // type | type_with_parenthesis
  private static boolean local_variable_declarations_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_declarations_2_1")) return false;
    boolean result_;
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  // [QUESTION_MARK]
  private static boolean local_variable_declarations_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_declarations_3")) return false;
    consumeToken(builder_, QUESTION_MARK);
    return true;
  }

  // [ (COMMA local_variable_declaration)* ]
  private static boolean local_variable_declarations_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_declarations_5")) return false;
    local_variable_declarations_5_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA local_variable_declaration)*
  private static boolean local_variable_declarations_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_declarations_5_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!local_variable_declarations_5_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "local_variable_declarations_5_0", pos_)) break;
    }
    return true;
  }

  // COMMA local_variable_declaration
  private static boolean local_variable_declarations_5_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "local_variable_declarations_5_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && local_variable_declaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // lock LPAREN expression RPAREN embedded_statement
  public static boolean lock_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lock_statement")) return false;
    if (!nextTokenIs(builder_, LOCK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LOCK, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && embedded_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, LOCK_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( [ attributes* ] ( namespace_declaration |
  //                         class_declaration |
  //                         interface_declaration |
  //                         struct_declaration |
  //                         enum_declaration |
  //                         errordomain_declaration |
  //                         delegate_declaration |
  //                         method_declaration |
  //                         field_declaration |
  //                         constant_declarations))* [ ( [ attributes* ] ( method_declaration | statement ))* ]
  public static boolean main_block_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_block_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MAIN_BLOCK_MEMBER, "<main block member>");
    result_ = main_block_member_0(builder_, level_ + 1);
    result_ = result_ && main_block_member_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( [ attributes* ] ( namespace_declaration |
  //                         class_declaration |
  //                         interface_declaration |
  //                         struct_declaration |
  //                         enum_declaration |
  //                         errordomain_declaration |
  //                         delegate_declaration |
  //                         method_declaration |
  //                         field_declaration |
  //                         constant_declarations))*
  private static boolean main_block_member_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_block_member_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!main_block_member_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "main_block_member_0", pos_)) break;
    }
    return true;
  }

  // [ attributes* ] ( namespace_declaration |
  //                         class_declaration |
  //                         interface_declaration |
  //                         struct_declaration |
  //                         enum_declaration |
  //                         errordomain_declaration |
  //                         delegate_declaration |
  //                         method_declaration |
  //                         field_declaration |
  //                         constant_declarations)
  private static boolean main_block_member_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_block_member_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = main_block_member_0_0_0(builder_, level_ + 1);
    result_ = result_ && main_block_member_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ attributes* ]
  private static boolean main_block_member_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_block_member_0_0_0")) return false;
    main_block_member_0_0_0_0(builder_, level_ + 1);
    return true;
  }

  // attributes*
  private static boolean main_block_member_0_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_block_member_0_0_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "main_block_member_0_0_0_0", pos_)) break;
    }
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
  //                         constant_declarations
  private static boolean main_block_member_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_block_member_0_0_1")) return false;
    boolean result_;
    result_ = namespace_declaration(builder_, level_ + 1);
    if (!result_) result_ = class_declaration(builder_, level_ + 1);
    if (!result_) result_ = interface_declaration(builder_, level_ + 1);
    if (!result_) result_ = struct_declaration(builder_, level_ + 1);
    if (!result_) result_ = enum_declaration(builder_, level_ + 1);
    if (!result_) result_ = errordomain_declaration(builder_, level_ + 1);
    if (!result_) result_ = delegate_declaration(builder_, level_ + 1);
    if (!result_) result_ = method_declaration(builder_, level_ + 1);
    if (!result_) result_ = field_declaration(builder_, level_ + 1);
    if (!result_) result_ = constant_declarations(builder_, level_ + 1);
    return result_;
  }

  // [ ( [ attributes* ] ( method_declaration | statement ))* ]
  private static boolean main_block_member_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_block_member_1")) return false;
    main_block_member_1_0(builder_, level_ + 1);
    return true;
  }

  // ( [ attributes* ] ( method_declaration | statement ))*
  private static boolean main_block_member_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_block_member_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!main_block_member_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "main_block_member_1_0", pos_)) break;
    }
    return true;
  }

  // [ attributes* ] ( method_declaration | statement )
  private static boolean main_block_member_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_block_member_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = main_block_member_1_0_0_0(builder_, level_ + 1);
    result_ = result_ && main_block_member_1_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ attributes* ]
  private static boolean main_block_member_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_block_member_1_0_0_0")) return false;
    main_block_member_1_0_0_0_0(builder_, level_ + 1);
    return true;
  }

  // attributes*
  private static boolean main_block_member_1_0_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_block_member_1_0_0_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "main_block_member_1_0_0_0_0", pos_)) break;
    }
    return true;
  }

  // method_declaration | statement
  private static boolean main_block_member_1_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "main_block_member_1_0_0_1")) return false;
    boolean result_;
    result_ = method_declaration(builder_, level_ + 1);
    if (!result_) result_ = statement(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // member_part [ (DOT member_part)* ]
  public static boolean member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MEMBER, "<member>");
    result_ = member_part(builder_, level_ + 1);
    result_ = result_ && member_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (DOT member_part)* ]
  private static boolean member_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_1")) return false;
    member_1_0(builder_, level_ + 1);
    return true;
  }

  // (DOT member_part)*
  private static boolean member_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!member_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "member_1_0", pos_)) break;
    }
    return true;
  }

  // DOT member_part
  private static boolean member_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && member_part(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOT (simple_name | 'default')
  public static boolean member_access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_access")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && member_access_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, MEMBER_ACCESS, result_);
    return result_;
  }

  // simple_name | 'default'
  private static boolean member_access_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_access_1")) return false;
    boolean result_;
    result_ = simple_name(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, "default");
    return result_;
  }

  /* ********************************************************** */
  // async | class | extern | inline | static | abstract | virtual | override | new
  public static boolean member_declaration_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_declaration_modifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MEMBER_DECLARATION_MODIFIER, "<member declaration modifier>");
    result_ = consumeToken(builder_, ASYNC);
    if (!result_) result_ = consumeToken(builder_, CLASS);
    if (!result_) result_ = consumeToken(builder_, EXTERN);
    if (!result_) result_ = consumeToken(builder_, INLINE);
    if (!result_) result_ = consumeToken(builder_, STATIC);
    if (!result_) result_ = consumeToken(builder_, ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, VIRTUAL);
    if (!result_) result_ = consumeToken(builder_, OVERRIDE);
    if (!result_) result_ = consumeToken(builder_, NEW);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // member_declaration_modifier [ (member_declaration_modifier)* ]
  public static boolean member_declaration_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_declaration_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MEMBER_DECLARATION_MODIFIERS, "<member declaration modifiers>");
    result_ = member_declaration_modifier(builder_, level_ + 1);
    result_ = result_ && member_declaration_modifiers_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (member_declaration_modifier)* ]
  private static boolean member_declaration_modifiers_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_declaration_modifiers_1")) return false;
    member_declaration_modifiers_1_0(builder_, level_ + 1);
    return true;
  }

  // (member_declaration_modifier)*
  private static boolean member_declaration_modifiers_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_declaration_modifiers_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!member_declaration_modifiers_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "member_declaration_modifiers_1_0", pos_)) break;
    }
    return true;
  }

  // (member_declaration_modifier)
  private static boolean member_declaration_modifiers_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_declaration_modifiers_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = member_declaration_modifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier EQUALS expression
  public static boolean member_initializer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_initializer")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MEMBER_INITIALIZER, "<member initializer>");
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUALS);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ( ["global::"] identifier) [ type_arguments ]
  public static boolean member_part(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_part")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MEMBER_PART, "<member part>");
    result_ = member_part_0(builder_, level_ + 1);
    result_ = result_ && member_part_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ["global::"] identifier
  private static boolean member_part_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_part_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = member_part_0_0(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ["global::"]
  private static boolean member_part_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_part_0_0")) return false;
    consumeToken(builder_, "global::");
    return true;
  }

  // [ type_arguments ]
  private static boolean member_part_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "member_part_1")) return false;
    type_arguments(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAREN [ arguments ] RPAREN [ object_initializer ]
  public static boolean method_call(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && method_call_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && method_call_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, METHOD_CALL, result_);
    return result_;
  }

  // [ arguments ]
  private static boolean method_call_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_1")) return false;
    arguments(builder_, level_ + 1);
    return true;
  }

  // [ object_initializer ]
  private static boolean method_call_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_3")) return false;
    object_initializer(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ member_declaration_modifiers ] (type | type_with_parenthesis) member [ type_parameters ]
  //                        LPAREN [ parameters ] RPAREN [ throws_statement ] [ requires_statement ] [ ensures_statement ] ( SEMICOLON | block )
  public static boolean method_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, METHOD_DECLARATION, "<method declaration>");
    result_ = method_declaration_0(builder_, level_ + 1);
    result_ = result_ && method_declaration_1(builder_, level_ + 1);
    result_ = result_ && method_declaration_2(builder_, level_ + 1);
    result_ = result_ && member(builder_, level_ + 1);
    result_ = result_ && method_declaration_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && method_declaration_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && method_declaration_8(builder_, level_ + 1);
    result_ = result_ && method_declaration_9(builder_, level_ + 1);
    result_ = result_ && method_declaration_10(builder_, level_ + 1);
    result_ = result_ && method_declaration_11(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ access_modifier ]
  private static boolean method_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration_0")) return false;
    access_modifier(builder_, level_ + 1);
    return true;
  }

  // [ member_declaration_modifiers ]
  private static boolean method_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration_1")) return false;
    member_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  // type | type_with_parenthesis
  private static boolean method_declaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration_2")) return false;
    boolean result_;
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  // [ type_parameters ]
  private static boolean method_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration_4")) return false;
    type_parameters(builder_, level_ + 1);
    return true;
  }

  // [ parameters ]
  private static boolean method_declaration_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration_6")) return false;
    parameters(builder_, level_ + 1);
    return true;
  }

  // [ throws_statement ]
  private static boolean method_declaration_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration_8")) return false;
    throws_statement(builder_, level_ + 1);
    return true;
  }

  // [ requires_statement ]
  private static boolean method_declaration_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration_9")) return false;
    requires_statement(builder_, level_ + 1);
    return true;
  }

  // [ ensures_statement ]
  private static boolean method_declaration_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration_10")) return false;
    ensures_statement(builder_, level_ + 1);
    return true;
  }

  // SEMICOLON | block
  private static boolean method_declaration_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration_11")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = block(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // unary_expression [ (( STAR | FORWARD_SLASH | MODULO ) unary_expression)* ]
  public static boolean multiplicative_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MULTIPLICATIVE_EXPRESSION, "<multiplicative expression>");
    result_ = unary_expression(builder_, level_ + 1);
    result_ = result_ && multiplicative_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (( STAR | FORWARD_SLASH | MODULO ) unary_expression)* ]
  private static boolean multiplicative_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_expression_1")) return false;
    multiplicative_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // (( STAR | FORWARD_SLASH | MODULO ) unary_expression)*
  private static boolean multiplicative_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!multiplicative_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "multiplicative_expression_1_0", pos_)) break;
    }
    return true;
  }

  // ( STAR | FORWARD_SLASH | MODULO ) unary_expression
  private static boolean multiplicative_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = multiplicative_expression_1_0_0_0(builder_, level_ + 1);
    result_ = result_ && unary_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // STAR | FORWARD_SLASH | MODULO
  private static boolean multiplicative_expression_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_expression_1_0_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, STAR);
    if (!result_) result_ = consumeToken(builder_, FORWARD_SLASH);
    if (!result_) result_ = consumeToken(builder_, MODULO);
    return result_;
  }

  /* ********************************************************** */
  // [parameter_direction] [parameter_ownage] identifier COLON (expression | type_weak | type_with_parenthesis | type_weak_with_parenthesis | ['_'] LPAREN expression RPAREN ) [EQUALS expression]
  public static boolean named_argument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "named_argument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NAMED_ARGUMENT, "<named argument>");
    result_ = named_argument_0(builder_, level_ + 1);
    result_ = result_ && named_argument_1(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && named_argument_4(builder_, level_ + 1);
    result_ = result_ && named_argument_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [parameter_direction]
  private static boolean named_argument_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "named_argument_0")) return false;
    parameter_direction(builder_, level_ + 1);
    return true;
  }

  // [parameter_ownage]
  private static boolean named_argument_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "named_argument_1")) return false;
    parameter_ownage(builder_, level_ + 1);
    return true;
  }

  // expression | type_weak | type_with_parenthesis | type_weak_with_parenthesis | ['_'] LPAREN expression RPAREN
  private static boolean named_argument_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "named_argument_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = type_weak(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    if (!result_) result_ = type_weak_with_parenthesis(builder_, level_ + 1);
    if (!result_) result_ = named_argument_4_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['_'] LPAREN expression RPAREN
  private static boolean named_argument_4_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "named_argument_4_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = named_argument_4_4_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['_']
  private static boolean named_argument_4_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "named_argument_4_4_0")) return false;
    consumeToken(builder_, "_");
    return true;
  }

  // [EQUALS expression]
  private static boolean named_argument_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "named_argument_5")) return false;
    named_argument_5_0(builder_, level_ + 1);
    return true;
  }

  // EQUALS expression
  private static boolean named_argument_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "named_argument_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQUALS);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // namespace symbol LBRACE using_directives* namespace_member* RBRACE
  public static boolean namespace_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_declaration")) return false;
    if (!nextTokenIs(builder_, NAMESPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NAMESPACE);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACE);
    result_ = result_ && namespace_declaration_3(builder_, level_ + 1);
    result_ = result_ && namespace_declaration_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, NAMESPACE_DECLARATION, result_);
    return result_;
  }

  // using_directives*
  private static boolean namespace_declaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_declaration_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!using_directives(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "namespace_declaration_3", pos_)) break;
    }
    return true;
  }

  // namespace_member*
  private static boolean namespace_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_declaration_4")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!namespace_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "namespace_declaration_4", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ attributes* ]
  //                      ( namespace_declaration |
  //                        class_declaration |
  //                        interface_declaration |
  //                        struct_declaration |
  //                        enum_declaration |
  //                        errordomain_declaration |
  //                        delegate_declaration |
  //                        method_declaration |
  //                        field_declaration |
  //                        constant_declarations)
  public static boolean namespace_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NAMESPACE_MEMBER, "<namespace member>");
    result_ = namespace_member_0(builder_, level_ + 1);
    result_ = result_ && namespace_member_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ attributes* ]
  private static boolean namespace_member_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_member_0")) return false;
    namespace_member_0_0(builder_, level_ + 1);
    return true;
  }

  // attributes*
  private static boolean namespace_member_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_member_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "namespace_member_0_0", pos_)) break;
    }
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
  //                        constant_declarations
  private static boolean namespace_member_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespace_member_1")) return false;
    boolean result_;
    result_ = namespace_declaration(builder_, level_ + 1);
    if (!result_) result_ = class_declaration(builder_, level_ + 1);
    if (!result_) result_ = interface_declaration(builder_, level_ + 1);
    if (!result_) result_ = struct_declaration(builder_, level_ + 1);
    if (!result_) result_ = enum_declaration(builder_, level_ + 1);
    if (!result_) result_ = errordomain_declaration(builder_, level_ + 1);
    if (!result_) result_ = delegate_declaration(builder_, level_ + 1);
    if (!result_) result_ = method_declaration(builder_, level_ + 1);
    if (!result_) result_ = field_declaration(builder_, level_ + 1);
    if (!result_) result_ = constant_declarations(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // LPAREN [ arguments ] RPAREN [ object_initializer (member_access [method_call])* | object_initializer | (member_access [method_call])* ]
  public static boolean object_creation_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_creation_expression")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && object_creation_expression_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && object_creation_expression_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, OBJECT_CREATION_EXPRESSION, result_);
    return result_;
  }

  // [ arguments ]
  private static boolean object_creation_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_creation_expression_1")) return false;
    arguments(builder_, level_ + 1);
    return true;
  }

  // [ object_initializer (member_access [method_call])* | object_initializer | (member_access [method_call])* ]
  private static boolean object_creation_expression_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_creation_expression_3")) return false;
    object_creation_expression_3_0(builder_, level_ + 1);
    return true;
  }

  // object_initializer (member_access [method_call])* | object_initializer | (member_access [method_call])*
  private static boolean object_creation_expression_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_creation_expression_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = object_creation_expression_3_0_0(builder_, level_ + 1);
    if (!result_) result_ = object_initializer(builder_, level_ + 1);
    if (!result_) result_ = object_creation_expression_3_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // object_initializer (member_access [method_call])*
  private static boolean object_creation_expression_3_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_creation_expression_3_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = object_initializer(builder_, level_ + 1);
    result_ = result_ && object_creation_expression_3_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (member_access [method_call])*
  private static boolean object_creation_expression_3_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_creation_expression_3_0_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!object_creation_expression_3_0_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "object_creation_expression_3_0_0_1", pos_)) break;
    }
    return true;
  }

  // member_access [method_call]
  private static boolean object_creation_expression_3_0_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_creation_expression_3_0_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = member_access(builder_, level_ + 1);
    result_ = result_ && object_creation_expression_3_0_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [method_call]
  private static boolean object_creation_expression_3_0_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_creation_expression_3_0_0_1_0_1")) return false;
    method_call(builder_, level_ + 1);
    return true;
  }

  // (member_access [method_call])*
  private static boolean object_creation_expression_3_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_creation_expression_3_0_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!object_creation_expression_3_0_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "object_creation_expression_3_0_2", pos_)) break;
    }
    return true;
  }

  // member_access [method_call]
  private static boolean object_creation_expression_3_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_creation_expression_3_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = member_access(builder_, level_ + 1);
    result_ = result_ && object_creation_expression_3_0_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [method_call]
  private static boolean object_creation_expression_3_0_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_creation_expression_3_0_2_0_1")) return false;
    method_call(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACE member_initializer [ (COMMA member_initializer)* ] [COMMA] RBRACE
  public static boolean object_initializer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_initializer")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && member_initializer(builder_, level_ + 1);
    result_ = result_ && object_initializer_2(builder_, level_ + 1);
    result_ = result_ && object_initializer_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, OBJECT_INITIALIZER, result_);
    return result_;
  }

  // [ (COMMA member_initializer)* ]
  private static boolean object_initializer_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_initializer_2")) return false;
    object_initializer_2_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA member_initializer)*
  private static boolean object_initializer_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_initializer_2_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!object_initializer_2_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "object_initializer_2_0", pos_)) break;
    }
    return true;
  }

  // COMMA member_initializer
  private static boolean object_initializer_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_initializer_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && member_initializer(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [COMMA]
  private static boolean object_initializer_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_initializer_3")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // new (member | type | type_with_parenthesis | type_weak | type_weak_with_parenthesis ) [STAR*] [QUESTION_MARK] ( object_creation_expression | array_creation_expression )
  public static boolean object_or_array_creation_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_or_array_creation_expression")) return false;
    if (!nextTokenIs(builder_, NEW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NEW);
    result_ = result_ && object_or_array_creation_expression_1(builder_, level_ + 1);
    result_ = result_ && object_or_array_creation_expression_2(builder_, level_ + 1);
    result_ = result_ && object_or_array_creation_expression_3(builder_, level_ + 1);
    result_ = result_ && object_or_array_creation_expression_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, OBJECT_OR_ARRAY_CREATION_EXPRESSION, result_);
    return result_;
  }

  // member | type | type_with_parenthesis | type_weak | type_weak_with_parenthesis
  private static boolean object_or_array_creation_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_or_array_creation_expression_1")) return false;
    boolean result_;
    result_ = member(builder_, level_ + 1);
    if (!result_) result_ = type(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    if (!result_) result_ = type_weak(builder_, level_ + 1);
    if (!result_) result_ = type_weak_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  // [STAR*]
  private static boolean object_or_array_creation_expression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_or_array_creation_expression_2")) return false;
    object_or_array_creation_expression_2_0(builder_, level_ + 1);
    return true;
  }

  // STAR*
  private static boolean object_or_array_creation_expression_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_or_array_creation_expression_2_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, STAR)) break;
      if (!empty_element_parsed_guard_(builder_, "object_or_array_creation_expression_2_0", pos_)) break;
    }
    return true;
  }

  // [QUESTION_MARK]
  private static boolean object_or_array_creation_expression_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_or_array_creation_expression_3")) return false;
    consumeToken(builder_, QUESTION_MARK);
    return true;
  }

  // object_creation_expression | array_creation_expression
  private static boolean object_or_array_creation_expression_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_or_array_creation_expression_4")) return false;
    boolean result_;
    result_ = object_creation_expression(builder_, level_ + 1);
    if (!result_) result_ = array_creation_expression(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // [ attributes* ] ( ELLIPSIS | ( [parameter_direction] [parameter_ownage] ) [params] ( (type | type_weak
  // | type_with_parenthesis | type_weak_with_parenthesis) identifier [inline_array_type] [ EQUALS expression ] ) )
  public static boolean parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PARAMETER, "<parameter>");
    result_ = parameter_0(builder_, level_ + 1);
    result_ = result_ && parameter_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ attributes* ]
  private static boolean parameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_0")) return false;
    parameter_0_0(builder_, level_ + 1);
    return true;
  }

  // attributes*
  private static boolean parameter_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameter_0_0", pos_)) break;
    }
    return true;
  }

  // ELLIPSIS | ( [parameter_direction] [parameter_ownage] ) [params] ( (type | type_weak
  // | type_with_parenthesis | type_weak_with_parenthesis) identifier [inline_array_type] [ EQUALS expression ] )
  private static boolean parameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELLIPSIS);
    if (!result_) result_ = parameter_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( [parameter_direction] [parameter_ownage] ) [params] ( (type | type_weak
  // | type_with_parenthesis | type_weak_with_parenthesis) identifier [inline_array_type] [ EQUALS expression ] )
  private static boolean parameter_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter_1_1_0(builder_, level_ + 1);
    result_ = result_ && parameter_1_1_1(builder_, level_ + 1);
    result_ = result_ && parameter_1_1_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [parameter_direction] [parameter_ownage]
  private static boolean parameter_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter_1_1_0_0(builder_, level_ + 1);
    result_ = result_ && parameter_1_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [parameter_direction]
  private static boolean parameter_1_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_1_1_0_0")) return false;
    parameter_direction(builder_, level_ + 1);
    return true;
  }

  // [parameter_ownage]
  private static boolean parameter_1_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_1_1_0_1")) return false;
    parameter_ownage(builder_, level_ + 1);
    return true;
  }

  // [params]
  private static boolean parameter_1_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_1_1_1")) return false;
    consumeToken(builder_, PARAMS);
    return true;
  }

  // (type | type_weak
  // | type_with_parenthesis | type_weak_with_parenthesis) identifier [inline_array_type] [ EQUALS expression ]
  private static boolean parameter_1_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_1_1_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter_1_1_2_0(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && parameter_1_1_2_2(builder_, level_ + 1);
    result_ = result_ && parameter_1_1_2_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // type | type_weak
  // | type_with_parenthesis | type_weak_with_parenthesis
  private static boolean parameter_1_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_1_1_2_0")) return false;
    boolean result_;
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = type_weak(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    if (!result_) result_ = type_weak_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  // [inline_array_type]
  private static boolean parameter_1_1_2_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_1_1_2_2")) return false;
    inline_array_type(builder_, level_ + 1);
    return true;
  }

  // [ EQUALS expression ]
  private static boolean parameter_1_1_2_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_1_1_2_3")) return false;
    parameter_1_1_2_3_0(builder_, level_ + 1);
    return true;
  }

  // EQUALS expression
  private static boolean parameter_1_1_2_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_1_1_2_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQUALS);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // in | out | ref
  static boolean parameter_direction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_direction")) return false;
    boolean result_;
    result_ = consumeToken(builder_, IN);
    if (!result_) result_ = consumeToken(builder_, OUT);
    if (!result_) result_ = consumeToken(builder_, REF);
    return result_;
  }

  /* ********************************************************** */
  // own | unowned
  static boolean parameter_ownage(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_ownage")) return false;
    if (!nextTokenIs(builder_, "", OWN, UNOWNED)) return false;
    boolean result_;
    result_ = consumeToken(builder_, OWN);
    if (!result_) result_ = consumeToken(builder_, UNOWNED);
    return result_;
  }

  /* ********************************************************** */
  // parameter [ (COMMA parameter)* [ COMMA ] ]
  public static boolean parameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PARAMETERS, "<parameters>");
    result_ = parameter(builder_, level_ + 1);
    result_ = result_ && parameters_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (COMMA parameter)* [ COMMA ] ]
  private static boolean parameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_1")) return false;
    parameters_1_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA parameter)* [ COMMA ]
  private static boolean parameters_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameters_1_0_0(builder_, level_ + 1);
    result_ = result_ && parameters_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA parameter)*
  private static boolean parameters_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_1_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parameters_1_0_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameters_1_0_0", pos_)) break;
    }
    return true;
  }

  // COMMA parameter
  private static boolean parameters_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_1_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && parameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ COMMA ]
  private static boolean parameters_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_1_0_1")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // ARROW member
  public static boolean pointer_member_access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pointer_member_access")) return false;
    if (!nextTokenIs(builder_, ARROW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ARROW);
    result_ = result_ && member(builder_, level_ + 1);
    exit_section_(builder_, marker_, POINTER_MEMBER_ACCESS, result_);
    return result_;
  }

  /* ********************************************************** */
  // DECREMENT
  public static boolean post_decrement_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "post_decrement_expression")) return false;
    if (!nextTokenIs(builder_, DECREMENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DECREMENT);
    exit_section_(builder_, marker_, POST_DECREMENT_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // INCREMENT
  public static boolean post_increment_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "post_increment_expression")) return false;
    if (!nextTokenIs(builder_, INCREMENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INCREMENT);
    exit_section_(builder_, marker_, POST_INCREMENT_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( literal | object_or_array_creation_expression | initializer | tuple | template | this_access | base_access |
  //                         yield_expression | sizeof_expression | typeof_expression |
  //                        simple_name )
  //                        [ ( [QUESTION_MARK] member_access | pointer_member_access | element_access |
  //                          post_increment_expression | method_call | post_decrement_expression)* ]
  public static boolean primary_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PRIMARY_EXPRESSION, "<primary expression>");
    result_ = primary_expression_0(builder_, level_ + 1);
    result_ = result_ && primary_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // literal | object_or_array_creation_expression | initializer | tuple | template | this_access | base_access |
  //                         yield_expression | sizeof_expression | typeof_expression |
  //                        simple_name
  private static boolean primary_expression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_expression_0")) return false;
    boolean result_;
    result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = object_or_array_creation_expression(builder_, level_ + 1);
    if (!result_) result_ = initializer(builder_, level_ + 1);
    if (!result_) result_ = tuple(builder_, level_ + 1);
    if (!result_) result_ = template(builder_, level_ + 1);
    if (!result_) result_ = this_access(builder_, level_ + 1);
    if (!result_) result_ = base_access(builder_, level_ + 1);
    if (!result_) result_ = yield_expression(builder_, level_ + 1);
    if (!result_) result_ = sizeof_expression(builder_, level_ + 1);
    if (!result_) result_ = typeof_expression(builder_, level_ + 1);
    if (!result_) result_ = simple_name(builder_, level_ + 1);
    return result_;
  }

  // [ ( [QUESTION_MARK] member_access | pointer_member_access | element_access |
  //                          post_increment_expression | method_call | post_decrement_expression)* ]
  private static boolean primary_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_expression_1")) return false;
    primary_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // ( [QUESTION_MARK] member_access | pointer_member_access | element_access |
  //                          post_increment_expression | method_call | post_decrement_expression)*
  private static boolean primary_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!primary_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "primary_expression_1_0", pos_)) break;
    }
    return true;
  }

  // [QUESTION_MARK] member_access | pointer_member_access | element_access |
  //                          post_increment_expression | method_call | post_decrement_expression
  private static boolean primary_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = primary_expression_1_0_0_0(builder_, level_ + 1);
    if (!result_) result_ = pointer_member_access(builder_, level_ + 1);
    if (!result_) result_ = element_access(builder_, level_ + 1);
    if (!result_) result_ = post_increment_expression(builder_, level_ + 1);
    if (!result_) result_ = method_call(builder_, level_ + 1);
    if (!result_) result_ = post_decrement_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [QUESTION_MARK] member_access
  private static boolean primary_expression_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_expression_1_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = primary_expression_1_0_0_0_0(builder_, level_ + 1);
    result_ = result_ && member_access(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [QUESTION_MARK]
  private static boolean primary_expression_1_0_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_expression_1_0_0_0_0")) return false;
    consumeToken(builder_, QUESTION_MARK);
    return true;
  }

  /* ********************************************************** */
  // [ attributes* ] [ access_modifier ] [owned | unowned] ( property_get_accessor |
  // property_set_accessor | property_construct_accessor )
  public static boolean property_accessor(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_accessor")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PROPERTY_ACCESSOR, "<property accessor>");
    result_ = property_accessor_0(builder_, level_ + 1);
    result_ = result_ && property_accessor_1(builder_, level_ + 1);
    result_ = result_ && property_accessor_2(builder_, level_ + 1);
    result_ = result_ && property_accessor_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ attributes* ]
  private static boolean property_accessor_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_accessor_0")) return false;
    property_accessor_0_0(builder_, level_ + 1);
    return true;
  }

  // attributes*
  private static boolean property_accessor_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_accessor_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "property_accessor_0_0", pos_)) break;
    }
    return true;
  }

  // [ access_modifier ]
  private static boolean property_accessor_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_accessor_1")) return false;
    access_modifier(builder_, level_ + 1);
    return true;
  }

  // [owned | unowned]
  private static boolean property_accessor_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_accessor_2")) return false;
    property_accessor_2_0(builder_, level_ + 1);
    return true;
  }

  // owned | unowned
  private static boolean property_accessor_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_accessor_2_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, OWNED);
    if (!result_) result_ = consumeToken(builder_, UNOWNED);
    return result_;
  }

  // property_get_accessor |
  // property_set_accessor | property_construct_accessor
  private static boolean property_accessor_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_accessor_3")) return false;
    boolean result_;
    result_ = property_get_accessor(builder_, level_ + 1);
    if (!result_) result_ = property_set_accessor(builder_, level_ + 1);
    if (!result_) result_ = property_construct_accessor(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // construct [set] ( SEMICOLON | block )
  public static boolean property_construct_accessor(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_construct_accessor")) return false;
    if (!nextTokenIs(builder_, CONSTRUCT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CONSTRUCT);
    result_ = result_ && property_construct_accessor_1(builder_, level_ + 1);
    result_ = result_ && property_construct_accessor_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROPERTY_CONSTRUCT_ACCESSOR, result_);
    return result_;
  }

  // [set]
  private static boolean property_construct_accessor_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_construct_accessor_1")) return false;
    consumeToken(builder_, SET);
    return true;
  }

  // SEMICOLON | block
  private static boolean property_construct_accessor_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_construct_accessor_2")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = block(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ property_declaration_modifiers ] (type_weak | type_weak_with_parenthesis) identifier
  //                          LBRACE property_declaration_part* RBRACE
  public static boolean property_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PROPERTY_DECLARATION, "<property declaration>");
    result_ = property_declaration_0(builder_, level_ + 1);
    result_ = result_ && property_declaration_1(builder_, level_ + 1);
    result_ = result_ && property_declaration_2(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACE);
    result_ = result_ && property_declaration_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ access_modifier ]
  private static boolean property_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_declaration_0")) return false;
    access_modifier(builder_, level_ + 1);
    return true;
  }

  // [ property_declaration_modifiers ]
  private static boolean property_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_declaration_1")) return false;
    property_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  // type_weak | type_weak_with_parenthesis
  private static boolean property_declaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_declaration_2")) return false;
    boolean result_;
    result_ = type_weak(builder_, level_ + 1);
    if (!result_) result_ = type_weak_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  // property_declaration_part*
  private static boolean property_declaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_declaration_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!property_declaration_part(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "property_declaration_5", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // class | static | extern | inline | abstract | virtual | override | new
  public static boolean property_declaration_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_declaration_modifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PROPERTY_DECLARATION_MODIFIER, "<property declaration modifier>");
    result_ = consumeToken(builder_, CLASS);
    if (!result_) result_ = consumeToken(builder_, STATIC);
    if (!result_) result_ = consumeToken(builder_, EXTERN);
    if (!result_) result_ = consumeToken(builder_, INLINE);
    if (!result_) result_ = consumeToken(builder_, ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, VIRTUAL);
    if (!result_) result_ = consumeToken(builder_, OVERRIDE);
    if (!result_) result_ = consumeToken(builder_, NEW);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // property_declaration_modifier [ (property_declaration_modifier)* ]
  public static boolean property_declaration_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_declaration_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PROPERTY_DECLARATION_MODIFIERS, "<property declaration modifiers>");
    result_ = property_declaration_modifier(builder_, level_ + 1);
    result_ = result_ && property_declaration_modifiers_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (property_declaration_modifier)* ]
  private static boolean property_declaration_modifiers_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_declaration_modifiers_1")) return false;
    property_declaration_modifiers_1_0(builder_, level_ + 1);
    return true;
  }

  // (property_declaration_modifier)*
  private static boolean property_declaration_modifiers_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_declaration_modifiers_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!property_declaration_modifiers_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "property_declaration_modifiers_1_0", pos_)) break;
    }
    return true;
  }

  // (property_declaration_modifier)
  private static boolean property_declaration_modifiers_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_declaration_modifiers_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = property_declaration_modifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( default EQUALS expression SEMICOLON ) | property_accessor
  public static boolean property_declaration_part(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_declaration_part")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PROPERTY_DECLARATION_PART, "<property declaration part>");
    result_ = property_declaration_part_0(builder_, level_ + 1);
    if (!result_) result_ = property_accessor(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // default EQUALS expression SEMICOLON
  private static boolean property_declaration_part_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_declaration_part_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DEFAULT, EQUALS);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // get ( SEMICOLON | block )
  public static boolean property_get_accessor(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_get_accessor")) return false;
    if (!nextTokenIs(builder_, GET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, GET);
    result_ = result_ && property_get_accessor_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROPERTY_GET_ACCESSOR, result_);
    return result_;
  }

  // SEMICOLON | block
  private static boolean property_get_accessor_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_get_accessor_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = block(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // set [construct] ( SEMICOLON | block )
  public static boolean property_set_accessor(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_set_accessor")) return false;
    if (!nextTokenIs(builder_, SET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SET);
    result_ = result_ && property_set_accessor_1(builder_, level_ + 1);
    result_ = result_ && property_set_accessor_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROPERTY_SET_ACCESSOR, result_);
    return result_;
  }

  // [construct]
  private static boolean property_set_accessor_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_set_accessor_1")) return false;
    consumeToken(builder_, CONSTRUCT);
    return true;
  }

  // SEMICOLON | block
  private static boolean property_set_accessor_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_set_accessor_2")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = block(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // REGULAR_EXPRESSION [('m'|'i'|'x'|'o'|'s')*]
  public static boolean regex_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "regex_literal")) return false;
    if (!nextTokenIs(builder_, REGULAR_EXPRESSION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, REGULAR_EXPRESSION);
    result_ = result_ && regex_literal_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, REGEX_LITERAL, result_);
    return result_;
  }

  // [('m'|'i'|'x'|'o'|'s')*]
  private static boolean regex_literal_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "regex_literal_1")) return false;
    regex_literal_1_0(builder_, level_ + 1);
    return true;
  }

  // ('m'|'i'|'x'|'o'|'s')*
  private static boolean regex_literal_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "regex_literal_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!regex_literal_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "regex_literal_1_0", pos_)) break;
    }
    return true;
  }

  // 'm'|'i'|'x'|'o'|'s'
  private static boolean regex_literal_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "regex_literal_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "m");
    if (!result_) result_ = consumeToken(builder_, "i");
    if (!result_) result_ = consumeToken(builder_, "x");
    if (!result_) result_ = consumeToken(builder_, "o");
    if (!result_) result_ = consumeToken(builder_, "s");
    return result_;
  }

  /* ********************************************************** */
  // shift_expression [ ((( LESS_THAN | LESS_THAN_EQUALS | GREATER_THAN | GREATER_THAN_EQUALS ) shift_expression ) | ( is type ) | ( as type ) )*]
  public static boolean relational_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relational_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RELATIONAL_EXPRESSION, "<relational expression>");
    result_ = shift_expression(builder_, level_ + 1);
    result_ = result_ && relational_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ ((( LESS_THAN | LESS_THAN_EQUALS | GREATER_THAN | GREATER_THAN_EQUALS ) shift_expression ) | ( is type ) | ( as type ) )*]
  private static boolean relational_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relational_expression_1")) return false;
    relational_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // ((( LESS_THAN | LESS_THAN_EQUALS | GREATER_THAN | GREATER_THAN_EQUALS ) shift_expression ) | ( is type ) | ( as type ) )*
  private static boolean relational_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relational_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!relational_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "relational_expression_1_0", pos_)) break;
    }
    return true;
  }

  // (( LESS_THAN | LESS_THAN_EQUALS | GREATER_THAN | GREATER_THAN_EQUALS ) shift_expression ) | ( is type ) | ( as type )
  private static boolean relational_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relational_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = relational_expression_1_0_0_0(builder_, level_ + 1);
    if (!result_) result_ = relational_expression_1_0_0_1(builder_, level_ + 1);
    if (!result_) result_ = relational_expression_1_0_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( LESS_THAN | LESS_THAN_EQUALS | GREATER_THAN | GREATER_THAN_EQUALS ) shift_expression
  private static boolean relational_expression_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relational_expression_1_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = relational_expression_1_0_0_0_0(builder_, level_ + 1);
    result_ = result_ && shift_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LESS_THAN | LESS_THAN_EQUALS | GREATER_THAN | GREATER_THAN_EQUALS
  private static boolean relational_expression_1_0_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relational_expression_1_0_0_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, LESS_THAN);
    if (!result_) result_ = consumeToken(builder_, LESS_THAN_EQUALS);
    if (!result_) result_ = consumeToken(builder_, GREATER_THAN);
    if (!result_) result_ = consumeToken(builder_, GREATER_THAN_EQUALS);
    return result_;
  }

  // is type
  private static boolean relational_expression_1_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relational_expression_1_0_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IS);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // as type
  private static boolean relational_expression_1_0_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relational_expression_1_0_0_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AS);
    result_ = result_ && type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // requires LPAREN expression RPAREN [ requires_statement ]
  public static boolean requires_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "requires_statement")) return false;
    if (!nextTokenIs(builder_, REQUIRES)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, REQUIRES, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && requires_statement_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, REQUIRES_STATEMENT, result_);
    return result_;
  }

  // [ requires_statement ]
  private static boolean requires_statement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "requires_statement_4")) return false;
    requires_statement(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // return [ expression ] SEMICOLON
  public static boolean return_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_statement")) return false;
    if (!nextTokenIs(builder_, RETURN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RETURN);
    result_ = result_ && return_statement_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, RETURN_STATEMENT, result_);
    return result_;
  }

  // [ expression ]
  private static boolean return_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_statement_1")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // additive_expression [ ( ( '<<' | '>>' ) additive_expression)* ]
  public static boolean shift_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shift_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SHIFT_EXPRESSION, "<shift expression>");
    result_ = additive_expression(builder_, level_ + 1);
    result_ = result_ && shift_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ ( ( '<<' | '>>' ) additive_expression)* ]
  private static boolean shift_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shift_expression_1")) return false;
    shift_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // ( ( '<<' | '>>' ) additive_expression)*
  private static boolean shift_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shift_expression_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!shift_expression_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "shift_expression_1_0", pos_)) break;
    }
    return true;
  }

  // ( '<<' | '>>' ) additive_expression
  private static boolean shift_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shift_expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = shift_expression_1_0_0_0(builder_, level_ + 1);
    result_ = result_ && additive_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '<<' | '>>'
  private static boolean shift_expression_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shift_expression_1_0_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "<<");
    if (!result_) result_ = consumeToken(builder_, ">>");
    return result_;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ signal_declaration_modifiers ] signal (type | type_with_parenthesis) identifier
  //                        LPAREN [ parameters ] RPAREN ( SEMICOLON | block )
  public static boolean signal_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SIGNAL_DECLARATION, "<signal declaration>");
    result_ = signal_declaration_0(builder_, level_ + 1);
    result_ = result_ && signal_declaration_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SIGNAL);
    result_ = result_ && signal_declaration_3(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && signal_declaration_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && signal_declaration_8(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ access_modifier ]
  private static boolean signal_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_declaration_0")) return false;
    access_modifier(builder_, level_ + 1);
    return true;
  }

  // [ signal_declaration_modifiers ]
  private static boolean signal_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_declaration_1")) return false;
    signal_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  // type | type_with_parenthesis
  private static boolean signal_declaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_declaration_3")) return false;
    boolean result_;
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  // [ parameters ]
  private static boolean signal_declaration_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_declaration_6")) return false;
    parameters(builder_, level_ + 1);
    return true;
  }

  // SEMICOLON | block
  private static boolean signal_declaration_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_declaration_8")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = block(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // async | extern | inline | abstract | virtual | override | new
  public static boolean signal_declaration_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_declaration_modifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SIGNAL_DECLARATION_MODIFIER, "<signal declaration modifier>");
    result_ = consumeToken(builder_, ASYNC);
    if (!result_) result_ = consumeToken(builder_, EXTERN);
    if (!result_) result_ = consumeToken(builder_, INLINE);
    if (!result_) result_ = consumeToken(builder_, ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, VIRTUAL);
    if (!result_) result_ = consumeToken(builder_, OVERRIDE);
    if (!result_) result_ = consumeToken(builder_, NEW);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // signal_declaration_modifier [ (signal_declaration_modifier)* ]
  public static boolean signal_declaration_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_declaration_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SIGNAL_DECLARATION_MODIFIERS, "<signal declaration modifiers>");
    result_ = signal_declaration_modifier(builder_, level_ + 1);
    result_ = result_ && signal_declaration_modifiers_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (signal_declaration_modifier)* ]
  private static boolean signal_declaration_modifiers_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_declaration_modifiers_1")) return false;
    signal_declaration_modifiers_1_0(builder_, level_ + 1);
    return true;
  }

  // (signal_declaration_modifier)*
  private static boolean signal_declaration_modifiers_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_declaration_modifiers_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!signal_declaration_modifiers_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "signal_declaration_modifiers_1_0", pos_)) break;
    }
    return true;
  }

  // (signal_declaration_modifier)
  private static boolean signal_declaration_modifiers_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_declaration_modifiers_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = signal_declaration_modifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( ['global::'] identifier) [ type_arguments ]
  public static boolean simple_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_name")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SIMPLE_NAME, "<simple name>");
    result_ = simple_name_0(builder_, level_ + 1);
    result_ = result_ && simple_name_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ['global::'] identifier
  private static boolean simple_name_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_name_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = simple_name_0_0(builder_, level_ + 1);
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ['global::']
  private static boolean simple_name_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_name_0_0")) return false;
    consumeToken(builder_, "global::");
    return true;
  }

  // [ type_arguments ]
  private static boolean simple_name_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_name_1")) return false;
    type_arguments(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // sizeof LPAREN (type | type_with_parenthesis) RPAREN
  public static boolean sizeof_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sizeof_expression")) return false;
    if (!nextTokenIs(builder_, SIZEOF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, SIZEOF, LPAREN);
    result_ = result_ && sizeof_expression_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, SIZEOF_EXPRESSION, result_);
    return result_;
  }

  // type | type_with_parenthesis
  private static boolean sizeof_expression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sizeof_expression_2")) return false;
    boolean result_;
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // block | SEMICOLON | object_or_array_creation_expression | with_statement | if_statement | switch_statement | while_statement | do_statement | for_statement | foreach_statement |
  //               break_statement | continue_statement | return_statement | yield_statement | throw_statement | method_declaration | local_variable_declarations | delegate_declaration |
  //               try_statement | delete_statement | expression_statement | lock_statement | unlock_statement | constant_declarations
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT, "<statement>");
    result_ = block(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = object_or_array_creation_expression(builder_, level_ + 1);
    if (!result_) result_ = with_statement(builder_, level_ + 1);
    if (!result_) result_ = if_statement(builder_, level_ + 1);
    if (!result_) result_ = switch_statement(builder_, level_ + 1);
    if (!result_) result_ = while_statement(builder_, level_ + 1);
    if (!result_) result_ = do_statement(builder_, level_ + 1);
    if (!result_) result_ = for_statement(builder_, level_ + 1);
    if (!result_) result_ = foreach_statement(builder_, level_ + 1);
    if (!result_) result_ = break_statement(builder_, level_ + 1);
    if (!result_) result_ = continue_statement(builder_, level_ + 1);
    if (!result_) result_ = return_statement(builder_, level_ + 1);
    if (!result_) result_ = yield_statement(builder_, level_ + 1);
    if (!result_) result_ = throw_statement(builder_, level_ + 1);
    if (!result_) result_ = method_declaration(builder_, level_ + 1);
    if (!result_) result_ = local_variable_declarations(builder_, level_ + 1);
    if (!result_) result_ = delegate_declaration(builder_, level_ + 1);
    if (!result_) result_ = try_statement(builder_, level_ + 1);
    if (!result_) result_ = delete_statement(builder_, level_ + 1);
    if (!result_) result_ = expression_statement(builder_, level_ + 1);
    if (!result_) result_ = lock_statement(builder_, level_ + 1);
    if (!result_) result_ = unlock_statement(builder_, level_ + 1);
    if (!result_) result_ = constant_declarations(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // expression
  public static boolean statement_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT_EXPRESSION, "<statement expression>");
    result_ = expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [ access_modifier ] [ type_declaration_modifiers ] struct symbol [type_arguments]
  //                        [ COLON base_types ] LBRACE struct_member* RBRACE
  public static boolean struct_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRUCT_DECLARATION, "<struct declaration>");
    result_ = struct_declaration_0(builder_, level_ + 1);
    result_ = result_ && struct_declaration_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, STRUCT);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && struct_declaration_4(builder_, level_ + 1);
    result_ = result_ && struct_declaration_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACE);
    result_ = result_ && struct_declaration_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ access_modifier ]
  private static boolean struct_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_declaration_0")) return false;
    access_modifier(builder_, level_ + 1);
    return true;
  }

  // [ type_declaration_modifiers ]
  private static boolean struct_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_declaration_1")) return false;
    type_declaration_modifiers(builder_, level_ + 1);
    return true;
  }

  // [type_arguments]
  private static boolean struct_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_declaration_4")) return false;
    type_arguments(builder_, level_ + 1);
    return true;
  }

  // [ COLON base_types ]
  private static boolean struct_declaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_declaration_5")) return false;
    struct_declaration_5_0(builder_, level_ + 1);
    return true;
  }

  // COLON base_types
  private static boolean struct_declaration_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_declaration_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && base_types(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // struct_member*
  private static boolean struct_declaration_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_declaration_7")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!struct_member(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "struct_declaration_7", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [ attributes* ] ( field_declaration | method_declaration | constant_declarations |
  // property_declaration | creation_method_declaration )
  public static boolean struct_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRUCT_MEMBER, "<struct member>");
    result_ = struct_member_0(builder_, level_ + 1);
    result_ = result_ && struct_member_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ attributes* ]
  private static boolean struct_member_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_member_0")) return false;
    struct_member_0_0(builder_, level_ + 1);
    return true;
  }

  // attributes*
  private static boolean struct_member_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_member_0_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "struct_member_0_0", pos_)) break;
    }
    return true;
  }

  // field_declaration | method_declaration | constant_declarations |
  // property_declaration | creation_method_declaration
  private static boolean struct_member_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_member_1")) return false;
    boolean result_;
    result_ = field_declaration(builder_, level_ + 1);
    if (!result_) result_ = method_declaration(builder_, level_ + 1);
    if (!result_) result_ = constant_declarations(builder_, level_ + 1);
    if (!result_) result_ = property_declaration(builder_, level_ + 1);
    if (!result_) result_ = creation_method_declaration(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // case (expression (COMMA expression)*) COLON embedded_statement_without_block*
  public static boolean switch_case_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_statement")) return false;
    if (!nextTokenIs(builder_, CASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CASE);
    result_ = result_ && switch_case_statement_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && switch_case_statement_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, SWITCH_CASE_STATEMENT, result_);
    return result_;
  }

  // expression (COMMA expression)*
  private static boolean switch_case_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_statement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && switch_case_statement_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA expression)*
  private static boolean switch_case_statement_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_statement_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!switch_case_statement_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "switch_case_statement_1_1", pos_)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean switch_case_statement_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_statement_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // embedded_statement_without_block*
  private static boolean switch_case_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_statement_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!embedded_statement_without_block(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "switch_case_statement_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // switch_case_statement (switch_case_statement*) [switch_default_statement]
  public static boolean switch_case_statements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_statements")) return false;
    if (!nextTokenIs(builder_, CASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = switch_case_statement(builder_, level_ + 1);
    result_ = result_ && switch_case_statements_1(builder_, level_ + 1);
    result_ = result_ && switch_case_statements_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, SWITCH_CASE_STATEMENTS, result_);
    return result_;
  }

  // switch_case_statement*
  private static boolean switch_case_statements_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_statements_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!switch_case_statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "switch_case_statements_1", pos_)) break;
    }
    return true;
  }

  // [switch_default_statement]
  private static boolean switch_case_statements_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_case_statements_2")) return false;
    switch_default_statement(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // default COLON embedded_statement_without_block* [ (case expression COLON embedded_statement_without_block*)*]
  public static boolean switch_default_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_default_statement")) return false;
    if (!nextTokenIs(builder_, DEFAULT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DEFAULT, COLON);
    result_ = result_ && switch_default_statement_2(builder_, level_ + 1);
    result_ = result_ && switch_default_statement_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, SWITCH_DEFAULT_STATEMENT, result_);
    return result_;
  }

  // embedded_statement_without_block*
  private static boolean switch_default_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_default_statement_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!embedded_statement_without_block(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "switch_default_statement_2", pos_)) break;
    }
    return true;
  }

  // [ (case expression COLON embedded_statement_without_block*)*]
  private static boolean switch_default_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_default_statement_3")) return false;
    switch_default_statement_3_0(builder_, level_ + 1);
    return true;
  }

  // (case expression COLON embedded_statement_without_block*)*
  private static boolean switch_default_statement_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_default_statement_3_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!switch_default_statement_3_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "switch_default_statement_3_0", pos_)) break;
    }
    return true;
  }

  // case expression COLON embedded_statement_without_block*
  private static boolean switch_default_statement_3_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_default_statement_3_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CASE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && switch_default_statement_3_0_0_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // embedded_statement_without_block*
  private static boolean switch_default_statement_3_0_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_default_statement_3_0_0_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!embedded_statement_without_block(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "switch_default_statement_3_0_0_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // switch_case_statements | switch_default_statement
  public static boolean switch_section(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_section")) return false;
    if (!nextTokenIs(builder_, "<switch section>", CASE, DEFAULT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SWITCH_SECTION, "<switch section>");
    result_ = switch_case_statements(builder_, level_ + 1);
    if (!result_) result_ = switch_default_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // switch LPAREN expression RPAREN LBRACE switch_section RBRACE
  public static boolean switch_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_statement")) return false;
    if (!nextTokenIs(builder_, SWITCH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, SWITCH, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, LBRACE);
    result_ = result_ && switch_section(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, SWITCH_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // symbol_part [QUESTION_MARK] [ (DOT symbol_part [QUESTION_MARK])* ]
  public static boolean symbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SYMBOL, "<symbol>");
    result_ = symbol_part(builder_, level_ + 1);
    result_ = result_ && symbol_1(builder_, level_ + 1);
    result_ = result_ && symbol_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [QUESTION_MARK]
  private static boolean symbol_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol_1")) return false;
    consumeToken(builder_, QUESTION_MARK);
    return true;
  }

  // [ (DOT symbol_part [QUESTION_MARK])* ]
  private static boolean symbol_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol_2")) return false;
    symbol_2_0(builder_, level_ + 1);
    return true;
  }

  // (DOT symbol_part [QUESTION_MARK])*
  private static boolean symbol_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol_2_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!symbol_2_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "symbol_2_0", pos_)) break;
    }
    return true;
  }

  // DOT symbol_part [QUESTION_MARK]
  private static boolean symbol_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && symbol_part(builder_, level_ + 1);
    result_ = result_ && symbol_2_0_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [QUESTION_MARK]
  private static boolean symbol_2_0_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol_2_0_0_2")) return false;
    consumeToken(builder_, QUESTION_MARK);
    return true;
  }

  /* ********************************************************** */
  // ( global "::" identifier ) | identifier
  public static boolean symbol_part(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol_part")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SYMBOL_PART, "<symbol part>");
    result_ = symbol_part_0(builder_, level_ + 1);
    if (!result_) result_ = identifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // global "::" identifier
  private static boolean symbol_part_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol_part_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, GLOBAL);
    result_ = result_ && consumeToken(builder_, "::");
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '@"' [ (expression COMMA)* ] '"'
  public static boolean template(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TEMPLATE, "<template>");
    result_ = consumeToken(builder_, "@\"");
    result_ = result_ && template_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "\"");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ (expression COMMA)* ]
  private static boolean template_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_1")) return false;
    template_1_0(builder_, level_ + 1);
    return true;
  }

  // (expression COMMA)*
  private static boolean template_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!template_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "template_1_0", pos_)) break;
    }
    return true;
  }

  // expression COMMA
  private static boolean template_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // this
  public static boolean this_access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "this_access")) return false;
    if (!nextTokenIs(builder_, THIS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, THIS);
    exit_section_(builder_, marker_, THIS_ACCESS, result_);
    return result_;
  }

  /* ********************************************************** */
  // throw expression SEMICOLON
  public static boolean throw_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "throw_statement")) return false;
    if (!nextTokenIs(builder_, THROW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, THROW);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, THROW_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // throws (type | type_with_parenthesis) [ (COMMA (type | type_with_parenthesis))* ]
  public static boolean throws_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "throws_statement")) return false;
    if (!nextTokenIs(builder_, THROWS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, THROWS);
    result_ = result_ && throws_statement_1(builder_, level_ + 1);
    result_ = result_ && throws_statement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, THROWS_STATEMENT, result_);
    return result_;
  }

  // type | type_with_parenthesis
  private static boolean throws_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "throws_statement_1")) return false;
    boolean result_;
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  // [ (COMMA (type | type_with_parenthesis))* ]
  private static boolean throws_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "throws_statement_2")) return false;
    throws_statement_2_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA (type | type_with_parenthesis))*
  private static boolean throws_statement_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "throws_statement_2_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!throws_statement_2_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "throws_statement_2_0", pos_)) break;
    }
    return true;
  }

  // COMMA (type | type_with_parenthesis)
  private static boolean throws_statement_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "throws_statement_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && throws_statement_2_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // type | type_with_parenthesis
  private static boolean throws_statement_2_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "throws_statement_2_0_0_1")) return false;
    boolean result_;
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // try block (catch_clauses | finally_clause)
  public static boolean try_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "try_statement")) return false;
    if (!nextTokenIs(builder_, TRY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TRY);
    result_ = result_ && block(builder_, level_ + 1);
    result_ = result_ && try_statement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, TRY_STATEMENT, result_);
    return result_;
  }

  // catch_clauses | finally_clause
  private static boolean try_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "try_statement_2")) return false;
    boolean result_;
    result_ = catch_clauses(builder_, level_ + 1);
    if (!result_) result_ = finally_clause(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // LPAREN expression [ (COMMA expression)* ] RPAREN
  public static boolean tuple(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && tuple_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, TUPLE, result_);
    return result_;
  }

  // [ (COMMA expression)* ]
  private static boolean tuple_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_2")) return false;
    tuple_2_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA expression)*
  private static boolean tuple_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_2_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!tuple_2_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "tuple_2_0", pos_)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean tuple_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( void [ (STAR)* ] [array_type*] ) | ( [ dynamic ] [ unowned | owned ] ['global::'] symbol [ type_arguments ] [ (STAR)* ] [ QUESTION_MARK ] array_type* )
  public static boolean type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE, "<type>");
    result_ = type_0(builder_, level_ + 1);
    if (!result_) result_ = type_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // void [ (STAR)* ] [array_type*]
  private static boolean type_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VOID);
    result_ = result_ && type_0_1(builder_, level_ + 1);
    result_ = result_ && type_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ (STAR)* ]
  private static boolean type_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_0_1")) return false;
    type_0_1_0(builder_, level_ + 1);
    return true;
  }

  // (STAR)*
  private static boolean type_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_0_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, STAR)) break;
      if (!empty_element_parsed_guard_(builder_, "type_0_1_0", pos_)) break;
    }
    return true;
  }

  // [array_type*]
  private static boolean type_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_0_2")) return false;
    type_0_2_0(builder_, level_ + 1);
    return true;
  }

  // array_type*
  private static boolean type_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_0_2_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!array_type(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_0_2_0", pos_)) break;
    }
    return true;
  }

  // [ dynamic ] [ unowned | owned ] ['global::'] symbol [ type_arguments ] [ (STAR)* ] [ QUESTION_MARK ] array_type*
  private static boolean type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_1_0(builder_, level_ + 1);
    result_ = result_ && type_1_1(builder_, level_ + 1);
    result_ = result_ && type_1_2(builder_, level_ + 1);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && type_1_4(builder_, level_ + 1);
    result_ = result_ && type_1_5(builder_, level_ + 1);
    result_ = result_ && type_1_6(builder_, level_ + 1);
    result_ = result_ && type_1_7(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ dynamic ]
  private static boolean type_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1_0")) return false;
    consumeToken(builder_, DYNAMIC);
    return true;
  }

  // [ unowned | owned ]
  private static boolean type_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1_1")) return false;
    type_1_1_0(builder_, level_ + 1);
    return true;
  }

  // unowned | owned
  private static boolean type_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, UNOWNED);
    if (!result_) result_ = consumeToken(builder_, OWNED);
    return result_;
  }

  // ['global::']
  private static boolean type_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1_2")) return false;
    consumeToken(builder_, "global::");
    return true;
  }

  // [ type_arguments ]
  private static boolean type_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1_4")) return false;
    type_arguments(builder_, level_ + 1);
    return true;
  }

  // [ (STAR)* ]
  private static boolean type_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1_5")) return false;
    type_1_5_0(builder_, level_ + 1);
    return true;
  }

  // (STAR)*
  private static boolean type_1_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1_5_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, STAR)) break;
      if (!empty_element_parsed_guard_(builder_, "type_1_5_0", pos_)) break;
    }
    return true;
  }

  // [ QUESTION_MARK ]
  private static boolean type_1_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1_6")) return false;
    consumeToken(builder_, QUESTION_MARK);
    return true;
  }

  // array_type*
  private static boolean type_1_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1_7")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!array_type(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_1_7", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LESS_THAN [ weak ] (type_weak | type_weak_with_parenthesis) [ (COMMA (type_weak | type_weak_with_parenthesis))* ] GREATER_THAN
  public static boolean type_arguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_arguments")) return false;
    if (!nextTokenIs(builder_, LESS_THAN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LESS_THAN);
    result_ = result_ && type_arguments_1(builder_, level_ + 1);
    result_ = result_ && type_arguments_2(builder_, level_ + 1);
    result_ = result_ && type_arguments_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GREATER_THAN);
    exit_section_(builder_, marker_, TYPE_ARGUMENTS, result_);
    return result_;
  }

  // [ weak ]
  private static boolean type_arguments_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_arguments_1")) return false;
    consumeToken(builder_, WEAK);
    return true;
  }

  // type_weak | type_weak_with_parenthesis
  private static boolean type_arguments_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_arguments_2")) return false;
    boolean result_;
    result_ = type_weak(builder_, level_ + 1);
    if (!result_) result_ = type_weak_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  // [ (COMMA (type_weak | type_weak_with_parenthesis))* ]
  private static boolean type_arguments_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_arguments_3")) return false;
    type_arguments_3_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA (type_weak | type_weak_with_parenthesis))*
  private static boolean type_arguments_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_arguments_3_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!type_arguments_3_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_arguments_3_0", pos_)) break;
    }
    return true;
  }

  // COMMA (type_weak | type_weak_with_parenthesis)
  private static boolean type_arguments_3_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_arguments_3_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && type_arguments_3_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // type_weak | type_weak_with_parenthesis
  private static boolean type_arguments_3_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_arguments_3_0_0_1")) return false;
    boolean result_;
    result_ = type_weak(builder_, level_ + 1);
    if (!result_) result_ = type_weak_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // abstract | extern | partial | sealed | static
  public static boolean type_declaration_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_declaration_modifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_DECLARATION_MODIFIER, "<type declaration modifier>");
    result_ = consumeToken(builder_, ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, EXTERN);
    if (!result_) result_ = consumeToken(builder_, PARTIAL);
    if (!result_) result_ = consumeToken(builder_, SEALED);
    if (!result_) result_ = consumeToken(builder_, STATIC);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // type_declaration_modifier [ ( type_declaration_modifier)* ]
  public static boolean type_declaration_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_declaration_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_DECLARATION_MODIFIERS, "<type declaration modifiers>");
    result_ = type_declaration_modifier(builder_, level_ + 1);
    result_ = result_ && type_declaration_modifiers_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ ( type_declaration_modifier)* ]
  private static boolean type_declaration_modifiers_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_declaration_modifiers_1")) return false;
    type_declaration_modifiers_1_0(builder_, level_ + 1);
    return true;
  }

  // ( type_declaration_modifier)*
  private static boolean type_declaration_modifiers_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_declaration_modifiers_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!type_declaration_modifiers_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_declaration_modifiers_1_0", pos_)) break;
    }
    return true;
  }

  // ( type_declaration_modifier)
  private static boolean type_declaration_modifiers_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_declaration_modifiers_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_declaration_modifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LESS_THAN identifier [ (COMMA identifier)* ] GREATER_THAN
  public static boolean type_parameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameters")) return false;
    if (!nextTokenIs(builder_, LESS_THAN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LESS_THAN);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && type_parameters_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GREATER_THAN);
    exit_section_(builder_, marker_, TYPE_PARAMETERS, result_);
    return result_;
  }

  // [ (COMMA identifier)* ]
  private static boolean type_parameters_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameters_2")) return false;
    type_parameters_2_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA identifier)*
  private static boolean type_parameters_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameters_2_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!type_parameters_2_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_parameters_2_0", pos_)) break;
    }
    return true;
  }

  // COMMA identifier
  private static boolean type_parameters_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameters_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( void [ STAR* ] [array_type*]) | ( [ dynamic ] [ unowned | weak | owned ] ['global::'] symbol [ type_arguments ] [ STAR ] [ STAR ] [ QUESTION_MARK ] array_type* )
  public static boolean type_weak(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_WEAK, "<type weak>");
    result_ = type_weak_0(builder_, level_ + 1);
    if (!result_) result_ = type_weak_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // void [ STAR* ] [array_type*]
  private static boolean type_weak_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VOID);
    result_ = result_ && type_weak_0_1(builder_, level_ + 1);
    result_ = result_ && type_weak_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ STAR* ]
  private static boolean type_weak_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_0_1")) return false;
    type_weak_0_1_0(builder_, level_ + 1);
    return true;
  }

  // STAR*
  private static boolean type_weak_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_0_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, STAR)) break;
      if (!empty_element_parsed_guard_(builder_, "type_weak_0_1_0", pos_)) break;
    }
    return true;
  }

  // [array_type*]
  private static boolean type_weak_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_0_2")) return false;
    type_weak_0_2_0(builder_, level_ + 1);
    return true;
  }

  // array_type*
  private static boolean type_weak_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_0_2_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!array_type(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_weak_0_2_0", pos_)) break;
    }
    return true;
  }

  // [ dynamic ] [ unowned | weak | owned ] ['global::'] symbol [ type_arguments ] [ STAR ] [ STAR ] [ QUESTION_MARK ] array_type*
  private static boolean type_weak_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_weak_1_0(builder_, level_ + 1);
    result_ = result_ && type_weak_1_1(builder_, level_ + 1);
    result_ = result_ && type_weak_1_2(builder_, level_ + 1);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && type_weak_1_4(builder_, level_ + 1);
    result_ = result_ && type_weak_1_5(builder_, level_ + 1);
    result_ = result_ && type_weak_1_6(builder_, level_ + 1);
    result_ = result_ && type_weak_1_7(builder_, level_ + 1);
    result_ = result_ && type_weak_1_8(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ dynamic ]
  private static boolean type_weak_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_1_0")) return false;
    consumeToken(builder_, DYNAMIC);
    return true;
  }

  // [ unowned | weak | owned ]
  private static boolean type_weak_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_1_1")) return false;
    type_weak_1_1_0(builder_, level_ + 1);
    return true;
  }

  // unowned | weak | owned
  private static boolean type_weak_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_1_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, UNOWNED);
    if (!result_) result_ = consumeToken(builder_, WEAK);
    if (!result_) result_ = consumeToken(builder_, OWNED);
    return result_;
  }

  // ['global::']
  private static boolean type_weak_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_1_2")) return false;
    consumeToken(builder_, "global::");
    return true;
  }

  // [ type_arguments ]
  private static boolean type_weak_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_1_4")) return false;
    type_arguments(builder_, level_ + 1);
    return true;
  }

  // [ STAR ]
  private static boolean type_weak_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_1_5")) return false;
    consumeToken(builder_, STAR);
    return true;
  }

  // [ STAR ]
  private static boolean type_weak_1_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_1_6")) return false;
    consumeToken(builder_, STAR);
    return true;
  }

  // [ QUESTION_MARK ]
  private static boolean type_weak_1_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_1_7")) return false;
    consumeToken(builder_, QUESTION_MARK);
    return true;
  }

  // array_type*
  private static boolean type_weak_1_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_1_8")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!array_type(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_weak_1_8", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN type_weak RPAREN array_type*
  public static boolean type_weak_with_parenthesis(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_with_parenthesis")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && type_weak(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && type_weak_with_parenthesis_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_WEAK_WITH_PARENTHESIS, result_);
    return result_;
  }

  // array_type*
  private static boolean type_weak_with_parenthesis_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_weak_with_parenthesis_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!array_type(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_weak_with_parenthesis_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN type RPAREN array_type*
  public static boolean type_with_parenthesis(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_with_parenthesis")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && type_with_parenthesis_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_WITH_PARENTHESIS, result_);
    return result_;
  }

  // array_type*
  private static boolean type_with_parenthesis_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_with_parenthesis_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!array_type(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_with_parenthesis_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // typeof LPAREN (type | type_with_parenthesis) RPAREN
  public static boolean typeof_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeof_expression")) return false;
    if (!nextTokenIs(builder_, TYPEOF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, TYPEOF, LPAREN);
    result_ = result_ && typeof_expression_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, TYPEOF_EXPRESSION, result_);
    return result_;
  }

  // type | type_with_parenthesis
  private static boolean typeof_expression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeof_expression_2")) return false;
    boolean result_;
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // ( unary_operator unary_expression ) |
  //                      ( LPAREN ( owned | void | dynamic | EXCLAMATION | (type | type_with_parenthesis) ) [STAR] RPAREN unary_expression ) |
  //                      primary_expression
  public static boolean unary_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, UNARY_EXPRESSION, "<unary expression>");
    result_ = unary_expression_0(builder_, level_ + 1);
    if (!result_) result_ = unary_expression_1(builder_, level_ + 1);
    if (!result_) result_ = primary_expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // unary_operator unary_expression
  private static boolean unary_expression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_expression_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = unary_operator(builder_, level_ + 1);
    result_ = result_ && unary_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LPAREN ( owned | void | dynamic | EXCLAMATION | (type | type_with_parenthesis) ) [STAR] RPAREN unary_expression
  private static boolean unary_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_expression_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && unary_expression_1_1(builder_, level_ + 1);
    result_ = result_ && unary_expression_1_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && unary_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // owned | void | dynamic | EXCLAMATION | (type | type_with_parenthesis)
  private static boolean unary_expression_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_expression_1_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OWNED);
    if (!result_) result_ = consumeToken(builder_, VOID);
    if (!result_) result_ = consumeToken(builder_, DYNAMIC);
    if (!result_) result_ = consumeToken(builder_, EXCLAMATION);
    if (!result_) result_ = unary_expression_1_1_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // type | type_with_parenthesis
  private static boolean unary_expression_1_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_expression_1_1_4")) return false;
    boolean result_;
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = type_with_parenthesis(builder_, level_ + 1);
    return result_;
  }

  // [STAR]
  private static boolean unary_expression_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_expression_1_2")) return false;
    consumeToken(builder_, STAR);
    return true;
  }

  /* ********************************************************** */
  // PLUS | MINUS | EXCLAMATION | TILDE | INCREMENT | DECREMENT | STAR | AND | "(owned)" | "(void)" | "(dynamic)" | "(!)"
  public static boolean unary_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, UNARY_OPERATOR, "<unary operator>");
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, EXCLAMATION);
    if (!result_) result_ = consumeToken(builder_, TILDE);
    if (!result_) result_ = consumeToken(builder_, INCREMENT);
    if (!result_) result_ = consumeToken(builder_, DECREMENT);
    if (!result_) result_ = consumeToken(builder_, STAR);
    if (!result_) result_ = consumeToken(builder_, AND);
    if (!result_) result_ = consumeToken(builder_, "(owned)");
    if (!result_) result_ = consumeToken(builder_, "(void)");
    if (!result_) result_ = consumeToken(builder_, "(dynamic)");
    if (!result_) result_ = consumeToken(builder_, "(!)");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // unlock LPAREN expression RPAREN SEMICOLON
  public static boolean unlock_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unlock_statement")) return false;
    if (!nextTokenIs(builder_, UNLOCK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, UNLOCK, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, SEMICOLON);
    exit_section_(builder_, marker_, UNLOCK_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // symbol
  public static boolean using_directive(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "using_directive")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, USING_DIRECTIVE, "<using directive>");
    result_ = symbol(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // using using_directive [ (COMMA using_directive)* ] SEMICOLON
  public static boolean using_directives(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "using_directives")) return false;
    if (!nextTokenIs(builder_, USING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, USING);
    result_ = result_ && using_directive(builder_, level_ + 1);
    result_ = result_ && using_directives_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    exit_section_(builder_, marker_, USING_DIRECTIVES, result_);
    return result_;
  }

  // [ (COMMA using_directive)* ]
  private static boolean using_directives_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "using_directives_2")) return false;
    using_directives_2_0(builder_, level_ + 1);
    return true;
  }

  // (COMMA using_directive)*
  private static boolean using_directives_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "using_directives_2_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!using_directives_2_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "using_directives_2_0", pos_)) break;
    }
    return true;
  }

  // COMMA using_directive
  private static boolean using_directives_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "using_directives_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && using_directive(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
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
  //                             | yield
  //                             | double
  //                             | int
  //                             | var
  //                             | namespace
  //                             | global ) [QUESTION_MARK]
  public static boolean valid_identifier_keywords(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "valid_identifier_keywords")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VALID_IDENTIFIER_KEYWORDS, "<valid identifier keywords>");
    result_ = valid_identifier_keywords_0(builder_, level_ + 1);
    result_ = result_ && valid_identifier_keywords_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
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
  //                             | yield
  //                             | double
  //                             | int
  //                             | var
  //                             | namespace
  //                             | global
  private static boolean valid_identifier_keywords_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "valid_identifier_keywords_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, ASYNC);
    if (!result_) result_ = consumeToken(builder_, BASE);
    if (!result_) result_ = consumeToken(builder_, BREAK);
    if (!result_) result_ = consumeToken(builder_, CATCH);
    if (!result_) result_ = consumeToken(builder_, CLASS);
    if (!result_) result_ = consumeToken(builder_, CONSTRUCT);
    if (!result_) result_ = consumeToken(builder_, CONTINUE);
    if (!result_) result_ = consumeToken(builder_, DELEGATE);
    if (!result_) result_ = consumeToken(builder_, DELETE);
    if (!result_) result_ = consumeToken(builder_, DYNAMIC);
    if (!result_) result_ = consumeToken(builder_, ENUM);
    if (!result_) result_ = consumeToken(builder_, ENSURES);
    if (!result_) result_ = consumeToken(builder_, ERRORDOMAIN);
    if (!result_) result_ = consumeToken(builder_, EXTERN);
    if (!result_) result_ = consumeToken(builder_, FALSE);
    if (!result_) result_ = consumeToken(builder_, FINALLY);
    if (!result_) result_ = consumeToken(builder_, FOR);
    if (!result_) result_ = consumeToken(builder_, FOREACH);
    if (!result_) result_ = consumeToken(builder_, GET);
    if (!result_) result_ = consumeToken(builder_, IN);
    if (!result_) result_ = consumeToken(builder_, INLINE);
    if (!result_) result_ = consumeToken(builder_, INTERFACE);
    if (!result_) result_ = consumeToken(builder_, IS);
    if (!result_) result_ = consumeToken(builder_, LOCK);
    if (!result_) result_ = consumeToken(builder_, OUT);
    if (!result_) result_ = consumeToken(builder_, OVERRIDE);
    if (!result_) result_ = consumeToken(builder_, OWNED);
    if (!result_) result_ = consumeToken(builder_, PARTIAL);
    if (!result_) result_ = consumeToken(builder_, REF);
    if (!result_) result_ = consumeToken(builder_, REQUIRES);
    if (!result_) result_ = consumeToken(builder_, RETURN);
    if (!result_) result_ = consumeToken(builder_, SEALED);
    if (!result_) result_ = consumeToken(builder_, SET);
    if (!result_) result_ = consumeToken(builder_, SIGNAL);
    if (!result_) result_ = consumeToken(builder_, SIZEOF);
    if (!result_) result_ = consumeToken(builder_, STATIC);
    if (!result_) result_ = consumeToken(builder_, STRUCT);
    if (!result_) result_ = consumeToken(builder_, SWITCH);
    if (!result_) result_ = consumeToken(builder_, TYPEOF);
    if (!result_) result_ = consumeToken(builder_, UNLOCK);
    if (!result_) result_ = consumeToken(builder_, VIRTUAL);
    if (!result_) result_ = consumeToken(builder_, VOLATILE);
    if (!result_) result_ = consumeToken(builder_, NEW);
    if (!result_) result_ = consumeToken(builder_, VOID);
    if (!result_) result_ = consumeToken(builder_, PARAMS);
    if (!result_) result_ = consumeToken(builder_, IF);
    if (!result_) result_ = consumeToken(builder_, WHILE);
    if (!result_) result_ = consumeToken(builder_, DO);
    if (!result_) result_ = consumeToken(builder_, THROW);
    if (!result_) result_ = consumeToken(builder_, TRY);
    if (!result_) result_ = consumeToken(builder_, WITH);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, INTERNAL);
    if (!result_) result_ = consumeToken(builder_, YIELD);
    if (!result_) result_ = consumeToken(builder_, DOUBLE);
    if (!result_) result_ = consumeToken(builder_, INT);
    if (!result_) result_ = consumeToken(builder_, VAR);
    if (!result_) result_ = consumeToken(builder_, NAMESPACE);
    if (!result_) result_ = consumeToken(builder_, GLOBAL);
    return result_;
  }

  // [QUESTION_MARK]
  private static boolean valid_identifier_keywords_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "valid_identifier_keywords_1")) return false;
    consumeToken(builder_, QUESTION_MARK);
    return true;
  }

  /* ********************************************************** */
  // while LPAREN expression RPAREN embedded_statement
  public static boolean while_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "while_statement")) return false;
    if (!nextTokenIs(builder_, WHILE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, WHILE, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && embedded_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, WHILE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // with LPAREN (local_variable_declarations | expression) RPAREN embedded_statement
  public static boolean with_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "with_statement")) return false;
    if (!nextTokenIs(builder_, WITH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, WITH, LPAREN);
    result_ = result_ && with_statement_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && embedded_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, WITH_STATEMENT, result_);
    return result_;
  }

  // local_variable_declarations | expression
  private static boolean with_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "with_statement_2")) return false;
    boolean result_;
    result_ = local_variable_declarations(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // yield [new] [ base_access DOT ] member [ (member_access | method_call)* ]
  public static boolean yield_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_expression")) return false;
    if (!nextTokenIs(builder_, YIELD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YIELD);
    result_ = result_ && yield_expression_1(builder_, level_ + 1);
    result_ = result_ && yield_expression_2(builder_, level_ + 1);
    result_ = result_ && member(builder_, level_ + 1);
    result_ = result_ && yield_expression_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, YIELD_EXPRESSION, result_);
    return result_;
  }

  // [new]
  private static boolean yield_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_expression_1")) return false;
    consumeToken(builder_, NEW);
    return true;
  }

  // [ base_access DOT ]
  private static boolean yield_expression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_expression_2")) return false;
    yield_expression_2_0(builder_, level_ + 1);
    return true;
  }

  // base_access DOT
  private static boolean yield_expression_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_expression_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = base_access(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ (member_access | method_call)* ]
  private static boolean yield_expression_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_expression_4")) return false;
    yield_expression_4_0(builder_, level_ + 1);
    return true;
  }

  // (member_access | method_call)*
  private static boolean yield_expression_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_expression_4_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!yield_expression_4_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "yield_expression_4_0", pos_)) break;
    }
    return true;
  }

  // member_access | method_call
  private static boolean yield_expression_4_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_expression_4_0_0")) return false;
    boolean result_;
    result_ = member_access(builder_, level_ + 1);
    if (!result_) result_ = method_call(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // yield SEMICOLON | yield_expression [SEMICOLON]
  public static boolean yield_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_statement")) return false;
    if (!nextTokenIs(builder_, YIELD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parseTokens(builder_, 0, YIELD, SEMICOLON);
    if (!result_) result_ = yield_statement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, YIELD_STATEMENT, result_);
    return result_;
  }

  // yield_expression [SEMICOLON]
  private static boolean yield_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_statement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = yield_expression(builder_, level_ + 1);
    result_ = result_ && yield_statement_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [SEMICOLON]
  private static boolean yield_statement_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "yield_statement_1_1")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

}
