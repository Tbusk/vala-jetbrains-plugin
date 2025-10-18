package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaTypeParametersImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaTypeParameterHighlighter implements ValaHighlighter {

    private static final ValaTypeParameterHighlighter INSTANCE = new ValaTypeParameterHighlighter();

    private ValaTypeParameterHighlighter() {
    }

    public static ValaTypeParameterHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaTypeParametersImpl) {
            ASTNode[] identifierNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.IDENTIFIER));

            for (ASTNode identifierNode : identifierNodes) {

                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                        .range(identifierNode.getTextRange())
                        .textAttributes(ValaTextAttributeKey.INSTANCE_VARIABLE)
                        .create();
            }
        }
    }
}
