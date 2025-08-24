// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaFieldDeclaration extends PsiElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @Nullable
  ValaExpression getExpression();

  @Nullable
  ValaInlineArrayType getInlineArrayType();

  @Nullable
  ValaMemberDeclarationModifiers getMemberDeclarationModifiers();

  @Nullable
  ValaTypeWeak getTypeWeak();

  @Nullable
  ValaTypeWeakWithParenthesis getTypeWeakWithParenthesis();

  @Nullable
  ValaValidIdentifierKeywords getValidIdentifierKeywords();

  @Nullable
  PsiElement getIdentifier();

}
