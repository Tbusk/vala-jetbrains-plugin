// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.vala.jetbrains.psi.ValaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import dev.vala.jetbrains.psi.*;

public class ValaPropertyAccessorImpl extends ASTWrapperPsiElement implements ValaPropertyAccessor {

  public ValaPropertyAccessorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitPropertyAccessor(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValaAccessModifier getAccessModifier() {
    return findChildByClass(ValaAccessModifier.class);
  }

  @Override
  @Nullable
  public ValaAttributes getAttributes() {
    return findChildByClass(ValaAttributes.class);
  }

  @Override
  @Nullable
  public ValaPropertyConstructAccessor getPropertyConstructAccessor() {
    return findChildByClass(ValaPropertyConstructAccessor.class);
  }

  @Override
  @Nullable
  public ValaPropertyGetAccessor getPropertyGetAccessor() {
    return findChildByClass(ValaPropertyGetAccessor.class);
  }

  @Override
  @Nullable
  public ValaPropertySetAccessor getPropertySetAccessor() {
    return findChildByClass(ValaPropertySetAccessor.class);
  }

}
