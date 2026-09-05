// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaEnumMember extends PsiElement {

  @NotNull
  List<ValaAttributes> getAttributesList();

  @Nullable
  ValaConstantDeclarations getConstantDeclarations();

  @Nullable
  ValaMethodDeclaration getMethodDeclaration();

}
