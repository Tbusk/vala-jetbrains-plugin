// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tbusk.vala_plugin.psi.impl.*;

public interface ValaTypes {

  IElementType DEFINITION = new ValaElementType("DEFINITION");

  IElementType ABSTRACT = new ValaTokenType("abstract");
  IElementType AND = new ValaTokenType("&&");
  IElementType ASSERT = new ValaTokenType("assert");
  IElementType ASYNC = new ValaTokenType("async");
  IElementType AT = new ValaTokenType("@");
  IElementType BLOCK_COMMENT = new ValaTokenType("BLOCK_COMMENT");
  IElementType BOOL = new ValaTokenType("bool");
  IElementType CHAR = new ValaTokenType("char");
  IElementType CHAR_LITERAL = new ValaTokenType("CHAR_LITERAL");
  IElementType CLASS = new ValaTokenType("class");
  IElementType COLON = new ValaTokenType(":");
  IElementType COMMA = new ValaTokenType(",");
  IElementType COMMENT = new ValaTokenType("COMMENT");
  IElementType CONST = new ValaTokenType("const");
  IElementType DECREMENT = new ValaTokenType("--");
  IElementType DIVIDE = new ValaTokenType("/");
  IElementType DIVIDE_EQUALS = new ValaTokenType("/=");
  IElementType DOC_COMMENT = new ValaTokenType("DOC_COMMENT");
  IElementType DOT = new ValaTokenType(".");
  IElementType DOUBLE = new ValaTokenType("double");
  IElementType ELSE = new ValaTokenType("else");
  IElementType ENUM = new ValaTokenType("enum");
  IElementType EQUALS = new ValaTokenType("=");
  IElementType EQUALS_EQUALS = new ValaTokenType("==");
  IElementType FALSE = new ValaTokenType("false");
  IElementType FINAL = new ValaTokenType("final");
  IElementType FLOAT = new ValaTokenType("float");
  IElementType GET = new ValaTokenType("get");
  IElementType GREATER_THAN = new ValaTokenType(">");
  IElementType GREATER_THAN_EQUALS = new ValaTokenType(">=");
  IElementType IDENTIFIER = new ValaTokenType("IDENTIFIER");
  IElementType IF = new ValaTokenType("if");
  IElementType INCREMENT = new ValaTokenType("++");
  IElementType INIT = new ValaTokenType("init");
  IElementType INT = new ValaTokenType("int");
  IElementType INT16 = new ValaTokenType("int16");
  IElementType INT32 = new ValaTokenType("int32");
  IElementType INT64 = new ValaTokenType("int64");
  IElementType INT8 = new ValaTokenType("int8");
  IElementType INTERFACE = new ValaTokenType("interface");
  IElementType LBRACE = new ValaTokenType("{");
  IElementType LBRACKET = new ValaTokenType("[");
  IElementType LESS_THAN = new ValaTokenType("<");
  IElementType LESS_THAN_EQUALS = new ValaTokenType("<=");
  IElementType LONG = new ValaTokenType("long");
  IElementType LPAREN = new ValaTokenType("(");
  IElementType MINUS = new ValaTokenType("-");
  IElementType MINUS_EQUALS = new ValaTokenType("-=");
  IElementType MODULO = new ValaTokenType("%");
  IElementType MODULO_EQUALS = new ValaTokenType("%=");
  IElementType MULTIPLY_EQUALS = new ValaTokenType("*=");
  IElementType NAMESPACE = new ValaTokenType("namespace");
  IElementType NOT = new ValaTokenType("!");
  IElementType NOT_EQUALS = new ValaTokenType("!=");
  IElementType NULL = new ValaTokenType("null");
  IElementType NUMBER = new ValaTokenType("NUMBER");
  IElementType OR = new ValaTokenType("||");
  IElementType PLUS = new ValaTokenType("+");
  IElementType PLUS_EQUALS = new ValaTokenType("+=");
  IElementType PRIVATE = new ValaTokenType("private");
  IElementType PROTECTED = new ValaTokenType("protected");
  IElementType PUBLIC = new ValaTokenType("public");
  IElementType QUESTION_MARK = new ValaTokenType("?");
  IElementType RBRACE = new ValaTokenType("}");
  IElementType RBRACKET = new ValaTokenType("]");
  IElementType RETURN = new ValaTokenType("return");
  IElementType RPAREN = new ValaTokenType(")");
  IElementType SEMICOLON = new ValaTokenType(";");
  IElementType SET = new ValaTokenType("set");
  IElementType SHORT = new ValaTokenType("short");
  IElementType STAR = new ValaTokenType("*");
  IElementType STATIC = new ValaTokenType("static");
  IElementType STRING = new ValaTokenType("string");
  IElementType STRING_LITERAL = new ValaTokenType("STRING_LITERAL");
  IElementType THIS = new ValaTokenType("this");
  IElementType TRUE = new ValaTokenType("true");
  IElementType UCHAR = new ValaTokenType("uchar");
  IElementType UINT = new ValaTokenType("uint");
  IElementType UINT16 = new ValaTokenType("uint16");
  IElementType UINT32 = new ValaTokenType("uint32");
  IElementType UINT64 = new ValaTokenType("uint64");
  IElementType UINT8 = new ValaTokenType("uint8");
  IElementType ULONG = new ValaTokenType("ulong");
  IElementType UNICHAR = new ValaTokenType("unichar");
  IElementType USHORT = new ValaTokenType("ushort");
  IElementType USING = new ValaTokenType("using");
  IElementType VAR = new ValaTokenType("var");
  IElementType VIRTUAL = new ValaTokenType("virtual");
  IElementType VOID = new ValaTokenType("void");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == DEFINITION) {
        return new ValaDefinitionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
