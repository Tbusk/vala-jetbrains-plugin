// This is a generated file. Not intended for manual editing.
package dev.vala.vala_plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.vala.vala_plugin.psi.ValaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import dev.vala.vala_plugin.psi.*;

public class ValaConditionalOrExpressionImpl extends ASTWrapperPsiElement implements ValaConditionalOrExpression {

  public ValaConditionalOrExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitConditionalOrExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ValaConditionalAndExpression> getConditionalAndExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaConditionalAndExpression.class);
  }

}
