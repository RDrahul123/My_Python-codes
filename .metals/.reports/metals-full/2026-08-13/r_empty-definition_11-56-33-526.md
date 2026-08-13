error id: file:///C:/Users/rahul/Github/My_Python-codes/Scala%20codes/multiple.scala:
file:///C:/Users/rahul/Github/My_Python-codes/Scala%20codes/multiple.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Employee#
	 -scala/Predef.Employee#
offset: 356
uri: file:///C:/Users/rahul/Github/My_Python-codes/Scala%20codes/multiple.scala
text:
```scala
trait Base { def msg: String = "Base" }
trait A extends Base { override def msg: String = "A -> " + super.msg }
trait B extends Base { override def msg: String = "B -> " + super.msg }
class C extends Base with A with B { override def msg: String = "C -> " + super.msg }

object Main {
  def main(args: Array[String]): Unit = {

    val c = new Empl@@oyee("Rahul")

    println(employee.name)
    println(employee.greet())
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 