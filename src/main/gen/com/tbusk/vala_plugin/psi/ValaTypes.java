// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tbusk.vala_plugin.psi.impl.*;

public interface ValaTypes {

  IElementType BASE_LIST = new ValaElementType("BASE_LIST");
  IElementType CLASS_DECLARATION = new ValaElementType("CLASS_DECLARATION");
  IElementType CLASS_MEMBER = new ValaElementType("CLASS_MEMBER");
  IElementType DECLARATION = new ValaElementType("DECLARATION");
  IElementType DELEGATE_DECLARATION = new ValaElementType("DELEGATE_DECLARATION");
  IElementType DELEGATE_MEMBER = new ValaElementType("DELEGATE_MEMBER");
  IElementType ENUM_DECLARATION = new ValaElementType("ENUM_DECLARATION");
  IElementType ENUM_MEMBER = new ValaElementType("ENUM_MEMBER");
  IElementType FUNCTION_BODY = new ValaElementType("FUNCTION_BODY");
  IElementType FUNCTION_DECLARATION = new ValaElementType("FUNCTION_DECLARATION");
  IElementType INTERFACE_DECLARATION = new ValaElementType("INTERFACE_DECLARATION");
  IElementType INTERFACE_MEMBER = new ValaElementType("INTERFACE_MEMBER");
  IElementType MODIFIER = new ValaElementType("MODIFIER");
  IElementType NAMESPACE_DECLARATION = new ValaElementType("NAMESPACE_DECLARATION");
  IElementType PARAMETER = new ValaElementType("PARAMETER");
  IElementType PARAMETER_LIST = new ValaElementType("PARAMETER_LIST");
  IElementType PROPERTY = new ValaElementType("PROPERTY");
  IElementType PROPERTY_DECLARATION = new ValaElementType("PROPERTY_DECLARATION");
  IElementType QUALIFIED_NAME = new ValaElementType("QUALIFIED_NAME");
  IElementType STRUCT_DECLARATION = new ValaElementType("STRUCT_DECLARATION");
  IElementType STRUCT_MEMBER = new ValaElementType("STRUCT_MEMBER");
  IElementType TYPE = new ValaElementType("TYPE");
  IElementType TYPE_PARAMETERS = new ValaElementType("TYPE_PARAMETERS");
  IElementType VARIABLE_DECLARATION = new ValaElementType("VARIABLE_DECLARATION");

