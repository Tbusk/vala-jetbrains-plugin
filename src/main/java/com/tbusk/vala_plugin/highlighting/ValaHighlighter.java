package com.tbusk.vala_plugin.highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.syntax.ValaIdentifierHighlighter;
import org.jetbrains.annotations.NotNull;

public class ValaHighlighter implements Annotator {

    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {

        ValaIdentifierHighlighter.getInstance().highlight(psiElement, annotationHolder);

//        ValaParameterHighlighter.getInstance().highlight(psiElement, annotationHolder);
//        ValaMethodDeclarationHighlighter.getInstance().highlight(psiElement, annotationHolder);
//        ValaStructureDeclarationHighlighter.getInstance().highlight(psiElement, annotationHolder);
//        ValaInterfaceDeclarationHighlighter.getInstance().highlight(psiElement, annotationHolder);
//        ValaLocalVariableDeclarationHighlighter.getInstance().highlight(psiElement, annotationHolder);
//        ValaConstantDeclarationHighlighter.getInstance().highlight(psiElement, annotationHolder);
//        ValaAttributeHighlighter.getInstance().highlight(psiElement, annotationHolder);
//        ValaAttributeArgumentHighlighter.getInstance().highlight(psiElement, annotationHolder);
//        ValaPrimaryExpressionHighlighting.getInstance().highlight(psiElement, annotationHolder);
//        ValaTypeHighlighter.getInstance().highlight(psiElement, annotationHolder);
//        ValaObjectCreationHighlighter.getInstance().highlight(psiElement, annotationHolder);
//        ValaFieldDeclarationHighlighter.getInstance().highlight(psiElement, annotationHolder);
//        ValaObjectOrArrayCreationExpressionHighlighter.getInstance().highlight(psiElement, annotationHolder);
    }
}
