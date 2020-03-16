package com.chloe.scala
import com.chloe.scala.RemoveAdjacentCharacters._
import org.scalatest.flatspec.AnyFlatSpec


class TestRemoveAdjacentCharacters extends AnyFlatSpec {

  "AABA" should "should return 1" in {

    val input = "AABA"
    val expectedOutput = 1

    val output = removeAdjacentCharacters(input)

    println(output)
    assert(output == expectedOutput)
  }

  "AAAA" should "should return 1" in {

    val input = "AAAA"
    val expectedOutput = 3

    val output = removeAdjacentCharacters(input)

    println(output)
    println(output == expectedOutput)

    assert(output == expectedOutput)
  }

  "BBBBB" should "should return 4" in {

    val input = "BBBBB"
    val expectedOutput = 4

    val output = removeAdjacentCharacters(input)

    println(output)
    println(output == expectedOutput)

    assert(output == expectedOutput)
  }

  "StrABABABABABing" should "should return 4" in {

    val input = "ABABABABAB"
    val expectedOutput = 0

    val output = removeAdjacentCharacters(input)

    println(output)
    println(output == expectedOutput)

    assert(output == expectedOutput)
  }

  "BABABA" should "should return 0" in {

    val input = "BABABA"
    val expectedOutput = 0

    val output = removeAdjacentCharacters(input)

    println(output)
    println(output == expectedOutput)

    assert(output == expectedOutput)
  }

  "AAABBB" should "should return 0" in {

    val input = "AAABBB"
    val expectedOutput = 4

    val output = removeAdjacentCharacters(input)

    println(output)
    println(output == expectedOutput)

    assert(output == expectedOutput)
  }

  "String" should "ABC should return 0" in {

    val input = "ABC"
    val expectedOutput = true

    val output = anyOtherThanAOrB(input)

    println(output)

    assert(output == expectedOutput)
  }

}
