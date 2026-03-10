package dev.vala.jetbrains.highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface ValaHighlighter {

    void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder);
}
