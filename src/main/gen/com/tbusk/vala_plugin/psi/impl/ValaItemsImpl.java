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

public class ValaItemsImpl extends ASTWrapperPsiElement implements ValaItems {

  public ValaItemsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitItems(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getBlockComment() {
    return findChildByType(BLOCK_COMMENT);
  }

  @Override
  @Nullable
  public PsiElement getCharLiteral() {
    return findChildByType(CHAR_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getComment() {
    return findChildByType(COMMENT);
  }

  @Override
  @Nullable
  public PsiElement getConstant() {
    return findChildByType(CONSTANT);
  }

  @Override
  @Nullable
  public PsiElement getDocComment() {
    return findChildByType(DOC_COMMENT);
  }

  @Override
  @Nullable
  public PsiElement getEmpty() {
    return findChildByType(EMPTY);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getMethodCall() {
    return findChildByType(METHOD_CALL);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

  @Override
  @Nullable
  public PsiElement getStringLiteral() {
    return findChildByType(STRING_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getWhitespace() {
    return findChildByType(WHITESPACE);
  }

}
