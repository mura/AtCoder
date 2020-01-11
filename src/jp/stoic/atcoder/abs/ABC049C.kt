package jp.stoic.atcoder.abs

import java.util.*
import java.util.regex.Pattern

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val s = sc.next()
  if (s.isEmpty()) {
    println("NO")
    return
  }

  val pattern = Pattern.compile("^(dream|dreamer|erase|eraser)+$")
  println(
    if (pattern.matcher(s).matches()) {
      "YES"
    } else {
      "NO"
    }
  )
}