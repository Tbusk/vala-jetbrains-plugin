package com.tbusk.vala_plugin.highlighting;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Factory class for creating instances of the Vala syntax highlighter.
 * This class is used by the IntelliJ platform to provide syntax highlighting for Vala files.
 * <br/><br/>
 * <a href="https://plugins.jetbrains.com/docs/intellij/syntax-highlighter-and-color-settings-page.html#define-a-syntax-highlighter-factory">view documentation</a>
 */
public class ValaSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

    /*
     * This factory creates instances of the Vala syntax highlighter.
     * It is used by the IntelliJ platform to provide syntax highlighting for Vala files.
     */
    @Override
    public @NotNull SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
        return new ValaSyntaxHighlighter();
    }
}
