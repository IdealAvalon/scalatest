package day03.matchdemo

import scala.util.Random

/**
  * author: zhangdq
  * Description:
  * 匹配字符串
  * Date: Create in 11:39 2019/5/6 
  */
object MatchStr {
  def main(args: Array[String]): Unit = {
    val arr = Array("zhangsan", "lisi", "zhengshuang", "abc")
    val name = arr(Random.nextInt(arr.length))

    println(name)

    name match {
      case "zhangsan" => println("张三")
      case "lisi" => println("李四")
      case _ => println("nothong")
    }
  }
}
