package com.tbusk.vala_plugin.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ValaNamedElementImpl extends ASTWrapperPsiElement implements ValaNamedElement {

    public ValaNamedElementImpl(@Nullable ASTNode node) {
        super(node);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return ValaPsiImplUtil.getName(this);
    }

    @Override
    public PsiElement setName(@NotNull String newName) {
        return ValaPsiImplUtil.setName(this, newName);
    }

    @Override
    public PsiElement getNameIdentifier() {
        return ValaPsiImplUtil.getNameIdentifier(this);
    }

    @Override
    public ItemPresentation getPresentation() {
        return ValaPsiImplUtil.getPresentation(this);
    }
}
