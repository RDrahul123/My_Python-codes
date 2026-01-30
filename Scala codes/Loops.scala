object Loops {
  def main(args: Array[String]): Unit = {
    println("--- 3. Loops ---")
    
    // Example of a 'for' loop
    println("For loop from 1 to 5:")
    for (i <- 1 to 5) {
      println(i)
    }
    
    // Example of a 'while' loop
    println("While loop counting down from 5:")
    var count = 5
    while (count > 0) {
      println(count)
      count -= 1
    }
  }
}