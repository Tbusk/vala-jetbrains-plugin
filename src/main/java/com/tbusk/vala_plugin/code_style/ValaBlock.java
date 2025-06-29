package com.tbusk.vala_plugin.code_style;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.TokenType;
import com.intellij.psi.formatter.common.AbstractBlock;
import com.intellij.psi.tree.IElementType;
import com.tbusk.vala_plugin.psi.ValaTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ValaBlock extends AbstractBlock {

    private final SpacingBuilder spacingBuilder;
    private final Indent indent;

    protected ValaBlock(@NotNull ASTNode node, @Nullable Wrap wrap, @Nullable Alignment alignment, Indent indent, SpacingBuilder spacingBuilder) {
        super(node, wrap, alignment);
        this.spacingBuilder = spacingBuilder;
        this.indent = indent;
    }

    @Override
    protected List<Block> buildChildren() {
        List<Block> blocks = new ArrayList<>();

        ASTNode child = myNode.getFirstChildNode();

        while (child != null) {
            if (child.getElementType() != TokenType.WHITE_SPACE) {
                Block block = new ValaBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        calculateAlignment(),
                        calculateChildIndent(child),
                        spacingBuilder
                );

                blocks.add(block);
            }

            child = child.getTreeNext();
        }

        return blocks;
    }

    private Alignment calculateAlignment() {
        IElementType parentType = myNode.getElementType();

        if (parentType == ValaTypes.PARAMETERS || parentType == ValaTypes.ARGUMENTS) {
            return Alignment.createAlignment();
        }

        return null;
    }

    @Override
    public @NotNull ChildAttributes getChildAttributes(int newChildIndex) {
        IElementType parentType = myNode.getElementType();

        if (parentType == ValaTypes.BLOCK) {
            return new ChildAttributes(Indent.getNormalIndent(), null);
        }

        if (parentType == ValaTypes.NAMESPACE_DECLARATION ||
                parentType == ValaTypes.INTERFACE_DECLARATION ||
                parentType == ValaTypes.CLASS_DECLARATION ||
                parentType == ValaTypes.ENUM_DECLARATION ||
                parentType == ValaTypes.STRUCT_DECLARATION ||
                parentType == ValaTypes.SIGNAL_DECLARATION ||
                parentType == ValaTypes.ERRORDOMAIN_DECLARATION ||
                parentType == ValaTypes.PROPERTY_DECLARATION ||
                parentType == ValaTypes.INITIALIZER ||
                parentType == ValaTypes.OBJECT_INITIALIZER) {
            return new ChildAttributes(Indent.getNormalIndent(), null);
        }

        return new ChildAttributes(Indent.getNoneIndent(), null);
    }

    @Override
    public Indent getIndent() {
        return indent;
    }

    private Indent calculateChildIndent(ASTNode child) {
        IElementType parentType = myNode.getElementType();
        IElementType childType = child.getElementType();

        if (parentType == ValaTypes.PREPROCESSOR_DIRECTIVE || childType == ValaTypes.PREPROCESSOR_DIRECTIVE) {
            return Indent.getAbsoluteNoneIndent();
        }

        if (parentType == ValaTypes.CLASS_DECLARATION && (childType == ValaTypes.COMMENT || childType == ValaTypes.BLOCK_COMMENT || childType == ValaTypes.DOC_COMMENT)) {
            return Indent.getNormalIndent();
        }

        if (parentType == ValaTypes.INITIALIZER && (childType == ValaTypes.ARGUMENT || childType == ValaTypes.COMMENT || childType == ValaTypes.DOC_COMMENT || childType == ValaTypes.BLOCK_COMMENT)) {
            return Indent.getNormalIndent();
        }

        if (parentType == ValaTypes.ERRORDOMAIN_DECLARATION && (childType != ValaTypes.SEMICOLON && childType != ValaTypes.RBRACE)) {
            return Indent.getNormalIndent();
        }

        if (parentType == ValaTypes.NAMESPACE_DECLARATION && (childType == ValaTypes.NAMESPACE_MEMBER || childType == ValaTypes.COMMENT || childType == ValaTypes.BLOCK_COMMENT || childType == ValaTypes.DOC_COMMENT)) {
            return Indent.getNormalIndent();
        }

        if (parentType == ValaTypes.CLASS_DECLARATION && (childType == ValaTypes.CLASS_MEMBER)) {
            return Indent.getNormalIndent();
        }

        if (parentType == ValaTypes.INTERFACE_DECLARATION && childType == ValaTypes.INTERFACE_MEMBER) {
            return Indent.getNormalIndent();
        }

        if (parentType == ValaTypes.STRUCT_DECLARATION && childType == ValaTypes.STRUCT_MEMBER) {
            return Indent.getNormalIndent();
        }

        if ((parentType == ValaTypes.CLASS_MEMBER || parentType == ValaTypes.NAMESPACE_MEMBER || parentType == ValaTypes.INTERFACE_MEMBER) && myNode.findChildByType(ValaTypes.ATTRIBUTES) != null) {
            return Indent.getNoneIndent();
        }

        if (parentType == ValaTypes.ENUM_DECLARATION &&
                (
                        childType == ValaTypes.METHOD_DECLARATION ||
                                childType == ValaTypes.ENUMVALUES ||
                                childType == ValaTypes.CONSTANT_DECLARATION
                )) {
            return Indent.getNormalIndent();
        }

        if (parentType == ValaTypes.SWITCH_SECTION && childType == ValaTypes.COLON) {
            return Indent.getNoneIndent();
        }

        if (parentType == ValaTypes.SWITCH_STATEMENT &&
                (childType == ValaTypes.SWITCH_SECTION)) {
            return Indent.getNormalIndent();
        }

        if ((parentType == ValaTypes.BLOCK || parentType == ValaTypes.EMBEDDED_STATEMENT_WITHOUT_BLOCK
        ) &&
                (childType != ValaTypes.LBRACE && childType != ValaTypes.RBRACE && childType != ValaTypes.SEMICOLON && childType != ValaTypes.BLOCK)) {
            return Indent.getNormalIndent();
        }

        if (parentType == ValaTypes.PROPERTY_DECLARATION && childType != ValaTypes.SEMICOLON && childType != ValaTypes.RBRACE) {
            return Indent.getNormalIndent();
        }

        if (parentType == ValaTypes.OBJECT_INITIALIZER && childType != ValaTypes.SEMICOLON && childType != ValaTypes.RBRACE) {
            return Indent.getNormalIndent();
        }

        if ((parentType == ValaTypes.METHOD_CALL) &&
                (childType == ValaTypes.ARGUMENTS || childType == ValaTypes.PARAMETERS)) {
            return Indent.getNormalIndent();
        }

        if ((parentType == ValaTypes.LOCAL_VARIABLE) &&
                (childType == ValaTypes.EXPRESSION)) {
            return Indent.getContinuationIndent();
        }

        return Indent.getNoneIndent();
    }

    @Override
    public @Nullable Spacing getSpacing(@Nullable Block firstBlock, @NotNull Block secondBlock) {
        return spacingBuilder.getSpacing(this, firstBlock, secondBlock);
    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null;
    }
}
