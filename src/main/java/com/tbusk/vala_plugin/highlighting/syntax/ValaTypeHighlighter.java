package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.psi.impl.ValaTypeImpl;
import com.tbusk.vala_plugin.psi.impl.ValaTypeWeakImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaTypeHighlighter implements ValaHighlighter {

    private static volatile ValaTypeHighlighter instance;

    private ValaTypeHighlighter() {
    }

    public static synchronized ValaTypeHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaTypeHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaTypeImpl ||
                psiElement instanceof ValaTypeWeakImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightSymbol(psiElement, annotationHolder, DefaultLanguageHighlighterColors.CLASS_NAME);
        }
    }
}
