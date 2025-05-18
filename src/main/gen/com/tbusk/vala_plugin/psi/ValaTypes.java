// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tbusk.vala_plugin.psi.impl.*;

public interface ValaTypes {

  IElementType CLASS_ACCESS_MODIFIERS = new ValaElementType("CLASS_ACCESS_MODIFIERS");
  IElementType CLASS_DECLARATION = new ValaElementType("CLASS_DECLARATION");
  IElementType COMMENTS = new ValaElementType("COMMENTS");
  IElementType DATA_STRUCTURES = new ValaElementType("DATA_STRUCTURES");
  IElementType EXPRESSION = new ValaElementType("EXPRESSION");
  IElementType NAMESPACE_STATEMENT = new ValaElementType("NAMESPACE_STATEMENT");
  IElementType STATEMENT = new ValaElementType("STATEMENT");
  IElementType USING_STATEMENT = new ValaElementType("USING_STATEMENT");

  IElementType AS = new ValaTokenType("AS");
  IElementType BLOCK_COMMENT = new ValaTokenType("BLOCK_COMMENT");
  IElementType CLASS_DECLARATION = new ValaTokenType("CLASS_DECLARATION");
  IElementType COLON = new ValaTokenType("COLON");
  IElementType COMMA = new ValaTokenType("COMMA");
  IElementType COMMENT = new ValaTokenType("COMMENT");
  IElementType CONSTRUCTOR_DECLARATION = new ValaTokenType("constructor_declaration");
  IElementType DOC_COMMENT = new ValaTokenType("DOC_COMMENT");
  IElementType FIELD_DECLARATION = new ValaTokenType("field_declaration");
  IElementType GREATER_THAN = new ValaTokenType("GREATER_THAN");
  IElementType IDENTIFER = new ValaTokenType("IDENTIFER");
  IElementType IDENTIFIER = new ValaTokenType("IDENTIFIER");
  IElementType LBRACE = new ValaTokenType("LBRACE");
  IElementType LESS_THAN = new ValaTokenType("LESS_THAN");
  IElementType METHOD_DECLARATION = new ValaTokenType("method_declaration");
  IElementType NAMESPACE = new ValaTokenType("NAMESPACE");
  IElementType NUMBER = new ValaTokenType("NUMBER");
  IElementType PRIVATE = new ValaTokenType("PRIVATE");
  IElementType PROPERTY_DECLARATION = new ValaTokenType("property_declaration");
  IElementType PROTECTED = new ValaTokenType("PROTECTED");
  IElementType PUBLIC = new ValaTokenType("PUBLIC");
  IElementType RBRACE = new ValaTokenType("RBRACE");
  IElementType SEMICOLON = new ValaTokenType("SEMICOLON");
  IElementType STRING_LITERAL = new ValaTokenType("STRING_LITERAL");
  IElementType TOKENS = new ValaTokenType("tokens");
  IElementType USING = new ValaTokenType("USING");
  IElementType VALUE_TYPES = new ValaTokenType("value_types");
  IElementType WHITESPACE = new ValaTokenType("WHITESPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CLASS_ACCESS_MODIFIERS) {
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
      else if (type == NAMESPACE_STATEMENT) {
        return new ValaNamespaceStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new ValaStatementImpl(node);
      }
      else if (type == USING_STATEMENT) {
        return new ValaUsingStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
