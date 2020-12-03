package myscala99

object P02 {
  //P02 (*) 找出列表的倒数第二个元素
  //    Example
  //    scala> penultimate(List(1, 1, 2, 3, 5, 8))
  //    res0: Int = 5

  def penultimate[A](list: List[A]): A = list match {
    case l :: _ :: Nil => l
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]) = {
    val l = List(1, 1, 2, 3, 5, 8)
    println(penultimate(l))
  }
}
