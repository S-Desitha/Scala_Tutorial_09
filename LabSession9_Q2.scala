package mypackage
object LabSession9_Q2 {
  def main(args: Array[String]): Unit = {
    val x = new Rational2(3, 4)
    val y = new Rational2(5, 8)
    val z = new Rational2(2, 7)

    println(s"x: $x")
    println(s"y: $y")
    println(s"z: $z")
    println(s"\n")


    val result = x.sub(y).sub(z)
    println(s"x - y - z: $result")
  }
}
