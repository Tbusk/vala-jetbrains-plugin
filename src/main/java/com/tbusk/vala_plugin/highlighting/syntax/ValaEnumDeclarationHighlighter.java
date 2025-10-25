package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaEnumDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaEnumDeclarationHighlighter implements ValaHighlighter {

    private static volatile ValaEnumDeclarationHighlighter instance;

    private ValaEnumDeclarationHighlighter() {
    }

    public static synchronized ValaEnumDeclarationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaEnumDeclarationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaEnumDeclarationImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightSymbol(psiElement, annotationHolder, ValaTextAttributeKey.STRUCTURE_NAMES);
        }
    }
}
