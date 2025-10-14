package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaObjectOrArrayCreationExpressionImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaObjectOrArrayCreationExpressionHighlighter {

    private static final ValaObjectOrArrayCreationExpressionHighlighter INSTANCE = new ValaObjectOrArrayCreationExpressionHighlighter();

    private ValaObjectOrArrayCreationExpressionHighlighter() {
    }

    public static ValaObjectOrArrayCreationExpressionHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaObjectOrArrayCreationExpressionImpl) {

            ASTNode symbolNode = psiElement.getNode().findChildByType(ValaTypes.MEMBER);
            if (symbolNode != null) {

                ASTNode[] memberPartNodes = symbolNode.getChildren(TokenSet.create(ValaTypes.MEMBER_PART));

                for (ASTNode memberPartNode : memberPartNodes) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(memberPartNode.getTextRange())
                            .textAttributes(ValaSyntaxHighlighter.METHOD_CALL)
                            .create();
                }
            }
        }
    }

}
