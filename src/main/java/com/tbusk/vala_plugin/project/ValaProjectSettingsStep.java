package com.tbusk.vala_plugin.project;

import com.intellij.ide.util.projectWizard.AbstractNewProjectStep;
import com.intellij.ide.util.projectWizard.ProjectSettingsStepBase;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.platform.DirectoryProjectGenerator;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ValaProjectSettingsStep extends ProjectSettingsStepBase<ValaProjectSettings> {

    public ValaProjectSettingsStep(DirectoryProjectGenerator projectGenerator, AbstractNewProjectStep.AbstractCallback callback) {
        super(projectGenerator, callback);
    }

    @Override
    protected JPanel createBasePanel() {
        return super.createBasePanel();
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        super.actionPerformed(event);
    }
}
