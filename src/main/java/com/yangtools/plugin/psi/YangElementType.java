package com.yangtools.plugin.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import com.yangtools.plugin.YangLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class YangElementType extends IElementType {

  public YangElementType(@NotNull @NonNls String debugName) {
    super(debugName, YangLanguage.INSTANCE);
  }
}
