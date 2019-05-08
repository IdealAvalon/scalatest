package day03.matchdemo

/**
  * author: zhangdq
  * Description:
  *   PartialFunction[a,b] ,a 是参数类型， b是返回值类型
  *   常用作输入模式匹配
  * Date: Create in 09:26 2019/5/7 
  */
object PartialFunctionDemo {

  def m1: PartialFunction[String, Int] = {
    case "one" => 1
    case "two" => 2
  }

  def main(args: Array[String]): Unit = {
    println(m1("one"))
  }
}
