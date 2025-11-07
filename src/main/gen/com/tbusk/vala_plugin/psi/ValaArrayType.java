// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaArrayType extends PsiElement {

  @NotNull
  List<ValaArraySize> getArraySizeList();

  @NotNull
  List<ValaExpression> getExpressionList();

  @NotNull
  List<ValaMember> getMemberList();

}
