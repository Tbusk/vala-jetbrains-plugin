package com.tbusk.vala_plugin.actions;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.InputValidator;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import com.tbusk.vala_plugin.language.ValaIcons;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ValaCreateFileAction extends CreateFileFromTemplateAction {

    private static final String VALA_FILE_TEMPLATE = "Vala_File";

    public ValaCreateFileAction() {
        super("Vala File", "Create a new Vala file", ValaIcons.FILE);
    }

    @Override
    protected void buildDialog(@NotNull Project project, @NotNull PsiDirectory psiDirectory, CreateFileFromTemplateDialog.@NotNull Builder builder) {
        builder.setTitle("New Vala File")
                .addKind("Vala file", ValaIcons.FILE, VALA_FILE_TEMPLATE)
                .setValidator(new InputValidator() {

                    @Override
                    public boolean checkInput(@NlsSafe String input) {
                        return !input.isEmpty();
                    }

                    @Override
                    public boolean canClose(@NlsSafe String input) {
                        return checkInput(input);
                    }
                })
        ;
    }

    @Override
    protected @NlsContexts.Command String getActionName(PsiDirectory psiDirectory, @NonNls @NotNull String newName, @NonNls String templateName) {
        return "Create Vala File " + newName;
    }

    @Override
    protected String getDefaultTemplateProperty() {
        return VALA_FILE_TEMPLATE;
    }

    @Override
    protected @NlsContexts.DialogTitle @NotNull String getErrorTitle() {
        return "Error Creating Vala File";
    }

    @Override
    protected PsiFile createFile(String name, String templateName, PsiDirectory dir) {

        if (!name.endsWith(".vala") && !name.endsWith(".vapi")) {
            name += ".vala";
        }

        return super.createFile(name, templateName, dir);
    }
}
