// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaTypeWeak extends PsiElement {

  @NotNull
  List<ValaArrayType> getArrayTypeList();

  @Nullable
  ValaPrimitiveType getPrimitiveType();

  @Nullable
  ValaSymbol getSymbol();

  @Nullable
  ValaTypeArguments getTypeArguments();

}
