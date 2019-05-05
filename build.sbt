name := "spark_ml_examples"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.1"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.4.1"
libraryDependencies += "org.apache.spark" % "spark-streaming-kafka-0-10_2.11" % "2.4.1"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.4.1"
libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % "2.4.1"
libraryDependencies += "org.json4s" %% "json4s-jackson" % "{latestVersion}"