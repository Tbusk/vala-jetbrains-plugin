package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.ValaTypes;
import dev.vala.jetbrains.psi.impl.ValaLambdaExpressionImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaLambdaExpressionHighlighting implements ValaHighlighter {

    private static volatile ValaLambdaExpressionHighlighting instance;

    private ValaLambdaExpressionHighlighting() {
    }

    public static synchronized ValaLambdaExpressionHighlighting getInstance() {
        if (instance == null) {
            instance = new ValaLambdaExpressionHighlighting();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaLambdaExpressionImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            ASTNode lambaExpressionParamsNode = psiElement.getNode().findChildByType(ValaTypes.LAMBDA_EXPRESSION_PARAMS);

            if (lambaExpressionParamsNode != null) {
                ASTNode[] lamdaExpressionParamNodes = lambaExpressionParamsNode.getChildren(TokenSet.create(ValaTypes.LAMBDA_EXPRESSION_PARAM));

                for (ASTNode lambdaExpressionParamNode : lamdaExpressionParamNodes) {
                    ASTNode identifierNode = lambdaExpressionParamNode.findChildByType(ValaTypes.IDENTIFIER);

                    ValaSyntaxHighlightingAnnotator.addScopedElement(lambdaExpressionParamNode.getPsi());

                    if (identifierNode != null) {
                        util.highlightIdentifier(identifierNode.getPsi(), annotationHolder, ValaTextAttributeKey.LOCAL_VARIABLE);
                    }
                }
            }

            ASTNode lambdaExpressionParamNode = psiElement.getNode().findChildByType(ValaTypes.LAMBDA_EXPRESSION_PARAM);

            if (lambdaExpressionParamNode != null) {
                ASTNode identifierNode = lambdaExpressionParamNode.findChildByType(ValaTypes.IDENTIFIER);

                ValaSyntaxHighlightingAnnotator.addScopedElement(lambdaExpressionParamNode.getPsi());

                if (identifierNode != null) {
                    util.highlightIdentifier(identifierNode.getPsi(), annotationHolder, ValaTextAttributeKey.LOCAL_VARIABLE);
                }
            }
        }
    }

}
