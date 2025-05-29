package com.tbusk.vala_plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.intellij.psi.TokenType;
import com.tbusk.vala_plugin.ValaTokenSets;
import com.tbusk.vala_plugin.psi.ValaTokenType;

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
CONSTANT=[A-Z]([A-Z0-9_]*[A-Z0-9]|[A-Z0-9_]*[A-Z][A-Z0-9_]*)
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*
STRING_LITERAL=\"([^\\\"]|\\.)*\"
CHAR_LITERAL=\'([^\\\']|\\.)*\'
NUMBER=[0-9]+(\.[0-9]*)?
METHOD_CALL={IDENTIFIER}

// Comments
COMMENT="//"[^\r\n]*
BLOCK_COMMENT="/*"([^*]|\*[^/])*"\*/"
DOC_COMMENT="/**"([^*]|"*"+[^*/])*"*"+"/"

%%

<YYINITIAL> {

    // Other tokens
    {STRING_LITERAL}   { return ValaTypes.STRING_LITERAL; }
    {CHAR_LITERAL}     { return ValaTypes.CHAR_LITERAL; }
    {NUMBER}           { return ValaTypes.NUMBER; }
    {WHITE_SPACE}      { return TokenType.WHITE_SPACE; }

    // Misc Keywords
    "return"             { return ValaTypes.RETURN; }
    "do" { return ValaTypes.DO; }
    "break" { return ValaTypes.BREAK; }
    "continue" { return ValaTypes.CONTINUE; }
    "case" { return ValaTypes.CASE; }
    "default" { return ValaTypes.DEFAULT; }
    "finally" { return ValaTypes.FINALLY; }
    "throw" { return ValaTypes.THROW; }
    "throws" { return ValaTypes.THROWS; }
    "try" { return ValaTypes.TRY; }
    "catch" { return ValaTypes.CATCH; }
    "in" { return ValaTypes.IN; }
    "namespace" { return ValaTypes.NAMESPACE; }
    "using" { return ValaTypes.USING; }
    "if"             { return ValaTypes.IF; }
    "elif" { return ValaTypes.ELIF; }
    "endif" { return ValaTypes.ENDIF; }
    "else" { return ValaTypes.ELSE; }
    "switch" { return ValaTypes.SWITCH; }
    "while" { return ValaTypes.WHILE; }
    "for" { return ValaTypes.FOR; }
    "foreach" { return ValaTypes.FOREACH; }
    "owned" { return ValaTypes.OWNED; }
    "unowned" { return ValaTypes.UNOWNED; }
    "yield" {return ValaTypes.YIELD; }
    "new" {return ValaTypes.NEW; }
    "async" {return ValaTypes.ASYNC; }
    "this" {return ValaTypes.THIS; }
    "is" {return ValaTypes.IS; }
    "base" {return ValaTypes.BASE; }
    "as" {return ValaTypes.AS; }
    "typeof" {return ValaTypes.TYPEOF; }
    "CCode" {return ValaTypes.CCODE; }
    "Version" {return ValaTypes.VERSION; }
    "DBus" {return ValaTypes.DBUS; }
    "delegate" {return ValaTypes.DELEGATE; }
    "signal" {return ValaTypes.SIGNAL; }
    "errordomain" {return ValaTypes.ERRORDOMAIN; }
    "requires" {return ValaTypes.REQUIRES; }
    "ensures" {return ValaTypes.ENSURES; }
    "lock" {return ValaTypes.LOCK; }
    "weak" {return ValaTypes.WEAK; }
    "extern" {return ValaTypes.EXTERN; }

    // Comments
    {DOC_COMMENT}      { return ValaTypes.DOC_COMMENT; }
    {BLOCK_COMMENT}    { return ValaTypes.BLOCK_COMMENT; }
    {COMMENT}          { return ValaTypes.COMMENT; }

    // Expressions

     // Data Structures
    "class" { return ValaTypes.CLASS; }
    "interface" { return ValaTypes.INTERFACE; }
    "struct" { return ValaTypes.STRUCT; }
    "enum" { return ValaTypes.ENUM; }
    "construct" { return ValaTypes.CONSTRUCT; }
    "HashMap" { return ValaTypes.HASHMAP; }
    "Object" { return ValaTypes.OBJECT; }



    // Access Modifiers
    "public"      { return ValaTypes.PUBLIC; }
    "private"    { return ValaTypes.PRIVATE; }
    "protected"   { return ValaTypes.PROTECTED; }
    "internal"    { return ValaTypes.INTERNAL; }

    // Other Modifiers
    "abstract"    { return ValaTypes.ABSTRACT; }
    "virtual"     { return ValaTypes.VIRTUAL; }
    "static"      { return ValaTypes.STATIC; }
    "override"    { return ValaTypes.OVERRIDE; }
    "unowned"    { return ValaTypes.UNOWNED; }

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
    "var"        { return ValaTypes.VAR; }
    "void"       { return ValaTypes.VOID; }
    "size_t"    { return ValaTypes.SIZE_T; }
    "ssize_t"   { return ValaTypes.SSIZE_T; }

    // Values
    "true"       { return ValaTypes.TRUE; }
    "false"      { return ValaTypes.FALSE; }
    "null"       { return ValaTypes.NULL; }

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
    "_"        { return ValaTypes.UNDERSCORE; }
    "|"        { return ValaTypes.PIPE; }
    "&"        { return ValaTypes.AND; }
    "^"        { return ValaTypes.CARET; }
    "~"        { return ValaTypes.TILDE; }
    "="           { return ValaTypes.EQUALS; }
    "+"             { return ValaTypes.PLUS; }
    ">"               { return ValaTypes.GREATER_THAN; }
    "<"              { return ValaTypes.LESS_THAN; }
    "-"            { return ValaTypes.MINUS; }
    "*"         { return ValaTypes.STAR; }
    "/"           { return ValaTypes.FORWARD_SLASH; }
    "%"           { return ValaTypes.PERCENT; }
    "#"           { return ValaTypes.POUND; }
    "!"                  { return ValaTypes.EXCLAMATION; }

    // Testing
    "assert"             { return ValaTypes.ASSERT; }

    // Lastly
    {CONSTANT}         { return ValaTypes.CONSTANT; }
    {METHOD_CALL}/[ \t]*"("[^)]*")"[ \t]*(("=>"[ \t]*"{")|[;])      {
              String text = yytext().toString();

              if(!ValaTokenSets.KEYWORDS_STRINGS.contains(text)) {
                  return ValaTypes.METHOD_CALL;
              }
          }

    {IDENTIFIER}       { return ValaTypes.IDENTIFIER; }
    // Error Fallback
    [^]                { return TokenType.BAD_CHARACTER; }
}