package myscala99

object P07 {
  //[P07](http://aperiodic.net/phil/scala/s-99/p07.scala) (**) 扁平输出一个嵌套列表
  //Example:
  //
  //	scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  //	res0: List[Any] = List(1, 1, 2, 3, 5, 8)

  def flatten(list: List[Any]): List[Any] = list flatMap {
    case ms: List[_] => flatten(ms)
    case e => e :: Nil
  }

  def main(args: Array[String]) = {
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }
}
