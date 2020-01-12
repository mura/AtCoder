package jp.stoic.atcoder.sumitrust2019

import java.util.*

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val m1 = sc.nextInt()
  sc.nextInt()
  val m2 = sc.nextInt()
  val d2 = sc.nextInt()

  if (m1 == m2) {
    println(0)
    return
  }
  if (m1 != m2 && d2 == 1) {
    println(1)
  } else {
    println(0)
  }
}