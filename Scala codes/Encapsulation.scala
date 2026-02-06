class BankAccount {

  private var balance: Double = 0

  def deposit(amount: Double): Unit = {
    balance += amount
  }

  def getBalance(): Double = {
    balance
  }
}

object Main {
  def main(args: Array[String]): Unit = {

    val acc = new BankAccount()

    acc.deposit(5000)

    println("Balance: " + acc.getBalance())
  }
}
