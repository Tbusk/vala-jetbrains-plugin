package dev.vala.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.vala_plugin.highlighting.ValaHighlighter;
import dev.vala.vala_plugin.highlighting.ValaHighlighterUtil;
import dev.vala.vala_plugin.highlighting.ValaTextAttributeKey;
import dev.vala.vala_plugin.psi.impl.ValaErrorcodeImpl;
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
