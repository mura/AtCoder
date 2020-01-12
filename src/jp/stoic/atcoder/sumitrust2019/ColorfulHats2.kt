package jp.stoic.atcoder.sumitrust2019

import java.math.BigInteger
import java.util.*

data class Color(
  var x: Int = 0,
  var y: Int = 0,
  var z: Int = 0
) {
  fun hat(num: Int) {
    when {
      x == num -> x += 1
      y == num -> y += 1
      z == num -> z += 1
    }
  }

  fun t(num: Int): Int {
    var t = 0
    if (x == num) t += 1
    if (y == num) t += 1
    if (z == num) t += 1
    return t
  }
}

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val n = sc.nextInt()
  val hats = Array(n) { sc.nextInt() }
  val color = Color()

  var result = BigInteger.ONE
  for (hat in hats) {
    result = result.multiply(BigInteger(color.t(hat).toString()))
    color.hat(hat)
  }
  println(result.mod(BigInteger("1000000007")))
}