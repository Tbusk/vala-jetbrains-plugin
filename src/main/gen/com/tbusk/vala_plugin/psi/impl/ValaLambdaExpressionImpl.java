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

public class ValaLambdaExpressionImpl extends ASTWrapperPsiElement implements ValaLambdaExpression {

  public ValaLambdaExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitLambdaExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ValaLambdaExpressionBody getLambdaExpressionBody() {
    return findNotNullChildByClass(ValaLambdaExpressionBody.class);
  }

  @Override
  @NotNull
  public ValaLambdaExpressionParams getLambdaExpressionParams() {
    return findNotNullChildByClass(ValaLambdaExpressionParams.class);
  }

  @Override
  @Nullable
  public ValaTypeArguments getTypeArguments() {
    return findChildByClass(ValaTypeArguments.class);
  }

}
