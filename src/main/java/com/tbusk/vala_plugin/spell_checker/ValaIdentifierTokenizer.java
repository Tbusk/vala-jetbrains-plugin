package com.tbusk.vala_plugin.spell_checker;

import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.spellchecker.inspections.IdentifierSplitter;
import com.intellij.spellchecker.tokenizer.TokenConsumer;
import com.intellij.spellchecker.tokenizer.Tokenizer;
import org.jetbrains.annotations.NotNull;

public class ValaIdentifierTokenizer extends Tokenizer<LeafPsiElement> {

    @Override
    public void tokenize(@NotNull LeafPsiElement element, @NotNull TokenConsumer consumer) {
        consumer.consumeToken(element, IdentifierSplitter.getInstance());
    }
}
