package jp.stoic.atcoder.abs

import java.util.*

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val games = sc.nextInt()
  val cards = Array(games) { sc.nextInt() }

  val alice = cards.sortedDescending()
    .filterIndexed { index, card -> index % 2 == 0 }
    .sum()
  val bob = cards.sortedDescending()
    .filterIndexed { index, card -> index % 2 == 1 }
    .sum()

  println(alice - bob)
}