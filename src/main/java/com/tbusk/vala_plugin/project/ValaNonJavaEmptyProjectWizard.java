package com.tbusk.vala_plugin.project;

import com.intellij.facet.ui.ValidationResult;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.platform.DirectoryProjectGenerator;
import com.tbusk.vala_plugin.language.ValaIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class ValaNonJavaEmptyProjectWizard implements DirectoryProjectGenerator<Object> {
    private static final Logger log = LoggerFactory.getLogger(ValaNonJavaEmptyProjectWizard.class);

    @Override
    public @NotNull @NlsContexts.Label String getName() {
        return "Vala project";
    }

    @Override
    public @Nullable Icon getLogo() {
        return ValaIcons.FILE;
    }

    @Override
    public @NotNull @NlsContexts.Label String getDescription() {
        return "Create a new Vala project";
    }

    @Override
    public void generateProject(@NotNull Project project, @NotNull VirtualFile virtualFile, @NotNull Object object, @NotNull Module module) {

        WriteCommandAction.runWriteCommandAction(project, () -> {
            try {
                ValaProjectCreationUtil creationUtil = ValaProjectCreationUtil.getInstance();
                creationUtil.setupNewProject(virtualFile, project, module);
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
}