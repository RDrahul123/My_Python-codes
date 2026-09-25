abstract class Person{ // absract class
    def age(): Unit // abstract method
}

class Student extends Person{
    override def age(): Unit = {
        println("Student age is 20")
    }
}

class Employee extends Person{
    override def age(): Unit = {
        println("Employee age is 30")
    }
}

object Main {
    def main(args: Array[String]): Unit = {
        val student = new Student()
        val employee = new Employee() 
        student.age()
        employee.age()
    }
}