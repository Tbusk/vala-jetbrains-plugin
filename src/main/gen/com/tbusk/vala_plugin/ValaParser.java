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
    return valaFile(b, l + 1);
  }

  /* ********************************************************** */
  // qualifiedName (',' qualifiedName)*
  public static boolean base_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName(b, l + 1);
    r = r && base_list_1(b, l + 1);
    exit_section_(b, m, BASE_LIST, r);
    return r;
  }

  // (',' qualifiedName)*
  private static boolean base_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!base_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "base_list_1", c)) break;
    }
    return true;
  }

  // ',' qualifiedName
  private static boolean base_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && qualifiedName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // modifier* 'class' IDENTIFIER type_parameters? (':' base_list)? '{' class_member* '}'
  public static boolean class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = class_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, CLASS, IDENTIFIER);
    r = r && class_declaration_3(b, l + 1);
    r = r && class_declaration_4(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && class_declaration_6(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean class_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_declaration_0", c)) break;
    }
    return true;
  }

  // type_parameters?
  private static boolean class_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_3")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // (':' base_list)?
  private static boolean class_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_4")) return false;
    class_declaration_4_0(b, l + 1);
    return true;
  }

  // ':' base_list
  private static boolean class_declaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && base_list(b, l + 1);
    exit_section_(b, m, null, r);
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
  // modifier* (function_declaration | variable_declaration | property_declaration)
  public static boolean class_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_MEMBER, "<class member>");
    r = class_member_0(b, l + 1);
    r = r && class_member_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean class_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_member_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_member_0", c)) break;
    }
    return true;
  }

  // function_declaration | variable_declaration | property_declaration
  private static boolean class_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_member_1")) return false;
    boolean r;
    r = function_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = property_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // class_declaration | interface_declaration | struct_declaration | enum_declaration | delegate_declaration
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = class_declaration(b, l + 1);
    if (!r) r = interface_declaration(b, l + 1);
    if (!r) r = struct_declaration(b, l + 1);
    if (!r) r = enum_declaration(b, l + 1);
    if (!r) r = delegate_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // modifier* 'delegate' IDENTIFIER '(' parameter_list ')' (':' base_list)? '{' delegate_member* '}'
  public static boolean delegate_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELEGATE_DECLARATION, "<delegate declaration>");
    r = delegate_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, DELEGATE, IDENTIFIER, LPAREN);
    r = r && parameter_list(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && delegate_declaration_6(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && delegate_declaration_8(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean delegate_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "delegate_declaration_0", c)) break;
    }
    return true;
  }

  // (':' base_list)?
  private static boolean delegate_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_6")) return false;
    delegate_declaration_6_0(b, l + 1);
    return true;
  }

  // ':' base_list
  private static boolean delegate_declaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && base_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // delegate_member*
  private static boolean delegate_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!delegate_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "delegate_declaration_8", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifier* (function_declaration | variable_declaration | property_declaration)
  public static boolean delegate_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELEGATE_MEMBER, "<delegate member>");
    r = delegate_member_0(b, l + 1);
    r = r && delegate_member_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean delegate_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_member_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "delegate_member_0", c)) break;
    }
    return true;
  }

  // function_declaration | variable_declaration | property_declaration
  private static boolean delegate_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_member_1")) return false;
    boolean r;
    r = function_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = property_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // modifier* 'enum' IDENTIFIER '{' enum_member* '}'
  public static boolean enum_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DECLARATION, "<enum declaration>");
    r = enum_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, ENUM, IDENTIFIER, LBRACE);
    r = r && enum_declaration_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean enum_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_declaration_0", c)) break;
    }
    return true;
  }

  // enum_member*
  private static boolean enum_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_declaration_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER '=' INTEGER_LITERAL
  public static boolean enum_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EQUALS, INTEGER_LITERAL);
    exit_section_(b, m, ENUM_MEMBER, r);
    return r;
  }

  /* ********************************************************** */
  // (statement | expression)*
  public static boolean function_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY, "<function body>");
    while (true) {
      int c = current_position_(b);
      if (!function_body_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_body", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // statement | expression
  private static boolean function_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_body_0")) return false;
    boolean r;
    r = consumeToken(b, STATEMENT);
    if (!r) r = consumeToken(b, EXPRESSION);
    return r;
  }

  /* ********************************************************** */
  // modifier* IDENTIFIER '(' parameter_list ')' (':' type)? '{' function_body '}'
  public static boolean function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    r = function_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, LPAREN);
    r = r && parameter_list(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && function_declaration_5(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && function_body(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean function_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_declaration_0", c)) break;
    }
    return true;
  }

  // (':' type)?
  private static boolean function_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_5")) return false;
    function_declaration_5_0(b, l + 1);
    return true;
  }

  // ':' type
  private static boolean function_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // modifier* 'interface' IDENTIFIER type_parameters? (':' base_list)? '{' interface_member* '}'
  public static boolean interface_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_DECLARATION, "<interface declaration>");
    r = interface_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, INTERFACE, IDENTIFIER);
    r = r && interface_declaration_3(b, l + 1);
    r = r && interface_declaration_4(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && interface_declaration_6(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean interface_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_declaration_0", c)) break;
    }
    return true;
  }

  // type_parameters?
  private static boolean interface_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_3")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // (':' base_list)?
  private static boolean interface_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_4")) return false;
    interface_declaration_4_0(b, l + 1);
    return true;
  }

  // ':' base_list
  private static boolean interface_declaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && base_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // interface_member*
  private static boolean interface_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_declaration_6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifier* (function_declaration | variable_declaration | property_declaration)
  public static boolean interface_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_MEMBER, "<interface member>");
    r = interface_member_0(b, l + 1);
    r = r && interface_member_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean interface_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_member_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_member_0", c)) break;
    }
    return true;
  }

  // function_declaration | variable_declaration | property_declaration
  private static boolean interface_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_member_1")) return false;
    boolean r;
    r = function_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = property_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'public' | 'private' | 'unowned' | 'protected' | 'internal' | 'static' | 'virtual' | 'abstract' | 'override'
  public static boolean modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODIFIER, "<modifier>");
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, PRIVATE);
    if (!r) r = consumeToken(b, UNOWNED);
    if (!r) r = consumeToken(b, PROTECTED);
    if (!r) r = consumeToken(b, INTERNAL);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, VIRTUAL);
    if (!r) r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, OVERRIDE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'namespace' qualifiedName '{' declaration* '}'
  public static boolean namespace_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAMESPACE);
    r = r && qualifiedName(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && namespace_declaration_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, NAMESPACE_DECLARATION, r);
    return r;
  }

  // declaration*
  private static boolean namespace_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_declaration_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER (':' type)?
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && parameter_1(b, l + 1);
    exit_section_(b, m, PARAMETER, r);
    return r;
  }

  // (':' type)?
  private static boolean parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1")) return false;
    parameter_1_0(b, l + 1);
    return true;
  }

  // ':' type
  private static boolean parameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // parameter (',' parameter)*
  public static boolean parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter(b, l + 1);
    r = r && parameter_list_1(b, l + 1);
    exit_section_(b, m, PARAMETER_LIST, r);
    return r;
  }

  // (',' parameter)*
  private static boolean parameter_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameter_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameter_list_1", c)) break;
    }
    return true;
  }

  // ',' parameter
  private static boolean parameter_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (':' type)? '=' expression ';'
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && property_1(b, l + 1);
    r = r && consumeTokens(b, 0, EQUALS, EXPRESSION, SEMICOLON);
    exit_section_(b, m, PROPERTY, r);
    return r;
  }

  // (':' type)?
  private static boolean property_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_1")) return false;
    property_1_0(b, l + 1);
    return true;
  }

  // ':' type
  private static boolean property_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // modifier* IDENTIFIER (':' type)? '=' expression ';'
  public static boolean property_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_DECLARATION, "<property declaration>");
    r = property_declaration_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && property_declaration_2(b, l + 1);
    r = r && consumeTokens(b, 0, EQUALS, EXPRESSION, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean property_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "property_declaration_0", c)) break;
    }
    return true;
  }

  // (':' type)?
  private static boolean property_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_2")) return false;
    property_declaration_2_0(b, l + 1);
    return true;
  }

  // ':' type
  private static boolean property_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ('.' IDENTIFIER)*
  public static boolean qualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && qualifiedName_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_NAME, r);
    return r;
  }

  // ('.' IDENTIFIER)*
  private static boolean qualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qualifiedName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_1", c)) break;
    }
    return true;
  }

  // '.' IDENTIFIER
  private static boolean qualifiedName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // modifier* 'struct' IDENTIFIER type_parameters? (':' base_list)? '{' struct_member* '}'
  public static boolean struct_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECLARATION, "<struct declaration>");
    r = struct_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, STRUCT, IDENTIFIER);
    r = r && struct_declaration_3(b, l + 1);
    r = r && struct_declaration_4(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && struct_declaration_6(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean struct_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_declaration_0", c)) break;
    }
    return true;
  }

  // type_parameters?
  private static boolean struct_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_3")) return false;
    type_parameters(b, l + 1);
    return true;
  }

  // (':' base_list)?
  private static boolean struct_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_4")) return false;
    struct_declaration_4_0(b, l + 1);
    return true;
  }

  // ':' base_list
  private static boolean struct_declaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && base_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // struct_member*
  private static boolean struct_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!struct_member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_declaration_6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifier* (function_declaration | variable_declaration | property_declaration)
  public static boolean struct_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_MEMBER, "<struct member>");
    r = struct_member_0(b, l + 1);
    r = r && struct_member_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean struct_member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_member_0", c)) break;
    }
    return true;
  }

  // function_declaration | variable_declaration | property_declaration
  private static boolean struct_member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member_1")) return false;
    boolean r;
    r = function_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = property_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | qualifiedName | 'void' | 'int' | 'float' | 'string' | 'char' | 'bool'
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = qualifiedName(b, l + 1);
    if (!r) r = consumeToken(b, VOID);
    if (!r) r = consumeToken(b, "int");
    if (!r) r = consumeToken(b, "float");
    if (!r) r = consumeToken(b, "string");
    if (!r) r = consumeToken(b, "char");
    if (!r) r = consumeToken(b, "bool");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<' type (',' type)* '>'
  public static boolean type_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters")) return false;
    if (!nextTokenIs(b, LESS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS);
    r = r && type(b, l + 1);
    r = r && type_parameters_2(b, l + 1);
    r = r && consumeToken(b, GREATER);
    exit_section_(b, m, TYPE_PARAMETERS, r);
    return r;
  }

  // (',' type)*
  private static boolean type_parameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_parameters_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_parameters_2", c)) break;
    }
    return true;
  }

  // ',' type
  private static boolean type_parameters_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // namespace_declaration*
  static boolean valaFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valaFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!namespace_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valaFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // modifier* IDENTIFIER (':' type)? '=' expression ';'
  public static boolean variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = variable_declaration_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && variable_declaration_2(b, l + 1);
    r = r && consumeTokens(b, 0, EQUALS, EXPRESSION, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifier*
  private static boolean variable_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variable_declaration_0", c)) break;
    }
    return true;
  }

  // (':' type)?
  private static boolean variable_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_2")) return false;
    variable_declaration_2_0(b, l + 1);
    return true;
  }

  // ':' type
  private static boolean variable_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
