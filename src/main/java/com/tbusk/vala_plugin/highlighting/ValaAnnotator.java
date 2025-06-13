package com.tbusk.vala_plugin.highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.token_highlighting.*;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class ValaAnnotator implements Annotator {

    public static final HashMap<String, TextAttributesKey> TOKEN_HIGHLIGHTS = new HashMap<>();
    public final HashMap<String, TokenHighlighter> TOKEN_HIGHLIGHTERS = new HashMap<>(
            Map.of(
                    "ValaLocalVariableImpl", new LocalVariableAnnotator(),
                    "ValaFieldDeclarationImpl", new GlobalVariableAnnotator(),
                    "ValaSimpleNameImpl", new ExistingIdentifierAnnotator(),
                    "ValaConstantDeclarationImpl", new ConstantVariableAnnotator(),
                    "ValaMethodCallImpl", new MethodAnnotator()
            ));

    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {

        if (TOKEN_HIGHLIGHTERS.containsKey(psiElement.getClass().getSimpleName())) {
            TOKEN_HIGHLIGHTERS.get(psiElement.getClass().getSimpleName()).highlightToken(psiElement, annotationHolder);
        }
    }
}
