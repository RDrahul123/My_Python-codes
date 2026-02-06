class Person {

  def speak(): Unit = {
    println("I am a person")
  }
}

class Student extends Person {

  override def speak(): Unit = {
    println("I am a student")
  }
}

object Main {
  def main(args: Array[String]): Unit = {

    val s = new Student()

    s.speak()
  }
}
