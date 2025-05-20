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
  // public | private | protected
  static boolean AccessModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AccessModifier")) return false;
    boolean r;
    r = consumeToken(b, PUBLIC);
    if (!r) r = consumeToken(b, PRIVATE);
    if (!r) r = consumeToken(b, PROTECTED);
    return r;
  }

  /* ********************************************************** */
  // assert LPAREN MethodCall RPAREN SEMICOLON
  static boolean Assertion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Assertion")) return false;
    if (!nextTokenIs(b, ASSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASSERT, LPAREN);
    r = r && MethodCall(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // true | false
  static boolean BooleanValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanValue")) return false;
    if (!nextTokenIs(b, "", FALSE, TRUE)) return false;
    boolean r;
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    return r;
  }

  /* ********************************************************** */
  // COLON QualifiedName Type? (COMMA QualifiedName Type?)*
  static boolean ClassAndOrInterfaceImplementation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassAndOrInterfaceImplementation")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && QualifiedName(b, l + 1);
    r = r && ClassAndOrInterfaceImplementation_2(b, l + 1);
    r = r && ClassAndOrInterfaceImplementation_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type?
  private static boolean ClassAndOrInterfaceImplementation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassAndOrInterfaceImplementation_2")) return false;
    Type(b, l + 1);
    return true;
  }

  // (COMMA QualifiedName Type?)*
  private static boolean ClassAndOrInterfaceImplementation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassAndOrInterfaceImplementation_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ClassAndOrInterfaceImplementation_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassAndOrInterfaceImplementation_3", c)) break;
    }
    return true;
  }

  // COMMA QualifiedName Type?
  private static boolean ClassAndOrInterfaceImplementation_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassAndOrInterfaceImplementation_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && QualifiedName(b, l + 1);
    r = r && ClassAndOrInterfaceImplementation_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type?
  private static boolean ClassAndOrInterfaceImplementation_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassAndOrInterfaceImplementation_3_0_2")) return false;
    Type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AccessModifier? ClassModifier class QualifiedName Type? ClassAndOrInterfaceImplementation? LBRACE Definition* RBRACE
  static boolean ClassDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassDeclaration_0(b, l + 1);
    r = r && ClassModifier(b, l + 1);
    r = r && consumeToken(b, CLASS);
    r = r && QualifiedName(b, l + 1);
    r = r && ClassDeclaration_4(b, l + 1);
    r = r && ClassDeclaration_5(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && ClassDeclaration_7(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifier?
  private static boolean ClassDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_0")) return false;
    AccessModifier(b, l + 1);
    return true;
  }

  // Type?
  private static boolean ClassDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_4")) return false;
    Type(b, l + 1);
    return true;
  }

  // ClassAndOrInterfaceImplementation?
  private static boolean ClassDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_5")) return false;
    ClassAndOrInterfaceImplementation(b, l + 1);
    return true;
  }

  // Definition*
  private static boolean ClassDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassDeclaration_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // abstract? final? virtual?
  static boolean ClassModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassModifier")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassModifier_0(b, l + 1);
    r = r && ClassModifier_1(b, l + 1);
    r = r && ClassModifier_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // abstract?
  private static boolean ClassModifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassModifier_0")) return false;
    consumeToken(b, ABSTRACT);
    return true;
  }

  // final?
  private static boolean ClassModifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassModifier_1")) return false;
    consumeToken(b, FINAL);
    return true;
  }

  // virtual?
  private static boolean ClassModifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassModifier_2")) return false;
    consumeToken(b, VIRTUAL);
    return true;
  }

  /* ********************************************************** */
  // COMMENT | BLOCK_COMMENT | DOC_COMMENT
  static boolean Comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Comment")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, BLOCK_COMMENT);
    if (!r) r = consumeToken(b, DOC_COMMENT);
    return r;
  }

  /* ********************************************************** */
  // Using | Namespace | VariableDefinition | ClassDeclaration | EnumDeclaration | MethodDeclaration | InterfaceDeclaration | MethodCall | VariableReassignment | IfBlock | Comment | Assertion
  public static boolean Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION, "<definition>");
    r = Using(b, l + 1);
    if (!r) r = Namespace(b, l + 1);
    if (!r) r = VariableDefinition(b, l + 1);
    if (!r) r = ClassDeclaration(b, l + 1);
    if (!r) r = EnumDeclaration(b, l + 1);
    if (!r) r = MethodDeclaration(b, l + 1);
    if (!r) r = InterfaceDeclaration(b, l + 1);
    if (!r) r = MethodCall(b, l + 1);
    if (!r) r = VariableReassignment(b, l + 1);
    if (!r) r = IfBlock(b, l + 1);
    if (!r) r = Comment(b, l + 1);
    if (!r) r = Assertion(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // else if LPAREN MethodCall RPAREN LBRACE MethodBody* RBRACE
  static boolean ElseIfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, IF, LPAREN);
    r = r && MethodCall(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LBRACE);
    r = r && ElseIfStatement_6(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // MethodBody*
  private static boolean ElseIfStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ElseIfStatement_6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // else LBRACE MethodBody* RBRACE
  static boolean ElseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, LBRACE);
    r = r && ElseStatement_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // MethodBody*
  private static boolean ElseStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ElseStatement_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AccessModifier? enum IDENTIFIER LBRACE EnumMember* RBRACE
  static boolean EnumDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnumDeclaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, ENUM, IDENTIFIER, LBRACE);
    r = r && EnumDeclaration_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifier?
  private static boolean EnumDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_0")) return false;
    AccessModifier(b, l + 1);
    return true;
  }

  // EnumMember*
  private static boolean EnumDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EnumMember(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumDeclaration_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER (COMMA IDENTIFIER)* SEMICOLON
  static boolean EnumMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMember")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && EnumMember_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA IDENTIFIER)*
  private static boolean EnumMember_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMember_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EnumMember_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumMember_1", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean EnumMember_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumMember_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IfStatement ElseIfStatement* ElseStatement?
  static boolean IfBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfBlock")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfStatement(b, l + 1);
    r = r && IfBlock_1(b, l + 1);
    r = r && IfBlock_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ElseIfStatement*
  private static boolean IfBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfBlock_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ElseIfStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfBlock_1", c)) break;
    }
    return true;
  }

  // ElseStatement?
  private static boolean IfBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfBlock_2")) return false;
    ElseStatement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // if LPAREN MethodCall RPAREN LBRACE MethodBody* RBRACE
  static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LPAREN);
    r = r && MethodCall(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LBRACE);
    r = r && IfStatement_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // MethodBody*
  private static boolean IfStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfStatement_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // InterfaceMethodDeclaration
  static boolean InterfaceBody(PsiBuilder b, int l) {
    return InterfaceMethodDeclaration(b, l + 1);
  }

  /* ********************************************************** */
  // AccessModifier? interface QualifiedName ClassAndOrInterfaceImplementation? LBRACE InterfaceBody* RBRACE
  static boolean InterfaceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InterfaceDeclaration_0(b, l + 1);
    r = r && consumeToken(b, INTERFACE);
    r = r && QualifiedName(b, l + 1);
    r = r && InterfaceDeclaration_3(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && InterfaceDeclaration_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifier?
  private static boolean InterfaceDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_0")) return false;
    AccessModifier(b, l + 1);
    return true;
  }

  // ClassAndOrInterfaceImplementation?
  private static boolean InterfaceDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_3")) return false;
    ClassAndOrInterfaceImplementation(b, l + 1);
    return true;
  }

  // InterfaceBody*
  private static boolean InterfaceDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!InterfaceBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterfaceDeclaration_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AccessModifier? abstract virtual? MethodReturnType IDENTIFIER LPAREN MethodParameter* RPAREN (SEMICOLON | LBRACE MethodBody* RBRACE)
  static boolean InterfaceMethodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceMethodDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InterfaceMethodDeclaration_0(b, l + 1);
    r = r && consumeToken(b, ABSTRACT);
    r = r && InterfaceMethodDeclaration_2(b, l + 1);
    r = r && MethodReturnType(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, LPAREN);
    r = r && InterfaceMethodDeclaration_6(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && InterfaceMethodDeclaration_8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifier?
  private static boolean InterfaceMethodDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceMethodDeclaration_0")) return false;
    AccessModifier(b, l + 1);
    return true;
  }

  // virtual?
  private static boolean InterfaceMethodDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceMethodDeclaration_2")) return false;
    consumeToken(b, VIRTUAL);
    return true;
  }

  // MethodParameter*
  private static boolean InterfaceMethodDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceMethodDeclaration_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodParameter(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterfaceMethodDeclaration_6", c)) break;
    }
    return true;
  }

  // SEMICOLON | LBRACE MethodBody* RBRACE
  private static boolean InterfaceMethodDeclaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceMethodDeclaration_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    if (!r) r = InterfaceMethodDeclaration_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE MethodBody* RBRACE
  private static boolean InterfaceMethodDeclaration_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceMethodDeclaration_8_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && InterfaceMethodDeclaration_8_1_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // MethodBody*
  private static boolean InterfaceMethodDeclaration_8_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceMethodDeclaration_8_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterfaceMethodDeclaration_8_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // StringWithConcatenation | NumberOperation | BooleanValue | this | MethodCall | QualifiedName
  static boolean MethodArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodArgument")) return false;
    boolean r;
    r = StringWithConcatenation(b, l + 1);
    if (!r) r = NumberOperation(b, l + 1);
    if (!r) r = BooleanValue(b, l + 1);
    if (!r) r = consumeToken(b, THIS);
    if (!r) r = MethodCall(b, l + 1);
    if (!r) r = QualifiedName(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // VariableDefinition | ClassDeclaration | EnumDeclaration | MethodDeclaration | InterfaceDeclaration | MethodCall | ShorthandMethodDeclaration | return (MethodCall |(QualifiedName | StringWithConcatenation | NumberOperation | BooleanValue) SEMICOLON) | VariableReassignment | IfBlock | Assertion | Comment
  static boolean MethodBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodBody")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDefinition(b, l + 1);
    if (!r) r = ClassDeclaration(b, l + 1);
    if (!r) r = EnumDeclaration(b, l + 1);
    if (!r) r = MethodDeclaration(b, l + 1);
    if (!r) r = InterfaceDeclaration(b, l + 1);
    if (!r) r = MethodCall(b, l + 1);
    if (!r) r = ShorthandMethodDeclaration(b, l + 1);
    if (!r) r = MethodBody_7(b, l + 1);
    if (!r) r = VariableReassignment(b, l + 1);
    if (!r) r = IfBlock(b, l + 1);
    if (!r) r = Assertion(b, l + 1);
    if (!r) r = Comment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // return (MethodCall |(QualifiedName | StringWithConcatenation | NumberOperation | BooleanValue) SEMICOLON)
  private static boolean MethodBody_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodBody_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && MethodBody_7_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MethodCall |(QualifiedName | StringWithConcatenation | NumberOperation | BooleanValue) SEMICOLON
  private static boolean MethodBody_7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodBody_7_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodCall(b, l + 1);
    if (!r) r = MethodBody_7_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (QualifiedName | StringWithConcatenation | NumberOperation | BooleanValue) SEMICOLON
  private static boolean MethodBody_7_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodBody_7_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodBody_7_1_1_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // QualifiedName | StringWithConcatenation | NumberOperation | BooleanValue
  private static boolean MethodBody_7_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodBody_7_1_1_0")) return false;
    boolean r;
    r = QualifiedName(b, l + 1);
    if (!r) r = StringWithConcatenation(b, l + 1);
    if (!r) r = NumberOperation(b, l + 1);
    if (!r) r = BooleanValue(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // QualifiedName (LPAREN RPAREN | LPAREN (MethodArgument (COMMA MethodArgument)*) RPAREN) SEMICOLON
  static boolean MethodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedName(b, l + 1);
    r = r && MethodCall_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN RPAREN | LPAREN (MethodArgument (COMMA MethodArgument)*) RPAREN
  private static boolean MethodCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, LPAREN, RPAREN);
    if (!r) r = MethodCall_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN (MethodArgument (COMMA MethodArgument)*) RPAREN
  private static boolean MethodCall_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && MethodCall_1_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // MethodArgument (COMMA MethodArgument)*
  private static boolean MethodCall_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodArgument(b, l + 1);
    r = r && MethodCall_1_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA MethodArgument)*
  private static boolean MethodCall_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall_1_1_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodCall_1_1_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodCall_1_1_1_1", c)) break;
    }
    return true;
  }

  // COMMA MethodArgument
  private static boolean MethodCall_1_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall_1_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && MethodArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AccessModifier? MethodModifier? MethodReturnType Type? QualifiedName Type? (LPAREN MethodParameter* RPAREN)? LBRACE MethodBody* RBRACE
  static boolean MethodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodDeclaration_0(b, l + 1);
    r = r && MethodDeclaration_1(b, l + 1);
    r = r && MethodReturnType(b, l + 1);
    r = r && MethodDeclaration_3(b, l + 1);
    r = r && QualifiedName(b, l + 1);
    r = r && MethodDeclaration_5(b, l + 1);
    r = r && MethodDeclaration_6(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && MethodDeclaration_8(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifier?
  private static boolean MethodDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDeclaration_0")) return false;
    AccessModifier(b, l + 1);
    return true;
  }

  // MethodModifier?
  private static boolean MethodDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDeclaration_1")) return false;
    MethodModifier(b, l + 1);
    return true;
  }

  // Type?
  private static boolean MethodDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDeclaration_3")) return false;
    Type(b, l + 1);
    return true;
  }

  // Type?
  private static boolean MethodDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDeclaration_5")) return false;
    Type(b, l + 1);
    return true;
  }

  // (LPAREN MethodParameter* RPAREN)?
  private static boolean MethodDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDeclaration_6")) return false;
    MethodDeclaration_6_0(b, l + 1);
    return true;
  }

  // LPAREN MethodParameter* RPAREN
  private static boolean MethodDeclaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDeclaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && MethodDeclaration_6_0_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // MethodParameter*
  private static boolean MethodDeclaration_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDeclaration_6_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodParameter(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodDeclaration_6_0_1", c)) break;
    }
    return true;
  }

  // MethodBody*
  private static boolean MethodDeclaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDeclaration_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodDeclaration_8", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // static? virtual? async? unowned? override?
  static boolean MethodModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodModifier")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodModifier_0(b, l + 1);
    r = r && MethodModifier_1(b, l + 1);
    r = r && MethodModifier_2(b, l + 1);
    r = r && MethodModifier_3(b, l + 1);
    r = r && MethodModifier_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // static?
  private static boolean MethodModifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodModifier_0")) return false;
    consumeToken(b, STATIC);
    return true;
  }

  // virtual?
  private static boolean MethodModifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodModifier_1")) return false;
    consumeToken(b, VIRTUAL);
    return true;
  }

  // async?
  private static boolean MethodModifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodModifier_2")) return false;
    consumeToken(b, ASYNC);
    return true;
  }

  // unowned?
  private static boolean MethodModifier_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodModifier_3")) return false;
    consumeToken(b, UNOWNED);
    return true;
  }

  // override?
  private static boolean MethodModifier_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodModifier_4")) return false;
    consumeToken(b, OVERRIDE);
    return true;
  }

  /* ********************************************************** */
  // VariableType QualifiedName (COMMA VariableType QualifiedName)*
  static boolean MethodParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodParameter")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableType(b, l + 1);
    r = r && QualifiedName(b, l + 1);
    r = r && MethodParameter_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA VariableType QualifiedName)*
  private static boolean MethodParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodParameter_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodParameter_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodParameter_2", c)) break;
    }
    return true;
  }

  // COMMA VariableType QualifiedName
  private static boolean MethodParameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodParameter_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && VariableType(b, l + 1);
    r = r && QualifiedName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableType | void | null | BooleanValue
  static boolean MethodReturnType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodReturnType")) return false;
    boolean r;
    r = VariableType(b, l + 1);
    if (!r) r = consumeToken(b, VOID);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = BooleanValue(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // namespace IDENTIFIER LBRACE NamespaceBody* RBRACE
  static boolean Namespace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Namespace")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NAMESPACE, IDENTIFIER, LBRACE);
    r = r && Namespace_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // NamespaceBody*
  private static boolean Namespace_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Namespace_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NamespaceBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Namespace_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // VariableDefinition | ClassDeclaration | EnumDeclaration | MethodDeclaration | InterfaceDeclaration | MethodCall | VariableReassignment | IfBlock | Assertion | Comment
  static boolean NamespaceBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceBody")) return false;
    boolean r;
    r = VariableDefinition(b, l + 1);
    if (!r) r = ClassDeclaration(b, l + 1);
    if (!r) r = EnumDeclaration(b, l + 1);
    if (!r) r = MethodDeclaration(b, l + 1);
    if (!r) r = InterfaceDeclaration(b, l + 1);
    if (!r) r = MethodCall(b, l + 1);
    if (!r) r = VariableReassignment(b, l + 1);
    if (!r) r = IfBlock(b, l + 1);
    if (!r) r = Assertion(b, l + 1);
    if (!r) r = Comment(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LPAREN? NUMBER (LPAREN? (PLUS | MINUS | STAR | DIVIDE | MODULO) NUMBER RPAREN?)* RPAREN?
  static boolean NumberOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberOperation")) return false;
    if (!nextTokenIs(b, "", LPAREN, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NumberOperation_0(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    r = r && NumberOperation_2(b, l + 1);
    r = r && NumberOperation_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN?
  private static boolean NumberOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberOperation_0")) return false;
    consumeToken(b, LPAREN);
    return true;
  }

  // (LPAREN? (PLUS | MINUS | STAR | DIVIDE | MODULO) NUMBER RPAREN?)*
  private static boolean NumberOperation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberOperation_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NumberOperation_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NumberOperation_2", c)) break;
    }
    return true;
  }

  // LPAREN? (PLUS | MINUS | STAR | DIVIDE | MODULO) NUMBER RPAREN?
  private static boolean NumberOperation_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberOperation_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NumberOperation_2_0_0(b, l + 1);
    r = r && NumberOperation_2_0_1(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    r = r && NumberOperation_2_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN?
  private static boolean NumberOperation_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberOperation_2_0_0")) return false;
    consumeToken(b, LPAREN);
    return true;
  }

  // PLUS | MINUS | STAR | DIVIDE | MODULO
  private static boolean NumberOperation_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberOperation_2_0_1")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, DIVIDE);
    if (!r) r = consumeToken(b, MODULO);
    return r;
  }

  // RPAREN?
  private static boolean NumberOperation_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberOperation_2_0_3")) return false;
    consumeToken(b, RPAREN);
    return true;
  }

  // RPAREN?
  private static boolean NumberOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberOperation_3")) return false;
    consumeToken(b, RPAREN);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER (DOT IDENTIFIER)*
  static boolean QualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && QualifiedName_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOT IDENTIFIER)*
  private static boolean QualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedName_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!QualifiedName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QualifiedName_1", c)) break;
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean QualifiedName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Definition*
  static boolean Root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Root", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AccessModifier? (get | set | init) SEMICOLON
  static boolean ShorthandMethodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShorthandMethodDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShorthandMethodDeclaration_0(b, l + 1);
    r = r && ShorthandMethodDeclaration_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifier?
  private static boolean ShorthandMethodDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShorthandMethodDeclaration_0")) return false;
    AccessModifier(b, l + 1);
    return true;
  }

  // get | set | init
  private static boolean ShorthandMethodDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShorthandMethodDeclaration_1")) return false;
    boolean r;
    r = consumeToken(b, GET);
    if (!r) r = consumeToken(b, SET);
    if (!r) r = consumeToken(b, INIT);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL (PLUS STRING_LITERAL)*
  static boolean StringWithConcatenation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringWithConcatenation")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    r = r && StringWithConcatenation_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (PLUS STRING_LITERAL)*
  private static boolean StringWithConcatenation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringWithConcatenation_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!StringWithConcatenation_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StringWithConcatenation_1", c)) break;
    }
    return true;
  }

  // PLUS STRING_LITERAL
  private static boolean StringWithConcatenation_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringWithConcatenation_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PLUS, STRING_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LESS_THAN QualifiedName (COMMA QualifiedName)* GREATER_THAN
  static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    if (!nextTokenIs(b, LESS_THAN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS_THAN);
    r = r && QualifiedName(b, l + 1);
    r = r && Type_2(b, l + 1);
    r = r && consumeToken(b, GREATER_THAN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA QualifiedName)*
  private static boolean Type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Type_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Type_2", c)) break;
    }
    return true;
  }

  // COMMA QualifiedName
  private static boolean Type_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && QualifiedName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // using QualifiedName SEMICOLON
  static boolean Using(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Using")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USING);
    r = r && QualifiedName(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AccessModifier? const? (VariableType | var | QualifiedName) IDENTIFIER (SEMICOLON | (EQUALS ((StringWithConcatenation | NumberOperation | null) SEMICOLON | MethodCall | LBRACE MethodBody* RBRACE)))
  static boolean VariableDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDefinition_0(b, l + 1);
    r = r && VariableDefinition_1(b, l + 1);
    r = r && VariableDefinition_2(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && VariableDefinition_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifier?
  private static boolean VariableDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_0")) return false;
    AccessModifier(b, l + 1);
    return true;
  }

  // const?
  private static boolean VariableDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_1")) return false;
    consumeToken(b, CONST);
    return true;
  }

  // VariableType | var | QualifiedName
  private static boolean VariableDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_2")) return false;
    boolean r;
    r = VariableType(b, l + 1);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = QualifiedName(b, l + 1);
    return r;
  }

  // SEMICOLON | (EQUALS ((StringWithConcatenation | NumberOperation | null) SEMICOLON | MethodCall | LBRACE MethodBody* RBRACE))
  private static boolean VariableDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    if (!r) r = VariableDefinition_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUALS ((StringWithConcatenation | NumberOperation | null) SEMICOLON | MethodCall | LBRACE MethodBody* RBRACE)
  private static boolean VariableDefinition_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && VariableDefinition_4_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (StringWithConcatenation | NumberOperation | null) SEMICOLON | MethodCall | LBRACE MethodBody* RBRACE
  private static boolean VariableDefinition_4_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_4_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDefinition_4_1_1_0(b, l + 1);
    if (!r) r = MethodCall(b, l + 1);
    if (!r) r = VariableDefinition_4_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (StringWithConcatenation | NumberOperation | null) SEMICOLON
  private static boolean VariableDefinition_4_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_4_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDefinition_4_1_1_0_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // StringWithConcatenation | NumberOperation | null
  private static boolean VariableDefinition_4_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_4_1_1_0_0")) return false;
    boolean r;
    r = StringWithConcatenation(b, l + 1);
    if (!r) r = NumberOperation(b, l + 1);
    if (!r) r = consumeToken(b, NULL);
    return r;
  }

  // LBRACE MethodBody* RBRACE
  private static boolean VariableDefinition_4_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_4_1_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && VariableDefinition_4_1_1_2_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // MethodBody*
  private static boolean VariableDefinition_4_1_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_4_1_1_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VariableDefinition_4_1_1_2_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER EQUALS (STRING_LITERAL | NUMBER | BooleanValue | null) SEMICOLON
  static boolean VariableReassignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReassignment")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EQUALS);
    r = r && VariableReassignment_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING_LITERAL | NUMBER | BooleanValue | null
  private static boolean VariableReassignment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReassignment_2")) return false;
    boolean r;
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = BooleanValue(b, l + 1);
    if (!r) r = consumeToken(b, NULL);
    return r;
  }

  /* ********************************************************** */
  // char | uchar | unichar | int | uint | long | ulong | short | ushort | int8 | int16 | int32 | int64 | uint8 |
  //     uint16 | uint32 | uint64 | float | double | bool | string
  static boolean VariableType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableType")) return false;
    boolean r;
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
    return r;
  }

}
