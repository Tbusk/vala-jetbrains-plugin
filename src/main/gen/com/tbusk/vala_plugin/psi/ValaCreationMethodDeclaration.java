// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaCreationMethodDeclaration extends PsiElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @Nullable
  ValaBlock getBlock();

  @Nullable
  ValaConstructorDeclarationModifiers getConstructorDeclarationModifiers();

  @Nullable
  ValaEnsuresStatement getEnsuresStatement();

  @Nullable
  ValaParameters getParameters();

  @Nullable
  ValaRequiresStatement getRequiresStatement();

  @NotNull
  ValaSymbol getSymbol();

  @Nullable
  ValaThrowsStatement getThrowsStatement();

}
