// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaNamespaceDeclaration extends PsiElement {

  @NotNull
  List<ValaNamespaceMember> getNamespaceMemberList();

  @NotNull
  ValaSymbol getSymbol();

  @NotNull
  List<ValaUsingDirective> getUsingDirectiveList();

}
