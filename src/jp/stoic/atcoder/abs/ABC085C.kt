package jp.stoic.atcoder.abs

import java.lang.Math.abs
import java.util.*

data class Otoshidama(
  var b10k: Int = 0,
  var b5k: Int = 0,
  var b1k: Int = 0
) {
  fun total(): Int {
    return b10k * 10000 + b5k * 5000 + b1k * 1000
  }

  override fun toString(): String {
    return "$b10k $b5k $b1k"
  }
}

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val amount = sc.nextInt()
  val price = sc.nextInt()
  val max10k = price / 10000

  for (w10k in 0..max10k) {
    // 残り全部1,000とした場合の差分
    val o1 = Otoshidama(w10k, 0, amount - w10k)
    if (o1.total() > price) {
      break
    }
    val diff = abs(o1.total() - price)
    if (diff % 4000 != 0) {
      // 4,000の倍数でないと割り切れない
      continue
    }
    val w5k = diff / 4000
    val w1k = amount - w10k - w5k
    if (w1k < 0) {
      continue
    }
    val o2 = Otoshidama(w10k, w5k, w1k)
    println("$o2")
    return
  }
  println("-1 -1 -1")
}