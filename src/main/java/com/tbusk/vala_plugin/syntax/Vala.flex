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

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
SINGLE_LINE_COMMENT="//"[^\r\n]*
MULTI_LINE_COMMENT="/*"([^*]|(\*+[^*/]))*\*+"/"

%state WAITING_VALUE
%state IN_COMMENT

%%

<YYINITIAL> {SINGLE_LINE_COMMENT}                           { yybegin(YYINITIAL); return ValaTypes.LINE_COMMENT; }
<YYINITIAL> {MULTI_LINE_COMMENT}                            { yybegin(YYINITIAL); return ValaTypes.DOC_COMMENT; }



<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }