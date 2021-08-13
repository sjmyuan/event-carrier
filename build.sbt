lazy val root = (project in file("."))
  .settings(
    name := "event-carrier",
    organization := "com.sjmyuan",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.13.6",
    libraryDependencies ++= Seq(
      "com.lihaoyi" %% "utest" % "0.7.10" % "test",
      "org.http4s" %% "http4s-ember-client" % "0.21.26",
      "org.http4s" %% "http4s-circe" % "0.21.26"
    ),
    addCompilerPlugin(
      "org.typelevel" %% "kind-projector" % "0.13.0" cross CrossVersion.full
    ),
    testFrameworks += new TestFramework("utest.runner.Framework")
  )
