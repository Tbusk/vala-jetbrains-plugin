// This is a generated file. Not intended for manual editing.
package dev.vala.jetbrains.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaYieldExpression extends PsiElement {

  @Nullable
  ValaBaseAccess getBaseAccess();

  @NotNull
  ValaMember getMember();

  @NotNull
  List<ValaMemberAccess> getMemberAccessList();

  @NotNull
  List<ValaMethodCall> getMethodCallList();

}
