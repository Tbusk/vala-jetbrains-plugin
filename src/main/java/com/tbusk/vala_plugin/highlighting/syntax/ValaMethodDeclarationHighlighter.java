package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaMethodDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaMethodDeclarationHighlighter implements ValaHighlighter {

    private static final ValaMethodDeclarationHighlighter INSTANCE = new ValaMethodDeclarationHighlighter();

    private ValaMethodDeclarationHighlighter() {
    }

    public static ValaMethodDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaMethodDeclarationImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightMember(psiElement, annotationHolder, ValaTextAttributeKey.METHOD_DECLARATION);
        }
    }
}
