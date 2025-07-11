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

public class ValaForStatementImpl extends ASTWrapperPsiElement implements ValaForStatement {

  public ValaForStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitForStatement(this);
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
  @Nullable
  public ValaExpression getExpression() {
    return findChildByClass(ValaExpression.class);
  }

  @Override
  @Nullable
  public ValaForInitializer getForInitializer() {
    return findChildByClass(ValaForInitializer.class);
  }

  @Override
  @Nullable
  public ValaForIterator getForIterator() {
    return findChildByClass(ValaForIterator.class);
  }

}
