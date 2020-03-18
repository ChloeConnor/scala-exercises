package com.chloe.scala
import com.chloe.scala.ListFromList._
import org.scalatest.flatspec.AnyFlatSpec


class TestListFromList extends AnyFlatSpec {

  "List" should "return the number of elements given" in {
    val inputList = List("apple", "pear", "lemon", "orange")
    val inputNumber =  2
    val expectedOutput = List("apple", "pear")

    val output =returnNumberOfElements(inputList, inputNumber)

    assert(output == expectedOutput)
  }

  it should "return the number of elements given if list is longer" in {
    val inputList = List("apple", "pear", "lemon", "orange")
    val inputNumber =  6
    val expectedOutput = List("apple", "pear", "lemon", "orange", "apple", "pear")

    val output = returnNumberOfElementsWhenLarger(inputList, inputNumber)

    assert(output == expectedOutput)
  }

  it should "return the number of elements given any length list" in {
    val inputList = List("apple", "pear", "lemon", "orange")
    val inputNumber =  6
    val expectedOutput = List("apple", "pear", "lemon", "orange", "apple", "pear")

    val output = createList(inputList, inputNumber)

    assert(output == expectedOutput)
  }

}