package myscala99
import myscala99.P10.encode
object P28 {
  //[P28](http://aperiodic.net/phil/scala/s-99/p28.scala) (**) Sorting a list of lists according to length of sublists.根据子列表的长度进行排序。
  //a) We suppose that a list contains elements that are lists themselves. The objective is to sort the elements of the list according to their length. E.g. short lists first, longer lists later, or vice versa.
  //a) 我们假设一个列表的元素也是列表。目标就是根据子列表长度进行排序。例如，短列表在前面，长一点靠后，或者相反。
  //Example:
  //
  //	scala> lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
  //	res0: List[List[Symbol]] = List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))

  def lsort[T](list: List[List[T]]): List[List[T]] = list sortBy {_.length}

  def lsortFreq[T](list: List[List[T]]): List[List[T]] = {
    val freq = Map(encode(list.map{_.length}.sorted) map { _.swap }:_*)
    list sortBy {a => freq(a.length)}
  }

  def main(args: Array[String]) = {
    //println(lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))))
    println(lsortFreq(List(List('a', 'b', 'c'), List('d', 'e'), List('f', 'g', 'h'), List('d', 'e'), List('i', 'j', 'k', 'l'), List('m', 'n'), List('o'))))
  }

}
