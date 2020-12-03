package myscala99

import scala.util.Try

object P01 {
  // P01 (*) Find the last element of a list.
  //     Example:
  //     scala> last(List(1, 1, 2, 3, 5, 8))
  //     res0: Int = 8

  def last[A](list: List[A]): A = list match {
    case l :: Nil => l
    case l :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit ={
    val l = List(1, 1, 2, 3, 5, 8)
    println(last(l))
  }
}
