// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tbusk.vala_plugin.psi.impl.*;

public interface ValaTypes {

  IElementType ACCESS_MODIFIER = new ValaElementType("ACCESS_MODIFIER");
  IElementType ADDITIVE_EXPRESSION = new ValaElementType("ADDITIVE_EXPRESSION");
  IElementType AND_EXPRESSION = new ValaElementType("AND_EXPRESSION");
  IElementType ARGUMENT = new ValaElementType("ARGUMENT");
  IElementType ARGUMENTS = new ValaElementType("ARGUMENTS");
  IElementType ARRAY_CREATION_EXPRESSION = new ValaElementType("ARRAY_CREATION_EXPRESSION");
  IElementType ARRAY_SIZE = new ValaElementType("ARRAY_SIZE");
  IElementType ARRAY_TYPE = new ValaElementType("ARRAY_TYPE");
  IElementType ASSIGNMENT_OPERATOR = new ValaElementType("ASSIGNMENT_OPERATOR");
  IElementType ATTRIBUTE = new ValaElementType("ATTRIBUTE");
  IElementType ATTRIBUTES = new ValaElementType("ATTRIBUTES");
  IElementType ATTRIBUTE_ARGUMENT = new ValaElementType("ATTRIBUTE_ARGUMENT");
  IElementType ATTRIBUTE_ARGUMENTS = new ValaElementType("ATTRIBUTE_ARGUMENTS");
  IElementType BASE_ACCESS = new ValaElementType("BASE_ACCESS");
  IElementType BASE_TYPES = new ValaElementType("BASE_TYPES");
  IElementType BLOCK = new ValaElementType("BLOCK");
  IElementType BREAK_STATEMENT = new ValaElementType("BREAK_STATEMENT");
  IElementType CATCH_CLAUSE = new ValaElementType("CATCH_CLAUSE");
  IElementType CATCH_CLAUSES = new ValaElementType("CATCH_CLAUSES");
  IElementType CLASS_DECLARATION = new ValaElementType("CLASS_DECLARATION");
  IElementType CLASS_MEMBER = new ValaElementType("CLASS_MEMBER");
  IElementType COALESCING_EXPRESSION = new ValaElementType("COALESCING_EXPRESSION");
  IElementType CONDITIONAL_AND_EXPRESSION = new ValaElementType("CONDITIONAL_AND_EXPRESSION");
  IElementType CONDITIONAL_EXPRESSION = new ValaElementType("CONDITIONAL_EXPRESSION");
  IElementType CONDITIONAL_OR_EXPRESSION = new ValaElementType("CONDITIONAL_OR_EXPRESSION");
  IElementType CONSTANT_DECLARATION = new ValaElementType("CONSTANT_DECLARATION");
  IElementType CONSTRUCTOR_DECLARATION = new ValaElementType("CONSTRUCTOR_DECLARATION");
  IElementType CONSTRUCTOR_DECLARATION_MODIFIER = new ValaElementType("CONSTRUCTOR_DECLARATION_MODIFIER");
  IElementType CONSTRUCTOR_DECLARATION_MODIFIERS = new ValaElementType("CONSTRUCTOR_DECLARATION_MODIFIERS");
  IElementType CONTINUE_STATEMENT = new ValaElementType("CONTINUE_STATEMENT");
  IElementType CREATION_METHOD_DECLARATION = new ValaElementType("CREATION_METHOD_DECLARATION");
  IElementType DELEGATE_DECLARATION = new ValaElementType("DELEGATE_DECLARATION");
  IElementType DELETE_STATEMENT = new ValaElementType("DELETE_STATEMENT");
  IElementType DESTRUCTOR_DECLARATION = new ValaElementType("DESTRUCTOR_DECLARATION");
  IElementType DO_STATEMENT = new ValaElementType("DO_STATEMENT");
  IElementType ELEMENT_ACCESS = new ValaElementType("ELEMENT_ACCESS");
  IElementType EMBEDDED_STATEMENT = new ValaElementType("EMBEDDED_STATEMENT");
  IElementType EMBEDDED_STATEMENT_WITHOUT_BLOCK = new ValaElementType("EMBEDDED_STATEMENT_WITHOUT_BLOCK");
  IElementType ENSURES_STATEMENT = new ValaElementType("ENSURES_STATEMENT");
  IElementType ENUMVALUE = new ValaElementType("ENUMVALUE");
  IElementType ENUMVALUES = new ValaElementType("ENUMVALUES");
  IElementType ENUM_DECLARATION = new ValaElementType("ENUM_DECLARATION");
  IElementType ENUM_MEMBER = new ValaElementType("ENUM_MEMBER");
  IElementType EQUALITY_EXPRESSION = new ValaElementType("EQUALITY_EXPRESSION");
  IElementType ERRORCODE = new ValaElementType("ERRORCODE");
  IElementType ERRORCODES = new ValaElementType("ERRORCODES");
  IElementType ERRORDOMAIN_DECLARATION = new ValaElementType("ERRORDOMAIN_DECLARATION");
  IElementType EXCLUSIVE_OR_EXPRESSION = new ValaElementType("EXCLUSIVE_OR_EXPRESSION");
  IElementType EXPRESSION = new ValaElementType("EXPRESSION");
  IElementType EXPRESSION_STATEMENT = new ValaElementType("EXPRESSION_STATEMENT");
  IElementType FIELD_DECLARATION = new ValaElementType("FIELD_DECLARATION");
  IElementType FINALLY_CLAUSE = new ValaElementType("FINALLY_CLAUSE");
  IElementType FOREACH_STATEMENT = new ValaElementType("FOREACH_STATEMENT");
  IElementType FOR_INITIALIZER = new ValaElementType("FOR_INITIALIZER");
  IElementType FOR_ITERATOR = new ValaElementType("FOR_ITERATOR");
  IElementType FOR_STATEMENT = new ValaElementType("FOR_STATEMENT");
  IElementType IF_STATEMENT = new ValaElementType("IF_STATEMENT");
  IElementType INCLUSIVE_OR_EXPRESSION = new ValaElementType("INCLUSIVE_OR_EXPRESSION");
  IElementType INITIALIZER = new ValaElementType("INITIALIZER");
  IElementType INLINE_ARRAY_TYPE = new ValaElementType("INLINE_ARRAY_TYPE");
  IElementType INTERFACE_DECLARATION = new ValaElementType("INTERFACE_DECLARATION");
  IElementType INTERFACE_MEMBER = new ValaElementType("INTERFACE_MEMBER");
  IElementType IN_EXPRESSION = new ValaElementType("IN_EXPRESSION");
  IElementType LAMBDA_EXPRESSION = new ValaElementType("LAMBDA_EXPRESSION");
  IElementType LAMBDA_EXPRESSION_BODY = new ValaElementType("LAMBDA_EXPRESSION_BODY");
  IElementType LAMBDA_EXPRESSION_PARAMS = new ValaElementType("LAMBDA_EXPRESSION_PARAMS");
  IElementType LITERAL = new ValaElementType("LITERAL");
  IElementType LOCAL_TUPLE_DECLARATION = new ValaElementType("LOCAL_TUPLE_DECLARATION");
  IElementType LOCAL_VARIABLE = new ValaElementType("LOCAL_VARIABLE");
  IElementType LOCAL_VARIABLE_DECLARATION = new ValaElementType("LOCAL_VARIABLE_DECLARATION");
  IElementType LOCAL_VARIABLE_DECLARATIONS = new ValaElementType("LOCAL_VARIABLE_DECLARATIONS");
  IElementType LOCK_STATEMENT = new ValaElementType("LOCK_STATEMENT");
  IElementType MAIN_BLOCK_MEMBER = new ValaElementType("MAIN_BLOCK_MEMBER");
  IElementType MEMBER = new ValaElementType("MEMBER");
  IElementType MEMBER_ACCESS = new ValaElementType("MEMBER_ACCESS");
  IElementType MEMBER_DECLARATION_MODIFIER = new ValaElementType("MEMBER_DECLARATION_MODIFIER");
  IElementType MEMBER_DECLARATION_MODIFIERS = new ValaElementType("MEMBER_DECLARATION_MODIFIERS");
  IElementType MEMBER_INITIALIZER = new ValaElementType("MEMBER_INITIALIZER");
  IElementType MEMBER_PART = new ValaElementType("MEMBER_PART");
  IElementType METHOD_CALL = new ValaElementType("METHOD_CALL");
  IElementType METHOD_DECLARATION = new ValaElementType("METHOD_DECLARATION");
  IElementType MULTIPLICATIVE_EXPRESSION = new ValaElementType("MULTIPLICATIVE_EXPRESSION");
  IElementType NAMESPACE_DECLARATION = new ValaElementType("NAMESPACE_DECLARATION");
  IElementType NAMESPACE_MEMBER = new ValaElementType("NAMESPACE_MEMBER");
  IElementType OBJECT_CREATION_EXPRESSION = new ValaElementType("OBJECT_CREATION_EXPRESSION");
  IElementType OBJECT_INITIALIZER = new ValaElementType("OBJECT_INITIALIZER");
  IElementType OBJECT_OR_ARRAY_CREATION_EXPRESSION = new ValaElementType("OBJECT_OR_ARRAY_CREATION_EXPRESSION");
  IElementType PARAMETER = new ValaElementType("PARAMETER");
  IElementType PARAMETERS = new ValaElementType("PARAMETERS");
  IElementType POINTER_MEMBER_ACCESS = new ValaElementType("POINTER_MEMBER_ACCESS");
  IElementType POST_DECREMENT_EXPRESSION = new ValaElementType("POST_DECREMENT_EXPRESSION");
  IElementType POST_INCREMENT_EXPRESSION = new ValaElementType("POST_INCREMENT_EXPRESSION");
  IElementType PRIMARY_EXPRESSION = new ValaElementType("PRIMARY_EXPRESSION");
  IElementType PRIMITIVE_TYPE = new ValaElementType("PRIMITIVE_TYPE");
  IElementType PROPERTY_ACCESSOR = new ValaElementType("PROPERTY_ACCESSOR");
  IElementType PROPERTY_CONSTRUCT_ACCESSOR = new ValaElementType("PROPERTY_CONSTRUCT_ACCESSOR");
  IElementType PROPERTY_DECLARATION = new ValaElementType("PROPERTY_DECLARATION");
  IElementType PROPERTY_DECLARATION_MODIFIER = new ValaElementType("PROPERTY_DECLARATION_MODIFIER");
  IElementType PROPERTY_DECLARATION_MODIFIERS = new ValaElementType("PROPERTY_DECLARATION_MODIFIERS");
  IElementType PROPERTY_DECLARATION_PART = new ValaElementType("PROPERTY_DECLARATION_PART");
  IElementType PROPERTY_GET_ACCESSOR = new ValaElementType("PROPERTY_GET_ACCESSOR");
  IElementType PROPERTY_SET_ACCESSOR = new ValaElementType("PROPERTY_SET_ACCESSOR");
  IElementType REGEX_LITERAL = new ValaElementType("REGEX_LITERAL");
  IElementType RELATIONAL_EXPRESSION = new ValaElementType("RELATIONAL_EXPRESSION");
  IElementType REQUIRES_STATEMENT = new ValaElementType("REQUIRES_STATEMENT");
  IElementType RETURN_STATEMENT = new ValaElementType("RETURN_STATEMENT");
  IElementType SHIFT_EXPRESSION = new ValaElementType("SHIFT_EXPRESSION");
  IElementType SIGNAL_DECLARATION = new ValaElementType("SIGNAL_DECLARATION");
  IElementType SIGNAL_DECLARATION_MODIFIER = new ValaElementType("SIGNAL_DECLARATION_MODIFIER");
  IElementType SIGNAL_DECLARATION_MODIFIERS = new ValaElementType("SIGNAL_DECLARATION_MODIFIERS");
  IElementType SIMPLE_NAME = new ValaElementType("SIMPLE_NAME");
  IElementType SIZEOF_EXPRESSION = new ValaElementType("SIZEOF_EXPRESSION");
  IElementType STATEMENT = new ValaElementType("STATEMENT");
  IElementType STATEMENT_EXPRESSION = new ValaElementType("STATEMENT_EXPRESSION");
  IElementType STRUCT_DECLARATION = new ValaElementType("STRUCT_DECLARATION");
  IElementType STRUCT_MEMBER = new ValaElementType("STRUCT_MEMBER");
  IElementType SWITCH_SECTION = new ValaElementType("SWITCH_SECTION");
  IElementType SWITCH_STATEMENT = new ValaElementType("SWITCH_STATEMENT");
  IElementType SYMBOL = new ValaElementType("SYMBOL");
  IElementType SYMBOL_PART = new ValaElementType("SYMBOL_PART");
  IElementType TEMPLATE = new ValaElementType("TEMPLATE");
  IElementType THIS_ACCESS = new ValaElementType("THIS_ACCESS");
  IElementType THROWS_STATEMENT = new ValaElementType("THROWS_STATEMENT");
  IElementType THROW_STATEMENT = new ValaElementType("THROW_STATEMENT");
  IElementType TRY_STATEMENT = new ValaElementType("TRY_STATEMENT");
  IElementType TUPLE = new ValaElementType("TUPLE");
  IElementType TYPE = new ValaElementType("TYPE");
  IElementType TYPEOF_EXPRESSION = new ValaElementType("TYPEOF_EXPRESSION");
  IElementType TYPE_ARGUMENTS = new ValaElementType("TYPE_ARGUMENTS");
  IElementType TYPE_DECLARATION_MODIFIER = new ValaElementType("TYPE_DECLARATION_MODIFIER");
  IElementType TYPE_DECLARATION_MODIFIERS = new ValaElementType("TYPE_DECLARATION_MODIFIERS");
  IElementType TYPE_PARAMETERS = new ValaElementType("TYPE_PARAMETERS");
  IElementType TYPE_WEAK = new ValaElementType("TYPE_WEAK");
  IElementType UNARY_EXPRESSION = new ValaElementType("UNARY_EXPRESSION");
  IElementType UNARY_OPERATOR = new ValaElementType("UNARY_OPERATOR");
  IElementType UNLOCK_STATEMENT = new ValaElementType("UNLOCK_STATEMENT");
  IElementType USING_DIRECTIVE = new ValaElementType("USING_DIRECTIVE");
  IElementType VALID_IDENTIFIER_KEYWORDS = new ValaElementType("VALID_IDENTIFIER_KEYWORDS");
  IElementType WHILE_STATEMENT = new ValaElementType("WHILE_STATEMENT");
  IElementType YIELD_EXPRESSION = new ValaElementType("YIELD_EXPRESSION");
  IElementType YIELD_STATEMENT = new ValaElementType("YIELD_STATEMENT");

