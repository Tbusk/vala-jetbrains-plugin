// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.tbusk.vala_plugin.psi.ValaProperty;
import com.tbusk.vala_plugin.psi.ValaType;
import com.tbusk.vala_plugin.psi.ValaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.tbusk.vala_plugin.psi.ValaTypes.IDENTIFIER;

public class ValaPropertyImpl extends ASTWrapperPsiElement implements ValaProperty {

  public ValaPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValaType getType() {
    return findChildByClass(ValaType.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
