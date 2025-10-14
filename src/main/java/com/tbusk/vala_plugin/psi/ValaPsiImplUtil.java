package com.tbusk.vala_plugin.psi;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.util.NlsSafe;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ValaPsiImplUtil {

    public static String getName(ValaNamedElement identifier) {

        ASTNode identifierNode = identifier.getNode().findChildByType(ValaTypes.IDENTIFIER_TOKEN);

        if (identifierNode != null) {
            return identifierNode.getText();
        }

        return null;
    }

    public static PsiElement setName(ValaNamedElement element, String newName) {
        ASTNode identifierNode = element.getNode().findChildByType(ValaTypes.IDENTIFIER_TOKEN);

        if (identifierNode != null) {
            ValaIdentifier identifier = ValaElementFactory.createIdentifier(element.getProject(), newName);
            ASTNode newIdentifierNode = identifier.getFirstChild().getNode();
            element.getNode().replaceChild(identifierNode, newIdentifierNode);
        }

        return element;
    }

    public static PsiElement getNameIdentifier(ValaNamedElement identifier) {
        ASTNode identifierNode = identifier.getNode().findChildByType(ValaTypes.IDENTIFIER_TOKEN);

        if (identifierNode != null) {
            return identifierNode.getPsi();
        }

        return null;
    }

    public static ItemPresentation getPresentation(final ValaNamedElement element) {
        return new ItemPresentation() {
            @Override
            public @NlsSafe @Nullable String getPresentableText() {
                return element.getName();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();

                return containingFile == null ? null : containingFile.getName();
            }

            @Override
            public @Nullable Icon getIcon(boolean b) {
                return element.getIcon(0);
            }
        };
    }
}
