package com.tbusk.vala_plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.tbusk.vala_plugin.psi.ValaTypes.*;
import com.intellij.psi.TokenType;import com.tbusk.vala_plugin.psi.ValaTypes;

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

// Comments
COMMENT="//"[^\r\n]*
BLOCK_COMMENT="/*"([^*]|\*[^/])*"\*/"
DOC_COMMENT="/**"([^*]|"*"+[^*/])*"*"+"/"

%%

<YYINITIAL> {

        // Comments
        {DOC_COMMENT}      { return DOC_COMMENT; }
        {BLOCK_COMMENT}    { return BLOCK_COMMENT; }
        {COMMENT}          { return COMMENT; }

        // Expressions

         // Data Structures
        "class" { return CLASS; }
        "interface" { return INTERFACE; }
        "namespace" { return ENUM; }
        "using" { return USING; }


        // Access Modifiers
        "public"      { return PUBLIC; }
        "private"    { return PRIVATE; }
        "protected"   { return PROTECTED; }

        // Data Types
        "const"       { return CONST; }
        "string"     { return STRING; }
        "char"       { return CHAR; }
        "uchar"      { return UCHAR; }
        "unichar"    { return UNICHAR; }
        "int"        { return INT; }
        "uint"       { return UINT; }
        "long"       { return LONG; }
        "ulong"      { return ULONG; }
        "short"      { return SHORT; }
        "ushort"     { return USHORT; }
        "int8"       { return INT8; }
        "int16"      { return INT16; }
        "int32"      { return INT32; }
        "int64"      { return INT64; }
        "uint8"      { return UINT8; }
        "uint16"     { return UINT16; }
        "uint32"     { return UINT32; }
        "uint64"     { return UINT64; }
        "float"      { return FLOAT; }
        "double"     { return DOUBLE; }
        "bool"       { return BOOL; }
        "true"       { return TRUE; }
        "false"      { return FALSE; }
        "null"       { return NULL; }

        // Other tokens
        {IDENTIFIER}       { return IDENTIFIER; }
        {STRING_LITERAL}   { return STRING_LITERAL; }
        {NUMBER}           { return NUMBER; }
        ";"        { return SEMICOLON; }
        ":"          { return COLON; }
        ","            { return COMMA; }
        "."              { return DOT; }
        "("           { return LPAREN; }
        ")"          { return RPAREN; }
        "{"           { return LBRACE; }
        "}"           { return RBRACE; }
        "["         { return LBRACKET; }
        "]"         { return RBRACKET; }
        "@"               { return AT; }
        "?"    { return QUESTION_MARK; }
        {WHITE_SPACE}      { return TokenType.WHITE_SPACE; }

        // Operators
        "++"        { return INCREMENT; }
        "--"        { return DECREMENT; }
        "="           { return EQUALS; }
        "+"             { return PLUS; }
        ">"               { return GREATER_THAN; }
        "<"              { return LESS_THAN; }
        "-"            { return MINUS; }
        "*"         { return STAR; }
        "/"           { return DIVIDE; }
        "+="      { return PLUS_EQUALS; }
        "-="     { return MINUS_EQUALS; }
        "*="  { return MULTIPLY_EQUALS; }
        "/="    { return DIVIDE_EQUALS; }
        "%="    { return MODULO_EQUALS; }
        "%"           { return MODULO; }

        // Comparison Operators
        "=="        { return EQUALS_EQUALS; }
        ">="  { return GREATER_THAN_EQUALS; }
        "<="     { return LESS_THAN_EQUALS; }
        "!="           { return NOT_EQUALS; }
        "&&"                  { return AND; }
        "||"                   { return OR; }
        "!"                  { return NOT; }

        // Error Fallback
        [^]                { return TokenType.BAD_CHARACTER; }
}