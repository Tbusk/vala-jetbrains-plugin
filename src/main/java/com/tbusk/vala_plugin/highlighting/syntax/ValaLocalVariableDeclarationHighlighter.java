package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaLocalVariableImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaLocalVariableDeclarationHighlighter {

    private static final ValaLocalVariableDeclarationHighlighter INSTANCE = new ValaLocalVariableDeclarationHighlighter();

    private ValaLocalVariableDeclarationHighlighter() {
    }

    public static ValaLocalVariableDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaLocalVariableImpl) {
            ASTNode identifierNode = psiElement.getNode().findChildByType(ValaTypes.IDENTIFIER);

            if (identifierNode != null) {

                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                        .range(identifierNode.getTextRange())
                        .textAttributes(ValaSyntaxHighlighter.LOCAL_VARIABLE)
                        .create();
            }
        }
    }
}
