package mypackage
class Rational2(n: Int, d: Int) {
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

  def neg: Rational2 = new Rational2(-numerator, denominator)

  def sub(other: Rational2): Rational2 = {
    new Rational2(numerator * other.denominator - other.numerator * denominator, denominator * other.denominator)
  }
}