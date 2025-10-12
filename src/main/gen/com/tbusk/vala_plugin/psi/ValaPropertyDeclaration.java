// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaPropertyDeclaration extends PsiElement {

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

}
