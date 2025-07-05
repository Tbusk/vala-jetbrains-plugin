// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaEnumDeclaration extends PsiElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @NotNull
  List<ValaAttributes> getAttributesList();

  @NotNull
  List<ValaConstantDeclaration> getConstantDeclarationList();

  @NotNull
  List<ValaEnumvalues> getEnumvaluesList();

  @NotNull
  List<ValaMethodDeclaration> getMethodDeclarationList();

  @NotNull
  ValaSymbol getSymbol();

  @Nullable
  ValaTypeDeclarationModifiers getTypeDeclarationModifiers();

}
