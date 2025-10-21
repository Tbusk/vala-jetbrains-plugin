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

public class ValaErrordomainDeclarationImpl extends ValaNamedElementImpl implements ValaErrordomainDeclaration {

  public ValaErrordomainDeclarationImpl(@Nullable ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitErrordomainDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ValaAttributes> getAttributesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaAttributes.class);
  }

  @Override
  @Nullable
  public ValaErrorcodes getErrorcodes() {
    return findChildByClass(ValaErrorcodes.class);
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
