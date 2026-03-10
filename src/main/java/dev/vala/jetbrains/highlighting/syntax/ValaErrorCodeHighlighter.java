package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.impl.ValaErrorcodeImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaErrorCodeHighlighter implements ValaHighlighter {

    private static volatile ValaErrorCodeHighlighter instance;

    private ValaErrorCodeHighlighter() {
    }

    public static synchronized ValaErrorCodeHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaErrorCodeHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaErrorcodeImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.CONSTANT);
        }
    }

}
