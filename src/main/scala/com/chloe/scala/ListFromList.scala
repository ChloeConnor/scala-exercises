package com.chloe.scala

object ListFromList {

  def returnNumberOfElements(list: List[String], number: Int): List[String] = {
    list.slice(0, number)
  }

  def returnNumberOfElementsWhenLarger(list: List[String],
                                       number: Int): List[String] = {
    val lengthOfList = list.size
    val howManyLists = (number / lengthOfList).floor.intValue()

    val leftover = number - (howManyLists * lengthOfList)

    val newList = List
      .range(0, howManyLists)
      .flatMap(l => {
        list
      })

    newList ::: newList.slice(0, leftover)
  }

  def createList(list: List[String], number: Int): List[String] = {

    if (number<= list.size) returnNumberOfElements(list, number)
    else returnNumberOfElementsWhenLarger(list, number)

  }

  def main(args: Array[String]): Unit = {}
}
