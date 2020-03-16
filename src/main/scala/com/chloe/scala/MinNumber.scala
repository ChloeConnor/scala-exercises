package com.chloe.scala

object MinNumber {

  /**
    * For a given array of numbers return an array of
    * the numbers with the minimum number of occurrences
    *
    * e.g array (1,1,2,2) would return (2,2) because they only
    * occur once, whereas 1 occurs twice
    */
  def main(args: Array[String]): Unit = {

    val numbers = Array(6, 6, 7, 7, 7, 20, 21)

    val arrayWithCount = numbers.toList
      .map(n => (n, 1))
      .groupBy(_._1)
      .map(a => (a._1, a._2.size))

    val minNumber = arrayWithCount
      .minBy(_._2)
      ._2

    val all = arrayWithCount.filter(_._2 == minNumber).keys
    println(all)
  }
}
