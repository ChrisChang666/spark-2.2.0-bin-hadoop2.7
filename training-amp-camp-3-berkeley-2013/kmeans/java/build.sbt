name := "wikipedia-kmeans"

version := "0.0"

scalaVersion := "2.9.2"

libraryDependencies += "org.spark-project" %% "spark-streaming" % "0.7.0-SNAPSHOT"


mainClass in (Compile, run) := Some("WikipediaKMeans")
