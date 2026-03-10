package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.impl.ValaNamespaceDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaNamespaceDeclarationHighlighter implements ValaHighlighter {

    private static volatile ValaNamespaceDeclarationHighlighter instance;

    private ValaNamespaceDeclarationHighlighter() {
    }

    public static synchronized ValaNamespaceDeclarationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaNamespaceDeclarationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaNamespaceDeclarationImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightSymbol(psiElement, annotationHolder, ValaTextAttributeKey.STRUCTURE_NAMES);
        }
    }

}
