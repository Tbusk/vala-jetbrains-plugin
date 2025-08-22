# Tokens

Found in `valatokentype.vala`

## Keywords and Identifiers

TokenType.AS = 'as'  
TokenType.BASE = 'base'  
TokenType.BREAK = 'break'  
TokenType.CASE = 'case'  
TokenType.CATCH = 'catch'  
TokenType.CONST = 'const'  
TokenType.CONSTRUCT = 'construct'  
TokenType.CONTINUE = 'continue'  
TokenType.DEFAULT = 'default'  
TokenType.DELEGATE = 'delegate'  
TokenType.DELETE = 'delete'  
TokenType.DO = 'do'  
TokenType.DYNAMIC = 'dynamic'  
TokenType.ELSE = 'else'  
TokenType.ENUM = 'enum'  
TokenType.ENSURES = 'ensures'  
TokenType.ERRORDOMAIN = 'errordomain'  
TokenType.FALSE = 'false'  
TokenType.FINALLY = 'finally'  
TokenType.FOR = 'for'  
TokenType.FOREACH = 'foreach'  
TokenType.GET = 'get'  
TokenType.IF = 'if'  
TokenType.IN = 'in'  
TokenType.INTERFACE = 'interface'  
TokenType.INTERNAL = 'internal'  
TokenType.IS = 'is'  
TokenType.LOCK = 'lock'  
TokenType.NAMESPACE = 'namespace'  
TokenType.NULL = 'null'  
TokenType.OUT = 'out'  
TokenType.OWNED = 'owned'  
TokenType.PRIVATE = 'private'  
TokenType.PROTECTED = 'protected'  
TokenType.PUBLIC = 'public'  
TokenType.REF = 'ref'  
TokenType.REQUIRES = 'requires'  
TokenType.RETURN = 'return'  
TokenType.SET = 'set'  
TokenType.SIGNAL = 'signal'  
TokenType.SIZEOF = 'sizeof'  
TokenType.STRUCT = 'struct'  
TokenType.SWITCH = 'switch'  
TokenType.THIS = 'this'  
TokenType.THROW = 'throw'  
TokenType.THROWS = 'throws'  
TokenType.TRUE = 'true'  
TokenType.TRY = 'try'  
TokenType.TYPEOF = 'typeof'  
TokenType.UNLOCK = 'unlock'  
TokenType.UNOWNED = 'unowned'  
TokenType.USING = 'using'  
TokenType.VAR = 'var'  
TokenType.VOID = 'void'  
TokenType.VOLATILE = 'volatile'  
TokenType.WEAK = 'weak'  
TokenType.WHILE = 'while'  
TokenType.WITH = 'with'  
TokenType.YIELD = 'yield'

### Declaration Keywords

TokenType.CLASS = 'class'

### Modifiers

`enum ModifierFlags`  
TokenType.NONE = '0'  
TokenType.ABSTRACT = 'abstract'  
TokenType.CLASS = 'class'  
TokenType.EXTERN = 'extern'  
TokenType.INLINE = 'inline'  
TokenType.NEW = 'new'  
TokenType.OVERRIDE = 'override'  
TokenType.STATIC = 'static'  
TokenType.VIRTUAL 'virtual'  
TokenType.ASYNC = 'async'  
TokenType.SEALED = 'sealed'  
TokenType.PARTIAL = 'partial'

## Operators

TokenType.PLUS = '+'  
TokenType.MINUS = '-'  
TokenType.STAR = '*'  
TokenType.DIV = '/'  
TokenType.PERCENT = '%'  
(increment)  
TokenType.OP_INC = '++'  
(decrement)  
TokenType.OP_DEC = '--'  
(less than)  
TokenType.OP_LT = '<'  
(greater than)  
TokenType.OP_GT = '>'  
(less than or equal to)  
TokenType.OP_LE = '<='  
(greater than or equal to)  
TokenType.OP_GE = '>='  
(equal to)  
TokenType.OP_EQ = '=='   
(not equal to)  
TokenType.OP_NE = '!='  
(not)  
TokenType.OP_NEG = '!'  
(and)  
TokenType.OP_AND = '&&'  
(or)  
TokenType.OP_OR = '||'  
(coalescing operator)  
TokenType.OP_COALESCING = '??'  
(bitwise shift left)  
TokenType.OP_SHIFT_LEFT = '<<'  
(pointer operator)  
TokenType.OP_PTR = '->'  
TokenType.BITWISE_AND = '&'  
TokenType.BITWISE_OR = '|'

## Assignment Operators

TokenType.ASSIGN = '='

TokenType.ASSIGN_ADD = '+='  
TokenType.ASSIGN_SUB = '-='  
TokenType.ASSIGN_MUL = '*='  
TokenType.ASSIGN_DIV = '/='

TokenType.ASSIGN_PERCENT = '%='  
TokenType.ASSIGN_BITWISE_AND = '&='  
TokenType.ASSIGN_BITWISE_OR = '|='  
TokenType.ASSIGN_BITWISE_XOR = '^='  
TokenType.ASSIGN_SHIFT_LEFT = '<<='  
(not in source?)
TokenType.ASSIGN_SHIFT_RIGHT = '>>='

## Punctuation and Delimiters

TokenType.OPEN_PARENS = '('  
TokenType.CLOSE_PARENS = ')'  
TokenType.OPEN_BRACKET = '['  
TokenType.CLOSE_BRACKET = ']'  
TokenType.OPEN_BRACE = '{'  
TokenType.CLOSE_BRACE = '}'  
TokenType.SEMICOLON = ';'  
TokenType.COMMA = ','  
TokenType.COLON = ':'  
TokenType.DOT = '.'  
TokenType.DOUBLE_COLON = '::'  
TokenType.INTERR = '?'  
TokenType.LAMBDA = '=>'  
TokenType.HASH = '#'  
TokenType.ELLIPSIS = '...'  
TokenType.CARRET = '^'  
TokenType.TILDE = '~'

## Literals

TokenType.INTEGER_LITERAL  
TokenType.REAL_LITERAL  
TokenType.CHARACTER_LITERAL  
TokenType.STRING_LITERAL  
TokenType.TEMPLATE_STRING_LITERAL  
TokenType.VERBATIM_STRING_LITERAL  
TokenType.VERBATIM_TEMPLATE_STRING_LITERAL  
TokenType.REGEX_LITERAL

## Special Tokens

(usecase unknown)  
TokenType.EOF  
TokenType.OPEN_TEMPLATE  
TokenType.CLOSE_TEMPLATE  
TokenType.IDENTIFIER  
TokenType.PARAMS  
TokenType.OPEN_REGEX_LITERAL  
TokenType.CLOSE_REGEX_LITERAL  