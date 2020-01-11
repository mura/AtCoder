package jp.stoic.atcoder.abs

import java.util.*

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val num = sc.nextInt()
  val min = sc.nextInt()
  val max = sc.nextInt()

  val count = (1..num)
    .filter {
      val sum = it.toString().map { (it - 48).toInt() }.sum()
      sum in min..max
    }
    .sum()

  println(count)
}