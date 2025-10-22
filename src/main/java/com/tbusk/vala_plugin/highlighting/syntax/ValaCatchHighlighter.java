package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.ValaCatchClause;
import org.jetbrains.annotations.NotNull;

public final class ValaCatchHighlighter implements ValaHighlighter {

    private static final ValaCatchHighlighter INSTANCE = new ValaCatchHighlighter();

    private ValaCatchHighlighter() {
    }

    public static ValaCatchHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaCatchClause) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.LOCAL_VARIABLE);
        }
    }

}
