package com.tbusk.vala_plugin.project;

import com.intellij.facet.ui.ValidationResult;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.platform.DirectoryProjectGenerator;
import com.tbusk.vala_plugin.language.ValaIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ValaNonJavaEmptyProjectWizard implements DirectoryProjectGenerator {
    @Override
    public @NotNull @NlsContexts.Label String getName() {
        return "Vala project";
    }

    @Override
    public @Nullable Icon getLogo() {
        return ValaIcons.FILE;
    }

    @Override
    public void generateProject(@NotNull Project project, @NotNull VirtualFile virtualFile, @NotNull Object object, @NotNull Module module) {

    }

    @Override
    public @NotNull ValidationResult validate(@NotNull String s) {
        return ValidationResult.OK;
    }
}
