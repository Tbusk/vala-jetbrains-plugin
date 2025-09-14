// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaStructDeclaration extends PsiElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @Nullable
  ValaBaseTypes getBaseTypes();

  @Nullable
  ValaPrimitiveType getPrimitiveType();

  @NotNull
  List<ValaStructMember> getStructMemberList();

  @Nullable
  ValaSymbol getSymbol();

  @Nullable
  ValaTypeArguments getTypeArguments();

  @Nullable
  ValaTypeDeclarationModifiers getTypeDeclarationModifiers();

}
