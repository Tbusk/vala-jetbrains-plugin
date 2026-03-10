package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.impl.ValaStructDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaStructDeclarationHighlighter implements ValaHighlighter {

    private static volatile ValaStructDeclarationHighlighter instance;

    private ValaStructDeclarationHighlighter() {
    }

    public static synchronized ValaStructDeclarationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaStructDeclarationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaStructDeclarationImpl
        ) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightSymbol(psiElement, annotationHolder, ValaTextAttributeKey.STRUCTURE_NAMES);
        }
    }
}
