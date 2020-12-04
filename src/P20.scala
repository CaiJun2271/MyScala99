package myscala99

object P20 {
  //[P20](http://aperiodic.net/phil/scala/s-99/p20.scala) (*) Remove the Kth element from a list.从列表中删除某一个元素
  //Return the list and the removed element in a Tuple. Elements are numbered from 0.
  //Example:
  //
  //	scala> removeAt(1, List('a, 'b, 'c, 'd))
  //	res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)

  def removeAt[T](n: Int, list: List[T]): (List[T], T) = (n, list) match {
    case (_, Nil) => throw new NoSuchElementException
    case (0, head :: tail) => (tail, head)
    case (_, head :: tail) => (head :: removeAt(n-1, tail)._1, removeAt(n-1, tail)._2)
  }
  
  def main(args: Array[String]) = {
    println(removeAt(1, List('a, 'b, 'c, 'd)))
  }
}
