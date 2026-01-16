object Basics {
  def main(args: Array[String]): Unit = {
    println("--- 1. Variables & Types ---")
    
    // val: Immutable 
    val message: String = "Hello, Data Scientist!" 
    // message = "New String" // This would cause a compile error
    
    // var: Mutable (Changeable)
    var counter: Int = 0
    counter = counter + 1
    
    println(s"Message: $message") // String interpolation with 's'
    println(s"Counter: $counter")
    
    val pi = 3.14159 
    println(s"The value of pi is $pi (Type inferred as Double)")
  }
}