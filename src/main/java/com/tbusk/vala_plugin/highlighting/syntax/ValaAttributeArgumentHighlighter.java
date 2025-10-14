package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaAttributeArgumentImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaAttributeArgumentHighlighter {

    private static final ValaAttributeArgumentHighlighter INSTANCE = new ValaAttributeArgumentHighlighter();

    private ValaAttributeArgumentHighlighter() {
    }

    public static ValaAttributeArgumentHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaAttributeArgumentImpl) {
            ASTNode identifierNode = psiElement.getNode().findChildByType(ValaTypes.IDENTIFIER);

            if (identifierNode != null) {

                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                        .range(identifierNode.getTextRange())
                        .textAttributes(ValaSyntaxHighlighter.ATTRIBUTE)
                        .create();
            }
        }
    }
}
