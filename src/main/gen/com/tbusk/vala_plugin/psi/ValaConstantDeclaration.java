// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaConstantDeclaration extends PsiElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @NotNull
  List<ValaExpression> getExpressionList();

  @NotNull
  List<ValaInlineArrayType> getInlineArrayTypeList();

  @Nullable
  ValaMemberDeclarationModifiers getMemberDeclarationModifiers();

  @NotNull
  ValaType getType();

  @NotNull
  List<ValaValidIdentifierKeywords> getValidIdentifierKeywordsList();

}
