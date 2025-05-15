// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaForStatement extends PsiElement {

  @Nullable
  ValaExpression getExpression();

  @NotNull
  List<ValaStatement> getStatementList();

  @NotNull
  List<ValaStatementExpression> getStatementExpressionList();

}
