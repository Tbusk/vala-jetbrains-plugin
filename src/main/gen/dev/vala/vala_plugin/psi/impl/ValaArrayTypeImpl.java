// This is a generated file. Not intended for manual editing.
package dev.vala.vala_plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.vala.vala_plugin.psi.ValaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import dev.vala.vala_plugin.psi.*;

public class ValaArrayTypeImpl extends ASTWrapperPsiElement implements ValaArrayType {

  public ValaArrayTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitArrayType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ValaArraySize> getArraySizeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaArraySize.class);
  }

  @Override
  @NotNull
  public List<ValaExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaExpression.class);
  }

  @Override
  @NotNull
  public List<ValaMember> getMemberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaMember.class);
  }

}
