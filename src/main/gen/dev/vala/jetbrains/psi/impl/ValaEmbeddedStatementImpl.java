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

public class ValaEmbeddedStatementImpl extends ASTWrapperPsiElement implements ValaEmbeddedStatement {

  public ValaEmbeddedStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitEmbeddedStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ValaBlock getBlock() {
    return findChildByClass(ValaBlock.class);
  }

  @Override
  @Nullable
  public ValaEmbeddedStatementWithoutBlock getEmbeddedStatementWithoutBlock() {
    return findChildByClass(ValaEmbeddedStatementWithoutBlock.class);
  }

}
