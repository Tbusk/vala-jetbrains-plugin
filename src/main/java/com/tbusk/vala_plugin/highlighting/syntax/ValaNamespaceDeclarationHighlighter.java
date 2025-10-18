package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaNamespaceDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaNamespaceDeclarationHighlighter implements ValaHighlighter {

    private static final ValaNamespaceDeclarationHighlighter INSTANCE = new ValaNamespaceDeclarationHighlighter();

    private ValaNamespaceDeclarationHighlighter() {
    }

    public static ValaNamespaceDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaNamespaceDeclarationImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightSymbol(psiElement, annotationHolder, ValaTextAttributeKey.STRUCTURE_NAMES);
        }
    }

}
