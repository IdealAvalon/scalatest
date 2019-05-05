package day02

import scala.collection.mutable.ArrayBuffer

/**
  * author: zhangdq
  * Description: 在scala中是没有static修饰的，可以使用object关键字加类名的语法结构实现同样功能
  * 1、工具类
  * 2. 实现单例模式
  * Date: Create in 20:32 2019/5/5
  */
object SingletonDemo {

  def main(args: Array[String]): Unit = {
    val factory = SessionFactory
    println(factory.getSessions)
    println(factory.getSessions.size)
    println(factory.getSessions(0))
    println(factory.removeSession)
  }
}

object SessionFactory {

  /**
    * 相当于java静态块
    */
  println("SessionFactory被执行了")
  var i = 5

  private val session = new ArrayBuffer[Session]

  while(i > 0){
    session += new Session
    i -= 1
  }

  def getSessions = session

  def removeSession: Unit = {
    val s = session(0)
    session.remove(0)
    println("session被移除" + s)
  }
}

class Session {}
