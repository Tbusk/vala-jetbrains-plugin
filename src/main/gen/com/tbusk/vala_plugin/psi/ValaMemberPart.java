// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaMemberPart extends PsiElement {

  @Nullable
  ValaPrimitiveType getPrimitiveType();

  @Nullable
  ValaTypeArguments getTypeArguments();

  @Nullable
  ValaValidIdentifierKeywords getValidIdentifierKeywords();

  @Nullable
  PsiElement getIdentifier();

}
