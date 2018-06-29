// This is a generated file. Not intended for manual editing.
package com.yangtools.plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.yangtools.plugin.psi.impl.*;

public interface YangTypes {

  IElementType PROPERTY = new YangElementType("PROPERTY");

  IElementType COMMENT = new YangTokenType("COMMENT");
  IElementType CRLF = new YangTokenType("CRLF");
  IElementType KEY = new YangTokenType("KEY");
  IElementType SEPARATOR = new YangTokenType("SEPARATOR");
  IElementType VALUE = new YangTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new YangPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
