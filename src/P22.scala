package myscala99

object P22 {
  //[P22](http://aperiodic.net/phil/scala/s-99/p22.scala) (*) Create a list containing all integers within a given range.创建一个列表，包含给予范围内的所有整数。
  //Example:
  //
  //	scala> range(4, 9)
  //	res0: List[Int] = List(4, 5, 6, 7, 8, 9)

  def range(start: Int, End: Int): List[Int] = start match {
    case End => End :: Nil
    case _ => start :: range(start+1, End)
  }

  def main(args: Array[String]) = {
    println(range(4, 9))
  }

}
