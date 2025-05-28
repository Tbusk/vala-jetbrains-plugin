package com.tbusk.vala_plugin.lsp;

import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ex.ApplicationEx;
import com.intellij.openapi.ui.Messages;
import com.redhat.devtools.lsp4ij.server.OSProcessStreamConnectionProvider;
import com.tbusk.vala_plugin.settings.PluginSettings;

/**
 * ValaLanguageServer is a class that extends OSProcessStreamConnectionProvider.
 * <br/>
 * It provides the command line configuration for the Vala Language Server based on the operating system.
 * <br/>
 * The command line is set in the constructor and can be used to start the language server process.
 */
public final class ValaLanguageServer extends OSProcessStreamConnectionProvider {

    private static ValaLanguageServer INSTANCE;

    /**
     * Private constructor to ensure singleton instance.
     * Initializes the command line with the path to the Vala Language Server.
     */
    private ValaLanguageServer() {

        String path = PluginSettings.getInstance().getState().lspServerPath;

        super.setCommandLine(new GeneralCommandLine(path));
    }

    /**
     * Returns the singleton instance of the ValaLanguageServer.
     * <br/>
     * If the instance is null, it creates a new instance lazily.
     *
     * @return ValaLanguageServer - the singleton instance of the ValaLanguageServer
     */
    public static ValaLanguageServer getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ValaLanguageServer();
        }

        return INSTANCE;
    }

    /**
     * Updates the command line configuration for the Vala Language Server.
     * <br/>
     * This method sets a new command path for the language server and prompts the user to restart the IDE.
     * The restart is necessary because LSP4IJ doesn't provide any way to reliably restart the language server
     * outside the UI.
     * @param commandPath - the new command path to set for the language server
     */
    public void updateCommandLineConfiguration(String commandPath) {

        setCommandLine(new GeneralCommandLine(commandPath));

        int userChoice = showRestartPopup();

        if(userChoice == Messages.YES) {
            restartIDE();
        }
    }

    /**
     * Displays a popup dialog to the user asking if they want to restart the IDE.
     * <br/>
     * This dialog is shown when the language server configuration is changed and a restart is required.
     *
     * @return int - the user's choice (YES or NO)
     */
    public int showRestartPopup() {
        return Messages.showYesNoDialog(
                "A restart is required for the changes to take affect. Do you want to restart now?",
                "Restart Required",
                Messages.getQuestionIcon()
        );
    }

    /**
     * Restarts the IDE.
     * <br/>
     * This method uses the ApplicationEx class to restart the IDE with the current state.
     * <br/>
     * <a href="https://intellij-support.jetbrains.com/hc/en-us/community/posts/206105709-How-do-you-make-a-plugin-setting-change-require-a-restart">view forum q/a...</a>
     */
    public void restartIDE() {
        ApplicationEx app = (ApplicationEx)ApplicationManager.getApplication();

        app.restart(true);
    }
}
