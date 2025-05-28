package com.tbusk.vala_plugin.settings;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.util.NlsContexts;
import com.tbusk.vala_plugin.lsp.ValaLanguageServer;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Objects;

/**
 * PluginSettingsConfigurable is a class that implements the Configurable interface.
 * <br/>
 * It manages the state and UI of the plugin settings.
 */
public class PluginSettingsConfigurable implements Configurable {

    private PluginSettingsComponent settingsComponent;

    /**
     * Returns the display name of the settings configurable shown when browsing the settings area.
     * <br/>
     * This method is used to provide a user-friendly name for the settings page.
     *
     * @return String - the display name of the settings configurable
     */
    @Override
    public @NlsContexts.ConfigurableName String getDisplayName() {
        return "Vala Plugin Settings";
    }

    /**
     * Returns the preferred focused component of the settings component.
     * <br/>
     * This method is used to set the initial focus when the settings dialog is opened.
     * @return JComponent - the preferred focused component
     */
    @Override
    public JComponent getPreferredFocusedComponent() {
        return settingsComponent.getPreferredFocusedComponent();
    }

    /**
     * Creates the UI component for the settings.
     * <br/>
     * This method initializes the settings component and returns its main panel.
     *
     * @return JComponent - the main panel of the settings component
     */
    @Override
    public @Nullable JComponent createComponent() {
        settingsComponent = new PluginSettingsComponent();

        return settingsComponent.getMainPanel();
    }

    /**
     * Checks if the settings have been modified.
     * <br/>
     * This method compares the current settings with the saved state to determine if any changes have been made.
     *
     * @return boolean - true if the settings have been modified, false otherwise
     */
    @Override
    public boolean isModified() {
        PluginSettings.State state = Objects.requireNonNull(PluginSettings.getInstance().getState());

        return !state.lspServerPath.equals(settingsComponent.getLanguageServerPath());
    }

    /**
     * Applies the changes made in the settings component.
     * <br/>
     * This method updates the plugin settings with the new language server path and applies the changes to the Vala Language Server.
     *
     * @throws ConfigurationException if there is an error applying the configuration
     */
    @Override
    public void apply() throws ConfigurationException {
        PluginSettings.State state = Objects.requireNonNull(PluginSettings.getInstance().getState());

        state.lspServerPath = settingsComponent.getLanguageServerPath();

        ValaLanguageServer.getInstance().updateCommandLineConfiguration(
                state.lspServerPath
        );
    }

    /**
     * Resets the settings component to the saved state.
     * <br/>
     * This method restores the language server path from the plugin settings state.
     */
    @Override
    public void reset() {
        PluginSettings.State state = Objects.requireNonNull(PluginSettings.getInstance().getState());

        settingsComponent.setLanguageServerPath(state.lspServerPath);
    }

    /**
     * Disposes of the UI resources used by the settings component.
     * <br/>
     * This method is called when the settings dialog is closed to clean up any resources used by the settings component.
     */
    @Override
    public void disposeUIResources() {
        settingsComponent = null;
    }
}
