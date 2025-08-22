# Delegate Declaration

## Access Modifiers

TokenType.PRIVATE = 'private'  
TokenType.PROTECTED = 'protected'  
TokenType.INTERNAL = 'internal'  
TokenType.PUBLIC = 'public'

## Declaration Modifiers

TokenTypes.ABSTRACT = 'abstract'  
TokenTypes.ASYNC = 'async'  
TokenTypes.CLASS = 'class'  
TokenTypes.EXTERN = 'extern'  
TokenTypes.INLINE = 'inline'  
TokenTypes.OVERRIDE = 'override'  
TokenTypes.SEALED = 'sealed'  
TokenTypes.STATIC = 'static'  
TokenTypes.VIRTUAL = 'virtual'

## Token

TokenType.DELEGATE = 'delegate'

## Symbol (Identifier)

TokenType.IDENTIFIER  
can contain global::IDENTIFIER

## Example Usage

```vala
virtual delegate int Compare (string a, string b);
```

## Description

Delegates are used to declare a type that can be used to call a method.

## BNF Syntax

```bnf
delegate_declaration ::= [ delegate_access_modifiers ] [ delegate_declaration_modifiers ] delegate type symbol [ type_parameters ]
                         LPAREN [ parameters ] RPAREN [ throws_statement ] SEMICOLON

delegate_access_modifiers ::= private | protected | internal | public

delegate_declaration_modifiers ::= delegate_declaration_modifier [ ( delegate_declaration_modifier)* ]
delegate_declaration_modifier ::= abstract | async | class | extern | inline | override | sealed | static | virtual
```

## Notes

Using static is deprecated.  
New is not permitted as a modifier. 