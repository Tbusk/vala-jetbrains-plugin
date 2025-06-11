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

public class ValaForInitializerImpl extends ASTWrapperPsiElement implements ValaForInitializer {

  public ValaForInitializerImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitForInitializer(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValaLocalVariableDeclarations getLocalVariableDeclarations() {
    return findChildByClass(ValaLocalVariableDeclarations.class);
  }

  @Override
  @NotNull
  public List<ValaStatementExpression> getStatementExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaStatementExpression.class);
  }

}
