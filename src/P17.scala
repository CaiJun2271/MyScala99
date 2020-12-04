package myscala99

object P17 {
  //[P17](http://aperiodic.net/phil/scala/s-99/p17.scala) (*) Split a list into two parts.把列表一分为二
  //The length of the first part is given. Use a Tuple for your result.
  //第一部分的长度会给出。返回的结果使用元祖。
  //
  //Example:
  //
  //	scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  //	res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

  def split[T](n: Int, list: List[T]): (List[T], List[T]) = (n, list) match {
    case (_, Nil) => throw new NoSuchElementException
    case (0, temp) => (List(), temp)
    case (_, head :: tail) => (head :: split(n-1, tail)._1, split(n-1, tail)._2)
  }

  def main(args: Array[String]) = {
    println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
