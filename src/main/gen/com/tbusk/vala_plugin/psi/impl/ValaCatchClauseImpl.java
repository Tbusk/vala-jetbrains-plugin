// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tbusk.vala_plugin.psi.ValaTypes.*;
import com.tbusk.vala_plugin.psi.ValaNamedElementImpl;
import com.tbusk.vala_plugin.psi.*;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiReference;

public class ValaCatchClauseImpl extends ValaNamedElementImpl implements ValaCatchClause {

  public ValaCatchClauseImpl(@Nullable ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitCatchClause(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ValaBlock getBlock() {
    return findNotNullChildByClass(ValaBlock.class);
  }

  @Override
  @Nullable
  public ValaIdentifier getIdentifier() {
    return findChildByClass(ValaIdentifier.class);
  }

  @Override
  @Nullable
  public ValaTypeWeak getTypeWeak() {
    return findChildByClass(ValaTypeWeak.class);
  }

  @Override
  @Nullable
  public ValaTypeWeakWithParenthesis getTypeWeakWithParenthesis() {
    return findChildByClass(ValaTypeWeakWithParenthesis.class);
  }

  @Override
  public String getName() {
    return ValaPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return ValaPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return ValaPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return ValaPsiImplUtil.getPresentation(this);
  }

  @Override
  public PsiReference[] getReferences() {
    return ValaPsiImplUtil.getReferences(this);
  }

}
