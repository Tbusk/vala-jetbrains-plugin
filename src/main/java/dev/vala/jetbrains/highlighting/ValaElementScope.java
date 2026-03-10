package dev.vala.jetbrains.highlighting;

import com.intellij.openapi.util.TextRange;

public record ValaElementScope(
    String name,
    String type,
    TextRange range,
    String parentType,
    TextRange parentRange
) {
}
