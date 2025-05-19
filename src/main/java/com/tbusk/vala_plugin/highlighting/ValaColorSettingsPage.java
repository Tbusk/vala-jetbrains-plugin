package com.tbusk.vala_plugin.highlighting;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.util.NlsContexts;
import com.tbusk.vala_plugin.language.ValaIcons;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class ValaColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Line comment", ValaSyntaxHighlighter.LINE_COMMENT),
            new AttributesDescriptor("Block comment", ValaSyntaxHighlighter.BLOCK_COMMENT),
            new AttributesDescriptor("Doc comment", ValaSyntaxHighlighter.DOC_COMMENT),
            new AttributesDescriptor("Semicolon", ValaSyntaxHighlighter.SEMICOLON),
            new AttributesDescriptor("Parenthesis", ValaSyntaxHighlighter.PARENTHESIS),
            new AttributesDescriptor("Identifier", ValaSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("Keyword", ValaSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Operation sign", ValaSyntaxHighlighter.OPERATIONS),
            new AttributesDescriptor("Brackets", ValaSyntaxHighlighter.BRACKETS),
            new AttributesDescriptor("String", ValaSyntaxHighlighter.STRING),
            new AttributesDescriptor("Number", ValaSyntaxHighlighter.NUMBER)
    };

    @Override
    public @Nullable Icon getIcon() {
        return ValaIcons.FILE;
    }

    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return new ValaSyntaxHighlighter();
    }

    @Override
    public @NonNls @NotNull String getDemoText() {
        return """
                using GObject.Introspection;
                
                namespace Example {
                    public virtual class Test : Example {
                        int a;
                        uchar b;
                
                        public int get_a() {
                            return a;
                        }
                    }
                }
                """;
    }

    @Override
    public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return Map.of();
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @Override
    public @NotNull @NlsContexts.ConfigurableName String getDisplayName() {
        return "Vala";
    }
}
