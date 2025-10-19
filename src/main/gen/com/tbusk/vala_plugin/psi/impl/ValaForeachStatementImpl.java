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

public class ValaForeachStatementImpl extends ValaNamedElementImpl implements ValaForeachStatement {

  public ValaForeachStatementImpl(@Nullable ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitForeachStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ValaEmbeddedStatement getEmbeddedStatement() {
    return findNotNullChildByClass(ValaEmbeddedStatement.class);
  }

  @Override
  @NotNull
  public ValaExpression getExpression() {
    return findNotNullChildByClass(ValaExpression.class);
  }

  @Override
  @NotNull
  public ValaIdentifier getIdentifier() {
    return findNotNullChildByClass(ValaIdentifier.class);
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
  public PsiElement setName(@NotNull String newName) {
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
