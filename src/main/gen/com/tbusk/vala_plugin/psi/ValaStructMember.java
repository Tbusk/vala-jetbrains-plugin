// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaStructMember extends PsiElement {

  @Nullable
  ValaFunctionDeclaration getFunctionDeclaration();

  @NotNull
  List<ValaModifier> getModifierList();

  @Nullable
  ValaPropertyDeclaration getPropertyDeclaration();

  @Nullable
  ValaVariableDeclaration getVariableDeclaration();

}
