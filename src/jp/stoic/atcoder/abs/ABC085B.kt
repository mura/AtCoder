package jp.stoic.atcoder.abs

import java.util.*

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val size = sc.nextInt()
  val mochis = Array(size) { sc.nextInt() }

  val count = mochis.distinct().size

  println(count)
}