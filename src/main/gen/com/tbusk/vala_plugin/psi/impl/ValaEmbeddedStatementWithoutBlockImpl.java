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

public class ValaEmbeddedStatementWithoutBlockImpl extends ASTWrapperPsiElement implements ValaEmbeddedStatementWithoutBlock {

  public ValaEmbeddedStatementWithoutBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitEmbeddedStatementWithoutBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValaBreakStatement getBreakStatement() {
    return findChildByClass(ValaBreakStatement.class);
  }

  @Override
  @Nullable
  public ValaContinueStatement getContinueStatement() {
    return findChildByClass(ValaContinueStatement.class);
  }

  @Override
  @Nullable
  public ValaDeleteStatement getDeleteStatement() {
    return findChildByClass(ValaDeleteStatement.class);
  }

  @Override
  @Nullable
  public ValaExpressionStatement getExpressionStatement() {
    return findChildByClass(ValaExpressionStatement.class);
  }

  @Override
  @Nullable
  public ValaForStatement getForStatement() {
    return findChildByClass(ValaForStatement.class);
  }

  @Override
  @Nullable
  public ValaForeachStatement getForeachStatement() {
    return findChildByClass(ValaForeachStatement.class);
  }

  @Override
  @Nullable
  public ValaIfStatement getIfStatement() {
    return findChildByClass(ValaIfStatement.class);
  }

  @Override
  @Nullable
  public ValaLocalVariableDeclarations getLocalVariableDeclarations() {
    return findChildByClass(ValaLocalVariableDeclarations.class);
  }

  @Override
  @Nullable
  public ValaLockStatement getLockStatement() {
    return findChildByClass(ValaLockStatement.class);
  }

  @Override
  @Nullable
  public ValaReturnStatement getReturnStatement() {
    return findChildByClass(ValaReturnStatement.class);
  }

  @Override
  @Nullable
  public ValaSwitchStatement getSwitchStatement() {
    return findChildByClass(ValaSwitchStatement.class);
  }

  @Override
  @Nullable
  public ValaThrowStatement getThrowStatement() {
    return findChildByClass(ValaThrowStatement.class);
  }

  @Override
  @Nullable
  public ValaTryStatement getTryStatement() {
    return findChildByClass(ValaTryStatement.class);
  }

  @Override
  @Nullable
  public ValaWhileStatement getWhileStatement() {
    return findChildByClass(ValaWhileStatement.class);
  }

  @Override
  @Nullable
  public ValaYieldStatement getYieldStatement() {
    return findChildByClass(ValaYieldStatement.class);
  }

}
