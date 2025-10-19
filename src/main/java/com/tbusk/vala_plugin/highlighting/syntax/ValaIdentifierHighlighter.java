package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.language.ValaFile;
import com.tbusk.vala_plugin.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ValaIdentifierHighlighter implements ValaHighlighter {

    private static final ValaIdentifierHighlighter INSTANCE = new ValaIdentifierHighlighter();

    private ValaIdentifierHighlighter() {
    }

    public static final Map<String, TextAttributesKey> KEY_MAP = new HashMap<>(
            Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("ValaClassDeclaration", ValaTextAttributeKey.STRUCTURE_NAMES),
                    new AbstractMap.SimpleEntry<>("ValaInterfaceDeclaration", ValaTextAttributeKey.STRUCTURE_NAMES),
                    new AbstractMap.SimpleEntry<>("ValaStructDeclaration", ValaTextAttributeKey.STRUCTURE_NAMES),
                    new AbstractMap.SimpleEntry<>("ValaEnumDeclaration", ValaTextAttributeKey.STRUCTURE_NAMES),
                    new AbstractMap.SimpleEntry<>("ValaErrordomainDeclaration", ValaTextAttributeKey.STRUCTURE_NAMES),

                    new AbstractMap.SimpleEntry<>("ValaPropertyDeclaration", ValaTextAttributeKey.METHOD_DECLARATION),
                    new AbstractMap.SimpleEntry<>("ValaMethodDeclaration", ValaTextAttributeKey.METHOD_DECLARATION),
                    new AbstractMap.SimpleEntry<>("ValaCreationMethodDeclaration", ValaTextAttributeKey.METHOD_DECLARATION),
                    new AbstractMap.SimpleEntry<>("ValaYieldExpression", ValaTextAttributeKey.METHOD_DECLARATION),
                    new AbstractMap.SimpleEntry<>("ValaDestructorDeclaration", ValaTextAttributeKey.METHOD_DECLARATION),

                    new AbstractMap.SimpleEntry<>("ValaFieldDeclaration", ValaTextAttributeKey.INSTANCE_VARIABLE),

                    new AbstractMap.SimpleEntry<>("ValaLocalVariable", ValaTextAttributeKey.LOCAL_VARIABLE),
                    new AbstractMap.SimpleEntry<>("ValaForeachStatement", ValaTextAttributeKey.LOCAL_VARIABLE),
                    new AbstractMap.SimpleEntry<>("ValaCatchClause", ValaTextAttributeKey.LOCAL_VARIABLE),
                    new AbstractMap.SimpleEntry<>("ValaLocalTupleDeclaration", ValaTextAttributeKey.LOCAL_VARIABLE),

                    new AbstractMap.SimpleEntry<>("ValaParameter", ValaTextAttributeKey.PARAMETER),

                    new AbstractMap.SimpleEntry<>("ValaConstantDeclaration", ValaTextAttributeKey.CONSTANT)
            )
    );

    public static ValaIdentifierHighlighter getInstance() {
        return INSTANCE;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaIdentifier) {

            if (psiElement.getParent() instanceof ValaSimpleName) {

                if (psiElement.getParent().getParent() instanceof ValaMemberAccess ||
                        psiElement.getParent().getParent() instanceof ValaPrimaryExpression) {
                    ValaFile containingFile = PsiTreeUtil.getParentOfType(psiElement, ValaFile.class);

                    List<PsiNamedElement> declarations = ValaUtil.findDeclarationsInFile(containingFile, psiElement.getText(), true);

                    if (!declarations.isEmpty()) {

                        String implementationClassName = declarations.getFirst().getClass().getSimpleName();

                        annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                .range(psiElement.getTextRange())
                                .textAttributes(KEY_MAP.getOrDefault(implementationClassName.substring(0, implementationClassName.indexOf("Impl")), ValaTextAttributeKey.IDENTIFIER))
                                .create();
                    }
                }
            }
        }
    }
}
