package com.tbusk.vala_plugin.linter;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.process.ProcessHandlerFactory;
import com.intellij.execution.process.ProcessTerminatedListener;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.changes.ChangeListManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ValaLintRunConfiguration extends RunConfigurationBase<ValaLintRunConfigurationOptions> {

    private static final String DEFAULT_LINT_CONFIG_NAME = "vala-lint.conf";

    protected ValaLintRunConfiguration(@NotNull Project project, @Nullable ConfigurationFactory factory, @Nullable String name) {
        super(project, factory, name);
    }

    @NotNull
    @Override
    protected ValaLintRunConfigurationOptions getOptions() {
        return (ValaLintRunConfigurationOptions) super.getOptions();
    }

    @Override
    public @NotNull SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
        return new ValaLintSettingsEditor();
    }

    @Override
    public @Nullable RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment executionEnvironment) {
        return new CommandLineState(executionEnvironment) {
            @Override
            protected @NotNull ProcessHandler startProcess() throws ExecutionException {
                GeneralCommandLine commandLine = buildCommandLine();
                OSProcessHandler processHandler = ProcessHandlerFactory.getInstance().createColoredProcessHandler(commandLine);
                ProcessTerminatedListener.attach(processHandler);
                return processHandler;
            }
        };
    }

    private GeneralCommandLine buildCommandLine() throws ExecutionException {
        ValaLintRunConfigurationOptions options = getOptions();
        GeneralCommandLine commandLine = new GeneralCommandLine(ValaLintCommands.DEFAULT_COMMAND);

        Project project = getProject();

        if (options.isDetectAndUseConfigFile()) {
            handleDetectAndUseConfig(options, project, commandLine);
        } else {
            handleSpecifiedConfig(options, project, commandLine);
        }

        if (options.isAutoFix()) {
            commandLine.addParameter(ValaLintCommands.AUTOFIX_FLAG);
        }

        String lintingMode = options.getLintingMode();

        handlePaths(commandLine, lintingMode, options, project);

        String projectBasePath = project.getBasePath();
        if (projectBasePath != null) {
            commandLine.setWorkDirectory(projectBasePath);
        }

        return commandLine;
    }

    private void handlePaths(GeneralCommandLine commandLine, String lintingMode, ValaLintRunConfigurationOptions options, Project project) throws ExecutionException {
        if (lintingMode.equals("CHANGES_ONLY")) {
            List<String> changedFilesPaths = getChangedFilesPaths(project);

            commandLine.addParameters(changedFilesPaths);
        } else if (lintingMode.equals("SPECIFIC_FILES")) {
            String globPatterns = options.getCustomGlobPattern();

            if (globPatterns != null && !globPatterns.trim().isEmpty()) {
                commandLine.addParameter(globPatterns);
            }
        }
    }

    private void handleDetectAndUseConfig(ValaLintRunConfigurationOptions options, Project project, GeneralCommandLine commandLine) throws ExecutionException {
        Collection<VirtualFile> files = FilenameIndex.getVirtualFilesByName(DEFAULT_LINT_CONFIG_NAME, GlobalSearchScope.projectScope(project));

        if (!files.isEmpty()) {
            String foundConfigPath = files.iterator().next().getPath();
            String relativePath = getRelativePath(foundConfigPath, project);
            options.setConfigFilePath(relativePath);
            commandLine.addParameter(ValaLintCommands.CONFIG_FILE_FLAG);
            commandLine.addParameter(relativePath);
        }
    }

    private void handleSpecifiedConfig(ValaLintRunConfigurationOptions options, Project project, GeneralCommandLine commandLine) throws ExecutionException {
        String configPath = options.getConfigFilePath();

        if (configPath != null && !configPath.trim().isEmpty()) {
            String resolvedPath = Path.of(Objects.requireNonNull(project.getBasePath()), configPath).toString();
            commandLine.addParameter(ValaLintCommands.CONFIG_FILE_FLAG);
            commandLine.addParameter(getRelativePath(resolvedPath, project));
        }
    }

    private String getRelativePath(String path, Project project) throws ExecutionException {
        String projectPath = project.getBasePath();

        if (path == null) {
            throw new ExecutionException("Invalid path provided.");
        }

        if (projectPath == null) {
            throw new ExecutionException("Project doesn't have a path.");
        }

        return path.replace(projectPath, ".").trim();
    }

    private List<String> getChangedFilesPaths(Project project) throws ExecutionException {
        List<String> paths = new ArrayList<>();
        ChangeListManager changeListManager = ChangeListManager.getInstance(getProject());

        List<File> changes = new ArrayList<>(changeListManager.getAffectedPaths());

        for (File file : changes) {

            String changedFile = getChangedFilePath(file, project);
            if (changedFile != null) {
                paths.add(changedFile);
            }
        }

        if (paths.isEmpty()) {
            throw new ExecutionException("No Vala or Vapi files are uncommitted. ");
        }

        return paths;
    }

    private String getChangedFilePath(File file, Project project) throws ExecutionException {
        boolean fileExists = file != null && file.exists();

        if (!fileExists) {
            throw new ExecutionException("A file you added does not exist.");
        }

        String fileName = file.getName();
        boolean isValaExtension = fileName.endsWith(".vala");
        boolean isVapiExtension = fileName.endsWith(".vapi");
        boolean isValaFile = isValaExtension || isVapiExtension;

        if (isValaFile) {
            return getRelativePath(file.getPath(), project);
        }

        return null;
    }
}
