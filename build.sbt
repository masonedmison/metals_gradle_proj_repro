val scala3Version = "3.4.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "metals_java_proj_repro",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )
  .aggregate(
    someJavaProject
  )

val someJavaProject = project
  .in(file("gradle-proj"))