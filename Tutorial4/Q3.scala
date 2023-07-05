package Tutorial4

object Q3 {

  def toLower(str: String): String = str.toLowerCase()

  def toUpper(str: String): String = str.toUpperCase()

  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {

    var name = "Benny"
    println(formatNames(name) { str => toUpper(str) })

    name = "Niroshan"
    println(formatNames(name) {
      str =>
        val firsthalf = str.substring(0, 2)
        val secondhalf = str.substring(2)
        toUpper(firsthalf) + toLower(secondhalf)
    })

    name = "Saman"
    println(formatNames(name) { str => toLower(str) })

    name = "Kumara"
    println(formatNames(name) {
      str =>
        val firsthalf = str.substring(0, 1)
        val secondhalf = str.substring(1, 5)
        val thirdhalf = str.substring(5)
        toUpper(firsthalf) + toLower(secondhalf) + toUpper(thirdhalf)
    })
  }
}


