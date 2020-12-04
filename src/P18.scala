package myscala99

object P18 {
  //[P18](http://aperiodic.net/phil/scala/s-99/p18.scala) (**) Extract a slice from a list.从一个列表中提取一个子集
  //Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.给出两个索引，I 和 K，该切片包含从第I个元素开始一直到第K个元素（但不包含K）。元素从 0 开始计数
  //Example:
  //
  //	scala> slice(3, 7, list('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  //	res0: list[symbol] = list('d, 'e, 'f, 'g)

  def slice[T](start: Int, end: Int, list: List[T]): List[T] = (start, end, list) match {
    case (_, _, Nil) => throw new NoSuchElementException
    case (0, 0, temp) => List()
    case (0, _, head :: tail) => head :: slice(start, end-1, tail)
    case (_, _, head :: tail) => slice(start-1, end-1, tail)
  }

  def main(args: Array[String]) = {
    println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
