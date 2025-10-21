// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface ValaFieldDeclarationSection extends ValaNamedElement {

  @Nullable
  ValaExpression getExpression();

  @NotNull
  ValaIdentifier getIdentifier();

  @NotNull
  List<ValaInlineArrayType> getInlineArrayTypeList();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
