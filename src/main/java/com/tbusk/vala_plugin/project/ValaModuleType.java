package com.tbusk.vala_plugin.project;

import com.intellij.openapi.module.ModuleType;
import com.tbusk.vala_plugin.language.ValaIcons;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class ValaModuleType extends ModuleType<ValaModuleBuilder> {

    public static final String VALA_MODULE = "VALA_MODULE";
    private static ValaModuleType instance;

    private ValaModuleType() {
        super(VALA_MODULE);
    }

    public static ValaModuleType getInstance() {
        if (instance == null) {
            instance = new ValaModuleType();
        }

        return instance;
    }

    @Override
    public @NotNull ValaModuleBuilder createModuleBuilder() {
        return new ValaModuleBuilder();
    }

    @Override
    public @NotNull @Nls(capitalization = Nls.Capitalization.Title) String getName() {
        return "Vala Module";
    }

    @Override
    public @NotNull @Nls(capitalization = Nls.Capitalization.Sentence) String getDescription() {
        return "Vala module";
    }

    @Override
    public @NotNull Icon getNodeIcon(boolean isOpened) {
        return ValaIcons.FILE;
    }
}
