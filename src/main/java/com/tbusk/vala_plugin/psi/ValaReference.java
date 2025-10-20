package com.tbusk.vala_plugin.psi;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.util.PsiTreeUtil;
import com.tbusk.vala_plugin.language.ValaFile;
import com.tbusk.vala_plugin.language.ValaIcons;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ValaReference extends PsiPolyVariantReferenceBase<PsiElement> {
    private final String name;

    public ValaReference(@NotNull PsiElement element, TextRange range) {
        super(element, range);
        name = element.getText();
    }

    @Override
    public ResolveResult @NotNull [] multiResolve(boolean incompleteCode) {

        ValaFile containingFile = PsiTreeUtil.getParentOfType(myElement, ValaFile.class);
        List<ResolveResult> results = new ArrayList<>();

        if (containingFile != null) {
            List<PsiNamedElement> declarations = ValaUtil.findDeclarationsInFile(containingFile, name);
            for (PsiNamedElement element : declarations) {
                results.add(new PsiElementResolveResult(element));
            }
        }

        return results.toArray(new ResolveResult[0]);
    }

    @Override
    public Object @NotNull [] getVariants() {
        ValaFile containingFile = PsiTreeUtil.getParentOfType(myElement, ValaFile.class);
        List<LookupElement> variants = new ArrayList<>();

        if (containingFile != null) {
            List<PsiNamedElement> declarations = ValaUtil.findDeclarationsInFile(containingFile, name);

            for (PsiNamedElement declaration : declarations) {
                String declName = declaration.getName();
                if (declName != null && !declName.isEmpty()) {
                    variants.add(
                            LookupElementBuilder.create(declaration, declName)
                                    .withIcon(ValaIcons.FILE)
                                    .withTypeText(
                                            declaration.getClass().getSimpleName()
                                    )
                    );
                }
            }
        }

        return variants.toArray();
    }
}
