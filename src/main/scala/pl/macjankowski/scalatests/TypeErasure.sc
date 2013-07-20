package pl.macjankowski.scalatests

object TypeErasure {

  val a = "some random test message"              //> a  : String = some random test message

  //val keys = List("hi", "dom", "dfff")

  val keys = List("mess")                         //> keys  : List[String] = List(mess)

  keys.exists(a.split(' ').contains)              //> res0: Boolean = false

  val l = List(List(1, 2, 3), List(11, 12, 13), List(21, 22, 23))
                                                  //> l  : List[List[Int]] = List(List(1, 2, 3), List(11, 12, 13), List(21, 22, 23
                                                  //| ))

  val b = "abc" :: "def" :: Nil                   //> b  : List[String] = List(abc, def)
  
  val c = "defg"                                  //> c  : String = defg
  
  b contains c                                    //> res1: Boolean = false

  def flattenRight[A](l: List[List[A]]): List[A] =
    (l :\ (Nil: List[A])) { (a, b) => a ::: b }   //> flattenRight: [A](l: List[List[A]])List[A]

  flattenRight(l)                                 //> res2: List[Int] = List(1, 2, 3, 11, 12, 13, 21, 22, 23)

  def flattenLeft[A](l: List[List[A]]): List[A] =
    ((Nil: List[A]) /: l) { (a, b) => a ::: b }   //> flattenLeft: [A](l: List[List[A]])List[A]

  flattenLeft(l)                                  //> res3: List[Int] = List(1, 2, 3, 11, 12, 13, 21, 22, 23)

  def reverse[T](l: List[T]): List[T] =
    ((Nil: List[T]) /: l) { (a, b) => b :: a }    //> reverse: [T](l: List[T])List[T]

  reverse(List(9, 8, 7, 5, 3, 2, 1))              //> res4: List[Int] = List(1, 2, 3, 5, 7, 8, 9)
}