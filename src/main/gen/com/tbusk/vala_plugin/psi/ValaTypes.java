// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tbusk.vala_plugin.psi.impl.*;

public interface ValaTypes {

  IElementType ASSIGNMENTS = new ValaElementType("ASSIGNMENTS");
  IElementType BITWISE = new ValaElementType("BITWISE");
  IElementType CHECKS = new ValaElementType("CHECKS");
  IElementType CLASS_ACCESS_MODIFIERS = new ValaElementType("CLASS_ACCESS_MODIFIERS");
  IElementType CLASS_DECLARATION = new ValaElementType("CLASS_DECLARATION");
  IElementType COMMENTS = new ValaElementType("COMMENTS");
  IElementType DATA_STRUCTURES = new ValaElementType("DATA_STRUCTURES");
  IElementType EXPRESSION = new ValaElementType("EXPRESSION");
  IElementType METHOD_ACCESS_MODIFIERS = new ValaElementType("METHOD_ACCESS_MODIFIERS");
  IElementType METHOD_DECLARATION = new ValaElementType("METHOD_DECLARATION");
  IElementType MISC_KEYWORDS = new ValaElementType("MISC_KEYWORDS");
  IElementType MODIFIERS = new ValaElementType("MODIFIERS");
  IElementType NAMESPACE_STATEMENT = new ValaElementType("NAMESPACE_STATEMENT");
  IElementType OPERATORS = new ValaElementType("OPERATORS");
  IElementType RETURN_TYPES = new ValaElementType("RETURN_TYPES");
  IElementType STATEMENT = new ValaElementType("STATEMENT");
  IElementType STATEMENT_EXPRESSION = new ValaElementType("STATEMENT_EXPRESSION");
  IElementType USING_STATEMENT = new ValaElementType("USING_STATEMENT");
  IElementType VALUE_TYPES = new ValaElementType("VALUE_TYPES");
  IElementType VARIABLE_ACCESS_MODIFIERS = new ValaElementType("VARIABLE_ACCESS_MODIFIERS");
  IElementType VARIABLE_TYPES = new ValaElementType("VARIABLE_TYPES");

