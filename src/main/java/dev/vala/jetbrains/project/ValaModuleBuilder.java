package dev.vala.jetbrains.project;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.openapi.module.ModuleType;
import dev.vala.jetbrains.language.ValaIcons;
import org.jetbrains.annotations.NonNls;

import javax.swing.*;

public class ValaModuleBuilder extends ModuleBuilder {

    @Override
    public ModuleType<?> getModuleType() {
        return ValaModuleType.getInstance();
    }

    @Override
    public @NonNls String getBuilderId() {
        return "VALA_MODULE_BUILDER";
    }

    @Override
    public Icon getNodeIcon() {
        return ValaIcons.FILE;
    }

    @Override
    public String getName() {
        return "Vala";
    }
}
