package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.psi.impl.ValaTypeImpl;
import dev.vala.jetbrains.psi.impl.ValaTypeWeakImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaTypeHighlighter implements ValaHighlighter {

    private static volatile ValaTypeHighlighter instance;

    private ValaTypeHighlighter() {
    }

    public static synchronized ValaTypeHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaTypeHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaTypeImpl ||
                psiElement instanceof ValaTypeWeakImpl) {
            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightSymbol(psiElement, annotationHolder, DefaultLanguageHighlighterColors.CLASS_NAME);
        }
    }
}
