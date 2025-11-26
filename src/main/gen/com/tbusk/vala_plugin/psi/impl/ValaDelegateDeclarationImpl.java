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

public class ValaDelegateDeclarationImpl extends ValaNamedElementImpl implements ValaDelegateDeclaration {

  public ValaDelegateDeclarationImpl(@Nullable ASTNode node) {
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
  public ValaParameters getParameters() {
    return findChildByClass(ValaParameters.class);
  }

  @Override
  @NotNull
  public ValaSymbol getSymbol() {
    return findNotNullChildByClass(ValaSymbol.class);
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
  public ValaTypeWithParenthesis getTypeWithParenthesis() {
    return findChildByClass(ValaTypeWithParenthesis.class);
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
