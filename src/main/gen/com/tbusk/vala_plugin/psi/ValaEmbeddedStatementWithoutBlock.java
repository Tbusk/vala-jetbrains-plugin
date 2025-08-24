// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaEmbeddedStatementWithoutBlock extends PsiElement {

  @Nullable
  ValaBreakStatement getBreakStatement();

  @Nullable
  ValaContinueStatement getContinueStatement();

  @Nullable
  ValaDeleteStatement getDeleteStatement();

  @Nullable
  ValaExpressionStatement getExpressionStatement();

  @Nullable
  ValaForStatement getForStatement();

  @Nullable
  ValaForeachStatement getForeachStatement();

  @Nullable
  ValaIfStatement getIfStatement();

  @Nullable
  ValaLocalVariableDeclarations getLocalVariableDeclarations();

  @Nullable
  ValaLockStatement getLockStatement();

  @Nullable
  ValaReturnStatement getReturnStatement();

  @Nullable
  ValaSwitchStatement getSwitchStatement();

  @Nullable
  ValaThrowStatement getThrowStatement();

  @Nullable
  ValaTryStatement getTryStatement();

  @Nullable
  ValaUnlockStatement getUnlockStatement();

  @Nullable
  ValaWhileStatement getWhileStatement();

  @Nullable
  ValaWithStatement getWithStatement();

  @Nullable
  ValaYieldStatement getYieldStatement();

}
