package com.tbusk.vala_plugin.lsp;

import com.intellij.openapi.project.Project;
import com.redhat.devtools.lsp4ij.LanguageServerFactory;
import com.redhat.devtools.lsp4ij.client.LanguageClientImpl;
import com.redhat.devtools.lsp4ij.server.StreamConnectionProvider;
import org.eclipse.lsp4j.services.LanguageServer;
import org.jetbrains.annotations.NotNull;

/**
 * Factory for creating the Vala Language Server.
 * <br/>
 * This class implements the LanguageServerFactory interface to provide
 * the necessary server-related functionality.
 */
public class ValaLanguageServerFactory implements LanguageServerFactory {

    /**
     * Creates a connection provider for the Vala Language Server.
     *
     * @param project - the current project
     * @return a StreamConnectionProvider for the Vala Language Server
     */
    @Override
    public @NotNull StreamConnectionProvider createConnectionProvider(@NotNull Project project) {
        return ValaLanguageServer.getInstance();
    }

    /**
     * Creates a language client for the Vala Language Server.
     * This is useful for providing client specific features.
     *
     * @param project - the current project
     * @return LanguageClientImpl - for the Vala Language Server
     */
    @Override
    public @NotNull LanguageClientImpl createLanguageClient(@NotNull Project project) {
        return LanguageServerFactory.super.createLanguageClient(project);
    }

    /**
     * Returns the interface class for the Vala Language Server.
     * This method is used to expose custom server API.
     *
     * @return Class<? extends LanguageServer> - the Vala Language Server API interface
     */
    @Override
    public @NotNull Class<? extends LanguageServer> getServerInterface() {
        return ValaLanguageServerAPI.class;
    }
}
