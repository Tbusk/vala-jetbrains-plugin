package com.tbusk.vala_plugin.highlighting.token_highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.ValaConstantDeclaration;
import org.jetbrains.annotations.NotNull;

public class ConstantVariableAnnotator implements TokenHighlighter {

    @Override
    public void highlightToken(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {

        if (!(psiElement instanceof ValaConstantDeclaration constantVariable)) {
            return;
        }

        PsiElement identifier = constantVariable.getIdentifier();

        ValaAnnotator.TOKEN_HIGHLIGHTS.putIfAbsent(identifier.getText(), ValaSyntaxHighlighter.CONSTANT_VARIABLE_DECLARATION);

        annotationHolder.newAnnotation(HighlightSeverity.INFORMATION, "")
                .range(identifier.getTextRange())
                .textAttributes(ValaSyntaxHighlighter.CONSTANT_VARIABLE_DECLARATION)
                .create();

    }
}
