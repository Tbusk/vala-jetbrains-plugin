package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaClassDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaClassDeclarationHighlighter implements ValaHighlighter {

    private static final ValaClassDeclarationHighlighter INSTANCE = new ValaClassDeclarationHighlighter();

    private ValaClassDeclarationHighlighter() {
    }

    public static ValaClassDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaClassDeclarationImpl
        ) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightSymbol(psiElement, annotationHolder, ValaTextAttributeKey.STRUCTURE_NAMES);
        }
    }
}
