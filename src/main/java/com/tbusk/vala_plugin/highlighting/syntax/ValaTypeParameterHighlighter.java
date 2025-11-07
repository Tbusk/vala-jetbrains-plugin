package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaTypeParametersImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaTypeParameterHighlighter implements ValaHighlighter {

    private static volatile ValaTypeParameterHighlighter instance;

    private ValaTypeParameterHighlighter() {
    }

    public static synchronized ValaTypeParameterHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaTypeParameterHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaTypeParametersImpl) {
            ASTNode[] identifierNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.IDENTIFIER));

            for (ASTNode identifierNode : identifierNodes) {

                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                        .range(identifierNode.getTextRange())
                        .textAttributes(DefaultLanguageHighlighterColors.CLASS_NAME)
                        .create();
            }
        }
    }
}
