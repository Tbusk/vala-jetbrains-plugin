package com.tbusk.vala_plugin.code_style;

import com.intellij.application.options.CodeStyleAbstractConfigurable;
import com.intellij.application.options.CodeStyleAbstractPanel;
import com.intellij.application.options.TabbedLanguageCodeStylePanel;
import com.intellij.psi.codeStyle.CodeStyleConfigurable;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CodeStyleSettingsProvider;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;
import com.tbusk.vala_plugin.language.ValaLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * ValaCodeStyleSettingsProvider is responsible for providing custom code style settings for the Vala programming language.
 * It extends CodeStyleSettingsProvider to integrate with IntelliJ's code style settings framework.
 */
public class ValaCodeStyleSettingsProvider extends CodeStyleSettingsProvider {

    /**
     * Returns the custom code style settings class for Vala.
     *
     * @param settings the current code style settings
     * @return a new instance of ValaCodeStyleSettings
     */
    @Override
    public CustomCodeStyleSettings createCustomSettings(@NotNull CodeStyleSettings settings) {
        return new ValaCodeStyleSettings(settings);
    }

    /**
     * Returns the display name that will be shown in the Code Style settings area.
     *
     * @return the display name that will be shown
     */
    @Override
    public String getConfigurableDisplayName() {
        return ValaLanguage.INSTANCE.getDisplayName();
    }

    /**
     * Creates a configurable for the Vala code style settings.
     *
     * @param settings      the current code style settings
     * @param modelSettings the model settings to be used
     * @return a new instance of CodeStyleConfigurable for Vala
     */
    @NotNull
    public CodeStyleConfigurable createConfigurable(@NotNull CodeStyleSettings settings,
                                                    @NotNull CodeStyleSettings modelSettings) {
        return new CodeStyleAbstractConfigurable(settings, modelSettings, this.getConfigurableDisplayName()) {

            @Override
            protected @NotNull CodeStyleAbstractPanel createPanel(@NotNull CodeStyleSettings settings) {
                return new ValaCodeStyleMainPanel(getCurrentSettings(), settings);
            }

        };
    }


    /**
     * Main panel for Vala code style settings.
     * This panel extends TabbedLanguageCodeStylePanel to provide a tabbed interface for configuring Vala code style settings.
     */
    private static class ValaCodeStyleMainPanel extends TabbedLanguageCodeStylePanel {
        protected ValaCodeStyleMainPanel(CodeStyleSettings currentSettings, @NotNull CodeStyleSettings settings) {
            super(ValaLanguage.INSTANCE, currentSettings, settings);
        }
    }

}
