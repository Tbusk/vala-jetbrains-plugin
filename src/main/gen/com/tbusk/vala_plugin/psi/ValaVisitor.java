// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class ValaVisitor extends PsiElementVisitor {

  public void visitComments(@NotNull ValaComments o) {
    visitPsiElement(o);
  }

  public void visitIdentifiers(@NotNull ValaIdentifiers o) {
    visitPsiElement(o);
  }

  public void visitItems(@NotNull ValaItems o) {
    visitPsiElement(o);
  }

  public void visitKeywords(@NotNull ValaKeywords o) {
    visitPsiElement(o);
  }

  public void visitSymbols(@NotNull ValaSymbols o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
