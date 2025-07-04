<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# vala-jetbrains-plugin Changelog

## [Unreleased]

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