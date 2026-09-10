// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaInterfaceMember extends PsiElement {

  @NotNull
  List<ValaAttributes> getAttributesList();

  @Nullable
  ValaClassDeclaration getClassDeclaration();

  @Nullable
  ValaConstantDeclarations getConstantDeclarations();

  @Nullable
  ValaDelegateDeclaration getDelegateDeclaration();

  @Nullable
  ValaEnumDeclaration getEnumDeclaration();

  @Nullable
  ValaFieldDeclaration getFieldDeclaration();

  @Nullable
  ValaInterfaceDeclaration getInterfaceDeclaration();

  @Nullable
  ValaMethodDeclaration getMethodDeclaration();

  @Nullable
  ValaPropertyDeclaration getPropertyDeclaration();

  @Nullable
  ValaSignalDeclaration getSignalDeclaration();

  @Nullable
  ValaStructDeclaration getStructDeclaration();

}
