package myscala99

import myscala99.P26.combinations

import scala.collection.IterableOnce.iterableOnceExtensionMethods

object P27 {
  //[P27](http://aperiodic.net/phil/scala/s-99/p27.scala) (**) Group the elements of a set into disjoint subsets.将一个集合分在不相交的子集
  //a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons? Write a function that generates all the possibilities.
  //a) 有多少种方式将一组 9 个人分成三个分别为 2 个，3 个和 4 个不相交的子分组
  //Example:
  //
  //	scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
  //	res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...
  //combinations(2, list).flatMap(_ ::: combinations(3, list.diff(combinations(2, list))).flatMap(_ ::: list.diff(combinations(2, list)).diff(combinations(3, list.diff(combinations(2, list))))))

  def group3[T](list: List[T]): List[List[List[T]]] =
    for {
      a <- combinations(2, list)
      noA = list.diff(a)
      b <- combinations(3, noA)
    } yield List(a, b, noA.diff(b))

  def group[T](ns: List[Int], ls: List[T]): List[List[List[T]]] = ns match {
    case Nil => List(Nil)
    case n :: ns => combinations(n, ls) flatMap {
      c => group(ns, ls.diff(c)) map {c :: _}
    }
  }


  def main(args: Array[String]) = {
    println(group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")))
  }
}
