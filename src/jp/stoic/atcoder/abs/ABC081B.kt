package jp.stoic.atcoder.abs

import java.util.*

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val length = sc.nextInt()
  val numbers = Array(length) { sc.nextInt() }

  var count = 0
  while (numbers.filter { it > 0 && it % 2 == 0 }.size == numbers.size) {
    count += 1
    for (idx in numbers.indices) {
      numbers[idx] /= 2
    }
  }

  println(count)
}