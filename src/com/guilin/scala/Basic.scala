package com.guilin.scala

/**
 * Created by hadoop on 2014/10/31.
 */
object Basic {

  def hello(name: String = "ChinaSpark"): String = {
    "Hello:" + name
  }

  def helloScala() {
    println("hello Scala!!!")
  }

  //匿名函数
  def add = (x: Int, y: Int) => x + y

  //颗粒化
  def add2(x: Int)(y: Int) = x + y

  def printEveryChar(c: String*) = {
    c.foreach(x => println(x))
  }

  def main(args: Array[String]) = {
    //    println("HelloWorld!")

    //使用默认值
    println(hello())

    println(hello("Scala"))

    //两种方式相同
    println(helloScala) //无参数时可不带括号
    println(helloScala())

    println(add(1, 2))

    println(add2(1)(3))

    printEveryChar("a", "b", "c", "d")

    //if... else...
    val x = 1
    val a = if (x > 0) 1 else 0
    println(a)

    //while循环
    var (n, r) = (10, 0) //同时为多个变量赋值
    while (n > 0) {
      r = r + n
      n = n - 1
    }
    println(r)

    //for循环
    for (i <- 1 to 10) {
      println(i) //输出1-10
    }
    for (i <- 1.to(10)) {
      println(i) //输出1-10
    }
    for (i <- 1 until 10) {
      println(i) //输出1-9
    }
    for (i <- 1 to 10 if i % 2 == 0) {
      println(i) //打印偶数
    }
  }

}
