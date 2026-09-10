package dev.vala.jetbrains.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import dev.vala.jetbrains.language.ValaFile;
import dev.vala.jetbrains.language.ValaFileType;
import dev.vala.jetbrains.parser.psi.ValaFieldDeclarationSection;
import dev.vala.jetbrains.parser.psi.ValaIdentifier;

public class ValaElementFactory {

    public static ValaIdentifier createIdentifier(Project project, String name) {
        ValaFile file = createFile(project, String.format("int %s = 1;", name));
        ValaFieldDeclarationSection field = PsiTreeUtil.findChildOfType(file, ValaFieldDeclarationSection.class);
        if (field == null) {
            throw new IncorrectOperationException("Could not create identifier: " + name);
        }
        return field.getIdentifier();
    }

    private static ValaFile createFile(Project project, String text) {
        String name = "dummy.vala";
        return (ValaFile) PsiFileFactory
            .getInstance(project)
            .createFileFromText(name, ValaFileType.INSTANCE, text);
    }
}
