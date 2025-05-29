// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tbusk.vala_plugin.psi.impl.*;

public interface ValaTypes {

  IElementType COMMENTS = new ValaElementType("COMMENTS");
  IElementType IDENTIFIERS = new ValaElementType("IDENTIFIERS");
  IElementType ITEMS = new ValaElementType("ITEMS");
  IElementType KEYWORDS = new ValaElementType("KEYWORDS");
  IElementType SYMBOLS = new ValaElementType("SYMBOLS");

  IElementType ABSTRACT = new ValaTokenType("abstract");
  IElementType AND = new ValaTokenType("&");
  IElementType AS = new ValaTokenType("as");
  IElementType ASSERT = new ValaTokenType("assert");
  IElementType ASYNC = new ValaTokenType("async");
  IElementType AT = new ValaTokenType("@");
  IElementType BACKTICK = new ValaTokenType("`");
  IElementType BASE = new ValaTokenType("base");
  IElementType BLOCK_COMMENT = new ValaTokenType("BLOCK_COMMENT");
  IElementType BOOL = new ValaTokenType("bool");
  IElementType BREAK = new ValaTokenType("break");
  IElementType CARET = new ValaTokenType("^");
  IElementType CASE = new ValaTokenType("case");
  IElementType CATCH = new ValaTokenType("catch");
  IElementType CCODE = new ValaTokenType("CCode");
  IElementType CHAR = new ValaTokenType("char");
  IElementType CHAR_LITERAL = new ValaTokenType("CHAR_LITERAL");
  IElementType CLASS = new ValaTokenType("class");
  IElementType COLON = new ValaTokenType(":");
  IElementType COMMA = new ValaTokenType(",");
  IElementType COMMENT = new ValaTokenType("COMMENT");
  IElementType CONST = new ValaTokenType("const");
  IElementType CONSTANT = new ValaTokenType("CONSTANT");
  IElementType CONSTRUCT = new ValaTokenType("construct");
  IElementType CONTINUE = new ValaTokenType("continue");
  IElementType DEFAULT = new ValaTokenType("default");
  IElementType DELEGATE = new ValaTokenType("delegate");
  IElementType DELETE = new ValaTokenType("delete");
  IElementType DO = new ValaTokenType("do");
  IElementType DOC_COMMENT = new ValaTokenType("DOC_COMMENT");
  IElementType DOLLAR = new ValaTokenType("$");
  IElementType DOT = new ValaTokenType(".");
  IElementType DOUBLE = new ValaTokenType("double");
  IElementType ELIF = new ValaTokenType("elif");
  IElementType ELSE = new ValaTokenType("else");
  IElementType EMPTY = new ValaTokenType("EMPTY");
  IElementType ENDIF = new ValaTokenType("endif");
  IElementType ENSURES = new ValaTokenType("ensures");
  IElementType ENUM = new ValaTokenType("enum");
  IElementType EQUALS = new ValaTokenType("=");
  IElementType ERRORDOMAIN = new ValaTokenType("errordomain");
  IElementType EXCLAMATION = new ValaTokenType("!");
  IElementType EXTERN = new ValaTokenType("extern");
  IElementType FALSE = new ValaTokenType("false");
  IElementType FINALLY = new ValaTokenType("finally");
  IElementType FLOAT = new ValaTokenType("float");
  IElementType FOR = new ValaTokenType("for");
  IElementType FOREACH = new ValaTokenType("foreach");
  IElementType FORWARD_SLASH = new ValaTokenType("/");
  IElementType GOTO = new ValaTokenType("goto");
  IElementType GREATER_THAN = new ValaTokenType(">");
  IElementType HASHMAP = new ValaTokenType("HashMap");
  IElementType IDENTIFIER = new ValaTokenType("IDENTIFIER");
  IElementType IF = new ValaTokenType("if");
  IElementType IN = new ValaTokenType("in");
  IElementType INT = new ValaTokenType("int");
  IElementType INT16 = new ValaTokenType("int16");
  IElementType INT32 = new ValaTokenType("int32");
  IElementType INT64 = new ValaTokenType("int64");
  IElementType INT8 = new ValaTokenType("int8");
  IElementType INTERFACE = new ValaTokenType("interface");
  IElementType INTERNAL = new ValaTokenType("internal");
  IElementType IS = new ValaTokenType("is");
  IElementType LBRACE = new ValaTokenType("{");
  IElementType LBRACKET = new ValaTokenType("[");
  IElementType LESS_THAN = new ValaTokenType("<");
  IElementType LOCK = new ValaTokenType("lock");
  IElementType LONG = new ValaTokenType("long");
  IElementType LPAREN = new ValaTokenType("(");
  IElementType METHOD_CALL = new ValaTokenType("METHOD_CALL");
  IElementType MINUS = new ValaTokenType("-");
  IElementType NAMESPACE = new ValaTokenType("namespace");
  IElementType NEW = new ValaTokenType("new");
  IElementType NULL = new ValaTokenType("null");
  IElementType NUMBER = new ValaTokenType("NUMBER");
  IElementType OBJECT = new ValaTokenType("Object");
  IElementType OVERRIDE = new ValaTokenType("override");
  IElementType OWNED = new ValaTokenType("owned");
  IElementType PERCENT = new ValaTokenType("%");
  IElementType PIPE = new ValaTokenType("|");
  IElementType PLUS = new ValaTokenType("+");
  IElementType POUND = new ValaTokenType("#");
  IElementType PRIVATE = new ValaTokenType("private");
  IElementType PROTECTED = new ValaTokenType("protected");
  IElementType PUBLIC = new ValaTokenType("public");
  IElementType QUESTION_MARK = new ValaTokenType("?");
  IElementType RBRACE = new ValaTokenType("}");
  IElementType RBRACKET = new ValaTokenType("]");
  IElementType REQUIRES = new ValaTokenType("requires");
  IElementType RETURN = new ValaTokenType("return");
  IElementType RPAREN = new ValaTokenType(")");
  IElementType SEMICOLON = new ValaTokenType(";");
  IElementType SHORT = new ValaTokenType("short");
  IElementType SIGNAL = new ValaTokenType("signal");
  IElementType SIZEOF = new ValaTokenType("sizeof");
  IElementType STAR = new ValaTokenType("*");
  IElementType STATIC = new ValaTokenType("static");
  IElementType STRING = new ValaTokenType("string");
  IElementType STRING_LITERAL = new ValaTokenType("STRING_LITERAL");
  IElementType STRUCT = new ValaTokenType("struct");
  IElementType SWITCH = new ValaTokenType("switch");
  IElementType THIS = new ValaTokenType("this");
  IElementType THROW = new ValaTokenType("throw");
  IElementType THROWS = new ValaTokenType("throws");
  IElementType TILDE = new ValaTokenType("~");
  IElementType TRUE = new ValaTokenType("true");
  IElementType TRY = new ValaTokenType("try");
  IElementType TYPEDEF = new ValaTokenType("typedef");
  IElementType TYPEOF = new ValaTokenType("typeof");
  IElementType UCHAR = new ValaTokenType("uchar");
  IElementType UINT = new ValaTokenType("uint");
  IElementType UINT16 = new ValaTokenType("uint16");
  IElementType UINT32 = new ValaTokenType("uint32");
  IElementType UINT64 = new ValaTokenType("uint64");
  IElementType UINT8 = new ValaTokenType("uint8");
  IElementType ULONG = new ValaTokenType("ulong");
  IElementType UNDERSCORE = new ValaTokenType("_");
  IElementType UNICHAR = new ValaTokenType("unichar");
  IElementType UNION = new ValaTokenType("union");
  IElementType UNOWNED = new ValaTokenType("unowned");
  IElementType USHORT = new ValaTokenType("ushort");
  IElementType USING = new ValaTokenType("using");
  IElementType VAR = new ValaTokenType("var");
  IElementType VIRTUAL = new ValaTokenType("virtual");
  IElementType VOID = new ValaTokenType("void");
  IElementType VOLATILE = new ValaTokenType("volatile");
  IElementType WEAK = new ValaTokenType("weak");
  IElementType WHILE = new ValaTokenType("while");
  IElementType WHITESPACE = new ValaTokenType("WHITESPACE");
  IElementType YIELD = new ValaTokenType("yield");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == COMMENTS) {
        return new ValaCommentsImpl(node);
      }
      else if (type == IDENTIFIERS) {
        return new ValaIdentifiersImpl(node);
      }
      else if (type == ITEMS) {
        return new ValaItemsImpl(node);
      }
      else if (type == KEYWORDS) {
        return new ValaKeywordsImpl(node);
      }
      else if (type == SYMBOLS) {
        return new ValaSymbolsImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
