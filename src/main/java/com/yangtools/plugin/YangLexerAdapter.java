package com.yangtools.plugin;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import java.io.Reader;
import org.jetbrains.annotations.NotNull;

public class YangLexerAdapter extends FlexAdapter {

  public YangLexerAdapter() {
    super(new YangLexer((Reader) null));
  }
}
