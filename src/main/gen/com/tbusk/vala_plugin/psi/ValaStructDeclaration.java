// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaStructDeclaration extends PsiElement {

  @Nullable
  ValaBaseList getBaseList();

  @NotNull
  List<ValaModifier> getModifierList();

  @NotNull
  List<ValaStructMember> getStructMemberList();

  @Nullable
  ValaTypeParameters getTypeParameters();

  @NotNull
  PsiElement getIdentifier();

}
