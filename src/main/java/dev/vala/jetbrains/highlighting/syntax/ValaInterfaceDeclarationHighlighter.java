package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.impl.ValaInterfaceDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaInterfaceDeclarationHighlighter implements ValaHighlighter {

    private static volatile ValaInterfaceDeclarationHighlighter instance;

    private ValaInterfaceDeclarationHighlighter() {
    }

    public static synchronized ValaInterfaceDeclarationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaInterfaceDeclarationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaInterfaceDeclarationImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightSymbol(psiElement, annotationHolder, ValaTextAttributeKey.INTERFACE_NAME);
        }
    }
}
