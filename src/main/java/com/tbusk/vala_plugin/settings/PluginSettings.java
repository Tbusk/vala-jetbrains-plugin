package com.tbusk.vala_plugin.settings;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.tbusk.vala_plugin.lsp.LanguageServerPathProvider;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This class holds the settings for the Vala plugin.
 * It is used to store and retrieve persistent data for the plugin.
 * Currently only the path to the Vala Language Server is stored.
 * <br/>
 * https://plugins.jetbrains.com/docs/intellij/settings-tutorial.html#the-appsettings-class
 */
@State(
        name = "com.tbusk.vala_plugin.settings.PluginSettings",
        storages = @Storage("ValaPluginSettings.xml")
)
public final class PluginSettings implements PersistentStateComponent<PluginSettings.State> {

    /**
     * This class holds the state of the plugin settings.
     * It contains the path to the Vala Language Server.
     */
    public static class State {
        private LanguageServerPathProvider languageServerPathProvider = LanguageServerPathProvider.getInstance();
        @NonNls
        public String lspServerPath = languageServerPathProvider.getCommandLineOSConfiguration();
    }

    private State pluginState = new State();

    /**
     * Retrieves the singleton instance of PluginSettings.
     *
     * @return the instance of PluginSettings
     */
    public static PluginSettings getInstance() {
        return ApplicationManager.getApplication().getService(PluginSettings.class);
    }

    /**
     * Returns the current state of the plugin settings.
     *
     * @return the current state of the plugin settings, or null if not set
     */
    @Override
    public @Nullable PluginSettings.State getState() {
        return pluginState;
    }

    /**
     * Loads the state of the plugin settings from the provided state.
     * @param state the state to load
     */
    @Override
    public void loadState(@NotNull State state) {
        pluginState = state;
    }
}
