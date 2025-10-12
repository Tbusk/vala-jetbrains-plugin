// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaSignalDeclaration extends PsiElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @Nullable
  ValaBlock getBlock();

  @NotNull
  ValaIdentifier getIdentifier();

  @Nullable
  ValaParameters getParameters();

  @Nullable
  ValaSignalDeclarationModifiers getSignalDeclarationModifiers();

  @Nullable
  ValaType getType();

  @Nullable
  ValaTypeWithParameters getTypeWithParameters();

}
