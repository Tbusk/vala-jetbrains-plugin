package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.*;
import org.jetbrains.annotations.NotNull;

public final class ValaStructureDeclarationHighlighter {

    private static final ValaStructureDeclarationHighlighter INSTANCE = new ValaStructureDeclarationHighlighter();

    private ValaStructureDeclarationHighlighter() {
    }

    public static ValaStructureDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaClassDeclarationImpl ||
                psiElement instanceof ValaEnumDeclarationImpl ||
                psiElement instanceof ValaStructDeclarationImpl ||
                psiElement instanceof ValaErrordomainDeclarationImpl ||
                psiElement instanceof ValaNamespaceDeclarationImpl ||
                psiElement instanceof ValaDelegateDeclarationImpl ||
                psiElement instanceof ValaSignalDeclarationImpl
        ) {

            ASTNode symbolNode = psiElement.getNode().findChildByType(ValaTypes.SYMBOL);
            if (symbolNode != null) {

                ASTNode[] symbolPartNodes = symbolNode.getChildren(TokenSet.create(ValaTypes.SYMBOL_PART));

                for (ASTNode symbolPartNode : symbolPartNodes) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(symbolPartNode.getTextRange())
                            .textAttributes(ValaSyntaxHighlighter.STRUCTURE_NAMES)
                            .create();
                }
            }

            ASTNode identifierNode = psiElement.getNode().findChildByType(ValaTypes.IDENTIFIER);
            if (identifierNode != null) {

                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                        .range(identifierNode.getTextRange())
                        .textAttributes(ValaSyntaxHighlighter.STRUCTURE_NAMES)
                        .create();
            }
        }
    }

}