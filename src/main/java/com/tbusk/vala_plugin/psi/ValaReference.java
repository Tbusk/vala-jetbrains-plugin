package com.tbusk.vala_plugin.psi;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.util.PsiTreeUtil;
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

        String refName = getCanonicalText();  // Full qualified if compound
        List<ResolveResult> results = new ArrayList<>();

        List<PsiNamedElement> declarations = ValaUtil.findDeclarationsInScope(myElement, refName);
        for (PsiNamedElement element : declarations) {
            results.add(new PsiElementResolveResult(element));
        }

        return results.toArray(new ResolveResult[0]);
    }

    @Override
    public Object @NotNull [] getVariants() {
        List<LookupElement> variants = new ArrayList<>();

        List<PsiNamedElement> declarations = ValaUtil.findDeclarationsInScope(myElement, null);

        for (PsiNamedElement declaration : declarations) {
            String declName = declaration.getName();
            if (declName != null && !declName.isEmpty()) {
                variants.add(
                        LookupElementBuilder.create(declaration, declName)
                                .withIcon(ValaIcons.FILE)
                                .withTypeText(declaration.getClass().getSimpleName())
                );
            }
        }

        return variants.toArray();
    }

    @Override
    public @NotNull String getCanonicalText() {
        PsiElement parent = myElement.getParent();
        if (parent instanceof ValaSymbolPart || parent instanceof ValaMemberPart) {
            PsiElement symbolOrMember = parent.getParent();
            if (symbolOrMember instanceof ValaSymbol || symbolOrMember instanceof ValaMember) {
                StringBuilder fullName = new StringBuilder();
                PsiElement child = symbolOrMember.getFirstChild();
                while (child != null) {
                    if (child instanceof ValaSymbolPart || child instanceof ValaMemberPart) {
                        ValaIdentifier id = PsiTreeUtil.getChildOfType(child, ValaIdentifier.class);
                        if (id != null) {
                            String partName = id.getName();
                            if (partName != null) {
                                if (!fullName.isEmpty()) {
                                    fullName.append(".");
                                }
                                fullName.append(partName);
                            }
                        }
                    } else if (child.getNode().getElementType() == ValaTypes.GLOBAL) {
                        fullName.insert(0, "global::");
                    }
                    child = child.getNextSibling();
                }
                if (!fullName.isEmpty()) {
                    return fullName.toString();
                }
            }
        }

        return super.getCanonicalText();
    }
}
