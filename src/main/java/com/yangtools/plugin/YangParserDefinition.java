package com.yangtools.plugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.yangtools.plugin.parser.YangParser;
import com.yangtools.plugin.psi.YangFile;
import com.yangtools.plugin.psi.YangTypes;
import org.jetbrains.annotations.NotNull;

public class YangParserDefinition implements ParserDefinition {

  public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
  public static final TokenSet COMMENTS = TokenSet.create(YangTypes.COMMENT);

  public static final IFileElementType FILE = new IFileElementType(YangLanguage.INSTANCE);

  @NotNull
  @Override
  public Lexer createLexer(Project project) {
    return new YangLexerAdapter();
  }

  @NotNull
  @Override
  public TokenSet getWhitespaceTokens() {
    return WHITE_SPACES;
  }

  @NotNull
  public TokenSet getCommentTokens() {
    return COMMENTS;
  }

  @NotNull
  public TokenSet getStringLiteralElements() {
    return TokenSet.EMPTY;
  }

  @NotNull
  public PsiParser createParser(final Project project) {
    return new YangParser();
  }

  @Override
  public IFileElementType getFileNodeType() {
    return FILE;
  }

  public PsiFile createFile(FileViewProvider viewProvider) {
    return new YangFile(viewProvider);
  }

  public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
    return SpaceRequirements.MAY;
  }

  @NotNull
  public PsiElement createElement(ASTNode node) {
    return YangTypes.Factory.createElement(node);
  }

}
