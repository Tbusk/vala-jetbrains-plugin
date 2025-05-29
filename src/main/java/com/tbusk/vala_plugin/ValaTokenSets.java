package com.tbusk.vala_plugin;

import com.intellij.psi.tree.TokenSet;
import com.tbusk.vala_plugin.psi.ValaTypes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
            ValaTypes.VAR,
            ValaTypes.VOID,

            // Values
            ValaTypes.NULL,
            ValaTypes.TRUE,
            ValaTypes.FALSE,

            // If, Elif, Else, Endif
            ValaTypes.IF,
            ValaTypes.ELIF,
            ValaTypes.ENDIF,
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
            ValaTypes.HASHMAP,
            ValaTypes.OBJECT,

            // Switch, Case, Default
            ValaTypes.SWITCH,
            ValaTypes.CASE,
            ValaTypes.DEFAULT,

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
            ValaTypes.ASSERT,
            ValaTypes.NEW,
            ValaTypes.THIS,
            ValaTypes.DELETE,
            ValaTypes.IN,
            ValaTypes.YIELD,
            ValaTypes.BASE,
            ValaTypes.IS,
            ValaTypes.AS,
            ValaTypes.TYPEOF,
            ValaTypes.CCODE,
            ValaTypes.DELEGATE,
            ValaTypes.SIGNAL,
            ValaTypes.ERRORDOMAIN,
            ValaTypes.REQUIRES,
            ValaTypes.ENSURES,
            ValaTypes.LOCK,
            ValaTypes.WEAK,
            ValaTypes.EXTERN
    );

    Set<String> KEYWORDS_STRINGS = new HashSet<>(
            List.of("bool",
                    "int",
                    "uint",
                    "long",
                    "ulong",
                    "float",
                    "double",
                    "string",
                    "char",
                    "uchar",
                    "unichar",
                    "short",
                    "ushort",
                    "uint8",
                    "uint16",
                    "uint32",
                    "uint64",
                    "int8",
                    "int16",
                    "int32",
                    "int64",

                    // Values
                    "null",
                    "true",
                    "false",

                    // If, Elif, Else, Endif
                    "if",
                    "elif",
                    "endif",
                    "else",

                    // Do, While
                    "do",
                    "while",

                    // For, Foreach
                    "for",
                    "foreach",

                    // Data Structures
                    "class",
                    "struct",
                    "enum",
                    "interface",
                    "HashMap",
                    "Object",

                    // Switch, Case, Default
                    "switch",
                    "case",
                    "default",

                    // Modifiers
                    "const",
                    "construct",
                    "override",
                    "unowned",
                    "owned",
                    "abstract",
                    "virtual",
                    "static",

                    // Access Modifiers
                    "public",
                    "private",
                    "protected",
                    "internal",

                    // Try, Catch, Throw, Throws
                    "try",
                    "catch",
                    "throw",
                    "throws",

                    // Misc Keywords
                    "async",
                    "return",
                    "break",
                    "continue",
                    "using",
                    "namespace",
                    "assert",
                    "new",
                    "this",
                    "delete",
                    "in",
                    "yield",
                    "base",
                    "is",
                    "as",
                    "typeof",
                    "CCode",
                    "delegate",
                    "signal",
                    "errordomain",
                    "requires",
                    "ensures",
                    "lock",
                    "weak",
                    "extern"
            )
    );
}
