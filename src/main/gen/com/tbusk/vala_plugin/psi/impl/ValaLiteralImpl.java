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

public class ValaLiteralImpl extends ASTWrapperPsiElement implements ValaLiteral {

  public ValaLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValaOpenRegexLiteral getOpenRegexLiteral() {
    return findChildByClass(ValaOpenRegexLiteral.class);
  }

  @Override
  @Nullable
  public ValaRegexLiteral getRegexLiteral() {
    return findChildByClass(ValaRegexLiteral.class);
  }

  @Override
  @Nullable
  public PsiElement getCharLiteral() {
    return findChildByType(CHAR_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getDecimalLiteral() {
    return findChildByType(DECIMAL_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getIntegerLiteral() {
    return findChildByType(INTEGER_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getStringLiteral() {
    return findChildByType(STRING_LITERAL);
  }

}
