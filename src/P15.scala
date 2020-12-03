package myscala99

object P15 {
  //[P15](http://aperiodic.net/phil/scala/s-99/p15.scala) (**) Duplicate the elements of a list a given number of times.按照参数来决定复制的数量
  //Example:
  //
  //	scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  //	res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

  def duplicateN[A](n: Int, list: List[A]): List[A] = list match {
    case Nil => Nil
    case head :: tail => List.fill(n)(head) ::: duplicateN(n, tail)
  }

  def main(args: Array[String]) = {
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }

}