  IElementType ABSTRACT = new ValaTokenType("abstract");
  IElementType AND = new ValaTokenType("&");
  IElementType AND_AND = new ValaTokenType("&&");
  IElementType AND_EQUALS = new ValaTokenType("&=");
  IElementType ARROW = new ValaTokenType("->");
  IElementType AS = new ValaTokenType("as");
  IElementType ASYNC = new ValaTokenType("async");
  IElementType BACKSLASH = new ValaTokenType("\\\\");
  IElementType BACKTICK = new ValaTokenType("`");
  IElementType BASE = new ValaTokenType("base");
  IElementType BLOCK_COMMENT = new ValaTokenType("BLOCK_COMMENT");
  IElementType BOOL = new ValaTokenType("bool");
  IElementType BREAK = new ValaTokenType("break");
  IElementType CARET = new ValaTokenType("^");
  IElementType CASE = new ValaTokenType("case");
  IElementType CATCH = new ValaTokenType("catch");
  IElementType CHAR = new ValaTokenType("char");
  IElementType CHAR_LITERAL = new ValaTokenType("CHAR_LITERAL");
  IElementType CLASS = new ValaTokenType("class");
  IElementType COLON = new ValaTokenType(":");
  IElementType COMMA = new ValaTokenType(",");
  IElementType COMMENT = new ValaTokenType("COMMENT");
  IElementType CONST = new ValaTokenType("const");
  IElementType CONSTRUCT = new ValaTokenType("construct");
  IElementType CONTINUE = new ValaTokenType("continue");
  IElementType DECIMAL_LITERAL = new ValaTokenType("DECIMAL_LITERAL");
  IElementType DECREMENT = new ValaTokenType("--");
  IElementType DEFAULT = new ValaTokenType("default");
  IElementType DELEGATE = new ValaTokenType("delegate");
  IElementType DELETE = new ValaTokenType("delete");
  IElementType DIVIDE_EQUALS = new ValaTokenType("/=");
  IElementType DO = new ValaTokenType("do");
  IElementType DOC_COMMENT = new ValaTokenType("DOC_COMMENT");
  IElementType DOLLAR = new ValaTokenType("$");
  IElementType DOT = new ValaTokenType(".");
  IElementType DOUBLE = new ValaTokenType("double");
  IElementType DYNAMIC = new ValaTokenType("dynamic");
  IElementType ELLIPSIS = new ValaTokenType("...");
  IElementType ELSE = new ValaTokenType("else");
  IElementType ENSURES = new ValaTokenType("ensures");
  IElementType ENUM = new ValaTokenType("enum");
  IElementType EQUALS = new ValaTokenType("=");
  IElementType EQUALS_EQUALS = new ValaTokenType("==");
  IElementType ERRORDOMAIN = new ValaTokenType("errordomain");
  IElementType EXCLAMATION = new ValaTokenType("!");
  IElementType EXTERN = new ValaTokenType("extern");
  IElementType FALSE = new ValaTokenType("false");
  IElementType FINALLY = new ValaTokenType("finally");
  IElementType FLOAT = new ValaTokenType("float");
  IElementType FOR = new ValaTokenType("for");
  IElementType FOREACH = new ValaTokenType("foreach");
  IElementType FORWARD_SLASH = new ValaTokenType("/");
  IElementType GET = new ValaTokenType("get");
  IElementType GLOBAL = new ValaTokenType("global");
  IElementType GREATER_THAN = new ValaTokenType(">");
  IElementType GREATER_THAN_EQUALS = new ValaTokenType(">=");
  IElementType HEXADECIMAL_LITERAL = new ValaTokenType("HEXADECIMAL_LITERAL");
  IElementType IDENTIFIER = new ValaTokenType("IDENTIFIER");
  IElementType IF = new ValaTokenType("if");
  IElementType IN = new ValaTokenType("in");
  IElementType INCREMENT = new ValaTokenType("++");
  IElementType INLINE = new ValaTokenType("inline");
  IElementType INT = new ValaTokenType("int");
  IElementType INT16 = new ValaTokenType("int16");
  IElementType INT32 = new ValaTokenType("int32");
  IElementType INT64 = new ValaTokenType("int64");
  IElementType INT8 = new ValaTokenType("int8");
  IElementType INTEGER_LITERAL = new ValaTokenType("INTEGER_LITERAL");
  IElementType INTERFACE = new ValaTokenType("interface");
  IElementType INTERNAL = new ValaTokenType("internal");
  IElementType IS = new ValaTokenType("is");
  IElementType LBRACE = new ValaTokenType("{");
  IElementType LBRACKET = new ValaTokenType("[");
  IElementType LESS_THAN = new ValaTokenType("<");
  IElementType LESS_THAN_EQUALS = new ValaTokenType("<=");
  IElementType LOCK = new ValaTokenType("lock");
  IElementType LONG = new ValaTokenType("long");
  IElementType LPAREN = new ValaTokenType("(");
  IElementType MINUS = new ValaTokenType("-");
  IElementType MINUS_EQUALS = new ValaTokenType("-=");
  IElementType MODULO = new ValaTokenType("%");
  IElementType MODULO_EQUALS = new ValaTokenType("%=");
  IElementType MULTIPLY_EQUALS = new ValaTokenType("*=");
  IElementType NAMESPACE = new ValaTokenType("namespace");
  IElementType NEW = new ValaTokenType("new");
  IElementType NOT_EQUALS = new ValaTokenType("!=");
  IElementType NULL = new ValaTokenType("null");
  IElementType OR_OR = new ValaTokenType("||");
  IElementType OUT = new ValaTokenType("out");
  IElementType OVERRIDE = new ValaTokenType("override");
  IElementType OWN = new ValaTokenType("own");
  IElementType OWNED = new ValaTokenType("owned");
  IElementType PARTIAL = new ValaTokenType("partial");
  IElementType PIPE = new ValaTokenType("|");
  IElementType PIPE_EQUALS = new ValaTokenType("|=");
  IElementType PLUS = new ValaTokenType("+");
  IElementType PLUS_EQUALS = new ValaTokenType("+=");
  IElementType POUND = new ValaTokenType("#");
  IElementType PREPROCESSOR_DIRECTIVE = new ValaTokenType("PREPROCESSOR_DIRECTIVE");
  IElementType PREPROCESSOR_ELIF = new ValaTokenType("#elif");
  IElementType PREPROCESSOR_ELSE = new ValaTokenType("#else");
  IElementType PREPROCESSOR_ENDIF = new ValaTokenType("#endif");
  IElementType PREPROCESSOR_IF = new ValaTokenType("#if");
  IElementType PRIVATE = new ValaTokenType("private");
  IElementType PROTECTED = new ValaTokenType("protected");
  IElementType PUBLIC = new ValaTokenType("public");
  IElementType QUESTION_MARK = new ValaTokenType("?");
  IElementType RBRACE = new ValaTokenType("}");
  IElementType RBRACKET = new ValaTokenType("]");
  IElementType REF = new ValaTokenType("ref");
  IElementType REGULAR_EXPRESSION = new ValaTokenType("REGULAR_EXPRESSION");
  IElementType REQUIRES = new ValaTokenType("requires");
  IElementType RETURN = new ValaTokenType("return");
  IElementType RPAREN = new ValaTokenType(")");
  IElementType SEALED = new ValaTokenType("sealed");
  IElementType SEMICOLON = new ValaTokenType(";");
  IElementType SET = new ValaTokenType("set");
  IElementType SHIFT_LEFT_EQUALS = new ValaTokenType("<<=");
  IElementType SHIFT_RIGHT_EQUALS = new ValaTokenType(">>=");
  IElementType SHORT = new ValaTokenType("short");
  IElementType SIGNAL = new ValaTokenType("signal");
  IElementType SIZEOF = new ValaTokenType("sizeof");
  IElementType SIZE_T = new ValaTokenType("size_t");
  IElementType SSIZE_T = new ValaTokenType("ssize_t");
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
  IElementType TRIPLE_QUOTE_STRING = new ValaTokenType("TRIPLE_QUOTE_STRING");
  IElementType TRUE = new ValaTokenType("true");
  IElementType TRY = new ValaTokenType("try");
  IElementType TYPEOF = new ValaTokenType("typeof");
  IElementType UCHAR = new ValaTokenType("uchar");
  IElementType UINT = new ValaTokenType("uint");
  IElementType UINT16 = new ValaTokenType("uint16");
  IElementType UINT32 = new ValaTokenType("uint32");
  IElementType UINT64 = new ValaTokenType("uint64");
  IElementType UINT8 = new ValaTokenType("uint8");
  IElementType ULONG = new ValaTokenType("ulong");
  IElementType UNICHAR = new ValaTokenType("unichar");
  IElementType UNLOCK = new ValaTokenType("unlock");
  IElementType UNOWNED = new ValaTokenType("unowned");
  IElementType USHORT = new ValaTokenType("ushort");
  IElementType USING = new ValaTokenType("using");
  IElementType VAR = new ValaTokenType("var");
  IElementType VIRTUAL = new ValaTokenType("virtual");
  IElementType VOID = new ValaTokenType("void");
  IElementType VOLATILE = new ValaTokenType("volatile");
  IElementType WEAK = new ValaTokenType("weak");
  IElementType WHILE = new ValaTokenType("while");
  IElementType XOR_EQUALS = new ValaTokenType("^=");
  IElementType YIELD = new ValaTokenType("yield");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACCESS_MODIFIER) {
        return new ValaAccessModifierImpl(node);
      }
      else if (type == ADDITIVE_EXPRESSION) {
        return new ValaAdditiveExpressionImpl(node);
      }
      else if (type == AND_EXPRESSION) {
        return new ValaAndExpressionImpl(node);
      }
      else if (type == ARGUMENT) {
        return new ValaArgumentImpl(node);
      }
      else if (type == ARGUMENTS) {
        return new ValaArgumentsImpl(node);
      }
      else if (type == ARRAY_CREATION_EXPRESSION) {
        return new ValaArrayCreationExpressionImpl(node);
      }
      else if (type == ARRAY_SIZE) {
        return new ValaArraySizeImpl(node);
      }
      else if (type == ARRAY_TYPE) {
        return new ValaArrayTypeImpl(node);
      }
      else if (type == ASSIGNMENT_OPERATOR) {
        return new ValaAssignmentOperatorImpl(node);
      }
      else if (type == ATTRIBUTE) {
        return new ValaAttributeImpl(node);
      }
      else if (type == ATTRIBUTES) {
        return new ValaAttributesImpl(node);
      }
      else if (type == ATTRIBUTE_ARGUMENT) {
        return new ValaAttributeArgumentImpl(node);
      }
      else if (type == ATTRIBUTE_ARGUMENTS) {
        return new ValaAttributeArgumentsImpl(node);
      }
      else if (type == BASE_ACCESS) {
        return new ValaBaseAccessImpl(node);
      }
      else if (type == BASE_TYPES) {
        return new ValaBaseTypesImpl(node);
      }
      else if (type == BLOCK) {
        return new ValaBlockImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new ValaBreakStatementImpl(node);
      }
      else if (type == CATCH_CLAUSE) {
        return new ValaCatchClauseImpl(node);
      }
      else if (type == CATCH_CLAUSES) {
        return new ValaCatchClausesImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new ValaClassDeclarationImpl(node);
      }
      else if (type == CLASS_MEMBER) {
        return new ValaClassMemberImpl(node);
      }
      else if (type == COALESCING_EXPRESSION) {
        return new ValaCoalescingExpressionImpl(node);
      }
      else if (type == CONDITIONAL_AND_EXPRESSION) {
        return new ValaConditionalAndExpressionImpl(node);
      }
      else if (type == CONDITIONAL_EXPRESSION) {
        return new ValaConditionalExpressionImpl(node);
      }
      else if (type == CONDITIONAL_OR_EXPRESSION) {
        return new ValaConditionalOrExpressionImpl(node);
      }
      else if (type == CONSTANT_DECLARATION) {
        return new ValaConstantDeclarationImpl(node);
      }
      else if (type == CONSTRUCTOR_DECLARATION) {
        return new ValaConstructorDeclarationImpl(node);
      }
      else if (type == CONSTRUCTOR_DECLARATION_MODIFIER) {
        return new ValaConstructorDeclarationModifierImpl(node);
      }
      else if (type == CONSTRUCTOR_DECLARATION_MODIFIERS) {
        return new ValaConstructorDeclarationModifiersImpl(node);
      }
      else if (type == CONTINUE_STATEMENT) {
        return new ValaContinueStatementImpl(node);
      }
      else if (type == CREATION_METHOD_DECLARATION) {
        return new ValaCreationMethodDeclarationImpl(node);
      }
      else if (type == DELEGATE_DECLARATION) {
        return new ValaDelegateDeclarationImpl(node);
      }
      else if (type == DELETE_STATEMENT) {
        return new ValaDeleteStatementImpl(node);
      }
      else if (type == DESTRUCTOR_DECLARATION) {
        return new ValaDestructorDeclarationImpl(node);
      }
      else if (type == DO_STATEMENT) {
        return new ValaDoStatementImpl(node);
      }
      else if (type == ELEMENT_ACCESS) {
        return new ValaElementAccessImpl(node);
      }
      else if (type == EMBEDDED_STATEMENT) {
        return new ValaEmbeddedStatementImpl(node);
      }
      else if (type == EMBEDDED_STATEMENT_WITHOUT_BLOCK) {
        return new ValaEmbeddedStatementWithoutBlockImpl(node);
      }
      else if (type == ENSURES_STATEMENT) {
        return new ValaEnsuresStatementImpl(node);
      }
      else if (type == ENUMVALUE) {
        return new ValaEnumvalueImpl(node);
      }
      else if (type == ENUMVALUES) {
        return new ValaEnumvaluesImpl(node);
      }
      else if (type == ENUM_DECLARATION) {
        return new ValaEnumDeclarationImpl(node);
      }
      else if (type == ENUM_MEMBER) {
        return new ValaEnumMemberImpl(node);
      }
      else if (type == EQUALITY_EXPRESSION) {
        return new ValaEqualityExpressionImpl(node);
      }
      else if (type == ERRORCODE) {
        return new ValaErrorcodeImpl(node);
      }
      else if (type == ERRORCODES) {
        return new ValaErrorcodesImpl(node);
      }
      else if (type == ERRORDOMAIN_DECLARATION) {
        return new ValaErrordomainDeclarationImpl(node);
      }
      else if (type == EXCLUSIVE_OR_EXPRESSION) {
        return new ValaExclusiveOrExpressionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new ValaExpressionImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new ValaExpressionStatementImpl(node);
      }
      else if (type == FIELD_DECLARATION) {
        return new ValaFieldDeclarationImpl(node);
      }
      else if (type == FINALLY_CLAUSE) {
        return new ValaFinallyClauseImpl(node);
      }
      else if (type == FOREACH_STATEMENT) {
        return new ValaForeachStatementImpl(node);
      }
      else if (type == FOR_INITIALIZER) {
        return new ValaForInitializerImpl(node);
      }
      else if (type == FOR_ITERATOR) {
        return new ValaForIteratorImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new ValaForStatementImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new ValaIfStatementImpl(node);
      }
      else if (type == INCLUSIVE_OR_EXPRESSION) {
        return new ValaInclusiveOrExpressionImpl(node);
      }
      else if (type == INITIALIZER) {
        return new ValaInitializerImpl(node);
      }
      else if (type == INLINE_ARRAY_TYPE) {
        return new ValaInlineArrayTypeImpl(node);
      }
      else if (type == INTERFACE_DECLARATION) {
        return new ValaInterfaceDeclarationImpl(node);
      }
      else if (type == INTERFACE_MEMBER) {
        return new ValaInterfaceMemberImpl(node);
      }
      else if (type == IN_EXPRESSION) {
        return new ValaInExpressionImpl(node);
      }
      else if (type == LAMBDA_EXPRESSION) {
        return new ValaLambdaExpressionImpl(node);
      }
      else if (type == LAMBDA_EXPRESSION_BODY) {
        return new ValaLambdaExpressionBodyImpl(node);
      }
      else if (type == LAMBDA_EXPRESSION_PARAMS) {
        return new ValaLambdaExpressionParamsImpl(node);
      }
      else if (type == LITERAL) {
        return new ValaLiteralImpl(node);
      }
      else if (type == LOCAL_TUPLE_DECLARATION) {
        return new ValaLocalTupleDeclarationImpl(node);
      }
      else if (type == LOCAL_VARIABLE) {
        return new ValaLocalVariableImpl(node);
      }
      else if (type == LOCAL_VARIABLE_DECLARATION) {
        return new ValaLocalVariableDeclarationImpl(node);
      }
      else if (type == LOCAL_VARIABLE_DECLARATIONS) {
        return new ValaLocalVariableDeclarationsImpl(node);
      }
      else if (type == LOCK_STATEMENT) {
        return new ValaLockStatementImpl(node);
      }
      else if (type == MAIN_BLOCK_MEMBER) {
        return new ValaMainBlockMemberImpl(node);
      }
      else if (type == MEMBER) {
        return new ValaMemberImpl(node);
      }
      else if (type == MEMBER_ACCESS) {
        return new ValaMemberAccessImpl(node);
      }
      else if (type == MEMBER_DECLARATION_MODIFIER) {
        return new ValaMemberDeclarationModifierImpl(node);
      }
      else if (type == MEMBER_DECLARATION_MODIFIERS) {
        return new ValaMemberDeclarationModifiersImpl(node);
      }
      else if (type == MEMBER_INITIALIZER) {
        return new ValaMemberInitializerImpl(node);
      }
      else if (type == MEMBER_PART) {
        return new ValaMemberPartImpl(node);
      }
      else if (type == METHOD_CALL) {
        return new ValaMethodCallImpl(node);
      }
      else if (type == METHOD_DECLARATION) {
        return new ValaMethodDeclarationImpl(node);
      }
      else if (type == MULTIPLICATIVE_EXPRESSION) {
        return new ValaMultiplicativeExpressionImpl(node);
      }
      else if (type == NAMESPACE_DECLARATION) {
        return new ValaNamespaceDeclarationImpl(node);
      }
      else if (type == NAMESPACE_MEMBER) {
        return new ValaNamespaceMemberImpl(node);
      }
      else if (type == OBJECT_CREATION_EXPRESSION) {
        return new ValaObjectCreationExpressionImpl(node);
      }
      else if (type == OBJECT_INITIALIZER) {
        return new ValaObjectInitializerImpl(node);
      }
      else if (type == OBJECT_OR_ARRAY_CREATION_EXPRESSION) {
        return new ValaObjectOrArrayCreationExpressionImpl(node);
      }
      else if (type == PARAMETER) {
        return new ValaParameterImpl(node);
      }
      else if (type == PARAMETERS) {
        return new ValaParametersImpl(node);
      }
      else if (type == POINTER_MEMBER_ACCESS) {
        return new ValaPointerMemberAccessImpl(node);
      }
      else if (type == POST_DECREMENT_EXPRESSION) {
        return new ValaPostDecrementExpressionImpl(node);
      }
      else if (type == POST_INCREMENT_EXPRESSION) {
        return new ValaPostIncrementExpressionImpl(node);
      }
      else if (type == PRIMARY_EXPRESSION) {
        return new ValaPrimaryExpressionImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new ValaPrimitiveTypeImpl(node);
      }
      else if (type == PROPERTY_ACCESSOR) {
        return new ValaPropertyAccessorImpl(node);
      }
      else if (type == PROPERTY_CONSTRUCT_ACCESSOR) {
        return new ValaPropertyConstructAccessorImpl(node);
      }
      else if (type == PROPERTY_DECLARATION) {
        return new ValaPropertyDeclarationImpl(node);
      }
      else if (type == PROPERTY_DECLARATION_MODIFIER) {
        return new ValaPropertyDeclarationModifierImpl(node);
      }
      else if (type == PROPERTY_DECLARATION_MODIFIERS) {
        return new ValaPropertyDeclarationModifiersImpl(node);
      }
      else if (type == PROPERTY_DECLARATION_PART) {
        return new ValaPropertyDeclarationPartImpl(node);
      }
      else if (type == PROPERTY_GET_ACCESSOR) {
        return new ValaPropertyGetAccessorImpl(node);
      }
      else if (type == PROPERTY_SET_ACCESSOR) {
        return new ValaPropertySetAccessorImpl(node);
      }
      else if (type == REGEX_LITERAL) {
        return new ValaRegexLiteralImpl(node);
      }
      else if (type == RELATIONAL_EXPRESSION) {
        return new ValaRelationalExpressionImpl(node);
      }
      else if (type == REQUIRES_STATEMENT) {
        return new ValaRequiresStatementImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new ValaReturnStatementImpl(node);
      }
      else if (type == SHIFT_EXPRESSION) {
        return new ValaShiftExpressionImpl(node);
      }
      else if (type == SIGNAL_DECLARATION) {
        return new ValaSignalDeclarationImpl(node);
      }
      else if (type == SIGNAL_DECLARATION_MODIFIER) {
        return new ValaSignalDeclarationModifierImpl(node);
      }
      else if (type == SIGNAL_DECLARATION_MODIFIERS) {
        return new ValaSignalDeclarationModifiersImpl(node);
      }
      else if (type == SIMPLE_NAME) {
        return new ValaSimpleNameImpl(node);
      }
      else if (type == SIZEOF_EXPRESSION) {
        return new ValaSizeofExpressionImpl(node);
      }
      else if (type == STATEMENT) {
        return new ValaStatementImpl(node);
      }
      else if (type == STATEMENT_EXPRESSION) {
        return new ValaStatementExpressionImpl(node);
      }
      else if (type == STRUCT_DECLARATION) {
        return new ValaStructDeclarationImpl(node);
      }
      else if (type == STRUCT_MEMBER) {
        return new ValaStructMemberImpl(node);
      }
      else if (type == SWITCH_SECTION) {
        return new ValaSwitchSectionImpl(node);
      }
      else if (type == SWITCH_STATEMENT) {
        return new ValaSwitchStatementImpl(node);
      }
      else if (type == SYMBOL) {
        return new ValaSymbolImpl(node);
      }
      else if (type == SYMBOL_PART) {
        return new ValaSymbolPartImpl(node);
      }
      else if (type == TEMPLATE) {
        return new ValaTemplateImpl(node);
      }
      else if (type == THIS_ACCESS) {
        return new ValaThisAccessImpl(node);
      }
      else if (type == THROWS_STATEMENT) {
        return new ValaThrowsStatementImpl(node);
      }
      else if (type == THROW_STATEMENT) {
        return new ValaThrowStatementImpl(node);
      }
      else if (type == TRY_STATEMENT) {
        return new ValaTryStatementImpl(node);
      }
      else if (type == TUPLE) {
        return new ValaTupleImpl(node);
      }
      else if (type == TYPE) {
        return new ValaTypeImpl(node);
      }
      else if (type == TYPEOF_EXPRESSION) {
        return new ValaTypeofExpressionImpl(node);
      }
      else if (type == TYPE_ARGUMENTS) {
        return new ValaTypeArgumentsImpl(node);
      }
      else if (type == TYPE_DECLARATION_MODIFIER) {
        return new ValaTypeDeclarationModifierImpl(node);
      }
      else if (type == TYPE_DECLARATION_MODIFIERS) {
        return new ValaTypeDeclarationModifiersImpl(node);
      }
      else if (type == TYPE_PARAMETERS) {
        return new ValaTypeParametersImpl(node);
      }
      else if (type == TYPE_WEAK) {
        return new ValaTypeWeakImpl(node);
      }
      else if (type == UNARY_EXPRESSION) {
        return new ValaUnaryExpressionImpl(node);
      }
      else if (type == UNARY_OPERATOR) {
        return new ValaUnaryOperatorImpl(node);
      }
      else if (type == UNLOCK_STATEMENT) {
        return new ValaUnlockStatementImpl(node);
      }
      else if (type == USING_DIRECTIVE) {
        return new ValaUsingDirectiveImpl(node);
      }
      else if (type == VALID_IDENTIFIER_KEYWORDS) {
        return new ValaValidIdentifierKeywordsImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new ValaWhileStatementImpl(node);
      }
      else if (type == YIELD_EXPRESSION) {
        return new ValaYieldExpressionImpl(node);
      }
      else if (type == YIELD_STATEMENT) {
        return new ValaYieldStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
