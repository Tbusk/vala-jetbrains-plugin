// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaUnaryExpression extends PsiElement {

  @Nullable
  ValaPrimaryExpression getPrimaryExpression();

  @Nullable
  ValaType getType();

  @Nullable
  ValaUnaryExpression getUnaryExpression();

  @Nullable
  ValaUnaryOperator getUnaryOperator();

}
