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

public class ValaMethodDeclarationImpl extends ASTWrapperPsiElement implements ValaMethodDeclaration {

  public ValaMethodDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitMethodDeclaration(this);
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
  public ValaEnsuresStatement getEnsuresStatement() {
    return findChildByClass(ValaEnsuresStatement.class);
  }

  @Override
  @Nullable
  public ValaMemberDeclarationModifiers getMemberDeclarationModifiers() {
    return findChildByClass(ValaMemberDeclarationModifiers.class);
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
  @Nullable
  public ValaType getType() {
    return findChildByClass(ValaType.class);
  }

  @Override
  @Nullable
  public ValaTypeParameters getTypeParameters() {
    return findChildByClass(ValaTypeParameters.class);
  }

  @Override
  @Nullable
  public ValaTypeWithParameters getTypeWithParameters() {
    return findChildByClass(ValaTypeWithParameters.class);
  }

  @Override
  @NotNull
  public List<ValaValidIdentifierKeywords> getValidIdentifierKeywordsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaValidIdentifierKeywords.class);
  }

}
