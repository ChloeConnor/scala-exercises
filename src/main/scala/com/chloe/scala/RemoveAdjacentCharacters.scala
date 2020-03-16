package com.chloe.scala

/**
 * For a given string of As and Bs find the number of
 * characters to be removed so that no adjacent character
 * is the same
 *
 * e.g string "ABAA" would return 1 as you'd need to remove
 * one A to leave the string "ABA", with no adjacent characters
 * the same
 */

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

  def main(args: Array[String]): Unit = {

    println(removeAdjacentCharacters("ABAA"))
  }
}
