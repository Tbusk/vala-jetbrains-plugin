// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tbusk.vala_plugin.psi.impl.*;

public interface ValaTypes {

  IElementType COMMENTS = new ValaElementType("COMMENTS");
  IElementType DATA_TYPES = new ValaElementType("DATA_TYPES");
  IElementType STATEMENT = new ValaElementType("STATEMENT");

  IElementType BLOCK_COMMENT = new ValaTokenType("BLOCK_COMMENT");
  IElementType BOOL = new ValaTokenType("BOOL");
  IElementType CHAR = new ValaTokenType("CHAR");
  IElementType CLASS_DECLARATION = new ValaTokenType("class_declaration");
  IElementType COMMA = new ValaTokenType("COMMA");
  IElementType COMMENT = new ValaTokenType("COMMENT");
  IElementType DIVIDE = new ValaTokenType("DIVIDE");
  IElementType DOC_COMMENT = new ValaTokenType("DOC_COMMENT");
  IElementType DOT = new ValaTokenType("DOT");
  IElementType DOUBLE = new ValaTokenType("DOUBLE");
  IElementType ENUM = new ValaTokenType("ENUM");
  IElementType EQUALS = new ValaTokenType("EQUALS");
  IElementType FALSE = new ValaTokenType("FALSE");
  IElementType FLOAT = new ValaTokenType("FLOAT");
  IElementType FOR_STATEMENT = new ValaTokenType("for_statement");
  IElementType FUNCTION_DECLARATION = new ValaTokenType("function_declaration");
  IElementType GREATER_THAN = new ValaTokenType("GREATER_THAN");
  IElementType IDENTIFIER = new ValaTokenType("IDENTIFIER");
  IElementType IF_STATEMENT = new ValaTokenType("if_statement");
  IElementType INT = new ValaTokenType("INT");
  IElementType INT16 = new ValaTokenType("INT16");
  IElementType INT32 = new ValaTokenType("INT32");
  IElementType INT64 = new ValaTokenType("INT64");
  IElementType INT8 = new ValaTokenType("INT8");
  IElementType LBRACE = new ValaTokenType("LBRACE");
  IElementType LBRACKET = new ValaTokenType("LBRACKET");
  IElementType LESS_THAN = new ValaTokenType("LESS_THAN");
  IElementType LONG = new ValaTokenType("LONG");
  IElementType LPAREN = new ValaTokenType("LPAREN");
  IElementType MINUS = new ValaTokenType("MINUS");
  IElementType MULTIPLY = new ValaTokenType("MULTIPLY");
  IElementType NAMESPACE_STATEMENT = new ValaTokenType("namespace_statement");
  IElementType NUMBER = new ValaTokenType("NUMBER");
  IElementType PLUS = new ValaTokenType("PLUS");
  IElementType RBRACE = new ValaTokenType("RBRACE");
  IElementType RBRACKET = new ValaTokenType("RBRACKET");
  IElementType RETURN_STATEMENT = new ValaTokenType("return_statement");
  IElementType RPAREN = new ValaTokenType("RPAREN");
  IElementType SEMICOLON = new ValaTokenType("SEMICOLON");
  IElementType SHORT = new ValaTokenType("SHORT");
  IElementType STRING = new ValaTokenType("STRING");
  IElementType STRUCT = new ValaTokenType("STRUCT");
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
  IElementType USHORT = new ValaTokenType("USHORT");
  IElementType USING_STATEMENT = new ValaTokenType("using_statement");
  IElementType VAR = new ValaTokenType("VAR");
  IElementType WHILE_STATEMENT = new ValaTokenType("while_statement");
  IElementType WHITE_SPACE = new ValaTokenType("WHITE_SPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == COMMENTS) {
        return new ValaCommentsImpl(node);
      }
      else if (type == DATA_TYPES) {
        return new ValaDataTypesImpl(node);
      }
      else if (type == STATEMENT) {
        return new ValaStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
