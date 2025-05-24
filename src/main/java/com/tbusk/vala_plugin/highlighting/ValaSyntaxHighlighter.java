package com.tbusk.vala_plugin.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.tbusk.vala_plugin.ValaLexerAdapter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import org.jetbrains.annotations.NotNull;

import static com.tbusk.vala_plugin.ValaTokenSets.KEYWORDS;

public class ValaSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey LINE_COMMENT = TextAttributesKey.createTextAttributesKey("VALA_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey("VALA_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey DOC_COMMENT = TextAttributesKey.createTextAttributesKey("VALA_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey SEMICOLON = TextAttributesKey.createTextAttributesKey("SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey PARENTHESIS = TextAttributesKey.createTextAttributesKey("PARENTHESIS", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey IDENTIFIER = TextAttributesKey.createTextAttributesKey("IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey("KEYWORDS", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey OPERATIONS = TextAttributesKey.createTextAttributesKey("OPERATIONS", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BRACKETS = TextAttributesKey.createTextAttributesKey("BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey("STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey("NUMBER", DefaultLanguageHighlighterColors.NUMBER);

    private static final TextAttributesKey[] LINE_COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT};
    private static final TextAttributesKey[] BLOCK_COMMENT_KEYS = new TextAttributesKey[]{BLOCK_COMMENT};
    private static final TextAttributesKey[] DOC_COMMENT_KEYS = new TextAttributesKey[]{DOC_COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new ValaLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if(KEYWORDS.contains(tokenType)) {
            return KEYWORD_KEYS;
        }

        if(tokenType.equals(ValaTypes.BLOCK_COMMENT)) {
            return BLOCK_COMMENT_KEYS;
        } else if (tokenType.equals(ValaTypes.DOC_COMMENT)) {
            return DOC_COMMENT_KEYS;
        } else if (tokenType.equals(ValaTypes.COMMENT)) {
            return LINE_COMMENT_KEYS;
        }

        if(tokenType.equals(ValaTypes.NUMBER)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(ValaTypes.STRING_LITERAL)) {
            return STRING_KEYS;
        } else if (tokenType.equals(ValaTypes.IDENTIFIER)) {
            return IDENTIFIER_KEYS;
        }

        return EMPTY_KEYS;
    }

}
