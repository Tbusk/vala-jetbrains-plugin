package com.tbusk.vala_plugin.psi;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.util.NlsSafe;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ValaPsiImplUtil {

    public static String getName(ValaNamedElement element) {
        ASTNode namedElementNode = element.getNode();

        ASTNode identifierNode = namedElementNode.findChildByType(ValaTypes.IDENTIFIER);
        if (identifierNode != null) {
            return getIdentifierName(identifierNode);
        }

        ASTNode symbolNode = namedElementNode.findChildByType(ValaTypes.SYMBOL);
        if (symbolNode != null) {
            return getSymbolName(symbolNode);
        }

        ASTNode memberNode = namedElementNode.findChildByType(ValaTypes.MEMBER);
        if (memberNode != null) {
            return getMemberName(memberNode);
        }

        return null;
    }

    private static String getIdentifierName(ASTNode identifierNode) {
        return identifierNode.getText();
    }

    private static String getSymbolName(ASTNode symbolNode) {
        StringBuilder nameBuilder = new StringBuilder();

        ASTNode[] symbolPartNodes = symbolNode.getChildren(TokenSet.create(ValaTypes.SYMBOL_PART));

        for (ASTNode symbolPartNode : symbolPartNodes) {

            ASTNode identifierNode = symbolPartNode.findChildByType(ValaTypes.IDENTIFIER);

            if (identifierNode != null && !symbolPartNode.equals(symbolPartNodes[symbolPartNodes.length - 1])) {
                nameBuilder.append(identifierNode.getText());
                nameBuilder.append(".");
            } else if (identifierNode != null) {
                nameBuilder.append(identifierNode.getText());
            }
        }

        return nameBuilder.toString();
    }

    private static String getMemberName(ASTNode memberNode) {
        StringBuilder nameBuilder = new StringBuilder();

        ASTNode[] memberPartNodes = memberNode.getChildren(TokenSet.create(ValaTypes.MEMBER_PART));

        for (ASTNode memberPartNode : memberPartNodes) {

            ASTNode identifierNode = memberPartNode.findChildByType(ValaTypes.IDENTIFIER);

            if (identifierNode != null && !memberPartNode.equals(memberPartNodes[memberPartNodes.length - 1])) {
                nameBuilder.append(identifierNode.getText());
                nameBuilder.append(".");
            } else if (identifierNode != null) {
                nameBuilder.append(identifierNode.getText());
            }
        }

        return nameBuilder.toString();
    }

    public static PsiElement getNameIdentifier(ValaNamedElement element) {
        return element;
    }

    public static PsiElement setName(ValaNamedElement element, String newName) {
        PsiElement identifierToken = getNameIdentifier(element);

        if (element != null) {
            ValaIdentifier newIdentifier = ValaElementFactory.createIdentifier(element.getProject(), newName);
            PsiElement newIdToken = newIdentifier.getIdentifierToken();
            if (newIdToken != null) {
                identifierToken.replace(newIdToken);
            }
        }

        return element;
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
