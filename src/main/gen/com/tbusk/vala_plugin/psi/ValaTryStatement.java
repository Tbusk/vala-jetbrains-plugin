// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaTryStatement extends PsiElement {

  @NotNull
  ValaBlock getBlock();

  @NotNull
  List<ValaCatchClause> getCatchClauseList();

  @Nullable
  ValaFinallyClause getFinallyClause();

}
