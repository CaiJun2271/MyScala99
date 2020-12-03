package myscala99
object P03 {
  //[P03](http://aperiodic.net/phil/scala/s-99/p03.scala) (*) 找出列表的第n个元素
  //按惯例，列表的第一个索引是 0
  //
  //Example:
  //
  //    scala> nth(2, List(1, 1, 2, 3, 5, 8))
  //    res0: Int = 2

  def nth[A](n: Int, list: List[A]): A = (n, list) match {
    case (0, l :: _) => l
    case (n, _ :: tail) => nth(n - 1, tail)
    case (_, _) => throw new NoSuchElementException
  }

  def main(args: Array[String]) = {
    println(nth(2, List(1, 1, 2, 3, 5, 8)))
  }

}
