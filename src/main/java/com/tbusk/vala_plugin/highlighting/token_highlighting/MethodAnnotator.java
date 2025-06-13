package com.tbusk.vala_plugin.highlighting.token_highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.ValaMethodDeclaration;
import com.tbusk.vala_plugin.psi.ValaType;
import org.jetbrains.annotations.NotNull;

public class MethodAnnotator implements TokenHighlighter {

    @Override
    public void highlightToken(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {

        if (!(psiElement instanceof ValaMethodDeclaration methodDeclaration)) {
            return;
        }

        ValaType type = methodDeclaration.getType();

        PsiElement identifier = type.getNextSibling();

        if (identifier == null) return;

        ValaAnnotator.TOKEN_HIGHLIGHTS.putIfAbsent(identifier.getText(), ValaSyntaxHighlighter.METHOD_DECLARATION);

        annotationHolder.newAnnotation(HighlightSeverity.INFORMATION, "")
                    .range(identifier.getTextRange())
                .textAttributes(ValaSyntaxHighlighter.METHOD_DECLARATION)
                    .create();

    }
}
