package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaEnumvalueImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaEnumValueHighlighter implements ValaHighlighter {

    private static volatile ValaEnumValueHighlighter instance;

    private ValaEnumValueHighlighter() {
    }

    public static synchronized ValaEnumValueHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaEnumValueHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaEnumvalueImpl) {

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.CONSTANT);
        }
    }
}
