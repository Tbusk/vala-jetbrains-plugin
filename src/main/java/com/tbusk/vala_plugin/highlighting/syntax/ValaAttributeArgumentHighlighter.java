package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaAttributeArgumentImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaAttributeArgumentHighlighter implements ValaHighlighter {

    private static volatile ValaAttributeArgumentHighlighter instance;

    private ValaAttributeArgumentHighlighter() {
    }

    public static synchronized ValaAttributeArgumentHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaAttributeArgumentHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaAttributeArgumentImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.ATTRIBUTE);
        }
    }
}
