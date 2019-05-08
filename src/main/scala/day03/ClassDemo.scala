package day03

/**
  * author: zhangdq
  * Description:
  * 特质和java接口的区别：
  *   Scala的特质能够提供具体方法的实现，而java的接口只有方法的定义，这一点很像java的抽象类
      Scala同Java，都不能进行多继承，但是前者可以实现多特质，用with关键字。这一点和java的接口相同
      Scala的特质能在对象生成时临时加入，java则没有这个特质
  * Date: Create in 11:24 2019/5/6 
  */
object ClassDemo {

  def main(args: Array[String]): Unit = {
    val human = new Human

    println(human.name)
    println(human.climb)
    println(human.distance)
  }
}

/**
 * author zhangdq
 * date 2019/5/6 11:25
 * param
 * return
 */
trait Flyable {
  //声明一个没有值的字段
  val distance: Int

  // 声明一个没有实现的方法
  def fight: String

  def fly: Unit = {
    println("I can fly")
  }
}

/*
 * author zhangdq
 * 抽象类
 * date 2019/5/6 11:26
 * param
 * return
 */

abstract class Animal {
  // 声明一个没有赋值的字段
  val name: String

  // 声明一个没有实现的方法
  def run: String

  // 声明一个有实现的方法
  def climb: String = {
    "i can climb"
  }
}

class Human extends Animal with Flyable {

  override val name = "zhangsan"
  // 重写了抽象类中没有实现的方法
  override def run = "I can run"

  override val distance = 1000
  // 实现了特质中没有实现的方法
  override def fight = "with |||"
}