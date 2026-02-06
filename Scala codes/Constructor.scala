class Student(name: String, age: Int) {

  def display(): Unit = {
    println("Name: " + name)
    println("Age: " + age)
  }
}

object Main {
  def main(args: Array[String]): Unit = {

    val s1 = new Student("Rahul", 23)

    s1.display()
  }
}
