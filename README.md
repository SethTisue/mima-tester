## Purpose

to investigate https://github.com/typesafehub/migration-manager/issues/78

## Setup

to have an artifact to compare to, you'll need to rewind in the git
history to version 1.2 (c8b9973), do `publishLocal` to publish version
1.0 to your `~/.ivy2/local`. then return to the present.

## Running MiMa

in sbt, say:

    mimaReportBinaryIssues
