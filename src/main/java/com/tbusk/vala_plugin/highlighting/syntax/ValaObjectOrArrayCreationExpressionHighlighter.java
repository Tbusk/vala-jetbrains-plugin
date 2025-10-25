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

    private static volatile ValaObjectOrArrayCreationExpressionHighlighter instance;

    private ValaObjectOrArrayCreationExpressionHighlighter() {
    }

    public static synchronized ValaObjectOrArrayCreationExpressionHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaObjectOrArrayCreationExpressionHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaObjectOrArrayCreationExpressionImpl) {

            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightMember(psiElement, annotationHolder, ValaTextAttributeKey.METHOD_CALL);
        }
    }

}
