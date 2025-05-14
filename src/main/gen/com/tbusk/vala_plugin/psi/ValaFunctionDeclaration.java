// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaFunctionDeclaration extends PsiElement {

  @NotNull
  ValaFunctionBody getFunctionBody();

  @NotNull
  List<ValaModifier> getModifierList();

  @NotNull
  ValaParameterList getParameterList();

  @Nullable
  ValaType getType();

  @NotNull
  PsiElement getIdentifier();

}
