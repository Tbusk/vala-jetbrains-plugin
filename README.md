# vala-jetbrains-plugin

![Build](https://github.com/Tbusk/vala-jetbrains-plugin/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/27464-vala-language.svg)](https://plugins.jetbrains.com/plugin/27464-vala-language)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/27464-vala-language.svg)](https://plugins.jetbrains.com/plugin/27464-vala-language)

<!-- Plugin description -->

Vala language support for Jetbrains IDEs.
            
This plugin provides syntax highlighting, code completion, integrated documentation, and other features for development with the Vala programming language.

The IDE most compatible currently is CLion because Meson is supported. If you wish to use another IDE, note you must run meson builds via command line every now and then if your project uses meson.
            
This currently is in an early stage of development. Most luxuries of JetBrain IDEs are not implemented yet or are limited.

A Language Server Protocol (LSP) is used to provide many features, including documentation, code completion, syntax checking, etc.

The supported LSP is required to be installed separately for now. More details for the LSP are available [here](https://github.com/Tbusk/vala-jetbrains-plugin/blob/main/docs/LanguageServer.md).

If you want to support this project or encounter any problems, please consider opening issues (features requests, bug fixes, etc.) or pull requests on our GitHub repository [here](https://github.com/Tbusk/vala-jetbrains-plugin).

<!-- Plugin description end -->

## Features

### LSP
- [x] diagnostics
- [x] code completion
    - [x] member access and scope-visible completion
    - [x] context-sensitive suggestions
        - completions for abstract methods/properties to implement
- [x] symbol outline
- [x] goto definition
- [x] symbol references
- [x] goto implementation
- [x] signature help
- [x] hover
- [x] symbol documentation
    - [x] from comments in source code
    - [x] from GIR and VAPI files
- [x] code lenses
- [x] rename refactoring
- [x] supported projects
    - [x] meson

### Standard

- [x] Comment out / Uncomment Out
- [x] Formatter
- [x] Comment quick-exit
- [x] LSP Integration
- [x] New project templates
    - [x] Meson project
    - [x] Empty project
- [ ] Syntax checks
    - [x] Basic grammar checks (declarations, what can go where, etc.)
    - [ ] Variable location usage
    - [ ] Multiple identical declarations
    - [ ] Recovery and pinning
    - [ ] Expression validation
    - [ ] Member existence (eg., varaible inside class, method inside namespace) validation
    - [ ] Correct usage of method
    - [ ] Type checks
- [ ] Syntax highlighting
    - [x] Keywords
    - [x] Declarations (class, namespace, enum, errordomain, etc.)
    - [x] Already declared identifiers for method calls, variable usage, etc. in project
    - [ ] Identifiers declared in namespaces outside of project via Vapi
- [ ] Run
    - [ ] File outside file
    - [ ] File inside file
    - [ ] Method inside file (test, non-test)
    - [ ] Meson build file
- [ ] Auto-install LSP
- [ ] Code Style configurability (settings page, editorconfig)
    - [x] Limited support
    - [ ] Complete support
- [ ] Settings Page
    - [x] LSP location config
    - [ ] LSP feature enable/disable
    - [ ] Vala install location
    - [ ] Vapi location
    - [ ] New project configurability
- [ ] New File Templates
    - [x] Empty Vala File
    - [ ] Enum vala file
    - [ ] errordomain vala file
    - [ ] Vala config file
    - [ ] Struct file
    - [ ] Main method file
    - [ ] Test file
- [ ] Brace folding
- [ ] Spellcheck
- [ ] Goto definition
- [ ] Refactoring
- [ ] Inline documentation
- [ ] Meson support (syntax highlighting, validation)
    - [x] CLion
    - [ ] Others
- [ ] Linter support
- [ ] Documentation
    - [ ] LSP
    - [ ] Formatter/editorconfig
    - [x] Contributions
    - [ ] Code
    - [x] Installation

## Installation

- Using the IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "Vala Language"</kbd> >
  <kbd>Install</kbd>
  
- Using JetBrains Marketplace:

  Go to [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/27464-vala-language) and install it by clicking the <kbd>Install to ...</kbd> button in case your IDE is running.

  You can also download the [latest release](https://plugins.jetbrains.com/plugin/27464-vala-language/versions) from JetBrains Marketplace and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

- Manually:

  Download the [latest release](https://github.com/Tbusk/vala-jetbrains-plugin/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

## Contributions
Thank you for your interest in contributing to this project. 
We welcome any and all contributions from the community and appreciate your help in making the project better.

Please refer to the [contributions](CONTRIBUTING.md) file for guidelines on how to contribute, including how to report issues, submit pull requests, and adhere to our coding standards.
