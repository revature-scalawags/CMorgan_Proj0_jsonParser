object jsonParserMain extends App{

  val file = io.Source.fromFile("dummyData.json")

  val mappedValues = scala.collection.mutable.Map[String,String]()

  for (line <- file.getLines) {
//    println(line)
//    val brokenLine = line.split(":")
    var strippedLine = line.trim().replaceAll("\"", "").stripSuffix(",")
    // var brokenLine = strippedLine.replaceAll("\"", "")
    // val finishedLine = brokenLine.stripSuffix(",")
    // println(strippedLine)

    val splitLine = strippedLine.split(":")
    if (splitLine.length > 1) {
      mappedValues += (splitLine(0) -> splitLine(1))
    }
    println(mappedValues)
  }

}