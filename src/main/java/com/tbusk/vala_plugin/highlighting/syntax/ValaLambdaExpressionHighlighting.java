package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaHighlighterUtil;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.ValaLambdaExpressionParams;
import com.tbusk.vala_plugin.psi.ValaTypes;
import org.jetbrains.annotations.NotNull;

public final class ValaLambdaExpressionHighlighting implements ValaHighlighter {

    private static final ValaLambdaExpressionHighlighting INSTANCE = new ValaLambdaExpressionHighlighting();

    private ValaLambdaExpressionHighlighting() {
    }

    public static ValaLambdaExpressionHighlighting getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaLambdaExpressionParams) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            ASTNode[] identifierNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.IDENTIFIER));

            for (ASTNode identifierNode : identifierNodes) {
                ValaSyntaxHighlightingAnnotator.addScopedElement(identifierNode.getPsi(), annotationHolder);

                util.highlightIdentifier(identifierNode.getPsi(), annotationHolder, ValaTextAttributeKey.PARAMETER);
            }
        }
    }

}
