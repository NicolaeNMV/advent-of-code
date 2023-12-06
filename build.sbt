// Define the Scala version
scalaVersion := "2.13.8"

// Name of your project
name := "advent-of-code-2023"

// Version of your project
version := "0.1"

// Set up a simple project library dependency
libraryDependencies ++= Seq(
  // For testing, you might include ScalaTest:
  "org.scalatest" %% "scalatest" % "3.2.9" % Test,
  "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4"
)
