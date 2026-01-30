object Operators {
  def main(args: Array[String]): Unit = {
    println("--- 4. Operators ---")
    
    val a = 10
    val b = 3
    
    // Arithmetic Operators
    println(s"Addition: ${a + b}")
    println(s"Subtraction: ${a - b}")
    println(s"Multiplication: ${a * b}")
    println(s"Division: ${a / b}")
    println(s"Modulus: ${a % b}")
    
    // Comparison Operators
    println(s"Is a equal to b? ${a == b}")
    println(s"Is a not equal to b? ${a != b}")
    println(s"Is a greater than b? ${a > b}")
    println(s"Is a less than or equal to b? ${a <= b}")
    
    // Logical Operators
    val x = true
    val y = false
    println(s"x AND y: ${x && y}")
    println(s"x OR y: ${x || y}")
    println(s"NOT x: ${!x}")
  }
}