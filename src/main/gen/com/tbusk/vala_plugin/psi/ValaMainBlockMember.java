// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaMainBlockMember extends PsiElement {

  @NotNull
  List<ValaAttributes> getAttributesList();

  @NotNull
  List<ValaClassDeclaration> getClassDeclarationList();

  @NotNull
  List<ValaConstantDeclaration> getConstantDeclarationList();

  @NotNull
  List<ValaDelegateDeclaration> getDelegateDeclarationList();

  @NotNull
  List<ValaEnumDeclaration> getEnumDeclarationList();

  @NotNull
  List<ValaErrordomainDeclaration> getErrordomainDeclarationList();

  @NotNull
  List<ValaFieldDeclaration> getFieldDeclarationList();

  @NotNull
  List<ValaInterfaceDeclaration> getInterfaceDeclarationList();

  @NotNull
  List<ValaMethodDeclaration> getMethodDeclarationList();

  @NotNull
  List<ValaNamespaceDeclaration> getNamespaceDeclarationList();

  @NotNull
  List<ValaStatement> getStatementList();

  @NotNull
  List<ValaStructDeclaration> getStructDeclarationList();

}
