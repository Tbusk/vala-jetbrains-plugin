// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaPropertyDeclaration extends PsiElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @Nullable
  ValaPropertyDeclarationModifiers getPropertyDeclarationModifiers();

  @NotNull
  List<ValaPropertyDeclarationPart> getPropertyDeclarationPartList();

  @NotNull
  ValaTypeWeak getTypeWeak();

  @Nullable
  ValaValidIdentifierKeywords getValidIdentifierKeywords();

  @Nullable
  PsiElement getIdentifier();

}
