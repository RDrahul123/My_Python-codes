object ScalaCollectionsComplete {

  def main(args: Array[String]): Unit = {

    // ============================================================
    // 1. LIST
    // ============================================================

    println("\n========== LIST ==========")

    val numbers = List(10, 20, 30, 40, 50)

    println(s"Original List: $numbers")

    println(s"head: ${numbers.head}")
    println(s"tail: ${numbers.tail}")
    println(s"last: ${numbers.last}")
    println(s"init: ${numbers.init}")
    println(s"length: ${numbers.length}")
    println(s"isEmpty: ${numbers.isEmpty}")

    println(s"take(3): ${numbers.take(3)}")
    println(s"drop(2): ${numbers.drop(2)}")
    println(s"reverse: ${numbers.reverse}")
    println(s"contains(30): ${numbers.contains(30)}")


    // ============================================================
    // 2. MAP
    // ============================================================

    println("\n========== MAP ==========")

    val students = Map(
      "Rahul" -> 85,
      "Amit" -> 90,
      "Priya" -> 95,
      "Neha" -> 78
    )

    println(s"Students: $students")

    println(s"Rahul's marks: ${students("Rahul")}")

    println(s"Keys: ${students.keys}")
    println(s"Values: ${students.values}")

    println(s"Contains Rahul: ${students.contains("Rahul")}")

    println(s"Get Rahul: ${students.get("Rahul")}")
    println(s"Get John: ${students.get("John")}")

    println(s"Size: ${students.size}")
    println(s"Is Empty: ${students.isEmpty}")

    println("\nIterating Map:")

    students.foreach {
      case (name, marks) =>
        println(s"$name -> $marks")
    }


    // ============================================================
    // 3. SET
    // ============================================================

    println("\n========== SET ==========")

    val set1 = Set(1, 2, 3, 4, 5)
    val set2 = Set(4, 5, 6, 7, 8)

    println(s"Set 1: $set1")
    println(s"Set 2: $set2")

    println(s"Union: ${set1 union set2}")

    println(s"Intersection: ${set1 intersect set2}")

    println(s"Difference: ${set1 diff set2}")

    println(s"Contains 3: ${set1.contains(3)}")

    println(s"Size: ${set1.size}")

    println(s"Head: ${set1.head}")

    println(s"Tail: ${set1.tail}")


    // ============================================================
    // 4. ARRAY
    // ============================================================

    println("\n========== ARRAY ==========")

    val array = Array(10, 20, 30, 40, 50)

    println(s"Array: ${array.mkString(", ")}")

    println(s"First element: ${array.head}")

    println(s"Last element: ${array.last}")

    println(s"Length: ${array.length}")

    println(s"Contains 30: ${array.contains(30)}")

    array(0) = 100

    println(s"After modification: ${array.mkString(", ")}")


    // ============================================================
    // 5. VECTOR
    // ============================================================

    println("\n========== VECTOR ==========")

    val vector = Vector(10, 20, 30, 40, 50)

    println(s"Vector: $vector")

    println(s"Element at index 2: ${vector(2)}")

    println(s"Head: ${vector.head}")

    println(s"Last: ${vector.last}")

    println(s"Take 3: ${vector.take(3)}")

    println(s"Drop 2: ${vector.drop(2)}")

    println(s"Reverse: ${vector.reverse}")


    // ============================================================
    // 6. RANGE
    // ============================================================

    println("\n========== RANGE ==========")

    val range1 = 1 to 10

    println(s"1 to 10: $range1")

    val range2 = 1 until 10

    println(s"1 until 10: $range2")

    val range3 = 1 to 10 by 2

    println(s"1 to 10 by 2: $range3")


    // ============================================================
    // 7. MAP()
    // ============================================================

    println("\n========== MAP METHOD ==========")

    val nums = List(1, 2, 3, 4, 5)

    val doubled = nums.map(x => x * 2)

    println(s"Original: $nums")
    println(s"Doubled: $doubled")

    val squares = nums.map(x => x * x)

    println(s"Squares: $squares")

    // Short syntax
    val triple = nums.map(_ * 3)

    println(s"Tripled: $triple")


    // ============================================================
    // 8. FILTER()
    // ============================================================

    println("\n========== FILTER METHOD ==========")

    val evenNumbers = nums.filter(x => x % 2 == 0)

    println(s"Even numbers: $evenNumbers")

    val oddNumbers = nums.filter(_ % 2 != 0)

    println(s"Odd numbers: $oddNumbers")

    val greaterThan2 = nums.filter(_ > 2)

    println(s"Greater than 2: $greaterThan2")


    // ============================================================
    // 9. FILTERNOT()
    // ============================================================

    println("\n========== FILTERNOT METHOD ==========")

    val notEven = nums.filterNot(_ % 2 == 0)

    println(s"Not even: $notEven")


    // ============================================================
    // 10. FOREACH()
    // ============================================================

    println("\n========== FOREACH METHOD ==========")

    nums.foreach(x => println(s"Number: $x"))


    // ============================================================
    // 11. REDUCE()
    // ============================================================

    println("\n========== REDUCE METHOD ==========")

    val sum = nums.reduce((a, b) => a + b)

    println(s"Sum: $sum")

    val sumShort = nums.reduce(_ + _)

    println(s"Sum using short syntax: $sumShort")

    val multiplication = nums.reduce(_ * _)

    println(s"Product: $multiplication")


    // ============================================================
    // 12. FOLD()
    // ============================================================

    println("\n========== FOLD METHOD ==========")

    val foldResult = nums.fold(10)(_ + _)

    println(s"Fold result: $foldResult")


    // ============================================================
    // 13. FOLDLEFT()
    // ============================================================

    println("\n========== FOLDLEFT METHOD ==========")

    val foldLeftResult = nums.foldLeft(0)(_ + _)

    println(s"FoldLeft result: $foldLeftResult")


    // ============================================================
    // 14. FOLDRIGHT()
    // ============================================================

    println("\n========== FOLDRIGHT METHOD ==========")

    val foldRightResult = nums.foldRight(0)(_ + _)

    println(s"FoldRight result: $foldRightResult")


    // ============================================================
    // 15. SORTED
    // ============================================================

    println("\n========== SORTED ==========")

    val unsorted = List(5, 2, 8, 1, 3)

    println(s"Original: $unsorted")

    println(s"Sorted: ${unsorted.sorted}")

    println(s"Descending: ${unsorted.sorted.reverse}")


    // ============================================================
    // 16. SORTBY()
    // ============================================================

    println("\n========== SORTBY METHOD ==========")

    case class Student(
      name: String,
      marks: Int
    )

    val studentList = List(
      Student("Rahul", 85),
      Student("Amit", 92),
      Student("Priya", 78),
      Student("Neha", 95)
    )

    println("Original students:")

    studentList.foreach(println)

    val sortedStudents = studentList.sortBy(_.marks)

    println("\nSorted by marks:")

    sortedStudents.foreach(println)

    val descendingStudents =
      studentList.sortBy(_.marks).reverse

    println("\nDescending marks:")

    descendingStudents.foreach(println)


    // ============================================================
    // 17. GROUPBY()
    // ============================================================

    println("\n========== GROUPBY METHOD ==========")

    val numbers2 = List(1, 2, 3, 4, 5, 6)

    val grouped = numbers2.groupBy(_ % 2)

    println(s"Grouped: $grouped")

    println(s"Even: ${grouped(0)}")

    println(s"Odd: ${grouped(1)}")


    // ============================================================
    // 18. DISTINCT()
    // ============================================================

    println("\n========== DISTINCT METHOD ==========")

    val duplicateNumbers =
      List(1, 2, 2, 3, 3, 3, 4, 5, 5)

    println(s"Original: $duplicateNumbers")

    println(s"Distinct: ${duplicateNumbers.distinct}")


    // ============================================================
    // 19. ZIP()
    // ============================================================

    println("\n========== ZIP METHOD ==========")

    val names = List(
      "Rahul",
      "Amit",
      "Priya",
      "Neha"
    )

    val marks = List(
      85,
      90,
      95,
      88
    )

    val zipped = names.zip(marks)

    println(s"Zipped: $zipped")


    // ============================================================
    // 20. FLATTEN()
    // ============================================================

    println("\n========== FLATTEN METHOD ==========")

    val nestedNumbers =
      List(
        List(1, 2),
        List(3, 4),
        List(5, 6)
      )

    println(s"Nested: $nestedNumbers")

    println(s"Flattened: ${nestedNumbers.flatten}")


    // ============================================================
    // 21. FLATMAP()
    // ============================================================

    println("\n========== FLATMAP METHOD ==========")

    val flatMapped =
      List(1, 2, 3).flatMap(
        x => List(x, x * 10)
      )

    println(s"FlatMap result: $flatMapped")


    // ============================================================
    // 22. EXISTS()
    // ============================================================

    println("\n========== EXISTS METHOD ==========")

    val existsResult =
      nums.exists(_ > 4)

    println(s"Any number greater than 4: $existsResult")


    // ============================================================
    // 23. FORALL()
    // ============================================================

    println("\n========== FORALL METHOD ==========")

    val forallResult =
      nums.forall(_ > 0)

    println(s"All numbers greater than 0: $forallResult")


    // ============================================================
    // 24. FIND()
    // ============================================================

    println("\n========== FIND METHOD ==========")

    val found =
      nums.find(_ % 2 == 0)

    println(s"First even number: $found")


    // ============================================================
    // 25. COUNT()
    // ============================================================

    println("\n========== COUNT METHOD ==========")

    val evenCount =
      nums.count(_ % 2 == 0)

    println(s"Number of even elements: $evenCount")


    // ============================================================
    // 26. TAKEWHILE()
    // ============================================================

    println("\n========== TAKEWHILE METHOD ==========")

    val numbers3 =
      List(2, 4, 6, 7, 8, 10)

    val taken =
      numbers3.takeWhile(_ % 2 == 0)

    println(s"takeWhile result: $taken")


    // ============================================================
    // 27. DROPWHILE()
    // ============================================================

    println("\n========== DROPWHILE METHOD ==========")

    val dropped =
      numbers3.dropWhile(_ % 2 == 0)

    println(s"dropWhile result: $dropped")


    // ============================================================
    // 28. PARTITION()
    // ============================================================

    println("\n========== PARTITION METHOD ==========")

    val partitioned =
      nums.partition(_ % 2 == 0)

    println(s"Even: ${partitioned._1}")
    println(s"Odd: ${partitioned._2}")


    // ============================================================
    // 29. MIN()
    // ============================================================

    println("\n========== MIN METHOD ==========")

    println(s"Minimum: ${nums.min}")


    // ============================================================
    // 30. MAX()
    // ============================================================

    println("\n========== MAX METHOD ==========")

    println(s"Maximum: ${nums.max}")


    // ============================================================
    // 31. SUM()
    // ============================================================

    println("\n========== SUM METHOD ==========")

    println(s"Sum: ${nums.sum}")


    // ============================================================
    // 32. PRODUCT()
    // ============================================================

    println("\n========== PRODUCT METHOD ==========")

    println(s"Product: ${nums.product}")


    // ============================================================
    // 33. PRACTICAL DATA PROCESSING EXAMPLE
    // ============================================================

    println("\n========== PRACTICAL EXAMPLE ==========")

    case class Employee(
      name: String,
      department: String,
      salary: Int,
      experience: Int
    )

    val employees = List(
      Employee("Rahul", "Data", 70000, 3),
      Employee("Amit", "IT", 60000, 2),
      Employee("Priya", "Data", 80000, 5),
      Employee("Neha", "HR", 50000, 4),
      Employee("Raj", "IT", 75000, 6),
      Employee("Sneha", "Data", 90000, 7)
    )

    println("\nAll Employees:")

    employees.foreach(println)


    // ------------------------------------------------------------
    // Filter employees
    // ------------------------------------------------------------

    val experienced =
      employees.filter(_.experience >= 5)

    println("\nEmployees with >= 5 years experience:")

    experienced.foreach(println)


    // ------------------------------------------------------------
    // Extract employee names
    // ------------------------------------------------------------

    val employeeNames =
      employees.map(_.name)

    println("\nEmployee Names:")

    println(employeeNames)


    // ------------------------------------------------------------
    // Extract salaries
    // ------------------------------------------------------------

    val salaries =
      employees.map(_.salary)

    println("\nSalaries:")

    println(salaries)


    // ------------------------------------------------------------
    // Calculate total salary
    // ------------------------------------------------------------

    val totalSalary =
      employees.map(_.salary).sum

    println(s"\nTotal Salary: $totalSalary")


    // ------------------------------------------------------------
    // Calculate average salary
    // ------------------------------------------------------------

    val averageSalary =
      employees.map(_.salary).sum.toDouble /
        employees.size

    println(s"Average Salary: $averageSalary")


    // ------------------------------------------------------------
    // Highest salary
    // ------------------------------------------------------------

    val highestSalary =
      employees.maxBy(_.salary)

    println(s"\nHighest Salary Employee: $highestSalary")


    // ------------------------------------------------------------
    // Lowest salary
    // ------------------------------------------------------------

    val lowestSalary =
      employees.minBy(_.salary)

    println(s"Lowest Salary Employee: $lowestSalary")


    // ------------------------------------------------------------
    // Group employees by department
    // ------------------------------------------------------------

    val departmentGroups =
      employees.groupBy(_.department)

    println("\nEmployees by Department:")

    departmentGroups.foreach {
      case (department, employeeList) =>

        println(s"\n$department")

        employeeList.foreach(println)
    }


    // ------------------------------------------------------------
    // Sort employees by salary
    // ------------------------------------------------------------

    val sortedEmployees =
      employees.sortBy(_.salary)

    println("\nEmployees sorted by salary:")

    sortedEmployees.foreach(println)


    // ------------------------------------------------------------
    // Sort employees by experience
    // ------------------------------------------------------------

    val sortedExperience =
      employees.sortBy(_.experience)

    println("\nEmployees sorted by experience:")

    sortedExperience.foreach(println)


    // ------------------------------------------------------------
    // Employees earning more than 70,000
    // ------------------------------------------------------------

    val highSalaryEmployees =
      employees.filter(_.salary > 70000)

    println("\nEmployees earning > 70000:")

    highSalaryEmployees.foreach(println)


    // ------------------------------------------------------------
    // Data department employees
    // ------------------------------------------------------------

    val dataEmployees =
      employees.filter(_.department == "Data")

    println("\nData Department Employees:")

    dataEmployees.foreach(println)


    // ------------------------------------------------------------
    // Average salary of Data department
    // ------------------------------------------------------------

    val dataEmployeesSalary =
      dataEmployees.map(_.salary)

    val dataAverageSalary =
      dataEmployeesSalary.sum.toDouble /
        dataEmployeesSalary.size

    println(
      s"\nAverage Data Department Salary: $dataAverageSalary"
    )


    // ------------------------------------------------------------
    // Count employees by department
    // ------------------------------------------------------------

    val employeeCountByDepartment =
      employees
        .groupBy(_.department)
        .map {
          case (department, employeeList) =>
            department -> employeeList.size
        }

    println("\nEmployee Count by Department:")

    println(employeeCountByDepartment)


    // ------------------------------------------------------------
    // Highest salary by department
    // ------------------------------------------------------------

    val highestSalaryByDepartment =
      employees
        .groupBy(_.department)
        .map {
          case (department, employeeList) =>
            department ->
              employeeList.maxBy(_.salary).salary
        }

    println("\nHighest Salary by Department:")

    println(highestSalaryByDepartment)


    // ------------------------------------------------------------
    // Check whether any employee earns > 100000
    // ------------------------------------------------------------

    val highSalaryExists =
      employees.exists(_.salary > 100000)

    println(
      s"\nAny employee earning > 100000: $highSalaryExists"
    )


    // ------------------------------------------------------------
    // Check whether all employees have experience > 1
    // ------------------------------------------------------------

    val allExperienced =
      employees.forall(_.experience > 1)

    println(
      s"All employees have > 1 year experience: $allExperienced"
    )


    // ============================================================
    // END
    // ============================================================

    println("\n========== PROGRAM COMPLETED ==========")
  }
}