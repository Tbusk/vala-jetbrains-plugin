// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.vala.jetbrains.parser.psi.ValaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import dev.vala.jetbrains.parser.psi.*;
import dev.vala.jetbrains.psi.ValaPsiImplUtil;

public class ValaInterfaceMemberImpl extends ASTWrapperPsiElement implements ValaInterfaceMember {

  public ValaInterfaceMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitInterfaceMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ValaAttributes> getAttributesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaAttributes.class);
  }

  @Override
  @Nullable
  public ValaClassDeclaration getClassDeclaration() {
    return findChildByClass(ValaClassDeclaration.class);
  }

  @Override
  @Nullable
  public ValaConstantDeclarations getConstantDeclarations() {
    return findChildByClass(ValaConstantDeclarations.class);
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
  public ValaFieldDeclaration getFieldDeclaration() {
    return findChildByClass(ValaFieldDeclaration.class);
  }

  @Override
  @Nullable
  public ValaInterfaceDeclaration getInterfaceDeclaration() {
    return findChildByClass(ValaInterfaceDeclaration.class);
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

  @Override
  @Nullable
  public ValaSignalDeclaration getSignalDeclaration() {
    return findChildByClass(ValaSignalDeclaration.class);
  }

  @Override
  @Nullable
  public ValaStructDeclaration getStructDeclaration() {
    return findChildByClass(ValaStructDeclaration.class);
  }

}
