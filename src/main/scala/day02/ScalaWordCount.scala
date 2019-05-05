package day02

/**
  * author: zhangdq
  * Description: wordcount
  * Date: Create in 20:10 2019/5/5
  */
object ScalaWordCount {

  def main(args: Array[String]): Unit = {
    val lines = List("hello java hello python", "hello scala", "hello scala hello java hello scala")

    // 切分并压平
    val words = lines.flatMap(_.split(" "))

    // 把每个单词拿出来，生成元组pair
    val tuples = words.map((_, 1))

    // 分组 以单词
    val grouped = tuples.groupBy(_._1)

    // 统计value（list）的长度就可以了
    val sumed = grouped.mapValues(_.size)

    // 排序
    val sorted = sumed.toList.sortBy(_._2).reverse


    println(sorted)

    println("lines.flatten: " + lines.flatten(_.split(" ")))
    println("lines.flatMap: " + lines.flatMap(_.split(" ")))

  }
}

// 单例对象，用来代替static修饰