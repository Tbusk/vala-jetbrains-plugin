package com.tbusk.vala_plugin.linter.highlighting;

public record ValaLintMistake(
        String filename,
        int line,
        // nullable
        Integer endLine,
        int column,
        // nullable
        Integer endColumn,
        String level,
        String message,
        String ruleId
) {
}
