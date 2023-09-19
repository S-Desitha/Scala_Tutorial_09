package mypackage

class Account1(val accountNumber: String, var balance: Double) {
  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited $amount in Account $accountNumber. \n New balance: $balance")
    } else {
      println("Deposit amount must be positive.")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"Withdrew $amount from Account $accountNumber. \n New balance: $balance")
    } else {
      println("Withdrawal amount is invalid or exceeds balance.")
    }
  }

  def transfer(targetAccount: Account1, amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      targetAccount.balance += amount
      println(s"Transferred $amount from Account $accountNumber to Account ${targetAccount.accountNumber}. \n New balance of Account $accountNumber : $balance")
    } else {
      println("Transfer amount is invalid or exceeds balance.")
    }
  }

  override def toString: String = s"Account $accountNumber - Balance: $balance"
}
