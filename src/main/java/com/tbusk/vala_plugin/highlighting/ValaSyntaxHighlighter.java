package com.tbusk.vala_plugin.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.tbusk.vala_plugin.ValaLexerAdapter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class ValaSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey DOC_COMMENT =
            createTextAttributesKey("VALA_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("VALA_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);


    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{DOC_COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new ValaLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(ValaTypes.SEMICOLON) ||
                tokenType.equals(ValaTypes.COMMA) ||
                tokenType.equals(ValaTypes.EQUALS) ||
                tokenType.equals(ValaTypes.COLON) ||
                tokenType.equals(ValaTypes.PLUS) ||
                tokenType.equals(ValaTypes.MINUS) ||
                tokenType.equals(ValaTypes.DIVIDE) ||
                tokenType.equals(ValaTypes.MULTIPLY)) {
            return SEPARATOR_KEYS;
        }
        if (tokenType.equals(ValaTypes.BLOCK_COMMENT) ||
                tokenType.equals(ValaTypes.LINE_COMMENT)) {
            return COMMENT_KEYS;
        }

        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }

}
