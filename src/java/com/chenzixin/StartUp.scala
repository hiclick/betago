package com.chenzixin

import com.chenzixin.entity.User
import org.apache.commons.lang3.StringUtils
import org.apache.commons.math3.stat.StatUtils

/**
  * Created by Christen on 2017/2/20.
  */
object StartUp {
  def main(args: Array[String]) {
    def factorial(x: BigInt): BigInt = (BigInt(1) to x).reduce(_ * _)
    println(factorial(20))

    val name: String = ""

    val user: User = new User
    user.setName("Christen")
    user.setAge(36)

    val dArray: Array[Double] = Array(1.2, 3.4, 5.6, 7.8, 9.0)

    println(StringUtils.isBlank(name))
    println(user)
    println(StringUtils.isBlank(user.getName))
    println(StatUtils.max(dArray))
  }
}