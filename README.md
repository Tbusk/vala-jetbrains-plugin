# vala-jetbrains-plugin

![Build](https://github.com/Tbusk/vala-jetbrains-plugin/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/27464-vala-language.svg)](https://plugins.jetbrains.com/plugin/27464-vala-language)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/27464-vala-language.svg)](https://plugins.jetbrains.com/plugin/27464-vala-language)

<!-- Plugin description -->

Vala language support for Jetbrains IDEs.
            
This plugin provides syntax highlighting, code completion, and other features for development with the Vala programming language.
            
This currently is in an early stage of development. Most luxuries of JetBrain IDEs are not implemented yet or are limited.

A Language Server Protocol (LSP) is used to provide many features, including documentation, code completion, syntax checking, etc.

The supported LSP is required to be installed separately for now. More details for the LSP are available [here](https://github.com/Tbusk/vala-jetbrains-plugin/blob/main/docs/LanguageServer.md).

If you want to support this project or encounter any problems, please consider opening issues (features requests, bug fixes, etc.) or pull requests on our GitHub repository [here](https://github.com/Tbusk/vala-jetbrains-plugin).

<!-- Plugin description end -->

## Project Development Phases
1. Add support for LSP to be at default download positions based on OS, and then further customized in settings.
2. Improve syntax highlighting and enhance compatability with themes and color customization with the language.
3. Add additional feature support, including most refactor methods to improve development experience.
4. Add runnability support to make files executable.
5. Add installation capabilities if the LSP is not found so it can be installed and downloaded.
6. Create a new project template.
7. Additional new file templates, including enums, structs, classes, etc.
8. Add non-lsp syntax checking to provide immediate rather than delayed syntax checks.

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

Please refer to the [contributions](CONTRIBUTIONS.md) file for guidelines on how to contribute, including how to report issues, submit pull requests, and adhere to our coding standards.
