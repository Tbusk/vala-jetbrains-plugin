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

public class ValaTypeWeakImpl extends ASTWrapperPsiElement implements ValaTypeWeak {

  public ValaTypeWeakImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitTypeWeak(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ValaArrayType> getArrayTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaArrayType.class);
  }

  @Override
  @Nullable
  public ValaPrimitiveType getPrimitiveType() {
    return findChildByClass(ValaPrimitiveType.class);
  }

  @Override
  @Nullable
  public ValaSymbol getSymbol() {
    return findChildByClass(ValaSymbol.class);
  }

  @Override
  @Nullable
  public ValaTypeArguments getTypeArguments() {
    return findChildByClass(ValaTypeArguments.class);
  }

}
