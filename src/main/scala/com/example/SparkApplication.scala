package com.example

import org.apache.spark.sql.SparkSession

object SparkApplication {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().getOrCreate()

    // Do your Spark magic here...

    spark.close()
  }
}
