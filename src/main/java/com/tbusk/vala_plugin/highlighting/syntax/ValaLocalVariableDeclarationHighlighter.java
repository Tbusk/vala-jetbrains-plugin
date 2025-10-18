package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaLocalTupleDeclarationImpl;
import com.tbusk.vala_plugin.psi.impl.ValaLocalVariableImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaLocalVariableDeclarationHighlighter implements ValaHighlighter {

    private static final ValaLocalVariableDeclarationHighlighter INSTANCE = new ValaLocalVariableDeclarationHighlighter();

    private ValaLocalVariableDeclarationHighlighter() {
    }

    public static ValaLocalVariableDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaLocalVariableImpl ||
                psiElement instanceof ValaLocalTupleDeclarationImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.LOCAL_VARIABLE);
        }
    }
}
