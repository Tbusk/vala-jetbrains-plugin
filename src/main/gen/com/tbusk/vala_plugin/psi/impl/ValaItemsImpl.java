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
  public ValaComments getComments() {
    return findChildByClass(ValaComments.class);
  }

  @Override
  @Nullable
  public ValaIdentifiers getIdentifiers() {
    return findChildByClass(ValaIdentifiers.class);
  }

  @Override
  @Nullable
  public ValaKeywords getKeywords() {
    return findChildByClass(ValaKeywords.class);
  }

  @Override
  @Nullable
  public ValaSymbols getSymbols() {
    return findChildByClass(ValaSymbols.class);
  }

}
