package com.tbusk.vala_plugin.linter.highlighting;

import java.util.List;

public record ValaLintResult(
        List<ValaLintMistake> mistakes
) {
}
