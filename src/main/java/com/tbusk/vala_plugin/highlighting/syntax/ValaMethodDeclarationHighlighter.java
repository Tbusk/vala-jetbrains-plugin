package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaCreationMethodDeclarationImpl;
import com.tbusk.vala_plugin.psi.impl.ValaMethodDeclarationImpl;
import com.tbusk.vala_plugin.psi.impl.ValaPropertyDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaMethodDeclarationHighlighter {

    private static final ValaMethodDeclarationHighlighter INSTANCE = new ValaMethodDeclarationHighlighter();

    private ValaMethodDeclarationHighlighter() {
    }

    public static ValaMethodDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaMethodDeclarationImpl ||
                psiElement instanceof ValaCreationMethodDeclarationImpl ||
                psiElement instanceof ValaPropertyDeclarationImpl
        ) {
            ASTNode memberNode = psiElement.getNode().findChildByType(ValaTypes.MEMBER);
            if (memberNode != null) {

                ASTNode[] memberPartNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.MEMBER_PART));

                for (ASTNode memberPartNode : memberPartNodes) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(memberPartNode.getTextRange())
                            .textAttributes(ValaSyntaxHighlighter.METHOD_DECLARATION)
                            .create();
                }
            }

            ASTNode identifierNode = psiElement.getNode().findChildByType(ValaTypes.IDENTIFIER);
            if (identifierNode != null) {

                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                        .range(identifierNode.getTextRange())
                        .textAttributes(ValaSyntaxHighlighter.METHOD_DECLARATION)
                        .create();
            }
        }
    }
}
