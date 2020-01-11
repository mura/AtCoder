package jp.stoic.atcoder.abs

import java.util.*

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)

  val c500 = sc.nextInt()
  val c100 = sc.nextInt()
  val c50 = sc.nextInt()
  val amount = sc.nextInt()

  var count = 0
  for (w500 in 0..c500) {
    for (w100 in 0..c100) {
      for (w50 in 0..c50) {
        val price = 500 * w500 + 100 * w100 + 50 * w50
        if (price == amount) count += 1
      }
    }
  }
  println(count)
}