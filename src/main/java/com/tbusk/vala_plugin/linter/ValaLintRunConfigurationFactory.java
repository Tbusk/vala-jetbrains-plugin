package com.tbusk.vala_plugin.linter;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.components.BaseState;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ValaLintRunConfigurationFactory extends ConfigurationFactory {

    protected ValaLintRunConfigurationFactory(ConfigurationType type) {
        super(type);
    }

    @Override
    public @NotNull String getId() {
        return ValaLintRunConfigurationType.ID;
    }

    @Override
    public @NotNull RunConfiguration createTemplateConfiguration(@NotNull Project project) {
        return new ValaLintRunConfiguration(project, this, ValaLintRunConfigurationType.DISPLAY_NAME);
    }

    @Nullable
    @Override
    public Class<? extends BaseState> getOptionsClass() {
        return ValaLintRunConfigurationOptions.class;
    }
}
