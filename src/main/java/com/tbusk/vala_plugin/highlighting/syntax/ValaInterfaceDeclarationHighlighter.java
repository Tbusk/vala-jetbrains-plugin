package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlighter;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaInterfaceDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaInterfaceDeclarationHighlighter {

    private static final ValaInterfaceDeclarationHighlighter INSTANCE = new ValaInterfaceDeclarationHighlighter();

    private ValaInterfaceDeclarationHighlighter() {
    }

    public static ValaInterfaceDeclarationHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaInterfaceDeclarationImpl) {
            ASTNode symbolNode = psiElement.getNode().findChildByType(ValaTypes.SYMBOL);

            if (symbolNode != null) {
                ASTNode[] symbolPartNodes = symbolNode.getChildren(TokenSet.create(ValaTypes.SYMBOL_PART));

                for (ASTNode symbolPartNode : symbolPartNodes) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(symbolPartNode.getTextRange())
                            .textAttributes(ValaSyntaxHighlighter.INTERFACE_NAME)
                            .create();
                }
            }
        }
    }
}
