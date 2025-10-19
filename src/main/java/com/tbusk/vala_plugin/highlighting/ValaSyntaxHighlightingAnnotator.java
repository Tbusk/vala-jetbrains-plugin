package com.tbusk.vala_plugin.highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.syntax.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ValaSyntaxHighlightingAnnotator implements Annotator {

    public static final List<ValaHighlighter> SYNTAX_HIGHLIGHTERS = List.of(
            ValaIdentifierHighlighter.getInstance(),
            ValaParameterHighlighter.getInstance(),
            ValaMethodDeclarationHighlighter.getInstance(),
            ValaSignalDeclarationHighlighter.getInstance(),
            ValaInterfaceDeclarationHighlighter.getInstance(),
            ValaLocalVariableDeclarationHighlighter.getInstance(),
            ValaConstantDeclarationHighlighter.getInstance(),
            ValaAttributeHighlighter.getInstance(),
            ValaAttributeArgumentHighlighter.getInstance(),
            ValaPrimaryExpressionHighlighting.getInstance(),
            ValaTypeHighlighter.getInstance(),
            ValaObjectCreationHighlighter.getInstance(),
            ValaFieldDeclarationHighlighter.getInstance(),
            ValaObjectOrArrayCreationExpressionHighlighter.getInstance(),
            ValaTypeParameterHighlighter.getInstance(),
            ValaArgumentHighlighter.getInstance(),
            ValaErrorCodeHighlighter.getInstance(),
            ValaEnumValueHighlighter.getInstance(),
            ValaClassDeclarationHighlighter.getInstance(),
            ValaEnumDeclarationHighlighter.getInstance(),
            ValaStructDeclarationHighlighter.getInstance(),
            ValaErrorDomainDeclarationHighlighter.getInstance(),
            ValaNamespaceDeclarationHighlighter.getInstance(),
            ValaDelegateDeclarationHighlighter.getInstance(),
            ValaCreationMethodDeclarationHighlighter.getInstance(),
            ValaPropertyDeclarationHighlighter.getInstance(),
            ValaYieldExpressionHighlighter.getInstance(),
            ValaDestructorDeclarationHighlighter.getInstance()
    );

    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {

        for (ValaHighlighter highlighter : SYNTAX_HIGHLIGHTERS) {
            highlighter.highlight(psiElement, annotationHolder);
        }
    }
}
