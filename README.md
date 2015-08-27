## Purpose

to investigate https://github.com/typesafehub/migration-manager/issues/78

## Setup

to have an artifact to compare to, you'll need to rewind in the git
history to the initial commit and do `publishLocal`, then return
to the present.

## Running MiMa

in sbt, say:

    mimaReportBinaryIssues
