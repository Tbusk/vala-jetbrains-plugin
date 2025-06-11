// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaLiteral extends PsiElement {

  @Nullable
  ValaRegexLiteral getRegexLiteral();

  @Nullable
  PsiElement getCharLiteral();

  @Nullable
  PsiElement getDecimalLiteral();

  @Nullable
  PsiElement getIntegerLiteral();

  @Nullable
  PsiElement getStringLiteral();

  @Nullable
  PsiElement getTripleQuoteString();

}
