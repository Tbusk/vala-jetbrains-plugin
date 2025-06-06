package com.tbusk.vala_plugin.editing;

import com.intellij.codeInsight.editorActions.TypedHandlerDelegate;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * CharacterAutoCloser is a handler that automatically closes characters
 * such as single quotes, backticks, and double quotes when they are typed.
 * It inserts the closing character at the current caret position and moves
 * the caret to the position inside the literal.
 * If the character is already present at the caret position, it escapes the next character instead.
 */
public class CharacterAutoCloser extends TypedHandlerDelegate {

    /**
     * Characters that should be automatically closed when typed.
     * This includes single quotes, backticks, and double quotes.
     */
    private final List<Character> closableCharacters = List.of('\'', '`', '"');

    /**
     * Handles character typing events to automatically close characters.
     *
     * @param character the character that was typed
     * @param project   the current project
     * @param editor    the editor where the character was typed
     * @param psiFile   the file being edited
     * @return a result indicating whether the event was handled
     */
    @Override
    public @NotNull Result charTyped(char character, @NotNull Project project, @NotNull Editor editor, @NotNull PsiFile psiFile) {

        if (closableCharacters.contains(character)) {
            autoCloseCharacter(editor, character);
        }

        return super.charTyped(character, project, editor, psiFile);
    }

    /**
     * Automatically closes the character by inserting it at the current caret position
     * and moving the caret to the position inside the literal.
     * If the character is already present at the caret position,
     * it escapes the next character instead.
     *
     * @param editor    the editor where the character was typed
     * @param character the character to be closed
     */
    private void autoCloseCharacter(Editor editor, char character) {
        Document document = editor.getDocument();
        int offset = editor.getCaretModel().getOffset();

        if (document.getCharsSequence().charAt(offset) != character) {
            closeCharacter(document, editor, offset, character);
        } else {
            escapeLiteral(document, editor, offset);
        }
    }

    /**
     * Closes the character by inserting it at the current caret position
     * and moving the caret to the position inside the literal.
     *
     * @param document  the document being edited
     * @param editor    the editor where the character was typed
     * @param position  the position of the caret in the document
     * @param character the character to be closed
     */
    private void closeCharacter(Document document, Editor editor, int position, char character) {
        document.insertString(position, String.valueOf(character));

        moveCaretToPosition(editor, position);
    }

    /**
     * Escapes the next character in the document by removing it.
     * This is used when the character typed is already present at the caret position.
     *
     * @param document the document being edited
     * @param editor   the editor where the character was typed
     * @param position the position of the caret in the document
     */
    private void escapeLiteral(Document document, Editor editor, int position) {
        String textWithoutExtraCharacter = getTextWithoutNextCharacter(document, position);

        moveCaretToPosition(editor, position);

        document.setText(textWithoutExtraCharacter);
    }

    /**
     * Returns the text of the document without the next character at the specified position.
     *
     * @param document the document from which to get the text
     * @param position the position of the character to be removed
     * @return a string containing the text without the next character
     */
    private String getTextWithoutNextCharacter(Document document, int position) {
        CharSequence characters = document.getCharsSequence();

        String textBeforeNextCharacter = characters.subSequence(0, position).toString();
        String textAfterNextCharacter = characters.subSequence(position + 1, characters.length()).toString();

        return textBeforeNextCharacter + textAfterNextCharacter;
    }

    /**
     * Moves the caret to the specified position in the editor.
     *
     * @param editor   the editor where the caret should be moved
     * @param position the position to move the caret to
     */
    private void moveCaretToPosition(Editor editor, int position) {
        editor.getCaretModel().moveToOffset(position);
    }
}
