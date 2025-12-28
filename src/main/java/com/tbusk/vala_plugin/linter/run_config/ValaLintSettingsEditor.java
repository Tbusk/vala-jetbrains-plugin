package com.tbusk.vala_plugin.linter.run_config;

import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.ui.TitledSeparator;
import com.intellij.util.ui.FormBuilder;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.ItemEvent;

public class ValaLintSettingsEditor extends SettingsEditor<ValaLintRunConfiguration> {

    private final JPanel settingsPanel;

    private final JRadioButton lintEverythingRadioBtn;
    private final JRadioButton changesOnlyRadioBtn;
    private final JRadioButton specificFilesRadioBtn;

    private final JLabel globPatternLabel;
    private final JTextField globPatternField;

    private final TextFieldWithBrowseButton configFileField;
    private final JCheckBox autoFixCheckbox;
    private final JCheckBox autoConfigAddCheckbox;

    public ValaLintSettingsEditor() {

        lintEverythingRadioBtn = new JRadioButton("Lint Everything");
        changesOnlyRadioBtn = new JRadioButton("Changes Only");
        specificFilesRadioBtn = new JRadioButton("Specific Files");

        ButtonGroup lintingModeBtnGroup = new ButtonGroup();
        lintingModeBtnGroup.add(lintEverythingRadioBtn);
        lintingModeBtnGroup.add(changesOnlyRadioBtn);
        lintingModeBtnGroup.add(specificFilesRadioBtn);

        lintEverythingRadioBtn.setSelected(true);

        globPatternLabel = new JLabel("Glob Pattern:");
        globPatternField = new JTextField();
        globPatternField.setEnabled(false);

        specificFilesRadioBtn.addItemListener(e -> {
            boolean enabled = e.getStateChange() == ItemEvent.SELECTED;
            globPatternLabel.setEnabled(enabled);
            globPatternField.setEnabled(enabled);
        });

        configFileField = new TextFieldWithBrowseButton();
        FileChooserDescriptor confFileDescriptor = FileChooserDescriptorFactory.createSingleFileDescriptor("conf")
                .withTitle("Select Vala-Lint Config File");
        configFileField.addBrowseFolderListener(null, confFileDescriptor);

        autoFixCheckbox = new JCheckBox("Auto-fix where possible");
        autoConfigAddCheckbox = new JCheckBox("Detect and use available lint config");

        settingsPanel = FormBuilder.createFormBuilder()
                .addComponent(new TitledSeparator("Linting Mode"))
                .addComponent(lintEverythingRadioBtn)
                .addComponent(changesOnlyRadioBtn)
                .addComponent(specificFilesRadioBtn)
                .addLabeledComponent(globPatternLabel, globPatternField)
                .addComponent(new TitledSeparator("Configuration"))
                .addLabeledComponent("Config file:", configFileField)
                .addComponent(autoConfigAddCheckbox)
                .addComponent(autoFixCheckbox)
                .getPanel();
    }

    @Override
    protected void resetEditorFrom(@NotNull ValaLintRunConfiguration configuration) {
        ValaLintRunConfigurationOptions options = configuration.getOptions();

        String lintingMode = options.getLintingMode();

        if (lintingMode.equals("CHANGES_ONLY")) {
            changesOnlyRadioBtn.setSelected(true);
        } else if (lintingMode.equals("SPECIFIC_FILES")) {
            specificFilesRadioBtn.setSelected(true);
        } else {
            lintEverythingRadioBtn.setSelected(true);
        }

        globPatternField.setText(options.getCustomGlobPattern());
        configFileField.setText(options.getConfigFilePath());
        autoFixCheckbox.setSelected(options.isAutoFix());
        autoConfigAddCheckbox.setSelected(options.isDetectAndUseConfigFile());
    }

    @Override
    protected void applyEditorTo(@NotNull ValaLintRunConfiguration configuration) throws ConfigurationException {

        if (specificFilesRadioBtn.isSelected() && globPatternField.getText().trim().isEmpty()) {
            throw new ConfigurationException("Glob pattern cannot be empty when 'Specific Files' mode is selected");
        }

        ValaLintRunConfigurationOptions options = configuration.getOptions();

        if (changesOnlyRadioBtn.isSelected()) {
            options.setLintingMode("CHANGES_ONLY");
        } else if (specificFilesRadioBtn.isSelected()) {
            options.setLintingMode("SPECIFIC_FILES");
        } else {
            options.setLintingMode("LINT_EVERYTHING");
        }

        options.setCustomGlobPattern(globPatternField.getText());
        options.setConfigFilePath(configFileField.getText());
        options.setAutoFix(autoFixCheckbox.isSelected());
        options.setDetectAndUseConfigFile(autoConfigAddCheckbox.isSelected());
    }

    @Override
    protected @NotNull JComponent createEditor() {
        return settingsPanel;
    }
}
