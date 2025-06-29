package com.tbusk.vala_plugin.project;

import com.intellij.ide.wizard.NewProjectWizardStep;
import com.intellij.ide.wizard.language.LanguageGeneratorNewProjectWizard;
import com.tbusk.vala_plugin.language.ValaIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ValaLanguageGeneratorNewMesonProjectWizard implements LanguageGeneratorNewProjectWizard {
    @Override
    public @NotNull String getName() {
        return "Vala [Meson]";
    }

    @Override
    public @NotNull Icon getIcon() {
        return ValaIcons.FILE;
    }

    @Override
    public @NotNull NewProjectWizardStep createStep(@NotNull NewProjectWizardStep newProjectWizardStep) {

        return new ValaNewMesonProjectStep(newProjectWizardStep);
    }
}
