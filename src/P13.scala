package myscala99

object P13 {
  //[P13](http://aperiodic.net/phil/scala/s-99/p13.scala) (**) Run-length encoding of a list (direct solution).游程编码（直接的方案）
  //Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.
  //直接实现游程编码的数据压缩方法。比如，不使用 P09 编写的其他方法；直接完成所有工作。
  //Example:
  //
  //	scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //	res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))


  def encodeDirect[A](list: List[A]): List[(Int, A)] = list.span(_ == list.head) match {
    case (head, Nil) => List((head.length, head.head))
    case (head, tail) => List((head.length, head.head)) ::: encodeDirect(tail)
  }

  def main(args: Array[String]) = {
    println(encodeDirect(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
  }

}
