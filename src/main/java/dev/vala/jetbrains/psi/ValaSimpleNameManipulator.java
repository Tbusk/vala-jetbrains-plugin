package dev.vala.jetbrains.psi;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.AbstractElementManipulator;
import com.intellij.util.IncorrectOperationException;
import dev.vala.jetbrains.parser.psi.ValaIdentifier;
import dev.vala.jetbrains.parser.psi.ValaSimpleName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ValaSimpleNameManipulator extends AbstractElementManipulator<ValaSimpleName> {

    @Override
    public @Nullable ValaSimpleName handleContentChange(
        @NotNull ValaSimpleName element,
        @NotNull TextRange range,
        String newContent
    ) throws IncorrectOperationException {
        if (newContent == null || newContent.isEmpty()) {
            return element;
        }

        ValaIdentifier newIdentifier = ValaElementFactory.createIdentifier(element.getProject(), newContent);
        element.getIdentifier().replace(newIdentifier);
        return element;
    }

    @Override
    public @NotNull TextRange getRangeInElement(@NotNull ValaSimpleName element) {
        return element.getIdentifier().getTextRangeInParent();
    }
}
