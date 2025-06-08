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
  // CastExpression? WHITESPACE? (true
  //                           | false
  //                           | null
  //                           | STRING_LITERAL
  //                           | CHAR_LITERAL
  //                           | NUMBER
  //                           | new WHITESPACE? QualifiedIdentifier WHITESPACE? LPAREN MethodArguments? RPAREN
  //                           | QualifiedPointerableIdentifier WHITESPACE? LBRACKET WHITESPACE? (QualifiedPointerableIdentifier | NUMBER) WHITESPACE? RBRACKET
  //                           | MethodCall
  //                           | LBRACE RBRACE
  //                           | LBRACKET (QualifiedPointerableIdentifier | NUMBER WHITESPACE? (COMMA WHITESPACE? NUMBER)*) RBRACKET
  //                           | QualifiedPointerableIdentifier) ((WHITESPACE? (VariableAssignmentOperations | (INCREMENT | DECREMENT)) WHITESPACE? AssignmentValues)*)?
  static boolean AssignmentValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentValues_0(b, l + 1);
    r = r && AssignmentValues_1(b, l + 1);
    r = r && AssignmentValues_2(b, l + 1);
    r = r && AssignmentValues_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CastExpression?
  private static boolean AssignmentValues_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_0")) return false;
    CastExpression(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean AssignmentValues_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // true
  //                           | false
  //                           | null
  //                           | STRING_LITERAL
  //                           | CHAR_LITERAL
  //                           | NUMBER
  //                           | new WHITESPACE? QualifiedIdentifier WHITESPACE? LPAREN MethodArguments? RPAREN
  //                           | QualifiedPointerableIdentifier WHITESPACE? LBRACKET WHITESPACE? (QualifiedPointerableIdentifier | NUMBER) WHITESPACE? RBRACKET
  //                           | MethodCall
  //                           | LBRACE RBRACE
  //                           | LBRACKET (QualifiedPointerableIdentifier | NUMBER WHITESPACE? (COMMA WHITESPACE? NUMBER)*) RBRACKET
  //                           | QualifiedPointerableIdentifier
  private static boolean AssignmentValues_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, CHAR_LITERAL);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = AssignmentValues_2_6(b, l + 1);
    if (!r) r = AssignmentValues_2_7(b, l + 1);
    if (!r) r = MethodCall(b, l + 1);
    if (!r) r = parseTokens(b, 0, LBRACE, RBRACE);
    if (!r) r = AssignmentValues_2_10(b, l + 1);
    if (!r) r = QualifiedPointerableIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // new WHITESPACE? QualifiedIdentifier WHITESPACE? LPAREN MethodArguments? RPAREN
  private static boolean AssignmentValues_2_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && AssignmentValues_2_6_1(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && AssignmentValues_2_6_3(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && AssignmentValues_2_6_5(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean AssignmentValues_2_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_6_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean AssignmentValues_2_6_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_6_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // MethodArguments?
  private static boolean AssignmentValues_2_6_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_6_5")) return false;
    MethodArguments(b, l + 1);
    return true;
  }

  // QualifiedPointerableIdentifier WHITESPACE? LBRACKET WHITESPACE? (QualifiedPointerableIdentifier | NUMBER) WHITESPACE? RBRACKET
  private static boolean AssignmentValues_2_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedPointerableIdentifier(b, l + 1);
    r = r && AssignmentValues_2_7_1(b, l + 1);
    r = r && consumeToken(b, LBRACKET);
    r = r && AssignmentValues_2_7_3(b, l + 1);
    r = r && AssignmentValues_2_7_4(b, l + 1);
    r = r && AssignmentValues_2_7_5(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean AssignmentValues_2_7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_7_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean AssignmentValues_2_7_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_7_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // QualifiedPointerableIdentifier | NUMBER
  private static boolean AssignmentValues_2_7_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_7_4")) return false;
    boolean r;
    r = QualifiedPointerableIdentifier(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // WHITESPACE?
  private static boolean AssignmentValues_2_7_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_7_5")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // LBRACKET (QualifiedPointerableIdentifier | NUMBER WHITESPACE? (COMMA WHITESPACE? NUMBER)*) RBRACKET
  private static boolean AssignmentValues_2_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && AssignmentValues_2_10_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // QualifiedPointerableIdentifier | NUMBER WHITESPACE? (COMMA WHITESPACE? NUMBER)*
  private static boolean AssignmentValues_2_10_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_10_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedPointerableIdentifier(b, l + 1);
    if (!r) r = AssignmentValues_2_10_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER WHITESPACE? (COMMA WHITESPACE? NUMBER)*
  private static boolean AssignmentValues_2_10_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_10_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    r = r && AssignmentValues_2_10_1_1_1(b, l + 1);
    r = r && AssignmentValues_2_10_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean AssignmentValues_2_10_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_10_1_1_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (COMMA WHITESPACE? NUMBER)*
  private static boolean AssignmentValues_2_10_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_10_1_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AssignmentValues_2_10_1_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AssignmentValues_2_10_1_1_2", c)) break;
    }
    return true;
  }

  // COMMA WHITESPACE? NUMBER
  private static boolean AssignmentValues_2_10_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_10_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && AssignmentValues_2_10_1_1_2_0_1(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean AssignmentValues_2_10_1_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_2_10_1_1_2_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ((WHITESPACE? (VariableAssignmentOperations | (INCREMENT | DECREMENT)) WHITESPACE? AssignmentValues)*)?
  private static boolean AssignmentValues_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_3")) return false;
    AssignmentValues_3_0(b, l + 1);
    return true;
  }

  // (WHITESPACE? (VariableAssignmentOperations | (INCREMENT | DECREMENT)) WHITESPACE? AssignmentValues)*
  private static boolean AssignmentValues_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_3_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AssignmentValues_3_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AssignmentValues_3_0", c)) break;
    }
    return true;
  }

  // WHITESPACE? (VariableAssignmentOperations | (INCREMENT | DECREMENT)) WHITESPACE? AssignmentValues
  private static boolean AssignmentValues_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentValues_3_0_0_0(b, l + 1);
    r = r && AssignmentValues_3_0_0_1(b, l + 1);
    r = r && AssignmentValues_3_0_0_2(b, l + 1);
    r = r && AssignmentValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean AssignmentValues_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_3_0_0_0")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // VariableAssignmentOperations | (INCREMENT | DECREMENT)
  private static boolean AssignmentValues_3_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_3_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableAssignmentOperations(b, l + 1);
    if (!r) r = AssignmentValues_3_0_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INCREMENT | DECREMENT
  private static boolean AssignmentValues_3_0_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_3_0_0_1_1")) return false;
    boolean r;
    r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    return r;
  }

  // WHITESPACE?
  private static boolean AssignmentValues_3_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentValues_3_0_0_2")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // MethodCall
  static boolean BooleanReturningMethodCall(PsiBuilder b, int l) {
    return MethodCall(b, l + 1);
  }

  /* ********************************************************** */
  // true
  //                                 | false
  static boolean BooleanReturningValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BooleanReturningValues")) return false;
    if (!nextTokenIs(b, "", FALSE, TRUE)) return false;
    boolean r;
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    return r;
  }

  /* ********************************************************** */
  // CCode
  //                        | Version
  //                        | DBus
  static boolean CInstructions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CInstructions")) return false;
    boolean r;
    r = consumeToken(b, CCODE);
    if (!r) r = consumeToken(b, VERSION);
    if (!r) r = consumeToken(b, DBUS);
    return r;
  }

  /* ********************************************************** */
  // LPAREN WHITESPACE? NullableInstantiationTypes (STAR)? WHITESPACE? RPAREN WHITESPACE?
  static boolean CastExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && CastExpression_1(b, l + 1);
    r = r && NullableInstantiationTypes(b, l + 1);
    r = r && CastExpression_3(b, l + 1);
    r = r && CastExpression_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && CastExpression_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean CastExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpression_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (STAR)?
  private static boolean CastExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpression_3")) return false;
    consumeToken(b, STAR);
    return true;
  }

  // WHITESPACE?
  private static boolean CastExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpression_4")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean CastExpression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpression_6")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // AccessModifiers? WHITESPACE? ClassModifiers WHITESPACE? class WHITESPACE QualifiedIdentifier WHITESPACE? (COLON WHITESPACE? QualifiedIdentifier (COMMA WHITESPACE? QualifiedIdentifier)*)? WHITESPACE? LBRACE ClassItems* RBRACE
  static boolean ClassDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassDeclaration_0(b, l + 1);
    r = r && ClassDeclaration_1(b, l + 1);
    r = r && ClassModifiers(b, l + 1);
    r = r && ClassDeclaration_3(b, l + 1);
    r = r && consumeTokens(b, 0, CLASS, WHITESPACE);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && ClassDeclaration_7(b, l + 1);
    r = r && ClassDeclaration_8(b, l + 1);
    r = r && ClassDeclaration_9(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && ClassDeclaration_11(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifiers?
  private static boolean ClassDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_0")) return false;
    AccessModifiers(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean ClassDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ClassDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ClassDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_7")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (COLON WHITESPACE? QualifiedIdentifier (COMMA WHITESPACE? QualifiedIdentifier)*)?
  private static boolean ClassDeclaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_8")) return false;
    ClassDeclaration_8_0(b, l + 1);
    return true;
  }

  // COLON WHITESPACE? QualifiedIdentifier (COMMA WHITESPACE? QualifiedIdentifier)*
  private static boolean ClassDeclaration_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && ClassDeclaration_8_0_1(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && ClassDeclaration_8_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ClassDeclaration_8_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_8_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (COMMA WHITESPACE? QualifiedIdentifier)*
  private static boolean ClassDeclaration_8_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_8_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ClassDeclaration_8_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassDeclaration_8_0_3", c)) break;
    }
    return true;
  }

  // COMMA WHITESPACE? QualifiedIdentifier
  private static boolean ClassDeclaration_8_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_8_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ClassDeclaration_8_0_3_0_1(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ClassDeclaration_8_0_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_8_0_3_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ClassDeclaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_9")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ClassItems*
  private static boolean ClassDeclaration_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDeclaration_11")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ClassItems(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassDeclaration_11", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Comments
  //                     | ClassDeclaration
  //                     | StructDeclaration
  //                     | EnumDeclaration
  //                     | InterfaceDeclaration
  //                     | MethodCall
  //                     | WHITESPACE
  //                     | ShortMethodDeclaration
  //                     | StandardMethodDeclaration
  //                     | VariableDeclaration
  //                     | ShortVariableDeclaration
  //                     | ConstructorDeclaration
  //                     | ThisExpression
  //                     | DestructionMethodCall
  //                     | SpecialMethodSignatureDeclaration
  //                     | ForLoop
  //                     | VariableAssignment
  //                     | IfStatement
  //                     | WhileStatement
  //                     | DoWhileFinallyStatement
  //                     | LPAREN ClassItems RPAREN
  static boolean ClassItems(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassItems")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Comments(b, l + 1);
    if (!r) r = ClassDeclaration(b, l + 1);
    if (!r) r = StructDeclaration(b, l + 1);
    if (!r) r = EnumDeclaration(b, l + 1);
    if (!r) r = InterfaceDeclaration(b, l + 1);
    if (!r) r = MethodCall(b, l + 1);
    if (!r) r = consumeToken(b, WHITESPACE);
    if (!r) r = ShortMethodDeclaration(b, l + 1);
    if (!r) r = StandardMethodDeclaration(b, l + 1);
    if (!r) r = VariableDeclaration(b, l + 1);
    if (!r) r = ShortVariableDeclaration(b, l + 1);
    if (!r) r = ConstructorDeclaration(b, l + 1);
    if (!r) r = ThisExpression(b, l + 1);
    if (!r) r = DestructionMethodCall(b, l + 1);
    if (!r) r = SpecialMethodSignatureDeclaration(b, l + 1);
    if (!r) r = ForLoop(b, l + 1);
    if (!r) r = VariableAssignment(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = WhileStatement(b, l + 1);
    if (!r) r = DoWhileFinallyStatement(b, l + 1);
    if (!r) r = ClassItems_20(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN ClassItems RPAREN
  private static boolean ClassItems_20(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassItems_20")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ClassItems(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // abstract?
  //                            const?
  //                            virtual?
  static boolean ClassModifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassModifiers")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassModifiers_0(b, l + 1);
    r = r && ClassModifiers_1(b, l + 1);
    r = r && ClassModifiers_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // abstract?
  private static boolean ClassModifiers_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassModifiers_0")) return false;
    consumeToken(b, ABSTRACT);
    return true;
  }

  // const?
  private static boolean ClassModifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassModifiers_1")) return false;
    consumeToken(b, CONST);
    return true;
  }

  // virtual?
  private static boolean ClassModifiers_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassModifiers_2")) return false;
    consumeToken(b, VIRTUAL);
    return true;
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
  // (EXCLAMATION)? (BooleanReturningValues | MethodCall |
  //                                                  ((INCREMENT | DECREMENT)? AssignmentValues (INCREMENT | DECREMENT)?)
  //                                                  WHITESPACE? (ConditionalOperations) WHITESPACE? (BooleanReturningMethodCall | AssignmentValues))
  //                                                  (WHITESPACE? QUESTION_MARK WHITESPACE? AssignmentValues WHITESPACE? COLON WHITESPACE? AssignmentValues)?
  static boolean ConditionalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionalExpression_0(b, l + 1);
    r = r && ConditionalExpression_1(b, l + 1);
    r = r && ConditionalExpression_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EXCLAMATION)?
  private static boolean ConditionalExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_0")) return false;
    consumeToken(b, EXCLAMATION);
    return true;
  }

  // BooleanReturningValues | MethodCall |
  //                                                  ((INCREMENT | DECREMENT)? AssignmentValues (INCREMENT | DECREMENT)?)
  //                                                  WHITESPACE? (ConditionalOperations) WHITESPACE? (BooleanReturningMethodCall | AssignmentValues)
  private static boolean ConditionalExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BooleanReturningValues(b, l + 1);
    if (!r) r = MethodCall(b, l + 1);
    if (!r) r = ConditionalExpression_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((INCREMENT | DECREMENT)? AssignmentValues (INCREMENT | DECREMENT)?)
  //                                                  WHITESPACE? (ConditionalOperations) WHITESPACE? (BooleanReturningMethodCall | AssignmentValues)
  private static boolean ConditionalExpression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionalExpression_1_2_0(b, l + 1);
    r = r && ConditionalExpression_1_2_1(b, l + 1);
    r = r && ConditionalExpression_1_2_2(b, l + 1);
    r = r && ConditionalExpression_1_2_3(b, l + 1);
    r = r && ConditionalExpression_1_2_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (INCREMENT | DECREMENT)? AssignmentValues (INCREMENT | DECREMENT)?
  private static boolean ConditionalExpression_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionalExpression_1_2_0_0(b, l + 1);
    r = r && AssignmentValues(b, l + 1);
    r = r && ConditionalExpression_1_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (INCREMENT | DECREMENT)?
  private static boolean ConditionalExpression_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_1_2_0_0")) return false;
    ConditionalExpression_1_2_0_0_0(b, l + 1);
    return true;
  }

  // INCREMENT | DECREMENT
  private static boolean ConditionalExpression_1_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_1_2_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    return r;
  }

  // (INCREMENT | DECREMENT)?
  private static boolean ConditionalExpression_1_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_1_2_0_2")) return false;
    ConditionalExpression_1_2_0_2_0(b, l + 1);
    return true;
  }

  // INCREMENT | DECREMENT
  private static boolean ConditionalExpression_1_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_1_2_0_2_0")) return false;
    boolean r;
    r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    return r;
  }

  // WHITESPACE?
  private static boolean ConditionalExpression_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_1_2_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (ConditionalOperations)
  private static boolean ConditionalExpression_1_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_1_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionalOperations(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ConditionalExpression_1_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_1_2_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // BooleanReturningMethodCall | AssignmentValues
  private static boolean ConditionalExpression_1_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_1_2_4")) return false;
    boolean r;
    r = BooleanReturningMethodCall(b, l + 1);
    if (!r) r = AssignmentValues(b, l + 1);
    return r;
  }

  // (WHITESPACE? QUESTION_MARK WHITESPACE? AssignmentValues WHITESPACE? COLON WHITESPACE? AssignmentValues)?
  private static boolean ConditionalExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_2")) return false;
    ConditionalExpression_2_0(b, l + 1);
    return true;
  }

  // WHITESPACE? QUESTION_MARK WHITESPACE? AssignmentValues WHITESPACE? COLON WHITESPACE? AssignmentValues
  private static boolean ConditionalExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionalExpression_2_0_0(b, l + 1);
    r = r && consumeToken(b, QUESTION_MARK);
    r = r && ConditionalExpression_2_0_2(b, l + 1);
    r = r && AssignmentValues(b, l + 1);
    r = r && ConditionalExpression_2_0_4(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && ConditionalExpression_2_0_6(b, l + 1);
    r = r && AssignmentValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ConditionalExpression_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_2_0_0")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ConditionalExpression_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_2_0_2")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ConditionalExpression_2_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_2_0_4")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ConditionalExpression_2_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpression_2_0_6")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // ConditionalExpression (WHITESPACE? (AND_AND | OR_OR) WHITESPACE? ConditionalExpression)*
  static boolean ConditionalExpressions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpressions")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionalExpression(b, l + 1);
    r = r && ConditionalExpressions_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (WHITESPACE? (AND_AND | OR_OR) WHITESPACE? ConditionalExpression)*
  private static boolean ConditionalExpressions_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpressions_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ConditionalExpressions_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConditionalExpressions_1", c)) break;
    }
    return true;
  }

  // WHITESPACE? (AND_AND | OR_OR) WHITESPACE? ConditionalExpression
  private static boolean ConditionalExpressions_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpressions_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionalExpressions_1_0_0(b, l + 1);
    r = r && ConditionalExpressions_1_0_1(b, l + 1);
    r = r && ConditionalExpressions_1_0_2(b, l + 1);
    r = r && ConditionalExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ConditionalExpressions_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpressions_1_0_0")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // AND_AND | OR_OR
  private static boolean ConditionalExpressions_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpressions_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, AND_AND);
    if (!r) r = consumeToken(b, OR_OR);
    return r;
  }

  // WHITESPACE?
  private static boolean ConditionalExpressions_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalExpressions_1_0_2")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // EQUALS_EQUALS
  //                                | LESS_THAN_EQUALS
  //                                | GREATER_THAN_EQUALS
  //                                | LESS_THAN
  //                                | GREATER_THAN
  //                                | NOT_EQUALS
  static boolean ConditionalOperations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConditionalOperations")) return false;
    boolean r;
    r = consumeToken(b, EQUALS_EQUALS);
    if (!r) r = consumeToken(b, LESS_THAN_EQUALS);
    if (!r) r = consumeToken(b, GREATER_THAN_EQUALS);
    if (!r) r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, GREATER_THAN);
    if (!r) r = consumeToken(b, NOT_EQUALS);
    return r;
  }

  /* ********************************************************** */
  // AccessModifiers? WHITESPACE? QualifiedIdentifier WHITESPACE? LPAREN ParameterList? RPAREN WHITESPACE? LBRACE MethodBody* RBRACE
  static boolean ConstructorDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConstructorDeclaration_0(b, l + 1);
    r = r && ConstructorDeclaration_1(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && ConstructorDeclaration_3(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && ConstructorDeclaration_5(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && ConstructorDeclaration_7(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && ConstructorDeclaration_9(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifiers?
  private static boolean ConstructorDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorDeclaration_0")) return false;
    AccessModifiers(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean ConstructorDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorDeclaration_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ConstructorDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorDeclaration_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ParameterList?
  private static boolean ConstructorDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorDeclaration_5")) return false;
    ParameterList(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean ConstructorDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorDeclaration_7")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // MethodBody*
  private static boolean ConstructorDeclaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstructorDeclaration_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConstructorDeclaration_9", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE WHITESPACE? QualifiedIdentifier WHITESPACE? LPAREN MethodArguments? RPAREN WHITESPACE? LBRACE MethodBody* RBRACE
  static boolean DestructionMethodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DestructionMethodCall")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TILDE);
    r = r && DestructionMethodCall_1(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && DestructionMethodCall_3(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && DestructionMethodCall_5(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && DestructionMethodCall_7(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && DestructionMethodCall_9(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean DestructionMethodCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DestructionMethodCall_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean DestructionMethodCall_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DestructionMethodCall_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // MethodArguments?
  private static boolean DestructionMethodCall_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DestructionMethodCall_5")) return false;
    MethodArguments(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean DestructionMethodCall_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DestructionMethodCall_7")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // MethodBody*
  private static boolean DestructionMethodCall_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DestructionMethodCall_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DestructionMethodCall_9", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // do WHITESPACE? LBRACE WhileBody* RBRACE WHITESPACE? WhileStatement WHITESPACE? FinallyStatement?
  static boolean DoWhileFinallyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoWhileFinallyStatement")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO);
    r = r && DoWhileFinallyStatement_1(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && DoWhileFinallyStatement_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    r = r && DoWhileFinallyStatement_5(b, l + 1);
    r = r && WhileStatement(b, l + 1);
    r = r && DoWhileFinallyStatement_7(b, l + 1);
    r = r && DoWhileFinallyStatement_8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean DoWhileFinallyStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoWhileFinallyStatement_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WhileBody*
  private static boolean DoWhileFinallyStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoWhileFinallyStatement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WhileBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DoWhileFinallyStatement_3", c)) break;
    }
    return true;
  }

  // WHITESPACE?
  private static boolean DoWhileFinallyStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoWhileFinallyStatement_5")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean DoWhileFinallyStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoWhileFinallyStatement_7")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // FinallyStatement?
  private static boolean DoWhileFinallyStatement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoWhileFinallyStatement_8")) return false;
    FinallyStatement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // else if WHITESPACE? LPAREN WHITESPACE? (ConditionalExpressions) RPAREN WHITESPACE? (LBRACE IfBody* RBRACE | IfOneLinerBody* SEMICOLON?)
  static boolean ElseIfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSE, IF);
    r = r && ElseIfStatement_2(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && ElseIfStatement_4(b, l + 1);
    r = r && ElseIfStatement_5(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && ElseIfStatement_7(b, l + 1);
    r = r && ElseIfStatement_8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ElseIfStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_2")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ElseIfStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_4")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (ConditionalExpressions)
  private static boolean ElseIfStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionalExpressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ElseIfStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_7")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // LBRACE IfBody* RBRACE | IfOneLinerBody* SEMICOLON?
  private static boolean ElseIfStatement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ElseIfStatement_8_0(b, l + 1);
    if (!r) r = ElseIfStatement_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE IfBody* RBRACE
  private static boolean ElseIfStatement_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && ElseIfStatement_8_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // IfBody*
  private static boolean ElseIfStatement_8_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_8_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IfBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ElseIfStatement_8_0_1", c)) break;
    }
    return true;
  }

  // IfOneLinerBody* SEMICOLON?
  private static boolean ElseIfStatement_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_8_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ElseIfStatement_8_1_0(b, l + 1);
    r = r && ElseIfStatement_8_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IfOneLinerBody*
  private static boolean ElseIfStatement_8_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_8_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IfOneLinerBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ElseIfStatement_8_1_0", c)) break;
    }
    return true;
  }

  // SEMICOLON?
  private static boolean ElseIfStatement_8_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfStatement_8_1_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // else WHITESPACE? (LBRACE IfBody* RBRACE | IfOneLinerBody* SEMICOLON?)
  static boolean ElseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && ElseStatement_1(b, l + 1);
    r = r && ElseStatement_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ElseStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // LBRACE IfBody* RBRACE | IfOneLinerBody* SEMICOLON?
  private static boolean ElseStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ElseStatement_2_0(b, l + 1);
    if (!r) r = ElseStatement_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE IfBody* RBRACE
  private static boolean ElseStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && ElseStatement_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // IfBody*
  private static boolean ElseStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IfBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ElseStatement_2_0_1", c)) break;
    }
    return true;
  }

  // IfOneLinerBody* SEMICOLON?
  private static boolean ElseStatement_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ElseStatement_2_1_0(b, l + 1);
    r = r && ElseStatement_2_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IfOneLinerBody*
  private static boolean ElseStatement_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement_2_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IfOneLinerBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ElseStatement_2_1_0", c)) break;
    }
    return true;
  }

  // SEMICOLON?
  private static boolean ElseStatement_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStatement_2_1_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // AccessModifiers? WHITESPACE? enum WHITESPACE? QualifiedIdentifier WHITESPACE? LBRACE EnumItems* RBRACE
  static boolean EnumDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnumDeclaration_0(b, l + 1);
    r = r && EnumDeclaration_1(b, l + 1);
    r = r && consumeToken(b, ENUM);
    r = r && EnumDeclaration_3(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && EnumDeclaration_5(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && EnumDeclaration_7(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifiers?
  private static boolean EnumDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_0")) return false;
    AccessModifiers(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean EnumDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean EnumDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean EnumDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_5")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // EnumItems*
  private static boolean EnumDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDeclaration_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EnumItems(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumDeclaration_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Comments
  //                    | StandardMethodDeclaration
  //                    | WHITESPACE
  //                    | LPAREN EnumItems RPAREN
  static boolean EnumItems(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumItems")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Comments(b, l + 1);
    if (!r) r = StandardMethodDeclaration(b, l + 1);
    if (!r) r = consumeToken(b, WHITESPACE);
    if (!r) r = EnumItems_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN EnumItems RPAREN
  private static boolean EnumItems_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumItems_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && EnumItems(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // finally WHITESPACE? LBRACE WhileBody* RBRACE
  static boolean FinallyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FinallyStatement")) return false;
    if (!nextTokenIs(b, FINALLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FINALLY);
    r = r && FinallyStatement_1(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && FinallyStatement_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean FinallyStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FinallyStatement_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WhileBody*
  private static boolean FinallyStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FinallyStatement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WhileBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FinallyStatement_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // for WHITESPACE? LPAREN WHITESPACE? ForLoopInitialization? WHITESPACE? (ConditionalExpressions)? WHITESPACE? SEMICOLON? WHITESPACE? ForLoopUpdate? RPAREN WHITESPACE? LBRACE ForLoopBody* RBRACE
  static boolean ForLoop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && ForLoop_1(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && ForLoop_3(b, l + 1);
    r = r && ForLoop_4(b, l + 1);
    r = r && ForLoop_5(b, l + 1);
    r = r && ForLoop_6(b, l + 1);
    r = r && ForLoop_7(b, l + 1);
    r = r && ForLoop_8(b, l + 1);
    r = r && ForLoop_9(b, l + 1);
    r = r && ForLoop_10(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && ForLoop_12(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && ForLoop_14(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ForLoop_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ForLoop_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ForLoopInitialization?
  private static boolean ForLoop_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_4")) return false;
    ForLoopInitialization(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean ForLoop_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_5")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (ConditionalExpressions)?
  private static boolean ForLoop_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_6")) return false;
    ForLoop_6_0(b, l + 1);
    return true;
  }

  // (ConditionalExpressions)
  private static boolean ForLoop_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionalExpressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ForLoop_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_7")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // SEMICOLON?
  private static boolean ForLoop_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_8")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  // WHITESPACE?
  private static boolean ForLoop_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_9")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ForLoopUpdate?
  private static boolean ForLoop_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_10")) return false;
    ForLoopUpdate(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean ForLoop_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_12")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ForLoopBody*
  private static boolean ForLoop_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoop_14")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ForLoopBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForLoop_14", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // MethodBody
  //                      | break SEMICOLON?
  //                      | continue SEMICOLON?
  static boolean ForLoopBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopBody")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodBody(b, l + 1);
    if (!r) r = ForLoopBody_1(b, l + 1);
    if (!r) r = ForLoopBody_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // break SEMICOLON?
  private static boolean ForLoopBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BREAK);
    r = r && ForLoopBody_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON?
  private static boolean ForLoopBody_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopBody_1_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  // continue SEMICOLON?
  private static boolean ForLoopBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopBody_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTINUE);
    r = r && ForLoopBody_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON?
  private static boolean ForLoopBody_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopBody_2_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // VariableDeclaration
  //                                | ShortVariableDeclaration
  //                                | VariableAssignment SEMICOLON?
  static boolean ForLoopInitialization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopInitialization")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDeclaration(b, l + 1);
    if (!r) r = ShortVariableDeclaration(b, l + 1);
    if (!r) r = ForLoopInitialization_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VariableAssignment SEMICOLON?
  private static boolean ForLoopInitialization_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopInitialization_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableAssignment(b, l + 1);
    r = r && ForLoopInitialization_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON?
  private static boolean ForLoopInitialization_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopInitialization_2_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // (INCREMENT | DECREMENT)? QualifiedPointerableIdentifier (INCREMENT | DECREMENT)?
  static boolean ForLoopUpdate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopUpdate")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ForLoopUpdate_0(b, l + 1);
    r = r && QualifiedPointerableIdentifier(b, l + 1);
    r = r && ForLoopUpdate_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (INCREMENT | DECREMENT)?
  private static boolean ForLoopUpdate_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopUpdate_0")) return false;
    ForLoopUpdate_0_0(b, l + 1);
    return true;
  }

  // INCREMENT | DECREMENT
  private static boolean ForLoopUpdate_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopUpdate_0_0")) return false;
    boolean r;
    r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    return r;
  }

  // (INCREMENT | DECREMENT)?
  private static boolean ForLoopUpdate_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopUpdate_2")) return false;
    ForLoopUpdate_2_0(b, l + 1);
    return true;
  }

  // INCREMENT | DECREMENT
  private static boolean ForLoopUpdate_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLoopUpdate_2_0")) return false;
    boolean r;
    r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
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
  //                      | METHOD_CALL_NAME
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
    if (!r) r = consumeToken(b, METHOD_CALL_NAME);
    return r;
  }

  /* ********************************************************** */
  // MethodBody
  static boolean IfBody(PsiBuilder b, int l) {
    return MethodBody(b, l + 1);
  }

  /* ********************************************************** */
  // VariableAssignment
  //                         | MethodCall
  //                         | ReturnStatement
  //                         | IfStatement
  //                         | ForLoop
  //                         | DestructionMethodCall
  //                         | ThisExpression
  //                         | Comments
  //                         | break
  //                         | continue
  //                         | LPAREN IfOneLinerBody* RPAREN
  static boolean IfOneLinerBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfOneLinerBody")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableAssignment(b, l + 1);
    if (!r) r = MethodCall(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = ForLoop(b, l + 1);
    if (!r) r = DestructionMethodCall(b, l + 1);
    if (!r) r = ThisExpression(b, l + 1);
    if (!r) r = Comments(b, l + 1);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = consumeToken(b, CONTINUE);
    if (!r) r = IfOneLinerBody_10(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN IfOneLinerBody* RPAREN
  private static boolean IfOneLinerBody_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfOneLinerBody_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && IfOneLinerBody_10_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // IfOneLinerBody*
  private static boolean IfOneLinerBody_10_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfOneLinerBody_10_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IfOneLinerBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfOneLinerBody_10_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // if WHITESPACE? LPAREN WHITESPACE? (ConditionalExpressions) WHITESPACE? RPAREN WHITESPACE? (LBRACE IfBody* RBRACE | IfOneLinerBody* SEMICOLON?) SEMICOLON? WHITESPACE? ElseIfStatement* WHITESPACE? ElseStatement?
  static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && IfStatement_1(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && IfStatement_3(b, l + 1);
    r = r && IfStatement_4(b, l + 1);
    r = r && IfStatement_5(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && IfStatement_7(b, l + 1);
    r = r && IfStatement_8(b, l + 1);
    r = r && IfStatement_9(b, l + 1);
    r = r && IfStatement_10(b, l + 1);
    r = r && IfStatement_11(b, l + 1);
    r = r && IfStatement_12(b, l + 1);
    r = r && IfStatement_13(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean IfStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean IfStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (ConditionalExpressions)
  private static boolean IfStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionalExpressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean IfStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_5")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean IfStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_7")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // LBRACE IfBody* RBRACE | IfOneLinerBody* SEMICOLON?
  private static boolean IfStatement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfStatement_8_0(b, l + 1);
    if (!r) r = IfStatement_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE IfBody* RBRACE
  private static boolean IfStatement_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && IfStatement_8_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // IfBody*
  private static boolean IfStatement_8_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_8_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IfBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfStatement_8_0_1", c)) break;
    }
    return true;
  }

  // IfOneLinerBody* SEMICOLON?
  private static boolean IfStatement_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_8_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfStatement_8_1_0(b, l + 1);
    r = r && IfStatement_8_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IfOneLinerBody*
  private static boolean IfStatement_8_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_8_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IfOneLinerBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfStatement_8_1_0", c)) break;
    }
    return true;
  }

  // SEMICOLON?
  private static boolean IfStatement_8_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_8_1_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  // SEMICOLON?
  private static boolean IfStatement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_9")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  // WHITESPACE?
  private static boolean IfStatement_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_10")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ElseIfStatement*
  private static boolean IfStatement_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_11")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ElseIfStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfStatement_11", c)) break;
    }
    return true;
  }

  // WHITESPACE?
  private static boolean IfStatement_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_12")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ElseStatement?
  private static boolean IfStatement_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_13")) return false;
    ElseStatement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (string
  //                             | char
  //                             | uchar
  //                             | unichar
  //                             | int
  //                             | uint
  //                             | long
  //                             | ulong
  //                             | short
  //                             | ushort
  //                             | int8
  //                             | int16
  //                             | int32
  //                             | int64
  //                             | uint8
  //                             | uint16
  //                             | uint32
  //                             | uint64
  //                             | float
  //                             | double
  //                             | bool
  //                             | size_t
  //                             | ssize_t
  //                             | QualifiedIdentifier ) (LBRACKET RBRACKET)?
  static boolean InstantiationTypes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InstantiationTypes")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InstantiationTypes_0(b, l + 1);
    r = r && InstantiationTypes_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string
  //                             | char
  //                             | uchar
  //                             | unichar
  //                             | int
  //                             | uint
  //                             | long
  //                             | ulong
  //                             | short
  //                             | ushort
  //                             | int8
  //                             | int16
  //                             | int32
  //                             | int64
  //                             | uint8
  //                             | uint16
  //                             | uint32
  //                             | uint64
  //                             | float
  //                             | double
  //                             | bool
  //                             | size_t
  //                             | ssize_t
  //                             | QualifiedIdentifier
  private static boolean InstantiationTypes_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InstantiationTypes_0")) return false;
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
    if (!r) r = QualifiedIdentifier(b, l + 1);
    return r;
  }

  // (LBRACKET RBRACKET)?
  private static boolean InstantiationTypes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InstantiationTypes_1")) return false;
    InstantiationTypes_1_0(b, l + 1);
    return true;
  }

  // LBRACKET RBRACKET
  private static boolean InstantiationTypes_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InstantiationTypes_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AccessModifiers? WHITESPACE? interface WHITESPACE? QualifiedIdentifier WHITESPACE? (COLON WHITESPACE? QualifiedIdentifier (COMMA WHITESPACE? QualifiedIdentifier)*)? WHITESPACE? LBRACE InterfaceItems* RBRACE
  static boolean InterfaceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InterfaceDeclaration_0(b, l + 1);
    r = r && InterfaceDeclaration_1(b, l + 1);
    r = r && consumeToken(b, INTERFACE);
    r = r && InterfaceDeclaration_3(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && InterfaceDeclaration_5(b, l + 1);
    r = r && InterfaceDeclaration_6(b, l + 1);
    r = r && InterfaceDeclaration_7(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && InterfaceDeclaration_9(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifiers?
  private static boolean InterfaceDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_0")) return false;
    AccessModifiers(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean InterfaceDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean InterfaceDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean InterfaceDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_5")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (COLON WHITESPACE? QualifiedIdentifier (COMMA WHITESPACE? QualifiedIdentifier)*)?
  private static boolean InterfaceDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_6")) return false;
    InterfaceDeclaration_6_0(b, l + 1);
    return true;
  }

  // COLON WHITESPACE? QualifiedIdentifier (COMMA WHITESPACE? QualifiedIdentifier)*
  private static boolean InterfaceDeclaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && InterfaceDeclaration_6_0_1(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && InterfaceDeclaration_6_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean InterfaceDeclaration_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_6_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (COMMA WHITESPACE? QualifiedIdentifier)*
  private static boolean InterfaceDeclaration_6_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_6_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!InterfaceDeclaration_6_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterfaceDeclaration_6_0_3", c)) break;
    }
    return true;
  }

  // COMMA WHITESPACE? QualifiedIdentifier
  private static boolean InterfaceDeclaration_6_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_6_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && InterfaceDeclaration_6_0_3_0_1(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean InterfaceDeclaration_6_0_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_6_0_3_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean InterfaceDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_7")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // InterfaceItems*
  private static boolean InterfaceDeclaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceDeclaration_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!InterfaceItems(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterfaceDeclaration_9", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Comments
  //                         | MethodSignatureDeclaration
  //                         | WHITESPACE
  //                         | LPAREN InterfaceItems* RPAREN
  static boolean InterfaceItems(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceItems")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Comments(b, l + 1);
    if (!r) r = MethodSignatureDeclaration(b, l + 1);
    if (!r) r = consumeToken(b, WHITESPACE);
    if (!r) r = InterfaceItems_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN InterfaceItems* RPAREN
  private static boolean InterfaceItems_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceItems_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && InterfaceItems_3_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // InterfaceItems*
  private static boolean InterfaceItems_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceItems_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!InterfaceItems(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterfaceItems_3_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // NamespaceDeclaration
  //                | Comments
  //                | ClassDeclaration
  //                | StructDeclaration
  //                | EnumDeclaration
  //                | InterfaceDeclaration
  //                | UsingDeclaration
  //                | MethodCall
  //                | StandardMethodDeclaration
  //                | ShortMethodDeclaration
  //                | VariableDeclaration
  //                | ShortVariableDeclaration
  //                | DestructionMethodCall
  //                | WHITESPACE
  //                | ForLoop
  //                | VariableAssignment
  //                | IfStatement
  //                | WhileStatement
  //                | DoWhileFinallyStatement
  //                | LPAREN Items RPAREN
  public static boolean Items(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Items")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITEMS, "<items>");
    r = NamespaceDeclaration(b, l + 1);
    if (!r) r = Comments(b, l + 1);
    if (!r) r = ClassDeclaration(b, l + 1);
    if (!r) r = StructDeclaration(b, l + 1);
    if (!r) r = EnumDeclaration(b, l + 1);
    if (!r) r = InterfaceDeclaration(b, l + 1);
    if (!r) r = UsingDeclaration(b, l + 1);
    if (!r) r = MethodCall(b, l + 1);
    if (!r) r = StandardMethodDeclaration(b, l + 1);
    if (!r) r = ShortMethodDeclaration(b, l + 1);
    if (!r) r = VariableDeclaration(b, l + 1);
    if (!r) r = ShortVariableDeclaration(b, l + 1);
    if (!r) r = DestructionMethodCall(b, l + 1);
    if (!r) r = consumeToken(b, WHITESPACE);
    if (!r) r = ForLoop(b, l + 1);
    if (!r) r = VariableAssignment(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = WhileStatement(b, l + 1);
    if (!r) r = DoWhileFinallyStatement(b, l + 1);
    if (!r) r = Items_19(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPAREN Items RPAREN
  private static boolean Items_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Items_19")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && Items(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // InstantiationTypes
  //                   | IfStatement
  //                   | CInstructions
  //                   | AccessModifiers
  //                   | switch
  //                   | case
  //                   | default
  //                   | goto
  //                   | sizeof
  //                   | typedef
  //                   | struct
  //                   | union
  //                   | static
  //                   | abstract
  //                   | virtual
  //                   | override
  //                   | foreach
  //                   | in
  //                   | try
  //                   | catch
  //                   | finally
  //                   | throw
  //                   | delete
  //                   | this
  //                   | const
  //                   | volatile
  //                   | assert
  //                   | construct
  //                   | yield
  //                   | async
  //                   | base
  //                   | is
  //                   | as
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
    r = InstantiationTypes(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = CInstructions(b, l + 1);
    if (!r) r = AccessModifiers(b, l + 1);
    if (!r) r = consumeToken(b, SWITCH);
    if (!r) r = consumeToken(b, CASE);
    if (!r) r = consumeToken(b, DEFAULT);
    if (!r) r = consumeToken(b, GOTO);
    if (!r) r = consumeToken(b, SIZEOF);
    if (!r) r = consumeToken(b, TYPEDEF);
    if (!r) r = consumeToken(b, STRUCT);
    if (!r) r = consumeToken(b, UNION);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, VIRTUAL);
    if (!r) r = consumeToken(b, OVERRIDE);
    if (!r) r = consumeToken(b, FOREACH);
    if (!r) r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, TRY);
    if (!r) r = consumeToken(b, CATCH);
    if (!r) r = consumeToken(b, FINALLY);
    if (!r) r = consumeToken(b, THROW);
    if (!r) r = consumeToken(b, DELETE);
    if (!r) r = consumeToken(b, THIS);
    if (!r) r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, VOLATILE);
    if (!r) r = consumeToken(b, ASSERT);
    if (!r) r = consumeToken(b, CONSTRUCT);
    if (!r) r = consumeToken(b, YIELD);
    if (!r) r = consumeToken(b, ASYNC);
    if (!r) r = consumeToken(b, BASE);
    if (!r) r = consumeToken(b, IS);
    if (!r) r = consumeToken(b, AS);
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
  // LPAREN (IDENTIFIER WHITESPACE? (COMMA WHITESPACE? IDENTIFIER)*)? RPAREN WHITESPACE? (EQUALS GREATER_THAN) WHITESPACE? LBRACE MethodBody* RBRACE
  static boolean Lambda(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && Lambda_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && Lambda_3(b, l + 1);
    r = r && Lambda_4(b, l + 1);
    r = r && Lambda_5(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && Lambda_7(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IDENTIFIER WHITESPACE? (COMMA WHITESPACE? IDENTIFIER)*)?
  private static boolean Lambda_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_1")) return false;
    Lambda_1_0(b, l + 1);
    return true;
  }

  // IDENTIFIER WHITESPACE? (COMMA WHITESPACE? IDENTIFIER)*
  private static boolean Lambda_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && Lambda_1_0_1(b, l + 1);
    r = r && Lambda_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean Lambda_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_1_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (COMMA WHITESPACE? IDENTIFIER)*
  private static boolean Lambda_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Lambda_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Lambda_1_0_2", c)) break;
    }
    return true;
  }

  // COMMA WHITESPACE? IDENTIFIER
  private static boolean Lambda_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Lambda_1_0_2_0_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean Lambda_1_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_1_0_2_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean Lambda_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // EQUALS GREATER_THAN
  private static boolean Lambda_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EQUALS, GREATER_THAN);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean Lambda_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_5")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // MethodBody*
  private static boolean Lambda_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lambda_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Lambda_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (out)? WHITESPACE? (MethodCall
  //                                               | (NullableInstantiationTypes WHITESPACE? QualifiedPointerableIdentifier)
  //                                               | AssignmentValues
  //                                               | Lambda
  //                                               | QualifiedPointerableIdentifier | LPAREN MethodArgument RPAREN)
  static boolean MethodArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodArgument")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodArgument_0(b, l + 1);
    r = r && MethodArgument_1(b, l + 1);
    r = r && MethodArgument_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (out)?
  private static boolean MethodArgument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodArgument_0")) return false;
    consumeToken(b, OUT);
    return true;
  }

  // WHITESPACE?
  private static boolean MethodArgument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodArgument_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // MethodCall
  //                                               | (NullableInstantiationTypes WHITESPACE? QualifiedPointerableIdentifier)
  //                                               | AssignmentValues
  //                                               | Lambda
  //                                               | QualifiedPointerableIdentifier | LPAREN MethodArgument RPAREN
  private static boolean MethodArgument_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodArgument_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodCall(b, l + 1);
    if (!r) r = MethodArgument_2_1(b, l + 1);
    if (!r) r = AssignmentValues(b, l + 1);
    if (!r) r = Lambda(b, l + 1);
    if (!r) r = QualifiedPointerableIdentifier(b, l + 1);
    if (!r) r = MethodArgument_2_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NullableInstantiationTypes WHITESPACE? QualifiedPointerableIdentifier
  private static boolean MethodArgument_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodArgument_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NullableInstantiationTypes(b, l + 1);
    r = r && MethodArgument_2_1_1(b, l + 1);
    r = r && QualifiedPointerableIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean MethodArgument_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodArgument_2_1_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // LPAREN MethodArgument RPAREN
  private static boolean MethodArgument_2_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodArgument_2_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && MethodArgument(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MethodArgument WHITESPACE?(COMMA WHITESPACE? MethodArgument)*
  static boolean MethodArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodArguments")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodArgument(b, l + 1);
    r = r && MethodArguments_1(b, l + 1);
    r = r && MethodArguments_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean MethodArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodArguments_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (COMMA WHITESPACE? MethodArgument)*
  private static boolean MethodArguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodArguments_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodArguments_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodArguments_2", c)) break;
    }
    return true;
  }

  // COMMA WHITESPACE? MethodArgument
  private static boolean MethodArguments_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodArguments_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && MethodArguments_2_0_1(b, l + 1);
    r = r && MethodArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean MethodArguments_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodArguments_2_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // Comments
  //                     | ReturnStatement
  //                     | MethodCall
  //                     | WHITESPACE
  //                     | ThisExpression
  //                     | VariableDeclaration
  //                     | ShortVariableDeclaration
  //                     | ForLoop
  //                     | VariableAssignment
  //                     | IfStatement
  //                     | break SEMICOLON
  //                     | continue SEMICOLON
  //                     | DoWhileFinallyStatement
  //                     | WhileStatement
  //                     | LPAREN MethodBody RPAREN
  static boolean MethodBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodBody")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Comments(b, l + 1);
    if (!r) r = ReturnStatement(b, l + 1);
    if (!r) r = MethodCall(b, l + 1);
    if (!r) r = consumeToken(b, WHITESPACE);
    if (!r) r = ThisExpression(b, l + 1);
    if (!r) r = VariableDeclaration(b, l + 1);
    if (!r) r = ShortVariableDeclaration(b, l + 1);
    if (!r) r = ForLoop(b, l + 1);
    if (!r) r = VariableAssignment(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = parseTokens(b, 0, BREAK, SEMICOLON);
    if (!r) r = parseTokens(b, 0, CONTINUE, SEMICOLON);
    if (!r) r = DoWhileFinallyStatement(b, l + 1);
    if (!r) r = WhileStatement(b, l + 1);
    if (!r) r = MethodBody_14(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN MethodBody RPAREN
  private static boolean MethodBody_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodBody_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && MethodBody(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CastExpression? (QualifiedIdentifier) WHITESPACE? LPAREN MethodArguments? RPAREN SEMICOLON?
  static boolean MethodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodCall_0(b, l + 1);
    r = r && MethodCall_1(b, l + 1);
    r = r && MethodCall_2(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && MethodCall_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && MethodCall_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CastExpression?
  private static boolean MethodCall_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall_0")) return false;
    CastExpression(b, l + 1);
    return true;
  }

  // (QualifiedIdentifier)
  private static boolean MethodCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean MethodCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall_2")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // MethodArguments?
  private static boolean MethodCall_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall_4")) return false;
    MethodArguments(b, l + 1);
    return true;
  }

  // SEMICOLON?
  private static boolean MethodCall_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall_6")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // AccessModifiers? WHITESPACE? Modifiers WHITESPACE? ReturnTypes WHITESPACE? QualifiedIdentifier WHITESPACE? LPAREN ParameterList? RPAREN WHITESPACE? ThrowsExpression? WHITESPACE? (SEMICOLON )
  static boolean MethodSignatureDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSignatureDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodSignatureDeclaration_0(b, l + 1);
    r = r && MethodSignatureDeclaration_1(b, l + 1);
    r = r && Modifiers(b, l + 1);
    r = r && MethodSignatureDeclaration_3(b, l + 1);
    r = r && ReturnTypes(b, l + 1);
    r = r && MethodSignatureDeclaration_5(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && MethodSignatureDeclaration_7(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && MethodSignatureDeclaration_9(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && MethodSignatureDeclaration_11(b, l + 1);
    r = r && MethodSignatureDeclaration_12(b, l + 1);
    r = r && MethodSignatureDeclaration_13(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifiers?
  private static boolean MethodSignatureDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSignatureDeclaration_0")) return false;
    AccessModifiers(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean MethodSignatureDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSignatureDeclaration_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean MethodSignatureDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSignatureDeclaration_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean MethodSignatureDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSignatureDeclaration_5")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean MethodSignatureDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSignatureDeclaration_7")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ParameterList?
  private static boolean MethodSignatureDeclaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSignatureDeclaration_9")) return false;
    ParameterList(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean MethodSignatureDeclaration_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSignatureDeclaration_11")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ThrowsExpression?
  private static boolean MethodSignatureDeclaration_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSignatureDeclaration_12")) return false;
    ThrowsExpression(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean MethodSignatureDeclaration_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSignatureDeclaration_13")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // static?
  //                       abstract?
  //                       virtual?
  //                       override?
  //                       const?
  //                       owned?
  //                       unowned?
  //                       weak?
  static boolean Modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Modifiers_0(b, l + 1);
    r = r && Modifiers_1(b, l + 1);
    r = r && Modifiers_2(b, l + 1);
    r = r && Modifiers_3(b, l + 1);
    r = r && Modifiers_4(b, l + 1);
    r = r && Modifiers_5(b, l + 1);
    r = r && Modifiers_6(b, l + 1);
    r = r && Modifiers_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // static?
  private static boolean Modifiers_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Modifiers_0")) return false;
    consumeToken(b, STATIC);
    return true;
  }

  // abstract?
  private static boolean Modifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Modifiers_1")) return false;
    consumeToken(b, ABSTRACT);
    return true;
  }

  // virtual?
  private static boolean Modifiers_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Modifiers_2")) return false;
    consumeToken(b, VIRTUAL);
    return true;
  }

  // override?
  private static boolean Modifiers_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Modifiers_3")) return false;
    consumeToken(b, OVERRIDE);
    return true;
  }

  // const?
  private static boolean Modifiers_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Modifiers_4")) return false;
    consumeToken(b, CONST);
    return true;
  }

  // owned?
  private static boolean Modifiers_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Modifiers_5")) return false;
    consumeToken(b, OWNED);
    return true;
  }

  // unowned?
  private static boolean Modifiers_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Modifiers_6")) return false;
    consumeToken(b, UNOWNED);
    return true;
  }

  // weak?
  private static boolean Modifiers_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Modifiers_7")) return false;
    consumeToken(b, WEAK);
    return true;
  }

  /* ********************************************************** */
  // namespace WHITESPACE? QualifiedIdentifier WHITESPACE? LBRACE NamespaceItems* RBRACE
  static boolean NamespaceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclaration")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAMESPACE);
    r = r && NamespaceDeclaration_1(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && NamespaceDeclaration_3(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && NamespaceDeclaration_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean NamespaceDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclaration_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean NamespaceDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclaration_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // NamespaceItems*
  private static boolean NamespaceDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclaration_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NamespaceItems(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NamespaceDeclaration_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Comments
  //                         | ClassDeclaration
  //                         | StructDeclaration
  //                         | EnumDeclaration
  //                         | InterfaceDeclaration
  //                         | MethodCall
  //                         | WHITESPACE
  //                         | ShortMethodDeclaration
  //                         | StandardMethodDeclaration
  //                         | VariableDeclaration
  //                         | ShortVariableDeclaration
  //                         | NamespaceDeclaration
  //                         | DestructionMethodCall
  //                         | ForLoop
  //                         | VariableAssignment
  //                         | IfStatement
  //                         | WhileStatement
  //                         | DoWhileFinallyStatement
  //                         | LPAREN NamespaceItems RPAREN
  static boolean NamespaceItems(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceItems")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Comments(b, l + 1);
    if (!r) r = ClassDeclaration(b, l + 1);
    if (!r) r = StructDeclaration(b, l + 1);
    if (!r) r = EnumDeclaration(b, l + 1);
    if (!r) r = InterfaceDeclaration(b, l + 1);
    if (!r) r = MethodCall(b, l + 1);
    if (!r) r = consumeToken(b, WHITESPACE);
    if (!r) r = ShortMethodDeclaration(b, l + 1);
    if (!r) r = StandardMethodDeclaration(b, l + 1);
    if (!r) r = VariableDeclaration(b, l + 1);
    if (!r) r = ShortVariableDeclaration(b, l + 1);
    if (!r) r = NamespaceDeclaration(b, l + 1);
    if (!r) r = DestructionMethodCall(b, l + 1);
    if (!r) r = ForLoop(b, l + 1);
    if (!r) r = VariableAssignment(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = WhileStatement(b, l + 1);
    if (!r) r = DoWhileFinallyStatement(b, l + 1);
    if (!r) r = NamespaceItems_18(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN NamespaceItems RPAREN
  private static boolean NamespaceItems_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceItems_18")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && NamespaceItems(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // InstantiationTypes QUESTION_MARK?
  static boolean NullableInstantiationTypes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NullableInstantiationTypes")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = InstantiationTypes(b, l + 1);
    r = r && NullableInstantiationTypes_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // QUESTION_MARK?
  private static boolean NullableInstantiationTypes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NullableInstantiationTypes_1")) return false;
    consumeToken(b, QUESTION_MARK);
    return true;
  }

  /* ********************************************************** */
  // ParameterModifiers WHITESPACE? NullableInstantiationTypes WHITESPACE? IDENTIFIER (WHITESPACE? EQUALS WHITESPACE? AssignmentValues)?
  static boolean Parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterModifiers(b, l + 1);
    r = r && Parameter_1(b, l + 1);
    r = r && NullableInstantiationTypes(b, l + 1);
    r = r && Parameter_3(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && Parameter_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean Parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean Parameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (WHITESPACE? EQUALS WHITESPACE? AssignmentValues)?
  private static boolean Parameter_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_5")) return false;
    Parameter_5_0(b, l + 1);
    return true;
  }

  // WHITESPACE? EQUALS WHITESPACE? AssignmentValues
  private static boolean Parameter_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameter_5_0_0(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && Parameter_5_0_2(b, l + 1);
    r = r && AssignmentValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean Parameter_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_5_0_0")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean Parameter_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter_5_0_2")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // Parameter WHITESPACE?(COMMA WHITESPACE? Parameter)*
  static boolean ParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameter(b, l + 1);
    r = r && ParameterList_1(b, l + 1);
    r = r && ParameterList_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (COMMA WHITESPACE? Parameter)*
  private static boolean ParameterList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ParameterList_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ParameterList_2", c)) break;
    }
    return true;
  }

  // COMMA WHITESPACE? Parameter
  private static boolean ParameterList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ParameterList_2_0_1(b, l + 1);
    r = r && Parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ParameterList_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_2_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // out? ref?
  static boolean ParameterModifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterModifiers")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterModifiers_0(b, l + 1);
    r = r && ParameterModifiers_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // out?
  private static boolean ParameterModifiers_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterModifiers_0")) return false;
    consumeToken(b, OUT);
    return true;
  }

  // ref?
  private static boolean ParameterModifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterModifiers_1")) return false;
    consumeToken(b, REF);
    return true;
  }

  /* ********************************************************** */
  // LPAREN AssignmentValues RPAREN
  static boolean ParenthesizedAssignmentValues(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenthesizedAssignmentValues")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && AssignmentValues(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN ConditionalExpressions RPAREN
  static boolean ParenthesizedConditionalExpressions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenthesizedConditionalExpressions")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ConditionalExpressions(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (IDENTIFIER | REGULAR_EXPRESSION) WHITESPACE? (DOT IDENTIFIER)* TypeArguments?
  static boolean QualifiedIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifier")) return false;
    if (!nextTokenIs(b, "", IDENTIFIER, REGULAR_EXPRESSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifier_0(b, l + 1);
    r = r && QualifiedIdentifier_1(b, l + 1);
    r = r && QualifiedIdentifier_2(b, l + 1);
    r = r && QualifiedIdentifier_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | REGULAR_EXPRESSION
  private static boolean QualifiedIdentifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifier_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, REGULAR_EXPRESSION);
    return r;
  }

  // WHITESPACE?
  private static boolean QualifiedIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifier_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (DOT IDENTIFIER)*
  private static boolean QualifiedIdentifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifier_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!QualifiedIdentifier_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QualifiedIdentifier_2", c)) break;
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean QualifiedIdentifier_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifier_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeArguments?
  private static boolean QualifiedIdentifier_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedIdentifier_3")) return false;
    TypeArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (STAR)? (IDENTIFIER) (STAR)? WHITESPACE? (DOT IDENTIFIER)* (STAR)? TypeArguments?
  static boolean QualifiedPointerableIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedPointerableIdentifier")) return false;
    if (!nextTokenIs(b, "", IDENTIFIER, STAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedPointerableIdentifier_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && QualifiedPointerableIdentifier_2(b, l + 1);
    r = r && QualifiedPointerableIdentifier_3(b, l + 1);
    r = r && QualifiedPointerableIdentifier_4(b, l + 1);
    r = r && QualifiedPointerableIdentifier_5(b, l + 1);
    r = r && QualifiedPointerableIdentifier_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (STAR)?
  private static boolean QualifiedPointerableIdentifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedPointerableIdentifier_0")) return false;
    consumeToken(b, STAR);
    return true;
  }

  // (STAR)?
  private static boolean QualifiedPointerableIdentifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedPointerableIdentifier_2")) return false;
    consumeToken(b, STAR);
    return true;
  }

  // WHITESPACE?
  private static boolean QualifiedPointerableIdentifier_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedPointerableIdentifier_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (DOT IDENTIFIER)*
  private static boolean QualifiedPointerableIdentifier_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedPointerableIdentifier_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!QualifiedPointerableIdentifier_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QualifiedPointerableIdentifier_4", c)) break;
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean QualifiedPointerableIdentifier_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedPointerableIdentifier_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // (STAR)?
  private static boolean QualifiedPointerableIdentifier_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedPointerableIdentifier_5")) return false;
    consumeToken(b, STAR);
    return true;
  }

  // TypeArguments?
  private static boolean QualifiedPointerableIdentifier_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedPointerableIdentifier_6")) return false;
    TypeArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // return WHITESPACE? (AssignmentValues ( WHITESPACE? (PLUS | MINUS | NOT_EQUALS | EXCLAMATION ) WHITESPACE? AssignmentValues)*)? SEMICOLON?
  static boolean ReturnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && ReturnStatement_1(b, l + 1);
    r = r && ReturnStatement_2(b, l + 1);
    r = r && ReturnStatement_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ReturnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (AssignmentValues ( WHITESPACE? (PLUS | MINUS | NOT_EQUALS | EXCLAMATION ) WHITESPACE? AssignmentValues)*)?
  private static boolean ReturnStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_2")) return false;
    ReturnStatement_2_0(b, l + 1);
    return true;
  }

  // AssignmentValues ( WHITESPACE? (PLUS | MINUS | NOT_EQUALS | EXCLAMATION ) WHITESPACE? AssignmentValues)*
  private static boolean ReturnStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssignmentValues(b, l + 1);
    r = r && ReturnStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WHITESPACE? (PLUS | MINUS | NOT_EQUALS | EXCLAMATION ) WHITESPACE? AssignmentValues)*
  private static boolean ReturnStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ReturnStatement_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReturnStatement_2_0_1", c)) break;
    }
    return true;
  }

  // WHITESPACE? (PLUS | MINUS | NOT_EQUALS | EXCLAMATION ) WHITESPACE? AssignmentValues
  private static boolean ReturnStatement_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ReturnStatement_2_0_1_0_0(b, l + 1);
    r = r && ReturnStatement_2_0_1_0_1(b, l + 1);
    r = r && ReturnStatement_2_0_1_0_2(b, l + 1);
    r = r && AssignmentValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ReturnStatement_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_2_0_1_0_0")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // PLUS | MINUS | NOT_EQUALS | EXCLAMATION
  private static boolean ReturnStatement_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_2_0_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, NOT_EQUALS);
    if (!r) r = consumeToken(b, EXCLAMATION);
    return r;
  }

  // WHITESPACE?
  private static boolean ReturnStatement_2_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_2_0_1_0_2")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // SEMICOLON?
  private static boolean ReturnStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStatement_3")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // void | NullableInstantiationTypes | null
  static boolean ReturnTypes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnTypes")) return false;
    boolean r;
    r = consumeToken(b, VOID);
    if (!r) r = NullableInstantiationTypes(b, l + 1);
    if (!r) r = consumeToken(b, NULL);
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
  // get WHITESPACE? SEMICOLON
  //                          | set WHITESPACE? SEMICOLON
  //                          | Comments
  //                          | default WHITESPACE? EQUALS WHITESPACE? (STRING_LITERAL | CHAR_LITERAL | NUMBER | QualifiedIdentifier SEMICOLON)
  //                          | ThisExpression
  //                          | LPAREN ShortMethodBody* RPAREN
  static boolean ShortMethodBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodBody")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShortMethodBody_0(b, l + 1);
    if (!r) r = ShortMethodBody_1(b, l + 1);
    if (!r) r = Comments(b, l + 1);
    if (!r) r = ShortMethodBody_3(b, l + 1);
    if (!r) r = ThisExpression(b, l + 1);
    if (!r) r = ShortMethodBody_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // get WHITESPACE? SEMICOLON
  private static boolean ShortMethodBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GET);
    r = r && ShortMethodBody_0_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ShortMethodBody_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodBody_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // set WHITESPACE? SEMICOLON
  private static boolean ShortMethodBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SET);
    r = r && ShortMethodBody_1_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ShortMethodBody_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodBody_1_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // default WHITESPACE? EQUALS WHITESPACE? (STRING_LITERAL | CHAR_LITERAL | NUMBER | QualifiedIdentifier SEMICOLON)
  private static boolean ShortMethodBody_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodBody_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFAULT);
    r = r && ShortMethodBody_3_1(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && ShortMethodBody_3_3(b, l + 1);
    r = r && ShortMethodBody_3_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ShortMethodBody_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodBody_3_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ShortMethodBody_3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodBody_3_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // STRING_LITERAL | CHAR_LITERAL | NUMBER | QualifiedIdentifier SEMICOLON
  private static boolean ShortMethodBody_3_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodBody_3_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, CHAR_LITERAL);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = ShortMethodBody_3_4_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // QualifiedIdentifier SEMICOLON
  private static boolean ShortMethodBody_3_4_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodBody_3_4_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifier(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN ShortMethodBody* RPAREN
  private static boolean ShortMethodBody_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodBody_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ShortMethodBody_5_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ShortMethodBody*
  private static boolean ShortMethodBody_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodBody_5_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ShortMethodBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ShortMethodBody_5_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AccessModifiers? WHITESPACE? WHITESPACE? ReturnTypes WHITESPACE? QualifiedIdentifier WHITESPACE? ThrowsExpression? WHITESPACE? LBRACE ShortMethodBody* RBRACE
  static boolean ShortMethodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShortMethodDeclaration_0(b, l + 1);
    r = r && ShortMethodDeclaration_1(b, l + 1);
    r = r && ShortMethodDeclaration_2(b, l + 1);
    r = r && ReturnTypes(b, l + 1);
    r = r && ShortMethodDeclaration_4(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && ShortMethodDeclaration_6(b, l + 1);
    r = r && ShortMethodDeclaration_7(b, l + 1);
    r = r && ShortMethodDeclaration_8(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && ShortMethodDeclaration_10(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifiers?
  private static boolean ShortMethodDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodDeclaration_0")) return false;
    AccessModifiers(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean ShortMethodDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodDeclaration_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ShortMethodDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodDeclaration_2")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ShortMethodDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodDeclaration_4")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ShortMethodDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodDeclaration_6")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ThrowsExpression?
  private static boolean ShortMethodDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodDeclaration_7")) return false;
    ThrowsExpression(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean ShortMethodDeclaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodDeclaration_8")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ShortMethodBody*
  private static boolean ShortMethodDeclaration_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortMethodDeclaration_10")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ShortMethodBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ShortMethodDeclaration_10", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AccessModifiers? WHITESPACE? Modifiers WHITESPACE? (NullableInstantiationTypes | var) WHITESPACE? QualifiedPointerableIdentifier WHITESPACE? SEMICOLON?
  static boolean ShortVariableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortVariableDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShortVariableDeclaration_0(b, l + 1);
    r = r && ShortVariableDeclaration_1(b, l + 1);
    r = r && Modifiers(b, l + 1);
    r = r && ShortVariableDeclaration_3(b, l + 1);
    r = r && ShortVariableDeclaration_4(b, l + 1);
    r = r && ShortVariableDeclaration_5(b, l + 1);
    r = r && QualifiedPointerableIdentifier(b, l + 1);
    r = r && ShortVariableDeclaration_7(b, l + 1);
    r = r && ShortVariableDeclaration_8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifiers?
  private static boolean ShortVariableDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortVariableDeclaration_0")) return false;
    AccessModifiers(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean ShortVariableDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortVariableDeclaration_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ShortVariableDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortVariableDeclaration_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // NullableInstantiationTypes | var
  private static boolean ShortVariableDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortVariableDeclaration_4")) return false;
    boolean r;
    r = NullableInstantiationTypes(b, l + 1);
    if (!r) r = consumeToken(b, VAR);
    return r;
  }

  // WHITESPACE?
  private static boolean ShortVariableDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortVariableDeclaration_5")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ShortVariableDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortVariableDeclaration_7")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // SEMICOLON?
  private static boolean ShortVariableDeclaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortVariableDeclaration_8")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // AccessModifiers? WHITESPACE? signal? Modifiers WHITESPACE? ReturnTypes WHITESPACE? QualifiedIdentifier WHITESPACE? LPAREN ParameterList? RPAREN WHITESPACE? (SEMICOLON )
  static boolean SpecialMethodSignatureDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialMethodSignatureDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SpecialMethodSignatureDeclaration_0(b, l + 1);
    r = r && SpecialMethodSignatureDeclaration_1(b, l + 1);
    r = r && SpecialMethodSignatureDeclaration_2(b, l + 1);
    r = r && Modifiers(b, l + 1);
    r = r && SpecialMethodSignatureDeclaration_4(b, l + 1);
    r = r && ReturnTypes(b, l + 1);
    r = r && SpecialMethodSignatureDeclaration_6(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && SpecialMethodSignatureDeclaration_8(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && SpecialMethodSignatureDeclaration_10(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && SpecialMethodSignatureDeclaration_12(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifiers?
  private static boolean SpecialMethodSignatureDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialMethodSignatureDeclaration_0")) return false;
    AccessModifiers(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean SpecialMethodSignatureDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialMethodSignatureDeclaration_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // signal?
  private static boolean SpecialMethodSignatureDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialMethodSignatureDeclaration_2")) return false;
    consumeToken(b, SIGNAL);
    return true;
  }

  // WHITESPACE?
  private static boolean SpecialMethodSignatureDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialMethodSignatureDeclaration_4")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean SpecialMethodSignatureDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialMethodSignatureDeclaration_6")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean SpecialMethodSignatureDeclaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialMethodSignatureDeclaration_8")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ParameterList?
  private static boolean SpecialMethodSignatureDeclaration_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialMethodSignatureDeclaration_10")) return false;
    ParameterList(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean SpecialMethodSignatureDeclaration_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialMethodSignatureDeclaration_12")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // AccessModifiers? WHITESPACE? Modifiers WHITESPACE? ReturnTypes WHITESPACE? QualifiedIdentifier WHITESPACE? WHITESPACE? LPAREN ParameterList? RPAREN WHITESPACE? ThrowsExpression? WHITESPACE? ((LBRACE MethodBody* RBRACE) | SEMICOLON )
  static boolean StandardMethodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StandardMethodDeclaration_0(b, l + 1);
    r = r && StandardMethodDeclaration_1(b, l + 1);
    r = r && Modifiers(b, l + 1);
    r = r && StandardMethodDeclaration_3(b, l + 1);
    r = r && ReturnTypes(b, l + 1);
    r = r && StandardMethodDeclaration_5(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && StandardMethodDeclaration_7(b, l + 1);
    r = r && StandardMethodDeclaration_8(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && StandardMethodDeclaration_10(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && StandardMethodDeclaration_12(b, l + 1);
    r = r && StandardMethodDeclaration_13(b, l + 1);
    r = r && StandardMethodDeclaration_14(b, l + 1);
    r = r && StandardMethodDeclaration_15(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifiers?
  private static boolean StandardMethodDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration_0")) return false;
    AccessModifiers(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean StandardMethodDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean StandardMethodDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean StandardMethodDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration_5")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean StandardMethodDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration_7")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean StandardMethodDeclaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration_8")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ParameterList?
  private static boolean StandardMethodDeclaration_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration_10")) return false;
    ParameterList(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean StandardMethodDeclaration_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration_12")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ThrowsExpression?
  private static boolean StandardMethodDeclaration_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration_13")) return false;
    ThrowsExpression(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean StandardMethodDeclaration_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration_14")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (LBRACE MethodBody* RBRACE) | SEMICOLON
  private static boolean StandardMethodDeclaration_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StandardMethodDeclaration_15_0(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE MethodBody* RBRACE
  private static boolean StandardMethodDeclaration_15_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration_15_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && StandardMethodDeclaration_15_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // MethodBody*
  private static boolean StandardMethodDeclaration_15_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StandardMethodDeclaration_15_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StandardMethodDeclaration_15_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AccessModifiers? WHITESPACE? struct WHITESPACE? QualifiedIdentifier WHITESPACE? LBRACE StructItems* RBRACE
  static boolean StructDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StructDeclaration_0(b, l + 1);
    r = r && StructDeclaration_1(b, l + 1);
    r = r && consumeToken(b, STRUCT);
    r = r && StructDeclaration_3(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && StructDeclaration_5(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && StructDeclaration_7(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifiers?
  private static boolean StructDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration_0")) return false;
    AccessModifiers(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean StructDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean StructDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean StructDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration_5")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // StructItems*
  private static boolean StructDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructDeclaration_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!StructItems(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StructDeclaration_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Comments
  //                      | WHITESPACE
  //                      | ShortVariableDeclaration
  //                      | ConstructorDeclaration
  static boolean StructItems(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructItems")) return false;
    boolean r;
    r = Comments(b, l + 1);
    if (!r) r = consumeToken(b, WHITESPACE);
    if (!r) r = ShortVariableDeclaration(b, l + 1);
    if (!r) r = ConstructorDeclaration(b, l + 1);
    return r;
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
  //                  | REGULAR_EXPRESSION
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
    if (!r) r = consumeToken(b, REGULAR_EXPRESSION);
    return r;
  }

  /* ********************************************************** */
  // this WHITESPACE? ((DOT QualifiedIdentifier)*)? ((LPAREN ParameterList? RPAREN) | (EQUALS WHITESPACE? AssignmentValues)) WHITESPACE? SEMICOLON?
  static boolean ThisExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThisExpression")) return false;
    if (!nextTokenIs(b, THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THIS);
    r = r && ThisExpression_1(b, l + 1);
    r = r && ThisExpression_2(b, l + 1);
    r = r && ThisExpression_3(b, l + 1);
    r = r && ThisExpression_4(b, l + 1);
    r = r && ThisExpression_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ThisExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThisExpression_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ((DOT QualifiedIdentifier)*)?
  private static boolean ThisExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThisExpression_2")) return false;
    ThisExpression_2_0(b, l + 1);
    return true;
  }

  // (DOT QualifiedIdentifier)*
  private static boolean ThisExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThisExpression_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ThisExpression_2_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ThisExpression_2_0", c)) break;
    }
    return true;
  }

  // DOT QualifiedIdentifier
  private static boolean ThisExpression_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThisExpression_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && QualifiedIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LPAREN ParameterList? RPAREN) | (EQUALS WHITESPACE? AssignmentValues)
  private static boolean ThisExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThisExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ThisExpression_3_0(b, l + 1);
    if (!r) r = ThisExpression_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN ParameterList? RPAREN
  private static boolean ThisExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThisExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ThisExpression_3_0_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ParameterList?
  private static boolean ThisExpression_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThisExpression_3_0_1")) return false;
    ParameterList(b, l + 1);
    return true;
  }

  // EQUALS WHITESPACE? AssignmentValues
  private static boolean ThisExpression_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThisExpression_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && ThisExpression_3_1_1(b, l + 1);
    r = r && AssignmentValues(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ThisExpression_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThisExpression_3_1_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean ThisExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThisExpression_4")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // SEMICOLON?
  private static boolean ThisExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThisExpression_5")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // throws WHITESPACE? (QualifiedIdentifier WHITESPACE? (COMMA WHITESPACE? QualifiedIdentifier)*)?
  static boolean ThrowsExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowsExpression")) return false;
    if (!nextTokenIs(b, THROWS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THROWS);
    r = r && ThrowsExpression_1(b, l + 1);
    r = r && ThrowsExpression_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ThrowsExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowsExpression_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (QualifiedIdentifier WHITESPACE? (COMMA WHITESPACE? QualifiedIdentifier)*)?
  private static boolean ThrowsExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowsExpression_2")) return false;
    ThrowsExpression_2_0(b, l + 1);
    return true;
  }

  // QualifiedIdentifier WHITESPACE? (COMMA WHITESPACE? QualifiedIdentifier)*
  private static boolean ThrowsExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowsExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifier(b, l + 1);
    r = r && ThrowsExpression_2_0_1(b, l + 1);
    r = r && ThrowsExpression_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ThrowsExpression_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowsExpression_2_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (COMMA WHITESPACE? QualifiedIdentifier)*
  private static boolean ThrowsExpression_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowsExpression_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ThrowsExpression_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ThrowsExpression_2_0_2", c)) break;
    }
    return true;
  }

  // COMMA WHITESPACE? QualifiedIdentifier
  private static boolean ThrowsExpression_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowsExpression_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ThrowsExpression_2_0_2_0_1(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean ThrowsExpression_2_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowsExpression_2_0_2_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // LESS_THAN WHITESPACE? InstantiationTypes (COMMA WHITESPACE? InstantiationTypes)* WHITESPACE? GREATER_THAN
  static boolean TypeArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArguments")) return false;
    if (!nextTokenIs(b, LESS_THAN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS_THAN);
    r = r && TypeArguments_1(b, l + 1);
    r = r && InstantiationTypes(b, l + 1);
    r = r && TypeArguments_3(b, l + 1);
    r = r && TypeArguments_4(b, l + 1);
    r = r && consumeToken(b, GREATER_THAN);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean TypeArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArguments_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (COMMA WHITESPACE? InstantiationTypes)*
  private static boolean TypeArguments_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArguments_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeArguments_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeArguments_3", c)) break;
    }
    return true;
  }

  // COMMA WHITESPACE? InstantiationTypes
  private static boolean TypeArguments_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArguments_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeArguments_3_0_1(b, l + 1);
    r = r && InstantiationTypes(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean TypeArguments_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArguments_3_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean TypeArguments_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArguments_4")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // Symbols
  //                           | Identifiers
  //                           | Keywords
  //                           | CInstructions
  //                           | InstantiationTypes
  //                           | ReturnTypes
  static boolean UnimplementedTokens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnimplementedTokens")) return false;
    boolean r;
    r = Symbols(b, l + 1);
    if (!r) r = Identifiers(b, l + 1);
    if (!r) r = Keywords(b, l + 1);
    if (!r) r = CInstructions(b, l + 1);
    if (!r) r = InstantiationTypes(b, l + 1);
    if (!r) r = ReturnTypes(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // using WHITESPACE? QualifiedIdentifier WHITESPACE? SEMICOLON
  static boolean UsingDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UsingDeclaration")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USING);
    r = r && UsingDeclaration_1(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && UsingDeclaration_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean UsingDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UsingDeclaration_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean UsingDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UsingDeclaration_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // (INCREMENT | DECREMENT)? QualifiedIdentifier WHITESPACE? (((VariableAssignmentOperations) WHITESPACE? (ParenthesizedConditionalExpressions | ConditionalExpressions | ParenthesizedAssignmentValues | AssignmentValues)) | (INCREMENT | DECREMENT)) SEMICOLON?
  static boolean VariableAssignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableAssignment")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableAssignment_0(b, l + 1);
    r = r && QualifiedIdentifier(b, l + 1);
    r = r && VariableAssignment_2(b, l + 1);
    r = r && VariableAssignment_3(b, l + 1);
    r = r && VariableAssignment_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (INCREMENT | DECREMENT)?
  private static boolean VariableAssignment_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableAssignment_0")) return false;
    VariableAssignment_0_0(b, l + 1);
    return true;
  }

  // INCREMENT | DECREMENT
  private static boolean VariableAssignment_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableAssignment_0_0")) return false;
    boolean r;
    r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    return r;
  }

  // WHITESPACE?
  private static boolean VariableAssignment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableAssignment_2")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ((VariableAssignmentOperations) WHITESPACE? (ParenthesizedConditionalExpressions | ConditionalExpressions | ParenthesizedAssignmentValues | AssignmentValues)) | (INCREMENT | DECREMENT)
  private static boolean VariableAssignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableAssignment_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableAssignment_3_0(b, l + 1);
    if (!r) r = VariableAssignment_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (VariableAssignmentOperations) WHITESPACE? (ParenthesizedConditionalExpressions | ConditionalExpressions | ParenthesizedAssignmentValues | AssignmentValues)
  private static boolean VariableAssignment_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableAssignment_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableAssignment_3_0_0(b, l + 1);
    r = r && VariableAssignment_3_0_1(b, l + 1);
    r = r && VariableAssignment_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (VariableAssignmentOperations)
  private static boolean VariableAssignment_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableAssignment_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableAssignmentOperations(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean VariableAssignment_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableAssignment_3_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // ParenthesizedConditionalExpressions | ConditionalExpressions | ParenthesizedAssignmentValues | AssignmentValues
  private static boolean VariableAssignment_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableAssignment_3_0_2")) return false;
    boolean r;
    r = ParenthesizedConditionalExpressions(b, l + 1);
    if (!r) r = ConditionalExpressions(b, l + 1);
    if (!r) r = ParenthesizedAssignmentValues(b, l + 1);
    if (!r) r = AssignmentValues(b, l + 1);
    return r;
  }

  // INCREMENT | DECREMENT
  private static boolean VariableAssignment_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableAssignment_3_1")) return false;
    boolean r;
    r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    return r;
  }

  // SEMICOLON?
  private static boolean VariableAssignment_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableAssignment_4")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // EQUALS
  //                                       | PLUS_EQUALS
  //                                       | MINUS_EQUALS
  //                                       | DIVIDE_EQUALS
  //                                       | MODULO_EQUALS
  //                                       | MULTIPLY_EQUALS
  //                                       | PLUS
  //                                       | MINUS
  //                                       | FORWARD_SLASH
  //                                       | STAR
  //                                       | PERCENT
  static boolean VariableAssignmentOperations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableAssignmentOperations")) return false;
    boolean r;
    r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, PLUS_EQUALS);
    if (!r) r = consumeToken(b, MINUS_EQUALS);
    if (!r) r = consumeToken(b, DIVIDE_EQUALS);
    if (!r) r = consumeToken(b, MODULO_EQUALS);
    if (!r) r = consumeToken(b, MULTIPLY_EQUALS);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, FORWARD_SLASH);
    if (!r) r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, PERCENT);
    return r;
  }

  /* ********************************************************** */
  // AccessModifiers? WHITESPACE? Modifiers WHITESPACE? (NullableInstantiationTypes | var) WHITESPACE?
  //         (QualifiedPointerableIdentifier WHITESPACE? (EQUALS WHITESPACE? (AssignmentValues | ConditionalExpressions))?
  //         WHITESPACE? (COMMA WHITESPACE? QualifiedPointerableIdentifier (WHITESPACE? EQUALS WHITESPACE? (AssignmentValues | ConditionalExpressions)))*) SEMICOLON?
  static boolean VariableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDeclaration_0(b, l + 1);
    r = r && VariableDeclaration_1(b, l + 1);
    r = r && Modifiers(b, l + 1);
    r = r && VariableDeclaration_3(b, l + 1);
    r = r && VariableDeclaration_4(b, l + 1);
    r = r && VariableDeclaration_5(b, l + 1);
    r = r && VariableDeclaration_6(b, l + 1);
    r = r && VariableDeclaration_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AccessModifiers?
  private static boolean VariableDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_0")) return false;
    AccessModifiers(b, l + 1);
    return true;
  }

  // WHITESPACE?
  private static boolean VariableDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean VariableDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // NullableInstantiationTypes | var
  private static boolean VariableDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_4")) return false;
    boolean r;
    r = NullableInstantiationTypes(b, l + 1);
    if (!r) r = consumeToken(b, VAR);
    return r;
  }

  // WHITESPACE?
  private static boolean VariableDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_5")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // QualifiedPointerableIdentifier WHITESPACE? (EQUALS WHITESPACE? (AssignmentValues | ConditionalExpressions))?
  //         WHITESPACE? (COMMA WHITESPACE? QualifiedPointerableIdentifier (WHITESPACE? EQUALS WHITESPACE? (AssignmentValues | ConditionalExpressions)))*
  private static boolean VariableDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedPointerableIdentifier(b, l + 1);
    r = r && VariableDeclaration_6_1(b, l + 1);
    r = r && VariableDeclaration_6_2(b, l + 1);
    r = r && VariableDeclaration_6_3(b, l + 1);
    r = r && VariableDeclaration_6_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean VariableDeclaration_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (EQUALS WHITESPACE? (AssignmentValues | ConditionalExpressions))?
  private static boolean VariableDeclaration_6_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6_2")) return false;
    VariableDeclaration_6_2_0(b, l + 1);
    return true;
  }

  // EQUALS WHITESPACE? (AssignmentValues | ConditionalExpressions)
  private static boolean VariableDeclaration_6_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && VariableDeclaration_6_2_0_1(b, l + 1);
    r = r && VariableDeclaration_6_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean VariableDeclaration_6_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6_2_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // AssignmentValues | ConditionalExpressions
  private static boolean VariableDeclaration_6_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6_2_0_2")) return false;
    boolean r;
    r = AssignmentValues(b, l + 1);
    if (!r) r = ConditionalExpressions(b, l + 1);
    return r;
  }

  // WHITESPACE?
  private static boolean VariableDeclaration_6_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (COMMA WHITESPACE? QualifiedPointerableIdentifier (WHITESPACE? EQUALS WHITESPACE? (AssignmentValues | ConditionalExpressions)))*
  private static boolean VariableDeclaration_6_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VariableDeclaration_6_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VariableDeclaration_6_4", c)) break;
    }
    return true;
  }

  // COMMA WHITESPACE? QualifiedPointerableIdentifier (WHITESPACE? EQUALS WHITESPACE? (AssignmentValues | ConditionalExpressions))
  private static boolean VariableDeclaration_6_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && VariableDeclaration_6_4_0_1(b, l + 1);
    r = r && QualifiedPointerableIdentifier(b, l + 1);
    r = r && VariableDeclaration_6_4_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean VariableDeclaration_6_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6_4_0_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE? EQUALS WHITESPACE? (AssignmentValues | ConditionalExpressions)
  private static boolean VariableDeclaration_6_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6_4_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableDeclaration_6_4_0_3_0(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && VariableDeclaration_6_4_0_3_2(b, l + 1);
    r = r && VariableDeclaration_6_4_0_3_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean VariableDeclaration_6_4_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6_4_0_3_0")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean VariableDeclaration_6_4_0_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6_4_0_3_2")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // AssignmentValues | ConditionalExpressions
  private static boolean VariableDeclaration_6_4_0_3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_6_4_0_3_3")) return false;
    boolean r;
    r = AssignmentValues(b, l + 1);
    if (!r) r = ConditionalExpressions(b, l + 1);
    return r;
  }

  // SEMICOLON?
  private static boolean VariableDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDeclaration_7")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // MethodBody
  static boolean WhileBody(PsiBuilder b, int l) {
    return MethodBody(b, l + 1);
  }

  /* ********************************************************** */
  // while WHITESPACE? LPAREN WHITESPACE? (ConditionalExpressions) RPAREN WHITESPACE? (LBRACE WhileBody* RBRACE | SEMICOLON)
  static boolean WhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && WhileStatement_1(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && WhileStatement_3(b, l + 1);
    r = r && WhileStatement_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && WhileStatement_6(b, l + 1);
    r = r && WhileStatement_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean WhileStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement_1")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean WhileStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement_3")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // (ConditionalExpressions)
  private static boolean WhileStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConditionalExpressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE?
  private static boolean WhileStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement_6")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // LBRACE WhileBody* RBRACE | SEMICOLON
  private static boolean WhileStatement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WhileStatement_7_0(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE WhileBody* RBRACE
  private static boolean WhileStatement_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && WhileStatement_7_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // WhileBody*
  private static boolean WhileStatement_7_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStatement_7_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WhileBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WhileStatement_7_0_1", c)) break;
    }
    return true;
  }

}
