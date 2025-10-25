package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaArgumentImpl;
import com.tbusk.vala_plugin.psi.impl.ValaNamedArgumentImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaArgumentHighlighter implements ValaHighlighter {

    private static volatile ValaArgumentHighlighter instance;

    private ValaArgumentHighlighter() {
    }

    public static synchronized ValaArgumentHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaArgumentHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaArgumentImpl ||
                psiElement instanceof ValaNamedArgumentImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.PARAMETER);

        }
    }
}
