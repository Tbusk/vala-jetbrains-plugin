package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.psi.ValaTypes;
import com.tbusk.vala_plugin.psi.impl.ValaTypeImpl;
import com.tbusk.vala_plugin.psi.impl.ValaTypeWeakImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaTypeHighlighter {

    private static final ValaTypeHighlighter INSTANCE = new ValaTypeHighlighter();

    private ValaTypeHighlighter() {
    }

    public static ValaTypeHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaTypeImpl ||
                psiElement instanceof ValaTypeWeakImpl) {
            ASTNode symbolNode = psiElement.getNode().findChildByType(ValaTypes.SYMBOL);

            if (symbolNode != null) {
                ASTNode[] symbolPartNodes = symbolNode.getChildren(TokenSet.create(ValaTypes.SYMBOL_PART));

                for (ASTNode symbolPartNode : symbolPartNodes) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(symbolPartNode.getTextRange())
                            .textAttributes(DefaultLanguageHighlighterColors.INSTANCE_FIELD)
                            .create();
                }
            }
        }
    }
}
