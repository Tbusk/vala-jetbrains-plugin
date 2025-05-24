package com.tbusk.vala_plugin.lsp;

import com.intellij.execution.configurations.GeneralCommandLine;
import com.redhat.devtools.lsp4ij.server.OSProcessStreamConnectionProvider;

public class ValaLanguageServer extends OSProcessStreamConnectionProvider {

    public ValaLanguageServer() {
        GeneralCommandLine commandLine = new GeneralCommandLine("/usr/bin/vala-language-server", "vala-language-server");

        super.setCommandLine(commandLine);
    }
}
