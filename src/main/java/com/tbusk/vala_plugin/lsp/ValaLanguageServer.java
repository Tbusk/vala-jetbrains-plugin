package com.tbusk.vala_plugin.lsp;

import com.intellij.execution.configurations.GeneralCommandLine;
import com.redhat.devtools.lsp4ij.server.OSProcessStreamConnectionProvider;

/**
 * ValaLanguageServer is a class that extends OSProcessStreamConnectionProvider.
 * <br/>
 * It provides the command line configuration for the Vala Language Server based on the operating system.
 * <br/>
 * The command line is set in the constructor and can be used to start the language server process.
 */
public class ValaLanguageServer extends OSProcessStreamConnectionProvider {

    // Default command paths for different operating systems
    private static final String DEFAULT_WINDOWS_COMMAND_PATH = "vala-language-server";
    private static final String DEFAULT_MAC_COMMAND_PATH = "/usr/local/bin/vala-language-server";
    private static final String DEFAULT_LINUX_COMMAND_PATH = "/usr/bin/vala-language-server";

    public ValaLanguageServer() {
        super.setCommandLine(getCommandLineOSConfiguration());
    }

    /**
     * Returns a command line based on the operating system.
     * This method checks the OS name and returns the appropriate command line for the Vala Language Server.
     *
     * @return GeneralCommandLine configured for the current OS
     */
    public GeneralCommandLine getCommandLineOSConfiguration() {
        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("windows")) {
            return new GeneralCommandLine(DEFAULT_WINDOWS_COMMAND_PATH);
        } else if (osName.contains("mac")) {
            return new GeneralCommandLine(DEFAULT_MAC_COMMAND_PATH);
        } else if (osName.contains("linux")) {
            return new GeneralCommandLine(DEFAULT_LINUX_COMMAND_PATH);
        }

        throw new UnsupportedOperationException("Unsupported operating system: " + System.getProperty("os.name"));

    }
}
