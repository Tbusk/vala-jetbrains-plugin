package com.tbusk.vala_plugin.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.tbusk.vala_plugin.ValaLexerAdapter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static com.tbusk.vala_plugin.ValaTokenSets.KEYWORDS;

/**
 * ValaSyntaxHighlighter is responsible for providing syntax highlighting for Vala files.
 * It maps Vala token types to text attributes keys that define how they should be displayed in the editor.
 * <br/><br/>
 * <a href="https://plugins.jetbrains.com/docs/intellij/syntax-highlighter-and-color-settings-page.html#define-a-syntax-highlighter">view documentation</a>
 */
public class ValaSyntaxHighlighter extends SyntaxHighlighterBase {

    // Text attribute keys added to key arrays that are used to highlight tokens.
    public static final TextAttributesKey LINE_COMMENT = TextAttributesKey.createTextAttributesKey("VALA_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey("VALA_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey DOC_COMMENT = TextAttributesKey.createTextAttributesKey("VALA_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey IDENTIFIER = TextAttributesKey.createTextAttributesKey("VALA_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey("VALA_KEYWORDS", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey OPERATIONS = TextAttributesKey.createTextAttributesKey("VALA_OPERATIONS", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey("VALA_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey SEMICOLON = TextAttributesKey.createTextAttributesKey("VALA_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey BRACKETS = TextAttributesKey.createTextAttributesKey("VALA_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey BRACES = TextAttributesKey.createTextAttributesKey("VALA_BRACES", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey COMMA = TextAttributesKey.createTextAttributesKey("VALA_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey DOT = TextAttributesKey.createTextAttributesKey("VALA_DOT", DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey PARENTHESES = TextAttributesKey.createTextAttributesKey("VALA_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);

    public static final TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey("VALA_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey CONSTANT = TextAttributesKey.createTextAttributesKey("VALA_CONSTANT", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey METHOD_CALL = TextAttributesKey.createTextAttributesKey("VALA_METHOD_CALL", DefaultLanguageHighlighterColors.STATIC_FIELD);

    // Text attributes key arrays used to highlight tokens of specific types.
    private static final TextAttributesKey[] LINE_COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT};
    private static final TextAttributesKey[] BLOCK_COMMENT_KEYS = new TextAttributesKey[]{BLOCK_COMMENT};
    private static final TextAttributesKey[] DOC_COMMENT_KEYS = new TextAttributesKey[]{DOC_COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] CONSTANT_KEYS = new TextAttributesKey[]{CONSTANT};
    private static final TextAttributesKey[] METHOD_CALL_KEYS = new TextAttributesKey[]{METHOD_CALL};
    private static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{SEMICOLON};
    private static final TextAttributesKey[] BRACKETS_KEYS = new TextAttributesKey[]{BRACKETS};
    private static final TextAttributesKey[] BRACES_KEYS = new TextAttributesKey[]{BRACES};
    private static final TextAttributesKey[] COMMA_KEYS = new TextAttributesKey[]{COMMA};
    private static final TextAttributesKey[] DOT_KEYS = new TextAttributesKey[]{DOT};
    private static final TextAttributesKey[] PARENTHESES_KEYS = new TextAttributesKey[]{PARENTHESES};


    // Map of a vala token type to the text attribute key array used to highlight it.
    private static final Map<IElementType, TextAttributesKey[]> keyMap = new HashMap<>(
             Map.ofEntries(
                    Map.entry(ValaTypes.COMMENT, LINE_COMMENT_KEYS),
                    Map.entry(ValaTypes.BLOCK_COMMENT, BLOCK_COMMENT_KEYS),
                    Map.entry(ValaTypes.DOC_COMMENT, DOC_COMMENT_KEYS),
                    Map.entry(ValaTypes.IDENTIFIER, IDENTIFIER_KEYS),
                    Map.entry(ValaTypes.STRING_LITERAL, STRING_KEYS),
                    Map.entry(ValaTypes.CHAR_LITERAL, STRING_KEYS),
                    Map.entry(ValaTypes.NUMBER, NUMBER_KEYS),
                    Map.entry(ValaTypes.CONSTANT, CONSTANT_KEYS),
                    Map.entry(ValaTypes.SEMICOLON, SEMICOLON_KEYS),
                     Map.entry(ValaTypes.METHOD_CALL_NAME, METHOD_CALL_KEYS),
                    Map.entry(ValaTypes.LBRACKET, BRACKETS_KEYS),
                    Map.entry(ValaTypes.RBRACKET, BRACKETS_KEYS),
                    Map.entry(ValaTypes.LBRACE, BRACES_KEYS),
                    Map.entry(ValaTypes.RBRACE, BRACES_KEYS),
                    Map.entry(ValaTypes.COMMA, COMMA_KEYS),
                    Map.entry(ValaTypes.DOT, DOT_KEYS),
                    Map.entry(ValaTypes.LPAREN, PARENTHESES_KEYS),
                    Map.entry(ValaTypes.RPAREN, PARENTHESES_KEYS)
             )
    );

    /**
     * Returns the highlighting lexer for Vala.
     *
     * @return the lexer used for syntax highlighting in Vala files.
     */
    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new ValaLexerAdapter();
    }

    /**
     * Returns the text attributes keys used to highlight tokens of a specific type. Uses a map to associate token types
     * with their corresponding text attributes keys and checks against keywords stored in ValaTokenSets.
     *
     * @param tokenType the type of the token to highlight.
     * @return an array of text attributes keys used to highlight the token.
     */
    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if(KEYWORDS.contains(tokenType)) {
            return KEYWORD_KEYS;
        }

        if (keyMap.containsKey(tokenType)) {
            return keyMap.get(tokenType);
        }

        return EMPTY_KEYS;
    }

}
