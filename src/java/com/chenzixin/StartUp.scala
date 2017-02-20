package com.chenzixin

import com.chenzixin.entity.User
import org.apache.commons.lang3.StringUtils
import org.apache.commons.math3.stat.StatUtils

/**
  * Created by Christen on 2017/2/20.
  */
object StartUp {
  def main(args: Array[String]) {

    val startTime: Long = System.currentTimeMillis
    val name: String = ""

    val user: User = new User
    user.setName("Christen")
    user.setAge(36)

    val dArray: Array[Double] = Array(1.2, 3.4, 5.6, 7.8, 9.0)

    println(StringUtils.isBlank(name))
    println(user)
    println(StringUtils.isBlank(user.getName))
    println(StatUtils.max(dArray))

    val endTime: Long = System.currentTimeMillis
    println("程序运行时间：" + (endTime - startTime) + "ms")
  }
}