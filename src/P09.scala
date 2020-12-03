package myscala99

object P09 {
  //[P09](http://aperiodic.net/phil/scala/s-99/p09.scala) (**) Pack consecutive duplicates of list elements into sublists.把连续重复的列表元素提取到子列表中
  //If a list contains repeated elements they should be placed in separate sublists.
  //如果一个列表包含重复元素，应该被替换到独立的子列表中。
  //Example:
  //
  //	scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //	res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

  def pack[A](list: List[A]): List[List[A]] = {
    if(list.isEmpty) List(List())
    else {
      val (packed, next) = list span {_ == list.head}
      if(next == Nil) List(packed)
      else packed :: pack(next)
    }
  }

  def main(args: Array[String]) = {
    println(pack(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
  }

}
