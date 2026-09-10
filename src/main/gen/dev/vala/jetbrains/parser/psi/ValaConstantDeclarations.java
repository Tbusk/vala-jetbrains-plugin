// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaConstantDeclarations extends PsiElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @NotNull
  List<ValaConstantDeclaration> getConstantDeclarationList();

  @Nullable
  ValaInlineArrayType getInlineArrayType();

  @Nullable
  ValaMemberDeclarationModifiers getMemberDeclarationModifiers();

  @NotNull
  ValaType getType();

}
