package com.tbusk.vala_plugin.language;

import com.intellij.lang.Language;

// https://plugins.jetbrains.com/docs/intellij/language-and-filetype.html#define-the-language
public class ValaLanguage extends Language {

    public static final ValaLanguage INSTANCE = new ValaLanguage();

    private ValaLanguage() {
        super("Vala");
    }
}
