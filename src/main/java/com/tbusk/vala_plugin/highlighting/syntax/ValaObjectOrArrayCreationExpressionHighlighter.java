package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaObjectOrArrayCreationExpressionImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaObjectOrArrayCreationExpressionHighlighter implements ValaHighlighter {

    private static volatile ValaObjectOrArrayCreationExpressionHighlighter instance;

    private ValaObjectOrArrayCreationExpressionHighlighter() {
    }

    public static synchronized ValaObjectOrArrayCreationExpressionHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaObjectOrArrayCreationExpressionHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaObjectOrArrayCreationExpressionImpl) {

            ValaSyntaxHighlightingAnnotator.addScopedElement(psiElement);

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            highlightObjectCreationChainedIdentifiers(psiElement, annotationHolder);

            util.highlightMember(psiElement, annotationHolder, ValaTextAttributeKey.METHOD_CALL);
        }
    }

    private void highlightObjectCreationChainedIdentifiers(PsiElement objectOrArrayCreationExpression, AnnotationHolder annotationHolder) {

        ASTNode objectCreationExpressionNode = objectOrArrayCreationExpression.getNode().findChildByType(ValaTypes.OBJECT_CREATION_EXPRESSION);
        if (objectCreationExpressionNode != null) {
            ASTNode[] memberAccessNodes = objectCreationExpressionNode.getChildren(TokenSet.create(ValaTypes.MEMBER_ACCESS));

            for  (ASTNode memberAccessNode : memberAccessNodes) {
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
