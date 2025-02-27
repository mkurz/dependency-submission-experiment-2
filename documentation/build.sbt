ThisBuild / scalaVersion     := "2.13.16"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "Dependency Submission Experiment",
    libraryDependencies += "ch.qos.logback" % "logback-core" % "1.4.11", // has vulnerabilities
  )
