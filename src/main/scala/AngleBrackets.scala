object AngleBrackets {

  /**
    * For a given string of angle brackets append to the start
    * and end to close all pairs
    *
    * e.g for string <>< we would need to add > to the end
    */
  def closeAllAngleBrackets(angles: String): String = {
    val brackets = angles.toList.map(a => a.toString)

    val requiredBrackets = brackets.zipWithIndex
      .map(i => {
        if (brackets
              .lift(i._2)
              .contains("<") && brackets.lift(i._2 + 1).contains(">")) "p"
        else if (brackets.lift(i._2 - 1).contains("<") && brackets
                   .lift(i._2)
                   .contains(">")) "p"
        else if (brackets.lift(i._2).contains(">")) "<"
        else if (brackets.lift(i._2).contains("<")) ">"
        else "w"
      })
      .filter(_ != "p")
      .groupBy(_ == "<")

    val start =
      requiredBrackets.filter(a => a._1).values.toList.flatten.mkString("")

    val end =
      requiredBrackets.filter(a => !a._1).values.toList.flatten.mkString("")

    start + brackets.mkString("") + end
  }

  def main(args: Array[String]): Unit = {

    println(closeAllAngleBrackets("><<><"))
    assert(closeAllAngleBrackets("><<><") == "<><<><>>")
  }
}
