package ch06

/**
 * @author tomerb
 * on 10/04/14.
 */
object HigherOrderFunctions extends App {
  import math._

  max(4, 5)
  val max4 = max(4, _: Int)

  def mulThree(a: Int)(b: Int)(c: Int): Int = a * b * c
  println(mulThree(3)(4)(5))

  val multTwoWithNine = mulThree(3) _
  println("multTwoWithNine(2)(3) " + multTwoWithNine(2)(3))

}
