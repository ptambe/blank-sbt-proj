name := """utils"""

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

//Common Dependencies
libraryDependencies ++= List(
  "org.scalatest" % "scalatest_2.11" % "3.0.0" % "test",
  "com.typesafe.scala-logging" % "scala-logging_2.11" % "3.4.0",
  "ch.qos.logback" % "logback-classic" % "1.1.7"
)

