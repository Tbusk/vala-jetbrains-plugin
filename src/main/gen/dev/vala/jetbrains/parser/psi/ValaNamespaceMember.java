// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaNamespaceMember extends PsiElement {

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
  ValaErrordomainDeclaration getErrordomainDeclaration();

  @Nullable
  ValaFieldDeclaration getFieldDeclaration();

  @Nullable
  ValaInterfaceDeclaration getInterfaceDeclaration();

  @Nullable
  ValaMethodDeclaration getMethodDeclaration();

  @Nullable
  ValaNamespaceDeclaration getNamespaceDeclaration();

  @Nullable
  ValaStructDeclaration getStructDeclaration();

}
