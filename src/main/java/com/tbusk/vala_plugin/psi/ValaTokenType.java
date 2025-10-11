package com.tbusk.vala_plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.tbusk.vala_plugin.language.ValaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

// https://plugins.jetbrains.com/docs/intellij/grammar-and-parser.html#define-a-token-type
public class ValaTokenType extends IElementType {

    public ValaTokenType(@NotNull @NonNls String debugName) {
        super(debugName, ValaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "ValaTokenType." + super.toString();
    }
}
