package jp.stoic.atcoder.sumitrust2019

import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val t1 = BigInteger(sc.next())
  val t2 = BigInteger(sc.next())
  val a1 = BigInteger(sc.next())
  val a2 = BigInteger(sc.next())
  val b1 = BigInteger(sc.next())
  val b2 = BigInteger(sc.next())

  var d1 = (a1 - b1) * t1 // 最初のt1分間での増分
  var d2 = (a2 - b2) * t2 // 次のt2分間での増分
  //println("P = $d1, Q = $d2")

  if (d1 > BigInteger.ZERO) {
    d1 *= -BigInteger.ONE
    d2 *= -BigInteger.ONE
  }

  if (d1 + d2 < BigInteger.ZERO) {
    // 1サイクルが終わった時に正の向きなので、0の位置に戻ることはない
    println(0)
  } else if (d1 + d2 == BigInteger.ZERO) {
    // 1サイクルが終わると0の位置に戻るので、無限に繰り返す
    println("infinity")
  } else {
    val s = -d1 / (d1 + d2)
    val t = -d1 % (d1 + d2)
    //println("S = $s, T = $t")
    if (t == BigInteger.ZERO) {
      println(s * BigInteger("2"))
    } else {
      println(s * BigInteger("2") + BigInteger.ONE)
    }
  }
}