package com.yangtools.plugin;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class YangFileTypeFactory extends FileTypeFactory {

  @Override
  public void createFileTypes(@NotNull FileTypeConsumer consumer) {
    consumer.consume(YangFileType.INSTANCE);
  }
}
