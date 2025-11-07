package com.tbusk.vala_plugin.highlighting;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.psi.tree.IElementType;
import com.tbusk.vala_plugin.psi.ValaTypes;

import java.util.HashMap;
import java.util.Map;

public class ValaTypeToKeys {

    public static final Map<IElementType, TextAttributesKey[]> TYPE_MAP = new HashMap<>(
            Map.ofEntries(
                    Map.entry(ValaTypes.COMMENT, ValaTextAttributeKeys.LINE_COMMENT_KEYS),
                    Map.entry(ValaTypes.BLOCK_COMMENT, ValaTextAttributeKeys.BLOCK_COMMENT_KEYS),
                    Map.entry(ValaTypes.DOC_COMMENT, ValaTextAttributeKeys.DOC_COMMENT_KEYS),

                    Map.entry(ValaTypes.STRING_LITERAL, ValaTextAttributeKeys.STRING_LITERAL_KEYS),
                    Map.entry(ValaTypes.CHAR_LITERAL, ValaTextAttributeKeys.STRING_LITERAL_KEYS),

                    Map.entry(ValaTypes.INTEGER_LITERAL, ValaTextAttributeKeys.NUMBER_LITERAL_KEYS),
                    Map.entry(ValaTypes.DECIMAL_LITERAL, ValaTextAttributeKeys.NUMBER_LITERAL_KEYS),
                    Map.entry(ValaTypes.HEXADECIMAL_LITERAL, ValaTextAttributeKeys.NUMBER_LITERAL_KEYS),

                    Map.entry(ValaTypes.SEMICOLON, ValaTextAttributeKeys.SEMICOLON_KEYS),

                    Map.entry(ValaTypes.LBRACKET, ValaTextAttributeKeys.BRACKETS_KEYS),
                    Map.entry(ValaTypes.RBRACKET, ValaTextAttributeKeys.BRACKETS_KEYS),

                    Map.entry(ValaTypes.LBRACE, ValaTextAttributeKeys.BRACES_KEYS),
                    Map.entry(ValaTypes.RBRACE, ValaTextAttributeKeys.BRACES_KEYS),

                    Map.entry(ValaTypes.COMMA, ValaTextAttributeKeys.COMMA_KEYS),

                    Map.entry(ValaTypes.DOT, ValaTextAttributeKeys.DOT_KEYS),

                    Map.entry(ValaTypes.LPAREN, ValaTextAttributeKeys.PARENTHESES_KEYS),
                    Map.entry(ValaTypes.RPAREN, ValaTextAttributeKeys.PARENTHESES_KEYS),

                    Map.entry(ValaTypes.PLUS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.MINUS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.FORWARD_SLASH, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.MODULO, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.EQUALS_EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.PLUS_EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.MINUS_EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.DIVIDE_EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.MODULO_EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.NOT_EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.OR_OR, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.LESS_THAN, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.GREATER_THAN, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.GREATER_THAN_EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.LESS_THAN_EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.INCREMENT, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.DECREMENT, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.TILDE, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.AND, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.AND_AND, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.PIPE, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.PIPE_EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.STAR, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.AND_EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.XOR_EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.SHIFT_LEFT_EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.SHIFT_RIGHT_EQUALS, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.EXCLAMATION, ValaTextAttributeKeys.OPERATION_KEYS),
                    Map.entry(ValaTypes.ARROW, ValaTextAttributeKeys.OPERATION_KEYS)
            )
    );

}
