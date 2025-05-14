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

public class ValaDelegateDeclarationImpl extends ASTWrapperPsiElement implements ValaDelegateDeclaration {

  public ValaDelegateDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitDelegateDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValaBaseList getBaseList() {
    return findChildByClass(ValaBaseList.class);
  }

  @Override
  @NotNull
  public List<ValaDelegateMember> getDelegateMemberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaDelegateMember.class);
  }

  @Override
  @NotNull
  public List<ValaModifier> getModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaModifier.class);
  }

  @Override
  @NotNull
  public ValaParameterList getParameterList() {
    return findNotNullChildByClass(ValaParameterList.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
