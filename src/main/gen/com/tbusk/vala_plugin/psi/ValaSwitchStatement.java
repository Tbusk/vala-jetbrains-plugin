// This is a generated file. Not intended for manual editing.
package com.tbusk.vala_plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ValaSwitchStatement extends PsiElement {

  @NotNull
  ValaExpression getExpression();

  @NotNull
  List<ValaSwitchSection> getSwitchSectionList();

}
