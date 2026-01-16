object Update {
  def main(args: Array[String]): Unit = {
    println("--- Updated File ---")

    val x= 10
    var y = 20

    println(s"Initial values: x = $x, y = $y")

    // x= 11
    y = 25

    println(s"Updated values: x = $x, y = $y")

  }
}