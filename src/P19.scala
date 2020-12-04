package myscala99

object P19 {
  //[P19](http://aperiodic.net/phil/scala/s-99/p19.scala) (**) Rotate a list N places to the left.列表向左旋转
  //Examples:
  //
  //	scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  //	res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  //
  //	scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  //	res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)

  def leftRotate[T](n: Int, list: List[T]): List[T] = (n, list) match {
    case (_, Nil) => throw new NoSuchElementException
    case (0, result) => result
    case (_, head :: tail) => leftRotate(n-1, tail :+ head)
  }

  def rotate[T](n: Int, list: List[T]): List[T] = if(n>=0) leftRotate(n, list) else leftRotate(list.length+n, list)

  def main(args: Array[String]) = {
    println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    println(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
