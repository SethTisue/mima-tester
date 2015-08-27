scalaVersion := "2.12.0-M2"

name := "mima-test"

organization := "net.tisue"

version := "1.3"

import com.typesafe.tools.mima.plugin.MimaPlugin.mimaDefaultSettings
import com.typesafe.tools.mima.plugin.MimaKeys.previousArtifact

mimaDefaultSettings

previousArtifact := Some("net.tisue" %% "mima-test" % "1.2")
