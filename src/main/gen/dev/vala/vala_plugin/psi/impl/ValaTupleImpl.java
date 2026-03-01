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

public class ValaTupleImpl extends ASTWrapperPsiElement implements ValaTuple {

  public ValaTupleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitTuple(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ValaExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaExpression.class);
  }

}
