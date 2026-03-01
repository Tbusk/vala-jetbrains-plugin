package dev.vala.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.vala_plugin.highlighting.ValaHighlighter;
import dev.vala.vala_plugin.highlighting.ValaHighlighterUtil;
import dev.vala.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.vala_plugin.highlighting.ValaTextAttributeKey;
import dev.vala.vala_plugin.psi.impl.ValaPropertyDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaPropertyDeclarationHighlighter implements ValaHighlighter {

    private static volatile ValaPropertyDeclarationHighlighter instance;

    private ValaPropertyDeclarationHighlighter() {
    }

    public static synchronized ValaPropertyDeclarationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaPropertyDeclarationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaPropertyDeclarationImpl) {

            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.METHOD_DECLARATION);
        }
    }

}
