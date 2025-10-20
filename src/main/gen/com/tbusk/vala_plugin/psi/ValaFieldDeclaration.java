// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiReference;

public interface ValaFieldDeclaration extends ValaNamedElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @NotNull
  List<ValaFieldDeclarationSection> getFieldDeclarationSectionList();

  @Nullable
  ValaMemberDeclarationModifiers getMemberDeclarationModifiers();

  @Nullable
  ValaTypeWeak getTypeWeak();

  @Nullable
  ValaTypeWeakWithParenthesis getTypeWeakWithParenthesis();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

  PsiReference[] getReferences();

}
