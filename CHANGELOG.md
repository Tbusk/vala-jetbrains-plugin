<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# vala-jetbrains-plugin Changelog

## [Unreleased]

### What's Changed

-

## [1.2.4-ALPHA]

### What's Changed

- Added coalescing token support
- Added support for named arguments/parameters
- Improved regular expression literal support
- Added support for numeric and numeric-prefix identifiers
- Added support for triple-quote string templates
- Added support for empty attribute arguments
- Added support for 'global::' prefix preceding symbol in types
- Added support for structs with primitive type identifiers
- Added support for constant declarations in embedded statements
- Added support for experimental local functions
- Added support for unowned usage in field declarations
- Fixed misc issues with comments overstepping regex
- Added support for multiple declarations in a single field declaration statement
- Added support for no errorcode declaration in errordomain declaration
- Added support for attributes to be used in the method declaration section of errordomain
- Added support for primitive types to be used as parameters
- Added support for additional identifier keywords to be used without @ preceding
- Fixed misc issues and edge cases found in vala source and other repos

## [1.2.3-ALPHA]

### What's Changed

- Added main block support (including using methods, fields with var, etc. outside namespace)
- Added support for declaring interfaces in interfaces
- More forgiving on identifier keywords being used when not specifying @ before to match the Vala parser
- Allow use of dynamic in foreach statement
- Allow use of weak in foreach statement
- Allow permitted type declaration modifiers in interface (abstract, extern, and sealed)
- Allow permitted type declaration modifiers in enum (abstract, extern, and sealed)
- Allow one use of a default statement in a switch
- Remove using expression in default statement in a switch
- Added support for unlock statement
- Allow nullability question mark to be used after identifier in object/array creation expressions
- Allow use of void pointer array type
- Allow use of weak and unowned in local variable declarations
- Now only allow permitted type declaration modifiers in errordomain (extern, abstract, partial, sealed)
- Now only allow permitted type declaration modifiers in delegate (abstract, async, class, extern, inline, override,
  sealed, static, and virtual)
- Add better support for parameter direction (in, out, ref) and ownage (own, unowned)
- Adjust what is permissible with yield statements / expression based on the Vala parser (before any expression could be
  used. Now only method calls can be, and now return isn't permitted after yield)
- Update try, catch, finally block to match the Vala parser (need either finally block or catch clause with a try
  statement, and only one finally)
- Add support for identifiers ending with @ used in config files
- Removed unused spell-check support as platform updated
- Added capability to run parsing/lexing tests on sample files and any repo link

## [1.2.2-ALPHA]

### What's Changed

- Added missing keyword highlighting (dynamic, typeof, sizeof, as, is, global, get, set, default, etc.)
- Added additional syntax support for arrays, slicing, and variable usage instead of just numbers
- Fixed issue with '@' not taking account all possible keywords in parser.
- Added support for trailing comma in a few additional places where commas are used with parser.
- Added support for expanded usage of numerical suffixes so int numbers can have a float suffix char.
- Added support for alternate form of property set construct
- Added support for multiple constants to be declared at once separated by comma
- Added support for constructor to be used in structs
- Added support for attributes to be used in structs
- Added support for using hexadecimal literals
- Added support for field declarations in namespace member area (only partially supported by compiler)
- Added support for using some keywords from outside objects (like GLib.Object's new, get, set)
- Added support for additional nullability of variables / types

## [1.2.1-ALPHA]
### What's Changed

- Added keyword highlighting for delegate
- Patched indentation for errordomain and attribute pairing.
- Updated parser to permit multiple identifiers / arguments rather than
  a single one per attribute

## [1.2.0-ALPHA]

### What's Changed
- Added new Vala project wizard to Java-based IDEs
- Added new Vala project wizard with Meson to Java-based IDEs
- Added new Vala project wizard to non-Java-based IDEs
- Added new Vala project wizard with Meson to non-Java-based IDEs
- Fixed indentation when enter key pressed inside a 'block'
- Implemented a custom formatter
- Added new settings page for code style with some configuration options

## [1.1.3-ALPHA]
### What's Changed
- Update parser to permit constants being declared in statements.
- Update parser to no longer permit non-constant variables being declared in the namespace.
- Update parser to allow delegate declaration in the namespace.

## [1.1.2-ALPHA]

### What's Changed

- Adding semantic token colorization support from the language server.
- Adding LSP4IJ configuration for code insight, spell checker, folding builder, psi structure viewer, and parameter
  info.
- Adding syntax highlighting for .in files.
- Adding comment out and uncomment functionality.
- Adding single, double quotation, and backtick escape functionality.
- Updated plugin logo and added a different dark mode icon.
- Updated source file icon to be more consistent with the JetBrains theme.
- Implemented robust parser that can handle majority of Vala syntax.

## [1.1.1-ALPHA]
### What's Changed
- Added additional keywords for syntax highlighting and to parser/lexer.
- Added additional configurability for color customization.

## [1.1.0-ALPHA]
### What's Changed
- Added plugin settings page.
- Added configuration option for Language Server executable path.
- Documentation for the Language Server configuration.

## [1.0.1-ALPHA]
### What's Changed
- Support for MacOS and Windows platforms with the LSP server.

## 1.0.0-ALPHA
### What's Changed
- Initial version with basic features: lsp support, syntax highlighting, file creation.