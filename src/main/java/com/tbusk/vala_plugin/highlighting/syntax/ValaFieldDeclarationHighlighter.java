package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaFieldDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaFieldDeclarationHighlighter implements ValaHighlighter {

    private static final ValaFieldDeclarationHighlighter INSTANCE = new ValaFieldDeclarationHighlighter();

    private ValaFieldDeclarationHighlighter() {
    }

    public static ValaFieldDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaFieldDeclarationImpl) {
            ASTNode[] fieldDeclarationSectionNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.FIELD_DECLARATION_SECTION));

            for (ASTNode fieldDeclarationSectionNode : fieldDeclarationSectionNodes) {

                ASTNode identifierNode = fieldDeclarationSectionNode.findChildByType(ValaTypes.IDENTIFIER);

                if (identifierNode != null) {

                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(identifierNode.getTextRange())
                            .textAttributes(ValaTextAttributeKey.LOCAL_VARIABLE)
                            .create();
                }
            }
        }
    }
}
