package dev.vala.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.vala_plugin.highlighting.ValaHighlighter;
import dev.vala.vala_plugin.highlighting.ValaHighlighterUtil;
import dev.vala.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.vala_plugin.highlighting.ValaTextAttributeKey;
import dev.vala.vala_plugin.psi.impl.ValaForeachStatementImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaForEachHighlighter implements ValaHighlighter {

    private static volatile ValaForEachHighlighter instance;

    private ValaForEachHighlighter() {
    }

    public static synchronized ValaForEachHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaForEachHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaForeachStatementImpl) {

            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.LOCAL_VARIABLE);
        }
    }

}
