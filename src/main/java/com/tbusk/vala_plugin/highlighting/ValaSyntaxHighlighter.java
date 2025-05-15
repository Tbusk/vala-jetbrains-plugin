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

import static com.tbusk.vala_plugin.psi.ValaTypes.IF_STATEMENT;

public class ValaSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey LINE_COMMENT = TextAttributesKey.createTextAttributesKey("VALA_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey("VALA_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey DOC_COMMENT = TextAttributesKey.createTextAttributesKey("VALA_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey SEMICOLON = TextAttributesKey.createTextAttributesKey("SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey PARENTHESIS = TextAttributesKey.createTextAttributesKey("PARENTHESIS", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey IDENTIFIER = TextAttributesKey.createTextAttributesKey("IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey("KEYWORDS", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey OPERATIONS = TextAttributesKey.createTextAttributesKey("OPERATIONS", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    private static final TextAttributesKey[] LINE_COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT};
    private static final TextAttributesKey[] BLOCK_COMMENT_KEYS = new TextAttributesKey[]{BLOCK_COMMENT};
    private static final TextAttributesKey[] DOC_COMMENT_KEYS = new TextAttributesKey[]{DOC_COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{SEMICOLON};
    private static final TextAttributesKey[] PARENTHESIS_KEYS = new TextAttributesKey[]{PARENTHESIS};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] OPERATIONS_KEYS = new TextAttributesKey[]{OPERATIONS};

    private static final HashMap<IElementType, TextAttributesKey[]> tokenHighlightMap = new HashMap<>(Map.ofEntries(
            Map.entry(ValaTypes.COMMENT, LINE_COMMENT_KEYS),
            Map.entry(ValaTypes.BLOCK_COMMENT, BLOCK_COMMENT_KEYS),
            Map.entry(ValaTypes.DOC_COMMENT, DOC_COMMENT_KEYS),
            Map.entry(ValaTypes.SEMICOLON, SEMICOLON_KEYS),
            Map.entry(ValaTypes.LPAREN, PARENTHESIS_KEYS),
            Map.entry(ValaTypes.RPAREN, PARENTHESIS_KEYS),
            Map.entry(ValaTypes.IDENTIFIER, IDENTIFIER_KEYS),
            Map.entry(IF_STATEMENT, KEYWORD_KEYS),
            Map.entry(ValaTypes.FOR_STATEMENT, KEYWORD_KEYS),
            Map.entry(ValaTypes.WHILE_STATEMENT, KEYWORD_KEYS),
            Map.entry(ValaTypes.NAMESPACE_STATEMENT, KEYWORD_KEYS),
            Map.entry(ValaTypes.USING_STATEMENT, KEYWORD_KEYS),
            Map.entry(ValaTypes.TRY_STATEMENT, KEYWORD_KEYS),
            Map.entry(ValaTypes.RETURN_STATEMENT, KEYWORD_KEYS),
            Map.entry(ValaTypes.GREATER_THAN, OPERATIONS_KEYS),
            Map.entry(ValaTypes.LESS_THAN, OPERATIONS_KEYS),
            Map.entry(ValaTypes.PLUS, OPERATIONS_KEYS),
            Map.entry(ValaTypes.MINUS, OPERATIONS_KEYS),
            Map.entry(ValaTypes.MULTIPLY, OPERATIONS_KEYS),
            Map.entry(ValaTypes.DIVIDE, OPERATIONS_KEYS),
            Map.entry(ValaTypes.CHAR, KEYWORD_KEYS),
            Map.entry(ValaTypes.UCHAR, KEYWORD_KEYS),
            Map.entry(ValaTypes.UNICHAR, KEYWORD_KEYS),
            Map.entry(ValaTypes.INT, KEYWORD_KEYS),
            Map.entry(ValaTypes.UINT, KEYWORD_KEYS),
            Map.entry(ValaTypes.LONG, KEYWORD_KEYS),
            Map.entry(ValaTypes.ULONG, KEYWORD_KEYS),
            Map.entry(ValaTypes.SHORT, KEYWORD_KEYS),
            Map.entry(ValaTypes.USHORT, KEYWORD_KEYS),
            Map.entry(ValaTypes.INT8, KEYWORD_KEYS),
            Map.entry(ValaTypes.INT16, KEYWORD_KEYS),
            Map.entry(ValaTypes.INT32, KEYWORD_KEYS),
            Map.entry(ValaTypes.INT64, KEYWORD_KEYS),
            Map.entry(ValaTypes.UINT8, KEYWORD_KEYS),
            Map.entry(ValaTypes.UINT16, KEYWORD_KEYS),
            Map.entry(ValaTypes.UINT32, KEYWORD_KEYS),
            Map.entry(ValaTypes.UINT64, KEYWORD_KEYS),
            Map.entry(ValaTypes.FLOAT, KEYWORD_KEYS),
            Map.entry(ValaTypes.DOUBLE, KEYWORD_KEYS),
            Map.entry(ValaTypes.BOOL, KEYWORD_KEYS),
            Map.entry(ValaTypes.TRUE, KEYWORD_KEYS),
            Map.entry(ValaTypes.FALSE, KEYWORD_KEYS),
            Map.entry(ValaTypes.STRUCT, KEYWORD_KEYS),
            Map.entry(ValaTypes.ENUM, KEYWORD_KEYS),
            Map.entry(ValaTypes.VAR, KEYWORD_KEYS)

    ));

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new ValaLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if(tokenHighlightMap.containsKey(tokenType)) {
            return tokenHighlightMap.get(tokenType);
        }

        return EMPTY_KEYS;
    }

}
