package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.ValaParameter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaParameterImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaParameterHighlighter {

    private static final ValaParameterHighlighter INSTANCE = new ValaParameterHighlighter();

    private ValaParameterHighlighter() {
    }

    public static ValaParameterHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaParameterImpl) {
            ASTNode identifierNode = psiElement.getNode().findChildByType(ValaTypes.IDENTIFIER);

            if (identifierNode != null &&
                    identifierNode.getPsi().getParent() instanceof ValaParameter) {

                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                        .range(identifierNode.getTextRange())
                        .textAttributes(ValaSyntaxHighlighter.PARAMETER)
                        .create();
            }
        }
    }
}
