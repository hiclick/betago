package hello

/**
  * Created by Christen on 2017/2/3.
  */
object Hello {
  def main(args: Array[String]) {
    val name = "Christen"
    println(name.toUpperCase())
    val bonjour = "Hello" :: "Hola" :: "Guten Tag" :: "こんにちは" :: "您好" :: Nil
    println(bonjour.exists(s => s == "Hola"))
  }
}

