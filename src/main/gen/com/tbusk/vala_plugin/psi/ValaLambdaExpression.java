// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaLambdaExpression extends PsiElement {

  @NotNull
  ValaLambdaExpressionBody getLambdaExpressionBody();

  @Nullable
  ValaLambdaExpressionParam getLambdaExpressionParam();

  @Nullable
  ValaLambdaExpressionParams getLambdaExpressionParams();

  @Nullable
  ValaTypeArguments getTypeArguments();

}
