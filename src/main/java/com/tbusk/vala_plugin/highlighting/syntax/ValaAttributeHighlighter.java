package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaAttributeImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaAttributeHighlighter {

    private static final ValaAttributeHighlighter INSTANCE = new ValaAttributeHighlighter();

    private ValaAttributeHighlighter() {
    }

    public static ValaAttributeHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaAttributeImpl) {
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
