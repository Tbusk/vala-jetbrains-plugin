package com.tbusk.vala_plugin.project;

import org.jetbrains.annotations.NotNull;

public final class ProjectNameValidator {

    private static final String VALID_NAME_REGEX = "^[a-zA-Z0-9/~]+([_\\-/.]*[a-zA-Z0-9])+$";
    private static ProjectNameValidator instance;

    private ProjectNameValidator() {
    }

    public static ProjectNameValidator getInstance() {
        if (instance == null) {
            instance = new ProjectNameValidator();
        }

        return instance;
    }

    public boolean isValid(@NotNull String name) {
        return name.matches(VALID_NAME_REGEX);
    }
}
