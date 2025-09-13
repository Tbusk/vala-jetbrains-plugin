// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaDelegateDeclaration extends PsiElement {

  @Nullable
  ValaBlock getBlock();

  @Nullable
  ValaParameters getParameters();

  @NotNull
  ValaSymbol getSymbol();

  @Nullable
  ValaThrowsStatement getThrowsStatement();

  @Nullable
  ValaType getType();

  @Nullable
  ValaTypeParameters getTypeParameters();

  @Nullable
  ValaTypeWithParameters getTypeWithParameters();

}
