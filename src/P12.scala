package myscala99

object P12 {
  // [P12](http://aperiodic.net/phil/scala/s-99/p12.scala) (**) Decode a run-length encoded list.解码游程编码的列表。
  //Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
  //给出 P10 的结果，构造一个解压版本。
  //Example:
  //
  //	scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  //	res0: List[Symbol] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

  def decode[A](list: List[(Int, A)]): List[A] = list match {
    case Nil => Nil
    case (k, v) :: tail => List.fill(k)(v) ::: decode(tail)
  }

  def main(args: Array[String]) = {
    println(decode(List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))))
  }
}
