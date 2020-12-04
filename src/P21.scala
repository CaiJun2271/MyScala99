package myscala99

object P21 {
  //[P21](http://aperiodic.net/phil/scala/s-99/p21.scala) (*) Insert an element at a given position into a list.将一个元素插入到列表中
  //Example:
  //
  //	scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
  //	res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)

  def insertAt[T](s: T, n: Int, list: List[T]): List[T] = (n, list) match {
    case (_, Nil) => throw new NoSuchElementException
    case (0, temp) => s :: temp
    case (_, head :: tail) => head :: insertAt(s, n-1, tail)
  }

  def main(args: Array[String]) = {
    println(insertAt('new, 1, List('a, 'b, 'c, 'd)))
  }

}
