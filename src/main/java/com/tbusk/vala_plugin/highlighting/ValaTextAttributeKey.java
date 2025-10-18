package com.tbusk.vala_plugin.highlighting;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

public class ValaTextAttributeKey {

    public static final TextAttributesKey LINE_COMMENT = TextAttributesKey.createTextAttributesKey(
            "VALA_LINE_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT
    );
    public static final TextAttributesKey BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey(
            "VALA_BLOCK_COMMENT",
            DefaultLanguageHighlighterColors.BLOCK_COMMENT
    );
    public static final TextAttributesKey DOC_COMMENT = TextAttributesKey.createTextAttributesKey(
            "VALA_DOC_COMMENT",
            DefaultLanguageHighlighterColors.DOC_COMMENT
    );

    public static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey(
            "VALA_KEYWORDS",
            DefaultLanguageHighlighterColors.KEYWORD
    );

    public static final TextAttributesKey OPERATIONS = TextAttributesKey.createTextAttributesKey(
            "VALA_OPERATIONS",
            DefaultLanguageHighlighterColors.OPERATION_SIGN
    );
    public static final TextAttributesKey STRING_LITERAL = TextAttributesKey.createTextAttributesKey(
            "VALA_STRING_LITERAL",
            DefaultLanguageHighlighterColors.STRING
    );
    public static final TextAttributesKey SEMICOLON = TextAttributesKey.createTextAttributesKey(
            "VALA_SEMICOLON",
            DefaultLanguageHighlighterColors.SEMICOLON
    );
    public static final TextAttributesKey BRACKETS = TextAttributesKey.createTextAttributesKey(
            "VALA_BRACKETS",
            DefaultLanguageHighlighterColors.BRACKETS
    );
    public static final TextAttributesKey BRACES = TextAttributesKey.createTextAttributesKey(
            "VALA_BRACES",
            DefaultLanguageHighlighterColors.BRACES
    );
    public static final TextAttributesKey COMMA = TextAttributesKey.createTextAttributesKey(
            "VALA_COMMA",
            DefaultLanguageHighlighterColors.COMMA
    );
    public static final TextAttributesKey DOT = TextAttributesKey.createTextAttributesKey(
            "VALA_DOT",
            DefaultLanguageHighlighterColors.DOT
    );
    public static final TextAttributesKey PARENTHESES = TextAttributesKey.createTextAttributesKey(
            "VALA_PARENTHESES",
            DefaultLanguageHighlighterColors.PARENTHESES
    );
    public static final TextAttributesKey NUMBER_LITERAL = TextAttributesKey.createTextAttributesKey(
            "VALA_NUMBER_LITERAL",
            DefaultLanguageHighlighterColors.NUMBER
    );

    public static final TextAttributesKey LOCAL_VARIABLE = TextAttributesKey.createTextAttributesKey(
            "VALA_LOCAL_VARIABLE",
            DefaultLanguageHighlighterColors.LOCAL_VARIABLE
    );
    public static final TextAttributesKey METHOD_CALL = TextAttributesKey.createTextAttributesKey(
            "VALA_METHOD_CALL",
            DefaultLanguageHighlighterColors.FUNCTION_CALL
    );
    public static final TextAttributesKey METHOD_DECLARATION = TextAttributesKey.createTextAttributesKey(
            "VALA_METHOD_DECLARATION",
            DefaultLanguageHighlighterColors.FUNCTION_DECLARATION
    );
    public static final TextAttributesKey STRUCTURE_NAMES = TextAttributesKey.createTextAttributesKey(
            "VALA_STRUCTURE_NAME",
            DefaultLanguageHighlighterColors.CLASS_NAME
    );
    public static final TextAttributesKey INTERFACE_NAME = TextAttributesKey.createTextAttributesKey(
            "VALA_INTERFACE_NAME",
            DefaultLanguageHighlighterColors.INTERFACE_NAME
    );
    public static final TextAttributesKey CONSTANT = TextAttributesKey.createTextAttributesKey(
            "VALA_CONSTANT",
            DefaultLanguageHighlighterColors.CONSTANT
    );
    public static final TextAttributesKey PARAMETER = TextAttributesKey.createTextAttributesKey(
            "VALA_PARAMETER",
            DefaultLanguageHighlighterColors.PARAMETER
    );

    public static final TextAttributesKey ATTRIBUTE = TextAttributesKey.createTextAttributesKey(
            "VALA_ATTRIBUTE",
            DefaultLanguageHighlighterColors.PARAMETER
    );

    public static final TextAttributesKey IDENTIFIER = TextAttributesKey.createTextAttributesKey(
            "VALA_IDENTIFIER",
            DefaultLanguageHighlighterColors.IDENTIFIER
    );

    public static final TextAttributesKey INSTANCE_VARIABLE = TextAttributesKey.createTextAttributesKey(
            "VALA_INSTANCE_VARIABLE",
            DefaultLanguageHighlighterColors.INSTANCE_FIELD
    );

}
