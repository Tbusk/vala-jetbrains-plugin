package com.tbusk.vala_plugin;

import com.intellij.lexer.FlexAdapter;

// https://plugins.jetbrains.com/docs/intellij/lexer-and-parser-definition.html#define-a-lexer-adapter
public class ValaLexerAdapter extends FlexAdapter {

    public ValaLexerAdapter() {
        super(new ValaLexer(null));
    }
}
