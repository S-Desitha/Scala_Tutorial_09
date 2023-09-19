package mypackage
object LabSession9_Q4 {
  def main(args: Array[String]): Unit = {
    val account1 = new Account2("1", 1000.0)
    val account2 = new Account2("2", -500.0)
    val account3 = new Account2("3", 2000.0)
    val account4 = new Account2("4", -5000.0)

    val bankAccounts = List(account1, account2, account3 ,account4)

    println(s"***********************")
    println(s"Current Account Balances")
    bankAccounts.foreach(println)
    println(s"\n")

    println(s"***********************")
    println("\nNegative Balance Accounts:")
    negativeBalanceAccounts(bankAccounts).foreach(println)
    println(s"\n")

    println(s"***********************")
    println(s"\nTotal Balance of All Accounts: ${calculateTotalBalance(bankAccounts)}")
    println(s"\n")

    println(s"***********************")
    println("\nFinal Balances After Applying Interest:")
    applyInterest(bankAccounts).foreach(println)
    println(s"\n")
    }

  private def negativeBalanceAccounts(accounts: List[Account2]): List[Account2] = {
    accounts.filter(_.balance < 0)
  }

  private def calculateTotalBalance(accounts: List[Account2]): Double = {
    accounts.map(_.balance).sum
  }

  private def applyInterest(accounts: List[Account2]): List[Account2] = {
    accounts.map { account =>
      if (account.balance > 0) {
        account.balance += account.balance * 0.05
      } else {
        account.balance += account.balance * 0.1
      }
      account
    }
  }
}
