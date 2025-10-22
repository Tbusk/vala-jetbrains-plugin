package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaConstantDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaConstantDeclarationHighlighter implements ValaHighlighter {

    private static final ValaConstantDeclarationHighlighter INSTANCE = new ValaConstantDeclarationHighlighter();

    private ValaConstantDeclarationHighlighter() {
    }

    public static ValaConstantDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaConstantDeclarationImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement, annotationHolder);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.CONSTANT);
        }
    }

}
