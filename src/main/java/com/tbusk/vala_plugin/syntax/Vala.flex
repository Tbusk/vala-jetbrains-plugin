package com.tbusk.vala_plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.intellij.psi.TokenType;
import com.tbusk.vala_plugin.psi.ValaTypes;

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
        {DOC_COMMENT}      { return ValaTypes.DOC_COMMENT; }
        {BLOCK_COMMENT}    { return ValaTypes.BLOCK_COMMENT; }
        {COMMENT}          { return ValaTypes.COMMENT; }

        // Expressions

         // Data Structures
        "class" { return ValaTypes.CLASS; }
        "interface" { return ValaTypes.INTERFACE; }
        "namespace" { return ValaTypes.NAMESPACE; }
        "using" { return ValaTypes.USING; }
        "if" { return ValaTypes.IF; }
        "else" { return ValaTypes.ELSE; }


        // Access Modifiers
        "public"      { return ValaTypes.PUBLIC; }
        "private"    { return ValaTypes.PRIVATE; }
        "protected"   { return ValaTypes.PROTECTED; }

        // Other Modifiers
        "abstract"    { return ValaTypes.ABSTRACT; }
        "virtual"     { return ValaTypes.VIRTUAL; }
        "static"      { return ValaTypes.STATIC; }

        // Data Types
        "const"       { return ValaTypes.CONST; }
        "string"     { return ValaTypes.STRING; }
        "char"       { return ValaTypes.CHAR; }
        "uchar"      { return ValaTypes.UCHAR; }
        "unichar"    { return ValaTypes.UNICHAR; }
        "int"        { return ValaTypes.INT; }
        "uint"       { return ValaTypes.UINT; }
        "long"       { return ValaTypes.LONG; }
        "ulong"      { return ValaTypes.ULONG; }
        "short"      { return ValaTypes.SHORT; }
        "ushort"     { return ValaTypes.USHORT; }
        "int8"       { return ValaTypes.INT8; }
        "int16"      { return ValaTypes.INT16; }
        "int32"      { return ValaTypes.INT32; }
        "int64"      { return ValaTypes.INT64; }
        "uint8"      { return ValaTypes.UINT8; }
        "uint16"     { return ValaTypes.UINT16; }
        "uint32"     { return ValaTypes.UINT32; }
        "uint64"     { return ValaTypes.UINT64; }
        "float"      { return ValaTypes.FLOAT; }
        "double"     { return ValaTypes.DOUBLE; }
        "bool"       { return ValaTypes.BOOL; }
        "true"       { return ValaTypes.TRUE; }
        "false"      { return ValaTypes.FALSE; }
        "null"       { return ValaTypes.NULL; }
        "void"       { return ValaTypes.VOID; }
        "var"        { return ValaTypes.VAR; }

        // Other tokens
        {IDENTIFIER}       { return ValaTypes.IDENTIFIER; }
        {STRING_LITERAL}   { return ValaTypes.STRING_LITERAL; }
        {NUMBER}           { return ValaTypes.NUMBER; }
        ";"        { return ValaTypes.SEMICOLON; }
        ":"          { return ValaTypes.COLON; }
        ","            { return ValaTypes.COMMA; }
        "."              { return ValaTypes.DOT; }
        "("           { return ValaTypes.LPAREN; }
        ")"          { return ValaTypes.RPAREN; }
        "{"           { return ValaTypes.LBRACE; }
        "}"           { return ValaTypes.RBRACE; }
        "["         { return ValaTypes.LBRACKET; }
        "]"         { return ValaTypes.RBRACKET; }
        "@"               { return ValaTypes.AT; }
        "?"    { return ValaTypes.QUESTION_MARK; }
        {WHITE_SPACE}      { return TokenType.WHITE_SPACE; }

        // Operators
        "++"        { return ValaTypes.INCREMENT; }
        "--"        { return ValaTypes.DECREMENT; }
        "="           { return ValaTypes.EQUALS; }
        "+"             { return ValaTypes.PLUS; }
        ">"               { return ValaTypes.GREATER_THAN; }
        "<"              { return ValaTypes.LESS_THAN; }
        "-"            { return ValaTypes.MINUS; }
        "*"         { return ValaTypes.STAR; }
        "/"           { return ValaTypes.DIVIDE; }
        "+="      { return ValaTypes.PLUS_EQUALS; }
        "-="     { return ValaTypes.MINUS_EQUALS; }
        "*="  { return ValaTypes.MULTIPLY_EQUALS; }
        "/="    { return ValaTypes.DIVIDE_EQUALS; }
        "%="    { return ValaTypes.MODULO_EQUALS; }
        "%"           { return ValaTypes.MODULO; }

        // Comparison Operators
        "=="        { return ValaTypes.EQUALS_EQUALS; }
        ">="  { return ValaTypes.GREATER_THAN_EQUALS; }
        "<="     { return ValaTypes.LESS_THAN_EQUALS; }
        "!="           { return ValaTypes.NOT_EQUALS; }
        "&&"                  { return ValaTypes.AND; }
        "||"                   { return ValaTypes.OR; }
        "!"                  { return ValaTypes.NOT; }

        // Error Fallback
        [^]                { return TokenType.BAD_CHARACTER; }
}