// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiReference;

public interface ValaCreationMethodDeclaration extends ValaNamedElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @Nullable
  ValaBlock getBlock();

  @Nullable
  ValaConstructorDeclarationModifiers getConstructorDeclarationModifiers();

  @Nullable
  ValaEnsuresStatement getEnsuresStatement();

  @NotNull
  ValaMember getMember();

  @Nullable
  ValaParameters getParameters();

  @Nullable
  ValaRequiresStatement getRequiresStatement();

  @Nullable
  ValaThrowsStatement getThrowsStatement();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

  PsiReference[] getReferences();

}
