package myscala99

object P05 {
  //[P05](http://aperiodic.net/phil/scala/s-99/p05.scala) (*) 列表逆向输出
  //Example:
  //
  //	scala> reverse(List(1, 1, 2, 3, 5, 8))
  //	res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  def reverse[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case l :: tail => reverse(tail) :+ l
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]) = {
      println(reverse(List(1, 1, 2, 3, 5, 8)))
    }

}
