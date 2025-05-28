package com.tbusk.vala_plugin.settings;

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.ui.TitledSeparator;
import com.intellij.ui.components.JBLabel;
import com.intellij.util.ui.FormBuilder;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * PluginSettingsComponent is a class that provides the UI component for the plugin settings.
 * <br/>
 * It contains a text field for the language server path and a label.
 * <br/>
 * The component can be used to get and set the language server path.
 */
public class PluginSettingsComponent {

    private final JPanel mainPanel;
    private final TextFieldWithBrowseButton languageServerPathTextField;
    JBLabel languageServerPathLabel = new JBLabel("Language Server Path:");


    /**
     * Constructor for PluginSettingsComponent.
     * <br/>
     * Initializes the text field for the language server path and sets up the main panel.
     */
    public PluginSettingsComponent() {
        languageServerPathTextField = setupLanguageServerPathTextField();
        mainPanel = setupMainPanel();
    }

    /**
     * Sets up the main panel for the settings component.
     * <br/>
     * The panel contains a titled separator and a labeled component for the language server path.
     *
     * @return a JPanel containing the settings UI components
     */
    public JPanel setupMainPanel() {
        return FormBuilder.createFormBuilder()
                .addComponent(new TitledSeparator("LSP Settings"), 1)
                .addLabeledComponent(languageServerPathLabel, languageServerPathTextField, 1, false)
                .addComponentFillVertically(new JPanel(), 0)
                .getPanel();
    }

    /**
     * Sets up the text field for the language server path with a browse button.
     * <br/>
     * The text field is initialized with the current language server path from the plugin settings.
     * <br/>
     * A file chooser is added to allow users to select the language server executable.
     *
     * @return a TextFieldWithBrowseButton for selecting the language server path
     */
    public TextFieldWithBrowseButton setupLanguageServerPathTextField() {
        TextFieldWithBrowseButton textField = new TextFieldWithBrowseButton();

        textField.setText(PluginSettings.getInstance().getState().lspServerPath);

        textField.addBrowseFolderListener(
                ProjectManager.getInstance().getDefaultProject(),
                FileChooserDescriptorFactory.singleFile().withFileFilter(
                        file -> file.exists() &&
                                file.getNameWithoutExtension().equals("vala-language-server")
                )
        );

        return textField;
    }

    /**
     * Gets the main panel of the settings component.
     *
     * @return the main panel
     */
    public JPanel getMainPanel() {
        return mainPanel;
    }

    /**
     * Gets the preferred focused component for the settings dialog.
     *
     * @return the text field for the language server path
     */
    public JComponent getPreferredFocusedComponent() {
        return languageServerPathTextField;
    }

    /**
     * Gets the language server path from the text field.
     *
     * @return the language server path
     */
    @NotNull
    public String getLanguageServerPath() {

        return languageServerPathTextField.getText();
    }

    /**
     * Sets the language server path in the text field.
     *
     * @param path the path to set
     */
    public void setLanguageServerPath(@NotNull String path) {
        languageServerPathTextField.setText(path);
    }
}
