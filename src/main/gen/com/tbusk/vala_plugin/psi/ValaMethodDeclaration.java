// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaMethodDeclaration extends PsiElement {

  @Nullable
  ValaModifiers getModifiers();

  @NotNull
  ValaReturnTypes getReturnTypes();

  @NotNull
  List<ValaStatement> getStatementList();

  @NotNull
  List<ValaVariableTypes> getVariableTypesList();

}
