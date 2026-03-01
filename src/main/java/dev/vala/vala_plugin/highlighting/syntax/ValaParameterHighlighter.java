package dev.vala.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.vala_plugin.highlighting.ValaHighlighter;
import dev.vala.vala_plugin.highlighting.ValaHighlighterUtil;
import dev.vala.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.vala_plugin.highlighting.ValaTextAttributeKey;
import dev.vala.vala_plugin.psi.impl.ValaParameterImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaParameterHighlighter implements ValaHighlighter {

    private static volatile ValaParameterHighlighter instance;

    private ValaParameterHighlighter() {
    }

    public static synchronized ValaParameterHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaParameterHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaParameterImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.PARAMETER);
        }
    }
}
