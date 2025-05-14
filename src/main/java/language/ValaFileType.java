package language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class ValaFileType extends LanguageFileType {

    public static final ValaFileType INSTANCE = new ValaFileType();

    private ValaFileType() {
        super(ValaLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "Vala File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "Vala language file";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "vala";
    }

    @Override
    public Icon getIcon() {
        return ValaIcons.FILE;
    }
}
