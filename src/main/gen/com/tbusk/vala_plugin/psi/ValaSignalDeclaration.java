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

  @Nullable
  ValaParameters getParameters();

  @Nullable
  ValaSignalDeclarationModifiers getSignalDeclarationModifiers();

  @NotNull
  ValaType getType();

  @NotNull
  PsiElement getIdentifier();

}
