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

public class ValaObjectOrArrayCreationExpressionImpl extends ASTWrapperPsiElement implements ValaObjectOrArrayCreationExpression {

  public ValaObjectOrArrayCreationExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitObjectOrArrayCreationExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValaArrayCreationExpression getArrayCreationExpression() {
    return findChildByClass(ValaArrayCreationExpression.class);
  }

  @Override
  @NotNull
  public ValaMember getMember() {
    return findNotNullChildByClass(ValaMember.class);
  }

  @Override
  @Nullable
  public ValaObjectCreationExpression getObjectCreationExpression() {
    return findChildByClass(ValaObjectCreationExpression.class);
  }

}
