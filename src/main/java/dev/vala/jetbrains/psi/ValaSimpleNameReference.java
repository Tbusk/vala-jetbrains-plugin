package dev.vala.jetbrains.psi;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.util.PsiTreeUtil;
import dev.vala.jetbrains.parser.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

public class ValaSimpleNameReference extends PsiReferenceBase<ValaSimpleName> {

    public ValaSimpleNameReference(@NotNull ValaSimpleName element) {
        super(element, element.getIdentifier().getTextRangeInParent());
    }

    @Override
    public @Nullable PsiElement resolve() {
        String name = getElement().getIdentifier().getText();

        PsiElement usage = getElement();
        PsiElement current = usage.getParent();

        while (current != null && !(current instanceof PsiFile)) {

            Collection<ValaNamedElement> namedElements = PsiTreeUtil.findChildrenOfType(current, ValaNamedElement.class);

            if (namedElements == null || namedElements.isEmpty()) {
                current = current.getParent();
                continue;
            }

            for (ValaNamedElement namedElement : namedElements) {

                if (!name.equals(namedElement.getName())) {
                    continue;
                }

                PsiElement scope = scopeOf(namedElement);

                if (scope == null) {
                    continue;
                }

                int rangeStart = isSequentiallyScoped(namedElement) ? namedElement.getTextOffset() : scope.getTextRange().getStartOffset();

                if (TextRange.create(rangeStart, scope.getTextRange().getEndOffset()).contains(usage.getTextOffset())) {
                    return namedElement;
                }
            }

            current = current.getParent();
        }

        return null;
    }

    private static PsiElement scopeOf(ValaNamedElement declaration) {
        if (declaration instanceof ValaForeachStatement || declaration instanceof ValaCatchClause) {
            return declaration;
        }

        return PsiTreeUtil.getParentOfType(
            declaration,
            ValaBlock.class,
            ValaForStatement.class,
            ValaLambdaExpression.class,
            ValaMethodDeclaration.class,
            ValaCreationMethodDeclaration.class,
            ValaSignalDeclaration.class,
            ValaClassDeclaration.class,
            ValaStructDeclaration.class,
            ValaInterfaceDeclaration.class,
            ValaNamespaceDeclaration.class,
            ValaMainBlockMember.class,
            ValaWithStatement.class,
            ValaDelegateDeclaration.class
        );
    }

    private static boolean isSequentiallyScoped(ValaNamedElement namedElement) {
        return PsiTreeUtil.instanceOf(
            namedElement,
            ValaLocalVariable.class,
            ValaConstantDeclaration.class,
            ValaParameter.class,
            ValaForeachStatement.class,
            ValaCatchClause.class,
            ValaLambdaExpressionParam.class
        );
    }
}
