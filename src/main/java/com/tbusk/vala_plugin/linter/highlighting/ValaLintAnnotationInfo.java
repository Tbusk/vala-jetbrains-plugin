package com.tbusk.vala_plugin.linter.highlighting;

import com.intellij.openapi.editor.Document;
import com.intellij.psi.PsiFile;

public record ValaLintAnnotationInfo (
        PsiFile file,
        Document document,
        String filePath
) {
}
