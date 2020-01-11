package jp.stoic.atcoder.abs

import java.util.*

data class Plan(
  val time: Int,
  val x: Int,
  val y: Int
)

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val size = sc.nextInt()
  val planList = Array(size) { Plan(sc.nextInt(), sc.nextInt(), sc.nextInt()) }

  var time = 0
  var x = 0
  var y = 0
  for (plan in planList) {
    val dt = plan.time - time
    val dx = Math.abs(plan.x - x)
    val dy = Math.abs(plan.y - y)
    val distance = dx + dy
    time = plan.time
    x = plan.x
    y = plan.y
    if (distance == dt) {
      // 時間ぴったりで移動可能
      continue
    } else if (dt > distance) {
      val remains = dt - distance
      if (remains % 2 == 0) {
        // 2で割り切れる場合は移動可能
        continue
      } else {
        println("No")
        return
      }
    } else {
      // 時間が足りない
      println("No")
      return
    }
  }

  println("Yes")
}