// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.vala.jetbrains.psi.ValaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import dev.vala.jetbrains.psi.*;

public class ValaStructMemberImpl extends ASTWrapperPsiElement implements ValaStructMember {

  public ValaStructMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitStructMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValaAttributes getAttributes() {
    return findChildByClass(ValaAttributes.class);
  }

  @Override
  @Nullable
  public ValaConstantDeclaration getConstantDeclaration() {
    return findChildByClass(ValaConstantDeclaration.class);
  }

  @Override
  @Nullable
  public ValaCreationMethodDeclaration getCreationMethodDeclaration() {
    return findChildByClass(ValaCreationMethodDeclaration.class);
  }

  @Override
  @Nullable
  public ValaFieldDeclaration getFieldDeclaration() {
    return findChildByClass(ValaFieldDeclaration.class);
  }

  @Override
  @Nullable
  public ValaMethodDeclaration getMethodDeclaration() {
    return findChildByClass(ValaMethodDeclaration.class);
  }

  @Override
  @Nullable
  public ValaPropertyDeclaration getPropertyDeclaration() {
    return findChildByClass(ValaPropertyDeclaration.class);
  }

}
