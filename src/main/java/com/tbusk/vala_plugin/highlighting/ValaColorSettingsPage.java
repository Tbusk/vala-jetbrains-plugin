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
            new AttributesDescriptor("Identifier", ValaSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("Keyword", ValaSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("String", ValaSyntaxHighlighter.STRING),
            new AttributesDescriptor("Number", ValaSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("Constant", ValaSyntaxHighlighter.CONSTANT),
            new AttributesDescriptor("Method call", ValaSyntaxHighlighter.METHOD_CALL),
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
                        int a = 0;
                        uchar b = 'c';
                        string c = "Hello world";
                
                        public int get_a() {
                            return a;
                        }
                
                        var myint = get_a();
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
