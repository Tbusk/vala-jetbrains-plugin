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
  ValaInlineArrayType getInlineArrayType();

  @Nullable
  ValaType getType();

  @Nullable
  ValaTypeWithParameters getTypeWithParameters();

  @Nullable
  ValaValidIdentifierKeywords getValidIdentifierKeywords();

  @Nullable
  PsiElement getIdentifier();

}
