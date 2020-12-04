package myscala99

import myscala99.P23.randomSelect

object P25 {
  //[P25](http://aperiodic.net/phil/scala/s-99/p25.scala) (*) Generate a random permutation of the elements of a list.随机排列一个列表
  //Hint: Use the solution of problem P23.提示：使用 P23 的解决方案
  //Example:
  //
  //	scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
  //	res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)

  def randomPermute[T](list: List[T]): List[T] = randomSelect(list.length, list)

  def main(args: Array[String]) = {
    println(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)))
  }

}
