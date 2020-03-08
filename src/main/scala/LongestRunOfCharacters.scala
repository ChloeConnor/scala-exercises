object LongestRunOfCharacters {

  def findLongestRunOfUniqueCharacters(s: String): Int = {
    val listOfChars = s.toList
    val listToCompare = listOfChars.drop(1) ++ "+"

    val indices: List[Int] = listOfChars.zipWithIndex
      .map(i => {
        if (listOfChars(i._2) == listToCompare(i._2)) i._2
        else -1
      })
      .filter(_ >= 0)
      .appended(listOfChars.length)

//    println(indices)
    if (indices.length == 1) return listOfChars.length

    val newIndices = indices.appended(indices.length)
    val a = indices.zipWithIndex
      .map(a => {
        newIndices(a._2 + 1) - a._1 - 1
      })

//    println(a)

    if (a.max == 1) 0
    else a.max
  }

  def main(args: Array[String]): Unit = {

    println(findLongestRunOfUniqueCharacters("nndfddf"))
    println(findLongestRunOfUniqueCharacters("absjfye"))
    println(findLongestRunOfUniqueCharacters("abbbbbao"))
    println(findLongestRunOfUniqueCharacters("aaaaaaa"))

    assert(findLongestRunOfUniqueCharacters("nndfddf") == 3)
    assert(findLongestRunOfUniqueCharacters("absjfye") == 7)
    assert(findLongestRunOfUniqueCharacters("abbbbbao") == 3)
    assert(findLongestRunOfUniqueCharacters("aaaaaaa") == 0)

  }
}
