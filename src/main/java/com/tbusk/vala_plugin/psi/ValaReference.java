package com.tbusk.vala_plugin.psi;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ValaReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {

    private final String key;

    public ValaReference(@NotNull PsiElement element, TextRange textRange) {
        super(element, textRange);
        key = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
    }

    @Override
    public @Nullable PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }

    @Override
    public ResolveResult @NotNull [] multiResolve(boolean incompleteCode) {
        List<PsiElement> declarations = new ArrayList<>();
        final String referenceName = myElement.getText();

        // Start searching from the parent of the reference element
        PsiElement scope = myElement.getParent();

        while (scope != null) {
            // Find all named children in the current scope
            ValaNamedElement[] potentialDeclarations = PsiTreeUtil.getChildrenOfType(scope, ValaNamedElement.class);
            if (potentialDeclarations != null) {
                for (ValaNamedElement declaration : potentialDeclarations) {
                    // Check if the declaration's name matches our reference's name
                    if (referenceName.equals(declaration.getName())) {
                        declarations.add(declaration);
                    }
                }
            }
            // If we found any declarations in this scope, we are done.
            // This implements basic lexical scoping.
            if (!declarations.isEmpty()) {
                break;
            }
            // If not, move up to the parent scope and search again
            scope = scope.getParent();
        }

        // Convert the found PsiElements to ResolveResults
        List<ResolveResult> results = new ArrayList<>();
        for (PsiElement element : declarations) {
            results.add(new PsiElementResolveResult(element));
        }
        return results.toArray(new ResolveResult[0]);
    }
}
