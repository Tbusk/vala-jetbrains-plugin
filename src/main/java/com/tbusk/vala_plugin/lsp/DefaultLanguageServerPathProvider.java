package com.tbusk.vala_plugin.lsp;

/**
 * DefaultLanguageServerPathProvider is a singleton class that provides the command line configuration
 * for the Vala Language Server based on the operating system.
 * <br/>
 * It determines the appropriate command path for the language server depending on whether
 * the application is running on Windows, macOS, or Linux.
 */
public final class DefaultLanguageServerPathProvider {

    private static DefaultLanguageServerPathProvider INSTANCE;

    // Default command paths for different operating systems
    private static final String DEFAULT_WINDOWS_COMMAND_PATH = "vala-language-server";
    private static final String DEFAULT_MAC_COMMAND_PATH = "/usr/local/bin/vala-language-server";
    private static final String DEFAULT_LINUX_COMMAND_PATH = "/usr/bin/vala-language-server";

    /**
     * Private constructor to prevent instantiation.
     * Use getInstance() to obtain the singleton instance.
     */
    private DefaultLanguageServerPathProvider() {
    }

    /**
     * Returns the singleton instance of DefaultLanguageServerPathProvider.
     *
     * @return The singleton instance of DefaultLanguageServerPathProvider.
     */
    public static DefaultLanguageServerPathProvider getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DefaultLanguageServerPathProvider();
        }

        return INSTANCE;
    }


    /**
     * Returns the command line configuration for the Vala Language Server based on the operating system.
     *
     * @return The command line path for the Vala Language Server.
     * @throws UnsupportedOperationException if the operating system is not supported.
     */
    public String getCommandLineOSConfiguration() {
        String osNameLowercase = System.getProperty("os.name").toLowerCase();

        if(osNameLowercase.contains("windows")) {
            return DEFAULT_WINDOWS_COMMAND_PATH;
        } else if (osNameLowercase.contains("mac")) {
            return DEFAULT_MAC_COMMAND_PATH;
        } else if (osNameLowercase.contains("linux")) {
            return DEFAULT_LINUX_COMMAND_PATH;
        }

        throw new UnsupportedOperationException("Unsupported operating system: " + System.getProperty("os.name"));

    }
}
