package day02


class Exercise {

}
object Exercise {
  def main(args: Array[String]): Unit = {

    val lst0 = List(7,1,2,3,4)
    val lst1 = lst0.map(_ * 2)
    println(lst1)

    val lst2 = lst0.filter(_ % 2 == 0)
    println(lst2)

    val lst3 = lst0.sorted
    println(lst3)

    val lst4 = lst3.reverse
    println(lst4)

    val it = lst0.grouped(2)
//    println(it.toBuffer)

    // 这里出现了问题，上面输出it.toBuffer后，lst5为空
    // 原因是it为迭代器，输出完了就没了
    val lst5 = it.toList
    println("lst5 " + lst5)

    val lst6 = lst5.flatten
    println(lst6)

    val lines = List("aa bb dd ", "dfa sdfa", "dd gg hh")
    val words = lines.map(_.split(" ")).flatten
    println(words)

    val words2 = lines.flatMap(_.split(" "))
    println(words2)

    val sum1 = lst1.sum
    val arr = Array(1,2,3,4,5,6,7,8)

    // 并行求和
    val res = arr.par.sum
    println(res)

    val res2 = arr.reduce(_ + _)
    println(res2)

    val res3 = arr.fold(0)(_ + _)
    println(res3)

    val res4 = arr.par.fold(1)(_ + _)
    println(res4)

    // 第一个_ 是初始值0 然后加上 _.sum 即小元素聚合，后面的 _ + _ 是大元素聚合
    val res5 = lst5.aggregate(0)(_ + _.sum, _ + _)
    println(res5)

    // 并集：union  交集：intersect  差集：diff


  }
}
