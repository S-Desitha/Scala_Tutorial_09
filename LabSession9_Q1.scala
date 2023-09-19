package mypackage
object LabSession9_Q1 {
  def main(args: Array[String]): Unit = {
    val x = new Rational1(3, 4)
    val y = new Rational1(-5, 6)

    println(s"Input")
    println(s"x: $x")
    println(s"y: $y")

    val negX = x.neg
    val negY = y.neg

    println(s"Output")
    println(s"-x: $negX")
    println(s"-y: $negY")
  }
}
