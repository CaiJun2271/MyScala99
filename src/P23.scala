package myscala99

import myscala99.P20.removeAt

object P23 {
  //[P23](http://aperiodic.net/phil/scala/s-99/p23.scala) (**) Extract a given number of randomly selected elements from a list.从一个列表中随机提取指定数量的元素
  //Example:
  //
  //	scala> randomSelect(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h))
  //	res0: List[Symbol] = List('e, 'd, 'a)

  def randomSelect[T](n: Int, list: List[T]): List[T] = {
    if(n > 0){
      val (l, s) = removeAt(new util.Random().nextInt(list.length), list)
      s :: randomSelect(n-1, l)
    }else Nil
  }

  def main(args: Array[String]): Unit = {
    println(randomSelect(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)))
  }

}
