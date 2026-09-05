package dev.vala.jetbrains.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiReference;
import dev.vala.jetbrains.parser.psi.ValaSimpleName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ValaSimpleNameMixin extends ASTWrapperPsiElement {

    public ValaSimpleNameMixin(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public @Nullable PsiReference getReference() {
        return ValaPsiImplUtil.getReference((ValaSimpleName) this);
    }
}
