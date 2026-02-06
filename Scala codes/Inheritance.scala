class Person {
  var name: String = ""

  def speak(): Unit = {
    println("I am a person")
  }
}

class Student extends Person {

  def study(): Unit = {
    println("I am studying")
  }
}

object Main {
  def main(args: Array[String]): Unit = {

    val s = new Student()

    s.name = "Rahul"

    s.speak()
    s.study()
  }
}
