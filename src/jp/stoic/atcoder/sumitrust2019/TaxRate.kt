package jp.stoic.atcoder.sumitrust2019

import java.util.*

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val price = sc.nextInt()

  val wotax = Math.ceil(price / 1.08).toInt()
  val check = Math.floor(wotax * 1.08).toInt()
  if (check == price) {
    println(wotax)
  } else {
    println(":(")
  }
}