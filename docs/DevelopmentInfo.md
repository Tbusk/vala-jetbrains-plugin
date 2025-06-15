## Development Plugin Information

This plugin utilizes JetBrains Grammar Kit with BNF to define the grammar and generate a parser and JFlex to handle
generating a lexer.

JetBrains Grammar Kit: https://github.com/JetBrains/Grammar-Kit

JFlex: https://jflex.de/

### Adding and modifying tokens

In order to add and modify tokens, a few steps are necessary.

1. Open `src/main/java/com/tbusk/vala_plugin/syntax/Vala.bnf`. This file is necessary for defining tokens is where the
   grammar is defined.
2. Right-click the `Vala.bnf` file and select `Generate Parser Code`. This will generate the necessary parser code files
   in `src/main/gen/`.
3. Open `src/main/java/com/tbusk/vala_plugin/ValaTokenSets.java` and add the keyword/token (if applicable) to
   `KEYWORDS`, or whichever is applicable, if any.
4. If it is a new type, then you'll need to define the type in
   `src/main/java/com/tbusk/vala_plugin/highlighting/ValaSyntaxHighlighter.java`.
5. If it is a type not already defined, it may be helpful to add it to
   `src/main/java/com/tbusk/vala_plugin/highlighting/ValaColorSettingsPage.java` to allow changing the colors in the
   settings for the token.
6. Open `src/main/java/com/tbusk/vala_plugin/syntax/Vala.flex` and add the keyword/token there.
7. Right-click the `Vala.flex` file and select `Run JFlex Generator`. This will generate the necessary lexer code files
   in `src/main/gen/`.
8. For more specific syntax highlighting and checks that aren't easy to do in a parser/lexer, you can make a new
   annotator / add to the current one.
9. Test your changes by running the Gradle task `runIde`.

### Plugin Tutorials

- https://plugins.jetbrains.com/docs/intellij/plugins-quick-start.html
- https://plugins.jetbrains.com/docs/intellij/developing-plugins.html#alternatives
- https://github.com/JetBrains/intellij-platform-plugin-template

### Similar Projects To Look At

- https://github.com/Szasza/Wing-Idea
- https://github.com/ballerina-platform/plugin-intellij
- https://github.com/JetBrains/Rplugin
- https://github.com/JetBrains/intellij-scala
- https://github.com/JetBrains/la-clojure
- https://github.com/JetBrains/intellij-kotlin
- https://github.com/JetBrains/intellij-plugins/tree/master/Dart
- https://github.com/Camelcade/Perl5-IDEA
- https://github.com/ignatov/intellij-erlang
- https://github.com/KronicDeth/intellij-elixir
- https://github.com/giraud/reasonml-idea-plugin
- https://github.com/satamas/fortran-plugin
- https://github.com/gregsh/Clojure-Kit
- https://github.com/intellij-dlanguage/intellij-dlanguage
- https://github.com/JuliaEditorSupport/julia-intellij
- https://github.com/carymrobbins/intellij-haskforce
- https://github.com/Falsepattern/Zigbrains
- https://github.com/ajkhoury/JetBrains-NASM-Language
- https://github.com/rmelick/intellij-pig-1
- https://github.com/monogon-dev/intellij-cue
- https://github.com/a2ndrade/q-intellij-plugin
- https://github.com/DragonKnightOfBreeze/Paradox-Language-Support
- https://github.com/Saigut/intellij-scheme
- https://github.com/obiwan87/odin-intellij

### Vala Resources

- https://docs.vala.dev/index.html
- https://gnome.pages.gitlab.gnome.org/vala/manual/index.html
- https://wiki.gnome.org/Projects/Vala/ValaForJavaProgrammers
- https://wiki.gnome.org/Projects(2f)Vala(2f)Documentation.html