scalaVersion := "2.12.0-M2"

name := "mima-test"

organization := "net.tisue"

version := "1.0"

import com.typesafe.tools.mima.plugin.MimaPlugin.mimaDefaultSettings
import com.typesafe.tools.mima.plugin.MimaKeys.previousArtifact

mimaDefaultSettings

previousArtifact := Some("com.jsuereth" % "scala-arm_2.9.1" % "1.2")
