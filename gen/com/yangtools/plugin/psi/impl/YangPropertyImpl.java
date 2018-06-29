// This is a generated file. Not intended for manual editing.
package com.yangtools.plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.yangtools.plugin.psi.YangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.yangtools.plugin.psi.*;

public class YangPropertyImpl extends ASTWrapperPsiElement implements YangProperty {

  public YangPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

}
