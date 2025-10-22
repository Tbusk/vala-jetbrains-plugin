package com.tbusk.vala_plugin.highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;

public record RetryHighlightElement(
        PsiElement psiElement,
        AnnotationHolder annotationHolder
) {
}
