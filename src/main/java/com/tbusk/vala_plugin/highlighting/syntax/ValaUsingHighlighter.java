package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaUsingDirectiveImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaUsingHighlighter implements ValaHighlighter {

    private static volatile ValaUsingHighlighter instance;

    private ValaUsingHighlighter() {
    }

    public static synchronized ValaUsingHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaUsingHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaUsingDirectiveImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightSymbol(psiElement, annotationHolder, ValaTextAttributeKey.STRUCTURE_NAMES);

        }
    }

}
