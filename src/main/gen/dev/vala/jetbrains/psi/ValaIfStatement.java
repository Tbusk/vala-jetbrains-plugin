// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaIfStatement extends PsiElement {

  @NotNull
  List<ValaElseIfStatement> getElseIfStatementList();

  @NotNull
  List<ValaEmbeddedStatement> getEmbeddedStatementList();

  @NotNull
  ValaExpression getExpression();

}
