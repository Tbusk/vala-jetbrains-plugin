package com.tbusk.vala_plugin.highlighting;

import com.intellij.openapi.editor.colors.TextAttributesKey;

public final class ValaTextAttributeKeys {

    public static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[]{};

    // Keywords
    public static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{
            ValaTextAttributeKey.KEYWORD
    };

    // Comments
    public static final TextAttributesKey[] LINE_COMMENT_KEYS = new TextAttributesKey[]{
            ValaTextAttributeKey.LINE_COMMENT
    };
    public static final TextAttributesKey[] BLOCK_COMMENT_KEYS = new TextAttributesKey[]{
            ValaTextAttributeKey.BLOCK_COMMENT
    };
    public static final TextAttributesKey[] DOC_COMMENT_KEYS = new TextAttributesKey[]{
            ValaTextAttributeKey.DOC_COMMENT
    };

    // Literals
    public static final TextAttributesKey[] STRING_LITERAL_KEYS = new TextAttributesKey[]{
            ValaTextAttributeKey.STRING_LITERAL
    };
    public static final TextAttributesKey[] NUMBER_LITERAL_KEYS = new TextAttributesKey[]{
            ValaTextAttributeKey.NUMBER_LITERAL
    };

    // Misc Tokens
    public static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{
            ValaTextAttributeKey.SEMICOLON
    };
    public static final TextAttributesKey[] BRACKETS_KEYS = new TextAttributesKey[]{
            ValaTextAttributeKey.BRACKETS
    };
    public static final TextAttributesKey[] BRACES_KEYS = new TextAttributesKey[]{
            ValaTextAttributeKey.BRACES
    };
    public static final TextAttributesKey[] COMMA_KEYS = new TextAttributesKey[]{
            ValaTextAttributeKey.COMMA
    };
    public static final TextAttributesKey[] DOT_KEYS = new TextAttributesKey[]{
            ValaTextAttributeKey.DOT
    };
    public static final TextAttributesKey[] PARENTHESES_KEYS = new TextAttributesKey[]{
            ValaTextAttributeKey.PARENTHESES
    };
    public static final TextAttributesKey[] OPERATION_KEYS = new TextAttributesKey[]{
            ValaTextAttributeKey.OPERATIONS
    };
}
