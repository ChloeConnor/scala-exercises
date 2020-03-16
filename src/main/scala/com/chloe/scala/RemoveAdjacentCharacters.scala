package com.chloe.scala

object RemoveAdjacentCharacters {

  def anyOtherThanAOrB(string: String): Boolean = {
    string.toList.exists(
      character =>
        !character.toString.equals("A") && !character.toString.equals("B")
    )
  }

  def removeAdjacentCharacters(string: String): Int = {

    if (anyOtherThanAOrB(string)) throw new Exception

    val listOfCharacters = string.toList

    listOfCharacters.zipWithIndex
      .map(a => {
        if (a._1.toString == listOfCharacters
              .lift(a._2 + 1)
              .getOrElse("")
              .toString) {
          1
        } else {
          0
        }
      })
      .sum

  }

  def main(args: Array[String]): Unit = {}
}
