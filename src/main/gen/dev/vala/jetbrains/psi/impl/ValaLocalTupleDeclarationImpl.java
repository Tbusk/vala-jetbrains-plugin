// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.vala.jetbrains.psi.ValaTypes.*;
import dev.vala.jetbrains.psi.ValaNamedElementImpl;
import dev.vala.jetbrains.psi.*;
import com.intellij.navigation.ItemPresentation;

public class ValaLocalTupleDeclarationImpl extends ValaNamedElementImpl implements ValaLocalTupleDeclaration {

  public ValaLocalTupleDeclarationImpl(@Nullable ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitLocalTupleDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ValaExpression getExpression() {
    return findNotNullChildByClass(ValaExpression.class);
  }

  @Override
  @NotNull
  public ValaMember getMember() {
    return findNotNullChildByClass(ValaMember.class);
  }

  @Override
  public String getName() {
    return ValaPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return ValaPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return ValaPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return ValaPsiImplUtil.getPresentation(this);
  }

}
