package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.impl.ValaDelegateDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaDelegateDeclarationHighlighter implements ValaHighlighter {

    private static volatile ValaDelegateDeclarationHighlighter instance;

    private ValaDelegateDeclarationHighlighter() {
    }

    public static synchronized ValaDelegateDeclarationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaDelegateDeclarationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaDelegateDeclarationImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightSymbol(psiElement, annotationHolder, ValaTextAttributeKey.METHOD_DECLARATION);
        }
    }
}
