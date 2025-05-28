## Language Server Configuration

The current supported language server is `vala-language-server`, which is an official language server for Vala available 
at https://github.com/vala-lang/vala-language-server. 

It provides features like code completion, syntax checking, and more, enhancing the development experience.  It is used
with other Vala IDE plugins like Zed, VSCode, and NeoVim.

Other language servers like https://gitlab.gnome.org/esodan/gvls can be supported provided you specify the path to the 
executable in the plugin settings.  That LSP has not been tested, so it may not work as expected.

To configure the path of the LSP or command used, 
<kbd>⚙️</kbd> > <kbd>Settings</kbd> > <kbd>Tools</kbd> > <kbd>Vala Plugin Settings</kbd> > 
`Specify path` > <kbd>Apply</kbd>

### Language Server Manager
The plugin uses the RedHat LSP4IJ manager to handle the language server, which is available at 
https://github.com/redhat-developer/lsp4ij and https://plugins.jetbrains.com/plugin/23257-lsp4ij. This allows for easy 
management of the language server. While not supported by JetBrains, it is a community plugin that is actively 
maintained and provides a good experience for Vala development.

The JetBrains supported LSP configuration is restricted to paid versions of the IDE, so it is not used.

The docs for LSP4IJ can be found at https://github.com/redhat-developer/lsp4ij/tree/main/docs.

### Installation

To get the most up-to-date instructions, go to https://github.com/vala-lang/vala-language-server.

Automated installation is possible with RedHat LSP4IJ, the LSP manager for the plugin, but will be worked on at a later date.

#### Installation Commands
_Arch Linux (via AUR)_: `yay -S vala-language-server` or `yay -S vala-language-server-git`

_Ubuntu, Fedora, Debian, openSUSE, and Mageia_: install from the OBS repo build result

_Fedora (official)_: `sudo dnf install vala-language-server`

_elementaryOS_: `sudo apt install vala-language-server`

_Alpine Linux_: `apk add vala-language-server`

_Guix_: `guix install vala-language-server`

_Void Linux_: `xbps-install vala-language-server`

_Windows (via MSYS2)_: `pacman -S mingw-w64-x86_64-vala-language-server`


### Windows
The easiest way to configure the language server on Windows is to locate the path to the `vala-language-server` executable
and set the `PATH` environment variable in your settings.
If you do this, then you can use `language-server-protocol` instead of having to specify the path to it.

**Note**: developing with Windows does require you to manually install each dependency used in a project, which needs to be
satisfied for the language server to work properly.

### Linux
The default path for the language server is `/usr/bin/vala-language-server`.

You also should be able to get away with using `language-server-protocol` as the path instead assuming you can run it 
in your terminal with that command.

### macOS
The default path for the language server is `/usr/local/bin/vala-language-server`.

You also should be able to get away with using `language-server-protocol` as the path instead assuming you can run it
in your terminal with that command.  

## Development
All LSP functionality is implemented in the `lsp` package, which is set up for `lsp4ij` from RedHat.

There is also an additional configuration area in `plugin.xml` for managing the plugin and language server settings.

There also is an area in `settings` package which is used for managing the lsp path settings.  

A developer guide for `lsp4ij` can be found at https://github.com/redhat-developer/lsp4ij/blob/main/docs/DeveloperGuide.md.