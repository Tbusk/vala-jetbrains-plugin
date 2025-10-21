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

public class ValaConstantDeclarationImpl extends ValaNamedElementImpl implements ValaConstantDeclaration {

  public ValaConstantDeclarationImpl(@Nullable ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitConstantDeclaration(this);
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
  public List<ValaExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaExpression.class);
  }

  @Override
  @NotNull
  public List<ValaIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaIdentifier.class);
  }

  @Override
  @NotNull
  public List<ValaInlineArrayType> getInlineArrayTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaInlineArrayType.class);
  }

  @Override
  @Nullable
  public ValaMemberDeclarationModifiers getMemberDeclarationModifiers() {
    return findChildByClass(ValaMemberDeclarationModifiers.class);
  }

  @Override
  @NotNull
  public ValaType getType() {
    return findNotNullChildByClass(ValaType.class);
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
