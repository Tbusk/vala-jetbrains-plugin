package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.impl.ValaArgumentImpl;
import dev.vala.jetbrains.psi.impl.ValaNamedArgumentImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaArgumentHighlighter implements ValaHighlighter {

    private static volatile ValaArgumentHighlighter instance;

    private ValaArgumentHighlighter() {
    }

    public static synchronized ValaArgumentHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaArgumentHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaArgumentImpl ||
            psiElement instanceof ValaNamedArgumentImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.PARAMETER);

        }
    }
}
