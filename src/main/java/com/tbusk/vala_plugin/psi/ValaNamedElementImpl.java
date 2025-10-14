package com.tbusk.vala_plugin.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public abstract class ValaNamedElementImpl extends ASTWrapperPsiElement implements ValaNamedElement {

    public ValaNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
