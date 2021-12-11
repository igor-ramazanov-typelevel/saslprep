name := "saslprep"

ThisBuild / baseVersion := "0.1"

ThisBuild / organization := "com.armanbilge"
ThisBuild / publishGithubUser := "armanbilge"
ThisBuild / publishFullName := "Arman Bilge"

ThisBuild / crossScalaVersions := Seq("3.0.2", "2.12.15", "2.13.7")
ThisBuild / githubWorkflowJavaVersions := Seq(JavaSpec.temurin("8"))

replaceCommandAlias(
  "ci",
  "; project /; headerCheckAll; scalafmtCheckAll; scalafmtSbtCheck; clean; testIfRelevant; mimaReportBinaryIssuesIfRelevant"
)

enablePlugins(ScalaJSPlugin)
libraryDependencies += "org.scalameta" %%% "munit" % "0.7.29" % Test
