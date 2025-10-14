package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.tbusk.vala_plugin.psi.impl.ValaIdentifierImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaIdentifierHighlighter {

    private static final ValaIdentifierHighlighter INSTANCE = new ValaIdentifierHighlighter();

    private ValaIdentifierHighlighter() {
    }

    public static ValaIdentifierHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaIdentifierImpl) {

            PsiReference reference = psiElement.getReference();

            if (reference == null) {
                return;
            }

            System.out.println("REF");


//            annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
//                    .range(identifierNode.getTextRange())
//                    .textAttributes(DefaultLanguageHighlighterColors.LOCAL_VARIABLE)
//                    .create();
        }

    }

}
