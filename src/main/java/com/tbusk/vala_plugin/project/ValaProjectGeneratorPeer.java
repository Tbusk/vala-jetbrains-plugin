package com.tbusk.vala_plugin.project;

import com.intellij.ide.util.projectWizard.SettingsStep;
import com.intellij.platform.GeneratorPeerImpl;
import org.jetbrains.annotations.NotNull;

public class ValaProjectGeneratorPeer extends GeneratorPeerImpl<ValaProjectSettings> {
    ValaProjectSettings projectSettings;

    public ValaProjectGeneratorPeer() {
        projectSettings = new ValaProjectSettings();
    }

    @Override
    public @NotNull ValaProjectSettings getSettings() {
        return projectSettings;
    }

    @Override
    public void buildUI(@NotNull SettingsStep settingsStep) {
        super.buildUI(settingsStep);
    }
}
