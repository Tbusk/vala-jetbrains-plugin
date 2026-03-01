package dev.vala.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.vala_plugin.highlighting.ValaHighlighter;
import dev.vala.vala_plugin.highlighting.ValaHighlighterUtil;
import dev.vala.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.vala_plugin.highlighting.ValaTextAttributeKey;
import dev.vala.vala_plugin.psi.impl.ValaLocalTupleDeclarationImpl;
import dev.vala.vala_plugin.psi.impl.ValaLocalVariableImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaLocalVariableDeclarationHighlighter implements ValaHighlighter {

    private static volatile ValaLocalVariableDeclarationHighlighter instance;

    private ValaLocalVariableDeclarationHighlighter() {
    }

    public static synchronized ValaLocalVariableDeclarationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaLocalVariableDeclarationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaLocalVariableImpl ||
                psiElement instanceof ValaLocalTupleDeclarationImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.LOCAL_VARIABLE);
        }
    }
}
