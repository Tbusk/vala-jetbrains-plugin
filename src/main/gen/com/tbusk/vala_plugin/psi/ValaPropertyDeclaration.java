// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface ValaPropertyDeclaration extends ValaNamedElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @NotNull
  ValaIdentifier getIdentifier();

  @Nullable
  ValaPropertyDeclarationModifiers getPropertyDeclarationModifiers();

  @NotNull
  List<ValaPropertyDeclarationPart> getPropertyDeclarationPartList();

  @Nullable
  ValaTypeWeak getTypeWeak();

  @Nullable
  ValaTypeWeakWithParenthesis getTypeWeakWithParenthesis();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
