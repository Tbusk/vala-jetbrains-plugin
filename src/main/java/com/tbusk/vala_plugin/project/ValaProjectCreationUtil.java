package com.tbusk.vala_plugin.project;

import com.intellij.ide.fileTemplates.FileTemplate;
import com.intellij.ide.fileTemplates.FileTemplateManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public final class ValaProjectCreationUtil {

    private static ValaProjectCreationUtil instance;

    private ValaProjectCreationUtil() {
    }

    public static ValaProjectCreationUtil getInstance() {
        if (instance == null) {
            instance = new ValaProjectCreationUtil();
        }

        return instance;
    }

    public void setupNewMesonProject(@NotNull VirtualFile projectFile, @NotNull Project project, @NotNull Module module) throws IOException {
        setupNewProject(projectFile, project, module);

        FileTemplateManager templateManager = FileTemplateManager.getInstance(project);
        VirtualFile mesonBuild = createMesonBuildFile(templateManager, projectFile, module);
    }

    public void setupNewProject(@NotNull VirtualFile projectFile, @NotNull Project project, @NotNull Module module) throws IOException {
        FileTemplateManager templateManager = FileTemplateManager.getInstance(project);
        VirtualFile sourcesDirectory = createSourceDirectory(projectFile, module);
        VirtualFile mainDirectory = createMainDirectory(sourcesDirectory);
        VirtualFile resourcesDirectory = createResourcesDirectory(mainDirectory);
        VirtualFile valaSourceDirectory = createValaSourceDirectory(mainDirectory);
        VirtualFile testDirectory = createTestDirectory(sourcesDirectory);
        VirtualFile valaTestDirectory = createValaTestDirectory(testDirectory);
        VirtualFile gitIgnore = createGitIgnoreFile(templateManager, projectFile);
        VirtualFile editorConfig = createEditorConfigFile(templateManager, projectFile);
        VirtualFile readme = createReadmeFile(templateManager, projectFile, module);
        VirtualFile valaLintConfig = createValaLintConfigFile(templateManager, projectFile);
        VirtualFile valaLintIgnore = createValaLintIgnoreFile(templateManager, projectFile);
    }

    public VirtualFile createSourceDirectory(VirtualFile projectFile, Module module) throws IOException {
        VirtualFile sourceDirectory = projectFile.createChildDirectory(this, "src");

        ModifiableRootModel modifiableRootModel = ModuleRootManager.getInstance(module).getModifiableModel();
        ContentEntry contentEntry = modifiableRootModel.addContentEntry(projectFile);
        contentEntry.addSourceFolder(sourceDirectory, false);

        modifiableRootModel.commit();

        return sourceDirectory;
    }

    public VirtualFile createMainDirectory(VirtualFile sourcesDirectory) throws IOException {
        return sourcesDirectory.createChildDirectory(this, "main");
    }

    public VirtualFile createResourcesDirectory(VirtualFile mainDirectory) throws IOException {
        return mainDirectory.createChildDirectory(this, "resources");
    }

    public VirtualFile createValaSourceDirectory(VirtualFile mainDirectory) throws IOException {
        return mainDirectory.createChildDirectory(this, "vala");
    }

    public VirtualFile createTestDirectory(VirtualFile sourceDirectory) throws IOException {
        return sourceDirectory.createChildDirectory(this, "test");
    }

    public VirtualFile createValaTestDirectory(VirtualFile testDirectory) throws IOException {
        return testDirectory.createChildDirectory(this, "vala");
    }

    public VirtualFile createMesonBuildFile(FileTemplateManager templateManager, VirtualFile projectFile, Module module) throws IOException {
        FileTemplate mesonBuildTemplate = templateManager.getJ2eeTemplate("MesonBuild");

        Properties mesonBuildProperties = new Properties();
        mesonBuildProperties.setProperty("PROJECT_NAME", module.getName());

        VirtualFile mesonBuildFile = projectFile.createChildData(this, "meson.build");
        mesonBuildFile.setBinaryContent(mesonBuildTemplate.getText(mesonBuildProperties).getBytes(StandardCharsets.UTF_8));

        return mesonBuildFile;
    }

    public VirtualFile createReadmeFile(FileTemplateManager templateManager, VirtualFile projectFile, Module module) throws IOException {
        FileTemplate readmeTemplate = templateManager.getJ2eeTemplate("Readme");

        Properties readmeProperties = new Properties();
        readmeProperties.setProperty("PROJECT_NAME", module.getName());

        VirtualFile readmeFile = projectFile.createChildData(this, "README.md");
        readmeFile.setBinaryContent(readmeTemplate.getText(readmeProperties).getBytes(StandardCharsets.UTF_8));

        return readmeFile;
    }

    public VirtualFile createEditorConfigFile(FileTemplateManager templateManager, VirtualFile projectFile) throws IOException {
        FileTemplate editorConfigTemplate = templateManager.getJ2eeTemplate("EditorConfig");

        VirtualFile editorConfigFile = projectFile.createChildData(this, ".editorconfig");
        editorConfigFile.setBinaryContent(editorConfigTemplate.getText().getBytes(StandardCharsets.UTF_8));

        return editorConfigFile;
    }

    public VirtualFile createGitIgnoreFile(FileTemplateManager templateManager, VirtualFile projectFile) throws IOException {
        FileTemplate gitIgnoreTemplate = templateManager.getJ2eeTemplate("GitIgnore");

        VirtualFile gitIgnoreFile = projectFile.createChildData(this, ".gitignore");
        gitIgnoreFile.setBinaryContent(gitIgnoreTemplate.getText().getBytes(StandardCharsets.UTF_8));

        return gitIgnoreFile;
    }

    public VirtualFile createValaLintConfigFile(FileTemplateManager templateManager, VirtualFile projectFile) throws IOException {
        FileTemplate valaLintConfigTemplate = templateManager.getJ2eeTemplate("ValaLintConfig");

        VirtualFile valaLintConfigFile = projectFile.createChildData(this, "vala-lint.conf");
        valaLintConfigFile.setBinaryContent(valaLintConfigTemplate.getText().getBytes(StandardCharsets.UTF_8));

        return valaLintConfigFile;
    }

    public VirtualFile createValaLintIgnoreFile(FileTemplateManager templateManager, VirtualFile projectFile) throws IOException {
        FileTemplate valaLintIgnoreTemplate = templateManager.getJ2eeTemplate("ValaLintIgnore");

        VirtualFile valaLintIgnoreFile = projectFile.createChildData(this, ".valalintignore");
        valaLintIgnoreFile.setBinaryContent(valaLintIgnoreTemplate.getText().getBytes(StandardCharsets.UTF_8));

        return valaLintIgnoreFile;
    }

}
