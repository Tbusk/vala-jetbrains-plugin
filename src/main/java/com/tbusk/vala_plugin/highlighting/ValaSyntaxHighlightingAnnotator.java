package com.tbusk.vala_plugin.highlighting;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import com.tbusk.vala_plugin.highlighting.syntax.*;
import com.tbusk.vala_plugin.psi.ValaNamedElement;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public final class ValaSyntaxHighlightingAnnotator implements Annotator {

    public static final Map<String, Set<ValaElementScope>> SCOPE_MAP = new HashMap<>();
    public static final List<ValaHighlighter> SYNTAX_HIGHLIGHTERS = Collections.synchronizedList(List.of(
            ValaParameterHighlighter.getInstance(),
            ValaMethodDeclarationHighlighter.getInstance(),
            ValaSignalDeclarationHighlighter.getInstance(),
            ValaInterfaceDeclarationHighlighter.getInstance(),
            ValaLocalVariableDeclarationHighlighter.getInstance(),
            ValaConstantDeclarationHighlighter.getInstance(),
            ValaAttributeHighlighter.getInstance(),
            ValaAttributeArgumentHighlighter.getInstance(),
            ValaTypeHighlighter.getInstance(),
            ValaObjectCreationHighlighter.getInstance(),
            ValaFieldDeclarationHighlighter.getInstance(),
            ValaObjectOrArrayCreationExpressionHighlighter.getInstance(),
            ValaTypeParameterHighlighter.getInstance(),
            ValaArgumentHighlighter.getInstance(),
            ValaErrorCodeHighlighter.getInstance(),
            ValaEnumValueHighlighter.getInstance(),
            ValaClassDeclarationHighlighter.getInstance(),
            ValaEnumDeclarationHighlighter.getInstance(),
            ValaStructDeclarationHighlighter.getInstance(),
            ValaErrorDomainDeclarationHighlighter.getInstance(),
            ValaNamespaceDeclarationHighlighter.getInstance(),
            ValaDelegateDeclarationHighlighter.getInstance(),
            ValaCreationMethodDeclarationHighlighter.getInstance(),
            ValaPropertyDeclarationHighlighter.getInstance(),
            ValaYieldExpressionHighlighter.getInstance(),
            ValaDestructorDeclarationHighlighter.getInstance(),
            ValaForEachHighlighter.getInstance(),
            ValaCatchHighlighter.getInstance(),
            ValaLambdaExpressionHighlighting.getInstance(),
            ValaPrimaryExpressionHighlighting.getInstance(),
            ValaIdentifierHighlighter.getInstance()
    ));
    private static final Set<String> PARENTS_TO_IGNORE = Collections.synchronizedSet(new HashSet<>(
            Set.of("ValaLocalVariableDeclaration",
                    "ValaLocalVariableDeclarations",
                    "ValaStatement",
                    "ValaParameters",
                    "ValaEmbeddedStatementWithoutBlock",
                    "ValaEmbeddedStatement",
                    "ValaFieldDeclaration",
                    "ValaClassMember",
                    "ValaNamespaceMember",
                    "ValaStructMember",
                    "ValaInterfaceMember",
                    "ValaIfStatement",
                    "ValaBlock"
            )
    ));

    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {

        for (ValaHighlighter highlighter : SYNTAX_HIGHLIGHTERS) {
            highlighter.highlight(psiElement, annotationHolder);
        }
    }

    public synchronized static void addScopedElement(PsiElement psiElement) {
        if (psiElement instanceof ValaNamedElement namedElement) {

            String type = psiElement.getClass().getSimpleName();
            String typeName = type.substring(0, type.indexOf("Impl"));

            PsiElement parent = psiElement.getParent();

            String parentType = parent.getClass().getSimpleName();
            String parentTypeName = parentType.substring(0, parentType.indexOf("Impl"));

            while (PARENTS_TO_IGNORE.contains(parentTypeName)) {
                parent = parent.getParent();

                parentType = parent.getClass().getSimpleName();
                parentTypeName = parentType.substring(0, parentType.indexOf("Impl"));
            }

            String scopeName = String.format("%s.%s", psiElement.getContainingFile().getName(), namedElement.getName());

            ValaElementScope scope = new ValaElementScope(
                    namedElement.getName(),
                    typeName,
                    namedElement.getTextRange(),
                    parentTypeName,
                    parent.getTextRange()
            );

            if (SCOPE_MAP.containsKey(scopeName)) {
                SCOPE_MAP.get(scopeName).add(scope);
            } else {
                Set<ValaElementScope> scopeSet = new HashSet<>();
                scopeSet.add(scope);
                SCOPE_MAP.put(scopeName, scopeSet);
            }
        }
    }
}
