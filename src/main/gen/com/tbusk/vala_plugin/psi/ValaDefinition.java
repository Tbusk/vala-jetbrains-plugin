// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaDefinition extends PsiElement {

  @NotNull
  List<ValaDefinition> getDefinitionList();

  @Nullable
  PsiElement getBlockComment();

  @Nullable
  PsiElement getComment();

  @Nullable
  PsiElement getDocComment();

}
