package com.tbusk.vala_plugin.psi;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.tbusk.vala_plugin.language.ValaIcons;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ValaReference extends PsiPolyVariantReferenceBase<PsiElement> {
    private final String name;

    public ValaReference(@NotNull PsiElement element, TextRange range) {
        super(element, range);
        name = element.getText().substring(range.getStartOffset(), range.getEndOffset());
    }

    @Override
    public ResolveResult @NotNull [] multiResolve(boolean incompleteCode) {

        Project project = myElement.getProject();
        List<ResolveResult> results = new ArrayList<>();

        List<PsiNamedElement> declarations = ValaUtil.findDeclarations(project, name);
        for (PsiNamedElement element : declarations) {
            results.add(new PsiElementResolveResult(element));
        }

        return results.toArray(new ResolveResult[0]);
    }

    @Override
    public Object @NotNull [] getVariants() {
        Project project = myElement.getProject();
        List<ValaIdentifier> identifiers = ValaUtil.findIdentifiers(project);
        List<LookupElement> variants = new ArrayList<>();

        for (ValaIdentifier identifier : identifiers) {
            if (identifier.getName() != null && !identifier.getName().isEmpty()) {
                variants.add(
                        LookupElementBuilder.create(identifier)
                                .withIcon(ValaIcons.FILE)
                                .withTypeText(
                                        identifier.getContainingFile().getName()
                                )
                );
            }
        }
        return variants.toArray();
    }
}
