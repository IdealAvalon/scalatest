package day03

/**
  * author: zhangdq
  * Description:
  * 声明类时不需要加public关键字，默认是public
  * 一个类文件可以声明多个类
  * 类名可以和类文件不一致，但通常是一致的
  * Date: Create in 21:16 2019/5/5
  */
class Person {

  // 用val修饰的变量是只读的，相当于只有get方法，没有set方法
  val id: String = "100"

  // 用var修饰变量，相当于既有get，又有set方法 _ 就是赋了初值
  var name: String = _

  // 用private修饰的属性，该属性属于对象私有变量，只有本类和伴生对象访问
  private var age: Int = _

  // 属于本类私有变量，伴生对象也不能访问
  private[this] val gender = "male"


}

object Person{

  def main(args: Array[String]): Unit = {

    val p = new Person
    p.name = "jingjing"
    p.age = 33
    println(p.id)
    println("name: " + p.name) // 是个null
    println("age: " + p.age)
    // 访问不到
    println("gender: ")


  }

}

object Test1{
  def main(args: Array[String]): Unit = {
    val p = new Person
    // 这里就访问不到age

  }
}

// 构造函数  叫   构造器
