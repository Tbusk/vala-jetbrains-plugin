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

/**
 * ValaColorSettingsPage is a class that implements the ColorSettingsPage interface for Vala language support in an IDE.
 * It provides syntax highlighting attributes, demo text, and other settings related to the appearance of Vala code.
 * This class is used to define how Vala code should be highlighted and displayed in the editor in the settings page.
 * <br/><br/>
 * <a href="https://plugins.jetbrains.com/docs/intellij/syntax-highlighter-and-color-settings-page.html#define-a-color-settings-page">view documentation</a>
 */
public class ValaColorSettingsPage implements ColorSettingsPage {

    /**
     * An array of attribute descriptors that define the syntax highlighting attributes for Vala.
     * Each descriptor corresponds to a specific type of syntax element in Vala code.
     * The display name is shown in the color settings UI, and the Highlighter key shows as the source in the
     * settings page.
     */
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Line comment", ValaTextAttributeKey.LINE_COMMENT),
            new AttributesDescriptor("Block comment", ValaTextAttributeKey.BLOCK_COMMENT),
            new AttributesDescriptor("Doc comment", ValaTextAttributeKey.DOC_COMMENT),
            new AttributesDescriptor("Keyword", ValaTextAttributeKey.KEYWORD),
            new AttributesDescriptor("String", ValaTextAttributeKey.STRING_LITERAL),
            new AttributesDescriptor("Number", ValaTextAttributeKey.NUMBER_LITERAL),
            new AttributesDescriptor("Constant", ValaTextAttributeKey.CONSTANT),
            new AttributesDescriptor("Method call", ValaTextAttributeKey.METHOD_CALL),
            new AttributesDescriptor("Semicolon", ValaTextAttributeKey.SEMICOLON),
            new AttributesDescriptor("Brackets", ValaTextAttributeKey.BRACKETS),
            new AttributesDescriptor("Braces", ValaTextAttributeKey.BRACES),
            new AttributesDescriptor("Comma", ValaTextAttributeKey.COMMA),
            new AttributesDescriptor("Dot", ValaTextAttributeKey.DOT),
            new AttributesDescriptor("Parentheses", ValaTextAttributeKey.PARENTHESES),
            new AttributesDescriptor("Method declaration", ValaTextAttributeKey.METHOD_DECLARATION)
    };

    /**
     * Returns the icon associated with the Vala file type.
     *
     * @return The icon for Vala files.
     */
    @Override
    public @Nullable Icon getIcon() {
        return ValaIcons.FILE;
    }

    /**
     * Returns the highlighter used for syntax highlighting in Vala files.
     *
     * @return An instance of {@link ValaSyntaxHighlighter} for Vala syntax highlighting.
     */
    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return new ValaSyntaxHighlighter();
    }

    /**
     * Returns the text that serves as a demo for Vala syntax highlighting.
     * This text is used to showcase the syntax highlighting capabilities in the settings UI and preview what code will
     * look like when color settings are adjusted.
     *
     * @return A sample Vala code snippet for demonstration purposes.
     */
    @Override
    public @NonNls @NotNull String getDemoText() {
        //language=vala
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

    /**
     * Specifies tag-to-'color key' mapping for regions with presentation containing additional colors from color map.
     * It's used to implement navigation between the list of keys and regions in sample editor.
     */
    @Override
    public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return Map.of();
    }

    /**
     * Returns an array of attribute descriptors that define the syntax highlighting attributes for Vala.
     * These descriptors are used in the color settings UI to allow users to customize the appearance of different
     * syntax elements in Vala code.
     *
     * @return An array of {@link AttributesDescriptor} for Vala syntax highlighting.
     */
    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }


    /**
     * Returns an array of color descriptors that define the colors used in Vala syntax highlighting.
     * This method is typically used to provide additional color options for customization in the settings UI.
     *
     * @return An empty array, as Vala does not define any custom colors beyond the attributes.
     */
    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    /**
     * Returns the name used in the settings / editor / color scheme section for this color settings page.
     *
     * @return The display name for the Vala color settings page.
     */
    @Override
    public @NotNull @NlsContexts.ConfigurableName String getDisplayName() {
        return "Vala";
    }
}
