name := "spark-application-template"
organization := "com.example"
version := "1.0.0"

scalaVersion := "2.12.18"

val sparkVersion = "3.5.0"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % Provided,
  "org.apache.spark" %% "spark-sql" % sparkVersion % Provided
)

// Exclude scala from the fat-jar, since it's provided by Spark
assemblyPackageScala / assembleArtifact := false

// Include provided dependencies when running locally
Compile / run := Defaults.runTask(
  Compile / fullClasspath,
  Compile / run / mainClass,
  Compile / run / runner
).evaluated
