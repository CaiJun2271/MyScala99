package myscala99

object P04 {
  //[P04](http://aperiodic.net/phil/scala/s-99/p04.scala) (*) 计算列表的长度
  //Example:
  //
  //	scala> length(List(1, 1, 2, 3, 5, 8))
  //	res0: Int = 6

  def length[A](list: List[A]): Int = list match {
    case Nil => 0
    case l :: tail => 1 + length(tail)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]) = {
    println(length(List(1, 1, 2, 3, 5, 8)))
  }
}
