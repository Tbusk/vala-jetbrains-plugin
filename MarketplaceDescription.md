Vala language support for JetBrains IDEs.

This plugin provides syntax highlighting, code completion, integrated documentation, and other features for development with the Vala programming language.

The IDE most compatible currently is CLion because Meson is supported. If you wish to use another IDE, note you must run meson builds via command line every now and then if your project uses meson.

This currently is in an early stage of development. Most luxuries of JetBrain IDEs are not implemented yet or are limited.

A Language Server Protocol (LSP) is used to provide many features, including documentation, code completion, syntax checking, etc.

The supported LSP is required to be installed separately for now. More details for the LSP are available [here](https://github.com/Tbusk/vala-jetbrains-plugin/blob/main/docs/LanguageServer.md).

If you want to support this project or encounter any problems, please consider opening issues (features requests, bug fixes, etc.) or pull requests on our GitHub repository [here](https://github.com/Tbusk/vala-jetbrains-plugin).