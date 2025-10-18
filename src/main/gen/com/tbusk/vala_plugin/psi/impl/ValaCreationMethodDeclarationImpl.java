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

public class ValaCreationMethodDeclarationImpl extends ValaNamedElementImpl implements ValaCreationMethodDeclaration {

  public ValaCreationMethodDeclarationImpl(@Nullable ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitCreationMethodDeclaration(this);
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
  public ValaConstructorDeclarationModifiers getConstructorDeclarationModifiers() {
    return findChildByClass(ValaConstructorDeclarationModifiers.class);
  }

  @Override
  @Nullable
  public ValaEnsuresStatement getEnsuresStatement() {
    return findChildByClass(ValaEnsuresStatement.class);
  }

  @Override
  @NotNull
  public ValaMember getMember() {
    return findNotNullChildByClass(ValaMember.class);
  }

  @Override
  @Nullable
  public ValaParameters getParameters() {
    return findChildByClass(ValaParameters.class);
  }

  @Override
  @Nullable
  public ValaRequiresStatement getRequiresStatement() {
    return findChildByClass(ValaRequiresStatement.class);
  }

  @Override
  @Nullable
  public ValaThrowsStatement getThrowsStatement() {
    return findChildByClass(ValaThrowsStatement.class);
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

}
