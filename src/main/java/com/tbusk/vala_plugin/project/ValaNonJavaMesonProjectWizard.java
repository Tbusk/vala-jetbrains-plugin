package com.tbusk.vala_plugin.project;

import com.intellij.facet.ui.ValidationResult;
import com.intellij.ide.util.projectWizard.AbstractNewProjectStep;
import com.intellij.ide.util.projectWizard.CustomStepProjectGenerator;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.impl.welcomeScreen.AbstractActionWithPanel;
import com.intellij.platform.DirectoryProjectGenerator;
import com.intellij.platform.ProjectGeneratorPeer;
import com.tbusk.vala_plugin.language.ValaIcons;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class ValaNonJavaMesonProjectWizard implements DirectoryProjectGenerator<ValaProjectSettings>, CustomStepProjectGenerator<ValaProjectSettings> {

    private static final Logger log = LoggerFactory.getLogger(ValaNonJavaMesonProjectWizard.class);

    @Override
    public @Nullable @Nls(capitalization = Nls.Capitalization.Sentence) String getDescription() {
        return DirectoryProjectGenerator.super.getDescription();
    }

    @Override
    public @NotNull @NlsContexts.Label String getName() {
        return "Vala meson project";
    }

    @Override
    public @Nullable Icon getLogo() {
        return ValaIcons.FILE;
    }

    @Override
    public @NotNull ProjectGeneratorPeer<ValaProjectSettings> createPeer() {
        return new ValaProjectGeneratorPeer();
    }

    @Override
    public void generateProject(@NotNull Project project, @NotNull VirtualFile virtualFile, @NotNull ValaProjectSettings projectSettings, @NotNull Module module) {
        WriteCommandAction.runWriteCommandAction(project, () -> {
            try {
                ValaProjectCreationUtil creationUtil = ValaProjectCreationUtil.getInstance();
                creationUtil.setupNewMesonProject(virtualFile, project, module);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public @NotNull ValidationResult validate(@NotNull String name) {
        ProjectNameValidator nameValidator = ProjectNameValidator.getInstance();

        if (!nameValidator.isValid(name)) return new ValidationResult("Invalid project name");

        return ValidationResult.OK;
    }

    @Override
    public AbstractActionWithPanel createStep(DirectoryProjectGenerator<ValaProjectSettings> directoryProjectGenerator, AbstractNewProjectStep.AbstractCallback<ValaProjectSettings> abstractCallback) {
        return new ValaProjectSettingsStep(directoryProjectGenerator, abstractCallback);
    }
}
