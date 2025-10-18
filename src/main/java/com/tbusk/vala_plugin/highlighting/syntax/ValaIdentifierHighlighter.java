package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.language.ValaFile;
import com.tbusk.vala_plugin.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class ValaIdentifierHighlighter implements ValaHighlighter {

    private static final ValaIdentifierHighlighter INSTANCE = new ValaIdentifierHighlighter();

    private ValaIdentifierHighlighter() {
    }

    public static ValaIdentifierHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        ValaIdentifier identifier = null;
        if (psiElement instanceof ValaIdentifier) {
            identifier = (ValaIdentifier) psiElement;
        } else if (psiElement instanceof ValaSymbolPart || psiElement instanceof ValaMemberPart) {
            ValaIdentifier childId = PsiTreeUtil.getChildOfType(psiElement, ValaIdentifier.class);
            if (childId != null) {
                identifier = childId;
            }
        }

        if (identifier != null) {

            PsiElement parent = identifier.getParent();
            if ((parent instanceof ValaSymbolPart && parent.getParent() instanceof ValaSymbol && (
                    parent.getParent().getParent() instanceof ValaTypeWeak ||
                            parent.getParent().getParent() instanceof ValaTypeWeakWithParenthesis ||
                            parent.getParent().getParent() instanceof ValaTypeWithParenthesis ||
                            parent.getParent().getParent() instanceof ValaType ||
                            parent.getParent().getParent() instanceof ValaStructDeclaration ||
                            parent.getParent().getParent() instanceof ValaEnumDeclaration ||
                            parent.getParent().getParent() instanceof ValaErrordomainDeclaration ||
                            parent.getParent().getParent() instanceof ValaClassDeclaration ||
                            parent.getParent().getParent() instanceof ValaNamespaceDeclaration ||
                            parent.getParent().getParent() instanceof ValaInterfaceDeclaration
            )
            ) || parent instanceof ValaFieldDeclarationSection ||
                    (parent instanceof ValaMemberPart && parent.getParent() instanceof ValaMember && (
                            parent.getParent().getParent() instanceof ValaMethodDeclaration
                    )
                    )) {
                return;
            }

            String name = identifier.getName();
            if (name == null || name.isEmpty()) {
                return;
            }

            ValaFile containingFile = PsiTreeUtil.getParentOfType(identifier, ValaFile.class);
            if (containingFile == null) {
                return;
            }

            List<PsiNamedElement> declarations = ValaUtil.findDeclarationsInFile(containingFile, name, false);

            TextRange range = identifier.getTextRange();
            if (!declarations.isEmpty()) {
                PsiNamedElement target = declarations.getFirst(); // Use first match
                TextAttributesKey key = getTextAttributesKey(target);
                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                        .range(range)
                        .textAttributes(key)
                        .create();
            }
        }
    }

    private TextAttributesKey getTextAttributesKey(PsiNamedElement element) {
        if (element instanceof ValaClassDeclaration ||
                element instanceof ValaInterfaceDeclaration ||
                element instanceof ValaStructDeclaration ||
                element instanceof ValaEnumDeclaration ||
                element instanceof ValaErrordomainDeclaration) {
            return ValaTextAttributeKey.STRUCTURE_NAMES;
        } else if (
                element instanceof ValaPropertyDeclaration) {
            return ValaTextAttributeKey.METHOD_DECLARATION;
        } else if (element instanceof ValaFieldDeclaration) {
            return ValaTextAttributeKey.INSTANCE_VARIABLE;
        } else if (element instanceof ValaLocalVariable ||
                element instanceof ValaForeachStatement ||
                element instanceof ValaCatchClause ||
                element instanceof ValaLocalTupleDeclaration) {
            return ValaTextAttributeKey.LOCAL_VARIABLE;
        } else if (element instanceof ValaParameter) {
            return ValaTextAttributeKey.PARAMETER;
        } else if (element instanceof ValaConstantDeclaration) {
            return ValaTextAttributeKey.CONSTANT;
        } else {
            return null;
        }
    }
}
