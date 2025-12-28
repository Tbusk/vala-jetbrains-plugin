package com.tbusk.vala_plugin.linter;

import com.intellij.execution.configurations.ConfigurationTypeBase;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.util.NotNullLazyValue;

import javax.swing.*;

public final class ValaLintRunConfigurationType extends ConfigurationTypeBase {

    static final String ID = "ValaLintRunConfiguration";
    static final String DISPLAY_NAME = "Vala Lint";
    static final String DESCRIPTION = "Run Vala Lint";
    static final NotNullLazyValue<Icon> ICON = NotNullLazyValue.createValue(() -> AllIcons.Nodes.Console);

    ValaLintRunConfigurationType() {
        super(ID, DISPLAY_NAME, DESCRIPTION, ICON);

        addFactory(new ValaLintRunConfigurationFactory(this));
    }
}
