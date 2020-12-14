

object jsonParserMain extends App{

  val file = io.Source.fromFile("dummyData.json")

  for (line <- file.getLines) {
    println(line)
//    val brokenLine = line.split(":")
//    brokenLine.foreach(println)
  }

}
