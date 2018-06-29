package com.yangtools.plugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class YangFileType extends LanguageFileType {

  public static final YangFileType INSTANCE = new YangFileType();

  private YangFileType() {
    super(YangLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Yang file";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "Yang language file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "yang";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return YangIcons.FILE;
  }
}
