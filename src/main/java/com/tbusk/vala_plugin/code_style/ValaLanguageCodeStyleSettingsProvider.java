package com.tbusk.vala_plugin.code_style;

import com.intellij.lang.Language;
import com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsContributor;
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider;
import com.tbusk.vala_plugin.language.ValaLanguage;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

@SuppressWarnings("UnstableApiUsage")
public class ValaLanguageCodeStyleSettingsProvider extends LanguageCodeStyleSettingsProvider implements LanguageCodeStyleSettingsContributor {

    private static final String BEFORE_LEFT_BRACE_GROUP_NAME = "Before left brace";
    private static final String AROUND_COLON_GROUP_NAME = "Around colon";

    @Override
    public String getCodeSample(@NotNull SettingsType settingsType) {

        try (InputStream codeSampleInputStream = getClass().getClassLoader().getResourceAsStream("code_style_showcase/code_style_sample.vala")) {

            if (codeSampleInputStream == null) throw new IOException();

            return new String(codeSampleInputStream.readAllBytes(), StandardCharsets.UTF_8);

        } catch (IOException ioException) {
            System.out.println("Error getting code sample file. Please open a github issue to get this resolved.");
        }

        return "// Unable to get code sample. Please open a github issue to get this resolved.";
    }

    @Override
    public void customizeSettings(@NotNull CodeStyleSettingsCustomizable consumer, @NotNull SettingsType settingsType) {
        super.customizeSettings(consumer, settingsType);

        if (settingsType == SettingsType.SPACING_SETTINGS) {
            consumer.showStandardOptions(
                    "SPACE_BEFORE_METHOD_CALL_PARENTHESES",
                    "SPACE_BEFORE_METHOD_PARENTHESES",
                    "SPACE_BEFORE_IF_PARENTHESES",
                    "SPACE_BEFORE_FOR_PARENTHESES",
                    "SPACE_BEFORE_WHILE_PARENTHESES",
                    "SPACE_BEFORE_SWITCH_PARENTHESES",
                    "SPACE_BEFORE_TRY_PARENTHESES",
                    "SPACE_BEFORE_CATCH_PARENTHESES",
                    "SPACE_BEFORE_COMMA",
                    "SPACE_AFTER_COMMA"
            );

            // Space Before Left Brace Options
            consumer.showCustomOption(ValaCodeStyleSettings.class, "SPACE_BEFORE_ENUM_DECLARATION_LBRACE", "'enum' declaration '{'", BEFORE_LEFT_BRACE_GROUP_NAME);
            consumer.showCustomOption(ValaCodeStyleSettings.class, "SPACE_BEFORE_ERRORDOMAIN_DECLARATION_LBRACE", "'errordomain' declaration '{'", BEFORE_LEFT_BRACE_GROUP_NAME);
            consumer.showCustomOption(ValaCodeStyleSettings.class, "SPACE_BEFORE_STRUCT_DECLARATION_LBRACE", "'struct' declaration '{'", BEFORE_LEFT_BRACE_GROUP_NAME);
            consumer.showCustomOption(ValaCodeStyleSettings.class, "SPACE_BEFORE_CLASS_DECLARATION_LBRACE", "'class' declaration '{'", BEFORE_LEFT_BRACE_GROUP_NAME);
            consumer.showCustomOption(ValaCodeStyleSettings.class, "SPACE_BEFORE_INTERFACE_DECLARATION_LBRACE", "'interface' declaration '{'", BEFORE_LEFT_BRACE_GROUP_NAME);
            consumer.showCustomOption(ValaCodeStyleSettings.class, "SPACE_BEFORE_NAMESPACE_DECLARATION_LBRACE", "'namespace' declaration '{'", BEFORE_LEFT_BRACE_GROUP_NAME);
            consumer.showCustomOption(ValaCodeStyleSettings.class, "SPACE_BEFORE_METHOD_DECLARATION_LBRACE", "Method declaration '{'", BEFORE_LEFT_BRACE_GROUP_NAME);
            consumer.showCustomOption(ValaCodeStyleSettings.class, "SPACE_BEFORE_PROPERTY_DECLARATION_LBRACE", "Property declaration '{'", BEFORE_LEFT_BRACE_GROUP_NAME);

            // Around Colon Options
            consumer.showCustomOption(ValaCodeStyleSettings.class, "SPACE_BEFORE_INHERIT_OR_IMPLEMENT_COLON", "Before inherit/implement ':'", AROUND_COLON_GROUP_NAME);
            consumer.showCustomOption(ValaCodeStyleSettings.class, "SPACE_AFTER_INHERIT_OR_IMPLEMENT_COLON", "After inherit/implement ':'", AROUND_COLON_GROUP_NAME);
        }
    }

    @Override
    public void customizeDefaults(@NotNull CommonCodeStyleSettings commonSettings,
                                  @NotNull CommonCodeStyleSettings.IndentOptions indentOptions) {

        commonSettings.SPACE_BEFORE_METHOD_CALL_PARENTHESES = true;
        commonSettings.SPACE_BEFORE_METHOD_PARENTHESES = true;
        commonSettings.SPACE_BEFORE_IF_PARENTHESES = true;
        commonSettings.SPACE_BEFORE_FOR_PARENTHESES = true;
        commonSettings.SPACE_BEFORE_WHILE_PARENTHESES = true;
        commonSettings.SPACE_AFTER_COMMA = true;
        commonSettings.SPACE_BEFORE_COMMA = false;
        commonSettings.SPACE_BEFORE_CATCH_LBRACE = true;
        commonSettings.SPACE_BEFORE_CLASS_LBRACE = true;
        commonSettings.SPACE_BEFORE_ELSE_LBRACE = true;
        commonSettings.SPACE_BEFORE_SWITCH_LBRACE = true;
        commonSettings.SPACE_BEFORE_WHILE_LBRACE = true;
        commonSettings.SPACE_BEFORE_TRY_LBRACE = true;
        commonSettings.SPACE_BEFORE_COLON = true;
        commonSettings.SPACE_AFTER_COLON = true;
        commonSettings.SPACE_WITHIN_METHOD_CALL_PARENTHESES = false;
    }

    @Override
    public @NotNull Language getLanguage() {
        return ValaLanguage.INSTANCE;
    }

    @SuppressWarnings("UnstableApiUsage")
    @Override
    public List<LanguageCodeStyleSettingsProvider> getProviders() {
        return List.of(this);
    }
}
