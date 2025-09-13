// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaObjectOrArrayCreationExpression extends PsiElement {

  @Nullable
  ValaArrayCreationExpression getArrayCreationExpression();

  @Nullable
  ValaMember getMember();

  @Nullable
  ValaObjectCreationExpression getObjectCreationExpression();

  @Nullable
  ValaType getType();

  @Nullable
  ValaTypeWeak getTypeWeak();

  @Nullable
  ValaTypeWeakWithParenthesis getTypeWeakWithParenthesis();

  @Nullable
  ValaTypeWithParameters getTypeWithParameters();

}
