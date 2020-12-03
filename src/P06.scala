package myscala99

import myscala99.P05.reverse

object P06 {
  //[P06](http://aperiodic.net/phil/scala/s-99/p06.scala) (*) 列表是否顺读和倒读都一样（palindrome）
  //Example:
  //
  //	scala> isPalindrome(List(1, 2, 3, 2, 1))
  //	res0: Boolean = true

  def isPalindrome[A](list: List[A]): Boolean =  list == reverse(list)

  def main(args: Array[String]) = {
    println(isPalindrome(List(1, 2, 3, 2, 1)))
  }
}
