object HelloWorld {
  def main(args: Array[String]): Unit = {

// val name = "Rahul"; val age = 28

// val a = s"$name is $age"              // s-interpolator: substitutes variables/expressions
// val b = s"next year: ${age + 1}"     // braces needed for expressions, not just bare identifiers
// val c = f"$name%s is $age%03d"        // f-interpolator: printf-style formatting, type-checked
// val d = raw"line1\nline2"            // raw: no escape processing — \n stays literal backslash-n

// println(a)
// println(b)
// println(c)
// println(d)

// val price = 1234.52345678
// println(price)
// println(price.formatted("%.4f")) // formatted: formats a number to a string with specified decimal places 
  
val datePattern = """(\d{4})-(\d{2})-(\d{2})""".r   // .r turns a String into a Regex

"2026-07-28" match {
  case datePattern(year, month, day) => println(s"year=$year month=$month day=$day")
  case _ => println("no match")
}

datePattern.findAllIn("born 1998-01-01, died 2090-12-31").toList
datePattern.replaceAllIn("today is 26-07-28", "[DATE]")  
  }
}

