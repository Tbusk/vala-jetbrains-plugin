package com.tbusk.vala_plugin.highlighting.token_highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.psi.ValaSimpleName;
import org.jetbrains.annotations.NotNull;

import static com.tbusk.vala_plugin.highlighting.ValaAnnotator.TOKEN_HIGHLIGHTS;

public class ExistingIdentifierAnnotator implements TokenHighlighter {

    @Override
    public void highlightToken(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {

        if (!(psiElement instanceof ValaSimpleName simpleName)) {
            return;
        }

        PsiElement identifier = simpleName.getIdentifier();

        if (identifier == null) {
            return;
        }

        if (TOKEN_HIGHLIGHTS.containsKey(identifier.getText())) {

            annotationHolder.newAnnotation(HighlightSeverity.INFORMATION, "")
                    .range(identifier.getTextRange())
                    .textAttributes(TOKEN_HIGHLIGHTS.get(identifier.getText()))
                    .create();
        }
    }
}