  IElementType ABSTRACT = new ValaTokenType("abstract");
  IElementType AND = new ValaTokenType("&&");
  IElementType ASYNC = new ValaTokenType("async");
  IElementType BASE = new ValaTokenType("base");
  IElementType BLOCK_COMMENT = new ValaTokenType("BLOCK_COMMENT");
  IElementType BOOL_LITERAL = new ValaTokenType("true|false");
  IElementType BREAK = new ValaTokenType("break");
  IElementType CASE = new ValaTokenType("case");
  IElementType CATCH = new ValaTokenType("catch");
  IElementType CHAR_LITERAL = new ValaTokenType("CHAR_LITERAL");
  IElementType CLASS = new ValaTokenType("class");
  IElementType COLON = new ValaTokenType(":");
  IElementType COMMA = new ValaTokenType(",");
  IElementType CONTINUE = new ValaTokenType("continue");
  IElementType DEFAULT = new ValaTokenType("default");
  IElementType DELEGATE = new ValaTokenType("delegate");
  IElementType DIVIDE = new ValaTokenType("/");
  IElementType DO = new ValaTokenType("do");
  IElementType DOC_COMMENT = new ValaTokenType("DOC_COMMENT");
  IElementType DOT = new ValaTokenType(".");
  IElementType ELSE = new ValaTokenType("else");
  IElementType ENUM = new ValaTokenType("enum");
  IElementType EQUALS = new ValaTokenType("=");
  IElementType EQUALS_OP = new ValaTokenType("==");
  IElementType EXPRESSION = new ValaTokenType("expression");
  IElementType FINALLY = new ValaTokenType("finally");
  IElementType FLOAT_LITERAL = new ValaTokenType("FLOAT_LITERAL");
  IElementType FOR = new ValaTokenType("for");
  IElementType FOREACH = new ValaTokenType("foreach");
  IElementType GREATER = new ValaTokenType(">");
  IElementType GREATER_EQUAL = new ValaTokenType(">=");
  IElementType IDENTIFIER = new ValaTokenType("IDENTIFIER");
  IElementType IF = new ValaTokenType("if");
  IElementType INTEGER_LITERAL = new ValaTokenType("INTEGER_LITERAL");
  IElementType INTERFACE = new ValaTokenType("interface");
  IElementType INTERNAL = new ValaTokenType("internal");
  IElementType LAMBDA_ARROW = new ValaTokenType("=>");
  IElementType LBRACE = new ValaTokenType("{");
  IElementType LBRACKET = new ValaTokenType("[");
  IElementType LESS = new ValaTokenType("<");
  IElementType LESS_EQUAL = new ValaTokenType("<=");
  IElementType LINE_COMMENT = new ValaTokenType("LINE_COMMENT");
  IElementType LPAREN = new ValaTokenType("(");
  IElementType MINUS = new ValaTokenType("-");
  IElementType MODULO = new ValaTokenType("%");
  IElementType MULTIPLY = new ValaTokenType("*");
  IElementType NAMESPACE = new ValaTokenType("namespace");
  IElementType NEW = new ValaTokenType("new");
  IElementType NOT = new ValaTokenType("!");
  IElementType NOT_EQUALS = new ValaTokenType("!=");
  IElementType NULL_COALESCE = new ValaTokenType("??");
  IElementType NULL_CONDITIONAL = new ValaTokenType("?.");
  IElementType OR = new ValaTokenType("||");
  IElementType OVERRIDE = new ValaTokenType("override");
  IElementType PLUS = new ValaTokenType("+");
  IElementType PRIVATE = new ValaTokenType("private");
  IElementType PROTECTED = new ValaTokenType("protected");
  IElementType PUBLIC = new ValaTokenType("public");
  IElementType RBRACE = new ValaTokenType("}");
  IElementType RBRACKET = new ValaTokenType("]");
  IElementType RETURN = new ValaTokenType("return");
  IElementType RPAREN = new ValaTokenType(")");
  IElementType SEMICOLON = new ValaTokenType(";");
  IElementType STATEMENT = new ValaTokenType("statement");
  IElementType STATIC = new ValaTokenType("static");
  IElementType STRING_LITERAL = new ValaTokenType("STRING_LITERAL");
  IElementType STRUCT = new ValaTokenType("struct");
  IElementType SWITCH = new ValaTokenType("switch");
  IElementType THIS = new ValaTokenType("this");
  IElementType TRY = new ValaTokenType("try");
  IElementType UNOWNED = new ValaTokenType("unowned");
  IElementType VIRTUAL = new ValaTokenType("virtual");
  IElementType VOID = new ValaTokenType("void");
  IElementType WHILE = new ValaTokenType("while");
  IElementType WHITESPACE = new ValaTokenType("WHITE_SPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BASE_LIST) {
        return new ValaBaseListImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new ValaClassDeclarationImpl(node);
      }
      else if (type == CLASS_MEMBER) {
        return new ValaClassMemberImpl(node);
      }
      else if (type == DECLARATION) {
        return new ValaDeclarationImpl(node);
      }
      else if (type == DELEGATE_DECLARATION) {
        return new ValaDelegateDeclarationImpl(node);
      }
      else if (type == DELEGATE_MEMBER) {
        return new ValaDelegateMemberImpl(node);
      }
      else if (type == ENUM_DECLARATION) {
        return new ValaEnumDeclarationImpl(node);
      }
      else if (type == ENUM_MEMBER) {
        return new ValaEnumMemberImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new ValaFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new ValaFunctionDeclarationImpl(node);
      }
      else if (type == INTERFACE_DECLARATION) {
        return new ValaInterfaceDeclarationImpl(node);
      }
      else if (type == INTERFACE_MEMBER) {
        return new ValaInterfaceMemberImpl(node);
      }
      else if (type == MODIFIER) {
        return new ValaModifierImpl(node);
      }
      else if (type == NAMESPACE_DECLARATION) {
        return new ValaNamespaceDeclarationImpl(node);
      }
      else if (type == PARAMETER) {
        return new ValaParameterImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new ValaParameterListImpl(node);
      }
      else if (type == PROPERTY) {
        return new ValaPropertyImpl(node);
      }
      else if (type == PROPERTY_DECLARATION) {
        return new ValaPropertyDeclarationImpl(node);
      }
      else if (type == QUALIFIED_NAME) {
        return new ValaQualifiedNameImpl(node);
      }
      else if (type == STRUCT_DECLARATION) {
        return new ValaStructDeclarationImpl(node);
      }
      else if (type == STRUCT_MEMBER) {
        return new ValaStructMemberImpl(node);
      }
      else if (type == TYPE) {
        return new ValaTypeImpl(node);
      }
      else if (type == TYPE_PARAMETERS) {
        return new ValaTypeParametersImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new ValaVariableDeclarationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
