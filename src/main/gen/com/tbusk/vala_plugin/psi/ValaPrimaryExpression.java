// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaPrimaryExpression extends PsiElement {

  @Nullable
  ValaBaseAccess getBaseAccess();

  @NotNull
  List<ValaElementAccess> getElementAccessList();

  @Nullable
  ValaInitializer getInitializer();

  @Nullable
  ValaLiteral getLiteral();

  @NotNull
  List<ValaMemberAccess> getMemberAccessList();

  @NotNull
  List<ValaMethodCall> getMethodCallList();

  @Nullable
  ValaObjectOrArrayCreationExpression getObjectOrArrayCreationExpression();

  @NotNull
  List<ValaPointerMemberAccess> getPointerMemberAccessList();

  @NotNull
  List<ValaPostDecrementExpression> getPostDecrementExpressionList();

  @NotNull
  List<ValaPostIncrementExpression> getPostIncrementExpressionList();

  @Nullable
  ValaSimpleName getSimpleName();

  @Nullable
  ValaSizeofExpression getSizeofExpression();

  @Nullable
  ValaTemplate getTemplate();

  @Nullable
  ValaThisAccess getThisAccess();

  @Nullable
  ValaTuple getTuple();

  @Nullable
  ValaTypeofExpression getTypeofExpression();

  @Nullable
  ValaYieldExpression getYieldExpression();

}
