package resolution;

import com.intellij.openapi.editor.Caret;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import dev.vala.jetbrains.parser.psi.ValaSimpleName;
import dev.vala.jetbrains.psi.ValaNamedElement;

import java.util.List;

/**
 * Shared helpers for simple-name reference resolution tests.
 */
public abstract class ValaSimpleNameResolution extends BasePlatformTestCase {

    /**
     * Asserts resolution of the {@code ValaSimpleName} at {@code <caret>} in {@code fileContent}.
     *
     * @param fileContent   Vala source containing a {@code <caret>} marker on the identifier under test
     * @param expectedType  PSI type of the bound declaration; unused when {@code shouldResolve} is false
     * @param shouldResolve whether the identifier should have a reference that resolves to a declaration
     * @param variableName  identifier text at the caret, and the declaration name when resolving
     */
    protected void assertSimpleNameResolution(String fileContent,
                                              Class<? extends ValaNamedElement> expectedType,
                                              boolean shouldResolve,
                                              String variableName,
                                              int caretIndex) {

        assert (fileContent != null) : "fileContent cannot be null.";
        assert (!fileContent.isBlank()) : "fileContent cannot be blank.";
        assert (variableName != null) : "variableName cannot be null.";
        assert (!variableName.isBlank()) : "variableName cannot be blank.";
        assert (fileContent.contains("<caret>")) : "fileContent must contain a <caret> marker.";

        if (shouldResolve) {
            assert (expectedType != null) : "expectedType cannot be null when shouldResolve is true.";
        }

        myFixture.configureByText("test.vala", fileContent);

        List<Caret> carets = myFixture.getEditor().getCaretModel().getAllCarets();

        ValaSimpleName simpleName = findSimpleNameAtCaret(carets, caretIndex);

        assertEquals(variableName, simpleName.getIdentifier().getText());

        PsiReference reference = simpleName.getReference();

        if (!shouldResolve) {
            if (reference != null) {
                assertNull(reference.resolve());
            }
            return;
        }

        assertNotNull(reference);

        PsiElement resolved = reference.resolve();

        assertNotNull(resolved);
        assertInstanceOf(resolved, expectedType);
        assertEquals(variableName, ((ValaNamedElement) resolved).getName());
    }

    /**
     * Finds the {@link ValaSimpleName} at the fixture caret.
     *
     * @return the simple name containing the caret
     */
    private ValaSimpleName findSimpleNameAtCaret(List<Caret> carets, int index) {

        assert (carets != null) : "carets cannot be null.";
        assert (index >= 0) : "index cannot be negative.";
        assert (index < carets.size()) : "index cannot be greater than the number of carets.";

        PsiElement elementAtCaret = myFixture.getFile().findElementAt(carets.get(index).getOffset());
        ValaSimpleName simpleName = PsiTreeUtil.getParentOfType(elementAtCaret, ValaSimpleName.class);

        assertNotNull(simpleName);

        return simpleName;
    }
}
