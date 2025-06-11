// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaClassMember extends PsiElement {

  @Nullable
  ValaAttributes getAttributes();

  @Nullable
  ValaClassDeclaration getClassDeclaration();

  @Nullable
  ValaConstantDeclaration getConstantDeclaration();

  @Nullable
  ValaConstructorDeclaration getConstructorDeclaration();

  @Nullable
  ValaCreationMethodDeclaration getCreationMethodDeclaration();

  @Nullable
  ValaDelegateDeclaration getDelegateDeclaration();

  @Nullable
  ValaDestructorDeclaration getDestructorDeclaration();

  @Nullable
  ValaEnumDeclaration getEnumDeclaration();

  @Nullable
  ValaFieldDeclaration getFieldDeclaration();

  @Nullable
  ValaMethodDeclaration getMethodDeclaration();

  @Nullable
  ValaPropertyDeclaration getPropertyDeclaration();

  @Nullable
  ValaSignalDeclaration getSignalDeclaration();

  @Nullable
  ValaStructDeclaration getStructDeclaration();

}
