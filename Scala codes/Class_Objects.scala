object Class_Objects {
  def main(args: Array[String]): Unit = {
    println("--- 1. Class and Object Example ---")
    
    // Define a class
    class Person(var name: String, var age: Int) {
      def greet(): String = {
        s"Hello, my name is $name and I am $age years old."
      }
    }
    
    // Create an object (instance) of the class
    val person1 = new Person("Prakrit", 28)
    
    // Call a method on the object and print the result
    println(person1.greet())
  }
}