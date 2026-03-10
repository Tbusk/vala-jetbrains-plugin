package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.impl.ValaLocalTupleDeclarationImpl;
import dev.vala.jetbrains.psi.impl.ValaLocalVariableImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaLocalVariableDeclarationHighlighter implements ValaHighlighter {

    private static volatile ValaLocalVariableDeclarationHighlighter instance;

    private ValaLocalVariableDeclarationHighlighter() {
    }

    public static synchronized ValaLocalVariableDeclarationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaLocalVariableDeclarationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaLocalVariableImpl ||
            psiElement instanceof ValaLocalTupleDeclarationImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.LOCAL_VARIABLE);
        }
    }
}
