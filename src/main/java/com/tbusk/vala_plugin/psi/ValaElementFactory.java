package com.tbusk.vala_plugin.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.util.PsiTreeUtil;
import com.tbusk.vala_plugin.language.ValaFile;
import com.tbusk.vala_plugin.language.ValaFileType;

public class ValaElementFactory {

    public static ValaIdentifier createIdentifier(Project project, String name) {
        final ValaFile file = createFile(project, "string " + name + ";");
        return PsiTreeUtil.findChildOfType(file, ValaIdentifier.class);
    }

    private static ValaFile createFile(Project project, String text) {
        String name = "dummy.vala";
        return (ValaFile) PsiFileFactory.getInstance(project).createFileFromText(name, ValaFileType.INSTANCE, text);
    }
}
