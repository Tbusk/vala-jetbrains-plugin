package com.tbusk.vala_plugin.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.tbusk.vala_plugin.ValaLexerAdapter;
import org.jetbrains.annotations.NotNull;

import static com.tbusk.vala_plugin.ValaTokenSets.KEYWORDS;

/**
 * ValaSyntaxHighlighter is responsible for providing syntax highlighting for Vala files.
 * It maps Vala token types to text attributes keys that define how they should be displayed in the editor.
 * <br/><br/>
 * <a href="https://plugins.jetbrains.com/docs/intellij/syntax-highlighter-and-color-settings-page.html#define-a-syntax-highlighter">view documentation</a>
 */
public class ValaSyntaxHighlighter extends SyntaxHighlighterBase {

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
            return ValaTextAttributeKeys.KEYWORD_KEYS;
        }

        if (ValaTypeToKeys.TYPE_MAP.containsKey(tokenType)) {
            return ValaTypeToKeys.TYPE_MAP.get(tokenType);
        }

        return ValaTextAttributeKeys.EMPTY_KEYS;
    }

}
