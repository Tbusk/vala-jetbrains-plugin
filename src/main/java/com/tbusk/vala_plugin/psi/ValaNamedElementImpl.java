package com.tbusk.vala_plugin.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.NlsSafe;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ValaNamedElementImpl extends ASTWrapperPsiElement implements ValaNamedElement {

    public ValaNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public @Nullable PsiElement getNameIdentifier() {
        ASTNode keyNode = getNode().findChildByType(ValaTypes.IDENTIFIER);

        if (keyNode != null) {
            return keyNode.getPsi();
        }

        return null;
    }

    @Override
    public @Nullable @NlsSafe String getName() {
        PsiElement nameIdentifier = getNameIdentifier();
        if (nameIdentifier != null) {
            return nameIdentifier.getText();
        }
        return null;
    }

    @Override
    public PsiElement setName(@NlsSafe @NotNull String newName) throws IncorrectOperationException {
        PsiElement nameIdentifier = getNameIdentifier();
        if (nameIdentifier != null) {
            PsiElement newIdentifier = ValaElementFactory.createIdentifier(getProject(), newName);
            nameIdentifier.replace(newIdentifier);
        }
        return this;
    }
}
