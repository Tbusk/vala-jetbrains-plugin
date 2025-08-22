# Error Domain Declaration

## Access Modifiers

TokenType.PRIVATE = 'private'  
TokenType.PROTECTED = 'protected'  
TokenType.INTERNAL = 'internal'  
TokenType.PUBLIC = 'public'

## Type Declaration Modifiers

TokenType.EXTERN = 'extern'  
TokenType.ABSTRACT = 'abstract'  
TokenType.PARTIAL = 'partial'  
TokenType.SEALED = 'sealed'

## Token

TokenType.ERRORDOMAIN = 'errordomain'

## Symbol (Identifier)

TokenType.IDENTIFIER  
can contain global::IDENTIFIER

## Example Usage

```vala
private errordomain ExampleErrorDomain {
    EXAMPLE_CODE,
    EXAMPLE_CODE_2 = 1;
}
```

## Description

Error domains are used to group error codes together.  
Error codes are enum values which can have anything assigned to them.  
They can also have attributes.

## BNF Syntax

```bnf
errordomain_declaration ::= [ errordomain_access_modifier ] [ errordomain_type_declaration_modifiers ] errordomain symbol
                            LBRACE errorcodes [ SEMICOLON method_declaration*] RBRACE

errordomain_access_modifier ::= private | public | protected | internal

errordomain_type_declaration_modifiers ::= extern | abstract | partial | sealed

errorcodes ::= errorcode [ (COMMA errorcode)* [ COMMA ] ]
errorcode ::= [ attributes ] IDENTIFIER [ EQUALS expression ]
```

## Notes

Method declarations need to be static and have a body.