object Function_2 {
  def main(args: Array[String]): Unit = {
    println("--- 5. Function with Two Parameters ---")
    
    // Define a function that takes two parameters and returns their sum
    def add(x: Int, y: Int): Int = {
      x + y
    }
    
    // Call the function and print the result
    val num1 = 5
    val num2 = 7
    val result = add(num1, num2)
    println(s"The sum of $num1 and $num2 is: $result")

    // Data Types in Scala

    val i: Int = 10
    val l: Long = 100000L
    val d: Double = 3.14
    val f: Float = 2.5f
    val b: Boolean = true
    val c: Char = 'A'
    val s: String = "Scala"
    
    println(s"Integer: $i")
    println(s"Long: $l")
    println(s"Double: $d")
    println(s"Float: $f")
    println(s"Boolean: $b")
    println(s"Char: $c")
    println(s"String: $s")
  }
}