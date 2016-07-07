name := "direct_kafka_word_count"

scalaVersion := "2.10.5"

val sparkVersion = "1.6.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
  
  "com.typesafe" % "config" % "1.2.1" % "provided",
  "net.ceedubs" %% "ficus" % "1.1.1" % "provided",
  "ch.qos.logback" % "logback-classic" % "0.9.24" % "provided",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test" % "provided"
  ("org.apache.spark" %% "spark-streaming-kafka" % sparkVersion) exclude ("org.spark-project.spark", "unused")
)

assemblyJarName in assembly := name.value + ".jar"
