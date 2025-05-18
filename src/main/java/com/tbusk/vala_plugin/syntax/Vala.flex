package com.tbusk.vala_plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.intellij.psi.TokenType;

%%

%class ValaLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

// Tokens
WHITE_SPACE=[ \t\n\r]+
IDENTIFIER=[a-zA-Z][a-zA-Z0-9_]*
STRING_LITERAL=\"([^\\\"]|\\.)*\"
NUMBER=[0-9]+(\.[0-9]*)?
SEMICOLON=";"
COMMA=","
DOT="."
LPAREN="("
RPAREN=")"
LBRACE="{"
RBRACE="}"
LBRACKET="\["
RBRACKET="\]"

// Operators
EQUALS="="
PLUS="\+"
GT=">"
LT="<"
MINUS="-"
MULTIPLY="\*"
DIVIDE="/"
DOUBLE_EQUALS="=="
GREATER_THAN_EQUALS=">="
LESS_THAN_EQUALS="<="
NOT_EQUALS="!="
PLUS_EQUALS="\+="
MINUS_EQUALS="-="
MULTIPLY_EQUALS="\*="
DIVIDE_EQUALS="/="
MODULO_EQUALS="%="
AND="&&"
OR="\|\|"
INCREMENT="\+\+"
DECREMENT="\-\-"
MODULO="%"
NOT="!"

// Bitwise
BITWISE_AND="&"
BITWISE_OR="\|"
BITWISE_XOR="\^"
BITWISE_NOT="~"
BITWISE_SHIFT_LEFT="<<"
BITWISE_SHIFT_RIGHT=">>"
BITWISE_SHIFT_LEFT_EQUALS="<<="
BITWISE_SHIFT_RIGHT_EQUALS=">>="
BITWISE_OR_EQUALS="\|="
BITWISE_AND_EQUALS="&="
BITWISE_XOR_EQUALS="\^="

AT="@"
QUESTION_MARK="?"
POINTER="*"
REFERENCE="&"

IF_STATEMENT="if"
ELSE_STATEMENT="else"
ELSE_IF_STATEMENT="else if"
FOR_STATEMENT="for"|"foreach"|"in"
NAMESPACE_STATEMENT="namespace"
USING_STATEMENT="using"
TRY_STATEMENT="try"|"catch"|"finally"
RETURN_STATEMENT="return"
SWITCH_STATEMENT="switch"
CASE_STATEMENT="case"
DEFAULT_STATEMENT="default"
BREAK_STATEMENT="break"

// Data Types
STRING="string"
CHAR="char"
UCHAR="uchar"
UNICHAR="unichar"
INT="int"
UINT="uint"
LONG="long"
ULONG="ulong"
SHORT="short"
USHORT="ushort"
INT8="int8"
INT16="int16"
INT32="int32"
INT64="int64"
UINT8="uint8"
UINT16="uint16"
UINT32="uint32"
UINT64="uint64"
FLOAT="float"
DOUBLE="double"
BOOL="bool"
TRUE="true"
FALSE="false"
NULL="null"
VOID="void"

// Data Structures
STRUCT="struct"
ENUM="enum"
VAR="var"
CLASS_DECLARATION="class"
INTERFACE_DECLARATION="interface"

// access modifiers
PUBLIC="public"
PRIVATE="private"
PROTECTED="protected"

// modifiers
STATIC="static"
INTERNAL="internal"
ABSTRACT="abstract"
OVERRIDE="override"
VIRTUAL="virtual"
UNOWNED="unowned"
CONST="const"
CRITICAL="critical"

// Comments
COMMENT="//"[^\r\n]*
BLOCK_COMMENT="/*"([^*]|"*"+[^*/])*"*"+"/"
DOC_COMMENT="/**"([^*]|"*"+[^*/])*"*"+"/"

%%

<YYINITIAL> {

    // Comments
    {DOC_COMMENT}      { return ValaTypes.DOC_COMMENT; }
    {BLOCK_COMMENT}    { return ValaTypes.BLOCK_COMMENT; }
    {COMMENT}          { return ValaTypes.COMMENT; }

    // Expressions
    {NAMESPACE_STATEMENT} { return ValaTypes.NAMESPACE_STATEMENT; }
    {USING_STATEMENT}   { return ValaTypes.USING_STATEMENT; }

     // Data Structures
    {CLASS_DECLARATION} { return ValaTypes.CLASS_DECLARATION; }


    // Access Modifiers
    {PUBLIC}      { return ValaTypes.PUBLIC; }
    {PRIVATE}     { return ValaTypes.PRIVATE; }
    {PROTECTED}   { return ValaTypes.PROTECTED; }

    // Other tokens
    {IDENTIFIER}       { return ValaTypes.IDENTIFIER; }
    {STRING_LITERAL}   { return ValaTypes.STRING_LITERAL; }
    {NUMBER}           { return ValaTypes.NUMBER; }
    {SEMICOLON}        { return ValaTypes.SEMICOLON; }
    {COMMA}            { return ValaTypes.COMMA; }
    {DOT}              { return ValaTypes.DOT; }
    {LPAREN}           { return ValaTypes.LPAREN; }
    {RPAREN}           { return ValaTypes.RPAREN; }
    {LBRACE}           { return ValaTypes.LBRACE; }
    {RBRACE}           { return ValaTypes.RBRACE; }
    {LBRACKET}         { return ValaTypes.LBRACKET; }
    {RBRACKET}         { return ValaTypes.RBRACKET; }
    {AT}               { return ValaTypes.AT; }
    {QUESTION_MARK}    { return ValaTypes.QUESTION_MARK; }
    {WHITE_SPACE}      { return TokenType.WHITE_SPACE; }

    // Operators
    {INCREMENT}        { return ValaTypes.INCREMENT; }
    {DECREMENT}        { return ValaTypes.DECREMENT; }
    {EQUALS}           { return ValaTypes.EQUALS; }
    {PLUS}             { return ValaTypes.PLUS; }
    {GT}               { return ValaTypes.GREATER_THAN; }
    {LT}               { return ValaTypes.LESS_THAN; }
    {MINUS}            { return ValaTypes.MINUS; }
    {MULTIPLY}         { return ValaTypes.MULTIPLY; }
    {DIVIDE}           { return ValaTypes.DIVIDE; }
    {PLUS_EQUALS}      { return ValaTypes.PLUS_EQUALS; }
    {MINUS_EQUALS}     { return ValaTypes.MINUS_EQUALS; }
    {MULTIPLY_EQUALS}  { return ValaTypes.MULTIPLY_EQUALS; }
    {DIVIDE_EQUALS}    { return ValaTypes.DIVIDE_EQUALS; }
    {MODULO_EQUALS}    { return ValaTypes.MODULO_EQUALS; }
    {MODULO}           { return ValaTypes.MODULO; }

    // Comparison Operators
    {DOUBLE_EQUALS}        { return ValaTypes.DOUBLE_EQUALS; }
    {GREATER_THAN_EQUALS}  { return ValaTypes.GREATER_THAN_EQUALS; }
    {LESS_THAN_EQUALS}     { return ValaTypes.LESS_THAN_EQUALS; }
    {NOT_EQUALS}           { return ValaTypes.NOT_EQUALS; }
    {AND}                  { return ValaTypes.AND; }
    {OR}                   { return ValaTypes.OR; }
    {NOT}                  { return ValaTypes.NOT; }

    // Error Fallback
    [^]                { return TokenType.BAD_CHARACTER; }
}