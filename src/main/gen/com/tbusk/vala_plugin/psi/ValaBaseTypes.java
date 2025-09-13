// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaBaseTypes extends PsiElement {

  @NotNull
  List<ValaType> getTypeList();

  @NotNull
  List<ValaTypeArguments> getTypeArgumentsList();

  @NotNull
  List<ValaTypeWithParameters> getTypeWithParametersList();

}
