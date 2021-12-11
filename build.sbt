name := "saslprep"

ThisBuild / baseVersion := "0.1"

ThisBuild / organization := "com.armanbilge"
ThisBuild / publishGithubUser := "armanbilge"
ThisBuild / publishFullName := "Arman Bilge"

ThisBuild / crossScalaVersions := Seq("3.0.2", "2.12.15", "2.13.7")
ThisBuild / githubWorkflowJavaVersions := Seq(JavaSpec.temurin("8"))

ThisBuild / spiewakCiReleaseSnapshots := true
ThisBuild / spiewakMainBranches := Seq("main")
sonatypeCredentialHost := "s01.oss.sonatype.org"
ThisBuild / homepage := Some(url("https://github.com/armanbilge/saslprep"))
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/armanbilge/saslprep"),
    "git@github.com:armanbilge/saslprep.git"))

replaceCommandAlias(
  "ci",
  "; project /; headerCheckAll; scalafmtCheckAll; scalafmtSbtCheck; clean; testIfRelevant; mimaReportBinaryIssuesIfRelevant"
)

enablePlugins(ScalaJSPlugin, SonatypeCiReleasePlugin)
libraryDependencies += "org.scalameta" %%% "munit" % "0.7.29" % Test
