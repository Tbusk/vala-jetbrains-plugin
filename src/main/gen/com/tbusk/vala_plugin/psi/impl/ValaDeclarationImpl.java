// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tbusk.vala_plugin.psi.ValaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.tbusk.vala_plugin.psi.*;

public class ValaDeclarationImpl extends ASTWrapperPsiElement implements ValaDeclaration {

  public ValaDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValaClassDeclaration getClassDeclaration() {
    return findChildByClass(ValaClassDeclaration.class);
  }

  @Override
  @Nullable
  public ValaDelegateDeclaration getDelegateDeclaration() {
    return findChildByClass(ValaDelegateDeclaration.class);
  }

  @Override
  @Nullable
  public ValaEnumDeclaration getEnumDeclaration() {
    return findChildByClass(ValaEnumDeclaration.class);
  }

  @Override
  @Nullable
  public ValaInterfaceDeclaration getInterfaceDeclaration() {
    return findChildByClass(ValaInterfaceDeclaration.class);
  }

  @Override
  @Nullable
  public ValaStructDeclaration getStructDeclaration() {
    return findChildByClass(ValaStructDeclaration.class);
  }

}
