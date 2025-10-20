package com.tbusk.vala_plugin.psi;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class ValaReferenceContributor extends PsiReferenceContributor {
    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar psiReferenceRegistrar) {
        psiReferenceRegistrar.registerReferenceProvider(PlatformPatterns.or(
                PlatformPatterns.psiElement(ValaMemberPart.class),
                PlatformPatterns.psiElement(ValaSymbolPart.class),
                PlatformPatterns.psiElement(ValaIdentifier.class),
                PlatformPatterns.psiElement(ValaSimpleName.class)
        ), new PsiReferenceProvider() {
            @NotNull
            @Override
            public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
                return new PsiReference[]{new ValaReference(element, TextRange.from(0, element.getTextLength()))};
            }
        });
    }
}
