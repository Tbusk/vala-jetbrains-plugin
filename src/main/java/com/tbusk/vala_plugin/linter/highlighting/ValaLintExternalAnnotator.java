package com.tbusk.vala_plugin.linter.highlighting;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.ExternalAnnotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiDocumentManager;
import com.intellij.psi.PsiFile;
import com.tbusk.vala_plugin.linter.ValaLintCommands;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ValaLintExternalAnnotator extends ExternalAnnotator<ValaLintAnnotationInfo, ValaLintResult> {

    @Override
    public @Nullable ValaLintAnnotationInfo collectInformation(@NotNull PsiFile file, @NotNull Editor editor, boolean hasErrors) {
        if (!file.getName().endsWith(".vala") && !file.getName().endsWith(".vapi")) {
            return null;
        }

        String filePath = file.getVirtualFile().getPath();
        Document document = PsiDocumentManager.getInstance(file.getProject()).getDocument(file);

        if (document == null) {
            return null;
        }

        return new ValaLintAnnotationInfo(file, document, filePath);
    }

    @Override
    public @Nullable ValaLintResult doAnnotate(ValaLintAnnotationInfo info) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(
                    ValaLintCommands.DEFAULT_COMMAND,
                    ValaLintCommands.JSON_FLAG,
                    info.filePath()
            );

            String projectBasePath = info.file().getProject().getBasePath();
            if (projectBasePath != null) {
                processBuilder.directory(new java.io.File(projectBasePath));
            }

            Process process = processBuilder.start();
            String contents = new String(process.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
            process.waitFor();

            if (contents.isEmpty()) {
                return new ValaLintResult(new ArrayList<>());
            }

            return new Gson().fromJson(contents, ValaLintResult.class);

        } catch (IOException | JsonSyntaxException e) {
            return null;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override
    public void apply(@NotNull PsiFile file, ValaLintResult result, @NotNull AnnotationHolder holder) {
        if (result == null || result.mistakes() == null) {
            return;
        }

        Document document = PsiDocumentManager.getInstance(file.getProject()).getDocument(file);
        if (document == null) {
            return;
        }

        for (ValaLintMistake mistake : result.mistakes()) {

            int lineCount = document.getLineCount();
            int lineNumberStart = getLineNumberStart(mistake, lineCount);
            int lineNumberEnd = getLineNumberEnd(mistake, lineCount);

            int lineStartOffset = document.getLineStartOffset(lineNumberStart);
            int lineEndOffset = document.getLineEndOffset(lineNumberEnd);

            int columnNumberStart = mistake.column() - 1;

            int startOffset = lineStartOffset + columnNumberStart;
            int endOffset = startOffset;

            if (startOffset >= lineEndOffset) {
                startOffset = lineStartOffset;
                endOffset = lineEndOffset;
            } else {
                String lineText = document.getText(new TextRange(lineStartOffset, lineEndOffset));
                int relativeColumn = startOffset - lineStartOffset;

                if (relativeColumn < lineText.length()) {
                    endOffset = startOffset + 1;

                    while (endOffset < lineEndOffset && !Character.isWhitespace(lineText.charAt(endOffset - lineStartOffset))) {
                        endOffset++;
                    }
                } else {
                    endOffset = lineEndOffset;
                }
            }

            TextRange range = new TextRange(startOffset, endOffset);

            HighlightSeverity severity = ValaLintHighlighting.HIGHLIGHT_SEVERITY_MAP.getOrDefault(
                    mistake.level().toLowerCase(),
                    HighlightSeverity.WEAK_WARNING
            );

            String message = String.format("%s", mistake.message());
            holder.newAnnotation(severity, message)
                    .range(range)
                    .create();
        }
    }

    private int getLineNumberStart(ValaLintMistake mistake, int lineCount) {
        int lineNumberStart = mistake.line() - 1;

        if (lineNumberStart < 0) {
            lineNumberStart = 0;
        }

        if (lineNumberStart > lineCount) {
            lineNumberStart = lineCount - 1;
        }

        return lineNumberStart;
    }

    private int getLineNumberEnd(ValaLintMistake mistake, int lineCount) {
        Integer lineNumberEnd = mistake.endLine();

        if (lineNumberEnd == null) {
            lineNumberEnd = mistake.line() - 1;
        }

        if (lineNumberEnd > lineCount) {
            lineNumberEnd = lineCount - 1;
        }

        return lineNumberEnd;
    }
}
