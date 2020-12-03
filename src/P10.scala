package myscala99

import myscala99.P09.pack

object P10 {
  //[P10](http://aperiodic.net/phil/scala/s-99/p10.scala) (*) Run-length encoding of a list.一个列表的游程编码。
  //Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
  //使用 P09 的结果实现所谓数据游程编码的压缩方法。连续重复的元素被编码成元组（<重复的数量 N>, <重复的元素 E>）
  //Example:
  //
  //	scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //	res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

  def encode[A](list: List[A]): List[(Int, A)] = pack(list) map {e => (e.length, e.head)}

  def main(args: Array[String]) = {
    println(encode(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
  }

}
