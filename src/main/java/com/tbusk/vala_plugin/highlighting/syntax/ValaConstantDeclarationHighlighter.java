package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaConstantDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaConstantDeclarationHighlighter {

    private static final ValaConstantDeclarationHighlighter INSTANCE = new ValaConstantDeclarationHighlighter();

    private ValaConstantDeclarationHighlighter() {
    }

    public static ValaConstantDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaConstantDeclarationImpl) {
            ASTNode identifierNode = psiElement.getNode().findChildByType(ValaTypes.IDENTIFIER);

            if (identifierNode != null) {

                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                        .range(identifierNode.getTextRange())
                        .textAttributes(ValaSyntaxHighlighter.CONSTANT)
                        .create();
            }
        }
    }

}
