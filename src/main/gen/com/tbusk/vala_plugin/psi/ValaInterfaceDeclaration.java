// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaInterfaceDeclaration extends PsiElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @Nullable
  ValaBaseTypes getBaseTypes();

  @NotNull
  List<ValaInterfaceMember> getInterfaceMemberList();

  @NotNull
  ValaSymbol getSymbol();

  @Nullable
  ValaTypeDeclarationModifiers getTypeDeclarationModifiers();

  @Nullable
  ValaTypeParameters getTypeParameters();

}
