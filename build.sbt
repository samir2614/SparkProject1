name := "SparkProject1"

version := "1.0"

scalaVersion := "2.11.8"

mainClass in (Compile, run) := Some("com.demo.WordCount")

mainClass in (Compile, packageBin) := Some("com.demo.WordCount")

mainClass := Some("com.demo.WordCount")

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.1"