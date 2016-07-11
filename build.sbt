name := "direct_kafka_word_count"

scalaVersion := "2.10.5"
kafkaVersion := "0.8.2.1"

val sparkVersion = "1.6.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
  "org.apache.kafka" %% "kafka" % kafkaVersion % "provided",
  "org.apache.kafka" %% "kafka-clients" % kafkaVersion % "provided",
  ("org.apache.spark" %% "spark-streaming-kafka" % sparkVersion) exclude ("org.spark-project.spark", "unused")
)

assemblyJarName in assembly := name.value + ".jar"
