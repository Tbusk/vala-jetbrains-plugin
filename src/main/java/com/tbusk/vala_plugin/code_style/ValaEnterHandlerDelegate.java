package com.tbusk.vala_plugin.code_style;

import com.intellij.codeInsight.editorActions.enter.EnterHandlerDelegate;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.actionSystem.EditorActionHandler;
import com.intellij.openapi.util.Ref;
import com.intellij.psi.PsiFile;
import com.tbusk.vala_plugin.language.ValaLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ValaEnterHandlerDelegate implements EnterHandlerDelegate {

    @Override
    public boolean invokeInsideIndent(int newLineCharOffset, @NotNull Editor editor, @NotNull DataContext dataContext) {
        return EnterHandlerDelegate.super.invokeInsideIndent(newLineCharOffset, editor, dataContext);
    }

    @Override
    public Result preprocessEnter(@NotNull PsiFile psiFile, @NotNull Editor editor, @NotNull Ref<Integer> ref, @NotNull Ref<Integer> ref1, @NotNull DataContext dataContext, @Nullable EditorActionHandler editorActionHandler) {
        if (!psiFile.getLanguage().isKindOf(ValaLanguage.INSTANCE)) return Result.Continue;

        return null; //TODO: Implement logic
    }

    @Override
    public Result postProcessEnter(@NotNull PsiFile psiFile, @NotNull Editor editor, @NotNull DataContext dataContext) {
        return null; //TODO: Implement logic
    }
}
