package myscala99

object P08 {
  //[P08](http://aperiodic.net/phil/scala/s-99/p08.scala) (**) 消除列表连续重复的元素
  //如果一个列表包含重复的元素，应该被替换一个元素。元素的顺序不变。
  //Example:
  //
  //	scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //	res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

  def compress[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case l :: tail => l :: compress(tail.dropWhile(_ == l))
  }

  def main(args: Array[String]) = {
    println(compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
  }
}
