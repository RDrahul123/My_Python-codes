object Functions {
  def main(args: Array[String]): Unit = {
    println("--- 3. Functions ---")
    
    // 1. Standard Method definition
    def add(a: Int, b: Int): Int = {
      a + b // No 'return' keyword needed. Last line is returned.
    }
    
    println(s"Sum of 5 and 3: ${add(5, 3)}")
    
    // 2. Anonymous Function (Lambda) stored in a variable
    // Syntax: (Input) => Output
    val multiply = (x: Int, y: Int) => x * y
    
    println(s"Multiplication of 4 and 5: ${multiply(4, 5)}")
    
    // 3. Higher-Order Function (Function taking another function)
    def operateOnNumbers(x: Int, y: Int, func: (Int, Int) => Int): Int = {
      func(x, y)
    }
    
    val result = operateOnNumbers(10, 2, multiply)
    println(s"Higher Order Result: $result")
  }
}