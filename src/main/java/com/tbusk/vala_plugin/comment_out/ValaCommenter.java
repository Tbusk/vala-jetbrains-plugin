package com.tbusk.vala_plugin.comment_out;

import com.intellij.lang.Commenter;
import org.jetbrains.annotations.Nullable;

/**
 * ValaCommenter is a class that implements the Commenter interface to provide
 * a way to handle commenting-out and uncommenting code in Vala files.
 * <br/>
 * <a href="https://plugins.jetbrains.com/docs/intellij/commenter.html">view docs</a>
 */
public class ValaCommenter implements Commenter {

    /**
     * Returns the string that prefixes a line comment in the language, or null if the language
     * does not support line comments. If the language supports several prefixes for line comments,
     * only one of them (the most recommended to use) is returned. Use {@link #getLineCommentPrefixes()}
     * to get all supported line comment prefixes.
     *
     * @return the line comment text, or null.
     */
    @Override
    public @Nullable String getLineCommentPrefix() {
        return "//";
    }

    /**
     * Returns the string which marks the beginning of a block comment in the language,
     * or null if the language does not support block comments.
     *
     * @return the block comment start text, or null.
     */
    @Override
    public @Nullable String getBlockCommentPrefix() {
        return "/*";
    }

    /**
     * Returns the string which marks the end of a block comment in the language,
     * or null if the language does not support block comments.
     *
     * @return the block comment end text, or null.
     */
    @Override
    public @Nullable String getBlockCommentSuffix() {
        return "*/";
    }

    /**
     * Returns the string which marks the commented beginning of a block comment in the language,
     * or null if the language does not support block comments.
     *
     * @return the commented block comment start text, or null.
     */
    @Override
    public @Nullable String getCommentedBlockCommentPrefix() {
        return "/*";
    }

    /**
     * Returns the string which marks the commented end of a block comment in the language,
     * or null if the language does not support block comments.
     *
     * @return the commented block comment end text, or null.
     */
    @Override
    public @Nullable String getCommentedBlockCommentSuffix() {
        return "*/";
    }
}