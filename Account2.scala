package mypackage
class Account2(val accountNumber: String, var balance: Double) {
  override def toString: String = s"Account $accountNumber - Balance: $balance"
}
