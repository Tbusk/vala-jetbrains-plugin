package com.tbusk.vala_plugin.editing;

import com.intellij.codeInsight.editorActions.TypedHandlerDelegate;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CharacterAutoCloser extends TypedHandlerDelegate {

    private final Set<Character> closableCharacters = new HashSet<>(
            List.of('\'', '`', '"')

    );

    @Override
    public @NotNull Result charTyped(char character, @NotNull Project project, @NotNull Editor editor, @NotNull PsiFile psiFile) {

        if (closableCharacters.contains(character)) {
            autoCloseCharacter(editor, character);
        }

        return super.charTyped(character, project, editor, psiFile);
    }

    private void autoCloseCharacter(Editor editor, char character) {
        int newPosition = editor.getCaretModel().getOffset();

        addCharacterAtPosition(editor, newPosition, character);

        moveCaretToPosition(editor, newPosition);
    }

    private void addCharacterAtPosition(Editor editor, int position, char character) {
        Document document = editor.getDocument();

        document.insertString(position, String.valueOf(character));
    }

    private void moveCaretToPosition(Editor editor, int position) {
        editor.getCaretModel().moveToOffset(position);
    }
}
