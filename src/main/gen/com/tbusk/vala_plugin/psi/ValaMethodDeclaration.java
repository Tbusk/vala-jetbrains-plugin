// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaMethodDeclaration extends PsiElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @Nullable
  ValaBlock getBlock();

  @Nullable
  ValaEnsures getEnsures();

  @Nullable
  ValaMemberDeclarationModifiers getMemberDeclarationModifiers();

  @Nullable
  ValaParameters getParameters();

  @Nullable
  ValaRequires getRequires();

  @Nullable
  ValaThrows getThrows();

  @NotNull
  ValaType getType();

  @Nullable
  ValaTypeParameters getTypeParameters();

}
