// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaPropertyAccessor extends PsiElement {

  @Nullable
  ValaAccessModifier getAccessModifier();

  @Nullable
  ValaAttributes getAttributes();

  @Nullable
  ValaPropertyConstructAccessor getPropertyConstructAccessor();

  @Nullable
  ValaPropertyGetAccessor getPropertyGetAccessor();

  @Nullable
  ValaPropertySetAccessor getPropertySetAccessor();

}
