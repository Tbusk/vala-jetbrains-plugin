package com.tbusk.vala_plugin.highlighting.token_highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.ValaClassDeclaration;
import org.jetbrains.annotations.NotNull;

public class ClassAnnotator implements TokenHighlighter {

    @Override
    public void highlightToken(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (!(psiElement instanceof ValaClassDeclaration classDeclaration)) {
            return;
        }

        PsiElement identifier = classDeclaration.getSymbol();

        ValaAnnotator.TOKEN_HIGHLIGHTS.putIfAbsent(identifier.getText(), ValaSyntaxHighlighter.CLASS_REFERENCE);

        annotationHolder.newAnnotation(HighlightSeverity.INFORMATION, "")
                .range(identifier.getTextRange())
                .textAttributes(ValaSyntaxHighlighter.CLASS_DECLARATION)
                .create();
    }
}
