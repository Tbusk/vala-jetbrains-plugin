package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaYieldExpressionImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaYieldExpressionHighlighter implements ValaHighlighter {

    private static final ValaYieldExpressionHighlighter INSTANCE = new ValaYieldExpressionHighlighter();

    private ValaYieldExpressionHighlighter() {
    }

    public static ValaYieldExpressionHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaYieldExpressionImpl) {

            ASTNode memberNode = psiElement.getNode().findChildByType(TokenSet.create(ValaTypes.MEMBER));
            if (memberNode != null) {
                highlightMemberPartNodes(annotationHolder, memberNode);
            }
        }
    }

    private static void highlightMemberPartNodes(@NotNull AnnotationHolder annotationHolder, ASTNode memberNode) {
        ASTNode[] memberPartNodes = memberNode.getChildren(TokenSet.create(ValaTypes.MEMBER_PART));

        for (ASTNode memberPartNode : memberPartNodes) {
            ASTNode identifierNode = memberPartNode.findChildByType(TokenSet.create(ValaTypes.IDENTIFIER));
            if (identifierNode != null && memberPartNode.equals(memberPartNodes[memberPartNodes.length - 1])) {
                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                        .range(identifierNode.getTextRange())
                        .textAttributes(ValaTextAttributeKey.METHOD_CALL)
                        .create();
            } else if (identifierNode != null) {
                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                        .range(identifierNode.getTextRange())
                        .textAttributes(ValaTextAttributeKey.INSTANCE_VARIABLE)
                        .create();
            }
        }
    }
}
