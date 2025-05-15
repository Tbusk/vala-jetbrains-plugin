package com.tbusk.vala_plugin;

import com.intellij.psi.tree.TokenSet;

import static com.tbusk.vala_plugin.psi.ValaTypes.*;

public interface ValaTokenSets {

    // Token Sets
    TokenSet COMMENTS = TokenSet.create(COMMENT, BLOCK_COMMENT, DOC_COMMENT);
    TokenSet STRINGS = TokenSet.create(STRING);
}
