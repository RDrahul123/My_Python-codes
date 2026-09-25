case class Student(name: String, age: Int)

object Main extends App{
    val s1 = Student("Rahul", 20)
    val s2 = Student("Rohit", 22)

    println(s1)
    println(s2)
    println(s1.name)
    println(s2.age)
}

