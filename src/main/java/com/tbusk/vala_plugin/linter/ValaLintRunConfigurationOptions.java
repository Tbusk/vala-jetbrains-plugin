package com.tbusk.vala_plugin.linter;

import com.intellij.execution.configurations.RunConfigurationOptions;
import com.intellij.openapi.components.StoredProperty;

public class ValaLintRunConfigurationOptions extends RunConfigurationOptions {

    // Constants for default values
    private static final String DEFAULT_LINTING_MODE = "CHANGES_ONLY";
    private static final String DEFAULT_GLOB_PATTERN = "**/*.vala";
    private static final boolean DEFAULT_AUTO_FIX = false;
    private static final String DEFAULT_VCS_MODE = "GIT";
    private static final boolean DEFAULT_DETECT_AND_USE_CONFIG_FILE = true;

    // Constants for delegate names
    private static final String LINTING_MODE_PROPERTY = "lintingMode";
    private static final String CUSTOM_GLOB_PATTERN_PROPERTY = "customGlobPattern";
    private static final String CONFIG_FILE_PATH_PROPERTY = "configFilePath";
    private static final String AUTO_FIX_PROPERTY = "autoFix";
    private static final String VCS_CHANGE_DETECTION_MODE_PROPERTY = "vcsChangeDetectionMode";
    private static final String DETECT_AND_USE_CONFIG_FILE_PROPERTY = "detectAndUseConfigFile";

    private final StoredProperty<String> lintingMode = string(DEFAULT_LINTING_MODE).provideDelegate(this, LINTING_MODE_PROPERTY);
    private final StoredProperty<String> customGlobPattern = string(DEFAULT_GLOB_PATTERN).provideDelegate(this, CUSTOM_GLOB_PATTERN_PROPERTY);
    private final StoredProperty<String> configFilePath = string("").provideDelegate(this, CONFIG_FILE_PATH_PROPERTY);
    private final StoredProperty<Boolean> autoFix = property(DEFAULT_AUTO_FIX).provideDelegate(this, AUTO_FIX_PROPERTY);
    private final StoredProperty<String> vcsChangeDetectionMode = string(DEFAULT_VCS_MODE).provideDelegate(this, VCS_CHANGE_DETECTION_MODE_PROPERTY);
    private final StoredProperty<Boolean> detectAndUseConfigFile = property(DEFAULT_DETECT_AND_USE_CONFIG_FILE).provideDelegate(this, DETECT_AND_USE_CONFIG_FILE_PROPERTY);

    public String getLintingMode() {
        return lintingMode.getValue(this);
    }

    public void setLintingMode(String mode) {
        this.lintingMode.setValue(this, mode);
    }

    public String getCustomGlobPattern() {
        return customGlobPattern.getValue(this);
    }

    public void setCustomGlobPattern(String pattern) {
        this.customGlobPattern.setValue(this, pattern);
    }

    public String getConfigFilePath() {
        return configFilePath.getValue(this);
    }

    public void setConfigFilePath(String path) {
        this.configFilePath.setValue(this, path);
    }

    public boolean isAutoFix() {
        return autoFix.getValue(this);
    }

    public void setAutoFix(boolean fix) {
        this.autoFix.setValue(this, fix);
    }

    public String getVcsChangeDetectionMode() {
        return vcsChangeDetectionMode.getValue(this);
    }

    public void setVcsChangeDetectionMode(String mode) {
        this.vcsChangeDetectionMode.setValue(this, mode);
    }

    public boolean isDetectAndUseConfigFile() {
        return detectAndUseConfigFile.getValue(this);
    }

    public void setDetectAndUseConfigFile(boolean detectAndUseConfigFile) {
        this.detectAndUseConfigFile.setValue(this, detectAndUseConfigFile);
    }
}
