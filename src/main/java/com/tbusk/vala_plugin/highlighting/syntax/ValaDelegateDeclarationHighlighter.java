package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaDelegateDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaDelegateDeclarationHighlighter implements ValaHighlighter {

    private static final ValaDelegateDeclarationHighlighter INSTANCE = new ValaDelegateDeclarationHighlighter();

    private ValaDelegateDeclarationHighlighter() {
    }

    public static ValaDelegateDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaDelegateDeclarationImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement, annotationHolder);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightSymbol(psiElement, annotationHolder, ValaTextAttributeKey.METHOD_DECLARATION);
        }
    }
}
