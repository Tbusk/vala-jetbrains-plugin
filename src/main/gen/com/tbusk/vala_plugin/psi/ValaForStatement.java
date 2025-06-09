// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaForStatement extends PsiElement {

  @NotNull
  ValaEmbeddedStatement getEmbeddedStatement();

  @Nullable
  ValaExpression getExpression();

  @Nullable
  ValaForInitializer getForInitializer();

  @Nullable
  ValaForIterator getForIterator();

}
