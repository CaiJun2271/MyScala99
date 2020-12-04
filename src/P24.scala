package myscala99

import myscala99.P23.randomSelect

object P24 {
  //[P24](http://aperiodic.net/phil/scala/s-99/p24.scala) (*) Lotto: Draw N different random numbers from the set 1..M.乐透:随机生成N个1到M范围内的整数(每一个都不重复)。
  //Example:
  //
  //	scala> lotto(6, 49)
  //	res0: List[Int] = List(23, 1, 17, 33, 21, 37)

  def lotto(n: Int, end: Int): List[Int] = randomSelect(n, (1 to end+1).toList)

  def main(args: Array[String]) = {
    println(lotto(6, 49))
  }

}
