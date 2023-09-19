package mypackage

class Rational1(n: Int, d: Int) {
  require(d != 0, "Denominator must be nonzero")

  private val gcdValue: Int = gcd(n.abs, d.abs)
  val numerator: Int = n / gcdValue
  val denominator: Int = d / gcdValue

  def this(n: Int) = this(n, 1)

  override def toString: String = s"$numerator/$denominator"

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) {
      a
    } else {
      gcd(b, a % b)
    }
  }

  def neg: Rational1 = new Rational1(-numerator, denominator)
}
