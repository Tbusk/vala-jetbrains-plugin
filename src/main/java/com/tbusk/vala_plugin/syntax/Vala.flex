package com.tbusk.vala_plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.intellij.psi.TokenType;
import com.tbusk.vala_plugin.ValaTokenSets;
import com.tbusk.vala_plugin.psi.ValaTokenType;

/**
 * Lexer generator used is JFlex.
 * Documentation can be found at: https://jflex.de/manual.html
 */
%% // text above %% is copied verbatim to the generated lexer class before the class declaration

%public // The lexer class will be public, so it can be used by the parser and other components

// generated lexer class name. Results in ValaLexer.java
%class ValaLexer

// An intellij lexer interface with some convenient methods
%implements FlexLexer

/**
 * %unicode is the set of characters that the scanner will work on. Unicode should always be used for text files.
 * Versioning is supported, but if none is provided, the most recent version will be used (12.1 with JFlex 1.9.2).
 */
%unicode

/**
 * The function in which the lexer will be called to advance to the next token or until the end of the file / an I/O
 * error occurs.
 * Largely, all the items will go into a switch statement, which will return the parser token type.
 */
%function advance

/**
 * The type of the token that is used. Varies based on the parser implementation, but in this case, it is IElementType
 * provided by Intellij.
 */
%type IElementType

/**
 * What to do when the end of the file is reached. In this case, it will do a return.
 */
%eof{ return;
%eof}

// Enable or disable debugging
// %debug

// Tokens
WHITE_SPACE=[ \t\n\r]+
IDENTIFIER=[a-zA-Z_][a-zA-Z0-9$_]*
STRING_LITERAL=@?\"([^\\\"]|\\.)*\"
CHAR_LITERAL=\'([^\\\']|\\.)*\'
DECIMAL_LITERAL=(-?[0-9]+[.]?[0-9]*)
INTEGER_LITERAL=(-?[0-9]+)
REGULAR_EXPRESSION=\/([\(\)\[\]\.\+\^\$\|\\\?_\{\}a-zA-Z0-9@*\-\'].*\/[\n]?[ ]*([mixos]*[\n]?[ ]*(\.match|;|\.replace_eval|\.replace)))


// Comments
COMMENT="//"[^\r\n]*
BLOCK_COMMENT="/*"([^*]|\*[^/])*"\*/"
DOC_COMMENT="/**"([^*]|"*"+[^*/])*"*"+"/"
TRIPLE_QUOTE_STRING=\"\"\"([^\"]|\"[^\"]|\"\"[^\"])*\"\"\"
PREPROCESSOR_DIRECTIVE=("#if" | "#endif" | "#elif" | "#else") .* ("\r"|"\n"|"\r\n")

%%

<YYINITIAL> {

    // Other tokens
    {STRING_LITERAL}   { return ValaTypes.STRING_LITERAL; }
    {CHAR_LITERAL}     { return ValaTypes.CHAR_LITERAL; }
    {INTEGER_LITERAL}           { return ValaTypes.INTEGER_LITERAL; }
    {DECIMAL_LITERAL}           { return ValaTypes.DECIMAL_LITERAL; }
    {WHITE_SPACE}      { return TokenType.WHITE_SPACE; }
    {TRIPLE_QUOTE_STRING} { return ValaTypes.TRIPLE_QUOTE_STRING; }

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
    "if"    { return ValaTypes.IF; }
    "else" { return ValaTypes.ELSE; }
    "switch" { return ValaTypes.SWITCH; }
    "while" { return ValaTypes.WHILE; }
    "for" { return ValaTypes.FOR; }
    "foreach" { return ValaTypes.FOREACH; }
    "yield" {return ValaTypes.YIELD; }
    "new" {return ValaTypes.NEW; }
    "async" {return ValaTypes.ASYNC; }
    "this" {return ValaTypes.THIS; }
    "base" {return ValaTypes.BASE; }
    "signal" {return ValaTypes.SIGNAL; }
    "errordomain" {return ValaTypes.ERRORDOMAIN; }
    "requires" {return ValaTypes.REQUIRES; }
    "ensures" {return ValaTypes.ENSURES; }
    "lock" {return ValaTypes.LOCK; }
    "weak" {return ValaTypes.WEAK; }
    "extern" {return ValaTypes.EXTERN; }
    "delegate" {return ValaTypes.DELEGATE; }
    "inline" {return ValaTypes.INLINE; }

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
    "owned"    { return ValaTypes.OWNED; }
    "ref"    { return ValaTypes.REF; }
    "out"    { return ValaTypes.OUT; }


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

    // Characters
    "->"             { return ValaTypes.ARROW; }
    "++"             { return ValaTypes.INCREMENT; }
    "--"             { return ValaTypes.DECREMENT; }
    "=="            { return ValaTypes.EQUALS_EQUALS; }
    "!="            { return ValaTypes.NOT_EQUALS; }
    ">="            { return ValaTypes.GREATER_THAN_EQUALS; }
    "<="            { return ValaTypes.LESS_THAN_EQUALS; }
    "+="           { return ValaTypes.PLUS_EQUALS; }
    "-="           { return ValaTypes.MINUS_EQUALS; }
    "*="           { return ValaTypes.MULTIPLY_EQUALS; }
    "/="           { return ValaTypes.DIVIDE_EQUALS; }
    "%="           { return ValaTypes.MODULO_EQUALS; }
    "&&"           { return ValaTypes.AND_AND; }
    "|="           { return ValaTypes.PIPE_EQUALS; }
    "||"           { return ValaTypes.OR_OR; }
    ";"        { return ValaTypes.SEMICOLON; }
    ":"          { return ValaTypes.COLON; }
    ","            { return ValaTypes.COMMA; }
    "..."          { return ValaTypes.DOT_DOT_DOT; }
    "."              { return ValaTypes.DOT; }
    "("           { return ValaTypes.LPAREN; }
    ")"          { return ValaTypes.RPAREN; }
    "{"           { return ValaTypes.LBRACE; }
    "}"           { return ValaTypes.RBRACE; }
    "["         { return ValaTypes.LBRACKET; }
    "]"         { return ValaTypes.RBRACKET; }
    "@"               { return ValaTypes.AT; }
    "?"    { return ValaTypes.QUESTION_MARK; }
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
    "\\"          { return ValaTypes.BACKSLASH; }
    "%"           { return ValaTypes.MODULO; }
    "#"           { return ValaTypes.POUND; }
    "!"                  { return ValaTypes.EXCLAMATION; }
    "`"                { return ValaTypes.BACKTICK; }
    "$"               { return ValaTypes.DOLLAR; }

    // Lastly
    {REGULAR_EXPRESSION}       { return ValaTypes.REGULAR_EXPRESSION; }
    {IDENTIFIER}       { return ValaTypes.IDENTIFIER; }
    {PREPROCESSOR_DIRECTIVE} { return ValaTypes.PREPROCESSOR_DIRECTIVE; }

    // Error Fallback
    [^]                { return TokenType.BAD_CHARACTER; }
}