// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface ValaConstantDeclaration extends ValaNamedElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @NotNull
  List<ValaExpression> getExpressionList();

  @NotNull
  List<ValaIdentifier> getIdentifierList();

  @NotNull
  List<ValaInlineArrayType> getInlineArrayTypeList();

  @Nullable
  ValaMemberDeclarationModifiers getMemberDeclarationModifiers();

  @NotNull
  ValaType getType();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
