package com.chenzixin.book.manning.function

/**
  * Created by Christen on 2017/2/3.
  */
object Hello {
  def main(args: Array[String]) {

    val name = "Christen, She's just not that into you Dear"
    println(name.toUpperCase())

    val bonjour = "Hello" :: "Hola" :: "Guten Tag" :: "こんにちは" :: "您好" :: Nil
    println(bonjour.exists(s => s == "Hola"))

    def factorial(x: BigInt): BigInt = (BigInt(1) to x).reduce(_ * _)
    println(factorial(4))

    var capital = Map("US" -> "Washington", "France" -> "Paris", "Japan" -> "Tokyo")
    capital += ("España" -> "Madrid")
    println(capital("España"))
  }
}

