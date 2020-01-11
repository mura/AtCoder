package jp.stoic.atcoder.abs

import java.util.*

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val first = sc.nextInt()
  val second = sc.nextInt()

  if (first * second % 2 == 0) {
    println("Even")
  } else {
    println("Odd")
  }
}