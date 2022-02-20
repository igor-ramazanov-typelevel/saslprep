name := "saslprep"

ThisBuild / tlBaseVersion := "0.1"

ThisBuild / organization := "com.armanbilge"
ThisBuild / organizationName := "Arman Bilge"
ThisBuild / developers += tlGitHubDev("armanbilge", "Arman Bilge")
ThisBuild / startYear := Some(2021)
ThisBuild / tlSonatypeUseLegacyHost := false

ThisBuild / crossScalaVersions := Seq("3.0.2", "2.12.15", "2.13.7")

enablePlugins(ScalaJSPlugin)
libraryDependencies += "org.scalameta" %%% "munit" % "0.7.29" % Test
