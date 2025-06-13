package com.tbusk.vala_plugin.highlighting.token_highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface TokenHighlighter {

    void highlightToken(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder);
}
