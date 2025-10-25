package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaAttributeImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaAttributeHighlighter implements ValaHighlighter {

    private static volatile ValaAttributeHighlighter instance;

    private ValaAttributeHighlighter() {
    }

    public static synchronized ValaAttributeHighlighter getInstance() {
        if  (instance == null) {
            instance = new ValaAttributeHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaAttributeImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.ATTRIBUTE);
        }
    }
}
