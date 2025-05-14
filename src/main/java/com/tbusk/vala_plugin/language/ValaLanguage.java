package com.tbusk.vala_plugin.language;

import com.intellij.lang.Language;

public class ValaLanguage extends Language {

    public static final ValaLanguage INSTANCE = new ValaLanguage();

    private ValaLanguage() {
        super("Vala");
    }
}
