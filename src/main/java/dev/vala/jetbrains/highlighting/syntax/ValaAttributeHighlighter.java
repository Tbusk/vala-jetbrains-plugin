package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.impl.ValaAttributeImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaAttributeHighlighter implements ValaHighlighter {

    private static volatile ValaAttributeHighlighter instance;

    private ValaAttributeHighlighter() {
    }

    public static synchronized ValaAttributeHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaAttributeHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaAttributeImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.ATTRIBUTE);
        }
    }
}
