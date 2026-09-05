// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.vala.jetbrains.parser.psi.ValaTypes.*;
import dev.vala.jetbrains.psi.ValaNamedElementImpl;
import dev.vala.jetbrains.parser.psi.*;
import dev.vala.jetbrains.psi.ValaPsiImplUtil;

public class ValaNamespaceDeclarationImpl extends ValaNamedElementImpl implements ValaNamespaceDeclaration {

  public ValaNamespaceDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitNamespaceDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ValaVisitor) accept((ValaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ValaNamespaceMember> getNamespaceMemberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaNamespaceMember.class);
  }

  @Override
  @NotNull
  public ValaSymbol getSymbol() {
    return findNotNullChildByClass(ValaSymbol.class);
  }

  @Override
  @NotNull
  public List<ValaUsingDirectives> getUsingDirectivesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaUsingDirectives.class);
  }

}
