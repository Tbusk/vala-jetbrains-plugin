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

public class ValaEnumDeclarationImpl extends ASTWrapperPsiElement implements ValaEnumDeclaration {

  public ValaEnumDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitEnumDeclaration(this);
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
  public List<ValaAttributes> getAttributesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaAttributes.class);
  }

  @Override
  @NotNull
  public List<ValaConstantDeclaration> getConstantDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaConstantDeclaration.class);
  }

  @Override
  @NotNull
  public List<ValaEnumvalues> getEnumvaluesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaEnumvalues.class);
  }

  @Override
  @NotNull
  public List<ValaMethodDeclaration> getMethodDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaMethodDeclaration.class);
  }

  @Override
  @NotNull
  public ValaSymbol getSymbol() {
    return findNotNullChildByClass(ValaSymbol.class);
  }

  @Override
  @Nullable
  public ValaTypeDeclarationModifiers getTypeDeclarationModifiers() {
    return findChildByClass(ValaTypeDeclarationModifiers.class);
  }

}
