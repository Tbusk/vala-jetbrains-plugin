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

public class ValaSignalDeclarationImpl extends ASTWrapperPsiElement implements ValaSignalDeclaration {

  public ValaSignalDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitSignalDeclaration(this);
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
  public ValaBlock getBlock() {
    return findChildByClass(ValaBlock.class);
  }

  @Override
  @Nullable
  public ValaParameters getParameters() {
    return findChildByClass(ValaParameters.class);
  }

  @Override
  @Nullable
  public ValaSignalDeclarationModifiers getSignalDeclarationModifiers() {
    return findChildByClass(ValaSignalDeclarationModifiers.class);
  }

  @Override
  @NotNull
  public ValaType getType() {
    return findNotNullChildByClass(ValaType.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
