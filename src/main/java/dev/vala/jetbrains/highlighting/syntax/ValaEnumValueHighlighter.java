package dev.vala.jetbrains.highlighting.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.highlighting.ValaHighlighter;
import dev.vala.jetbrains.highlighting.ValaHighlighterUtil;
import dev.vala.jetbrains.highlighting.ValaTextAttributeKey;
import dev.vala.jetbrains.psi.impl.ValaEnumvalueImpl;
import org.jetbrains.annotations.NotNull;

public final class ValaEnumValueHighlighter implements ValaHighlighter {

    private static volatile ValaEnumValueHighlighter instance;

    private ValaEnumValueHighlighter() {
    }

    public static synchronized ValaEnumValueHighlighter getInstance() {
        if (instance == null) {
            instance = new ValaEnumValueHighlighter();
        }

        return instance;
    }

    public void highlight(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (psiElement instanceof ValaEnumvalueImpl) {

            ValaHighlighterUtil util = ValaHighlighterUtil.getInstance();

            util.highlightIdentifier(psiElement, annotationHolder, ValaTextAttributeKey.CONSTANT);
        }
    }
}
