package com.marklogic.spark

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession


object MarkLogicSparkExtractor {

  def main(args: Array[String]): Unit = {
    // Spark configuration
    val sparkConf = new SparkConf()
      .setAppName("MarkLogicSparkExtractor")
      .set("spark.hadoop.home.dir", "/Users/dhruvilmodi/Downloads/hadoop-3.3.6-aarch64.tar.gz")
      .setMaster("local[*]") // Use "local" for running on a single machine

    val spark = SparkSession.builder().config(sparkConf).getOrCreate()

    // MarkLogic connection parameters
    val mlHost = "localhost"
    val mlPort = 8000
    val mlDatabase = "ReliGroup"
    val mlUser = "DhruvilReli"
    val mlPassword = "Reli@1304"


    // Spark Connector Configuration
    val connectorConfig = Map(
      "mlHost" -> mlHost,
      "mlPort" -> mlPort.toString,
      "mlDatabase" -> mlDatabase,
      "mlUser" -> mlUser,
      "mlPassword" -> mlPassword,
      "collections" -> "ReliXML",
    )

    // Read from MarkLogic using Spark Connector
    val df = spark.read
      .format("com.marklogic.spark")
      .options(connectorConfig)
      .option("spark.marklogic.read.opticQuery", "op.fromView('all', 'clinical_study')")
      .load()

    // Show the DataFrame
    df.show()

    // Perform further processing as needed

    // Stop the Spark session
    spark.stop()
  }
}
