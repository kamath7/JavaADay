package sample

import org.apache.log4j._
import org.apache.spark._

object WeatherRDD {

  def parseLines(line: String): (String, String, Float)= {

    val fields = line.split(",")
    val stationID = fields(0)
    val entryType = fields(2)
    val temperature = fields(3).toFloat
    (stationID, entryType, temperature)
  }

  def main(args: Array[String]) = {
    Logger.getLogger("org").setLevel(Level.ERROR)

    val sc = new SparkContext("local[*]","WeatherRDD")

    val lines = sc.textFile("")
  }
}
