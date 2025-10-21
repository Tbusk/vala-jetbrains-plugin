package com.tbusk.vala_plugin.psi;

import com.intellij.lang.cacheBuilder.SimpleWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ValaUsageProvider implements FindUsagesProvider {

    /**
     * Gets the word scanner for building a word index for the specified language.
     * Note that the implementation MUST be thread-safe, otherwise you should return a new instance of your scanner
     * (that can be recommended as a best practice).
     *
     * @return the word scanner implementation, or null if {@link com.intellij.lang.cacheBuilder.SimpleWordsScanner} is OK.
     */
    @Override
    public @Nullable WordsScanner getWordsScanner() {
        return new SimpleWordsScanner();
    }

    /**
     * Checks if it makes sense to search for usages of the specified element.
     *
     * @param psiElement the element for which usages are searched.
     * @return true if the search is allowed, false otherwise.
     * @see com.intellij.find.FindManager#canFindUsages(PsiElement)
     */
    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
        return psiElement instanceof ValaIdentifier || psiElement instanceof ValaSymbol || psiElement instanceof ValaMember;
    }

    /**
     * Returns the ID of the help topic which is shown when the specified element is selected
     * in the "Find Usages" dialog.
     *
     * @param psiElement the element for which the help topic is requested.
     * @return the help topic ID, or null if no help is available.
     */
    @Override
    public @Nullable @NonNls String getHelpId(@NotNull PsiElement psiElement) {
        return "";
    }

    /**
     * Returns the user-visible type of the specified element, shown in the "Find Usages"
     * dialog (for example, "class" or "variable"). The type name should not be upper-cased.
     *
     * @param element the element for which the type is requested.
     * @return the type of the element.
     */
    @Override
    public @Nls @NotNull String getType(@NotNull PsiElement element) {
        return element.getNode().getElementType().toString();
    }

    /**
     * Returns an expanded user-visible name of the specified element, shown in the "Find Usages"
     * dialog. For classes, this can return a fully qualified name of the class; for methods -
     * a signature of the method with parameters.
     *
     * @param element the element for which the name is requested.
     * @return the user-visible name.
     */
    @Override
    public @Nls @NotNull String getDescriptiveName(@NotNull PsiElement element) {
        return "";
    }

    /**
     * Returns the text representing the specified PSI element in the Find Usages tree.
     *
     * @param element     the element for which the node text is requested.
     * @param useFullName if true, the returned text should use fully qualified names
     * @return the text representing the element.
     */
    @Override
    public @Nls @NotNull String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        if (element instanceof ValaNamedElement namedElement) {
            String name = ValaPsiImplUtil.getName(namedElement);

            if (name != null) {
                return name;
            }
        }

        return "";
    }
}
