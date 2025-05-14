// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaDeclaration extends PsiElement {

  @Nullable
  ValaClassDeclaration getClassDeclaration();

  @Nullable
  ValaDelegateDeclaration getDelegateDeclaration();

  @Nullable
  ValaEnumDeclaration getEnumDeclaration();

  @Nullable
  ValaInterfaceDeclaration getInterfaceDeclaration();

  @Nullable
  ValaStructDeclaration getStructDeclaration();

}
