package myscala99

object P26 {
  //[P26](http://aperiodic.net/phil/scala/s-99/p26.scala) (**) Generate the combinations of K distinct objects chosen from the N elements of a list.生成从列表的N个元素中选择的K个不同对象的组合
  //In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient). For pure mathematicians, this result may be great. But we want to really generate all the possibilities.
  //从 1 组 12 人中抽出 3 人委员会会有多少种方式？我们都知道 C(12, 3) = 220 (C(N,K) 就是众所周知的二项式系数)。对于纯数学家来说，这个结果是巨大的。但是我们真的想生成所有的可能的结果。
  //Example:
  //
  //	scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
  //	res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...


  def combinations[A](n: Int, ls: List[A]): List[List[A]] =  {
    ls match {
      case head :: tail if n == 1 => ls.map(List(_))
      case head :: tail => combinations(n - 1, tail).map(head :: _) ::: combinations(n, tail)
      case Nil => Nil
    }
  }

  def main(args: Array[String]) = {
    println(combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)))
  }

}
