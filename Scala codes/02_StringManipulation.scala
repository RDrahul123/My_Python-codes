// Run: scala-cli run 02_StringManipulation.scala

object StringManipulation extends App {

  // def reverseStr(s: String): String = s.reverse

  def reversestr2(s: String): String = s.reverse

  def countVowels(s: String): Int =
    s.toLowerCase.count(c => "aeiou".contains(c))

  def isPalindrome(s: String): Boolean = {
    val cleaned = s.toLowerCase
    cleaned == cleaned.reverse
  }

  val text = "Scala is fun"

  println(s"Original:  $text")
  println(s"Reversed:  ${reversestr2(text)}")
  println(s"Vowels:    ${countVowels(text)}")
  println(s"Palindrome check on 'madam': ${isPalindrome("madam")}")
  println(s"Palindrome check on '$text': ${isPalindrome(text)}")
}
