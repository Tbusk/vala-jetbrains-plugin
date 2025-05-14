// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaDelegateDeclaration extends PsiElement {

  @Nullable
  ValaBaseList getBaseList();

  @NotNull
  List<ValaDelegateMember> getDelegateMemberList();

  @NotNull
  List<ValaModifier> getModifierList();

  @NotNull
  ValaParameterList getParameterList();

  @NotNull
  PsiElement getIdentifier();

}
