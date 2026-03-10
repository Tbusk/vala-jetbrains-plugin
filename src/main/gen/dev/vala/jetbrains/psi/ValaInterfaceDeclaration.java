// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface ValaInterfaceDeclaration extends ValaNamedElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @Nullable
  ValaBaseTypes getBaseTypes();

  @NotNull
  List<ValaInterfaceMember> getInterfaceMemberList();

  @NotNull
  ValaSymbol getSymbol();

  @Nullable
  ValaTypeParameters getTypeParameters();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
