package com.tbusk.vala_plugin.spell_checker;

import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.spellchecker.tokenizer.SpellcheckingStrategy;
import com.intellij.spellchecker.tokenizer.Tokenizer;
import com.tbusk.vala_plugin.psi.ValaTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class ValaSpellCheckingStrategy extends SpellcheckingStrategy {

    private final Map<IElementType, Tokenizer<?>> tokenizers = new HashMap<>(
            Map.of(
                    ValaTypes.IDENTIFIER, new ValaIdentifierTokenizer()
            )
    );

    @NotNull
    @Override
    public Tokenizer<?> getTokenizer(@NotNull PsiElement element) {

        IElementType elementType = element.getNode().getElementType();

        return tokenizers.getOrDefault(elementType, EMPTY_TOKENIZER);
    }
}
