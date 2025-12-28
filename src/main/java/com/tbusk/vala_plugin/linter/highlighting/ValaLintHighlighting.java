package com.tbusk.vala_plugin.linter.highlighting;

import com.intellij.lang.annotation.HighlightSeverity;

import java.util.Map;

public final class ValaLintHighlighting {

    public static final Map<String, HighlightSeverity> HIGHLIGHT_SEVERITY_MAP = Map.of(
            "error", HighlightSeverity.ERROR,
            "warn", HighlightSeverity.WARNING
    );

}
