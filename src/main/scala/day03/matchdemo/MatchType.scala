package day03.matchdemo

import sun.font.TrueTypeFont

import scala.util.Random

/**
  * author: zhangdq
  * Description:
  * Date: Create in 11:45 2019/5/6 
  */
object MatchType {
  def main(args: Array[String]): Unit = {
    val arr = Array("asdf", 100, 3.23, true)
    val element = arr(Random.nextInt(arr.length))

    println(element)

    element match {
      case str: String => println(s"match String: $str")
      case int: Int => println(s"match int: $int")
      case matchTest: MatchTest => println(s"match MatchTest: $matchTest")
      case _: Any => println("match Any")
    }
  }
}

class MatchTest {

}
