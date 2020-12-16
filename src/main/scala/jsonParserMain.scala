object jsonParserMain extends App{

  val file = io.Source.fromFile("dummyData.json")

  for (line <- file.getLines) {
//    println(line)
//    val brokenLine = line.split(":")
    var strippedLine = line.trim().replaceAll("\"", "").stripSuffix(",")
    // var brokenLine = strippedLine.replaceAll("\"", "")
    // val finishedLine = brokenLine.stripSuffix(",")
    println(strippedLine)
  }

}