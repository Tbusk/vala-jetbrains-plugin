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
IDENTIFIER=@?[a-zA-Z_][a-zA-Z0-9$_]*\\??
STRING_LITERAL=@?\"([^\\\"]|\\.)*\"
CHAR_LITERAL=\'([^\\\']|\\.)*\'
DECIMAL_LITERAL=(-?[0-9]+[.]?[0-9]*)
HEXADECIMAL_LITERAL=0[xX][0-9a-fA-F]+
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
    {STRING_LITERAL} { return ValaTypes.STRING_LITERAL; }
    {CHAR_LITERAL} { return ValaTypes.CHAR_LITERAL; }
    {INTEGER_LITERAL} { return ValaTypes.INTEGER_LITERAL; }
    {DECIMAL_LITERAL} { return ValaTypes.DECIMAL_LITERAL; }
    {HEXADECIMAL_LITERAL} { return ValaTypes.HEXADECIMAL_LITERAL; }
    {WHITE_SPACE} { return TokenType.WHITE_SPACE; }
    {TRIPLE_QUOTE_STRING} { return ValaTypes.TRIPLE_QUOTE_STRING; }

    // Comments
    {DOC_COMMENT} { return ValaTypes.DOC_COMMENT; }
    {BLOCK_COMMENT} { return ValaTypes.BLOCK_COMMENT; }
    {COMMENT} { return ValaTypes.COMMENT; }

    // Selection
    "if" { return ValaTypes.IF; }
    "else" { return ValaTypes.ELSE; }
    "switch" { return ValaTypes.SWITCH; }
    "case" { return ValaTypes.CASE; }
    "default" { return ValaTypes.DEFAULT; }

    // Iteration
    "do" { return ValaTypes.DO; }
    "while" { return ValaTypes.WHILE; }
    "for" { return ValaTypes.FOR; }
    "foreach" { return ValaTypes.FOREACH; }
    "in" { return ValaTypes.IN; }

    // Jumping
    "break" { return ValaTypes.BREAK; }
    "continue" { return ValaTypes.CONTINUE; }
    "return" { return ValaTypes.RETURN; }

    // Exception Handling
    "try" { return ValaTypes.TRY; }
    "catch" { return ValaTypes.CATCH; }
    "throw" { return ValaTypes.THROW; }
    "finally" { return ValaTypes.FINALLY; }

    // Synchronization
    "lock" { return ValaTypes.LOCK; }

    // Type Declaration
    "class" { return ValaTypes.CLASS; }
    "interface" { return ValaTypes.INTERFACE; }
    "struct" { return ValaTypes.STRUCT; }
    "enum" { return ValaTypes.ENUM; }
    "delegate" { return ValaTypes.DELEGATE; }
    "errordomain" { return ValaTypes.ERRORDOMAIN; }

    // Type Modifiers
    "const" { return ValaTypes.CONST; }
    "weak" { return ValaTypes.WEAK; }
    "unowned" { return ValaTypes.UNOWNED; }
    "dynamic" { return ValaTypes.DYNAMIC; }

    // Modifiers
    "abstract" { return ValaTypes.ABSTRACT; }
    "virtual" { return ValaTypes.VIRTUAL; }
    "override" { return ValaTypes.OVERRIDE; }
    "signal" { return ValaTypes.SIGNAL; }
    "extern" { return ValaTypes.EXTERN; }
    "static" { return ValaTypes.STATIC; }
    "async" { return ValaTypes.ASYNC; }
    "inline" { return ValaTypes.INLINE; }
    "new" { return ValaTypes.NEW; }
    "sealed" { return ValaTypes.SEALED; }
    "partial" { return ValaTypes.PARTIAL; }

    // Access Modifiers
    "public" { return ValaTypes.PUBLIC; }
    "private" { return ValaTypes.PRIVATE; }
    "protected" { return ValaTypes.PROTECTED; }
    "internal" { return ValaTypes.INTERNAL; }

    // Method Parameters
    "out" { return ValaTypes.OUT; }
    "ref" { return ValaTypes.REF; }

    // Method Contract Keywords
    "throws" { return ValaTypes.THROWS; }
    "requires" { return ValaTypes.REQUIRES; }
    "ensures" { return ValaTypes.ENSURES; }

    // Namespaces
    "namespace" { return ValaTypes.NAMESPACE; }
    "using" { return ValaTypes.USING; }

    // Operator Keywords
    "as" { return ValaTypes.AS; }
    "is" { return ValaTypes.IS; }
    "delete" { return ValaTypes.DELETE; }
    "sizeof" { return ValaTypes.SIZEOF; }
    "typeof" { return ValaTypes.TYPEOF; }

    // Access Keywords
    "this" { return ValaTypes.THIS; }
    "base" { return ValaTypes.BASE; }

    // Literal Keywords
    "null" { return ValaTypes.NULL; }
    "true" { return ValaTypes.TRUE; }
    "false" { return ValaTypes.FALSE; }

    // Property Context
    "get" { return ValaTypes.GET; }
    "set" { return ValaTypes.SET; }
    "construct" { return ValaTypes.CONSTRUCT; }

    // Other Keywords
    "void" { return ValaTypes.VOID; }
    "var" { return ValaTypes.VAR; }
    "yield" { return ValaTypes.YIELD; }
    "global" { return ValaTypes.GLOBAL; }
    "owned" { return ValaTypes.OWNED; }

    // Primitive Types
    "bool" { return ValaTypes.BOOL; }
    "int" { return ValaTypes.INT; }
    "uint" { return ValaTypes.UINT; }
    "long" { return ValaTypes.LONG; }
    "ulong" { return ValaTypes.ULONG; }
    "float" { return ValaTypes.FLOAT; }
    "double" { return ValaTypes.DOUBLE; }
    "string" { return ValaTypes.STRING; }
    "char" { return ValaTypes.CHAR; }
    "uchar" { return ValaTypes.UCHAR; }
    "unichar" { return ValaTypes.UNICHAR; }
    "short" { return ValaTypes.SHORT; }
    "ushort" { return ValaTypes.USHORT; }
    "uint8" { return ValaTypes.UINT8; }
    "uint16" { return ValaTypes.UINT16; }
    "uint32" { return ValaTypes.UINT32; }
    "uint64" { return ValaTypes.UINT64; }
    "int8" { return ValaTypes.INT8; }
    "int16" { return ValaTypes.INT16; }
    "int32" { return ValaTypes.INT32; }
    "int64" { return ValaTypes.INT64; }
    "size_t" { return ValaTypes.SIZE_T; }
    "ssize_t" { return ValaTypes.SSIZE_T; }

    // Relational Operators
    ">" { return ValaTypes.GREATER_THAN; }
    "<" { return ValaTypes.LESS_THAN; }
    ">=" { return ValaTypes.GREATER_THAN_EQUALS; }
    "<=" { return ValaTypes.LESS_THAN_EQUALS; }

    // Bitwise Operators
    "~" { return ValaTypes.TILDE; }
    "&" { return ValaTypes.AND; }
    "|" { return ValaTypes.PIPE; }
    "^" { return ValaTypes.CARET; }
    // >> and << aren't included due to conflict with nested type endings (<Type<Type>>)

    // Assignment Operators
    "=" { return ValaTypes.EQUALS; }
    "+=" { return ValaTypes.PLUS_EQUALS; }
    "-=" { return ValaTypes.MINUS_EQUALS; }
    "*=" { return ValaTypes.MULTIPLY_EQUALS; }
    "/=" { return ValaTypes.DIVIDE_EQUALS; }
    "%=" { return ValaTypes.MODULO_EQUALS; }
    "&=" { return ValaTypes.AND_EQUALS; }
    "|=" { return ValaTypes.PIPE_EQUALS; }
    "^=" { return ValaTypes.XOR_EQUALS; }
    "<<=" { return ValaTypes.SHIFT_LEFT_EQUALS; }
    ">>=" { return ValaTypes.SHIFT_RIGHT_EQUALS; }

    // Increment / Decrement
    "++" { return ValaTypes.INCREMENT; }
    "--" { return ValaTypes.DECREMENT; }

    // Pointer Operators
    "->" { return ValaTypes.ARROW; }

    // Logic Operators
    "!" { return ValaTypes.EXCLAMATION; }
    "&&" { return ValaTypes.AND_AND; }
    "||" { return ValaTypes.OR_OR; }

    // Equality Operators
    "==" { return ValaTypes.EQUALS_EQUALS; }
    "!=" { return ValaTypes.NOT_EQUALS; }

    // Characters
    ";" { return ValaTypes.SEMICOLON; }
    ":" { return ValaTypes.COLON; }
    "," { return ValaTypes.COMMA; }
    "..." { return ValaTypes.DOT_DOT_DOT; }
    "." { return ValaTypes.DOT; }
    "(" { return ValaTypes.LPAREN; }
    ")" { return ValaTypes.RPAREN; }
    "{" { return ValaTypes.LBRACE; }
    "}" { return ValaTypes.RBRACE; }
    "[" { return ValaTypes.LBRACKET; }
    "]" { return ValaTypes.RBRACKET; }
    "?" { return ValaTypes.QUESTION_MARK; }
    "+" { return ValaTypes.PLUS; }
    "-" { return ValaTypes.MINUS; }
    "*" { return ValaTypes.STAR; }
    "/" { return ValaTypes.FORWARD_SLASH; }
    "\\" { return ValaTypes.BACKSLASH; }
    "%" { return ValaTypes.MODULO; }
    "#" { return ValaTypes.POUND; }
    "`" { return ValaTypes.BACKTICK; }
    "$" { return ValaTypes.DOLLAR; }

    // Lastly
    {REGULAR_EXPRESSION} { return ValaTypes.REGULAR_EXPRESSION; }
    {IDENTIFIER} { return ValaTypes.IDENTIFIER; }
    {PREPROCESSOR_DIRECTIVE} { return ValaTypes.PREPROCESSOR_DIRECTIVE; }

    // Error Fallback
    [^] { return TokenType.BAD_CHARACTER; }
}