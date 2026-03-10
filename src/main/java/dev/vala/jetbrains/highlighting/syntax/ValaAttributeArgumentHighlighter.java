package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.impl.ValaAttributeArgumentImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaAttributeArgumentHighlighter implements ValaHighlighter {

    private static volatile ValaAttributeArgumentHighlighter instance;

    private ValaAttributeArgumentHighlighter() {
    }

    public static synchronized ValaAttributeArgumentHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaAttributeArgumentHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaAttributeArgumentImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.PARAMETER);
        }
    }
}
