package com.tbusk.vala_plugin.highlighting.token_highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MethodAnnotator implements TokenHighlighter {

    @Override
    public void highlightToken(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {

        if (!(psiElement instanceof ValaMethodCall methodCall)) {
            return;
        }

        PsiElement element = methodCall.getPrevSibling();

        if (element == null) {
            return;
        }

        element = element.getPrevSibling();

        if (element == null) {
            return;
        }

        if (element instanceof ValaSimpleName simpleName) {
            PsiElement identifier = simpleName.getIdentifier();

            if (identifier == null) {
                return;
            }

            System.out.println("Method call identifier: " + identifier.getText());

            ValaAnnotator.TOKEN_HIGHLIGHTS.putIfAbsent(identifier.getText(), ValaSyntaxHighlighter.METHOD_CALL);

            annotationHolder.newAnnotation(HighlightSeverity.INFORMATION, "")
                    .range(identifier.getTextRange())
                    .textAttributes(ValaSyntaxHighlighter.METHOD_CALL)
                    .create();
        }

        if (element instanceof ValaMemberAccess memberAccess) {
            ValaMember member = memberAccess.getMember();

            List<ValaMemberPart> memberParts = member.getMemberPartList();

            if (memberParts.isEmpty()) {
                return;
            }

            ValaMemberPart lastMemberPart = memberParts.getLast();

            PsiElement identifier = lastMemberPart.getIdentifier();

            if (identifier == null) {
                return;
            }

            ValaAnnotator.TOKEN_HIGHLIGHTS.putIfAbsent(identifier.getText(), ValaSyntaxHighlighter.METHOD_CALL);

            annotationHolder.newAnnotation(HighlightSeverity.INFORMATION, "")
                    .range(identifier.getTextRange())
                    .textAttributes(ValaSyntaxHighlighter.METHOD_CALL)
                    .create();
        }

    }
}
