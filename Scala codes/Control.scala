object Logic {
  def main(args: Array[String]): Unit = {
    println("--- 2. Logic as Expressions ---")
    
    val age = 16
    val age2= 20
    
    // In Scala, we assign the result of the if-statement directly:
    val status = if (age >= 18) "Adult" else "Minor"
    val status2 = if (age2 >= 18) "Adult" else "Minor"

    println(s"Age $age is classified as: $status")
    println(s"Age $age2 is classified as: $status2")
    
    // Example with Block Expressions (the last line is the return value)
    val complexResult = {
      val x = 10
      val y = 20
      x + y // This 30 becomes the value of 'complexResult'
    }
    println(s"Block result: $complexResult")
  }
}