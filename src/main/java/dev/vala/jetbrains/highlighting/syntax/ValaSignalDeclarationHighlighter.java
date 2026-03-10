package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.impl.ValaSignalDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaSignalDeclarationHighlighter implements ValaHighlighter {

    private static volatile ValaSignalDeclarationHighlighter instance;

    private ValaSignalDeclarationHighlighter() {
    }

    public static synchronized ValaSignalDeclarationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaSignalDeclarationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaSignalDeclarationImpl) {

            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.METHOD_DECLARATION);
        }
    }

}