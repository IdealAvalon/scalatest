package day03

/**
  * author: zhangdq
  * Description:
  * apply方法通常称为注入方法， 在伴生对象做一些初始化操作
  * apply方法的参数列表不需要和构造器的参数列表统一
  *
  * unapply方法通常称为提取方法，用来提取固定数量的对象，会返回一个序列，是option类型
  * 内部生成了一个some对象，可以存放一些值
  *
  * apply方法和unapply方法会被隐式调用
  *
  *
  * mynote：
  *   apply常用来生成对象，这样的话，就不需要new来生成对象
  *   unapply用来提取对象中的值，常在模式匹配中使用
  *
  * ps: private[day03]
  *   类前面加这个东西，那么这个类只能在本包内访问，但是伴生对象可以被访问
  *   构造器前面，类名的后面加private，是伴生对象的权限，即只有伴生对象可以访问，同包内的其他类特不能访问
  * Date: Create in 10:54 2019/5/6 
  */
class ApplyDemo (val name: String, var age: Int, var faceValue: Int){

}

object ApplyDemo {

  def apply(name: String, age: Int, faceValue: Int): ApplyDemo =
    new ApplyDemo(name, age, faceValue)

  def unapply(applyDemo: ApplyDemo): Option[(String, Int, Int)] = {
    if (applyDemo == null){
      None
    } else {
      Some(applyDemo.name, applyDemo.age, applyDemo.faceValue)
    }
  }


}

object Test2 {
  def main(args: Array[String]): Unit = {

    // 调用apply方法
    val applyDemo = ApplyDemo("lisi", 23, 98)

    applyDemo match {
      case ApplyDemo("lisi", age, faceValue) => println(s"age: $age")
      case _ => println("no match nothing")
    }
  }
}
