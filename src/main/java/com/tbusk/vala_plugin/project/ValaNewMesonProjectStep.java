package com.tbusk.vala_plugin.project;

import com.intellij.ide.wizard.AbstractNewProjectWizardStep;
import com.intellij.ide.wizard.NewProjectWizardStep;
import com.intellij.openapi.application.WriteAction;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;

public class ValaNewMesonProjectStep extends AbstractNewProjectWizardStep {

    public ValaNewMesonProjectStep(@NotNull NewProjectWizardStep parentStep) {
        super(parentStep);
    }

    @Override
    public void setupProject(@NotNull Project project) {
        super.setupProject(project);

        ModuleManager moduleManager = ModuleManager.getInstance(project);

        VirtualFile workspaceFile = project.getWorkspaceFile();
        if (workspaceFile == null) return;

        String basePath = project.getBasePath();
        if (basePath == null) return;

        VirtualFile baseFile = VirtualFileManager.getInstance().findFileByNioPath(Path.of(basePath));
        if (baseFile == null) return;

        Path path = Path.of(workspaceFile.getParent().getPath(), project.getName());

        try {
            WriteAction.run(() -> {
                try {
                    Module module = moduleManager.newModule(path, ValaModuleType.VALA_MODULE);
                    ValaProjectCreationUtil creationUtil = ValaProjectCreationUtil.getInstance();
                    creationUtil.setupNewMesonProject(baseFile, project, module);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
