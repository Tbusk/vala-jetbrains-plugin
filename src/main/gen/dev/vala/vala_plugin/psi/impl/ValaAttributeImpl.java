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

public class ValaAttributeImpl extends ASTWrapperPsiElement implements ValaAttribute {

  public ValaAttributeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitAttribute(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ValaAttributeArguments> getAttributeArgumentsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaAttributeArguments.class);
  }

  @Override
  @NotNull
  public List<ValaIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaIdentifier.class);
  }

}
