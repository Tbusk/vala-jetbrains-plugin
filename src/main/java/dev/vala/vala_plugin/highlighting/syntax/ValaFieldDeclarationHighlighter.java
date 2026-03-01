package dev.vala.vala_plugin.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import dev.vala.vala_plugin.highlighting.ValaHighlighter;
import dev.vala.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.vala_plugin.highlighting.ValaTextAttributeKey;
import dev.vala.vala_plugin.psi.ValaTypes;
import dev.vala.vala_plugin.psi.impl.ValaFieldDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaFieldDeclarationHighlighter implements ValaHighlighter {

    private static volatile ValaFieldDeclarationHighlighter instance;

    private ValaFieldDeclarationHighlighter() {
    }

    public static synchronized ValaFieldDeclarationHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaFieldDeclarationHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaFieldDeclarationImpl) {

            ASTNode[] fieldDeclarationSectionNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.FIELD_DECLARATION_SECTION));

            for (ASTNode fieldDeclarationSectionNode : fieldDeclarationSectionNodes) {

                ValaSyntaxHighlightingAnnotator.addScopedElement(fieldDeclarationSectionNode.getPsi());

                ASTNode identifierNode = fieldDeclarationSectionNode.findChildByType(ValaTypes.IDENTIFIER);

                if (identifierNode != null) {

                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(identifierNode.getTextRange())
                            .textAttributes(ValaTextAttributeKey.INSTANCE_VARIABLE)
                            .create();
                }
            }
        }
    }
}
