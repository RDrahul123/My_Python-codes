object ReverseWithLoop extends App {

  def reverseStr(s: String): String = {
    var result = ""
    for (i <- s.length - 1 to 0 by -1) {
      result += s(i)
    }
    result
  }

  println(reverseStr("Scala")) // alacS
}
