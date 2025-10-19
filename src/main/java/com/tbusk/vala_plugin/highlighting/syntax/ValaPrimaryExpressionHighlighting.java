package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaPrimaryExpressionImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaPrimaryExpressionHighlighting implements ValaHighlighter {
    private static final ValaPrimaryExpressionHighlighting INSTANCE = new ValaPrimaryExpressionHighlighting();

    private ValaPrimaryExpressionHighlighting() {
    }

    public static ValaPrimaryExpressionHighlighting getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaPrimaryExpressionImpl) {

            ASTNode simpleNode = psiElement.getNode().findChildByType(ValaTypes.SIMPLE_NAME);
            if (simpleNode != null && simpleNode.getText().matches("[A-Z0-9_]+")) {
                ASTNode identifierNode = simpleNode.findChildByType(ValaTypes.IDENTIFIER);

                if (identifierNode != null) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(identifierNode.getTextRange())
                            .textAttributes(ValaTextAttributeKey.CONSTANT)
                            .create();
                }
            }

            ASTNode methodCallNode = psiElement.getNode().findChildByType(ValaTypes.METHOD_CALL);

            if (methodCallNode != null) {

                ASTNode[] simpleNameNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.SIMPLE_NAME));
                for (ASTNode simpleNameNode : simpleNameNodes) {

                    ASTNode identifierNode = simpleNameNode.findChildByType(ValaTypes.IDENTIFIER);

                    if (identifierNode != null) {
                        annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                .range(identifierNode.getTextRange())
                                .textAttributes(ValaTextAttributeKey.METHOD_CALL)
                                .create();
                    }
                }

                ASTNode[] memberAccessNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.MEMBER_ACCESS));
                for (ASTNode memberAccessNode : memberAccessNodes) {

                    ASTNode simpleNameNode = memberAccessNode.findChildByType(ValaTypes.SIMPLE_NAME);

                    if (simpleNameNode != null) {

                        ASTNode identifierNode = simpleNameNode.findChildByType(ValaTypes.IDENTIFIER);

                        if (identifierNode != null) {
                            annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                    .range(identifierNode.getTextRange())
                                    .textAttributes(ValaTextAttributeKey.METHOD_CALL)
                                    .create();
                        }
                    }
                }
            }
        }
    }
}
