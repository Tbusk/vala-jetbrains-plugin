// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.vala.jetbrains.parser.psi.ValaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import dev.vala.jetbrains.parser.psi.*;
import dev.vala.jetbrains.psi.ValaPsiImplUtil;

public class ValaYieldExpressionImpl extends ASTWrapperPsiElement implements ValaYieldExpression {

  public ValaYieldExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitYieldExpression(this);
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
  public ValaMember getMember() {
    return findNotNullChildByClass(ValaMember.class);
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

}
