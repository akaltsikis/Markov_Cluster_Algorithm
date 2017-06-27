name := "SparkMCL"

version := "1.1-2.1.1"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.1.1",
  "org.apache.spark" %% "spark-mllib" % "2.1.1",
"org.apache.spark" %% "spark-mllib-local" % "2.1.1",
  "org.apache.spark" %% "spark-graphx" % "2.1.1",
  "org.apache.spark" %% "spark-sql" % "2.1.1",
  "org.apache.spark" %% "spark-hive" % "2.1.1",
  "com.github.scopt" %% "scopt" % "3.5.0"
)
