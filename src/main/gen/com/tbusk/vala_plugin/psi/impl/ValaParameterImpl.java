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

public class ValaParameterImpl extends ASTWrapperPsiElement implements ValaParameter {

  public ValaParameterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitParameter(this);
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
  public ValaExpression getExpression() {
    return findChildByClass(ValaExpression.class);
  }

  @Override
  @Nullable
  public ValaInlineArrayType getInlineArrayType() {
    return findChildByClass(ValaInlineArrayType.class);
  }

  @Override
  @Nullable
  public ValaType getType() {
    return findChildByClass(ValaType.class);
  }

  @Override
  @Nullable
  public ValaValidIdentifierKeywords getValidIdentifierKeywords() {
    return findChildByClass(ValaValidIdentifierKeywords.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
