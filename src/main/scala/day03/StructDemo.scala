package day03

/**
  * author: zhangdq
  * Description: 类后面小括号里的就相当于是构造器
  * Date: Create in 21:37 2019/5/5 
  */
class StructDemo(val name: String, var age: Int, faceValue: Int = 90) {

  // 构造器中的faceValue默认是val修饰的。并且伴生对象也无法调用
  // 如果想伴生对象也能用，要添加get函数

  var gender: String = _

  // 主构造器
  def getFaceValue(): Int ={
    // 最后一句表示返回值
    faceValue
  }

  // 辅助构造器
  def this(name: String, age: Int, faceValue: Int, gender: String){
    this(name,age, faceValue) // 辅助构造器第一行必须先调用主构造器
    this.gender = gender
  }

}

object StructDemo {
  def main(args: Array[String]): Unit = {

    val s = new StructDemo("zhangsan", 26, 98)

    // name只能获取不能赋值
    println(s.name)
    println(s.age)
    s.age = 27
    println(s.age)
    // 但是访问不到后面的faceValue
    // 只有在类中创建了get方法才能访问到
    val faceValue = s.getFaceValue()
    println(faceValue)


    val ss = new StructDemo("lisi",22,99,"nv")
    println(ss.gender)

  }
}
