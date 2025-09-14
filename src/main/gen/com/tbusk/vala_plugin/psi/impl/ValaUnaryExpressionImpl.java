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

public class ValaUnaryExpressionImpl extends ASTWrapperPsiElement implements ValaUnaryExpression {

  public ValaUnaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitUnaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValaPrimaryExpression getPrimaryExpression() {
    return findChildByClass(ValaPrimaryExpression.class);
  }

  @Override
  @Nullable
  public ValaType getType() {
    return findChildByClass(ValaType.class);
  }

  @Override
  @Nullable
  public ValaTypeWithParameters getTypeWithParameters() {
    return findChildByClass(ValaTypeWithParameters.class);
  }

  @Override
  @Nullable
  public ValaUnaryExpression getUnaryExpression() {
    return findChildByClass(ValaUnaryExpression.class);
  }

  @Override
  @Nullable
  public ValaUnaryOperator getUnaryOperator() {
    return findChildByClass(ValaUnaryOperator.class);
  }

}
