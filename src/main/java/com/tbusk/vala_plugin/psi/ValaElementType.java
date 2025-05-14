package com.tbusk.vala_plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.tbusk.vala_plugin.language.ValaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ValaElementType extends IElementType {

    public ValaElementType(@NotNull @NonNls String debugName) {
        super(debugName, ValaLanguage.INSTANCE);
    }
}
