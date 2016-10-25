package com.demo

/**
  * Created by samir on 25/10/16.
  */
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object WordCount {
   def main(args:Array[String]){

     val hdfsFile = "hdfs://localhost:9000/input/README.md" // Should be some file on your hdfs system
     val conf = new SparkConf().setAppName("Simple WordCount Application")
     val sc = new SparkContext(conf)

     val textFile = sc.textFile(hdfsFile)
     val counts = textFile.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey(_ + _)
     counts.saveAsTextFile("hdfs://localhost:9000/output/spark_out1")

   }
}
