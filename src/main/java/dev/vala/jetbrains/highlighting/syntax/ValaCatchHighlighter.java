package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.ValaCatchClause;
import org.jetbrains.annotations.NotNull;

public final class ValaCatchHighlighter implements ValaHighlighter {

    private static volatile ValaCatchHighlighter instance;

    private ValaCatchHighlighter() {
    }

    public static synchronized ValaCatchHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaCatchHighlighter();
        }
        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaCatchClause) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.LOCAL_VARIABLE);
        }
    }

}
