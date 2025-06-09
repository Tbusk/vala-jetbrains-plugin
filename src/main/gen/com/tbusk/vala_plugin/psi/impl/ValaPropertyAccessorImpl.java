// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tbusk.vala_plugin.psi.ValaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.tbusk.vala_plugin.psi.*;

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
