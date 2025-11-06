package com.tbusk.vala_plugin.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.ValaElementScope;
import com.tbusk.vala_plugin.highlighting.ValaHighlighter;
import com.tbusk.vala_plugin.highlighting.ValaSyntaxHighlightingAnnotator;
import com.tbusk.vala_plugin.highlighting.ValaTextAttributeKey;
import com.tbusk.vala_plugin.psi.ValaCatchClause;
import com.tbusk.vala_plugin.psi.ValaForeachStatement;
import com.tbusk.vala_plugin.psi.ValaIdentifier;
import com.tbusk.vala_plugin.psi.ValaParameter;
import org.jetbrains.annotations.NotNull;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class ValaIdentifierHighlighter implements ValaHighlighter {

    private static volatile ValaIdentifierHighlighter instance;

    private ValaIdentifierHighlighter() {
    }

    public static final Map<String, TextAttributesKey> KEY_MAP = new ConcurrentHashMap<>(
            Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("ValaClassDeclaration", ValaTextAttributeKey.INSTANCE_VARIABLE),
                    new AbstractMap.SimpleEntry<>("ValaInterfaceDeclaration", ValaTextAttributeKey.INTERFACE_NAME),
                    new AbstractMap.SimpleEntry<>("ValaStructDeclaration", ValaTextAttributeKey.INSTANCE_VARIABLE),
                    new AbstractMap.SimpleEntry<>("ValaEnumDeclaration", ValaTextAttributeKey.INSTANCE_VARIABLE),
                    new AbstractMap.SimpleEntry<>("ValaErrordomainDeclaration", ValaTextAttributeKey.INSTANCE_VARIABLE),
                    new AbstractMap.SimpleEntry<>("ValaNamespaceDeclaration", ValaTextAttributeKey.INSTANCE_VARIABLE),

                    new AbstractMap.SimpleEntry<>("ValaPropertyDeclaration", ValaTextAttributeKey.METHOD_CALL),
                    new AbstractMap.SimpleEntry<>("ValaMethodDeclaration", ValaTextAttributeKey.METHOD_CALL),
                    new AbstractMap.SimpleEntry<>("ValaCreationMethodDeclaration", ValaTextAttributeKey.METHOD_CALL),
                    new AbstractMap.SimpleEntry<>("ValaDestructorDeclaration", ValaTextAttributeKey.METHOD_CALL),

                    new AbstractMap.SimpleEntry<>("ValaDelegateDeclaration", ValaTextAttributeKey.LOCAL_VARIABLE),
                    new AbstractMap.SimpleEntry<>("ValaSignalDeclaration", ValaTextAttributeKey.METHOD_CALL),
                    new AbstractMap.SimpleEntry<>("ValaYieldExpression", ValaTextAttributeKey.LOCAL_VARIABLE),
                    new AbstractMap.SimpleEntry<>("ValaFieldDeclarationSection", ValaTextAttributeKey.INSTANCE_VARIABLE),
                    new AbstractMap.SimpleEntry<>("ValaLocalVariable", ValaTextAttributeKey.LOCAL_VARIABLE),
                    new AbstractMap.SimpleEntry<>("ValaForeachStatement", ValaTextAttributeKey.LOCAL_VARIABLE),
                    new AbstractMap.SimpleEntry<>("ValaCatchClause", ValaTextAttributeKey.LOCAL_VARIABLE),
                    new AbstractMap.SimpleEntry<>("ValaLocalTupleDeclaration", ValaTextAttributeKey.LOCAL_VARIABLE),

                    new AbstractMap.SimpleEntry<>("ValaParameter", ValaTextAttributeKey.PARAMETER),
                    new AbstractMap.SimpleEntry<>("ValaLambdaExpressionParam", ValaTextAttributeKey.LOCAL_VARIABLE),

                    new AbstractMap.SimpleEntry<>("ValaConstantDeclaration", ValaTextAttributeKey.CONSTANT)
            )
    );

    public static synchronized ValaIdentifierHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaIdentifierHighlighter();
        }
        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaIdentifier identifier && !(psiElement.getParent() instanceof ValaParameter) && !(psiElement.getParent() instanceof ValaForeachStatement) && !(psiElement.getParent() instanceof ValaCatchClause)) {

            String scopeName = String.format("%s.%s", identifier.getContainingFile().getName(), identifier.getText());

            if (ValaSyntaxHighlightingAnnotator.SCOPE_MAP.containsKey(scopeName)) {
                Set<ValaElementScope> scopes = ValaSyntaxHighlightingAnnotator.SCOPE_MAP.get(scopeName);

                ValaElementScope scope = findClosestScope(identifier, scopes);

                if (scope != null && !KEY_MAP.containsKey(scope.type())) {
                    throw new RuntimeException(scope.type());
                }

                if (scope != null && scope.type() != null) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(psiElement.getTextRange())
                            .textAttributes(KEY_MAP.get(scope.type()))
                            .create();
                }
            }
        }
    }

    public ValaElementScope findClosestScope(ValaIdentifier identifier, Set<ValaElementScope> scopes) {
        ValaElementScope closestScope = null;
        int identifierStart = identifier.getTextRange().getStartOffset();
        int closestDistance = Integer.MAX_VALUE;

        for (ValaElementScope scope : scopes) {
            if (scope.parentRange().getStartOffset() <= identifierStart && scope.parentRange().getEndOffset() >= identifierStart) {
                int scopeStart = scope.range().getStartOffset();

                if (scopeStart <= identifierStart) {
                    int distance = identifierStart - scopeStart;

                    if (distance < closestDistance) {
                        closestDistance = distance;
                        closestScope = scope;
                    }
                } else if (scope.type().equals("ValaMethodDeclaration") || scope.type().equals("ValaCreationMethodDeclaration")) {
                    closestScope = scope;
                }
            }
        }

        return closestScope;
    }
}
