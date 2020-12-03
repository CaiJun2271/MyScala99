package myscala99

object P16 {
  //[P16](http://aperiodic.net/phil/scala/s-99/p16.scala) (**) Drop every Nth element from a list.从列表中每N个元素删除
  //Example:
  //
  //	scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  //	res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

  def drop[A](n: Int, list: List[A]): List[A] = (n, list) match {
    case (_, Nil) => throw new NoSuchElementException
    case (1, head :: tail) => tail
    case (_, head :: tail) => head :: drop(n-1, tail)
  }

  def main(args: Array[String]) = {
    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
