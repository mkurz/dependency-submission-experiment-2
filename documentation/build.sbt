ThisBuild / scalaVersion     := "2.13.16"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "Dependency Submission Experiment",
    libraryDependencies += "com.google.protobuf" % "protobuf-java" % "3.16.0", // has vulnerabilities
  )
