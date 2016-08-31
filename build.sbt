name := """Blank SBT Project"""

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

lazy val root = project.in( file(".") )
		       .aggregate(core, utils)

lazy val utils = project

lazy val core = project.dependsOn(utils)

