package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaParameterImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaParameterHighlighter implements ValaHighlighter {

    private static final ValaParameterHighlighter INSTANCE = new ValaParameterHighlighter();

    private ValaParameterHighlighter() {
    }

    public static ValaParameterHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaParameterImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement, annotationHolder);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.PARAMETER);
        }
    }
}
