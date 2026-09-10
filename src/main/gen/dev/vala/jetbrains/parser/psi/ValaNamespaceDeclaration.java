// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import dev.vala.jetbrains.psi.ValaNamedElement;

public interface ValaNamespaceDeclaration extends ValaNamedElement {

  @NotNull
  List<ValaNamespaceMember> getNamespaceMemberList();

  @NotNull
  ValaSymbol getSymbol();

  @NotNull
  List<ValaUsingDirectives> getUsingDirectivesList();

}
