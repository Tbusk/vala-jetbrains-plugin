package dev.vala.vala_plugin;

import com.intellij.lexer.FlexAdapter;


public class ValaLexerAdapter extends FlexAdapter {

    public ValaLexerAdapter() {
        super(new ValaLexer(null));
    }
}
