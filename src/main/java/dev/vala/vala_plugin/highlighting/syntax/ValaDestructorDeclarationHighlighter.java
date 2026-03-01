package dev.vala.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.vala_plugin.highlighting.ValaHighlighter;
import dev.vala.vala_plugin.highlighting.ValaHighlighterUtil;
import dev.vala.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.vala_plugin.highlighting.ValaTextAttributeKey;
import dev.vala.vala_plugin.psi.impl.ValaDestructorDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaDestructorDeclarationHighlighter implements ValaHighlighter {

    private static volatile ValaDestructorDeclarationHighlighter instance;

    private ValaDestructorDeclarationHighlighter() {
    }

    public static synchronized ValaDestructorDeclarationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaDestructorDeclarationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaDestructorDeclarationImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.METHOD_DECLARATION);

        }
    }

}
