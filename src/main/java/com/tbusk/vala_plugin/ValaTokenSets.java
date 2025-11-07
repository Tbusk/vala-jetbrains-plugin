package com.tbusk.vala_plugin;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.psi.ValaTypes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

            // Selection
            ValaTypes.IF,
            ValaTypes.ELSE,
            ValaTypes.SWITCH,
            ValaTypes.CASE,
            ValaTypes.DEFAULT,

            // Iteration
            ValaTypes.DO,
            ValaTypes.WHILE,
            ValaTypes.FOR,
            ValaTypes.FOREACH,
            ValaTypes.IN,

            // Jumping
            ValaTypes.BREAK,
            ValaTypes.CONTINUE,
            ValaTypes.RETURN,

            // Exception Handling
            ValaTypes.TRY,
            ValaTypes.CATCH,
            ValaTypes.THROW,
            ValaTypes.FINALLY,

            // Synchronization
            ValaTypes.LOCK,
            ValaTypes.UNLOCK,

            // Type Declaration
            ValaTypes.CLASS,
            ValaTypes.INTERFACE,
            ValaTypes.STRUCT,
            ValaTypes.ENUM,
            ValaTypes.DELEGATE,
            ValaTypes.ERRORDOMAIN,

            // Type Modifiers
            ValaTypes.CONST,
            ValaTypes.WEAK,
            ValaTypes.UNOWNED,
            ValaTypes.DYNAMIC,

            // Modifiers
            ValaTypes.ABSTRACT,
            ValaTypes.VIRTUAL,
            ValaTypes.OVERRIDE,
            ValaTypes.SIGNAL,
            ValaTypes.EXTERN,
            ValaTypes.STATIC,
            ValaTypes.ASYNC,
            ValaTypes.INLINE,
            ValaTypes.NEW,
            ValaTypes.SEALED,
            ValaTypes.PARTIAL,

            // Access Modifiers
            ValaTypes.PUBLIC,
            ValaTypes.PRIVATE,
            ValaTypes.PROTECTED,
            ValaTypes.INTERNAL,

            // Method Parameters
            ValaTypes.OUT,
            ValaTypes.REF,
            // ValaTypes.IN, is also included

            // Method Contract Keywords
            ValaTypes.THROWS,
            ValaTypes.REQUIRES,
            ValaTypes.ENSURES,

            // Namespaces
            ValaTypes.NAMESPACE,
            ValaTypes.USING,

            // Operator Keywords
            ValaTypes.AS,
            ValaTypes.IS,
            //ValaTypes.IN,
            //ValaTypes.NEW,
            ValaTypes.DELETE,
            ValaTypes.SIZEOF,
            ValaTypes.TYPEOF,

            // Access Keywords
            ValaTypes.THIS,
            ValaTypes.BASE,

            // Literal Keywords
            ValaTypes.NULL,
            ValaTypes.TRUE,
            ValaTypes.FALSE,

            // Property Context
            ValaTypes.GET,
            ValaTypes.SET,
            ValaTypes.CONSTRUCT,

            // Other Keywords
            ValaTypes.VOID,
            ValaTypes.VAR,
            ValaTypes.YIELD,
            ValaTypes.GLOBAL,
            ValaTypes.OWNED,
            ValaTypes.WITH,
            ValaTypes.PARAMS,

            // Preprocessor
            ValaTypes.PREPROCESSOR_IF,
            ValaTypes.PREPROCESSOR_ELIF,
            ValaTypes.PREPROCESSOR_ELSE,
            ValaTypes.PREPROCESSOR_ENDIF
    );

    Set<IElementType> KEYWORD_SET = Arrays.stream(KEYWORDS.getTypes())
            .collect(Collectors.toCollection(HashSet::new));
}
