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

WHITE_SPACE=[ \t\n\r]+
IDENTIFIER=[a-zA-Z][a-zA-Z0-9_]*
STRING=\"([^\\\"]|\\.)*\"
NUMBER=[0-9]+(\.[0-9]*)?
SEMICOLON=";"
COMMA=","
DOT="."
LPAREN="("
RPAREN=")"
LBRACE="{"
RBRACE="}"
EQUALS="="
LBRACKET="\["
RBRACKET="\]"
PLUS="\+"
GT=">"
LT="<"
MINUS="-"
MULTIPLY="\*"
DIVIDE="/"

IF_STATEMENT="if"|"else"|"elseif"|"endif"
FOR_STATEMENT="for"|"foreach"|"in"
NAMESPACE_STATEMENT="namespace"
USING_STATEMENT="using"
TRY_STATEMENT="try"|"catch"|"finally"
RETURN_STATEMENT="return"

// Data Types
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
STRUCT="struct"
ENUM="enum"
VAR="var"
CLASS_DECLARATION="class"
INTERFACE_DECLARATION="interface"
CONST="const"

// access modifiers
PUBLIC="public"
PRIVATE="private"
PROTECTED="protected"
STATIC="static"
INTERNAL="internal"
ABSTRACT="abstract"
OVERRIDE="override"
VIRTUAL="virtual"
UNOWNED="unowned"
VOID="void"
NULL="null"
CRITICAL="critical"

COMMENT="//"[^\r\n]*
BLOCK_COMMENT="/*"([^*]|"*"+[^*/])*"*"+"/"
DOC_COMMENT="/**"([^*]|"*"+[^*/])*"*"+"/"

%%

<YYINITIAL> {
    {WHITE_SPACE}      { return TokenType.WHITE_SPACE; }

    // Comments
    {DOC_COMMENT}      { return ValaTypes.DOC_COMMENT; }
    {BLOCK_COMMENT}    { return ValaTypes.BLOCK_COMMENT; }
    {COMMENT}          { return ValaTypes.COMMENT; }

    // Expressions
    {IF_STATEMENT}     { return ValaTypes.IF_STATEMENT; }
    {FOR_STATEMENT}    { return ValaTypes.FOR_STATEMENT; }
    {NAMESPACE_STATEMENT} { return ValaTypes.NAMESPACE_STATEMENT; }
    {USING_STATEMENT}   { return ValaTypes.USING_STATEMENT; }
    {TRY_STATEMENT}     { return ValaTypes.TRY_STATEMENT; }
    {RETURN_STATEMENT}  { return ValaTypes.RETURN_STATEMENT; }
    {CHAR}        { return ValaTypes.CHAR; }
    {UCHAR}       { return ValaTypes.UCHAR; }
    {UNICHAR}     { return ValaTypes.UNICHAR; }
    {INT}         { return ValaTypes.INT; }
    {UINT}        { return ValaTypes.UINT; }
    {LONG}        { return ValaTypes.LONG; }
    {ULONG}       { return ValaTypes.ULONG; }
    {SHORT}       { return ValaTypes.SHORT; }
    {USHORT}      { return ValaTypes.USHORT; }
    {INT8}        { return ValaTypes.INT8; }
    {INT16}       { return ValaTypes.INT16; }
    {INT32}       { return ValaTypes.INT32; }
    {INT64}       { return ValaTypes.INT64; }
    {UINT8}       { return ValaTypes.UINT8; }
    {UINT16}      { return ValaTypes.UINT16; }
    {UINT32}      { return ValaTypes.UINT32; }
    {UINT64}      { return ValaTypes.UINT64; }
    {FLOAT}       { return ValaTypes.FLOAT; }
    {DOUBLE}      { return ValaTypes.DOUBLE; }
    {BOOL}        { return ValaTypes.BOOL; }
    {TRUE}        { return ValaTypes.TRUE; }
    {FALSE}       { return ValaTypes.FALSE; }
    {STRUCT}      { return ValaTypes.STRUCT_DECLARATION; }
    {ENUM}        { return ValaTypes.ENUM_DECLARATION; }
    {VAR}         { return ValaTypes.VAR; }
    {CLASS_DECLARATION} { return ValaTypes.CLASS_DECLARATION; }
    {INTERFACE_DECLARATION} { return ValaTypes.INTERFACE_DECLARATION; }
    {CONST}       { return ValaTypes.CONST; }
    {VOID}        { return ValaTypes.VOID; }
    {NULL}        { return ValaTypes.NULL; }
    {CRITICAL}    { return ValaTypes.CRITICAL; }


    // Access Modifiers
    {PUBLIC}      { return ValaTypes.PUBLIC; }
    {PRIVATE}     { return ValaTypes.PRIVATE; }
    {PROTECTED}   { return ValaTypes.PROTECTED; }
    {STATIC}      { return ValaTypes.STATIC; }
    {INTERNAL}    { return ValaTypes.INTERNAL; }
    {ABSTRACT}    { return ValaTypes.ABSTRACT; }
    {OVERRIDE}    { return ValaTypes.OVERRIDE; }
    {VIRTUAL}     { return ValaTypes.VIRTUAL; }
    {UNOWNED}       { return ValaTypes.UNOWNED; }

    // Other tokens
    {IDENTIFIER}       { return ValaTypes.IDENTIFIER; }
    {STRING}           { return ValaTypes.STRING; }
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
    {EQUALS}           { return ValaTypes.EQUALS; }
    {PLUS}             { return ValaTypes.PLUS; }
    {GT}               { return ValaTypes.GREATER_THAN; }
    {LT}               { return ValaTypes.LESS_THAN; }
    {MINUS}            { return ValaTypes.MINUS; }
    {MULTIPLY}         { return ValaTypes.MULTIPLY; }
    {DIVIDE}           { return ValaTypes.DIVIDE; }


    [^]                { return TokenType.BAD_CHARACTER; }
}