  IElementType ABSTRACT = new ValaTokenType("ABSTRACT");
  IElementType ACCESS_MODIFIERS = new ValaTokenType("access_modifiers");
  IElementType AND = new ValaTokenType("&&");
  IElementType AS = new ValaTokenType("AS");
  IElementType ASSERT_STATEMENT = new ValaTokenType("assert_statement");
  IElementType AT = new ValaTokenType("@");
  IElementType BITWISE_AND = new ValaTokenType("BITWISE_AND");
  IElementType BITWISE_AND_EQUALS = new ValaTokenType("BITWISE_AND_EQUALS");
  IElementType BITWISE_NOT = new ValaTokenType("BITWISE_NOT");
  IElementType BITWISE_OR = new ValaTokenType("BITWISE_OR");
  IElementType BITWISE_OR_EQUALS = new ValaTokenType("BITWISE_OR_EQUALS");
  IElementType BITWISE_SHIFT_LEFT = new ValaTokenType("BITWISE_SHIFT_LEFT");
  IElementType BITWISE_SHIFT_LEFT_EQUALS = new ValaTokenType("BITWISE_SHIFT_LEFT_EQUALS");
  IElementType BITWISE_SHIFT_RIGHT = new ValaTokenType("BITWISE_SHIFT_RIGHT");
  IElementType BITWISE_SHIFT_RIGHT_EQUALS = new ValaTokenType("BITWISE_SHIFT_RIGHT_EQUALS");
  IElementType BITWISE_XOR = new ValaTokenType("BITWISE_XOR");
  IElementType BITWISE_XOR_EQUALS = new ValaTokenType("BITWISE_XOR_EQUALS");
  IElementType BLOCK_COMMENT = new ValaTokenType("BLOCK_COMMENT");
  IElementType BOOL = new ValaTokenType("BOOL");
  IElementType BREAK_STATEMENT = new ValaTokenType("break_statement");
  IElementType CASE_STATEMENT = new ValaTokenType("case_statement");
  IElementType CHAR = new ValaTokenType("CHAR");
  IElementType CLASS = new ValaTokenType("CLASS");
  IElementType COLON = new ValaTokenType(":");
  IElementType COMMA = new ValaTokenType(",");
  IElementType COMMENT = new ValaTokenType("COMMENT");
  IElementType CONSTRUCTOR_DECLARATION = new ValaTokenType("constructor_declaration");
  IElementType CONTINUE_STATEMENT = new ValaTokenType("continue_statement");
  IElementType CRITICAL = new ValaTokenType("CRITICAL");
  IElementType DECLARATION = new ValaTokenType("declaration");
  IElementType DECREMENT = new ValaTokenType("--");
  IElementType DEFAULT_STATEMENT = new ValaTokenType("default_statement");
  IElementType DIVIDE = new ValaTokenType("/");
  IElementType DIVIDE_EQUALS = new ValaTokenType("/=");
  IElementType DOC_COMMENT = new ValaTokenType("DOC_COMMENT");
  IElementType DOT = new ValaTokenType(".");
  IElementType DOUBLE = new ValaTokenType("DOUBLE");
  IElementType DOUBLE_EQUALS = new ValaTokenType("==");
  IElementType ELSE = new ValaTokenType("else");
  IElementType ENUM_DECLARATION = new ValaTokenType("enum_declaration");
  IElementType EQUALS = new ValaTokenType("=");
  IElementType FALSE = new ValaTokenType("FALSE");
  IElementType FIELD_DECLARATION = new ValaTokenType("field_declaration");
  IElementType FLOAT = new ValaTokenType("FLOAT");
  IElementType FOR_STATEMENT = new ValaTokenType("FOR_STATEMENT");
  IElementType GREATER_THAN = new ValaTokenType("GREATER_THAN");
  IElementType GREATER_THAN_EQUALS = new ValaTokenType("GREATER_THAN_EQUALS");
  IElementType IDENTIFER = new ValaTokenType("IDENTIFER");
  IElementType IDENTIFIER = new ValaTokenType("IDENTIFIER");
  IElementType IF_STATEMENT = new ValaTokenType("IF_STATEMENT");
  IElementType IN = new ValaTokenType("IN");
  IElementType INCREMENT = new ValaTokenType("++");
  IElementType INT = new ValaTokenType("INT");
  IElementType INT16 = new ValaTokenType("INT16");
  IElementType INT32 = new ValaTokenType("INT32");
  IElementType INT64 = new ValaTokenType("INT64");
  IElementType INT8 = new ValaTokenType("INT8");
  IElementType INTERFACE_DECLARATION = new ValaTokenType("interface_declaration");
  IElementType INTERNAL = new ValaTokenType("INTERNAL");
  IElementType LBRACE = new ValaTokenType("{");
  IElementType LBRACKET = new ValaTokenType("[");
  IElementType LESS_THAN = new ValaTokenType("LESS_THAN");
  IElementType LESS_THAN_EQUALS = new ValaTokenType("LESS_THAN_EQUALS");
  IElementType LONG = new ValaTokenType("LONG");
  IElementType LPAREN = new ValaTokenType("(");
  IElementType MINUS = new ValaTokenType("-");
  IElementType MINUS_EQUALS = new ValaTokenType("-=");
  IElementType MODULO = new ValaTokenType("%");
  IElementType MODULO_EQUALS = new ValaTokenType("%=");
  IElementType MULTIPLY = new ValaTokenType("*");
  IElementType MULTIPLY_EQUALS = new ValaTokenType("*=");
  IElementType NAMESPACE = new ValaTokenType("NAMESPACE");
  IElementType NOT = new ValaTokenType("!");
  IElementType NOT_EQUALS = new ValaTokenType("!=");
  IElementType NULL = new ValaTokenType("NULL");
  IElementType NUMBER = new ValaTokenType("NUMBER");
  IElementType OF = new ValaTokenType("OF");
  IElementType OR = new ValaTokenType("||");
  IElementType OVERRIDE = new ValaTokenType("OVERRIDE");
  IElementType PLUS = new ValaTokenType("+");
  IElementType PLUS_EQUALS = new ValaTokenType("+=");
  IElementType POINTER = new ValaTokenType("POINTER");
  IElementType PRIVATE = new ValaTokenType("PRIVATE");
  IElementType PROPERTY_DECLARATION = new ValaTokenType("property_declaration");
  IElementType PROTECTED = new ValaTokenType("PROTECTED");
  IElementType PUBLIC = new ValaTokenType("PUBLIC");
  IElementType QUESTION_MARK = new ValaTokenType("?");
  IElementType RBRACE = new ValaTokenType("}");
  IElementType RBRACKET = new ValaTokenType("]");
  IElementType REFERENCE = new ValaTokenType("REFERENCE");
  IElementType RETURN_STATEMENT = new ValaTokenType("return_statement");
  IElementType RPAREN = new ValaTokenType(")");
  IElementType SEMICOLON = new ValaTokenType("semicolon");
  IElementType SHORT = new ValaTokenType("SHORT");
  IElementType STATIC = new ValaTokenType("STATIC");
  IElementType STRING = new ValaTokenType("STRING");
  IElementType STRING_LITERAL = new ValaTokenType("STRING_LITERAL");
  IElementType STRUCT_DECLARATION = new ValaTokenType("struct_declaration");
  IElementType SWITCH_STATEMENT = new ValaTokenType("switch_statement");
  IElementType TRUE = new ValaTokenType("TRUE");
  IElementType TRY_STATEMENT = new ValaTokenType("try_statement");
  IElementType UCHAR = new ValaTokenType("UCHAR");
  IElementType UINT = new ValaTokenType("UINT");
  IElementType UINT16 = new ValaTokenType("UINT16");
  IElementType UINT32 = new ValaTokenType("UINT32");
  IElementType UINT64 = new ValaTokenType("UINT64");
  IElementType UINT8 = new ValaTokenType("UINT8");
  IElementType ULONG = new ValaTokenType("ULONG");
  IElementType UNICHAR = new ValaTokenType("UNICHAR");
  IElementType UNOWNED = new ValaTokenType("UNOWNED");
  IElementType USHORT = new ValaTokenType("USHORT");
  IElementType USING = new ValaTokenType("USING");
  IElementType VAR = new ValaTokenType("VAR");
  IElementType VIRTUAL = new ValaTokenType("VIRTUAL");
  IElementType VOID = new ValaTokenType("VOID");
  IElementType WHILE_STATEMENT = new ValaTokenType("while_statement");
  IElementType WHITE_SPACE = new ValaTokenType("WHITE_SPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSIGNMENTS) {
        return new ValaAssignmentsImpl(node);
      }
      else if (type == BITWISE) {
        return new ValaBitwiseImpl(node);
      }
      else if (type == CHECKS) {
        return new ValaChecksImpl(node);
      }
      else if (type == CLASS_ACCESS_MODIFIERS) {
        return new ValaClassAccessModifiersImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new ValaClassDeclarationImpl(node);
      }
      else if (type == COMMENTS) {
        return new ValaCommentsImpl(node);
      }
      else if (type == DATA_STRUCTURES) {
        return new ValaDataStructuresImpl(node);
      }
      else if (type == EXPRESSION) {
        return new ValaExpressionImpl(node);
      }
      else if (type == METHOD_ACCESS_MODIFIERS) {
        return new ValaMethodAccessModifiersImpl(node);
      }
      else if (type == METHOD_DECLARATION) {
        return new ValaMethodDeclarationImpl(node);
      }
      else if (type == MISC_KEYWORDS) {
        return new ValaMiscKeywordsImpl(node);
      }
      else if (type == MODIFIERS) {
        return new ValaModifiersImpl(node);
      }
      else if (type == NAMESPACE_STATEMENT) {
        return new ValaNamespaceStatementImpl(node);
      }
      else if (type == OPERATORS) {
        return new ValaOperatorsImpl(node);
      }
      else if (type == RETURN_TYPES) {
        return new ValaReturnTypesImpl(node);
      }
      else if (type == STATEMENT) {
        return new ValaStatementImpl(node);
      }
      else if (type == STATEMENT_EXPRESSION) {
        return new ValaStatementExpressionImpl(node);
      }
      else if (type == USING_STATEMENT) {
        return new ValaUsingStatementImpl(node);
      }
      else if (type == VALUE_TYPES) {
        return new ValaValueTypesImpl(node);
      }
      else if (type == VARIABLE_ACCESS_MODIFIERS) {
        return new ValaVariableAccessModifiersImpl(node);
      }
      else if (type == VARIABLE_TYPES) {
        return new ValaVariableTypesImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
