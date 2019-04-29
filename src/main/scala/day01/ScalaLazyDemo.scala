package day01

/**
  * @author: zhangdq
  * @Description:
  * @Date: Create in 19:58 2019/4/29 
  */
class ScalaLazyDemo {

}
object ScalaLazyDemo{
  def init(): Unit = {
    println("zhxingle init()")

  }

  def main(args: Array[String]): Unit = {
    val property = init();  // 没有用lazy修饰的
    println("after init()")
    println(property)
  }
}

object ScalaLazyDemo2{
  def init(): Unit = {
    println("zhxingle init()")

  }

  def main(args: Array[String]): Unit = {
    lazy val property = init();  // 没有用lazy修饰的
    println("after init()")
    println(property)
  }
}


