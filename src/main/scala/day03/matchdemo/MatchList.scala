package day03.matchdemo

/**
  * author: zhangdq
  * Description:
  *   匹配数组、元组和集合
  *
  *
  * :: 该方法被称为cons，意为构造，向队列的头部追加数据，创造新的列表。用法为 x::list,其中x为加入到头部的元素，无论x是列表与否，它都只将成为新生成列表的第一个元素，也就是说新生成的列表长度为list的长度＋1(btw, x::list等价于list.::(x))
    :+和+: 两者的区别在于:+方法用于在尾部追加元素，+:方法用于在头部追加元素，和::很类似，但是::可以用于pattern match ，而+:则不行. 关于+:和:+,只要记住冒号永远靠近集合类型就OK了。
    ++ 该方法用于连接两个集合，list1++list2
    ::: 该方法只能用于连接两个List类型的集合

  * Date: Create in 11:50 2019/5/6 
  */
object MatchList {
  def main(args: Array[String]): Unit = {
    val arr = Array(3,4,5,6)
    arr match {
      case Array(4,a,b,c) => println(s"case: $a, $b, $c")
      case Array(_, x, y, z) => println(s"case: $x, $y")
      case _ => println("match nothing")
    }

    val list1 = List(1,2,3,4)

    list1 match {
      case 1 :: Nil => println("case: 1")
      case a :: b :: c :: d :: Nil => println(s"case2 : $a, $b, $c, $d ")
      case 1 :: a => println(s"case3: $a")
      case _ => println("Not matched")
    }
  }
}
