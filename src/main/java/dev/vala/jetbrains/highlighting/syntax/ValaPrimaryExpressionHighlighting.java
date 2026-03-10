package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import dev.vala.jetbrains.highlighting.ValaElementScope;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaSyntaxHighlightingAnnotator;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.ValaMemberAccess;
import dev.vala.jetbrains.psi.ValaSimpleName;
import dev.vala.jetbrains.psi.ValaTypes;
import dev.vala.jetbrains.psi.impl.ValaMemberAccessImpl;
import dev.vala.jetbrains.psi.impl.ValaMethodCallImpl;
import dev.vala.jetbrains.psi.impl.ValaPrimaryExpressionImpl;
import dev.vala.jetbrains.psi.impl.ValaSimpleNameImpl;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public final class ValaPrimaryExpressionHighlighting implements ValaHighlighter {
    private static volatile ValaPrimaryExpressionHighlighting instance;

    private ValaPrimaryExpressionHighlighting() {
    }

    public static synchronized ValaPrimaryExpressionHighlighting getInstance() {
        if (instance == null) {
            instance = new ValaPrimaryExpressionHighlighting();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaPrimaryExpressionImpl) {

            PsiElement[] children = psiElement.getChildren();

            highlightMethodCallIdentifiers(children, annotationHolder);
            highlightConstantIdentifiers(children, annotationHolder);
            highlightOtherIdentifiers(psiElement, annotationHolder);
        }
    }

    private void highlightMethodCallIdentifiers(PsiElement[] children, AnnotationHolder annotationHolder) {

        for (int i = 0; i < children.length; i++) {

            int currentPos = i;

            if (children[i] instanceof ValaMethodCallImpl) {
                while (i > 0 && !(children[i] instanceof ValaSimpleNameImpl) && !(children[i] instanceof ValaMemberAccessImpl)) {
                    i--;
                }

                if (children[i] instanceof ValaSimpleNameImpl) {
                    ASTNode identifierNode = children[i].getNode().findChildByType(ValaTypes.IDENTIFIER);

                    if (identifierNode != null) {
                        annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                .range(identifierNode.getTextRange())
                                .textAttributes(ValaTextAttributeKey.METHOD_CALL)
                                .create();
                    }
                }

                if (children[i] instanceof ValaMemberAccessImpl) {
                    ASTNode simpleNameNode = children[i].getNode().findChildByType(ValaTypes.SIMPLE_NAME);

                    if (simpleNameNode != null) {
                        ASTNode identifierNode = simpleNameNode.findChildByType(ValaTypes.IDENTIFIER);

                        if (identifierNode != null) {
                            annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                    .range(identifierNode.getTextRange())
                                    .textAttributes(ValaTextAttributeKey.METHOD_CALL)
                                    .create();
                        }
                    }
                }

                i = currentPos;
            }
        }
    }

    private void highlightConstantIdentifiers(PsiElement[] children, @NotNull AnnotationHolder annotationHolder) {

        String constantRegex = "[A-Z0-9_]+";

        for (PsiElement child : children) {
            if (child instanceof ValaSimpleName) {
                ASTNode identifierNode = child.getNode().findChildByType(ValaTypes.IDENTIFIER);

                if (identifierNode != null && identifierNode.getText().matches(constantRegex)) {
                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(identifierNode.getTextRange())
                            .textAttributes(ValaTextAttributeKey.CONSTANT)
                            .create();
                }
            }

            if (child instanceof ValaMemberAccess) {
                ASTNode simpleNameNode = child.getNode().findChildByType(ValaTypes.SIMPLE_NAME);

                if (simpleNameNode != null) {
                    ASTNode identifierNode = simpleNameNode.findChildByType(ValaTypes.IDENTIFIER);

                    if (identifierNode != null && identifierNode.getText().matches(constantRegex)) {
                        annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                .range(identifierNode.getTextRange())
                                .textAttributes(ValaTextAttributeKey.CONSTANT)
                                .create();
                    }
                }
            }

        }
    }

    private void highlightOtherIdentifiers(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {

        ASTNode[] simpleNameNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.SIMPLE_NAME));
        for (ASTNode simpleNameNode : simpleNameNodes) {
            ASTNode identifierNode = simpleNameNode.findChildByType(ValaTypes.IDENTIFIER);

            if (identifierNode != null) {

                String scopeKey = String.format("%s.%s", identifierNode.getPsi().getContainingFile().getName(), identifierNode.getText());

                if (!ValaSyntaxHighlightingAnnotator.SCOPE_MAP.containsKey(scopeKey)) {

                    annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(identifierNode.getTextRange())
                            .textAttributes(ValaTextAttributeKey.INSTANCE_VARIABLE)
                            .create();
                } else {
                    Set<ValaElementScope> scopes = ValaSyntaxHighlightingAnnotator.SCOPE_MAP.get(scopeKey);

                    for (ValaElementScope scope : scopes) {
                        int identifierStart = identifierNode.getPsi().getTextRange().getStartOffset();
                        if (!(scope.parentRange().getStartOffset() <= identifierStart && scope.parentRange().getEndOffset() >= identifierStart)) {
                            annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                    .range(identifierNode.getTextRange())
                                    .textAttributes(ValaTextAttributeKey.INSTANCE_VARIABLE)
                                    .create();
                        }
                    }
                }
            }
        }

        ASTNode[] memberAccessNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.MEMBER_ACCESS));
        for (ASTNode memberAccessNode : memberAccessNodes) {
            ASTNode simpleNameNode = memberAccessNode.findChildByType(ValaTypes.SIMPLE_NAME);

            if (simpleNameNode != null) {
                ASTNode identifierNode = simpleNameNode.findChildByType(ValaTypes.IDENTIFIER);

                if (identifierNode != null) {

                    String scopeKey = String.format("%s.%s", identifierNode.getPsi().getContainingFile().getName(), identifierNode.getText());

                    if (!ValaSyntaxHighlightingAnnotator.SCOPE_MAP.containsKey(scopeKey)) {
                        annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                .range(identifierNode.getTextRange())
                                .textAttributes(ValaTextAttributeKey.INSTANCE_VARIABLE)
                                .create();
                    } else {
                        Set<ValaElementScope> scopes = ValaSyntaxHighlightingAnnotator.SCOPE_MAP.get(scopeKey);

                        for (ValaElementScope scope : scopes) {
                            int identifierStart = identifierNode.getPsi().getTextRange().getStartOffset();
                            if (!(scope.parentRange().getStartOffset() <= identifierStart && scope.parentRange().getEndOffset() >= identifierStart)) {
                                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                        .range(identifierNode.getTextRange())
                                        .textAttributes(ValaTextAttributeKey.INSTANCE_VARIABLE)
                                        .create();
                            }
                        }
                    }
                }
            }
        }

        ASTNode[] memberNodes = psiElement.getNode().getChildren(TokenSet.create(ValaTypes.MEMBER));
        for (ASTNode memberNode : memberNodes) {
            ASTNode[] memberPartNodes = memberNode.getChildren(TokenSet.create(ValaTypes.MEMBER_PART));

            for (ASTNode memberPartNode : memberPartNodes) {
                ASTNode identifierNode = memberPartNode.findChildByType(TokenSet.create(ValaTypes.IDENTIFIER));

                if (identifierNode != null) {

                    String scopeKey = String.format("%s.%s", identifierNode.getPsi().getContainingFile().getName(), identifierNode.getText());

                    if (!ValaSyntaxHighlightingAnnotator.SCOPE_MAP.containsKey(scopeKey)) {
                        annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                .range(identifierNode.getTextRange())
                                .textAttributes(ValaTextAttributeKey.INSTANCE_VARIABLE)
                                .create();
                    } else {
                        Set<ValaElementScope> scopes = ValaSyntaxHighlightingAnnotator.SCOPE_MAP.get(scopeKey);

                        for (ValaElementScope scope : scopes) {
                            int identifierStart = identifierNode.getPsi().getTextRange().getStartOffset();
                            if (!(scope.parentRange().getStartOffset() <= identifierStart && scope.parentRange().getEndOffset() >= identifierStart)) {
                                annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                                        .range(identifierNode.getTextRange())
                                        .textAttributes(ValaTextAttributeKey.INSTANCE_VARIABLE)
                                        .create();
                            }
                        }
                    }
                }

            }

        }

    }
}
