error id: file:///C:/Users/rahul/Github/My_Python-codes/Scala%20codes/02_StringManipulation.scala:java/lang/String#contains().
file:///C:/Users/rahul/Github/My_Python-codes/Scala%20codes/02_StringManipulation.scala
empty definition using pc, found symbol in pc: java/lang/String#contains().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -scala/Predef.
	 -scala/Predef#
	 -scala/Predef().
offset: 264
uri: file:///C:/Users/rahul/Github/My_Python-codes/Scala%20codes/02_StringManipulation.scala
text:
```scala
// Run: scala-cli run 02_StringManipulation.scala

object StringManipulation extends App {

  def reverseStr(s: String): String = s.reverse

  def reversestr2(s: String): String = s.reverse

  def countVowels(s: String): Int =
    s.toLowerCase.count(c => "aeiou".@@contains(c))

  def isPalindrome(s: String): Boolean = {
    val cleaned = s.toLowerCase
    cleaned == cleaned.reverse
  }

  val text = "Scala is fun"

  println(s"Original:  $text")
  println(s"Reversed:  ${reverseStr(text)}")
  println(s"Vowels:    ${countVowels(text)}")
  println(s"Palindrome check on 'madam': ${isPalindrome("madam")}")
  println(s"Palindrome check on '$text': ${isPalindrome(text)}")
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#contains().