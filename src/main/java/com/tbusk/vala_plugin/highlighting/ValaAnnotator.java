package com.tbusk.vala_plugin.highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.tbusk.vala_plugin.psi.*;
import org.jetbrains.annotations.NotNull;

public class ValaAnnotator implements Annotator {

    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (!(psiElement instanceof ValaIdentifier)) {
            return;
        }

        PsiReference reference = psiElement.getReference();
        if (reference == null) {
            return;
        }

        PsiElement resolvedElement = reference.resolve();

        TextAttributesKey key = null;
        if (resolvedElement instanceof ValaLocalVariableDeclaration) {
            key = ValaSyntaxHighlighter.LOCAL_VARIABLE;
        } else if (resolvedElement instanceof ValaMethodDeclaration) {
            key = ValaSyntaxHighlighter.CONSTANT;
        } else if (resolvedElement instanceof ValaMethodCall) {
            key = ValaSyntaxHighlighter.CONSTANT;
        } else if (resolvedElement instanceof ValaClassDeclaration) {
            key = ValaSyntaxHighlighter.CLASS_NAME;
        }

        if (key != null) {
            annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .range(psiElement.getTextRange())
                    .textAttributes(key)
                    .create();
        }
    }
}
