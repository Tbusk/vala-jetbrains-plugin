// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaErrordomainDeclaration extends PsiElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @NotNull
  ValaErrorcodes getErrorcodes();

  @NotNull
  List<ValaMethodDeclaration> getMethodDeclarationList();

  @NotNull
  ValaSymbol getSymbol();

  @Nullable
  ValaTypeDeclarationModifiers getTypeDeclarationModifiers();

}
