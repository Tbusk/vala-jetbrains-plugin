package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaCreationMethodDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaCreationMethodDeclarationHighlighter implements ValaHighlighter {

    private static volatile ValaCreationMethodDeclarationHighlighter instance;

    private ValaCreationMethodDeclarationHighlighter() {
    }

    public static synchronized ValaCreationMethodDeclarationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaCreationMethodDeclarationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaCreationMethodDeclarationImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightMember(psiElement, annotationHolder, ValaTextAttributeKey.METHOD_DECLARATION);
        }
    }

}
