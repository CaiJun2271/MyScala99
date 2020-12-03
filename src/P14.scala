package myscala99

object P14 {
  //[P14](http://aperiodic.net/phil/scala/s-99/p14.scala) (*) Duplicate the elements of a list.复制一个列表的元素
  //Example:
  //
  //	scala> duplicate(List('a, 'b, 'c, 'c, 'd))
  //	res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

  def duplicate[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case head :: tail => List.fill(2)(head) ::: duplicate(tail)
  }

  def main(args: Array[String]) = {
    println(duplicate(List('a, 'b, 'c, 'c, 'd)))
  }

}
