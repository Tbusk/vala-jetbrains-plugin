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

public class ValaErrorcodeImpl extends ASTWrapperPsiElement implements ValaErrorcode {

  public ValaErrorcodeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitErrorcode(this);
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
  public ValaExpression getExpression() {
    return findChildByClass(ValaExpression.class);
  }

  @Override
  @NotNull
  public ValaIdentifier getIdentifier() {
    return findNotNullChildByClass(ValaIdentifier.class);
  }

}
