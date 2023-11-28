ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

scalacOptions ++= Seq(
  "-deprecation",      // enable detailed deprecation warnings
  "-feature"           // enable language feature warnings
)

lazy val root = (project in file("."))
  .settings(
    name := "Spark_MarkLogic_Connect",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "3.5.0",
      "org.apache.spark" %% "spark-sql" % "3.5.0",
      "org.apache.spark" %% "spark-mllib" % "3.5.0",
      "com.marklogic" % "marklogic-xcc" % "11.0.2",
      "com.marklogic" % "java-client-api" % "4.0.1",
      "com.marklogic" % "data-movement" % "1.0.0-EA3",
      "com.marklogic" % "marklogic-spark-connector" % "2.1.0",
      "org.apache.cassandra" % "cassandra-all" % "4.0.8",
      "org.slf4j" % "slf4j-log4j12" % "2.0.5",
    ),
    resolvers += "MarkLogic Releases" at "https://developer.marklogic.com/maven2",
  )
