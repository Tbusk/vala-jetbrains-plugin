package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaYieldExpressionImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaYieldExpressionHighlighter implements ValaHighlighter {

    private static final ValaYieldExpressionHighlighter INSTANCE = new ValaYieldExpressionHighlighter();

    private ValaYieldExpressionHighlighter() {
    }

    public static ValaYieldExpressionHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaYieldExpressionImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightMember(psiElement, annotationHolder, ValaTextAttributeKey.METHOD_DECLARATION);
        }
    }

}
