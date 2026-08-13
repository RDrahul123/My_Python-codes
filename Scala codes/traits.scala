trait Greeter {
  def name: String                    // Abstract member
  def greet(): String = s"Hello, $name" // Concrete/default method
}

class Employee(val name: String) extends Greeter

object Main {
  def main(args: Array[String]): Unit = {

    val employee = new Employee("Rahul")

    println(employee.name)
    println(employee.greet())
  }
}