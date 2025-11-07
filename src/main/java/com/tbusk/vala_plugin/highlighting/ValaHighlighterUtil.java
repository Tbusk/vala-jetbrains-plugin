package com.tbusk.vala_plugin.highlighting;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.psi.ValaTypes;

public final class ValaHighlighterUtil {

    private static final ValaHighlighterUtil INSTANCE = new ValaHighlighterUtil();

    private ValaHighlighterUtil() {
    }

    public static ValaHighlighterUtil getInstance() {
        return INSTANCE;
    }

    public void highlightIdentifier(PsiElement psiElement, AnnotationHolder annotationHolder, TextAttributesKey textAttributesKey) {
        ASTNode identifierNode = psiElement.getNode().findChildByType(ValaTypes.IDENTIFIER);

        if (identifierNode != null) {

            annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .range(identifierNode.getTextRange())
                    .textAttributes(textAttributesKey)
                    .create();
        }
    }

    public void highlightSymbol(PsiElement psiElement, AnnotationHolder annotationHolder, TextAttributesKey textAttributesKey) {
        ASTNode symbolNode = psiElement.getNode().findChildByType(ValaTypes.SYMBOL);
        if (symbolNode != null) {

            ASTNode[] symbolPartNodes = symbolNode.getChildren(TokenSet.create(ValaTypes.SYMBOL_PART));

            for (ASTNode symbolPartNode : symbolPartNodes) {

                ASTNode identifierNode = symbolPartNode.findChildByType(ValaTypes.IDENTIFIER);

                if (identifierNode != null) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(identifierNode.getTextRange())
                            .textAttributes(textAttributesKey)
                            .create();
                }
            }
        }
    }

    public void highlightMember(PsiElement psiElement, AnnotationHolder annotationHolder, TextAttributesKey textAttributesKey) {
        ASTNode memberNode = psiElement.getNode().findChildByType(ValaTypes.MEMBER);
        if (memberNode != null) {

            ASTNode[] memberPartNodes = memberNode.getChildren(TokenSet.create(ValaTypes.MEMBER_PART));

            for (ASTNode memberPartNode : memberPartNodes) {

                ASTNode identifierNode = memberPartNode.findChildByType(ValaTypes.IDENTIFIER);

                if (identifierNode != null) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(identifierNode.getTextRange())
                            .textAttributes(textAttributesKey)
                            .create();
                }
            }
        }
    }

}
