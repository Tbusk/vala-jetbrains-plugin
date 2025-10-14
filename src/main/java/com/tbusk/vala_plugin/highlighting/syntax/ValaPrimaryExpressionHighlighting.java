package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaPrimaryExpressionImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaPrimaryExpressionHighlighting {
    private static final ValaPrimaryExpressionHighlighting INSTANCE = new ValaPrimaryExpressionHighlighting();

    private ValaPrimaryExpressionHighlighting() {
    }

    public static ValaPrimaryExpressionHighlighting getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaPrimaryExpressionImpl) {
            ASTNode methodCallNode = psiElement.getNode().findChildByType(ValaTypes.METHOD_CALL);

            if (methodCallNode != null) {
                ASTNode[] simpleNameNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.SIMPLE_NAME));
                for (ASTNode simpleNameNode : simpleNameNodes) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(simpleNameNode.getTextRange())
                            .textAttributes(ValaSyntaxHighlighter.METHOD_CALL)
                            .create();
                }

                ASTNode[] memberAccessNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.MEMBER_ACCESS));
                for (ASTNode memberAccessNode : memberAccessNodes) {

                    ASTNode memberNode = memberAccessNode.findChildByType(ValaTypes.MEMBER);

                    if (memberNode != null) {

                        ASTNode[] memberPartNodes = memberNode.getChildren(TokenSet.create(ValaTypes.MEMBER_PART));

                        for (ASTNode memberPartNode : memberPartNodes) {

                            ASTNode identifierNode = memberPartNode.findChildByType(ValaTypes.IDENTIFIER);

                            if (identifierNode != null) {
                                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                        .range(identifierNode.getTextRange())
                                        .textAttributes(ValaSyntaxHighlighter.METHOD_CALL)
                                        .create();
                            }
                        }
                    }
                }
            } else {
                ASTNode[] simpleNameNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.SIMPLE_NAME));
                for (ASTNode simpleNameNode : simpleNameNodes) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(simpleNameNode.getTextRange())
                            .textAttributes(DefaultLanguageHighlighterColors.PARAMETER)
                            .create();
                }

                ASTNode[] memberAccessNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.MEMBER_ACCESS));
                for (ASTNode memberAccessNode : memberAccessNodes) {

                    ASTNode memberNode = memberAccessNode.findChildByType(ValaTypes.MEMBER);

                    if (memberNode != null) {

                        ASTNode[] memberPartNodes = memberNode.getChildren(TokenSet.create(ValaTypes.MEMBER_PART));

                        for (ASTNode memberPartNode : memberPartNodes) {

                            ASTNode identifierNode = memberPartNode.findChildByType(ValaTypes.IDENTIFIER);

                            if (identifierNode != null) {
                                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                        .range(identifierNode.getTextRange())
                                        .textAttributes(DefaultLanguageHighlighterColors.PARAMETER)
                                        .create();
                            }
                        }
                    }
                }
            }
        }
    }
}
