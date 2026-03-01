package dev.vala.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.vala_plugin.highlighting.ValaHighlighter;
import dev.vala.vala_plugin.highlighting.ValaHighlighterUtil;
import dev.vala.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.vala_plugin.highlighting.ValaTextAttributeKey;
import dev.vala.vala_plugin.psi.impl.ValaInterfaceDeclarationImpl;
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
