package day03.matchdemo

import scala.util.Random

/**
  * author: zhangdq
  * Description:
  *
  * Date: Create in 09:15 2019/5/7 
  */
object CaseClassDemo {

  def main(args: Array[String]): Unit = {
    val arr = Array(CheckTimeOutTask, SubmiTask("1000", "task-0001"), HeartBeat(3000))
    arr(Random.nextInt(arr.length)) match {
      case CheckTimeOutTask => println("CheckTimeOutTask")
      case SubmiTask(port, task) => println("SubmiTask")
      case _ => println("Not Matched")
    }
  }

}

case class HeartBeat(time: Long)
case class SubmiTask(id: String, taskName: String)
case object CheckTimeOutTask
