package jp.stoic.atcoder.sumitrust2019

import java.util.*

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val n = sc.nextInt()
  val s = sc.next()

  val keys = mutableSetOf<String>()
  val firsts = mutableSetOf<Char>()
  val seconds = mutableSetOf<Char>()
  val thrids = mutableSetOf<Char>()
  for (first in 0..s.length - 3) {
    val digit1 = s[first]
    if (firsts.size == 10) {
      break
    }
    if (firsts.contains(digit1)) {
      continue
    }
    firsts.add(digit1)
    seconds.clear()
    for (second in first + 1..s.length - 2) {
      val digit2 = s[second]
      if (seconds.size == 10) {
        break
      }
      if (seconds.contains(digit2)) {
        continue
      }
      seconds.add(digit2)
      thrids.clear()
      for (third in second + 1 until s.length) {
        val digit3 = s[third]
        if (thrids.size == 10) {
          break
        }
        if (thrids.contains(digit3)) {
          continue
        }
        thrids.add(digit3)
        val key = "$digit1$digit2$digit3"
        keys.add(key)
      }
    }
  }
  println(keys.size)
}