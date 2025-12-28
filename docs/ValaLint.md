# Vala-Lint

Vala-Lint is an open-source linter for Vala code available [here](https://github.com/vala-lang/vala-lint).

Currently, this plugin has a small integration with the linter, which requires the linter to be installed before 
continuing with this guide.

## Installation

It can be installed on a few distributions following their method of installation or by compiling from the source 
following the instructions in the vala-lint repository.

## Usage

This integration uses a custom
[Run Configuration](https://www.jetbrains.com/help/idea/run-debug-configuration.html) to use the linter.  

1. Go to `Run | Edit Configurations ` by clicking the dropdown item next to the play (run) button
2. Click the `Edit Configurations` button
3. Click either the `+` button, the `Add new...` button, or the `Add new run configuration...` button and 
click on the `Vala Lint` item.
4. Give it a name, change the linting mode if desired, specify a config file if you have one that isn't named 
`vala-lint.conf` and deselect `Detect and use available lint config` if yours doesn't have this name. You can also 
enable `Auto-fix where possible` if you want the linter to attempt to fix issues it finds.

### Use Cases

1. Run it via the play button after setting it up with a click
2. Automatically run it by setting up an advanced commit check in the settings
3. Automatically run it when opening a project via startup task in the settings

If you want support for running this upon save, open an issue / send a request in discord.

### Linting Modes

There are three linting modes available:
1. All vala/vapi files in the project
2. Uncommitted changes
3. Patterns (glob) via specified pattern(s).

#### All vala/vapi files in the project

This mode will lint all `.vala` and `.vapi` files in the project, which runs the linter with no directory specified and lets the 
linter handle the rest.

CLI-equivalent example with no auto-fix and no config file specified:

```shell
io.elementary.vala-lint 
```

#### Uncommitted changes

This mode will lint all `.vala` and `.vapi` files that have been changed since the last commit.

This utilizes the `ChangeListManager` internal version control API to read files that have changed since the last 
commit, and should match what you see when you go to commit changes and see a 
[change list](https://www.jetbrains.com/help/idea/managing-changelists.html). 

It does this by fetching the changed files, iterating through them, and providing a relative path to the linter for all 
files. 

If nothing changed since the last commit, it will let you know by this error message:

```shell 
Error running '<name>'
No Vala or Vapi files are uncommitted.
```

#### Patterns (glob) via specified pattern(s)

This mode will lint all files that match the specified pattern(s) using glob syntax. 
You can read more on the syntax [here](https://en.wikipedia.org/wiki/Glob_(programming)).

The default values are `src/` and `test/`.

CLI-equivalent example catching all vala/vapi files in the `src` directory with no auto-fix and no config file specified:

```shell
io.elementary.vala-lint src/
```

Additional examples can be found in the README of the vala-lint repository.

#### Config file

The linter can be configured futher by using a configuration file and specifying it to linter CLI.  

If `Detect and use available lint config` is selected and your config file is named `vala-lint.conf`, then it'll be used
and you won't need to supply anything.  Otherwise, if you want to use a different config file, you can use the relative 
path to it from the source directory or click the folder icon and use the absolute path to it. 
You must deselect the toggle previously mentioned for it to be used.

For example, if you want to use a config file that is in the root directory, you can use either `<config_name>.conf` instead of
specifying the full path, or you can use the full path.

It uses the `-c` / `--config` flag to specify the path to the config file.

CLI-equivalent example with a config file in the `src/` directory:
```shell
io.elementary.vala-lint -c vala-lint.conf src/
```

#### Autofix Toggle

The autofix toggle is a work-in-progress feature on the linter that can only fix a few things, and has some issues, 
for example, with in-line regular expression literals. 

It uses the `-f` / `--fix` flag to enable autofix.

CLI-equivalent example in the `src/` directory:
```shell
io.elementary.vala-lint -f src/
```