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

public class ValaTypeWeakWithParenthesisImpl extends ASTWrapperPsiElement implements ValaTypeWeakWithParenthesis {

  public ValaTypeWeakWithParenthesisImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitTypeWeakWithParenthesis(this);
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
  @NotNull
  public ValaTypeWeak getTypeWeak() {
    return findNotNullChildByClass(ValaTypeWeak.class);
  }

}
