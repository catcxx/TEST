package cxx
import scala.math._
object Example1 {
  def main(args: Array[String]) {
    //val用于声明可变变量
    var count = 0
    count += 1
    println(count)

    // val用于常量声明,不可改变
    val constant = 0
    //constant=1会报错

    //apply方法可看作()重载
    println("Hello"(4))
    println("Hello".apply(4))
    println(BigInt.apply("1234567890"))

    println("Hello," + constant)
    println("Hello".toUpperCase())

    println("Hello".head) // 输出 H
    println("tail :" + "Hello".tail) // 输出 ello
    println("takeRight(2): " + "Hello".takeRight(2)) //输出 o
    println("Hello".intersect("World")) // 输出 lo
    println("Hello".distinct) // 输出 Helo
    println("countisLower: " + "Hello".count(_.isLower)) // 输出 4

    println(1.to(10))
    println(1.toString())
    println(99.54.toInt)
    println(sqrt(2))

  }
}