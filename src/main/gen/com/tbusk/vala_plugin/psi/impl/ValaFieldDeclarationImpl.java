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

public class ValaFieldDeclarationImpl extends ASTWrapperPsiElement implements ValaFieldDeclaration {

  public ValaFieldDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitFieldDeclaration(this);
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
  @NotNull
  public List<ValaFieldDeclarationSection> getFieldDeclarationSectionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaFieldDeclarationSection.class);
  }

  @Override
  @Nullable
  public ValaMemberDeclarationModifiers getMemberDeclarationModifiers() {
    return findChildByClass(ValaMemberDeclarationModifiers.class);
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

}
