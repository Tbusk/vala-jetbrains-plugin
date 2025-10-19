package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaDestructorDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaDestructorDeclarationHighlighter implements ValaHighlighter {

    private static final ValaDestructorDeclarationHighlighter INSTANCE = new ValaDestructorDeclarationHighlighter();

    private ValaDestructorDeclarationHighlighter() {
    }

    public static ValaDestructorDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaDestructorDeclarationImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.METHOD_DECLARATION);

        }
    }

}
