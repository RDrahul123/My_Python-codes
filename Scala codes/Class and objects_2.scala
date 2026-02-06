class Student {
  var name: String = ""
  var age: Int = 0

  def display(): Unit = {
    println("Name: " + name)
    println("Age: " + age)
  }
}

object Main {
  def main(args: Array[String]): Unit = {

    val s1 = new Student()

    s1.name = "Rahul"
    s1.age = 23

    s1.display()
  }
}
