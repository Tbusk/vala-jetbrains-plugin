package com.tbusk.vala_plugin;

import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.psi.ValaTypes;

import static com.tbusk.vala_plugin.psi.ValaTypes.*;

public interface ValaTokenSets {

    // Token Sets
    TokenSet COMMENTS = TokenSet.create(
            ValaTypes.COMMENT,
            ValaTypes.DOC_COMMENT,
            ValaTypes.BLOCK_COMMENT
    );

    TokenSet STRINGS = TokenSet.create(
            STRING_LITERAL
    );

    TokenSet KEYWORDS = TokenSet.create(
            ValaTypes.BOOL,
            ValaTypes.INT,
            ValaTypes.UINT,
            ValaTypes.LONG,
            ValaTypes.ULONG,
            ValaTypes.FLOAT,
            ValaTypes.DOUBLE,
            ValaTypes.STRING,
            ValaTypes.CHAR,
            ValaTypes.VOID,
            ValaTypes.UCHAR,
            ValaTypes.UNICHAR,
            ValaTypes.SHORT,
            ValaTypes.USHORT,
            ValaTypes.UINT8,
            ValaTypes.UINT16,
            ValaTypes.UINT32,
            ValaTypes.UINT64,
            ValaTypes.INT8,
            ValaTypes.INT16,
            ValaTypes.INT32,
            ValaTypes.INT64,
            ValaTypes.VAR,
            ValaTypes.NULL,
            ValaTypes.IF,
            ValaTypes.ELSE,
            ValaTypes.WHILE,
            ValaTypes.FOR,
            ValaTypes.RETURN,
            ValaTypes.BREAK,
            ValaTypes.CONTINUE,
            ValaTypes.SWITCH,
            ValaTypes.CASE,
            ValaTypes.DEFAULT,
            ValaTypes.USING,
            ValaTypes.NAMESPACE,
            ValaTypes.CONST,
            ValaTypes.ASSERT,
            ValaTypes.NEW,
            ValaTypes.THIS,
            ValaTypes.DELETE,
            ValaTypes.IN,
            ValaTypes.TRUE,
            ValaTypes.FALSE,
            ValaTypes.NULL,
            ValaTypes.CLASS,
            ValaTypes.STRUCT,
            ValaTypes.ENUM,
            ValaTypes.INTERFACE,
            ValaTypes.CONSTRUCT,
            ValaTypes.OVERRIDE,
            ValaTypes.UNOWNED,
            ValaTypes.OWNED,
            ValaTypes.ABSTRACT,
            ValaTypes.VIRTUAL,
            ValaTypes.STATIC,
            ValaTypes.PUBLIC,
            ValaTypes.PRIVATE,
            ValaTypes.PROTECTED,
            ValaTypes.DO,
            ValaTypes.TRY,
            ValaTypes.CATCH,
            ValaTypes.ASYNC
    );
}
