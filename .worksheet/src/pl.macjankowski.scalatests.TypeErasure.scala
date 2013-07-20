package pl.macjankowski.scalatests

object TypeErasure {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(94); 

  val a = "some random test message";System.out.println("""a  : String = """ + $show(a ));$skip(69); 

  //val keys = List("hi", "dom", "dfff")

  val keys = List("mess");System.out.println("""keys  : List[String] = """ + $show(keys ));$skip(38); val res$0 = 

  keys.exists(a.split(' ').contains);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(67); 

  val l = List(List(1, 2, 3), List(11, 12, 13), List(21, 22, 23));System.out.println("""l  : List[List[Int]] = """ + $show(l ));$skip(33); 

  val b = "abc" :: "def" :: Nil;System.out.println("""b  : List[String] = """ + $show(b ));$skip(20); 
  
  val c = "defg";System.out.println("""c  : String = """ + $show(c ));$skip(18); val res$1 = 
  
  b contains c;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(100); 

  def flattenRight[A](l: List[List[A]]): List[A] =
    (l :\ (Nil: List[A])) { (a, b) => a ::: b };System.out.println("""flattenRight: [A](l: List[List[A]])List[A]""");$skip(19); val res$2 = 

  flattenRight(l);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(99); 

  def flattenLeft[A](l: List[List[A]]): List[A] =
    ((Nil: List[A]) /: l) { (a, b) => a ::: b };System.out.println("""flattenLeft: [A](l: List[List[A]])List[A]""");$skip(18); val res$3 = 

  flattenLeft(l);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(88); 

  def reverse[T](l: List[T]): List[T] =
    ((Nil: List[T]) /: l) { (a, b) => b :: a };System.out.println("""reverse: [T](l: List[T])List[T]""");$skip(38); val res$4 = 

  reverse(List(9, 8, 7, 5, 3, 2, 1));System.out.println("""res4: List[Int] = """ + $show(res$4))}
}
