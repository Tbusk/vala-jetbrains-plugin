package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaObjectOrArrayCreationExpressionImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaObjectOrArrayCreationExpressionHighlighter implements ValaHighlighter {

    private static final ValaObjectOrArrayCreationExpressionHighlighter INSTANCE = new ValaObjectOrArrayCreationExpressionHighlighter();

    private ValaObjectOrArrayCreationExpressionHighlighter() {
    }

    public static ValaObjectOrArrayCreationExpressionHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaObjectOrArrayCreationExpressionImpl) {

            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement, annotationHolder);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightMember(psiElement, annotationHolder, ValaTextAttributeKey.METHOD_CALL);
        }
    }

}
