package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.impl.ValaInterfaceDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaInterfaceDeclarationHighlighter implements ValaHighlighter {

    private static final ValaInterfaceDeclarationHighlighter INSTANCE = new ValaInterfaceDeclarationHighlighter();

    private ValaInterfaceDeclarationHighlighter() {
    }

    public static ValaInterfaceDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaInterfaceDeclarationImpl) {
            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement, annotationHolder);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightSymbol(psiElement, annotationHolder, ValaTextAttributeKey.INTERFACE_NAME);
        }
    }
}
