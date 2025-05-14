package com.tbusk.vala_plugin;

import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.psi.ValaTypes;

public interface ValaTokenSets {

    TokenSet COMMENTS = TokenSet.create(ValaTypes.LINE_COMMENT, ValaTypes.BLOCK_COMMENT, ValaTypes.DOC_COMMENT);

}
