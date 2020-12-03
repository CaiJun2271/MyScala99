package myscala99

import myscala99.P09.pack

object P11 {
  //[P11](http://aperiodic.net/phil/scala/s-99/p11.scala) (*) Modified run-length encoding.改进游程编码。
  //Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
  //如果一个元素没有重复，只需要把它复制到结果列表中。只有重复的元素才会被转化成 (N, E)。
  //Example:
  //
  //	scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //	res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))

  def encodeModified(list: List[Any]): List[Any] = pack(list) map {e => if(e.length == 1) e.head else (e.length, e.head)}

  def main(args: Array[String]) = {
    println(encodeModified(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
  }

}
