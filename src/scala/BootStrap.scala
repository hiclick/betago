/**
  * Created by Christen on 2017/2/3.
  */
object BootStrap {
  def main(args: Array[String]) {
    def factorial(x: BigInt): BigInt = (BigInt(1) to x).reduce(_ * _)
    println(factorial(10))
  }
}

