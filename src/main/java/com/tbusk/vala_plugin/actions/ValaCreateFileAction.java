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

/**
 * Action for creating new Vala files in the IDE.
 * <br/>
 * This class extends CreateFileFromTemplateAction to provide functionality for creating
 * new Vala files with a specific template and validation.
 * <br/><br/>
 * <a href="https://plugins.jetbrains.com/docs/intellij/using-file-templates.html#exposing-file-templates-from-the-other-category">view documentation</a>
 */
public class ValaCreateFileAction extends CreateFileFromTemplateAction {

    /**
     * Template name for Vala files without the .ft extension.
     * <br/>
     * This is used to identify the template for creating new Vala files.
     */
    private static final String VALA_FILE_TEMPLATE = "Vala_File";

    /**
     * File extensions for Vala files.
     * <br/>
     * This array contains the common file extensions used for Vala files.
     */
    private static final String[] FILE_EXTENSIONS = {".vala", ".vapi", ".vala.in"};

    /**
     * Constructor for the ValaCreateFileAction.
     * <br/>
     * Sets the action name, description, and icon for the action.
     */
    public ValaCreateFileAction() {
        super("Vala File", "Create a new Vala file", ValaIcons.FILE);
    }

    /**
     * Builds the dialog for creating a new Vala file.
     * <br/>
     * Sets the title, adds a kind for Vala files, and sets an input validator.
     *
     * @param project      The current project.
     * @param psiDirectory The directory where the file will be created.
     * @param builder      The builder for the dialog.
     */
    @Override
    protected void buildDialog(@NotNull Project project, @NotNull PsiDirectory psiDirectory, CreateFileFromTemplateDialog.@NotNull Builder builder) {
        builder.setTitle("New Vala File")
                .addKind("Vala file", ValaIcons.FILE, VALA_FILE_TEMPLATE)
                .setValidator(getInputValidator())
        ;
    }

    /**
     * Returns an InputValidator that validates the input for creating a new Vala file.
     * <br/>
     * The validator checks that the input is not empty.
     *
     * @return An InputValidator instance.
     */
    public InputValidator getInputValidator() {
        return new InputValidator() {
            @Override
            public boolean checkInput(@NlsSafe String input) {
                return !input.isEmpty();
            }

            @Override
            public boolean canClose(@NlsSafe String input) {
                return checkInput(input);
            }
        };
    }

    /**
     * Returns the action name for creating a new Vala file.
     *
     * @param psiDirectory The directory where the file will be created.
     * @param newName      The name of the new file.
     * @param templateName The template name used for creating the file.
     * @return The action name for creating a new Vala file.
     */
    @Override
    protected @NlsContexts.Command String getActionName(PsiDirectory psiDirectory, @NonNls @NotNull String newName, @NonNls String templateName) {
        return "Create Vala File " + newName;
    }

    /**
     * Returns the default template property for Vala files.
     *
     * @return The default template property name.
     */
    @Override
    protected String getDefaultTemplateProperty() {
        return VALA_FILE_TEMPLATE;
    }

    /**
     * Returns the title for the error dialog when file creation fails.
     *
     * @return The error title.
     */
    @Override
    protected @NlsContexts.DialogTitle @NotNull String getErrorTitle() {
        return "Error Creating Vala File";
    }


    /**
     * Creates a new file with the specified name and template in the given directory.
     * If the name does not end with an extension in FILE_EXTENSIONS, it appends .vala to the name.
     *
     * @param fileName     The name of the new file.
     * @param templateName The template to use for creating the file.
     * @param dir          The directory where the file will be created.
     * @return The created PsiFile.
     */
    @Override
    protected PsiFile createFile(String fileName, String templateName, PsiDirectory dir) {

        for (String extension : FILE_EXTENSIONS) {
            if (fileName.endsWith(extension)) {
                return super.createFile(fileName, templateName, dir);
            }
        }

        fileName += ".vala";

        return super.createFile(fileName, templateName, dir);
    }
}
