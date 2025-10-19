package com.tbusk.vala_plugin.psi;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class ValaReferenceContributor extends PsiReferenceContributor {
    public ValaReferenceContributor() {
        System.err.println("ValaReferenceContributor instantiated");
    }

    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar psiReferenceRegistrar) {
        psiReferenceRegistrar.registerReferenceProvider(PlatformPatterns.or(
                PlatformPatterns.psiElement(ValaIdentifier.class),
                PlatformPatterns.psiElement(ValaSymbolPart.class),
                PlatformPatterns.psiElement(ValaMemberPart.class)
        ), new PsiReferenceProvider() {
            @NotNull
            @Override
            public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
                ValaIdentifier identifier = null;
                if (element instanceof ValaIdentifier) {
                    identifier = (ValaIdentifier) element;
                } else if (element instanceof ValaSymbolPart || element instanceof ValaMemberPart) {
                    identifier = PsiTreeUtil.getChildOfType(element, ValaIdentifier.class);
                }
                if (identifier != null) {
                    return new PsiReference[]{new ValaReference(identifier, TextRange.from(0, identifier.getTextLength()))};
                }
                return PsiReference.EMPTY_ARRAY;
            }
        });
    }
}
