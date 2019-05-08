package day03

/**
  * author: zhangdq
  * Description:
  * 与类名相同并且用object修饰的对象叫做伴生对象
  * 类和伴生对象之间可以互相访问私有方法和属性
  * Date: Create in 10:19 2019/5/6 
  */
class Dog {

  private var name = "erha"

  def printName(): Unit = {
    println(Dog.CONSTANT + name)
  }
}

object Dog {

  private val CONSTANT: String = "wangwang"

  def main(args: Array[String]): Unit = {
    val p = new Dog
    println(p.name)
  }
}
