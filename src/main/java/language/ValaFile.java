package language;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class ValaFile extends PsiFileBase {

    public ValaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ValaLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return ValaFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Vala File";
    }
}
