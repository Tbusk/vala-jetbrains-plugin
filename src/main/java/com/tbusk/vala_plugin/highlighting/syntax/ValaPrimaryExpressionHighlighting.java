package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.ValaMemberAccess;
import com.tbusk.vala_plugin.psi.ValaSimpleName;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaMemberAccessImpl;
import com.tbusk.vala_plugin.psi.impl.ValaMethodCallImpl;
import com.tbusk.vala_plugin.psi.impl.ValaPrimaryExpressionImpl;
import com.tbusk.vala_plugin.psi.impl.ValaSimpleNameImpl;
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

            PsiElement[] children = psiElement.getChildren();

            for (int i = 0; i < children.length; i++) {

                int currentPos = i;

                if (children[i] instanceof ValaMethodCallImpl) {
                    while (i > 0 && !(children[i] instanceof ValaSimpleNameImpl) && !(children[i] instanceof ValaMemberAccessImpl)) {
                        i--;
                    }

                    if (children[i] instanceof ValaSimpleNameImpl) {
                        ASTNode identifierNode = children[i].getNode().findChildByType(ValaTypes.IDENTIFIER);

                        if (identifierNode != null) {
                            annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                    .range(identifierNode.getTextRange())
                                    .textAttributes(ValaTextAttributeKey.METHOD_CALL)
                                    .create();
                        }
                    }

                    if (children[i] instanceof ValaMemberAccessImpl) {
                        ASTNode simpleNameNode = children[i].getNode().findChildByType(ValaTypes.SIMPLE_NAME);

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

                    i = currentPos;
                }
            }

            for (PsiElement child : children) {
                if (child instanceof ValaSimpleName) {
                    ASTNode identifierNode = child.getNode().findChildByType(ValaTypes.IDENTIFIER);

                    if (identifierNode != null && identifierNode.getText().matches("[A-Z0-9_]+")) {
                        System.out.println(identifierNode.getText());
                        annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                .range(identifierNode.getTextRange())
                                .textAttributes(ValaTextAttributeKey.CONSTANT)
                                .create();
                    }
                }

                if (child instanceof ValaMemberAccess) {
                    ASTNode simpleNameNode = child.getNode().findChildByType(ValaTypes.SIMPLE_NAME);

                    if (simpleNameNode != null) {
                        ASTNode identifierNode = simpleNameNode.findChildByType(ValaTypes.IDENTIFIER);

                        if (identifierNode != null && identifierNode.getText().matches("[A-Z0-9_]+")) {
                            System.out.println(identifierNode.getText());
                            annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                    .range(identifierNode.getTextRange())
                                    .textAttributes(ValaTextAttributeKey.CONSTANT)
                                    .create();
                        }
                    }
                }

            }

            ASTNode[] simpleNames = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.SIMPLE_NAME));
            for (ASTNode simpleNameNode : simpleNames) {
                ASTNode identifierNode = simpleNameNode.findChildByType(ValaTypes.IDENTIFIER);

                if (identifierNode != null) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(identifierNode.getTextRange())
                            .textAttributes(DefaultLanguageHighlighterColors.INSTANCE_FIELD)
                            .create();
                }
            }

            ASTNode[] memberAccesses = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.MEMBER_ACCESS));
            for (ASTNode memberAccessNode : memberAccesses) {
                ASTNode simpleNameNode = memberAccessNode.findChildByType(ValaTypes.SIMPLE_NAME);

                if (simpleNameNode != null) {
                    ASTNode identifierNode = simpleNameNode.findChildByType(ValaTypes.IDENTIFIER);

                    if (identifierNode != null) {
                        annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                .range(identifierNode.getTextRange())
                                .textAttributes(DefaultLanguageHighlighterColors.INSTANCE_FIELD)
                                .create();
                    }
                }
            }
        }
    }
}
