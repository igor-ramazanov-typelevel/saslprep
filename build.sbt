name := "saslprep"

ThisBuild / tlBaseVersion := "0.1"

ThisBuild / organization := "com.armanbilge"
ThisBuild / organizationName := "Arman Bilge"
ThisBuild / developers += tlGitHubDev("armanbilge", "Arman Bilge")
ThisBuild / startYear := Some(2021)
ThisBuild / tlSonatypeUseLegacyHost := false

ThisBuild / crossScalaVersions := Seq("3.1.2", "2.12.15", "2.13.8")

ThisBuild / githubWorkflowBuildPreamble +=
  WorkflowStep.Run(
    List("sudo apt-get install libutf8proc-dev"),
    name = Some("Install libutf8proc"),
    cond = Some("matrix.project == 'rootNative'")
  )

lazy val root = tlCrossRootProject.aggregate(saslprep)

lazy val saslprep = crossProject(JVMPlatform, JSPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .in(file("saslprep"))
  .settings(
    libraryDependencies ++= Seq(
      "io.github.cquiroz" %%% "scala-java-locales" % "1.4.0",
      "org.scalameta" %%% "munit" % "1.0.0-M4" % Test
    )
  )
  .platformsSettings(JVMPlatform, NativePlatform)(
    tlVersionIntroduced := List("2.12", "2.13", "3").map(_ -> "0.1.1").toMap
  )
