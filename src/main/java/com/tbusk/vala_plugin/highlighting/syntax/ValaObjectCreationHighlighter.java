package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaObjectInitializerImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaObjectCreationHighlighter implements ValaHighlighter {

    private static volatile ValaObjectCreationHighlighter instance;

    private ValaObjectCreationHighlighter() {
    }

    public static synchronized ValaObjectCreationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaObjectCreationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaObjectInitializerImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ASTNode[] memberInitializerNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.MEMBER_INITIALIZER));

            for (ASTNode memberInitializerNode : memberInitializerNodes) {
                ASTNode identifierNode = memberInitializerNode.findChildByType(ValaTypes.IDENTIFIER);

                if (identifierNode != null) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(identifierNode.getTextRange())
                            .textAttributes(ValaTextAttributeKey.PARAMETER)
                            .create();
                }
            }
        }
    }

}
