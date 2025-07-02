package com.tbusk.vala_plugin;

import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.psi.ValaTypes;

import static com.tbusk.vala_plugin.psi.ValaTypes.STRING_LITERAL;

public interface ValaTokenSets {

    // Token Sets
    TokenSet COMMENTS = TokenSet.create(
            ValaTypes.COMMENT,
            ValaTypes.DOC_COMMENT,
            ValaTypes.BLOCK_COMMENT,
            ValaTypes.PREPROCESSOR_DIRECTIVE
    );

    TokenSet STRINGS = TokenSet.create(
            STRING_LITERAL
    );

    TokenSet KEYWORDS = TokenSet.create(

            // Types
            ValaTypes.BOOL,
            ValaTypes.INT,
            ValaTypes.UINT,
            ValaTypes.LONG,
            ValaTypes.ULONG,
            ValaTypes.FLOAT,
            ValaTypes.DOUBLE,
            ValaTypes.STRING,
            ValaTypes.CHAR,
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
            ValaTypes.SIZE_T,
            ValaTypes.SSIZE_T,
            ValaTypes.VAR,
            ValaTypes.VOID,

            // Values
            ValaTypes.NULL,
            ValaTypes.TRUE,
            ValaTypes.FALSE,

            // If, Elif, Else, Endif
            ValaTypes.IF,
            ValaTypes.ELSE,

            // Do, While
            ValaTypes.DO,
            ValaTypes.WHILE,

            // For, Foreach
            ValaTypes.FOR,
            ValaTypes.FOREACH,

            // Data Structures
            ValaTypes.CLASS,
            ValaTypes.STRUCT,
            ValaTypes.ENUM,
            ValaTypes.INTERFACE,

            // Switch, Case, Default, Finally
            ValaTypes.SWITCH,
            ValaTypes.CASE,
            ValaTypes.DEFAULT,
            ValaTypes.FINALLY,

            // Modifiers
            ValaTypes.CONST,
            ValaTypes.CONSTRUCT,
            ValaTypes.OVERRIDE,
            ValaTypes.UNOWNED,
            ValaTypes.OWNED,
            ValaTypes.ABSTRACT,
            ValaTypes.VIRTUAL,
            ValaTypes.STATIC,
            ValaTypes.ASYNC,
            ValaTypes.REF,
            ValaTypes.OUT,

            // Access Modifiers
            ValaTypes.PUBLIC,
            ValaTypes.PRIVATE,
            ValaTypes.PROTECTED,
            ValaTypes.INTERNAL,

            // Try, Catch, Throw, Throws
            ValaTypes.TRY,
            ValaTypes.CATCH,
            ValaTypes.THROW,
            ValaTypes.THROWS,

            // Misc Keywords
            ValaTypes.RETURN,
            ValaTypes.BREAK,
            ValaTypes.CONTINUE,
            ValaTypes.USING,
            ValaTypes.NAMESPACE,
            ValaTypes.NEW,
            ValaTypes.THIS,
            ValaTypes.DELETE,
            ValaTypes.IN,
            ValaTypes.YIELD,
            ValaTypes.BASE,
            ValaTypes.SIGNAL,
            ValaTypes.ERRORDOMAIN,
            ValaTypes.REQUIRES,
            ValaTypes.ENSURES,
            ValaTypes.LOCK,
            ValaTypes.WEAK,
            ValaTypes.EXTERN,
            ValaTypes.PREPROCESSOR_IF,
            ValaTypes.PREPROCESSOR_ELIF,
            ValaTypes.PREPROCESSOR_ELSE,
            ValaTypes.PREPROCESSOR_ENDIF,
            ValaTypes.INLINE,
            ValaTypes.DELEGATE
    );
}
