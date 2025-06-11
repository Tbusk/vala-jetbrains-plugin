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

public class ValaPrimaryExpressionImpl extends ASTWrapperPsiElement implements ValaPrimaryExpression {

  public ValaPrimaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitPrimaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValaBaseAccess getBaseAccess() {
    return findChildByClass(ValaBaseAccess.class);
  }

  @Override
  @NotNull
  public List<ValaElementAccess> getElementAccessList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaElementAccess.class);
  }

  @Override
  @Nullable
  public ValaInitializer getInitializer() {
    return findChildByClass(ValaInitializer.class);
  }

  @Override
  @Nullable
  public ValaLiteral getLiteral() {
    return findChildByClass(ValaLiteral.class);
  }

  @Override
  @NotNull
  public List<ValaMemberAccess> getMemberAccessList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaMemberAccess.class);
  }

  @Override
  @NotNull
  public List<ValaMethodCall> getMethodCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaMethodCall.class);
  }

  @Override
  @Nullable
  public ValaObjectOrArrayCreationExpression getObjectOrArrayCreationExpression() {
    return findChildByClass(ValaObjectOrArrayCreationExpression.class);
  }

  @Override
  @NotNull
  public List<ValaPointerMemberAccess> getPointerMemberAccessList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaPointerMemberAccess.class);
  }

  @Override
  @NotNull
  public List<ValaPostDecrementExpression> getPostDecrementExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaPostDecrementExpression.class);
  }

  @Override
  @NotNull
  public List<ValaPostIncrementExpression> getPostIncrementExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaPostIncrementExpression.class);
  }

  @Override
  @Nullable
  public ValaPrimitiveType getPrimitiveType() {
    return findChildByClass(ValaPrimitiveType.class);
  }

  @Override
  @Nullable
  public ValaSimpleName getSimpleName() {
    return findChildByClass(ValaSimpleName.class);
  }

  @Override
  @Nullable
  public ValaSizeofExpression getSizeofExpression() {
    return findChildByClass(ValaSizeofExpression.class);
  }

  @Override
  @Nullable
  public ValaTemplate getTemplate() {
    return findChildByClass(ValaTemplate.class);
  }

  @Override
  @Nullable
  public ValaThisAccess getThisAccess() {
    return findChildByClass(ValaThisAccess.class);
  }

  @Override
  @Nullable
  public ValaTuple getTuple() {
    return findChildByClass(ValaTuple.class);
  }

  @Override
  @Nullable
  public ValaTypeofExpression getTypeofExpression() {
    return findChildByClass(ValaTypeofExpression.class);
  }

  @Override
  @Nullable
  public ValaYieldExpression getYieldExpression() {
    return findChildByClass(ValaYieldExpression.class);
  }

}
