package com.tbusk.vala_plugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.psi.ValaTypes;
import language.ValaFile;
import language.ValaLanguage;
import org.jetbrains.annotations.NotNull;

public class ValaParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(ValaLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new ValaLexerAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new ValaParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode astNode) {
        return ValaTypes.Factory.createElement(astNode);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider fileViewProvider) {
        return new ValaFile(fileViewProvider);
    }
}
