package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.impl.ValaErrordomainDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaErrorDomainDeclarationHighlighter implements ValaHighlighter {

    private static volatile ValaErrorDomainDeclarationHighlighter instance;

    private ValaErrorDomainDeclarationHighlighter() {
    }

    public static synchronized ValaErrorDomainDeclarationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaErrorDomainDeclarationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaErrordomainDeclarationImpl) {

            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightSymbol(psiElement, annotationHolder, ValaTextAttributeKey.STRUCTURE_NAMES);
        }
    }

}
