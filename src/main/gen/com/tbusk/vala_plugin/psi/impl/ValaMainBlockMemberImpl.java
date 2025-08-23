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

public class ValaMainBlockMemberImpl extends ASTWrapperPsiElement implements ValaMainBlockMember {

  public ValaMainBlockMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ValaVisitor visitor) {
    visitor.visitMainBlockMember(this);
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
  @NotNull
  public List<ValaClassDeclaration> getClassDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaClassDeclaration.class);
  }

  @Override
  @NotNull
  public List<ValaConstantDeclaration> getConstantDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaConstantDeclaration.class);
  }

  @Override
  @NotNull
  public List<ValaDelegateDeclaration> getDelegateDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaDelegateDeclaration.class);
  }

  @Override
  @NotNull
  public List<ValaEnumDeclaration> getEnumDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaEnumDeclaration.class);
  }

  @Override
  @NotNull
  public List<ValaErrordomainDeclaration> getErrordomainDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaErrordomainDeclaration.class);
  }

  @Override
  @NotNull
  public List<ValaFieldDeclaration> getFieldDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaFieldDeclaration.class);
  }

  @Override
  @NotNull
  public List<ValaInterfaceDeclaration> getInterfaceDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaInterfaceDeclaration.class);
  }

  @Override
  @NotNull
  public List<ValaMethodDeclaration> getMethodDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaMethodDeclaration.class);
  }

  @Override
  @NotNull
  public List<ValaNamespaceDeclaration> getNamespaceDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaNamespaceDeclaration.class);
  }

  @Override
  @NotNull
  public List<ValaStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaStatement.class);
  }

  @Override
  @NotNull
  public List<ValaStructDeclaration> getStructDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ValaStructDeclaration.class);
  }

}
