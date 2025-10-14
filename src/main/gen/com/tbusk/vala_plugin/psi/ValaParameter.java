// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaParameter extends PsiElement {

  @Nullable
  ValaAttributes getAttributes();

  @Nullable
  ValaExpression getExpression();

  @Nullable
  ValaIdentifier getIdentifier();

  @Nullable
  ValaInlineArrayType getInlineArrayType();

  @Nullable
  ValaType getType();

  @Nullable
  ValaTypeWeak getTypeWeak();

  @Nullable
  ValaTypeWeakWithParenthesis getTypeWeakWithParenthesis();

  @Nullable
  ValaTypeWithParenthesis getTypeWithParenthesis();

}
