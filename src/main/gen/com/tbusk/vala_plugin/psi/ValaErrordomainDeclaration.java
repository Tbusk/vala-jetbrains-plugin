// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiReference;

public interface ValaErrordomainDeclaration extends ValaNamedElement {

  @NotNull
  List<ValaAttributes> getAttributesList();

  @Nullable
  ValaErrorcodes getErrorcodes();

  @NotNull
  List<ValaMethodDeclaration> getMethodDeclarationList();

  @NotNull
  ValaSymbol getSymbol();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

  PsiReference[] getReferences();

}
