package jp.stoic.atcoder.sumitrust2019

import java.util.*

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val price = sc.nextInt()

  val n1 = price / 100
  val n2 = price % 100
  if (n2 / 5.0 <= n1) {
    println(1)
  } else {
    println(0)
  }
}