package com.tbusk.vala_plugin.psi;

import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.util.NlsSafe;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiReference;
import com.intellij.psi.tree.IElementType;
import com.tbusk.vala_plugin.ValaTokenSets;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ValaPsiImplUtil {

    public static String getName(ValaNamedElement element) {
        PsiElement identifierNode = getNameIdentifier(element);
        if (identifierNode != null) {
            return identifierNode.getText();
        }
        return null;
    }

    public static String getName(ValaClassDeclaration decl) {
        PsiElement id = findIdentifierToken(decl);
        if (id != null) {
            return id.getText();
        }
        return null;
    }

    public static String getName(ValaMethodDeclaration decl) {
        ValaMember member = decl.getMember();
        PsiElement id = findIdentifierToken(member);

        if (id != null) {
            return id.getText();
        }
        return null;
    }

    public static String getName(ValaFieldDeclaration decl) {
        PsiElement id = findIdentifierToken(decl);
        if (id != null) {
            return id.getText();
        }
        return null;
    }

    public static String getName(ValaSignalDeclaration decl) {
        // Similar
        return getNameFromSymbol(decl);
    }

    public static String getName(ValaStructDeclaration decl) {
        return getNameFromSymbol(decl);
    }

    public static String getName(ValaEnumDeclaration decl) {
        return getNameFromSymbol(decl);
    }

    public static String getName(ValaInterfaceDeclaration decl) {
        return getNameFromSymbol(decl);
    }

    public static String getName(ValaErrordomainDeclaration decl) {
        return getNameFromSymbol(decl);
    }

    public static String getName(ValaParameter decl) {
        ValaIdentifier id = decl.getIdentifier();
        if (id != null) {
            return getName(id);
        }
        return null;
    }

    public static String getName(ValaCatchClause decl) {
        ValaIdentifier id = decl.getIdentifier();
        if (id != null) {
            return getName(id);
        }
        return null;
    }

    public static String getName(ValaForeachStatement decl) {
        ValaIdentifier id = decl.getIdentifier();
        return getName(id);
    }

    public static String getName(ValaPropertyDeclaration decl) {
        ValaIdentifier id = decl.getIdentifier();
        return getName(id);
    }

    private static String getNameFromSymbol(ValaNamedElement decl) {
        PsiElement id = findIdentifierToken(decl);
        if (id != null) {
            return id.getText();
        }
        return null;
    }

    private static PsiElement findIdentifierToken(PsiElement element) {

        if (element instanceof ValaIdentifier id) {
            PsiElement token = id.getIdentifierToken();
            if (token != null) {
                return token;
            }
            return id.getValidIdentifierKeywords();
        }

        if (element.getFirstChild() == null && !(element instanceof com.intellij.psi.PsiErrorElement)) {
            IElementType type = element.getNode().getElementType();
            if (type == ValaTypes.IDENTIFIER_TOKEN || ValaTokenSets.KEYWORDS.contains(type)) {
                return element;
            }
        }

        for (PsiElement child : element.getChildren()) {
            PsiElement found = findIdentifierToken(child);
            if (found != null) {
                return found;
            }
        }
        return null;
    }

    public static PsiElement getIdentifierToken(ValaIdentifier element) {
        PsiElement child = element.getFirstChild();
        if (child != null && child.getNode().getElementType() == ValaTypes.IDENTIFIER_TOKEN) {
            return child;
        }
        return null;
    }

    public static ValaValidIdentifierKeywords getValidIdentifierKeywords(ValaIdentifier element) {
        PsiElement child = element.getFirstChild();
        if (child != null && ValaTokenSets.KEYWORDS.contains(child.getNode().getElementType())) {
            return (ValaValidIdentifierKeywords) child;
        }
        return null;
    }

    public static String getName(ValaIdentifier element) {
        PsiElement token = getIdentifierToken(element);
        if (token != null) {
            return token.getText();
        }
        ValaValidIdentifierKeywords keyword = getValidIdentifierKeywords(element);
        if (keyword != null) {
            return keyword.getText();
        }
        return element.getText();
    }

    public static PsiElement getNameIdentifier(ValaNamedElement element) {
        return findIdentifierToken(element);
    }

    public static PsiElement setName(ValaNamedElement element, String newName) {
        PsiElement identifierToken = getNameIdentifier(element);

        if (identifierToken != null) {
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

    public static PsiReference[] getReferences(ValaIdentifier element) {
        return new PsiReference[]{new ValaReference(element, TextRange.from(0, element.getTextLength()))};
    }
}
